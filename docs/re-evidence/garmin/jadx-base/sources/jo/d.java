package jo;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 jo.d[], still in use, count: 1, list:
  (r0v1 jo.d[]) from 0x0074: CONSTRUCTOR (r0v1 jo.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\tB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ljo/d;", "Landroid/os/Parcelable;", "", "", "stringRes", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements Parcelable {
    ACTIVITIES(R.string.lbl_activities, "ACTIVITY_TYPES"),
    DATE_RANGE(R.string.filter_date_range, "DATE_RANGE"),
    DISTANCE(R.string.lbl_distance, "DISTANCE"),
    TIME(R.string.lbl_time, "TIME_RANGE"),
    TOTAL_ASCENT(R.string.lbl_total_ascent, "TOTAL_ASCENT"),
    EVENT_TYPE(R.string.activity_details_event_type, "EVENT_TYPE"),
    FAVORITE_ACTIVITIES(R.string.filter_favorite_activities, "FAVORITE_ACTIVITIES"),
    PERSONAL_RECORDS(R.string.concept_personal_records, "PERSONAL_RECORDS");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w13.c f99741m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f99731c = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: jo.d.b
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

    static {
        f99741m = new w13.c(new d[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    private d(int i14, String str) {
        super(str, i);
        this.f99742a = i14;
        this.f99743b = str;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f99740l.clone();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljo/d$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
