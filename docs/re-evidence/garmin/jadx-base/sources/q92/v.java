package q92;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p13.k0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lq92/v;", "Landroid/os/Parcelable;", "Lq92/x;", "consentTypeId", "Lq92/y;", "userOption", "Lq92/u;", "sourceType", "Lq92/b;", "enforcementState", "Lq92/a;", "deleteStatus", "Ljava/util/Date;", "retrievalDate", "", "", TtmlNode.TAG_METADATA, "updateDate", "<init>", "(Lq92/x;Lq92/y;Lq92/u;Lq92/b;Lq92/a;Ljava/util/Date;Ljava/util/Map;Ljava/util/Date;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f143783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f143784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f143785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f143786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q92.a f143787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Date f143788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, String> f143789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Date f143790h;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            parcel.getClass();
            x xVarValueOf = x.valueOf(parcel.readString());
            y yVarValueOf = y.valueOf(parcel.readString());
            u uVarValueOf = u.valueOf(parcel.readString());
            b bVarValueOf = b.valueOf(parcel.readString());
            q92.a aVarValueOf = q92.a.valueOf(parcel.readString());
            Date date = (Date) parcel.readSerializable();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new v(xVarValueOf, yVarValueOf, uVarValueOf, bVarValueOf, aVarValueOf, date, linkedHashMap, (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i14) {
            return new v[i14];
        }
    }

    public v(x xVar, y yVar, u uVar, b bVar, q92.a aVar, Date date, Map<String, String> map, Date date2) {
        xVar.getClass();
        yVar.getClass();
        uVar.getClass();
        bVar.getClass();
        aVar.getClass();
        map.getClass();
        this.f143783a = xVar;
        this.f143784b = yVar;
        this.f143785c = uVar;
        this.f143786d = bVar;
        this.f143787e = aVar;
        this.f143788f = date;
        this.f143789g = map;
        this.f143790h = date2;
    }

    public final boolean b() {
        return this.f143784b == y.OPT_IN;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f143783a == vVar.f143783a && this.f143784b == vVar.f143784b && this.f143785c == vVar.f143785c && this.f143786d == vVar.f143786d && this.f143787e == vVar.f143787e && p005kotlin.jvm.internal.s.g(this.f143788f, vVar.f143788f) && p005kotlin.jvm.internal.s.g(this.f143789g, vVar.f143789g) && p005kotlin.jvm.internal.s.g(this.f143790h, vVar.f143790h);
    }

    public final int hashCode() {
        int iHashCode = (this.f143787e.hashCode() + ((this.f143786d.hashCode() + ((this.f143785c.hashCode() + ((this.f143784b.hashCode() + (this.f143783a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        Date date = this.f143788f;
        int iB = am.j.b(this.f143789g, (iHashCode + (date == null ? 0 : date.hashCode())) * 31, 31);
        Date date2 = this.f143790h;
        return iB + (date2 != null ? date2.hashCode() : 0);
    }

    public final String toString() {
        return "ConsentStatus(consentTypeId=" + this.f143783a + ", userOption=" + this.f143784b + ", sourceType=" + this.f143785c + ", enforcementState=" + this.f143786d + ", deleteStatus=" + this.f143787e + ", retrievalDate=" + this.f143788f + ", metadata=" + this.f143789g + ", updateDate=" + this.f143790h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f143783a.name());
        parcel.writeString(this.f143784b.name());
        parcel.writeString(this.f143785c.name());
        parcel.writeString(this.f143786d.name());
        parcel.writeString(this.f143787e.name());
        parcel.writeSerializable(this.f143788f);
        Iterator itU = am.j.u(this.f143789g, parcel);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeSerializable(this.f143790h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v(x xVar, y yVar, u uVar, b bVar, q92.a aVar, Date date, Map map, Date date2, int i14, p005kotlin.jvm.internal.j jVar) {
        Map map2;
        if ((i14 & 64) != 0) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            map2 = k0Var;
        } else {
            map2 = map;
        }
        this(xVar, yVar, uVar, bVar, aVar, date, map2, (i14 & 128) != 0 ? null : date2);
    }
}
