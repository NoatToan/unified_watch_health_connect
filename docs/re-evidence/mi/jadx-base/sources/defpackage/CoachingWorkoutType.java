package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: q4, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0007\f\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lq4;", "", "", "toString", "", "type", "I", PluginDeviceInfo.FMODEL, "()I", "name", "<init>", "(Ljava/lang/String;I)V", PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FLOCALIZATIONS, "Lq4$b;", "Lq4$c;", "Lq4$d;", "Lq4$e;", "Lq4$f;", "Lq4$g;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class CoachingWorkoutType {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int type;

    /* JADX INFO: renamed from: q4$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lq4$a;", "", "", "type", "Lq4;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CoachingWorkoutType a(int type) {
            f fVar = f.d;
            if (type == fVar.getType()) {
                return fVar;
            }
            e eVar = e.d;
            if (type == eVar.getType()) {
                return eVar;
            }
            d dVar = d.d;
            if (type == dVar.getType()) {
                return dVar;
            }
            b bVar = b.d;
            if (type == bVar.getType()) {
                return bVar;
            }
            c cVar = c.d;
            return type == cVar.getType() ? cVar : g.d;
        }
    }

    /* JADX INFO: renamed from: q4$b */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq4$b;", "Lq4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends CoachingWorkoutType {

        @NotNull
        public static final b d = new b();

        public b() {
            super("CrossFitAddScoreOff", 3, null);
        }
    }

    /* JADX INFO: renamed from: q4$c */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq4$c;", "Lq4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends CoachingWorkoutType {

        @NotNull
        public static final c d = new c();

        public c() {
            super("CrossFitAddScoreOn", 4, null);
        }
    }

    /* JADX INFO: renamed from: q4$d */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq4$d;", "Lq4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends CoachingWorkoutType {

        @NotNull
        public static final d d = new d();

        public d() {
            super("Custom", 2, null);
        }
    }

    /* JADX INFO: renamed from: q4$e */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq4$e;", "Lq4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends CoachingWorkoutType {

        @NotNull
        public static final e d = new e();

        public e() {
            super("HR", 1, null);
        }
    }

    /* JADX INFO: renamed from: q4$f */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq4$f;", "Lq4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class f extends CoachingWorkoutType {

        @NotNull
        public static final f d = new f();

        public f() {
            super("Interval", 0, null);
        }
    }

    /* JADX INFO: renamed from: q4$g */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq4$g;", "Lq4;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class g extends CoachingWorkoutType {

        @NotNull
        public static final g d = new g();

        public g() {
            super("Unknown", -1, null);
        }
    }

    public /* synthetic */ CoachingWorkoutType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public String toString() {
        return "CoachingWorkoutType(name='" + this.name + "', type='" + this.type + "')";
    }

    public CoachingWorkoutType(String str, int i) {
        this.name = str;
        this.type = i;
    }
}
