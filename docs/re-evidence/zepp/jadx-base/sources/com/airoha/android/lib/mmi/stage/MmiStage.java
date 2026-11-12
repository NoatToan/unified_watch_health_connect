package com.airoha.android.lib.mmi.stage;

import android.os.SystemClock;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.airoha.android.lib.RaceCommand.packet.RacePacket;
import com.airoha.android.lib.RaceCommand.packet.fota.for153xMCE.RaceCmdRelayPass;
import com.airoha.android.lib.fota.stage.for153xMCE.RelayRespExtracter;
import com.airoha.android.lib.mmi.AirohaMmiMgr;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.util.Converter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class MmiStage implements IAirohaMmiStage {
    private static int d = 4;
    private static int e;
    public String TAG;
    public AirohaLink mAirohaLink;
    public volatile boolean mIsRespSuccess;
    public AirohaMmiMgr mMmiMgr;
    public byte mRaceRespType;
    public boolean mIsLongPacketMode = false;
    private boolean a = false;
    public int mWaitingRespCount = 0;
    public byte mStatusCode = -1;
    public int mRaceId = 0;
    private int b = 0;
    private int c = 0;
    public boolean mIsErrorOccurred = false;
    public String mStrErrorReason = "Unknown";
    public boolean mIsRelay = false;
    public int mRelayRaceId = RaceId.RACE_RELAY_PASS_TO_DST;
    public byte mRelayRaceRespType = RaceType.INDICATION;
    public Queue<RacePacket> mCmdPacketQueue = new ConcurrentLinkedQueue();
    public Map<String, RacePacket> mCmdPacketMap = new LinkedHashMap();

    public MmiStage(AirohaMmiMgr airohaMmiMgr) {
        this.TAG = "AirohaMmiStage";
        this.mRaceRespType = RaceType.RESPONSE;
        this.mMmiMgr = airohaMmiMgr;
        this.mAirohaLink = airohaMmiMgr.getAirohaLink();
        this.mRaceRespType = RaceType.RESPONSE;
        this.TAG = getClass().getSimpleName();
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

    public RacePacket createWrappedRelayPacket(RacePacket racePacket) {
        return new RaceCmdRelayPass(this.mMmiMgr.getAwsPeerDst(), racePacket);
    }

    public void genRacePackets() {
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public int getCompletedTaskCount() {
        return this.c;
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public String getErrorReason() {
        return this.mStrErrorReason;
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public byte getRespType() {
        return this.mRaceRespType;
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public String getSimpleName() {
        return this.TAG;
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public byte getStatus() {
        return this.mStatusCode;
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public int getTotalTaskCount() {
        return this.b;
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public void handleResp(int i, byte[] bArr, int i2) {
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
        if (this.mStatusCode == 0) {
            this.mIsRespSuccess = true;
            this.c++;
        } else {
            this.mIsRespSuccess = false;
        }
        this.mAirohaLink.logToFile(this.TAG, "mStatusCode =" + ((int) this.mStatusCode));
        this.mAirohaLink.logToFile(this.TAG, "mIsRespSuccess =" + this.mIsRespSuccess);
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public boolean isCmdQueueEmpty() {
        return this.mCmdPacketQueue.isEmpty();
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public boolean isCompleted() {
        Iterator<RacePacket> it2 = this.mCmdPacketMap.values().iterator();
        while (it2.hasNext()) {
            if (!it2.next().isRespStatusSuccess()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public boolean isErrorOccurred() {
        return this.mIsErrorOccurred;
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
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

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public boolean isRespStatusSuccess() {
        this.mAirohaLink.logToFile(this.TAG, "mIsRespSuccess: " + String.valueOf(this.mIsRespSuccess));
        return this.mIsRespSuccess;
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public boolean isRetryUpToLimit() {
        this.mCmdPacketQueue.clear();
        for (RacePacket racePacket : this.mCmdPacketMap.values()) {
            if (racePacket.isRetryUpperLimit()) {
                this.mAirohaLink.logToFile(this.TAG, "retry reach upper limit: " + racePacket.toHexString());
                return true;
            }
            if (!racePacket.isRespStatusSuccess()) {
                this.mAirohaLink.logToFile(this.TAG, "refill the retry cmd to CmdQueue: " + racePacket.toHexString());
                racePacket.increaseRetryCounter();
                this.mCmdPacketQueue.offer(racePacket);
            }
        }
        return false;
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public boolean isStopped() {
        return this.a;
    }

    public void parsePayloadAndCheckCompeted(int i, byte[] bArr, byte b, int i2) {
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public void pollCmdQueue() {
        this.mAirohaLink.logToFile(this.TAG, " pollCmdQueue mCmdPacketQueue.size() = " + this.mCmdPacketQueue.size());
        if (this.mCmdPacketQueue.size() != 0) {
            int i = e;
            if (i > 0) {
                SystemClock.sleep(i);
            }
            poolCmdToSend();
        }
    }

    public void poolCmdToSend() {
        RacePacket racePacketPoll = this.mCmdPacketQueue.poll();
        if (racePacketPoll != null) {
            this.mAirohaLink.sendCommand(racePacketPoll.getRaw());
            if (racePacketPoll.isNeedResp()) {
                this.mMmiMgr.startRespTimer();
            }
        }
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public void prePoolCmdQueue() {
        if (this.mCmdPacketQueue.size() != 0) {
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

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public void start() {
        if (this.a) {
            return;
        }
        genRacePackets();
        this.b = this.mCmdPacketQueue.size();
        this.mAirohaLink.logToFile(this.TAG, "mInitQueueSize: " + this.b);
        prePoolCmdQueue();
    }

    @Override // com.airoha.android.lib.mmi.stage.IAirohaMmiStage
    public void stop() {
        Queue<RacePacket> queue = this.mCmdPacketQueue;
        if (queue != null) {
            queue.clear();
        }
        this.a = true;
    }
}
