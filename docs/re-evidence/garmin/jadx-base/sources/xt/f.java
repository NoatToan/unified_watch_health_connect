package xt;

import c83.a0;
import e23.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import tt.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ltt/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.network.AnnualReportRepo$requestGenerateReport$2", f = "AnnualReportRepo.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements l<t13.d<? super a0<k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f192145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f192146b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f192146b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f192146b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<k>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f192145a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<k>> i0VarB = this.f192146b.f192133b.b(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S", Locale.getDefault()).format(new Date()));
        this.f192145a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
