package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0011\u0015BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0011\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lfo2/r;", "Landroid/os/Parcelable;", "", "status", "", "summary", "description", "details", "Lfo2/r$b;", "errors", "message", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfo2/r$b;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "getSummary", "()Ljava/lang/String;", "c", "getDescription", "d", "getDetails", JWKParameterNames.RSA_EXPONENT, "Lfo2/r$b;", "()Lfo2/r$b;", "f", "getMessage", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private final Integer status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("summary")
    private final String summary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("details")
    private final String details;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errors")
    private final b errors;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("message")
    private final String message;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            Integer numValueOf;
            b bVar;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                bVar = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                bVar = null;
            }
            String string = parcel.readString();
            b bVar2 = bVar;
            String string2 = parcel.readString();
            b bVarCreateFromParcel = bVar2;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                bVarCreateFromParcel = b.CREATOR.createFromParcel(parcel);
            }
            return new r(numValueOf, string, string2, string3, bVarCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public /* synthetic */ r(Integer num, String str, String str2, String str3, b bVar, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : bVar, (i14 & 32) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getErrors() {
        return this.errors;
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
        return p005kotlin.jvm.internal.s.g(this.status, rVar.status) && p005kotlin.jvm.internal.s.g(this.summary, rVar.summary) && p005kotlin.jvm.internal.s.g(this.description, rVar.description) && p005kotlin.jvm.internal.s.g(this.details, rVar.details) && p005kotlin.jvm.internal.s.g(this.errors, rVar.errors) && p005kotlin.jvm.internal.s.g(this.message, rVar.message);
    }

    public final int hashCode() {
        Integer num = this.status;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.summary;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.details;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        b bVar = this.errors;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str4 = this.message;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.status;
        String str = this.summary;
        String str2 = this.description;
        String str3 = this.details;
        b bVar = this.errors;
        String str4 = this.message;
        StringBuilder sbF = l2.f("MissingFieldsErrorResponse(status=", num, ", summary=", str, ", description=");
        sn.a.t(sbF, str2, ", details=", str3, ", errors=");
        sbF.append(bVar);
        sbF.append(", message=");
        sbF.append(str4);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.summary);
        parcel.writeString(this.description);
        parcel.writeString(this.details);
        b bVar = this.errors;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.message);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfo2/r$b;", "Landroid/os/Parcelable;", "", "Lfo2/r$c;", "INVALID_INPUT", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("INVALID_INPUT")
        private final List<c> INVALID_INPUT;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i14 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i14);
                    int iA = 0;
                    while (iA != i14) {
                        iA = kg.f.a(c.CREATOR, parcel, arrayList2, iA, 1);
                    }
                    arrayList = arrayList2;
                }
                return new b(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : list);
        }

        public final List<c> b() {
            return this.INVALID_INPUT;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.INVALID_INPUT, ((b) obj).INVALID_INPUT);
        }

        public final int hashCode() {
            List<c> list = this.INVALID_INPUT;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return tn.k.h("Errors(INVALID_INPUT=", ")", this.INVALID_INPUT);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            List<c> list = this.INVALID_INPUT;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((c) itO.next()).writeToParcel(parcel, i14);
            }
        }

        public b(List<c> list) {
            this.INVALID_INPUT = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfo2/r$c;", "Landroid/os/Parcelable;", "", "flag", "", "fields", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("flag")
        private final String flag;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("fields")
        private final List<String> fields;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new c(parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        public c(String str, List<String> list) {
            str.getClass();
            this.flag = str;
            this.fields = list;
        }

        public final List<String> b() {
            return this.fields;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFlag() {
            return this.flag;
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
            return p005kotlin.jvm.internal.s.g(this.flag, cVar.flag) && p005kotlin.jvm.internal.s.g(this.fields, cVar.fields);
        }

        public final int hashCode() {
            int iHashCode = this.flag.hashCode() * 31;
            List<String> list = this.fields;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return fb1.c.o("Items(flag=", this.flag, ", fields=", this.fields, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.flag);
            parcel.writeStringList(this.fields);
        }

        public /* synthetic */ c(String str, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : list);
        }
    }

    public r(Integer num, String str, String str2, String str3, b bVar, String str4) {
        this.status = num;
        this.summary = str;
        this.description = str2;
        this.details = str3;
        this.errors = bVar;
        this.message = str4;
    }

    public r() {
        this(null, null, null, null, null, null, 63, null);
    }
}
