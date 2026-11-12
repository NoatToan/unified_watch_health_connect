package tw1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b(\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b\u001a\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b/\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b0\u0010%R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b.\u0010-¨\u00062"}, d2 = {"Ltw1/c;", "Landroid/os/Parcelable;", "Ltw1/s;", "trainingType", "Ltw1/q;", "trainingSubType", "", TtmlNode.ATTR_ID, "", "name", "description", "shortDescription", "", "keyFeatures", "durationInWeeks", "avgWeeklyWorkouts", "image", "largeImage", "Ltw1/d;", "levels", "<init>", "(Ltw1/s;Ltw1/q;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ltw1/s;", "m", "()Ltw1/s;", "b", "Ltw1/q;", JWKParameterNames.OCT_KEY_VALUE, "()Ltw1/q;", "c", "I", "h", "()I", "d", "Ljava/lang/String;", "j", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "getDescription", "f", "getShortDescription", "g", "Ljava/util/List;", "getKeyFeatures", "()Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "getImage", "getLargeImage", "l", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingType")
    private final s trainingType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingSubType")
    private final q trainingSubType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final int id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private final String description;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("shortDescription")
    private final String shortDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("keyFeatures")
    private final List<String> keyFeatures;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationInWeeks")
    private final String durationInWeeks;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgWeeklyWorkouts")
    private final String avgWeeklyWorkouts;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("image")
    private final String image;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("largeImage")
    private final String largeImage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levels")
    private final List<d> levels;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            s sVarCreateFromParcel = s.CREATOR.createFromParcel(parcel);
            q qVarCreateFromParcel = q.CREATOR.createFromParcel(parcel);
            int i14 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            int iA = 0;
            while (iA != i15) {
                iA = kg.f.a(d.CREATOR, parcel, arrayList, iA, 1);
                i15 = i15;
            }
            return new c(sVarCreateFromParcel, qVarCreateFromParcel, i14, string, string2, string3, arrayListCreateStringArrayList, string4, string5, string6, string7, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(s sVar, q qVar, int i14, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, List list2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(sVar, qVar, i14, (i15 & 8) != 0 ? null : str, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? null : str3, (i15 & 64) != 0 ? null : list, (i15 & 128) != 0 ? null : str4, (i15 & 256) != 0 ? null : str5, (i15 & 512) != 0 ? null : str6, (i15 & 1024) != 0 ? null : str7, list2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAvgWeeklyWorkouts() {
        return this.avgWeeklyWorkouts;
    }

    public final o13.p<LocalDate, LocalDate> d() {
        String str;
        String str2;
        String str3 = this.durationInWeeks;
        List listW = str3 != null ? w.W(str3, new String[]{"-"}) : null;
        int i14 = 0;
        if ((listW != null ? listW.size() : 0) > 1) {
            int i15 = (listW == null || (str2 = (String) listW.get(0)) == null) ? 0 : Integer.parseInt(str2);
            if (listW != null && (str = (String) listW.get(1)) != null) {
                i14 = Integer.parseInt(str);
            }
            if (i15 != 0 && i14 != 0) {
                return new o13.p<>(LocalDate.now().plusWeeks(i15), LocalDate.now().plusWeeks(i14));
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.trainingType, cVar.trainingType) && p005kotlin.jvm.internal.s.g(this.trainingSubType, cVar.trainingSubType) && this.id == cVar.id && p005kotlin.jvm.internal.s.g(this.name, cVar.name) && p005kotlin.jvm.internal.s.g(this.description, cVar.description) && p005kotlin.jvm.internal.s.g(this.shortDescription, cVar.shortDescription) && p005kotlin.jvm.internal.s.g(this.keyFeatures, cVar.keyFeatures) && p005kotlin.jvm.internal.s.g(this.durationInWeeks, cVar.durationInWeeks) && p005kotlin.jvm.internal.s.g(this.avgWeeklyWorkouts, cVar.avgWeeklyWorkouts) && p005kotlin.jvm.internal.s.g(this.image, cVar.image) && p005kotlin.jvm.internal.s.g(this.largeImage, cVar.largeImage) && p005kotlin.jvm.internal.s.g(this.levels, cVar.levels);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDurationInWeeks() {
        return this.durationInWeeks;
    }

    public final String g() {
        List<d> list = this.levels;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((d) it.next()).getAvgWorkoutHoursPerWeek()));
        }
        List listM0 = h0.M0(h0.T(arrayList));
        if (listM0.size() <= 1) {
            Integer num = (Integer) h0.d0(listM0);
            if (num != null) {
                return String.valueOf(num.intValue());
            }
            return null;
        }
        return h0.b0(listM0) + "-" + h0.m0(listM0);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int iD = q2.d(this.id, (this.trainingSubType.hashCode() + (this.trainingType.hashCode() * 31)) * 31, 31);
        String str = this.name;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortDescription;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.keyFeatures;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.durationInWeeks;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.avgWeeklyWorkouts;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.image;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.largeImage;
        return this.levels.hashCode() + ((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final List<d> i() {
        return this.levels;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final q getTrainingSubType() {
        return this.trainingSubType;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final s getTrainingType() {
        return this.trainingType;
    }

    public final String toString() {
        s sVar = this.trainingType;
        q qVar = this.trainingSubType;
        int i14 = this.id;
        String str = this.name;
        String str2 = this.description;
        String str3 = this.shortDescription;
        List<String> list = this.keyFeatures;
        String str4 = this.durationInWeeks;
        String str5 = this.avgWeeklyWorkouts;
        String str6 = this.image;
        String str7 = this.largeImage;
        List<d> list2 = this.levels;
        StringBuilder sb3 = new StringBuilder("ITPSubTypeDTO(trainingType=");
        sb3.append(sVar);
        sb3.append(", trainingSubType=");
        sb3.append(qVar);
        sb3.append(", id=");
        wr.g.t(i14, ", name=", str, ", description=", sb3);
        sn.a.t(sb3, str2, ", shortDescription=", str3, ", keyFeatures=");
        o2.c.n(", durationInWeeks=", str4, ", avgWeeklyWorkouts=", sb3, list);
        sn.a.t(sb3, str5, ", image=", str6, ", largeImage=");
        sb3.append(str7);
        sb3.append(", levels=");
        sb3.append(list2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.trainingType.writeToParcel(parcel, i14);
        this.trainingSubType.writeToParcel(parcel, i14);
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.shortDescription);
        parcel.writeStringList(this.keyFeatures);
        parcel.writeString(this.durationInWeeks);
        parcel.writeString(this.avgWeeklyWorkouts);
        parcel.writeString(this.image);
        parcel.writeString(this.largeImage);
        Iterator itE = kg.f.e(this.levels, parcel);
        while (itE.hasNext()) {
            ((d) itE.next()).writeToParcel(parcel, i14);
        }
    }

    public c(s sVar, q qVar, int i14, String str, String str2, String str3, List<String> list, String str4, String str5, String str6, String str7, List<d> list2) {
        sVar.getClass();
        qVar.getClass();
        list2.getClass();
        this.trainingType = sVar;
        this.trainingSubType = qVar;
        this.id = i14;
        this.name = str;
        this.description = str2;
        this.shortDescription = str3;
        this.keyFeatures = list;
        this.durationInWeeks = str4;
        this.avgWeeklyWorkouts = str5;
        this.image = str6;
        this.largeImage = str7;
        this.levels = list2;
    }
}
