package com.xiaomi.ai.domain.mobileapp.parser;

import com.xiaomi.ai.domain.mobileapp.common.AppItem;
import com.xiaomi.ai.domain.mobileapp.common.Device;
import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import defpackage.aqe;
import defpackage.j4b;
import defpackage.qpe;
import defpackage.t08;
import defpackage.xb8;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class ResourceSuite {
    public static final String BASE_RESOUECE_PATH = "mobileApp.entities.v2.gz";
    private static final int TOP_K = 20;
    private static final qpe LOGGER = aqe.f(ResourceSuite.class);
    private static ResourceSuite instance = new ResourceSuite();
    private BaseResourceData baseResource = new BaseResourceData();
    private UpdateResourceData updateResource = new UpdateResourceData();
    private BlackResource blackResource = new BlackResource();
    private boolean inited = false;

    public class a implements Comparator<AppItem> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AppItem appItem, AppItem appItem2) {
            if (appItem.getScore() > appItem2.getScore()) {
                return -1;
            }
            if (Math.abs(appItem.getScore() - appItem2.getScore()) < 1.0E-4d) {
                return -Integer.compare(appItem.getDownTimes(), appItem2.getDownTimes());
            }
            return 1;
        }
    }

    public class b implements Comparator<AppItem> {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AppItem appItem, AppItem appItem2) {
            if (appItem.getScore() > appItem2.getScore()) {
                return -1;
            }
            if (Math.abs(appItem.getScore() - appItem2.getScore()) < 1.0E-4d) {
                return -Integer.compare(appItem.getDownTimes(), appItem2.getDownTimes());
            }
            return 1;
        }
    }

    public class c implements Comparator<AppItem> {
        public c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AppItem appItem, AppItem appItem2) {
            if (appItem.getScore() > appItem2.getScore()) {
                return -1;
            }
            if (Math.abs(appItem.getScore() - appItem2.getScore()) < 1.0E-4d) {
                return -Integer.compare(appItem.getDownTimes(), appItem2.getDownTimes());
            }
            return 1;
        }
    }

    public class d implements Comparator<AppItem> {
        public d() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AppItem appItem, AppItem appItem2) {
            if (appItem.getScore() > appItem2.getScore()) {
                return -1;
            }
            if (Math.abs(appItem.getScore() - appItem2.getScore()) < 1.0E-4d) {
                return -Integer.compare(appItem.getDownTimes(), appItem2.getDownTimes());
            }
            return 1;
        }
    }

    private ResourceSuite() {
    }

    private InputStream genNonNameInputStream() throws IOException {
        StringBuilder sb = new StringBuilder();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(t08.a(BASE_RESOUECE_PATH));
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        gZIPInputStream.close();
                        return new ByteArrayInputStream(sb.toString().getBytes());
                    }
                    if (!"name".equals(j4b.a().parse(line).getAsJsonObject().get("slot").getAsString())) {
                        sb.append(line + "\n");
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                try {
                    throw th;
                } catch (Throwable th4) {
                    try {
                        gZIPInputStream.close();
                    } catch (Throwable th5) {
                        th.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            throw th6;
        }
    }

    private List<AppItem> genTopKItems(Device device) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.baseResource.getTopKItems(device));
        arrayList.addAll(this.updateResource.getTopKItems(device));
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList.subList(0, Math.min(20, arrayList.size()));
    }

    @Deprecated
    private AppItem getAppItemByPackageNameOld(String str, Device device) {
        AppItem appItemByPackageName = this.baseResource.getAppItemByPackageName(str, device);
        return appItemByPackageName == null ? this.updateResource.getAppItemByPackageName(str, device) : appItemByPackageName;
    }

    public static ResourceSuite getInstance() {
        return instance;
    }

    public List<xb8> extractEntities(String str, Device device) {
        List<xb8> listExtractEntities = this.baseResource.extractEntities(str, true, device);
        listExtractEntities.addAll(this.updateResource.extractEntities(str, false, device));
        return listExtractEntities;
    }

    public double getActionScore(String str) {
        double actionScore = this.updateResource.getActionScore(str);
        if (actionScore >= 1.0E-5d) {
            return actionScore;
        }
        double actionScore2 = this.baseResource.getActionScore(str);
        if (actionScore2 < 1.0E-5d) {
            return 1.0d;
        }
        return actionScore2;
    }

    public AppItem getAppItemByPackageName(String str, Device device) {
        AppItem appItemByPackageName = this.updateResource.getAppItemByPackageName(str, device);
        return appItemByPackageName == null ? this.baseResource.getAppItemByPackageName(str, device) : appItemByPackageName;
    }

    public List<MobileAppIntention.ShowApp> getAppListByTokenFuzzySearchMerge(String str, Device device) {
        List<MobileAppIntention.ShowApp> appListByTokenFuzzySearch = this.updateResource.getAppListByTokenFuzzySearch(str, device);
        List<MobileAppIntention.ShowApp> appListByTokenFuzzySearch2 = this.baseResource.getAppListByTokenFuzzySearch(str, device);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(appListByTokenFuzzySearch);
        linkedHashSet.addAll(appListByTokenFuzzySearch2);
        ArrayList arrayList = new ArrayList(linkedHashSet);
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList.subList(0, Math.min(3, arrayList.size()));
    }

    public BaseResourceData getBaseResource() {
        return this.baseResource;
    }

    public boolean getHitAndSimilarAppItems(String str, List<AppItem> list, Device device) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.baseResource.getHitAndSimilarAppItems(str, arrayList, arrayList2, device);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.updateResource.getHitAndSimilarAppItems(str, arrayList3, arrayList4, device);
        Collections.sort(arrayList, new a());
        Collections.sort(arrayList2, new b());
        Collections.sort(arrayList3, new c());
        Collections.sort(arrayList4, new d());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(arrayList3);
        linkedHashSet.addAll(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(arrayList4);
        linkedHashSet2.addAll(arrayList2);
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        Collection<? extends AppItem> arrayList6 = new ArrayList<>(linkedHashSet2);
        list.addAll(arrayList5);
        list.addAll(arrayList6);
        return !arrayList5.isEmpty();
    }

    public List<String> getNames() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.baseResource.getDict("name"));
        arrayList.addAll(this.updateResource.getDict("name"));
        return arrayList;
    }

    public List<AppItem> getTagAppItems(String str, Device device) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        this.updateResource.getTagTopAppsItems(str, arrayList, device);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashSet.add(((AppItem) it.next()).getPackageName());
        }
        ArrayList<AppItem> arrayList2 = new ArrayList();
        this.baseResource.getTagTopAppsItems(str, arrayList2, device);
        for (AppItem appItem : arrayList2) {
            if (!hashSet.contains(appItem.getPackageName())) {
                arrayList.add(appItem);
                hashSet.add(appItem.getPackageName());
            }
        }
        return arrayList;
    }

    public List<String> getTags() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.baseResource.getDict("tag"));
        arrayList.addAll(this.updateResource.getDict("tag"));
        return arrayList;
    }

    public List<AppItem> getTopKItems(Device device) {
        return genTopKItems(device);
    }

    public UpdateResourceData getUpdateResource() {
        return this.updateResource;
    }

    public boolean hasToken(String str, Device device) {
        return this.baseResource.hasToken(str, device) || this.updateResource.hasToken(str, device);
    }

    public boolean initBlackResource(List<InputStream> list) throws Exception {
        boolean zInitEdgeBaseAndBlackResource = initEdgeBaseAndBlackResource();
        if (!zInitEdgeBaseAndBlackResource) {
            return zInitEdgeBaseAndBlackResource;
        }
        BlackResource blackResource = new BlackResource();
        boolean zInit = blackResource.init(list);
        if (zInit) {
            this.blackResource = blackResource;
            this.inited = true;
        }
        return zInit;
    }

    public synchronized boolean initEdgeBaseAndBlackResource() throws Exception {
        try {
            if (this.inited) {
                return true;
            }
            boolean zInit = this.baseResource.init(Collections.singletonList(genNonNameInputStream()));
            if (zInit) {
                zInit = this.blackResource.init();
            }
            if (zInit) {
                this.inited = true;
            }
            return zInit;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean initUpdateResource(List<InputStream> list) throws Exception {
        boolean zInitEdgeBaseAndBlackResource;
        zInitEdgeBaseAndBlackResource = initEdgeBaseAndBlackResource();
        if (zInitEdgeBaseAndBlackResource) {
            UpdateResourceData updateResourceData = new UpdateResourceData();
            boolean zInit = updateResourceData.init(list);
            if (zInit) {
                this.updateResource = updateResourceData;
                this.inited = true;
            }
            zInitEdgeBaseAndBlackResource = zInit;
        }
        return zInitEdgeBaseAndBlackResource;
    }

    public boolean isTagApp(String str, String str2, Device device) {
        return this.updateResource.isTagApp(str, str2, device) || this.baseResource.isTagApp(str, str2, device);
    }

    public boolean isTopApp(String str, Device device) {
        return this.baseResource.isTopApp(str, device) || this.updateResource.isTopApp(str, device);
    }

    public boolean matchBlackPatternList(String str) {
        return this.baseResource.matchBlackPatternList(str);
    }

    public boolean matchBlackQuery(String str) {
        return this.blackResource.matchBlackQuery(str);
    }

    public boolean matchBlackWord(String str) {
        return this.blackResource.matchBlackWord(str);
    }

    public boolean matchTopnameBlackList(String str) {
        return this.baseResource.matchTopnameBlackList(str);
    }

    public boolean matchWeakPatternBlackList(String str) {
        return this.baseResource.matchWeakPatternBlackList(str);
    }

    public boolean matchWhiteList(String str) {
        return this.baseResource.matchWhitePatternList(str);
    }

    public void setEdgeBlkToken(String str) {
        this.baseResource.setEdgeBlkToken(str);
        this.updateResource.setEdgeBlkToken(str);
    }

    public synchronized boolean updateBaseResource(List<InputStream> list) throws Exception {
        boolean zInitEdgeBaseAndBlackResource;
        zInitEdgeBaseAndBlackResource = initEdgeBaseAndBlackResource();
        if (zInitEdgeBaseAndBlackResource) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(genNonNameInputStream());
            arrayList.addAll(list);
            BaseResourceData baseResourceData = new BaseResourceData();
            zInitEdgeBaseAndBlackResource = baseResourceData.init(arrayList);
            if (zInitEdgeBaseAndBlackResource) {
                this.baseResource = baseResourceData;
                this.inited = true;
            }
        }
        return zInitEdgeBaseAndBlackResource;
    }
}
