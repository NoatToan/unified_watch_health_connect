package vw1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import fg0.k;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B%\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\"\u0010$B#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\"\u0010%¨\u0006&"}, d2 = {"Lvw1/e;", "Landroid/os/Parcelable;", "", "workoutId", "workoutScheduleId", "associatedActivityId", "", "weekId", "", "isWorkout", "isRestDay", "isNote", "isFooter", "isCompleted", "isRescheduled", "isMissed", "", "note", "workoutName", "duration", "description", "descriptionContentDescription", "Lorg/joda/time/DateTime;", "date", "associatedActivityDate", "isRaceDay", "Lfg0/k;", "eventDTO", "isAfterRaceDay", "isCalendarItem", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "associatedActivity", "Lm52/k;", "workoutSportType", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;ZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLfg0/k;ZZLcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;Lm52/k;)V", "(ZLjava/lang/String;Lorg/joda/time/DateTime;)V", "(ZLorg/joda/time/DateTime;Z)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f180567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f180568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f180569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f180570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f180571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f180572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f180573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f180574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f180575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f180576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f180577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f180578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f180579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f180580n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f180581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f180582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DateTime f180583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DateTime f180584r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f180585t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f180586v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f180587w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f180588x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ActivityListItemDTO f180589y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m52.k f180590z;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z16 = false;
            boolean z17 = true;
            boolean z18 = parcel.readInt() != 0;
            boolean z19 = parcel.readInt() != 0;
            boolean z24 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z16 = true;
            }
            if (parcel.readInt() == 0) {
                z17 = z16;
            }
            boolean z25 = parcel.readInt() != 0 ? z17 : z16;
            if (parcel.readInt() != 0) {
                z15 = false;
                z14 = z17;
            } else {
                z14 = z16;
                z15 = z14;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String string3 = parcel.readString();
            boolean z26 = z15;
            String string4 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z26 = true;
            }
            Long l14 = lValueOf;
            k kVar = (k) parcel.readParcelable(e.class.getClassLoader());
            boolean z27 = parcel.readInt() != 0 ? true : z26;
            if (parcel.readInt() != 0) {
                z26 = true;
            }
            return new e(l14, lValueOf2, lValueOf3, numValueOf, z18, z19, z24, z16, z17, z25, z14, string, string2, numValueOf2, string3, string4, dateTime, dateTime2, z26, kVar, z27, z26, (ActivityListItemDTO) parcel.readParcelable(e.class.getClassLoader()), m52.k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(Long l14, Long l15, Long l16, Integer num, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, String str, String str2, Integer num2, String str3, String str4, DateTime dateTime, DateTime dateTime2, boolean z25, k kVar, boolean z26, boolean z27, ActivityListItemDTO activityListItemDTO, m52.k kVar2, int i14, j jVar) {
        this(l14, l15, l16, num, z14, z15, z16, z17, z18, z19, z24, str, str2, num2, str3, str4, dateTime, dateTime2, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? false : z25, (i14 & 524288) != 0 ? null : kVar, (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? false : z26, (i14 & 2097152) != 0 ? false : z27, (i14 & 4194304) != 0 ? null : activityListItemDTO, (i14 & 8388608) != 0 ? m52.k.f116755o : kVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f180567a, eVar.f180567a) && s.g(this.f180568b, eVar.f180568b) && s.g(this.f180569c, eVar.f180569c) && s.g(this.f180570d, eVar.f180570d) && this.f180571e == eVar.f180571e && this.f180572f == eVar.f180572f && this.f180573g == eVar.f180573g && this.f180574h == eVar.f180574h && this.f180575i == eVar.f180575i && this.f180576j == eVar.f180576j && this.f180577k == eVar.f180577k && s.g(this.f180578l, eVar.f180578l) && s.g(this.f180579m, eVar.f180579m) && s.g(this.f180580n, eVar.f180580n) && s.g(this.f180581o, eVar.f180581o) && s.g(this.f180582p, eVar.f180582p) && s.g(this.f180583q, eVar.f180583q) && s.g(this.f180584r, eVar.f180584r) && this.f180585t == eVar.f180585t && s.g(this.f180586v, eVar.f180586v) && this.f180587w == eVar.f180587w && this.f180588x == eVar.f180588x && s.g(this.f180589y, eVar.f180589y) && this.f180590z == eVar.f180590z;
    }

    public final int hashCode() {
        Long l14 = this.f180567a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.f180568b;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.f180569c;
        int iHashCode3 = (iHashCode2 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Integer num = this.f180570d;
        int iG = f.g(f.g(f.g(f.g(f.g(f.g(f.g((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f180571e), 31, this.f180572f), 31, this.f180573g), 31, this.f180574h), 31, this.f180575i), 31, this.f180576j), 31, this.f180577k);
        String str = this.f180578l;
        int iHashCode4 = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f180579m;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f180580n;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f180581o;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f180582p;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DateTime dateTime = this.f180583q;
        int iHashCode9 = (iHashCode8 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f180584r;
        int iG2 = f.g((iHashCode9 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31, 31, this.f180585t);
        k kVar = this.f180586v;
        int iG3 = f.g(f.g((iG2 + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.f180587w), 31, this.f180588x);
        ActivityListItemDTO activityListItemDTO = this.f180589y;
        return this.f180590z.hashCode() + ((iG3 + (activityListItemDTO != null ? activityListItemDTO.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f180581o;
        String str2 = this.f180582p;
        StringBuilder sbJ = f3.j(this.f180567a, this.f180568b, "TrainingTaskAdapterItem(workoutId=", ", workoutScheduleId=", ", associatedActivityId=");
        sbJ.append(this.f180569c);
        sbJ.append(", weekId=");
        sbJ.append(this.f180570d);
        sbJ.append(", isWorkout=");
        kg.f.q(", isRestDay=", ", isNote=", sbJ, this.f180571e, this.f180572f);
        kg.f.q(", isFooter=", ", isCompleted=", sbJ, this.f180573g, this.f180574h);
        kg.f.q(", isRescheduled=", ", isMissed=", sbJ, this.f180575i, this.f180576j);
        fb1.c.w(", note=", this.f180578l, ", workoutName=", sbJ, this.f180577k);
        fb1.c.u(this.f180580n, this.f180579m, ", duration=", ", description=", sbJ);
        sn.a.t(sbJ, str, ", descriptionContentDescription=", str2, ", date=");
        sbJ.append(this.f180583q);
        sbJ.append(", associatedActivityDate=");
        sbJ.append(this.f180584r);
        sbJ.append(", isRaceDay=");
        sbJ.append(this.f180585t);
        sbJ.append(", eventDTO=");
        sbJ.append(this.f180586v);
        sbJ.append(", isAfterRaceDay=");
        kg.f.q(", isCalendarItem=", ", associatedActivity=", sbJ, this.f180587w, this.f180588x);
        sbJ.append(this.f180589y);
        sbJ.append(", workoutSportType=");
        sbJ.append(this.f180590z);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f180567a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.f180568b;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Long l16 = this.f180569c;
        if (l16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l16);
        }
        Integer num = this.f180570d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeInt(this.f180571e ? 1 : 0);
        parcel.writeInt(this.f180572f ? 1 : 0);
        parcel.writeInt(this.f180573g ? 1 : 0);
        parcel.writeInt(this.f180574h ? 1 : 0);
        parcel.writeInt(this.f180575i ? 1 : 0);
        parcel.writeInt(this.f180576j ? 1 : 0);
        parcel.writeInt(this.f180577k ? 1 : 0);
        parcel.writeString(this.f180578l);
        parcel.writeString(this.f180579m);
        Integer num2 = this.f180580n;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.f180581o);
        parcel.writeString(this.f180582p);
        parcel.writeSerializable(this.f180583q);
        parcel.writeSerializable(this.f180584r);
        parcel.writeInt(this.f180585t ? 1 : 0);
        parcel.writeParcelable(this.f180586v, i14);
        parcel.writeInt(this.f180587w ? 1 : 0);
        parcel.writeInt(this.f180588x ? 1 : 0);
        parcel.writeParcelable(this.f180589y, i14);
        parcel.writeString(this.f180590z.name());
    }

    public e(Long l14, Long l15, Long l16, Integer num, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, String str, String str2, Integer num2, String str3, String str4, DateTime dateTime, DateTime dateTime2, boolean z25, k kVar, boolean z26, boolean z27, ActivityListItemDTO activityListItemDTO, m52.k kVar2) {
        kVar2.getClass();
        this.f180567a = l14;
        this.f180568b = l15;
        this.f180569c = l16;
        this.f180570d = num;
        this.f180571e = z14;
        this.f180572f = z15;
        this.f180573g = z16;
        this.f180574h = z17;
        this.f180575i = z18;
        this.f180576j = z19;
        this.f180577k = z24;
        this.f180578l = str;
        this.f180579m = str2;
        this.f180580n = num2;
        this.f180581o = str3;
        this.f180582p = str4;
        this.f180583q = dateTime;
        this.f180584r = dateTime2;
        this.f180585t = z25;
        this.f180586v = kVar;
        this.f180587w = z26;
        this.f180588x = z27;
        this.f180589y = activityListItemDTO;
        this.f180590z = kVar2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(boolean z14, String str, DateTime dateTime) {
        long j8 = 0L;
        this(j8, j8, j8, 0, false, false, z14, false, false, false, false, str, null, null, null, null, dateTime, null, false, null, false, false, null, null, 16515072, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(boolean z14, DateTime dateTime, boolean z15) {
        long j8 = 0L;
        this(j8, j8, j8, 0, false, z14, false, false, false, false, false, null, null, null, null, null, dateTime, null, false, null, z15, true, null, null, 13369344, null);
    }
}
