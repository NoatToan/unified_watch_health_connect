package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(inheritSuperIndices = true, tableName = "record_sleep")
public class yzm extends y6k implements Cloneable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @Expose(deserialize = false, serialize = false)
    public long i;

    @SerializedName("beginTime")
    @ColumnInfo(name = "begin_time")
    private long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("endTime")
    @ColumnInfo(name = SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME)
    private long f40729k;

    @SerializedName(StepsInfo.KEY_STAGE)
    @ColumnInfo(name = StepsInfo.KEY_STAGE)
    private int l;

    @SerializedName("segEnd")
    @ColumnInfo(name = "segEnd")
    private boolean m;

    public yzm() {
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public yzm clone() {
        return new yzm(this);
    }

    public long B() {
        return this.j;
    }

    public long C() {
        return this.f40729k;
    }

    public long F() {
        return this.i;
    }

    public int G() {
        return this.l;
    }

    public boolean H() {
        return this.m;
    }

    public void I(long j) {
        this.j = j;
    }

    public void L(long j) {
        this.f40729k = j;
    }

    public void R(long j) {
        this.i = j;
    }

    public void V(boolean z) {
        this.m = z;
    }

    public void W(int i) {
        this.l = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzm)) {
            return false;
        }
        yzm yzmVar = (yzm) obj;
        return this.i == yzmVar.i && this.j == yzmVar.j && this.f40729k == yzmVar.f40729k && this.l == yzmVar.l && this.m == yzmVar.m;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.f40729k), Integer.valueOf(this.l), Boolean.valueOf(this.m));
    }

    @Override // defpackage.y6k
    public String toString() {
        return "SleepStageRecord{id=" + this.i + ", beginTime=" + this.j + ", endTime=" + this.f40729k + ", stage=" + this.l + ", isEnd=" + this.m + AbstractJsonLexerKt.END_OBJ;
    }

    public yzm(yzm yzmVar) {
        super(yzmVar);
        R(yzmVar.F());
        I(yzmVar.B());
        L(yzmVar.C());
        W(yzmVar.G());
        V(yzmVar.H());
    }
}
