package com.xiaomi.ai.domain.mobileapp.local;

import com.xiaomi.ai.domain.mobileapp.common.BaseAppItem;
import defpackage.dcm;
import defpackage.klo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class LocalAppMatcher {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalAppMatcher f11003a = new LocalAppMatcher();
    }

    private double calSimilarScore(String str, String str2, int i) {
        ArrayList<com.xiaomi.ai.nlp.contact.common.a.C0349a> arrayList = new ArrayList(com.xiaomi.ai.nlp.contact.common.a.b().f(str, false));
        ArrayList arrayList2 = new ArrayList(com.xiaomi.ai.nlp.contact.common.a.b().f(str2, false));
        double dMax = 0.0d;
        for (com.xiaomi.ai.nlp.contact.common.a.C0349a c0349a : arrayList) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                dMax = Math.max(dcm.a(c0349a.b(), ((com.xiaomi.ai.nlp.contact.common.a.C0349a) it.next()).b(), i), dMax);
            }
        }
        return dMax;
    }

    private Map<String, MatchInfo> genLocalMatchInfos(String str, List<BaseAppItem> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(String.valueOf(str.charAt(i)));
        }
        Pattern patternCompile = Pattern.compile(klo.g(arrayList, "|"));
        HashMap map = new HashMap(list.size());
        for (BaseAppItem baseAppItem : list) {
            MatchInfo matchInfo = new MatchInfo();
            matchInfo.setPackageName(baseAppItem.getPackageName());
            matchInfo.setDisplayName(baseAppItem.getDisplayName());
            map.put(baseAppItem.getPackageName(), matchInfo);
            if (patternCompile.matcher(baseAppItem.getDisplayName().toLowerCase()).find()) {
                matchInfo.setLocalSimScore(calSimilarScore(str, baseAppItem.getDisplayName().toLowerCase(), 1));
            }
        }
        return map;
    }

    public static LocalAppMatcher getInstance() {
        return b.f11003a;
    }

    private boolean localPinyinFilter(String str, String str2) {
        ArrayList<com.xiaomi.ai.nlp.contact.common.a.C0349a> arrayList = new ArrayList(com.xiaomi.ai.nlp.contact.common.a.b().f(str, false));
        ArrayList arrayList2 = new ArrayList(com.xiaomi.ai.nlp.contact.common.a.b().f(str2, false));
        for (com.xiaomi.ai.nlp.contact.common.a.C0349a c0349a : arrayList) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (c0349a.b().contains(((com.xiaomi.ai.nlp.contact.common.a.C0349a) it.next()).b())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void setExactMatchAppAndMatchResult(List<BaseAppItem> list, List<BaseAppItem> list2, Map<String, MatchInfo> map, MatchRet matchRet) {
        for (BaseAppItem baseAppItem : list) {
            if (map.containsKey(baseAppItem.getPackageName())) {
                MatchInfo matchInfo = map.get(baseAppItem.getPackageName());
                for (BaseAppItem baseAppItem2 : list2) {
                    if (baseAppItem.getPackageName().equals(baseAppItem2.getPackageName())) {
                        matchRet.addBaseAppItem(baseAppItem);
                        matchInfo.setMatchType(MatchType.EXACT_PACKAGE);
                    } else if (baseAppItem.getDisplayName().equals(baseAppItem2.getDisplayName())) {
                        matchRet.addBaseAppItem(new BaseAppItem(baseAppItem.getDisplayName(), baseAppItem.getPackageName()));
                        matchInfo.setMatchType(MatchType.WRONG_PACKAGE);
                        matchInfo.setLocalSimScore(-2.0d);
                    }
                }
            }
        }
    }

    private void setSimMatchAppAndMatchResult(String str, List<BaseAppItem> list, List<BaseAppItem> list2, Map<String, MatchInfo> map, MatchRet matchRet) {
        Iterator<BaseAppItem> it = list2.iterator();
        double dMax = 0.0d;
        while (it.hasNext()) {
            dMax = Math.max(calSimilarScore(str, it.next().getDisplayName().toLowerCase(), 1), dMax);
        }
        for (BaseAppItem baseAppItem : list) {
            if (map.containsKey(baseAppItem.getPackageName())) {
                MatchInfo matchInfo = map.get(baseAppItem.getPackageName());
                Intervenor.Type intervType = Intervenor.getInstance().getIntervType(str.toLowerCase(), baseAppItem.getDisplayName().toLowerCase());
                if (intervType == Intervenor.Type.BLACK) {
                    matchInfo.setMatchType(MatchType.INTERV);
                } else if (intervType == Intervenor.Type.WHITE) {
                    matchRet.addBaseAppItem(baseAppItem);
                    matchInfo.setMatchType(MatchType.INTERV);
                } else if (localPinyinFilter(baseAppItem.getDisplayName().toLowerCase(), str)) {
                    double localSimScore = matchInfo.getLocalSimScore();
                    if (localSimScore >= 0.15d && (str.length() != 1 || localSimScore >= 0.99d)) {
                        if (0.08d + localSimScore >= dMax || localSimScore > 0.76d) {
                            if (localSimScore > 0.3d) {
                                matchRet.addBaseAppItem(baseAppItem);
                                matchInfo.setMatchType(MatchType.SIM_NAME);
                            }
                        }
                    }
                }
            }
        }
    }

    public MatchRet matchLocalApp(List<BaseAppItem> list, List<BaseAppItem> list2, String str) {
        MatchRet matchRet = new MatchRet(new ArrayList(), new EventInfo());
        if (list != null && list2 != null && str != null) {
            matchRet.getEventInfo().setLocalAppNumber(list.size());
            matchRet.getEventInfo().setOnlineAppNumber(list2.size());
            Map<String, MatchInfo> mapGenLocalMatchInfos = genLocalMatchInfos(str, list);
            setExactMatchAppAndMatchResult(list, list2, mapGenLocalMatchInfos, matchRet);
            if (matchRet.getBaseAppItemList().isEmpty()) {
                setSimMatchAppAndMatchResult(str, list, list2, mapGenLocalMatchInfos, matchRet);
            }
            ArrayList arrayList = new ArrayList(mapGenLocalMatchInfos.values());
            Collections.sort(arrayList);
            matchRet.getEventInfo().setMatchInfoList(arrayList.subList(0, Math.min(arrayList.size(), 10)));
        }
        return matchRet;
    }

    private LocalAppMatcher() {
    }
}
