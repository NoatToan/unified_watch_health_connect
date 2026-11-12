package u1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.k3;
import p008y1.o3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class e0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f167454a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly1/c2;", "Ln4/c;", MapboxMap.QFE_OFFSET, "", "<anonymous>", "(Ly1/c2;Ln4/c;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3", f = "Clickable.kt", l = {1047}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.q<p008y1.c2, n4.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ p008y1.c2 f167456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ long f167457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c0 f167458d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f167458d = c0Var;
        }

        @Override // e23.q
        public final Object invoke(p008y1.c2 c2Var, n4.c cVar, t13.d<? super Unit> dVar) {
            long j8 = cVar.f123544a;
            a aVar = new a(this.f167458d, dVar);
            aVar.f167456b = c2Var;
            aVar.f167457c = j8;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objE;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167455a;
            if (i14 == 0) {
                o13.r.b(obj);
                p008y1.c2 c2Var = this.f167456b;
                long j8 = this.f167457c;
                c0 c0Var = this.f167458d;
                if (c0Var.f167353h) {
                    this.f167455a = 1;
                    a2.j jVar = c0Var.f167348c;
                    if (jVar == null || (objE = o53.c0.e(new e(c2Var, j8, jVar, c0Var, null), this)) != obj2) {
                        objE = Unit.INSTANCE;
                    }
                    if (objE == obj2) {
                        return obj2;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public e0(c0 c0Var) {
        this.f167454a = c0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
        e23.l lVar;
        e23.l lVar2;
        final c0 c0Var = this.f167454a;
        boolean z14 = c0Var.f167353h;
        if (!z14 || c0Var.C == null) {
            lVar = null;
        } else {
            final int i14 = 0;
            lVar = new e23.l() { // from class: u1.d0
                @Override // e23.l
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            e23.a<Unit> aVar = c0Var.C;
                            if (aVar != null) {
                                aVar.invoke();
                            }
                            break;
                        case 1:
                            c0 c0Var2 = c0Var;
                            e23.a<Unit> aVar2 = c0Var2.B;
                            if (aVar2 != null) {
                                aVar2.invoke();
                            }
                            if (c0Var2.D) {
                                w4.a aVar3 = (w4.a) h5.i.a(c0Var2, kotlin.t1.f91494l);
                                w4.b.f181904b.getClass();
                                w4.b.a.a();
                                aVar3.a(0);
                            }
                            break;
                        default:
                            c0 c0Var3 = c0Var;
                            if (c0Var3.f167353h) {
                                c0Var3.f167354i.invoke();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
        if (!z14 || c0Var.B == null) {
            lVar2 = null;
        } else {
            final int i15 = 1;
            lVar2 = new e23.l() { // from class: u1.d0
                @Override // e23.l
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            e23.a<Unit> aVar = c0Var.C;
                            if (aVar != null) {
                                aVar.invoke();
                            }
                            break;
                        case 1:
                            c0 c0Var2 = c0Var;
                            e23.a<Unit> aVar2 = c0Var2.B;
                            if (aVar2 != null) {
                                aVar2.invoke();
                            }
                            if (c0Var2.D) {
                                w4.a aVar3 = (w4.a) h5.i.a(c0Var2, kotlin.t1.f91494l);
                                w4.b.f181904b.getClass();
                                w4.b.a.a();
                                aVar3.a(0);
                            }
                            break;
                        default:
                            c0 c0Var3 = c0Var;
                            if (c0Var3.f167353h) {
                                c0Var3.f167354i.invoke();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
        a aVar = new a(c0Var, null);
        final int i16 = 2;
        e23.l lVar3 = new e23.l() { // from class: u1.d0
            @Override // e23.l
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        e23.a<Unit> aVar2 = c0Var.C;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        break;
                    case 1:
                        c0 c0Var2 = c0Var;
                        e23.a<Unit> aVar3 = c0Var2.B;
                        if (aVar3 != null) {
                            aVar3.invoke();
                        }
                        if (c0Var2.D) {
                            w4.a aVar4 = (w4.a) h5.i.a(c0Var2, kotlin.t1.f91494l);
                            w4.b.f181904b.getClass();
                            w4.b.a.a();
                            aVar4.a(0);
                        }
                        break;
                    default:
                        c0 c0Var3 = c0Var;
                        if (c0Var3.f167353h) {
                            c0Var3.f167354i.invoke();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        k3.a aVar2 = k3.f193358a;
        Object objE = o53.c0.e(new o3(h0Var, aVar, lVar2, lVar, lVar3, null), dVar);
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        if (objE != aVar3) {
            objE = Unit.INSTANCE;
        }
        return objE == aVar3 ? objE : Unit.INSTANCE;
    }
}
