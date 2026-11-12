package com.xiaomi.fitness.sport_manager.sensor;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class SportSensorResult implements Parcelable {
    public static final Parcelable.Creator<SportSensorResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13201b;
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

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f13203b;
        public float c;
        public float d;

        public b e(float f) {
            this.f13203b = f;
            return this;
        }

        public b f(float f) {
            this.c = f;
            return this;
        }

        public b g(float f) {
            this.d = f;
            return this;
        }

        public SportSensorResult h() {
            return new SportSensorResult(this);
        }

        public b i(int i) {
            this.f13202a = i;
            return this;
        }
    }

    public SportSensorResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SportSensorResult{step=" + this.f13200a + ", accX=" + this.f13201b + ", accY=" + this.c + ", accZ=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13200a);
        parcel.writeFloat(this.f13201b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
    }

    public SportSensorResult(b bVar) {
        this.f13200a = bVar.f13202a;
        this.f13201b = bVar.f13203b;
        this.c = bVar.c;
        this.d = bVar.d;
    }

    public SportSensorResult(Parcel parcel) {
        this.f13200a = parcel.readInt();
        this.f13201b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
    }
}
