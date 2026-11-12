package com.xiaomi.ai.domain.phonecall.common;

import com.xiaomi.ai.domain.phonecall.provider.FilterType;
import com.xiaomi.ai.domain.phonecall.util.ContactEncryptor;
import defpackage.aqe;
import defpackage.qpe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class EventInfo {
    private static final qpe LOGGER = aqe.f(EventInfo.class);
    private String action;
    private int contactCnt;
    private String contactType;
    private boolean isLoadContactComplete;
    private MatchType matchType;
    private List<String> otherInfos;
    private String query;
    private List<String> slots;
    private boolean useContactModelMacter;

    public EventInfo() {
        this.query = "";
        this.action = ActionType.QUERY.toString();
        this.matchType = MatchType.MATCH_MISS;
        this.otherInfos = new ArrayList();
        this.contactCnt = 0;
        this.useContactModelMacter = false;
        this.isLoadContactComplete = false;
        this.slots = new ArrayList();
        this.contactType = "";
    }

    public void addOtherInfo(String str, double d, FilterType filterType) {
        this.otherInfos.add(String.format("%s:%.2f:%d", str, Double.valueOf(d), Integer.valueOf(filterType.ordinal())));
    }

    public void addSlot(String str) {
        this.slots.add(str);
    }

    public void clearOtherInfos() {
        this.otherInfos.clear();
    }

    public void clearPrivacy(String str, String str2) {
        decryptOtherInfo(str, str2);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.otherInfos.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(":");
            if (strArrSplit.length >= 3) {
                arrayList.add(String.format("%s:%s:%s", "###", strArrSplit[strArrSplit.length - 2], strArrSplit[strArrSplit.length - 1]));
            } else {
                arrayList.add("###:###:###");
            }
        }
        this.otherInfos = arrayList;
        this.contactCnt = -1;
        encryptOtherInfo(str, str2);
    }

    public void decryptOtherInfo(String str, String str2) {
        String strDecrypt;
        List<String> list = this.otherInfos;
        if (list == null || list.isEmpty() || !ContactEncryptor.isBase64(this.otherInfos.get(0))) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.otherInfos) {
            try {
                strDecrypt = ContactEncryptor.decrypt(str3, str, str2);
            } catch (Exception unused) {
                LOGGER.info("Decrypt failed {}", str3);
                strDecrypt = "";
            }
            arrayList.add(strDecrypt);
        }
        this.otherInfos = arrayList;
    }

    public void encryptOtherInfo(String str, String str2) {
        String strEncrypt;
        List<String> list = this.otherInfos;
        if (list == null || list.isEmpty() || ContactEncryptor.isBase64(this.otherInfos.get(0))) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.otherInfos) {
            try {
                strEncrypt = ContactEncryptor.encrypt(str3, str, str2);
            } catch (Exception unused) {
                LOGGER.info("Encrypt failed {}", str3);
                strEncrypt = "";
            }
            arrayList.add(strEncrypt);
        }
        this.otherInfos = arrayList;
    }

    public String getAction() {
        return this.action;
    }

    public int getContactCnt() {
        return this.contactCnt;
    }

    public String getContactType() {
        return this.contactType;
    }

    public MatchType getMatchType() {
        return this.matchType;
    }

    public List<String> getOtherInfos() {
        return this.otherInfos;
    }

    public String getQuery() {
        return this.query;
    }

    public List<String> getSlots() {
        return this.slots;
    }

    public boolean isLoadContactComplete() {
        return this.isLoadContactComplete;
    }

    public boolean isUseContactModelMacter() {
        return this.useContactModelMacter;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setContactCnt(int i) {
        this.contactCnt = i;
    }

    public void setContactType(String str) {
        this.contactType = str;
    }

    public void setLoadContactComplete(boolean z) {
        this.isLoadContactComplete = z;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public void setOtherInfos(List<String> list) {
        this.otherInfos = list;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setSlots(List<String> list) {
        this.slots = list;
    }

    public void setUseContactModelMacter(boolean z) {
        this.useContactModelMacter = z;
    }

    public EventInfo(EventInfo eventInfo) {
        this.query = eventInfo.query;
        this.action = eventInfo.action;
        this.matchType = eventInfo.matchType;
        ArrayList arrayList = new ArrayList();
        this.otherInfos = arrayList;
        List<String> list = eventInfo.otherInfos;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.useContactModelMacter = eventInfo.useContactModelMacter;
        this.isLoadContactComplete = eventInfo.isLoadContactComplete;
        this.contactCnt = eventInfo.contactCnt;
        this.slots = eventInfo.slots;
        this.contactType = eventInfo.contactType;
    }
}
