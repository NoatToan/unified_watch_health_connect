package xm0;

import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import java.util.Date;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xm0.w[], still in use, count: 1, list:
  (r0v1 xm0.w[]) from 0x002f: CONSTRUCTOR (r1v2 w13.c) = (r0v1 xm0.w[]) A[MD:(T extends java.lang.Enum<T>[]):void (m)] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxm0/w;", "", "", "labelResId", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {
    WEEK(R.string.menu_option_week),
    MONTH(R.string.menu_option_month),
    YEAR(R.string.menu_option_year);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f191472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f191473c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w13.c f191478h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191479a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f191480a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f191480a = iArr;
        }
    }

    static {
        w13.c cVar = new w13.c(wVarArr);
        f191478h = cVar;
        f191472b = new a(null);
        f191473c = (w) h0.b0(cVar);
    }

    private w(int i14) {
        super(str, i);
        this.f191479a = i14;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f191477g.clone();
    }

    public final DateTime a() {
        int i14 = b.f191480a[ordinal()];
        if (i14 == 1) {
            j0.f23099a.getClass();
            Date date = LocalDate.now().withDayOfWeek(1).toDate();
            date.getClass();
            return new DateTime(date);
        }
        if (i14 == 2) {
            j0.f23099a.getClass();
            Date date2 = LocalDate.now().withDayOfMonth(1).toDate();
            date2.getClass();
            return new DateTime(date2);
        }
        if (i14 == 3) {
            j0.f23099a.getClass();
            return new DateTime(j0.x());
        }
        u0.r();
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxm0/w$a;", "", "<init>", "()V", "Lxm0/w;", "defaultTimeInterval", "Lxm0/w;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
