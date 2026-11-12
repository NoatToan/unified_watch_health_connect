package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes9.dex */
@Entity(inheritSuperIndices = true, tableName = "record_noise")
public class yvg extends y6k {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public long i;

    @ColumnInfo(name = "decibel")
    public int j;

    public int A() {
        return this.j;
    }

    public long B() {
        return this.i;
    }

    public void C(int i) {
        this.j = i;
    }

    public void F(long j) {
        this.i = j;
    }
}
