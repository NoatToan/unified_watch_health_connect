package com.xiaomi.fitness.migration.exercise.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import defpackage.ozc;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(indices = {@Index({"beginTime"}), @Index({"julianDay"})}, tableName = "step_detail")
public class StepDetail implements Parcelable, ozc {
    public static final Parcelable.Creator<StepDetail> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @PrimaryKey
    @ColumnInfo(name = "beginTime")
    public long f12419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "endTime")
    public long f12420b;

    @ColumnInfo(name = "julianDay")
    public int c;

    @ColumnInfo(name = "mode")
    public int d;

    @ColumnInfo(name = "steps")
    public int e;

    @ColumnInfo(name = "distance")
    public float f;

    @ColumnInfo(name = "speed")
    public float g;

    @ColumnInfo(name = "consumption")
    public float h;

    @ColumnInfo(name = "deleted")
    public int i;

    @ColumnInfo(name = "origin")
    public String j;

    public class a implements Parcelable.Creator<StepDetail> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StepDetail createFromParcel(Parcel parcel) {
            return new StepDetail(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StepDetail[] newArray(int i) {
            return new StepDetail[i];
        }
    }

    public StepDetail() {
    }

    @Override // defpackage.ozc
    public int a() {
        return h();
    }

    @Override // defpackage.yxc
    public long c() {
        return e();
    }

    @Override // defpackage.yxc
    public long d() {
        return e();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f12419a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StepDetail)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        StepDetail stepDetail = (StepDetail) obj;
        return this.c == stepDetail.g() && this.e == stepDetail.h() && this.f12419a == stepDetail.e() && this.f12420b == stepDetail.f();
    }

    public long f() {
        return this.f12420b;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public void i(long j) {
        this.f12419a = j;
    }

    public void j(float f) {
        this.h = f;
    }

    public void k(int i) {
        this.i = i;
    }

    public void l(float f) {
        this.f = f;
    }

    public void m(long j) {
        this.f12420b = j;
    }

    public void o(int i) {
        this.c = i;
    }

    public void q(int i) {
        this.d = i;
    }

    public void r(String str) {
        this.j = str;
    }

    public void t(float f) {
        this.g = f;
    }

    public String toString() {
        return "StepDetail{mBeginTime=" + this.f12419a + ", mEndTime=" + this.f12420b + ", mJulianDay=" + this.c + ", mMode=" + this.d + ", mSteps=" + this.e + ", mDistance=" + this.f + ", mSpeed=" + this.g + ", mConsumption=" + this.h + ", mDeleted=" + this.i + ", mOrigin='" + this.j + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public void u(int i) {
        this.e = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12419a);
        parcel.writeLong(this.f12420b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeFloat(this.h);
    }

    public StepDetail(Parcel parcel) {
        this.f12419a = parcel.readLong();
        this.f12420b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readFloat();
        this.g = parcel.readFloat();
        this.h = parcel.readFloat();
    }
}
