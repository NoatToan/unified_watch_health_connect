package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/w;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "numIterations", "runDurationInSecs", "walkDurationInSecs", "<init>", "(III)V", "a", "I", "getNumIterations", "()I", "setNumIterations", "(I)V", "b", "getRunDurationInSecs", "setRunDurationInSecs", "c", "getWalkDurationInSecs", "setWalkDurationInSecs", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w extends s1 implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numIterations")
    private int numIterations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("runDurationInSecs")
    private int runDurationInSecs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("walkDurationInSecs")
    private int walkDurationInSecs;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new w(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i14) {
            return new w[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ w(int i14, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? 0 : i14, (i17 & 2) != 0 ? 0 : i15, (i17 & 4) != 0 ? 0 : i16);
    }

    public final String C(Resources resources) {
        String string = resources.getString(R.string.lbl_run);
        string.getClass();
        l3.a aVar = l3.f23124b;
        long j8 = this.runDurationInSecs;
        aVar.getClass();
        String strW = l3.a.W(j8);
        String string2 = resources.getString(R.string.activity_options_walk_title);
        string2.getClass();
        String string3 = resources.getString(R.string.interval_workout_description, String.valueOf(this.numIterations), string, strW, string2, l3.a.W(this.walkDurationInSecs));
        string3.getClass();
        return string3;
    }

    public final JSONObject D() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("numIterations", this.numIterations);
            jSONObject.put("runDurationInSecs", this.runDurationInSecs);
            jSONObject.put("walkDurationInSecs", this.walkDurationInSecs);
            return jSONObject;
        } catch (JSONException e4) {
            String strN = fb1.c.n("JsonException: ", e4.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "RunWalkDescription", strN);
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.numIterations == wVar.numIterations && this.runDurationInSecs == wVar.runDurationInSecs && this.walkDurationInSecs == wVar.walkDurationInSecs;
    }

    public final int hashCode() {
        return Integer.hashCode(this.walkDurationInSecs) + q2.d(this.runDurationInSecs, Integer.hashCode(this.numIterations) * 31, 31);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.numIterations = jSONObject.getInt("numIterations");
            this.runDurationInSecs = jSONObject.getInt("runDurationInSecs");
            this.walkDurationInSecs = jSONObject.getInt("walkDurationInSecs");
        }
    }

    public final String toString() {
        int i14 = this.numIterations;
        int i15 = this.runDurationInSecs;
        return am.j.q(e5.j(i14, i15, "RunWalkDescriptionDTO(numIterations=", ", runDurationInSecs=", ", walkDurationInSecs="), this.walkDurationInSecs, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.numIterations);
        parcel.writeInt(this.runDurationInSecs);
        parcel.writeInt(this.walkDurationInSecs);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/w$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_NUM_ITERATIONS", "KEY_RUN_DURATION_IN_SECS", "KEY_WALK_DURATION_IN_SECS", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public w(int i14, int i15, int i16) {
        this.numIterations = i14;
        this.runDurationInSecs = i15;
        this.walkDurationInSecs = i16;
    }

    public w() {
        this(0, 0, 0, 7, null);
    }
}
