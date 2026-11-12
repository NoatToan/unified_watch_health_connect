package p007l6;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p6.a;
import p6.f;
import p6.g;
import p6.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll6/b;", "Ll6/v;", "Lp6/g;", "containerObject", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Lp6/g;I)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f110441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110442b;

    public b(g gVar, int i14) {
        this.f110441a = gVar;
        a.f110438a.getClass();
        this.f110442b = (i14 == 0 || i14 != 1) ? "top" : "bottom";
    }

    @Override // p007l6.v
    public final void a(h.b bVar, float f14, float f15) {
        a aVar = a.f110438a;
        int i14 = bVar.f110474b;
        aVar.getClass();
        String str = (i14 == 0 || i14 != 1) ? "top" : "bottom";
        a aVar2 = new a(new char[0]);
        aVar2.g(h.g(bVar.f110473a.toString()));
        aVar2.g(h.g(str));
        aVar2.g(new f(f14));
        aVar2.g(new f(f15));
        this.f110441a.u(this.f110442b, aVar2);
    }
}
