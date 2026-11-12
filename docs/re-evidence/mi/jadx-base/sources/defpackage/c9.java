package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB)\u0012\u0006\u0010!\u001a\u00020 \u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010(J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0002J\u001e\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0011\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\b\u0010\u0014J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0004\u0010\u0015J\u0011\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000eJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0011J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¨\u0006)"}, d2 = {"Lc9;", "Lb9;", "", "", PluginDeviceInfo.FICONOFFLINE, "Ljq$a;", "command", "data", PluginDeviceInfo.FMODEL, "Lqe;", PluginDeviceInfo.FDESC, "Ljq;", "request", PluginDeviceInfo.FICONON, "()Ljava/lang/Boolean;", "isEnable", "setAtrialFibEnable", "(Z)Ljava/lang/Boolean;", "", "interval", "(I)Ljava/lang/Boolean;", "()Ljava/lang/Integer;", PluginDeviceInfo.FICONOFF, "isNewHealthDetect", "getOsaEnable", "enableSmartSpo2", "getSmartSpo2Enable", "value", "setLowSpo2AlertValue", "getLowSpo2AlertValue", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "Ln2;", "characteristic", "Lkotlin/Function0;", "supportHeadsetKnockNew", "Lt8;", "ecfInterceptor", "<init>", "(Ln2;Lkotlin/jvm/functions/Function0;Lt8;)V", "(Ln2;Lt8;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class c9 implements b9 {

    @NotNull
    public static final b e = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final n2 f5061b;

    @NotNull
    public final Function0<Boolean> c;

    @Nullable
    public final t8 d;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public static final a t = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lc9$b;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c9(@NotNull n2 characteristic, @NotNull Function0<Boolean> supportHeadsetKnockNew, @Nullable t8 t8Var) {
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        Intrinsics.checkNotNullParameter(supportHeadsetKnockNew, "supportHeadsetKnockNew");
        this.f5061b = characteristic;
        this.c = supportHeadsetKnockNew;
        this.d = t8Var;
    }

    @Override // defpackage.b9
    @Nullable
    public qe a() {
        return a(this, a9.c.f783b, null, 2, null);
    }

    @Override // defpackage.b9
    @Nullable
    public Boolean b() {
        byte[] data;
        qe qeVarA = a(this, new a9.f(hv.g.f20497b, true), null, 2, null);
        if (qeVarA == null || !qeVarA.k() || (data = qeVarA.i()) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        if (!(!(data.length == 0))) {
            data = null;
        }
        if (data != null) {
            return Boolean.valueOf(c3.a(data[0]));
        }
        return null;
    }

    @Override // defpackage.b9
    @Nullable
    public Boolean c() {
        byte[] data;
        qe qeVarA = a(this, new a9.f(hv.a.f20492b, true), null, 2, null);
        if (qeVarA == null || !qeVarA.k() || (data = qeVarA.i()) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        if (!(!(data.length == 0))) {
            data = null;
        }
        if (data != null) {
            return Boolean.valueOf(c3.a(data[0]));
        }
        return null;
    }

    @Override // defpackage.b9
    public boolean d(boolean isEnable) {
        return a(new a9.b(p9.c.f30134b), e(isEnable));
    }

    @Override // defpackage.b9
    @Nullable
    public Integer e() {
        byte[] data;
        qe qeVarA = a(this, new a9.f(hv.c.f20493b, true), null, 2, null);
        if (qeVarA == null || !qeVarA.k() || (data = qeVarA.i()) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        if (!(!(data.length == 0))) {
            data = null;
        }
        if (data != null) {
            return Integer.valueOf(data[0]);
        }
        return null;
    }

    @Override // defpackage.b9
    public boolean enableSmartSpo2(boolean isEnable) {
        return a(new a9.f(hv.h.f20498b, false), e(isEnable));
    }

    @Override // defpackage.b9
    @Nullable
    public Integer getLowSpo2AlertValue() {
        byte[] data;
        qe qeVarA = a(this, new a9.f(hv.d.f20494b, true), null, 2, null);
        if (qeVarA == null || !qeVarA.k() || (data = qeVarA.i()) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        if (!(!(data.length == 0))) {
            data = null;
        }
        if (data != null) {
            return Integer.valueOf(data[0] & 255);
        }
        return null;
    }

    @Override // defpackage.b9
    @Nullable
    public Boolean getOsaEnable() {
        byte[] data;
        qe qeVarA = a(this, new a9.f(hv.e.f20495b, true), null, 2, null);
        if (qeVarA == null || !qeVarA.k() || (data = qeVarA.i()) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        if (!(!(data.length == 0))) {
            data = null;
        }
        if (data != null) {
            return Boolean.valueOf(c3.a(data[0]));
        }
        return null;
    }

    @Override // defpackage.b9
    @Nullable
    public Boolean getSmartSpo2Enable() {
        byte[] data;
        qe qeVarA = a(this, new a9.f(hv.h.f20498b, true), null, 2, null);
        if (qeVarA == null || !qeVarA.k() || (data = qeVarA.i()) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        if (!(!(data.length == 0))) {
            data = null;
        }
        if (data != null) {
            return Boolean.valueOf(c3.a(data[0]));
        }
        return null;
    }

    @Override // defpackage.b9
    @Nullable
    public Boolean setAtrialFibEnable(boolean isEnable) {
        return Boolean.valueOf(a(new a9.f(hv.a.f20492b, false), e(isEnable)));
    }

    @Override // defpackage.b9
    public boolean setLowSpo2AlertValue(int value) {
        return a(new a9.f(hv.d.f20494b, false), new byte[]{(byte) value});
    }

    @Override // defpackage.b9
    @Nullable
    public Boolean a(int interval) {
        return Boolean.valueOf(a(new a9.f(hv.c.f20493b, false), new byte[]{(byte) interval}));
    }

    @Override // defpackage.b9
    @Nullable
    public Boolean d() {
        byte[] data;
        qe qeVarA = a(this, new a9.f(hv.f.f20496b, true), null, 2, null);
        if (qeVarA == null || !qeVarA.k() || (data = qeVarA.i()) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        if (!(!(data.length == 0))) {
            data = null;
        }
        if (data != null) {
            return Boolean.valueOf(c3.a(data[0]));
        }
        return null;
    }

    @Override // defpackage.b9
    public boolean a(boolean isEnable, boolean isNewHealthDetect) {
        if (isNewHealthDetect) {
            return a(new a9.f(hv.e.f20495b), e(isEnable));
        }
        return a(new a9.b(p9.d.f30135b), e(isEnable));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c9(@NotNull n2 characteristic, @Nullable t8 t8Var) {
        this(characteristic, a.t, t8Var);
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
    }

    @Override // defpackage.b9
    @Nullable
    public Boolean a(boolean isEnable) {
        return Boolean.valueOf(a(new a9.f(hv.f.f20496b, false), e(isEnable)));
    }

    @Override // defpackage.b9
    public boolean b(boolean isEnable) {
        return a(new a9.b(p9.e.f30136b), e(isEnable));
    }

    @Override // defpackage.b9
    @Nullable
    public Boolean c(boolean isEnable) {
        return Boolean.valueOf(a(new a9.f(hv.g.f20497b, false), e(isEnable)));
    }

    public final byte[] e(boolean z) {
        return new byte[]{c3.a(z)};
    }

    @Override // defpackage.b9
    public boolean a(@NotNull HMHrReminder hrReminder) {
        Intrinsics.checkNotNullParameter(hrReminder, "hrReminder");
        return a(new a9.b(p9.b.f30133b), hrReminder.toBytes());
    }

    public final qe b(jq.a command, byte[] data) {
        return b(new jq(command, data));
    }

    public final boolean a(jq.a command, byte[] data) {
        return a(new jq(command, data));
    }

    public final qe b(jq request) {
        qe qeVarH;
        synchronized (b9.f3931a.a()) {
            t8 t8Var = this.d;
            if (t8Var != null && t8Var.a(request.getF23009a())) {
                return this.d.b(request.getF23009a(), request.getF23010b());
            }
            t5t.d("EcfControllerImpl", "Send cmd: " + tet.x(request.getF23009a()));
            qe qeVarC = this.f5061b.c(request.getF23009a());
            if (qeVarC != null) {
                t5t.d("EcfControllerImpl", "Received: " + tet.x(qeVarC.j()));
                qeVarH = qe.h(qeVarC.j(), request.getF23010b());
            } else {
                qeVarH = null;
            }
            t5t.d("EcfControllerImpl", "Response: " + qeVarH);
            return qeVarH;
        }
    }

    public static /* synthetic */ qe a(c9 c9Var, jq.a aVar, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return c9Var.b(aVar, bArr);
    }

    public final boolean a(jq request) {
        qe qeVarB = b(request);
        if (qeVarB != null) {
            return qeVarB.k();
        }
        return false;
    }
}
