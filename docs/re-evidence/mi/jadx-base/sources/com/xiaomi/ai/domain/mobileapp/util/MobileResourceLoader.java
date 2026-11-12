package com.xiaomi.ai.domain.mobileapp.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.xiaomi.ai.domain.mobileapp.common.Device;
import defpackage.brk;
import defpackage.j4b;
import defpackage.mjh;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class MobileResourceLoader extends brk {
    private static final String defaultDevice = "universal";
    private Map<String, Set<String>> deviceDict = new HashMap();
    private Set<String> actionDict = new HashSet();
    private Map<String, Map<String, Set<mjh<String, String>>>> deviceTokenToNTokenSlots = new HashMap();
    private Map<String, Set<mjh<String, String>>> actionTokenToNTokenSlots = new HashMap();
    private Map<String, Double> actionScore = new HashMap();

    public MobileResourceLoader(InputStream inputStream) throws Exception {
        loadMobileResources(inputStream);
    }

    public void addMobileResource(JsonObject jsonObject) {
        String asString = jsonObject.get("slot").getAsString();
        MobileResource mobileResource = new MobileResource(jsonObject);
        String token = mobileResource.getToken();
        if (mobileResource.getSlotType().equals("name")) {
            String device = getDevice(mobileResource.getDevice());
            if (!this.deviceDict.containsKey(device)) {
                this.deviceDict.put(device, new HashSet());
            }
            this.deviceDict.get(device).add(token);
            this.deviceDict.get(device).add(mobileResource.getNormToken());
            if (!this.deviceTokenToNTokenSlots.containsKey(device)) {
                new HashMap();
                this.deviceTokenToNTokenSlots.put(device, new HashMap());
            }
            if (!this.deviceTokenToNTokenSlots.get(device).containsKey(token)) {
                this.deviceTokenToNTokenSlots.get(device).put(token, new HashSet());
            }
            this.deviceTokenToNTokenSlots.get(device).get(token).add(mjh.e(mobileResource.getNormToken(), asString));
            return;
        }
        this.actionDict.add(token);
        this.actionDict.add(mobileResource.getNormToken());
        if (!this.actionTokenToNTokenSlots.containsKey(token)) {
            this.actionTokenToNTokenSlots.put(token, new HashSet());
        }
        this.actionTokenToNTokenSlots.get(token).add(mjh.e(mobileResource.getNormToken(), asString));
        if (jsonObject.has("meta") && jsonObject.getAsJsonObject("meta").has("action")) {
            if (jsonObject.getAsJsonObject("meta").has("score")) {
                this.actionScore.put(jsonObject.get("token").getAsString(), Double.valueOf(jsonObject.getAsJsonObject("meta").get("score").getAsDouble()));
            } else {
                this.actionScore.put(jsonObject.get("token").getAsString(), Double.valueOf(1.0d));
            }
        }
    }

    public double getActionScore(String str) {
        if (this.actionScore.containsKey(str)) {
            return this.actionScore.get(str).doubleValue();
        }
        return 0.0d;
    }

    public String getDevice(String str) {
        return (str == null || str.equals("")) ? "universal" : str;
    }

    public Set<mjh<String, String>> getDeviceBaseNTokenSlot(String str, Device device) {
        String deviceTypeBase = Device.getDeviceTypeBase(device);
        if (this.deviceTokenToNTokenSlots.containsKey(deviceTypeBase) && this.deviceTokenToNTokenSlots.get(deviceTypeBase).containsKey(str)) {
            return this.deviceTokenToNTokenSlots.get(deviceTypeBase).get(str);
        }
        return this.actionTokenToNTokenSlots.containsKey(str) ? this.actionTokenToNTokenSlots.get(str) : new HashSet();
    }

    @Deprecated
    public Set<mjh<String, String>> getDeviceNTokenSlot(String str, Device device) {
        String deviceType = Device.getDeviceType(device);
        if (this.deviceTokenToNTokenSlots.containsKey(deviceType) && this.deviceTokenToNTokenSlots.get(deviceType).containsKey(str)) {
            return this.deviceTokenToNTokenSlots.get(deviceType).get(str);
        }
        return this.actionTokenToNTokenSlots.containsKey(str) ? this.actionTokenToNTokenSlots.get(str) : new HashSet();
    }

    public Set<mjh<String, String>> getDeviceUpdateNTokenSlot(String str, Device device) {
        String deviceTypeUpdate = Device.getDeviceTypeUpdate(device);
        if (this.deviceTokenToNTokenSlots.containsKey(deviceTypeUpdate) && this.deviceTokenToNTokenSlots.get(deviceTypeUpdate).containsKey(str)) {
            return this.deviceTokenToNTokenSlots.get(deviceTypeUpdate).get(str);
        }
        return this.actionTokenToNTokenSlots.containsKey(str) ? this.actionTokenToNTokenSlots.get(str) : new HashSet();
    }

    @Deprecated
    public Set<String> getDict(Device device) {
        String deviceType = Device.getDeviceType(device);
        return this.deviceDict.containsKey(deviceType) ? this.deviceDict.get(deviceType) : this.actionDict;
    }

    public Set<String> getDictBase(Device device) {
        String deviceTypeBase = Device.getDeviceTypeBase(device);
        return this.deviceDict.containsKey(deviceTypeBase) ? this.deviceDict.get(deviceTypeBase) : this.actionDict;
    }

    public Set<String> getDictUpdate(Device device) {
        String deviceTypeUpdate = Device.getDeviceTypeUpdate(device);
        return this.deviceDict.containsKey(deviceTypeUpdate) ? this.deviceDict.get(deviceTypeUpdate) : this.actionDict;
    }

    public boolean init(List<InputStream> list) throws Exception {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<InputStream> it = list.iterator();
        while (it.hasNext()) {
            loadMobileResources(it.next());
        }
        Iterator<String> it2 = this.deviceDict.keySet().iterator();
        while (it2.hasNext()) {
            this.deviceDict.get(it2.next()).addAll(this.actionDict);
        }
        Iterator<String> it3 = this.deviceTokenToNTokenSlots.keySet().iterator();
        while (it3.hasNext()) {
            this.deviceTokenToNTokenSlots.get(it3.next()).putAll(this.actionTokenToNTokenSlots);
        }
        return true;
    }

    public void loadMobileResources(InputStream inputStream) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        JsonArray jsonArray = new JsonArray();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            } else {
                jsonArray.add(j4b.a().parse(line.trim()).getAsJsonObject());
            }
        }
        bufferedReader.close();
        loadMobileResources(jsonArray);
        Iterator<String> it = this.deviceDict.keySet().iterator();
        while (it.hasNext()) {
            this.deviceDict.get(it.next()).addAll(this.actionDict);
        }
        Iterator<String> it2 = this.deviceTokenToNTokenSlots.keySet().iterator();
        while (it2.hasNext()) {
            this.deviceTokenToNTokenSlots.get(it2.next()).putAll(this.actionTokenToNTokenSlots);
        }
    }

    public MobileResourceLoader(String str) throws Exception {
        loadMobileResources(new FileInputStream(new File(str)));
    }

    public class MobileResource {
        private String device;
        private JsonObject meta;
        private String normToken;
        private String slotType;
        private String token;

        public MobileResource(JsonObject jsonObject) {
            this.device = "";
            this.token = jsonObject.get("token").getAsString();
            this.normToken = jsonObject.get("norm_token").getAsString();
            this.slotType = jsonObject.get("slot").getAsString();
            if (jsonObject.has("meta")) {
                JsonObject asJsonObject = jsonObject.get("meta").getAsJsonObject();
                this.meta = asJsonObject;
                if (asJsonObject.has("deviceType")) {
                    this.device = this.meta.get("deviceType").getAsString();
                }
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                MobileResource mobileResource = (MobileResource) obj;
                String str = this.token;
                if (str == null ? mobileResource.token == null : str.equals(mobileResource.token)) {
                    String str2 = this.normToken;
                    if (str2 != null) {
                        if (str2.equals(mobileResource.normToken)) {
                            JsonObject jsonObject = this.meta;
                            JsonObject jsonObject2 = mobileResource.meta;
                            if (jsonObject != null) {
                                return jsonObject.equals(jsonObject2);
                            }
                            return jsonObject2 == null;
                        }
                    } else if (mobileResource.normToken == null) {
                        JsonObject jsonObject3 = this.meta;
                        JsonObject jsonObject4 = mobileResource.meta;
                        if (jsonObject3 != null) {
                            return jsonObject3.equals(jsonObject4);
                        }
                        return jsonObject4 == null;
                    }
                }
            }
            return false;
        }

        public String getDevice() {
            return this.device;
        }

        public JsonObject getMeta() {
            return this.meta;
        }

        public String getNormToken() {
            return this.normToken;
        }

        public String getSlotType() {
            return this.slotType;
        }

        public String getToken() {
            return this.token;
        }

        public int hashCode() {
            String str = this.token;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.normToken;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            JsonObject jsonObject = this.meta;
            return iHashCode2 + (jsonObject != null ? jsonObject.hashCode() : 0);
        }

        public void setDevice(String str) {
            this.device = str;
        }

        public void setMeta(JsonObject jsonObject) {
            this.meta = jsonObject;
        }

        public void setNormToken(String str) {
            this.normToken = str;
        }

        public void setSlotType(String str) {
            this.slotType = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public MobileResource(String str, String str2, JsonObject jsonObject) {
            this.device = "";
            this.token = str;
            this.normToken = str2;
            this.meta = jsonObject;
        }
    }

    public void loadMobileResources(JsonArray jsonArray) throws Exception {
        super.loadResources(jsonArray);
        if (jsonArray == null || jsonArray.isJsonNull()) {
            return;
        }
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject asJsonObject = jsonArray.get(i).getAsJsonObject();
            if (asJsonObject.has("slot") && asJsonObject.has("token") && asJsonObject.has("norm_token")) {
                addMobileResource(asJsonObject);
            } else {
                throw new RuntimeException("resource loaded failed, info:" + asJsonObject);
            }
        }
    }

    public MobileResourceLoader() {
    }
}
