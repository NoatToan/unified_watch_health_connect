package defpackage;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.sport_eco_manager.db.SCMConstants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
@Entity(tableName = SCMConstants.scm_table)
public class mcn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @PrimaryKey
    public int f26018a;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public float g;
    public String l;
    public boolean n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26019b = true;
    public boolean h = true;
    public boolean i = false;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26020k = false;
    public boolean m = true;
    public boolean o = false;
    public int p = 0;
    public int q = 100;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26021r = 1;

    public String toString() {
        return "SportConfigModel{sportType=" + this.f26018a + ", isLight=" + this.f26019b + ", isRemindHr=" + this.c + ", heartRate=" + this.d + ", isRemindSpeed=" + this.e + ", speed=" + this.f + ", riding=" + this.g + ", isNotifyKm=" + this.h + ", isMetronome=" + this.i + ", metronomeRate=" + this.j + ", isLockScreen=" + this.f26020k + ", remindHertRateRange='" + this.l + "', basicVoiceRemind=" + this.m + ", isNotifyHrIntervalChange=" + this.n + ", isAutoPause=" + this.o + ", countdown=" + this.p + ", countingInterval=" + this.q + ", reportingInterval=" + this.f26021r + AbstractJsonLexerKt.END_OBJ;
    }
}
