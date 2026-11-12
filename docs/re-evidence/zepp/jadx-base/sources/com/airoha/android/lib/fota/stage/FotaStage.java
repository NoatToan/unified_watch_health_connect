package com.airoha.android.lib.fota.stage;

import android.os.SystemClock;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.for153xMCE.RaceCmdRelayPass;
import com.airoha.android.lib.fota.AirohaRaceOtaMgr;
import com.airoha.android.lib.fota.fotaError.ErrorEnum;
import com.airoha.android.lib.fota.fotaError.FotaErrorMsg;
import com.airoha.android.lib.fota.stage.for153xMCE.RelayRespExtracter;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.util.Converter;
import com.airoha.android.lib.util.SHA256;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public class FotaStage implements IAirohaFotaStage {
    public static final int INT_4K = 4096;
    private static int d = 4;
    private static int e;
    public static int mLongPktSeqCounter;
    public AirohaLink mAirohaLink;
    public volatile boolean mIsRespSuccess;
    public AirohaRaceOtaMgr mOtaMgr;
    public byte mRaceRespType;
    public static final byte[] BYTES_4K = {0, 16, 0, 0};
    public static LinkedHashMap<String, PARTITION_DATA> gSingleDeviceDiffPartitions = null;
    public static LinkedHashMap<String, PARTITION_DATA> gTwsRightDeviceDiffPartitions = null;
    public static LinkedHashMap<String, PARTITION_DATA> gTwsLeftDeviceDiffPartitions = null;
    public static ConcurrentMap<byte[], RacePacket> mLongPktCmdsForWaitingRsp = new ConcurrentHashMap();
    public String TAG = "Airoha_FotaStage";
    public boolean mIsLongPacketMode = false;
    private boolean a = false;
    public int mWaitingRespCount = 0;
    public byte mStatusCode = -1;
    public int mRaceId = 0;
    private int b = 0;
    private volatile int c = 0;
    public IAirohaFotaStage.SKIP_TYPE mSkipType = IAirohaFotaStage.SKIP_TYPE.None;
    public HashMap<IAirohaFotaStage.SKIP_TYPE, LinkedList<FotaStage>> mPartialStagesForSkipped = new HashMap<>();
    public boolean mIsErrorOccurred = false;
    public FotaStageEnum mFotaStageIndex = FotaStageEnum.Unknown;
    public ErrorEnum mErrorCode = ErrorEnum.RESPONSE_TIMEOUT;
    public String mErrorMsg = null;
    public boolean mIsRelay = false;
    public int mRelayRaceId = RaceId.RACE_RELAY_PASS_TO_DST;
    public byte mRelayRaceRespType = RaceType.INDICATION;
    public Queue<RacePacket> mCmdPacketQueue = new ConcurrentLinkedQueue();
    public Map<String, RacePacket> mCmdPacketMap = new LinkedHashMap();

    public class PARTITION_DATA {
        public static final int b = 4096;
        public byte[] mAddr;
        public byte[] mData;
        public int mDataLen;
        public boolean mIsDiff;
        public boolean mIsErased;
        public byte[] mSHA256;

        public PARTITION_DATA(byte[] bArr, byte[] bArr2, int i) {
            if (i > 4096) {
                return;
            }
            byte[] bArr3 = new byte[4];
            this.mAddr = bArr3;
            this.mData = new byte[i];
            this.mDataLen = i;
            this.mIsDiff = true;
            this.mIsErased = false;
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr3, 0, 4);
            }
            if (bArr2 != null) {
                System.arraycopy(bArr2, 0, this.mData, 0, i);
                this.mSHA256 = SHA256.calculate(this.mData);
            }
        }
    }

    public FotaStage(AirohaRaceOtaMgr airohaRaceOtaMgr) {
        this.mRaceRespType = RaceType.RESPONSE;
        this.mOtaMgr = airohaRaceOtaMgr;
        this.mAirohaLink = airohaRaceOtaMgr.getAirohaLink();
        this.mRaceRespType = RaceType.RESPONSE;
    }

    private void a(int i) {
        int length;
        boolean zIsNeedResp;
        this.mAirohaLink.logToFile(this.TAG, "poolCmdToSendLongPacketMode: cmd_count = " + i);
        ArrayList arrayList = new ArrayList();
        mLongPktSeqCounter = mLongPktSeqCounter + 1;
        if (mLongPktCmdsForWaitingRsp.size() != 0) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            length = 0;
            zIsNeedResp = false;
            for (RacePacket racePacket : mLongPktCmdsForWaitingRsp.values()) {
                if (!racePacket.isRespStatusSuccess()) {
                    if (racePacket.getPktSeqNum() + 1 < mLongPktSeqCounter) {
                        this.mAirohaLink.logToFile(this.TAG, "poolCmdToSendLongPacketMode: re-send cmd with addr = " + Converter.byte2HexStr(racePacket.getAddr()));
                        racePacket.setPktSeqNum(mLongPktSeqCounter);
                        length = racePacket.getRawFotaMode().length;
                        zIsNeedResp = racePacket.isNeedResp();
                        arrayList.add(racePacket);
                        this.mWaitingRespCount--;
                    } else {
                        concurrentHashMap.put(racePacket.getAddr(), racePacket);
                    }
                }
            }
            mLongPktCmdsForWaitingRsp = concurrentHashMap;
        } else {
            length = 0;
            zIsNeedResp = false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            RacePacket racePacketPoll = this.mCmdPacketQueue.poll();
            if (racePacketPoll != null) {
                racePacketPoll.setPktSeqNum(mLongPktSeqCounter);
                arrayList.add(racePacketPoll);
                length = racePacketPoll.getRawFotaMode().length;
                zIsNeedResp = racePacketPoll.isNeedResp();
                if (!mLongPktCmdsForWaitingRsp.containsKey(racePacketPoll.getAddr())) {
                    mLongPktCmdsForWaitingRsp.put(racePacketPoll.getAddr(), racePacketPoll);
                }
            }
        }
        if (arrayList.size() > 0) {
            this.mAirohaLink.logToFile(this.TAG, "poolCmdToSendLongPacketMode: cmd Count in one packet = " + arrayList.size());
            this.mWaitingRespCount = this.mWaitingRespCount + arrayList.size();
            this.mAirohaLink.logToFile(this.TAG, "poolCmdToSendLongPacketMode: mWaitingRespCount = " + this.mWaitingRespCount);
            byte[] bArr = new byte[arrayList.size() * length];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                System.arraycopy(((RacePacket) arrayList.get(i3)).getRawFotaMode(), 0, bArr, i3 * length, length);
            }
            if (e > 0) {
                this.mAirohaLink.logToFile(this.TAG, "poolCmdToSendLongPacketMode: long packet delay sleeping = " + e);
                SystemClock.sleep((long) e);
            }
            this.mAirohaLink.sendCommand(bArr);
            this.mAirohaLink.logToFile(this.TAG, "poolCmdToSendLongPacketMode: isNeedRsp = " + zIsNeedResp);
            if (zIsNeedResp) {
                this.mOtaMgr.startLongPacketTimer();
            }
        }
    }

    public static int getDelayPollTime() {
        return e;
    }

    public static int getPrePollSize() {
        return d;
    }

    public static void setDelayPollTime(int i) {
        e = i;
    }

    public static void setPrePollSize(int i) {
        d = i;
    }

    public void addStageForPartialSkip(IAirohaFotaStage.SKIP_TYPE skip_type, FotaStage fotaStage) {
        if (this.mPartialStagesForSkipped.containsKey(skip_type)) {
            this.mPartialStagesForSkipped.get(skip_type).add(fotaStage);
            return;
        }
        LinkedList<FotaStage> linkedList = new LinkedList<>();
        linkedList.add(fotaStage);
        this.mPartialStagesForSkipped.put(skip_type, linkedList);
    }

    public RacePacket createWrappedRelayPacket(RacePacket racePacket) {
        return new RaceCmdRelayPass(this.mOtaMgr.getAwsPeerDst(), racePacket);
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void genRacePackets() {
    }

    public RacePacket genReadNvKeyPacket(byte[] bArr) {
        this.mRaceId = RaceId.RACE_NVKEY_READFULLKEY;
        this.mRaceRespType = RaceType.RESPONSE;
        RacePacket racePacket = new RacePacket((byte) 0, RaceType.CMD_NEED_RESP, this.mRaceId);
        byte[] bArrShortToBytes = Converter.shortToBytes((short) 1000);
        racePacket.setPayload(new byte[]{bArr[0], bArr[1], bArrShortToBytes[0], bArrShortToBytes[1]});
        return racePacket;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public int getCompletedTaskCount() {
        return this.c;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public ErrorEnum getErrorCode() {
        return this.mErrorCode;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public String getErrorMsg() {
        if (this.mErrorMsg == null) {
            this.mErrorMsg = FotaErrorMsg.findErrorMsg(this.mErrorCode);
        }
        return this.mErrorMsg;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public FotaStageEnum getFotaStageIndex() {
        return this.mFotaStageIndex;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public byte getRespType() {
        return this.mRaceRespType;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public IAirohaFotaStage.SKIP_TYPE getSkipType() {
        this.mAirohaLink.logToFile(this.TAG, "mSkipType:" + this.mSkipType.toString());
        return this.mSkipType;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public LinkedList<FotaStage> getStagesForSkip(IAirohaFotaStage.SKIP_TYPE skip_type) {
        return this.mPartialStagesForSkipped.get(skip_type);
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public byte getStatus() {
        return this.mStatusCode;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public int getTotalTaskCount() {
        return this.b;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public int getWaitingRespCount() {
        return this.mWaitingRespCount;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void handleResp(int i, byte[] bArr, int i2) {
        this.mAirohaLink.logToFile(this.TAG, "handleResp");
        if (i != this.mRaceId) {
            return;
        }
        this.mAirohaLink.logToFile(this.TAG, "Rx packet: " + Converter.byte2HexStr(bArr));
        this.mIsRespSuccess = false;
        if (this.mIsRelay) {
            byte[] bArrExtractRelayRespPacket = RelayRespExtracter.extractRelayRespPacket(bArr);
            byte bExtractRaceType = RelayRespExtracter.extractRaceType(bArrExtractRelayRespPacket);
            int iExtractRaceId = RelayRespExtracter.extractRaceId(bArrExtractRelayRespPacket);
            if (bExtractRaceType != this.mRelayRaceRespType || iExtractRaceId != this.mRelayRaceId) {
                return;
            }
            byte bExtractStatus = RelayRespExtracter.extractStatus(bArrExtractRelayRespPacket);
            this.mStatusCode = bExtractStatus;
            parsePayloadAndCheckCompeted(iExtractRaceId, bArrExtractRelayRespPacket, bExtractStatus, bExtractRaceType);
        } else {
            byte b = bArr[6];
            this.mStatusCode = b;
            parsePayloadAndCheckCompeted(i, bArr, b, i2);
        }
        this.mAirohaLink.logToFile(this.TAG, "mStatusCode =" + ((int) this.mStatusCode));
        this.mAirohaLink.logToFile(this.TAG, "mIsRespSuccess =" + this.mIsRespSuccess);
        if (!this.mIsRespSuccess && this.mStatusCode != 0) {
            this.mIsRespSuccess = false;
            this.mErrorCode = ErrorEnum.ERROR_STATUS;
            return;
        }
        this.mIsRespSuccess = true;
        this.mErrorCode = ErrorEnum.SUCCESS;
        this.c++;
        if (this.mOtaMgr.isLongPacketMode()) {
            int i3 = this.mWaitingRespCount;
            if (i3 > 0) {
                this.mWaitingRespCount = i3 - 1;
            }
            this.mAirohaLink.logToFile(this.TAG, "handleResp: mWaitingRespCount =" + this.mWaitingRespCount);
        }
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public boolean isCmdQueueEmpty() {
        return this.mCmdPacketQueue.isEmpty();
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public boolean isCompleted() {
        Iterator<RacePacket> it2 = this.mCmdPacketMap.values().iterator();
        while (it2.hasNext()) {
            if (!it2.next().isRespStatusSuccess()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public boolean isErrorOccurred() {
        return this.mIsErrorOccurred;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public boolean isExpectedResp(int i, int i2, byte[] bArr) {
        if (!this.mIsRelay) {
            return i2 == this.mRaceRespType && i == this.mRaceId;
        }
        if (bArr.length < 9) {
            return false;
        }
        byte[] bArrExtractRelayRespPacket = RelayRespExtracter.extractRelayRespPacket(bArr);
        return RelayRespExtracter.extractRaceType(bArrExtractRelayRespPacket) == this.mRelayRaceRespType && RelayRespExtracter.extractRaceId(bArrExtractRelayRespPacket) == this.mRelayRaceId;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public boolean isRespStatusSuccess() {
        this.mAirohaLink.logToFile(this.TAG, "mIsRespSuccess: " + String.valueOf(this.mIsRespSuccess));
        return this.mIsRespSuccess;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public boolean isRetryUpToLimit() {
        this.mCmdPacketQueue.clear();
        for (RacePacket racePacket : this.mCmdPacketMap.values()) {
            if (racePacket.isRetryUpperLimit()) {
                this.mAirohaLink.logToFile(this.TAG, "retry reach upper limit: " + racePacket.toHexString());
                return true;
            }
            if (!racePacket.isRespStatusSuccess()) {
                racePacket.increaseRetryCounter();
                this.mCmdPacketQueue.offer(racePacket);
            }
        }
        return false;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public boolean isStopped() {
        return this.a;
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
    }

    public void placeCmd(RacePacket racePacket) {
    }

    public void placeCmd(RacePacket racePacket, String str) {
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void pollCmdQueue() {
        this.mAirohaLink.logToFile(this.TAG, "pollCmdQueue: mCmdPacketQueue.size() = " + this.mCmdPacketQueue.size());
        if (this.mCmdPacketQueue.size() != 0) {
            this.mAirohaLink.logToFile(this.TAG, "pollCmdQueue:  mWaitingRespCount = " + this.mWaitingRespCount);
            if (this.mOtaMgr.isLongPacketMode()) {
                a(this.mOtaMgr.getLongPacketCmdCount() - this.mWaitingRespCount);
                return;
            }
            if (e > 0) {
                this.mAirohaLink.logToFile(this.TAG, "long packet delay sleeping");
                SystemClock.sleep(e);
            }
            poolCmdToSend();
        }
    }

    public void poolCmdToSend() {
        RacePacket racePacketPoll = this.mCmdPacketQueue.poll();
        if (racePacketPoll != null) {
            this.mAirohaLink.sendCommand(racePacketPoll.getRawFotaMode());
            if (racePacketPoll.isNeedResp()) {
                this.mOtaMgr.startRespTimer();
            }
        }
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void prePoolCmdQueue() {
        this.mAirohaLink.logToFile(this.TAG, "prePoolCmdQueue()");
        if (this.mCmdPacketQueue.size() != 0) {
            if (this.mOtaMgr.isLongPacketMode()) {
                mLongPktCmdsForWaitingRsp.clear();
                mLongPktSeqCounter = 0;
                this.mWaitingRespCount = 0;
                a(this.mOtaMgr.getLongPacketCmdCount());
                return;
            }
            if (this.mCmdPacketQueue.size() < 2) {
                poolCmdToSend();
                return;
            }
            this.mAirohaLink.logToFile(this.TAG, "PrePollSize = " + getPrePollSize());
            for (int i = 0; i < getPrePollSize(); i++) {
                poolCmdToSend();
            }
        }
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void start() {
        if (this.a) {
            this.mAirohaLink.logToFile(this.TAG, "mIsStopped == true");
            return;
        }
        this.mAirohaLink.logToFile(this.TAG, "start()");
        genRacePackets();
        this.b = this.mCmdPacketQueue.size();
        this.mAirohaLink.logToFile(this.TAG, "mInitQueueSize: " + this.b);
        prePoolCmdQueue();
    }

    @Override // com.airoha.android.lib.fota.stage.IAirohaFotaStage
    public void stop() {
        Queue<RacePacket> queue = this.mCmdPacketQueue;
        if (queue != null) {
            queue.clear();
        }
        this.a = true;
    }
}
