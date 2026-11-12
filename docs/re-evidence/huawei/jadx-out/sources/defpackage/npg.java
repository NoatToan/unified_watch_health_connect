package defpackage;

import android.location.Location;
import android.os.Bundle;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlocationmgr.model.IGpsStatusCallback;
import com.huawei.hwlocationmgr.model.ILoactionCallback;
import com.huawei.hwlocationmgr.model.IOriginalGpsStatusListener;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class npg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f43395a = new Object();
    private static npg e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private npq f43396c = null;

    private npg() {
        i();
    }

    public static npg d() {
        npg npgVar;
        synchronized (f43395a) {
            npg npgVar2 = e;
            if (npgVar2 == null) {
                e = new npg();
            } else {
                npgVar2.f43396c.e();
            }
            npgVar = e;
        }
        return npgVar;
    }

    private void i() {
        if (this.f43396c == null) {
            this.f43396c = npq.e(BaseApplication.getContext());
        }
    }

    public boolean a() {
        i();
        return this.f43396c.b();
    }

    public void b() {
        i();
        this.f43396c.d();
    }

    public Location c(List<String> list) {
        i();
        return this.f43396c.c(list);
    }

    public Location c() {
        i();
        return this.f43396c.c();
    }

    public void a(ILoactionCallback iLoactionCallback, String str) {
        i();
        this.f43396c.c(iLoactionCallback, str);
    }

    public void c(String str) {
        i();
        this.f43396c.c(str);
    }

    public void b(IGpsStatusCallback iGpsStatusCallback, String str) {
        i();
        this.f43396c.c(iGpsStatusCallback, str);
    }

    public void e(String str) {
        i();
        this.f43396c.b(str);
    }

    public void c(IOriginalGpsStatusListener iOriginalGpsStatusListener, String str) {
        i();
        this.f43396c.d(iOriginalGpsStatusListener, str);
    }

    public void b(String str) {
        i();
        this.f43396c.a(str);
    }

    public void e(boolean z) {
        i();
        this.f43396c.b(z);
    }

    public int e() {
        i();
        return this.f43396c.a();
    }

    public boolean a(String str, String str2, Bundle bundle) {
        i();
        return this.f43396c.c(str, str2, bundle);
    }
}
