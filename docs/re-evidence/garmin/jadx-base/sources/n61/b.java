package n61;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p3.m;
import p3.n;
import p3.x1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 n61.b[], still in use, count: 1, list:
  (r0v1 n61.b[]) from 0x007e: CONSTRUCTOR (r0v1 n61.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\tB%\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ln61/b;", "Landroid/os/Parcelable;", "", "", Action.KEY_ATTRIBUTE, "stringResource", "colorResId", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements Parcelable {
    ELITE(7, R.string.lbl_endurance_score_elite, R.color.gds_data_viz_violet_primary),
    SUPERIOR(6, R.string.lbl_endurance_score_superior, R.color.gds_data_viz_purple_primary),
    EXPERT(5, R.string.lbl_endurance_score_expert, R.color.gds_data_viz_blue_primary),
    WELL_TRAINED(4, R.string.lbl_endurance_score_well_trained, R.color.gds_data_viz_green_primary),
    TRAINED(3, R.string.lbl_endurance_score_trained, R.color.gds_data_viz_orange_secondary),
    INTERMEDIATE(2, R.string.lbl_endurance_score_intermediate, R.color.gds_data_viz_orange_primary),
    RECREATIONAL(1, R.string.lbl_endurance_score_recreational, R.color.gds_data_viz_red_primary);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w13.c f123817m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f123818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f123819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f123820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f123808d = new a(null);
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: n61.b.b
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return b.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    };

    static {
        f123817m = new w13.c(new b[]{r0, r1, r2, r3, r4, r5, r6});
    }

    private b(int i14, int i15, int i16) {
        super(str, i);
        this.f123818a = i14;
        this.f123819b = i15;
        this.f123820c = i16;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f123816l.clone();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln61/b$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: n61.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2329a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f123821a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ELITE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.SUPERIOR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.EXPERT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.WELL_TRAINED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.TRAINED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[b.INTERMEDIATE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[b.RECREATIONAL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f123821a = iArr;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(Integer num) {
            for (b bVar : b.values()) {
                int i14 = bVar.f123818a;
                if (num != null && i14 == num.intValue()) {
                    return bVar;
                }
            }
            return null;
        }

        public static long b(b bVar, m mVar) {
            bVar.getClass();
            x1 x1Var = n.f135158a;
            switch (C2329a.f123821a[bVar.ordinal()]) {
                case 1:
                    mVar.C(-1406811316);
                    gl.c.f77766a.getClass();
                    long jP = gl.c.a(mVar).p();
                    mVar.f();
                    return jP;
                case 2:
                    mVar.C(-1406809396);
                    gl.c.f77766a.getClass();
                    long j8 = gl.c.a(mVar).j();
                    mVar.f();
                    return j8;
                case 3:
                    mVar.C(-1406807542);
                    gl.c.f77766a.getClass();
                    long jB = gl.c.a(mVar).b();
                    mVar.f();
                    return jB;
                case 4:
                    mVar.C(-1406805557);
                    gl.c.f77766a.getClass();
                    long jD = gl.c.a(mVar).d();
                    mVar.f();
                    return jD;
                case 5:
                    mVar.C(-1406803698);
                    gl.c.f77766a.getClass();
                    long jI = gl.c.a(mVar).i();
                    mVar.f();
                    return jI;
                case 6:
                    mVar.C(-1406801588);
                    gl.c.f77766a.getClass();
                    long jH = gl.c.a(mVar).h();
                    mVar.f();
                    return jH;
                case 7:
                    mVar.C(-1406799543);
                    gl.c.f77766a.getClass();
                    long jL = gl.c.a(mVar).l();
                    mVar.f();
                    return jL;
                default:
                    throw n23.j.m(mVar, -1406812704);
            }
        }

        private a() {
        }
    }
}
