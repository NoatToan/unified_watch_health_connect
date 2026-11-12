package gk0;

import android.content.Context;
import android.os.Build;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.gcsprotos.generated.Auth;
import com.garmin.gcsprotos.generated.DataTypesProto;
import com.garmin.gcsprotos.generated.RequestTypesProto;
import com.garmin.gcsprotos.generated.ResponseTypesProto;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class e extends a<Auth.MobileAppAuthorizeResponse> {
    public e(Context context) {
        super(context);
    }

    @Override // gk0.f
    public final Object a(List list) {
        Auth.MobileAppAuthResponse mobileAppAuthResponse = ((ResponseTypesProto.ServiceResponse) list.get(0)).getMobileAppAuthResponse();
        if (mobileAppAuthResponse == null || !mobileAppAuthResponse.hasMobileAppAuthResponse()) {
            return null;
        }
        Auth.MobileAppAuthorizeResponse mobileAppAuthResponse2 = mobileAppAuthResponse.getMobileAppAuthResponse();
        if (mobileAppAuthResponse2 != null) {
            List<Auth.ServiceInformation> serviceInfoList = mobileAppAuthResponse2.getServiceInfoList();
            d dVar = (d) KoinJavaComponent.get(d.class);
            dVar.e();
            for (Auth.ServiceInformation serviceInformation : serviceInfoList) {
                dVar.c(serviceInformation.getCategory(), serviceInformation.getUrlEndpoint());
                i2.d("GCSCategories", serviceInformation.getCategory().name() + " : " + serviceInformation.getUrlEndpoint());
            }
        }
        return mobileAppAuthResponse.getMobileAppAuthResponse();
    }

    @Override // gk0.f
    public final List<RequestTypesProto.ServiceRequest> prepare() {
        RequestTypesProto.ServiceRequest.Builder builderNewBuilder = RequestTypesProto.ServiceRequest.newBuilder();
        Auth.MobileAppAuthRequest.Builder builderNewBuilder2 = Auth.MobileAppAuthRequest.newBuilder();
        Auth.MobileAppAuthorizeRequest.Builder builderNewBuilder3 = Auth.MobileAppAuthorizeRequest.newBuilder();
        DataTypesProto.MobileDeviceIdentity.Builder builderNewBuilder4 = DataTypesProto.MobileDeviceIdentity.newBuilder();
        String strA = hb2.g.a(this.f77721a);
        builderNewBuilder4.setDeviceIdentifier(strA);
        builderNewBuilder4.setClientGeneratedToken(strA.hashCode());
        builderNewBuilder3.setDeviceIdentifier(builderNewBuilder4.build());
        d dVar = (d) KoinJavaComponent.get(d.class);
        builderNewBuilder3.setApplicationVersion(dVar.h());
        Auth.SecurityInfo.Builder builderNewBuilder5 = Auth.SecurityInfo.newBuilder();
        builderNewBuilder5.setAppHash(strA.hashCode() + "");
        builderNewBuilder5.setTimestamp((int) (System.currentTimeMillis() / 1000));
        builderNewBuilder5.addSubscriptionToken(0);
        builderNewBuilder3.setSecurityInfo(builderNewBuilder5.build());
        Auth.MobileDeviceInfo.Builder builderNewBuilder6 = Auth.MobileDeviceInfo.newBuilder();
        builderNewBuilder6.setDeviceType("Android Device");
        builderNewBuilder6.setOperatingSystem(Build.VERSION.CODENAME + "(" + Build.VERSION.SDK_INT + ")");
        builderNewBuilder3.setDeviceInfo(builderNewBuilder6.build());
        builderNewBuilder3.setPhoningHome(false);
        DataTypesProto.MobileUserAccountIdentity.Builder builderNewBuilder7 = DataTypesProto.MobileUserAccountIdentity.newBuilder();
        builderNewBuilder7.setAuthToken(dVar.f());
        builderNewBuilder3.setUserIdentifier(builderNewBuilder7.build());
        builderNewBuilder2.setMobileAppAuthRequest(builderNewBuilder3.build());
        builderNewBuilder.setMobileAppAuthRequest(builderNewBuilder2.build());
        ArrayList arrayList = new ArrayList();
        arrayList.add(builderNewBuilder.build());
        return arrayList;
    }
}
