package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.huami.watch.ota.UpdateUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes22.dex */
public class IDCGroupManager {
    private static final String SH_BS = "sh-bs";
    private static final String SH_NH = "sh-nh";
    private static final String TAG = "IDCGroupManager";
    private String lastIdcStr;
    private ConcurrentHashMap<String, DomainDetail> mDomainDetailMap = new ConcurrentHashMap<String, DomainDetail>() { // from class: com.ximalaya.ting.android.opensdk.httputil.httpswitch.IDCGroupManager.1
        {
            put("api.ximalaya.com", new DomainDetail(new ArrayList<IdcGroup>() { // from class: com.ximalaya.ting.android.opensdk.httputil.httpswitch.IDCGroupManager.1.1
                {
                    add(new IdcGroup("api.ximalaya.com", IDCGroupManager.SH_NH));
                    add(new IdcGroup("apihera.ximalaya.com", IDCGroupManager.SH_BS));
                }
            }));
            put("mpay.ximalaya.com", new DomainDetail(new ArrayList<IdcGroup>() { // from class: com.ximalaya.ting.android.opensdk.httputil.httpswitch.IDCGroupManager.1.2
                {
                    add(new IdcGroup("mpay.ximalaya.com", IDCGroupManager.SH_NH));
                    add(new IdcGroup("mpayhera.ximalaya.com", IDCGroupManager.SH_BS));
                }
            }));
            put("adse.ximalaya.com", new DomainDetail(new ArrayList<IdcGroup>() { // from class: com.ximalaya.ting.android.opensdk.httputil.httpswitch.IDCGroupManager.1.3
                {
                    add(new IdcGroup("adse.ximalaya.com", IDCGroupManager.SH_NH));
                    add(new IdcGroup("adsehera.ximalaya.com", IDCGroupManager.SH_BS));
                }
            }));
            put("mobile.ximalaya.com", new DomainDetail(new ArrayList<IdcGroup>() { // from class: com.ximalaya.ting.android.opensdk.httputil.httpswitch.IDCGroupManager.1.4
                {
                    add(new IdcGroup("mobile.ximalaya.com", IDCGroupManager.SH_NH));
                    add(new IdcGroup("mobilehera.ximalaya.com", IDCGroupManager.SH_BS));
                }
            }));
        }
    };
    private Random mRandom = new Random();
    private ConcurrentHashMap<String, List<String>> mIdcDomainMap = new ConcurrentHashMap<>();

