package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.sleep.behavior.analyze.snore.AudioAttributes;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(inheritSuperIndices = true, tableName = "snore_report")
public class q3n extends y6k {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int i;

    @ColumnInfo(name = "max_noise_decibel")
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColumnInfo(name = "snore_frequency")
    public int f31052k;

    @ColumnInfo(name = "max_snore_decibel")
    public float l;

    @ColumnInfo(name = "snore_times")
    public int m;

    @ColumnInfo(name = "snore_duration")
    public int n;

    @ColumnInfo(name = "snore_list")
    public List<AudioAttributes> o;

    @ColumnInfo(name = "dream_talk_list")
    public List<AudioAttributes> p;

    @ColumnInfo(name = "noise_list")
    public List<AudioAttributes> q;

    public final int A(List<AudioAttributes> list) {
        int duration = 0;
        if (ArrayUtils.isEmpty(list)) {
            return 0;
        }
        for (AudioAttributes audioAttributes : list) {
            if (audioAttributes != null) {
                duration += audioAttributes.getDuration();
            }
        }
        return duration;
    }

    public List<AudioAttributes> B() {
        return this.p;
    }

    public List<AudioAttributes> C() {
        return this.o;
    }

    public int F() {
        int i = this.n;
        return i > 0 ? i : A(C());
    }

    public void G(float f) {
        this.j = f;
    }

    public void H(List<AudioAttributes> list) {
        this.p = list;
    }

    public void I(int i) {
        this.i = i;
    }

    public void L(List<AudioAttributes> list) {
        this.q = list;
    }

    public void R(int i) {
        this.f31052k = i;
    }

    public void V(List<AudioAttributes> list) {
        this.o = list;
    }

    public void W(float f) {
        this.l = f;
    }

    public void X(int i) {
        this.m = i;
    }

    public void Y(int i) {
        this.n = i;
    }

    @Override // defpackage.y6k
    public String toString() {
        return "SnailSleepSnoreReport{id=" + this.i + ", backgroundVolume=" + this.j + ", snoreFrequency=" + this.f31052k + ", snoreMaxVolume=" + this.l + ", snoreNumber=" + this.m + ", snorePureTotalTime=" + this.n + ", snoreList=" + this.o + ", dreamTalkList=" + this.p + ", noiseList=" + this.q + AbstractJsonLexerKt.END_OBJ;
    }
}
