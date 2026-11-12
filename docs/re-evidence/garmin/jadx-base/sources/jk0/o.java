package jk0;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jk0.o[], still in use, count: 1, list:
  (r0v1 jk0.o[]) from 0x004c: CONSTRUCTOR (r0v1 jk0.o[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljk0/o;", "", "", Action.KEY_ATTRIBUTE, "gearApiKey", "collectionApiKey", "", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {
    /* JADX INFO: Fake field, exist only in values array */
    NewestFirst("NewestFirst", "firstUseDate_desc", "firstUseDate_desc", R.string.review_sort_order_newest_first),
    /* JADX INFO: Fake field, exist only in values array */
    OldestFirst("OldestFirst", "firstUseDate_asc", "firstUseDate_asc", R.string.review_sort_order_oldest_first),
    /* JADX INFO: Fake field, exist only in values array */
    Alphabetical("Alphabetical", "nameUnified_asc", "name_asc", R.string.a_to_z),
    /* JADX INFO: Fake field, exist only in values array */
    AlphabeticalReversed("AlphabeticalReversed", "nameUnified_desc", "name_desc", R.string.z_to_a);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f99303f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f99307d;

    static {
        f99303f = new w13.c(oVarArr);
    }

    private o(String str, String str2, String str3, int i14) {
        super(str, i);
        this.f99304a = str;
        this.f99305b = str2;
        this.f99306c = str3;
        this.f99307d = i14;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f99302e.clone();
    }
}
