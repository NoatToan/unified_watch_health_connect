package db1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ldb1/k;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", "calendarDate", "", "note", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/String;)V", "a", "Lorg/joda/time/LocalDate;", "b", "()Lorg/joda/time/LocalDate;", "setCalendarDate", "(Lorg/joda/time/LocalDate;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setNote", "(Ljava/lang/String;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("note")
    private String note;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k((LocalDate) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public /* synthetic */ k(LocalDate localDate, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : localDate, (i14 & 2) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getCalendarDate() {
        return this.calendarDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.calendarDate, kVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.note, kVar.note);
    }

    public final int hashCode() {
        LocalDate localDate = this.calendarDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        String str = this.note;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PregnancyNoteDTO(calendarDate=" + this.calendarDate + ", note=" + this.note + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.calendarDate);
        parcel.writeString(this.note);
    }

    public k(LocalDate localDate, String str) {
        this.calendarDate = localDate;
        this.note = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
