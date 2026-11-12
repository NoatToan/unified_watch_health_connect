package fv0;

import c80.q;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import g22.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import pu0.j;
import su0.t;
import wd2.d2;
import wd2.f2;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lpu0/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.sessiondetails.SessionDetailsViewModel$getDeferredSessionRecipients$1", f = "SessionDetailsViewModel.kt", l = {137, TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super List<pu0.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f73664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f73665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ou0.e f73666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ou0.e eVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f73666c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f73666c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<pu0.b>> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0072 A[SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        boolean z14;
        List<pu0.b> list;
        Map<f2, List<d2>> map;
        ArrayList arrayList;
        pu0.h hVar;
        pu0.h.a aVar;
        qu0.c cVarE;
        qu0.b bVar;
        List<d2> list2;
        Iterator<T> it;
        String str;
        pu0.b bVar2;
        Iterator it3;
        Object next;
        pu0.b bVar3;
        boolean z15;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f73665b;
        ou0.e eVar = this.f73666c;
        if (i14 == 0) {
            r.b(obj);
            ou0.f fVar = eVar.f133979b;
            if (fVar != null ? s.g(fVar.f133983a, Boolean.FALSE) : false) {
                return null;
            }
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            q qVar = q.LIVE_TRACK_PLUS;
            this.f73665b = 1;
            obj = j1Var.l(qVar, this);
            if (obj != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = this.f73664a;
            r.b(obj);
        }
        list = (List) obj;
        map = eVar.f133980c;
        if (map != null && (list2 = map.get(f2.c.f184465c)) != null) {
            it = list2.iterator();
            while (it.hasNext()) {
                str = ((d2) it.next()).f184432b;
                if (!n.d(str)) {
                    if (list != null) {
                        it3 = list.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            bVar3 = (pu0.b) next;
                            if (!og.a.B(bVar3).equals(str) || og.a.K(bVar3).equals(str)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        } while (!z15);
                        bVar2 = (pu0.b) next;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 != null) {
                        bVar2.f141187e = true;
                    }
                }
            }
        }
        arrayList = new ArrayList();
        if (list != null) {
            for (pu0.b bVar4 : list) {
                if (!n.d(og.a.B(bVar4))) {
                    cVarE = og.a.E(bVar4);
                    if (cVarE != null) {
                        bVar = cVarE.f147881b;
                    } else {
                        bVar = null;
                    }
                    if (bVar != qu0.b.f147875g) {
                        arrayList.add(bVar4);
                    }
                }
                if (!n.d(og.a.I(bVar4))) {
                    hVar = (pu0.h) h0.d0(bVar4.f141192j);
                    if (hVar != null) {
                        aVar = hVar.f141249m;
                    } else {
                        aVar = null;
                    }
                    if (aVar == pu0.h.a.AVAILABLE) {
                        arrayList.add(bVar4);
                    }
                }
                if (!z14 && n.d(og.a.K(bVar4))) {
                    qu0.c cVarF = og.a.F(bVar4);
                    qu0.b bVar5 = cVarF != null ? cVarF.f147881b : null;
                    pu0.i iVar = (pu0.i) h0.d0(bVar4.f141191i);
                    if (bVar5 != qu0.b.f147875g && (iVar != null ? iVar.f141267h : null) == j.f141278e) {
                        arrayList.add(bVar4);
                    }
                }
            }
        }
        return arrayList;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        t tVar = t.f161004a;
        this.f73664a = zBooleanValue;
        this.f73665b = 2;
        Serializable serializableF = tVar.f(false, this);
        if (serializableF != aVar2) {
            z14 = zBooleanValue;
            obj = serializableF;
            list = (List) obj;
            map = eVar.f133980c;
            if (map != null) {
                it = list2.iterator();
                while (it.hasNext()) {
                    str = ((d2) it.next()).f184432b;
                    if (!n.d(str)) {
                        if (list != null) {
                            it3 = list.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                bVar3 = (pu0.b) next;
                                if (og.a.B(bVar3).equals(str)) {
                                    z15 = true;
                                } else {
                                    z15 = true;
                                }
                            } while (!z15);
                            bVar2 = (pu0.b) next;
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 != null) {
                            bVar2.f141187e = true;
                        }
                    }
                }
            }
            arrayList = new ArrayList();
            if (list != null) {
                while (r11.hasNext()) {
                    if (!n.d(og.a.B(bVar4))) {
                        cVarE = og.a.E(bVar4);
                        if (cVarE != null) {
                            bVar = cVarE.f147881b;
                        } else {
                            bVar = null;
                        }
                        if (bVar != qu0.b.f147875g) {
                            arrayList.add(bVar4);
                        }
                    }
                    if (!n.d(og.a.I(bVar4))) {
                        hVar = (pu0.h) h0.d0(bVar4.f141192j);
                        if (hVar != null) {
                            aVar = hVar.f141249m;
                        } else {
                            aVar = null;
                        }
                        if (aVar == pu0.h.a.AVAILABLE) {
                            arrayList.add(bVar4);
                        }
                    }
                    if (!z14) {
                    }
                }
            }
            return arrayList;
        }
        return aVar2;
    }
}
