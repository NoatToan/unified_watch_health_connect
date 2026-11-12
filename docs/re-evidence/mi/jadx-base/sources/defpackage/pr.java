package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0005\u0003B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Lpr;", "Ljava/io/Serializable;", "", PluginDeviceInfo.FDESC, "", PluginDeviceInfo.FMODEL, "", "toString", "segmentName", "Ljava/lang/String;", "getSegmentName", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "data", "<init>", "([B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class pr implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    public static final a z = new a(null);

    @NotNull
    public final byte[] t;

    @NotNull
    public final SportType u;
    public final int v;
    public final int w;
    public final int x;

    @Nullable
    public String y;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lpr$a;", "", "", "DATA_LEN", "I", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: pr$b, reason: from toString */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0007\f\r\u000e\u000f\u0010B\u0019\b\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lpr$b;", "", "", "toString", "", "type", "I", PluginDeviceInfo.FMODEL, "()I", "name", "<init>", "(Ljava/lang/String;I)V", PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, "Lpr$b$a;", "Lpr$b$b;", "Lpr$b$d;", "Lpr$b$e;", "Lpr$b$f;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class SportType {

        @NotNull
        public static final c c = new c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
        public final int type;

        /* JADX INFO: renamed from: pr$b$a */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpr$b$a;", "Lpr$b;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class a extends SportType {

            @NotNull
            public static final a d = new a();

            public a() {
                super("BTWB", 2, null);
            }
        }

        /* JADX INFO: renamed from: pr$b$b, reason: collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpr$b$b;", "Lpr$b;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class C1075b extends SportType {

            @NotNull
            public static final C1075b d = new C1075b();

            public C1075b() {
                super("Coach", 0, null);
            }
        }

        /* JADX INFO: renamed from: pr$b$c */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lpr$b$c;", "", "", "type", "Lpr$b;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class c {
            public c() {
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final SportType a(int type) {
                C1075b c1075b = C1075b.d;
                if (type == c1075b.getType()) {
                    return c1075b;
                }
                d dVar = d.d;
                if (type == dVar.getType()) {
                    return dVar;
                }
                a aVar = a.d;
                if (type == aVar.getType()) {
                    return aVar;
                }
                e eVar = e.d;
                return type == eVar.getType() ? eVar : f.d;
            }
        }

        /* JADX INFO: renamed from: pr$b$d */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpr$b$d;", "Lpr$b;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class d extends SportType {

            @NotNull
            public static final d d = new d();

            public d() {
                super("CrossFit", 1, null);
            }
        }

        /* JADX INFO: renamed from: pr$b$e */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpr$b$e;", "Lpr$b;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class e extends SportType {

            @NotNull
            public static final e d = new e();

            public e() {
                super("SegmentName", 3, null);
            }
        }

        /* JADX INFO: renamed from: pr$b$f */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpr$b$f;", "Lpr$b;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class f extends SportType {

            @NotNull
            public static final f d = new f();

            public f() {
                super("Unknown", -1, null);
            }
        }

        public /* synthetic */ SportType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getType() {
            return this.type;
        }

        @NotNull
        public String toString() {
            return "SportType(name='" + this.name + "', type='" + this.type + "')";
        }

        public SportType(String str, int i) {
            this.name = str;
            this.type = i;
        }
    }

    public pr(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.t = data;
        if (data.length < 6) {
            this.u = SportType.f.d;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            return;
        }
        this.u = SportType.c.a(c3.a(data, 1, 0));
        this.v = c3.a(data, 1, 1);
        this.w = c3.a(data, 1, 2);
        this.x = c3.a(data, 1, 3);
    }

    public final void a(@Nullable String str) {
        this.y = str;
    }

    public final boolean b() {
        return this.u.getType() == SportType.e.d.getType();
    }

    @NotNull
    public String toString() {
        if (Intrinsics.areEqual(this.u, SportType.e.d)) {
            return "SegmentDetail(sportType=" + this.u + ", segmentName=" + ArraysKt___ArraysKt.toList(this.t).subList(1, this.t.length) + ')';
        }
        return "SegmentDetail(sportType=" + this.u + ", type=" + this.v + ", avgHR=" + this.w + ", maxHR=" + this.x + ", segmentName=" + this.y + ')';
    }

    @NotNull
    public final byte[] a() {
        return ArraysKt___ArraysJvmKt.copyOfRange(this.t, 1, 6);
    }
}
