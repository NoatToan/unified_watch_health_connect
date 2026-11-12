package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.multisim.constants.BrandType;
import com.huawei.sim.multisim.constants.CarrierType;
import com.huawei.sim.multisim.constants.EsimType;
import com.huawei.sim.strategy.EsimCarrierStrategy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes15.dex */
public class pxm {

    /* JADX INFO: renamed from: pxm$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45937a;

        static {
            int[] iArr = new int[CarrierType.values().length];
            f45937a = iArr;
            try {
                iArr[CarrierType.CUCC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45937a[CarrierType.CTCC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45937a[CarrierType.CMCC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static EsimCarrierStrategy e(CarrierType carrierType, EsimType esimType, BrandType brandType) {
        LogUtil.a("EsimStrategyFactory", "carrier:", carrierType.name(), ",esim:", esimType.name(), ",brand:", brandType.name());
        if (AnonymousClass1.f45937a[carrierType.ordinal()] == 1) {
            if (esimType == EsimType.ONE_NUMBER_MULTISIM) {
                if (brandType == BrandType.HUAWEI) {
                    return new pxr();
                }
                if (brandType == BrandType.THIRD) {
                    return new pxs();
                }
            } else if (esimType == EsimType.STAND_ALONE_NUMBER) {
                if (brandType == BrandType.HUAWEI) {
                    return new pxw();
                }
                if (brandType == BrandType.THIRD) {
                    return new pya();
                }
            }
        }
        ReleaseLogUtil.a("DEVMGR_EsimStrategyFactory", "invalid strategy, carrier:", carrierType.name(), ",esim:", esimType.name(), ",brand:", brandType.name());
        return null;
    }
}
