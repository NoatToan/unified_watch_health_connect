package defpackage;

import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingConst;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000¦\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\bI\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:F\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001VLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001¨\u0006\u0091\u0001"}, d2 = {"Lw4;", "Ljq$a;", "", "cmd", "<init>", "(I)V", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FLOCALIZATIONS, "h", "i", "j", Constant.KeyValue.KEY_COLUMN, com.xiaomi.onetrack.b.e.f13808a, "m", "n", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "q", "r", "s", DeviceTagInterface.CUSTOM_TAG_TYPE, "u", "v", Constants.DEVICE_TYPE_WEAR, "x", "y", "z", "a0", "b0", "c0", "d0", "e0", "f0", "g0", "h0", "i0", "j0", "k0", "l0", "m0", "n0", "o0", "p0", "q0", "r0", "s0", "t0", "u0", "v0", "w0", "x0", "y0", "z0", "a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1", "i1", "j1", "k1", "l1", "m1", "n1", "o1", GlobalDynamicSettingConst.COUNTRY_DOMAIN_PV, "q1", "r1", "Lw4$a;", "Lw4$b;", "Lw4$c;", "Lw4$d;", "Lw4$e;", "Lw4$f;", "Lw4$g;", "Lw4$h;", "Lw4$i;", "Lw4$j;", "Lw4$k;", "Lw4$l;", "Lw4$n;", "Lw4$o;", "Lw4$p;", "Lw4$q;", "Lw4$r;", "Lw4$s;", "Lw4$t;", "Lw4$u;", "Lw4$v;", "Lw4$w;", "Lw4$x;", "Lw4$y;", "Lw4$z;", "Lw4$a0;", "Lw4$b0;", "Lw4$c0;", "Lw4$d0;", "Lw4$e0;", "Lw4$f0;", "Lw4$g0;", "Lw4$h0;", "Lw4$i0;", "Lw4$j0;", "Lw4$k0;", "Lw4$l0;", "Lw4$m0;", "Lw4$n0;", "Lw4$o0;", "Lw4$p0;", "Lw4$q0;", "Lw4$r0;", "Lw4$s0;", "Lw4$t0;", "Lw4$u0;", "Lw4$v0;", "Lw4$w0;", "Lw4$x0;", "Lw4$y0;", "Lw4$z0;", "Lw4$a1;", "Lw4$b1;", "Lw4$c1;", "Lw4$d1;", "Lw4$e1;", "Lw4$f1;", "Lw4$g1;", "Lw4$h1;", "Lw4$i1;", "Lw4$j1;", "Lw4$k1;", "Lw4$l1;", "Lw4$m1;", "Lw4$n1;", "Lw4$o1;", "Lw4$p1;", "Lw4$q1;", "Lw4$r1;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class w4 extends jq.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f37525a = new m(null);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$a;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f37526b = new a();

        public a() {
            super(58, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$a0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a0 f37527b = new a0();

        public a0() {
            super(35, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$a1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a1 f37528b = new a1();

        public a1() {
            super(12, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$b;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f37529b = new b();

        public b() {
            super(59, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$b0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b0 f37530b = new b0();

        public b0() {
            super(40, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$b1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b1 f37531b = new b1();

        public b1() {
            super(13, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$c;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f37532b = new c();

        public c() {
            super(60, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$c0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c0 f37533b = new c0();

        public c0() {
            super(41, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$c1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c1 f37534b = new c1();

        public c1() {
            super(2, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$d;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final d f37535b = new d();

        public d() {
            super(61, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$d0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final d0 f37536b = new d0();

        public d0() {
            super(68, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$d1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final d1 f37537b = new d1();

        public d1() {
            super(3, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$e;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e f37538b = new e();

        public e() {
            super(54, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$e0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e0 f37539b = new e0();

        public e0() {
            super(66, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$e1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e1 f37540b = new e1();

        public e1() {
            super(30, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$f;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class f extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f f37541b = new f();

        public f() {
            super(55, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$f0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class f0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f0 f37542b = new f0();

        public f0() {
            super(67, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$f1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class f1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f1 f37543b = new f1();

        public f1() {
            super(31, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$g;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class g extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final g f37544b = new g();

        public g() {
            super(48, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$g0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class g0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final g0 f37545b = new g0();

        public g0() {
            super(0, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$g1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class g1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final g1 f37546b = new g1();

        public g1() {
            super(4, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$h;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class h extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final h f37547b = new h();

        public h() {
            super(49, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$h0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class h0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final h0 f37548b = new h0();

        public h0() {
            super(1, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$h1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class h1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final h1 f37549b = new h1();

        public h1() {
            super(5, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$i;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class i extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final i f37550b = new i();

        public i() {
            super(64, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$i0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class i0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final i0 f37551b = new i0();

        public i0() {
            super(62, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$i1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class i1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final i1 f37552b = new i1();

        public i1() {
            super(28, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$j;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class j extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final j f37553b = new j();

        public j() {
            super(65, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$j0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class j0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final j0 f37554b = new j0();

        public j0() {
            super(63, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$j1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class j1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final j1 f37555b = new j1();

        public j1() {
            super(29, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$k;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class k extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final k f37556b = new k();

        public k() {
            super(46, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$k0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class k0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final k0 f37557b = new k0();

        public k0() {
            super(20, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$k1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class k1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final k1 f37558b = new k1();

        public k1() {
            super(50, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$l;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class l extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final l f37559b = new l();

        public l() {
            super(47, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$l0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class l0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final l0 f37560b = new l0();

        public l0() {
            super(21, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$l1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class l1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final l1 f37561b = new l1();

        public l1() {
            super(51, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lw4$m;", "", "", "Lw4;", PluginDeviceInfo.FMODEL, "", "CMD_BYTE_LEN", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class m {
        public m() {
        }

        public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final w4 a(@NotNull byte[] bArr) {
            Object next;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new w4[]{g0.f37545b, h0.f37548b, c1.f37534b, d1.f37537b, g1.f37546b, h1.f37549b, o0.f37568b, p0.f37571b, w0.f37588b, x0.f37590b, m1.f37563b, n1.f37566b, a1.f37528b, b1.f37531b, y0.f37592b, z0.f37594b, u0.f37584b, v0.f37586b, q1.f37575b, r1.f37578b, k0.f37557b, l0.f37560b, s0.f37580b, t0.f37582b, q0.f37574b, r0.f37577b, o1.f37569b, p1.f37572b, i1.f37552b, j1.f37555b, e1.f37540b, f1.f37543b, v.f37585b, w.f37587b, z.f37593b, a0.f37527b, r.f37576b, s.f37579b, t.f37581b, u.f37583b, b0.f37530b, c0.f37533b, n.f37564b, o.f37567b, p.f37570b, q.f37573b, k.f37556b, l.f37559b, g.f37544b, h.f37547b, k1.f37558b, l1.f37561b, e.f37538b, f.f37541b, x.f37589b, y.f37591b, m0.f37562b, n0.f37565b, a.f37526b, b.f37529b, c.f37532b, d.f37535b, i0.f37551b, j0.f37554b, i.f37550b, j.f37553b, e0.f37539b, f0.f37542b, d0.f37536b}).iterator();
            while (it.hasNext()) {
                next = it.next();
                w4 w4Var = (w4) next;
                if (bArr.length >= w4Var.getF34884a().length) {
                    byte[] f34884a = w4Var.getF34884a();
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, w4Var.getF34884a().length);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                    if (Arrays.equals(f34884a, bArrCopyOf)) {
                        return (w4) next;
                    }
                }
            }
            next = null;
            return (w4) next;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$m0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class m0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final m0 f37562b = new m0();

        public m0() {
            super(56, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$m1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class m1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final m1 f37563b = new m1();

        public m1() {
            super(10, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$n;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class n extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final n f37564b = new n();

        public n() {
            super(42, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$n0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class n0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final n0 f37565b = new n0();

        public n0() {
            super(57, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$n1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class n1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final n1 f37566b = new n1();

        public n1() {
            super(11, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$o;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class o extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final o f37567b = new o();

        public o() {
            super(43, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$o0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class o0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final o0 f37568b = new o0();

        public o0() {
            super(6, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$o1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class o1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final o1 f37569b = new o1();

        public o1() {
            super(26, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$p;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class p extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final p f37570b = new p();

        public p() {
            super(44, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$p0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class p0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final p0 f37571b = new p0();

        public p0() {
            super(7, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$p1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class p1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final p1 f37572b = new p1();

        public p1() {
            super(27, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$q;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class q extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final q f37573b = new q();

        public q() {
            super(45, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$q0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class q0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final q0 f37574b = new q0();

        public q0() {
            super(24, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$q1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class q1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final q1 f37575b = new q1();

        public q1() {
            super(18, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$r;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class r extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final r f37576b = new r();

        public r() {
            super(36, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$r0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class r0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final r0 f37577b = new r0();

        public r0() {
            super(25, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$r1;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class r1 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final r1 f37578b = new r1();

        public r1() {
            super(19, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$s;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class s extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final s f37579b = new s();

        public s() {
            super(37, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$s0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class s0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final s0 f37580b = new s0();

        public s0() {
            super(22, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$t;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class t extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final t f37581b = new t();

        public t() {
            super(38, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$t0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class t0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final t0 f37582b = new t0();

        public t0() {
            super(23, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$u;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class u extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final u f37583b = new u();

        public u() {
            super(39, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$u0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class u0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final u0 f37584b = new u0();

        public u0() {
            super(16, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$v;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class v extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final v f37585b = new v();

        public v() {
            super(32, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$v0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class v0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final v0 f37586b = new v0();

        public v0() {
            super(17, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$w;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class w extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final w f37587b = new w();

        public w() {
            super(33, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$w0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class w0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final w0 f37588b = new w0();

        public w0() {
            super(8, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$x;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class x extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final x f37589b = new x();

        public x() {
            super(52, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$x0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class x0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final x0 f37590b = new x0();

        public x0() {
            super(9, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$y;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class y extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final y f37591b = new y();

        public y() {
            super(53, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$y0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class y0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final y0 f37592b = new y0();

        public y0() {
            super(14, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$z;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class z extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final z f37593b = new z();

        public z() {
            super(34, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw4$z0;", "Lw4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class z0 extends w4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final z0 f37594b = new z0();

        public z0() {
            super(15, null);
        }
    }

    public /* synthetic */ w4(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public w4(int i2) {
        super(c3.a(i2, 1));
    }
}
