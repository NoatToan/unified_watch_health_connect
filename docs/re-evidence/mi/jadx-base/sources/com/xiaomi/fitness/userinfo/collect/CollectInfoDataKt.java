package com.xiaomi.fitness.userinfo.collect;

import com.xiaomi.fitness.common.extensions.ListExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUserInfoReport", "Lcom/xiaomi/fitness/userinfo/collect/UserInfoReport;", "Lcom/xiaomi/fitness/userinfo/collect/UserInfoReportWrapper;", "user-info_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCollectInfoData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectInfoData.kt\ncom/xiaomi/fitness/userinfo/collect/CollectInfoDataKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,75:1\n216#2,2:76\n216#2,2:78\n216#2,2:80\n216#2,2:82\n216#2,2:84\n216#2,2:86\n*S KotlinDebug\n*F\n+ 1 CollectInfoData.kt\ncom/xiaomi/fitness/userinfo/collect/CollectInfoDataKt\n*L\n54#1:76,2\n57#1:78,2\n60#1:80,2\n63#1:82,2\n66#1:84,2\n69#1:86,2\n*E\n"})
public final class CollectInfoDataKt {
    @NotNull
    public static final UserInfoReport toUserInfoReport(@NotNull UserInfoReportWrapper userInfoReportWrapper) {
        Intrinsics.checkNotNullParameter(userInfoReportWrapper, "<this>");
        ArrayList arrayList = new ArrayList();
        ReportItemData gpsData = userInfoReportWrapper.getGpsData();
        if (gpsData != null) {
            ListExtKt.add(arrayList, gpsData);
        }
        Map<String, ReportItemData> phoneInfoMap = userInfoReportWrapper.getPhoneInfoMap();
        if (phoneInfoMap != null) {
            Iterator<Map.Entry<String, ReportItemData>> it = phoneInfoMap.entrySet().iterator();
            while (it.hasNext()) {
                ListExtKt.add(arrayList, it.next().getValue());
            }
        }
        Map<String, ReportItemData> emailInfoMap = userInfoReportWrapper.getEmailInfoMap();
        if (emailInfoMap != null) {
            Iterator<Map.Entry<String, ReportItemData>> it2 = emailInfoMap.entrySet().iterator();
            while (it2.hasNext()) {
                ListExtKt.add(arrayList, it2.next().getValue());
            }
        }
        Map<String, ReportItemData> deviceModelInfoMap = userInfoReportWrapper.getDeviceModelInfoMap();
        if (deviceModelInfoMap != null) {
            Iterator<Map.Entry<String, ReportItemData>> it3 = deviceModelInfoMap.entrySet().iterator();
            while (it3.hasNext()) {
                ListExtKt.add(arrayList, it3.next().getValue());
            }
        }
        Map<String, ReportItemData> osVerInfoMap = userInfoReportWrapper.getOsVerInfoMap();
        if (osVerInfoMap != null) {
            Iterator<Map.Entry<String, ReportItemData>> it4 = osVerInfoMap.entrySet().iterator();
            while (it4.hasNext()) {
                ListExtKt.add(arrayList, it4.next().getValue());
            }
        }
        Map<String, ReportItemData> deviceSettingInfoMap = userInfoReportWrapper.getDeviceSettingInfoMap();
        if (deviceSettingInfoMap != null) {
            Iterator<Map.Entry<String, ReportItemData>> it5 = deviceSettingInfoMap.entrySet().iterator();
            while (it5.hasNext()) {
                ListExtKt.add(arrayList, it5.next().getValue());
            }
        }
        Map<String, ReportItemData> deviceIdInfoMap = userInfoReportWrapper.getDeviceIdInfoMap();
        if (deviceIdInfoMap != null) {
            Iterator<Map.Entry<String, ReportItemData>> it6 = deviceIdInfoMap.entrySet().iterator();
            while (it6.hasNext()) {
                ListExtKt.add(arrayList, it6.next().getValue());
            }
        }
        return new UserInfoReport(arrayList);
    }
}
