package defpackage;

import com.huawei.hwbasemgr.IBaseResponseCallback;

/* JADX INFO: loaded from: classes10.dex */
public class lvz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f40951c;
    private IBaseResponseCallback e;

    public IBaseResponseCallback a() {
        return (IBaseResponseCallback) lst.d(this.e);
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        this.e = (IBaseResponseCallback) lst.d(iBaseResponseCallback);
    }

    public Object b() {
        return lst.d(this.f40951c);
    }

    public void c(Object obj) {
        this.f40951c = lst.d(obj);
    }
}
