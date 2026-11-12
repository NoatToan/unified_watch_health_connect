package xd;

import am.j;
import d53.w;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;
import vb.h;
import vd.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxd/b;", "Lud/b;", "Lvd/d;", "openHelper", "<init>", "(Lvd/d;)V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements ud.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f189968a;

    public b(d dVar) {
        dVar.getClass();
        this.f189968a = dVar;
    }

    @Override // ud.b
    public final ud.a a(String str) {
        str.getClass();
        d dVar = this.f189968a;
        String f184330b = dVar.getF184330b();
        if (f184330b == null) {
            if (!str.equals(":memory:")) {
                h.x(j.m("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!f184330b.equals(str) && !w.d0(IOUtils.DIR_SEPARATOR_UNIX, f184330b, f184330b).equals(w.d0(IOUtils.DIR_SEPARATOR_UNIX, str, str))) {
            androidx.core.view.j.z(dVar.getF184330b(), "' but '", str, "' was requested.", "This driver is configured to open a database named '");
            return null;
        }
        return new a(dVar.getWritableDatabase());
    }

    @Override // ud.b
    public final boolean b() {
        return true;
    }
}
