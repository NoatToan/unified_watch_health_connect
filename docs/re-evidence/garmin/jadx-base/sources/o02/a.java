package o02;

import f4.s;
import java.util.List;
import p005kotlin.jvm.internal.i;
import p13.u;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f128492b;

    public /* synthetic */ a(Object[] objArr, int i14) {
        this.f128491a = i14;
        this.f128492b = objArr;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f128491a) {
            case 0:
                List listI0 = u.i0(this.f128492b);
                s sVar = new s();
                sVar.addAll(listI0);
                return sVar;
            default:
                return i.b(this.f128492b);
        }
    }
}
