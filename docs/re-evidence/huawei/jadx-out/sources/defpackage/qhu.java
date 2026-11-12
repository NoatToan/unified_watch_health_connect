package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.security.SecurityCertUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.servicesapi.R;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.TradeViewApi;
import com.huawei.trade.datatype.AssetMessage;
import com.huawei.trade.datatype.AssetMessageTemple;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.DevicePerfPurchaseInfo;
import health.compact.a.CommonUtil;
import health.compact.a.HwEncryptUtil;
import health.compact.a.IoUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.io.Closeable;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class qhu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f46253a = false;

    public static List<MessageObject> b(List<AssetMessage> list, boolean z) {
        String str;
        boolean z2;
        String string;
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            LogUtil.a("TradeUtils", "assetMessages is empty");
            return arrayList;
        }
        LogUtil.a("TradeUtils", "assetMessages size:", Integer.valueOf(list.size()));
        for (AssetMessage assetMessage : list) {
            int infoType = assetMessage.getInfoType();
            String strC = c(infoType);
            if (TextUtils.isEmpty(strC)) {
                LogUtil.d("TradeUtils", "type not match");
            } else {
                String str2 = "messagecenter://asset?type=" + assetMessage.getInfoType();
                ContentValues contentValues = new ContentValues();
                if (infoType == 5) {
                    try {
                        JSONObject jSONObject = new JSONObject(assetMessage.getInfoValue());
                        String strOptString = jSONObject.optString("orderCode");
                        String strOptString2 = jSONObject.optString(HwPayConstant.KEY_PRODUCTNAME);
                        int iOptInt = jSONObject.optInt("attachProductsNum");
                        if (iOptInt == 0) {
                            string = "";
                        } else if (iOptInt > 0) {
                            string = BaseApplication.getContext().getResources().getString(R.string.IDS_purchase_addon_gift, BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_purchase_gift, iOptInt, String.valueOf(iOptInt)));
                        } else {
                            LogUtil.d("TradeUtils", "convertData, attachProductsNum is less than 0");
                            string = "";
                        }
                        String string2 = BaseApplication.getContext().getResources().getString(R.string.IDS_purchase_success, strOptString2);
                        contentValues.put("orderCode", strOptString);
                        str2 = "/TradeService/TradeOrderDetailActivity";
                        str = string;
                        strC = string2;
                        z2 = true;
                    } catch (JSONException e) {
                        LogUtil.d("TradeUtils", "convertData, JSONException e is: ", e.getMessage());
                    }
                } else {
                    str = String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_expiring_soon), e(assetMessage.getInfoValue()).getAssertName());
                    z2 = false;
                }
                MessageObject messageObject = new MessageObject();
                messageObject.setMsgTitle(strC);
                messageObject.setInfoClassify(BaseApplication.getContext().getResources().getString(R.string.IDS_assets));
                messageObject.setMsgType(2);
                if (z) {
                    messageObject.setPosition(3);
                } else {
                    messageObject.setPosition(1);
                }
                messageObject.setMsgPosition(11);
                messageObject.setReceiveTime(assetMessage.getGenTime());
                messageObject.setMsgId(assetMessage.getMsgId());
                messageObject.setModule(String.valueOf(80));
                messageObject.setType("asset");
                if (assetMessage.getVisitFlag()) {
                    messageObject.setReadFlag(1);
                } else {
                    messageObject.setReadFlag(0);
                }
                messageObject.setDetailUri(str2);
                messageObject.setMsgContent(str);
                messageObject.setCreateTime(assetMessage.getGenTime());
                if (z2) {
                    messageObject.setNewMsg(1);
                    messageObject.setJumpType(1);
                    messageObject.setExtra(contentValues);
                }
                arrayList.add(messageObject);
            }
        }
        List<MessageObject> listB = b(arrayList);
        LogUtil.a("TradeUtils", "messageObjects.size:", Integer.valueOf(listB.size()));
        return listB;
    }

    private static AssetMessageTemple e(String str) {
        AssetMessageTemple assetMessageTemple = new AssetMessageTemple();
        try {
            return (AssetMessageTemple) new Gson().fromJson(str, AssetMessageTemple.class);
        } catch (JsonSyntaxException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("TradeUtils", "getAssetMessageTemple gson exception");
            return assetMessageTemple;
        }
    }

    private static String b(int i) {
        if (i == 3) {
            return "#/CardCase";
        }
        if (i == 4) {
            return "#/Coupons";
        }
        LogUtil.a("TradeUtils", "skipToAsset type not match:", Integer.valueOf(i));
        return "";
    }

    private static String c(int i) {
        LogUtil.a("TradeUtils", "getTitle type:", Integer.valueOf(i));
        if (i == 3) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_card_case_notice);
        }
        if (i == 4) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_coupons_notice);
        }
        if (i == 5) {
            return BaseApplication.getContext().getString(R.string.IDS_purchase_success);
        }
        LogUtil.a("TradeUtils", "getTitle type not match:", Integer.valueOf(i));
        return "";
    }

    public static void e(int i, int i2) {
        LogUtil.a("TradeUtils", "enter skipToAsset type:", Integer.valueOf(i));
        String strB = b(i);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.d("TradeUtils", "path is empty");
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath(strB);
        ddv.b().loadH5ProApp(com.huawei.haf.application.BaseApplication.b(), "com.huawei.health.h5.assets", builder);
        b(i, i2);
    }

    private static List<MessageObject> b(List<MessageObject> list) {
        Collections.sort(list, new Comparator<MessageObject>() { // from class: qhu.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(MessageObject messageObject, MessageObject messageObject2) {
                if (messageObject.getReceiveTime() > messageObject2.getReceiveTime()) {
                    return -1;
                }
                return messageObject.getReceiveTime() == messageObject2.getReceiveTime() ? 0 : 1;
            }
        });
        return list;
    }

    private static void b(int i, int i2) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(d(i)));
        map.put("activity", Integer.valueOf(i2));
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), AnalyticsValue.MY_ASSET_ENTRANCE_2120121.value(), map, 0);
    }

    private static int d(int i) {
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 1;
        }
        LogUtil.a("TradeUtils", "getTitle type not match:", Integer.valueOf(i));
        return 0;
    }

    private static List<DeviceBenefitQueryParam> e(String str, DeviceBenefitQueryParam.DeviceBenefitType deviceBenefitType, HwGetDevicesMode hwGetDevicesMode) {
        DeviceBenefitQueryParam deviceBenefitQueryParamD;
        ArrayList arrayList = new ArrayList();
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(hwGetDevicesMode, null, str);
        if (njy.b(deviceList)) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (deviceInfo != null && (deviceBenefitQueryParamD = d(deviceInfo, deviceBenefitType, true)) != null) {
                    arrayList.add(deviceBenefitQueryParamD);
                }
            }
        }
        return arrayList;
    }

    public static List<DeviceBenefitQueryParam> e(String str, DeviceBenefitQueryParam.DeviceBenefitType deviceBenefitType) {
        return e(str, deviceBenefitType, HwGetDevicesMode.CONNECTED_MAIN_DEVICES);
    }

    public static List<DeviceBenefitQueryParam> d(String str, DeviceBenefitQueryParam.DeviceBenefitType deviceBenefitType) {
        return e(str, deviceBenefitType, HwGetDevicesMode.CONNECTED_DEVICES);
    }

    public static DeviceBenefitQueryParam d(DeviceInfo deviceInfo, DeviceBenefitQueryParam.DeviceBenefitType deviceBenefitType, boolean z) {
        String str;
        String str2;
        if (deviceInfo == null) {
            com.huawei.hwlogsmodel.LogUtil.j("TradeUtils", "deviceInfoToDevBenefitQueryParam deviceInfo is null");
            return null;
        }
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        String deviceModel = deviceInfo.getDeviceModel();
        List<String> fieldList = deviceInfo.getFieldList();
        if (!njy.e(fieldList) && fieldList.size() >= 2) {
            str = fieldList.get(0);
            str2 = fieldList.get(1);
        } else {
            str = "";
            str2 = "";
        }
        return new DeviceBenefitQueryParam.Builder().setDeviceType(deviceModel).setDeviceSn(securityDeviceId).setDeviceNumber(str).setDeviceUdid(deviceInfo.getHwRightsUdid()).setSalt(str2).setBenefitType(deviceBenefitType).setDeviceCategory(DeviceBenefitQueryParam.DeviceCategory.DEVICE_CATEGORY_WEAR.getCategory()).setNeedProductInfo(z).setDeviceInfo(deviceInfo).build();
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hwlogsmodel.LogUtil.j("TradeUtils", "currency is empty");
            return "";
        }
        if ("CNY".equals(str)) {
            return "¥";
        }
        try {
            return Currency.getInstance(str).getSymbol();
        } catch (IllegalArgumentException unused) {
            com.huawei.hwlogsmodel.LogUtil.j("TradeUtils", "Currency exception");
            return "";
        }
    }

    public static String c(String str, String str2, int i) {
        return BaseApplication.getContext().getString(i, BaseApplication.getContext().getResources().getString(R.string.IDS_currency_money, d(str), str2));
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        return (!CommonUtil.bg() || CommonUtil.au()) && !Utils.o() && LanguageUtil.l(context) && "CN".equals(LoginInit.getInstance(context).getAccountInfo(1010));
    }

    public static DeviceInboxInfo e(List<DeviceInboxInfo> list) {
        if (njy.e(list)) {
            return null;
        }
        for (DeviceInboxInfo deviceInboxInfo : list) {
            if (deviceInboxInfo.isBenefitInfoValid()) {
                return deviceInboxInfo;
            }
        }
        return null;
    }

    public static DevicePerfPurchaseInfo c(List<DevicePerfPurchaseInfo> list) {
        if (njy.e(list)) {
            return null;
        }
        for (DevicePerfPurchaseInfo devicePerfPurchaseInfo : list) {
            if (devicePerfPurchaseInfo.isBenefitInfoValid()) {
                return devicePerfPurchaseInfo;
            }
        }
        return null;
    }

    public static String c(Context context) {
        LogUtil.a("TradeUtils", "getDeviceUdidFromCert() in");
        String strE = SharedPreferenceManager.e(context, "device_udid_module", "device_udid_from_cert");
        try {
            if (!TextUtils.isEmpty(strE)) {
                return HwEncryptUtil.b(context).c(2, strE);
            }
            if (!SecurityCertUtils.e()) {
                return "";
            }
            if (f46253a) {
                ReleaseLogUtil.d("R_TradeUtils", "the last time getCertificateChains failed, return empty");
                return "";
            }
            X509Certificate[] x509CertificateArrC = SecurityCertUtils.c(context, new int[]{-65535}, "device_udid_from_cert".getBytes("utf-8"));
            if (x509CertificateArrC == null) {
                f46253a = true;
                ReleaseLogUtil.a("R_TradeUtils", "getCertificateChains failed, not get certificate chains next time");
                return "";
            }
            if (x509CertificateArrC.length != 4) {
                ReleaseLogUtil.a("R_TradeUtils", "getCertificateChains length is error, return empty");
                return "";
            }
            for (X509Certificate x509Certificate : x509CertificateArrC) {
                byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17");
                if (extensionValue != null && extensionValue.length > 0) {
                    strE = b(extensionValue);
                }
            }
            if (strE.indexOf("\u0000") >= 0) {
                strE = strE.replace("\u0000", "");
            }
            if (!TextUtils.isEmpty(strE)) {
                SharedPreferenceManager.e(context, "device_udid_module", "device_udid_from_cert", HwEncryptUtil.b(context).e(2, strE), null);
            }
            return strE;
        } catch (IOException | GeneralSecurityException e) {
            ReleaseLogUtil.a("R_TradeUtils", "getDeviceUdidByCert() exception ", e);
            return strE;
        }
    }

    private static String b(byte[] bArr) throws Throwable {
        try {
            try {
                ASN1Sequence aSN1SequenceE = e(bArr);
                if (aSN1SequenceE != null) {
                    ASN1Sequence objectAt = aSN1SequenceE.getObjectAt(7);
                    if (objectAt instanceof ASN1Sequence) {
                        byte[] bArrD = null;
                        for (ASN1TaggedObject aSN1TaggedObject : objectAt.toArray()) {
                            if (aSN1TaggedObject instanceof ASN1TaggedObject) {
                                ASN1TaggedObject aSN1TaggedObject2 = aSN1TaggedObject;
                                if (aSN1TaggedObject2.getTagNo() == 10006) {
                                    try {
                                        bArrD = d((ASN1Encodable) aSN1TaggedObject2.getObject());
                                    } catch (NoSuchMethodError unused) {
                                        ReleaseLogUtil.a("R_TradeUtils", "extractDeviceInfoFromCert() NoSuchMethodError getObject");
                                        bArrD = d((ASN1Encodable) aSN1TaggedObject2.getBaseUniversal(aSN1TaggedObject2.isExplicit(), 4));
                                    }
                                }
                            }
                        }
                        if (bArrD == null || bArrD.length <= 0) {
                            return null;
                        }
                        return new String(bArrD, "utf-8");
                    }
                }
                return null;
            } catch (NoSuchMethodError e) {
                e = e;
                ReleaseLogUtil.a("R_TradeUtils", "extractDeviceInfoFromCert() exception ", e.getClass().getSimpleName());
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            ReleaseLogUtil.a("R_TradeUtils", "extractDeviceInfoFromCert() exception ", e.getClass().getSimpleName());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable, org.bouncycastle.asn1.ASN1InputStream] */
    private static ASN1Sequence e(byte[] bArr) throws Throwable {
        Closeable aSN1InputStream;
        ASN1Sequence aSN1Sequence;
        ?? r0 = 0;
        Closeable closeable = null;
        if (bArr != null) {
            ?? length = bArr.length;
            try {
                if (length > 0) {
                    try {
                        length = new ASN1InputStream(bArr);
                        try {
                            ASN1OctetString object = length.readObject();
                            if (object instanceof ASN1OctetString) {
                                aSN1InputStream = new ASN1InputStream(object.getOctets());
                                try {
                                    ASN1Primitive object2 = aSN1InputStream.readObject();
                                    aSN1Sequence = object2 instanceof ASN1Sequence ? (ASN1Sequence) object2 : null;
                                    closeable = aSN1InputStream;
                                } catch (IOException e) {
                                    e = e;
                                    LogUtil.c("TradeUtils", "extractAttestationSequence() exception ", e);
                                    IoUtils.c(length);
                                    IoUtils.c(aSN1InputStream);
                                    return null;
                                }
                            } else {
                                aSN1Sequence = null;
                            }
                            IoUtils.c(length);
                            IoUtils.c(closeable);
                            return aSN1Sequence;
                        } catch (IOException e2) {
                            e = e2;
                            aSN1InputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            r0 = length;
                            IoUtils.c(r0);
                            IoUtils.c(0);
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        length = 0;
                        aSN1InputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        IoUtils.c(r0);
                        IoUtils.c(0);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    private static byte[] d(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            return new byte[0];
        }
        if (aSN1Encodable instanceof ASN1OctetString) {
            return ((ASN1OctetString) aSN1Encodable).getOctets();
        }
        LogUtil.c("TradeUtils", "getOctetStringFromAsn1() parse octet string failed");
        return new byte[0];
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("TradeUtils", "changeDotToComma content is empty");
            return str;
        }
        return str.replaceAll("\\.", ",");
    }

    public static void a(View view, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("TradeUtils", "back key pressed");
        TradeViewApi tradeViewApi = (TradeViewApi) Services.d("TradeService", TradeViewApi.class);
        if (tradeViewApi != null && view != null) {
            tradeViewApi.backIntercept(view, iBaseResponseCallback);
        } else {
            LogUtil.a("TradeUtils", "trade view is null: ", Boolean.valueOf(tradeViewApi == null), "purchase view is null ", Boolean.valueOf(view == null));
            iBaseResponseCallback.a(0, null);
        }
    }
}
