package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u000bR1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR1\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u000e\u0010\u0005\u0012\u0004\b\u0011\u0010\u000b\u001a\u0004\b\b\u0010\u000f\"\u0004\b\b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lop;", "", "Lw0;", "<set-?>", "proxy$delegate", "Lkotlin/properties/ReadWriteProperty;", PluginDeviceInfo.FDESC, "()Lw0;", PluginDeviceInfo.FMODEL, "(Lw0;)V", "getProxy$annotations", "()V", "proxy", "Llh;", "deviceFeature$delegate", "()Llh;", "(Llh;)V", "getDeviceFeature$annotations", "deviceFeature", "<init>", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class op {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final op f29351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f29352b;

    @NotNull
    public static final ReadWriteProperty c;

    @NotNull
    public static final ReadWriteProperty d;

    static {
        op opVar = f29351a;
        f29352b = new KProperty[]{Reflection.mutableProperty0(new MutablePropertyReference0Impl(opVar, op.class, "proxy", "getProxy()Lcom/xiaomi/hm/health/bt/proxy/BTNameCallback;", 0)), Reflection.mutableProperty0(new MutablePropertyReference0Impl(opVar, op.class, "deviceFeature", "getDeviceFeature()Lcom/xiaomi/hm/health/bt/device/IDeviceFeature;", 0))};
        f29351a = new op();
        Delegates delegates = Delegates.INSTANCE;
        c = delegates.notNull();
        d = delegates.notNull();
    }

    public static final void a(@NotNull w0 w0Var) {
        Intrinsics.checkNotNullParameter(w0Var, "<set-?>");
        c.setValue(f29351a, f29352b[0], w0Var);
    }

    @NotNull
    public static final w0 b() {
        return (w0) c.getValue(f29351a, f29352b[0]);
    }

    @NotNull
    public static final lh a() {
        return (lh) d.getValue(f29351a, f29352b[1]);
    }

    public static final void a(@NotNull lh lhVar) {
        Intrinsics.checkNotNullParameter(lhVar, "<set-?>");
        d.setValue(f29351a, f29352b[1], lhVar);
    }
}
