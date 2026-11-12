package com.google.maps.android.compose;

import a42.r;
import com.google.android.gms.maps.GoogleMap;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\u001aC\u0010\b\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001aM\u0010\b\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00002(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002H\u0007¢\u0006\u0004\b\b\u0010\u000b\u001aW\u0010\b\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00002(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002H\u0007¢\u0006\u0004\b\b\u0010\r\u001aQ\u0010\b\u001a\u00020\u00062\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u000e\"\u0004\u0018\u00010\u00002(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"", "key1", "Lkotlin/Function3;", "Lo53/b0;", "Lcom/google/android/gms/maps/GoogleMap;", "Lt13/d;", "", "block", "MapEffect", "(Ljava/lang/Object;Le23/q;Lp3/m;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Le23/q;Lp3/m;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Le23/q;Lp3/m;I)V", "", UserMetadata.KEYDATA_FILENAME, "([Ljava/lang/Object;Le23/q;Lp3/m;I)V", "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MapEffectKt {
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    @GoogleMapComposable
    @MapsComposeExperimentalApi
    public static final void MapEffect(Object obj, Object obj2, Object obj3, e23.q<? super o53.b0, ? super GoogleMap, ? super t13.d<? super Unit>, ? extends Object> qVar, p3.m mVar, int i14) {
        int i15;
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(-88380218);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(obj) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(obj2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(obj3) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(qVar) ? 2048 : 1024;
        }
        if ((i15 & 1171) == 1170 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            p3.c<?> cVar = o0VarE.f135177b;
            cVar.getClass();
            GoogleMap map = ((MapApplier) cVar).getMap();
            o0VarE.C(-588014083);
            boolean zR = o0VarE.r(qVar) | o0VarE.r(map);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new MapEffectKt$MapEffect$5$1(qVar, map, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new MapEffectKt$MapEffect$5$1(qVar, map, null);
                    o0VarE.K(objQ);
                }
            }
            o0VarE.g0(false);
            p3.l0.g(obj, obj2, obj3, (e23.p) objQ, o0VarE);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(obj, obj2, obj3, qVar, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapEffect$lambda$1(Object obj, e23.q qVar, int i14, p3.m mVar, int i15) {
        MapEffect(obj, (e23.q<? super o53.b0, ? super GoogleMap, ? super t13.d<? super Unit>, ? extends Object>) qVar, mVar, p3.p0.t(i14 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapEffect$lambda$3(Object obj, Object obj2, e23.q qVar, int i14, p3.m mVar, int i15) {
        MapEffect(obj, obj2, qVar, mVar, p3.p0.t(i14 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapEffect$lambda$5(Object obj, Object obj2, Object obj3, e23.q qVar, int i14, p3.m mVar, int i15) {
        MapEffect(obj, obj2, obj3, qVar, mVar, p3.p0.t(i14 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapEffect$lambda$7(Object[] objArr, e23.q qVar, int i14, p3.m mVar, int i15) {
        MapEffect(Arrays.copyOf(objArr, objArr.length), (e23.q<? super o53.b0, ? super GoogleMap, ? super t13.d<? super Unit>, ? extends Object>) qVar, mVar, p3.p0.t(i14 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    @GoogleMapComposable
    @MapsComposeExperimentalApi
    public static final void MapEffect(Object obj, Object obj2, e23.q<? super o53.b0, ? super GoogleMap, ? super t13.d<? super Unit>, ? extends Object> qVar, p3.m mVar, int i14) {
        int i15;
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(-834763738);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(obj) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(obj2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(qVar) ? 256 : 128;
        }
        if ((i15 & 147) == 146 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            p3.c<?> cVar = o0VarE.f135177b;
            cVar.getClass();
            GoogleMap map = ((MapApplier) cVar).getMap();
            o0VarE.C(-588044611);
            boolean zR = o0VarE.r(qVar) | o0VarE.r(map);
            Object objQ = o0VarE.q();
            if (!zR) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new MapEffectKt$MapEffect$3$1(qVar, map, null);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new MapEffectKt$MapEffect$3$1(qVar, map, null);
                o0VarE.K(objQ);
            }
            o0VarE.g0(false);
            p3.l0.f(obj, obj2, (e23.p) objQ, o0VarE);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(obj, obj2, qVar, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    @GoogleMapComposable
    @MapsComposeExperimentalApi
    public static final void MapEffect(Object obj, e23.q<? super o53.b0, ? super GoogleMap, ? super t13.d<? super Unit>, ? extends Object> qVar, p3.m mVar, int i14) {
        int i15;
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(-357282938);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(obj) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(qVar) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            p3.c<?> cVar = o0VarE.f135177b;
            cVar.getClass();
            GoogleMap map = ((MapApplier) cVar).getMap();
            o0VarE.C(-588073475);
            boolean zR = o0VarE.r(qVar) | o0VarE.r(map);
            Object objQ = o0VarE.q();
            if (!zR) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new MapEffectKt$MapEffect$1$1(qVar, map, null);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new MapEffectKt$MapEffect$1$1(qVar, map, null);
                o0VarE.K(objQ);
            }
            o0VarE.g0(false);
            p3.l0.e((e23.p) objQ, obj, o0VarE);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(obj, qVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    @GoogleMapComposable
    @MapsComposeExperimentalApi
    public static final void MapEffect(Object[] objArr, e23.q<? super o53.b0, ? super GoogleMap, ? super t13.d<? super Unit>, ? extends Object> qVar, p3.m mVar, int i14) {
        objArr.getClass();
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(-276920653);
        int i15 = (i14 & 48) == 0 ? (o0VarE.r(qVar) ? 32 : 16) | i14 : i14;
        o0VarE.N(-587991468, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i15 |= o0VarE.r(obj) ? 4 : 0;
        }
        o0VarE.g0(false);
        if ((i15 & 14) == 0) {
            i15 |= 2;
        }
        if ((i15 & 19) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = p3.n.f135158a;
            p3.c<?> cVar = o0VarE.f135177b;
            cVar.getClass();
            GoogleMap map = ((MapApplier) cVar).getMap();
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            o0VarE.C(-587986115);
            boolean zR = o0VarE.r(qVar) | o0VarE.r(map);
            Object objQ = o0VarE.q();
            if (!zR) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new MapEffectKt$MapEffect$7$1(qVar, map, null);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new MapEffectKt$MapEffect$7$1(qVar, map, null);
                o0VarE.K(objQ);
            }
            o0VarE.g0(false);
            p3.l0.h(objArrCopyOf, (e23.p) objQ, o0VarE);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r(objArr, qVar, i14, 15);
        }
    }
}
