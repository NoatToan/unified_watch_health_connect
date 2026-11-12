package com.xiaomi.ai.domain.phonecall.contact;

import com.xiaomi.ai.nlp.contact.common.a;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.aqe;
import defpackage.qpe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ContactData {
    private static final qpe LOGGER = aqe.f(ContactData.class);
    private List<Contact> contacts;
    private int contactsNumber;
    private Map<String, Set<Contact>> namePinyinMap;
    private Map<String, Contact> numberContactMap;
    private Map<String, Set<Contact>> unigramPinyinMap;

    public ContactData() {
        this.contacts = new ArrayList();
        this.namePinyinMap = new HashMap();
        this.unigramPinyinMap = new HashMap();
        this.numberContactMap = new HashMap();
        this.contactsNumber = 0;
    }

    private void addPinyinMap(String str, Map<String, Set<Contact>> map, Boolean bool, Contact contact) {
        Iterator<a.C0349a> it = a.b().f(str, bool.booleanValue()).iterator();
        while (it.hasNext()) {
            String strC = it.next().c();
            if (!map.containsKey(strC)) {
                map.put(strC, new HashSet());
            }
            map.get(strC).add(contact);
        }
    }

    private void buildIndex() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LOGGER.info("buildIndex start,contacts.size:{}", Integer.valueOf(this.contacts.size()));
        try {
            for (Contact contact : this.contacts) {
                Iterator<Contact.PinyinItem> it = contact.getPinyinItems().iterator();
                while (it.hasNext()) {
                    String lowerCase = it.next().getPinyinResult().c().toLowerCase();
                    if (!this.namePinyinMap.containsKey(lowerCase)) {
                        this.namePinyinMap.put(lowerCase, new HashSet());
                    }
                    this.namePinyinMap.get(lowerCase).add(contact);
                }
            }
            for (Contact contact2 : this.contacts) {
                Iterator<Contact.PinyinItem> it2 = contact2.getPinyinItems().iterator();
                while (it2.hasNext()) {
                    Iterator<String> it3 = it2.next().getPinyinResult().f().iterator();
                    while (it3.hasNext()) {
                        String lowerCase2 = it3.next().toLowerCase();
                        if (!this.unigramPinyinMap.containsKey(lowerCase2)) {
                            this.unigramPinyinMap.put(lowerCase2, new HashSet());
                        }
                        this.unigramPinyinMap.get(lowerCase2).add(contact2);
                    }
                }
            }
            for (Contact contact3 : this.contacts) {
                Iterator<PhoneItem> it4 = contact3.getPhoneItems().iterator();
                while (it4.hasNext()) {
                    this.numberContactMap.put(it4.next().getNumber(), contact3);
                }
            }
        } catch (Exception e) {
            LOGGER.info("buildIndex Fail!", (Throwable) e);
        }
        LOGGER.info("buildIndex end,index isEmpty:{} cost:{}", Boolean.valueOf(isEmpty()), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static List<String> getUnigrams(String str) {
        ArrayList arrayList = new ArrayList();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                if (!str2.isEmpty()) {
                    arrayList.add(str2);
                    str2 = "";
                }
                arrayList.add(String.valueOf(cCharAt));
            } else {
                str2 = str2 + String.valueOf(cCharAt);
            }
        }
        if (!str2.isEmpty()) {
            arrayList.add(str2);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeSameNameContact(List<Contact> list) {
        HashMap map = new HashMap();
        for (Contact contact : list) {
            if (map.containsKey(contact.getName())) {
                if (contact.getNickNames().size() > 0 && !((Contact) map.get(contact.getName())).getNickNames().contains(contact.getNickNames().get(0))) {
                    ((Contact) map.get(contact.getName())).addNickName(contact.getNickNames().get(0));
                }
                HashMap map2 = new HashMap();
                for (PhoneItem phoneItem : ((Contact) map.get(contact.getName())).getPhoneItems()) {
                    if (!map2.containsKey(phoneItem.getNumber())) {
                        map2.put(phoneItem.getNumber(), phoneItem);
                    }
                }
                for (PhoneItem phoneItem2 : contact.getPhoneItems()) {
                    if (!map2.containsKey(phoneItem2.getNumber())) {
                        map2.put(phoneItem2.getNumber(), phoneItem2);
                    }
                }
                ((Contact) map.get(contact.getName())).getPhoneItems().clear();
                Iterator it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    ((Contact) map.get(contact.getName())).getPhoneItems().add(((Map.Entry) it.next()).getValue());
                }
            } else {
                map.put(contact.getName(), contact);
            }
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            this.contacts.add((Contact) ((Map.Entry) it2.next()).getValue());
        }
    }

    public void clear() {
        this.contactsNumber = 0;
        this.contacts.clear();
        this.namePinyinMap.clear();
        this.unigramPinyinMap.clear();
        this.numberContactMap.clear();
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }

    public Set<Contact> getContactsByNamePinyin(String str) {
        if (this.namePinyinMap.containsKey(str)) {
            return this.namePinyinMap.get(str);
        }
        return null;
    }

    public Set<Contact> getContactsByUnigramPinyin(String str) {
        if (this.unigramPinyinMap.containsKey(str)) {
            return this.unigramPinyinMap.get(str);
        }
        return null;
    }

    public int getContactsNumber() {
        return this.contactsNumber;
    }

    public Map<String, Contact> getNumberContactMap() {
        return this.numberContactMap;
    }

    public int initContacts(String str) throws JSONException {
        return initContactsFromJson(new JSONObject(str));
    }

    public int initContactsFromJson(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        qpe qpeVar = LOGGER;
        qpeVar.info("initContactsFromJson start,contactDataJS==null:{}", Boolean.valueOf(jSONObject == null));
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("contacts")) == null) {
            return 0;
        }
        int iOptInt = jSONObject.optInt("contacts_number", jSONArrayOptJSONArray.length());
        qpeVar.info("initContactsFromJson ContactsNumber:{} contactListJS.size:{}", Integer.valueOf(iOptInt), Integer.valueOf(jSONObject.length()));
        clear();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("user_id");
                String strOptString2 = jSONObjectOptJSONObject.optString("name");
                String strOptString3 = jSONObjectOptJSONObject.optString("nick_name");
                if (strOptString != null && strOptString2 != null && !strOptString2.isEmpty()) {
                    Contact contact = new Contact(strOptString, strOptString2);
                    if (strOptString3 != null && !strOptString3.isEmpty()) {
                        contact.addNickName(strOptString3);
                    }
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("phone_list");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            if (jSONObjectOptJSONObject2 != null) {
                                String strOptString4 = jSONObjectOptJSONObject2.optString(RealNameWebViewActivity.NUMBER);
                                int iOptInt2 = jSONObjectOptJSONObject2.optInt("type");
                                if (strOptString4 != null && !strOptString4.isEmpty()) {
                                    contact.addPhone(strOptString4, iOptInt2);
                                }
                            }
                        }
                        if (!contact.getPhoneItems().isEmpty()) {
                            arrayList.add(contact);
                        }
                    }
                }
            }
        }
        System.currentTimeMillis();
        qpe qpeVar2 = LOGGER;
        qpeVar2.info("preContacts size:" + arrayList.size());
        mergeSameNameContact(arrayList);
        System.currentTimeMillis();
        buildIndex();
        System.currentTimeMillis();
        qpeVar2.info("Contacts size:{},isEmpty:{},cost:{}", Integer.valueOf(this.contacts.size()), Boolean.valueOf(isEmpty()), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        this.contactsNumber = iOptInt;
        return this.contacts.size();
    }

    public void initContactsFromLabelPtStr(String str) {
        initContactsFromLabelPtStr(str, true);
    }

    public boolean isEmpty() {
        return this.contacts.isEmpty() || this.namePinyinMap.isEmpty() || this.unigramPinyinMap.isEmpty() || this.numberContactMap.isEmpty();
    }

    public void setContactsNumber(int i) {
        this.contactsNumber = i;
    }

    public String toString() {
        return "ContactData{contacts=" + this.contacts.size() + ", namePinyinMap=" + this.namePinyinMap.size() + ", unigramPinyinMap=" + this.unigramPinyinMap.size() + ", numberContactMap=" + this.numberContactMap.size() + AbstractJsonLexerKt.END_OBJ;
    }

    public void initContactsFromLabelPtStr(String str, boolean z) {
        Contact contact;
        clear();
        System.out.println("initContactsFromLabelPtStr");
        for (String str2 : str.split("@@@")) {
            int iIndexOf = str2.indexOf(":");
            if (iIndexOf != -1) {
                String strSubstring = str2.substring(0, iIndexOf);
                if (z) {
                    contact = new Contact("", strSubstring);
                } else {
                    contact = new Contact();
                    contact.setUserId("");
                    String[] strArrSplit = strSubstring.split("\\|");
                    contact.setName(strArrSplit[0]);
                    contact.addNormNames(Arrays.asList(strArrSplit));
                }
                for (String str3 : str2.substring(iIndexOf + 1).split(";")) {
                    int iIndexOf2 = str3.indexOf(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = str3.substring(0, iIndexOf2);
                        String strSubstring3 = str3.substring(iIndexOf2 + 1);
                        if (!strSubstring3.isEmpty()) {
                            contact.addPhone(strSubstring3, PhoneType.getIdxByTag(strSubstring2));
                        }
                    }
                }
                if (!contact.getPhoneItems().isEmpty()) {
                    this.contacts.add(contact);
                }
            }
        }
        buildIndex();
    }

    public ContactData(List<Contact> list) {
        this.contacts = new ArrayList();
        this.namePinyinMap = new HashMap();
        this.unigramPinyinMap = new HashMap();
        this.numberContactMap = new HashMap();
        this.contactsNumber = 0;
        this.contacts = list;
        buildIndex();
    }
}
