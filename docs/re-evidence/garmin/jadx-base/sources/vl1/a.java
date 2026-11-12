package vl1;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import p005kotlin.Metadata;
import p13.w;
import p13.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 vl1.a[], still in use, count: 1, list:
  (r0v1 vl1.a[]) from 0x0068: CONSTRUCTOR (r0v1 vl1.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvl1/a;", "", "", "value", "", "", UserMetadata.KEYDATA_FILENAME, "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    UNMEASURABLE(255, w.c("UNMEASURABLE")),
    NONE(0, x.k("NONE", "MINIMAL")),
    FEW(1, x.k("FEW", "LOW")),
    OCCASIONAL(2, x.k("OCCASIONAL", "MEDIUM")),
    FREQUENT(3, x.k("FREQUENT", "HIGH"));


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f178703i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f178704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f178705b;

    static {
        f178703i = new w13.c(aVarArr);
    }

    private a(int i14, List list) {
        super(str, i);
        this.f178704a = i14;
        this.f178705b = list;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f178702h.clone();
    }
}
