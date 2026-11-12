package tz1;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f167299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rz1.h f167300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f167301d;

    public /* synthetic */ d(r rVar, rz1.h hVar, int i14, int i15) {
        this.f167298a = i15;
        this.f167299b = rVar;
        this.f167300c = hVar;
        this.f167301d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (this.f167298a) {
            case 0:
                num.getClass();
                e.b(this.f167299b, this.f167300c, mVar, p0.t(this.f167301d | 1));
                break;
            case 1:
                num.intValue();
                e.a(this.f167299b, this.f167300c, mVar, p0.t(this.f167301d | 1));
                break;
            default:
                num.getClass();
                g.b(this.f167299b, this.f167300c, mVar, p0.t(this.f167301d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
