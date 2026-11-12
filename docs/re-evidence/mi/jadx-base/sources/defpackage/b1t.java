package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.BLECarKeyInfo;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.miui.tsmclient.entity.ICCOACarKeyCardInfo;
import com.miui.tsmclient.entity.ProprietaryCarKeyCardInfo;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import com.miui.tsmclient.net.IAuthClient;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b1t extends SecureRequest<b> {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<ProprietaryCarKeyCardInfo> f3699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<CarKeyCardInfo> f3700b;
        public List<BLECarKeyInfo> c;
        public List<ICCOACarKeyCardInfo> d;

        public void a(List<BLECarKeyInfo> list) {
            this.c = list;
        }

        public List<CarKeyCardInfo> b() {
            return this.f3700b;
        }

        public void c(List<CarKeyCardInfo> list) {
            this.f3700b = list;
        }

        public List<ICCOACarKeyCardInfo> d() {
            return this.d;
        }

        public void e(List<ICCOACarKeyCardInfo> list) {
            this.d = list;
        }

        public List<ProprietaryCarKeyCardInfo> f() {
            return this.f3699a;
        }

        public void g(List<ProprietaryCarKeyCardInfo> list) {
            this.f3699a = list;
        }
    }

    public static class b extends CommonResponseInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f3701a;

        public a a() {
            return this.f3701a;
        }

        public void c(a aVar) {
            this.f3701a = aVar;
        }
    }

    public b1t(Context context, String str) {
        this(context, str, null, null, null);
    }

    @Override // com.miui.tsmclient.common.net.request.GsonRequest, com.miui.tsmclient.common.net.request.BaseRequest
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b parseBody(boolean z, String str) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            b bVar = new b();
            bVar.setErrorCode(jSONObject.optInt(IAuthClient.KEY_ERR_CODE));
            bVar.setErrorDesc(jSONObject.optString("errDesc"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                return bVar;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("proprietaryProtocolCarKeys");
            a aVar = new a();
            if (jSONArrayOptJSONArray == null) {
                aVar.g(Collections.emptyList());
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add((ProprietaryCarKeyCardInfo) CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_TRADITIONALCARKEYCARD, jSONArrayOptJSONArray.getJSONObject(i)));
                }
                aVar.g(arrayList);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("cccCarKeys");
            if (jSONArrayOptJSONArray2 == null) {
                aVar.c(Collections.emptyList());
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    arrayList2.add((CarKeyCardInfo) CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_DIGITAL_KEY, jSONArrayOptJSONArray2.getJSONObject(i2)));
                }
                aVar.c(arrayList2);
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("bleCarKeys");
            if (jSONArrayOptJSONArray3 == null) {
                aVar.a(Collections.emptyList());
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                    arrayList3.add((BLECarKeyInfo) CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_BLE_CAR, jSONArrayOptJSONArray3.getJSONObject(i3)));
                }
                aVar.a(arrayList3);
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject.optJSONArray("iccoaV2CarKeys");
            if (jSONArrayOptJSONArray4 == null) {
                aVar.e(Collections.emptyList());
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (int i4 = 0; i4 < jSONArrayOptJSONArray4.length(); i4++) {
                    arrayList4.add((ICCOACarKeyCardInfo) CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_ICCOA_DIGITAL_KEY, jSONArrayOptJSONArray4.getJSONObject(i4)));
                }
                aVar.e(arrayList4);
            }
            bVar.c(aVar);
            return bVar;
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        super.addExtraParams();
        try {
            addParams("cplc", new CardInfo(CardInfo.CARD_TYPE_DUMMY).getTerminal().getCPLC());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            LogUtils.e("CarKeyListRequest getExtraParams failed", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseSecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public boolean isSuccess() {
        return super.isSuccess() && ((b) getResult()).a() != null;
    }

    public b1t(Context context, String str, String str2, String str3, String str4) {
        super("POST", TSMAuthContants.URL_QUERY_CAR_KEY_LIST_V2, b.class);
        if (!TextUtils.isEmpty(str2)) {
            addParams("cccVehicleOEMId", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            addParams("cccVehicleBrandId", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            addParams("cccKeyId", str4);
        }
        addParams("deviceId", DeviceUtils.getDeviceId(context, null));
        addParams(TSMAuthContants.PARAM_QUERY_TYPE, str);
        addParams(TSMAuthContants.PARAM_DKF_VERSION_CODE, String.valueOf(DeviceUtils.getAppVersionCode(context, Constants.PACKAGE_NAME_DIGITAL_KEY)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public b1t(Context context, String str, Map<String, String> map) {
        super("POST", TSMAuthContants.URL_QUERY_CAR_KEY_LIST_V2, b.class);
        str.hashCode();
        int iHashCode = str.hashCode();
        String str2 = ProductList.ProductInfo.CCC_TYPE;
        byte b2 = -1;
        switch (iHashCode) {
            case -297518240:
                if (str.equals(ProductList.ProductInfo.ICCOA_TYPE)) {
                    b2 = 0;
                }
                break;
            case 65851:
                if (str.equals(ProductList.ProductInfo.BLE_TYPE)) {
                    b2 = 1;
                }
                break;
            case 66531:
                if (str.equals(ProductList.ProductInfo.CCC_TYPE)) {
                    b2 = 2;
                }
                break;
        }
        String str3 = "";
        switch (b2) {
            case 0:
                String str4 = map.get("iccoaV2VehicleOEMId");
                if (!TextUtils.isEmpty(str4)) {
                    addParams("iccoaV2VehicleOEMId", str4);
                    str3 = "ICCOA_V2_BY_VEHICLE_OEM";
                }
                String str5 = map.get("iccoaV2KeyId");
                if (!TextUtils.isEmpty(str5)) {
                    addParams("iccoaV2KeyId", str5);
                    str3 = "ICCOA_V2_BY_KEYID";
                }
                str2 = str3;
                if (TextUtils.isEmpty(str2)) {
                    str2 = ProductList.ProductInfo.ICCOA_TYPE;
                }
                break;
            case 1:
                str2 = ProductList.ProductInfo.BLE_TYPE;
                break;
            case 2:
                String str6 = map.get("cccVehicleOEMId");
                String str7 = "CCC_BY_BRAND";
                if (!TextUtils.isEmpty(str6)) {
                    addParams("cccVehicleOEMId", str6);
                    str3 = "CCC_BY_BRAND";
                }
                String str8 = map.get("cccVehicleBrandId");
                if (TextUtils.isEmpty(str8)) {
                    str7 = str3;
                } else {
                    addParams("cccVehicleBrandId", str8);
                }
                String str9 = map.get("cccKeyId");
                if (!TextUtils.isEmpty(str9)) {
                    addParams("cccKeyId", str9);
                    str7 = "CCC_BY_KEYID";
                }
                if (!TextUtils.isEmpty(str7)) {
                    str2 = str7;
                }
                break;
            default:
                str2 = "";
                break;
        }
        addParams(TSMAuthContants.PARAM_QUERY_TYPE, str2);
        addParams("deviceId", DeviceUtils.getDeviceId(context, null));
        addParams(TSMAuthContants.PARAM_DKF_VERSION_CODE, String.valueOf(DeviceUtils.getAppVersionCode(context, Constants.PACKAGE_NAME_DIGITAL_KEY)));
    }
}
