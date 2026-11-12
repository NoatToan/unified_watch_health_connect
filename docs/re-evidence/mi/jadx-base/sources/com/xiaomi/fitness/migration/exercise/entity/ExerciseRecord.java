package com.xiaomi.fitness.migration.exercise.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import defpackage.y6k;
import defpackage.yxc;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(inheritSuperIndices = true, tableName = "record_exercise")
public class ExerciseRecord extends y6k implements yxc, Parcelable {
    public static final Parcelable.Creator<ExerciseRecord> CREATOR = new a();
    public static final ExerciseRecord x = new ExerciseRecord("", 0, 0);

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int i;

    @ColumnInfo(name = "sports_type")
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColumnInfo(name = "begin_time")
    public long f12415k;

    @ColumnInfo(name = SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    public long l;

    @ColumnInfo(name = "duration")
    public long m;

    @ColumnInfo(name = "distance")
    public int n;

    @ColumnInfo(name = "calories")
    public int o;

    @ColumnInfo(name = "total_consume")
    public int p;

    @ColumnInfo(name = "track_filename")
    public String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @ColumnInfo(name = "pressure_filename")
    public String f12416r;

    @ColumnInfo(name = "intensity")
    public IntensityDuration s;

    @ColumnInfo(name = "source")
    public int t;

    @ColumnInfo(name = "course_id")
    public long u;

    @ColumnInfo(name = "detail")
    public String v;
    public String w;

    public class a implements Parcelable.Creator<ExerciseRecord> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ExerciseRecord createFromParcel(Parcel parcel) {
            return new ExerciseRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ExerciseRecord[] newArray(int i) {
            return new ExerciseRecord[i];
        }
    }

    public ExerciseRecord() {
    }

    public long A() {
        return this.f12415k;
    }

    public int B() {
        return this.o;
    }

    public int C() {
        return this.n;
    }

    public long F() {
        return this.m;
    }

    public long G() {
        return this.l;
    }

    public String H() {
        return this.v;
    }

    public int I() {
        return this.i;
    }

    public IntensityDuration L() {
        return this.s;
    }

    public String R() {
        return this.f12416r;
    }

    public String V() {
        return this.j;
    }

    public int W() {
        return this.p;
    }

    public String X() {
        return this.q;
    }

    public void Y(long j) {
        this.f12415k = j;
    }

    public void a0(int i) {
        this.o = i;
    }

    @Override // defpackage.yxc
    public long c() {
        return G();
    }

    @Override // defpackage.yxc
    public long d() {
        return A();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e0(long j) {
        this.u = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExerciseRecord exerciseRecord = (ExerciseRecord) obj;
        return this.i == exerciseRecord.i && this.f12415k == exerciseRecord.f12415k && this.l == exerciseRecord.l && this.m == exerciseRecord.m && this.n == exerciseRecord.n && this.o == exerciseRecord.o && this.p == exerciseRecord.p && Objects.equals(this.q, exerciseRecord.q) && Objects.equals(this.f12416r, exerciseRecord.f12416r) && Objects.equals(this.j, exerciseRecord.j) && Objects.equals(this.s, exerciseRecord.s) && Objects.equals(this.v, exerciseRecord.v) && Objects.equals(this.w, exerciseRecord.w) && this.t == exerciseRecord.t && this.u == exerciseRecord.u;
    }

    public void h0(int i) {
        this.n = i;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.i), this.j, Long.valueOf(this.f12415k), Long.valueOf(this.l), Long.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), this.s, this.v, this.w, this.q, this.f12416r, Integer.valueOf(this.t), Long.valueOf(this.u));
    }

    public void j0(long j) {
        this.m = j;
    }

    public void k0(long j) {
        this.l = j;
    }

    public void l0(String str) {
        this.v = str;
    }

    public void p0(int i) {
        this.i = i;
    }

    public void q0(IntensityDuration intensityDuration) {
        this.s = intensityDuration;
    }

    @Override // defpackage.y6k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("ExerciseRecord{id=");
        sb.append(this.i);
        sb.append(", sportsType='");
        sb.append(this.j);
        sb.append('\'');
        sb.append(", beginTime=");
        sb.append(this.f12415k);
        sb.append(", endTime=");
        sb.append(this.l);
        sb.append(", duration=");
        sb.append(this.m);
        sb.append(", distance=");
        sb.append(this.n);
        sb.append(", calories=");
        sb.append(this.o);
        sb.append(", totalConsume=");
        sb.append(this.p);
        sb.append(", trackFileName='");
        sb.append(this.q);
        sb.append('\'');
        sb.append(", pressureFileName='");
        sb.append(this.f12416r);
        sb.append('\'');
        sb.append(", intensity=");
        IntensityDuration intensityDuration = this.s;
        sb.append(intensityDuration == null ? AbstractJsonLexerKt.NULL : intensityDuration.toString());
        sb.append(", source=");
        sb.append(this.t);
        sb.append(", courseId=");
        sb.append(this.u);
        sb.append(", extraJsonData='");
        sb.append(this.v);
        sb.append('\'');
        sb.append(", dataNum='");
        sb.append(this.w);
        sb.append('\'');
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public void u0(String str) {
        this.f12416r = str;
    }

    public void v0(int i) {
        this.t = i;
    }

    public void w0(String str) {
        this.j = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeLong(this.f12415k);
        parcel.writeLong(this.l);
        parcel.writeLong(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeParcelable(this.s, i);
        parcel.writeString(this.q);
        parcel.writeString(this.f12416r);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.t);
        parcel.writeLong(this.u);
        parcel.writeString(f());
        parcel.writeString(i());
        parcel.writeString(h());
        parcel.writeString(g());
        parcel.writeString(e());
        parcel.writeLong(j());
        parcel.writeInt(l() ? 1 : 0);
        parcel.writeLong(k());
    }

    public void x0(int i) {
        this.p = i;
    }

    public void y0(String str) {
        this.q = str;
    }

    public ExerciseRecord(String str, long j, long j2) {
        this.j = str;
        this.f12415k = j;
        this.l = j2;
    }

    public ExerciseRecord(Parcel parcel) {
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.f12415k = parcel.readLong();
        this.l = parcel.readLong();
        this.m = parcel.readLong();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.s = (IntensityDuration) parcel.readParcelable(IntensityDuration.class.getClassLoader());
        this.q = parcel.readString();
        this.f12416r = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.t = parcel.readInt();
        this.u = parcel.readLong();
        t(parcel.readString());
        w(parcel.readString());
        v(parcel.readString());
        u(parcel.readString());
        q(parcel.readString());
        x(parcel.readLong());
        r(parcel.readInt() == 1);
        z(parcel.readLong());
    }
}
