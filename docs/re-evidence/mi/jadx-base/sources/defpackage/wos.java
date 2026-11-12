package defpackage;

import java.io.File;
import java.util.Date;
import tos.c;

/* JADX INFO: loaded from: classes11.dex */
public class wos extends tos.b {
    public File c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Date e;
    public final /* synthetic */ Date f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ tos j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wos(tos tosVar, int i, Date date, Date date2, String str, String str2, boolean z) {
        super();
        this.j = tosVar;
        this.d = i;
        this.e = date;
        this.f = date2;
        this.g = str;
        this.h = str2;
        this.i = z;
    }

    @Override // tos.b, z5s.b
    public void b() {
        try {
            File file = new File(this.j.f34898b.getFilesDir() + "/.logcache");
            if (egt.b(file)) {
                file.mkdirs();
                if (file.isDirectory()) {
                    pos posVar = new pos();
                    posVar.d(this.d);
                    this.c = posVar.c(this.j.f34898b, this.e, this.f, file);
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    @Override // z5s.b
    public void c() {
        File file = this.c;
        if (file != null && file.exists()) {
            this.j.f34897a.add(this.j.new c(this.g, this.h, this.c, this.i));
        }
        this.j.e(0L);
    }
}
