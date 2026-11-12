package ot1;

import java.util.Map;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.q f133821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.q f133822c;

    public /* synthetic */ s(int i14, c.q qVar, c.q qVar2) {
        this.f133820a = i14;
        this.f133821b = qVar;
        this.f133822c = qVar2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f133820a;
        c.q qVar = this.f133822c;
        c.q qVar2 = this.f133821b;
        Map map = (Map) obj;
        switch (i14) {
            case 0:
                u uVar = u.f133824a;
                map.getClass();
                if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                    u.f133824a.getClass();
                    u.f(10, qVar2, qVar);
                }
                break;
            default:
                y yVar = y.f133845a;
                map.getClass();
                if (p005kotlin.jvm.internal.s.g(map.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
                    y.f133845a.getClass();
                    y.e(10, qVar2, qVar);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
