package xw0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxw0/d;", "Landroid/os/Parcelable;", "", "", "periodReminderDateStrings", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("periodReminderDates")
    private final List<String> periodReminderDateStrings;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list);
    }

    public final List<String> b() {
        return this.periodReminderDateStrings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && s.g(this.periodReminderDateStrings, ((d) obj).periodReminderDateStrings);
    }

    public final int hashCode() {
        List<String> list = this.periodReminderDateStrings;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return k.h("PeriodReminderDatesDTO(periodReminderDateStrings=", ")", this.periodReminderDateStrings);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeStringList(this.periodReminderDateStrings);
    }

    public d(List<String> list) {
        this.periodReminderDateStrings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
