package vd0;

import android.net.Uri;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oe0.s f177198b;

    public /* synthetic */ d1(oe0.s sVar, int i14) {
        this.f177197a = i14;
        this.f177198b = sVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        switch (this.f177197a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                oe0.s sVar = this.f177198b;
                sVar.getClass();
                p2 p2Var = sVar.f131412h;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, pe0.j.a((pe0.j) value, str, null, null, null, null, 0.0d, null, null, false, null, null, 2046)));
                break;
            default:
                Uri uri = (Uri) obj;
                uri.getClass();
                p2 p2Var2 = this.f177198b.f131412h;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, pe0.j.a((pe0.j) value2, null, null, null, null, null, 0.0d, null, null, false, null, uri, 1023)));
                break;
        }
        return Unit.INSTANCE;
    }
}
