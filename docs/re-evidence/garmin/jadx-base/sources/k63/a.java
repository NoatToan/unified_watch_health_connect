package k63;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk63/a;", "", "", "serialName", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<? extends Annotation> f103213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f103214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f103215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f103216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f103217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f103218g;

    public a(String str) {
        str.getClass();
        this.f103212a = str;
        this.f103213b = j0.f134944a;
        this.f103214c = new ArrayList();
        this.f103215d = new HashSet();
        this.f103216e = new ArrayList();
        this.f103217f = new ArrayList();
        this.f103218g = new ArrayList();
    }

    public static void b(a aVar, String str, e eVar) {
        aVar.a(str, eVar, j0.f134944a);
    }

    public final void a(String str, e eVar, List list) {
        str.getClass();
        eVar.getClass();
        list.getClass();
        if (!this.f103215d.add(str)) {
            StringBuilder sbL = hb.a.l("Element with name '", str, "' is already registered in ");
            sbL.append(this.f103212a);
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        this.f103214c.add(str);
        this.f103216e.add(eVar);
        this.f103217f.add(list);
        this.f103218g.add(Boolean.FALSE);
    }
}
