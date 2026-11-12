package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.text.DateFormat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(inheritSuperIndices = true, tableName = "record_menstruate")
public class aqf extends y6k {
    public int i = 0;

    @ColumnInfo(name = "date_num")
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColumnInfo(name = "status")
    public int f3357k;

    @ColumnInfo(name = "auto_end")
    public boolean l;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public long m;

    public aqf(long j) {
        this.j = j;
    }

    public long A() {
        return this.j;
    }

    public long B() {
        return this.m;
    }

    public int C() {
        return this.f3357k;
    }

    public void F(boolean z) {
        this.l = z;
    }

    public void G(long j) {
        this.m = j;
    }

    public void H(int i) {
        this.f3357k = i;
    }

    @Override // defpackage.y6k
    public String toString() {
        return "MenstruationDate{dateNum=" + DateFormat.getDateInstance().format(Long.valueOf(this.j)) + ", status=" + this.f3357k + ", dateStyleMode=" + this.i + AbstractJsonLexerKt.END_OBJ;
    }

    public aqf() {
    }
}
