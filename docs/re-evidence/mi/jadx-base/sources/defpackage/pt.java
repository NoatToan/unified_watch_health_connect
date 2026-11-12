package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.sport.SportSupplementPanelModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0007\u0010\rJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u000fJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0016"}, d2 = {"Lpt;", "Laj;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;", "sportConfig", "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", PluginDeviceInfo.FMODEL, "(Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;)V", "Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;", "command", "Lr6t;", "sportInfo", "(Lcom/xiaomi/hm/health/bt/profile/sport/SportCommand;Lr6t;)V", PluginDeviceInfo.FDESC, "()V", PluginDeviceInfo.FICONON, "Lkotlin/Function0;", "Lcom/huami/bluetooth/profile/channel/module/sport/SportSupplementPanelModule;", "sportModule", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class pt implements aj {

    @NotNull
    public static final a f = new a(null);
    public static int g = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<SportSupplementPanelModule> f30723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f30724b;

    @Nullable
    public Timer c;

    @Nullable
    public TimerTask d;

    @NotNull
    public final Object e;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lpt$a;", "", "", "HEART_BEAT", "J", "", "TAG", "Ljava/lang/String;", "", "source", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"pt$b", "Ljava/util/TimerTask;", "", "run", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            SportSupplementPanelModule sportSupplementPanelModule = (SportSupplementPanelModule) pt.this.f30723a.invoke();
            if (sportSupplementPanelModule != null) {
                sportSupplementPanelModule.alive();
            }
        }
    }

    public pt(@NotNull Function0<SportSupplementPanelModule> sportModule) {
        Intrinsics.checkNotNullParameter(sportModule, "sportModule");
        this.f30723a = sportModule;
        this.f30724b = Executors.newSingleThreadExecutor();
        this.e = new Object();
    }

    @Override // defpackage.aj
    public void b(@NotNull final SportCommand command, @Nullable final r6t sportInfo) {
        Intrinsics.checkNotNullParameter(command, "command");
        t5t.m("SportSupplementPanelApiImpl", "sendCommandPiece:" + command);
        this.f30724b.execute(new Runnable() { // from class: uct
            @Override // java.lang.Runnable
            public final void run() {
                pt.b(command, this, sportInfo);
            }
        });
    }

    public final void c() {
        synchronized (this.e) {
            try {
                TimerTask timerTask = this.d;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                Timer timer = this.c;
                if (timer != null) {
                    timer.cancel();
                }
                Timer timer2 = this.c;
                if (timer2 != null) {
                    timer2.purge();
                }
                this.c = null;
                this.d = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.aj
    public void a(@NotNull final SportConfig sportConfig, @NotNull final IHMSportListener listener) {
        Intrinsics.checkNotNullParameter(sportConfig, "sportConfig");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30724b.execute(new Runnable() { // from class: vct
            @Override // java.lang.Runnable
            public final void run() {
                pt.a(listener, sportConfig, this);
            }
        });
    }

    public static final void a(IHMSportListener listener, SportConfig sportConfig, pt this$0) {
        SportSupplementPanelModule sportSupplementPanelModuleInvoke;
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sportConfig, "$sportConfig");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = true;
        if (g == 1) {
            return;
        }
        h3.f19635a.a(listener);
        g = sportConfig.getSource();
        t5t.d("SportSupplementPanelApiImpl", "sendConfig start");
        if (g == 0 && ((sportSupplementPanelModuleInvoke = this$0.f30723a.invoke()) == null || !sportSupplementPanelModuleInvoke.config(sportConfig))) {
            z = false;
        }
        t5t.d("SportSupplementPanelApiImpl", "sendConfig stop:" + z);
    }

    public static final void b(SportCommand command, pt this$0, r6t r6tVar) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (g != 1) {
            t5t.d("SportSupplementPanelApiImpl", "不是来自设备发起的运动: " + command);
            return;
        }
        t5t.m("SportSupplementPanelApiImpl", "sendCommandPiece start");
        if (command != SportCommand.STOP) {
            SportSupplementPanelModule sportSupplementPanelModuleInvoke = this$0.f30723a.invoke();
            if (sportSupplementPanelModuleInvoke != null) {
                sportSupplementPanelModuleInvoke.sendControlCommand(command, r6tVar);
                return;
            }
            return;
        }
        g = -1;
    }

    @Override // defpackage.aj
    public void a(@NotNull final SportCommand command, @Nullable final r6t sportInfo) {
        Intrinsics.checkNotNullParameter(command, "command");
        t5t.m("SportSupplementPanelApiImpl", "sendCommand:" + command);
        this.f30724b.execute(new Runnable() { // from class: wct
            @Override // java.lang.Runnable
            public final void run() {
                pt.a(command, this, sportInfo);
            }
        });
    }

    public final void b() {
        synchronized (this.e) {
            try {
                TimerTask timerTask = this.d;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                Timer timer = this.c;
                if (timer != null) {
                    timer.cancel();
                }
                Timer timer2 = this.c;
                if (timer2 != null) {
                    timer2.purge();
                }
                this.c = new Timer("sport");
                b bVar = new b();
                this.d = bVar;
                Timer timer3 = this.c;
                if (timer3 != null) {
                    timer3.schedule(bVar, 5000L, 5000L);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    public static final void a(SportCommand command, pt this$0, r6t r6tVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (g != 0) {
            return;
        }
        t5t.m("SportSupplementPanelApiImpl", "sendCommand start");
        if (command == SportCommand.PAUSE) {
            this$0.b();
        } else if (command == SportCommand.RESUME || command == SportCommand.STOP) {
            this$0.c();
        }
        SportSupplementPanelModule sportSupplementPanelModuleInvoke = this$0.f30723a.invoke();
        if (sportSupplementPanelModuleInvoke != null) {
            z = sportSupplementPanelModuleInvoke.sendControlCommand(command, r6tVar);
        }
        t5t.m("SportSupplementPanelApiImpl", "sendCommand stop:" + z);
        if (command == SportCommand.STOP) {
            g = -1;
        }
    }

    @Override // defpackage.aj
    public void a() {
        g = -1;
    }
}
