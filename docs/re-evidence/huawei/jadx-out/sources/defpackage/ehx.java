package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.basefitnessadvice.api.HeartRateControlApi;
import com.huawei.health.ecologydevice.hearratecontrol.HeartRateControlConfigHelper;
import com.huawei.health.hearratecontrol.callback.ConfigCallBack;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.TargetConfig;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes7.dex */
public class ehx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, ffw> f33003c = new ConcurrentHashMap();
    private static final Map<String, fgf> d = new ConcurrentHashMap();

    protected static void b(int i, ffw ffwVar) {
        LogUtil.a("HeartRateControlManager", "addHeartRateControlInfo");
        if (ffwVar == null) {
            LogUtil.j("HeartRateControlManager", "heartRateControlInfo is null");
        } else {
            f33003c.put(HeartRateControlConfigHelper.e().c(i), ffwVar);
        }
    }

    public static void a(int i, final ConfigCallBack<ffw> configCallBack) {
        ffw ffwVar;
        LogUtil.a("HeartRateControlManager", "requestConfigInfo");
        String strC = HeartRateControlConfigHelper.e().c(i);
        Map<String, ffw> map = f33003c;
        if (map.containsKey(strC) && (ffwVar = map.get(strC)) != null) {
            LogUtil.a("HeartRateControlManager", "use caching");
            a(configCallBack, ffwVar);
        } else {
            LogUtil.a("HeartRateControlManager", "use local or net");
            HeartRateControlConfigHelper.e().c(new HeartRateControlConfigHelper.DownloadCallBack<ffw>() { // from class: ehx.4
                @Override // com.huawei.health.ecologydevice.hearratecontrol.HeartRateControlConfigHelper.DownloadCallBack
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onDownloadFinish(ffw ffwVar2) {
                    LogUtil.a("HeartRateControlManager", "success");
                    ehx.a((ConfigCallBack<ffw>) configCallBack, ffwVar2);
                }

                @Override // com.huawei.health.ecologydevice.hearratecontrol.HeartRateControlConfigHelper.DownloadCallBack
                public void onDownloadFail(int i2, String str) {
                    LogUtil.j("HeartRateControlManager", "course onDownloadFail:", Integer.valueOf(i2), ",msg:", str);
                    ehx.a((ConfigCallBack<ffw>) configCallBack, (ffw) null);
                }
            });
            HeartRateControlConfigHelper.e().e(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final ConfigCallBack<ffw> configCallBack, final ffw ffwVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: eid
            @Override // java.lang.Runnable
            public final void run() {
                configCallBack.onResponse(ffwVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final ConfigCallBack<fgf> configCallBack, final fgf fgfVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: eib
            @Override // java.lang.Runnable
            public final void run() {
                configCallBack.onResponse(fgfVar);
            }
        });
    }

    public static void a(final int i, final String str, final ConfigCallBack<FitWorkout> configCallBack) {
        LogUtil.a("HeartRateControlManager", "getCourseInfoByCourseId after requestConfigInfo");
        a(i, (ConfigCallBack<ffw>) new ConfigCallBack() { // from class: eii
            @Override // com.huawei.health.hearratecontrol.callback.ConfigCallBack
            public final void onResponse(Object obj) {
                ehx.c(i, str, (ffw) obj, configCallBack);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(int i, String str, ffw ffwVar, ConfigCallBack<FitWorkout> configCallBack) {
        LogUtil.a("HeartRateControlManager", "getCourseInfoByCourseId");
        if (ffwVar == null) {
            LogUtil.j("HeartRateControlManager", "heartRateControlInfo is null");
            e(configCallBack, (FitWorkout) null);
            return;
        }
        Iterator<ffx> it = ffwVar.getGroupLists().iterator();
        ffy ffyVar = null;
        while (it.hasNext()) {
            for (ffy ffyVar2 : it.next().getCourseInfoList()) {
                if (ffyVar2.getId().equals(str)) {
                    ffyVar = ffyVar2;
                    break;
                }
            }
        }
        if (ffyVar == null) {
            LogUtil.j("HeartRateControlManager", "tempCourseInfo is null");
            e(configCallBack, (FitWorkout) null);
        } else {
            c(i, ffyVar, configCallBack);
        }
    }

    private static void e(final ConfigCallBack<FitWorkout> configCallBack, final FitWorkout fitWorkout) {
        if (configCallBack != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ehz
                @Override // java.lang.Runnable
                public final void run() {
                    configCallBack.onResponse(fitWorkout);
                }
            });
        }
    }

    private static void c(final int i, final ffy ffyVar, final ConfigCallBack<FitWorkout> configCallBack) {
        LogUtil.a("HeartRateControlManager", "buildFitWorkout");
        final FitWorkout fitWorkout = new FitWorkout();
        fitWorkout.saveId(ffyVar.getId());
        fitWorkout.saveName(a(i, ffyVar.getCourseName()));
        fitWorkout.saveCalorie(ffyVar.getCalories());
        fitWorkout.saveDescription(a(i, ffyVar.getDescription()));
        fitWorkout.saveMidPicture(d(i, ffyVar.getDetailImage()));
        fitWorkout.savePicture(d(i, ffyVar.getThumbnail()));
        fitWorkout.saveDuration(ffyVar.getTotalTime());
        fitWorkout.setUpperHeartRateAdjust(ffyVar.getUpperHeartRateAdjust());
        fitWorkout.setLowerHeartRateAdjust(ffyVar.getLowerHeartRateAdjust());
        fitWorkout.saveDifficulty(ffyVar.getDifficulty());
        fitWorkout.saveVersion(ffyVar.getVersion());
        final HeartRateControlApi heartRateControlApi = (HeartRateControlApi) Services.b("BaseSportModel", HeartRateControlApi.class);
        heartRateControlApi.initPersonalParam(i, new ResponseCallback() { // from class: eic
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                ehx.c(i, ffyVar, heartRateControlApi, fitWorkout, configCallBack, i2, obj);
            }
        });
    }

    static /* synthetic */ void c(final int i, final ffy ffyVar, final HeartRateControlApi heartRateControlApi, final FitWorkout fitWorkout, final ConfigCallBack configCallBack, int i2, Object obj) {
        LogUtil.a("HeartRateControlManager", "initPersonalParam status = ", Integer.valueOf(i2));
        b(i, (ConfigCallBack<fgf>) new ConfigCallBack() { // from class: eia
            @Override // com.huawei.health.hearratecontrol.callback.ConfigCallBack
            public final void onResponse(Object obj2) {
                ehx.c(ffyVar, i, heartRateControlApi, fitWorkout, configCallBack, (fgf) obj2);
            }
        });
    }

    static /* synthetic */ void c(ffy ffyVar, int i, HeartRateControlApi heartRateControlApi, FitWorkout fitWorkout, ConfigCallBack configCallBack, fgf fgfVar) {
        LogUtil.a("HeartRateControlManager", "requestGlobalConfigByType success");
        b(ffyVar, i, heartRateControlApi, fitWorkout, fgfVar);
        e((ConfigCallBack<FitWorkout>) configCallBack, fitWorkout);
    }

    private static void b(ffy ffyVar, int i, HeartRateControlApi heartRateControlApi, FitWorkout fitWorkout, fgf fgfVar) {
        LogUtil.a("HeartRateControlManager", "computerAlgorithmPara");
        ArrayList arrayList = new ArrayList();
        for (fge fgeVar : ffyVar.getStageList()) {
            ChoreographedSingleAction choreographedSingleAction = new ChoreographedSingleAction();
            TargetConfig targetConfig = new TargetConfig();
            targetConfig.setValueL(fgeVar.getDuration());
            targetConfig.setValueType(1);
            choreographedSingleAction.setTargetConfig(targetConfig);
            AtomicAction atomicAction = new AtomicAction();
            atomicAction.setId(String.valueOf(fgeVar.getStageNo()));
            atomicAction.setName(a(i, fgeVar.getStageName()));
            choreographedSingleAction.setAction(atomicAction);
            Pair<Integer, Integer> courseZoneHeartRateScope = heartRateControlApi.getCourseZoneHeartRateScope(new Pair<>(Float.valueOf(fgeVar.getZoneMin()), Float.valueOf(fgeVar.getZoneMax())), fgeVar.getZoneType());
            TargetConfig targetConfig2 = new TargetConfig();
            targetConfig2.setValueType(TargetConfig.ValueTypes.RANGE_VALUE.getValue());
            targetConfig2.setValueL(((Integer) courseZoneHeartRateScope.first).intValue());
            targetConfig2.setValueH(((Integer) courseZoneHeartRateScope.second).intValue());
            choreographedSingleAction.setIntensityConfig(targetConfig2);
            int courseZoneTargetHeartRate = heartRateControlApi.getCourseZoneTargetHeartRate(courseZoneHeartRateScope);
            choreographedSingleAction.putExtendProperty("target_heart_rate", String.valueOf(courseZoneTargetHeartRate));
            if (i == 265) {
                choreographedSingleAction.putExtendProperty("rpm_min", String.valueOf(fgeVar.getRpmMin()));
                choreographedSingleAction.putExtendProperty("rpm_max", String.valueOf(fgeVar.getRpmMax()));
            } else {
                choreographedSingleAction.putExtendProperty("target_speed", String.valueOf(heartRateControlApi.getCourseZoneTargetSpeed(courseZoneTargetHeartRate)));
                Pair<Float, Float> courseZoneSpeedScope = heartRateControlApi.getCourseZoneSpeedScope(courseZoneHeartRateScope, fgfVar.getMaximumSafeRateLimit());
                choreographedSingleAction.putExtendProperty("target_speed_min", String.valueOf(courseZoneSpeedScope.first));
                choreographedSingleAction.putExtendProperty("target_speed_max", String.valueOf(courseZoneSpeedScope.second));
            }
            arrayList.add(choreographedSingleAction);
        }
        ChoreographedMultiActions choreographedMultiActions = new ChoreographedMultiActions();
        choreographedMultiActions.setActionList(arrayList);
        choreographedMultiActions.setRepeatTimes(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(choreographedMultiActions);
        fitWorkout.setCourseActions(arrayList2);
    }

    protected static void c(int i, fgf fgfVar) {
        LogUtil.a("HeartRateControlManager", "addGlobalConfig");
        if (fgfVar == null) {
            LogUtil.j("HeartRateControlManager", "speedControlConfigInfo is null");
        } else {
            d.put(HeartRateControlConfigHelper.e().d(i), fgfVar);
        }
    }

    public static void b(int i, final ConfigCallBack<fgf> configCallBack) {
        fgf fgfVar;
        String strD = HeartRateControlConfigHelper.e().d(i);
        Map<String, fgf> map = d;
        if (map.containsKey(strD) && (fgfVar = map.get(strD)) != null) {
            c(configCallBack, fgfVar);
        } else {
            HeartRateControlConfigHelper.e().d(new HeartRateControlConfigHelper.DownloadCallBack<fgf>() { // from class: ehx.2
                @Override // com.huawei.health.ecologydevice.hearratecontrol.HeartRateControlConfigHelper.DownloadCallBack
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onDownloadFinish(fgf fgfVar2) {
                    ehx.c((ConfigCallBack<fgf>) configCallBack, fgfVar2);
                }

                @Override // com.huawei.health.ecologydevice.hearratecontrol.HeartRateControlConfigHelper.DownloadCallBack
                public void onDownloadFail(int i2, String str) {
                    LogUtil.j("HeartRateControlManager", "config onDownloadFail:", Integer.valueOf(i2), ",msg:", str);
                    ehx.c((ConfigCallBack<fgf>) configCallBack, (fgf) null);
                }
            });
            HeartRateControlConfigHelper.e().e(i);
        }
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder(10);
        sb.append(fdy.d(HeartRateControlConfigHelper.e().b(i), "heart_rate_control_configuration", (String) null) + File.separator + "heart_rate_control_configuration" + File.separator + "img" + File.separator);
        sb.append(str);
        sb.append(".png");
        return CommonUtil.c(sb.toString());
    }

    public static String a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return c(i, str);
    }

    private static String c(int i, String str) throws Throwable {
        InputStream fileInputStream;
        int length;
        NamedNodeMap attributes;
        Node namedItem;
        String strReplace = "";
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        try {
            emm.d(documentBuilderFactoryNewInstance);
        } catch (ParserConfigurationException e) {
            LogUtil.e("HeartRateControlManager", "ResourceLoader getStringFormat e:", e.getMessage());
        }
        InputStream inputStream = null;
        inputStream = null;
        inputStream = null;
        InputStream inputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(a(i));
                try {
                    NodeList childNodes = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(fileInputStream).getDocumentElement().getChildNodes();
                    if (childNodes == null) {
                        IoUtils.c(fileInputStream);
                        return "";
                    }
                    int i2 = 0;
                    while (true) {
                        length = childNodes.getLength();
                        if (i2 >= length) {
                            break;
                        }
                        Node nodeItem = childNodes.item(i2);
                        if (nodeItem.getNodeType() == 1 && (attributes = nodeItem.getAttributes()) != null && (namedItem = attributes.getNamedItem("name")) != null && str != null && str.equals(namedItem.getNodeValue())) {
                            strReplace = nodeItem.getTextContent().replace("\\n", System.lineSeparator());
                        }
                        i2++;
                    }
                    IoUtils.c(fileInputStream);
                    inputStream = length;
                } catch (IOException e2) {
                    e = e2;
                    inputStream2 = fileInputStream;
                    LogUtil.e("HeartRateControlManager", "getStringFormat", e.getMessage());
                    IoUtils.c(inputStream2);
                    inputStream = inputStream2;
                } catch (ParserConfigurationException e3) {
                    e = e3;
                    inputStream2 = fileInputStream;
                    LogUtil.e("HeartRateControlManager", "getStringFormat", e.getMessage());
                    IoUtils.c(inputStream2);
                    inputStream = inputStream2;
                } catch (SAXException e4) {
                    e = e4;
                    inputStream2 = fileInputStream;
                    LogUtil.e("HeartRateControlManager", "getStringFormat", e.getMessage());
                    IoUtils.c(inputStream2);
                    inputStream = inputStream2;
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = inputStream;
            }
        } catch (IOException e5) {
            e = e5;
        } catch (ParserConfigurationException e6) {
            e = e6;
        } catch (SAXException e7) {
            e = e7;
        }
        return strReplace;
    }

    private static String a(int i) {
        String strB = LanguageUtil.b(BaseApplication.getContext());
        String strC = c(strB);
        StringBuilder sb = new StringBuilder(10);
        String str = fdy.d(HeartRateControlConfigHelper.e().b(i), "heart_rate_control_configuration", (String) null) + File.separator + "heart_rate_control_configuration" + File.separator + "lang" + File.separator + "strings";
        sb.append(str);
        sb.append(strB);
        sb.append(Constants.LINK);
        sb.append(strC);
        sb.append(WatchFaceConstant.XML_SUFFIX);
        String strC2 = CommonUtil.c(sb.toString());
        if (strC2 != null && new File(strC2).exists()) {
            return strC2;
        }
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append(str);
        sb2.append(WatchFaceConstant.XML_SUFFIX);
        return CommonUtil.c(sb2.toString());
    }

    private static String c(String str) {
        String country = Locale.getDefault().getCountry();
        if (MLAsrConstants.LAN_ZH.equals(str)) {
            if (LanguageUtil.l(BaseApplication.getContext())) {
                return "rCN";
            }
            if ("HK".equals(country)) {
                return "HK";
            }
            return "TW";
        }
        if ("bo".equals(str)) {
            return "CN";
        }
        LogUtil.a("HeartRateControlManager", "is other language ", country);
        return country;
    }

    public static void e() {
        LogUtil.a("HeartRateControlManager", "cleanCache");
        f33003c.clear();
        d.clear();
    }
}
