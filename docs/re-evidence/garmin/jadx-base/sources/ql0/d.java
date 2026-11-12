package ql0;

import c22.o;
import c83.a0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import java.io.IOException;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.network.GolfSwingAnalysisRepo$fetchData$2", f = "GolfSwingAnalysisRepo.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super v2<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d80.c f145214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l<String, Object> f145215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f145216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c83.d<String> f145217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(d80.c cVar, l<? super String, Object> lVar, b bVar, c83.d<String> dVar, t13.d<? super d> dVar2) {
        super(2, dVar2);
        this.f145214a = cVar;
        this.f145215b = lVar;
        this.f145216c = bVar;
        this.f145217d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f145214a, this.f145215b, this.f145216c, this.f145217d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<Object>> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String strA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        o oVar = (o) KoinJavaComponent.get$default(o.class, null, null, 6, null);
        l<String, Object> lVar = this.f145215b;
        d80.c cVar = this.f145214a;
        if (cVar != null && !oVar.a() && (strA = cVar.a()) != null) {
            try {
                Object objInvoke = lVar.invoke(strA);
                return objInvoke != null ? new v2.b(objInvoke, 200, null, null, 12, null) : new v2.a(new Exception("Deserialized cached data is null."), null, null, 6, null);
            } catch (Exception unused) {
                return new v2.a(new Exception("Cached data cannot be deserialized."), null, null, 6, null);
            }
        }
        if (!oVar.a()) {
            return new v2.a(new Exception("No data in cache."), null, null, 6, null);
        }
        if (!oVar.a()) {
            return new v2.a(new Exception("Cannot fetch data from cache and there is no internet available."), null, null, 6, null);
        }
        c83.d<String> dVar = this.f145217d;
        b.a aVar2 = b.f145209b;
        this.f145216c.getClass();
        try {
            a0<String> a0VarExecute = dVar.execute();
            int iCode = a0VarExecute.f25745a.code();
            String str = a0VarExecute.f25746b;
            if (!a0VarExecute.f25745a.isSuccessful() || str == null) {
                return new v2.a(new IOException("Error Occurred during getting safe Api result Response [" + a0VarExecute + "]"), Integer.valueOf(iCode), str);
            }
            if (cVar != null) {
                cVar.b(str);
            }
            Object objInvoke2 = lVar.invoke(str);
            return objInvoke2 != null ? new v2.b(objInvoke2, iCode, null, null, 12, null) : new v2.a(new Exception("Deserialized data is null."), null, null, 6, null);
        } catch (Exception e4) {
            return new v2.a(e4, null, null, 6, null);
        }
    }
}
