package com.airoha.android.lib.logdump;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.logdump.airdump.AirDumpLogger;
import com.airoha.android.lib.logdump.airdump.StageAirDump;
import com.airoha.android.lib.logdump.ancdump.StageAncDump;
import com.airoha.android.lib.logdump.minidump.StageDump;
import com.airoha.android.lib.logdump.minidump.StageGetBootReason;
import com.airoha.android.lib.logdump.minidump.StageGetDumpAddress;
import com.airoha.android.lib.logdump.offlinedump.StageAssert;
import com.airoha.android.lib.logdump.offlinedump.StageGetOfflineDumpAddress;
import com.airoha.android.lib.logdump.onlinedump.StageContinueQueryModuleInfo;
import com.airoha.android.lib.logdump.onlinedump.StageGetBuildInfo;
import com.airoha.android.lib.logdump.onlinedump.StageOnlineDump;
import com.airoha.android.lib.logdump.onlinedump.StageQueryModuleInfo;
import com.airoha.android.lib.logdump.onlinedump.StageSetModuleInfo;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.transport.PacketParser.OnRacePacketListener;
import com.airoha.android.lib.util.Converter;
import com.airoha.android.lib.util.logger.LogEvent;
import io.netty.util.internal.StringUtil;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public class LogDumpMgr extends AirohaMmiMgr {
    private static final String u = "LogDumpMgr";
    private OnStatusUiListener g;
    private AirDumpLogger h;
    private StringBuilder i;
    private int j;
    private int k;
    private OnStatusUiListener l;
    private Handler m;
    public AirorhaLinkDbgLogRaw n;
    private int o;
    private int p;
    private OnRacePacketListener q;
    private OnRacePacketListener r;
    private OnRacePacketListener s;
    private OnRacePacketListener t;
    public String timeStamp;

    public interface OnStatusUiListener {
        void OnUpdateLog(String str);

        void OnUpdateLogCount();

        void OnUpdateModuleInfo(byte[] bArr, boolean z);
    }

    public class a implements OnRacePacketListener {
        public a() {
        }

        @Override // com.airoha.android.lib.transport.PacketParser.OnRacePacketListener
        public void handleRespOrInd(int i, byte[] bArr, int i2) {
            Log.d(LogDumpMgr.u, "packet: " + Converter.byte2HexStr(bArr));
            if (bArr[0] == 5 && bArr[1] == 93 && bArr[2] == -84) {
                int iBytesToShort = Converter.BytesToShort(bArr[3], bArr[2]) - 2;
                byte[] bArr2 = new byte[iBytesToShort];
                System.arraycopy(bArr, 6, bArr2, 0, iBytesToShort);
                int i3 = 0;
                for (int i4 = 0; i4 < iBytesToShort; i4 += 2) {
                    i3++;
                    LogDumpMgr.this.i.append((int) Converter.BytesToShort(bArr2[i4 + 1], bArr2[i4]));
                    LogDumpMgr.this.i.append(StringUtil.SPACE);
                    if (i3 == 17) {
                        LogEvent logEvent = new LogEvent();
                        logEvent.logType = 2;
                        logEvent.logStr = LogDumpMgr.this.i.toString().trim() + "\n";
                        LogDumpMgr.this.g.OnUpdateLog(logEvent.logStr);
                        LogDumpMgr.this.h.addEventToQueue(logEvent);
                        LogDumpMgr.this.i.setLength(0);
                        i3 = 0;
                    }
                }
            }
        }
    }

    public class b implements OnRacePacketListener {
        public b() {
        }

        @Override // com.airoha.android.lib.transport.PacketParser.OnRacePacketListener
        public void handleRespOrInd(int i, byte[] bArr, int i2) {
            if (i == 7680) {
                byte[] bArr2 = new byte[4];
                System.arraycopy(bArr, 7, bArr2, 0, 4);
                int iBytesToInt32 = Converter.bytesToInt32(bArr2);
                LogDumpMgr.this.l.OnUpdateLog("BOOT_REASON: " + Integer.toString(iBytesToInt32));
                Message messageObtain = Message.obtain();
                messageObtain.what = AirohaRaceOtaMgr.BOOT_REASON;
                LogDumpMgr.this.m.sendMessage(messageObtain);
            }
            if (i == 7682) {
                byte[] bArr3 = new byte[4];
                byte[] bArr4 = new byte[4];
                System.arraycopy(bArr, 7, bArr3, 0, 4);
                System.arraycopy(bArr, 11, bArr4, 0, 3);
                int iBytesToInt33 = Converter.bytesToInt32(bArr3);
                int iBytesToInt34 = Converter.bytesToInt32(bArr4);
                LogDumpMgr.this.l.OnUpdateLog("Length: " + Integer.toString(iBytesToInt33) + " Address: " + Integer.toString(iBytesToInt34));
                LogDumpMgr.this.k = iBytesToInt33 / 256;
                LogDumpMgr logDumpMgr = LogDumpMgr.this;
                logDumpMgr.startMiniDump(iBytesToInt34, logDumpMgr.k);
            }
            if (i == 1027) {
                LogDumpMgr.this.n.addRawBytesToQueue(bArr);
                LogDumpMgr.r(LogDumpMgr.this);
                if (LogDumpMgr.this.j == LogDumpMgr.this.k) {
                    LogDumpMgr.this.n.stop();
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = AirohaRaceOtaMgr.DUMP_COMPLETE;
                    LogDumpMgr.this.m.sendMessage(messageObtain2);
                }
            }
        }
    }

    public class c implements OnRacePacketListener {
        public c() {
        }

        @Override // com.airoha.android.lib.transport.PacketParser.OnRacePacketListener
        public void handleRespOrInd(int i, byte[] bArr, int i2) {
            if (i == 7686) {
                byte[] bArr2 = new byte[4];
                byte[] bArr3 = new byte[4];
                System.arraycopy(bArr, 7, bArr2, 0, 4);
                System.arraycopy(bArr, 11, bArr3, 0, 3);
                LogDumpMgr.this.o = Converter.bytesToInt32(bArr2);
                LogDumpMgr.this.p = Converter.bytesToInt32(bArr3);
                Message messageObtain = Message.obtain();
                messageObtain.what = AirohaRaceOtaMgr.DUMP_INFO;
                messageObtain.obj = "Length: " + Integer.toString(LogDumpMgr.this.o) + " Address: " + Integer.toString(LogDumpMgr.this.p);
                LogDumpMgr.this.m.sendMessage(messageObtain);
                LogDumpMgr logDumpMgr = LogDumpMgr.this;
                logDumpMgr.k = logDumpMgr.o / 256;
            }
            if (i == 1027) {
                LogDumpMgr.this.n.addRawBytesToQueue(bArr);
                LogDumpMgr.r(LogDumpMgr.this);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = AirohaRaceOtaMgr.DUMP_INFO;
                messageObtain2.obj = Converter.byte2HexStr(bArr);
                LogDumpMgr.this.m.sendMessage(messageObtain2);
                if (LogDumpMgr.this.j == LogDumpMgr.this.k) {
                    Message messageObtain3 = Message.obtain();
                    messageObtain3.what = AirohaRaceOtaMgr.DUMP_COMPLETE;
                    LogDumpMgr.this.m.sendMessage(messageObtain3);
                    LogDumpMgr.this.n.stop();
                }
            }
        }
    }

    public class d implements OnRacePacketListener {
        public d() {
        }

        @Override // com.airoha.android.lib.transport.PacketParser.OnRacePacketListener
        public void handleRespOrInd(int i, byte[] bArr, int i2) {
            Log.d(LogDumpMgr.u, "packet: " + Converter.byte2HexStr(bArr));
            if (i == 3594 && i2 == 93) {
                LogDumpMgr.this.n.addRawBytesToQueue(bArr);
            }
        }
    }

    public LogDumpMgr(AirohaLink airohaLink) {
        super(airohaLink);
        this.timeStamp = "";
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.n = null;
        this.o = 0;
        this.p = 0;
        this.q = new a();
        this.r = new b();
        this.s = new c();
        this.t = new d();
    }

    public static /* synthetic */ int r(LogDumpMgr logDumpMgr) {
        int i = logDumpMgr.j;
        logDumpMgr.j = i + 1;
        return i;
    }

    public void getBuildInfo() {
        renewStageQueue();
        this.mStagesQueue.offer(new StageGetBuildInfo(this));
        startPollStagetQueue();
    }

    public void getMimiDumpAddress() {
        this.j = 0;
        renewStageQueue();
        this.mStagesQueue.offer(new StageGetDumpAddress(this));
        startPollStagetQueue();
    }

    public void getOfflineDumpAddress() {
        this.j = 0;
        renewStageQueue();
        this.mStagesQueue.offer(new StageGetOfflineDumpAddress(this));
        startPollStagetQueue();
    }

    public void getReason(Handler handler) {
        this.m = handler;
        renewStageQueue();
        this.mStagesQueue.offer(new StageGetBootReason(this));
        startPollStagetQueue();
    }

    public void makeAssert() {
        renewStageQueue();
        this.mStagesQueue.offer(new StageAssert(this));
        startPollStagetQueue();
    }

    public void queryModuleInfo(OnStatusUiListener onStatusUiListener) {
        renewStageQueue();
        this.mStagesQueue.offer(new StageQueryModuleInfo(this, onStatusUiListener));
        startPollStagetQueue();
    }

    public void queryModuleInfoContinue(OnStatusUiListener onStatusUiListener) {
        this.mStagesQueue.offer(new StageContinueQueryModuleInfo(this, onStatusUiListener));
    }

    public void registerMiniDumpListener(OnStatusUiListener onStatusUiListener) {
        this.mAirohaLink.registerOnRacePacketListener(u, this.r);
        this.l = onStatusUiListener;
    }

    public void registerOfflineDumpListener(Handler handler) {
        this.mAirohaLink.registerOnRacePacketListener(u, this.s);
        this.m = handler;
    }

    public void setModuleInfo(byte b2, byte b3, byte b4, byte b5) {
        renewStageQueue();
        this.mStagesQueue.offer(new StageSetModuleInfo(this, b2, b3, b4, b5));
        startPollStagetQueue();
    }

    public void startAirDump(OnStatusUiListener onStatusUiListener) {
        this.mAirohaLink.registerOnRacePacketListener(u, this.q);
        this.g = onStatusUiListener;
        this.h = new AirDumpLogger();
        renewStageQueue();
        StageAirDump stageAirDump = new StageAirDump(this);
        stageAirDump.payload[0] = 1;
        this.mStagesQueue.offer(stageAirDump);
        this.h.startLogger("AirDump");
        this.i = new StringBuilder();
        startPollStagetQueue();
    }

    public void startAncDump(OnStatusUiListener onStatusUiListener, byte b2) {
        this.mAirohaLink.registerOnRacePacketListener(u, this.t);
        AirorhaLinkDbgLogRaw airorhaLinkDbgLogRaw = new AirorhaLinkDbgLogRaw("AncDump", "anc_dump");
        this.n = airorhaLinkDbgLogRaw;
        airorhaLinkDbgLogRaw.changeParser(AbstractLogParser.Type.AncDump);
        this.n.setListener(onStatusUiListener);
        this.n.startLogger();
        renewStageQueue();
        StageAncDump stageAncDump = new StageAncDump(this);
        byte[] bArr = stageAncDump.payload;
        bArr[0] = 10;
        bArr[1] = 1;
        bArr[2] = b2;
        this.mStagesQueue.offer(stageAncDump);
        startPollStagetQueue();
    }

    public void startMiniDump(int i, int i2) {
        if (i2 == 0) {
            Message messageObtain = Message.obtain();
            messageObtain.what = AirohaRaceOtaMgr.DUMP_COMPLETE;
            this.m.sendMessage(messageObtain);
            return;
        }
        this.timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        AirorhaLinkDbgLogRaw airorhaLinkDbgLogRaw = new AirorhaLinkDbgLogRaw("MiniDump", "mini_dump_" + this.timeStamp);
        this.n = airorhaLinkDbgLogRaw;
        airorhaLinkDbgLogRaw.changeParser(AbstractLogParser.Type.Mimidump);
        this.n.setListener(this.l);
        this.n.startLogger();
        renewStageQueue();
        for (int i3 = 0; i3 < i2; i3++) {
            StageDump stageDump = new StageDump(this);
            byte[] bArr = stageDump.payload;
            bArr[0] = 0;
            bArr[1] = 1;
            byte[] bArrIntToByteArray = Converter.intToByteArray(i);
            byte[] bArr2 = stageDump.payload;
            bArr2[2] = bArrIntToByteArray[0];
            bArr2[3] = bArrIntToByteArray[1];
            bArr2[4] = bArrIntToByteArray[2];
            bArr2[5] = bArrIntToByteArray[3];
            this.mStagesQueue.offer(stageDump);
            i += 256;
        }
        startPollStagetQueue();
    }

    public void startOfflineDump() {
        if (this.k == 0) {
            Message messageObtain = Message.obtain();
            messageObtain.what = AirohaRaceOtaMgr.DUMP_COMPLETE;
            this.m.sendMessage(messageObtain);
            return;
        }
        this.timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        AirorhaLinkDbgLogRaw airorhaLinkDbgLogRaw = new AirorhaLinkDbgLogRaw("OfflineLog", "offline_log_" + this.timeStamp + ".bin");
        this.n = airorhaLinkDbgLogRaw;
        airorhaLinkDbgLogRaw.changeParser(AbstractLogParser.Type.Offlinedump);
        this.n.startLogger();
        renewStageQueue();
        for (int i = 0; i < this.k; i++) {
            StageDump stageDump = new StageDump(this);
            byte[] bArr = stageDump.payload;
            bArr[0] = 0;
            bArr[1] = 1;
            byte[] bArrIntToByteArray = Converter.intToByteArray(this.p);
            byte[] bArr2 = stageDump.payload;
            bArr2[2] = bArrIntToByteArray[0];
            bArr2[3] = bArrIntToByteArray[1];
            bArr2[4] = bArrIntToByteArray[2];
            bArr2[5] = bArrIntToByteArray[3];
            this.mStagesQueue.offer(stageDump);
            this.p += 256;
        }
        startPollStagetQueue();
    }

    public void startOnlineDump() {
        renewStageQueue();
        StageOnlineDump stageOnlineDump = new StageOnlineDump(this);
        stageOnlineDump.payload[0] = 1;
        this.mStagesQueue.offer(stageOnlineDump);
        startPollStagetQueue();
    }

    public void stopAirDump() {
        renewStageQueue();
        StageAirDump stageAirDump = new StageAirDump(this);
        stageAirDump.payload[0] = 0;
        this.mStagesQueue.offer(stageAirDump);
        startPollStagetQueue();
        this.h.stop();
    }

    public void stopAncDump(byte b2) {
        renewStageQueue();
        StageAncDump stageAncDump = new StageAncDump(this);
        byte[] bArr = stageAncDump.payload;
        bArr[0] = 10;
        bArr[1] = 0;
        bArr[2] = b2;
        this.mStagesQueue.offer(stageAncDump);
        startPollStagetQueue();
        this.n.stop();
    }

    public void stopOnlineDump() {
        renewStageQueue();
        StageOnlineDump stageOnlineDump = new StageOnlineDump(this);
        stageOnlineDump.payload[0] = 0;
        this.mStagesQueue.offer(stageOnlineDump);
        startPollStagetQueue();
    }
}
