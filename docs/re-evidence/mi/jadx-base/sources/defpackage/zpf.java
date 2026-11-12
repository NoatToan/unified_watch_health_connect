package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import java.text.SimpleDateFormat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(tableName = FitnessPersistKey.WomenHealthStatus)
public class zpf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @PrimaryKey
    @ColumnInfo(name = "date_num")
    public long f41549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "status")
    public int f41550b;

    @ColumnInfo(name = "auto_end")
    public boolean c;
    public int d = 0;

    public zpf(long j) {
        this.f41549a = j;
    }

    public String toString() {
        return "MenstruationDate{dateNum=" + new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(this.f41549a)) + ", status=" + this.f41550b + ", dateStyleMode=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }
}
