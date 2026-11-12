package xw1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fBO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lxw1/j;", "Landroid/os/Parcelable;", "", "actionOptionId", "Lxw1/a;", "actionOption", "Lxw1/m;", "suggestedPlanGoal", "", "availableRaceStartDate", "availableRaceEndDate", "", "suggestedGoalTime", "<init>", "(Ljava/lang/Long;Lxw1/a;Lxw1/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "b", "Lxw1/a;", "getActionOption", "()Lxw1/a;", "c", "Lxw1/m;", "h", "()Lxw1/m;", "Ljava/lang/String;", "getAvailableRaceStartDate", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "getAvailableRaceEndDate", "f", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("actionOptionId")
    private final Long actionOptionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("actionOption")
    private final xw1.a actionOption;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("suggestedPlanGoal")
    private final m suggestedPlanGoal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("availableRaceStartDate")
    private final String availableRaceStartDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("availableRaceEndDate")
    private final String availableRaceEndDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("suggestedGoalTime")
    private final Integer suggestedGoalTime;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            xw1.a aVarCreateFromParcel = parcel.readInt() == 0 ? null : xw1.a.CREATOR.createFromParcel(parcel);
            m mVarCreateFromParcel = parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            Integer numValueOf = null;
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new j(lValueOf, aVarCreateFromParcel, mVarCreateFromParcel, string, string2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ j(Long l14, xw1.a aVar, m mVar, String str, String str2, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0L : l14, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : mVar, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : num);
    }

    public final long b() {
        Long l14 = this.actionOptionId;
        if (l14 != null) {
            return l14.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getActionOptionId() {
        return this.actionOptionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.actionOptionId, jVar.actionOptionId) && s.g(this.actionOption, jVar.actionOption) && s.g(this.suggestedPlanGoal, jVar.suggestedPlanGoal) && s.g(this.availableRaceStartDate, jVar.availableRaceStartDate) && s.g(this.availableRaceEndDate, jVar.availableRaceEndDate) && s.g(this.suggestedGoalTime, jVar.suggestedGoalTime);
    }

    public final String f() {
        xw1.a aVar = this.actionOption;
        if (aVar != null) {
            return aVar.getButtonTextLocalized();
        }
        return null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getSuggestedGoalTime() {
        return this.suggestedGoalTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final m getSuggestedPlanGoal() {
        return this.suggestedPlanGoal;
    }

    public final int hashCode() {
        Long l14 = this.actionOptionId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        xw1.a aVar = this.actionOption;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        m mVar = this.suggestedPlanGoal;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str = this.availableRaceStartDate;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.availableRaceEndDate;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.suggestedGoalTime;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final boolean i() {
        xw1.a aVar = this.actionOption;
        return "ADD_TAB_BAR_ITEM".equals(aVar != null ? aVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() : null);
    }

    public final boolean j() {
        xw1.a aVar = this.actionOption;
        return "CHANGE_PACE".equals(aVar != null ? aVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() : null);
    }

    public final boolean k() {
        xw1.a aVar = this.actionOption;
        return "CHANGE_PLAN".equals(aVar != null ? aVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() : null);
    }

    public final boolean m() {
        xw1.a aVar = this.actionOption;
        return "IGNORE_DASHBOARD_ACTION".equals(aVar != null ? aVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() : null);
    }

    public final boolean o() {
        xw1.a aVar = this.actionOption;
        return "IGNORE".equals(aVar != null ? aVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() : null);
    }

    public final boolean q() {
        xw1.a aVar = this.actionOption;
        return "PAUSE".equals(aVar != null ? aVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() : null);
    }

    public final boolean r() {
        xw1.a aVar = this.actionOption;
        return "RESCHEDULE_RACE".equals(aVar != null ? aVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() : null);
    }

    public final boolean s() {
        xw1.a aVar = this.actionOption;
        return "SET_LONG_DAY".equals(aVar != null ? aVar.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() : null);
    }

    public final String toString() {
        return "PlanActionDTO(actionOptionId=" + this.actionOptionId + ", actionOption=" + this.actionOption + ", suggestedPlanGoal=" + this.suggestedPlanGoal + ", availableRaceStartDate=" + this.availableRaceStartDate + ", availableRaceEndDate=" + this.availableRaceEndDate + ", suggestedGoalTime=" + this.suggestedGoalTime + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.actionOptionId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        xw1.a aVar = this.actionOption;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        m mVar = this.suggestedPlanGoal;
        if (mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.availableRaceStartDate);
        parcel.writeString(this.availableRaceEndDate);
        Integer num = this.suggestedGoalTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lxw1/j$a;", "", "<init>", "()V", "", "IGNORE", "Ljava/lang/String;", "PAUSE", "RESCHEDULE_DATE", "CHANGE_PACE", "CHANGE_PLAN", "ADD_TAB_BAR_ITEM", "IGNORE_DASHBOARD_ACTION", "SET_LONG_DAY", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public j(Long l14, xw1.a aVar, m mVar, String str, String str2, Integer num) {
        this.actionOptionId = l14;
        this.actionOption = aVar;
        this.suggestedPlanGoal = mVar;
        this.availableRaceStartDate = str;
        this.availableRaceEndDate = str2;
        this.suggestedGoalTime = num;
    }

    public j() {
        this(null, null, null, null, null, null, 63, null);
    }
}
