package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'x' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lxn;", "", "", "resultCode", "I", PluginDeviceInfo.FDESC, "()I", "", "responseResult", "Ljava/lang/String;", "getResponseResult", "()Ljava/lang/String;", PluginDeviceInfo.FMODEL, "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class xn {
    public static final xn A;
    public static final xn B;
    public static final xn C;
    public static final xn D;
    public static final xn x;
    public static final xn y;
    public static final xn z;
    public final int t;

    @Nullable
    public String u;
    public static final xn w = new xn("OK", 0, 1, null, 2, null);
    public static final /* synthetic */ xn[] E = a();

    @NotNull
    public static final a v = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lxn$a;", "", "", "resultCode", "Lxn;", PluginDeviceInfo.FMODEL, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final xn a(int resultCode) {
            t5t.d("OpenAppResult", "resultCode=" + resultCode);
            for (xn xnVar : xn.values()) {
                if (xnVar.getT() == resultCode) {
                    return xnVar;
                }
            }
            return xn.y;
        }
    }

    static {
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        x = new xn("UNKNOWN_ERROR", 1, 2, str, i, defaultConstructorMarker);
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        String str2 = null;
        y = new xn("INVALID_PARAMETER", 2, 3, str2, i2, defaultConstructorMarker2);
        z = new xn("TIMEOUT", 3, 4, str, i, defaultConstructorMarker);
        A = new xn("UNKNOWN_APPLICATION", 4, 5, str2, i2, defaultConstructorMarker2);
        B = new xn("NO_MEMORY", 5, 6, str, i, defaultConstructorMarker);
        C = new xn("BUSY", 6, 7, str2, i2, defaultConstructorMarker2);
        D = new xn("PARSE_APPLICATION_PARAMETER_FAILED", 7, 8, str, i, defaultConstructorMarker);
    }

    public xn(String str, int i, int i2, String str2) {
        super(str, i);
        this.t = i2;
        this.u = str2;
    }

    public static final /* synthetic */ xn[] a() {
        return new xn[]{w, x, y, z, A, B, C, D};
    }

    public static xn valueOf(String str) {
        return (xn) Enum.valueOf(xn.class, str);
    }

    public static xn[] values() {
        return (xn[]) E.clone();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getT() {
        return this.t;
    }

    public /* synthetic */ xn(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 2) != 0 ? null : str2);
    }

    public final void a(@Nullable String str) {
        this.u = str;
    }
}
