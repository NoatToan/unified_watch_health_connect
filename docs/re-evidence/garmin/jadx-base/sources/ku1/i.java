package ku1;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106576a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f106577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f106578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f106579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f106580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f106581f;

    public /* synthetic */ i(r rVar, String str, String str2, String str3, e23.a aVar, int i14) {
        this.f106577b = rVar;
        this.f106578c = str;
        this.f106579d = str2;
        this.f106580e = str3;
        this.f106581f = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f106576a) {
            case 0:
                ((Integer) obj2).getClass();
                j.a(p0.t(1), this.f106581f, this.f106577b, this.f106578c, this.f106579d, this.f106580e, (p3.m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                vb1.f.a(p0.t(1), this.f106581f, this.f106577b, this.f106578c, this.f106579d, this.f106580e, (p3.m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(String str, String str2, String str3, r rVar, e23.a aVar, int i14) {
        this.f106578c = str;
        this.f106579d = str2;
        this.f106580e = str3;
        this.f106577b = rVar;
        this.f106581f = aVar;
    }
}
