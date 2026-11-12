package am;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00060\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R2\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00060\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lam/w0;", "Landroid/os/Parcelable;", "", "date", "", "countOfActivities", "", "Lam/i2;", "stats", "<init>", "(Ljava/lang/String;ILjava/util/Map;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "I", "()I", "c", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w0 implements Parcelable {
    public static final Parcelable.Creator<w0> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4256d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    private final String date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countOfActivities")
    private final int countOfActivities;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stats")
    private final Map<String, Map<String, i2>> stats;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<w0> {
        @Override // android.os.Parcelable.Creator
        public final w0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                String string2 = parcel.readString();
                int i17 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    linkedHashMap2.put(parcel.readString(), i2.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap.put(string2, linkedHashMap2);
            }
            return new w0(string, i14, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final w0[] newArray(int i14) {
            return new w0[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w0(String str, int i14, Map<String, ? extends Map<String, i2>> map) {
        str.getClass();
        map.getClass();
        this.date = str;
        this.countOfActivities = i14;
        this.stats = map;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCountOfActivities() {
        return this.countOfActivities;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return p005kotlin.jvm.internal.s.g(this.date, w0Var.date) && this.countOfActivities == w0Var.countOfActivities && p005kotlin.jvm.internal.s.g(this.stats, w0Var.stats);
    }

    public final Map<String, Map<String, i2>> f() {
        return this.stats;
    }

    public final int hashCode() {
        return this.stats.hashCode() + q2.d(this.countOfActivities, this.date.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.date;
        int i14 = this.countOfActivities;
        return j.s(androidx.core.view.j.k(i14, "ActivityStatsContainerDTO(date=", str, ", countOfActivities=", ", stats="), this.stats, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.date);
        parcel.writeInt(this.countOfActivities);
        Iterator itU = j.u(this.stats, parcel);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            parcel.writeString((String) entry.getKey());
            Iterator itU2 = j.u((Map) entry.getValue(), parcel);
            while (itU2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itU2.next();
                parcel.writeString((String) entry2.getKey());
                ((i2) entry2.getValue()).writeToParcel(parcel, i14);
            }
        }
    }
}
