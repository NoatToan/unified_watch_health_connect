package ii0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mi0.j f93661b;

    public /* synthetic */ k0(mi0.j jVar, int i14) {
        this.f93660a = i14;
        this.f93661b = jVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f93660a) {
            case 0:
                mi0.j jVar = this.f93661b;
                jVar.f118904h = null;
                jVar.f118905i = null;
                return Unit.INSTANCE;
            case 1:
                mi0.j jVar2 = this.f93661b;
                jVar2.f118906j = null;
                jVar2.f118907k = null;
                return Unit.INSTANCE;
            case 2:
                mi0.j jVar3 = this.f93661b;
                return new fi0.m(jVar3.f118902f, jVar3.f118897a, jVar3.f118899c, 1, 20);
            default:
                mi0.j jVar4 = this.f93661b;
                return new fi0.p(jVar4.f118902f, jVar4.f118897a, jVar4.f118899c, 1, 20);
        }
    }
}
