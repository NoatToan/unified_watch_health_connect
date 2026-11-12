package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: q5, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\f\r\u000e\u000fB\u0019\b\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lq5;", "", "", "toString", "", "type", "I", PluginDeviceInfo.FMODEL, "()I", "name", "<init>", "(Ljava/lang/String;I)V", PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, "Lq5$a;", "Lq5$c;", "Lq5$d;", "Lq5$e;", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public abstract class CrossFitType {

    @NotNull
    public static final b c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int type;

    /* JADX INFO: renamed from: q5$a */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq5$a;", "Lq5;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends CrossFitType {

        @NotNull
        public static final a d = new a();

        public a() {
            super("Amrap", 1, null);
        }
    }

    /* JADX INFO: renamed from: q5$b */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lq5$b;", "", "", "type", "Lq5;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CrossFitType a(int type) {
            a aVar = a.d;
            if (type == aVar.getType()) {
                return aVar;
            }
            c cVar = c.d;
            if (type == cVar.getType()) {
                return cVar;
            }
            d dVar = d.d;
            return type == dVar.getType() ? dVar : e.d;
        }
    }

    /* JADX INFO: renamed from: q5$c */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq5$c;", "Lq5;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends CrossFitType {

        @NotNull
        public static final c d = new c();

        public c() {
            super("Emom", 2, null);
        }
    }

    /* JADX INFO: renamed from: q5$d */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq5$d;", "Lq5;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends CrossFitType {

        @NotNull
        public static final d d = new d();

        public d() {
            super("ForTime", 3, null);
        }
    }

    /* JADX INFO: renamed from: q5$e */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq5$e;", "Lq5;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class e extends CrossFitType {

        @NotNull
        public static final e d = new e();

        public e() {
            super("Unknown", -1, null);
        }
    }

    public /* synthetic */ CrossFitType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public String toString() {
        return "CrossFitType(name='" + this.name + "', type='" + this.type + "')";
    }

    public CrossFitType(String str, int i) {
        this.name = str;
        this.type = i;
    }
}
