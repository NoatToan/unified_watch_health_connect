package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.channel.WearEngineChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class yih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, List<Object>> f53375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, Map<String, List<WearEngineChannel>>>> f53376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f53377c;
    private final Object d;

    private yih() {
        this.f53377c = new Object();
        this.d = new Object();
        this.f53376b = new ConcurrentHashMap();
        this.f53375a = new ConcurrentHashMap();
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final yih f53378b = new yih();
    }

    public static yih b() {
        return a.f53378b;
    }

    public void b(String str, String str2, String str3, WearEngineChannel wearEngineChannel) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.j("WearEngine_HwWearEngineChannelManager", "addWearEngineChannel deviceIdentify 、 srcPkgName or destPkgName is null");
            return;
        }
        LogUtil.a("WearEngine_HwWearEngineChannelManager", "addWearEngineChannel srcPkgName is ", str2, ",destPckName is ", str3);
        synchronized (this.f53377c) {
            Map<String, Map<String, List<WearEngineChannel>>> map = this.f53376b.get(str);
            if (map == null) {
                a(str, str2, str3, wearEngineChannel);
            } else {
                c(str, str2, str3, map, wearEngineChannel);
            }
        }
    }

    private void a(String str, String str2, String str3, WearEngineChannel wearEngineChannel) {
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(wearEngineChannel);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str3, arrayList);
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        concurrentHashMap2.put(str2, concurrentHashMap);
        this.f53376b.put(str, concurrentHashMap2);
        LogUtil.a("WearEngine_HwWearEngineChannelManager", "addNewWearEngineChannel is done");
    }

    private void c(String str, String str2, String str3, Map<String, Map<String, List<WearEngineChannel>>> map, WearEngineChannel wearEngineChannel) {
        LogUtil.a("WearEngine_HwWearEngineChannelManager", "appendWearEngineChannel enter");
        Map<String, List<WearEngineChannel>> map2 = map.get(str2);
        if (map2 == null) {
            LogUtil.a("WearEngine_HwWearEngineChannelManager", "appendWearEngineChannel new srcInfo");
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(wearEngineChannel);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap.put(str3, arrayList);
            map.put(str2, concurrentHashMap);
            return;
        }
        List<WearEngineChannel> list = map2.get(str3);
        if (list == null) {
            LogUtil.a("WearEngine_HwWearEngineChannelManager", "appendWearEngineChannel new wearEngineChannels");
            ArrayList arrayList2 = new ArrayList(16);
            arrayList2.add(wearEngineChannel);
            map2.put(str3, arrayList2);
            return;
        }
        list.add(wearEngineChannel);
    }

    public List<WearEngineChannel> e(String str, String str2, String str3) {
        return c(str, str2, str3, yif.class);
    }

    private List<WearEngineChannel> c(String str, String str2, String str3, Class<? extends WearEngineChannel> cls) {
        Map<String, List<WearEngineChannel>> map;
        List<WearEngineChannel> list;
        ArrayList arrayList = new ArrayList(16);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || cls == null) {
            LogUtil.j("WearEngine_HwWearEngineChannelManager", "getWearEngineChannelWithClass deviceIdentify、srcInfo、destInfo or targetChannel is null");
            return arrayList;
        }
        Map<String, Map<String, List<WearEngineChannel>>> map2 = this.f53376b.get(str);
        if (map2 == null) {
            LogUtil.a("WearEngine_HwWearEngineChannelManager", "getWearEngineChannelWithClass wearEngineChannelMap is null");
            return arrayList;
        }
        if (map2.containsKey(str2) && (map = map2.get(str2)) != null && (list = map.get(str3)) != null) {
            LogUtil.a("WearEngine_HwWearEngineChannelManager", "getWearEngineChannelWithClass wearEngineChannelList not null");
            for (WearEngineChannel wearEngineChannel : list) {
                if (wearEngineChannel.getClass().isAssignableFrom(cls)) {
                    arrayList.add(wearEngineChannel);
                }
            }
        }
        return arrayList;
    }

    public void e(String str) {
        LogUtil.a("WearEngine_HwWearEngineChannelManager", "removeWearEngineGlobalChannel enter");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WearEngine_HwWearEngineChannelManager", "removeWearEngineGlobalChannel deviceIdentify is null");
            return;
        }
        synchronized (this.d) {
            this.f53375a.remove(str);
        }
    }

    public void a(String str) {
        LogUtil.a("WearEngine_HwWearEngineChannelManager", "removeWearEngineChannel enter");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WearEngine_HwWearEngineChannelManager", "removeWearEngineChannel deviceIdentify is null");
            return;
        }
        synchronized (this.f53377c) {
            this.f53376b.remove(str);
        }
    }

    public void a(String str, yid yidVar) {
        if (TextUtils.isEmpty(str) || yidVar == null) {
            LogUtil.j("WearEngine_HwWearEngineChannelManager", "updateP2pChannelByWearAppInstallState deviceIdentify、wearAppInstallState is null");
            return;
        }
        synchronized (this.f53377c) {
            Map<String, Map<String, List<WearEngineChannel>>> map = this.f53376b.get(str);
            if (map == null) {
                LogUtil.a("WearEngine_HwWearEngineChannelManager", "updateP2pChannelByWearAppInstallState wearEngineChannelMap is null");
                return;
            }
            Iterator<Map.Entry<String, Map<String, List<WearEngineChannel>>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map<String, List<WearEngineChannel>> value = it.next().getValue();
                if (value == null) {
                    LogUtil.a("WearEngine_HwWearEngineChannelManager", "updateP2pChannelByWearAppInstallState deviceDestInfoMap is null, continue");
                } else {
                    b(value, yidVar);
                }
            }
        }
    }

    private void b(Map<String, List<WearEngineChannel>> map, yid yidVar) {
        for (Map.Entry<String, List<WearEngineChannel>> entry : map.entrySet()) {
            if (!TextUtils.equals(entry.getKey(), yidVar.b())) {
                LogUtil.a("WearEngine_HwWearEngineChannelManager", "updateP2pChannelByWearAppInstallState destPkgName is't equals, continue");
            } else {
                List<WearEngineChannel> value = entry.getValue();
                if (value == null) {
                    LogUtil.a("WearEngine_HwWearEngineChannelManager", "updateP2pChannelByWearAppInstallState wearEngineChannelList is null, continue");
                } else {
                    c(yidVar, value);
                }
            }
        }
    }

    private void c(yid yidVar, List<WearEngineChannel> list) {
        for (WearEngineChannel wearEngineChannel : list) {
            if (wearEngineChannel instanceof yif) {
                LogUtil.a("WearEngine_HwWearEngineChannelManager", "updateP2pChannelByWearAppInstallState match target wearEngineChannel");
                if (wearEngineChannel.isChannelOpen() != yidVar.isChannelOpen()) {
                    LogUtil.a("WearEngine_HwWearEngineChannelManager", "updateP2pChannelByWearAppInstallState wearAppInstallState is ", Boolean.valueOf(yidVar.isChannelOpen()));
                    wearEngineChannel.updateChannelState(!yidVar.isChannelOpen() ? 1 : 0);
                }
            }
        }
    }

    public void a(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() == 2 || deviceInfo.getDeviceConnectState() == 3) {
            LogUtil.a("WearEngine_HwWearEngineChannelManager", "onDeviceConnectStateChange", "connectState ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
            e(deviceInfo.getDeviceIdentify());
            a(deviceInfo.getDeviceIdentify());
        }
    }
}
