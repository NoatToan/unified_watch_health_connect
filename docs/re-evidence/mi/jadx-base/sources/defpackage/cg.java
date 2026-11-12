package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0005\u0010\u0015J\u0017\u0010\u000f\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000f\u0010\u0018J\u0017\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0005\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\f\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\f\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0018¨\u0006$"}, d2 = {"Lcg;", "Ll5s;", "", "bytes", "", PluginDeviceInfo.FMODEL, "([B)V", "data", "Ljava/util/HashMap;", "Lf7;", "Lp1;", "Lkotlin/collections/HashMap;", PluginDeviceInfo.FDESC, "([B)Ljava/util/HashMap;", "Ly8;", PluginDeviceInfo.FICONON, "([B)Ly8;", "Lw2;", "bufDecoder", "", "flag", "(Lw2;I)Lp1;", "type", "", "(I)Z", PluginDeviceInfo.FLOCALIZATIONS, "h", PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FICONOFF, "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "Lwf;", "version", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;Lwf;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class cg implements l5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.huami.bluetooth.profile.channel.module.a f5294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HearingAidProtocolVersion f5295b;

    @NotNull
    public final String c;

    @Nullable
    public fg d;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(Object obj) {
            super(1, obj, cg.class, "onDeviceCommand", "onDeviceCommand([B)V", 0);
        }

        public final void a(@NotNull byte[] p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((cg) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"cg$b", "Lnq;", "", "byteArray", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements nq {
        @Override // defpackage.nq
        public boolean a(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            return true;
        }
    }

    public cg(@NotNull com.huami.bluetooth.profile.channel.module.a module, @NotNull HearingAidProtocolVersion version) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f5294a = module;
        this.f5295b = version;
        this.c = "HearingBatteryApiImpl";
        module.registerDeviceRequestHandler(new g7(new a(this), new b()));
    }

    public final boolean a(int type) {
        return ((type >>> 1) & 1) == 1;
    }

    public final boolean b(int flag) {
        return flag == 1;
    }

    public final boolean c(int type) {
        return type == 1;
    }

    public final boolean d(int flag) {
        return ((flag >>> 3) & 1) == 1;
    }

    public final boolean e(int flag) {
        return ((flag >>> 2) & 1) == 1;
    }

    public final boolean f(int flag) {
        return ((flag >>> 1) & 1) == 1;
    }

    public final boolean g(int type) {
        return ((type >>> 2) & 1) == 1;
    }

    public final boolean h(int type) {
        return ((type >>> 3) & 1) == 1;
    }

    public final HashMap<f7, p1> b(byte[] data) {
        t5t.d(this.c, "parse data: " + tet.x(data));
        HashMap<f7, p1> map = new HashMap<>();
        w2 w2Var = new w2(data, 0, 2, null);
        int iC = w2Var.c();
        int iC2 = w2Var.c();
        int iC3 = w2Var.c();
        t5t.d(this.c, "response cmd: " + iC + " hex: " + tet.x(c3.a(iC, 0, 1, null)));
        t5t.d(this.c, "type: " + iC2 + " hex: " + tet.x(c3.a(iC2, 0, 1, null)));
        t5t.d(this.c, "flag: " + iC3 + " hex: " + tet.x(c3.a(iC3, 0, 1, null)));
        boolean zC = c(iC2);
        boolean zA = a(iC2);
        boolean zG = g(iC2);
        boolean zH = h(iC2);
        t5t.d(this.c, "headset: " + zC + ", charge: " + zA + ", left: " + zG + ", right: " + zH);
        if (zC) {
            map.put(f7.HEADSET, a(w2Var, iC3));
        }
        if (zA) {
            map.put(f7.CHARGE_HOUSE, a(w2Var, iC3));
        }
        if (zG) {
            map.put(f7.LEFT_EAR_PHONE, a(w2Var, iC3));
        }
        if (zH) {
            map.put(f7.RIGHT_EAR_PHONE, a(w2Var, iC3));
        }
        return map;
    }

    public final EarphoneStatus c(byte[] data) {
        t5t.d(this.c, "parse data: " + tet.x(data));
        w2 w2Var = new w2(data, 0, 2, null);
        w2Var.c();
        return new EarphoneStatus(w2Var.c() == 1, w2Var.c() == 1);
    }

    public final void a(byte[] bytes) {
        fg fgVar;
        t5t.d(this.c, "onDeviceCommand: " + tet.x(bytes));
        int iC = new w2(bytes, 0, 2, null).c();
        if (iC == dg.b.c.getF15501a()) {
            fg fgVar2 = this.d;
            if (fgVar2 != null) {
                fgVar2.a(b(bytes));
                return;
            }
            return;
        }
        if (iC != dg.c.c.getF15501a() || (fgVar = this.d) == null) {
            return;
        }
        fgVar.a(c(bytes));
    }

    public final p1 a(w2 bufDecoder, int flag) {
        p1 p1Var = new p1(0, false, null, null, 0, 31, null);
        p1Var.b(bufDecoder.c());
        boolean zB = b(flag);
        boolean zF = f(flag);
        boolean zE = e(flag);
        boolean zD = d(flag);
        t5t.d(this.c, "charge status: " + zB + ", full charge: " + zF + ", last charge: " + zE + ", last level: " + zD);
        if (zB) {
            p1Var.a(bufDecoder.b());
        }
        if (zF) {
            p1Var.a(ProfileUtils.getTimezone((byte) bufDecoder.c()).getDisplayName() + ' ' + bufDecoder.a(2) + '-' + bufDecoder.c() + '-' + bufDecoder.c() + ' ' + bufDecoder.c() + AbstractJsonLexerKt.COLON + bufDecoder.c() + AbstractJsonLexerKt.COLON + bufDecoder.c());
        }
        if (zE) {
            p1Var.a(ProfileUtils.getTimezone((byte) bufDecoder.c()).getDisplayName() + ' ' + bufDecoder.a(2) + '-' + bufDecoder.c() + '-' + bufDecoder.c() + ' ' + bufDecoder.c() + AbstractJsonLexerKt.COLON + bufDecoder.c() + AbstractJsonLexerKt.COLON + bufDecoder.c());
        }
        if (zD) {
            p1Var.a(bufDecoder.c());
        }
        t5t.d(this.c, p1Var.toString());
        return p1Var;
    }
}
