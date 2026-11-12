package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.huawei.haf.common.security.SecurityConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
final class bbb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<bax> f930a = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f931c = new Object();
    private final Context d;

    bbb(Context context) {
        this.d = context;
    }

    void c(int i, bax baxVar) {
        if (i != 0) {
            synchronized (this.f931c) {
                if (this.f930a.get(i) == null) {
                    this.f930a.put(i, baxVar);
                }
            }
        }
    }

    void c(int i, int i2) {
        synchronized (this.f931c) {
            bax baxVar = this.f930a.get(i);
            if (baxVar != null) {
                baxVar.b(i2);
                if (i2 == 7 || i2 == 6 || i2 == 10) {
                    this.f930a.remove(i);
                }
            }
        }
    }

    boolean d() {
        synchronized (this.f931c) {
            for (int size = this.f930a.size() - 1; size >= 0; size--) {
                int iA = this.f930a.valueAt(size).a();
                if (iA != 2 && iA != 1) {
                }
                return true;
            }
            return false;
        }
    }

    bax a(int i) {
        bax baxVar;
        synchronized (this.f931c) {
            baxVar = this.f930a.get(i);
        }
        return baxVar;
    }

    List<bax> b() {
        List<bax> listE;
        synchronized (this.f931c) {
            listE = e(this.f930a);
        }
        return listE;
    }

    boolean c(List<String> list) {
        synchronized (this.f931c) {
            for (int size = this.f930a.size() - 1; size >= 0; size--) {
                List<String> listE = this.f930a.valueAt(size).e();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (listE.contains(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    void c(bax baxVar) {
        Intent intent = new Intent();
        intent.setPackage(this.d.getPackageName());
        intent.putExtra("session_state", bax.e(baxVar));
        intent.setAction("com.huawei.android.appbundle.splitinstall.receiver.SplitInstallUpdateIntentService");
        intent.addFlags(1073741824);
        intent.addFlags(2097152);
        this.d.sendBroadcast(intent, SecurityConstant.f5920a);
    }

    private static <C> List<C> e(SparseArray<C> sparseArray) {
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.valueAt(i));
        }
        return arrayList;
    }
}
