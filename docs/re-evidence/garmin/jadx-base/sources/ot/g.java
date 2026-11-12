package ot;

import android.content.Context;
import android.graphics.Bitmap;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.chapter.ActivityDistanceChapter$generateActivityPolylineImage$1$1$1$1", f = "ActivityDistanceChapter.kt", l = {368}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f133592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f133593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ps.m f133594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f133595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Bitmap bitmap, f fVar, ps.m mVar, Context context, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f133592c = bitmap;
        this.f133593d = fVar;
        this.f133594e = mVar;
        this.f133595f = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f133592c, this.f133593d, this.f133594e, this.f133595f, dVar);
        gVar.f133591b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var = (o53.b0) this.f133591b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133590a;
        f fVar = this.f133593d;
        if (i14 == 0) {
            o13.r.b(obj);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.f133592c, 1296, 793, true);
            bitmapCreateScaledBitmap.getClass();
            xt.a aVar = (xt.a) KoinJavaComponent.get$default(xt.a.class, null, null, 6, null);
            String strH = am.j.h(this.f133594e.hashCode(), "distance_map_view_");
            fVar.f133589u = strH;
            this.f133591b = b0Var;
            this.f133590a = 1;
            aVar.getClass();
            x53.c cVar = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new xt.g(aVar, this.f133595f, bitmapCreateScaledBitmap, strH, null), this);
            if (objE0 != obj2) {
                objE0 = Unit.INSTANCE;
            }
            if (objE0 == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        String str = f.f133585v;
        String strG = e0.g("save map image finish at ", fVar.r(), ", filename = [", fVar.f133589u, "]");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, str, strG);
        return Unit.INSTANCE;
    }
}
