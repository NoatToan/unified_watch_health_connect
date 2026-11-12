package q71;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import n23.j;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 q71.a[], still in use, count: 1, list:
  (r0v1 q71.a[]) from 0x004d: CONSTRUCTOR (r0v1 q71.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq71/a;", "Landroid/os/Parcelable;", "", "", "rangeNameResId", "", "pieChartRangePercent", "<init>", "(Ljava/lang/String;IIF)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements Parcelable {
    POOR(R.string.lbl_poor, 40.0f),
    FAIR(R.string.lbl_fair, 15.0f),
    GOOD(R.string.lbl_good, 15.0f),
    EXCELLENT(R.string.lbl_excellent, 15.0f),
    SUPERIOR(R.string.lbl_superior, 15.0f);

    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: q71.a.a
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return a.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f143226i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f143227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f143228b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143229a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.POOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FAIR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.GOOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EXCELLENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.SUPERIOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f143229a = iArr;
        }
    }

    static {
        f143226i = new w13.c(new a[]{r0, r1, r2, r3, r4});
    }

    private a(int i14, float f14) {
        super(str, i);
        this.f143227a = i14;
        this.f143228b = f14;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f143225h.clone();
    }

    public final long b(m mVar) {
        x1 x1Var = n.f135158a;
        int i14 = b.f143229a[ordinal()];
        if (i14 == 1) {
            mVar.C(915275483);
            gl.c.f77766a.getClass();
            long jL = gl.c.a(mVar).l();
            mVar.f();
            return jL;
        }
        if (i14 == 2) {
            mVar.C(915277054);
            gl.c.f77766a.getClass();
            long jH = gl.c.a(mVar).h();
            mVar.f();
            return jH;
        }
        if (i14 == 3) {
            mVar.C(915278717);
            gl.c.f77766a.getClass();
            long jD = gl.c.a(mVar).d();
            mVar.f();
            return jD;
        }
        if (i14 == 4) {
            mVar.C(915280508);
            gl.c.f77766a.getClass();
            long jB = gl.c.a(mVar).b();
            mVar.f();
            return jB;
        }
        if (i14 != 5) {
            throw j.m(mVar, 915274095);
        }
        mVar.C(915282238);
        gl.c.f77766a.getClass();
        long j8 = gl.c.a(mVar).j();
        mVar.f();
        return j8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
