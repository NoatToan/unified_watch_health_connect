package yt2;

import c22.t;
import com.garmin.net.omtanalytics.impl.upload.Uploader;
import java.util.List;
import p005kotlin.Metadata;
import p13.w;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyt2/f;", "", "<init>", "()V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static yt2.a f199670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static au2.a f199671c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f199669a = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f199672d = new c(false, false, 0, 0, 0, 0, 0, 127, null);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"yt2/f$a", "Lau2/a$d;", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements au2.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f199673a;

        public a(long j8, e eVar) {
            this.f199673a = j8;
        }

        @Override // au2.a.d
        public final void a(au2.a.C0184a c0184a) {
            Uploader.b bVar = Uploader.f52481e;
            long j8 = this.f199673a;
            bVar.getClass();
            boolean zB = false;
            try {
                f.f199669a.getClass();
                yt2.a aVar = f.f199670b;
                if (aVar == null) {
                    au2.a.c cVar = au2.a.f13046e;
                    List listC = w.c(c0184a);
                    cVar.getClass();
                    au2.a.c.d(listC);
                } else {
                    g gVarD = aVar.d();
                    if (d53.w.J(gVarD.f199675a)) {
                        Uploader.b.a().error("upload: missing client name");
                        au2.a.c cVar2 = au2.a.f13046e;
                        List listC2 = w.c(c0184a);
                        cVar2.getClass();
                        au2.a.c.d(listC2);
                    } else if (d53.w.J(gVarD.f199676b)) {
                        Uploader.b.a().error("upload: missing client version");
                        au2.a.c cVar3 = au2.a.f13046e;
                        List listC3 = w.c(c0184a);
                        cVar3.getClass();
                        au2.a.c.d(listC3);
                    } else if (d53.w.J(gVarD.f199677c)) {
                        Uploader.b.a().error("upload: missing client GUID");
                        au2.a.c cVar4 = au2.a.f13046e;
                        List listC4 = w.c(c0184a);
                        cVar4.getClass();
                        au2.a.c.d(listC4);
                    } else {
                        zB = Uploader.b.b(new com.garmin.net.omtanalytics.impl.upload.c(aVar.b().f2788a, gVarD.f199675a, gVarD.f199676b, gVarD.f199677c, j8), w.c(c0184a));
                    }
                }
            } catch (Throwable unused) {
                au2.a.c cVar5 = au2.a.f13046e;
                List listC5 = w.c(c0184a);
                cVar5.getClass();
                au2.a.c.d(listC5);
            }
            if (zB) {
                f.f199669a.getClass();
            }
        }
    }

    private f() {
    }

    public static void a(e eVar, boolean z14) {
        a aVar = z14 ? new a(f199672d.f199663g, eVar) : null;
        au2.a aVar2 = f199671c;
        if (aVar2 != null) {
            c cVar = aVar2.f13049a;
            String str = eVar.f199666a;
            String str2 = eVar.f199667b;
            if (str.length() > 450) {
                String strE = t.e(str.length() - 450, "event type [", str, "] is ", " char(s) too long");
                if (cVar.f199657a) {
                    h.s(strE);
                    return;
                } else {
                    au2.a.f13046e.getClass();
                    au2.a.c.c().warn(strE);
                    return;
                }
            }
            if (str2.length() * 4 > 4194304) {
                byte[] bytes = str2.getBytes(d53.c.f57666b);
                bytes.getClass();
                int length = bytes.length;
                if (length > 4194304) {
                    String strE2 = t.e(length, "event type [", str, "]'s payload size [", "] exceeds limit");
                    if (cVar.f199657a) {
                        h.s(strE2);
                        return;
                    } else {
                        au2.a.f13046e.getClass();
                        au2.a.c.c().warn(strE2);
                        return;
                    }
                }
            }
            ge1.b.T(aVar2.f13051c, null, null, new au2.d(eVar, aVar2, aVar, null), 3);
        }
    }
}
