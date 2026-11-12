package com.huawei.agconnect.apms.collect.model;

import com.google.gson.JsonArray;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.bcd;
import com.huawei.agconnect.apms.collect.model.basic.ApplicationInformation;
import com.huawei.agconnect.apms.collect.model.basic.DeviceInformation;
import com.huawei.agconnect.apms.collect.model.basic.PlatformInformation;
import com.huawei.agconnect.apms.collect.model.basic.UserSettingsInformation;
import com.huawei.agconnect.apms.collect.model.event.Events;
import com.huawei.agconnect.apms.collect.model.event.fps.FpsDropEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ActivityLoadEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.ActivityRenderEvent;
import com.huawei.agconnect.apms.collect.model.event.interaction.AppStartEvent;
import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.huawei.agconnect.apms.collect.model.event.webview.WebViewErrorEvent;
import com.huawei.agconnect.apms.collect.model.event.webview.WebViewLoadEvent;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.m;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class CollectData extends CollectableArray {
    private static final AgentLog LOG = AgentLogManager.getAgentLog();
    private Events<ActivityLoadEvent> activityLoadEvents;
    private Events<ActivityRenderEvent> activityRenderEvents;
    private Events<AppStartEvent> appStartEvents;
    private ApplicationInformation applicationInformation;
    private DeviceInformation deviceInformation;
    private final ExecutorService executor;
    private Events<FpsDropEvent> fpsDropEvents;
    private Events<HttpEvent> httpEvents;
    private boolean isValid;
    private PlatformInformation platformInformation;
    private UserSettingsInformation userSettingsInformation;
    private Events<WebViewErrorEvent> webViewErrorEvents;
    private Events<WebViewLoadEvent> webViewLoadEvents;

    public CollectData() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new m("CollectData"));
        this.executor = executorServiceNewSingleThreadExecutor;
        this.isValid = false;
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.agconnect.apms.collect.model.CollectData.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    CollectData.this.deviceInformation = Agent.getDeviceInformation();
                } catch (Throwable th) {
                    bcd.abc(th, abc.abc("failed to get DeviceInformation: "), CollectData.LOG);
                }
                try {
                    CollectData.this.platformInformation = Agent.getPlatformInformation();
                } catch (Throwable th2) {
                    bcd.abc(th2, abc.abc("failed to get PlatformInformation: "), CollectData.LOG);
                }
                try {
                    CollectData.this.userSettingsInformation = Agent.getUserSettingsInformation();
                } catch (Throwable th3) {
                    bcd.abc(th3, abc.abc("failed to get SettingsInformation: "), CollectData.LOG);
                }
                CollectData.this.applicationInformation = Agent.getApplicationInformation();
            }
        });
        this.appStartEvents = new Events<>();
        this.activityLoadEvents = new Events<>();
        this.activityRenderEvents = new Events<>();
        this.httpEvents = new Events<>();
        this.webViewLoadEvents = new Events<>();
        this.webViewErrorEvents = new Events<>();
        this.fpsDropEvents = new Events<>();
    }

    @Override // com.huawei.agconnect.apms.collect.type.CollectableArray, com.huawei.agconnect.apms.collect.type.BaseCollectable, com.huawei.agconnect.apms.collect.type.Collectable
    public JsonArray asJsonArray() {
        JsonArray jsonArray = new JsonArray();
        DeviceInformation deviceInformation = this.deviceInformation;
        if (deviceInformation != null) {
            jsonArray.add(deviceInformation.asJsonArray());
        }
        PlatformInformation platformInformation = this.platformInformation;
        if (platformInformation != null) {
            jsonArray.add(platformInformation.asJsonArray());
        }
        UserSettingsInformation userSettingsInformation = this.userSettingsInformation;
        if (userSettingsInformation != null) {
            jsonArray.add(userSettingsInformation.asJsonArray());
        }
        ApplicationInformation applicationInformation = this.applicationInformation;
        if (applicationInformation != null) {
            jsonArray.add(applicationInformation.asJsonArray());
        }
        jsonArray.add(this.appStartEvents.asJsonArray());
        jsonArray.add(this.activityLoadEvents.asJsonArray());
        jsonArray.add(this.activityRenderEvents.asJsonArray());
        jsonArray.add(this.httpEvents.asJsonArray());
        jsonArray.add(this.webViewLoadEvents.asJsonArray());
        jsonArray.add(this.webViewErrorEvents.asJsonArray());
        jsonArray.add(this.fpsDropEvents.asJsonArray());
        return jsonArray;
    }

    public Events<ActivityLoadEvent> getActivityLoadEvents() {
        return this.activityLoadEvents;
    }

    public Events<ActivityRenderEvent> getActivityRenderEvents() {
        return this.activityRenderEvents;
    }

    public Events<AppStartEvent> getAppStartEvents() {
        return this.appStartEvents;
    }

    public ApplicationInformation getApplicationInformation() {
        return this.applicationInformation;
    }

    public DeviceInformation getDeviceInformation() {
        return this.deviceInformation;
    }

    public int getEventCount() {
        int iCount = this.appStartEvents.count();
        int iCount2 = this.activityLoadEvents.count();
        int iCount3 = this.activityRenderEvents.count();
        int iCount4 = this.httpEvents.count();
        return this.webViewErrorEvents.count() + this.webViewLoadEvents.count() + iCount4 + iCount3 + iCount2 + iCount;
    }

    public Events<FpsDropEvent> getFpsDropEvents() {
        return this.fpsDropEvents;
    }

    public Events<HttpEvent> getHttpEvents() {
        return this.httpEvents;
    }

    public PlatformInformation getPlatformInformation() {
        return this.platformInformation;
    }

    public UserSettingsInformation getUserSettingsInformation() {
        return this.userSettingsInformation;
    }

    public Events<WebViewErrorEvent> getWebViewErrorEvents() {
        return this.webViewErrorEvents;
    }

    public Events<WebViewLoadEvent> getWebViewLoadEvents() {
        return this.webViewLoadEvents;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public void reset() {
        this.appStartEvents.clear();
        this.activityLoadEvents.clear();
        this.activityRenderEvents.clear();
        this.httpEvents.clear();
        this.webViewLoadEvents.clear();
        this.webViewErrorEvents.clear();
        this.fpsDropEvents.clear();
    }

    public void setValid(boolean z) {
        this.isValid = z;
    }

    public void shutDownCollectData() {
        ExecutorService executorService = this.executor;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }
}
