package ix1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lix1/b;", "Landroid/os/Parcelable;", "", "primaryKey", "", "exerciseKeys", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Action.KEY_ATTRIBUTE)
    private final String primaryKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exercises")
    private final List<String> exerciseKeys;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.primaryKey = str;
        this.exerciseKeys = list;
    }

    public static b b(b bVar, ArrayList arrayList) {
        String str = bVar.primaryKey;
        str.getClass();
        return new b(str, arrayList);
    }

    public final List<String> d() {
        return this.exerciseKeys;
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
        return s.g(this.primaryKey, bVar.primaryKey) && s.g(this.exerciseKeys, bVar.exerciseKeys);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPrimaryKey() {
        return this.primaryKey;
    }

    public final int hashCode() {
        return this.exerciseKeys.hashCode() + (this.primaryKey.hashCode() * 31);
    }

    public final String toString() {
        return fb1.c.o("STPPrimariesDTO(primaryKey=", this.primaryKey, ", exerciseKeys=", this.exerciseKeys, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.primaryKey);
        parcel.writeStringList(this.exerciseKeys);
    }
}
