package com.huawei.maps.offlinedata.handler;

import android.webkit.JavascriptInterface;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.handler.dto.persist.NaviVoiceOfflineDataItemEntity;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.handler.dto.persist.WorldMapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.jsbridge.a;
import com.huawei.maps.offlinedata.service.persist.b;
import com.huawei.maps.offlinedata.utils.d;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class Repository extends JsBaseModule {
    @JavascriptInterface
    public void addDataTask(String str) {
        b.e().a((OfflineDataTaskEntity) d.a(str, OfflineDataTaskEntity.class));
    }

    @JavascriptInterface
    public void addMapDataItems(String str) {
        b.e().a((List) d.a(str, new TypeToken<List<MapOfflineDataItemEntity>>() { // from class: com.huawei.maps.offlinedata.handler.Repository.1
        }.getType()));
    }

    @JavascriptInterface
    public void addWorldMapDataItem(String str) {
        WorldMapOfflineDataItemEntity worldMapOfflineDataItemEntity = (WorldMapOfflineDataItemEntity) d.a(str, WorldMapOfflineDataItemEntity.class);
        if (worldMapOfflineDataItemEntity != null) {
            b.e().a(worldMapOfflineDataItemEntity);
        }
    }

    @JavascriptInterface
    public void deleteAllWorldMapDataItems() {
        b.e().d();
    }

    @JavascriptInterface
    public void deleteById(String str) {
        b.e().a(str);
    }

    @JavascriptInterface
    public void deleteMapDataItems() {
        b.e().b();
    }

    @JavascriptInterface
    public void getDataTaskList(final long j) {
        b.e().a(new com.huawei.maps.offlinedata.utils.b() { // from class: com.huawei.maps.offlinedata.handler.Repository$$ExternalSyntheticLambda1
            @Override // com.huawei.maps.offlinedata.utils.b
            public final void a(Object obj) {
                a.a().a((List) obj, j);
            }
        });
    }

    @JavascriptInterface
    public void getMapDataItemList(final long j) {
        b.e().b(new com.huawei.maps.offlinedata.utils.b() { // from class: com.huawei.maps.offlinedata.handler.Repository$$ExternalSyntheticLambda2
            @Override // com.huawei.maps.offlinedata.utils.b
            public final void a(Object obj) {
                a.a().a((List) obj, j);
            }
        });
    }

    public List<NaviVoiceOfflineDataItemEntity> getNaviVoiceDataItemList() {
        return Collections.EMPTY_LIST;
    }

    @JavascriptInterface
    public void getWorldMapDataItemList(final long j) {
        b.e().c(new com.huawei.maps.offlinedata.utils.b() { // from class: com.huawei.maps.offlinedata.handler.Repository$$ExternalSyntheticLambda0
            @Override // com.huawei.maps.offlinedata.utils.b
            public final void a(Object obj) {
                a.a().a((List) obj, j);
            }
        });
    }

    public void saveNaviVoiceDataItem(NaviVoiceOfflineDataItemEntity naviVoiceOfflineDataItemEntity) {
    }

    @JavascriptInterface
    public void updateDownloadTypeById(String str) {
        JsonElement jsonElement = (JsonElement) d.a(str, JsonElement.class);
        if (jsonElement != null) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            b.e().b(asJsonObject.get("id").getAsString(), asJsonObject.get("downloadType").getAsInt());
        }
    }

    public void updateNaviVoiceDataItem(NaviVoiceOfflineDataItemEntity naviVoiceOfflineDataItemEntity) {
    }

    @JavascriptInterface
    public void updateProgressById(String str) {
        JsonElement jsonElement = (JsonElement) d.a(str, JsonElement.class);
        if (jsonElement != null) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            b.e().b(asJsonObject.get("id").getAsString(), asJsonObject.get("downloadProgress").getAsInt(), asJsonObject.get("transmitProgress").getAsInt());
        }
    }

    @JavascriptInterface
    public void updateStatusById(String str) {
        JsonElement jsonElement = (JsonElement) d.a(str, JsonElement.class);
        if (jsonElement != null) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            b.e().c(asJsonObject.get("id").getAsString(), asJsonObject.get("itemState").getAsString(), asJsonObject.get("taskState").getAsString());
        }
    }
}
