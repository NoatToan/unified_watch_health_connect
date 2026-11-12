package ra0;

import e23.l;
import e23.p;
import java.util.ArrayList;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f151457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f151458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f151459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f151460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f151461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f151462g;

    public /* synthetic */ a(int i14, ArrayList arrayList, String str, l lVar, e23.a aVar, e23.a aVar2, int i15, int i16) {
        this.f151456a = i16;
        this.f151457b = i14;
        this.f151458c = arrayList;
        this.f151459d = str;
        this.f151460e = lVar;
        this.f151461f = aVar;
        this.f151462g = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f151456a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                c.b(this.f151457b, this.f151458c, this.f151459d, this.f151460e, this.f151461f, this.f151462g, (m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                c.a(this.f151457b, this.f151458c, this.f151459d, this.f151460e, this.f151461f, this.f151462g, (m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
