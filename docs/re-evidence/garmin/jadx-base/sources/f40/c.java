package f40;

import e23.l;
import e23.p;
import in1.i;
import j21.k;
import p005kotlin.Unit;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f68850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f68851d;

    public /* synthetic */ c(int i14, String str, l lVar, int i15) {
        this.f68848a = 1;
        this.f68849b = i14;
        this.f68850c = str;
        this.f68851d = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (this.f68848a) {
            case 0:
                num.getClass();
                e.a(this.f68850c, this.f68851d, mVar, this.f68849b, p0.t(1));
                break;
            case 1:
                num.getClass();
                in1.e.a(this.f68850c, this.f68851d, mVar, this.f68849b, p0.t(1));
                break;
            case 2:
                num.intValue();
                i.a(this.f68850c, this.f68851d, mVar, p0.t(this.f68849b | 1));
                break;
            case 3:
                num.getClass();
                k.a(this.f68850c, this.f68851d, mVar, p0.t(this.f68849b | 1));
                break;
            default:
                num.intValue();
                lm0.e.b(this.f68850c, this.f68851d, mVar, p0.t(this.f68849b | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(String str, l lVar, int i14, int i15) {
        this.f68848a = 0;
        this.f68850c = str;
        this.f68851d = lVar;
        this.f68849b = i14;
    }

    public /* synthetic */ c(String str, l lVar, int i14, int i15, byte b14) {
        this.f68848a = i15;
        this.f68850c = str;
        this.f68851d = lVar;
        this.f68849b = i14;
    }
}
