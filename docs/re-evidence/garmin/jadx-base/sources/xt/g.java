package xt;

import android.content.Context;
import android.graphics.Bitmap;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.network.AnnualReportRepo$savePreProcessImage$2", f = "AnnualReportRepo.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f192147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f192148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f192149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f192150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, Context context, Bitmap bitmap, String str, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f192147a = aVar;
        this.f192148b = context;
        this.f192149c = bitmap;
        this.f192150d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f192147a, this.f192148b, this.f192149c, this.f192150d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f192147a.f192134c.b(this.f192148b, this.f192149c, "annual_report_pre_process_image", this.f192150d);
        return Unit.INSTANCE;
    }
}
