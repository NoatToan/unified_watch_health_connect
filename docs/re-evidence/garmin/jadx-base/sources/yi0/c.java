package yi0;

import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import c22.i;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import o70.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.y;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yi0.c[], still in use, count: 1, list:
  (r0v1 yi0.c[]) from 0x0056: CONSTRUCTOR (r0v1 yi0.c[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lyi0/c;", "Landroid/os/Parcelable;", "", "", Action.KEY_ATTRIBUTE, "seriesName", "Lo70/t;", "secondaryStatType", "", "labelResId", "Lc22/c3;", "ftpLabelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lo70/t;ILc22/c3;)V", "a", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements Parcelable {
    CYCLING("CYCLING", "cycling", t.f130072o, R.string.lbl_cycling, i.b(R.string.lbl_cycling_ftp)),
    CROSS_COUNTRY_SKIING("CROSS_COUNTRY_SKIING", "cross_country_skiing", t.f130073p, R.string.sport_type_cross_country_skiing, i.b(R.string.lbl_cross_country_skiing_ftp)),
    ROWING("ROWING", "rowing", t.f130074q, R.string.lbl_rowing, i.b(R.string.lbl_rowing_ftp));


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w13.c f197338k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f197341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f197342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c3 f197343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f197333f = new a(null);
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: yi0.c.b
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return c.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    };

    static {
        f197338k = new w13.c(new c[]{r0, r1, r2});
    }

    private c(String str, String str2, t tVar, int i14, c3 c3Var) {
        super(str, i);
        this.f197339a = str;
        this.f197340b = str2;
        this.f197341c = tVar;
        this.f197342d = i14;
        this.f197343e = c3Var;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f197337j.clone();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyi0/c$a;", "", "<init>", "()V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static ArrayList a() {
            w13.c cVar = c.f197338k;
            ArrayList arrayList = new ArrayList(y.r(cVar, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                arrayList.add(((c) bVar.next()).f197339a);
            }
            return arrayList;
        }

        private a() {
        }
    }
}
