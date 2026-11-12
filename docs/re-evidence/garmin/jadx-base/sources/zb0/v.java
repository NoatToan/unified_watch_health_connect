package zb0;

import android.content.ContentValues;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.DeviceImageLoader$Companion$solveRegisteredDevicesImages$2$1", f = "DeviceImageLoader.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f203861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f203862b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, String str2, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f203861a = str;
        this.f203862b = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f203861a, this.f203862b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        rd2.f.a().f152047c.getClass();
        String str = this.f203861a;
        ContentValues contentValues = new ContentValues(1);
        String str2 = this.f203862b;
        contentValues.put("image_url", str2);
        rd2.i.e(rd2.a.b().update("devices", contentValues, "product_nbr=?", new String[]{str}));
        rd2.i.f152075b.debug(v.e0.g("updateImageURL: productNbr [", str, "], url [", str2, "]"));
        return Unit.INSTANCE;
    }
}
