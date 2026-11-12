package mw1;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f121297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f121298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f121299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f121300e;

    public /* synthetic */ d(r rVar, String str, e23.a aVar, int i14, int i15) {
        this.f121296a = i15;
        this.f121297b = rVar;
        this.f121298c = str;
        this.f121299d = aVar;
        this.f121300e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f121296a;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                e.a(this.f121297b, this.f121298c, this.f121299d, mVar, p0.t(this.f121300e | 1));
                break;
            default:
                yv0.b.a(this.f121297b, this.f121298c, this.f121299d, mVar, p0.t(this.f121300e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
