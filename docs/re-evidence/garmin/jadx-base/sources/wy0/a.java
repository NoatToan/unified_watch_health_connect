package wy0;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import l22.b;
import lc.u0;
import o4.d0;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;
import ty0.j;
import u4.d;
import v62.e9;
import v62.p9;
import v62.u;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 wy0.a[], still in use, count: 1, list:
  (r0v1 wy0.a[]) from 0x002f: CONSTRUCTOR (r0v1 wy0.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwy0/a;", "Lty0/j;", "", "", Action.KEY_ATTRIBUTE, "", "titleStringRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements j {
    BADGES("BADGES", R.string.concept_badges),
    PERSONAL_RECORDS("PERSONAL_RECORDS", R.string.concept_personal_records),
    USER_PROFILE("USER_PROFILE", R.string.lbl_user_profile);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c f188046g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188048b;

    /* JADX INFO: renamed from: wy0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3497a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f188049a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.BADGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.PERSONAL_RECORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.USER_PROFILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f188049a = iArr;
        }
    }

    static {
        f188046g = new c(aVarArr);
    }

    private a(String str, int i14) {
        super(str, i);
        this.f188047a = str;
        this.f188048b = i14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f188045f.clone();
    }

    @Override // ty0.j
    public final String b(b bVar) {
        return bVar.getString(this.f188048b);
    }

    @Override // ty0.j
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getF4358a() {
        return this.f188047a;
    }

    @Override // ty0.j
    public final d k(boolean z14) {
        int i14 = C3497a.f188049a[ordinal()];
        if (i14 == 1) {
            s62.a.f157643a.getClass();
            return u.a(t62.b.f162798a);
        }
        if (i14 == 2) {
            s62.a.f157643a.getClass();
            return e9.a(t62.b.f162798a);
        }
        if (i14 == 3) {
            s62.a.f157643a.getClass();
            return p9.a(t62.b.f162798a);
        }
        u0.r();
        return null;
    }

    @Override // ty0.j
    public final d0 o(m mVar) {
        mVar.C(-1299232828);
        x1 x1Var = n.f135158a;
        d92.b.f58623a.getClass();
        long jD = d92.b.a(mVar).f().d();
        mVar.f();
        return d0.a(jD);
    }
}
