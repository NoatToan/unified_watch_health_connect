package defpackage;

import android.content.Context;
import android.os.Handler;
import com.huawei.sim.multisim.constants.BrandType;
import com.huawei.sim.multisim.constants.CarrierType;
import com.huawei.sim.multisim.constants.EsimType;
import com.huawei.sim.strategy.EsimCarrierStrategy;

/* JADX INFO: loaded from: classes15.dex */
public class pxn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static pxn f45938c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EsimCarrierStrategy f45939b;

    public EsimCarrierStrategy b(Context context, Handler handler) {
        EsimCarrierStrategy esimCarrierStrategy = this.f45939b;
        if (esimCarrierStrategy != null) {
            esimCarrierStrategy.init(context, handler);
        }
        return this.f45939b;
    }

    public EsimCarrierStrategy a() {
        return this.f45939b;
    }

    public void a(CarrierType carrierType, EsimType esimType, BrandType brandType) {
        this.f45939b = pxm.e(carrierType, esimType, brandType);
    }

    public static pxn e() {
        pxn pxnVar;
        synchronized (e) {
            if (f45938c == null) {
                f45938c = new pxn();
            }
            pxnVar = f45938c;
        }
        return pxnVar;
    }
}
