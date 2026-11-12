package defpackage;

import android.app.Application;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class iwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Application f22178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p1d f22179b;
    public List<gur> c;
    public boolean d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Application f22180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p1d f22181b;
        public List<gur> c;
        public Boolean d;

        public a a(Application application) {
            this.f22180a = application;
            return this;
        }

        public iwr b() {
            iwr iwrVar = new iwr();
            iwrVar.c = this.c;
            iwrVar.f22179b = this.f22181b;
            Application application = this.f22180a;
            iwrVar.f22178a = application;
            sk1.c(application);
            Boolean bool = this.d;
            iwrVar.d = bool == null ? gwr.b(this.f22180a) : bool.booleanValue();
            List<gur> list = this.c;
            sk1.b((list == null || list.isEmpty()) ? false : true, "envConfigList can not be empty!");
            return iwrVar;
        }

        public a c(Boolean bool) {
            this.d = bool;
            return this;
        }

        public a d(List<gur> list) {
            this.c = list;
            return this;
        }
    }

    public Application d() {
        return this.f22178a;
    }

    public List<gur> e() {
        return this.c;
    }

    public p1d f() {
        return this.f22179b;
    }

    public boolean g() {
        return this.d;
    }
}
