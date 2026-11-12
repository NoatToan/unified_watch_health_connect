package com.xiaomi.smarthome.core.server.internal.homeroom;

import android.text.TextUtils;
import com.xiaomi.passport.ui.internal.SNSAuthProvider;
import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.NetHandle;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.core.server.internal.device.api.DeviceListApi;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.frame.ErrorCode;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.smarthome.homeroom.model.Room;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.MD5;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class CoreSharedHomeManager {
    private static final String FILE_NAME = "shared_home_devices_list_data_";
    private static final int PAGE_SIZE_LIMIT = 200;
    private static final String TAG = "CoreSharedHomeManager";
    private static volatile CoreSharedHomeManager sInstance;
    private volatile Home mCurrentHome;
    private Map<String, HomeDeviceInfo> mHomeDeviceInfoMap = new ConcurrentHashMap();
    private Set<Home> mHomeSet = new HashSet();

    private CoreSharedHomeManager() throws Throwable {
        loadFromLocalStore();
    }

    private void deSerializeFromString(String str) throws JSONException {
        if (MiJiaEnvironment.isDebugBuildType()) {
            MiJiaLog.writeLogOnGrey(LogType.HOME_ROOM, TAG, "deSerializeFromString in:" + str);
        }
        JSONObject jSONObject = new JSONObject(str);
        if (TextUtils.equals(jSONObject.optString("uid"), AccountDepApi.getInstance().getMiId())) {
            if (!jSONObject.isNull("current_home")) {
                synchronized (this) {
                    this.mCurrentHome = Home.parse(jSONObject.optJSONObject("current_home"));
                }
            }
            jSONObject.optLong(DeviceTagInterface.TAG_DATA_START);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return;
            }
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap((int) (((double) jSONArrayOptJSONArray.length()) * 1.5d), 0.75f);
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                HomeDeviceInfo data = HomeDeviceInfo.parseData(jSONArrayOptJSONArray.optJSONObject(i));
                if (data != null && data.home != null) {
                    LogType logType = LogType.HOME_ROOM;
                    String str2 = TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("deSerializeFromString ");
                    sb.append(data.getHome().getId());
                    sb.append(":");
                    sb.append(data.getHome().getRawName());
                    sb.append(":");
                    sb.append(data.getDeviceList() == null ? 0 : data.getDeviceList().size());
                    sb.append(" devices");
                    MiJiaLog.writeLogOnGrey(logType, str2, sb.toString());
                    concurrentHashMap.put(data.home.getId(), data);
                }
            }
            this.mHomeDeviceInfoMap = concurrentHashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dumpToLocalStore() throws Throwable {
        try {
            FileUtils.writeDataToFile(serializeToString(), getFilePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterInvalidDevices(HomeDeviceInfo homeDeviceInfo) {
        if (homeDeviceInfo == null || homeDeviceInfo.getDeviceList() == null || homeDeviceInfo.getDeviceList().isEmpty()) {
            return;
        }
        try {
            List<Device> deviceList = homeDeviceInfo.getDeviceList();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < deviceList.size(); i2++) {
                Device device = deviceList.get(i2);
                if (device != null && !TextUtils.isEmpty(device.getParentId())) {
                    arrayList.add(device);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Map<String, Device> deviceMap = homeDeviceInfo.getDeviceMap();
            while (i < arrayList.size()) {
                Device device2 = (Device) arrayList.get(i);
                if (device2 != null && deviceMap.get(device2.getParentId()) != null) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            MiJiaLog.writeLogOnGrey(LogType.HOME_ROOM, TAG, "filterInvalidDevices found " + arrayList.size() + " invalid sub-devices");
            deviceList.removeAll(arrayList);
            homeDeviceInfo.setDeviceList(deviceList);
        } catch (Exception e) {
            e.printStackTrace();
            MiJiaLog.writeLogOnGrey(LogType.HOME_ROOM, TAG, "filterInvalidDevices exception " + e.getMessage());
        }
    }

    private String getFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(MiJiaEnvironment.getAppContext().getFilesDir());
        String str = File.separator;
        sb.append(str);
        sb.append("shared_home");
        sb.append(str);
        sb.append(FILE_NAME);
        sb.append(MD5.MD5_32(AccountDepApi.getInstance().getMiId()));
        return sb.toString();
    }

    public static CoreSharedHomeManager getInstance() {
        if (sInstance == null) {
            synchronized (CoreSharedHomeManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new CoreSharedHomeManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void loadFromLocalStore() throws Throwable {
        try {
            String stringFromFile = FileUtils.readStringFromFile(getFilePath());
            if (TextUtils.isEmpty(stringFromFile)) {
                return;
            }
            deSerializeFromString(stringFromFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String serializeToString() throws JSONException {
        Map<String, HomeDeviceInfo> map = this.mHomeDeviceInfoMap;
        if (map == null || map.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (HomeDeviceInfo homeDeviceInfo : map.values()) {
            if (homeDeviceInfo != null) {
                jSONArray.put(homeDeviceInfo.toJSON());
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", jSONArray);
        jSONObject.put("uid", AccountDepApi.getInstance().getMiId());
        jSONObject.put(DeviceTagInterface.TAG_DATA_START, System.currentTimeMillis());
        jSONObject.put("current_home", this.mCurrentHome != null ? this.mCurrentHome.toJSON() : null);
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void successCallback(Home home, ArrayList<Device> arrayList, NetCallback<ArrayList<Device>, NetError> netCallback) {
        HomeDeviceInfo homeDeviceInfo;
        ArrayList<Device> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        for (Home home2 : new CopyOnWriteArraySet(this.mHomeSet)) {
            if (home2 != null && !home2.equals(home) && (homeDeviceInfo = this.mHomeDeviceInfoMap.get(home2.getId())) != null && homeDeviceInfo.getDeviceList() != null) {
                arrayList2.addAll(homeDeviceInfo.getDeviceList());
            }
        }
        if (netCallback != null) {
            netCallback.onSuccess(arrayList2);
        }
    }

    public synchronized void addHome(Home home) {
        if (home != null) {
            if (!this.mHomeSet.contains(home)) {
                this.mHomeSet.add(home);
            }
        }
    }

    public synchronized Home getCurrentHome() {
        return this.mCurrentHome;
    }

    public List<String> getHomeDids(String str) {
        HomeDeviceInfo homeDeviceInfo = this.mHomeDeviceInfoMap.get(str);
        if (homeDeviceInfo == null) {
            return null;
        }
        return homeDeviceInfo.getDidList();
    }

    public List<String> getRoomDids(String str, String str2) {
        Home home;
        List<Room> roomList;
        HomeDeviceInfo homeDeviceInfo = this.mHomeDeviceInfoMap.get(str);
        if (homeDeviceInfo != null && (home = homeDeviceInfo.home) != null && (roomList = home.getRoomList()) != null && !roomList.isEmpty()) {
            for (int i = 0; i < roomList.size(); i++) {
                Room room = roomList.get(i);
                if (room != null) {
                    return room.getDids();
                }
            }
        }
        return null;
    }

    public HomeDeviceInfo getSharedHomeDeviceInfo(String str) {
        return this.mHomeDeviceInfoMap.get(str);
    }

    public void reset() {
        this.mHomeDeviceInfoMap = new ConcurrentHashMap();
        this.mCurrentHome = null;
        this.mHomeSet = new HashSet();
    }

    public void setCurrentHome(Home home) throws Throwable {
        MiJiaLog.writeLogOnGrey(LogType.HOME_ROOM, TAG, "setCurrentHome " + home);
        this.mCurrentHome = home;
        synchronized (this) {
            if (home != null) {
                try {
                    if (!this.mHomeSet.contains(home)) {
                        this.mHomeSet.add(home);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        dumpToLocalStore();
    }

    public NetHandle updateSharedHomeDeviceList(final NetCallback<ArrayList<Device>, NetError> netCallback) {
        final Home currentHome = getCurrentHome();
        if (currentHome != null && !currentHome.isOwner()) {
            MiJiaLog.writeLogOnAll(LogType.HOME_ROOM, TAG, "updateSharedHomeDeviceList " + currentHome.getId());
            return updateSharedHomeDeviceList(currentHome.getOwnerUid(), Long.parseLong(currentHome.getId()), 200, new NetCallback<ArrayList<Device>, NetError>() { // from class: com.xiaomi.smarthome.core.server.internal.homeroom.CoreSharedHomeManager.1
                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onCache(ArrayList<Device> arrayList) {
                }

                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onFailure(NetError netError) {
                    NetCallback netCallback2 = netCallback;
                    if (netCallback2 != null) {
                        netCallback2.onFailure(netError);
                    }
                }

                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onSuccess(ArrayList<Device> arrayList) {
                    CoreSharedHomeManager.this.successCallback(currentHome, arrayList, netCallback);
                }
            });
        }
        MiJiaLog.writeLogOnAll(LogType.HOME_ROOM, TAG, "updateSharedHomeDeviceList err home == " + currentHome);
        if (netCallback != null) {
            successCallback(currentHome, null, netCallback);
        }
        return new NetHandle(null);
    }

    public NetHandle updateSharedHomeDeviceList(long j, long j2, NetCallback<ArrayList<Device>, NetError> netCallback) {
        return updateSharedHomeDeviceList(j, j2, 200, netCallback);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    private NetHandle updateSharedHomeDeviceList(final long j, final long j2, final int i, final NetCallback<ArrayList<Device>, NetError> netCallback) {
        MiJiaLog.writeLogOnGrey(LogType.HOME_ROOM, TAG, "updateSharedHomeDeviceList in");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("home_owner", j);
            jSONObject.put("home_id", j2);
            try {
                jSONObject.put("limit", i);
                jSONObject.put("get_split_device", true);
                jSONObject.put("support_smart_home", true);
                jSONObject.put("get_cariot_device", true);
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            final NetHandle.NetHandleWrap netHandleWrap = new NetHandle.NetHandleWrap();
            MiJiaLog.writeLogOnGrey(LogType.HOME_ROOM, TAG, "request /v2/home/home_device_list homeId=" + j2);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            netHandleWrap.setInner(SmartHomeRc4Api.getInstance().sendRequest(DeviceListApi.getNetRequest(jSONObject, "/v2/home/home_device_list"), new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.core.server.internal.homeroom.CoreSharedHomeManager.2
                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onCache(NetResult netResult) {
                }

                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onFailure(NetError netError) {
                    String str;
                    NetCallback netCallback2 = netCallback;
                    if (netCallback2 != null) {
                        netCallback2.onFailure(netError);
                    }
                    LogType logType = LogType.HOME_ROOM;
                    String str2 = CoreSharedHomeManager.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("updateSharedHomeDeviceList onFailure ");
                    if (netError == null) {
                        str = null;
                    } else {
                        str = netError.getCode() + "," + netError.getDetail();
                    }
                    sb.append(str);
                    MiJiaLog.writeLogOnGrey(logType, str2, sb.toString());
                }

                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onSuccess(NetResult netResult) throws Throwable {
                    if (netHandleWrap.isCancel()) {
                        NetCallback netCallback2 = netCallback;
                        if (netCallback2 != null) {
                            netCallback2.onFailure(new NetError(-1, SNSAuthProvider.VALUE_SNS_CANCELLED));
                            return;
                        }
                        return;
                    }
                    if (netResult == null || TextUtils.isEmpty(netResult.mResponse)) {
                        CoreSharedHomeManager.this.mHomeDeviceInfoMap.remove(String.valueOf(j2));
                        NetCallback netCallback3 = netCallback;
                        if (netCallback3 != null) {
                            netCallback3.onFailure(new NetError(ErrorCode.ERROR_RESPONSE_JSON_FAIL.getCode(), "empty result"));
                        }
                        MiJiaLog.writeLogOnGrey(LogType.HOME_ROOM, CoreSharedHomeManager.TAG, "updateSharedHomeDeviceList empty network response");
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(netResult.mResponse);
                        int iOptInt = jSONObject2.optInt("code");
                        if (iOptInt != ErrorCode.SUCCESS.getCode()) {
                            MiJiaLog.writeLogOnAll(LogType.DEVICE_LIST, CoreSharedHomeManager.TAG, "core /v2/home/device_list_page error errorCode=" + iOptInt);
                            NetCallback netCallback4 = netCallback;
                            if (netCallback4 != null) {
                                netCallback4.onFailure(new NetError(-1, "core /v2/home/device_list_page error errorCode=" + iOptInt));
                                return;
                            }
                            return;
                        }
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("result");
                        HomeDeviceInfo data = (HomeDeviceInfo) CoreSharedHomeManager.this.mHomeDeviceInfoMap.get(String.valueOf(j2));
                        int size = 0;
                        if (data == null) {
                            data = HomeDeviceInfo.parseData(jSONObjectOptJSONObject);
                            CoreSharedHomeManager.this.mHomeDeviceInfoMap.put(String.valueOf(j2), data);
                        } else {
                            HomeDeviceInfo data2 = HomeDeviceInfo.parseData(jSONObjectOptJSONObject);
                            if (atomicBoolean.getAndSet(false)) {
                                CoreSharedHomeManager.this.mHomeDeviceInfoMap.put(String.valueOf(j2), data2);
                                data = data2;
                            } else {
                                data.merge(data2);
                            }
                        }
                        CoreSharedHomeManager.this.mHomeSet.add(data.home);
                        atomicBoolean.set(false);
                        data.setUserId(AccountDepApi.getInstance().getMiId());
                        LogType logType = LogType.HOME_ROOM;
                        String str = CoreSharedHomeManager.TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("home_device_list current size=");
                        sb.append(data.getDeviceList() == null ? 0 : data.getDeviceList().size());
                        MiJiaLog.writeLogOnGrey(logType, str, sb.toString());
                        if (!jSONObjectOptJSONObject.isNull("has_more") && jSONObjectOptJSONObject.optBoolean("has_more") && !jSONObjectOptJSONObject.isNull("max_did")) {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("home_owner", j);
                                jSONObject3.put("home_id", j2);
                                jSONObject3.put("limit", i);
                                jSONObject3.put("start_did", jSONObjectOptJSONObject.optString("max_did"));
                                jSONObject3.put("get_cariot_device", true);
                                netHandleWrap.setInner(SmartHomeRc4Api.getInstance().sendRequest(DeviceListApi.getNetRequest(jSONObject3, "/v2/home/home_device_list"), this));
                                return;
                            } catch (JSONException | Exception unused) {
                                return;
                            }
                        }
                        CoreSharedHomeManager.this.filterInvalidDevices(data);
                        String str2 = CoreSharedHomeManager.TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("updateSharedHomeDeviceList home_device_list total size=");
                        if (data.getDeviceList() != null) {
                            size = data.getDeviceList().size();
                        }
                        sb2.append(size);
                        MiJiaLog.writeLogOnGrey(logType, str2, sb2.toString());
                        NetCallback netCallback5 = netCallback;
                        if (netCallback5 != null) {
                            netCallback5.onSuccess((ArrayList) data.getDeviceList());
                        }
                        CoreSharedHomeManager.this.dumpToLocalStore();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        MiJiaLog.writeLogOnGrey(LogType.HOME_ROOM, CoreSharedHomeManager.TAG, "updateSharedHomeDeviceList exception1:" + e3.getMessage());
                        NetCallback netCallback6 = netCallback;
                        if (netCallback6 != null) {
                            netCallback6.onFailure(new NetError(-1, e3.getMessage()));
                        }
                    }
                }
            }));
            return netHandleWrap;
        }
        final NetHandle.NetHandleWrap netHandleWrap2 = new NetHandle.NetHandleWrap();
        MiJiaLog.writeLogOnGrey(LogType.HOME_ROOM, TAG, "request /v2/home/home_device_list homeId=" + j2);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
        netHandleWrap2.setInner(SmartHomeRc4Api.getInstance().sendRequest(DeviceListApi.getNetRequest(jSONObject, "/v2/home/home_device_list"), new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.core.server.internal.homeroom.CoreSharedHomeManager.2
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult netResult) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError netError) {
                String str;
                NetCallback netCallback2 = netCallback;
                if (netCallback2 != null) {
                    netCallback2.onFailure(netError);
                }
                LogType logType = LogType.HOME_ROOM;
                String str2 = CoreSharedHomeManager.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("updateSharedHomeDeviceList onFailure ");
                if (netError == null) {
                    str = null;
                } else {
                    str = netError.getCode() + "," + netError.getDetail();
                }
                sb.append(str);
                MiJiaLog.writeLogOnGrey(logType, str2, sb.toString());
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) throws Throwable {
                if (netHandleWrap2.isCancel()) {
                    NetCallback netCallback2 = netCallback;
                    if (netCallback2 != null) {
                        netCallback2.onFailure(new NetError(-1, SNSAuthProvider.VALUE_SNS_CANCELLED));
                        return;
                    }
                    return;
                }
                if (netResult == null || TextUtils.isEmpty(netResult.mResponse)) {
                    CoreSharedHomeManager.this.mHomeDeviceInfoMap.remove(String.valueOf(j2));
                    NetCallback netCallback3 = netCallback;
                    if (netCallback3 != null) {
                        netCallback3.onFailure(new NetError(ErrorCode.ERROR_RESPONSE_JSON_FAIL.getCode(), "empty result"));
                    }
                    MiJiaLog.writeLogOnGrey(LogType.HOME_ROOM, CoreSharedHomeManager.TAG, "updateSharedHomeDeviceList empty network response");
                    return;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(netResult.mResponse);
                    int iOptInt = jSONObject2.optInt("code");
                    if (iOptInt != ErrorCode.SUCCESS.getCode()) {
                        MiJiaLog.writeLogOnAll(LogType.DEVICE_LIST, CoreSharedHomeManager.TAG, "core /v2/home/device_list_page error errorCode=" + iOptInt);
                        NetCallback netCallback4 = netCallback;
                        if (netCallback4 != null) {
                            netCallback4.onFailure(new NetError(-1, "core /v2/home/device_list_page error errorCode=" + iOptInt));
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("result");
                    HomeDeviceInfo data = (HomeDeviceInfo) CoreSharedHomeManager.this.mHomeDeviceInfoMap.get(String.valueOf(j2));
                    int size = 0;
                    if (data == null) {
                        data = HomeDeviceInfo.parseData(jSONObjectOptJSONObject);
                        CoreSharedHomeManager.this.mHomeDeviceInfoMap.put(String.valueOf(j2), data);
                    } else {
                        HomeDeviceInfo data2 = HomeDeviceInfo.parseData(jSONObjectOptJSONObject);
                        if (atomicBoolean2.getAndSet(false)) {
                            CoreSharedHomeManager.this.mHomeDeviceInfoMap.put(String.valueOf(j2), data2);
                            data = data2;
                        } else {
                            data.merge(data2);
                        }
                    }
                    CoreSharedHomeManager.this.mHomeSet.add(data.home);
                    atomicBoolean2.set(false);
                    data.setUserId(AccountDepApi.getInstance().getMiId());
                    LogType logType = LogType.HOME_ROOM;
                    String str = CoreSharedHomeManager.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("home_device_list current size=");
                    sb.append(data.getDeviceList() == null ? 0 : data.getDeviceList().size());
                    MiJiaLog.writeLogOnGrey(logType, str, sb.toString());
                    if (!jSONObjectOptJSONObject.isNull("has_more") && jSONObjectOptJSONObject.optBoolean("has_more") && !jSONObjectOptJSONObject.isNull("max_did")) {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("home_owner", j);
                            jSONObject3.put("home_id", j2);
                            jSONObject3.put("limit", i);
                            jSONObject3.put("start_did", jSONObjectOptJSONObject.optString("max_did"));
                            jSONObject3.put("get_cariot_device", true);
                            netHandleWrap2.setInner(SmartHomeRc4Api.getInstance().sendRequest(DeviceListApi.getNetRequest(jSONObject3, "/v2/home/home_device_list"), this));
                            return;
                        } catch (JSONException | Exception unused) {
                            return;
                        }
                    }
                    CoreSharedHomeManager.this.filterInvalidDevices(data);
                    String str2 = CoreSharedHomeManager.TAG;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("updateSharedHomeDeviceList home_device_list total size=");
                    if (data.getDeviceList() != null) {
                        size = data.getDeviceList().size();
                    }
                    sb2.append(size);
                    MiJiaLog.writeLogOnGrey(logType, str2, sb2.toString());
                    NetCallback netCallback5 = netCallback;
                    if (netCallback5 != null) {
                        netCallback5.onSuccess((ArrayList) data.getDeviceList());
                    }
                    CoreSharedHomeManager.this.dumpToLocalStore();
                } catch (Exception e3) {
                    e3.printStackTrace();
                    MiJiaLog.writeLogOnGrey(LogType.HOME_ROOM, CoreSharedHomeManager.TAG, "updateSharedHomeDeviceList exception1:" + e3.getMessage());
                    NetCallback netCallback6 = netCallback;
                    if (netCallback6 != null) {
                        netCallback6.onFailure(new NetError(-1, e3.getMessage()));
                    }
                }
            }
        }));
        return netHandleWrap2;
    }
}
