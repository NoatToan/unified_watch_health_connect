package com.xiaomi.fitness.sport_eco_manager.sensor;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class SportSensorResult implements Parcelable {
    public static final Parcelable.Creator<SportSensorResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13155b;
    public float c;
    public float d;

    public class a implements Parcelable.Creator<SportSensorResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SportSensorResult createFromParcel(Parcel parcel) {
            return new SportSensorResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SportSensorResult[] newArray(int i) {
            return new SportSensorResult[i];
        }
    }

    public SportSensorResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SportSensorResult{step=" + this.f13154a + ", accX=" + this.f13155b + ", accY=" + this.c + ", accZ=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13154a);
        parcel.writeFloat(this.f13155b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
    }

    public SportSensorResult(Parcel parcel) {
        this.f13154a = parcel.readInt();
        this.f13155b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
    }
}
