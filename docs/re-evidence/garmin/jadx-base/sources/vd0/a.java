package vd0;

import android.net.Uri;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oe0.d f177147b;

    public /* synthetic */ a(oe0.d dVar, int i14) {
        this.f177146a = i14;
        this.f177147b = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        switch (this.f177146a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                oe0.d dVar = this.f177147b;
                dVar.getClass();
                p2 p2Var = dVar.f131261f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, pe0.c.a((pe0.c) value, str, null, null, null, null, 0.0d, null, null, false, null, 1022)));
                break;
            default:
                Uri uri = (Uri) obj;
                uri.getClass();
                p2 p2Var2 = this.f177147b.f131261f;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, pe0.c.a((pe0.c) value2, null, null, null, null, null, 0.0d, null, null, false, uri, 511)));
                break;
        }
        return Unit.INSTANCE;
    }
}
