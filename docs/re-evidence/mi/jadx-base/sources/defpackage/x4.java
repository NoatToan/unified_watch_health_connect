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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u000b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lx4;", "Ljq$a;", "", "cmd", "<init>", "(I)V", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FLOCALIZATIONS, "h", "i", "j", Constant.KeyValue.KEY_COLUMN, com.xiaomi.onetrack.b.e.f13808a, "Lx4$b;", "Lx4$c;", "Lx4$d;", "Lx4$e;", "Lx4$f;", "Lx4$g;", "Lx4$h;", "Lx4$i;", "Lx4$j;", "Lx4$k;", "Lx4$l;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class x4 extends jq.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f38659a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lx4$a;", "", "", "Lx4;", PluginDeviceInfo.FMODEL, "", "CMD_BYTE_LEN", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final x4 a(@NotNull byte[] bArr) {
            Object next;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new x4[]{g.f38665b, h.f38666b, e.f38663b, b.f38660b, f.f38664b, c.f38661b, i.f38667b, j.f38668b, k.f38669b, l.f38670b, d.f38662b}).iterator();
            while (it.hasNext()) {
                next = it.next();
                x4 x4Var = (x4) next;
                if (bArr.length >= x4Var.getF34884a().length) {
                    byte[] f34884a = x4Var.getF34884a();
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, x4Var.getF34884a().length);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                    if (Arrays.equals(f34884a, bArrCopyOf)) {
                        return (x4) next;
                    }
                }
            }
            next = null;
            return (x4) next;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4$b;", "Lx4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends x4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f38660b = new b();

        public b() {
            super(4, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4$c;", "Lx4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends x4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f38661b = new c();

        public c() {
            super(6, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4$d;", "Lx4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends x4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final d f38662b = new d();

        public d() {
            super(11, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4$e;", "Lx4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends x4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e f38663b = new e();

        public e() {
            super(3, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4$f;", "Lx4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class f extends x4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f f38664b = new f();

        public f() {
            super(5, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4$g;", "Lx4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class g extends x4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final g f38665b = new g();

        public g() {
            super(1, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4$h;", "Lx4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class h extends x4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final h f38666b = new h();

        public h() {
            super(2, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4$i;", "Lx4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class i extends x4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final i f38667b = new i();

        public i() {
            super(7, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4$j;", "Lx4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class j extends x4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final j f38668b = new j();

        public j() {
            super(8, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4$k;", "Lx4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class k extends x4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final k f38669b = new k();

        public k() {
            super(9, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4$l;", "Lx4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class l extends x4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final l f38670b = new l();

        public l() {
            super(10, null);
        }
    }

    public /* synthetic */ x4(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public x4(int i2) {
        super(c3.a(i2, 1));
    }
}
