package ix1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0015\u0010 R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u0019\u0010 R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, d2 = {"Lix1/h;", "Landroid/os/Parcelable;", "", "name", "trainingType", "trainingSubType", "trainingVersion", "startDate", "endDate", "", "includeBenchmarkWeek", "includeDeloadWeek", "", "Lix1/f;", "strengthTrainingDays", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "getTrainingType", "c", "h", "d", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_EXPONENT, "getStartDate", "getEndDate", "g", "Z", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingType")
    private final String trainingType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingSubType")
    private final String trainingSubType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingVersion")
    private final String trainingVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("includeBenchmarkWeek")
    private final boolean includeBenchmarkWeek;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("includeDeloadWeek")
    private final boolean includeDeloadWeek;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("strengthTrainingDays")
    private final List<f> strengthTrainingDays;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z14 = false;
            int iA = 0;
            boolean z15 = true;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() == 0) {
                z15 = z14;
            }
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            while (iA != i14) {
                iA = kg.f.a(f.CREATOR, parcel, arrayList, iA, 1);
            }
            return new h(string, string2, string3, string4, string5, string6, z14, z15, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public /* synthetic */ h(String str, String str2, String str3, String str4, String str5, String str6, boolean z14, boolean z15, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? false : z14, (i14 & 128) != 0 ? false : z15, list);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIncludeBenchmarkWeek() {
        return this.includeBenchmarkWeek;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIncludeDeloadWeek() {
        return this.includeDeloadWeek;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.name, hVar.name) && s.g(this.trainingType, hVar.trainingType) && s.g(this.trainingSubType, hVar.trainingSubType) && s.g(this.trainingVersion, hVar.trainingVersion) && s.g(this.startDate, hVar.startDate) && s.g(this.endDate, hVar.endDate) && this.includeBenchmarkWeek == hVar.includeBenchmarkWeek && this.includeDeloadWeek == hVar.includeDeloadWeek && s.g(this.strengthTrainingDays, hVar.strengthTrainingDays);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<f> g() {
        return this.strengthTrainingDays;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTrainingSubType() {
        return this.trainingSubType;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(this.name.hashCode() * 31, 31, this.trainingType), 31, this.trainingSubType);
        String str = this.trainingVersion;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endDate;
        return this.strengthTrainingDays.hashCode() + q6.f.g(q6.f.g((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.includeBenchmarkWeek), 31, this.includeDeloadWeek);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTrainingVersion() {
        return this.trainingVersion;
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.trainingType;
        String str3 = this.trainingSubType;
        String str4 = this.trainingVersion;
        String str5 = this.startDate;
        String str6 = this.endDate;
        boolean z14 = this.includeBenchmarkWeek;
        boolean z15 = this.includeDeloadWeek;
        List<f> list = this.strengthTrainingDays;
        StringBuilder sbI = p6.b.i("StrengthTrainingPlanDTO(name=", str, ", trainingType=", str2, ", trainingSubType=");
        sn.a.t(sbI, str3, ", trainingVersion=", str4, ", startDate=");
        sn.a.t(sbI, str5, ", endDate=", str6, ", includeBenchmarkWeek=");
        kg.f.q(", includeDeloadWeek=", ", strengthTrainingDays=", sbI, z14, z15);
        return z.c(sbI, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.trainingType);
        parcel.writeString(this.trainingSubType);
        parcel.writeString(this.trainingVersion);
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        parcel.writeInt(this.includeBenchmarkWeek ? 1 : 0);
        parcel.writeInt(this.includeDeloadWeek ? 1 : 0);
        Iterator itE = kg.f.e(this.strengthTrainingDays, parcel);
        while (itE.hasNext()) {
            ((f) itE.next()).writeToParcel(parcel, i14);
        }
    }

    public h(String str, String str2, String str3, String str4, String str5, String str6, boolean z14, boolean z15, List<f> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.name = str;
        this.trainingType = str2;
        this.trainingSubType = str3;
        this.trainingVersion = str4;
        this.startDate = str5;
        this.endDate = str6;
        this.includeBenchmarkWeek = z14;
        this.includeDeloadWeek = z15;
        this.strengthTrainingDays = list;
    }
}
