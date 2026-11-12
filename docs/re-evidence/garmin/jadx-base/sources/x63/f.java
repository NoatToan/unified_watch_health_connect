package x63;

import d53.u;
import d53.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import o13.m;
import o13.p;
import o13.t;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;
import p13.d0;
import p13.h0;
import w5.r;
import w63.f0;
import w63.g0;
import w63.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx63/f;", "Lw63/l;", "Ljava/lang/ClassLoader;", "classLoader", "", "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLw63/l;)V", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends w63.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f189323f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y f189324g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClassLoader f189325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w63.l f189326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f189327e;

    static {
        y.f183408b.getClass();
        f189324g = y.a.a("/");
    }

    public f(ClassLoader classLoader, boolean z14, w63.l lVar) {
        classLoader.getClass();
        lVar.getClass();
        this.f189325c = classLoader;
        this.f189326d = lVar;
        t tVarB = m.b(new wd.c(this, 19));
        this.f189327e = tVarB;
        if (z14) {
            ((List) tVarB.getValue()).size();
        }
    }

    @Override // w63.l
    public final f0 a(y yVar) throws IOException {
        yVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // w63.l
    public final void c(y yVar, y yVar2) throws IOException {
        yVar.getClass();
        yVar2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // w63.l
    public final void e(y yVar) throws IOException {
        yVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // w63.l
    public final void f(y yVar) throws IOException {
        yVar.getClass();
        throw new IOException(this + " is read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w63.l
    public final List<y> l(y yVar) throws FileNotFoundException {
        a aVar;
        yVar.getClass();
        y yVar2 = f189324g;
        yVar2.getClass();
        String strS = c.b(yVar2, yVar, true).d(yVar2).f183410a.s();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z14 = false;
        for (p pVar : (List) this.f189327e.getValue()) {
            w63.l lVar = (w63.l) pVar.f128594a;
            y yVar3 = (y) pVar.f128595b;
            try {
                List<y> listL = lVar.l(yVar3.e(strS));
                ArrayList<y> arrayList = new ArrayList();
                Iterator<T> it = listL.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    aVar = f189323f;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (a.a(aVar, (y) next)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                for (y yVar4 : arrayList) {
                    aVar.getClass();
                    yVar4.getClass();
                    String strReplace = w.O(yVar4.f183410a.s(), yVar3.f183410a.s()).replace('\\', IOUtils.DIR_SEPARATOR_UNIX);
                    strReplace.getClass();
                    arrayList2.add(yVar2.e(strReplace));
                }
                d0.v(linkedHashSet, arrayList2);
                z14 = true;
            } catch (IOException unused) {
            }
        }
        if (z14) {
            return h0.b1(linkedHashSet);
        }
        vb.h.r(yVar, "file not found: ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w63.l
    public final w63.k p(y yVar) {
        yVar.getClass();
        if (!a.a(f189323f, yVar)) {
            return null;
        }
        y yVar2 = f189324g;
        yVar2.getClass();
        String strS = c.b(yVar2, yVar, true).d(yVar2).f183410a.s();
        for (p pVar : (List) this.f189327e.getValue()) {
            w63.k kVarP = ((w63.l) pVar.f128594a).p(((y) pVar.f128595b).e(strS));
            if (kVarP != null) {
                return kVarP;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w63.l
    public final w63.j s(y yVar) throws FileNotFoundException {
        yVar.getClass();
        if (!a.a(f189323f, yVar)) {
            vb.h.r(yVar, "file not found: ");
            return null;
        }
        y yVar2 = f189324g;
        yVar2.getClass();
        String strS = c.b(yVar2, yVar, true).d(yVar2).f183410a.s();
        for (p pVar : (List) this.f189327e.getValue()) {
            try {
                return ((w63.l) pVar.f128594a).s(((y) pVar.f128595b).e(strS));
            } catch (FileNotFoundException unused) {
            }
        }
        vb.h.r(yVar, "file not found: ");
        return null;
    }

    @Override // w63.l
    public final f0 v(y yVar, boolean z14) throws IOException {
        yVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // w63.l
    public final g0 w(y yVar) throws IOException {
        yVar.getClass();
        if (!a.a(f189323f, yVar)) {
            vb.h.r(yVar, "file not found: ");
            return null;
        }
        y yVar2 = f189324g;
        yVar2.getClass();
        URL resource = this.f189325c.getResource(c.b(yVar2, yVar, false).d(yVar2).f183410a.s());
        if (resource == null) {
            vb.h.r(yVar, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return r.y(inputStream);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx63/f$a;", "", "<init>", "()V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final boolean a(a aVar, y yVar) {
            aVar.getClass();
            return !u.p(yVar.b(), ".class", true);
        }

        private a() {
        }
    }

    public /* synthetic */ f(ClassLoader classLoader, boolean z14, w63.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(classLoader, z14, (i14 & 4) != 0 ? w63.l.f183387a : lVar);
    }
}
