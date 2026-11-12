package defpackage;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class da2 implements ebi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageRequest f15287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15288b;
    public final hbi c;
    public final Object d;
    public final ImageRequest.RequestLevel e;
    public boolean f;
    public Priority g;
    public boolean h;
    public boolean i = false;
    public final List<fbi> j = new ArrayList();

    public da2(ImageRequest imageRequest, String str, hbi hbiVar, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority) {
        this.f15287a = imageRequest;
        this.f15288b = str;
        this.c = hbiVar;
        this.d = obj;
        this.e = requestLevel;
        this.f = z;
        this.g = priority;
        this.h = z2;
    }

    public static void h(List<fbi> list) {
        if (list == null) {
            return;
        }
        Iterator<fbi> it = list.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public static void i(List<fbi> list) {
        if (list == null) {
            return;
        }
        Iterator<fbi> it = list.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static void j(List<fbi> list) {
        if (list == null) {
            return;
        }
        Iterator<fbi> it = list.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public static void k(List<fbi> list) {
        if (list == null) {
            return;
        }
        Iterator<fbi> it = list.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @Override // defpackage.ebi
    public Object a() {
        return this.d;
    }

    @Override // defpackage.ebi
    public ImageRequest b() {
        return this.f15287a;
    }

    @Override // defpackage.ebi
    public void c(fbi fbiVar) {
        boolean z;
        synchronized (this) {
            this.j.add(fbiVar);
            z = this.i;
        }
        if (z) {
            fbiVar.b();
        }
    }

    @Override // defpackage.ebi
    public synchronized boolean d() {
        return this.h;
    }

    @Override // defpackage.ebi
    public synchronized boolean e() {
        return this.f;
    }

    @Override // defpackage.ebi
    public hbi f() {
        return this.c;
    }

    @Override // defpackage.ebi
    public ImageRequest.RequestLevel g() {
        return this.e;
    }

    @Override // defpackage.ebi
    public String getId() {
        return this.f15288b;
    }

    @Override // defpackage.ebi
    public synchronized Priority getPriority() {
        return this.g;
    }

    public void l() {
        h(m());
    }

    public synchronized List<fbi> m() {
        if (this.i) {
            return null;
        }
        this.i = true;
        return new ArrayList(this.j);
    }

    public synchronized List<fbi> n(boolean z) {
        if (z == this.h) {
            return null;
        }
        this.h = z;
        return new ArrayList(this.j);
    }

    public synchronized List<fbi> o(boolean z) {
        if (z == this.f) {
            return null;
        }
        this.f = z;
        return new ArrayList(this.j);
    }

    public synchronized List<fbi> p(Priority priority) {
        if (priority == this.g) {
            return null;
        }
        this.g = priority;
        return new ArrayList(this.j);
    }
}
