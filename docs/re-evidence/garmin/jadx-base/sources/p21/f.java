package p21;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import t21.m0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135011a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f135012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f135013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f135014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f135015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f135016f;

    public /* synthetic */ f(String str, String str2, e23.a aVar, boolean z14, String str3, int i14) {
        this.f135012b = str;
        this.f135013c = str2;
        this.f135014d = aVar;
        this.f135015e = z14;
        this.f135016f = str3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135011a) {
            case 0:
                ((Integer) obj2).getClass();
                g.c(p0.t(1), this.f135014d, this.f135012b, this.f135013c, this.f135016f, (m) obj, this.f135015e);
                break;
            default:
                ((Integer) obj2).getClass();
                m0.e(p0.t(1), this.f135014d, this.f135012b, this.f135013c, this.f135016f, (m) obj, this.f135015e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(String str, String str2, boolean z14, String str3, e23.a aVar, int i14) {
        this.f135012b = str;
        this.f135013c = str2;
        this.f135015e = z14;
        this.f135016f = str3;
        this.f135014d = aVar;
    }
}
