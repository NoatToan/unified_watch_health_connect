package defpackage;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.sport_manager.db.SCMConstants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
@Entity(tableName = SCMConstants.scm_table)
public class lcn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @PrimaryKey
    public int f24908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24909b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public float g;
    public String l;
    public boolean n;
    public boolean h = true;
    public boolean i = false;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24910k = false;
    public boolean m = true;
    public boolean o = false;

    public String toString() {
        return "SportConfigModel{sportType=" + this.f24908a + ", isLight=" + this.f24909b + ", isRemindHr=" + this.c + ", heartRate=" + this.d + ", isRemindSpeed=" + this.e + ", speed=" + this.f + ", riding=" + this.g + ", isNotifyKm=" + this.h + ", isMetronome=" + this.i + ", metronomeRate=" + this.j + ", isLockScreen=" + this.f24910k + ", remindHertRateRange='" + this.l + "', basicVoiceRemind=" + this.m + ", isNotifyHrIntervalChange=" + this.n + ", isAutoPause=" + this.o + AbstractJsonLexerKt.END_OBJ;
    }
}
