package com.xiaomi.ai.domain.phonecall.provider;

import com.xiaomi.ai.domain.phonecall.common.CallMode;
import com.xiaomi.ai.domain.phonecall.common.ContactRet;
import com.xiaomi.ai.domain.phonecall.common.MatchRet;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.contact.PhoneItem;
import com.xiaomi.ai.nlp.contact.common.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ToSpeakUtils {
    public static String defaultToSpeak(MatchRet matchRet, boolean z) {
        int i = z ? 5 : 4;
        StringBuilder sb = new StringBuilder();
        sb.append("为你找到多个联系人,");
        int i2 = 1;
        for (int i3 = 0; i3 < matchRet.getContactRets().size(); i3++) {
            ContactRet contactRet = matchRet.getContactRets().get(i3);
            Iterator<PhoneItem> it = contactRet.getPhoneItems().iterator();
            while (it.hasNext()) {
                String number = it.next().getNumber();
                if (number.length() > i) {
                    number = number.substring(number.length() - i);
                }
                sb.append(String.format("第%d个是尾号为%s的%s,", Integer.valueOf(i2), number, contactRet.getShowName()));
                i2++;
            }
        }
        sb.append("请问你要拨打第几个?");
        return sb.toString();
    }

    public static String handFreeToSpeak(PhoneCallIntention phoneCallIntention) {
        return phoneCallIntention.getCallMode().getText().equalsIgnoreCase(CallMode.HAND_FREE.getText()) ? "免提" : "";
    }

    public static Map<String, Boolean> isSingleNameSamePinyin(MatchRet matchRet) {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        map.put("multiNameMultiNumber", bool);
        map.put("samePinyin", bool);
        map.put("sameTailNumber", bool);
        map.put("singleName", Boolean.TRUE);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ContactRet contactRet : matchRet.getContactRets()) {
            String name = contactRet.getContact().getName();
            if (contactRet.getPhoneItems().size() > 1) {
                map.put("multiNameMultiNumber", Boolean.TRUE);
            }
            for (a.C0349a c0349a : a.b().f(name, false)) {
                if (hashSet.contains(c0349a.b())) {
                    map.put("samePinyin", Boolean.TRUE);
                }
                hashSet.add(c0349a.b());
            }
            Iterator<PhoneItem> it = contactRet.getPhoneItems().iterator();
            while (it.hasNext()) {
                String number = it.next().getNumber();
                if (number.length() > 4) {
                    number = number.substring(number.length() - 4);
                }
                if (hashSet2.contains(number)) {
                    map.put("sameTailNumber", Boolean.TRUE);
                }
                hashSet2.add(number);
            }
            if (contactRet.getPhoneItems().size() > 1) {
                map.put("singleName", Boolean.FALSE);
            }
        }
        return map;
    }

    public static String multiContacts(MatchRet matchRet) {
        Map<String, Boolean> mapIsSingleNameSamePinyin = isSingleNameSamePinyin(matchRet);
        if (mapIsSingleNameSamePinyin.get("multiNameMultiNumber").booleanValue()) {
            return multiContactsMultiNumber(matchRet);
        }
        if (mapIsSingleNameSamePinyin.get("samePinyin").booleanValue() && mapIsSingleNameSamePinyin.get("singleName").booleanValue()) {
            return multiContactsSamePinyin(matchRet, mapIsSingleNameSamePinyin.get("sameTailNumber").booleanValue());
        }
        return mapIsSingleNameSamePinyin.get("singleName").booleanValue() ? multiContactsSingleNumber(matchRet) : defaultToSpeak(matchRet, mapIsSingleNameSamePinyin.get("sameTailNumber").booleanValue());
    }

    public static String multiContactsMultiNumber(MatchRet matchRet) {
        StringBuilder sb = new StringBuilder();
        sb.append("为你找到");
        for (int i = 0; i < matchRet.getContactRets().size(); i++) {
            ContactRet contactRet = matchRet.getContactRets().get(i);
            String showName = contactRet.getShowName();
            if (contactRet.getPhoneItems().size() > 0) {
                showName = contactRet.getPhoneItems().get(0).getName();
            }
            if (i == matchRet.getContactRets().size() - 1) {
                sb.append(showName);
            } else {
                sb.append(showName);
                sb.append(",");
            }
        }
        sb.append("的电话号码,请问你要打给第几个?");
        return sb.toString();
    }

    public static String multiContactsSamePinyin(MatchRet matchRet, boolean z) {
        StringBuilder sb = new StringBuilder();
        int i = z ? 5 : 4;
        sb.append(String.format("为你找到%d个联系人,", Integer.valueOf(matchRet.getContactRets().size())));
        int i2 = 0;
        while (i2 < matchRet.getContactRets().size()) {
            ContactRet contactRet = matchRet.getContactRets().get(i2);
            String number = contactRet.getPhoneItems().get(0).getNumber();
            if (number.length() > i) {
                number = number.substring(number.length() - i);
            }
            i2++;
            sb.append(String.format("第%d个是尾号%s的%s,", Integer.valueOf(i2), number, contactRet.getShowName()));
        }
        sb.append("请问你要打给第几个?");
        return sb.toString();
    }

    public static String multiContactsSingleNumber(MatchRet matchRet) {
        StringBuilder sb = new StringBuilder();
        sb.append("为你找到");
        List<ContactRet> contactRets = matchRet.getContactRets();
        for (int i = 0; i < contactRets.size(); i++) {
            sb.append(contactRets.get(i).getPhoneItems().get(0).getName());
            if (i != contactRets.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("的电话号码,请问你要打给第几个?");
        return sb.toString();
    }

    public static String singleContactMultiNumberToSpeak(ContactRet contactRet) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("找到%s有%d个号码,", contactRet.getContact().getName(), Integer.valueOf(contactRet.getPhoneItems().size())));
        HashSet hashSet = new HashSet();
        Iterator<PhoneItem> it = contactRet.getPhoneItems().iterator();
        while (true) {
            i = 4;
            if (!it.hasNext()) {
                break;
            }
            String number = it.next().getNumber();
            if (number.length() > 4) {
                number = number.substring(number.length() - 4);
            }
            if (hashSet.contains(number)) {
                i = 5;
                break;
            }
            hashSet.add(number);
        }
        int i2 = 0;
        while (i2 < contactRet.getPhoneItems().size()) {
            String number2 = contactRet.getPhoneItems().get(i2).getNumber();
            if (number2.length() > i) {
                number2 = number2.substring(number2.length() - i);
            }
            i2++;
            sb.append(String.format("第%d个尾号%s,", Integer.valueOf(i2), number2));
        }
        sb.append("请问你要打给第几个?");
        return sb.toString();
    }
}
