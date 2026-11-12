package defpackage;

import com.miui.circulate.api.exception.CirculateException;

/* JADX INFO: loaded from: classes.dex */
public class n3f implements had {
    @Override // defpackage.had
    public <T> void a(gx3 gx3Var, T... tArr) throws CirculateException {
        gx3Var.j("CirculateServiceManager", new tx3(gx3Var.b(), gx3Var.c()));
        gx3Var.j("DeviceManager", new x96(gx3Var.b()));
    }
}
