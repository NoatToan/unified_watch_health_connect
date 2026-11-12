package xc;

import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import p3.c2;
import p3.p0;
import wc.g;
import wc.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxc/e;", "Lwc/g;", "T", "", "currentInfo", "", "backInfo", "forwardInfo", "<init>", "(Lwc/g;Ljava/util/List;Ljava/util/List;)V", "navigationevent-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e<T extends g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f189891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f189892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f189893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f189894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wc.e<? extends g> f189895e;

    public e(T t7, List<? extends T> list, List<? extends T> list2) {
        this.f189891a = p0.n(j.b.f184258a);
        this.f189892b = p0.n(list);
        this.f189893c = p0.n(t7);
        this.f189894d = p0.n(list2);
    }

    public e(g gVar, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, (i14 & 2) != 0 ? j0.f134944a : list, (i14 & 4) != 0 ? j0.f134944a : list2);
    }
}
