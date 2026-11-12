package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.common.unit.LengthUnit;

/* JADX INFO: loaded from: classes9.dex */
@Entity(tableName = "height")
public class vuf extends v4i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @PrimaryKey
    @ColumnInfo(index = true, name = "recordTime")
    public long f37234b;

    @ColumnInfo(name = "unit")
    public LengthUnit c;

    public vuf(float f, LengthUnit lengthUnit, long j) {
        super(f);
        LengthUnit lengthUnit2 = LengthUnit.CENTIMETER;
        this.f37234b = j;
        this.c = lengthUnit;
    }

    public String toString() {
        return super.toString() + "{recordTime=" + this.f37234b + ", heightUnit=" + this.c + ", height=" + a() + "}";
    }
}
