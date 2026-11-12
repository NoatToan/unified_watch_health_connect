package com.xiaomi.ai.domain.phonecall.provider;

import com.xiaomi.ai.domain.phonecall.common.ContactRet;
import com.xiaomi.ai.domain.phonecall.common.MatchRet;
import com.xiaomi.ai.domain.phonecall.common.MatchType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class NameMatcherReRank {
    private static NameMatcherReRank nameMatcherReRank = new NameMatcherReRank();

    private void fixEventInfo(MatchRet matchRet, List<ContactRet> list, Set<ContactRet> set) {
        matchRet.getEventInfo().clearOtherInfos();
        for (int i = 0; i < list.size() && i < 20; i++) {
            ContactRet contactRet = list.get(i);
            FilterType filterType = FilterType.FILTER_LOW_SCORE;
            if (set.contains(contactRet)) {
                filterType = contactRet.getPhoneItems().isEmpty() ? FilterType.FILTER_MISS_TAG : FilterType.FILTTE_NO;
            }
            matchRet.getEventInfo().addOtherInfo(contactRet.getContact().getName(), contactRet.getScore(), filterType);
        }
    }

    public static NameMatcherReRank getInstance() {
        return nameMatcherReRank;
    }

    private boolean needRecall(double d, double d2) {
        return d2 >= 0.5d && d - d2 <= 0.2d;
    }

    public void reRank(List<ContactRet> list, MatchRet matchRet) {
        HashSet hashSet = new HashSet();
        Collections.sort(list);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        if (list == null || list.size() == 0) {
            return;
        }
        double score = list.get(0).getScore();
        for (ContactRet contactRet : list) {
            if (!hashSet.contains(contactRet.getContact())) {
                hashSet.add(contactRet.getContact());
                if (needRecall(score, contactRet.getScore()) && arrayList.size() < 3) {
                    arrayList.add(contactRet);
                    hashSet2.add(contactRet);
                }
                arrayList2.add(contactRet);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (ContactRet contactRet2 : arrayList) {
            if (!contactRet2.getPhoneItems().isEmpty()) {
                arrayList3.add(contactRet2);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList = arrayList3;
        }
        if (!arrayList.isEmpty()) {
            matchRet.setContactRets(arrayList);
            matchRet.setMatchType(MatchType.MATCH_MODEL);
        }
        fixEventInfo(matchRet, arrayList2, hashSet2);
    }
}
