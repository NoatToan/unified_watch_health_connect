package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WalkPath extends Path implements Parcelable {
    public static final Parcelable.Creator<WalkPath> CREATOR = new Parcelable.Creator<WalkPath>() { // from class: com.amap.api.services.route.WalkPath.1
        private static WalkPath a(Parcel parcel) {
            return new WalkPath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WalkPath createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WalkPath[] newArray(int i) {
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<WalkStep> f6775a;

    public WalkPath(Parcel parcel) {
        super(parcel);
        this.f6775a = new ArrayList();
        this.f6775a = parcel.createTypedArrayList(WalkStep.CREATOR);
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkStep> getSteps() {
        return this.f6775a;
    }

    public void setSteps(List<WalkStep> list) {
        this.f6775a = list;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f6775a);
    }

    public WalkPath() {
        this.f6775a = new ArrayList();
    }
}
