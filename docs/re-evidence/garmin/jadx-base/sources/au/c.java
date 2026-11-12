package au;

import android.content.Context;
import e23.p;
import e23.q;
import java.util.Iterator;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import tt.n;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.preprocess.AnnualReportPreprocessor$handleAnnualReportDTO$handlingJob$1", f = "AnnualReportPreprocessor.kt", l = {110, 112, 114, 116}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tt.i f12830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f12831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f12832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tt.i f12835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f12836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.annual_report.preprocess.a f12837h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tt.i iVar, Context context, com.garmin.android.apps.connectmobile.annual_report.preprocess.a aVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f12835f = iVar;
        this.f12836g = context;
        this.f12837h = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f12835f, this.f12836g, this.f12837h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:? A[LOOP:0: B:21:0x005c->B:37:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r10.j(r6, r7, r9) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r10 == r0) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i14;
        Iterator itN;
        Context context;
        tt.i iVar;
        Object objE0;
        q<tt.i, Context, t13.d<? super Unit>, Object> qVar;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f12834e;
        Context context2 = this.f12836g;
        tt.i iVar2 = this.f12835f;
        if (i15 == 0) {
            r.b(obj);
            n coverPage = iVar2.getCoverPage();
            this.f12834e = 1;
            if (st.b.a(coverPage, context2, this) != obj2) {
            }
            return obj2;
        }
        if (i15 == 1) {
            r.b(obj);
        } else if (i15 == 2) {
            r.b(obj);
            w13.c cVar = ot.n.f133641p;
            i14 = 0;
            itN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            context = context2;
            iVar = iVar2;
            while (itN.hasNext()) {
                qVar = ((ot.n) itN.next()).f133642a;
                this.f12830a = iVar;
                this.f12831b = context;
                this.f12832c = itN;
                this.f12833d = i14;
                this.f12834e = 3;
                if (qVar.invoke(iVar, context, this) == obj2) {
                    return obj2;
                }
            }
            xt.a aVar = this.f12837h.f30186a;
            this.f12830a = null;
            this.f12831b = null;
            this.f12832c = null;
            this.f12834e = 4;
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new xt.b(aVar, iVar2, null), this);
            if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                objE0 = Unit.INSTANCE;
            }
        } else if (i15 == 3) {
            i14 = this.f12833d;
            itN = this.f12832c;
            Context context3 = this.f12831b;
            iVar = this.f12830a;
            r.b(obj);
            context = context3;
            while (itN.hasNext()) {
                qVar = ((ot.n) itN.next()).f133642a;
                this.f12830a = iVar;
                this.f12831b = context;
                this.f12832c = itN;
                this.f12833d = i14;
                this.f12834e = 3;
                if (qVar.invoke(iVar, context, this) == obj2) {
                    return obj2;
                }
            }
            xt.a aVar2 = this.f12837h.f30186a;
            this.f12830a = null;
            this.f12831b = null;
            this.f12832c = null;
            this.f12834e = 4;
            x53.c cVar3 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new xt.b(aVar2, iVar2, null), this);
            if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                objE0 = Unit.INSTANCE;
            }
        } else {
            if (i15 != 4) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        bu.f fVar = bu.f.f21180a;
        this.f12834e = 2;
    }
}
