package us1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 us1.o[], still in use, count: 1, list:
  (r0v1 us1.o[]) from 0x004c: CONSTRUCTOR (r0v1 us1.o[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lus1/o;", "", "", "labelRes", "captionRes", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {
    RECENT_FIRST(R.string.review_sort_order_newest_first, null, 2, null),
    OLDEST_FIRST(R.string.review_sort_order_oldest_first, null, 2, null),
    MOST_HELPFUL(R.string.review_sort_option_most_helpful, null, 2, null),
    ALPHABETICAL(R.string.user_trail_reviews_sort_order_alphabetical, Integer.valueOf(R.string.user_trail_reviews_sort_order_alphabetical_caption));


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f172455h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f172456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f172457b;

    static {
        f172455h = new w13.c(oVarArr);
    }

    public /* synthetic */ o(int i14, Integer num, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? null : num);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f172454g.clone();
    }

    private o(int i14, Integer num) {
        super(str, i);
        this.f172456a = i14;
        this.f172457b = num;
    }
}
