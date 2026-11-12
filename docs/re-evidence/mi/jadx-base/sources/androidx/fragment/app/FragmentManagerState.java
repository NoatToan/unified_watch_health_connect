package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<String> f2363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<String> f2364b;
    public BackStackRecordState[] c;
    public int d;
    public String e;
    public ArrayList<String> f;
    public ArrayList<BackStackState> g;
    public ArrayList<FragmentManager.LaunchedFragmentInfo> h;

    public class a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
        this.e = null;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f2363a);
        parcel.writeStringList(this.f2364b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.g);
        parcel.writeTypedList(this.h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.e = null;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.f2363a = parcel.createStringArrayList();
        this.f2364b = parcel.createStringArrayList();
        this.c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
