package ic1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.o;
import ch.qos.logback.core.joran.action.Action;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lic1/m;", "Landroidx/lifecycle/u1;", "Ldc1/b;", "pulseOxService", "<init>", "(Ldc1/b;)V", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf0.i f92629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f92630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u82.a f92631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u82.a f92632d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Ldc1/a;", "<anonymous>", "(Lo82/a;)Ldc1/a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pulseox.presentation.PulseOxSummaryViewModel$detailsDataState$1", f = "PulseOxSummaryViewModel.kt", l = {47, 47}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<o82.a, t13.d<? super dc1.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f92633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ dc1.b f92635c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dc1.b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f92635c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f92635c, dVar);
            aVar.f92634b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super dc1.a> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o82.a aVar = (o82.a) this.f92634b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f92633a;
            if (i14 == 0) {
                r.b(obj);
                o oVar = aVar.f130843a;
                this.f92634b = null;
                this.f92633a = 1;
                obj = this.f92635c.b(oVar);
                if (obj != aVar2) {
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            this.f92634b = null;
            this.f92633a = 2;
            Object objAwait = ((i0) obj).await(this);
            return objAwait == aVar2 ? aVar2 : objAwait;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Ldc1/f;", "<anonymous>", "(Lo82/a;)Ldc1/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pulseox.presentation.PulseOxSummaryViewModel$summaryDataState$1", f = "PulseOxSummaryViewModel.kt", l = {58, 58}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<o82.a, t13.d<? super dc1.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f92636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ dc1.b f92638c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dc1.b bVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f92638c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f92638c, dVar);
            bVar.f92637b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super dc1.f> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r13 == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            o82.a aVar = (o82.a) this.f92637b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f92636a;
            ArrayList arrayList = null;
            if (i14 == 0) {
                r.b(obj);
                o oVar = aVar.f130843a;
                o oVar2 = aVar.f130844b;
                this.f92637b = null;
                this.f92636a = 1;
                obj = this.f92638c.a(oVar, oVar2);
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
                r.b(obj);
            }
            nl.a aVar3 = (nl.a) obj;
            aVar3.getClass();
            List<List<Long>> listE = aVar3.e();
            ArrayList<List> arrayList2 = new ArrayList();
            for (Object obj2 : listE) {
                if (((List) obj2).size() == 2) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
            for (List list : arrayList2) {
                arrayList3.add(new dc1.d(((Number) list.get(0)).longValue(), ((Number) list.get(1)).longValue()));
            }
            List<List<Object>> listC = aVar3.c();
            if (listC != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : listC) {
                    if (((List) obj3).size() == 2) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList<List> arrayList5 = new ArrayList();
                for (Object obj4 : arrayList4) {
                    List list2 = (List) obj4;
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (it.next() != null);
                    }
                    arrayList5.add(obj4);
                }
                arrayList = new ArrayList(y.r(arrayList5, 10));
                for (List list3 : arrayList5) {
                    Object obj5 = list3.get(0);
                    obj5.getClass();
                    Object obj6 = list3.get(1);
                    obj6.getClass();
                    arrayList.add(new dc1.c((String) obj5, ((Double) obj6).doubleValue()));
                }
            }
            return new dc1.f(arrayList3, arrayList, aVar3.getOverallSpo2Average());
            this.f92637b = null;
            this.f92636a = 2;
            obj = ((i0) obj).await(this);
        }
    }

    public m(dc1.b bVar) {
        bVar.getClass();
        this.f92629a = new tf0.i(v1.a(this), null, 2, null);
        this.f92630b = q2.a(new n(null, null, false, 7, null));
        this.f92631c = new u82.a(v1.a(this), new y82.e(new y82.c(new a(bVar, null)), null, 2, null), false, 4, null);
        this.f92632d = new u82.a(v1.a(this), new y82.e(new y82.c(new b(bVar, null)), null, 2, null), false, 4, null);
    }
}
