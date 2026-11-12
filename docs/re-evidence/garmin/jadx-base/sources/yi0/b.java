package yi0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yi0.b[], still in use, count: 1, list:
  (r0v1 yi0.b[]) from 0x002e: CONSTRUCTOR (r0v1 yi0.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyi0/b;", "", "", "shortLabelResId", "longLabelResId", "unitResId", "<init>", "(Ljava/lang/String;IIII)V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    WATTS(R.string.power_curve_list_watts_item_label, R.string.power_curve_list_watts_item_label, R.string.lbl_watts),
    W_PER_KG(R.string.lbl_watt_kg, R.string.lbl_watts_per_kg_long, R.string.lbl_watt_kg);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w13.c f197329g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f197330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f197331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f197332c;

    static {
        f197329g = new w13.c(bVarArr);
    }

    private b(int i14, int i15, int i16) {
        super(str, i);
        this.f197330a = i14;
        this.f197331b = i15;
        this.f197332c = i16;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f197328f.clone();
    }
}
