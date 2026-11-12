package defpackage;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes13.dex */
public class orh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f44595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Application f44596c;
    private final String d;
    private final Context e;

    private orh(e eVar) {
        this.f44596c = eVar.f44598b;
        this.e = eVar.f44597a;
        this.f44595b = eVar.f44599c;
        this.f44594a = eVar.e;
        this.d = eVar.d;
    }

    public Context c() {
        Application application = this.f44596c;
        return application != null ? application : this.e;
    }

    public String d() {
        return this.f44595b;
    }

    public String b() {
        return this.f44594a;
    }

    public String a() {
        return this.d;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f44597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Application f44598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f44599c;
        private String d;
        private String e;

        public e c(Application application) {
            this.f44598b = application;
            return this;
        }

        public e e(String str) {
            this.f44599c = str;
            return this;
        }

        public e a(String str) {
            this.e = str;
            return this;
        }

        public e b(String str) {
            this.d = str;
            return this;
        }

        public orh b() {
            return new orh(this);
        }
    }
}
