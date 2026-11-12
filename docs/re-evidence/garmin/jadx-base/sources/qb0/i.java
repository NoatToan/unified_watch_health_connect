package qb0;

import java.util.List;
import p005kotlin.Unit;
import p3.p0;
import yt.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f143998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f143999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f144000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f144001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f144002f;

    public /* synthetic */ i(h4.r rVar, String str, String str2, float f14, e23.l lVar, int i14) {
        this.f143997a = 1;
        this.f144001e = rVar;
        this.f143998b = str;
        this.f144002f = str2;
        this.f143999c = f14;
        this.f144000d = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f143997a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(3073);
                k.b((String) this.f143998b, (o90.a) this.f144001e, this.f143999c, (e23.a) this.f144002f, this.f144000d, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                t21.m.b((h4.r) this.f144001e, (String) this.f143998b, (String) this.f144002f, this.f143999c, this.f144000d, (p3.m) obj, iT2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(1);
                f0.a((h4.r) this.f143998b, (g6.f) this.f144001e, this.f143999c, (List) this.f144002f, this.f144000d, (p3.m) obj, iT3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(Object obj, Object obj2, float f14, Object obj3, e23.l lVar, int i14, int i15) {
        this.f143997a = i15;
        this.f143998b = obj;
        this.f144001e = obj2;
        this.f143999c = f14;
        this.f144002f = obj3;
        this.f144000d = lVar;
    }
}
