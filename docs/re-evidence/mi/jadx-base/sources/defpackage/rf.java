package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\nB\u000f\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J8\u0010\n\u001a\u00020\u0007\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0013\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0010H\u0002J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0011H\u0002J\f\u0010\f\u001a\u00020\u0003*\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0005H\u0014J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000e\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b\r\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u00105R\u001b\u0010:\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001c\u001a\u0004\b\t\u00109R\u001b\u0010>\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u001c\u001a\u0004\b\u0019\u0010=R\u001b\u0010B\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u001c\u001a\u0004\b\b\u0010AR\u0014\u0010F\u001a\u00020C8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006N²\u0006\u001c\u0010M\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010L0K8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lrf;", "Lsf;", "Lc1;", "Lw4;", "requestCmd", "", "data", "", PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FMODEL, PluginDeviceInfo.FICONON, PluginDeviceInfo.FDESC, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FLOCALIZATIONS, "cmd", "Lu4;", "", "T", "codec", "Leg;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lgg;", "rawData", "h", "Lng;", "highMidBassCodec$delegate", "Lkotlin/Lazy;", "()Lng;", "highMidBassCodec", "Lfw;", "versionCodec$delegate", Constant.KeyValue.KEY_COLUMN, "()Lfw;", "versionCodec", "Lir;", "scenesCodec$delegate", "i", "()Lir;", "scenesCodec", "Lw8;", "eqOrNRCodec$delegate", "()Lw8;", "eqOrNRCodec", "Lsw;", "wdrcCodec$delegate", com.xiaomi.onetrack.b.e.f13808a, "()Lsw;", "wdrcCodec", "Lxq;", "snCodec$delegate", "j", "()Lxq;", "snCodec", "Lq1;", "batteryInfoCodec$delegate", "()Lq1;", "batteryInfoCodec", "Lwq;", "roleCodec$delegate", "()Lwq;", "roleCodec", "Lv5;", "dspPageDataCodec$delegate", "()Lv5;", "dspPageDataCodec", "", "getTag", "()Ljava/lang/String;", "tag", "Lcom/huami/bluetooth/profile/channel/module/a;", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lcom/huami/bluetooth/profile/channel/module/a;)V", "Lkotlin/Pair;", "", "pair", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class rf extends c1<w4> implements sf {

    @NotNull
    public final Lazy A;

    @NotNull
    public final Lazy B;

    @Nullable
    public eg C;

    @NotNull
    public final Lazy t;

    @NotNull
    public final Lazy u;

    @NotNull
    public final Lazy v;

    @NotNull
    public final Lazy w;

    @NotNull
    public final Lazy x;

    @NotNull
    public final Lazy y;

    @NotNull
    public final Lazy z;
    public static final /* synthetic */ KProperty<Object>[] E = {Reflection.mutableProperty0(new MutablePropertyReference0Impl(rf.class, "pair", "<v#0>", 0))};

    @NotNull
    public static final a D = new a(null);

    @NotNull
    public static final Integer[] F = {Integer.valueOf(SportReportBaseParser.ReportType.maxWaterTemperature), 220, 247, 11, 40, 43, Integer.valueOf(SportReportBaseParser.ReportType.avgDivingDepth), 148, 99, 215, 113, 24, 35, 64, 227, 160};

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lrf$a;", "", "", "", "AES_KEY", "[Ljava/lang/Integer;", "", "ROUND_KEY", "J", "", "TAG", "Ljava/lang/String;", "TIMEOUT", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq1;", PluginDeviceInfo.FMODEL, "()Lq1;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<q1> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q1 invoke() {
            return new q1();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv5;", PluginDeviceInfo.FMODEL, "()Lv5;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<v5> {
        public static final c t = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v5 invoke() {
            return new v5();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw8;", PluginDeviceInfo.FMODEL, "()Lw8;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<w8> {
        public static final d t = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w8 invoke() {
            return new w8();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lng;", PluginDeviceInfo.FMODEL, "()Lng;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<ng> {
        public static final e t = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ng invoke() {
            return new ng();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwq;", PluginDeviceInfo.FMODEL, "()Lwq;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function0<wq> {
        public static final f t = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wq invoke() {
            return new wq();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lir;", PluginDeviceInfo.FMODEL, "()Lir;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements Function0<ir> {
        public static final g t = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ir invoke() {
            return new ir();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxq;", PluginDeviceInfo.FMODEL, "()Lxq;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements Function0<xq> {
        public static final h t = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xq invoke() {
            return new xq();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ w4 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w4 w4Var) {
            super(0);
            this.t = w4Var;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unsupported request command(" + this.t + ")!";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfw;", PluginDeviceInfo.FMODEL, "()Lfw;"}, k = 3, mv = {1, 7, 1})
    public static final class j extends Lambda implements Function0<fw> {
        public static final j t = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fw invoke() {
            return new fw();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsw;", PluginDeviceInfo.FMODEL, "()Lsw;"}, k = 3, mv = {1, 7, 1})
    public static final class k extends Lambda implements Function0<sw> {
        public static final k t = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sw invoke() {
            return new sw();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(@NotNull com.huami.bluetooth.profile.channel.module.a module) {
        super(module);
        Intrinsics.checkNotNullParameter(module, "module");
        this.t = LazyKt__LazyJVMKt.lazy(e.t);
        this.u = LazyKt__LazyJVMKt.lazy(j.t);
        this.v = LazyKt__LazyJVMKt.lazy(g.t);
        this.w = LazyKt__LazyJVMKt.lazy(d.t);
        this.x = LazyKt__LazyJVMKt.lazy(k.t);
        this.y = LazyKt__LazyJVMKt.lazy(h.t);
        this.z = LazyKt__LazyJVMKt.lazy(b.t);
        this.A = LazyKt__LazyJVMKt.lazy(f.t);
        this.B = LazyKt__LazyJVMKt.lazy(c.t);
    }

    @Override // defpackage.sf
    public void a(@NotNull eg listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.C = listener;
    }

    @Override // defpackage.sf
    @NotNull
    public Response<gg> b() {
        return c1.sendRequest$default(this, w4.t.f37581b, null, 10000L, 2, null);
    }

    public final void c(w4 requestCmd, byte[] data) {
        byte bFirst = ArraysKt___ArraysKt.first(data);
        if (bFirst == 0) {
            dispatchResponse(requestCmd, Boolean.TRUE);
        } else {
            c1.dispatchError$default(this, requestCmd, bFirst, null, 4, null);
        }
    }

    public final q1 d() {
        return (q1) this.z.getValue();
    }

    public final v5 e() {
        return (v5) this.B.getValue();
    }

    public final w8 f() {
        return (w8) this.w.getValue();
    }

    public final ng g() {
        return (ng) this.t.getValue();
    }

    @Override // defpackage.c1
    @NotNull
    public String getTag() {
        return "HearingAidApiImplV2";
    }

    public final wq h() {
        return (wq) this.A.getValue();
    }

    public final ir i() {
        return (ir) this.v.getValue();
    }

    public final xq j() {
        return (xq) this.y.getValue();
    }

    public final fw k() {
        return (fw) this.u.getValue();
    }

    public final sw l() {
        return (sw) this.x.getValue();
    }

    @Override // defpackage.c1
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w4 parseCommand(@NotNull byte[] rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        return w4.f37525a.a(rawData);
    }

    public final void b(w4 requestCmd, byte[] data) {
        byte bFirst = ArraysKt___ArraysKt.first(data);
        if (bFirst != 0) {
            c1.dispatchError$default(this, requestCmd, bFirst, null, 4, null);
            return;
        }
        Integer numA = r0.a(data);
        int iIntValue = numA != null ? numA.intValue() : 0;
        if (iIntValue == 1) {
            dispatchResponse(requestCmd, Boolean.TRUE);
        } else {
            c1.dispatchError$default(this, requestCmd, iIntValue, null, 4, null);
        }
    }

    public final void d(w4 requestCmd, byte[] data) {
        Pair pair;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        byte b2 = byteBufferWrap.get();
        if (b2 != 0) {
            c1.dispatchError$default(this, requestCmd, b2, null, 4, null);
            return;
        }
        byte b3 = byteBufferWrap.get();
        boolean z = byteBufferWrap.get() == 1;
        ReadWriteProperty readWritePropertyNotNull = Delegates.INSTANCE.notNull();
        if ((b3 & 1) != 0) {
            pair = new Pair(Boolean.valueOf(z), Boolean.valueOf(byteBufferWrap.get() == 1));
        } else {
            pair = new Pair(Boolean.valueOf(z), null);
        }
        a((ReadWriteProperty<Object, Pair<Boolean, Boolean>>) readWritePropertyNotNull, (Pair<Boolean, Boolean>) pair);
        dispatchResponse(requestCmd, a((ReadWriteProperty<Object, Pair<Boolean, Boolean>>) readWritePropertyNotNull));
    }

    public final void e(w4 requestCmd, byte[] data) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        byte b2 = byteBufferWrap.get();
        if (b2 == 0) {
            dispatchResponse(requestCmd, new Pair(Boolean.TRUE, byteBufferWrap.position() < byteBufferWrap.limit() ? Integer.valueOf(byteBufferWrap.get()) : null));
        } else {
            c1.dispatchError$default(this, requestCmd, b2, null, 4, null);
        }
    }

    public final void f(w4 requestCmd, byte[] data) {
        byte bFirst = ArraysKt___ArraysKt.first(data);
        if (bFirst != 0) {
            c1.dispatchError$default(this, requestCmd, bFirst, null, 4, null);
            return;
        }
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(data, 1, data.length);
        ArrayList arrayList = new ArrayList(bArrCopyOfRange.length);
        for (byte b2 : bArrCopyOfRange) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            arrayList.add(str);
        }
        String strJoin = TextUtils.join(":", arrayList);
        Intrinsics.checkNotNullExpressionValue(strJoin, "join(\":\", this.map { String.format(\"%02x\", it) })");
        String upperCase = strJoin.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        dispatchResponse(requestCmd, upperCase);
    }

    public final void g(w4 requestCmd, byte[] data) {
        byte bFirst = ArraysKt___ArraysKt.first(data);
        if (bFirst == 0) {
            dispatchResponse(requestCmd, ArraysKt___ArraysJvmKt.copyOfRange(data, 1, data.length));
        } else {
            c1.dispatchError$default(this, requestCmd, bFirst, null, 4, null);
        }
    }

    @Override // defpackage.c1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void handleCommand(@NotNull w4 cmd, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(data, "data");
        w4 w4VarB = b(cmd);
        if (Intrinsics.areEqual(cmd, w4.h0.f37548b) || Intrinsics.areEqual(cmd, w4.w.f37587b) || Intrinsics.areEqual(cmd, w4.a0.f37527b) || Intrinsics.areEqual(cmd, w4.s.f37579b) || Intrinsics.areEqual(cmd, w4.c0.f37533b) || Intrinsics.areEqual(cmd, w4.q.f37573b) || Intrinsics.areEqual(cmd, w4.h.f37547b) || Intrinsics.areEqual(cmd, w4.u.f37583b) || Intrinsics.areEqual(cmd, w4.l0.f37560b)) {
            a(w4VarB, data, a(cmd));
            return;
        }
        if (Intrinsics.areEqual(cmd, w4.y.f37591b)) {
            g(w4VarB, data);
            return;
        }
        if (Intrinsics.areEqual(cmd, w4.n0.f37565b)) {
            f(w4VarB, data);
            return;
        }
        if (!Intrinsics.areEqual(cmd, w4.h1.f37549b) && !Intrinsics.areEqual(cmd, w4.p0.f37571b) && !Intrinsics.areEqual(cmd, w4.d1.f37537b)) {
            w4.x0 x0Var = w4.x0.f37590b;
            if (!Intrinsics.areEqual(cmd, x0Var) && !Intrinsics.areEqual(cmd, w4.n1.f37566b) && !Intrinsics.areEqual(cmd, w4.b1.f37531b) && !Intrinsics.areEqual(cmd, w4.z0.f37594b) && !Intrinsics.areEqual(cmd, w4.v0.f37586b) && !Intrinsics.areEqual(cmd, w4.r1.f37578b) && !Intrinsics.areEqual(cmd, w4.t0.f37582b) && !Intrinsics.areEqual(cmd, w4.r0.f37577b) && !Intrinsics.areEqual(cmd, w4.p1.f37572b) && !Intrinsics.areEqual(cmd, w4.j1.f37555b) && !Intrinsics.areEqual(cmd, w4.o.f37567b) && !Intrinsics.areEqual(cmd, w4.f1.f37543b) && !Intrinsics.areEqual(cmd, w4.l1.f37561b) && !Intrinsics.areEqual(cmd, x0Var) && !Intrinsics.areEqual(cmd, w4.l.f37559b) && !Intrinsics.areEqual(cmd, w4.b.f37529b) && !Intrinsics.areEqual(cmd, w4.d.f37535b)) {
                if (Intrinsics.areEqual(cmd, w4.f.f37541b)) {
                    b(w4VarB, data);
                    return;
                }
                if (Intrinsics.areEqual(cmd, w4.j0.f37554b)) {
                    a(w4VarB, data);
                    return;
                } else if (Intrinsics.areEqual(cmd, w4.j.f37553b)) {
                    d(w4VarB, data);
                    return;
                } else {
                    if (Intrinsics.areEqual(cmd, w4.f0.f37542b)) {
                        e(w4VarB, data);
                        return;
                    }
                    return;
                }
            }
        }
        c(w4VarB, data);
    }

    public static final Pair<Boolean, Boolean> a(ReadWriteProperty<Object, Pair<Boolean, Boolean>> readWriteProperty) {
        return readWriteProperty.getValue(null, E[0]);
    }

    public static final void a(ReadWriteProperty<Object, Pair<Boolean, Boolean>> readWriteProperty, Pair<Boolean, Boolean> pair) {
        readWriteProperty.setValue(null, E[0], pair);
    }

    public final void a(w4 requestCmd, byte[] data) {
        byte bFirst = ArraysKt___ArraysKt.first(data);
        if (bFirst == 0) {
            Integer numA = r0.a(data);
            int iIntValue = numA != null ? numA.intValue() : 0;
            if (iIntValue == 1) {
                dispatchResponse(requestCmd, Boolean.TRUE);
                return;
            } else {
                c1.dispatchError$default(this, requestCmd, iIntValue, null, 4, null);
                return;
            }
        }
        c1.dispatchError$default(this, requestCmd, bFirst, null, 4, null);
    }

    public final w4 b(w4 w4Var) {
        if (Intrinsics.areEqual(w4Var, w4.h0.f37548b)) {
            return w4.g0.f37545b;
        }
        if (Intrinsics.areEqual(w4Var, w4.d1.f37537b)) {
            return w4.c1.f37534b;
        }
        if (Intrinsics.areEqual(w4Var, w4.h1.f37549b)) {
            return w4.g1.f37546b;
        }
        if (Intrinsics.areEqual(w4Var, w4.p0.f37571b)) {
            return w4.o0.f37568b;
        }
        if (Intrinsics.areEqual(w4Var, w4.x0.f37590b)) {
            return w4.w0.f37588b;
        }
        if (Intrinsics.areEqual(w4Var, w4.n1.f37566b)) {
            return w4.m1.f37563b;
        }
        if (Intrinsics.areEqual(w4Var, w4.b1.f37531b)) {
            return w4.a1.f37528b;
        }
        if (Intrinsics.areEqual(w4Var, w4.z0.f37594b)) {
            return w4.y0.f37592b;
        }
        if (Intrinsics.areEqual(w4Var, w4.v0.f37586b)) {
            return w4.u0.f37584b;
        }
        if (Intrinsics.areEqual(w4Var, w4.r1.f37578b)) {
            return w4.q1.f37575b;
        }
        if (Intrinsics.areEqual(w4Var, w4.l0.f37560b)) {
            return w4.k0.f37557b;
        }
        if (Intrinsics.areEqual(w4Var, w4.s0.f37580b)) {
            return w4.t0.f37582b;
        }
        if (Intrinsics.areEqual(w4Var, w4.r0.f37577b)) {
            return w4.q0.f37574b;
        }
        if (Intrinsics.areEqual(w4Var, w4.p1.f37572b)) {
            return w4.o1.f37569b;
        }
        if (Intrinsics.areEqual(w4Var, w4.j1.f37555b)) {
            return w4.i1.f37552b;
        }
        if (Intrinsics.areEqual(w4Var, w4.f1.f37543b)) {
            return w4.e1.f37540b;
        }
        if (Intrinsics.areEqual(w4Var, w4.w.f37587b)) {
            return w4.v.f37585b;
        }
        if (Intrinsics.areEqual(w4Var, w4.a0.f37527b)) {
            return w4.z.f37593b;
        }
        if (Intrinsics.areEqual(w4Var, w4.s.f37579b)) {
            return w4.r.f37576b;
        }
        if (Intrinsics.areEqual(w4Var, w4.u.f37583b)) {
            return w4.t.f37581b;
        }
        if (Intrinsics.areEqual(w4Var, w4.c0.f37533b)) {
            return w4.b0.f37530b;
        }
        if (Intrinsics.areEqual(w4Var, w4.o.f37567b)) {
            return w4.n.f37564b;
        }
        if (Intrinsics.areEqual(w4Var, w4.q.f37573b)) {
            return w4.p.f37570b;
        }
        if (Intrinsics.areEqual(w4Var, w4.l.f37559b)) {
            return w4.k.f37556b;
        }
        if (Intrinsics.areEqual(w4Var, w4.h.f37547b)) {
            return w4.g.f37544b;
        }
        if (Intrinsics.areEqual(w4Var, w4.l1.f37561b)) {
            return w4.k1.f37558b;
        }
        if (Intrinsics.areEqual(w4Var, w4.f.f37541b)) {
            return w4.e.f37538b;
        }
        if (Intrinsics.areEqual(w4Var, w4.y.f37591b)) {
            return w4.x.f37589b;
        }
        if (Intrinsics.areEqual(w4Var, w4.b.f37529b)) {
            return w4.a.f37526b;
        }
        if (Intrinsics.areEqual(w4Var, w4.n0.f37565b)) {
            return w4.m0.f37562b;
        }
        if (Intrinsics.areEqual(w4Var, w4.d.f37535b)) {
            return w4.c.f37532b;
        }
        if (Intrinsics.areEqual(w4Var, w4.j0.f37554b)) {
            return w4.i0.f37551b;
        }
        if (Intrinsics.areEqual(w4Var, w4.j.f37553b)) {
            return w4.i.f37550b;
        }
        if (Intrinsics.areEqual(w4Var, w4.f0.f37542b)) {
            return w4.e0.f37539b;
        }
        le.a(getTag(), (Throwable) null, new i(w4Var), 2, (Object) null);
        return w4Var;
    }

    public final u4<Object, byte[]> a(w4 cmd) {
        u4<Object, byte[]> u4VarE;
        if (Intrinsics.areEqual(cmd, w4.h0.f37548b)) {
            u4VarE = k();
        } else if (Intrinsics.areEqual(cmd, w4.w.f37587b)) {
            u4VarE = g();
        } else if (Intrinsics.areEqual(cmd, w4.a0.f37527b)) {
            u4VarE = i();
        } else if (Intrinsics.areEqual(cmd, w4.s.f37579b)) {
            u4VarE = f();
        } else if (Intrinsics.areEqual(cmd, w4.c0.f37533b)) {
            u4VarE = l();
        } else if (Intrinsics.areEqual(cmd, w4.q.f37573b)) {
            u4VarE = j();
        } else if (Intrinsics.areEqual(cmd, w4.h.f37547b)) {
            u4VarE = d();
        } else if (Intrinsics.areEqual(cmd, w4.u.f37583b)) {
            u4VarE = h();
        } else {
            if (!Intrinsics.areEqual(cmd, w4.l0.f37560b)) {
                throw new v4("Can not find " + cmd + " codec!");
            }
            u4VarE = e();
        }
        Intrinsics.checkNotNull(u4VarE, "null cannot be cast to non-null type com.huami.bluetooth.profile.channel.module.base.Codec<kotlin.Any, kotlin.ByteArray>");
        return u4VarE;
    }

    public final <T> void a(w4 cmd, byte[] data, u4<? extends T, byte[]> codec) {
        int iA = c3.a(data, 1, 0, 2, null);
        if (iA == 0) {
            T tDecode = codec.decode(ArraysKt___ArraysJvmKt.copyOfRange(data, 1, data.length));
            dispatchResponse(cmd, tDecode);
            a(cmd, tDecode);
            return;
        }
        c1.dispatchError$default(this, cmd, iA, null, 4, null);
    }

    public final void a(w4 cmd, Object data) {
        eg egVar;
        if (!Intrinsics.areEqual(cmd, w4.h.f37547b) || (egVar = this.C) == null) {
            return;
        }
        Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.huami.bluetooth.profile.channel.module.hearing.entity.v2.BatteryInfo>");
        egVar.a((List) data);
    }
}
