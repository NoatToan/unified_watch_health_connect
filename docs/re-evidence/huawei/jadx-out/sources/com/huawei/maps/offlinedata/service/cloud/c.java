package com.huawei.maps.offlinedata.service.cloud;

import android.text.TextUtils;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.handler.dto.persist.WorldMapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.health.init.OnCheckRegionListListener;
import com.huawei.maps.offlinedata.health.init.OnDownloadByWearListener;
import com.huawei.maps.offlinedata.network.d;
import com.huawei.maps.offlinedata.service.cloud.dto.AuthRequestDTO;
import com.huawei.maps.offlinedata.service.cloud.dto.AuthResponseDTO;
import com.huawei.maps.offlinedata.service.cloud.dto.OfflineMapRequestDto;
import com.huawei.maps.offlinedata.service.cloud.dto.OfflineMapResponseDto;
import com.huawei.maps.offlinedata.service.cloud.utils.CountryCodeUtil;
import com.huawei.maps.offlinedata.utils.f;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.secure.android.common.sign.HiPkgSignManager;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f17882a;

    class a extends com.huawei.maps.offlinedata.network.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f17883a;

        a(String str) {
            this.f17883a = str;
        }

        @Override // com.huawei.maps.offlinedata.network.b
        public void a(OfflineMapResponseDto offlineMapResponseDto) {
            g.c("OfflineMapDataServiceImpl", "loadCloudGlobalList success.");
            if (offlineMapResponseDto == null) {
                g.b("OfflineMapDataServiceImpl", "response is null");
                return;
            }
            String str = TextUtils.isEmpty(this.f17883a) ? "watch_map" : "watch_map_ski";
            WorldMapOfflineDataItemEntity dataItem = offlineMapResponseDto.getDataItem();
            dataItem.setDataType(str);
            g.c("OfflineMapDataServiceImpl", "loadCloudGlobalList dataType: " + this.f17883a + ", mapType: " + str + ", packageSize: " + dataItem.getPackageSize() + ", originalSize: " + dataItem.getOriginalSize());
            MapOfflineDataItemEntity mapOfflineDataItemEntity = new MapOfflineDataItemEntity();
            mapOfflineDataItemEntity.setId(dataItem.getId());
            mapOfflineDataItemEntity.setDataType(str);
            mapOfflineDataItemEntity.setCountryId(dataItem.getCountryId());
            mapOfflineDataItemEntity.setCountryName(dataItem.getCountryName());
            mapOfflineDataItemEntity.setRegionId(dataItem.getRegionId());
            mapOfflineDataItemEntity.setRegionName(dataItem.getRegionName());
            mapOfflineDataItemEntity.setCityId(dataItem.getCityId());
            mapOfflineDataItemEntity.setCityName(dataItem.getCityName());
            mapOfflineDataItemEntity.setPolitical(dataItem.getPolitical());
            mapOfflineDataItemEntity.setFileId(dataItem.getFileId());
            mapOfflineDataItemEntity.setVersion(dataItem.getVersion());
            mapOfflineDataItemEntity.setPackageSize(dataItem.getPackageSize());
            mapOfflineDataItemEntity.setOriginalSize(dataItem.getOriginalSize());
            mapOfflineDataItemEntity.setFileCheck(dataItem.getFileCheck());
            mapOfflineDataItemEntity.setLastModifiedTime(dataItem.getLastModifiedTime());
            com.huawei.maps.offlinedata.service.persist.b.e().b(str);
            com.huawei.maps.offlinedata.service.persist.b.e().a(dataItem);
            com.huawei.maps.offlinedata.service.cloud.b.a().a(mapOfflineDataItemEntity);
        }

        @Override // com.huawei.maps.offlinedata.network.b
        public void a(int i, d dVar, String str) {
            g.b("OfflineMapDataServiceImpl", "loadCloudGlobalList failed, code:" + i + ", subCode:" + dVar.getReturnCode() + "," + dVar.getReturnDesc());
            com.huawei.maps.offlinedata.service.cloud.b.a().a((MapOfflineDataItemEntity) null);
        }
    }

    class b extends com.huawei.maps.offlinedata.network.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f17885a;

        b(String str) {
            this.f17885a = str;
        }

        @Override // com.huawei.maps.offlinedata.network.b
        public void a(OfflineMapResponseDto offlineMapResponseDto) {
            g.c("OfflineMapDataServiceImpl", this.f17885a + " loadCloudReginList success.");
            List<MapOfflineDataItemEntity> dataItemList = offlineMapResponseDto.getDataItemList();
            ArrayList arrayList = new ArrayList();
            for (MapOfflineDataItemEntity mapOfflineDataItemEntity : dataItemList) {
                if (!TextUtils.isEmpty(mapOfflineDataItemEntity.getCountryId())) {
                    arrayList.add(mapOfflineDataItemEntity.getCountryId());
                }
            }
            g.c("OfflineMapDataServiceImpl", this.f17885a + " all country id list size: " + arrayList.size());
            if (!arrayList.isEmpty()) {
                c.this.a(arrayList, this.f17885a);
            } else if ("watch_map".equals(this.f17885a)) {
                com.huawei.maps.offlinedata.service.cloud.b.a().b(new ArrayList());
            } else if ("watch_map_contour".equals(this.f17885a)) {
                com.huawei.maps.offlinedata.service.cloud.b.a().a(new ArrayList());
            }
        }

        @Override // com.huawei.maps.offlinedata.network.b
        public void a(int i, d dVar, String str) {
            g.b("OfflineMapDataServiceImpl", "loadCloudReginList failed. code:" + i + ", subCode:" + dVar.getReturnCode() + ", " + dVar.getReturnDesc());
            if ("watch_map".equals(this.f17885a)) {
                com.huawei.maps.offlinedata.service.cloud.b.a().b(new ArrayList());
            } else if ("watch_map_contour".equals(this.f17885a)) {
                com.huawei.maps.offlinedata.service.cloud.b.a().a(new ArrayList());
            }
        }
    }

    private c() {
    }

    public static c b() {
        if (f17882a == null) {
            synchronized (c.class) {
                if (f17882a == null) {
                    f17882a = new c();
                }
            }
        }
        return f17882a;
    }

    public AuthResponseDTO a() {
        g.c("OfflineMapDataServiceImpl", "authenticate start.");
        AuthRequestDTO authRequestDTO = new AuthRequestDTO();
        String packageName = com.huawei.maps.offlinedata.utils.a.b().getApplicationContext().getPackageName();
        String strA = com.huawei.maps.offlinedata.service.cloud.utils.b.a(com.huawei.maps.offlinedata.utils.a.b());
        authRequestDTO.setAppId(strA);
        authRequestDTO.setRequestId(com.huawei.maps.offlinedata.service.cloud.utils.c.a("authenticate", strA));
        authRequestDTO.setPackageName(packageName);
        authRequestDTO.setCertificateFingerprint(HiPkgSignManager.getInstalledAppHash(com.huawei.maps.offlinedata.utils.a.b(), packageName));
        authRequestDTO.setDeviceModel(com.huawei.maps.offlinedata.service.cloud.utils.b.a());
        authRequestDTO.setNetworkCountry(CountryCodeUtil.getNetworkCountryCode());
        authRequestDTO.setSimCardCountry(CountryCodeUtil.getSimCardCountryCode());
        authRequestDTO.setDeviceLocaleCountry(CountryCodeUtil.getLocaleCountryCode());
        authRequestDTO.setVendorCountry(CountryCodeUtil.getVendorCountryCode());
        try {
            Response<AuthResponseDTO> responseExecute = ((CloudOfflineServiceApi) com.huawei.maps.offlinedata.network.c.a().a(CloudOfflineServiceApi.class)).authenticate(com.huawei.maps.offlinedata.network.c.a("/open-service/v1/offline-data/authenticate"), com.huawei.maps.offlinedata.network.converter.a.a("application/json; charset=utf-8", com.huawei.maps.offlinedata.utils.d.a(authRequestDTO).getBytes(StandardCharsets.UTF_8))).execute();
            if (responseExecute != null && responseExecute.getBody() != null) {
                try {
                    return (AuthResponseDTO) com.huawei.maps.offlinedata.utils.d.a(com.huawei.maps.offlinedata.utils.d.a(responseExecute.getBody()), AuthResponseDTO.class);
                } catch (Exception e) {
                    g.b("OfflineMapDataServiceImpl", "response body exception:" + e);
                }
            }
            return null;
        } catch (IOException e2) {
            g.b("OfflineMapDataServiceImpl", "getAuthenticate failed. " + e2.getMessage());
            return null;
        }
    }

    public void c(String str) {
        g.c("OfflineMapDataServiceImpl", str + " loadCloudReginList start.");
        OfflineMapRequestDto offlineMapRequestDto = new OfflineMapRequestDto();
        offlineMapRequestDto.setDeviceType(com.huawei.maps.offlinedata.service.config.a.h().g());
        offlineMapRequestDto.setP(com.huawei.maps.offlinedata.service.cloud.a.c().d());
        offlineMapRequestDto.setLanguage(f.a());
        offlineMapRequestDto.setDataType(str);
        com.huawei.maps.offlinedata.network.c.a().b(((CloudOfflineServiceApi) com.huawei.maps.offlinedata.network.c.a().a(CloudOfflineServiceApi.class)).getCountryMapList(com.huawei.maps.offlinedata.network.c.a("/open-service/v1/offline-data/getCountryMapList"), com.huawei.maps.offlinedata.network.converter.a.a("application/json; charset=utf-8", com.huawei.maps.offlinedata.utils.d.a(offlineMapRequestDto).getBytes(StandardCharsets.UTF_8))), new b(str));
    }

    public void b(String str) {
        g.c("OfflineMapDataServiceImpl", "loadCloudGlobalList start, dataType: " + str);
        OfflineMapRequestDto offlineMapRequestDto = new OfflineMapRequestDto();
        offlineMapRequestDto.setDeviceType(com.huawei.maps.offlinedata.service.config.a.h().g());
        offlineMapRequestDto.setP(com.huawei.maps.offlinedata.service.cloud.a.c().d());
        offlineMapRequestDto.setLanguage(f.a());
        if (!TextUtils.isEmpty(str)) {
            offlineMapRequestDto.setDataType(str);
        }
        com.huawei.maps.offlinedata.network.c.a().b(((CloudOfflineServiceApi) com.huawei.maps.offlinedata.network.c.a().a(CloudOfflineServiceApi.class)).getWorldMap(com.huawei.maps.offlinedata.network.c.a("/open-service/v1/offline-data/getWorldMap"), com.huawei.maps.offlinedata.network.converter.a.a("application/json; charset=utf-8", com.huawei.maps.offlinedata.utils.d.a(offlineMapRequestDto).getBytes(StandardCharsets.UTF_8))), new a(str));
    }

    private List b(List list, String str) {
        OfflineMapRequestDto offlineMapRequestDto = new OfflineMapRequestDto();
        offlineMapRequestDto.setDeviceType(com.huawei.maps.offlinedata.service.config.a.h().g());
        offlineMapRequestDto.setP(com.huawei.maps.offlinedata.service.cloud.a.c().d());
        offlineMapRequestDto.setLanguage(f.a());
        offlineMapRequestDto.setCountryIds(TextUtils.join(",", list.toArray()));
        offlineMapRequestDto.setDataType(str);
        try {
            Response<OfflineMapResponseDto> responseExecute = ((CloudOfflineServiceApi) com.huawei.maps.offlinedata.network.c.a().a(CloudOfflineServiceApi.class)).getRegionMapList(com.huawei.maps.offlinedata.network.c.a("/open-service/v1/offline-data/getRegionMapList"), com.huawei.maps.offlinedata.network.converter.a.a("application/json; charset=utf-8", com.huawei.maps.offlinedata.utils.d.a(offlineMapRequestDto).getBytes(StandardCharsets.UTF_8))).execute();
            if (responseExecute != null && responseExecute.getBody() != null && responseExecute.getBody().getDataItemList() != null && !responseExecute.getBody().getDataItemList().isEmpty()) {
                List<MapOfflineDataItemEntity> dataItemList = responseExecute.getBody().getDataItemList();
                Iterator<MapOfflineDataItemEntity> it = dataItemList.iterator();
                while (it.hasNext()) {
                    it.next().setDataType(str);
                }
                return dataItemList;
            }
        } catch (IOException e) {
            g.b("OfflineMapDataServiceImpl", "getRegionMapList failed. " + e.getMessage());
        }
        return new ArrayList();
    }

    public void a(List list, final String str) {
        g.c("OfflineMapDataServiceImpl", str + " getOfflineRegionList start.");
        final List listB = b(list, str);
        g.c("OfflineMapDataServiceImpl", str + " getOfflineRegionList total size: " + listB.size());
        com.huawei.maps.offlinedata.service.persist.b.e().a(str, listB, new Runnable() { // from class: com.huawei.maps.offlinedata.service.cloud.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                c.a(str, listB);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, List list) {
        if ("watch_map".equals(str)) {
            com.huawei.maps.offlinedata.service.cloud.b.a().b(list);
        } else if ("watch_map_contour".equals(str)) {
            com.huawei.maps.offlinedata.service.cloud.b.a().a(list);
        }
    }

    public String a(String str) {
        g.c("OfflineMapDataServiceImpl", "getDownloadUrl start.");
        OfflineMapRequestDto offlineMapRequestDto = new OfflineMapRequestDto();
        offlineMapRequestDto.setFileId(str);
        try {
            Response<OfflineMapResponseDto> responseExecute = ((CloudOfflineServiceApi) com.huawei.maps.offlinedata.network.c.a().a(CloudOfflineServiceApi.class)).getDownloadUrl(com.huawei.maps.offlinedata.network.c.a("/open-service/v1/offline-data/getDownloadUrl"), com.huawei.maps.offlinedata.network.converter.a.a("application/json; charset=utf-8", com.huawei.maps.offlinedata.utils.d.a(offlineMapRequestDto).getBytes(StandardCharsets.UTF_8))).execute();
            if (responseExecute != null && responseExecute.getBody() != null) {
                return responseExecute.getBody().getUrl();
            }
            return "";
        } catch (IOException e) {
            g.b("OfflineMapDataServiceImpl", "getDownloadUrl failed. " + e.getMessage());
            return "";
        }
    }

    public void a(List list, OnCheckRegionListListener onCheckRegionListListener) {
        g.c("OfflineMapDataServiceImpl", "getRegionByLatLngs start.");
        OfflineMapRequestDto offlineMapRequestDto = new OfflineMapRequestDto();
        offlineMapRequestDto.setP(com.huawei.maps.offlinedata.service.cloud.a.c().d());
        offlineMapRequestDto.setPoints(list);
        try {
            Response<OfflineMapResponseDto> responseExecute = ((CloudOfflineServiceApi) com.huawei.maps.offlinedata.network.c.a().a(CloudOfflineServiceApi.class)).getRegionsByLatLngs(com.huawei.maps.offlinedata.network.c.a("/open-service/v1/offline-data/getRegionsByLatLngs"), com.huawei.maps.offlinedata.network.converter.a.a("application/json; charset=utf-8", com.huawei.maps.offlinedata.utils.d.a(offlineMapRequestDto).getBytes(StandardCharsets.UTF_8))).execute();
            if (responseExecute != null && responseExecute.getBody() != null) {
                com.huawei.maps.offlinedata.service.device.b.a().a(responseExecute.getBody().getRegions(), onCheckRegionListListener);
            } else {
                onCheckRegionListListener.onResult(new ArrayList());
                g.c("OfflineMapDataServiceImpl", "getRegionByLatLngs response is null");
            }
        } catch (IOException e) {
            onCheckRegionListListener.onResult(new ArrayList());
            g.b("OfflineMapDataServiceImpl", "getRegionByLatLngs failed. " + e.getMessage());
        }
    }

    public void a(List list, OnDownloadByWearListener onDownloadByWearListener) {
        g.c("OfflineMapDataServiceImpl", "getDownloadByLatLngs start.");
        OfflineMapRequestDto offlineMapRequestDto = new OfflineMapRequestDto();
        offlineMapRequestDto.setP(com.huawei.maps.offlinedata.service.cloud.a.c().d());
        offlineMapRequestDto.setPoints(list);
        try {
            Response<OfflineMapResponseDto> responseExecute = ((CloudOfflineServiceApi) com.huawei.maps.offlinedata.network.c.a().a(CloudOfflineServiceApi.class)).getRegionsByLatLngs(com.huawei.maps.offlinedata.network.c.a("/open-service/v1/offline-data/getRegionsByLatLngs"), com.huawei.maps.offlinedata.network.converter.a.a("application/json; charset=utf-8", com.huawei.maps.offlinedata.utils.d.a(offlineMapRequestDto).getBytes(StandardCharsets.UTF_8))).execute();
            if (responseExecute != null && responseExecute.getBody() != null) {
                List<MapOfflineDataItemEntity> regions = responseExecute.getBody().getRegions();
                g.c("OfflineMapDataServiceImpl", "getDownloadByLatLngs dataItem is " + com.huawei.maps.offlinedata.utils.d.a(regions));
                onDownloadByWearListener.onResult(regions);
                return;
            }
            onDownloadByWearListener.onResult(new ArrayList());
            g.c("OfflineMapDataServiceImpl", "getDownloadByLatLngs response is null");
        } catch (IOException e) {
            onDownloadByWearListener.onResult(new ArrayList());
            g.b("OfflineMapDataServiceImpl", "getDownloadByLatLngs failed. " + e.getMessage());
        }
    }
}
