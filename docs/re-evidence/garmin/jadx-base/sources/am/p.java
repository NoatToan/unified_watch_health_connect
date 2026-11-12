package am;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getActivityDetailChart$2", f = "ActivityRepo.kt", l = {129, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 146}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.l<t13.d<? super c83.a0<ActivityDetailChartDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f4144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<qs.x> f4146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4148g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(boolean z14, m mVar, long j8, List<? extends qs.x> list, boolean z15, int i14, t13.d<? super p> dVar) {
        super(1, dVar);
        this.f4143b = z14;
        this.f4144c = mVar;
        this.f4145d = j8;
        this.f4146e = list;
        this.f4147f = z15;
        this.f4148g = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f4143b, this.f4144c, this.f4145d, this.f4146e, this.f4147f, this.f4148g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ActivityDetailChartDTO>> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r2 == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r2 == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0164, code lost:
    
        if (r2 == r1) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<String> listB1;
        Object objAwait;
        Object objAwait2;
        Object objAwait3;
        ActivityDetailChartDTO activityDetailChartDTO;
        ArrayList arrayListP;
        ArrayList arrayListP2;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.a0> list;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4142a;
        int i15 = 0;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean z14 = this.f4143b;
            m mVar = this.f4144c;
            if (z14) {
                o53.i0<c83.a0<ActivityDetailChartDTO>> i0VarT = mVar.f4069a.t(this.f4145d);
                this.f4142a = 1;
                objAwait3 = i0VarT.await(this);
            } else {
                List<qs.x> list2 = this.f4146e;
                if (list2 == null || list2.isEmpty()) {
                    listB1 = null;
                } else {
                    ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((qs.x) it.next()).name());
                    }
                    listB1 = p13.h0.b1(arrayList);
                }
                boolean z15 = this.f4147f;
                int i16 = this.f4148g;
                if (z15) {
                    o53.i0<c83.a0<ActivityDetailChartDTO>> i0VarX = mVar.f4069a.x(this.f4145d, new Integer(i16), listB1, new Integer(0));
                    this.f4142a = 2;
                    objAwait2 = i0VarX.await(this);
                } else {
                    o53.i0 i0VarF = b2.f(mVar.f4069a, this.f4145d, new Integer(i16), listB1, null, 8);
                    this.f4142a = 3;
                    objAwait = i0VarF.await(this);
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objAwait3 = obj;
            return (c83.a0) objAwait3;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objAwait = obj;
            return (c83.a0) objAwait;
        }
        o13.r.b(obj);
        objAwait2 = obj;
        c83.a0 a0Var = (c83.a0) objAwait2;
        if (a0Var.f25745a.isSuccessful() && (activityDetailChartDTO = (ActivityDetailChartDTO) a0Var.f25746b) != null) {
            com.garmin.android.apps.connectmobile.activities.newmodel.w wVar = new com.garmin.android.apps.connectmobile.activities.newmodel.w();
            ArrayList arrayListP3 = oc.b.p(activityDetailChartDTO, "directTimestamp");
            if (arrayListP3 == null || (arrayListP = oc.b.p(activityDetailChartDTO, "directLatitude")) == null || (arrayListP2 = oc.b.p(activityDetailChartDTO, "directLongitude")) == null || arrayListP3.size() != arrayListP.size() || arrayListP.size() != arrayListP2.size()) {
                list = p13.j0.f134944a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayListP3) {
                    int i17 = i15 + 1;
                    if (i15 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    double dDoubleValue = ((Number) obj2).doubleValue();
                    double dDoubleValue2 = ((Number) arrayListP.get(i15)).doubleValue();
                    double dDoubleValue3 = ((Number) arrayListP2.get(i15)).doubleValue();
                    com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var2 = (Double.isNaN(dDoubleValue2) || Double.isNaN(dDoubleValue3)) ? null : new com.garmin.android.apps.connectmobile.activities.newmodel.a0(dDoubleValue2, dDoubleValue3, MathKt.d(dDoubleValue));
                    if (a0Var2 != null) {
                        arrayList2.add(a0Var2);
                    }
                    i15 = i17;
                }
                list = arrayList2;
            }
            wVar.D(list);
            activityDetailChartDTO.e0(wVar);
        }
        return a0Var;
    }
}
