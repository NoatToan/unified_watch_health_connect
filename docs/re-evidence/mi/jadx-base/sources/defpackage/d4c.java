package defpackage;

import android.text.TextUtils;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.common.utils.TimeUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(inheritSuperIndices = true, tableName = "record_weight")
public class d4c extends y6k {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int i;

    @ColumnInfo(name = "record_day_time")
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColumnInfo(name = "weight")
    public float f15070k;

    @ColumnInfo(name = "height")
    public float l;

    @ColumnInfo(name = "bmi")
    public float m;

    @ColumnInfo(name = "fat_rate")
    public float n;

    @ColumnInfo(name = "body_water_rate")
    public float o;

    @ColumnInfo(name = "bone_mass")
    public float p;

    @ColumnInfo(name = "metabolism")
    public float q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @ColumnInfo(name = "muscle_rate")
    public float f15071r;

    @ColumnInfo(name = "visceral_fat")
    public float s;

    @ColumnInfo(name = "impedance")
    public int t;

    @ColumnInfo(name = "protein_rate")
    public float u;
    public String v;

    public float A() {
        return this.m;
    }

    public float B() {
        return this.o;
    }

    public float C() {
        return this.p;
    }

    public float F() {
        return this.n;
    }

    public float G() {
        return this.l;
    }

    public int H() {
        return this.i;
    }

    public int I() {
        return this.t;
    }

    public float L() {
        return this.q;
    }

    public float R() {
        return this.f15071r;
    }

    public float V() {
        return this.u;
    }

    public float W() {
        return this.s;
    }

    public float X() {
        return this.f15070k;
    }

    public void Y(float f) {
        this.m = f;
    }

    public void a0(float f) {
        this.o = f;
    }

    public void e0(float f) {
        this.p = f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d4c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        d4c d4cVar = (d4c) obj;
        return j() == d4cVar.j() && G() == d4cVar.G() && this.n == d4cVar.F() && this.o == d4cVar.B() && this.p == d4cVar.C() && this.t == d4cVar.I() && this.q == d4cVar.L() && this.f15071r == d4cVar.R() && this.s == d4cVar.W() && TextUtils.equals(i(), d4cVar.i()) && TextUtils.equals(g(), d4cVar.g()) && TextUtils.equals(f(), d4cVar.f()) && l() == d4cVar.l() && TextUtils.equals(this.j, d4cVar.j) && X() == d4cVar.X() && this.m == d4cVar.A() && this.u == d4cVar.V();
    }

    public void h0(float f) {
        this.n = f;
    }

    public void j0(float f) {
        this.l = f;
    }

    public void k0(int i) {
        this.i = i;
    }

    public void l0(int i) {
        this.t = i;
    }

    public void p0(float f) {
        this.q = f;
    }

    public void q0(float f) {
        this.f15071r = f;
    }

    @Override // defpackage.y6k
    public String toString() {
        return super.toString() + ",HealthWeightRecord{id=" + this.i + ", recordDayTime='" + this.j + "', weight=" + this.f15070k + ", height=" + this.l + ", bmi=" + this.m + ", fatRate=" + this.n + ", bodyWaterRate=" + this.o + ", boneMass=" + this.p + ", metabolism=" + this.q + ", muscleRate=" + this.f15071r + ", visceralFat=" + this.s + ", impedance=" + this.t + ", proteinRate=" + this.u + ", memberName='" + this.v + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public void u0(float f) {
        this.u = f;
    }

    public void v0(long j) {
        this.j = TimeUtils.formatDate("yyyy-MM-dd", Long.valueOf(j));
    }

    public void w0(String str) {
        this.j = str;
    }

    @Override // defpackage.y6k
    public void x(long j) {
        super.x(j);
        v0(j);
    }

    public void x0(float f) {
        this.s = f;
    }

    public void y0(float f) {
        this.f15070k = f;
    }
}
