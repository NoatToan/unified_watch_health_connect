package uv;

import androidx.lifecycle.y0;
import fw.m;
import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luv/c;", "", "", "deviceId", "Luv/h$a;", "proprieties", "<init>", "(JLuv/h$a;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f172874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.a f172875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f172876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f172877d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"uv/c$a", "Luv/g;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends g {
        public a() {
        }

        @Override // uv.g, da2.m
        public final void a(String str) {
            c cVar = c.this;
            y0 y0Var = cVar.f172876c;
            y0Var.getClass();
            y0Var.j(m.a.g(m.f73767e, null, 3));
            cVar.a();
        }

        @Override // uv.g, da2.m
        public final void d(String str, String str2) {
            c cVar = c.this;
            y0 y0Var = cVar.f172876c;
            y0Var.getClass();
            y0Var.j(m.a.b(m.f73767e, new fw.g(), null, 5));
            cVar.a();
        }

        @Override // uv.g, da2.m
        public final void e(long j8) {
        }
    }

    public c(long j8, h.a aVar) {
        aVar.getClass();
        this.f172874a = j8;
        this.f172875b = aVar;
        this.f172876c = new y0();
        this.f172877d = new a();
    }

    public final void a() {
        h.a aVar = this.f172875b;
        File file = new File(aVar.f172897c.getAbsolutePath(), aVar.f172896b);
        if (file.isFile()) {
            file.delete();
        }
    }
}
