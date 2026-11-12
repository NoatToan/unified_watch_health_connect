package p72;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136318a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f136319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f136320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u4.d f136321d;

    public /* synthetic */ c(String str, String str2, u4.d dVar, int i14) {
        this.f136319b = str;
        this.f136320c = str2;
        this.f136321d = dVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f136318a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                d.d(p0.t(1), this.f136319b, this.f136320c, mVar, this.f136321d);
                break;
            default:
                wg2.j.a(p0.t(1), this.f136319b, this.f136320c, mVar, this.f136321d);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(u4.d dVar, String str, String str2, int i14) {
        this.f136321d = dVar;
        this.f136319b = str;
        this.f136320c = str2;
    }
}
