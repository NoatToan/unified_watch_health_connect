package xt;

import android.content.Context;
import android.net.Uri;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/net/Uri;", "<anonymous>", "(Lo53/b0;)Landroid/net/Uri;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.network.AnnualReportRepo$getShareImageUri$2", f = "AnnualReportRepo.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Uri>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f192142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f192143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f192144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, Context context, String str, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f192142a = aVar;
        this.f192143b = context;
        this.f192144c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f192142a, this.f192143b, this.f192144c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Uri> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        return this.f192142a.f192134c.g(this.f192143b, "annual_report_share_image", this.f192144c);
    }
}
