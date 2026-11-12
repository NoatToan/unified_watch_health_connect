package defpackage;

import android.content.Context;
import com.miui.circulate.api.bean.ExtraBundle;
import com.miui.circulate.api.service.CirculateDeviceInfo;

/* JADX INFO: loaded from: classes.dex */
public class x96 implements e96 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile CirculateDeviceInfo f38883b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38884a;

    public x96(Context context) {
        this.f38884a = context;
    }

    @Override // defpackage.e96
    public boolean a(CirculateDeviceInfo circulateDeviceInfo) {
        return d().equals(circulateDeviceInfo);
    }

    @Override // defpackage.e96
    public CirculateDeviceInfo d() {
        if (f38883b == null) {
            synchronized (this) {
                try {
                    if (f38883b == null) {
                        f38883b = new CirculateDeviceInfo();
                        f38883b.f10301a = "local_device_id";
                        f38883b.f10302b = "local_device_idhash";
                        f38883b.h = new ExtraBundle.b().a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38883b;
    }
}
