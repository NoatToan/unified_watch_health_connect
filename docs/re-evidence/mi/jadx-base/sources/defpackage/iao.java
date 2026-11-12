package defpackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;

/* JADX INFO: loaded from: classes9.dex */
@Entity(indices = {@Index(name = "idx_stand_record", unique = true, value = {"device_id", DeviceContractKt.COLUMN_DEVICE_TYPE, "data_type", "timestamp", "basis"})}, inheritSuperIndices = true, tableName = FitnessDBConstants.TABLE_STAND)
public class iao extends y6k {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int i;

    @ColumnInfo(name = "basis")
    public String j;

    public int A() {
        return this.i;
    }

    public void B(String str) {
        this.j = str;
    }

    public void C(int i) {
        this.i = i;
    }

    @Override // defpackage.y6k
    public String toString() {
        return super.toString() + "StandRecord {basis:" + this.j + "}";
    }
}
