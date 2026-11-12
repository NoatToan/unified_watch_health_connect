package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lqf;", "Lqct;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "([B)V", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "Lwf;", "protocolVersion", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;Lwf;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class qf implements qct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.huami.bluetooth.profile.channel.module.a f31460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f31461b;

    @NotNull
    public final HearingAidProtocolVersion c;
    public final long d;

    @Nullable
    public vf e;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(Object obj) {
            super(1, obj, qf.class, "onDeviceCommand", "onDeviceCommand([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((qf) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"qf$b", "Lnq;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements nq {
        @Override // defpackage.nq
        public boolean a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return true;
        }
    }

    public qf(@NotNull com.huami.bluetooth.profile.channel.module.a module, @NotNull HearingAidProtocolVersion protocolVersion) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
        this.f31460a = module;
        this.f31461b = "HearingAid";
        module.registerDeviceRequestHandler(new g7(new a(this), new b()));
        this.c = protocolVersion;
        this.d = 40000L;
    }

    public final void a(byte[] byteArray) {
        w2 w2Var = new w2(byteArray, 0, 2, null);
        w2Var.c();
        int iC = w2Var.c();
        t5t.d(this.f31461b, "get sn: " + tet.h(byteArray));
        if (iC == tf.b.d.getF34634b()) {
            int iC2 = w2Var.c();
            String strD = w2Var.d();
            vf vfVar = this.e;
            if (vfVar != null) {
                vfVar.a(uf.u.a(iC2), strD);
            }
        }
    }
}
