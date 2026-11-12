package ba1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p13.y;
import r53.z1;
import u53.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$savePersonalRecordsTypesVisibility$1", f = "PersonalRecordsViewModel.kt", l = {255, 262, 285}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m0 f17044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f17045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f17046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f17047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f17050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f17051h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$savePersonalRecordsTypesVisibility$1$1", f = "PersonalRecordsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f17052a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f17052a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f17052a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f17052a.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel$savePersonalRecordsTypesVisibility$1$4", f = "PersonalRecordsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f17053a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a<Unit> aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f17053a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f17053a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f17053a.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, e23.a<Unit> aVar, t13.d<? super k> dVar2) {
        super(2, dVar2);
        this.f17050g = dVar;
        this.f17051h = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f17050g, this.f17051h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x013d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (ge1.b.e0(r2, r4, r20) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r14 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0157, code lost:
    
        if (ge1.b.e0(r2, r4, r20) == r1) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [ba1.d, java.util.Iterator, java.util.List, kotlin.jvm.internal.m0, t13.d] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008d -> B:25:0x0091). Please report as a decompilation issue!!! */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m0 m0Var;
        List arrayList;
        Iterator it;
        int i14;
        d dVar;
        ?? r17;
        z1<List<n91.b>> z1Var;
        List<n91.b> value;
        ArrayList arrayList2;
        Iterator it3;
        Object next;
        n91.b bVar;
        Object objJ;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f17049f;
        e23.a<Unit> aVar2 = this.f17051h;
        int i16 = 2;
        d dVar2 = this.f17050g;
        Object obj2 = null;
        if (i15 == 0) {
            r.b(obj);
            ArrayList arrayListD4 = dVar2.D4();
            if (arrayListD4.isEmpty()) {
                x53.c cVar = s0.f129406a;
                t1 t1Var = o.f168762a;
                a aVar3 = new a(aVar2, null);
                this.f17049f = 1;
            } else {
                d.y4(dVar2, true);
                m0Var = new m0();
                arrayList = new ArrayList();
                it = arrayListD4.iterator();
                i14 = 0;
                dVar = dVar2;
                if (!it.hasNext()) {
                    r17 = obj2;
                    if (!arrayList.isEmpty()) {
                        z1Var = dVar2.f16988n;
                        do {
                            value = z1Var.getValue();
                            List<n91.b> list = value;
                            arrayList2 = new ArrayList(y.r(list, 10));
                            for (n91.b bVar2 : list) {
                                it3 = arrayList.iterator();
                                do {
                                    if (it3.hasNext()) {
                                        next = r17;
                                        break;
                                    }
                                    next = it3.next();
                                } while (((n91.b) next).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != bVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
                                bVar = (n91.b) next;
                                if (bVar == null) {
                                    bVar2 = bVar;
                                }
                                arrayList2.add(bVar2);
                            }
                        } while (!z1Var.b(value, arrayList2));
                        dVar2.L4();
                        dVar2.F4();
                    }
                    d.y4(dVar2, false);
                    if (m0Var.f105804a) {
                        dVar2.J4(true);
                    } else {
                        x53.c cVar2 = s0.f129406a;
                        t1 t1Var2 = o.f168762a;
                        b bVar3 = new b(aVar2, r17);
                        this.f17044a = r17;
                        this.f17045b = r17;
                        this.f17046c = r17;
                        this.f17047d = r17;
                        this.f17049f = 3;
                    }
                    return Unit.INSTANCE;
                }
                n91.b bVar4 = (n91.b) it.next();
                o91.a aVar4 = dVar.f16976b;
                this.f17044a = m0Var;
                this.f17045b = arrayList;
                this.f17046c = dVar;
                this.f17047d = it;
                this.f17048e = i14;
                this.f17049f = i16;
                objJ = aVar4.j(bVar4, this);
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                i14 = this.f17048e;
                it = this.f17047d;
                dVar = this.f17046c;
                arrayList = this.f17045b;
                m0Var = this.f17044a;
                r.b(obj);
                objJ = obj;
                v2 v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    arrayList.add(((v2.b) v2Var).f47386a);
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        Object obj3 = obj2;
                        u0.r();
                        return obj3;
                    }
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    String str = "Error while updating personal record type: " + ((v2.a) v2Var).f47383a;
                    aVar5.getClass();
                    i2.a.e(a2Var, str);
                    m0Var.f105804a = true;
                }
                obj2 = obj2;
                i16 = 2;
                if (!it.hasNext()) {
                    n91.b bVar5 = (n91.b) it.next();
                    o91.a aVar6 = dVar.f16976b;
                    this.f17044a = m0Var;
                    this.f17045b = arrayList;
                    this.f17046c = dVar;
                    this.f17047d = it;
                    this.f17048e = i14;
                    this.f17049f = i16;
                    objJ = aVar6.j(bVar5, this);
                } else {
                    r17 = obj2;
                    if (!arrayList.isEmpty()) {
                        z1Var = dVar2.f16988n;
                        do {
                            value = z1Var.getValue();
                            List<n91.b> list2 = value;
                            arrayList2 = new ArrayList(y.r(list2, 10));
                            while (r5.hasNext()) {
                                it3 = arrayList.iterator();
                                do {
                                    if (it3.hasNext()) {
                                        next = r17;
                                        break;
                                    }
                                    next = it3.next();
                                } while (((n91.b) next).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() != bVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String());
                                bVar = (n91.b) next;
                                if (bVar == null) {
                                    bVar2 = bVar;
                                }
                                arrayList2.add(bVar2);
                            }
                        } while (!z1Var.b(value, arrayList2));
                        dVar2.L4();
                        dVar2.F4();
                    }
                    d.y4(dVar2, false);
                    if (m0Var.f105804a) {
                        dVar2.J4(true);
                    } else {
                        x53.c cVar3 = s0.f129406a;
                        t1 t1Var3 = o.f168762a;
                        b bVar6 = new b(aVar2, r17);
                        this.f17044a = r17;
                        this.f17045b = r17;
                        this.f17046c = r17;
                        this.f17047d = r17;
                        this.f17049f = 3;
                    }
                }
                return aVar;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            return Unit.INSTANCE;
        }
        r.b(obj);
        return Unit.INSTANCE;
    }
}
