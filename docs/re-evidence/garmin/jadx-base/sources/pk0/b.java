package pk0;

import d53.w;
import java.util.List;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138188a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f138189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f138190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f138191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f138192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f138193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o13.h f138194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f138195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f138196i;

    public /* synthetic */ b(xc.a aVar, boolean z14, e23.a aVar2, e23.a aVar3, boolean z15, e23.a aVar4, e23.a aVar5, xc.e eVar) {
        this.f138192e = aVar;
        this.f138189b = z14;
        this.f138190c = aVar2;
        this.f138193f = aVar3;
        this.f138191d = z15;
        this.f138194g = aVar4;
        this.f138195h = aVar5;
        this.f138196i = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        wc.i iVar;
        wc.i iVar2;
        switch (this.f138188a) {
            case 0:
                String string = (String) this.f138192e;
                String string2 = (String) this.f138193f;
                e23.p pVar = (e23.p) this.f138194g;
                p1 p1Var = (p1) this.f138195h;
                p1 p1Var2 = (p1) this.f138196i;
                if (this.f138189b) {
                    string = w.i0((String) p1Var.getF182175a()).toString();
                }
                if (this.f138191d) {
                    string2 = w.i0((String) p1Var2.getF182175a()).toString();
                    if (string2.length() <= 0) {
                        string2 = null;
                    }
                }
                pVar.invoke(string, string2);
                this.f138190c.invoke();
                break;
            default:
                xc.a aVar = (xc.a) this.f138192e;
                e23.a<Unit> aVar2 = (e23.a) this.f138193f;
                e23.a<Unit> aVar3 = (e23.a) this.f138194g;
                e23.a<Unit> aVar4 = (e23.a) this.f138195h;
                xc.e eVar = (xc.e) this.f138196i;
                boolean z14 = aVar.f184238f;
                boolean z15 = this.f138189b;
                if (z14 != z15) {
                    aVar.f184238f = z15;
                    wc.c cVar = aVar.f184239g;
                    if (cVar != null && (iVar2 = cVar.f184229d) != null) {
                        iVar2.b();
                    }
                }
                aVar.f189874i = this.f138190c;
                aVar.f189875j = aVar2;
                aVar.i(this.f138191d);
                aVar.f189876k = aVar3;
                aVar.f189877l = aVar4;
                T t7 = (T) eVar.f189893c.getF182175a();
                List<? extends T> list = (List) eVar.f189892b.getF182175a();
                List<? extends T> list2 = (List) eVar.f189894d.getF182175a();
                t7.getClass();
                list.getClass();
                list2.getClass();
                aVar.f184233a = t7;
                aVar.f184234b = list;
                aVar.f184235c = list2;
                wc.c cVar2 = aVar.f184239g;
                if (cVar2 != null && (iVar = cVar2.f184229d) != null) {
                    iVar.d(aVar);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(boolean z14, String str, boolean z15, String str2, e23.p pVar, e23.a aVar, p1 p1Var, p1 p1Var2) {
        this.f138189b = z14;
        this.f138192e = str;
        this.f138191d = z15;
        this.f138193f = str2;
        this.f138194g = pVar;
        this.f138190c = aVar;
        this.f138195h = p1Var;
        this.f138196i = p1Var2;
    }
}
