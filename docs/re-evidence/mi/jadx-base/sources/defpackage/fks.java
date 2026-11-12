package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class fks extends mis {
    public mis o;
    public final /* synthetic */ mis p;
    public final /* synthetic */ wjs q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fks(wjs wjsVar, String str, mis misVar) {
        super(str);
        this.q = wjsVar;
        this.p = misVar;
        this.o = misVar;
        this.d = this.d;
        if (misVar != null) {
            this.h = misVar.h;
        }
    }

    @Override // defpackage.mis
    public synchronized ArrayList<String> e(boolean z) {
        ArrayList<String> arrayList;
        try {
            arrayList = new ArrayList<>();
            mis misVar = this.o;
            if (misVar != null) {
                arrayList.addAll(misVar.e(true));
            }
            Map<String, mis> map = wjs.i;
            synchronized (map) {
                try {
                    mis misVar2 = map.get(this.d);
                    if (misVar2 != null) {
                        for (String str : misVar2.e(true)) {
                            if (arrayList.indexOf(str) == -1) {
                                arrayList.add(str);
                            }
                        }
                        arrayList.remove(this.d);
                        arrayList.add(this.d);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @Override // defpackage.mis
    public synchronized void n(String str, lis lisVar) {
        mis misVar = this.o;
        if (misVar != null) {
            misVar.n(str, lisVar);
        }
    }

    @Override // defpackage.mis
    public boolean u() {
        return false;
    }
}
