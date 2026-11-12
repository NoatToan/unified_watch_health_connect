package ao1;

import android.content.Context;
import b21.v4;
import java.util.LinkedHashSet;
import li0.d0;
import li0.n;
import li0.q;
import li0.r;
import p005kotlin.Unit;
import p3.p1;
import z10.d1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ li0.f f11546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f11547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f11548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f11549e;

    public /* synthetic */ c(li0.f fVar, Context context, d0 d0Var, p1 p1Var, int i14) {
        this.f11545a = i14;
        this.f11546b = fVar;
        this.f11547c = context;
        this.f11548d = d0Var;
        this.f11549e = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        String str;
        switch (this.f11545a) {
            case 0:
                this.f11546b.g(this.f11547c, this.f11548d);
                return Unit.INSTANCE;
            case 1:
                this.f11546b.k(this.f11547c, this.f11548d, new ky0.k(this.f11549e, 16));
                return Unit.INSTANCE;
            case 2:
                this.f11546b.k(this.f11547c, this.f11548d, new ky0.k(this.f11549e, 20));
                return Unit.INSTANCE;
            case 3:
                li0.f fVar = this.f11546b;
                Context context = this.f11547c;
                d0 d0Var = this.f11548d;
                ky0.k kVar = new ky0.k(this.f11549e, 18);
                li0.f.a aVar = li0.f.f112657g;
                fVar.getClass();
                context.getClass();
                d1.b(context, new r(new v4(new li0.f.b(), fVar, kVar, d0Var, context, 17)));
                return Unit.INSTANCE;
            case 4:
                li0.f fVar2 = this.f11546b;
                Context context2 = this.f11547c;
                d0 d0Var2 = this.f11548d;
                ky0.k kVar2 = new ky0.k(this.f11549e, 21);
                fVar2.getClass();
                context2.getClass();
                if (d0Var2 != null && (str = d0Var2.f112650c) != null) {
                    LinkedHashSet linkedHashSet = li0.f.f112659i;
                    synchronized (linkedHashSet) {
                        linkedHashSet.remove(str);
                    }
                }
                fVar2.i(kVar2, new n(fVar2, d0Var2, context2, null));
                return Unit.INSTANCE;
            case 5:
                this.f11546b.m(this.f11547c, this.f11548d, new ky0.k(this.f11549e, 17));
                return Unit.INSTANCE;
            default:
                li0.f fVar3 = this.f11546b;
                Context context3 = this.f11547c;
                d0 d0Var3 = this.f11548d;
                ky0.k kVar3 = new ky0.k(this.f11549e, 19);
                fVar3.getClass();
                context3.getClass();
                fVar3.i(kVar3, new q(fVar3, d0Var3, context3, null));
                return Unit.INSTANCE;
        }
    }
}
