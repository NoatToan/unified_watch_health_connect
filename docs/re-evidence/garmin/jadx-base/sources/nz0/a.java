package nz0;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.codec.language.bm.Rule;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 nz0.a[], still in use, count: 1, list:
  (r0v1 nz0.a[]) from 0x004f: CONSTRUCTOR (r0v1 nz0.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnz0/a;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "descriptionResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    All(Rule.ALL, R.string.common_all, null, 4, null),
    /* JADX INFO: Fake field, exist only in values array */
    Favorite("FAVORITE", R.string.lbl_favorites, null, 4, null),
    /* JADX INFO: Fake field, exist only in values array */
    MutualFollowing("MUTUAL", R.string.concept_my_friends, Integer.valueOf(R.string.concept_my_friends_description)),
    You("YOU", R.string.privacy_only_me, 0 == true ? 1 : 0, 4, null);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c f128375g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f128377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f128378c;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        f128375g = new c(aVarArr);
    }

    public /* synthetic */ a(String str, int i14, Integer num, int i15, j jVar) {
        this(str, i14, (i15 & 4) != 0 ? null : num);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f128374f.clone();
    }

    private a(String str, int i14, Integer num) {
        super(str, i);
        this.f128376a = str;
        this.f128377b = i14;
        this.f128378c = num;
    }
}
