package pd1;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u008f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R,\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R,\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001d\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010.\u001a\u0004\b\u0019\u0010/\"\u0004\b0\u00101R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u00102\u001a\u0004\b7\u00104\"\u0004\b8\u00106¨\u00069"}, d2 = {"Lpd1/b;", "Landroid/os/Parcelable;", "", "userReminderId", "userProfileId", "", "reminderType", "occurrence", "", "reminderDays", "reminderTimes", "reminderText", "", "enabled", "Lorg/joda/time/DateTime;", "createTimestamp", "updateTimestamp", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "Ljava/lang/Integer;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/Integer;", "setUserReminderId", "(Ljava/lang/Integer;)V", "b", "j", "setUserProfileId", "c", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "setReminderType", "(Ljava/lang/String;)V", "d", "o", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "f", "()Ljava/util/List;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Ljava/util/List;)V", "h", "s", "g", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "m", "(Ljava/lang/Boolean;)V", "Lorg/joda/time/DateTime;", "getCreateTimestamp", "()Lorg/joda/time/DateTime;", "setCreateTimestamp", "(Lorg/joda/time/DateTime;)V", "getUpdateTimestamp", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userReminderId")
    private Integer userReminderId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private Integer userProfileId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reminderType")
    private String reminderType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("occurrence")
    private String occurrence;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reminderDays")
    private List<Integer> reminderDays;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reminderTimes")
    private List<Integer> reminderTimes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reminderText")
    private String reminderText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enabled")
    private Boolean enabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createTimestamp")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime createTimestamp;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updateTimestamp")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime updateTimestamp;

    /* JADX INFO: renamed from: pd1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2602b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList.add(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList2 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }
            }
            return new b(numValueOf, numValueOf2, string, string2, arrayList, arrayList2, parcel.readString(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new C2602b();
    }

    public b(Integer num, Integer num2, String str, String str2, List list, List list2, String str3, Boolean bool, DateTime dateTime, DateTime dateTime2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? j0.f134944a : list, (i14 & 32) != 0 ? j0.f134944a : list2, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : bool, (i14 & 256) != 0 ? null : dateTime, (i14 & 512) != 0 ? null : dateTime2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOccurrence() {
        return this.occurrence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.userReminderId, bVar.userReminderId) && s.g(this.userProfileId, bVar.userProfileId) && s.g(this.reminderType, bVar.reminderType) && s.g(this.occurrence, bVar.occurrence) && s.g(this.reminderDays, bVar.reminderDays) && s.g(this.reminderTimes, bVar.reminderTimes) && s.g(this.reminderText, bVar.reminderText) && s.g(this.enabled, bVar.enabled) && s.g(this.createTimestamp, bVar.createTimestamp) && s.g(this.updateTimestamp, bVar.updateTimestamp);
    }

    public final List<Integer> f() {
        return this.reminderDays;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getReminderText() {
        return this.reminderText;
    }

    public final List<Integer> h() {
        return this.reminderTimes;
    }

    public final int hashCode() {
        Integer num = this.userReminderId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.userProfileId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.reminderType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.occurrence;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Integer> list = this.reminderDays;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.reminderTimes;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.reminderText;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.enabled;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        DateTime dateTime = this.createTimestamp;
        int iHashCode9 = (iHashCode8 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.updateTimestamp;
        return iHashCode9 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getReminderType() {
        return this.reminderType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getUserProfileId() {
        return this.userProfileId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getUserReminderId() {
        return this.userReminderId;
    }

    public final void m(Boolean bool) {
        this.enabled = bool;
    }

    public final void o(String str) {
        this.occurrence = str;
    }

    public final void q(List<Integer> list) {
        this.reminderDays = list;
    }

    public final void r(String str) {
        this.reminderText = str;
    }

    public final void s(List<Integer> list) {
        this.reminderTimes = list;
    }

    public final void t(DateTime dateTime) {
        this.updateTimestamp = dateTime;
    }

    public final String toString() {
        Integer num = this.userReminderId;
        Integer num2 = this.userProfileId;
        String str = this.reminderType;
        String str2 = this.occurrence;
        List<Integer> list = this.reminderDays;
        List<Integer> list2 = this.reminderTimes;
        String str3 = this.reminderText;
        Boolean bool = this.enabled;
        DateTime dateTime = this.createTimestamp;
        DateTime dateTime2 = this.updateTimestamp;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "UserReminderDTO(userReminderId=", ", userProfileId=", ", reminderType=", num2);
        sn.a.t(sbL, str, ", occurrence=", str2, ", reminderDays=");
        n23.j.z(sbL, list, ", reminderTimes=", list2, ", reminderText=");
        i.w(sbL, str3, ", enabled=", bool, ", createTimestamp=");
        sbL.append(dateTime);
        sbL.append(", updateTimestamp=");
        sbL.append(dateTime2);
        sbL.append(")");
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.userReminderId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        Integer num2 = this.userProfileId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num2);
        }
        parcel.writeString(this.reminderType);
        parcel.writeString(this.occurrence);
        List<Integer> list = this.reminderDays;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                Integer num3 = (Integer) itO.next();
                if (num3 == null) {
                    parcel.writeInt(0);
                } else {
                    f.k(parcel, 1, num3);
                }
            }
        }
        List<Integer> list2 = this.reminderTimes;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                Integer num4 = (Integer) itO2.next();
                if (num4 == null) {
                    parcel.writeInt(0);
                } else {
                    f.k(parcel, 1, num4);
                }
            }
        }
        parcel.writeString(this.reminderText);
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        parcel.writeSerializable(this.createTimestamp);
        parcel.writeSerializable(this.updateTimestamp);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpd1/b$a;", "", "<init>", "()V", "", "REMINDER_DAYS_NONE_API_VALUE", "I", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(Integer num, Integer num2, String str, String str2, List<Integer> list, List<Integer> list2, String str3, Boolean bool, DateTime dateTime, DateTime dateTime2) {
        this.userReminderId = num;
        this.userProfileId = num2;
        this.reminderType = str;
        this.occurrence = str2;
        this.reminderDays = list;
        this.reminderTimes = list2;
        this.reminderText = str3;
        this.enabled = bool;
        this.createTimestamp = dateTime;
        this.updateTimestamp = dateTime2;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
