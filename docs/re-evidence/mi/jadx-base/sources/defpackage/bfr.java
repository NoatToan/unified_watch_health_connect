package defpackage;

import androidx.room.Delete;
import androidx.room.Query;
import com.xiaomi.fitness.migration.weight.v2.WeightItemV2;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface bfr {
    @Query("SELECT * FROM weight ORDER BY recordTime desc")
    List<WeightItemV2> a();

    @Delete
    void delete(List<WeightItemV2> list);
}
