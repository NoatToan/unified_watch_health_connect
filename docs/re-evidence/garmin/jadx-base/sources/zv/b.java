package zv;

import android.text.TextUtils;
import bs2.q00;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class b extends uv.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f207137a;

    public b(d dVar) {
        this.f207137a = dVar;
    }

    @Override // uv.g, da2.m
    public final void b(long j8) {
        this.f207137a.getClass();
        xv.e eVar = new xv.e(j8, 646);
        oi2.a.f132270a.getClass();
        l73.c.b().e(eVar);
    }

    @Override // uv.g, da2.m
    public final void c(String str) {
    }

    @Override // uv.g, da2.m
    public final void f(long j8, String str, String str2, String str3) {
        d dVar = this.f207137a;
        dVar.getClass();
        if (TextUtils.isEmpty(str) || j8 <= 0 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        File file = new File(str2, str3);
        i iVar = new i();
        if (iVar.a(file.getAbsolutePath())) {
            dVar.f207141b = iVar.f207153a;
            dVar.f207140a = new q00(dVar.f207141b);
            dVar.f207144e = iVar.f207154b;
            xv.c cVar = new xv.c(0);
            oi2.a.f132270a.getClass();
            l73.c.b().e(cVar);
        }
    }
}
