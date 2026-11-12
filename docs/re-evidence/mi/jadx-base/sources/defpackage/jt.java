package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Ljt;", "Luj;", "", PluginDeviceInfo.FDESC, "()V", "Ln1t;", "device", "<init>", "(Ln1t;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class jt implements uj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n1t f23101a;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "status", "Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;", "sportConfig", "", PluginDeviceInfo.FMODEL, "(ILcom/xiaomi/hm/health/bt/profile/sport/SportConfig;)V"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function2<Integer, SportConfig, Unit> {
        public a() {
            super(2);
        }

        public final void a(int i, @Nullable SportConfig sportConfig) {
            t5t.d("SportEventListenerSetter", "On sport event:" + i + ',' + sportConfig);
            if (i == 0 && sportConfig != null) {
                byte[] bArr = {0, sportConfig.isNeedGps(), sportConfig.getSportKind().getKind()};
                jt jtVar = jt.this;
                jtVar.a(jtVar.f23101a, ik.SPORT, bArr);
            } else {
                t5t.d("SportEventListenerSetter", "Do nothing with event:" + i + ',' + sportConfig);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, SportConfig sportConfig) {
            a(num.intValue(), sportConfig);
            return Unit.INSTANCE;
        }
    }

    public jt(@NotNull n1t device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f23101a = device;
    }

    @Override // defpackage.uj
    public void b() {
        h3.f19635a.a(new a());
    }

    @Override // defpackage.uj
    public void a(@NotNull kd kdVar, @NotNull ik ikVar, @Nullable byte[] bArr) {
        uj.a.a(this, kdVar, ikVar, bArr);
    }

    @Override // defpackage.uj
    public void a() {
        uj.a.a(this);
    }
}
