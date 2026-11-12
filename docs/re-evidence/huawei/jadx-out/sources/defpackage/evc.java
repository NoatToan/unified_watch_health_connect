package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class evc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33509b;

    public evc(int i) {
        this.f33509b = i;
    }

    public static Map<Integer, ResourceResultInfo> a(Map<Integer, ResourceResultInfo> map, Map<String, ?> map2, int i) {
        return new evc(i).a(map, map2);
    }

    private Map<Integer, ResourceResultInfo> a(Map<Integer, ResourceResultInfo> map, Map<String, ?> map2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map3 = new HashMap();
        if (map == null) {
            LogUtil.b("MarketingResourceFilter", "filterResourceByEvent skipped, ResultInfoMap is null in filterResource.");
            return map3;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, ResourceResultInfo>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next().getKey();
            int iIntValue = key.intValue();
            arrayList.add(key);
            map3.put(key, b(iIntValue, map.get(key), map2));
        }
        LogUtil.b("MarketingResourceFilter", "filterResourceByEvent finished, positionIdList: " + arrayList + ", eventType: " + this.f33509b + ", time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        return map3;
    }

    public Map<Integer, ResourceResultInfo> d(Map<Integer, ResourceResultInfo> map) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map2 = new HashMap();
        if (map == null) {
            LogUtil.b("MarketingResourceFilter", "filterInvalidRsc skipped, ResultInfoMap is null in filterResource.");
            return map2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, ResourceResultInfo>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next().getKey();
            int iIntValue = key.intValue();
            arrayList.add(key);
            map2.put(key, d(iIntValue, map.get(key)));
        }
        LogUtil.b("MarketingResourceFilter", "filterInvalidRsc finished, positionIdList: " + arrayList + ", time cost:" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        return map2;
    }

    private ResourceResultInfo b(int i, ResourceResultInfo resourceResultInfo, Map<String, ?> map) {
        if (resourceResultInfo == null || resourceResultInfo.getTotalNum() == 0 || njy.e(resourceResultInfo.getResources())) {
            LogUtil.b("MarketingResourceFilter", "filter single position skipped, positionId: " + i + ", eventType:" + this.f33509b + ", triggerEventParams: " + map + ", reason: resourceResultInfo is null or no resource");
            return null;
        }
        ArrayList<ResourceBriefInfo> arrayList = new ArrayList(resourceResultInfo.getResources());
        Collections.sort(arrayList, new Comparator<ResourceBriefInfo>() { // from class: evc.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(ResourceBriefInfo resourceBriefInfo, ResourceBriefInfo resourceBriefInfo2) {
                return resourceBriefInfo2.getPriority() - resourceBriefInfo.getPriority();
            }
        });
        ArrayList arrayList2 = new ArrayList();
        if (njy.e(arrayList)) {
            LogUtil.e("MarketingResourceFilter", "filterByEventInner skip, resourceBriefInfoList is null or no resource. PositionId: ", Integer.valueOf(i));
            return null;
        }
        int i2 = 0;
        for (ResourceBriefInfo resourceBriefInfo : arrayList) {
            if (resourceBriefInfo != null && resourceBriefInfo.getMarketingRule() != null) {
                if (evr.e(this.f33509b, map, resourceBriefInfo.getMarketingRule().getTriggerEvents())) {
                    LogUtil.b("MarketingResourceFilter", "matched resource found: " + resourceBriefInfo.getResourceName());
                    arrayList2.add(resourceBriefInfo);
                    i2++;
                    if (resourceBriefInfo.getContentType() == 1 || resourceBriefInfo.getContentType() == 2 || resourceBriefInfo.getContentType() == 45 || resourceBriefInfo.getContentType() == 50 || resourceBriefInfo.getContentType() == 68 || resourceBriefInfo.getContentType() == 69 || resourceBriefInfo.getContentType() == 70) {
                        LogUtil.b("MarketingResourceFilter", "jump out of loop, due to special content type");
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        LogUtil.b("MarketingResourceFilter", "filter single position finished, positionId: " + i + ", eventType:" + this.f33509b + ", triggerEventParams: " + map + ", size: " + arrayList.size() + "->" + arrayList2.size());
        return new ResourceResultInfo.Builder().setTotalNum(i2).setResourcesLatestModifyTime(resourceResultInfo.getResourcesLatestModifyTime()).setResources(arrayList2).build();
    }

    private ResourceResultInfo d(int i, ResourceResultInfo resourceResultInfo) {
        if (resourceResultInfo == null || resourceResultInfo.getTotalNum() == 0 || njy.e(resourceResultInfo.getResources())) {
            LogUtil.b("MarketingResourceFilter", "filterInvalidInner skipped, resourceResultInfo is null or no resource. PositionId: ", Integer.valueOf(i));
            return null;
        }
        LogUtil.b("MarketingResourceFilter", "filterInvalidInner, positionId: " + i);
        ArrayList<ResourceBriefInfo> arrayList = new ArrayList(resourceResultInfo.getResources());
        ArrayList arrayList2 = new ArrayList();
        if (njy.e(arrayList)) {
            LogUtil.e("MarketingResourceFilter", "resourceBriefInfoList is null or no resource.PositionId:", Integer.valueOf(i));
            return null;
        }
        ArrayList<ResourceBriefInfo> arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        for (ResourceBriefInfo resourceBriefInfo : arrayList) {
            if (resourceBriefInfo == null || resourceBriefInfo.getMarketingRule() == null || resourceBriefInfo.getMarketingRule().getBackupSwitch() == 0 || TextUtils.isEmpty(resourceBriefInfo.getMarketingRule().getBackupResourceId())) {
                map.put(resourceBriefInfo.getResourceId(), resourceBriefInfo);
            } else {
                arrayList3.add(resourceBriefInfo);
            }
        }
        int i2 = 0;
        for (ResourceBriefInfo resourceBriefInfo2 : arrayList3) {
            if (e(i, resourceBriefInfo2)) {
                arrayList2.add(resourceBriefInfo2);
                String backupResourceId = resourceBriefInfo2.getMarketingRule().getBackupResourceId();
                if (map.containsKey(backupResourceId)) {
                    LogUtil.b("MarketingResourceFilter", "backup resource found, kick it out:" + backupResourceId);
                    map.remove(backupResourceId);
                }
                i2++;
            }
        }
        for (ResourceBriefInfo resourceBriefInfo3 : new ArrayList(map.values())) {
            if (e(i, resourceBriefInfo3)) {
                arrayList2.add(resourceBriefInfo3);
                i2++;
            }
        }
        LogUtil.b("MarketingResourceFilter", "filterInvalidInner finished, positionId: " + i + ", before size: " + arrayList.size() + ", after size: " + arrayList2.size());
        return new ResourceResultInfo.Builder().setTotalNum(i2).setResourcesLatestModifyTime(resourceResultInfo.getResourcesLatestModifyTime()).setResources(arrayList2).build();
    }

    public static boolean e(int i, ResourceBriefInfo resourceBriefInfo) {
        if (resourceBriefInfo == null) {
            LogUtil.b("MarketingResourceFilter", "resource invalid, null");
            return false;
        }
        if (!new evu(i, resourceBriefInfo).a()) {
            LogUtil.b("MarketingResourceFilter", "resource invalid in time dimension, name:" + resourceBriefInfo.getResourceName());
            return false;
        }
        if (!new ewa().e(resourceBriefInfo)) {
            LogUtil.b("MarketingResourceFilter", "resource invalid in logic dimension, name:" + resourceBriefInfo.getResourceName());
            return false;
        }
        if (new evz().e(resourceBriefInfo.getMarketingRule().getUserLabels())) {
            return true;
        }
        LogUtil.b("MarketingResourceFilter", "resource invalid in user-label dimension, name:" + resourceBriefInfo.getResourceName());
        return false;
    }
}
