package dj0;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59902a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f59903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f59904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f59905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f59906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f59907f;

    public /* synthetic */ c(int i14, int i15, String str, String str2, String str3, String str4) {
        this.f59903b = str;
        this.f59904c = str2;
        this.f59905d = str3;
        this.f59906e = str4;
        this.f59907f = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f59902a) {
            case 0:
                ((Integer) obj2).getClass();
                d.a(this.f59903b, this.f59904c, this.f59905d, this.f59906e, (p3.m) obj, p0.t(this.f59907f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                xn0.h.a(this.f59903b, this.f59904c, this.f59905d, this.f59906e, (p3.m) obj, iT, this.f59907f);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(int i14, String str, String str2, String str3, String str4) {
        this.f59903b = str;
        this.f59904c = str2;
        this.f59905d = str3;
        this.f59906e = str4;
        this.f59907f = i14;
    }
}
