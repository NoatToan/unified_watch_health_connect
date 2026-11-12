package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.apprichtap.haptic.player.IHapticEffectPerformer;
import com.apprichtap.haptic.player.IHapticPlayer;
import com.apprichtap.haptic.player.PlayerEventCallback;
import com.apprichtap.haptic.sync.SyncCallback;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class ps implements IHapticPlayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f45873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pq f45874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HandlerThread f45875c;
    private final ExecutorService d = Executors.newFixedThreadPool(1);
    private final IHapticEffectPerformer e;

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void updateHapticParameter(int i, int i2, int i3) {
        if (i < 0 || 511 < i) {
            po.e.b("Customizable-Player", "updateHapticParameter, ignore invalid intensity:" + i);
        } else {
            this.f45874b.f45810a = i;
        }
        if (-100 > i2 || 100 < i2) {
            po.e.b("Customizable-Player", "updateHapticParameter, ignore invalid freq:" + i2);
        } else {
            this.f45874b.e = i2;
        }
        if (i3 >= 0) {
            this.f45874b.j = i3;
            return;
        }
        po.e.b("Customizable-Player", "updateHapticParameter, ignore invalid interval:" + i3);
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void unregisterPlayerEventCallback() {
        this.f45874b.x = null;
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void stop() {
        if (6 == this.f45874b.d() || 7 == this.f45874b.d() || 9 == this.f45874b.d()) {
            e eVar = this.f45873a;
            eVar.a(eVar.obtainMessage(1003), 0, true);
            this.f45874b.b();
            this.f45874b.c(8, 0);
            return;
        }
        po.e.e("Customizable-Player", "call stop() in invalid status:" + this.f45874b.d() + ", do nothing!");
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void start() {
        if (5 != this.f45874b.d() && 7 != this.f45874b.d() && 9 != this.f45874b.d()) {
            po.e.e("Customizable-Player", "call start() in invalid status:" + this.f45874b.d() + ", do nothing!");
            return;
        }
        po.e.d("Customizable-Player", "  start() in, mCurrentHePausePosition:" + this.f45874b.g);
        if (9 == this.f45874b.d()) {
            po.e.d("Customizable-Player", "  start() return, already COMPLETED, start from 0");
            this.f45874b.g = 0;
        }
        e eVar = this.f45873a;
        eVar.a(eVar.obtainMessage(1005), 0, true);
        this.f45874b.c(6, 0);
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void setSwitching(boolean z) {
        this.f45874b.n = z;
        this.e.swapVibrationIndex(z);
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void setSpeed(float f) throws Throwable {
        if (5 != this.f45874b.d() && 7 != this.f45874b.d() && 6 != this.f45874b.d() && 9 != this.f45874b.d()) {
            po.e.a("Customizable-Player", "failed to setSpeedMultiple, status:" + this.f45874b.d());
            return;
        }
        if (f == this.f45874b.o) {
            return;
        }
        int currentPosition = getCurrentPosition();
        int iD = pm.d(this.f45874b.m);
        double d = (((double) currentPosition) * 1.0d) / ((double) iD);
        po.e.d("Customizable-Player", "setSpeedMultiple, positionOfOriginal:" + currentPosition + ",durationOfOriginal:" + iD + ",progress：" + d);
        int iD2 = this.f45874b.d();
        if (6 == iD2) {
            pause();
        }
        pq pqVar = this.f45874b;
        pqVar.o = f;
        pqVar.f45811b = pm.a(pqVar.m, f);
        po.a("speed_up_" + f, this.f45874b.f45811b);
        pq pqVar2 = this.f45874b;
        pqVar2.h = pm.b(pqVar2.f45811b);
        int iD3 = pm.d(this.f45874b.f45811b);
        this.f45874b.g = (int) (d * ((double) iD3));
        po.e.d("Customizable-Player", "setSpeedUpMultiple, speedUpDuration:" + iD3 + ",mStartPosition:" + this.f45874b.g);
        if (6 == iD2) {
            start();
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void setLooping(boolean z) {
        pq pqVar;
        int i;
        if (z) {
            pqVar = this.f45874b;
            i = Integer.MAX_VALUE;
        } else {
            pqVar = this.f45874b;
            i = 1;
        }
        pqVar.d = i;
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void setDataSource(String str, int i, int i2, SyncCallback syncCallback) {
        setDataSource(str, i, i2, 0, 0, syncCallback);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a A[PHI: r5
      0x004a: PHI (r5v2 int) = (r5v1 int), (r5v8 int) binds: [B:12:0x0043, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void setDataSource(String str, int i, int i2, int i3, int i4, SyncCallback syncCallback) {
        if (this.f45874b.d() != 0) {
            po.e.e("Customizable-Player", "setDataSource in invalid status:" + this.f45874b.d() + ",do nothing!");
            return;
        }
        this.f45874b.b();
        pq pqVar = this.f45874b;
        pqVar.f45811b = str;
        pqVar.f45810a = i;
        pqVar.e = i2;
        if (i > 511) {
            pqVar.f45810a = 511;
        } else if (i < 0) {
            pqVar.f45810a = 0;
        }
        int i5 = 100;
        if (i2 > 100) {
            pqVar.e = i5;
        } else {
            i5 = -100;
            if (i2 < -100) {
                pqVar.e = i5;
            }
        }
        pqVar.f = syncCallback;
        if (i3 >= 0) {
            pqVar.d = i3 + 1;
        }
        if (-1 == i3) {
            pqVar.d = Integer.MAX_VALUE;
        }
        if (i4 >= 0) {
            pqVar.j = i4;
        }
        po.e.d("Customizable-Player", "will change to initialized!");
        this.f45874b.c(3, 0);
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void setDataSource(File file, int i, int i2, SyncCallback syncCallback) {
        setDataSource(po.e(file), i, i2, syncCallback);
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void seekTo(int i) {
        po.e.d("Customizable-Player", "  seekTo() in,  to position:" + i + ",speed：" + this.f45874b.o);
        if (!pq.d(this.f45874b.h)) {
            po.e.a("Customizable-Player", "  seekTo() return - HE invalid or prepare() not be called.");
            return;
        }
        pq pqVar = this.f45874b;
        int i2 = (int) (i / pqVar.o);
        if (i2 < 0 || i2 > pqVar.h.getDuration()) {
            po.e.d("Customizable-Player", "  seekTo() return, position invalid, position:" + i2);
        } else {
            e eVar = this.f45873a;
            eVar.a(eVar.obtainMessage(1003), 0, true);
            e eVar2 = this.f45873a;
            eVar2.a(eVar2.obtainMessage(1008, i2, i), 0, false);
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void reset() {
        if (isPlaying()) {
            e eVar = this.f45873a;
            eVar.a(eVar.obtainMessage(1003), 0, true);
        }
        this.f45874b.b();
        this.f45874b.c(0, 0);
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void release() {
        po.e.b("Customizable-Player", " released!");
        if (isPlaying()) {
            e eVar = this.f45873a;
            eVar.a(eVar.obtainMessage(1003), 0, true);
        }
        this.f45874b.b();
        this.f45874b.c(1, 0);
        HandlerThread handlerThread = this.f45875c;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        ExecutorService executorService = this.d;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void registerPlayerEventCallback(PlayerEventCallback playerEventCallback) {
        this.f45874b.x = playerEventCallback;
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void prepare() throws Throwable {
        if (3 != this.f45874b.d() && 8 != this.f45874b.d()) {
            po.e.e("Customizable-Player", "call prepare() in invalid status:" + this.f45874b.d() + ", do nothing!");
            return;
        }
        if (1 == pm.e(this.f45874b.f45811b)) {
            pq pqVar = this.f45874b;
            pqVar.f45811b = pm.a(pqVar.f45811b);
        }
        pq pqVar2 = this.f45874b;
        String str = pqVar2.f45811b;
        if (str != null && pqVar2.f != null) {
            int iD = pm.d(str, 2);
            int duration = this.f45874b.f.getDuration();
            po.e.d("Customizable-Player", "prepare() heDuration:" + iD + ",mediaDuration:" + duration);
            if (duration <= 0) {
                po.e.a("Customizable-Player", "prepare() , SyncCallback getDuration <= 0, invalid value and may not work!");
            }
            pq pqVar3 = this.f45874b;
            pqVar3.f45811b = pm.e(pqVar3.f45811b, duration);
        }
        pq pqVar4 = this.f45874b;
        String str2 = pqVar4.f45811b;
        pqVar4.m = str2;
        pn pnVarB = pm.b(str2);
        if (!pq.d(pnVarB)) {
            po.e.a("Customizable-Player", "prepare error, invalid HE");
            this.f45874b.b();
            this.f45874b.c(2, 4097);
            return;
        }
        pq pqVar5 = this.f45874b;
        pqVar5.h = pnVarB;
        pqVar5.c();
        this.e.setSenderIdKey(this.f45874b.k);
        this.e.setGain(255);
        this.f45874b.c(5, 0);
        po.a("prepared.he", this.f45874b.f45811b);
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public void pause() {
        if (6 != this.f45874b.d()) {
            po.e.d("Customizable-Player", "  pause() return, not STARTED");
            return;
        }
        po.e.d("Customizable-Player", "  pause() in, mStartPosition:" + this.f45874b.g + "mCurrentPosition:" + this.f45874b.i);
        e eVar = this.f45873a;
        eVar.a(eVar.obtainMessage(1003), 0, true);
        e eVar2 = this.f45873a;
        eVar2.a(eVar2.obtainMessage(1006), 0, false);
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public boolean isPlaying() {
        return 6 == this.f45874b.d();
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public boolean getSwitching() {
        return this.f45874b.n;
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public float getSpeed() {
        return this.f45874b.o;
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public int getDuration() {
        String str = this.f45874b.m;
        if (str == null) {
            return 0;
        }
        return pm.d(str, 2);
    }

    @Override // com.apprichtap.haptic.player.IHapticPlayer
    public int getCurrentPosition() {
        pq pqVar = this.f45874b;
        SyncCallback syncCallback = pqVar.f;
        if (syncCallback != null) {
            return syncCallback.getCurrentPosition();
        }
        int iD = pqVar.d();
        if (iD == 6) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            pq pqVar2 = this.f45874b;
            return (int) (((jElapsedRealtime - pqVar2.f45812c) + ((long) pqVar2.g)) * pqVar2.o);
        }
        if (iD == 7) {
            pq pqVar3 = this.f45874b;
            return (int) (pqVar3.g * pqVar3.o);
        }
        if (iD != 9) {
            return 0;
        }
        return getDuration();
    }

    class c implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45879a;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            e eVar;
            int iMax;
            Message messageObtainMessage;
            e eVar2;
            Message messageObtainMessage2;
            e eVar3;
            ps psVar;
            StringBuilder sb;
            int iD;
            e eVar4;
            Message messageObtainMessage3;
            ps psVar2;
            e eVar5;
            try {
                po.e.d("Customizable-Player", "msg what:" + message.what + ", arg:" + message.arg1 + ",mStatus:" + ps.this.f45874b.d());
                int i = message.what;
                int i2 = 1007;
                int i3 = 2;
                if (i != 1020) {
                    if (i != 1099) {
                        switch (i) {
                            case 1001:
                                if (ps.this.f45874b.l == 0) {
                                    ps.this.f45874b.f45812c = SystemClock.elapsedRealtime();
                                }
                                if (ps.this.f45874b.r == null || "".equals(ps.this.f45874b.r)) {
                                    iMax = ps.this.f45874b.h.f45702a.get(ps.this.f45874b.l).f45580c - ps.this.f45874b.t;
                                    ps.this.f45874b.t = ps.this.f45874b.h.f45702a.get(ps.this.f45874b.l).f45580c;
                                    ps.this.f45874b.p = ps.this.f45874b.h.f45702a.get(ps.this.f45874b.l).d();
                                    ps.this.f45874b.q = pm.a(ps.this.f45874b.h.f45702a.get(ps.this.f45874b.l), true);
                                    if (ps.this.f45874b.f == null) {
                                        po.e.d("Customizable-Player", "will play pattern after waitTime :" + iMax);
                                        eVar = ps.this.f45873a;
                                        messageObtainMessage = ps.this.f45873a.obtainMessage(1002);
                                    } else {
                                        int i4 = iMax - 20;
                                        po.e.d("Customizable-Player", "waitToPatternTimeInAdvance:" + i4);
                                        eVar = ps.this.f45873a;
                                        messageObtainMessage = ps.this.f45873a.obtainMessage(1020);
                                        iMax = Math.max(i4, 0);
                                    }
                                    eVar.a(messageObtainMessage, iMax, true);
                                } else {
                                    po.e.d("Customizable-Player", "mRemainderHEString:" + ps.this.f45874b.r);
                                    ps.this.f45874b.t = ps.this.f45874b.g;
                                    ps.this.f45874b.l = ps.this.f45874b.h.a(ps.this.f45874b.g);
                                    ps.this.f45874b.q = pm.a(ps.this.f45874b.f45811b, ps.this.f45874b.g);
                                    ps.this.f45874b.p = pm.d(ps.this.f45874b.q, 2);
                                    po.e.d("Customizable-Player", "MSG_CHECK_NEXT_PATTERN resume paused pattern,  mCurrentPatternIndex:" + ps.this.f45874b.l + ",mCurrentPatternString:" + ps.this.f45874b.q);
                                    ps.this.f45874b.r = null;
                                    eVar3 = ps.this.f45873a;
                                    messageObtainMessage3 = ps.this.f45873a.obtainMessage(1002);
                                    eVar3.a(messageObtainMessage3, 0, true);
                                }
                                break;
                            case 1002:
                                po.e.d("Customizable-Player", "MSG_PLAY_PATTERN mFreq" + ps.this.f45874b.e + ",mAmplitude:" + ps.this.f45874b.f45810a + "mCurrentPlayingInfo.mCurrentPatternIndex:" + ps.this.f45874b.l);
                                if (6 == ps.this.f45874b.d()) {
                                    ps.this.d.execute(ps.this.new a(ps.this.f45874b.q + "", ps.this.f45874b.f45810a, ps.this.f45874b.e, ps.this.e.getRichTapCoreMajorVersion()));
                                    if (ps.this.f45874b.l + 1 <= ps.this.f45874b.e() - 1) {
                                        ps.this.f45874b.l++;
                                        eVar3 = ps.this.f45873a;
                                        eVar5 = ps.this.f45873a;
                                        messageObtainMessage3 = eVar5.obtainMessage(1001);
                                        eVar3.a(messageObtainMessage3, 0, true);
                                    } else {
                                        pq pqVar = ps.this.f45874b;
                                        int i5 = pqVar.s + 1;
                                        pqVar.s = i5;
                                        if (i5 >= ps.this.f45874b.d) {
                                            eVar2 = ps.this.f45873a;
                                            messageObtainMessage2 = ps.this.f45873a.obtainMessage(1099);
                                            psVar2 = ps.this;
                                        } else {
                                            eVar2 = ps.this.f45873a;
                                            messageObtainMessage2 = ps.this.f45873a.obtainMessage(1007);
                                            psVar2 = ps.this;
                                        }
                                        i3 = psVar2.f45874b.p;
                                        eVar2.a(messageObtainMessage2, i3, true);
                                    }
                                } else {
                                    sb = new StringBuilder("ignore MSG_PLAY_PATTERN as status:");
                                    iD = ps.this.f45874b.d();
                                    sb.append(iD);
                                    po.e.d("Customizable-Player", sb.toString());
                                }
                                break;
                            case 1003:
                                ps.this.e.stop();
                                break;
                            default:
                                switch (i) {
                                    case 1005:
                                        this.f45879a = 0;
                                        po.e.d("Customizable-Player", "MSG_START mStartPosition:" + ps.this.f45874b.g + ", lastMediaPosition:" + this.f45879a);
                                        if (ps.this.f45874b.g >= 0 && ps.this.f45874b.g <= ps.this.f45874b.h.getDuration()) {
                                            po.e.d("Customizable-Player", "MSG_START will generate remainder and partial pattern!");
                                            ps.this.f45874b.r = pm.b(ps.this.f45874b.f45811b, ps.this.f45874b.g);
                                            if (ps.this.f45874b.r == null) {
                                                po.e.d("Customizable-Player", "null == mCurrentPlayingInfo.mRemainderHEString");
                                                pq pqVar2 = ps.this.f45874b;
                                                int i6 = pqVar2.s + 1;
                                                pqVar2.s = i6;
                                                if (i6 >= ps.this.f45874b.d) {
                                                    po.e.d("Customizable-Player", "last loop finished!");
                                                    eVar3 = ps.this.f45873a;
                                                    eVar4 = ps.this.f45873a;
                                                    i2 = 1099;
                                                } else {
                                                    ps.this.f45874b.c(6, 0);
                                                    eVar3 = ps.this.f45873a;
                                                    psVar = ps.this;
                                                    eVar4 = psVar.f45873a;
                                                }
                                                messageObtainMessage3 = eVar4.obtainMessage(i2);
                                                eVar3.a(messageObtainMessage3, 0, true);
                                            }
                                        }
                                        ps.this.f45874b.f45812c = SystemClock.elapsedRealtime();
                                        ps.this.f45874b.c(6, 0);
                                        eVar3 = ps.this.f45873a;
                                        eVar5 = ps.this.f45873a;
                                        messageObtainMessage3 = eVar5.obtainMessage(1001);
                                        eVar3.a(messageObtainMessage3, 0, true);
                                        break;
                                    case 1006:
                                        if (ps.this.f45874b.f != null) {
                                            try {
                                                ps.this.f45874b.g = (int) (ps.this.f45874b.f.getCurrentPosition() / ps.this.f45874b.o);
                                            } catch (Throwable th) {
                                                th.printStackTrace();
                                                ps.this.f45874b.g = 0;
                                            }
                                            po.e.d("Customizable-Player", "MSG_PAUSE, mStartPosition:" + ps.this.f45874b.g);
                                        } else {
                                            long jElapsedRealtime = SystemClock.elapsedRealtime() - ps.this.f45874b.f45812c;
                                            if (jElapsedRealtime < 0) {
                                                po.e.a("Customizable-Player", "pause delta < 0");
                                                ps.this.f45874b.g = 0;
                                                ps.this.f45874b.c(2, 0);
                                            } else {
                                                pq pqVar3 = ps.this.f45874b;
                                                pqVar3.g = (int) (((long) pqVar3.g) + jElapsedRealtime);
                                                po.e.d("Customizable-Player", "MSG_PAUSE mStartPosition:" + ps.this.f45874b.g);
                                            }
                                        }
                                        ps.this.f45874b.c(7, 0);
                                        break;
                                    case 1007:
                                        ps.this.f45874b.g = 0;
                                        ps.this.f45874b.l = 0;
                                        ps.this.f45874b.t = 0;
                                        this.f45879a = 0;
                                        eVar2 = ps.this.f45873a;
                                        messageObtainMessage2 = ps.this.f45873a.obtainMessage(1001);
                                        i3 = ps.this.f45874b.j;
                                        eVar2.a(messageObtainMessage2, i3, true);
                                        break;
                                    case 1008:
                                        ps.this.f45874b.g = message.arg1;
                                        this.f45879a = 0;
                                        if (6 == ps.this.f45874b.d()) {
                                            ps.this.f45873a.a(ps.this.f45873a.obtainMessage(1005), 0, true);
                                        } else {
                                            po.e.b("Customizable-Player", "MSG_SEEK status:" + ps.this.f45874b.d());
                                        }
                                        if (ps.this.f45874b.x != null) {
                                            ps.this.f45874b.x.onSeekCompleted(message.arg2);
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        ps.this.f45874b.g = 0;
                        ps.this.f45874b.l = 0;
                        ps.this.f45874b.s = 0;
                        ps.this.f45874b.t = 0;
                        this.f45879a = 0;
                        ps.this.f45874b.c(9, 0);
                    }
                } else if (6 != ps.this.f45874b.d()) {
                    sb = new StringBuilder("ignore MSG_SYNC_WITH_MEDIA as status:");
                    iD = ps.this.f45874b.d();
                    sb.append(iD);
                    po.e.d("Customizable-Player", sb.toString());
                } else if (ps.this.f45874b.l <= ps.this.f45874b.e() - 1 && ps.this.f45874b.f != null) {
                    int currentPosition = (int) (ps.this.f45874b.f.getCurrentPosition() / ps.this.f45874b.o);
                    po.e.d("Customizable-Player", " mediaPosition: " + currentPosition + ",lastMediaPosition:" + this.f45879a);
                    int i7 = this.f45879a;
                    if (currentPosition <= i7) {
                        if (currentPosition < i7) {
                            pq pqVar4 = ps.this.f45874b;
                            int i8 = pqVar4.s + 1;
                            pqVar4.s = i8;
                            if (i8 < ps.this.f45874b.d) {
                                eVar3 = ps.this.f45873a;
                                psVar = ps.this;
                                eVar4 = psVar.f45873a;
                                messageObtainMessage3 = eVar4.obtainMessage(i2);
                                eVar3.a(messageObtainMessage3, 0, true);
                            }
                        }
                        eVar2 = ps.this.f45873a;
                        messageObtainMessage2 = ps.this.f45873a.obtainMessage(1020);
                        eVar2.a(messageObtainMessage2, i3, true);
                    } else {
                        int i9 = ps.this.f45874b.h.f45702a.get(ps.this.f45874b.l).f45580c;
                        po.e.d("Customizable-Player", " mediaPosition: " + currentPosition + " ,patternTime:" + i9);
                        this.f45879a = currentPosition;
                        eVar = ps.this.f45873a;
                        Message messageObtainMessage4 = ps.this.f45873a.obtainMessage(1002);
                        iMax = Math.max(i9 - currentPosition, 0);
                        messageObtainMessage = messageObtainMessage4;
                        eVar.a(messageObtainMessage, iMax, true);
                    }
                }
            } catch (Throwable th2) {
                po.e.a("Customizable-Player", "checking it！！！");
                th2.printStackTrace();
            }
            return false;
        }

        private c() {
            this.f45879a = 0;
        }
    }

    static class e extends Handler {
        public boolean a(Message message, int i, boolean z) {
            if (z) {
                b();
            }
            return sendMessageDelayed(message, i);
        }

        public void b() {
            removeMessages(1005);
            removeMessages(1006);
            removeMessages(1008);
            removeMessages(1099);
            removeMessages(1007);
            removeMessages(1003);
            removeMessages(1001);
            removeMessages(1020);
            removeMessages(1002);
        }

        e(Looper looper, Handler.Callback callback) {
            super(looper, callback);
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45876a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f45878c;
        int d;
        String e;

        @Override // java.lang.Runnable
        public void run() {
            ps.this.e.start(pm.c(this.e, this.f45876a, this.f45878c, this.d));
        }

        a(String str, int i, int i2, int i3) {
            this.e = str;
            this.f45876a = i;
            this.f45878c = i2;
            this.d = i3;
        }
    }

    public ps(IHapticEffectPerformer iHapticEffectPerformer) {
        pq pqVar = new pq();
        this.f45874b = pqVar;
        po.e.b("Customizable-Player", "initialize!");
        if (iHapticEffectPerformer == null) {
            po.e.a("Customizable-Player", "CustomizableHapticPlayer() null == performer");
            pqVar.c(2, 0);
        }
        this.e = iHapticEffectPerformer;
        HandlerThread handlerThread = new HandlerThread("Customizable-Player");
        this.f45875c = handlerThread;
        handlerThread.start();
        this.f45873a = new e(handlerThread.getLooper(), new c());
    }
}
