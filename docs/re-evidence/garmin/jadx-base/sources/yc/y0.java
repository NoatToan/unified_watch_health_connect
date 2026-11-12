package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B%\b\u0017\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB%\b\u0017\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fB+\b\u0017\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\r\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u0010B+\b\u0017\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\r\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lyc/y0;", "", "Key", "Value", "Lyc/x$c;", "dataSourceFactory", "Lyc/m2$d;", "config", "<init>", "(Lyc/x$c;Lyc/m2$d;)V", "", "pageSize", "(Lyc/x$c;I)V", "Lkotlin/Function0;", "Lyc/h3;", "pagingSourceFactory", "(Le23/a;Lyc/m2$d;)V", "(Le23/a;I)V", "paging-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y0<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<h3<Key, Value>> f196626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x.c<Key, Value> f196627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2.d f196628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.e1 f196629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s51.c.a.C2965a f196630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o53.z f196631f;

    @o13.e
    public y0(x.c<Key, Value> cVar, m2.d dVar) {
        cVar.getClass();
        dVar.getClass();
        this.f196629d = o53.e1.f129333a;
        this.f196631f = gl1.y.o(n.a.f122012d);
        this.f196626a = null;
        this.f196627b = cVar;
        this.f196628c = dVar;
    }

    @o13.e
    public y0(x.c<Key, Value> cVar, int i14) {
        cVar.getClass();
        m2.d.a aVar = new m2.d.a();
        if (i14 >= 1) {
            aVar.f196233a = i14;
            this(cVar, aVar.a());
        } else {
            vb.h.s("Page size must be a positive number");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o13.e
    public y0(e23.a<? extends h3<Key, Value>> aVar, m2.d dVar) {
        aVar.getClass();
        dVar.getClass();
        this.f196629d = o53.e1.f129333a;
        this.f196631f = gl1.y.o(n.a.f122012d);
        this.f196626a = aVar;
        this.f196627b = null;
        this.f196628c = dVar;
    }

    @o13.e
    public y0(e23.a<? extends h3<Key, Value>> aVar, int i14) {
        aVar.getClass();
        m2.d.a aVar2 = new m2.d.a();
        if (i14 >= 1) {
            aVar2.f196233a = i14;
            this(aVar, aVar2.a());
        } else {
            vb.h.s("Page size must be a positive number");
            throw null;
        }
    }
}
