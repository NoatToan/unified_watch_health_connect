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
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\r\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lhl;", "Ljq$a;", "", "value", "<init>", "(I)V", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FLOCALIZATIONS, "h", "i", "j", Constant.KeyValue.KEY_COLUMN, com.xiaomi.onetrack.b.e.f13808a, "m", "n", "Lhl$a;", "Lhl$b;", "Lhl$d;", "Lhl$e;", "Lhl$f;", "Lhl$g;", "Lhl$h;", "Lhl$i;", "Lhl$j;", "Lhl$k;", "Lhl$l;", "Lhl$m;", "Lhl$n;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class hl extends jq.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f20179a = new c(null);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$a;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f20180b = new a();

        public a() {
            super(9, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$b;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f20181b = new b();

        public b() {
            super(10, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lhl$c;", "", "", "Lhl;", PluginDeviceInfo.FMODEL, "", "CMD_BYTES", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final hl a(@NotNull byte[] bArr) {
            Object next;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new hl[]{m.f20191b, n.f20192b, g.f20185b, h.f20186b, k.f20189b, l.f20190b, i.f20187b, j.f20188b, a.f20180b, b.f20181b, d.f20182b, e.f20183b, f.f20184b}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                byte[] f34884a = ((hl) next).getF34884a();
                if (bArr.length >= f34884a.length) {
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, f34884a.length);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                    if (Arrays.equals(f34884a, bArrCopyOf)) {
                        break;
                    }
                }
            }
            hl hlVar = (hl) next;
            if (hlVar != null) {
                return hlVar;
            }
            throw new RuntimeException("Unknown command!");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$d;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final d f20182b = new d();

        public d() {
            super(11, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$e;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e f20183b = new e();

        public e() {
            super(12, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$f;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class f extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f f20184b = new f();

        public f() {
            super(13, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$g;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class g extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final g f20185b = new g();

        public g() {
            super(3, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$h;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class h extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final h f20186b = new h();

        public h() {
            super(4, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$i;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class i extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final i f20187b = new i();

        public i() {
            super(7, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$j;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class j extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final j f20188b = new j();

        public j() {
            super(8, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$k;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class k extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final k f20189b = new k();

        public k() {
            super(5, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$l;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class l extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final l f20190b = new l();

        public l() {
            super(6, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$m;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class m extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final m f20191b = new m();

        public m() {
            super(1, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl$n;", "Lhl;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class n extends hl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final n f20192b = new n();

        public n() {
            super(2, null);
        }
    }

    public /* synthetic */ hl(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public hl(int i2) {
        super(c3.a(i2, 1));
    }
}
