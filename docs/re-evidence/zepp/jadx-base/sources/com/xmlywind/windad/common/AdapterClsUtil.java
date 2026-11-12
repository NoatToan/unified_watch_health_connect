package com.xmlywind.windad.common;

import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.models.ADStrategy;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntityCommon;
import com.xmlywind.windad.Adapter.SigmobInterstitialAdapter;
import com.xmlywind.windad.Adapter.SigmobNativeUnifiedAdapter;
import com.xmlywind.windad.Adapter.SigmobRewardAdAdapter;
import com.xmlywind.windad.Adapter.SigmobSplashAdAdapter;
import com.xmlywind.windad.base.WindAdAdapter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class AdapterClsUtil {
    public static void checkAdapterCls() {
        try {
            try {
                String[] strArrSplit = AdapterClsUtil.class.getName().split("\\.");
                if (strArrSplit.length <= 2) {
                    return;
                }
                String str = strArrSplit[0] + "." + strArrSplit[1];
                HashMap map = new HashMap();
                map.put(11, str + ".Admob.GoogleAdmobRewardVideoAdapter");
                map.put(4, str + ".Vungle.VungleRewardVideoAdapter");
                map.put(15, str + ".Facebookaudiencenetwork.FacebookRewardVideoAdapter");
                map.put(7, str + ".Ironsource.IronsourceRewardVideoAdapter");
                map.put(5, str + ".AppLovin.AppLovinRewardVideoAdapter");
                map.put(6, str + ".UnityAds.UnityAdsRewardVideoAdapter");
                map.put(1, str + ".Mintegral.MintegralRewardVideoAdapter");
                map.put(13, str + ".toutiao.TouTiaoRewardVideoAdapter");
                map.put(16, str + ".gdt.GDTRewardVideoAdapter");
                map.put(18, str + ".oneway.OneWayRewardVideoAdapter");
                map.put(12, str + ".tapjoy.TapJoyRewardVideoAdapter");
                map.put(19, str + ".kuaishou.KuaiShouRewardVideoAdapter");
                for (Map.Entry entry : map.entrySet()) {
                    PointEntityCommon pointEntityCommon = new PointEntityCommon();
                    pointEntityCommon.setAc_type("20");
                    pointEntityCommon.setCategory(PointCategory.ADAPTER_PLUGIN);
                    String str2 = (String) entry.getValue();
                    int iIndexOf = str2.indexOf(".", str2.indexOf(".") + 1) + 1;
                    pointEntityCommon.setName(str2.substring(iIndexOf, str2.indexOf(".", iIndexOf)));
                    try {
                        Class<?> cls = Class.forName((String) entry.getValue());
                        if (cls.getSuperclass() == WindAdAdapter.class) {
                            int adapterVersion = ((WindAdAdapter) cls.newInstance()).getAdapterVersion();
                            pointEntityCommon.setVersion(String.valueOf(adapterVersion));
                            pointEntityCommon.setIntegration(1);
                            if (adapterVersion < SDKConfig.getRequireAdapterVersion(((Integer) entry.getKey()).intValue())) {
                                pointEntityCommon.setCompatible(0);
                            } else {
                                pointEntityCommon.setCompatible(1);
                            }
                        }
                    } catch (Exception e) {
                        pointEntityCommon.setIntegration(0);
                        SigmobLog.i("checkAdapterCls catch error:" + e.getMessage());
                    }
                    pointEntityCommon.commit();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    public static String getAdapterClsName(ADStrategy aDStrategy) {
        StringBuilder sb;
        String str;
        Class cls;
        String name = null;
        if (aDStrategy != null) {
            String[] strArrSplit = AdapterClsUtil.class.getName().split("\\.");
            if (strArrSplit.length > 2) {
                String str2 = strArrSplit[0] + "." + strArrSplit[1];
                switch (aDStrategy.getChannel_id()) {
                    case 1:
                        if (aDStrategy.getAdType() == 1) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".Mintegral.MintegralRewardVideoAdapter";
                        } else if (aDStrategy.getAdType() == 4) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".Mintegral.MintegralInterstitialAdapter";
                        } else if (aDStrategy.getAdType() == 2) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".Mintegral.MintegralSplashAdAdapter";
                        }
                        sb.append(str);
                        name = sb.toString();
                        break;
                    case 4:
                        if (aDStrategy.getAdType() == 1) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".Vungle.VungleRewardVideoAdapter";
                        } else if (aDStrategy.getAdType() == 4) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".Vungle.VungleInterstitialAdapter";
                        }
                        sb.append(str);
                        name = sb.toString();
                        break;
                    case 5:
                        if (aDStrategy.getAdType() != 1) {
                            aDStrategy.getAdType();
                        } else {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".AppLovin.AppLovinRewardVideoAdapter";
                            sb.append(str);
                            name = sb.toString();
                        }
                        break;
                    case 6:
                        if (aDStrategy.getAdType() == 1) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".UnityAds.UnityAdsRewardVideoAdapter";
                        } else if (aDStrategy.getAdType() == 4) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".UnityAds.UnityAdsInterstitialAdapter";
                        }
                        sb.append(str);
                        name = sb.toString();
                        break;
                    case 7:
                        if (aDStrategy.getAdType() != 1) {
                            aDStrategy.getAdType();
                        } else {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".Ironsource.IronsourceRewardVideoAdapter";
                            sb.append(str);
                            name = sb.toString();
                        }
                        break;
                    case 9:
                        if (aDStrategy.getAdType() == 1) {
                            cls = SigmobRewardAdAdapter.class;
                        } else if (aDStrategy.getAdType() == 4) {
                            cls = SigmobInterstitialAdapter.class;
                        } else if (aDStrategy.getAdType() == 2) {
                            cls = SigmobSplashAdAdapter.class;
                        } else if (aDStrategy.getAdType() == 5) {
                            cls = SigmobNativeUnifiedAdapter.class;
                        }
                        name = cls.getName();
                        break;
                    case 11:
                        if (aDStrategy.getAdType() == 1) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".Admob.GoogleAdmobRewardVideoAdapter";
                        } else if (aDStrategy.getAdType() == 4) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".Admob.GoogleAdmobInterstitialAdapter";
                        }
                        sb.append(str);
                        name = sb.toString();
                        break;
                    case 12:
                        if (aDStrategy.getAdType() == 1) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".tapjoy.TapJoyRewardVideoAdapter";
                        } else if (aDStrategy.getAdType() == 4) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".tapjoy.TapJoyInterstitialAdapter";
                        }
                        sb.append(str);
                        name = sb.toString();
                        break;
                    case 13:
                        if (aDStrategy.getAdType() == 1) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".toutiao.TouTiaoRewardVideoAdapter";
                        } else if (aDStrategy.getAdType() == 4) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".toutiao.TouTiaoInterstitialAdapter";
                        } else if (aDStrategy.getAdType() == 2) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".toutiao.TouTiaoSplashAdAdapter";
                        }
                        sb.append(str);
                        name = sb.toString();
                        break;
                    case 15:
                        if (aDStrategy.getAdType() != 1) {
                            aDStrategy.getAdType();
                        } else {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".Facebookaudiencenetwork.FacebookRewardVideoAdapter";
                            sb.append(str);
                            name = sb.toString();
                        }
                        break;
                    case 16:
                        if (aDStrategy.getAdType() == 1) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".gdt.GDTRewardVideoAdapter";
                        } else if (aDStrategy.getAdType() == 4) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".gdt.GDTInterstitialAdapter";
                        } else if (aDStrategy.getAdType() == 2) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".gdt.GDTSplashAdAdapter";
                        }
                        sb.append(str);
                        name = sb.toString();
                        break;
                    case 18:
                        if (aDStrategy.getAdType() == 1) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".oneway.OneWayRewardVideoAdapter";
                        } else if (aDStrategy.getAdType() == 4) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".oneway.OneWayInterstitialAdapter";
                        }
                        sb.append(str);
                        name = sb.toString();
                        break;
                    case 19:
                        if (aDStrategy.getAdType() == 1) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".kuaishou.KuaiShouRewardVideoAdapter";
                        } else if (aDStrategy.getAdType() == 4) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".kuaishou.KuaiShouInterstitialAdapter";
                        } else if (aDStrategy.getAdType() == 2) {
                            sb = new StringBuilder();
                            sb.append(str2);
                            str = ".kuaishou.KuaiShouSplashAdAdapter";
                        }
                        sb.append(str);
                        name = sb.toString();
                        break;
                }
                SigmobLog.i("find " + aDStrategy.getName() + " adapter class name " + name);
            }
        }
        return name;
    }
}
