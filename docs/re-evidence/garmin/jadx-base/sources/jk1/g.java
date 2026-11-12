package jk1;

import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import hk1.z;
import java.util.List;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f99410b;

    public /* synthetic */ g(f fVar, int i14) {
        this.f99409a = i14;
        this.f99410b = fVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        switch (this.f99409a) {
            case 0:
                String str = (String) obj;
                p2 p2Var = this.f99410b.f99406j;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, e.a((e) value, false, null, null, str, 126)));
                break;
            case 1:
                v2.a aVar = (v2.a) obj;
                p2 p2Var2 = this.f99410b.f99406j;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, z.a(aVar)));
                break;
            default:
                this.f99410b.f99404h = (List) obj;
                break;
        }
        return Unit.INSTANCE;
    }
}
