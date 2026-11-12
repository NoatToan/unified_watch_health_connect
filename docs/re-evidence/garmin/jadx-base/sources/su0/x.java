package su0;

import android.content.Context;
import android.graphics.Bitmap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lo53/b0;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.LiveTrackUrlShareDataSourceImpl$downloadProfileBitmap$2", f = "LiveTrackUrlShareDataSourceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Bitmap>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f161014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f161015b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, String str, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f161014a = context;
        this.f161015b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f161014a, this.f161015b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Bitmap> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        zp0.c.f206560v.getClass();
        zp0.c cVarA = zp0.c.a.a(this.f161014a);
        cVarA.f206565e = this.f161015b;
        cVarA.a("circle_mask");
        cVarA.f206578r = "cache_availability_today";
        return cVarA.c();
    }
}
