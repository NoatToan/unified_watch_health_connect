package com.xiaomi.fitness.migration.weight.v2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.common.unit.WeightUnit;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.v4i;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(tableName = "weight")
public class WeightItemV2 extends v4i implements Parcelable {
    public static final Parcelable.Creator<WeightItemV2> CREATOR = new a();
    public static final String TABLE_NAME = "weight";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @PrimaryKey
    @ColumnInfo(index = true, name = "recordTime")
    public long f12452b;

    @ColumnInfo(name = "record_day_time")
    public String c;

    @ColumnInfo(name = "bmi")
    public float d;

    @ColumnInfo(name = "source_type")
    public int e;

    @ColumnInfo(name = "update_time")
    public long f;

    @ColumnInfo(name = "unit")
    public WeightUnit g;

    public class a implements Parcelable.Creator<WeightItemV2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeightItemV2 createFromParcel(Parcel parcel) {
            return new WeightItemV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WeightItemV2[] newArray(int i) {
            return new WeightItemV2[i];
        }
    }

    public WeightItemV2(Parcel parcel) {
        this.f = System.currentTimeMillis();
        this.g = WeightUnit.KILOGRAM;
        this.f12452b = parcel.readLong();
        this.c = parcel.readString();
        this.f36469a = parcel.readFloat();
        this.d = parcel.readFloat();
        this.f = parcel.readLong();
        this.e = parcel.readInt();
    }

    public float d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WeightItemV2)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        WeightItemV2 weightItemV2 = (WeightItemV2) obj;
        return Objects.equals(this.c, weightItemV2.c) && a() == weightItemV2.a() && this.d == weightItemV2.d() && this.e == weightItemV2.g() && h() == weightItemV2.h() && TextUtils.equals(e(), weightItemV2.e());
    }

    public long f() {
        return this.f12452b;
    }

    public int g() {
        return this.e;
    }

    public WeightUnit h() {
        return this.g;
    }

    public final void i(long j) {
        this.c = TimeUtils.formatDate("yyyy-MM-dd", Long.valueOf(j));
    }

    public void j(String str) {
        this.c = str;
    }

    public void k(long j) {
        this.f = j;
    }

    public void l(WeightUnit weightUnit) {
        this.g = weightUnit;
    }

    public String toString() {
        return "WeightItemV2{recordTime=" + this.f12452b + ", recordDayTime='" + this.c + "', bmi=" + this.d + ", sourceType=" + this.e + ", updateTime=" + this.f + ", mWeightUnit=" + this.g + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12452b);
        parcel.writeString(this.c);
        parcel.writeFloat(this.f36469a);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.f);
        parcel.writeInt(this.e);
    }

    public WeightItemV2(float f, float f2, long j, int i) {
        super(f);
        this.f = System.currentTimeMillis();
        this.g = WeightUnit.KILOGRAM;
        this.f12452b = j;
        i(j);
        this.d = f2;
        this.e = i;
    }
}
