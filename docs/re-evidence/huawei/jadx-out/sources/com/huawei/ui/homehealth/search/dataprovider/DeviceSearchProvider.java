package com.huawei.ui.homehealth.search.dataprovider;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.android.gms.wearable.PutDataRequest;
import com.huawei.browse.BrowsingBiEvent;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.device.activity.adddevice.PairingGuideActivity;
import com.huawei.ui.homehealth.search.GlobalSearchActivity;
import com.huawei.ui.homehealth.search.SearchResultFragment;
import com.huawei.ui.homehealth.search.dataprovider.DeviceSearchProvider;
import com.huawei.ui.main.R;
import defpackage.coq;
import defpackage.dru;
import defpackage.dxy;
import defpackage.edl;
import defpackage.eep;
import defpackage.efl;
import defpackage.elc;
import defpackage.elg;
import defpackage.elh;
import defpackage.elo;
import defpackage.era;
import defpackage.etn;
import defpackage.gvi;
import defpackage.lsy;
import defpackage.lvb;
import defpackage.lvi;
import defpackage.lvl;
import defpackage.mgg;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qtx;
import defpackage.rba;
import defpackage.rcv;
import defpackage.roq;
import defpackage.tal;
import defpackage.tqp;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class DeviceSearchProvider extends BaseKnitDataProvider<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f26041c;
    private List<String> e;
    private final qtx d = new qtx();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rcv f26039a = rcv.a(BaseApplication.getContext());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26040b = "KEY_LAST_DEVICE_TAB";

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void parseParams(Context context, HashMap<String, Object> map, Object obj) throws Throwable {
        d(context, map, obj);
    }

    private void d(Context context, HashMap<String, Object> map, Object obj) throws Throwable {
        map.clear();
        if (obj instanceof Map) {
            boolean zD = tal.d(this);
            Map map2 = (Map) obj;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            map.put("TITLE", context.getString(R.string.IDS_device_title_use));
            int i = 203;
            if (zD) {
                map.put("SHOWMORE", context.getString(com.huawei.ui.homehealth.R.string.IDS_device_show_more_heartrate_device));
                tal.d(context, "SHOW_MORE_CLICK_EVENT", map, 203);
                map.put("ITEM_LIMIT", 3);
            }
            if (njy.b(map2.get("CONNECTED_DEVICE_KEY"), dru.class)) {
                Iterator it = ((List) map2.get("CONNECTED_DEVICE_KEY")).iterator();
                while (it.hasNext()) {
                    b(context, (dru) it.next(), arrayList, arrayList2, arrayList3, arrayList4);
                    i = i;
                }
            }
            int i2 = i;
            if (njy.b(map2.get("ALL_DEVICE_KEY"), rba.class)) {
                for (rba rbaVar : (List) map2.get("ALL_DEVICE_KEY")) {
                    if (rbaVar != null) {
                        arrayList.add(rbaVar.g());
                        arrayList2.add(rbaVar.e());
                        arrayList3.add(rbaVar.d() == 1 ? Integer.valueOf(rbaVar.k()) : rbaVar.f());
                        arrayList4.add("");
                    }
                }
            }
            this.e = arrayList;
            map.put("ITEM_BI_EVENT_MAP", tal.b(i2, zD ? 200 : i2, GlobalSearchActivity.b(), this.e, arrayList));
            map.put("BI_OBSERVER_LABEL", gvi.b(zD ? 200 : i2));
            map.put("ITEM_TITLE", arrayList);
            map.put("ITEM_SUBTITLE", arrayList2);
            map.put("ITEM_IMAGE", arrayList3);
            map.put("ITEM_RIGHT_BTN", arrayList4);
            map.put("HIGHLIGHTED_TEXT", GlobalSearchActivity.b());
            d(context, map, obj, zD);
        }
    }

    private void b(Context context, dru druVar, List<String> list, List<String> list2, List<Object> list3, List<String> list4) throws Throwable {
        if (druVar == null) {
            return;
        }
        int iE = druVar.e();
        if (iE == 0) {
            e(druVar, list, list2, list3, list4);
        } else {
            if (iE != 1) {
                return;
            }
            d(context, druVar, list, list2, list3, list4);
        }
    }

    private void d(Context context, dru druVar, List<String> list, List<String> list2, List<Object> list3, List<String> list4) {
        Object objI = druVar.i();
        if (!(objI instanceof dxy)) {
            LogUtil.j("DeviceSearchProvider", "setWearDevice DeviceInfoForWear is null");
            return;
        }
        dxy dxyVar = (dxy) objI;
        String strI = dxyVar.i();
        if (TextUtils.isEmpty(strI)) {
            strI = tqp.a(context, dxyVar.d());
        } else if (strI.contains(Constants.LINK)) {
            strI = strI.replace(Constants.LINK, " -");
        }
        LogUtil.a("DeviceSearchProvider", "deviceName: ", strI);
        list.add(strI);
        list2.add("");
        list3.add(e(dxyVar));
        if (c(dxyVar)) {
            list4.add(qre.f(com.huawei.ui.homehealth.R.string.IDS_device_list_manage));
        } else {
            list4.add(qre.f(com.huawei.ui.homehealth.R.string.IDS_device_list_pair));
        }
    }

    private Bitmap e(dxy dxyVar) {
        int iG = dxyVar.g();
        LogUtil.a("DeviceSearchProvider", "getView wear device deviceType is : ", Integer.valueOf(iG));
        if (lvi.n(iG)) {
            LogUtil.a("DeviceSearchProvider", "is plugin download");
            String strJ = lvi.j(iG);
            LogUtil.a("DeviceSearchProvider", "is plugin download uuid:", strJ);
            boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strJ);
            LogUtil.a("DeviceSearchProvider", "is plugin download isPluginAvailable:", Boolean.valueOf(zIsResourcesAvailable));
            if (zIsResourcesAvailable) {
                edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
                LogUtil.a("DeviceSearchProvider", "getPluginInfo success update ui");
                return d(iG, pluginInfoByUuid, dxyVar);
            }
            return a(iG);
        }
        LogUtil.a("DeviceSearchProvider", "set imageView default.");
        if (!TextUtils.isEmpty(dxyVar.i()) && dxyVar.i().contains("HUAWEI CM-R1P")) {
            return qqf.a(qre.c(com.huawei.ui.homehealth.R.mipmap.id_devicemanager_r1_pro));
        }
        return b(iG, dxyVar);
    }

    private Bitmap d(int i, edl edlVar, dxy dxyVar) {
        if (edlVar != null && edlVar.i() != null) {
            String strE = eep.e(edlVar, 1, mgg.c(dxyVar.d(), "DeviceSearchProvider"));
            LogUtil.a("DeviceSearchProvider", "is plugin download image:", strE);
            return ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(edlVar, strE);
        }
        return a(i);
    }

    private Bitmap b(int i, dxy dxyVar) {
        Bitmap bitmapA = qqf.a(qre.c(CommonUtil.j(dxyVar.n())));
        return bitmapA != null ? bitmapA : a(i);
    }

    private Bitmap a(int i) {
        if (lvi.f(i)) {
            return qqf.a(qre.c(com.huawei.ui.homehealth.R.mipmap.device_icon_band_default));
        }
        return qqf.a(qre.c(com.huawei.ui.homehealth.R.mipmap.device_icon_watch_default));
    }

    private void e(dru druVar, List<String> list, List<String> list2, List<Object> list3, List<String> list4) throws Throwable {
        String asString;
        String strA;
        String strA2;
        Bitmap bitmapC;
        Object objI = druVar.i();
        if (!(objI instanceof elh)) {
            LogUtil.j("DeviceSearchProvider", "setThreeWayDevice ProductInfo is null");
            return;
        }
        elh elhVar = (elh) objI;
        ContentValues contentValuesD = druVar.d();
        if (contentValuesD == null) {
            asString = "";
        } else if (!TextUtils.isEmpty(contentValuesD.getAsString("sn"))) {
            asString = contentValuesD.getAsString("sn");
        } else {
            asString = contentValuesD.getAsString("uniqueId");
        }
        if (elhVar.d().size() <= 0) {
            LogUtil.a("DeviceSearchProvider", "item.getDescriptions().size() <= 0");
            strA = b(elhVar.l().d(), asString);
            strA2 = elhVar.l().e();
            bitmapC = qqf.a(qre.c(elo.a(elhVar.l().b())));
        } else {
            LogUtil.a("DeviceSearchProvider", "item.getDescriptions().size() > 0");
            String str = "9bf158ba-49b0-46aa-9fdf-ed75da1569cf".equals(elhVar.t()) ? "" : asString;
            if (!TextUtils.isEmpty(str)) {
                strA = b(elo.a(elhVar.t(), elhVar.l().d()), str);
            } else {
                strA = elo.a(elhVar.t(), elhVar.l().d());
            }
            strA2 = elo.a(elhVar.t(), elhVar.l().e());
            bitmapC = elo.c(elg.e().d(elhVar.t(), elhVar.l().b()));
        }
        if (strA == null || strA2 == null || bitmapC == null) {
            return;
        }
        list.add(strA);
        list2.add(strA2);
        list3.add(bitmapC);
        if ("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c".equals(elhVar.t()) && era.a(contentValuesD)) {
            list4.add(qre.f(com.huawei.ui.homehealth.R.string.IDS_device_list_pair));
        } else {
            list4.add(qre.f(com.huawei.ui.homehealth.R.string.IDS_device_list_manage));
        }
    }

    private String b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceSearchProvider", "name is empty");
            return "";
        }
        if (str.toUpperCase().contains(a(str2).toUpperCase())) {
            return str;
        }
        return str + a(str2).toUpperCase();
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("DeviceSearchProvider", "getDeviceIdentification identification is null");
            return "";
        }
        if (str.replace(":", "").length() < 3) {
            LogUtil.a("DeviceSearchProvider", "identification's length less than 3");
            return Constants.LINK + str.replace(":", "");
        }
        return Constants.LINK + str.replace(":", "").substring(str.replace(":", "").length() - 3);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return !EnvironmentInfo.m();
    }

    private void d(Context context, Map<String, Object> map, Object obj, boolean z) {
        if (obj instanceof Map) {
            Map map2 = (Map) obj;
            List<dru> list = njy.b(map2.get("CONNECTED_DEVICE_KEY"), dru.class) ? (List) map2.get("CONNECTED_DEVICE_KEY") : null;
            e(context, map, z, list == null ? 0 : list.size(), list, njy.b(map2.get("ALL_DEVICE_KEY"), rba.class) ? (List) map2.get("ALL_DEVICE_KEY") : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, dru druVar) {
        try {
            if (druVar.e() == 0) {
                elh elhVar = (elh) druVar.i();
                ContentValues contentValuesD = druVar.d();
                if (elhVar != null && contentValuesD != null) {
                    String asString = contentValuesD.getAsString("uniqueId");
                    String strT = elhVar.t();
                    if ("1".equals(elhVar.g())) {
                        etn.c(context, elhVar, strT, asString);
                        return;
                    }
                    if (BleConstants.BLE_THIRD_DEVICE_H5.equals(elhVar.n().b())) {
                        c(context, strT, asString, elhVar.n().b());
                        return;
                    }
                    if ("4bfc5a27-f2b9-4c41-bd9b-a4a2a18f752c".equals(strT)) {
                        a(context, contentValuesD);
                        return;
                    }
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    intent.setAction("SWITCH_PLUGINDEVICE");
                    bundle.putString("arg1", "DeviceInfoList");
                    bundle.putString("productId", elhVar.t());
                    if (asString == null) {
                        asString = "";
                    }
                    bundle.putString("uniqueId", asString);
                    intent.setPackage(roq.f47547c);
                    intent.setClassName(roq.f47547c, "com.huawei.health.device.ui.DeviceMainActivity");
                    bundle.putParcelable("commonDeviceInfo", contentValuesD);
                    intent.putExtras(bundle);
                    context.startActivity(intent);
                    return;
                }
                LogUtil.a("DeviceSearchProvider", "productInfo or deviceInfo is null");
                return;
            }
            if (druVar.e() == 1) {
                d(context, druVar);
            } else if (druVar.e() == 3) {
                context.startActivity(efl.a(druVar));
            } else {
                LogUtil.a("DeviceSearchProvider", "other device");
            }
        } catch (ActivityNotFoundException e) {
            LogUtil.e("DeviceSearchProvider", "deviceConnect exception", e.getMessage());
        }
    }

    private void d(Context context, dru druVar) {
        dxy dxyVar = (dxy) druVar.i();
        lvb.e().setSharedPreference("KEY_LAST_DEVICE_TAB", String.valueOf(0), null);
        if (c(dxyVar)) {
            d(context, dxyVar.d());
        } else {
            c(context, dxyVar);
        }
    }

    private void a(Context context, ContentValues contentValues) {
        LogUtil.a("DeviceSearchProvider", "enter dealJumpNemoActivity...");
        if (context == null) {
            LogUtil.j("DeviceSearchProvider", "context is null");
            return;
        }
        if (era.a(contentValues)) {
            Intent intent = new Intent(context, (Class<?>) DeviceMainActivity.class);
            intent.putExtra("PID_FROM_QRCODE", "ZAA6");
            intent.putExtra("productId", contentValues.getAsString("productId"));
            intent.putExtra("Device_Type", "082");
            intent.putExtra("macAddress", contentValues.getAsString("uniqueId"));
            context.startActivity(intent);
            return;
        }
        new elc().a(context, contentValues.getAsString("uniqueId"));
    }

    private boolean c(dxy dxyVar) {
        boolean zBooleanValue;
        boolean z = true;
        if (dxyVar.b() != 2) {
            Boolean bool = this.f26041c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                ArrayList<dxy> arrayListJ = lvl.j();
                if (arrayListJ.size() == 1) {
                    Boolean boolValueOf = Boolean.valueOf(arrayListJ.get(0).h());
                    this.f26041c = boolValueOf;
                    zBooleanValue = boolValueOf.booleanValue();
                } else {
                    z = false;
                }
            }
            z = true ^ zBooleanValue;
        }
        LogUtil.a("DeviceSearchProvider", "isConnectedDevice = ", Boolean.valueOf(z));
        return z;
    }

    private void c(Context context, dxy dxyVar) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.ui.homehealth.devicemanagercard.DeviceManagerWearNoConnect");
        intent.putExtra("is_cloud_device", dxyVar.h());
        intent.putExtra("device_name", dxyVar.i());
        intent.putExtra("device_identify", dxyVar.d());
        intent.putExtra("device_picID", dxyVar.o());
        intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, dxyVar.g());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("DeviceSearchProvider", "ActivityNotFoundException", e.getMessage());
        }
        tqp.e(context);
        LogUtil.a("DeviceSearchProvider", "onclick wear not connected name:", dxyVar.i(), "device_type :", Integer.valueOf(dxyVar.g()));
    }

    private void d(Context context, String str) {
        LogUtil.a("DeviceSearchProvider", "Enter openWearHome ");
        if (HwVersionManager.b(BaseApplication.getContext()).n(str)) {
            LogUtil.a("DeviceSearchProvider", "Enter openWearHome other device is OTAing");
            e(context, com.huawei.ui.homehealth.R.string.IDS_main_device_ota_error_message);
            return;
        }
        if (mgg.d("DeviceSearchProvider") != null) {
            try {
                if (HwVersionManager.b(BaseApplication.getContext()).m(str)) {
                    LogUtil.a("DeviceSearchProvider", "wear device is OTAing");
                    Intent intent = new Intent();
                    intent.setClassName(context, "com.huawei.ui.device.activity.update.UpdateVersionActivity");
                    intent.putExtra("device_id", str);
                    context.startActivity(intent);
                    return;
                }
            } catch (ActivityNotFoundException e) {
                LogUtil.e("DeviceSearchProvider", "ActivityNotFoundException", e.getMessage());
                return;
            }
        }
        SharedPreferenceManager.e(context, String.valueOf(10099), "key_ui_nps_enter_wear_home", "true", null);
        Intent intent2 = new Intent();
        intent2.setClassName(context, "com.huawei.ui.homewear21.home.WearHomeActivity");
        intent2.putExtra("device_id", str);
        context.startActivity(intent2);
        tqp.e(context);
    }

    private void e(Context context, int i) {
        if (context == null) {
            LogUtil.j("DeviceSearchProvider", "showTipDialog mContext is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getResources().getString(i)).c(com.huawei.ui.homehealth.R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: taf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("DeviceSearchProvider", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void c(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getContext().getPackageName());
        intent.setClassName(BaseApplication.getContext().getPackageName(), "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", elg.e().e(str));
        intent.putExtra("productId", str);
        elh elhVarD = ResourceManager.c().d(str);
        intent.putExtra("uniqueId", str2);
        if (elhVarD != null) {
            if (elhVarD.l() != null) {
                intent.putExtra("name", elhVarD.l().d());
            }
            if (elhVarD.m() != null) {
                intent.putExtra("deviceType", elhVarD.m().name());
            }
            if (elhVarD.v() != null) {
                intent.putExtra(com.huawei.operation.utils.Constants.KEY_BLE_SCAN_MODE, elhVarD.v().c());
            }
        }
        intent.putExtra("bleIntroductionType", str3);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("DeviceSearchProvider", "ActivityNotFoundException", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    public void e(Context context, rba rbaVar) {
        SearchResultFragment searchResultFragmentD;
        byte b2;
        Activity activity = BaseApplication.getActivity();
        if ((activity instanceof GlobalSearchActivity) && (searchResultFragmentD = ((GlobalSearchActivity) activity).d()) != null) {
            String strI = rbaVar.i();
            LogUtil.a("DeviceSearchProvider", "pairGuide,:", strI);
            if (TextUtils.isEmpty(strI)) {
                LogUtil.j("DeviceSearchProvider", "pairGuid is empty");
                return;
            }
            strI.hashCode();
            int iHashCode = strI.hashCode();
            if (iHashCode != 51) {
                if (iHashCode != 52) {
                    if (iHashCode == 54 && strI.equals("6")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (strI.equals("4")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (strI.equals("3")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                LogUtil.j("DeviceSearchProvider", "this device is no pair guide");
                if (qtx.b(rbaVar.h(), rbaVar.l())) {
                    c(rbaVar, searchResultFragmentD);
                    return;
                } else {
                    this.d.e(rbaVar, context, this.f26039a);
                    return;
                }
            }
            if (b2 == 1) {
                if (qtx.b(rbaVar.h(), rbaVar.l())) {
                    this.d.c(context, rbaVar);
                    return;
                } else {
                    this.d.e(rbaVar, context);
                    return;
                }
            }
            if (b2 == 2) {
                if (qtx.b(rbaVar.h(), rbaVar.l())) {
                    LogUtil.a("DeviceSearchProvider", "not support currently");
                }
            } else if (qtx.b(rbaVar.h(), rbaVar.l())) {
                if (coq.d(rbaVar.r())) {
                    return;
                }
                c(rbaVar, searchResultFragmentD);
            } else if (rbaVar.h().startsWith(PutDataRequest.WEAR_URI_SCHEME)) {
                a(rbaVar, context);
            } else if (rbaVar.h().equals("SMART_HEADPHONES")) {
                a(rbaVar, context);
            } else {
                LogUtil.j("DeviceSearchProvider", "invalid pairGuide");
            }
        }
    }

    private void a(rba rbaVar, Context context) {
        String strI = rbaVar.i();
        LogUtil.a("DeviceSearchProvider", "pairGuide,:", strI);
        if (TextUtils.isEmpty(strI)) {
            LogUtil.j("DeviceSearchProvider", "pairGuid is empty");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) PairingGuideActivity.class);
        List<String> listR = rbaVar.r();
        if (coq.d(listR)) {
            LogUtil.j("DeviceSearchProvider", "uuidList is empty");
            return;
        }
        if (listR instanceof ArrayList) {
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) listR);
        }
        intent.putExtra("kind_id", rbaVar.h());
        intent.putExtra("pair_guide", strI);
        intent.putExtra("bluetooth_type", rbaVar.c());
        intent.putExtra(AdShowExtras.DOWNLOAD_SOURCE, rbaVar.j());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("DeviceSearchProvider", "ActivityNotFoundException", e.getMessage());
        }
    }

    private void c(rba rbaVar, SearchResultFragment searchResultFragment) {
        LogUtil.a("DeviceSearchProvider", "startThirdDevicePairGuide");
        if (rbaVar == null || TextUtils.isEmpty(rbaVar.i())) {
            LogUtil.a("DeviceSearchProvider", "startThirdDevicePairGuide allDeviceItem or pairGuid is null");
        } else if (rbaVar.i().equals("3")) {
            searchResultFragment.a(rbaVar);
        } else {
            e(rbaVar, searchResultFragment.getContext());
        }
    }

    private void e(rba rbaVar, Context context) {
        if (rbaVar == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) PairingGuideActivity.class);
        intent.putExtra("kind_id", rbaVar.h());
        intent.putExtra("pair_guide", rbaVar.i());
        intent.putExtra("bluetooth_type", rbaVar.c());
        intent.putExtra(AdShowExtras.DOWNLOAD_SOURCE, rbaVar.j());
        List<String> listR = rbaVar.r();
        if (listR instanceof ArrayList) {
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) listR);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("DeviceSearchProvider", "ActivityNotFoundException", e.getMessage());
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData, reason: merged with bridge method [inline-methods] */
    public void e(final Context context, final SectionBean sectionBean) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lsy.a(new Runnable() { // from class: tad
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48854a.e(context, sectionBean);
                }
            });
            return;
        }
        Activity activity = BaseApplication.getActivity();
        if (!(activity instanceof GlobalSearchActivity)) {
            sectionBean.c((Object) null);
            return;
        }
        SearchResultFragment searchResultFragmentD = ((GlobalSearchActivity) activity).d();
        if (searchResultFragmentD == null) {
            sectionBean.c((Object) null);
            return;
        }
        Object objB = searchResultFragmentD.b(203);
        if (d(objB)) {
            sectionBean.c(objB);
        } else {
            LogUtil.e("DeviceSearchProvider", "check result return false");
            sectionBean.c((Object) null);
        }
    }

    private boolean d(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.containsKey("ALL_DEVICE_KEY") && map.containsKey("CONNECTED_DEVICE_KEY")) {
            Object obj2 = map.get("ALL_DEVICE_KEY");
            Object obj3 = map.get("CONNECTED_DEVICE_KEY");
            if (njy.b(obj2, rba.class) && njy.b(obj3, dru.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.search.dataprovider.DeviceSearchProvider$1, reason: invalid class name */
    public class AnonymousClass1 implements OnClickSectionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f26042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f26043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f26044c;
        final /* synthetic */ int d;
        final /* synthetic */ boolean h;

        public static /* synthetic */ void c(int i, Object obj) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, int i2) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(String str) {
        }

        AnonymousClass1(Context context, boolean z, int i, List list, List list2) {
            this.f26044c = context;
            this.h = z;
            this.d = i;
            this.f26042a = list;
            this.f26043b = list2;
        }

        @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
        public void onClick(int i) {
            if (qrs.r()) {
                LogUtil.a("DeviceSearchProvider", "click too fast");
                return;
            }
            BrowsingBiEvent browsingBiEvent = LoginInit.getBrowsingBiEvent();
            if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
                if (browsingBiEvent != null) {
                    browsingBiEvent.showFullServiceDialog(this.f26044c);
                    return;
                }
                return;
            }
            if (njy.c(DeviceSearchProvider.this.e, i)) {
                gvi.d(this.f26044c, GlobalSearchActivity.b(), 203, (String) DeviceSearchProvider.this.e.get(i), (String) DeviceSearchProvider.this.e.get(i), this.h);
            }
            if (i < this.d && njy.c(this.f26042a, i)) {
                if (!LoginInit.getInstance(this.f26044c).getIsLogined()) {
                    LoginInit.getInstance(this.f26044c).browsingToLogin(new IBaseResponseCallback() { // from class: tac
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public final void a(int i2, Object obj) {
                            DeviceSearchProvider.AnonymousClass1.c(i2, obj);
                        }
                    }, "");
                    return;
                } else {
                    DeviceSearchProvider.this.e(this.f26044c, (dru) this.f26042a.get(i));
                    return;
                }
            }
            if (njy.c(this.f26043b, i - this.d)) {
                rba rbaVar = (rba) this.f26043b.get(i - this.d);
                Context activity = BaseApplication.getActivity();
                DeviceSearchProvider deviceSearchProvider = DeviceSearchProvider.this;
                if (!(activity instanceof GlobalSearchActivity)) {
                    activity = this.f26044c;
                }
                deviceSearchProvider.e(activity, rbaVar);
                return;
            }
            LogUtil.j("DeviceSearchProvider", "invalid position: ", Integer.valueOf(i));
        }
    }

    private void e(Context context, Map<String, Object> map, boolean z, int i, List<dru> list, List<rba> list2) {
        map.put("CLICK_EVENT_LISTENER", new AnonymousClass1(context, z, i, list, list2));
    }
}
