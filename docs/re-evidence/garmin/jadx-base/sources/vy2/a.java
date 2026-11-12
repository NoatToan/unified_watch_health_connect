package vy2;

import com.google.common.util.concurrent.JdkFutureAdapters;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import o53.c0;
import o53.s0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xy2.d f180840b;

    public /* synthetic */ a(xy2.d dVar, int i14) {
        this.f180839a = i14;
        this.f180840b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f180839a;
        final int i15 = 3;
        final xy2.d dVar = this.f180840b;
        switch (i14) {
            case 0:
                return (uy2.c) dVar.a();
            case 1:
                x53.c cVar = s0.f129406a;
                return ge1.b.j(c0.a(x53.b.f189152a), null, null, new c(dVar, null), 3);
            case 2:
                final int i16 = 0;
                FutureTask futureTask = new FutureTask(new Callable() { // from class: vy2.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i16) {
                            case 0:
                                return ((uy2.c) dVar.a()).a();
                            case 1:
                                return ((uy2.c) dVar.a()).a();
                            case 2:
                                return ((uy2.c) dVar.a()).a();
                            default:
                                Object objA = ((uy2.c) dVar.a()).a();
                                if (objA instanceof q03.i) {
                                    return (q03.i) objA;
                                }
                                w03.b.a(objA, "item is null");
                                return new b13.h(objA);
                        }
                    }
                });
                new Thread(futureTask).start();
                return JdkFutureAdapters.listenInPoolThread(futureTask);
            case 3:
                final int i17 = 2;
                Callable callable = new Callable() { // from class: vy2.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i17) {
                            case 0:
                                return ((uy2.c) dVar.a()).a();
                            case 1:
                                return ((uy2.c) dVar.a()).a();
                            case 2:
                                return ((uy2.c) dVar.a()).a();
                            default:
                                Object objA = ((uy2.c) dVar.a()).a();
                                if (objA instanceof q03.i) {
                                    return (q03.i) objA;
                                }
                                w03.b.a(objA, "item is null");
                                return new b13.h(objA);
                        }
                    }
                };
                int i18 = w03.b.f181178a;
                return new e13.m(callable).j(l13.a.f108327b);
            case 4:
                final int i19 = 1;
                Callable callable2 = new Callable() { // from class: vy2.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i19) {
                            case 0:
                                return ((uy2.c) dVar.a()).a();
                            case 1:
                                return ((uy2.c) dVar.a()).a();
                            case 2:
                                return ((uy2.c) dVar.a()).a();
                            default:
                                Object objA = ((uy2.c) dVar.a()).a();
                                if (objA instanceof q03.i) {
                                    return (q03.i) objA;
                                }
                                w03.b.a(objA, "item is null");
                                return new b13.h(objA);
                        }
                    }
                };
                int i24 = w03.b.f181178a;
                return new z03.i(callable2).k(l13.a.f108327b);
            case 5:
                Callable callable3 = new Callable() { // from class: vy2.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i15) {
                            case 0:
                                return ((uy2.c) dVar.a()).a();
                            case 1:
                                return ((uy2.c) dVar.a()).a();
                            case 2:
                                return ((uy2.c) dVar.a()).a();
                            default:
                                Object objA = ((uy2.c) dVar.a()).a();
                                if (objA instanceof q03.i) {
                                    return (q03.i) objA;
                                }
                                w03.b.a(objA, "item is null");
                                return new b13.h(objA);
                        }
                    }
                };
                int i25 = w03.b.f181178a;
                b13.c cVar2 = new b13.c(callable3);
                q03.q qVar = l13.a.f108327b;
                w03.b.a(qVar, "scheduler is null");
                return new b13.j(cVar2, qVar);
            default:
                dVar.a();
                return Unit.INSTANCE;
        }
    }
}
