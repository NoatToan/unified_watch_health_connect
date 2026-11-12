package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(inheritSuperIndices = true, tableName = "record_step")
public class b2c extends y6k implements ozc {

    @ColumnInfo(name = "begin_time")
    public long i;

    @ColumnInfo(name = SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColumnInfo(name = "step_distance")
    public float f3709k;

    @ColumnInfo(name = "steps")
    public int l;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int m;

    public b2c() {
        this(0L, 0L, 0);
    }

    public long A() {
        return this.i;
    }

    public long B() {
        return this.j;
    }

    public int C() {
        return this.m;
    }

    public int F() {
        return this.l;
    }

    public void G(long j) {
        this.i = j;
    }

    public void H(long j) {
        this.j = j;
    }

    public void I(int i) {
        this.m = i;
    }

    public void L(float f) {
        this.f3709k = f;
    }

    public void R(int i) {
        this.l = i;
    }

    @Override // defpackage.ozc
    public int a() {
        return F();
    }

    @Override // defpackage.yxc
    public long c() {
        return B();
    }

    @Override // defpackage.yxc
    public long d() {
        return A();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b2c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        b2c b2cVar = (b2c) obj;
        return this.m == b2cVar.C() && this.l == b2cVar.F() && this.i == b2cVar.A() && this.j == b2cVar.B();
    }

    @Override // defpackage.y6k
    public String toString() {
        return "StepRecord{beginTime=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(this.i)) + ", endTime=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(this.j)) + ", stepDistance=" + this.f3709k + ", steps=" + this.l + ", id=" + this.m + AbstractJsonLexerKt.END_OBJ;
    }

    public b2c(long j, long j2, int i) {
        this.i = j;
        this.j = j2;
        this.l = i;
    }
}
