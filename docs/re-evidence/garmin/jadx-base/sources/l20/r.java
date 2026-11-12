package l20;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Ll20/r;", "Landroid/os/Parcelable;", "", "Ll20/a;", "contacts", "emergencyServiceContact", "", "contactLimit", "Ll20/q;", "selfUserContactDTO", "", "messengerAccountStatusForSelfString", "messengerSmsStatusForSelfString", "<init>", "(Ljava/util/List;Ll20/a;Ljava/lang/Integer;Ll20/q;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "b", "Ll20/a;", "g", "()Ll20/a;", "c", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Ll20/q;", "j", "()Ll20/q;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "h", "()Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userContactDTOs")
    private final List<l20.a> contacts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("headlessContact")
    private final l20.a emergencyServiceContact;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactLimit")
    private final Integer contactLimit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("selfUserContactDTO")
    private final q selfUserContactDTO;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messengerAccountStatusForSelf")
    private final String messengerAccountStatusForSelfString;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messengerSMSStatusForSelf")
    private final String messengerSmsStatusForSelfString;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(l20.a.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new r(arrayList, parcel.readInt() == 0 ? null : l20.a.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? q.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public /* synthetic */ r(List list, l20.a aVar, Integer num, q qVar, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : qVar, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? null : str2);
    }

    public static r b(r rVar, List list, l20.a aVar, q qVar, int i14) {
        if ((i14 & 1) != 0) {
            list = rVar.contacts;
        }
        List list2 = list;
        if ((i14 & 2) != 0) {
            aVar = rVar.emergencyServiceContact;
        }
        l20.a aVar2 = aVar;
        Integer num = rVar.contactLimit;
        if ((i14 & 8) != 0) {
            qVar = rVar.selfUserContactDTO;
        }
        String str = rVar.messengerAccountStatusForSelfString;
        String str2 = rVar.messengerSmsStatusForSelfString;
        rVar.getClass();
        return new r(list2, aVar2, num, qVar, str, str2);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getContactLimit() {
        return this.contactLimit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return s.g(this.contacts, rVar.contacts) && s.g(this.emergencyServiceContact, rVar.emergencyServiceContact) && s.g(this.contactLimit, rVar.contactLimit) && s.g(this.selfUserContactDTO, rVar.selfUserContactDTO) && s.g(this.messengerAccountStatusForSelfString, rVar.messengerAccountStatusForSelfString) && s.g(this.messengerSmsStatusForSelfString, rVar.messengerSmsStatusForSelfString);
    }

    public final List<l20.a> f() {
        return this.contacts;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final l20.a getEmergencyServiceContact() {
        return this.emergencyServiceContact;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getMessengerAccountStatusForSelfString() {
        return this.messengerAccountStatusForSelfString;
    }

    public final int hashCode() {
        List<l20.a> list = this.contacts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        l20.a aVar = this.emergencyServiceContact;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.contactLimit;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        q qVar = this.selfUserContactDTO;
        int iHashCode4 = (iHashCode3 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str = this.messengerAccountStatusForSelfString;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.messengerSmsStatusForSelfString;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getMessengerSmsStatusForSelfString() {
        return this.messengerSmsStatusForSelfString;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final q getSelfUserContactDTO() {
        return this.selfUserContactDTO;
    }

    public final String toString() {
        List<l20.a> list = this.contacts;
        l20.a aVar = this.emergencyServiceContact;
        Integer num = this.contactLimit;
        q qVar = this.selfUserContactDTO;
        String str = this.messengerAccountStatusForSelfString;
        String str2 = this.messengerSmsStatusForSelfString;
        StringBuilder sb3 = new StringBuilder("UserContactsDTO(contacts=");
        sb3.append(list);
        sb3.append(", emergencyServiceContact=");
        sb3.append(aVar);
        sb3.append(", contactLimit=");
        sb3.append(num);
        sb3.append(", selfUserContactDTO=");
        sb3.append(qVar);
        sb3.append(", messengerAccountStatusForSelfString=");
        return e5.h(sb3, str, ", messengerSmsStatusForSelfString=", str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<l20.a> list = this.contacts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((l20.a) itO.next()).writeToParcel(parcel, i14);
            }
        }
        l20.a aVar = this.emergencyServiceContact;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        Integer num = this.contactLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        q qVar = this.selfUserContactDTO;
        if (qVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.messengerAccountStatusForSelfString);
        parcel.writeString(this.messengerSmsStatusForSelfString);
    }

    public r(List<l20.a> list, l20.a aVar, Integer num, q qVar, String str, String str2) {
        this.contacts = list;
        this.emergencyServiceContact = aVar;
        this.contactLimit = num;
        this.selfUserContactDTO = qVar;
        this.messengerAccountStatusForSelfString = str;
        this.messengerSmsStatusForSelfString = str2;
    }

    public r() {
        this(null, null, null, null, null, null, 63, null);
    }
}
