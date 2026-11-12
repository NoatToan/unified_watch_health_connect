package ls1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ls1.a[], still in use, count: 1, list:
  (r0v1 ls1.a[]) from 0x0069: CONSTRUCTOR (r0v1 ls1.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lls1/a;", "", "", "min", "max", "", "colorResId", "<init>", "(Ljava/lang/String;IDDI)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    RANGE_1(-75.0d, 10.0d, R.color.gds_data_viz_purple_primary),
    RANGE_2(10.0d, 20.0d, R.color.gds_data_viz_blue_primary),
    RANGE_3(20.0d, 35.0d, R.color.gds_data_viz_green_primary),
    RANGE_4(35.0d, 50.0d, R.color.gds_data_viz_orange_primary),
    RANGE_5(50.0d, 179.0d, R.color.gds_data_viz_red_primary);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ c f114786j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f114787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f114788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114789c;

    static {
        f114786j = new c(aVarArr);
    }

    private a(double d14, double d15, int i14) {
        super(str, i);
        this.f114787a = d14;
        this.f114788b = d15;
        this.f114789c = i14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f114785i.clone();
    }
}