    private void e(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return;
        }
        if (str2.length() <= 3072) {
            Log.e(str, str2);
            return;
        }
        while (str2.length() > 3072) {
            String strSubstring = str2.substring(0, 3072);
            str2 = str2.replace(strSubstring, "");
            Log.e(str, strSubstring);
        }
        Log.e(str, str2);
    }

    private boolean isValidIDCGroup(IdcGroup idcGroup) {
        if (idcGroup == null) {
            return false;
        }
        return (TextUtils.isEmpty(idcGroup.domain) && TextUtils.isEmpty(idcGroup.backupDomain)) ? false : true;
    }

    private boolean sortIDCGroup(String str, List<IdcGroup> list) {
        Iterator<IdcGroup> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!isValidIDCGroup(it2.next())) {
                it2.remove();
            }
        }
        if (list.size() == 0) {
            return false;
        }
        int iNextInt = this.mRandom.nextInt(100);
        e(TAG, "sortIDCGroup for domain :" + str + " random num : " + iNextInt);
        ArrayList<IdcGroup> arrayList = new ArrayList();
        int i = 0;
        for (IdcGroup idcGroup : list) {
            i += idcGroup.weight;
            if (iNextInt < i) {
                arrayList.add(0, idcGroup);
                iNextInt = Integer.MAX_VALUE;
            } else {
                arrayList.add(idcGroup);
            }
        }
        for (IdcGroup idcGroup2 : arrayList) {
            e(TAG, "sort idc weight  :" + idcGroup2.weight);
        }
        e(TAG, " ********* ");
        list.clear();
        list.addAll(arrayList);
        return true;
    }

    public synchronized void adjustIdc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals(this.lastIdcStr)) {
            return;
        }
        this.lastIdcStr = str;
        try {
            this.mIdcDomainMap.clear();
            String[] strArrSplit = str.split("\\|");
            if (strArrSplit.length == 1 && "all".equals(strArrSplit[0].substring(strArrSplit[0].indexOf("@") + 1))) {
                if (str.startsWith(SH_BS)) {
                    this.mIdcDomainMap.put(SH_BS, Collections.singletonList("all"));
                    return;
                } else if (str.startsWith(SH_NH)) {
                    this.mIdcDomainMap.put(SH_NH, Collections.singletonList("all"));
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : strArrSplit) {
                if (str2.startsWith(SH_BS)) {
                    for (String str3 : str2.substring(str2.indexOf("@") + 1).split(UpdateUtils.CMD_FILTER)) {
                        String[] strArrSplit2 = str3.split("\\$");
                        String str4 = strArrSplit2[0];
                        if (this.mRandom.nextInt(100) <= Integer.valueOf(strArrSplit2[1]).intValue()) {
                            arrayList.add(str4);
                        } else {
                            arrayList2.add(str4);
                        }
                    }
                } else if (str2.startsWith(SH_NH)) {
                    for (String str5 : str2.substring(str2.indexOf("@") + 1).split(UpdateUtils.CMD_FILTER)) {
                        String[] strArrSplit3 = str5.split("\\$");
                        String str6 = strArrSplit3[0];
                        if (this.mRandom.nextInt(100) <= Integer.valueOf(strArrSplit3[1]).intValue()) {
                            arrayList2.add(str6);
                        } else {
                            arrayList.add(str6);
                        }
                    }
                }
            }
            this.mIdcDomainMap.put(SH_BS, arrayList);
            this.mIdcDomainMap.put(SH_NH, arrayList2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public synchronized DomainDetail getDomainDetail(String str) {
        DomainDetail domainDetail;
        ConcurrentHashMap<String, DomainDetail> concurrentHashMap = this.mDomainDetailMap;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str) || (domainDetail = this.mDomainDetailMap.get(str)) == null) {
            return null;
        }
        return domainDetail;
    }

    public synchronized int getLogCompressCount(String str) {
        DomainDetail domainDetail;
        ConcurrentHashMap<String, DomainDetail> concurrentHashMap = this.mDomainDetailMap;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str) || (domainDetail = this.mDomainDetailMap.get(str)) == null) {
            return 0;
        }
        String str2 = domainDetail.LOG_COMPRESS_COUNT;
        try {
            if (!TextUtils.isEmpty(str2) && str2.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$")) {
                return Integer.valueOf(str2).intValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public synchronized void initIDCGroup(Map<String, DomainDetail> map) {
        List<IdcGroup> list;
        if (map == null) {
            return;
        }
        for (Map.Entry<String, DomainDetail> entry : map.entrySet()) {
            String key = entry.getKey();
            DomainDetail value = entry.getValue();
            if (this.mRandom.nextInt(100) < value.IPV6) {
                value.IPV6 = 1;
            } else {
                value.IPV6 = 0;
            }
            if (!TextUtils.isEmpty(key) && (list = value.IDC_GROUP) != null && list.size() != 0 && sortIDCGroup(key, list)) {
                this.mDomainDetailMap.put(entry.getKey(), value);
            }
        }
        e(TAG, "idc group " + this.mDomainDetailMap.toString());
    }

    public synchronized void notUseDomainDetailIpv6(String str) {
        DomainDetail domainDetail;
        ConcurrentHashMap<String, DomainDetail> concurrentHashMap = this.mDomainDetailMap;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str) && (domainDetail = this.mDomainDetailMap.get(str)) != null) {
            domainDetail.IPV6 = 0;
            System.out.println("notUseDomainDetailIpv6 host : " + str);
        }
    }

    public synchronized List<IdcGroup> processIdc(String str, List<IdcGroup> list) {
        boolean z = false;
        String key = "";
        for (Map.Entry<String, List<String>> entry : this.mIdcDomainMap.entrySet()) {
            Iterator<String> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                if (str.contains(it2.next()) || entry.getValue().contains("all")) {
                    key = entry.getKey();
                    z = true;
                    break;
                }
            }
        }
        if (z && !TextUtils.isEmpty(key)) {
            ArrayList arrayList = new ArrayList();
            for (IdcGroup idcGroup : list) {
                if (key.equals(idcGroup.idcName)) {
                    arrayList.add(idcGroup);
                }
            }
            return arrayList.size() == 0 ? list : arrayList;
        }
        return list;
    }
}
