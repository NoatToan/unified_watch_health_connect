package defpackage;

import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.R;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class ucu {
    private static void d(final int i, final HttpResCallback httpResCallback) {
        final HashMap<String, String> mapC = trd.c();
        mapC.put(CommonUtil.PAGE_TYPE, String.valueOf(i));
        mapC.put("maxSize", "6");
        mapC.put(CloudParamKeys.CLIENT_TYPE, String.valueOf(qrs.d()));
        mapC.put("infoType", String.valueOf(2));
        if (i == 3) {
            mapC.put("decompressType", String.valueOf(-1));
        }
        final HashMap<String, String> mapD = trd.d();
        GRSManager.c(BaseApplication.getContext()).d("messageCenterUrl", new GrsQueryCallback() { // from class: ucu.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                String str2;
                LogUtil.a("FavoritesRequestUtils", "requestFavoritesCloudData onCallBackSuccess");
                int i2 = i;
                if (i2 == 1) {
                    str2 = str + "/messageCenter/getFavoriteAudios";
                } else if (i2 == 3) {
                    str2 = str + "/messageCenter/v2/getFavoriteAudios";
                } else {
                    LogUtil.a("page type error", new Object[0]);
                    str2 = "";
                }
                String str3 = str2 + CommonUtil.getUrlSuffix();
                LogUtil.a("FavoritesRequestUtils", "url: ", str3);
                LogUtil.a("FavoritesRequestUtils", "params: ", mapC.toString());
                LogUtil.a("FavoritesRequestUtils", "headers: ", mapD.toString());
                ltg.c(str3, mapC, mapD, httpResCallback);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i2) {
                LogUtil.j("FavoritesRequestUtils", "requestFavoritesCloudData grs get url errorCode ", Integer.valueOf(i2));
            }
        });
    }

    public static void a(final int i, final CommonUiBaseResponse commonUiBaseResponse) {
        if (!oco.d(BaseApplication.getContext())) {
            LogUtil.j("FavoritesRequestUtils", "initFavoritesData network not connect");
            b(i, e(i), commonUiBaseResponse, true);
        } else {
            d(i, new HttpResCallback() { // from class: ucs
                @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
                public final void onFinished(int i2, String str) {
                    ucu.c(commonUiBaseResponse, i, i2, str);
                }
            });
        }
    }

    static /* synthetic */ void c(CommonUiBaseResponse commonUiBaseResponse, int i, int i2, String str) {
        if (commonUiBaseResponse == null) {
            return;
        }
        if (i2 != 200 || TextUtils.isEmpty(str)) {
            LogUtil.j("FavoritesRequestUtils", "getFavoriteAudios resCode = ", Integer.valueOf(i2), " or result is empty");
            b(i, e(i), commonUiBaseResponse, true);
            commonUiBaseResponse.onResponse(-1, null);
            return;
        }
        b(i, str, commonUiBaseResponse, false);
    }

    private static void b(int i, String str, CommonUiBaseResponse commonUiBaseResponse, boolean z) {
        LogUtil.a("FavoritesRequestUtils", "parseFavoritesData getFavoriteAudios result = ", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("FavoritesRequestUtils", "parseFavoritesData result is empty");
            commonUiBaseResponse.onResponse(-1, null);
        } else if (i == 1) {
            c(str, commonUiBaseResponse, z);
        } else if (i == 3) {
            b(str, commonUiBaseResponse, z);
        } else {
            LogUtil.j("FavoritesRequestUtils", "parseFavoritesData not match type ", Integer.valueOf(i));
        }
    }

    private static void c(String str, CommonUiBaseResponse commonUiBaseResponse, boolean z) {
        try {
            commonUiBaseResponse.onResponse(0, (ubo) HiJsonUtil.d(str, ubo.class));
            b(str);
        } catch (JsonSyntaxException unused) {
            commonUiBaseResponse.onResponse(-1, "sleep parse json fail");
            if (z) {
                return;
            }
            b(1, e(1), commonUiBaseResponse, true);
        }
    }

    private static void b(String str, CommonUiBaseResponse commonUiBaseResponse, boolean z) {
        try {
            commonUiBaseResponse.onResponse(0, (ubo) HiJsonUtil.d(str, ubo.class));
            c(str);
        } catch (JsonSyntaxException unused) {
            commonUiBaseResponse.onResponse(-1, "pressure parse json fail");
            if (z) {
                return;
            }
            b(3, e(3), commonUiBaseResponse, true);
        }
    }

    private static void b(String str) {
        if (str == null || !str.equals(e(1))) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_COIN_DROP), "sleep_audios_sp_key", str, new StorageParams());
        }
    }

    private static void c(String str) {
        if (str == null || !str.equals(e(3))) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_COIN_DROP), "pressure_audios_sp_key", str, new StorageParams());
        }
    }

    private static String e(int i) {
        if (i == 1) {
            return d();
        }
        if (i == 3) {
            return a();
        }
        return "";
    }

    private static String d() {
        return SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_COIN_DROP), "sleep_audios_sp_key");
    }

    private static String a() {
        return SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(PrebakedEffectId.RT_COIN_DROP), "pressure_audios_sp_key");
    }

    private static String a(List<ubs> list, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (ubs ubsVar : list) {
            if (ubsVar != null) {
                if (TextUtils.isEmpty(ubsVar.a()) || TextUtils.isEmpty(ubsVar.b())) {
                    LogUtil.d("FavoritesRequestUtils", "getSleepConfiguredData icon or url is empty");
                } else if (!VersionControlUtil.isSupportOperationAccount() && ubsVar.i() != 0) {
                    LogUtil.j("FavoritesRequestUtils", "getCardContent minor account not show vip course:", ubsVar.g());
                } else {
                    SingleGridContent.Builder builder = new SingleGridContent.Builder();
                    builder.setPicture(ubsVar.a());
                    builder.setLinkValue(a(z, ubsVar));
                    builder.setDescriptionVisibility(true);
                    builder.setTheme(ubsVar.g());
                    builder.setThemeVisibility(true);
                    SingleGridContent singleGridContent = new SingleGridContent(builder);
                    singleGridContent.setHeatCount(ubsVar.e());
                    singleGridContent.setLabelType(ubsVar.f());
                    singleGridContent.setVip(ubsVar.i());
                    e(singleGridContent, ubsVar);
                    arrayList.add(singleGridContent);
                }
            }
        }
        if (arrayList.isEmpty()) {
            LogUtil.j("FavoritesRequestUtils", "getCardContent list is empty");
            return "";
        }
        GridTemplate gridTemplate = new GridTemplate();
        gridTemplate.setLinkValue(b(z, str));
        gridTemplate.setGridContents(arrayList);
        gridTemplate.setSleepAudioType(3);
        gridTemplate.setNameVisibility(true);
        gridTemplate.setName(BaseApplication.getContext().getResources().getString(R.string.IDS_core_sleep_my_favorites));
        String json = new GsonBuilder().disableHtmlEscaping().create().toJson(gridTemplate);
        LogUtil.d("FavoritesRequestUtils", "getSleepConfiguredData item ", json);
        return json;
    }

    private static String a(boolean z, ubs ubsVar) {
        String str;
        if ("1".equals(ubsVar.c())) {
            LogUtil.a("FavoritesRequestUtils", "series detail utl not need tranfer");
            return ubsVar.b();
        }
        int iD = ubsVar.d();
        if (iD == 0) {
            LogUtil.a("FavoritesRequestUtils", "id error: ", Integer.valueOf(iD));
            return "";
        }
        if (z) {
            str = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&id=" + iD + "&type=sleepAudio&statusBarTextBlack&isImmerse";
        } else {
            str = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&id=" + iD + "&type=decompressAudio&statusBarTextBlack&isImmerse";
        }
        LogUtil.a("FavoritesRequestUtils", "tansferDetailUrl url: ", str);
        return str;
    }

    private static String b(boolean z, String str) {
        if (z) {
            return "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioFavoriteList&type=sleepAudio&statusBarTextBlack&isImmerse";
        }
        return "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioFavoriteList&type=decompressAudio&statusBarTextBlack&isImmerse";
    }

    private static void e(SingleGridContent singleGridContent, ubs ubsVar) {
        singleGridContent.setInfoType(ubsVar.c());
        if (ubsVar.i() == 1) {
            singleGridContent.setCorner(qre.f(R.string.IDS_vip));
            singleGridContent.setCornerColor("#F2BA49");
            singleGridContent.setCornerVisibility(true);
        } else if (ubsVar.i() == 2) {
            singleGridContent.setCorner(qre.f(R.string.IDS_sug_series_course_pay));
            singleGridContent.setCornerColor("#FF6522");
            singleGridContent.setCornerVisibility(true);
        }
    }

    public static Map<Integer, ResourceResultInfo> a(ubo uboVar) {
        HashMap map = new HashMap();
        List<ubs> listC = c(uboVar);
        if (njy.e(listC)) {
            LogUtil.j("FavoritesRequestUtils", "getFavoritesResult sleepAudios is null");
            return map;
        }
        if (uboVar == null) {
            LogUtil.j("FavoritesRequestUtils", "favoritesModel is null");
            return map;
        }
        String strA = a(listC, uboVar.d(), true);
        if (strA.isEmpty()) {
            LogUtil.j("FavoritesRequestUtils", "getFavoritesResult json is empty");
            return map;
        }
        ResourceBriefInfo resourceBriefInfo = new ResourceBriefInfo(new ResourceBriefInfo.Builder().setContentType(79).setContent(new ResourceContentBase(new ResourceContentBase.Builder().setContent(strA))).setPriority(uboVar.c()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(resourceBriefInfo);
        ResourceResultInfo.Builder totalNum = new ResourceResultInfo.Builder().setResources(arrayList).setTotalNum(1);
        totalNum.setResources(arrayList);
        map.put(Integer.valueOf(WearableStatusCodes.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED), new ResourceResultInfo(totalNum));
        return map;
    }

    public static Map<Integer, ResourceResultInfo> d(ubo uboVar) {
        HashMap map = new HashMap();
        List<ubs> listC = c(uboVar);
        if (njy.e(listC)) {
            LogUtil.j("FavoritesRequestUtils", "getFavoritesResult sleepAudios is null");
            return map;
        }
        if (uboVar == null) {
            LogUtil.j("FavoritesRequestUtils", "favoritesModel is null");
            return map;
        }
        String strA = a(listC, uboVar.d(), false);
        if (strA.isEmpty()) {
            LogUtil.j("FavoritesRequestUtils", "getFavoritesResult json is empty");
            return map;
        }
        ResourceBriefInfo resourceBriefInfo = new ResourceBriefInfo(new ResourceBriefInfo.Builder().setContentType(92).setContent(new ResourceContentBase(new ResourceContentBase.Builder().setContent(strA))).setPriority(uboVar.c()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(resourceBriefInfo);
        ResourceResultInfo.Builder totalNum = new ResourceResultInfo.Builder().setResources(arrayList).setTotalNum(1);
        totalNum.setResources(arrayList);
        map.put(4007, new ResourceResultInfo(totalNum));
        return map;
    }

    public static CopyOnWriteArrayList<dlo> b(ubo uboVar) {
        List<ubs> listC = c(uboVar);
        CopyOnWriteArrayList<dlo> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (njy.e(listC)) {
            LogUtil.j("FavoritesRequestUtils", "getSleepConfiguredData sleepAudios is null");
            return copyOnWriteArrayList;
        }
        LogUtil.a("FavoritesRequestUtils", "getSleepConfiguredData sleepAudios size ", Integer.valueOf(listC.size()));
        dlo dloVar = new dlo();
        dloVar.c(1);
        dloVar.e(1);
        dloVar.a(1);
        dloVar.d(1);
        dloVar.b(14);
        dloVar.j(2);
        dloVar.b(BaseApplication.getContext().getResources().getString(R.string.IDS_core_sleep_my_favorites));
        if (uboVar != null) {
            dloVar.c(uboVar.d());
            dloVar.f(uboVar.c());
        }
        for (ubs ubsVar : listC) {
            if (ubsVar != null) {
                dlm dlmVar = new dlm();
                if (TextUtils.isEmpty(ubsVar.a()) || TextUtils.isEmpty(ubsVar.b())) {
                    LogUtil.d("FavoritesRequestUtils", "getSleepConfiguredData icon or url is empty");
                } else {
                    dlmVar.d(ubsVar.b());
                    dlmVar.h(ubsVar.a());
                    dlmVar.j(3);
                    dlmVar.j(ubsVar.g());
                    dlmVar.h(ubsVar.e());
                    dlmVar.o(ubsVar.f());
                    dloVar.c(dlmVar);
                    LogUtil.d("FavoritesRequestUtils", "getSleepConfiguredData item ", dlmVar.toString());
                }
            }
        }
        copyOnWriteArrayList.add(dloVar);
        LogUtil.a("FavoritesRequestUtils", "getSleepConfiguredData list size ", Integer.valueOf(copyOnWriteArrayList.size()));
        return copyOnWriteArrayList;
    }

    private static List<ubs> c(ubo uboVar) {
        if (uboVar == null) {
            LogUtil.j("FavoritesRequestUtils", "getSleepAudioList favoritesModel is null");
            return null;
        }
        if (uboVar.a() != 0) {
            LogUtil.j("FavoritesRequestUtils", "getSleepAudioList resultCode ", Integer.valueOf(uboVar.a()));
            return null;
        }
        List<ubs> listE = uboVar.e();
        if (njy.e(listE)) {
            LogUtil.j("FavoritesRequestUtils", "getSleepAudioList sleepAudios is empty");
            return null;
        }
        LogUtil.a("FavoritesRequestUtils", "getSleepAudioList sleepAudios ", Integer.valueOf(listE.size()));
        e(listE);
        return listE;
    }

    private static void e(List<ubs> list) {
        ArrayList<ubs> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (ubs ubsVar : arrayList) {
            if ("1".equals(ubsVar.c())) {
                arrayList2.add(ubsVar);
            } else if ("0".equals(ubsVar.c())) {
                arrayList3.add(ubsVar);
            } else {
                LogUtil.a("FavoritesRequestUtils", "audio InfoType is invalid");
            }
        }
        list.clear();
        list.addAll(arrayList2);
        list.addAll(arrayList3);
    }
}
