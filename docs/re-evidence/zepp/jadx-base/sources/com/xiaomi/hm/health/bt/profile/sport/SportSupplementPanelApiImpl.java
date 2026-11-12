package com.xiaomi.hm.health.bt.profile.sport;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.sport.CallbackHolder;
import com.huami.bluetooth.profile.channel.module.sport.SportSupplementPanelModule;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.sport.SportSupplementPanelApiImpl;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0017\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/sport/SportSupplementPanelApiImpl;", "Lcom/xiaomi/hm/health/bt/profile/sport/ISportSupplementPanelApi;", "", "g", "h", "Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;", "sportConfig", "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "initPanel", "Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;", "command", "Lcom/xiaomi/hm/health/bt/profile/sport/SportInfo;", "sportInfo", SessionDescription.n, "controlWithoutHeartbeat", "release", "Lkotlin/Function0;", "Lcom/huami/bluetooth/profile/channel/module/sport/SportSupplementPanelModule;", "a", "Lkotlin/jvm/functions/Function0;", "sportModule", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/ExecutorService;", "fixedThreadPool", "Ljava/util/Timer;", "c", "Ljava/util/Timer;", "mTimer", "Ljava/util/TimerTask;", GoogleApiAvailabilityLight.a, "Ljava/util/TimerTask;", "mTask", "", "e", "Ljava/lang/Object;", "mTimerObj", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SportSupplementPanelApiImpl implements ISportSupplementPanelApi {

    @NotNull
    private static final String f = "SportSupplementPanelApiImpl";
    private static final long g = 5000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<SportSupplementPanelModule> sportModule;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Timer mTimer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TimerTask mTask;
    private static int h = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ExecutorService fixedThreadPool = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Object mTimerObj = new Object();

    public SportSupplementPanelApiImpl(@NotNull Function0<SportSupplementPanelModule> function0) {
        this.sportModule = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SportCommand sportCommand, SportSupplementPanelApiImpl sportSupplementPanelApiImpl, SportInfo sportInfo) {
        if (h != 0) {
            return;
        }
        Debug.i(f, "sendCommand start");
        if (sportCommand == SportCommand.PAUSE) {
            sportSupplementPanelApiImpl.g();
        } else if (sportCommand == SportCommand.RESUME || sportCommand == SportCommand.STOP) {
            sportSupplementPanelApiImpl.h();
        }
        SportSupplementPanelModule sportSupplementPanelModuleInvoke = sportSupplementPanelApiImpl.sportModule.invoke();
        boolean z = false;
        if (sportSupplementPanelModuleInvoke != null && sportSupplementPanelModuleInvoke.sendControlCommand(sportCommand, sportInfo)) {
            z = true;
        }
        Debug.i(f, Intrinsics.stringPlus("sendCommand stop:", Boolean.valueOf(z)));
        if (sportCommand == SportCommand.STOP) {
            h = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SportCommand sportCommand, SportSupplementPanelApiImpl sportSupplementPanelApiImpl, SportInfo sportInfo) {
        if (h != 1) {
            Debug.fi(f, Intrinsics.stringPlus("不是来自设备发起的运动: ", sportCommand));
            return;
        }
        Debug.i(f, "sendCommandPiece start");
        if (sportCommand == SportCommand.STOP) {
            h = -1;
            return;
        }
        SportSupplementPanelModule sportSupplementPanelModuleInvoke = sportSupplementPanelApiImpl.sportModule.invoke();
        if (sportSupplementPanelModuleInvoke == null) {
            return;
        }
        sportSupplementPanelModuleInvoke.sendControlCommand(sportCommand, sportInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(IHMSportListener iHMSportListener, SportConfig sportConfig, SportSupplementPanelApiImpl sportSupplementPanelApiImpl) {
        boolean z = true;
        if (h == 1) {
            return;
        }
        CallbackHolder.INSTANCE.registerControlCallback(iHMSportListener);
        h = sportConfig.getSource();
        Debug.fi(f, "sendConfig start");
        if (h == 0) {
            SportSupplementPanelModule sportSupplementPanelModuleInvoke = sportSupplementPanelApiImpl.sportModule.invoke();
            if (!(sportSupplementPanelModuleInvoke == null ? false : sportSupplementPanelModuleInvoke.config(sportConfig))) {
                z = false;
            }
        }
        Debug.fi(f, Intrinsics.stringPlus("sendConfig stop:", Boolean.valueOf(z)));
    }

    private final void g() {
        synchronized (this.mTimerObj) {
            TimerTask timerTask = this.mTask;
            if (timerTask != null) {
                timerTask.cancel();
            }
            Timer timer = this.mTimer;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = this.mTimer;
            if (timer2 != null) {
                timer2.purge();
            }
            this.mTimer = new Timer("sport");
            TimerTask timerTask2 = new TimerTask() { // from class: com.xiaomi.hm.health.bt.profile.sport.SportSupplementPanelApiImpl$startTimer$1$1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    SportSupplementPanelModule sportSupplementPanelModule = (SportSupplementPanelModule) this.a.sportModule.invoke();
                    if (sportSupplementPanelModule == null) {
                        return;
                    }
                    sportSupplementPanelModule.alive();
                }
            };
            this.mTask = timerTask2;
            Timer timer3 = this.mTimer;
            if (timer3 != null) {
                timer3.schedule(timerTask2, 5000L, 5000L);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    private final void h() {
        synchronized (this.mTimerObj) {
            TimerTask timerTask = this.mTask;
            if (timerTask != null) {
                timerTask.cancel();
            }
            Timer timer = this.mTimer;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = this.mTimer;
            if (timer2 != null) {
                timer2.purge();
            }
            this.mTimer = null;
            this.mTask = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.sport.ISportSupplementPanelApi
    public void control(@NotNull final SportCommand command, @Nullable final SportInfo sportInfo) {
        Debug.i(f, Intrinsics.stringPlus("sendCommand:", command));
        this.fixedThreadPool.execute(new Runnable() { // from class: id7
            @Override // java.lang.Runnable
            public final void run() {
                SportSupplementPanelApiImpl.d(command, this, sportInfo);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.profile.sport.ISportSupplementPanelApi
    public void controlWithoutHeartbeat(@NotNull final SportCommand command, @Nullable final SportInfo sportInfo) {
        Debug.i(f, Intrinsics.stringPlus("sendCommandPiece:", command));
        this.fixedThreadPool.execute(new Runnable() { // from class: jd7
            @Override // java.lang.Runnable
            public final void run() {
                SportSupplementPanelApiImpl.e(command, this, sportInfo);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.profile.sport.ISportSupplementPanelApi
    public void initPanel(@NotNull final SportConfig sportConfig, @NotNull final IHMSportListener listener) {
        this.fixedThreadPool.execute(new Runnable() { // from class: hd7
            @Override // java.lang.Runnable
            public final void run() {
                SportSupplementPanelApiImpl.f(listener, sportConfig, this);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.profile.sport.ISportSupplementPanelApi
    public void release() {
        h = -1;
    }
}
