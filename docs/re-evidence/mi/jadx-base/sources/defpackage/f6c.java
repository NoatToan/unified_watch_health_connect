package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.heartrate.ui.DetectManualActivity;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Entity(inheritSuperIndices = true, tableName = "heart_rate")
public class f6c extends y6k {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int i;

    @ColumnInfo(name = "hrm_ype")
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColumnInfo(name = "hrm_record")
    public List<Short> f17458k;

    @ColumnInfo(name = "rhr_avg")
    public short l;

    @ColumnInfo(name = "hrm")
    public short m;

    @ColumnInfo(name = "once_type")
    public int n;

    @ColumnInfo(name = DetectManualActivity.DETECT_TYPE)
    public int o;

    public short A() {
        return this.m;
    }

    public int B() {
        return this.i;
    }

    public void C(int i) {
        this.o = i;
    }

    public void F(short s) {
        this.m = s;
    }

    public void G(List<Short> list) {
        this.f17458k = list;
    }

    public void H(String str) {
        this.j = str;
    }

    public void I(int i) {
        this.i = i;
    }

    public void L(int i) {
        this.n = i;
    }

    public void R(short s) {
        this.l = s;
    }

    @Override // defpackage.y6k
    public String toString() {
        return "HeartRateRecord{id=" + this.i + ", hrmType='" + this.j + "', hrmRecord=" + this.f17458k + ", rhrAvg=" + ((int) this.l) + ", hrm=" + ((int) this.m) + ", onceType=" + this.n + ", detectType=" + this.o + "}, " + super.toString();
    }
}
