package defpackage;

import com.google.android.gms.common.Scopes;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0011\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\n\u0010\f¨\u0006\u0013"}, d2 = {"Lxg;", "Lkvs;", "", "enable", "", "interval", PluginDeviceInfo.FMODEL, "(ZI)Z", "(I)Z", "(Z)Z", PluginDeviceInfo.FDESC, "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "()Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "Lx7t;", Scopes.PROFILE, "Lkd;", "device", "<init>", "(Lx7t;Lkd;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class xg extends kvs {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f39087k = new a(null);

    @NotNull
    public final x7t j;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lxg$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(@NotNull x7t profile, @Nullable kd kdVar) {
        super(profile, kdVar);
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.j = profile;
    }

    public static final boolean b(int i) {
        t5t.d("HmNewHeartRateController", "set all day heartrate interval:" + i + " fail by response null");
        return false;
    }

    public static final boolean c(boolean z, int i) {
        t5t.d("HmNewHeartRateController", "set all day heartrate enable:" + z + " interval:" + i + " fail by response null");
        return false;
    }

    public static final boolean d(boolean z) {
        t5t.d("HmNewHeartRateController", "set rem enable:" + z + " fail by response null");
        return false;
    }

    @Override // defpackage.kvs
    public boolean a(boolean enable, int interval) {
        Boolean boolA = this.j.f().a(enable ? interval : 0);
        if (boolA == null) {
            return c(enable, interval);
        }
        t5t.d("HmNewHeartRateController", "set all day heartrate enable:" + enable + " interval:" + interval + " result:" + boolA.booleanValue());
        return boolA.booleanValue();
    }

    public static final boolean c(boolean z) {
        t5t.d("HmNewHeartRateController", "set atrial fib enable:" + z + " fail by response null");
        return false;
    }

    @Override // defpackage.kvs
    public boolean b(boolean enable) {
        Boolean boolC = this.j.f().c(enable);
        if (boolC == null) {
            return d(enable);
        }
        t5t.d("HmNewHeartRateController", "set rem enable:" + enable + " result:" + boolC.booleanValue());
        return boolC.booleanValue();
    }

    @Override // defpackage.kvs
    public boolean a(int interval) {
        Boolean boolA = this.j.f().a(interval);
        if (boolA != null) {
            t5t.d("HmNewHeartRateController", "set all day heartrate interval:" + interval + " result:" + boolA.booleanValue());
            return boolA.booleanValue();
        }
        return b(interval);
    }

    @Override // defpackage.kvs
    public boolean b(boolean enable, int interval) {
        return a(enable, interval) && b(enable);
    }

    @Override // defpackage.kvs
    @Nullable
    public HeartRateConfig b() {
        boolean zAreEqual = Intrinsics.areEqual(this.j.f().b(), Boolean.TRUE);
        Integer numE = this.j.f().e();
        return new HeartRateConfig(zAreEqual, numE != null ? numE.intValue() : 0);
    }

    @Override // defpackage.kvs
    public boolean a(boolean enable) {
        Boolean atrialFibEnable = this.j.f().setAtrialFibEnable(enable);
        if (atrialFibEnable != null) {
            t5t.d("HmNewHeartRateController", "set atrial fib enable:" + enable + " result:" + atrialFibEnable.booleanValue());
            return atrialFibEnable.booleanValue();
        }
        return c(enable);
    }
}
