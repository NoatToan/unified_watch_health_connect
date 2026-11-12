package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WalkPath extends Path implements Parcelable {
    public static final Parcelable.Creator<WalkPath> CREATOR = new Parcelable.Creator<WalkPath>() { // from class: com.amap.api.services.route.WalkPath.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WalkPath[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WalkPath createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static WalkPath a(Parcel parcel) {
            return new WalkPath(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<WalkStep> f3849a;

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkStep> getSteps() {
        return this.f3849a;
    }

    public void setSteps(List<WalkStep> list) {
        this.f3849a = list;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f3849a);
    }

    public WalkPath(Parcel parcel) {
        super(parcel);
        this.f3849a = new ArrayList();
        this.f3849a = parcel.createTypedArrayList(WalkStep.CREATOR);
    }

    public WalkPath() {
        this.f3849a = new ArrayList();
    }
}
