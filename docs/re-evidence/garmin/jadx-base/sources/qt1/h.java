package qt1;

import android.location.Location;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.GarminTrailsViewModel$updateUserLocation$2", f = "GarminTrailsViewModel.kt", l = {157, 165}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kt1.a f147643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f147644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f147645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f147646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, e23.a<Unit> aVar2, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f147645c = aVar;
        this.f147646d = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f147645c, this.f147646d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab A[DONT_INVERT, PHI: r2 r5
      0x00ab: PHI (r2v12 kt1.a) = (r2v6 kt1.a), (r2v13 kt1.a) binds: [B:24:0x0097, B:29:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r5v2 android.location.Location) = (r5v0 android.location.Location), (r5v4 android.location.Location) binds: [B:24:0x0097, B:29:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x0123 A[LOOP:0: B:34:0x00c3->B:41:0x0123, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x010c A[EDGE_INSN: B:42:0x010c->B:36:0x010c BREAK  A[LOOP:0: B:34:0x00c3->B:41:0x0123], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (r4 == r1) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kt1.a aVar;
        Object value;
        pt1.c cVar;
        Location location;
        Object objD;
        Object objC;
        kt1.a aVar2;
        ke2.b bVar;
        kt1.a aVar3;
        p2 p2Var;
        Object value2;
        pt1.c cVar2;
        ke2.b bVar2;
        p2 p2Var2;
        Object value3;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147644b;
        Location location2 = null;
        a aVar5 = this.f147645c;
        if (i14 != 0) {
            if (i14 == 1) {
                aVar = this.f147643a;
                o13.r.b(obj);
                objD = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = this.f147643a;
                o13.r.b(obj);
                objC = obj;
            }
            location2 = (Location) objC;
            aVar = aVar2;
            if (location2 != null) {
                bVar = new ke2.b(location2.getLatitude(), location2.getLongitude(), null, 4, null);
            } else {
                bVar = us1.a.f172360a;
            }
            aVar3 = aVar;
            p2Var = aVar5.f147503p;
            while (true) {
                value2 = p2Var.getValue();
                cVar2 = (pt1.c) value2;
                bVar2 = bVar;
                if (p2Var.b(value2, pt1.c.a(cVar2, false, false, false, pt1.d.a(cVar2.f140819d, bVar2, bVar, null, 0.0f, null, 0, null, null, false, false, null, false, 0.0f, 16380), pt1.a.a(cVar2.f140820e, aVar3, 0, null, null, null, 30), null, false, false, 487))) {
                    break;
                }
                bVar = bVar2;
            }
            p2Var2 = aVar5.E;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, bVar2));
            this.f147646d.invoke();
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        p2 p2Var3 = aVar5.f147503p;
        mv0.e eVar = aVar5.f147491d;
        aVar = ((pt1.c) p2Var3.getValue()).f140820e.f140798a;
        p2 p2Var4 = aVar5.f147503p;
        do {
            value = p2Var4.getValue();
            cVar = (pt1.c) value;
        } while (!p2Var4.b(value, pt1.c.a(cVar, false, false, false, null, pt1.a.a(cVar.f140820e, kt1.a.LOADING, 0, null, null, null, 30), null, false, false, 495)));
        if (!eVar.b("GarminTrailsVM")) {
            location = null;
            if (location != null) {
                bVar = new ke2.b(location.getLatitude(), location.getLongitude(), null, 4, null);
            } else if (aVar5.f147491d.b("GarminTrailsVM")) {
                mv0.e eVar2 = aVar5.f147491d;
                this.f147643a = aVar;
                this.f147644b = 2;
                objC = eVar2.c("GarminTrailsVM", this);
                if (objC != aVar4) {
                    aVar2 = aVar;
                    location2 = (Location) objC;
                    aVar = aVar2;
                    if (location2 != null) {
                        bVar = new ke2.b(location2.getLatitude(), location2.getLongitude(), null, 4, null);
                    } else {
                        bVar = us1.a.f172360a;
                    }
                }
            } else if (location2 != null) {
                bVar = new ke2.b(location2.getLatitude(), location2.getLongitude(), null, 4, null);
            } else {
                bVar = us1.a.f172360a;
            }
            aVar3 = aVar;
            p2Var = aVar5.f147503p;
            while (true) {
                value2 = p2Var.getValue();
                cVar2 = (pt1.c) value2;
                bVar2 = bVar;
                if (p2Var.b(value2, pt1.c.a(cVar2, false, false, false, pt1.d.a(cVar2.f140819d, bVar2, bVar, null, 0.0f, null, 0, null, null, false, false, null, false, 0.0f, 16380), pt1.a.a(cVar2.f140820e, aVar3, 0, null, null, null, 30), null, false, false, 487))) {
                    break;
                    break;
                }
                bVar = bVar2;
            }
            p2Var2 = aVar5.E;
            do {
                value3 = p2Var2.getValue();
            } while (!p2Var2.b(value3, bVar2));
            this.f147646d.invoke();
            return Unit.INSTANCE;
        }
        this.f147643a = aVar;
        this.f147644b = 1;
        objD = eVar.d("GarminTrailsVM", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
        return aVar4;
        location = (Location) objD;
        if (location != null) {
            bVar = new ke2.b(location.getLatitude(), location.getLongitude(), null, 4, null);
        } else {
            if (aVar5.f147491d.b("GarminTrailsVM")) {
                mv0.e eVar3 = aVar5.f147491d;
                this.f147643a = aVar;
                this.f147644b = 2;
                objC = eVar3.c("GarminTrailsVM", this);
                if (objC != aVar4) {
                    aVar2 = aVar;
                    location2 = (Location) objC;
                    aVar = aVar2;
                    if (location2 != null) {
                        bVar = new ke2.b(location2.getLatitude(), location2.getLongitude(), null, 4, null);
                    } else {
                        bVar = us1.a.f172360a;
                    }
                }
                return aVar4;
            }
            if (location2 != null) {
                bVar = new ke2.b(location2.getLatitude(), location2.getLongitude(), null, 4, null);
            } else {
                bVar = us1.a.f172360a;
            }
        }
        aVar3 = aVar;
        p2Var = aVar5.f147503p;
        while (true) {
            value2 = p2Var.getValue();
            cVar2 = (pt1.c) value2;
            bVar2 = bVar;
            if (p2Var.b(value2, pt1.c.a(cVar2, false, false, false, pt1.d.a(cVar2.f140819d, bVar2, bVar, null, 0.0f, null, 0, null, null, false, false, null, false, 0.0f, 16380), pt1.a.a(cVar2.f140820e, aVar3, 0, null, null, null, 30), null, false, false, 487))) {
                break;
                break;
            }
            bVar = bVar2;
        }
        p2Var2 = aVar5.E;
        do {
            value3 = p2Var2.getValue();
        } while (!p2Var2.b(value3, bVar2));
        this.f147646d.invoke();
        return Unit.INSTANCE;
    }
}
