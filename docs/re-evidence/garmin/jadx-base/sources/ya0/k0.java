package ya0;

import android.content.ContentValues;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.PairingSuccessViewModel$triggerPostPairingActions$1", f = "PairingSuccessViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f195484a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(i0 i0Var, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f195484a = i0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k0(this.f195484a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        i0 i0Var = this.f195484a;
        q90.c cVar = i0Var.f195447a;
        long j8 = cVar.f143493a;
        o90.a aVar2 = cVar.f143495c.f111526k;
        rd2.i iVar = i0Var.f195451e;
        String str = aVar2.f130962a;
        String str2 = aVar2.f130965d;
        String str3 = aVar2.f130964c;
        String str4 = aVar2.f130969h;
        String str5 = aVar2.f130966e;
        String str6 = aVar2.f130967f;
        String str7 = aVar2.f130968g;
        iVar.getClass();
        Logger logger = rd2.i.f152075b;
        StringBuilder sbI = p6.b.i("updateSkuImages: imageUrl [", str, "] defaultWatchFaceURL [", str2, "] defaultWatchFaceBlankURL [");
        sn.a.t(sbI, str3, "] sideProfileURL [", str4, "], tutorialURL [null] option1URL [");
        sn.a.t(sbI, str5, "], option2URL [", str6, "] option3URL [");
        sbI.append(str7);
        sbI.append("]");
        logger.debug(sbI.toString());
        try {
            ContentValues contentValues = new ContentValues(8);
            contentValues.put("sku_image_url", str);
            contentValues.put("sku_image_defaultWatchFace_url", str2);
            contentValues.put("sku_image_defaultWatchFaceBlank_url", str3);
            contentValues.put("sku_image_sideProfile_url", str4);
            contentValues.put("sku_image_tutorial_url", (String) null);
            contentValues.put("sku_image_option1_url", str5);
            contentValues.put("sku_image_option2_url", str6);
            contentValues.put("sku_image_option3_url", str7);
            i14 = rd2.i.i(contentValues, j8);
        } catch (Exception e4) {
            logger.error("updateSkuImages", (Throwable) e4);
            i14 = -1;
        }
        StringBuilder sbW = v.h.w(i14, "updateSkuImages: unitID [", "], rowsUpdated [", j8);
        sbW.append("]");
        logger.debug(sbW.toString());
        rd2.i.e(i14);
        return Unit.INSTANCE;
    }
}
