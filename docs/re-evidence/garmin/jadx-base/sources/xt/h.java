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
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.network.AnnualReportRepo$saveShareImage$2", f = "AnnualReportRepo.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f192151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f192152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f192153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f192154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, Context context, Bitmap bitmap, String str, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f192151a = aVar;
        this.f192152b = context;
        this.f192153c = bitmap;
        this.f192154d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f192151a, this.f192152b, this.f192153c, this.f192154d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        this.f192151a.f192134c.b(this.f192152b, this.f192153c, "annual_report_share_image", this.f192154d);
        return Unit.INSTANCE;
    }
}
