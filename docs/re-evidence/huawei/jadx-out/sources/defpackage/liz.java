package defpackage;

import android.content.Context;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.ISubscribeListener;
import com.huawei.hihealth.IUnSubscribeListener;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.thirdpartservice.healthconnect.HealthConnectProviderApi;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class liz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseIntArray f40322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<Integer, a> f40323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<Integer, ISubscribeListener> f40324c;
    private ExecutorService d;
    private HashMap<Integer, Integer> e;
    private ExecutorService g;
    private SparseArray<RemoteCallbackList<ISubscribeListener>> h;

    private boolean c(int i) {
        return i == 22 || i == 13 || i == 24 || i == 25 || i == 26 || i == 27 || i == 28 || i == 29 || i == 30 || i == 31 || i == 32 || i == 33 || i == 34 || i == 35;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f40322a = sparseIntArray;
        sparseIntArray.append(1, 1);
        f40322a.append(2, 4);
        f40322a.append(3, 2);
        f40322a.append(4, HiSubscribeType.f12260b);
        f40322a.append(7, 5);
        f40322a.append(9, 3);
        f40322a.append(16, 18);
        f40322a.append(11, 14);
    }

    private liz() {
        this.h = new SparseArray<>(10);
        this.f40324c = new HashMap<>(16);
        this.e = new HashMap<>(16);
        this.g = Executors.newSingleThreadExecutor();
        this.d = Executors.newSingleThreadExecutor();
        this.f40323b = new HashMap<>(16);
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final liz f40338a = new liz();
    }

    public static liz a() {
        return c.f40338a;
    }

    public void b(final List list, final ISubscribeListener iSubscribeListener, final List<Integer> list2, final List<Integer> list3) {
        if (this.g.isShutdown()) {
            LogUtil.e("HiH_ListenerManager", "registerListener mSubscribeThread is closed! Restarting...");
            this.g = Executors.newSingleThreadExecutor();
        }
        this.g.execute(new Runnable() { // from class: liz.3
            @Override // java.lang.Runnable
            public void run() {
                List list4 = list;
                if (list4 == null || list4.isEmpty() || iSubscribeListener == null) {
                    LogUtil.j("HiH_ListenerManager", "registerListener typeList is null or empty");
                    ktu.c(iSubscribeListener, null, null);
                    return;
                }
                try {
                    for (Object obj : new CopyOnWriteArrayList(list)) {
                        if (obj instanceof Integer) {
                            Integer num = (Integer) obj;
                            Integer numB = liz.this.b(num, iSubscribeListener);
                            if (numB == null) {
                                list3.add(num);
                            } else {
                                list2.add(numB);
                            }
                        }
                    }
                    ktu.c(iSubscribeListener, list2, list3);
                } catch (Exception e) {
                    ReleaseLogUtil.a("HiH_ListenerManager", "registerListener Exception" + e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer b(Integer num, ISubscribeListener iSubscribeListener) {
        if (num == null || iSubscribeListener == null) {
            LogUtil.j("registerListener not right", new Object[0]);
            return null;
        }
        int iIntValue = num.intValue();
        if (!HiSubscribeType.b(iIntValue)) {
            LogUtil.j("registerListener this type can not be subscribed ,type = ", num);
            return null;
        }
        Integer numB = b(iIntValue);
        if (numB == null) {
            LogUtil.j("registerListener can not get a key", new Object[0]);
            return null;
        }
        a(numB, num, iSubscribeListener);
        return numB;
    }

    public void e(final List list, final IUnSubscribeListener iUnSubscribeListener) {
        if (this.g.isShutdown()) {
            LogUtil.e("HiH_ListenerManager", "unregisterListener mSubscribeThread is closed! Restarting...");
            this.g = Executors.newSingleThreadExecutor();
        }
        this.g.execute(new Runnable() { // from class: liz.5
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HiH_ListenerManager", "unregisterListener unsubscribeList = ", list);
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    ktu.b(iUnSubscribeListener, false);
                    return;
                }
                for (Object obj : list) {
                    if (obj instanceof Integer) {
                        liz.this.b((Integer) obj);
                    }
                }
                ktu.b(iUnSubscribeListener, true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Integer num) {
        if (num == null) {
            LogUtil.j("HiH_ListenerManager", "unregisterListenerByKey key = null");
            return;
        }
        Integer num2 = this.e.get(num);
        if (num2 == null) {
            ReleaseLogUtil.e("HiH_ListenerManager", "This key hasn't type, key is ", num);
            return;
        }
        LogUtil.d("HiH_ListenerManager", "unregisterListenerByKey type = ", num2);
        RemoteCallbackList<ISubscribeListener> remoteCallbackList = this.h.get(num2.intValue());
        if (remoteCallbackList == null) {
            LogUtil.j("HiH_ListenerManager", "unregisterListenerByKey listeners == null");
            return;
        }
        ISubscribeListener iSubscribeListener = this.f40324c.get(num);
        LogUtil.d("HiH_ListenerManager", "unregisterListenerByKey size = ", Integer.valueOf(this.f40324c.size()));
        if (iSubscribeListener == null) {
            LogUtil.j("HiH_ListenerManager", "unregisterListenerByKey tempListener == null");
            return;
        }
        remoteCallbackList.unregister(iSubscribeListener);
        this.f40324c.remove(num);
        this.e.remove(num);
        LogUtil.d("HiH_ListenerManager", "unregisterListenerByKey removed key = ", num);
        a aVar = this.f40323b.get(num2);
        if (aVar == null) {
            LogUtil.j("HiH_ListenerManager", "unregisterListenerByType tempMergeData =null");
            for (Integer num3 : this.f40323b.keySet()) {
                num3.intValue();
                LogUtil.d("HiH_ListenerManager", "typeKey = ", num3);
            }
            for (Integer num4 : HiHealthDictManager.a((Context) null).f(num2.intValue())) {
                num4.intValue();
                LogUtil.a("HiH_ListenerManager", "mMergeDataMap.remove subType = ", num4);
                a aVar2 = this.f40323b.get(num4);
                if (aVar2 == null) {
                    LogUtil.j("HiH_ListenerManager", "unregisterListenerByType subMergeData =null");
                } else {
                    aVar2.a();
                    this.f40323b.remove(num4);
                }
            }
            return;
        }
        aVar.a();
        this.f40323b.remove(num2);
    }

    public void d(int i, kym kymVar) {
        int iD = d(i);
        LogUtil.d("HiH_ListenerManager", "getHomeCardType subscribe type = ", Integer.valueOf(iD));
        a(iD, "sync download", kymVar);
    }

    public static int d(int i) {
        return (f40322a.indexOfKey(i) >= 0 || !HiHealthDictManager.a((Context) null).k(i)) ? f40322a.get(i) : i;
    }

    public void a(List<HiHealthData> list, kym kymVar) {
        if (list == null || kymVar == null) {
            ReleaseLogUtil.d("HiH_ListenerManager", "hiHealthContext is null");
            return;
        }
        List<Integer> listE = lkg.e(list);
        ReleaseLogUtil.d("HiH_ListenerManager", "startLChg subList=", listE);
        if (HiCommonUtil.b(listE)) {
            return;
        }
        HiHealthClient hiHealthClientC = c(kymVar);
        HiHealthData hiHealthData = null;
        for (Integer num : listE) {
            int iIntValue = num.intValue();
            switch (iIntValue) {
                case 13:
                case 22:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                    if (list.size() != 1) {
                        LogUtil.e("HiH_ListenerManager", "startListenerChange hiHealthDatas.size() != 1");
                    } else {
                        hiHealthData = list.get(0);
                        if (this.f40323b.get(num) == null) {
                            LogUtil.e("HiH_ListenerManager", "startListenerChange getHiMergeDataByType == null");
                        } else {
                            this.f40323b.get(num).c(hiHealthData, hiHealthClientC);
                            continue;
                        }
                    }
                    break;
                case 14:
                case 18:
                case 21:
                case 23:
                default:
                    if (HiHealthDataType.d(iIntValue) == HiHealthDataType.Category.REALTIME && HiHealthDictManager.a((Context) null).a(iIntValue) != null) {
                        hiHealthData = list.get(0);
                    }
                    break;
                case 15:
                    if (list.size() != 1) {
                        LogUtil.e("HiH_ListenerManager", "running_posture: startListenerChange hiHealthDatas.size() != 1");
                    } else {
                        hiHealthData = list.get(0);
                        for (HiHealthData hiHealthData2 : c(hiHealthData)) {
                            LogUtil.a("HiH_ListenerManager", "running_posture hiHealthData = ", hiHealthData2);
                            int subType = hiHealthData2.getSubType();
                            LogUtil.d("HiH_ListenerManager", "runningPostureSubscribeType = ", Integer.valueOf(subType));
                            if (!this.f40323b.containsKey(Integer.valueOf(subType))) {
                                this.f40323b.put(Integer.valueOf(subType), new a());
                            }
                            this.f40323b.get(Integer.valueOf(subType)).c(hiHealthData2, hiHealthClientC);
                        }
                    }
                    break;
                case 16:
                case 17:
                case 19:
                case 20:
                    hiHealthData = list.get(0);
                    break;
            }
            List<HashMap<String, Object>> listD = d(list);
            if (hiHealthData != null) {
                hiHealthData.setChangeDataInfos(HiJsonUtil.d(listD));
            } else {
                hiHealthData = new HiHealthData();
                hiHealthData.setChangeDataInfos(HiJsonUtil.d(listD));
            }
            if (iIntValue != 15) {
                LogUtil.a("HiH_ListenerManager", "subscribeType = ", num, ", no running_posture data, startChange");
                a(iIntValue, ArkUIXConstants.INSERT, hiHealthClientC, hiHealthData);
            }
        }
    }

    private List<HiHealthData> c(HiHealthData hiHealthData) {
        LinkedList linkedList = new LinkedList();
        try {
            HashMap map = (HashMap) new Gson().fromJson(hiHealthData.getFieldsValue(), new TypeToken<HashMap<Integer, Double>>() { // from class: com.huawei.hihealthservice.sync.util.ListenerManager$3
            }.getType());
            if (map == null || map.size() == 0) {
                ReleaseLogUtil.e("HiH_ListenerManager", "no fieldValueList parameter");
                return linkedList;
            }
            HashMap map2 = new HashMap();
            try {
                map2 = (HashMap) new Gson().fromJson(hiHealthData.getString("realtime_back_data_interval"), new TypeToken<HashMap<Integer, Integer>>() { // from class: com.huawei.hihealthservice.sync.util.ListenerManager$4
                }.getType());
            } catch (JsonSyntaxException e) {
                ReleaseLogUtil.e("HiH_ListenerManager", "backDataIntervalMap: FromJson JsonSyntaxException", LogAnonymous.b(e));
            }
            for (Map.Entry entry : map.entrySet()) {
                HiHealthData hiHealthData2 = new HiHealthData(hiHealthData.getType());
                hiHealthData2.setStartTime(hiHealthData.getStartTime());
                hiHealthData2.setEndTime(hiHealthData.getEndTime());
                hiHealthData2.setDeviceUuid(hiHealthData.getDeviceUuid());
                hiHealthData2.setSubType(((Integer) entry.getKey()).intValue());
                hiHealthData2.setValue(((Double) entry.getValue()).doubleValue());
                hiHealthData2.putInt("realtime_judge_interval", hiHealthData.getInt("realtime_judge_interval"));
                hiHealthData2.putInt("realtime_back_data_interval", hiHealthData.getInt("realtime_back_data_interval"));
                if (hiHealthData.getInt("realtime_back_data_interval") == 0 && map2.get(Integer.valueOf(hiHealthData2.getSubType())) != null) {
                    hiHealthData2.putInt("realtime_back_data_interval", ((Integer) map2.get(Integer.valueOf(hiHealthData2.getSubType()))).intValue());
                }
                linkedList.add(hiHealthData2);
            }
            return linkedList;
        } catch (JsonSyntaxException e2) {
            ReleaseLogUtil.e("HiH_ListenerManager", "fieldValueList: FromJson JsonSyntaxException", LogAnonymous.b(e2));
            return linkedList;
        }
    }

    private List<HashMap<String, Object>> d(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            HashMap map = new HashMap(4);
            map.put("start_time", Long.valueOf(hiHealthData.getStartTime()));
            map.put("end_time", Long.valueOf(hiHealthData.getEndTime()));
            map.put("type", Integer.valueOf(hiHealthData.getType()));
            map.put("device_uniquecode", hiHealthData.getDeviceUuid());
            arrayList.add(map);
        }
        return arrayList;
    }

    public void a(int i, String str, kym kymVar) {
        if (kymVar == null) {
            return;
        }
        LogUtil.a("HiH_ListenerManager", "startListenerChange subscribeType = ", Integer.valueOf(i), ",changeKey = ", str, ",hiHealthContext = ", kymVar);
        a(i, str, c(kymVar), null);
    }

    public void c(List<Integer> list, String str, kym kymVar) {
        if (list == null || kymVar == null) {
            return;
        }
        LogUtil.a("HiH_ListenerManager", "startListenerChange subscribeTypes = ", list, ",changeKey = ", str, ",hiHealthContext = ", kymVar);
        if (HiCommonUtil.b(list)) {
            return;
        }
        HiHealthClient hiHealthClientC = c(kymVar);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue(), str, hiHealthClientC, null);
        }
    }

    public void e() {
        LogUtil.a("HiH_ListenerManager", "onDestroy");
        ExecutorService executorService = this.g;
        if (executorService != null) {
            executorService.shutdown();
        }
        HashMap<Integer, ISubscribeListener> map = this.f40324c;
        if (map != null) {
            map.clear();
        }
        HashMap<Integer, Integer> map2 = this.e;
        if (map2 != null) {
            map2.clear();
        }
        HashMap<Integer, a> map3 = this.f40323b;
        if (map3 != null) {
            map3.clear();
        }
        SparseArray<RemoteCallbackList<ISubscribeListener>> sparseArray = this.h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public void c(final int i, String str, final HiHealthData hiHealthData) {
        final HealthConnectProviderApi healthConnectProviderApi = (HealthConnectProviderApi) Services.b("FeatureDataOpen", HealthConnectProviderApi.class);
        if (i == 1 || i == 2 || i == 3) {
            LogUtil.a("HiH_ListenerManager", "writeDataToHealthConnect subscribeType = ", Integer.valueOf(i), ", changeKey = ", str, ", data = ", hiHealthData);
            if (str.equals(ArkUIXConstants.DELETE) || str.equals("latestDataDownload")) {
                return;
            }
            this.d.execute(new Runnable() { // from class: lja
                @Override // java.lang.Runnable
                public final void run() {
                    liz.e(healthConnectProviderApi, i, hiHealthData);
                }
            });
        }
    }

    static /* synthetic */ void e(HealthConnectProviderApi healthConnectProviderApi, int i, HiHealthData hiHealthData) {
        try {
            if (healthConnectProviderApi.isSupportHealthConnect()) {
                if (!healthConnectProviderApi.isAgreeHealthConnect()) {
                    LogUtil.j("HiH_ListenerManager", "writeDataToHealthConnect disagreeHealthConnect");
                    return;
                }
                healthConnectProviderApi.initHealthConnect();
                LogUtil.a("HiH_ListenerManager", "startChange writeDataToHealthConnect start");
                if (i == 1) {
                    if (!healthConnectProviderApi.isHasSportPermission()) {
                        LogUtil.a("HiH_ListenerManager", "writeDataToHealthConnect no sport permission");
                        return;
                    } else {
                        healthConnectProviderApi.writeSportData(hiHealthData);
                        return;
                    }
                }
                if (i == 2 || i == 3) {
                    if (!healthConnectProviderApi.isHasSleepPermission()) {
                        LogUtil.a("HiH_ListenerManager", "writeDataToHealthConnect no sleep permission");
                    } else {
                        healthConnectProviderApi.writeSleepData();
                    }
                }
            }
        } catch (IllegalStateException e) {
            ReleaseLogUtil.a("HiH_ListenerManager", "writeDataToHealthConnect IllegalStateException = ", ExceptionUtils.c(e));
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_ListenerManager", "writeDataToHealthConnect Exception = ", ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final String str, final HiHealthClient hiHealthClient, final HiHealthData hiHealthData) {
        if (!HiSubscribeType.b(i)) {
            ReleaseLogUtil.e("HiH_ListenerManager", "startListenerChange type is not valid subscribeType = ", Integer.valueOf(i));
            return;
        }
        c(i, str, hiHealthData);
        if (this.g.isShutdown()) {
            ReleaseLogUtil.a("HiH_ListenerManager", "startListenerChange mSubscribeThread is closed! Restarting...");
            this.g = Executors.newSingleThreadExecutor();
        }
        this.g.execute(new Runnable() { // from class: liy
            @Override // java.lang.Runnable
            public final void run() {
                this.f40320b.d(i, hiHealthClient, str, hiHealthData);
            }
        });
    }

    /* synthetic */ void d(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData) {
        int i2;
        int i3;
        RemoteCallbackList<ISubscribeListener> remoteCallbackList = this.h.get(i);
        if (remoteCallbackList == null) {
            return;
        }
        try {
            try {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                int i4 = 0;
                while (i4 < iBeginBroadcast) {
                    try {
                        ISubscribeListener iSubscribeListener = (ISubscribeListener) remoteCallbackList.getBroadcastItem(i4);
                        if (iSubscribeListener != null) {
                            i2 = iBeginBroadcast;
                            i3 = i4;
                            try {
                                iSubscribeListener.onChange(i, hiHealthClient, str, hiHealthData, System.currentTimeMillis());
                            } catch (RemoteException e) {
                                e = e;
                                String message = e.getMessage();
                                if (TextUtils.isEmpty(message)) {
                                    Throwable cause = e.getCause();
                                    message = cause == null ? "throwable null" : cause.getMessage();
                                }
                                ReleaseLogUtil.a("HiH_ListenerManager", "beginBroadcast RemoteException = ", message);
                                String strD = DfxUtils.d(Thread.currentThread(), e);
                                if (CommonUtil.ap()) {
                                    ReleaseLogUtil.a("HiH_ListenerManager", "Exception stackTrace ", strD);
                                }
                            }
                        } else {
                            i2 = iBeginBroadcast;
                            i3 = i4;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                        i2 = iBeginBroadcast;
                        i3 = i4;
                    }
                    i4 = i3 + 1;
                    iBeginBroadcast = i2;
                }
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (IllegalStateException e3) {
                    ReleaseLogUtil.a("HiH_ListenerManager", "finishBroadcast IllegalStateException = ", e3.getMessage());
                }
            } catch (IllegalStateException e4) {
                ReleaseLogUtil.a("HiH_ListenerManager", "beginBroadcast IllegalStateException = ", e4.getMessage());
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (IllegalStateException e5) {
                    ReleaseLogUtil.a("HiH_ListenerManager", "finishBroadcast IllegalStateException = ", e5.getMessage());
                }
            } catch (Exception e6) {
                ReleaseLogUtil.a("HiH_ListenerManager", "beginBroadcast Exception", LogAnonymous.b(e6));
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (IllegalStateException e7) {
                    ReleaseLogUtil.a("HiH_ListenerManager", "finishBroadcast IllegalStateException = ", e7.getMessage());
                }
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
                throw th;
            } catch (IllegalStateException e8) {
                ReleaseLogUtil.a("HiH_ListenerManager", "finishBroadcast IllegalStateException = ", e8.getMessage());
                throw th;
            }
        }
    }

    private Integer b(int i) {
        SecureRandom secureRandom = new SecureRandom();
        int i2 = 0;
        Integer numValueOf = null;
        while (true) {
            try {
                if (HiHealthDictManager.a(BaseApplication.getContext()).a(i) != null) {
                    numValueOf = Integer.valueOf(secureRandom.nextInt());
                } else {
                    numValueOf = Integer.valueOf(Integer.parseInt(new StringBuffer(16).append(secureRandom.nextInt(21474)).append(i + 10000).toString()));
                }
            } catch (NumberFormatException e) {
                ReleaseLogUtil.d("HiH_ListenerManager", "createListenerKey NumberFormatException", LogAnonymous.b(e));
            }
            if (i2 >= 10) {
                return null;
            }
            if (this.f40324c.get(numValueOf) == null) {
                return numValueOf;
            }
            i2++;
        }
    }

    private void a(Integer num, Integer num2, ISubscribeListener iSubscribeListener) {
        LogUtil.d("HiH_ListenerManager", "subscribeTypeWithKey key = ", num, ",type = ", num2);
        RemoteCallbackList<ISubscribeListener> remoteCallbackList = this.h.get(num2.intValue());
        if (remoteCallbackList == null) {
            remoteCallbackList = new RemoteCallbackList<>();
        }
        remoteCallbackList.register(iSubscribeListener);
        this.h.put(num2.intValue(), remoteCallbackList);
        this.f40324c.put(num, iSubscribeListener);
        this.e.put(num, num2);
        if (c(num2.intValue()) && this.f40323b.get(num2) == null) {
            this.f40323b.put(num2, new a());
        }
    }

    private HiHealthClient c(kym kymVar) {
        if (kymVar == null) {
            return null;
        }
        HiHealthClient hiHealthClient = new HiHealthClient();
        hiHealthClient.setPackageName(kymVar.j());
        hiHealthClient.setAppId(kymVar.b());
        return hiHealthClient;
    }

    class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TimerTask f40333c;
        private HiHealthData f;
        private String g;
        private TimerTask i;
        private int k;
        private HiHealthClient l;
        private final AtomicBoolean o = new AtomicBoolean(true);
        private int n = 10000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40332b = 1000;
        private HashMap<String, HiHealthData> d = new HashMap<>();
        private HashMap<String, String> h = new HashMap<>();
        private Timer j = new Timer("HiH_ListenerManager");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Timer f40331a = new Timer("HiH_ListenerManager");

        a() {
            this.i = new TimerTask() { // from class: liz.a.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    a.this.i();
                }
            };
            this.f40333c = new TimerTask() { // from class: liz.a.5
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    a.this.d();
                }
            };
        }

        private void c(int i) {
            if (i == 50007 || i == 50008 || i == 50009) {
                int iE = kud.a().e();
                for (String str : d(i).keySet()) {
                    lkb.b(BaseApplication.getContext(), str + "_lastCount_" + i, 0, iE);
                }
                lkb.b(BaseApplication.getContext(), "baseCount_" + i, 0, iE);
            }
        }

        void c(final HiHealthData hiHealthData, final HiHealthClient hiHealthClient) {
            ThreadPoolManager.c().b("HiH_ListenerManager", new Runnable() { // from class: ljb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40341b.e(hiHealthData, hiHealthClient);
                }
            });
        }

        /* synthetic */ void e(HiHealthData hiHealthData, HiHealthClient hiHealthClient) {
            LogUtil.d("HiH_ListenerManager", Integer.valueOf(this.k), " receiveData data:", hiHealthData);
            if (hiHealthData == null) {
                return;
            }
            this.l = hiHealthClient;
            long jCurrentTimeMillis = System.currentTimeMillis();
            hiHealthData.setCreateTime(jCurrentTimeMillis);
            hiHealthData.setEndTime(jCurrentTimeMillis);
            String strC = c(hiHealthData);
            this.d.put(strC, hiHealthData);
            int iE = kud.a().e();
            if (this.o.compareAndSet(true, false)) {
                a(hiHealthData);
                this.g = strC;
            }
            int intValue = hiHealthData.getIntValue();
            String string = hiHealthData.getString("realtime_merge_mode");
            if (StringUtils.g(string)) {
                LogUtil.e("HiH_ListenerManager", Integer.valueOf(this.k), " the mergeMode is empty value, set the mergeMode to INSTANTANEOUS_MODE");
                string = "instantaneousMode";
            }
            int type = hiHealthData.getType();
            if (strC.equals(this.g)) {
                if ("instantaneousMode".equals(string)) {
                    this.f = hiHealthData;
                    return;
                }
                if ("incrementMode".equals(string)) {
                    int iC = lkb.c(BaseApplication.getContext(), "baseCount_" + type, iE, 0);
                    int iC2 = lkb.c(BaseApplication.getContext(), strC + "_lastCount_" + type, iE, 0);
                    int i = iC + (intValue > iC2 ? intValue - iC2 : 0);
                    hiHealthData.setValue(i);
                    this.f = hiHealthData;
                    lkb.b(BaseApplication.getContext(), "baseCount_" + type, i, iE);
                } else {
                    ReleaseLogUtil.a("HiH_ListenerManager", Integer.valueOf(this.k), " the mergeMode is invalid: ", string);
                }
            }
            if ("incrementMode".equals(string)) {
                if (intValue <= lkb.c(BaseApplication.getContext(), strC + "_lastCount_" + type, iE, 0)) {
                    return;
                }
                lkb.b(BaseApplication.getContext(), strC + "_lastCount_" + type, intValue, iE);
            }
        }

        private void a(HiHealthData hiHealthData) {
            LogUtil.a("HiH_ListenerManager", Integer.valueOf(this.k), " receiveData the data is FirstReceiveDate");
            this.k = hiHealthData.getType();
            int i = hiHealthData.getInt("realtime_judge_interval");
            if (i > 0) {
                this.n = i;
            }
            int i2 = hiHealthData.getInt("realtime_back_data_interval");
            if (i2 > 0) {
                this.f40332b = i2;
            }
            c(hiHealthData.getType());
            Timer timer = this.j;
            if (timer == null || this.f40331a == null) {
                LogUtil.j("HiH_ListenerManager", "User stopJudgeAndUpdateTask, no need to dealFirstReceiveData");
                return;
            }
            timer.schedule(this.i, 0L, this.f40332b);
            Timer timer2 = this.f40331a;
            TimerTask timerTask = this.f40333c;
            long j = this.n;
            timer2.schedule(timerTask, j, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() {
            ThreadPoolManager.c().b("HiH_ListenerManager", new Runnable() { // from class: ljg
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c();
                }
            });
        }

        /* synthetic */ void c() {
            int i = this.k;
            LogUtil.a("HiH_ListenerManager", Integer.valueOf(i), " begin to postCurrentBestData, currentBestSourceType = ", this.g);
            HiHealthData hiHealthData = this.f;
            if (hiHealthData == null) {
                LogUtil.j("HiH_ListenerManager", "mCurrentBestData is null , no need to postCurrentBestData");
                return;
            }
            LogUtil.a("HiH_ListenerManager", Integer.valueOf(this.k), " postCurrentBestData data: ", hiHealthData);
            int iD = HiSubscribeType.d(this.f.getType());
            liz.this.a(iD, "scheduledMergeData", this.l, this.f);
            if (iD == 15) {
                LogUtil.a("HiH_ListenerManager", Integer.valueOf(this.k), " running_posture data clear every period");
                this.f = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            ThreadPoolManager.c().b("HiH_ListenerManager", new Runnable() { // from class: lje
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40342b.e();
                }
            });
        }

        /* synthetic */ void e() {
            ArrayList arrayList = new ArrayList(this.d.values());
            this.d.clear();
            if (arrayList.isEmpty()) {
                LogUtil.j("HiH_ListenerManager", Integer.valueOf(this.k), " judgeNextPeriodBestSourceType the lastPeriodRealDataList isEmpty,no need to judge");
                HiHealthData hiHealthData = this.f;
                if (hiHealthData != null && HiSubscribeType.d(hiHealthData.getType()) == 13) {
                    LogUtil.a("HiH_ListenerManager", "subscribeType is realTime heartRate, clear currentBestData when no data is received in the previous period.");
                    this.f = null;
                }
            } else {
                Collections.sort(arrayList, new b());
                this.g = c((HiHealthData) arrayList.get(0));
            }
            int i = this.k;
            LogUtil.a("HiH_ListenerManager", Integer.valueOf(i), " judgeNextPeriodBestSourceType the currentBestSourceType is ", this.g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Integer> d(int i) {
            if (i == 50001) {
                return kwc.h();
            }
            if (i != 300001) {
                switch (i) {
                    case HiHealthStatusCodes.UNSUPPORTED_PLATFORM_ERROR /* 50007 */:
                        return kwc.k();
                    case HiHealthStatusCodes.TRY_AGAIN_ERROR /* 50008 */:
                        return kwc.g();
                    case HiHealthStatusCodes.ACTIVITY_RECORD_ENDED_ERROR /* 50009 */:
                        return kwc.c();
                    case HiHealthStatusCodes.APP_NOT_ENABLED_ERROR /* 50010 */:
                        return kwc.f();
                    case HiHealthStatusCodes.API_EXCEPTION_ERROR /* 50011 */:
                        return kwc.a();
                    case HiHealthStatusCodes.POLYMERIZED_NOT_SUPPORTED_ERROR /* 50012 */:
                        return kwc.n();
                    case HiHealthStatusCodes.UNSUPPORTED_ACCOUNT_ERROR /* 50013 */:
                        return kwc.m();
                    case HiHealthStatusCodes.BLUETOOTH_FORBIDDEN_ERROR /* 50014 */:
                        return kwc.l();
                    case HiHealthStatusCodes.MISMATCH_PACKAGE_NAME_ERROR /* 50015 */:
                        return kwc.j();
                    case 50016:
                        return kwc.d();
                    case 50017:
                        return kwc.b();
                    case HiHealthStatusCodes.NONEXISTENT_DATA_COLLECTOR_ERROR /* 50018 */:
                        return kwc.i();
                    case HiHealthStatusCodes.SAMPLE_SET_TIMESTAMP_ERROR /* 50019 */:
                        return kwc.e();
                    default:
                        LogUtil.e("HiH_ListenerManager", Integer.valueOf(this.k), " the dateType is not support.");
                        return new HashMap();
                }
            }
            return kwc.o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c(HiHealthData hiHealthData) {
            String deviceUuid = hiHealthData.getDeviceUuid();
            String dataSource = hiHealthData.getDataSource();
            String str = StringUtils.j(dataSource) ? dataSource : deviceUuid;
            if (this.h.containsKey(str)) {
                String str2 = this.h.get(str);
                LogUtil.d("HiH_ListenerManager", Integer.valueOf(this.k), " key: ", str, " source: ", str2);
                return str2;
            }
            if (StringUtils.j(dataSource)) {
                if (d(hiHealthData.getType()).containsKey(dataSource)) {
                    LogUtil.a("HiH_ListenerManager", Integer.valueOf(this.k), " get by dataSource, dataSource: ", dataSource, " source: ", dataSource);
                    this.h.put(dataSource, dataSource);
                    return dataSource;
                }
                ReleaseLogUtil.a("HiH_ListenerManager", Integer.valueOf(this.k), " the dataSource is not in merge range");
                return "";
            }
            HiDeviceInfo hiDeviceInfoB = kwy.b(BaseApplication.getContext()).b(deviceUuid);
            if (hiDeviceInfoB == null) {
                ReleaseLogUtil.a("HiH_ListenerManager", Integer.valueOf(this.k), " the deviceInfo is null, the deviceUuid: ", deviceUuid);
                return "";
            }
            List<ProductMapInfo> listC = ProductMap.c("deviceId", String.valueOf(hiDeviceInfoB.getDeviceType()));
            if (njy.b(listC)) {
                String strE = listC.get(0).e();
                LogUtil.a("HiH_ListenerManager", Integer.valueOf(this.k), " get by Uuid, deviceUuid: ", deviceUuid, " source: ", strE);
                this.h.put(deviceUuid, strE);
                return strE;
            }
            ReleaseLogUtil.a("HiH_ListenerManager", Integer.valueOf(this.k), " has not to insert valid deviceTypeMsg");
            return "";
        }

        public void a() {
            ThreadPoolManager.c().b("HiH_ListenerManager", new Runnable() { // from class: ljd
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b();
                }
            });
        }

        /* synthetic */ void b() {
            Timer timer = this.j;
            if (timer != null) {
                timer.cancel();
                this.j = null;
            }
            TimerTask timerTask = this.i;
            if (timerTask != null) {
                timerTask.cancel();
                this.i = null;
            }
            Timer timer2 = this.f40331a;
            if (timer2 != null) {
                timer2.cancel();
                this.f40331a = null;
            }
            TimerTask timerTask2 = this.f40333c;
            if (timerTask2 != null) {
                timerTask2.cancel();
                this.f40333c = null;
            }
            c(this.k);
            LogUtil.a("HiH_ListenerManager", Integer.valueOf(this.k), " stopJudgeAndUpdateTask,stop to backData and judge best source type");
        }

        class b implements Comparator<HiHealthData> {
            private b() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
                String strC = a.this.c(hiHealthData);
                String strC2 = a.this.c(hiHealthData2);
                Integer num = 0;
                if (strC == null || strC2 == null) {
                    LogUtil.d("HiH_ListenerManager", Integer.valueOf(a.this.k), " HiRealDataMergeComparator oldPriorityType==null || newPriorityType==null");
                    return 0;
                }
                a aVar = a.this;
                Integer num2 = (Integer) aVar.d(aVar.k).get(strC2);
                a aVar2 = a.this;
                Integer num3 = (Integer) aVar2.d(aVar2.k).get(strC);
                if (num2 == null) {
                    num2 = num;
                }
                return num2.compareTo(num3 != null ? num3 : 0);
            }
        }
    }
}
