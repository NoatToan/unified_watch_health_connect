package com.xiaomi.fitness.eco.device.manager.export;

import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoProduct;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0006"}, d2 = {"toDeviceProduct", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoProduct;", "isRequestBond", "", "isLocalSportMachine", "eco-device-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoProductExtKt {
    public static final boolean isLocalSportMachine(@NotNull EcoProduct ecoProduct) {
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        return ecoProduct.getAccessType() == 1;
    }

    public static final boolean isRequestBond(@NotNull EcoProduct ecoProduct) {
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        List<String> features = ecoProduct.getFeatures();
        if (features != null) {
            return features.contains(Feature.REQUEST_BOND);
        }
        return false;
    }

    @NotNull
    public static final Product toDeviceProduct(@NotNull EcoProduct ecoProduct) {
        Product.Size size;
        Product.PrivateUUID privateUUID;
        Product.XiaoAi xiaoAi;
        Product.Alexa alexa;
        Product.ESIM esim;
        Intrinsics.checkNotNullParameter(ecoProduct, "<this>");
        Product.AboutModule aboutModule = null;
        if (ecoProduct.getSize() != null) {
            Product.Size size2 = ecoProduct.getSize();
            Intrinsics.checkNotNull(size2);
            int width = size2.getWidth();
            Product.Size size3 = ecoProduct.getSize();
            Intrinsics.checkNotNull(size3);
            int height = size3.getHeight();
            Product.Size size4 = ecoProduct.getSize();
            Intrinsics.checkNotNull(size4);
            int height2 = size4.getHeight();
            Product.Size size5 = ecoProduct.getSize();
            Intrinsics.checkNotNull(size5);
            float ratio = size5.getRatio();
            Product.Size size6 = ecoProduct.getSize();
            Intrinsics.checkNotNull(size6);
            size = new Product.Size(width, height, height2, ratio, size6.getAndroid_scale(), 0, 0);
        } else {
            size = null;
        }
        if (ecoProduct.getPrivateUUID() != null) {
            Product.PrivateUUID privateUUID2 = ecoProduct.getPrivateUUID();
            Intrinsics.checkNotNull(privateUUID2);
            String service = privateUUID2.getService();
            Product.PrivateUUID privateUUID3 = ecoProduct.getPrivateUUID();
            Intrinsics.checkNotNull(privateUUID3);
            String protoTX = privateUUID3.getProtoTX();
            Product.PrivateUUID privateUUID4 = ecoProduct.getPrivateUUID();
            Intrinsics.checkNotNull(privateUUID4);
            String protoRX = privateUUID4.getProtoRX();
            Product.PrivateUUID privateUUID5 = ecoProduct.getPrivateUUID();
            Intrinsics.checkNotNull(privateUUID5);
            String fitness = privateUUID5.getFitness();
            Product.PrivateUUID privateUUID6 = ecoProduct.getPrivateUUID();
            Intrinsics.checkNotNull(privateUUID6);
            String voice = privateUUID6.getVoice();
            Product.PrivateUUID privateUUID7 = ecoProduct.getPrivateUUID();
            Intrinsics.checkNotNull(privateUUID7);
            String mass = privateUUID7.getMass();
            Product.PrivateUUID privateUUID8 = ecoProduct.getPrivateUUID();
            Intrinsics.checkNotNull(privateUUID8);
            String otaTX = privateUUID8.getOtaTX();
            Product.PrivateUUID privateUUID9 = ecoProduct.getPrivateUUID();
            Intrinsics.checkNotNull(privateUUID9);
            privateUUID = new Product.PrivateUUID(service, protoTX, protoRX, fitness, voice, mass, otaTX, privateUUID9.getOtaRX());
        } else {
            privateUUID = null;
        }
        if (ecoProduct.getXiaoAi() != null) {
            Product.XiaoAi xiaoAi2 = ecoProduct.getXiaoAi();
            Intrinsics.checkNotNull(xiaoAi2);
            String clientId = xiaoAi2.getClientId();
            Product.XiaoAi xiaoAi3 = ecoProduct.getXiaoAi();
            Intrinsics.checkNotNull(xiaoAi3);
            String clientSecret = xiaoAi3.getClientSecret();
            Product.XiaoAi xiaoAi4 = ecoProduct.getXiaoAi();
            Intrinsics.checkNotNull(xiaoAi4);
            String redirectUrl = xiaoAi4.getRedirectUrl();
            Product.XiaoAi xiaoAi5 = ecoProduct.getXiaoAi();
            Intrinsics.checkNotNull(xiaoAi5);
            String mVid = xiaoAi5.getMVid();
            Product.XiaoAi xiaoAi6 = ecoProduct.getXiaoAi();
            Intrinsics.checkNotNull(xiaoAi6);
            String mPid = xiaoAi6.getMPid();
            Product.XiaoAi xiaoAi7 = ecoProduct.getXiaoAi();
            Intrinsics.checkNotNull(xiaoAi7);
            xiaoAi = new Product.XiaoAi(clientId, clientSecret, redirectUrl, mVid, mPid, xiaoAi7.getCapability(), 0, 64, null);
        } else {
            xiaoAi = null;
        }
        if (ecoProduct.getAlexa() != null) {
            Product.Alexa alexa2 = ecoProduct.getAlexa();
            Intrinsics.checkNotNull(alexa2);
            String productId = alexa2.getProductId();
            Product.Alexa alexa3 = ecoProduct.getAlexa();
            Intrinsics.checkNotNull(alexa3);
            String clientId2 = alexa3.getClientId();
            Product.Alexa alexa4 = ecoProduct.getAlexa();
            Intrinsics.checkNotNull(alexa4);
            String amazonRestHost = alexa4.getAmazonRestHost();
            Product.Alexa alexa5 = ecoProduct.getAlexa();
            Intrinsics.checkNotNull(alexa5);
            alexa = new Product.Alexa(productId, clientId2, amazonRestHost, alexa5.getAlexaRestHost());
        } else {
            alexa = null;
        }
        if (ecoProduct.getEsim() != null) {
            Product.ESIM esim2 = ecoProduct.getEsim();
            Intrinsics.checkNotNull(esim2);
            esim = new Product.ESIM(esim2.getCuMachinType());
        } else {
            esim = null;
        }
        if (ecoProduct.getBloodPressureModule() != null) {
            Product.AboutModule bloodPressureModule = ecoProduct.getBloodPressureModule();
            Intrinsics.checkNotNull(bloodPressureModule);
            String model = bloodPressureModule.getModel();
            Product.AboutModule bloodPressureModule2 = ecoProduct.getBloodPressureModule();
            Intrinsics.checkNotNull(bloodPressureModule2);
            String fullVersion = bloodPressureModule2.getFullVersion();
            Product.AboutModule bloodPressureModule3 = ecoProduct.getBloodPressureModule();
            Intrinsics.checkNotNull(bloodPressureModule3);
            String releaseVersion = bloodPressureModule3.getReleaseVersion();
            Product.AboutModule bloodPressureModule4 = ecoProduct.getBloodPressureModule();
            Intrinsics.checkNotNull(bloodPressureModule4);
            String certificateNumber = bloodPressureModule4.getCertificateNumber();
            Product.AboutModule bloodPressureModule5 = ecoProduct.getBloodPressureModule();
            Intrinsics.checkNotNull(bloodPressureModule5);
            String produceNumber = bloodPressureModule5.getProduceNumber();
            Product.AboutModule bloodPressureModule6 = ecoProduct.getBloodPressureModule();
            Intrinsics.checkNotNull(bloodPressureModule6);
            aboutModule = new Product.AboutModule(model, fullVersion, releaseVersion, certificateNumber, produceNumber, bloodPressureModule6.getTechnicalNumber());
        }
        return new Product(ecoProduct.getAppVersion(), ecoProduct.getModel(), new ArrayList(), ecoProduct.getProductId(), ecoProduct.getProductName(), ecoProduct.getBltNamePrefix(), ecoProduct.getBigIcon(), ecoProduct.getBigIcon3(), ecoProduct.getBigPreview(), ecoProduct.getSmallIcon(), size, ecoProduct.getDiscovery(), ecoProduct.getStatus(), ecoProduct.getType(), ecoProduct.getAlias(), ecoProduct.getOta(), ecoProduct.getGroupId(), ecoProduct.getIotSubCategoryId(), ecoProduct.getAccessType(), privateUUID, ecoProduct.getFeatures(), xiaoAi, esim, alexa, ecoProduct.getWhitelistFeature(), ecoProduct.getAndroidFeature(), ecoProduct.getRssiArray(), ecoProduct.getFeatureMap(), aboutModule, ecoProduct.getAgps(), ecoProduct.getCategory(), ecoProduct.getSubcategory(), null, null, 0, 3, null);
    }
}
