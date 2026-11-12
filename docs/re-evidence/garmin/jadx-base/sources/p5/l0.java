package p5;

import java.util.Comparator;
import y8.w0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f136043b;

    public /* synthetic */ l0(e23.p pVar, int i14) {
        this.f136042a = i14;
        this.f136043b = pVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i14 = this.f136042a;
        e23.p pVar = this.f136043b;
        switch (i14) {
            case 0:
                break;
            case 1:
                Object obj3 = y8.v.f194991m;
                break;
            case 2:
                Object obj4 = y8.v.f194991m;
                break;
            default:
                Object obj5 = w0.f195029i;
                break;
        }
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }
}
