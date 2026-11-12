package vb1;

import e23.l;
import o4.z0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f176867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f176868c;

    public /* synthetic */ c(boolean z14, z0 z0Var, int i14) {
        this.f176866a = i14;
        this.f176867b = z14;
        this.f176868c = z0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f176866a) {
            case 0:
                q4.c cVar = (q4.c) obj;
                cVar.getClass();
                cVar.m1();
                if (this.f176867b) {
                    q4.f.C0(cVar, this.f176868c, 0L, 0L, 0.0f, null, 0, 126);
                }
                break;
            default:
                q4.c cVar2 = (q4.c) obj;
                cVar2.getClass();
                cVar2.m1();
                if (this.f176867b) {
                    q4.f.C0(cVar2, this.f176868c, 0L, 0L, 0.0f, null, 0, 126);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
