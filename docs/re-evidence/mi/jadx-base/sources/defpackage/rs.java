package defpackage;

import com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lrs;", "Luj;", "", PluginDeviceInfo.FDESC, "()V", "Ln1t;", "device", "<init>", "(Ln1t;)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class rs implements uj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n1t f32840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<qs, Unit> f32841b;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a t = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "没有获取到睡眠监听模块";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqs;", "state", "", PluginDeviceInfo.FMODEL, "(Lqs;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<qs, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull qs state) {
            ik ikVar;
            Intrinsics.checkNotNullParameter(state, "state");
            if (Intrinsics.areEqual(state, qs.b.c)) {
                ikVar = ik.AWAKING;
            } else {
                if (!Intrinsics.areEqual(state, qs.a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                ikVar = ik.SLEEPING;
            }
            ik ikVar2 = ikVar;
            rs rsVar = rs.this;
            uj.a.a(rsVar, rsVar.f32840a, ikVar2, null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(qs qsVar) {
            a(qsVar);
            return Unit.INSTANCE;
        }
    }

    public rs(@NotNull n1t device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f32840a = device;
        this.f32841b = new b();
    }

    @Override // defpackage.uj
    public void b() {
        if (this.f32840a.a(29)) {
            OpenAppModule openAppModule = (OpenAppModule) this.f32840a.y(OpenAppModule.class);
            if (openAppModule == null) {
                le.c("SleepStateEventAdapter", a.t);
            } else {
                openAppModule.registerSleepStateListener(this.f32841b);
            }
        }
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
