package com.garmin.android.apps.connectmobile.golf.truswing.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONArray;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/truswing/model/j;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "club", "wrist", "<init>", "([D[D)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends s1 implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f35950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f35951b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.createDoubleArray(), parcel.createDoubleArray());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public /* synthetic */ j(double[] dArr, double[] dArr2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dArr, (i14 & 2) != 0 ? null : dArr2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        double[] dArr;
        if (jSONObject != null) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("CLUB");
            double[] dArr2 = null;
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                dArr = null;
            } else {
                int length = jSONArrayOptJSONArray.length();
                dArr = new double[length];
                for (int i14 = 0; i14 < length; i14++) {
                    dArr[i14] = jSONArrayOptJSONArray.optDouble(i14);
                }
            }
            this.f35950a = dArr;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("WRIST");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0) {
                int length2 = jSONArrayOptJSONArray2.length();
                dArr2 = new double[length2];
                for (int i15 = 0; i15 < length2; i15++) {
                    dArr2[i15] = jSONArrayOptJSONArray2.optDouble(i15);
                }
            }
            this.f35951b = dArr2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDoubleArray(this.f35950a);
        parcel.writeDoubleArray(this.f35951b);
    }

    public j(double[] dArr, double[] dArr2) {
        this.f35950a = dArr;
        this.f35951b = dArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
