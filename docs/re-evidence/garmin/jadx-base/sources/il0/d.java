package il0;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 il0.d[], still in use, count: 1, list:
  (r0v1 il0.d[]) from 0x0066: CONSTRUCTOR (r1v2 w13.c) = (r0v1 il0.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m)] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB!\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lil0/d;", "Landroid/os/Parcelable;", "", "", TtmlNode.ATTR_ID, "", "jsonValue", "strResourceID", "<init>", "(Ljava/lang/String;IILjava/lang/String;I)V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1, "Private", R.string.lbl_private_golf_course),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(2, "Public", R.string.lbl_public_golf_course),
    /* JADX INFO: Fake field, exist only in values array */
    SEMI_PRIVATE(3, "SemiPrivate", R.string.lbl_semiprivate_golf_course),
    /* JADX INFO: Fake field, exist only in values array */
    RESORT(4, "Resort", R.string.lbl_resort_golf_course),
    /* JADX INFO: Fake field, exist only in values array */
    MILITARY(5, "Military", R.string.lbl_military_golf_course),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER(6, "Other", R.string.lbl_other),
    NO_VALUE(7, "", R.string.no_value);

    public static final Parcelable.Creator<d> CREATOR;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f93967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseArray<d> f93968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<String, d> f93969f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93974c;

    static {
        w13.c cVar = new w13.c(dVarArr);
        f93967d = new a(null);
        CREATOR = new Parcelable.Creator<d>() { // from class: il0.d.b
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                return d.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        };
        f93968e = new SparseArray<>(cVar.getF134922d());
        f93969f = new HashMap<>(cVar.getF134922d());
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            d dVar = (d) bVar.next();
            f93968e.put(dVar.f93972a, dVar);
            f93969f.put(dVar.f93973b, dVar);
        }
    }

    private d(int i14, String str, int i15) {
        super(str, i);
        this.f93972a = i14;
        this.f93973b = str;
        this.f93974c = i15;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f93971h.clone();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lil0/d$a;", "", "<init>", "()V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
