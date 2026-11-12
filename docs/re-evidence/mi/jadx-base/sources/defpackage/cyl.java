package defpackage;

import android.app.Application;
import android.app.Service;

/* JADX INFO: loaded from: classes2.dex */
public final class cyl implements sxa<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Service f14872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14873b;

    public interface a {
        byl a();
    }

    public cyl(Service service) {
        this.f14872a = service;
    }

    private Object a() {
        Application application = this.f14872a.getApplication();
        e6i.d(application instanceof sxa, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((a) hc8.a(application, a.class)).a().a(this.f14872a).build();
    }

    @Override // defpackage.sxa
    public Object generatedComponent() {
        if (this.f14873b == null) {
            this.f14873b = a();
        }
        return this.f14873b;
    }
}
