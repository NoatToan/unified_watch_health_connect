package defpackage;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kya {
    private LruCache<SparseIntArray, List<kui>> d;

    private kya() {
        this.d = new LruCache<>(20);
    }

    static class e {
        private static final kya e = new kya();
    }

    public static kya a() {
        return e.e;
    }

    public List<kui> d(int i, int i2) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(i, i2);
        return this.d.get(sparseIntArray);
    }

    public void c(int i, int i2, List<kui> list) {
        if (list == null) {
            return;
        }
        SparseIntArray sparseIntArray = new SparseIntArray(20);
        sparseIntArray.put(i, i2);
        this.d.put(sparseIntArray, list);
    }

    public boolean a(int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Debug_AuthorizationsCache", "checkAuth permission error");
            return false;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(i, i2);
        List<kui> list = this.d.get(sparseIntArray);
        LogUtil.d("Debug_AuthorizationsCache", "checkAuth authorizationTables ", list);
        if (list == null) {
            return false;
        }
        for (kui kuiVar : list) {
            if (str.equalsIgnoreCase(kuiVar.a().b()) && i == kuiVar.c() && i2 == kuiVar.i()) {
                return true;
            }
        }
        return false;
    }

    public void b() {
        this.d.evictAll();
    }
}
