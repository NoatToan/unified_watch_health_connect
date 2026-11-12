package yi;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class d implements yi.a.InterfaceC3695a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f197292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f197293b;

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f197294a;

        public a(String str) {
            this.f197294a = str;
        }

        @Override // yi.d.c
        public final File a() {
            return new File(this.f197294a);
        }
    }

    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f197295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f197296b;

        public b(String str, String str2) {
            this.f197295a = str;
            this.f197296b = str2;
        }

        @Override // yi.d.c
        public final File a() {
            return new File(this.f197295a, this.f197296b);
        }
    }

    public interface c {
        File a();
    }

    public d(String str, long j8) {
        this(new a(str), j8);
    }

    public d(String str, String str2, long j8) {
        this(new b(str, str2), j8);
    }

    public d(c cVar, long j8) {
        this.f197292a = j8;
        this.f197293b = cVar;
    }
}
