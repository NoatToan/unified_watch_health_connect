package m32;

import e23.l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements rk1.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f116418b;

    public /* synthetic */ a(l lVar, int i14) {
        this.f116417a = i14;
        this.f116418b = lVar;
    }

    @Override // rk1.b.c
    public final void a(ArrayList arrayList) {
        switch (this.f116417a) {
            case 0:
                if (arrayList.size() == 4) {
                    this.f116418b.invoke(Double.valueOf(c.a(arrayList)));
                }
                break;
            default:
                Object obj = arrayList.get(0);
                obj.getClass();
                this.f116418b.invoke(Integer.valueOf(Integer.parseInt((String) obj)));
                break;
        }
    }
}
