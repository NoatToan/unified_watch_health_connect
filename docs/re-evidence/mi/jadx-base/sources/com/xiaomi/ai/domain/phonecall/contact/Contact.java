package com.xiaomi.ai.domain.phonecall.contact;

import com.xiaomi.ai.domain.phonecall.util.NameNormaliztion;
import com.xiaomi.ai.nlp.contact.common.a;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Contact {
    private ContactType contactType;
    private String name;
    private List<String> nickNames;
    private List<String> normNames;
    private transient List<PhoneItem> phoneItems;
    private transient String userId;
    private List<String> yellowPageNumbers;

    public class PinyinItem {
        private String name;
        private a.C0349a pinyinResult;
        private double score;

        public PinyinItem(String str, a.C0349a c0349a, double d) {
            this.name = str;
            this.pinyinResult = c0349a;
            this.score = d;
        }

        public String getName() {
            return this.name;
        }

        public a.C0349a getPinyinResult() {
            return this.pinyinResult;
        }

        public double getScore() {
            return this.score;
        }
    }

    public Contact(String str, String str2) {
        this.userId = str;
        this.name = str2;
        this.nickNames = new ArrayList();
        this.normNames = new ArrayList();
        this.phoneItems = new ArrayList();
        this.contactType = ContactType.DEFAULT;
        this.yellowPageNumbers = new ArrayList();
    }

    private void buildPinyinItems(Map<String, Double> map, List<PinyinItem> list) {
        ArrayList<PinyinItem> arrayList = new ArrayList();
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            Iterator<a.C0349a> it = a.b().g(entry.getKey(), false, true).iterator();
            while (it.hasNext()) {
                arrayList.add(new PinyinItem(entry.getKey(), it.next(), entry.getValue().doubleValue()));
            }
        }
        HashSet hashSet = new HashSet();
        for (PinyinItem pinyinItem : arrayList) {
            if (!hashSet.contains(pinyinItem.getPinyinResult().c())) {
                hashSet.add(pinyinItem.getPinyinResult().c());
                list.add(pinyinItem);
            }
        }
    }

    private boolean isSameTone(String str, String str2) {
        return (Integer.parseInt(str) & Integer.parseInt(str2)) != 0;
    }

    private boolean isSameTones(String str, String str2) {
        String[] strArrSplit = str.split(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        String[] strArrSplit2 = str2.split(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        if (strArrSplit.length != strArrSplit2.length) {
            return false;
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!isSameTone(strArrSplit[i], strArrSplit2[i])) {
                return false;
            }
        }
        return true;
    }

    public void addNickName(String str) {
        this.nickNames.add(str);
    }

    public void addNormNames(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.normNames.addAll(list);
        HashMap map = new HashMap();
        for (String str : list) {
            if (!str.isEmpty()) {
                map.put(str, Double.valueOf(1.0d));
            }
        }
    }

    public void addPhone(String str, int i) {
        this.phoneItems.add(new PhoneItem(this.userId, this.name, PhoneType.getNormTagByIdx(i), str, false));
    }

    public String getName() {
        return this.name;
    }

    public List<String> getNickNames() {
        return this.nickNames;
    }

    public List<PhoneItem> getPhoneItems() {
        return this.phoneItems;
    }

    public PinyinItem getPinyinItem(String str) {
        for (PinyinItem pinyinItem : getPinyinItems()) {
            if (str.equalsIgnoreCase(pinyinItem.getPinyinResult().c())) {
                return pinyinItem;
            }
        }
        return null;
    }

    public List<PinyinItem> getPinyinItems() {
        ArrayList arrayList = new ArrayList();
        if (!this.name.isEmpty()) {
            buildPinyinItems(NameNormaliztion.getInstance().getNormNameMap(this.name), arrayList);
        }
        for (String str : this.nickNames) {
            if (!str.isEmpty()) {
                buildPinyinItems(NameNormaliztion.getInstance().getNormNameMap(str), arrayList);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : this.normNames) {
            if (!str2.isEmpty()) {
                map.put(str2, Double.valueOf(1.0d));
            }
        }
        if (map.size() > 0) {
            buildPinyinItems(map, arrayList);
        }
        return arrayList;
    }

    public PinyinItem getPinyinWithToneItem(String str, String str2) {
        for (PinyinItem pinyinItem : getPinyinItems()) {
            if (str.equalsIgnoreCase(pinyinItem.getPinyinResult().c()) && isSameTones(pinyinItem.getPinyinResult().d(), str2)) {
                return pinyinItem;
            }
        }
        return null;
    }

    public String getUserId() {
        return this.userId;
    }

    public List<String> getYellowPageNumbers() {
        return this.yellowPageNumbers;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Contact setName2(String str) {
        this.name = str;
        return this;
    }

    public void setNickNames(List<String> list) {
        this.nickNames = list;
    }

    public void setPhoneItems(List<PhoneItem> list) {
        this.phoneItems = list;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        Iterator<PinyinItem> it = getPinyinItems().iterator();
        while (it.hasNext()) {
            String name = it.next().getName();
            if (!name.equalsIgnoreCase(this.name)) {
                sb.append("|" + name);
            }
        }
        sb.append(":");
        for (int i = 0; i < this.phoneItems.size(); i++) {
            PhoneItem phoneItem = this.phoneItems.get(i);
            if (i != 0) {
                sb.append(";");
            }
            sb.append(phoneItem.getTag() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + phoneItem.getNumber());
        }
        return sb.toString();
    }

    public Contact() {
        this.userId = "";
        this.name = "";
        this.nickNames = new ArrayList();
        this.normNames = new ArrayList();
        this.phoneItems = new ArrayList();
        this.yellowPageNumbers = new ArrayList();
    }
}
