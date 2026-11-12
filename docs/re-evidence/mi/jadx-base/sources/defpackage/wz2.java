package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(inheritSuperIndices = true, tableName = "record_blood_pressure")
public class wz2 extends y6k {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public long i;

    @ColumnInfo(name = "high_pressure")
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColumnInfo(name = "low_pressure")
    public int f38491k;

    public int A() {
        return this.j;
    }

    public long B() {
        return this.i;
    }

    public int C() {
        return this.f38491k;
    }

    public void F(int i) {
        this.j = i;
    }

    public void G(long j) {
        this.i = j;
    }

    public void H(int i) {
        this.f38491k = i;
    }

    @Override // defpackage.y6k
    public String toString() {
        return "BloodPressureRecord{id=" + this.i + ", highPressure=" + this.j + ", lowPressure=" + this.f38491k + AbstractJsonLexerKt.END_OBJ + super.toString();
    }
}
