package defpackage;

import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lhk;", "Ljq$a;", "", "value", "<init>", "(I)V", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FLOCALIZATIONS, "h", "i", "j", Constant.KeyValue.KEY_COLUMN, "Lhk$a;", "Lhk$b;", "Lhk$d;", "Lhk$e;", "Lhk$f;", "Lhk$g;", "Lhk$h;", "Lhk$i;", "Lhk$j;", "Lhk$k;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class hk extends jq.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f20143a = new c(null);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk$a;", "Lhk;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends hk {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f20144b = new a();

        public a() {
            super(5, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk$b;", "Lhk;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends hk {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f20145b = new b();

        public b() {
            super(6, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lhk$c;", "", "", "Lhk;", PluginDeviceInfo.FMODEL, "", "CMD_BYTES", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final hk a(@NotNull byte[] bArr) {
            Object next;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new hk[]{j.f20152b, k.f20153b, f.f20148b, g.f20149b, a.f20144b, b.f20145b, e.f20147b, h.f20150b, i.f20151b, d.f20146b}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                byte[] f34884a = ((hk) next).getF34884a();
                if (bArr.length >= f34884a.length) {
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, f34884a.length);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                    if (Arrays.equals(f34884a, bArrCopyOf)) {
                        break;
                    }
                }
            }
            hk hkVar = (hk) next;
            if (hkVar != null) {
                return hkVar;
            }
            throw new RuntimeException("Unknown command!");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk$d;", "Lhk;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends hk {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final d f20146b = new d();

        public d() {
            super(10, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk$e;", "Lhk;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends hk {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e f20147b = new e();

        public e() {
            super(7, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk$f;", "Lhk;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class f extends hk {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f f20148b = new f();

        public f() {
            super(3, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk$g;", "Lhk;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class g extends hk {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final g f20149b = new g();

        public g() {
            super(4, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk$h;", "Lhk;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class h extends hk {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final h f20150b = new h();

        public h() {
            super(8, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk$i;", "Lhk;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class i extends hk {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final i f20151b = new i();

        public i() {
            super(9, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk$j;", "Lhk;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class j extends hk {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final j f20152b = new j();

        public j() {
            super(1, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk$k;", "Lhk;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class k extends hk {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final k f20153b = new k();

        public k() {
            super(2, null);
        }
    }

    public /* synthetic */ hk(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public hk(int i2) {
        super(c3.a(i2, 1));
    }
}
