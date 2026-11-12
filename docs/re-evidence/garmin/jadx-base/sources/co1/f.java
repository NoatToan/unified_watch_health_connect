package co1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 co1.f[], still in use, count: 1, list:
  (r0v1 co1.f[]) from 0x005c: CONSTRUCTOR (r0v1 co1.f[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lco1/f;", "", "", "min", "max", "", "colorResId", "<init>", "(Ljava/lang/String;IDDI)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {
    /* JADX INFO: Fake field, exist only in values array */
    RANGE_1(0.0d, 30.0d, R.color.gds_data_viz_red_primary),
    /* JADX INFO: Fake field, exist only in values array */
    RANGE_2(30.0d, 60.0d, R.color.gds_data_viz_orange_secondary),
    /* JADX INFO: Fake field, exist only in values array */
    RANGE_3(60.0d, 90.0d, R.color.gds_data_viz_green_secondary),
    /* JADX INFO: Fake field, exist only in values array */
    RANGE_4(90.0d, 120.0d, R.color.gds_data_viz_blue_secondary),
    /* JADX INFO: Fake field, exist only in values array */
    RANGE_5(120.0d, 999.0d, R.color.gds_data_viz_violet_primary);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w13.c f28169e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f28170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f28171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28172c;

    static {
        f28169e = new w13.c(fVarArr);
    }

    private f(double d14, double d15, int i14) {
        super(str, i);
        this.f28170a = d14;
        this.f28171b = d15;
        this.f28172c = i14;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f28168d.clone();
    }
}
