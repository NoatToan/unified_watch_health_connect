package com.xiaomi.smarthome.core.server.internal.bluetooth.channel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.channel.Channel;
import com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleRequestMtuResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ChannelManager {
    protected static final String ACTION_ONLINE_CHANGED = "action.online.status.changed";
    private static final int DEFAULT_MTU_SIZE = 23;
    private static final int DMTU_OFFSET = 5;
    public static final String EXTRA_MAC = "extra_mac";
    public static final String EXTRA_ONLINE_STATUS = "extra_online_status";
    private static final int MAX_MTU_SIZE = 247;
    public static final int MAX_PACKAGE_NUM = 6;
    private static ConcurrentMap<String, Integer> mMtuMap = new ConcurrentHashMap();
    private static ConcurrentMap<String, Integer> mMinDMTUMap = new ConcurrentHashMap();
    private static ConcurrentMap<String, Boolean> mMacRequesting = new ConcurrentHashMap();
    private static String lastMtuChanged = null;
    private ConcurrentMap<String, BleChannel> mChannels = new ConcurrentHashMap();
    private BroadcastReceiver mBluetoothConnectReceiver = new BroadcastReceiver() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            BluetoothLog.d("channel manager receive action=" + action);
            if (TextUtils.equals(action, "com.xiaomi.smarthome.bluetooth.connect_status_changed")) {
                String stringExtra = intent.getStringExtra("key_device_address");
                if (intent.getIntExtra("key_connect_status", 5) == 32) {
                    ChannelManager.mMacRequesting.put(stringExtra, Boolean.FALSE);
                    ChannelManager.clearDMTU(stringExtra);
                    ChannelManager.this.notifyMtuChanged(stringExtra, 23);
                    BluetoothLog.formatLog("channel manager receive device mac=%s, disconnected", stringExtra);
                    ChannelManager.this.resetChannelState(stringExtra);
                    BluetoothCache.setBleFirmwareUpdateInfo(stringExtra, null);
                }
            }
        }
    };

    public static class BleChannel extends Channel {
        private ChannelManager channelManager;
        private String mac;
        private boolean useCrc32;
        private List<IBleChannelReader> readers = new ArrayList();
        private IBleChannelWriter writer = new IBleChannelWriter.Stub() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager.BleChannel.1
            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter
            public void write(byte[] bArr, int i, final IBleResponse iBleResponse) throws RemoteException {
                BleChannel.this.send(bArr, i, new ChannelCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager.BleChannel.1.1
                    @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
                    public void onCallback(int i2) {
                        try {
                            IBleResponse iBleResponse2 = iBleResponse;
                            if (iBleResponse2 != null) {
                                iBleResponse2.onResponse(i2, null);
                            }
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter
            public void writeWithOpCode(int i, byte[] bArr, int i2, final IBleResponse iBleResponse) throws RemoteException {
                BleChannel.this.send(i, bArr, i2, new ChannelCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager.BleChannel.1.2
                    @Override // com.xiaomi.smarthome.library.bluetooth.channel.ChannelCallback
                    public void onCallback(int i3) {
                        try {
                            IBleResponse iBleResponse2 = iBleResponse;
                            if (iBleResponse2 != null) {
                                iBleResponse2.onResponse(i3, null);
                            }
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        };

        public BleChannel(String str, ChannelManager channelManager, boolean z) {
            this.mac = str;
            this.channelManager = channelManager;
            this.useCrc32 = z;
        }

        public void addReader(IBleChannelReader iBleChannelReader) {
            if (iBleChannelReader == null) {
                return;
            }
            Iterator<IBleChannelReader> it = this.readers.iterator();
            while (it.hasNext()) {
                IBleChannelReader next = it.next();
                if (next != null && next.asBinder() != null && next.asBinder().equals(iBleChannelReader.asBinder())) {
                    return;
                }
                if (next == null || next.asBinder() == null) {
                    it.remove();
                }
            }
            this.readers.add(iBleChannelReader);
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.channel.Channel
        public int getDMTU() {
            Integer num = (Integer) ChannelManager.mMtuMap.get(this.mac);
            if (num == null || num.intValue() < 5) {
                return 18;
            }
            return num.intValue() - 5;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.channel.Channel
        public int getMaxPackageNum() {
            return getMinDMTU() == 18 ? 1 : 6;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.channel.Channel
        public int getMinDMTU() {
            Integer num = (Integer) ChannelManager.mMinDMTUMap.get(this.mac);
            if (num == null || num.intValue() < 5) {
                return 18;
            }
            return num.intValue();
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
        public void onRecv(byte[] bArr, int i) {
            for (IBleChannelReader iBleChannelReader : this.readers) {
                if (iBleChannelReader != null) {
                    try {
                        iBleChannelReader.onRead(this.mac, bArr, i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public int readerSize() {
            return this.readers.size();
        }

        public void removeReader(IBleChannelReader iBleChannelReader) {
            if (iBleChannelReader == null) {
                return;
            }
            this.readers.remove(iBleChannelReader);
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.channel.Channel
        public void updateMinDMTU(int i) {
            ChannelManager.mMinDMTUMap.put(this.mac, Integer.valueOf(i));
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.channel.Channel
        public boolean useCrc32Verify() {
            return this.useCrc32;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
        public void write(byte[] bArr, ChannelCallback channelCallback, boolean z) {
            this.channelManager.writeBle(this.mac, bArr, channelCallback, z);
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.channel.IChannel
        public void writeBatchData(List<byte[]> list, ChannelCallback channelCallback) {
            this.channelManager.writeBatchBleData(this.mac, list, channelCallback);
        }
    }

    public static abstract class BleChannelReader extends IBleChannelReader.Stub {
    }

    public ChannelManager() {
        BluetoothUtils.registerReceiver(this.mBluetoothConnectReceiver, new IntentFilter("com.xiaomi.smarthome.bluetooth.connect_status_changed"));
    }

    public static void clearDMTU(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mMinDMTUMap.remove(str);
        mMtuMap.remove(str);
    }

    private int getDMTU(int i) {
        return i - 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyMtuChanged(String str, int i) {
        String str2 = str + ":" + i;
        if (TextUtils.isEmpty(lastMtuChanged) || !str2.equals(lastMtuChanged)) {
            lastMtuChanged = str2;
            String propDid = BluetoothCache.getPropDid(str);
            Intent intent = new Intent(BluetoothConstants.ACTION_DEVICE_STATUS_CHANGED);
            intent.putExtra("did", propDid);
            Bundle bundle = new Bundle();
            bundle.putInt("mtu", i);
            intent.putExtra("deviceStatus", bundle);
            BluetoothUtils.sendBroadcast(intent);
        }
    }

    private void requestMtu(final String str, final int i, final BleRequestMtuResponse bleRequestMtuResponse) {
        BleConnectManager.getInstance().requestMtu(str, i, new BleRequestMtuResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager.2
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i2, Integer num) {
                BluetoothLog.d("request mtu ,mac =" + str + ",mtu=" + i + ",resp code =" + i2 + ",data=" + num);
                if (i2 == 0 && num != null) {
                    ChannelManager.mMtuMap.put(str, num);
                    ChannelManager.this.notifyMtuChanged(str, num.intValue());
                    ChannelManager.this.sendA4(str);
                } else {
                    ChannelManager.mMtuMap.put(str, 23);
                    BleRequestMtuResponse bleRequestMtuResponse2 = bleRequestMtuResponse;
                    if (bleRequestMtuResponse2 != null) {
                        bleRequestMtuResponse2.onResponse(0, null);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetChannelState(String str) {
        BleChannel channel = MeshDfuChannelManager.getInstance().getChannel(str);
        if (channel != null) {
            channel.reset();
        }
    }

    public synchronized BleChannel getChannel(String str) {
        return this.mChannels.get(str);
    }

    public synchronized IBleChannelWriter getWriter(String str) {
        BleChannel bleChannel = this.mChannels.get(str);
        if (bleChannel == null) {
            return null;
        }
        return bleChannel.writer;
    }

    public synchronized IBleChannelWriter registerChannelReader(String str, IBleChannelReader iBleChannelReader) {
        BleChannel bleChannel;
        try {
            BluetoothLog.v(String.format("registerChannelReader mac =%s ", str));
            bleChannel = this.mChannels.get(str);
            if (bleChannel == null) {
                bleChannel = new BleChannel(str, this, useCrc32Verify());
                this.mChannels.put(str, bleChannel);
            }
            bleChannel.addReader(iBleChannelReader);
        } catch (Throwable th) {
            throw th;
        }
        return bleChannel.writer;
    }

    public void sendA4(final String str) {
        BluetoothLog.formatLog("channel manager receive device mac=%s, connected,send A4 again", str);
        BleConnectManager.getInstance().write(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, new byte[]{-92}, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r2) {
                BluetoothLog.formatLog("ChannelManager write 0xA4 ,mac = %s,response code =%d", str, Integer.valueOf(i));
            }
        });
    }

    public void startRequestMtu(String str) {
        Integer num = mMtuMap.get(str);
        Boolean bool = mMacRequesting.get(str);
        if (num == null) {
            if (bool == null || !bool.booleanValue()) {
                mMacRequesting.put(str, Boolean.TRUE);
                BluetoothLog.formatLog("channel manager receive device mac=%s, connected,send request mtu ", str);
                requestMtu(str, MAX_MTU_SIZE, null);
            }
        }
    }

    public synchronized void unregisterChannelReader(String str, IBleChannelReader iBleChannelReader) {
        BleChannel bleChannel = this.mChannels.get(str);
        if (bleChannel != null) {
            bleChannel.removeReader(iBleChannelReader);
        }
    }

    public abstract boolean useCrc32Verify();

    public abstract void writeBatchBleData(String str, List<byte[]> list, ChannelCallback channelCallback);

    public abstract void writeBle(String str, byte[] bArr, ChannelCallback channelCallback, boolean z);

    public synchronized IBleChannelWriter registerChannelReader(String str, boolean z, IBleChannelReader iBleChannelReader, BleRequestMtuResponse bleRequestMtuResponse) {
        BleChannel bleChannel;
        try {
            BluetoothLog.v(String.format("registerChannelReader mac =%s ", str));
            bleChannel = this.mChannels.get(str);
            if (bleChannel == null) {
                bleChannel = new BleChannel(str, this, useCrc32Verify());
                this.mChannels.put(str, bleChannel);
            }
            bleChannel.addReader(iBleChannelReader);
        } catch (Throwable th) {
            throw th;
        }
        return bleChannel.writer;
    }
}
