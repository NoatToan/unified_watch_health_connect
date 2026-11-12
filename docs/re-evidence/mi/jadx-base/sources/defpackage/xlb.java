package defpackage;

import androidx.health.connect.client.records.OvulationTestRecord;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import java.text.DateFormat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(inheritSuperIndices = true, tableName = "record_head_set")
public class xlb extends y6k {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public long i;

    @ColumnInfo(name = "begin_time")
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColumnInfo(name = SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    public long f39238k;

    @ColumnInfo(name = OvulationTestRecord.Result.HIGH)
    public boolean l;

    public long A() {
        return this.j;
    }

    public long B() {
        return this.f39238k;
    }

    public long C() {
        return this.i;
    }

    public boolean F() {
        return this.l;
    }

    public void G(long j) {
        this.j = j;
    }

    public void H(long j) {
        this.f39238k = j;
    }

    public void I(boolean z) {
        this.l = z;
    }

    public void L(long j) {
        this.i = j;
    }

    @Override // defpackage.y6k
    public String toString() {
        return "HeadSetRecord{id=" + this.i + ", beginTime=" + DateFormat.getTimeInstance().format(Long.valueOf(this.j)) + ", endTime=" + DateFormat.getTimeInstance().format(Long.valueOf(this.f39238k)) + ", high=" + this.l + "," + super.toString() + AbstractJsonLexerKt.END_OBJ;
    }
}
