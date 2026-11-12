package defpackage;

import android.util.SparseArray;
import com.huawei.hihealthservice.updatemanager.command.UpdateCommand;

/* JADX INFO: loaded from: classes10.dex */
public class ljf {
    private static final SparseArray<UpdateCommand> d;

    static {
        SparseArray<UpdateCommand> sparseArray = new SparseArray<>(10);
        d = sparseArray;
        sparseArray.put(100, new ljk());
        sparseArray.put(102, new ljj());
    }

    public static UpdateCommand e(int i) {
        return d.get(i);
    }
}
