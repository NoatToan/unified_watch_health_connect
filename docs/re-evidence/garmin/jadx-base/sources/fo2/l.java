package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0013\u000e\u0014B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lfo2/l;", "Landroid/os/Parcelable;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "Lfo2/l$d;", "templates", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;Lfo2/l$d;)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "getLinks", "()Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "setLinks", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;)V", "b", "Lfo2/l$d;", "()Lfo2/l$d;", "setTemplates", "(Lfo2/l$d;)V", "d", "c", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private Links links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_templates")
    private d templates;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l((Links) parcel.readSerializable(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public /* synthetic */ l(Links links, d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : links, (i14 & 2) != 0 ? null : dVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getTemplates() {
        return this.templates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.links, lVar.links) && p005kotlin.jvm.internal.s.g(this.templates, lVar.templates);
    }

    public final int hashCode() {
        Links links = this.links;
        int iHashCode = (links == null ? 0 : links.f51142a.hashCode()) * 31;
        d dVar = this.templates;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "HalFormResponse(links=" + this.links + ", templates=" + this.templates + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.links);
        d dVar = this.templates;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\u000b"}, d2 = {"Lfo2/l$d;", "Landroid/os/Parcelable;", "Lfo2/l$b;", "default", "<init>", "(Lfo2/l$b;)V", "a", "Lfo2/l$b;", "b", "()Lfo2/l$b;", "setDefault", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("default")
        private b default;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new d(parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        public /* synthetic */ d(b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : bVar);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getDefault() {
            return this.default;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.default, ((d) obj).default);
        }

        public final int hashCode() {
            b bVar = this.default;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public final String toString() {
            return "Templates(default=" + this.default + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            b bVar = this.default;
            if (bVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bVar.writeToParcel(parcel, i14);
            }
        }

        public d(b bVar) {
            this.default = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public l(Links links, d dVar) {
        this.links = links;
        this.templates = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfo2/l$b;", "Landroid/os/Parcelable;", "", FirebaseAnalytics.Param.METHOD, "contentType", "", "Lfo2/l$c;", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", "setMethod", "(Ljava/lang/String;)V", "b", "getContentType", "setContentType", "c", "Ljava/util/List;", "()Ljava/util/List;", "setProperties", "(Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName(FirebaseAnalytics.Param.METHOD)
        private String method;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("contentType")
        private String contentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("properties")
        private List<c> properties;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                parcel.getClass();
                String string = parcel.readString();
                String string2 = parcel.readString();
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
                return new b(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        public /* synthetic */ b(String str, String str2, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : list);
        }

        public final List<c> b() {
            return this.properties;
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
            return p005kotlin.jvm.internal.s.g(this.method, bVar.method) && p005kotlin.jvm.internal.s.g(this.contentType, bVar.contentType) && p005kotlin.jvm.internal.s.g(this.properties, bVar.properties);
        }

        public final int hashCode() {
            String str = this.method;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.contentType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<c> list = this.properties;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            String str = this.method;
            String str2 = this.contentType;
            return u62.z.c(p6.b.i("Default(method=", str, ", contentType=", str2, ", properties="), this.properties, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.method);
            parcel.writeString(this.contentType);
            List<c> list = this.properties;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((c) itO.next()).writeToParcel(parcel, i14);
            }
        }

        public b(String str, String str2, List<c> list) {
            this.method = str;
            this.contentType = str2;
            this.properties = list;
        }

        public b() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lfo2/l$c;", "Landroid/os/Parcelable;", "", "name", "", "required", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "b", "Ljava/lang/Boolean;", "getRequired", "()Ljava/lang/Boolean;", "setRequired", "(Ljava/lang/Boolean;)V", "c", "getType", "setType", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("name")
        private String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("required")
        private Boolean required;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
        private String type;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                parcel.getClass();
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new c(string, boolValueOf, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i14) {
                return new c[i14];
            }
        }

        public /* synthetic */ c(String str, Boolean bool, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : str2);
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
            return p005kotlin.jvm.internal.s.g(this.name, cVar.name) && p005kotlin.jvm.internal.s.g(this.required, cVar.required) && p005kotlin.jvm.internal.s.g(this.type, cVar.type);
        }

        public final int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.required;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.type;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.name;
            Boolean bool = this.required;
            String str2 = this.type;
            StringBuilder sb3 = new StringBuilder("Properties(name=");
            sb3.append(str);
            sb3.append(", required=");
            sb3.append(bool);
            sb3.append(", type=");
            return am.j.o(str2, ")", sb3);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.name);
            Boolean bool = this.required;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                tn.k.m(parcel, 1, bool);
            }
            parcel.writeString(this.type);
        }

        public c(String str, Boolean bool, String str2) {
            this.name = str;
            this.required = bool;
            this.type = str2;
        }

        public c() {
            this(null, null, null, 7, null);
        }
    }
}
