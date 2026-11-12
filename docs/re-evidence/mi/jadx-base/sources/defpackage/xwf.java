package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.common.unit.WeightUnit;

/* JADX INFO: loaded from: classes9.dex */
@Entity(tableName = "weight")
public class xwf extends v4i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @PrimaryKey
    @ColumnInfo(index = true, name = "recordTime")
    public long f39533b;

    @ColumnInfo(name = "unit")
    public WeightUnit c;

    public xwf(float f, WeightUnit weightUnit, long j) {
        super(f);
        WeightUnit weightUnit2 = WeightUnit.GRAM;
        this.c = weightUnit;
        this.f39533b = j;
    }

    public long d() {
        return this.f39533b;
    }

    public String toString() {
        return super.toString() + "{recordTime=" + this.f39533b + ", weightUnit=" + this.c + ", weight=" + a() + "}";
    }
}
