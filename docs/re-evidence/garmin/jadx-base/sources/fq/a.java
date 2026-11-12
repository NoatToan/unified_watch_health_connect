package fq;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import fb1.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfq/a;", "Landroid/os/Parcelable;", "", "categoryKey", "", "Lfq/b;", "exercisesInCategory", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1473a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseCategoryKey")
    private final String categoryKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exercisesInCategory")
    private final List<b> exercisesInCategory;

    /* JADX INFO: renamed from: fq.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1473a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = f.a(b.CREATOR, parcel, arrayList, iA, 1);
            }
            return new a(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, List<b> list) {
        str.getClass();
        list.getClass();
        this.categoryKey = str;
        this.exercisesInCategory = list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCategoryKey() {
        return this.categoryKey;
    }

    public final List<b> d() {
        return this.exercisesInCategory;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.categoryKey, aVar.categoryKey) && s.g(this.exercisesInCategory, aVar.exercisesInCategory);
    }

    public final int hashCode() {
        return this.exercisesInCategory.hashCode() + (this.categoryKey.hashCode() * 31);
    }

    public final String toString() {
        return c.o("ExerciseToEquipmentDto(categoryKey=", this.categoryKey, ", exercisesInCategory=", this.exercisesInCategory, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.categoryKey);
        Iterator itE = f.e(this.exercisesInCategory, parcel);
        while (itE.hasNext()) {
            ((b) itE.next()).writeToParcel(parcel, i14);
        }
    }
}
