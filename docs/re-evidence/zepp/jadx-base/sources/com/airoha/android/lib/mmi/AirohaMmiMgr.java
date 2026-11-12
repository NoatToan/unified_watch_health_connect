package com.airoha.android.lib.mmi;

import com.airoha.android.lib.fota.stage.for153xMCE.Dst;
import com.airoha.android.lib.mmi.stage.IAirohaMmiStage;
import com.airoha.android.lib.mmi.stage.MmiStageAncOff;
import com.airoha.android.lib.mmi.stage.MmiStageAncOn;
import com.airoha.android.lib.mmi.stage.MmiStageCheckAgentChannel;
import com.airoha.android.lib.mmi.stage.MmiStageFindMe;
import com.airoha.android.lib.mmi.stage.MmiStageGetAncStatus;
import com.airoha.android.lib.mmi.stage.MmiStageGetAudioPath;
import com.airoha.android.lib.mmi.stage.MmiStageGetAvaDst;
import com.airoha.android.lib.mmi.stage.MmiStageGetGameMode;
import com.airoha.android.lib.mmi.stage.MmiStageGetKeyMap;
import com.airoha.android.lib.mmi.stage.MmiStageGetKeyMapRelay;
import com.airoha.android.lib.mmi.stage.MmiStageGetPassThruGain;
import com.airoha.android.lib.mmi.stage.MmiStageGetVaIndex;
import com.airoha.android.lib.mmi.stage.MmiStageGetVaIndexRelay;
import com.airoha.android.lib.mmi.stage.MmiStageGetVpIndex;
import com.airoha.android.lib.mmi.stage.MmiStageQueryFindMeState;
import com.airoha.android.lib.mmi.stage.MmiStageQueryVPLanguage;
import com.airoha.android.lib.mmi.stage.MmiStageReloadNv;
import com.airoha.android.lib.mmi.stage.MmiStageReloadNvRelay;
import com.airoha.android.lib.mmi.stage.MmiStageRoleSwitch;
import com.airoha.android.lib.mmi.stage.MmiStageSetAncPassThruGain;
import com.airoha.android.lib.mmi.stage.MmiStageSetAudioPath;
import com.airoha.android.lib.mmi.stage.MmiStageSetGameMode;
import com.airoha.android.lib.mmi.stage.MmiStageSetKeyMap;
import com.airoha.android.lib.mmi.stage.MmiStageSetKeyMapRelay;
import com.airoha.android.lib.mmi.stage.MmiStageSetVaIndex;
import com.airoha.android.lib.mmi.stage.MmiStageSetVaIndexRelay;
import com.airoha.android.lib.mmi.stage.MmiStageSetVpIndex;
import com.airoha.android.lib.mmi.stage.MmiStageTwsGetBattery;
import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.transport.PacketParser.OnAirohaRespTimeoutListener;
import com.airoha.android.lib.transport.PacketParser.OnRacePacketListener;
import com.airoha.android.lib.transport.connection.OnAirohaConnStateListener;
import com.airoha.android.lib.util.Converter;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class AirohaMmiMgr {
    private static final String f = "AirohaMmiMgr";
    private Dst a;
    private ConcurrentHashMap<String, OnAirohaMmiClientAppListener> b;
    private final OnAirohaRespTimeoutListener e;
    public AirohaLink mAirohaLink;
    public IAirohaMmiStage mCurrentStage;
    public Queue<IAirohaMmiStage> mStagesQueue = new ConcurrentLinkedQueue();
    private OnRacePacketListener c = new a();
    private OnAirohaConnStateListener d = new b();

    public class a implements OnRacePacketListener {
        public a() {
        }

        @Override // com.airoha.android.lib.transport.PacketParser.OnRacePacketListener
        public void handleRespOrInd(int i, byte[] bArr, int i2) {
            synchronized (AirohaMmiMgr.this.mStagesQueue) {
                if (AirohaMmiMgr.this.f(i, bArr, i2)) {
                    return;
                }
                AirohaMmiMgr.this.d(i, bArr, i2);
                IAirohaMmiStage iAirohaMmiStage = AirohaMmiMgr.this.mCurrentStage;
                if (iAirohaMmiStage != null) {
                    if (!iAirohaMmiStage.isExpectedResp(i, i2, bArr)) {
                        AirohaMmiMgr.this.mAirohaLink.logToFile(AirohaMmiMgr.f, "not the expected race ID or Type");
                        return;
                    }
                    AirohaMmiMgr.this.mCurrentStage.handleResp(i, bArr, i2);
                    if (AirohaMmiMgr.this.mCurrentStage.isRespStatusSuccess()) {
                        AirohaMmiMgr airohaMmiMgr = AirohaMmiMgr.this;
                        airohaMmiMgr.h(airohaMmiMgr.mCurrentStage.getSimpleName());
                    }
                    AirohaMmiMgr airohaMmiMgr2 = AirohaMmiMgr.this;
                    airohaMmiMgr2.mCurrentStage = airohaMmiMgr2.mStagesQueue.poll();
                    IAirohaMmiStage iAirohaMmiStage2 = AirohaMmiMgr.this.mCurrentStage;
                    if (iAirohaMmiStage2 != null) {
                        iAirohaMmiStage2.start();
                    }
                }
            }
        }
    }

    public class b implements OnAirohaConnStateListener {
        public b() {
        }

        @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
        public void OnConnected(String str) {
            synchronized (AirohaMmiMgr.this.mStagesQueue) {
                IAirohaMmiStage iAirohaMmiStage = AirohaMmiMgr.this.mCurrentStage;
                if (iAirohaMmiStage != null) {
                    iAirohaMmiStage.start();
                }
            }
        }

        @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
        public void OnConnecting() {
        }

        @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
        public void OnConnectionTimeout() {
        }

        @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
        public void OnDisConnecting() {
        }

        @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
        public void OnDisconnected() {
        }

        @Override // com.airoha.android.lib.transport.connection.OnAirohaConnStateListener
        public void OnUnexpectedDisconnected() {
        }
    }

    public class c implements OnAirohaRespTimeoutListener {
        public c() {
        }

        @Override // com.airoha.android.lib.transport.PacketParser.OnAirohaRespTimeoutListener
        public void OnRespTimeout() {
            synchronized (AirohaMmiMgr.this.mStagesQueue) {
                AirohaMmiMgr airohaMmiMgr = AirohaMmiMgr.this;
                airohaMmiMgr.mCurrentStage = airohaMmiMgr.mStagesQueue.poll();
                IAirohaMmiStage iAirohaMmiStage = AirohaMmiMgr.this.mCurrentStage;
                if (iAirohaMmiStage != null) {
                    iAirohaMmiStage.start();
                }
            }
        }
    }

    public AirohaMmiMgr(AirohaLink airohaLink) {
        c cVar = new c();
        this.e = cVar;
        this.mAirohaLink = airohaLink;
        airohaLink.registerOnConnStateListener(f, this.d);
        this.mAirohaLink.registerOnRacePacketListener(f, this.c);
        this.mAirohaLink.registerOnRespTimeoutListener(f, cVar);
        this.b = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, byte[] bArr, int i2) {
        if (i != 3328) {
            return;
        }
        ArrayList<Dst> arrayList = new ArrayList();
        for (int i3 = 6; i3 < bArr.length - 1; i3 += 2) {
            Dst dst = new Dst();
            dst.Type = bArr[i3];
            dst.Id = bArr[i3 + 1];
            arrayList.add(dst);
        }
        Dst dst2 = null;
        for (Dst dst3 : arrayList) {
            if (dst3.Type == 5) {
                dst2 = dst3;
                break;
            }
        }
        if (dst2 == null) {
            this.mAirohaLink.logToFile(f, "partner not existing");
        }
        setAwsPeerDst(dst2);
    }

    private ConcurrentHashMap<String, OnAirohaMmiClientAppListener> e() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(int i, byte[] bArr, int i2) {
        if (i2 != 90 || i != 2304 || bArr.length < 9 || Converter.BytesToShort(bArr[7], bArr[6]) != 10) {
            return false;
        }
        notifyAudioPath(bArr[8]);
        return true;
    }

    private void g(boolean z) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.notifyAgentIsRight(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.OnRespSuccess(str);
            }
        }
    }

    private void i(boolean z) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.notifyPartnerIsExisting(z);
            }
        }
    }

    public void cancelCurrentStage() {
        this.mCurrentStage.stop();
        this.mStagesQueue.clear();
        this.mCurrentStage = null;
    }

    public void checkAgentChannel() {
        this.mStagesQueue.offer(new MmiStageCheckAgentChannel(this));
        startPollStagetQueue();
    }

    public void checkPartnerExistence() {
        this.mStagesQueue.offer(new MmiStageGetAvaDst(this));
        startPollStagetQueue();
    }

    public void doRoleSwitch() {
        this.mStagesQueue.offer(new MmiStageRoleSwitch(this));
        startPollStagetQueue();
    }

    public void findMe(byte b2, byte b3, byte b4) {
        this.mStagesQueue.offer(new MmiStageFindMe(this, b2, b3, b4));
        startPollStagetQueue();
    }

    public AirohaLink getAirohaLink() {
        return this.mAirohaLink;
    }

    public void getAncStatus() {
        this.mStagesQueue.offer(new MmiStageGetAncStatus(this));
        startPollStagetQueue();
    }

    public void getAudioPath() {
        this.mStagesQueue.offer(new MmiStageGetAudioPath(this));
        startPollStagetQueue();
    }

    public Dst getAwsPeerDst() {
        return this.a;
    }

    public void getBattery(byte b2) {
        this.mStagesQueue.offer(new MmiStageTwsGetBattery(this, b2));
        startPollStagetQueue();
    }

    public void getGameModeState() {
        this.mStagesQueue.offer(new MmiStageGetGameMode(this));
        startPollStagetQueue();
    }

    public void getKeyMap(boolean z, boolean z2) {
        if (z) {
            this.mStagesQueue.offer(new MmiStageGetKeyMap(this));
        }
        if (z2) {
            this.mStagesQueue.offer(new MmiStageGetKeyMapRelay(this));
        }
        startPollStagetQueue();
    }

    public void getPassThruGain() {
        this.mStagesQueue.offer(new MmiStageGetPassThruGain(this));
        startPollStagetQueue();
    }

    public void getVaIndex(boolean z, boolean z2) {
        if (z) {
            this.mStagesQueue.offer(new MmiStageGetVaIndex(this));
        }
        if (z2) {
            this.mStagesQueue.offer(new MmiStageGetVaIndexRelay(this));
        }
        startPollStagetQueue();
    }

    public void getVpIndex() {
        this.mStagesQueue.offer(new MmiStageGetVpIndex(this));
        startPollStagetQueue();
    }

    public void notifyAncStatus(byte b2, short s) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.notifyAncStatus(b2, s);
            }
        }
    }

    public void notifyAncTurnOff(byte b2) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.OnAncTurnOff(b2);
            }
        }
    }

    public void notifyAncTurnOn(byte b2) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.OnAncTurnOn(b2);
            }
        }
    }

    public void notifyAudioPath(byte b2) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.onAudioPathChanged(b2);
            }
        }
    }

    public void notifyBattery(byte b2, byte b3) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.OnBattery(b2, b3);
            }
        }
    }

    public void notifyFindMeState(byte b2) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.OnFindMeState(b2);
            }
        }
    }

    public void notifyGameModeState(byte b2) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.notifyGameModeState(b2);
            }
        }
    }

    public void notifyGameModeStatueChanged(boolean z) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.OnGameModeStateChanged(z);
            }
        }
    }

    public void notifyGetKeyMapNv(byte b2, byte[] bArr) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.notifyGetKeyMapNv(b2, bArr);
            }
        }
    }

    public void notifyGetPassThruGain(short s) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.notifyGetPassThruGain(s);
            }
        }
    }

    public void notifyGetVaIndex(byte b2, byte b3) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.notifyGetVaIndex(b2, b3);
            }
        }
    }

    public void notifyPassThrough(byte b2) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.OnPassThrough(b2);
            }
        }
    }

    public void notifyQueryVpIndex(byte b2) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.notifyGetVpIndex(b2);
            }
        }
    }

    public void notifyQueryVpLanguage(byte[] bArr) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < bArr.length; i += 2) {
                    arrayList.add(Converter.byte2HexStrWithoutSeperator(new byte[]{bArr[i + 1], bArr[i]}));
                }
                onAirohaMmiClientAppListener.notifyQueryVpLanguage(arrayList);
            }
        }
    }

    public void notifyReloadNv(byte b2, byte b3) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                if (b3 == 0) {
                    onAirohaMmiClientAppListener.notifyReloadNv(b2, true);
                } else {
                    onAirohaMmiClientAppListener.notifyReloadNv(b2, false);
                }
            }
        }
    }

    public void notifySetAncPassThruGain(short s) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.notifySetAncPassThruGain(s);
            }
        }
    }

    public void notifySetAudioPath(byte b2) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                onAirohaMmiClientAppListener.notifySetAudioPath(b2);
            }
        }
    }

    public void notifySetKeyMapNv(byte b2, byte b3) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                if (b3 == 0) {
                    onAirohaMmiClientAppListener.notifySetKeyMapNv(b2, true);
                } else {
                    onAirohaMmiClientAppListener.notifySetKeyMapNv(b2, false);
                }
            }
        }
    }

    public void notifySetVaIndex(byte b2, byte b3) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                if (b3 == 0) {
                    onAirohaMmiClientAppListener.notifySetVaIndex(b2, true);
                } else {
                    onAirohaMmiClientAppListener.notifySetVaIndex(b2, false);
                }
            }
        }
    }

    public void notifySetVpIndex(byte b2) {
        for (OnAirohaMmiClientAppListener onAirohaMmiClientAppListener : this.b.values()) {
            if (onAirohaMmiClientAppListener != null) {
                if (b2 == 0) {
                    onAirohaMmiClientAppListener.notifySetVpIndex(true);
                } else {
                    onAirohaMmiClientAppListener.notifySetVpIndex(false);
                }
            }
        }
    }

    public void queryFindMeState() {
        this.mStagesQueue.offer(new MmiStageQueryFindMeState(this));
        startPollStagetQueue();
    }

    public void queryVpLanguage() {
        this.mStagesQueue.offer(new MmiStageQueryVPLanguage(this));
        startPollStagetQueue();
    }

    public void registerMmiClientAppListener(String str, OnAirohaMmiClientAppListener onAirohaMmiClientAppListener) {
        this.b.put(str, onAirohaMmiClientAppListener);
    }

    public synchronized void renewStageQueue() {
        Queue<IAirohaMmiStage> queue = this.mStagesQueue;
        if (queue != null) {
            queue.clear();
        }
    }

    public void setAgentIsRight(boolean z) {
        g(z);
    }

    public void setAncPassThruGain(short s) {
        this.mStagesQueue.offer(new MmiStageSetAncPassThruGain(this, s));
        startPollStagetQueue();
    }

    public void setAudioPath(byte b2) {
        this.mStagesQueue.offer(new MmiStageSetAudioPath(this, b2));
        startPollStagetQueue();
    }

    public void setAwsPeerDst(Dst dst) {
        this.a = dst;
        if (dst != null) {
            i(true);
        } else {
            i(false);
        }
    }

    public void setGameModeState(boolean z) {
        this.mStagesQueue.offer(new MmiStageSetGameMode(this, z));
        startPollStagetQueue();
    }

    public void setKeyMap(byte[] bArr, boolean z) {
        if (z) {
            this.mStagesQueue.offer(new MmiStageSetKeyMap(this, bArr));
            this.mStagesQueue.offer(new MmiStageReloadNv(this, (short) -3353));
        } else {
            this.mStagesQueue.offer(new MmiStageSetKeyMapRelay(this, bArr));
            this.mStagesQueue.offer(new MmiStageReloadNvRelay(this, (short) -3353));
        }
        startPollStagetQueue();
    }

    public void setVaIndex(byte b2, boolean z, boolean z2) {
        if (z) {
            this.mStagesQueue.offer(new MmiStageSetVaIndex(this, b2));
            this.mStagesQueue.offer(new MmiStageReloadNv(this, (short) -3350));
        }
        if (z2) {
            this.mStagesQueue.offer(new MmiStageSetVaIndexRelay(this, b2));
            this.mStagesQueue.offer(new MmiStageReloadNvRelay(this, (short) -3350));
        }
        startPollStagetQueue();
    }

    public void setVpIndex(byte b2) {
        this.mStagesQueue.offer(new MmiStageSetVpIndex(this, b2));
        startPollStagetQueue();
    }

    public synchronized void startPollStagetQueue() {
        synchronized (this.mStagesQueue) {
            if (this.mCurrentStage == null) {
                IAirohaMmiStage iAirohaMmiStagePoll = this.mStagesQueue.poll();
                this.mCurrentStage = iAirohaMmiStagePoll;
                iAirohaMmiStagePoll.start();
            }
        }
    }

    public void startRespTimer() {
    }

    public void turnAncOff() {
        this.mStagesQueue.offer(new MmiStageAncOff(this));
        startPollStagetQueue();
    }

    public void turnAncOn(byte b2, byte b3) {
        renewStageQueue();
        this.mStagesQueue.offer(new MmiStageAncOff(this));
        this.mStagesQueue.offer(new MmiStageAncOn(this, b2, b3));
        startPollStagetQueue();
    }

    public void turnAncOn(byte b2) {
        this.mStagesQueue.offer(new MmiStageAncOff(this));
        this.mStagesQueue.offer(new MmiStageAncOn(this, b2));
        startPollStagetQueue();
    }
}
