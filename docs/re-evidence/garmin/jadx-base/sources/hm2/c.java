package hm2;

import android.content.ContentValues;
import android.text.TextUtils;
import c22.t;
import e23.p;
import lm2.h;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rd2.f;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "com.garmin.device.pairing.impl.gdi.reconnection.PairingReconnectHelper$handleDeviceAuthenticated$1", f = "PairingReconnectHelper.kt", l = {}, m = "invokeSuspend")
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f84497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f84498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f84499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f84500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f84497a = str;
        this.f84498b = bArr;
        this.f84499c = bArr2;
        this.f84500d = bArr3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f84497a, this.f84498b, this.f84499c, this.f84500d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        Logger logger = d.f84501a;
        StringBuilder sb3 = new StringBuilder("Update Garmin auth for ");
        String str = this.f84497a;
        sb3.append(str);
        logger.info(sb3.toString());
        h.e();
        f.a().f152047c.getClass();
        Logger logger2 = rd2.i.f152075b;
        int iH = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                ContentValues contentValues = new ContentValues();
                byte[] bArr = this.f84498b;
                if (bArr != null && bArr.length > 0) {
                    contentValues.put("gble_ediv", bArr);
                }
                byte[] bArr2 = this.f84499c;
                if (bArr2 != null && bArr2.length > 0) {
                    contentValues.put("gble_rand", bArr2);
                }
                byte[] bArr3 = this.f84500d;
                if (bArr3 != null && bArr3.length > 0) {
                    contentValues.put("gble_ltk", bArr3);
                }
                iH = rd2.i.h(contentValues, str);
            } catch (Exception e4) {
                logger2.error("updateGarminAuth", (Throwable) e4);
            }
            logger2.debug(t.e(iH, "updateGarminAuth: macAddr [", str, "], nbrRows [", "]"));
        }
        rd2.i.e(iH);
        return Unit.INSTANCE;
    }
}
