package com.airoha.android.lib.peq;

import com.airoha.android.lib.fota.stage.for153xMCE.Dst;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.transport.PacketParser.OnRacePacketListener;
import com.airoha.android.lib.util.Converter;
import com.airoha.lib153xPeq.Ab153xPeq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaPeqMgr {
    private static final String r = "AirohaPeqMgr";
    public static final /* synthetic */ boolean s = false;
    private byte[] a;
    private AirohaLink d;
    private Map<Rate, Double> e;
    private Map<Rate, CoefParamStruct> f;
    private OnPeqStatusUiListener g;
    private byte[] h;
    private byte[] i;
    private Action j;
    private Queue<IPeqStage> k;
    private IPeqStage l;
    private byte[] m;
    private byte[] n;
    private Dst o;
    private final byte[] b = new byte[2];
    private final byte[] c = new byte[2];
    public byte mPEQIdx = 0;
    private int p = 0;
    private OnRacePacketListener q = new a();

    public enum Action {
        RealTimeUpdate,
        SaveCoef,
        SaveUiData,
        LoadUiData,
        GetPEQGroupNum,
        GetPEQGroupIdx,
        SetPEQGroupIdx
    }

    public interface OnPeqStatusUiListener {
        void OnActionCompleted(Action action);

        void OnActionError(Action action);

        void OnLoadPeqUiData(PeqUiDataStru peqUiDataStru);
    }

    public enum TargetDeviceEnum {
        AGENT,
        CLIENT,
        DUAL
    }

    public class a implements OnRacePacketListener {
        public a() {
        }

        @Override // com.airoha.android.lib.transport.PacketParser.OnRacePacketListener
        public void handleRespOrInd(int i, byte[] bArr, int i2) {
            if (AirohaPeqMgr.this.l == null) {
                return;
            }
            AirohaPeqMgr.this.l.handleRespOrInd(i, bArr, i2);
            if (AirohaPeqMgr.this.l.isError()) {
                AirohaPeqMgr.this.d.logToFile(AirohaPeqMgr.r, "mCurrentStage(" + AirohaPeqMgr.this.l.getClass().getSimpleName() + ") isError!");
                AirohaPeqMgr.this.g.OnActionError(AirohaPeqMgr.this.j);
            }
            if (AirohaPeqMgr.this.l.isCompleted()) {
                AirohaPeqMgr airohaPeqMgr = AirohaPeqMgr.this;
                airohaPeqMgr.l = (IPeqStage) airohaPeqMgr.k.poll();
                if (AirohaPeqMgr.this.l != null) {
                    AirohaPeqMgr.this.l.sendCmd();
                } else {
                    AirohaPeqMgr.this.g.OnActionCompleted(AirohaPeqMgr.this.j);
                }
            }
        }
    }

    public AirohaPeqMgr(AirohaLink airohaLink, OnPeqStatusUiListener onPeqStatusUiListener) {
        q();
        this.g = onPeqStatusUiListener;
        this.d = airohaLink;
        airohaLink.registerOnRacePacketListener(r, this.q);
    }

    private boolean g(PeqUiDataStru peqUiDataStru) {
        this.f = new HashMap();
        double masterGain = peqUiDataStru.getMasterGain();
        Iterator<Rate> it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            Rate next = it2.next();
            List<PeqBandInfo> peqBandInfoList = peqUiDataStru.getPeqBandInfoList();
            ArrayList<PeqBandInfo> arrayList = new ArrayList();
            for (PeqBandInfo peqBandInfo : peqBandInfoList) {
                if (peqBandInfo.isEnable()) {
                    arrayList.add(peqBandInfo);
                }
            }
            Ab153xPeq.setParam(0, this.e.get(next).doubleValue(), arrayList.size(), 1, 0, 0);
            int i = 0;
            for (PeqBandInfo peqBandInfo2 : arrayList) {
                if (peqBandInfo2.isEnable()) {
                    double freq = peqBandInfo2.getFreq();
                    double gain = peqBandInfo2.getGain();
                    double bw = peqBandInfo2.getBw();
                    this.d.logToFile(r, "setPeqPoint freq: " + freq);
                    this.d.logToFile(r, "setPeqPoint gain: " + gain);
                    this.d.logToFile(r, "setPeqPoint bw: " + bw);
                    Ab153xPeq.setPeqPoint(0, i, freq, gain, bw);
                    i++;
                }
                it2 = it2;
            }
            Iterator<Rate> it3 = it2;
            if (i > 0) {
                this.d.logToFile(r, "sampling rate: " + next.toString());
                int iGenerateCofe = Ab153xPeq.generateCofe(0);
                this.d.logToFile(r, "generateCofe returnCode: " + iGenerateCofe);
                if (iGenerateCofe != 0) {
                    return false;
                }
                int iChangeRescaleCofe = Ab153xPeq.changeRescaleCofe(0, masterGain);
                this.d.logToFile(r, "changeRescaleCofe returnCode: " + iChangeRescaleCofe);
                short cofeCount = (short) Ab153xPeq.getCofeCount(0);
                this.d.logToFile(r, "getCofeCount: " + ((int) cofeCount));
                short[] cofeParam = Ab153xPeq.getCofeParam(0);
                this.d.logToFile(r, "getCofeParam(shorts): " + Converter.shortArrToString(cofeParam));
                byte[] bArrShortArrToBytes = Converter.shortArrToBytes(cofeParam);
                this.d.logToFile(r, "getCofeParam(bytes): " + Converter.byte2HexStr(bArrShortArrToBytes));
                this.f.put(next, new CoefParamStruct(next.getValue(), (short) cofeCount, bArrShortArrToBytes));
            }
            it2 = it3;
        }
        return true;
    }

    private byte[] h() {
        ArrayList arrayList = new ArrayList();
        byte[] bArr = {0, 0};
        for (byte b : Converter.shortToBytes((short) this.f.size())) {
            arrayList.add(Byte.valueOf(b));
        }
        for (int i = 0; i < 2; i++) {
            arrayList.add(Byte.valueOf(bArr[i]));
        }
        Iterator<CoefParamStruct> it2 = this.f.values().iterator();
        while (it2.hasNext()) {
            for (byte b2 : it2.next().getRaw()) {
                arrayList.add(Byte.valueOf(b2));
            }
        }
        byte[] bArr2 = new byte[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bArr2[i2] = ((Byte) arrayList.get(i2)).byteValue();
        }
        this.d.logToFile(r, "genSaveCoefPayload payload: " + Converter.byte2HexStr(bArr2));
        return bArr2;
    }

    private byte[] i(PeqUiDataStru peqUiDataStru) {
        ArrayList arrayList = new ArrayList();
        for (byte b : peqUiDataStru.getRaw()) {
            arrayList.add(Byte.valueOf(b));
        }
        byte[] bArr = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            bArr[i] = ((Byte) arrayList.get(i)).byteValue();
        }
        this.d.logToFile(r, "genSaveUiDataPayload payload: " + Converter.byte2HexStr(bArr));
        return bArr;
    }

    private void q() {
        Hashtable hashtable = new Hashtable();
        this.e = hashtable;
        hashtable.put(Rate.R441, Double.valueOf(44100.0d));
        this.e.put(Rate.R48, Double.valueOf(48000.0d));
        this.e.put(Rate.R882, Double.valueOf(88200.0d));
        this.e.put(Rate.R96, Double.valueOf(96000.0d));
    }

    public Dst getAwsPeerDst() {
        return this.o;
    }

    public int getPEQGrpNum() {
        return this.p;
    }

    public byte getPEQIdx() {
        return this.mPEQIdx;
    }

    public int getPeqDefaultGroupNum() throws IllegalArgumentException {
        byte[] writeBackPeqSubsetContent = getWriteBackPeqSubsetContent();
        if (writeBackPeqSubsetContent.length == 0) {
            return 0;
        }
        int iBytesToU16 = Converter.BytesToU16(writeBackPeqSubsetContent[1], writeBackPeqSubsetContent[0]);
        int i = 0;
        int i2 = 2;
        for (int i3 = 0; i3 < iBytesToU16; i3++) {
            int iBytesToU17 = Converter.BytesToU16(writeBackPeqSubsetContent[i2 + 1], writeBackPeqSubsetContent[i2]);
            int i4 = i2 + 4;
            String strByte2HexStrWithoutSeperator = Converter.byte2HexStrWithoutSeperator(new byte[]{writeBackPeqSubsetContent[i4 + 1], writeBackPeqSubsetContent[i4]});
            if (!strByte2HexStrWithoutSeperator.equals("F27C") && !strByte2HexStrWithoutSeperator.equals("F27D") && !strByte2HexStrWithoutSeperator.equals("F27E") && !strByte2HexStrWithoutSeperator.equals("F27F")) {
                i++;
            }
            i2 += (iBytesToU17 * 4) + 2;
        }
        return i;
    }

    public void getPeqGroupIdx() throws IllegalArgumentException {
        this.d.logToFile(r, "getPeqGroupIdx");
        this.j = Action.GetPEQGroupIdx;
        Queue<IPeqStage> queue = this.k;
        if (queue != null) {
            queue.clear();
        }
        LinkedList linkedList = new LinkedList();
        this.k = linkedList;
        linkedList.offer(new PeqStageGetPeqGrpIdx(this));
        IPeqStage iPeqStagePoll = this.k.poll();
        this.l = iPeqStagePoll;
        iPeqStagePoll.sendCmd();
    }

    public void getPeqGroupNum() throws IllegalArgumentException {
        this.j = Action.GetPEQGroupNum;
        Queue<IPeqStage> queue = this.k;
        if (queue != null) {
            queue.clear();
        }
        LinkedList linkedList = new LinkedList();
        this.k = linkedList;
        linkedList.offer(new PeqStageReadAudiPath(this));
        this.k.offer(new PeqStageReadPeqSubset(this));
        IPeqStage iPeqStagePoll = this.k.poll();
        this.l = iPeqStagePoll;
        iPeqStagePoll.sendCmd();
    }

    public byte[] getWriteBackPeqSubsetContent() {
        return this.m;
    }

    public boolean isPeqCoefReady() {
        return this.f != null;
    }

    public AirohaLink j() {
        return this.d;
    }

    public byte[] k() {
        return this.a;
    }

    public byte[] l() {
        return this.n;
    }

    public void loadPeqUiData(int i, TargetDeviceEnum targetDeviceEnum) throws IllegalArgumentException {
        if (i < 0 || i > 4) {
            throw new IllegalArgumentException("input 1~4");
        }
        this.j = Action.LoadUiData;
        int i2 = (i + 61184) - 1;
        byte[] bArr = this.c;
        bArr[0] = (byte) (i2 & 255);
        bArr[1] = (byte) ((i2 >> 8) & 255);
        Queue<IPeqStage> queue = this.k;
        if (queue != null) {
            queue.clear();
        }
        LinkedList linkedList = new LinkedList();
        this.k = linkedList;
        if (targetDeviceEnum != TargetDeviceEnum.CLIENT) {
            linkedList.offer(new PeqStageLoadUiData(this, this.c));
        } else {
            linkedList.offer(new PeqStageLoadUiDataRelay(this, this.c));
        }
        IPeqStage iPeqStagePoll = this.k.poll();
        this.l = iPeqStagePoll;
        iPeqStagePoll.sendCmd();
    }

    public byte[] m() {
        return this.b;
    }

    public byte[] n() {
        return this.c;
    }

    public byte[] o() {
        return this.h;
    }

    public byte[] p() {
        return this.i;
    }

    public void preInitToSpeedUp() {
        Iterator<Double> it2 = this.e.values().iterator();
        while (it2.hasNext()) {
            Ab153xPeq.calcZ(it2.next().doubleValue());
        }
    }

    public void r(PeqUiDataStru peqUiDataStru) {
        this.g.OnLoadPeqUiData(peqUiDataStru);
    }

    public void s(byte[] bArr) {
        this.a = bArr;
    }

    public void savePeqCoef(int i, TargetDeviceEnum targetDeviceEnum) throws IllegalArgumentException {
        if (i < 0 || i > 4) {
            throw new IllegalArgumentException("input 1~4");
        }
        this.j = Action.SaveCoef;
        int i2 = (i + 62076) - 1;
        byte[] bArr = this.b;
        bArr[0] = (byte) (i2 & 255);
        bArr[1] = (byte) ((i2 >> 8) & 255);
        try {
            this.h = h();
            Queue<IPeqStage> queue = this.k;
            if (queue != null) {
                queue.clear();
            }
            LinkedList linkedList = new LinkedList();
            this.k = linkedList;
            linkedList.offer(new PeqStageReadAudiPath(this));
            this.k.offer(new PeqStageReadPeqSubset(this));
            if (targetDeviceEnum != TargetDeviceEnum.CLIENT) {
                this.k.offer(new PeqStageReclaimNvkey(this, PeqStageReclaimNvkey.Option.SaveCoef));
                this.k.offer(new PeqStageSaveCoef(this));
                this.k.offer(new PeqStageReclaimNvkey(this, PeqStageReclaimNvkey.Option.SavePeqPath));
                this.k.offer(new PeqStageUpdatePeqSubset(this));
                this.k.offer(new PeqStageReclaimNvkey(this, PeqStageReclaimNvkey.Option.SaveAudioPath));
                this.k.offer(new PeqStageUpdateAudioPath(this));
                this.k.offer(new PeqStageHostAudioSaveStatus(this));
            }
            if (targetDeviceEnum != TargetDeviceEnum.AGENT) {
                this.k.offer(new PeqStageGetAvaDst(this));
                this.k.offer(new PeqStageReclaimNvkeyRelay(this, PeqStageReclaimNvkey.Option.SaveCoef));
                this.k.offer(new PeqStageSaveCoefRelay(this));
                this.k.offer(new PeqStageReclaimNvkeyRelay(this, PeqStageReclaimNvkey.Option.SavePeqPath));
                this.k.offer(new PeqStageUpdatePeqSubsetRelay(this));
                this.k.offer(new PeqStageReclaimNvkeyRelay(this, PeqStageReclaimNvkey.Option.SaveAudioPath));
                this.k.offer(new PeqStageUpdateAudioPathRelay(this));
                this.k.offer(new PeqStageHostAudioSaveStatusRelay(this));
            }
            IPeqStage iPeqStagePoll = this.k.poll();
            this.l = iPeqStagePoll;
            iPeqStagePoll.sendCmd();
        } catch (Exception e) {
            this.d.logToFile(r, e.getMessage());
            this.g.OnActionError(this.j);
        }
    }

    public void savePeqUiData(int i, PeqUiDataStru peqUiDataStru, TargetDeviceEnum targetDeviceEnum) throws IllegalArgumentException {
        if (i < 0 || i > 4) {
            throw new IllegalArgumentException("input 1~4");
        }
        this.j = Action.SaveUiData;
        int i2 = (i + 61184) - 1;
        byte[] bArr = this.c;
        bArr[0] = (byte) (i2 & 255);
        bArr[1] = (byte) ((i2 >> 8) & 255);
        this.i = i(peqUiDataStru);
        Queue<IPeqStage> queue = this.k;
        if (queue != null) {
            queue.clear();
        }
        LinkedList linkedList = new LinkedList();
        this.k = linkedList;
        if (targetDeviceEnum != TargetDeviceEnum.CLIENT) {
            linkedList.offer(new PeqStageReclaimNvkey(this, PeqStageReclaimNvkey.Option.SaveUiData));
            this.k.offer(new PeqStageSaveUiData(this));
        }
        if (targetDeviceEnum != TargetDeviceEnum.AGENT) {
            this.k.offer(new PeqStageGetAvaDst(this));
            this.k.offer(new PeqStageReclaimNvkeyRelay(this, PeqStageReclaimNvkey.Option.SaveUiData));
            this.k.offer(new PeqStageSaveUiDataRelay(this));
        }
        IPeqStage iPeqStagePoll = this.k.poll();
        this.l = iPeqStagePoll;
        iPeqStagePoll.sendCmd();
    }

    public void setAwsPeerDst(Dst dst) {
        if (dst == null) {
            this.k.clear();
            this.d.logToFile(r, "peer not existing, following task removed");
            this.d.logToFile(r, "stage queue size: " + this.k.size());
        }
        this.o = dst;
    }

    public void setPEQGrpNum(int i) {
        this.p = i;
    }

    public void setPeqGroupIdx(byte b) throws IllegalArgumentException {
        this.j = Action.SetPEQGroupIdx;
        Queue<IPeqStage> queue = this.k;
        if (queue != null) {
            queue.clear();
        }
        LinkedList linkedList = new LinkedList();
        this.k = linkedList;
        linkedList.offer(new PeqStageSetPeqGrpIdx(this, b));
        IPeqStage iPeqStagePoll = this.k.poll();
        this.l = iPeqStagePoll;
        iPeqStagePoll.sendCmd();
    }

    public void startRealtimeUpdate(PeqUiDataStru peqUiDataStru) {
        synchronized (this) {
            this.j = Action.RealTimeUpdate;
            try {
                if (!g(peqUiDataStru)) {
                    this.g.OnActionError(this.j);
                    return;
                }
                Queue<IPeqStage> queue = this.k;
                if (queue != null) {
                    queue.clear();
                }
                LinkedList linkedList = new LinkedList();
                this.k = linkedList;
                linkedList.offer(new PeqStageRealTimeUpdate(this, this.f));
                IPeqStage iPeqStagePoll = this.k.poll();
                this.l = iPeqStagePoll;
                iPeqStagePoll.sendCmd();
            } catch (Exception e) {
                this.d.logToFile(r, e.getMessage());
                this.g.OnActionError(this.j);
            }
        }
    }

    public void t(byte[] bArr) {
        this.n = bArr;
    }

    public void u(byte[] bArr) {
        this.m = bArr;
    }
}
