package com.airoha.android.lib.fota;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.fota.actionEnum.DualActionEnum;
import com.airoha.android.lib.fota.actionEnum.SingleActionEnum;
import com.airoha.android.lib.fota.fotaError.ErrorEnum;
import com.airoha.android.lib.fota.fotaError.FotaErrorMsg;
import com.airoha.android.lib.fota.fotaSetting.FotaDualSettings;
import com.airoha.android.lib.fota.fotaSetting.FotaSingleSettings;
import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.airoha.android.lib.fota.stage.FotaStage;
import com.airoha.android.lib.fota.stage.FotaStageEnum;
import com.airoha.android.lib.fota.stage.FotaStage_00_Start;
import com.airoha.android.lib.fota.stage.FotaStage_06_Cancel;
import com.airoha.android.lib.fota.stage.FotaStage_07_GetModelName;
import com.airoha.android.lib.fota.stage.IAirohaFotaStage;
import com.airoha.android.lib.fota.stage.for153xMCE.Dst;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_00_InquiryFota;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_00_QueryState;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_01_StartTranscation;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_04_CheckIntegrity;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_05_Commit;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_11_DiffFlashPartitionEraseStorage;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_12_ProgramDiffFotaStorage;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_13_GetPartitionEraseStatusStorage;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_14_ComparePartitionV2Storage;
import com.airoha.android.lib.fota.stage.forSingle.FotaStage_WriteState;
import com.airoha.android.lib.fota.stage.forTws.FotaStageRoleSwitch;
import com.airoha.android.lib.fota.stage.forTws.FotaStageTwsCommit;
import com.airoha.android.lib.fota.stage.forTws.FotaStageTwsQueryPartition;
import com.airoha.android.lib.fota.stage.forTws.FotaStageTwsWriteState;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_00_CheckAgentChannel;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_00_GetAgentClientVersion;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_00_TwsGetBatery;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_00_TwsQueryState;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_01_TwsStartTranscation;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_21_TwsDiffFlashPartitionEraseStorage;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_22_TwsProgramDiffFotaStorage;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_23_TwsGetPartitionEraseStatusStorage;
import com.airoha.android.lib.fota.stage.forTws.FotaStage_24_TwsComparePartitionV2Storage;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.transport.PacketParser.OnRacePacketListener;
import com.airoha.android.lib.transport.connection.OnAirohaConnStateListener;
import com.airoha.android.lib.util.Converter;
import com.alipay.sdk.app.OpenAuthTask;
import com.huami.watch.dataflow.chart.util.AnimUtil;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaRaceOtaMgr {
    public static int BOOT_REASON = 1;
    public static int DUMP_COMPLETE = 3;
    public static int DUMP_INFO = 2;
    private static final String K = "AirohaRaceFotaMgr";
    public static final int ROM_START_ADDRESS = 0;
    private boolean A;
    private boolean B;
    private String C;
    private String D;
    private Dst E;
    private boolean F;
    private boolean G;
    private OnRacePacketListener H;
    private OnAirohaConnStateListener I;
    private Timer J;
    private InputStream a;
    private InputStream b;
    private InputStream c;
    private long d;
    private int e;
    private int f;
    private byte g;
    private byte h;
    private boolean i;
    private ConcurrentHashMap<String, OnAirohaFotaStatusClientAppListener> j;
    private Timer k;
    private Timer l;
    private Timer m;
    public volatile int mAgentFotaState;
    public AirohaLink mAirohaLink;
    public int mBatteryThrd;
    public int mCompletedStageCount;
    public IAirohaFotaStage mCurrentStage;
    public FotaDualSettings mFotaDualSettings;
    public FotaSingleSettings mFotaSingleSettings;
    public volatile int mHistoryState;
    public boolean mIsFlashOperationAllowed;
    public boolean mIsTws;
    public volatile int mPartnerFotaState;
    public AgentPartnerParam mProgressRoleIndex;
    public Queue<IAirohaFotaStage> mStagesQueue;
    public int mTotalStageCount;
    private Timer n;
    private e o;
    private Handler p;
    private int q;
    private int r;
    private boolean s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private byte z;

    public class a implements OnRacePacketListener {
        public a() {
        }

        @Override // com.airoha.android.lib.transport.PacketParser.OnRacePacketListener
        public synchronized void handleRespOrInd(int i, byte[] bArr, int i2) {
            AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "OnRacePacketListener");
            if (AirohaRaceOtaMgr.this.y) {
                return;
            }
            if (AirohaRaceOtaMgr.this.v(i, bArr, i2)) {
                AirohaRaceOtaMgr.this.y = true;
                AirohaRaceOtaMgr.this.B();
                AirohaRaceOtaMgr.this.stopLongPacketTimer();
                return;
            }
            AirohaRaceOtaMgr airohaRaceOtaMgr = AirohaRaceOtaMgr.this;
            if (airohaRaceOtaMgr.mCurrentStage == null) {
                airohaRaceOtaMgr.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "mCurrentStage == null");
                return;
            }
            airohaRaceOtaMgr.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "received raceId: " + String.format("%04X", Integer.valueOf(i)) + ", raceType: " + String.format("%02X", Integer.valueOf(i2)));
            if (!AirohaRaceOtaMgr.this.mCurrentStage.isExpectedResp(i, i2, bArr)) {
                AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "not the expected race ID or Type");
                return;
            }
            if (AirohaRaceOtaMgr.this.mCurrentStage.isStopped()) {
                AirohaRaceOtaMgr airohaRaceOtaMgr2 = AirohaRaceOtaMgr.this;
                airohaRaceOtaMgr2.notifyAppListenerError(airohaRaceOtaMgr2.mCurrentStage.getFotaStageIndex(), AirohaRaceOtaMgr.this.mCurrentStage.getErrorCode(), AirohaRaceOtaMgr.this.mCurrentStage.getErrorMsg());
                if (!AirohaRaceOtaMgr.this.v) {
                    AirohaRaceOtaMgr.this.startSendCancelCmd((byte) 0);
                }
                return;
            }
            AirohaRaceOtaMgr.this.mCurrentStage.handleResp(i, bArr, i2);
            if (AirohaRaceOtaMgr.this.mCurrentStage.isRespStatusSuccess()) {
                AirohaRaceOtaMgr.this.B();
                if (AirohaRaceOtaMgr.this.mCurrentStage.isErrorOccurred()) {
                    AirohaRaceOtaMgr.this.mCurrentStage.stop();
                    AirohaRaceOtaMgr airohaRaceOtaMgr3 = AirohaRaceOtaMgr.this;
                    airohaRaceOtaMgr3.notifyAppListenerError(airohaRaceOtaMgr3.mCurrentStage.getFotaStageIndex(), AirohaRaceOtaMgr.this.mCurrentStage.getErrorCode(), AirohaRaceOtaMgr.this.mCurrentStage.getErrorMsg());
                    AirohaRaceOtaMgr.this.A((byte) 1);
                    return;
                }
                int completedTaskCount = AirohaRaceOtaMgr.this.mCurrentStage.getCompletedTaskCount();
                int totalTaskCount = AirohaRaceOtaMgr.this.mCurrentStage.getTotalTaskCount();
                if (AirohaRaceOtaMgr.this.mCurrentStage.isCompleted()) {
                    AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "Completed: " + AirohaRaceOtaMgr.this.mCurrentStage.getClass().getSimpleName());
                    AirohaRaceOtaMgr airohaRaceOtaMgr4 = AirohaRaceOtaMgr.this;
                    airohaRaceOtaMgr4.mCompletedStageCount = airohaRaceOtaMgr4.mCompletedStageCount + 1;
                    airohaRaceOtaMgr4.notifyAppListenerProgress(airohaRaceOtaMgr4.mProgressRoleIndex, airohaRaceOtaMgr4.mCurrentStage, completedTaskCount, totalTaskCount);
                    String simpleName = AirohaRaceOtaMgr.this.mCurrentStage.getClass().getSimpleName();
                    LinkedList<FotaStage> stagesForSkip = null;
                    IAirohaFotaStage.SKIP_TYPE skipType = AirohaRaceOtaMgr.this.mCurrentStage.getSkipType();
                    if (skipType != IAirohaFotaStage.SKIP_TYPE.None) {
                        IAirohaFotaStage iAirohaFotaStage = AirohaRaceOtaMgr.this.mCurrentStage;
                        stagesForSkip = iAirohaFotaStage.getStagesForSkip(iAirohaFotaStage.getSkipType());
                        if (stagesForSkip != null) {
                            AirohaRaceOtaMgr.this.mCompletedStageCount += stagesForSkip.size();
                        }
                    }
                    switch (c.a[skipType.ordinal()]) {
                        case 1:
                            if (stagesForSkip != null) {
                                AirohaRaceOtaMgr.this.z(skipType);
                            } else {
                                AirohaRaceOtaMgr.this.notifyAppListenerInterrupted("Interrupted: all partitions are the same, skip the other stages.");
                            }
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            AirohaRaceOtaMgr.this.z(skipType);
                            break;
                        case 7:
                            if (stagesForSkip != null) {
                                AirohaRaceOtaMgr.this.z(skipType);
                            }
                            break;
                    }
                    AirohaRaceOtaMgr airohaRaceOtaMgr5 = AirohaRaceOtaMgr.this;
                    airohaRaceOtaMgr5.mCurrentStage = airohaRaceOtaMgr5.mStagesQueue.poll();
                    AirohaRaceOtaMgr airohaRaceOtaMgr6 = AirohaRaceOtaMgr.this;
                    if (airohaRaceOtaMgr6.mCurrentStage == null) {
                        airohaRaceOtaMgr6.w("Completed:" + simpleName);
                        return;
                    }
                    airohaRaceOtaMgr6.notifyAppListenerStatus("Started: " + AirohaRaceOtaMgr.this.mCurrentStage.getClass().getSimpleName());
                    AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "Started: " + AirohaRaceOtaMgr.this.mCurrentStage.getClass().getSimpleName());
                    AirohaRaceOtaMgr.this.mCurrentStage.start();
                } else {
                    AirohaRaceOtaMgr airohaRaceOtaMgr7 = AirohaRaceOtaMgr.this;
                    airohaRaceOtaMgr7.notifyAppListenerProgress(airohaRaceOtaMgr7.mProgressRoleIndex, airohaRaceOtaMgr7.mCurrentStage, completedTaskCount, totalTaskCount);
                    AirohaRaceOtaMgr.this.s(i2);
                }
            }
        }
    }

    public class b implements OnAirohaConnStateListener {
        public b() {
        }

        @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
        public void OnConnected(String str) {
            AirohaRaceOtaMgr.this.notifyAppListenerConnected();
            if (AirohaRaceOtaMgr.this.v) {
                AirohaRaceOtaMgr.this.startSendCancelCmd((byte) 0);
            }
            AirohaRaceOtaMgr.this.v = false;
            AirohaRaceOtaMgr.this.w = false;
            AirohaRaceOtaMgr.this.x = false;
            AirohaRaceOtaMgr.this.queryAfterConnected();
        }

        @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
        public void OnConnecting() {
        }

        @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
        public void OnConnectionTimeout() {
            AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "OnConnectionTimeout");
            AirohaRaceOtaMgr.this.notifyAppListenerError(FotaStageEnum.None, ErrorEnum.CONNECTION_TIMEOUT);
        }

        @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
        public void OnDisConnecting() {
        }

        @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
        public void OnDisconnected() {
            AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "OnDisconnected");
            if (AirohaRaceOtaMgr.this.w || AirohaRaceOtaMgr.this.x) {
                return;
            }
            AirohaRaceOtaMgr.this.notifyAppListenerUnexpectedlyDisconnected();
        }

        @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
        public void OnUnexpectedDisconnected() {
            AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "OnUnexpectedDisconnected");
            AirohaRaceOtaMgr.this.notifyAppListenerUnexpectedlyDisconnected();
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IAirohaFotaStage.SKIP_TYPE.values().length];
            a = iArr;
            try {
                iArr[IAirohaFotaStage.SKIP_TYPE.All_stages.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IAirohaFotaStage.SKIP_TYPE.Compare_stages.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IAirohaFotaStage.SKIP_TYPE.Erase_stages.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[IAirohaFotaStage.SKIP_TYPE.Program_stages.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[IAirohaFotaStage.SKIP_TYPE.CompareErase_stages.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[IAirohaFotaStage.SKIP_TYPE.Client_Erase_stages.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[IAirohaFotaStage.SKIP_TYPE.Sinlge_StateUpdate_stages.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public class d extends TimerTask {
        public d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AirohaRaceOtaMgr airohaRaceOtaMgr = AirohaRaceOtaMgr.this;
            airohaRaceOtaMgr.mProgressRoleIndex = AgentPartnerParam.AGENT;
            if (!airohaRaceOtaMgr.v) {
                AirohaRaceOtaMgr.this.startSendCancelCmd((byte) 0);
            }
            AirohaRaceOtaMgr.this.mStagesQueue.clear();
            AirohaRaceOtaMgr.this.J = null;
        }
    }

    public class e extends Thread {
        public static final int c = 5;
        public boolean a = false;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AirohaRaceOtaMgr.this.retryAction();
            }
        }

        public e() {
        }

        @Override // java.lang.Thread
        public void interrupt() {
            AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "LongPacketTimer: interrupt");
            this.a = true;
            super.interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "LongPacketTimer run()");
            int i = 0;
            loop0: while (true) {
                int i2 = 0;
                do {
                    if (this.a || i >= AirohaRaceOtaMgr.this.q) {
                        break loop0;
                    }
                    SystemClock.sleep(5L);
                    i2 += 5;
                    i += 5;
                    if (this.a) {
                        AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "LongPacketTimer return");
                        return;
                    }
                    if (!AirohaRaceOtaMgr.this.mAirohaLink.isConnected()) {
                        AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "LongPacketTimer disconnected");
                        return;
                    }
                    AirohaRaceOtaMgr airohaRaceOtaMgr = AirohaRaceOtaMgr.this;
                    if (airohaRaceOtaMgr.mCurrentStage == null) {
                        airohaRaceOtaMgr.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "LongPacketTimer: mCurrentStage is null ");
                        return;
                    } else if (i >= airohaRaceOtaMgr.q) {
                        AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "LongPacketTimer: delay 1000 ms and then retryAction");
                        AirohaRaceOtaMgr.this.p = new Handler(AirohaRaceOtaMgr.this.mAirohaLink.getContext().getMainLooper());
                        AirohaRaceOtaMgr.this.p.postDelayed(new a(), 1000L);
                        return;
                    }
                } while (i2 < AirohaRaceOtaMgr.this.r);
                int waitingRespCount = AirohaRaceOtaMgr.this.t - AirohaRaceOtaMgr.this.mCurrentStage.getWaitingRespCount();
                if (!AirohaRaceOtaMgr.this.mCurrentStage.isCmdQueueEmpty() && waitingRespCount > 0) {
                    AirohaRaceOtaMgr.this.mCurrentStage.pollCmdQueue();
                    AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "LongPacketTimer: return");
                    return;
                }
            }
            AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "LongPacketTimer: return");
        }
    }

    public class f extends TimerTask {
        public f() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AirohaRaceOtaMgr.this.mAirohaLink.logToFile(AirohaRaceOtaMgr.K, "RetryTask()");
            AirohaRaceOtaMgr.this.retryAction();
        }
    }

    public AirohaRaceOtaMgr(AirohaLink airohaLink) {
        this.mHistoryState = 65535;
        this.mAgentFotaState = 65535;
        this.mPartnerFotaState = 65535;
        this.mIsTws = false;
        this.mFotaSingleSettings = new FotaSingleSettings();
        this.mFotaDualSettings = new FotaDualSettings();
        this.mIsFlashOperationAllowed = true;
        this.e = 255;
        this.g = (byte) -1;
        this.h = (byte) 0;
        this.i = false;
        this.q = OpenAuthTask.OK;
        this.r = AnimUtil.DURATION_LOADING;
        this.s = false;
        this.t = 1;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = (byte) 1;
        this.mProgressRoleIndex = AgentPartnerParam.AGENT;
        this.H = new a();
        this.I = new b();
        this.mAirohaLink = airohaLink;
        airohaLink.registerOnRacePacketListener(K, this.H);
        this.mAirohaLink.registerOnConnStateListener(K, this.I);
        this.j = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(byte b2) {
        this.mAirohaLink.sendCommand(new RacePacket(RaceType.CMD_NEED_RESP, RaceId.RACE_FOTA_STOP, new byte[]{7, this.mIsTws ? (byte) 3 : (byte) 1, b2}).getRawFotaMode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(int i) {
        if (this.mCurrentStage.isCmdQueueEmpty()) {
            this.mAirohaLink.logToFile(K, "mCurrentStage.isCmdQueueEmpty()");
            Timer timer = new Timer();
            this.k = timer;
            timer.schedule(new f(), this.q);
            return;
        }
        if (!this.s) {
            if (i == this.mCurrentStage.getRespType()) {
                this.mAirohaLink.logToFile(K, this.mCurrentStage.getClass().getSimpleName() + ": send next cmd");
                this.mCurrentStage.pollCmdQueue();
                return;
            }
            return;
        }
        if (this.mCurrentStage.getWaitingRespCount() == 0) {
            e eVar = this.o;
            if (eVar != null) {
                eVar.interrupt();
                this.o = null;
            }
            this.mAirohaLink.logToFile(K, this.mCurrentStage.getClass().getSimpleName() + ": send next cmd");
            this.mCurrentStage.pollCmdQueue();
        }
    }

    private void t(boolean z) {
        if (this.x) {
            this.mAirohaLink.logToFile(K, "cancelFota: mIsDoingCommit = " + this.x);
            return;
        }
        if (this.w) {
            this.v = true;
        }
        B();
        stopLongPacketTimer();
        if (this.mCurrentStage != null) {
            this.mAirohaLink.logToFile(K, "stopping: " + this.mCurrentStage.getClass().getSimpleName());
            this.mCurrentStage.stop();
        }
        Queue<IAirohaFotaStage> queue = this.mStagesQueue;
        if (queue != null) {
            queue.clear();
        }
        this.mIsTws = z;
        this.mAirohaLink.logToFile(K, "mTimerSendCancelCmd delay 1000ms");
        Timer timer = new Timer();
        this.J = timer;
        timer.schedule(new d(), 1000L);
    }

    private FotaDualSettings u() {
        return this.mFotaDualSettings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v(int i, byte[] bArr, int i2) {
        this.mAirohaLink.logToFile(K, "isDeviceCancelRequest()");
        if (i2 != 90 || i != 7171) {
            return false;
        }
        byte b2 = bArr[6];
        byte b3 = bArr[7];
        byte b4 = bArr[8];
        this.mAirohaLink.logToFile(K, String.format("isDeviceCancelRequest: %02X, %02X, %02X", Byte.valueOf(b2), Byte.valueOf(b3), Byte.valueOf(b4)));
        this.mAirohaLink.sendCommand(new RacePacket(RaceType.RESPONSE, RaceId.RACE_FOTA_STOP, new byte[]{0}).getRawFotaMode());
        IAirohaFotaStage iAirohaFotaStage = this.mCurrentStage;
        if (iAirohaFotaStage != null) {
            iAirohaFotaStage.stop();
        }
        this.mStagesQueue.clear();
        this.mAirohaLink.sendCommand(new RacePacket(RaceType.INDICATION, RaceId.RACE_FOTA_STOP, new byte[]{b2, b3, b4}).getRawFotaMode());
        if (b4 == 0) {
            notifyAppListenerError(FotaStageEnum.None, ErrorEnum.DEVICE_CANCELLED);
        } else if (b4 == 1) {
            notifyAppListenerError(FotaStageEnum.None, ErrorEnum.DEVICE_CANCELLED_FOTA_FAIL);
        } else if (b4 == 2) {
            notifyAppListenerError(FotaStageEnum.None, ErrorEnum.DEVICE_CANCELLED_FOTA_TIMEOUT);
        } else if (b4 == 3) {
            notifyAppListenerError(FotaStageEnum.None, ErrorEnum.DEVICE_CANCELLED_PARTNER_LOSS);
        } else if (b4 != 4) {
            switch (b4) {
                case -16:
                    notifyAppListenerError(FotaStageEnum.None, ErrorEnum.DEVICE_CANCELLED_FOTA_SP_LOST);
                    break;
                case -15:
                    notifyAppListenerError(FotaStageEnum.None, ErrorEnum.DEVICE_CANCELLED_FOTA_AGENT_LOST);
                    break;
                case -14:
                    notifyAppListenerError(FotaStageEnum.None, ErrorEnum.DEVICE_CANCELLED_FOTA_BT_OFF);
                    break;
                case -13:
                    notifyAppListenerError(FotaStageEnum.None, ErrorEnum.DEVICE_CANCELLED_FOTA_UNEXPECTED_RHO_ONGOING);
                    break;
                case -12:
                    notifyAppListenerError(FotaStageEnum.None, ErrorEnum.DEVICE_CANCELLED_FOTA_UNEXPECTED_RHO_DONE);
                    break;
                default:
                    notifyAppListenerError(FotaStageEnum.None, ErrorEnum.DEVICE_CANCELLED_FOTA_UNKNOWN_REASON);
                    break;
            }
        } else {
            notifyAppListenerError(FotaStageEnum.None, ErrorEnum.DEVICE_CANCELLED_FOTA_NOT_ALLOWED);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str) {
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.notifyCompleted(str);
            }
        }
    }

    private void x(boolean z) {
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.notifyClientExistence(z);
            }
        }
    }

    private void y(byte b2, String str) {
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.notifyStateEnum(b2, str);
            }
        }
    }

    public void B() {
        this.mAirohaLink.logToFile(K, "stopRspRelatedTimer");
        Timer timer = this.k;
        if (timer != null) {
            timer.cancel();
            this.k = null;
            this.mAirohaLink.logToFile(K, "mTimerForRetryTask.cancel()");
        }
        Timer timer2 = this.l;
        if (timer2 != null) {
            timer2.cancel();
            this.l = null;
            this.mAirohaLink.logToFile(K, "mTimerForRespTimeout.cancel()");
        }
    }

    public void cancel() {
        t(this.mIsTws);
    }

    public void cancelDualFota() {
        t(true);
    }

    public void cancelSingleFota() {
        t(false);
    }

    public boolean checkAgentIsRight() {
        return this.A;
    }

    public void doRoleSwitch() {
        this.y = false;
        this.w = true;
        renewStageQueue();
        this.mStagesQueue.offer(new FotaStageRoleSwitch(this));
        startPollStagetQueue();
        AgentPartnerParam agentPartnerParam = this.mProgressRoleIndex;
        AgentPartnerParam agentPartnerParam2 = AgentPartnerParam.AGENT;
        if (agentPartnerParam == agentPartnerParam2) {
            this.mProgressRoleIndex = AgentPartnerParam.PARTNER;
        } else {
            this.mProgressRoleIndex = agentPartnerParam2;
        }
    }

    public void enableLongPacketMode(boolean z) {
        this.s = z;
    }

    public void enableSingleActiveFotaPreparation(boolean z) {
        this.G = z;
    }

    public void enableTwsActiveFotaPreparation(boolean z) {
        this.F = z;
    }

    public AirohaLink getAirohaLink() {
        return this.mAirohaLink;
    }

    public Dst getAwsPeerDst() {
        return this.E;
    }

    public int getBatteryThrd() {
        this.mAirohaLink.logToFile(K, "battery thrd: " + this.mBatteryThrd);
        return this.mBatteryThrd;
    }

    public InputStream getFotaInputStream() {
        return this.a;
    }

    public InputStream getFotaInputStreamAgent() {
        return this.b;
    }

    public int getFotaInputStreamSize() {
        return (int) this.d;
    }

    public int getFotaPartitionStartAddress() {
        return this.e;
    }

    public int getFotaStagePrePollSize() {
        return FotaStage.getPrePollSize();
    }

    public byte getFotaStorageType() {
        return this.g;
    }

    public int getLongPacketCmdCount() {
        return this.t;
    }

    public byte getPowerMode() {
        return this.z;
    }

    public InputStream getmFotaInputStream_Partner() {
        return this.c;
    }

    public void handleQueriedStates() {
        this.mAirohaLink.logToFile(K, "handleQueriedStates");
        this.mAirohaLink.logToFile(K, "mHistoryState= " + this.mHistoryState);
        int i = this.mHistoryState;
        if (i != 512) {
            if (i == 513) {
                if (this.mIsFlashOperationAllowed) {
                    notifySingleAction(SingleActionEnum.StartFota);
                    return;
                }
                return;
            }
            if (i != 528) {
                if (i == 529) {
                    notifySingleAction(SingleActionEnum.Commit);
                    return;
                }
                if (i != 544) {
                    if (i == 560) {
                        notifySingleAction(SingleActionEnum.RestartNvKeyUpdate);
                        return;
                    }
                    if (i != 576 && i != 784 && i != 65535) {
                        switch (i) {
                            case 256:
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                if (this.mIsFlashOperationAllowed) {
                                    notifySingleAction(SingleActionEnum.StartFota);
                                }
                                break;
                        }
                    }
                } else {
                    if (this.mIsFlashOperationAllowed) {
                        notifySingleAction(SingleActionEnum.RestartFota);
                        return;
                    }
                    return;
                }
            }
        }
        if (this.mIsFlashOperationAllowed) {
            notifySingleAction(SingleActionEnum.StartFota);
        }
    }

    public void handleTwsQueriedStates() {
        this.mAirohaLink.logToFile(K, "handleTwsQueriedStates");
        this.mAirohaLink.logToFile(K, "mAgentFotaState= " + this.mAgentFotaState);
        this.mAirohaLink.logToFile(K, "mPartnerFotaState= " + this.mPartnerFotaState);
        if (this.mAgentFotaState == 769 && (this.mPartnerFotaState == 769 || this.mPartnerFotaState == 785)) {
            notifyDualAction(DualActionEnum.StartFota);
            return;
        }
        if (this.mAgentFotaState == 257 || this.mAgentFotaState == 784 || this.mPartnerFotaState == 784) {
            notifyDualAction(DualActionEnum.StartFota);
            return;
        }
        if (this.mAgentFotaState == 832 && (this.mPartnerFotaState == 257 || this.mPartnerFotaState == 816)) {
            notifyDualAction(DualActionEnum.RoleSwitch);
            return;
        }
        if (this.mAgentFotaState == 257 && (this.mPartnerFotaState == 257 || this.mPartnerFotaState == 816 || this.mPartnerFotaState == 832)) {
            notifyDualAction(DualActionEnum.StartNvKeyUpdate);
            return;
        }
        if (this.mAgentFotaState == 816 && (this.mPartnerFotaState == 257 || this.mPartnerFotaState == 816 || this.mPartnerFotaState == 832)) {
            notifyDualAction(DualActionEnum.StartNvKeyUpdate);
            return;
        }
        if (this.mAgentFotaState == 785 && this.mPartnerFotaState == 785) {
            notifyDualAction(DualActionEnum.TwsCommit);
        } else if (this.mAgentFotaState == 785) {
            notifyDualAction(DualActionEnum.RoleSwitch);
        } else if (this.mIsFlashOperationAllowed) {
            notifyDualAction(DualActionEnum.StartFota);
        }
    }

    public boolean isBusy() {
        Queue<IAirohaFotaStage> queue = this.mStagesQueue;
        return (queue == null || queue.size() == 0) ? false : true;
    }

    public boolean isLongPacketMode() {
        return this.s;
    }

    public void notifyAgentIsRight(boolean z) {
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.onAgentChannelReceived(z);
            }
        }
    }

    public void notifyAppListenerConnected() {
    }

    public void notifyAppListenerError(FotaStageEnum fotaStageEnum, ErrorEnum errorEnum, String str) {
        this.mAirohaLink.logToFile(K, "notifyAppListenerError: " + str);
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.notifyError(fotaStageEnum.ordinal(), errorEnum.ordinal(), str);
            }
        }
    }

    public void notifyAppListenerInterrupted(String str) {
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.notifyInterrupted(str);
            }
        }
    }

    public void notifyAppListenerProgress(AgentPartnerParam agentPartnerParam, IAirohaFotaStage iAirohaFotaStage, int i, int i2) {
        int i3 = (int) ((((i / i2) + this.mCompletedStageCount) * 100.0f) / this.mTotalStageCount);
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.onProgressUpdated(iAirohaFotaStage.getClass().getSimpleName(), this.mCompletedStageCount, this.mTotalStageCount, i, i2, i3);
            }
        }
    }

    public void notifyAppListenerStatus(String str) {
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.notifyStatus(str);
            }
        }
    }

    public void notifyAppListenerUnexpectedlyDisconnected() {
    }

    public void notifyBatteryLevelLow() {
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.notifyBatterLevelLow();
            }
        }
    }

    public void notifyBatteryStatus(byte b2, int i) {
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.onBatteryStatusReceived(b2, i);
            }
        }
    }

    public void notifyDualAction(DualActionEnum dualActionEnum) {
        this.mAirohaLink.logToFile(K, "notifyDualAction: " + dualActionEnum);
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.onAvailableDualActionUpdated(dualActionEnum);
            }
        }
    }

    public void notifyModelName(String str) {
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.onModelNameReceived(str);
            }
        }
    }

    public void notifySingleAction(SingleActionEnum singleActionEnum) {
        this.mAirohaLink.logToFile(K, "notifySingleAction: " + singleActionEnum);
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.onAvailableSingleActionUpdated(singleActionEnum);
            }
        }
    }

    public void queryAfterConnected() {
    }

    public void queryDualFotaInfo() {
        this.y = false;
        this.mAirohaLink.logToFile(K, "queryDualFotaInfo");
        renewStageQueue();
        RacePacket.setIsFotaStarted(false);
        this.mStagesQueue.offer(new FotaStage_00_CheckAgentChannel(this));
        this.mStagesQueue.offer(new FotaStageTwsQueryPartition(this));
        this.mStagesQueue.offer(new FotaStage_00_GetAgentClientVersion(this, (byte) 0));
        this.mStagesQueue.offer(new FotaStage_00_GetAgentClientVersion(this, (byte) 1));
        this.mStagesQueue.offer(new FotaStage_00_TwsGetBatery(this, (byte) 0));
        this.mStagesQueue.offer(new FotaStage_00_TwsGetBatery(this, (byte) 1));
        this.mStagesQueue.offer(new FotaStage_07_GetModelName(this));
        this.mStagesQueue.offer(new FotaStage_00_TwsQueryState(this));
        startPollStagetQueue();
    }

    public void querySingleFotaInfo() {
        this.y = false;
        this.mAirohaLink.logToFile(K, "querySingleFotaInfo");
        renewStageQueue();
        RacePacket.setIsFotaStarted(false);
        this.mStagesQueue.offer(new FotaStage_00_InquiryFota(this));
        this.mStagesQueue.offer(new FotaStage_00_TwsGetBatery(this, (byte) 0));
        this.mStagesQueue.offer(new FotaStage_00_GetAgentClientVersion(this, (byte) 0));
        this.mStagesQueue.offer(new FotaStage_07_GetModelName(this));
        this.mStagesQueue.offer(new FotaStage_00_QueryState(this));
        startPollStagetQueue();
    }

    public void registerListener(String str, OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener) {
        this.j.put(str, onAirohaFotaStatusClientAppListener);
    }

    public void renewStageQueue() {
        Queue<IAirohaFotaStage> queue = this.mStagesQueue;
        if (queue != null) {
            queue.clear();
            this.mCompletedStageCount = 0;
        }
        this.mStagesQueue = new ConcurrentLinkedQueue();
    }

    public void retryAction() {
        this.mAirohaLink.logToFile(K, "retryAction()");
        if (!this.mAirohaLink.isConnected()) {
            this.mAirohaLink.logToFile(K, "disconnected");
            return;
        }
        Queue<IAirohaFotaStage> queue = this.mStagesQueue;
        if (queue == null || queue.isEmpty()) {
            this.mAirohaLink.logToFile(K, "stage queue is empty");
            return;
        }
        synchronized (this.mStagesQueue) {
            if (this.mCurrentStage == null) {
                this.mCurrentStage = this.mStagesQueue.poll();
            }
            if (this.mCurrentStage.isRetryUpToLimit()) {
                notifyAppListenerError(this.mCurrentStage.getFotaStageIndex(), this.mCurrentStage.getErrorCode(), this.mCurrentStage.getErrorMsg());
                A((byte) 2);
            } else {
                this.mCurrentStage.prePoolCmdQueue();
            }
        }
    }

    public void setAgentClientFotaState(byte[] bArr, byte[] bArr2) {
        String strByte2HexStr = Converter.byte2HexStr(bArr);
        this.mAirohaLink.logToFile(K, "RACE_FOTA_DUAL_DEVICES_QUERY_STATE agent state: " + strByte2HexStr);
        y((byte) 0, strByte2HexStr);
        String strByte2HexStr2 = Converter.byte2HexStr(bArr2);
        this.mAirohaLink.logToFile(K, "RACE_FOTA_DUAL_DEVICES_QUERY_STATE partner state: " + strByte2HexStr2);
        y((byte) 1, strByte2HexStr2);
        this.mAgentFotaState = ((bArr[1] & 255) << 8) | (bArr[0] & 255);
        this.mPartnerFotaState = (bArr2[0] & 255) | ((bArr2[1] & 255) << 8);
        handleTwsQueriedStates();
    }

    public void setAgentIsRight(boolean z) {
        this.A = z;
        notifyAgentIsRight(z);
    }

    public void setAgentVersion(byte[] bArr) {
        this.C = Converter.hexToAsciiString(bArr);
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.onVersionReceived((byte) 0, this.C);
            }
        }
    }

    public void setAwsPeerDst(Dst dst) {
        this.E = dst;
    }

    public void setClientVersion(byte[] bArr) {
        this.D = Converter.hexToAsciiString(bArr);
        for (OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener : this.j.values()) {
            if (onAirohaFotaStatusClientAppListener != null) {
                onAirohaFotaStatusClientAppListener.onVersionReceived((byte) 1, this.D);
            }
        }
    }

    public void setFlashOperationAllowed(boolean z) {
        this.mIsFlashOperationAllowed = z;
    }

    public void setFotaPartitionLength(int i) {
        this.f = i;
    }

    public void setFotaPartitionStartAddress(int i) {
        this.e = i;
    }

    public void setFotaStagePrePollSize(int i) {
        FotaStage.setPrePollSize(i);
    }

    public void setFotaStorageType(byte b2) {
        this.g = b2;
    }

    public void setHistoryState(byte[] bArr) {
        this.mAirohaLink.logToFile(K, "setHistoryState");
        String strByte2HexStr = Converter.byte2HexStr(bArr);
        this.mAirohaLink.logToFile(K, "RACE_FOTA_QUERY_STATE resp state: " + strByte2HexStr);
        y((byte) 0, strByte2HexStr);
        this.mHistoryState = ((bArr[1] & 255) << 8) | (bArr[0] & 255);
        handleQueriedStates();
    }

    public void setLongPacketCmdCount(int i) {
        this.t = i;
    }

    public void setLongPacketCmdDelay(int i) {
        FotaStage.setDelayPollTime(i);
    }

    public void setPartitionId(byte b2) {
        this.h = b2;
    }

    public void startDualFota(String str, String str2, FotaDualSettings fotaDualSettings) throws IllegalArgumentException {
        this.y = false;
        this.mAirohaLink.logToFile(K, "startDualFota Ver:1.3.1.1225.2");
        this.mAirohaLink.logToFile(K, "agentFilePath:" + str);
        this.mIsTws = true;
        this.mFotaDualSettings = fotaDualSettings;
        this.mBatteryThrd = fotaDualSettings.batteryThreshold;
        FotaStage.setDelayPollTime(fotaDualSettings.programInterval);
        FotaStage.setPrePollSize(this.mFotaDualSettings.programSlidingWindow);
        if (str == null) {
            throw new IllegalArgumentException("file path null");
        }
        this.mAirohaLink.logToFile(K, "fota bin: " + str);
        try {
            this.a = null;
            this.b = null;
            this.c = null;
            if (str2 == null) {
                this.a = new FileInputStream(new File(str));
            } else {
                this.mAirohaLink.logToFile(K, "partnerFilePath:" + str2);
                this.b = new FileInputStream(new File(str));
                this.c = new FileInputStream(new File(str2));
            }
            startTwsResumableEraseFotaV2Storage();
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            notifyAppListenerError(FotaStageEnum.None, ErrorEnum.FOTA_BIN_FILE_NOT_FOUND);
        }
    }

    public void startLongPacketTimer() {
        Log.d(K, "startLongPacketTimer()");
        stopLongPacketTimer();
        e eVar = new e();
        this.o = eVar;
        eVar.start();
    }

    public void startPollStagetQueue() {
        this.mTotalStageCount = this.mStagesQueue.size();
        this.mCompletedStageCount = 0;
        IAirohaFotaStage iAirohaFotaStagePoll = this.mStagesQueue.poll();
        this.mCurrentStage = iAirohaFotaStagePoll;
        iAirohaFotaStagePoll.start();
    }

    public void startRespTimer() {
        startRespTimer(this.q);
    }

    public void startResumableEraseProgramFotaV2Storage() {
        this.y = false;
        this.mAirohaLink.logToFile(K, "startResumableEraseProgramFotaV2Storage Ver:1.3.1.1225.2");
        renewStageQueue();
        this.mStagesQueue.offer(new FotaStage_00_Start(this, false));
        FotaStage_00_QueryState fotaStage_00_QueryState = new FotaStage_00_QueryState(this);
        this.mStagesQueue.offer(fotaStage_00_QueryState);
        this.mStagesQueue.offer(new FotaStage_00_TwsGetBatery(this, (byte) 0));
        this.mStagesQueue.offer(new FotaStage_01_StartTranscation(this));
        FotaStage_13_GetPartitionEraseStatusStorage fotaStage_13_GetPartitionEraseStatusStorage = new FotaStage_13_GetPartitionEraseStatusStorage(this);
        FotaStage_14_ComparePartitionV2Storage fotaStage_14_ComparePartitionV2Storage = new FotaStage_14_ComparePartitionV2Storage(this);
        FotaStage_WriteState fotaStage_WriteState = new FotaStage_WriteState(this, 512);
        FotaStage_11_DiffFlashPartitionEraseStorage fotaStage_11_DiffFlashPartitionEraseStorage = new FotaStage_11_DiffFlashPartitionEraseStorage(this);
        FotaStage_WriteState fotaStage_WriteState2 = new FotaStage_WriteState(this, 513);
        FotaStage_WriteState fotaStage_WriteState3 = new FotaStage_WriteState(this, StageEnum.APP_WRITE_START);
        FotaStage_12_ProgramDiffFotaStorage fotaStage_12_ProgramDiffFotaStorage = new FotaStage_12_ProgramDiffFotaStorage(this);
        FotaStage_04_CheckIntegrity fotaStage_04_CheckIntegrity = new FotaStage_04_CheckIntegrity(this);
        FotaStage_WriteState fotaStage_WriteState4 = new FotaStage_WriteState(this, StageEnum.APP_INTEGRITY_CHECK_SUCCESS);
        fotaStage_13_GetPartitionEraseStatusStorage.addStageForPartialSkip(IAirohaFotaStage.SKIP_TYPE.Compare_stages, fotaStage_14_ComparePartitionV2Storage);
        IAirohaFotaStage.SKIP_TYPE skip_type = IAirohaFotaStage.SKIP_TYPE.CompareErase_stages;
        fotaStage_13_GetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type, fotaStage_14_ComparePartitionV2Storage);
        fotaStage_13_GetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type, fotaStage_WriteState);
        fotaStage_13_GetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type, fotaStage_11_DiffFlashPartitionEraseStorage);
        IAirohaFotaStage.SKIP_TYPE skip_type2 = IAirohaFotaStage.SKIP_TYPE.Erase_stages;
        fotaStage_14_ComparePartitionV2Storage.addStageForPartialSkip(skip_type2, fotaStage_WriteState);
        fotaStage_14_ComparePartitionV2Storage.addStageForPartialSkip(skip_type2, fotaStage_11_DiffFlashPartitionEraseStorage);
        IAirohaFotaStage.SKIP_TYPE skip_type3 = IAirohaFotaStage.SKIP_TYPE.All_stages;
        fotaStage_14_ComparePartitionV2Storage.addStageForPartialSkip(skip_type3, fotaStage_WriteState);
        fotaStage_14_ComparePartitionV2Storage.addStageForPartialSkip(skip_type3, fotaStage_11_DiffFlashPartitionEraseStorage);
        fotaStage_14_ComparePartitionV2Storage.addStageForPartialSkip(skip_type3, fotaStage_WriteState2);
        fotaStage_14_ComparePartitionV2Storage.addStageForPartialSkip(skip_type3, fotaStage_WriteState3);
        fotaStage_14_ComparePartitionV2Storage.addStageForPartialSkip(skip_type3, fotaStage_12_ProgramDiffFotaStorage);
        this.mStagesQueue.offer(fotaStage_13_GetPartitionEraseStatusStorage);
        this.mStagesQueue.offer(fotaStage_14_ComparePartitionV2Storage);
        this.mStagesQueue.offer(fotaStage_WriteState);
        this.mStagesQueue.offer(fotaStage_11_DiffFlashPartitionEraseStorage);
        this.mStagesQueue.offer(fotaStage_WriteState2);
        this.mStagesQueue.offer(fotaStage_WriteState3);
        this.mStagesQueue.offer(fotaStage_12_ProgramDiffFotaStorage);
        this.mStagesQueue.offer(fotaStage_04_CheckIntegrity);
        this.mStagesQueue.offer(fotaStage_WriteState4);
        this.mStagesQueue.offer(fotaStage_00_QueryState);
        startPollStagetQueue();
    }

    public void startSendCancelCmd(byte b2) {
        this.y = false;
        renewStageQueue();
        this.mStagesQueue.offer(new FotaStage_06_Cancel(this, this.mIsTws, b2));
        startPollStagetQueue();
    }

    public void startSingleCommit() {
        this.y = false;
        this.mAirohaLink.logToFile(K, "startSingleCommit");
        this.x = true;
        renewStageQueue();
        this.mStagesQueue.offer(new FotaStage_00_TwsGetBatery(this, (byte) 0));
        this.mStagesQueue.offer(new FotaStage_05_Commit(this));
        this.mTotalStageCount = this.mStagesQueue.size();
        IAirohaFotaStage iAirohaFotaStagePoll = this.mStagesQueue.poll();
        this.mCurrentStage = iAirohaFotaStagePoll;
        iAirohaFotaStagePoll.start();
    }

    public void startSingleFota(String str, FotaSingleSettings fotaSingleSettings) {
        this.y = false;
        this.mAirohaLink.logToFile(K, "startSingleFota Ver:1.3.1.1225.2");
        this.mAirohaLink.logToFile(K, "filePath:" + str);
        this.mIsTws = false;
        this.mFotaSingleSettings = fotaSingleSettings;
        this.mBatteryThrd = fotaSingleSettings.batteryThreshold;
        FotaStage.setDelayPollTime(fotaSingleSettings.programInterval);
        FotaStage.setPrePollSize(fotaSingleSettings.eraseSlidingWindow);
        try {
            this.a = new FileInputStream(new File(str));
            startResumableEraseProgramFotaV2Storage();
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            notifyAppListenerError(FotaStageEnum.None, ErrorEnum.FOTA_BIN_FILE_NOT_FOUND);
        }
    }

    public void startTwsCommit() {
        this.y = false;
        this.mAirohaLink.logToFile(K, "startTwsCommit");
        this.x = true;
        renewStageQueue();
        this.mStagesQueue.offer(new FotaStage_00_TwsGetBatery(this, (byte) 0));
        this.mStagesQueue.offer(new FotaStage_00_TwsGetBatery(this, (byte) 1));
        this.mStagesQueue.offer(new FotaStageTwsCommit(this));
        this.mTotalStageCount = this.mStagesQueue.size();
        IAirohaFotaStage iAirohaFotaStagePoll = this.mStagesQueue.poll();
        this.mCurrentStage = iAirohaFotaStagePoll;
        iAirohaFotaStagePoll.start();
    }

    public void startTwsResumableEraseFotaV2Storage() {
        this.y = false;
        this.mAirohaLink.logToFile(K, "startTwsResumableEraseFotaV2Storage Ver:1.3.1.1225.2");
        renewStageQueue();
        this.mStagesQueue.offer(new FotaStage_00_Start(this, true));
        FotaStage_00_TwsQueryState fotaStage_00_TwsQueryState = new FotaStage_00_TwsQueryState(this);
        this.mStagesQueue.offer(fotaStage_00_TwsQueryState);
        FotaStage_23_TwsGetPartitionEraseStatusStorage fotaStage_23_TwsGetPartitionEraseStatusStorage = new FotaStage_23_TwsGetPartitionEraseStatusStorage(this);
        FotaStage_24_TwsComparePartitionV2Storage fotaStage_24_TwsComparePartitionV2Storage = new FotaStage_24_TwsComparePartitionV2Storage(this);
        FotaStage_01_StartTranscation fotaStage_01_StartTranscation = new FotaStage_01_StartTranscation(this);
        FotaStage_01_TwsStartTranscation fotaStage_01_TwsStartTranscation = new FotaStage_01_TwsStartTranscation(this);
        FotaStage_WriteState fotaStage_WriteState = new FotaStage_WriteState(this, 768);
        FotaStageTwsWriteState fotaStageTwsWriteState = new FotaStageTwsWriteState(this, 768);
        FotaStage_21_TwsDiffFlashPartitionEraseStorage fotaStage_21_TwsDiffFlashPartitionEraseStorage = new FotaStage_21_TwsDiffFlashPartitionEraseStorage(this);
        FotaStage_WriteState fotaStage_WriteState2 = new FotaStage_WriteState(this, 769);
        FotaStageTwsWriteState fotaStageTwsWriteState2 = new FotaStageTwsWriteState(this, 769);
        FotaStage_WriteState fotaStage_WriteState3 = new FotaStage_WriteState(this, StageEnum.APP_TWS_WRITE_START);
        FotaStage_22_TwsProgramDiffFotaStorage fotaStage_22_TwsProgramDiffFotaStorage = new FotaStage_22_TwsProgramDiffFotaStorage(this);
        FotaStage_04_CheckIntegrity fotaStage_04_CheckIntegrity = new FotaStage_04_CheckIntegrity(this);
        FotaStage_WriteState fotaStage_WriteState4 = new FotaStage_WriteState(this, StageEnum.APP_TWS_INTEGRITY_CHECK_SUCCESS);
        IAirohaFotaStage.SKIP_TYPE skip_type = IAirohaFotaStage.SKIP_TYPE.Compare_stages;
        fotaStage_23_TwsGetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type, fotaStage_24_TwsComparePartitionV2Storage);
        fotaStage_23_TwsGetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type, fotaStage_01_StartTranscation);
        fotaStage_23_TwsGetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type, fotaStage_WriteState);
        fotaStage_23_TwsGetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type, fotaStage_WriteState2);
        IAirohaFotaStage.SKIP_TYPE skip_type2 = IAirohaFotaStage.SKIP_TYPE.CompareErase_stages;
        fotaStage_23_TwsGetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type2, fotaStage_24_TwsComparePartitionV2Storage);
        fotaStage_23_TwsGetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type2, fotaStage_01_TwsStartTranscation);
        fotaStage_23_TwsGetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type2, fotaStage_WriteState);
        fotaStage_23_TwsGetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type2, fotaStageTwsWriteState);
        fotaStage_23_TwsGetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type2, fotaStage_21_TwsDiffFlashPartitionEraseStorage);
        fotaStage_23_TwsGetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type2, fotaStage_WriteState2);
        fotaStage_23_TwsGetPartitionEraseStatusStorage.addStageForPartialSkip(skip_type2, fotaStageTwsWriteState2);
        IAirohaFotaStage.SKIP_TYPE skip_type3 = IAirohaFotaStage.SKIP_TYPE.Erase_stages;
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type3, fotaStage_01_TwsStartTranscation);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type3, fotaStage_WriteState);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type3, fotaStageTwsWriteState);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type3, fotaStage_21_TwsDiffFlashPartitionEraseStorage);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type3, fotaStage_WriteState2);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type3, fotaStageTwsWriteState2);
        IAirohaFotaStage.SKIP_TYPE skip_type4 = IAirohaFotaStage.SKIP_TYPE.Client_Erase_stages;
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type4, fotaStage_01_TwsStartTranscation);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type4, fotaStageTwsWriteState);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type4, fotaStageTwsWriteState2);
        IAirohaFotaStage.SKIP_TYPE skip_type5 = IAirohaFotaStage.SKIP_TYPE.All_stages;
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type5, fotaStage_01_TwsStartTranscation);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type5, fotaStage_WriteState);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type5, fotaStageTwsWriteState);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type5, fotaStage_21_TwsDiffFlashPartitionEraseStorage);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type5, fotaStage_WriteState2);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type5, fotaStageTwsWriteState2);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type5, fotaStage_WriteState3);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type5, fotaStage_22_TwsProgramDiffFotaStorage);
        IAirohaFotaStage.SKIP_TYPE skip_type6 = IAirohaFotaStage.SKIP_TYPE.Sinlge_StateUpdate_stages;
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type6, fotaStage_01_StartTranscation);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type6, fotaStage_WriteState);
        fotaStage_24_TwsComparePartitionV2Storage.addStageForPartialSkip(skip_type6, fotaStage_WriteState2);
        this.mStagesQueue.offer(new FotaStage_00_TwsGetBatery(this, (byte) 0));
        this.mStagesQueue.offer(new FotaStage_00_TwsGetBatery(this, (byte) 1));
        this.mStagesQueue.offer(fotaStage_23_TwsGetPartitionEraseStatusStorage);
        this.mStagesQueue.offer(fotaStage_24_TwsComparePartitionV2Storage);
        this.mStagesQueue.offer(fotaStage_01_StartTranscation);
        this.mStagesQueue.offer(fotaStage_01_TwsStartTranscation);
        this.mStagesQueue.offer(fotaStage_WriteState);
        this.mStagesQueue.offer(fotaStageTwsWriteState);
        this.mStagesQueue.offer(fotaStage_21_TwsDiffFlashPartitionEraseStorage);
        this.mStagesQueue.offer(fotaStage_WriteState2);
        this.mStagesQueue.offer(fotaStageTwsWriteState2);
        this.mStagesQueue.offer(fotaStage_WriteState3);
        this.mStagesQueue.offer(fotaStage_22_TwsProgramDiffFotaStorage);
        this.mStagesQueue.offer(fotaStage_04_CheckIntegrity);
        this.mStagesQueue.offer(fotaStage_WriteState4);
        this.mStagesQueue.offer(fotaStage_00_TwsQueryState);
        startPollStagetQueue();
    }

    public void stopLongPacketTimer() {
        e eVar = this.o;
        if (eVar == null || !eVar.isAlive()) {
            return;
        }
        this.mAirohaLink.logToFile(K, "stopLongPacketTimer()");
        this.o.interrupt();
        this.o = null;
    }

    public void unregisterListener(OnAirohaFotaStatusClientAppListener onAirohaFotaStatusClientAppListener) {
        this.j.remove(onAirohaFotaStatusClientAppListener);
    }

    public void z(IAirohaFotaStage.SKIP_TYPE skip_type) {
        synchronized (this.mStagesQueue) {
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            LinkedList<FotaStage> stagesForSkip = this.mCurrentStage.getStagesForSkip(skip_type);
            while (this.mStagesQueue.size() > 0) {
                IAirohaFotaStage iAirohaFotaStagePoll = this.mStagesQueue.poll();
                if (!stagesForSkip.contains(iAirohaFotaStagePoll)) {
                    concurrentLinkedQueue.add(iAirohaFotaStagePoll);
                }
            }
            this.mStagesQueue = concurrentLinkedQueue;
        }
    }

    public void startRespTimer(int i) {
        B();
        this.mAirohaLink.logToFile(K, "startRespTimer");
        Timer timer = new Timer();
        this.l = timer;
        timer.schedule(new f(), i);
    }

    public void notifyAppListenerError(FotaStageEnum fotaStageEnum, ErrorEnum errorEnum) {
        notifyAppListenerError(fotaStageEnum, errorEnum, FotaErrorMsg.findErrorMsg(errorEnum));
    }

    public void startSingleFota(byte[] bArr, FotaSingleSettings fotaSingleSettings) {
        this.y = false;
        this.mAirohaLink.logToFile(K, "startSingleFota Ver:1.3.1.1225.2");
        this.mFotaSingleSettings = fotaSingleSettings;
        this.mBatteryThrd = fotaSingleSettings.batteryThreshold;
        FotaStage.setDelayPollTime(fotaSingleSettings.programInterval);
        FotaStage.setPrePollSize(fotaSingleSettings.eraseSlidingWindow);
        if (bArr != null) {
            this.a = new ByteArrayInputStream(bArr);
            startResumableEraseProgramFotaV2Storage();
            return;
        }
        throw new IllegalArgumentException("file null");
    }

    public void startDualFota(byte[] bArr, byte[] bArr2, FotaDualSettings fotaDualSettings) throws IllegalArgumentException {
        this.y = false;
        this.mAirohaLink.logToFile(K, "startDualFota Ver:1.3.1.1225.2");
        this.mFotaDualSettings = fotaDualSettings;
        this.mBatteryThrd = fotaDualSettings.batteryThreshold;
        FotaStage.setDelayPollTime(fotaDualSettings.programInterval);
        FotaStage.setPrePollSize(this.mFotaDualSettings.programSlidingWindow);
        if (bArr != null) {
            this.a = new ByteArrayInputStream(bArr);
            startTwsResumableEraseFotaV2Storage();
            return;
        }
        throw new IllegalArgumentException("file null");
    }

    public AirohaRaceOtaMgr(Context context) {
        this(new AirohaLink(context));
    }
}
