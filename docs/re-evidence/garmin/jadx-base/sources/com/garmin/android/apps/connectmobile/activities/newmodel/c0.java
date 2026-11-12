package com.garmin.android.apps.connectmobile.activities.newmodel;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/c0;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f0;", "split", "", "Lcom/garmin/android/apps/connectmobile/repcounting/model/e;", "exerciseSets", "", "adapterIndex", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/newmodel/f0;Ljava/util/List;I)V", "a", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f0;", "g", "()Lcom/garmin/android/apps/connectmobile/activities/newmodel/f0;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)V", "c", "I", "d", "()I", "h", "(I)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("split")
    private final f0 split;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseSets")
    private List<? extends com.garmin.android.apps.connectmobile.repcounting.model.e> exerciseSets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private int adapterIndex;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList arrayList = null;
            f0 f0VarCreateFromParcel = parcel.readInt() == 0 ? null : f0.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(c0.class, parcel, arrayList2, iD, 1);
                }
                arrayList = arrayList2;
            }
            return new c0(f0VarCreateFromParcel, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }
    }

    public /* synthetic */ c0(f0 f0Var, List list, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : f0Var, (i15 & 2) != 0 ? null : list, i14);
    }

    public static c0 b(c0 c0Var, ArrayList arrayList, int i14) {
        f0 f0Var = c0Var.split;
        List<? extends com.garmin.android.apps.connectmobile.repcounting.model.e> list = arrayList;
        if ((i14 & 2) != 0) {
            list = c0Var.exerciseSets;
        }
        int i15 = c0Var.adapterIndex;
        c0Var.getClass();
        return new c0(f0Var, list, i15);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAdapterIndex() {
        return this.adapterIndex;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.split, c0Var.split) && p005kotlin.jvm.internal.s.g(this.exerciseSets, c0Var.exerciseSets) && this.adapterIndex == c0Var.adapterIndex;
    }

    public final List<com.garmin.android.apps.connectmobile.repcounting.model.e> f() {
        return this.exerciseSets;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f0 getSplit() {
        return this.split;
    }

    public final void h(int i14) {
        this.adapterIndex = i14;
    }

    public final int hashCode() {
        f0 f0Var = this.split;
        int iHashCode = (f0Var == null ? 0 : f0Var.hashCode()) * 31;
        List<? extends com.garmin.android.apps.connectmobile.repcounting.model.e> list = this.exerciseSets;
        return Integer.hashCode(this.adapterIndex) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final void i(ArrayList arrayList) {
        this.exerciseSets = arrayList;
    }

    public final String toString() {
        f0 f0Var = this.split;
        List<? extends com.garmin.android.apps.connectmobile.repcounting.model.e> list = this.exerciseSets;
        int i14 = this.adapterIndex;
        StringBuilder sb3 = new StringBuilder("RoundDTO(split=");
        sb3.append(f0Var);
        sb3.append(", exerciseSets=");
        sb3.append(list);
        sb3.append(", adapterIndex=");
        return am.j.q(sb3, i14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        f0 f0Var = this.split;
        if (f0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            f0Var.writeToParcel(parcel, i14);
        }
        List<? extends com.garmin.android.apps.connectmobile.repcounting.model.e> list = this.exerciseSets;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        parcel.writeInt(this.adapterIndex);
    }

    public c0(f0 f0Var, List<? extends com.garmin.android.apps.connectmobile.repcounting.model.e> list, int i14) {
        this.split = f0Var;
        this.exerciseSets = list;
        this.adapterIndex = i14;
    }
}
