package we0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwe0/b;", "Landroid/os/Parcelable;", "", "headline", "", "Lwe0/a;", "chips", "Lwe0/c;", "selectionType", "Lwe0/f;", "inputConfig", "<init>", "(Ljava/lang/String;Ljava/util/List;Lwe0/c;Lwe0/f;)V", "gcm-domain-feedback_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<we0.a> f184732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f184733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f184734d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(we0.a.CREATOR, parcel, arrayList, iA, 1);
            }
            return new b(string, arrayList, c.valueOf(parcel.readString()), f.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, List<we0.a> list, c cVar, f fVar) {
        str.getClass();
        list.getClass();
        cVar.getClass();
        fVar.getClass();
        this.f184731a = str;
        this.f184732b = list;
        this.f184733c = cVar;
        this.f184734d = fVar;
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
        return this.f184731a.equals(bVar.f184731a) && this.f184732b.equals(bVar.f184732b) && this.f184733c == bVar.f184733c && this.f184734d.equals(bVar.f184734d);
    }

    public final int hashCode() {
        return this.f184734d.hashCode() + ((this.f184733c.hashCode() + u0.b(this.f184731a.hashCode() * 31, 31, this.f184732b)) * 31);
    }

    public final String toString() {
        StringBuilder sbG = l2.g("FeedbackChipSectionConfig(headline=", this.f184731a, ", chips=", this.f184732b, ", selectionType=");
        sbG.append(this.f184733c);
        sbG.append(", inputConfig=");
        sbG.append(this.f184734d);
        sbG.append(")");
        return sbG.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f184731a);
        Iterator itE = kg.f.e(this.f184732b, parcel);
        while (itE.hasNext()) {
            ((we0.a) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f184733c.name());
        this.f184734d.writeToParcel(parcel, i14);
    }
}
