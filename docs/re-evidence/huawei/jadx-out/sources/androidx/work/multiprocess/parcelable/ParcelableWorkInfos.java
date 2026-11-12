package androidx.work.multiprocess.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ParcelableWorkInfos implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkInfos> CREATOR = new Parcelable.Creator<ParcelableWorkInfos>() { // from class: androidx.work.multiprocess.parcelable.ParcelableWorkInfos.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkInfos createFromParcel(Parcel parcel) {
            return new ParcelableWorkInfos(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkInfos[] newArray(int i) {
            return new ParcelableWorkInfos[i];
        }
    };
    private final List<WorkInfo> mInfos;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableWorkInfos(List<WorkInfo> list) {
        this.mInfos = list;
    }

    public List<WorkInfo> getWorkInfos() {
        return this.mInfos;
    }

    protected ParcelableWorkInfos(Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(getClass().getClassLoader());
        this.mInfos = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.mInfos.add(((ParcelableWorkInfo) parcelable).getWorkInfo());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelableWorkInfo[] parcelableWorkInfoArr = new ParcelableWorkInfo[this.mInfos.size()];
        for (int i2 = 0; i2 < this.mInfos.size(); i2++) {
            parcelableWorkInfoArr[i2] = new ParcelableWorkInfo(this.mInfos.get(i2));
        }
        parcel.writeParcelableArray(parcelableWorkInfoArr, i);
    }
}
