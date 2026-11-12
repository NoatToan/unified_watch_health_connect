package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00050 ¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u0007J\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0006\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0006\u0010\u0018R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lmv;", "Lxh;", "Lzat;", "", "none", "", PluginDeviceInfo.FMODEL, "(I)V", "", "result", "onFwStop", "(Z)V", "errorCode", "onError", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", BroadcastsKt.SILENT_PUSHING_PROGRESS, "onFwProgress", "(Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;)V", "Lyd;", "type", "(Lyd;Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;)V", "()Z", "", "message", "(Ljava/lang/String;)V", "logObservable$delegate", "Lkotlin/Lazy;", PluginDeviceInfo.FDESC, "()Lzat;", "logObservable", "Ljys;", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", LifecycleConstantKt.ON_STOP, "<init>", "(Ljys;Lkotlin/jvm/functions/Function1;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class mv implements xh, zat {

    @NotNull
    public final jys t;

    @NotNull
    public final Function1<Boolean, Unit> u;

    @NotNull
    public final Lazy v;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Lzat;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<zat> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zat invoke() {
            return (zat) (mv.this.t instanceof zat ? mv.this.t : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mv(@NotNull jys callback, @NotNull Function1<? super Boolean, Unit> onStop) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(onStop, "onStop");
        this.t = callback;
        this.u = onStop;
        this.v = LazyKt__LazyJVMKt.lazy(new a());
    }

    public final zat b() {
        return (zat) this.v.getValue();
    }

    @Override // defpackage.yh
    public void onError(int errorCode) {
        jys jysVar = this.t;
        if (jysVar instanceof yh) {
            ((yh) jysVar).onError(errorCode);
        }
    }

    @Override // defpackage.xh, defpackage.yh, defpackage.jys
    public void onFwProgress(@Nullable Progress progress) {
        zat zatVarB = b();
        if (zatVarB != null) {
            zatVarB.a(String.valueOf(progress));
        }
        this.t.onFwProgress(progress);
    }

    @Override // defpackage.xh, defpackage.yh, defpackage.jys
    public void onFwStop(boolean result) {
        this.u.invoke2(Boolean.valueOf(result));
        this.t.onFwStop(result);
        zat zatVarB = b();
        if (zatVarB != null) {
            zatVarB.a("stop with result: " + result);
        }
    }

    @Override // defpackage.xh, defpackage.yh, defpackage.jys
    public void a(int none) {
        this.t.a(none);
    }

    @Override // defpackage.yh
    public void a(@NotNull yd type, @NotNull Progress progress) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(progress, "progress");
        jys jysVar = this.t;
        if (jysVar instanceof yh) {
            ((yh) jysVar).a(type, progress);
        }
        zat zatVarB = b();
        if (zatVarB != null) {
            zatVarB.a(type + " -- " + progress);
        }
    }

    @Override // defpackage.xh
    public boolean a() {
        jys jysVar = this.t;
        if (jysVar instanceof xh) {
            return ((xh) jysVar).a();
        }
        return false;
    }

    @Override // defpackage.zat
    public void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        zat zatVarB = b();
        if (zatVarB != null) {
            zatVarB.a(message);
        }
    }
}
