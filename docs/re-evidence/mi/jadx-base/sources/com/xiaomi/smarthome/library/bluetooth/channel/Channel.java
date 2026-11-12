package com.xiaomi.smarthome.library.bluetooth.channel;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.ACKPacket;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.CTRPacket;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.DataPacket;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.MNGAckPacket;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.MNGPacket;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.SingleACKPacket;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.SinglePacket;
import com.xiaomi.smarthome.library.bluetooth.proxy.ProxyBulk;
import com.xiaomi.smarthome.library.bluetooth.proxy.ProxyInterceptor;
import com.xiaomi.smarthome.library.bluetooth.proxy.ProxyUtils;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.common.util.MessageHandlerThread;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Channel implements IChannel, ProxyInterceptor {
    public static final String ACTION_A4_RESULT = "com.miot.action.a4.result";
    public static final boolean DEBUG = !BluetoothContextManager.isReleaseBuild();
    private static final int MSG_WRITE_CALLBACK = 1;
    private static final long TIMEOUT = 6000;
    private static final String TIMER_EXCEPTION = "exception";
    public static final int WANTED_MAX_PACKAGE_NUM = 6;
    private final ChannelStateBlock[] STATE_MACHINE;
    private byte[] mBytesToWrite;
    private final Handler.Callback mCallback;
    private IChannel mChannel;
    private ChannelCallback mChannelCallback;
    private final IChannel mChannelImpl;
    private ChannelState mCurrentState;
    private List<Short> mCurrentSync;
    private int mFrameCount;
    private int mPackageType;
    private SparseArray<Packet> mPacketRecv;
    private final IChannelStateHandler mRecvACKHandler;
    private final IChannelStateHandler mRecvCTRHandler;
    private final IChannelStateHandler mRecvDataHandler;
    private final IChannelStateHandler mRecvMNGACKHandler;
    private final IChannelStateHandler mRecvMNGCTRHandler;
    private final IChannelStateHandler mRecvSINGLEACKHandler;
    private final IChannelStateHandler mRecvSingleCTRHandler;
    private final IChannelStateHandler mSyncPacketHandler;
    private final Timer.TimerCallback mTimeoutHandler;
    private Timer mTimer;
    private int mTotalBytes;
    private final IChannelStateHandler mWaitStartACKHandler;
    private final IChannelStateHandler mWaitStartMngACKHandler;
    private final IChannelStateHandler mWaitStartSingleACKHandler;
    private Handler mWorkerHandler;

    public class RecvCallback implements Runnable {
        private byte[] bytes;
        private int packageType;

        public RecvCallback(byte[] bArr, int i) {
            this.bytes = bArr;
            this.packageType = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Channel.this.onRecv(this.bytes, this.packageType);
        }
    }

    public class WriteCallback implements ChannelCallback {
        ChannelCallback callback;

        public WriteCallback(ChannelCallback channelCallback) {
            this.callback = channelCallback;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
        public void onCallback(int i) {
            if (Channel.this.isExceptionTimerOn()) {
                Channel.this.stopTimer();
            }
            Channel.this.mWorkerHandler.obtainMessage(1, i, 0, this.callback).sendToTarget();
        }
    }

    public Channel() {
        ChannelState channelState = ChannelState.IDLE;
        this.mCurrentState = channelState;
        this.mCurrentSync = new ArrayList();
        IChannelStateHandler iChannelStateHandler = new IChannelStateHandler() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.1
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannelStateHandler
            public void handleState(Object... objArr) {
                Channel.this.assertRuntime(false);
                DataPacket dataPacket = (DataPacket) objArr[0];
                short seq = (short) dataPacket.getSeq();
                if (!Channel.this.mCurrentSync.contains(Short.valueOf(seq))) {
                    if (Channel.DEBUG) {
                        BluetoothLog.w(String.format("sync packet not matched!!", new Object[0]));
                    }
                } else if (!Channel.this.onDataPacketRecvd(dataPacket)) {
                    if (Channel.DEBUG) {
                        BluetoothLog.w(String.format("sync packet repeated!!", new Object[0]));
                    }
                } else {
                    Channel.this.mCurrentSync.remove(Short.valueOf(seq));
                    if (Channel.this.mCurrentSync.size() == 0) {
                        Channel.this.startSyncPacket();
                    }
                }
            }
        };
        this.mSyncPacketHandler = iChannelStateHandler;
        IChannelStateHandler iChannelStateHandler2 = new IChannelStateHandler() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.2
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannelStateHandler
            public void handleState(Object... objArr) {
                Channel.this.assertRuntime(false);
                DataPacket dataPacket = (DataPacket) objArr[0];
                if (!Channel.this.onDataPacketRecvd(dataPacket)) {
                    if (Channel.DEBUG) {
                        BluetoothLog.w(String.format("dataPacket repeated!!", new Object[0]));
                    }
                } else if (dataPacket.getSeq() == Channel.this.mFrameCount) {
                    Channel.this.startSyncPacket();
                } else {
                    Channel.this.startTimer(6000L, new Timer.TimerCallback("WaitData") { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.2.1
                        @Override // com.xiaomi.smarthome.library.bluetooth.channel.Timer.TimerCallback
                        public void onTimerCallback() {
                            Channel.this.startSyncPacket();
                        }

                        @Override // com.xiaomi.smarthome.library.bluetooth.channel.Timer.TimerCallback
                        public void resetCallback() {
                            Channel.this.mTimer.resetCallback();
                        }
                    });
                }
            }
        };
        this.mRecvDataHandler = iChannelStateHandler2;
        IChannelStateHandler iChannelStateHandler3 = new IChannelStateHandler() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.3
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannelStateHandler
            public void handleState(Object... objArr) {
                Channel.this.assertRuntime(false);
                CTRPacket cTRPacket = (CTRPacket) objArr[0];
                Channel.this.mFrameCount = cTRPacket.getFrameCount();
                ACKPacket aCKPacket = new ACKPacket(1);
                Channel.this.mPackageType = cTRPacket.getPackageType();
                Channel.this.setCurrentState(ChannelState.READY);
                Channel.this.performWrite(aCKPacket, new ChannelCallback() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.3.1
                    @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
                    public void onCallback(int i) {
                        Channel.this.assertRuntime(false);
                        if (i == 0) {
                            Channel.this.startTimer();
                        } else {
                            Channel.this.resetChannelStatus();
                        }
                    }
                });
                Channel.this.setCurrentState(ChannelState.READING);
            }
        };
        this.mRecvCTRHandler = iChannelStateHandler3;
        IChannelStateHandler iChannelStateHandler4 = new IChannelStateHandler() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.4
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannelStateHandler
            public void handleState(Object... objArr) {
                Channel.this.assertRuntime(false);
                SinglePacket singlePacket = (SinglePacket) objArr[0];
                byte[] data = singlePacket.getData();
                final byte[] bArrHandleTotalReceiveBytes = Channel.this.handleTotalReceiveBytes(ByteBuffer.wrap(data), data.length);
                Channel.this.mPackageType = singlePacket.getPackageType();
                SingleACKPacket singleACKPacket = new SingleACKPacket(0);
                Channel.this.setCurrentState(ChannelState.READY);
                Channel.this.performWrite(singleACKPacket, new ChannelCallback() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.4.1
                    @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
                    public void onCallback(int i) {
                        Channel.this.assertRuntime(false);
                        Channel.this.resetChannelStatus();
                        if (i == 0) {
                            Channel.this.dispatchOnReceive(bArrHandleTotalReceiveBytes);
                        }
                    }
                });
            }
        };
        this.mRecvSingleCTRHandler = iChannelStateHandler4;
        IChannelStateHandler iChannelStateHandler5 = new IChannelStateHandler() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.5
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannelStateHandler
            public void handleState(Object... objArr) {
                Channel.this.assertRuntime(false);
                MNGPacket mNGPacket = (MNGPacket) objArr[0];
                mNGPacket.parse();
                if (mNGPacket.getPackageType() == 0) {
                    int dmtu = Channel.this.getDMTU();
                    int maxDMTU = mNGPacket.getMaxDMTU();
                    int maxPackgeNum = mNGPacket.getMaxPackgeNum();
                    int iMin = Math.min(dmtu, maxDMTU);
                    if (Channel.DEBUG) {
                        BluetoothLog.formatLog("receive device mng ctr: local dmtu =%d,num=%d,device dmtu=%d, num=%d,minDMTU=%d", Integer.valueOf(dmtu), 6, Integer.valueOf(maxDMTU), Integer.valueOf(maxPackgeNum), Integer.valueOf(iMin));
                    }
                    Channel.this.performWrite(new MNGAckPacket(0, new byte[]{(byte) 6, (byte) iMin}), new ChannelCallback() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.5.1
                        @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
                        public void onCallback(int i) {
                            Channel.this.resetChannelStatus();
                        }
                    });
                    return;
                }
                if (mNGPacket.getPackageType() == 1) {
                    int dmtu2 = Channel.this.getDMTU();
                    byte[] testBytes = mNGPacket.getTestBytes();
                    int length = testBytes.length + 2;
                    int iMin2 = Math.min(length, dmtu2);
                    if (iMin2 == length && ByteUtils.isSameElement(testBytes, (byte) iMin2)) {
                        Channel.this.updateMinDMTU(iMin2);
                        BluetoothLog.d("channel=> sure dmtu is " + iMin2);
                    } else {
                        iMin2 = 18;
                        Channel.this.updateMinDMTU(18);
                        BluetoothLog.d("channel=> sure dmtu is 18");
                    }
                    byte[] bArr = new byte[iMin2 - 2];
                    Arrays.fill(bArr, (byte) iMin2);
                    Channel.this.performWrite(new MNGAckPacket(1, bArr), new ChannelCallback() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.5.2
                        @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
                        public void onCallback(int i) {
                            Channel.this.resetChannelStatus();
                            if (i == 0) {
                                Channel.this.broadcastA4Complete();
                            }
                        }
                    });
                }
            }
        };
        this.mRecvMNGCTRHandler = iChannelStateHandler5;
        IChannelStateHandler iChannelStateHandler6 = new IChannelStateHandler() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.6
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannelStateHandler
            public void handleState(Object... objArr) {
                Channel.this.assertRuntime(false);
                Channel.this.setCurrentState(ChannelState.WAIT_START_ACK);
                Channel.this.startTimer();
            }
        };
        this.mWaitStartACKHandler = iChannelStateHandler6;
        IChannelStateHandler iChannelStateHandler7 = new IChannelStateHandler() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.7
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannelStateHandler
            public void handleState(Object... objArr) {
                Channel.this.assertRuntime(false);
                Channel.this.setCurrentState(ChannelState.WAIT_MNG_ACK);
                Channel.this.startTimer();
            }
        };
        this.mWaitStartMngACKHandler = iChannelStateHandler7;
        IChannelStateHandler iChannelStateHandler8 = new IChannelStateHandler() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.8
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannelStateHandler
            public void handleState(Object... objArr) {
                Channel.this.assertRuntime(false);
                Channel.this.setCurrentState(ChannelState.WAIT_SINGLE_ACK);
                Channel.this.startTimer();
            }
        };
        this.mWaitStartSingleACKHandler = iChannelStateHandler8;
        this.mTimeoutHandler = new Timer.TimerCallback(getClass().getSimpleName()) { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.9
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.Timer.TimerCallback
            public void onTimerCallback() {
                Channel.this.assertRuntime(false);
                Channel.this.onSendCallback(-2);
                Channel.this.resetChannelStatus();
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.channel.Timer.TimerCallback
            public void resetCallback() {
                Channel.this.mTimer.resetCallback();
            }
        };
        IChannelStateHandler iChannelStateHandler9 = new IChannelStateHandler() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.10
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannelStateHandler
            public void handleState(Object... objArr) {
                Channel.this.assertRuntime(false);
                int status = ((SingleACKPacket) objArr[0]).getStatus();
                if (status == 0) {
                    Channel.this.onSendCallback(0);
                    Channel.this.resetChannelStatus();
                } else if (status != 2) {
                    Channel.this.onSendCallback(-1);
                    Channel.this.resetChannelStatus();
                } else {
                    Channel.this.stopTimer();
                    Channel.this.onSendCallback(-3);
                    Channel.this.resetChannelStatus();
                }
            }
        };
        this.mRecvSINGLEACKHandler = iChannelStateHandler9;
        IChannelStateHandler iChannelStateHandler10 = new IChannelStateHandler() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.11
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannelStateHandler
            public void handleState(Object... objArr) {
                Channel.this.assertRuntime(false);
                MNGAckPacket mNGAckPacket = (MNGAckPacket) objArr[0];
                mNGAckPacket.parse();
                if (mNGAckPacket.getPackageType() == 0) {
                    int dmtu = Channel.this.getDMTU();
                    int maxPackageNum = Channel.this.getMaxPackageNum();
                    int maxDMTU = mNGAckPacket.getMaxDMTU();
                    int maxPackgeNum = mNGAckPacket.getMaxPackgeNum();
                    if (Channel.DEBUG) {
                        BluetoothLog.formatLog("Channel=>: receive mng ack : app dmtu =%d,maxPackage =%d; device dmtu = %d,max package =%d", Integer.valueOf(dmtu), Integer.valueOf(maxPackageNum), Integer.valueOf(maxDMTU), Integer.valueOf(maxPackgeNum));
                    }
                    int iMin = Math.min(dmtu, maxDMTU);
                    if (maxPackageNum == maxPackgeNum) {
                        byte[] bArr = new byte[iMin - 2];
                        Arrays.fill(bArr, (byte) iMin);
                        Channel.this.performWrite(new MNGPacket(1, bArr), new ChannelCallback() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.11.1
                            @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
                            public void onCallback(int i) {
                                Channel.this.assertRuntime(false);
                                if (i == 0) {
                                    Channel.this.startTimer();
                                } else {
                                    Channel.this.resetChannelStatus();
                                }
                            }
                        });
                        BluetoothLog.d("channel=> send test package");
                        Channel.this.setCurrentState(ChannelState.WAIT_MNG_ACK);
                        return;
                    }
                    return;
                }
                if (mNGAckPacket.getPackageType() == 1) {
                    byte[] testBytes = mNGAckPacket.getTestBytes();
                    int dmtu2 = Channel.this.getDMTU();
                    int length = testBytes.length + 2;
                    int iMin2 = Math.min(dmtu2, length);
                    BluetoothLog.formatLog("channel=> receive test package ack, byte length =%s, local dmtu =", Integer.valueOf(testBytes.length), Integer.valueOf(dmtu2));
                    if (length != iMin2 || !ByteUtils.isSameElement(testBytes, (byte) iMin2)) {
                        Channel.this.updateMinDMTU(18);
                        Channel.this.onSendCallback(-1);
                        return;
                    }
                    BluetoothLog.formatLog("channel=> receive device test ack package ,all is correct, dmtu =" + dmtu2, new Object[0]);
                    Channel.this.onSendCallback(0);
                    Channel.this.updateMinDMTU(dmtu2);
                }
            }
        };
        this.mRecvMNGACKHandler = iChannelStateHandler10;
        IChannelStateHandler iChannelStateHandler11 = new IChannelStateHandler() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.12
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannelStateHandler
            public void handleState(Object... objArr) {
                Channel.this.assertRuntime(false);
                ACKPacket aCKPacket = (ACKPacket) objArr[0];
                int status = aCKPacket.getStatus();
                if (status == 0) {
                    Channel.this.onSendCallback(0);
                    Channel.this.resetChannelStatus();
                    return;
                }
                if (status == 1) {
                    Channel.this.stopTimer();
                    Channel.this.setCurrentState(ChannelState.WRITING);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < Channel.this.mFrameCount; i++) {
                        arrayList.add(Integer.valueOf(i));
                    }
                    Channel.this.sendDataPacket(arrayList, false);
                    return;
                }
                if (status != 5) {
                    Channel.this.onSendCallback(-1);
                    Channel.this.resetChannelStatus();
                    return;
                }
                List<Short> seq = aCKPacket.getSeq();
                if (seq.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<Short> it = seq.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Integer.valueOf(it.next().shortValue() - 1));
                    }
                    Channel.this.sendDataPacket(arrayList2, true);
                }
            }
        };
        this.mRecvACKHandler = iChannelStateHandler11;
        ChannelState channelState2 = ChannelState.READY;
        ChannelStateBlock channelStateBlock = new ChannelStateBlock(channelState2, ChannelEvent.SEND_CTR, iChannelStateHandler6);
        ChannelStateBlock channelStateBlock2 = new ChannelStateBlock(channelState2, ChannelEvent.SEND_MNG, iChannelStateHandler7);
        ChannelStateBlock channelStateBlock3 = new ChannelStateBlock(channelState2, ChannelEvent.SEND_SINGLE_CTR, iChannelStateHandler8);
        ChannelState channelState3 = ChannelState.WAIT_START_ACK;
        ChannelEvent channelEvent = ChannelEvent.RECV_ACK;
        ChannelStateBlock channelStateBlock4 = new ChannelStateBlock(channelState3, channelEvent, iChannelStateHandler11);
        ChannelStateBlock channelStateBlock5 = new ChannelStateBlock(ChannelState.WAIT_MNG_ACK, ChannelEvent.RECV_MNG_ACK, iChannelStateHandler10);
        ChannelStateBlock channelStateBlock6 = new ChannelStateBlock(ChannelState.WAIT_SINGLE_ACK, ChannelEvent.RECV_SINGLE_ACK, iChannelStateHandler9);
        ChannelStateBlock channelStateBlock7 = new ChannelStateBlock(ChannelState.SYNC, channelEvent, iChannelStateHandler11);
        ChannelStateBlock channelStateBlock8 = new ChannelStateBlock(ChannelState.WRITING, channelEvent, iChannelStateHandler11);
        ChannelStateBlock channelStateBlock9 = new ChannelStateBlock(channelState, ChannelEvent.RECV_CTR, iChannelStateHandler3);
        ChannelStateBlock channelStateBlock10 = new ChannelStateBlock(channelState, ChannelEvent.RECV_SINGLE_CTR, iChannelStateHandler4);
        ChannelStateBlock channelStateBlock11 = new ChannelStateBlock(channelState, ChannelEvent.RECV_MNG, iChannelStateHandler5);
        ChannelState channelState4 = ChannelState.READING;
        ChannelEvent channelEvent2 = ChannelEvent.RECV_DATA;
        this.STATE_MACHINE = new ChannelStateBlock[]{channelStateBlock, channelStateBlock2, channelStateBlock3, channelStateBlock4, channelStateBlock5, channelStateBlock6, channelStateBlock7, channelStateBlock8, channelStateBlock9, channelStateBlock10, channelStateBlock11, new ChannelStateBlock(channelState4, channelEvent2, iChannelStateHandler2), new ChannelStateBlock(ChannelState.SYNC_ACK, channelEvent2, iChannelStateHandler)};
        IChannel iChannel = new IChannel() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.19
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
            public void onRead(byte[] bArr) {
                Channel.this.performOnRead(bArr);
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
            public void onRecv(byte[] bArr, int i) {
                throw new UnsupportedOperationException();
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
            public void reset() {
                Channel.this.resetChannelStatus();
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
            public void send(byte[] bArr, int i, ChannelCallback channelCallback) {
                Channel.this.performSend(0, bArr, i, channelCallback);
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
            public void write(byte[] bArr, ChannelCallback channelCallback, boolean z) {
                throw new UnsupportedOperationException();
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
            public void writeBatchData(List<byte[]> list, ChannelCallback channelCallback) {
                throw new UnsupportedOperationException();
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
            public void send(int i, byte[] bArr, int i2, ChannelCallback channelCallback) {
                Channel.this.performSend(i, bArr, i2, channelCallback);
            }
        };
        this.mChannelImpl = iChannel;
        Handler.Callback callback = new Handler.Callback() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.20
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 1) {
                    ProxyBulk.safeInvoke(message.obj);
                    return false;
                }
                ((ChannelCallback) message.obj).onCallback(message.arg1);
                return false;
            }
        };
        this.mCallback = callback;
        this.mTimer = Timer.newInstance();
        this.mPacketRecv = new SparseArray<>();
        this.mChannel = (IChannel) ProxyUtils.getProxy(iChannel, this);
        MessageHandlerThread messageHandlerThread = new MessageHandlerThread(getClass().getSimpleName());
        messageHandlerThread.start();
        this.mWorkerHandler = new Handler(messageHandlerThread.getLooper(), callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void assertRuntime(boolean z) {
        if (Looper.myLooper() == (z ? Looper.getMainLooper() : this.mWorkerHandler.getLooper())) {
            return;
        }
        resetOnException();
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void broadcastA4Complete() {
        BluetoothLog.d(" broadcast A4 result");
        BluetoothUtils.sendBroadcastDelayed(ACTION_A4_RESULT, 100L);
    }

    private boolean checkCRC32(byte[] bArr, byte[] bArr2) {
        return ByteUtils.equals(bArr2, CRC32.get(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnReceive(byte[] bArr) {
        if (DEBUG) {
            BluetoothLog.v(String.format(">>> receive: %s", new String(bArr)));
        }
        BluetoothContextManager.post(new RecvCallback(bArr, this.mPackageType));
    }

    private int getFrameCount(int i) {
        if (useCrc32Verify()) {
            i += 4;
        }
        return ((i - 1) / getMinDMTU()) + 1;
    }

    private String getLogTag() {
        return String.format("%s.%s", getClass().getSimpleName(), BluetoothContextManager.getCurrentMethodName());
    }

    private byte[] getTotalRecvdBytes() {
        assertRuntime(false);
        if (this.mPacketRecv.size() != this.mFrameCount) {
            resetOnException();
            throw new IllegalStateException();
        }
        if (useCrc32Verify()) {
            if (DEBUG) {
                BluetoothLog.v(String.format("%s: totalBytes = %d (include 4 Bytes crc)", getLogTag(), Integer.valueOf(this.mTotalBytes)));
            }
        } else if (DEBUG) {
            BluetoothLog.v(String.format("%s: totalBytes = %d", getLogTag(), Integer.valueOf(this.mTotalBytes)));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.mTotalBytes);
        for (int i = 1; i <= this.mFrameCount; i++) {
            ((DataPacket) this.mPacketRecv.get(i)).fillByteBuffer(byteBufferAllocate);
        }
        return handleTotalReceiveBytes(byteBufferAllocate, this.mTotalBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isExceptionTimerOn() {
        return "exception".equals(this.mTimer.getName());
    }

    private boolean isTimerOn() {
        return this.mTimer.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onDataPacketRecvd(DataPacket dataPacket) {
        assertRuntime(false);
        if (this.mPacketRecv.get(dataPacket.getSeq()) != null) {
            return false;
        }
        this.mPacketRecv.put(dataPacket.getSeq(), dataPacket);
        this.mTotalBytes += dataPacket.getDataLength();
        stopTimer();
        return true;
    }

    private void onPostState(ChannelEvent channelEvent, Object... objArr) {
        assertRuntime(false);
        if (DEBUG) {
            BluetoothLog.v(String.format("%s: state = %s, event = %s", getLogTag(), this.mCurrentState, channelEvent));
        }
        for (ChannelStateBlock channelStateBlock : this.STATE_MACHINE) {
            if (channelStateBlock.state == this.mCurrentState && channelStateBlock.event == channelEvent) {
                channelStateBlock.handler.handleState(objArr);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSendCallback(int i) {
        assertRuntime(false);
        if (DEBUG) {
            BluetoothLog.v(String.format("%s: code = %d", getLogTag(), Integer.valueOf(i)));
        }
        ChannelCallback channelCallback = this.mChannelCallback;
        if (channelCallback != null) {
            channelCallback.onCallback(i);
        }
    }

    private void performBatchWrite(final List<byte[]> list, final ChannelCallback channelCallback) {
        assertRuntime(false);
        if (channelCallback == null) {
            resetOnException();
            throw new NullPointerException("callback can't be null");
        }
        if (!isTimerOn()) {
            startExceptionTimer();
        }
        BluetoothContextManager.post(new Runnable() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.14
            @Override // java.lang.Runnable
            public void run() {
                BluetoothLog.d("perform batch write");
                Channel channel = Channel.this;
                channel.writeBatchData(list, channel.new WriteCallback(channelCallback));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performOnRead(byte[] bArr) {
        byte b2 = 0;
        assertRuntime(false);
        Packet packet = Packet.getPacket(bArr);
        if (DEBUG) {
            BluetoothLog.formatLog("channel=> onReceive from device, packet name =%s", packet.getName());
        }
        String name = packet.getName();
        name.hashCode();
        switch (name.hashCode()) {
            case 96393:
                if (!name.equals(Packet.ACK)) {
                    b2 = -1;
                }
                break;
            case 98849:
                b2 = !name.equals(Packet.CTR) ? (byte) -1 : (byte) 1;
                break;
            case 108262:
                b2 = !name.equals(Packet.MNG_CMD) ? (byte) -1 : (byte) 2;
                break;
            case 3076010:
                b2 = !name.equals("data") ? (byte) -1 : (byte) 3;
                break;
            case 913950738:
                b2 = !name.equals(Packet.SINGLE_ACK) ? (byte) -1 : (byte) 4;
                break;
            case 913953194:
                b2 = !name.equals(Packet.SINGLE_CMD) ? (byte) -1 : (byte) 5;
                break;
            case 1200909232:
                b2 = !name.equals(Packet.MNG_ACK) ? (byte) -1 : (byte) 6;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                onPostState(ChannelEvent.RECV_ACK, packet);
                return;
            case 1:
                onPostState(ChannelEvent.RECV_CTR, packet);
                return;
            case 2:
                break;
            case 3:
                onPostState(ChannelEvent.RECV_DATA, packet);
                return;
            case 4:
                onPostState(ChannelEvent.RECV_SINGLE_ACK, packet);
                return;
            case 5:
                onPostState(ChannelEvent.RECV_SINGLE_CTR, packet);
                return;
            case 6:
                onPostState(ChannelEvent.RECV_MNG_ACK, packet);
                break;
            default:
                return;
        }
        onPostState(ChannelEvent.RECV_MNG, packet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performSend(int i, byte[] bArr, int i2, ChannelCallback channelCallback) {
        assertRuntime(false);
        if (this.mCurrentState != ChannelState.IDLE) {
            BluetoothLog.d("preform send ,but channelState is not idle");
            channelCallback.onCallback(-3);
            return;
        }
        this.mPackageType = i2;
        this.mCurrentState = ChannelState.READY;
        this.mChannelCallback = (ChannelCallback) ProxyUtils.getUIProxy(channelCallback);
        int length = bArr.length;
        this.mTotalBytes = length;
        this.mFrameCount = getFrameCount(length);
        boolean z = DEBUG;
        if (z) {
            BluetoothLog.v(String.format("%s: totalBytes = %d, frameCount = %d", getLogTag(), Integer.valueOf(this.mTotalBytes), Integer.valueOf(this.mFrameCount)));
        }
        if (useCrc32Verify()) {
            this.mBytesToWrite = Arrays.copyOf(bArr, bArr.length + 4);
            System.arraycopy(CRC32.get(bArr), 0, this.mBytesToWrite, bArr.length, 4);
            if (z) {
                BluetoothLog.v("performSend CRC32 = " + ByteUtils.byteToString(this.mBytesToWrite));
            }
        } else {
            this.mBytesToWrite = Arrays.copyOf(bArr, bArr.length);
        }
        sendStartFlowPacket(i, i2, this.mBytesToWrite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performWrite(Packet packet, ChannelCallback channelCallback) {
        performWrite(packet, channelCallback, false);
    }

    private void resetOnException() {
        if (DEBUG) {
            BluetoothLog.v(getLogTag());
        }
        stopTimer();
        this.mCurrentState = ChannelState.IDLE;
        this.mBytesToWrite = null;
        this.mFrameCount = 0;
        this.mChannelCallback = null;
        this.mPacketRecv.clear();
        this.mCurrentSync.clear();
        this.mTotalBytes = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendDataPacket(List<Integer> list, final boolean z) {
        assertRuntime(false);
        int minDMTU = getMinDMTU();
        BluetoothLog.d("sendDataPacket list= " + list.toString());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue < this.mFrameCount) {
                int i = iIntValue * minDMTU;
                int i2 = iIntValue + 1;
                arrayList.add(new DataPacket(i2, this.mBytesToWrite, i, Math.min(this.mBytesToWrite.length, i2 * minDMTU)).toBytes());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        performBatchWrite(arrayList, new ChannelCallback() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.18
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
            public void onCallback(int i3) {
                if (z) {
                    return;
                }
                if (Channel.this.mChannelCallback == null) {
                    BluetoothLog.d("send Data packet onCallback, channelCallback is null ,return");
                    return;
                }
                BluetoothLog.d("receive batch write callback ,start sync");
                Channel.this.setCurrentState(ChannelState.SYNC);
                Channel.this.startTimer(18000L);
            }
        });
    }

    private void sendStartFlowPacket(int i, int i2, byte[] bArr) {
        Packet cTRPacket;
        assertRuntime(false);
        if (i == 0 || this.mFrameCount > 1) {
            cTRPacket = new CTRPacket(this.mFrameCount, i2);
            BluetoothLog.formatLog("prepare send CMD, frame count = %d,package type =%d", Integer.valueOf(this.mFrameCount), Integer.valueOf(i2));
        } else if (i == 4) {
            cTRPacket = new MNGPacket(i2, bArr);
        } else {
            cTRPacket = i == 2 ? new SinglePacket(i2, bArr) : null;
        }
        if (cTRPacket == null) {
            BluetoothLog.e("send start flow packet, opcode =" + i + ",packageType=" + i2 + ",but build flow packet is null");
            return;
        }
        performWrite(cTRPacket, new ChannelCallback() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.15
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
            public void onCallback(int i3) {
                Channel.this.assertRuntime(false);
                if (i3 == 0) {
                    return;
                }
                Channel.this.onSendCallback(-1);
                Channel.this.resetChannelStatus();
            }
        });
        if (i == 0 || this.mFrameCount > 1) {
            onPostState(ChannelEvent.SEND_CTR, new Object[0]);
        } else if (i == 2) {
            onPostState(ChannelEvent.SEND_SINGLE_CTR, new Object[0]);
        } else if (i == 4) {
            onPostState(ChannelEvent.SEND_MNG, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentState(ChannelState channelState) {
        assertRuntime(false);
        if (DEBUG) {
            BluetoothLog.v(String.format("%s: state = %s", getLogTag(), channelState));
        }
        this.mCurrentState = channelState;
    }

    private void startExceptionTimer() {
        startTimer(6000L, new Timer.TimerCallback("exception") { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.21
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.Timer.TimerCallback
            public void onTimerCallback() throws TimeoutException {
                throw new TimeoutException();
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.channel.Timer.TimerCallback
            public void resetCallback() {
                Channel.this.mTimer.resetCallback();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncPacket() {
        assertRuntime(false);
        if (DEBUG) {
            BluetoothLog.v(getLogTag());
        }
        startTimer();
        setCurrentState(ChannelState.SYNC);
        if (syncLostPacket()) {
            return;
        }
        final byte[] totalRecvdBytes = getTotalRecvdBytes();
        if (ByteUtils.isEmpty(totalRecvdBytes)) {
            resetChannelStatus();
        } else {
            performWrite(new ACKPacket(0), new ChannelCallback() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.16
                @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
                public void onCallback(int i) {
                    Channel.this.assertRuntime(false);
                    Channel.this.resetChannelStatus();
                    if (i == 0) {
                        Channel.this.dispatchOnReceive(totalRecvdBytes);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTimer() {
        startTimer(6000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopTimer() {
        if (DEBUG) {
            BluetoothLog.v(getLogTag());
        }
        this.mTimer.stop();
    }

    private boolean syncLostPacket() {
        assertRuntime(false);
        if (DEBUG) {
            BluetoothLog.v(getLogTag());
        }
        ArrayList arrayList = new ArrayList();
        int maxPackageNum = getMaxPackageNum();
        for (int i = 1; i <= this.mFrameCount; i++) {
            if (this.mPacketRecv.get(i) == null) {
                arrayList.add(Short.valueOf((short) i));
            }
            if (arrayList.size() >= maxPackageNum) {
                break;
            }
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        BluetoothLog.d("exit lost seq,start sync packet");
        this.mCurrentSync = arrayList;
        performWrite(new ACKPacket(5, arrayList), new ChannelCallback() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.17
            @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
            public void onCallback(int i2) {
                Channel.this.assertRuntime(false);
                if (i2 == 0) {
                    Channel.this.startTimer();
                } else {
                    Channel.this.resetChannelStatus();
                }
            }
        });
        setCurrentState(ChannelState.SYNC_ACK);
        return true;
    }

    public abstract int getDMTU();

    public abstract int getMaxPackageNum();

    public abstract int getMinDMTU();

    public byte[] handleTotalReceiveBytes(ByteBuffer byteBuffer, int i) {
        if (!useCrc32Verify()) {
            return byteBuffer.array();
        }
        int i2 = i - 4;
        byte[] bArr = {byteBuffer.get(i2), byteBuffer.get(i - 3), byteBuffer.get(i - 2), byteBuffer.get(i - 1)};
        byte[] bArr2 = new byte[i2];
        System.arraycopy(byteBuffer.array(), 0, bArr2, 0, i2);
        if (checkCRC32(bArr2, bArr)) {
            return bArr2;
        }
        if (DEBUG) {
            BluetoothLog.e(String.format("check crc failed!!", new Object[0]));
        }
        return ByteUtils.EMPTY_BYTES;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.proxy.ProxyInterceptor
    public boolean onIntercept(Object obj, Method method, Object[] objArr) {
        this.mWorkerHandler.obtainMessage(0, new ProxyBulk(obj, method, objArr)).sendToTarget();
        return true;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
    public final void onRead(byte[] bArr) {
        this.mChannel.onRead(bArr);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
    public void reset() {
        this.mChannel.reset();
    }

    public void resetChannelStatus() {
        assertRuntime(false);
        if (DEBUG) {
            BluetoothLog.v(getLogTag());
        }
        BluetoothLog.d("resetChannelStatus");
        stopTimer();
        setCurrentState(ChannelState.IDLE);
        this.mBytesToWrite = null;
        this.mFrameCount = 0;
        this.mChannelCallback = null;
        this.mPacketRecv.clear();
        this.mCurrentSync.clear();
        this.mTotalBytes = 0;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
    public void send(int i, byte[] bArr, int i2, ChannelCallback channelCallback) {
        this.mChannel.send(i, bArr, i2, channelCallback);
    }

    public abstract void updateMinDMTU(int i);

    public abstract boolean useCrc32Verify();

    private void performWrite(Packet packet, final ChannelCallback channelCallback, final boolean z) {
        assertRuntime(false);
        if (channelCallback == null) {
            resetOnException();
            throw new NullPointerException("callback can't be null");
        }
        if (!isTimerOn()) {
            startExceptionTimer();
        }
        final byte[] bytes = packet.toBytes();
        if (DEBUG) {
            BluetoothLog.w(String.format("%s: %s", getLogTag(), packet));
        }
        BluetoothContextManager.post(new Runnable() { // from class: com.xiaomi.smarthome.library.bluetooth.channel.Channel.13
            @Override // java.lang.Runnable
            public void run() {
                Channel channel = Channel.this;
                channel.write(bytes, channel.new WriteCallback(channelCallback), z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTimer(long j) {
        startTimer(j, this.mTimeoutHandler);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
    public final void send(byte[] bArr, int i, ChannelCallback channelCallback) {
        this.mChannel.send(bArr, i, channelCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTimer(long j, Timer.TimerCallback timerCallback) {
        if (DEBUG) {
            BluetoothLog.v(String.format("%s: duration = %d", getLogTag(), Long.valueOf(j)));
        }
        this.mTimer.start(timerCallback, j);
    }
}
