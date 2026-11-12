package tw1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u0010\u0014R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0014\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u0010\u0019R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0014\u001a\u0004\b:\u0010\u0017\"\u0004\b;\u0010\u0019¨\u0006<"}, d2 = {"Ltw1/e;", "Landroid/os/Parcelable;", "", "eventDate", "eventType", "eventSubType", "trainingPlanLevel", "", "hasPowerMeter", "hasHRMonitor", "", "", "daysAvailable", "longRideDay", "startDate", "trainingPlanName", "localeKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "getEventType", "()Ljava/lang/String;", "setEventType", "(Ljava/lang/String;)V", "c", "getEventSubType", "setEventSubType", "d", "getTrainingPlanLevel", "setTrainingPlanLevel", JWKParameterNames.RSA_EXPONENT, "Z", "getHasPowerMeter", "()Z", "setHasPowerMeter", "(Z)V", "f", "getHasHRMonitor", "setHasHRMonitor", "g", "Ljava/util/List;", "getDaysAvailable", "()Ljava/util/List;", "setDaysAvailable", "(Ljava/util/List;)V", "h", "Ljava/lang/Integer;", "getLongRideDay", "()Ljava/lang/Integer;", "setLongRideDay", "(Ljava/lang/Integer;)V", IntegerTokenConverter.CONVERTER_KEY, "j", "getTrainingPlanName", "setTrainingPlanName", JWKParameterNames.OCT_KEY_VALUE, "getLocaleKey", "setLocaleKey", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventDate")
    private String eventDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventType")
    private String eventType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventSubType")
    private String eventSubType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanLevel")
    private String trainingPlanLevel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasPowerMeter")
    private boolean hasPowerMeter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasHRMonitor")
    private boolean hasHRMonitor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("daysAvailable")
    private List<Integer> daysAvailable;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longRideDay")
    private Integer longRideDay;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private String startDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanName")
    private String trainingPlanName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("localKey")
    private String localeKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z14 = false;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList2;
            }
            return new e(string, string2, string3, string4, z14, z15, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, boolean z14, boolean z15, List list, Integer num, String str5, String str6, String str7, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? false : z15, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : num, (i14 & 256) != 0 ? null : str5, (i14 & 512) != 0 ? null : str6, (i14 & 1024) != 0 ? null : str7);
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
        return p005kotlin.jvm.internal.s.g(this.eventDate, eVar.eventDate) && p005kotlin.jvm.internal.s.g(this.eventType, eVar.eventType) && p005kotlin.jvm.internal.s.g(this.eventSubType, eVar.eventSubType) && p005kotlin.jvm.internal.s.g(this.trainingPlanLevel, eVar.trainingPlanLevel) && this.hasPowerMeter == eVar.hasPowerMeter && this.hasHRMonitor == eVar.hasHRMonitor && p005kotlin.jvm.internal.s.g(this.daysAvailable, eVar.daysAvailable) && p005kotlin.jvm.internal.s.g(this.longRideDay, eVar.longRideDay) && p005kotlin.jvm.internal.s.g(this.startDate, eVar.startDate) && p005kotlin.jvm.internal.s.g(this.trainingPlanName, eVar.trainingPlanName) && p005kotlin.jvm.internal.s.g(this.localeKey, eVar.localeKey);
    }

    public final int hashCode() {
        String str = this.eventDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventSubType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trainingPlanLevel;
        int iG = q6.f.g(q6.f.g((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.hasPowerMeter), 31, this.hasHRMonitor);
        List<Integer> list = this.daysAvailable;
        int iHashCode4 = (iG + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.longRideDay;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.startDate;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.trainingPlanName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.localeKey;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.eventDate;
        String str2 = this.eventType;
        String str3 = this.eventSubType;
        String str4 = this.trainingPlanLevel;
        boolean z14 = this.hasPowerMeter;
        boolean z15 = this.hasHRMonitor;
        List<Integer> list = this.daysAvailable;
        Integer num = this.longRideDay;
        String str5 = this.startDate;
        String str6 = this.trainingPlanName;
        String str7 = this.localeKey;
        StringBuilder sbI = p6.b.i("PhasedTrainingPlanProfileDTO(eventDate=", str, ", eventType=", str2, ", eventSubType=");
        sn.a.t(sbI, str3, ", trainingPlanLevel=", str4, ", hasPowerMeter=");
        kg.f.q(", hasHRMonitor=", ", daysAvailable=", sbI, z14, z15);
        sbI.append(list);
        sbI.append(", longRideDay=");
        sbI.append(num);
        sbI.append(", startDate=");
        sn.a.t(sbI, str5, ", trainingPlanName=", str6, ", localeKey=");
        return am.j.o(str7, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.eventDate);
        parcel.writeString(this.eventType);
        parcel.writeString(this.eventSubType);
        parcel.writeString(this.trainingPlanLevel);
        parcel.writeInt(this.hasPowerMeter ? 1 : 0);
        parcel.writeInt(this.hasHRMonitor ? 1 : 0);
        List<Integer> list = this.daysAvailable;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeInt(((Number) itO.next()).intValue());
            }
        }
        Integer num = this.longRideDay;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.startDate);
        parcel.writeString(this.trainingPlanName);
        parcel.writeString(this.localeKey);
    }

    public e(String str, String str2, String str3, String str4, boolean z14, boolean z15, List<Integer> list, Integer num, String str5, String str6, String str7) {
        this.eventDate = str;
        this.eventType = str2;
        this.eventSubType = str3;
        this.trainingPlanLevel = str4;
        this.hasPowerMeter = z14;
        this.hasHRMonitor = z15;
        this.daysAvailable = list;
        this.longRideDay = num;
        this.startDate = str5;
        this.trainingPlanName = str6;
        this.localeKey = str7;
    }

    public e() {
        this(null, null, null, null, false, false, null, null, null, null, null, 2047, null);
    }
}
