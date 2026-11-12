package h81;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import xe1.j;
import yr.c0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f82415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f82416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f82417d;

    public /* synthetic */ d(int i14, String str, String str2, long j8) {
        this.f82414a = 0;
        this.f82417d = j8;
        this.f82415b = str;
        this.f82416c = str2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f82414a) {
            case 0:
                ((Integer) obj2).getClass();
                e.b(p0.t(1), this.f82417d, this.f82415b, this.f82416c, (m) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                j.b(p0.t(1), this.f82417d, this.f82415b, this.f82416c, (m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                c0.f(p0.t(1), this.f82417d, this.f82415b, this.f82416c, (m) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(int i14, int i15, long j8, String str, String str2) {
        this.f82414a = i15;
        this.f82415b = str;
        this.f82416c = str2;
        this.f82417d = j8;
    }
}
