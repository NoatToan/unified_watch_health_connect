package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/f0;", "Landroid/os/Parcelable;", "", "cyclingSecondaryTarget", "cyclingPowerCurveTarget", "weightBenchmarkScaling", "audioNotes", "hasMoreThen50Steps", "hasSkipLastRest", "hasUndefinedPoolSize", "hasDrillType", "hasIntensityTargetType", "hasStrokeTypeRIMOorIM", "hasSwim2CapableFeature", "hasMultisportWorkoutCapableDevice", "", "", "supportedFeatureList", "Lm52/k;", "segmentSportTypes", "<init>", "(ZZZZZZZZZZZZLjava/util/List;Ljava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f48168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f48169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f48170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f48171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f48172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f48173k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f48174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<String> f48175m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<m52.k> f48176n;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f0> {
        @Override // android.os.Parcelable.Creator
        public final f0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            boolean z19 = parcel.readInt() != 0;
            boolean z24 = parcel.readInt() != 0;
            boolean z25 = parcel.readInt() != 0;
            boolean z26 = parcel.readInt() != 0;
            boolean z27 = parcel.readInt() != 0;
            boolean z28 = parcel.readInt() != 0;
            boolean z29 = parcel.readInt() != 0;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(m52.k.valueOf(parcel.readString()));
            }
            return new f0(z14, z15, z16, z17, z18, z19, z24, z25, z26, z27, z28, z29, arrayListCreateStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final f0[] newArray(int i14) {
            return new f0[i14];
        }
    }

    public f0(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18, (i14 & 32) != 0 ? false : z19, (i14 & 64) != 0 ? false : z24, (i14 & 128) != 0 ? false : z25, (i14 & 256) != 0 ? false : z26, (i14 & 512) != 0 ? false : z27, (i14 & 1024) != 0 ? false : z28, (i14 & 2048) == 0 ? z29 : false, (i14 & 4096) != 0 ? p13.j0.f134944a : list, (i14 & 8192) != 0 ? p13.j0.f134944a : list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f48163a == f0Var.f48163a && this.f48164b == f0Var.f48164b && this.f48165c == f0Var.f48165c && this.f48166d == f0Var.f48166d && this.f48167e == f0Var.f48167e && this.f48168f == f0Var.f48168f && this.f48169g == f0Var.f48169g && this.f48170h == f0Var.f48170h && this.f48171i == f0Var.f48171i && this.f48172j == f0Var.f48172j && this.f48173k == f0Var.f48173k && this.f48174l == f0Var.f48174l && p005kotlin.jvm.internal.s.g(this.f48175m, f0Var.f48175m) && p005kotlin.jvm.internal.s.g(this.f48176n, f0Var.f48176n);
    }

    public final int hashCode() {
        return this.f48176n.hashCode() + u0.b(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f48163a) * 31, 31, this.f48164b), 31, this.f48165c), 31, this.f48166d), 31, this.f48167e), 31, this.f48168f), 31, this.f48169g), 31, this.f48170h), 31, this.f48171i), 31, this.f48172j), 31, this.f48173k), 31, this.f48174l), 31, this.f48175m);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("WorkoutFeaturePreferences(cyclingSecondaryTarget=", ", cyclingPowerCurveTarget=", ", weightBenchmarkScaling=", this.f48163a, this.f48164b);
        kg.f.q(", audioNotes=", ", hasMoreThen50Steps=", sbM, this.f48165c, this.f48166d);
        kg.f.q(", hasSkipLastRest=", ", hasUndefinedPoolSize=", sbM, this.f48167e, this.f48168f);
        kg.f.q(", hasDrillType=", ", hasIntensityTargetType=", sbM, this.f48169g, this.f48170h);
        kg.f.q(", hasStrokeTypeRIMOorIM=", ", hasSwim2CapableFeature=", sbM, this.f48171i, this.f48172j);
        kg.f.q(", hasMultisportWorkoutCapableDevice=", ", supportedFeatureList=", sbM, this.f48173k, this.f48174l);
        return n23.j.j(sbM, this.f48175m, ", segmentSportTypes=", this.f48176n, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f48163a ? 1 : 0);
        parcel.writeInt(this.f48164b ? 1 : 0);
        parcel.writeInt(this.f48165c ? 1 : 0);
        parcel.writeInt(this.f48166d ? 1 : 0);
        parcel.writeInt(this.f48167e ? 1 : 0);
        parcel.writeInt(this.f48168f ? 1 : 0);
        parcel.writeInt(this.f48169g ? 1 : 0);
        parcel.writeInt(this.f48170h ? 1 : 0);
        parcel.writeInt(this.f48171i ? 1 : 0);
        parcel.writeInt(this.f48172j ? 1 : 0);
        parcel.writeInt(this.f48173k ? 1 : 0);
        parcel.writeInt(this.f48174l ? 1 : 0);
        parcel.writeStringList(this.f48175m);
        Iterator itE = kg.f.e(this.f48176n, parcel);
        while (itE.hasNext()) {
            parcel.writeString(((m52.k) itE.next()).name());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, List<String> list, List<? extends m52.k> list2) {
        list.getClass();
        list2.getClass();
        this.f48163a = z14;
        this.f48164b = z15;
        this.f48165c = z16;
        this.f48166d = z17;
        this.f48167e = z18;
        this.f48168f = z19;
        this.f48169g = z24;
        this.f48170h = z25;
        this.f48171i = z26;
        this.f48172j = z27;
        this.f48173k = z28;
        this.f48174l = z29;
        this.f48175m = list;
        this.f48176n = list2;
    }

    public f0() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, null, null, 16383, null);
    }
}
