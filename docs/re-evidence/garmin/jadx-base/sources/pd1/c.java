package pd1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R,\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lpd1/c;", "Landroid/os/Parcelable;", "", "reminderType", "", "Lpd1/b;", "reminders", "", "displayDefaultPregnancyReminders", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setReminderType", "(Ljava/lang/String;)V", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "h", "(Ljava/util/List;)V", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "g", "(Ljava/lang/Boolean;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reminderType")
    private String reminderType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reminders")
    private List<b> reminders;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayDefaultPregnancyReminders")
    private Boolean displayDefaultPregnancyReminders;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList.add(parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel));
                }
            }
            return new c(string, arrayList, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(String str, List list, Boolean bool, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? new ArrayList() : list, (i14 & 4) != 0 ? null : bool);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getDisplayDefaultPregnancyReminders() {
        return this.displayDefaultPregnancyReminders;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getReminderType() {
        return this.reminderType;
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
        return s.g(this.reminderType, cVar.reminderType) && s.g(this.reminders, cVar.reminders) && s.g(this.displayDefaultPregnancyReminders, cVar.displayDefaultPregnancyReminders);
    }

    public final List<b> f() {
        return this.reminders;
    }

    public final void g() {
        this.displayDefaultPregnancyReminders = Boolean.FALSE;
    }

    public final void h(List<b> list) {
        this.reminders = list;
    }

    public final int hashCode() {
        String str = this.reminderType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<b> list = this.reminders;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.displayDefaultPregnancyReminders;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.reminderType;
        List<b> list = this.reminders;
        return p6.b.f(l2.g("UserReminderListDTO(reminderType=", str, ", reminders=", list, ", displayDefaultPregnancyReminders="), this.displayDefaultPregnancyReminders, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.reminderType);
        List<b> list = this.reminders;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                b bVar = (b) itO.next();
                if (bVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    bVar.writeToParcel(parcel, i14);
                }
            }
        }
        Boolean bool = this.displayDefaultPregnancyReminders;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
    }

    public c(String str, List<b> list, Boolean bool) {
        this.reminderType = str;
        this.reminders = list;
        this.displayDefaultPregnancyReminders = bool;
    }

    public c() {
        this(null, null, null, 7, null);
    }
}
