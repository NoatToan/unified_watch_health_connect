package com.xiaomi.ai.domain.phonecall.provider;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.ContactRet;
import com.xiaomi.ai.domain.phonecall.common.MatchRet;
import com.xiaomi.ai.domain.phonecall.common.MatchType;
import com.xiaomi.ai.domain.phonecall.common.NameType;
import com.xiaomi.ai.domain.phonecall.common.ObjectDeviceType;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.SlotRet;
import com.xiaomi.ai.domain.phonecall.contact.Contact;
import com.xiaomi.ai.domain.phonecall.contact.ContactData;
import com.xiaomi.ai.domain.phonecall.contact.PhoneItem;
import com.xiaomi.ai.domain.phonecall.contact.RelativeMappingData;
import com.xiaomi.ai.domain.phonecall.util.DigitQc;
import com.xiaomi.ai.domain.phonecall.util.JaroWinklerDistance;
import com.xiaomi.ai.domain.phonecall.util.PhoneStringUtils;
import com.xiaomi.ai.domain.phonecall.util.Similarity;
import com.xiaomi.ai.nlp.contact.common.a;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.sensor.SensorHelper;
import defpackage.aqe;
import defpackage.b4s;
import defpackage.qpe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class ContactSimMatcher {
    private JaroWinklerDistance jaroWinklerDistance = new JaroWinklerDistance();
    private ContactData yellowPageData = YellowPageDataLoader.getInstantce().getYellowPageData();
    private static final Pattern DIGIT_NUMBER_PAT = Pattern.compile("^[零一二三四五六七八九0-9]{3,}$");
    private static final qpe LOGGER = aqe.f(ContactSimMatcher.class);
    private static Map<String, String> simContan = new HashMap();
    private static Map<String, String> simFinals = new HashMap();
    private static final Pattern NAME_CH_PAT = Pattern.compile("[一-\u9fffa-zA-Z]+");

    static {
        simContan.put("ch", PluginDeviceInfo.FICONON);
        simContan.put("zh", "z");
        simContan.put("n", e.f13808a);
        simContan.put("sh", "s");
        simContan.put("er", "ai");
        simFinals.put("ua", PluginDeviceInfo.FMODEL);
        simFinals.put("ia", PluginDeviceInfo.FMODEL);
        simFinals.put("uo", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER);
        simFinals.put("ie", "ue");
        simFinals.put(SensorHelper.INTERVAL_UI, "ei");
        simFinals.put("uai", "ai");
        simFinals.put("ou", "iu");
        simFinals.put("an", "ian");
        simFinals.put("uan", "an");
        simFinals.put("in", "en");
        simFinals.put("un", "en");
        simFinals.put("vn", "en");
        simFinals.put("uang", "ang");
        simFinals.put("iang", "ang");
        simFinals.put("eng", "en");
        simFinals.put("in", "ing");
        simFinals.put("iong", "ong");
        simFinals.put("iong", "ong");
        simFinals.put("er", "ai");
    }

    private double calFinalScore(String str, String str2) {
        List<a.C0349a> listF = a.b().f(str, false);
        List<a.C0349a> listF2 = a.b().f(str2, false);
        double d = 0.0d;
        for (a.C0349a c0349a : listF) {
            Iterator<a.C0349a> it = listF2.iterator();
            while (it.hasNext()) {
                double jaroWinklerDistance = (((double) this.jaroWinklerDistance.getJaroWinklerDistance(c0349a.c(), it.next().c())) * 0.2d) + (((double) this.jaroWinklerDistance.getJaroWinklerDistance(str, str2)) * 0.3d) + Similarity.calTokenCosSim(str, str2);
                if (jaroWinklerDistance > d) {
                    d = jaroWinklerDistance;
                }
            }
        }
        return d;
    }

    private double calScore(List<a.C0349a> list, List<Contact.PinyinItem> list2) {
        double d = 0.0d;
        for (a.C0349a c0349a : list) {
            for (Contact.PinyinItem pinyinItem : list2) {
                a.C0349a pinyinResult = pinyinItem.getPinyinResult();
                double dCalCosSim = Similarity.calCosSim(c0349a.c(), pinyinResult.c());
                double dCalCosSim2 = Similarity.calCosSim(c0349a.f(), pinyinResult.f());
                double dCalLevenshteinSim = ((dCalCosSim * 0.1d) + (0.4d * dCalCosSim2) + (Similarity.calLevenshteinSim(c0349a.c(), pinyinResult.c(), 1) * 0.55d)) * pinyinItem.getScore();
                if (Math.abs(dCalCosSim2 - 1.0d) < 1.0E-6d) {
                    dCalLevenshteinSim = Math.max(dCalLevenshteinSim, dCalCosSim2);
                }
                if (dCalLevenshteinSim > d) {
                    d = dCalLevenshteinSim;
                }
            }
        }
        return d;
    }

    private void fillMatchRet(List<ContactRet> list, MatchRet matchRet) {
        fillMatchRet(list, matchRet, false);
    }

    private boolean isNumberValid(String str) {
        if (str.length() >= 3 && str.length() <= 8) {
            return true;
        }
        if (str.length() == 5 && str.startsWith("123")) {
            return true;
        }
        if (str.length() == 3 && (str.startsWith(b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD) || str.startsWith("12"))) {
            return true;
        }
        if (str.length() == 5 && (str.startsWith("955") || str.startsWith("966"))) {
            return true;
        }
        if (str.startsWith("100") && (str.length() == 5 || str.length() == 7)) {
            return true;
        }
        if (str.startsWith("1")) {
            if (str.length() >= 3 && str.length() <= 10) {
                return false;
            }
        } else if (str.length() >= 3 && str.length() <= 5) {
            return false;
        }
        return true;
    }

    private String legalChName(String str) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = NAME_CH_PAT.matcher(str);
        while (matcher.find()) {
            sb.append(matcher.group());
        }
        return sb.toString();
    }

    private void matchContact(List<SlotRet> list, String str, ContactData contactData, MatchRet matchRet, RelativeMappingData relativeMappingData) {
        List<SlotRet> listMapRelativeSlots;
        if (relativeMappingData != null) {
            LOGGER.info("find relatives");
            listMapRelativeSlots = relativeMappingData.mapRelativeSlots(list);
        } else {
            listMapRelativeSlots = null;
        }
        List<SlotRet> list2 = listMapRelativeSlots;
        if (list2 != null) {
            LOGGER.info("get relatives");
        }
        qpe qpeVar = LOGGER;
        qpeVar.info("strategy 1");
        matchContactNameWithTone(list, str, contactData, matchRet);
        MatchType matchType = matchRet.getMatchType();
        MatchType matchType2 = MatchType.MATCH_CERTAIN;
        if (matchType == matchType2) {
            return;
        }
        if (list2 != null) {
            matchContactNameWithTone(list2, str, contactData, matchRet);
        }
        if (matchRet.getMatchType() == matchType2) {
            return;
        }
        qpeVar.info("strategy 2");
        Boolean bool = Boolean.FALSE;
        matchContactName(list, str, contactData, bool, matchRet);
        if (matchRet.getMatchType() == matchType2) {
            return;
        }
        if (list2 != null) {
            matchContactName(list2, str, contactData, bool, matchRet);
        }
        if (matchRet.getMatchType() == matchType2 || RelativeMappingData.hasRelativeSlot(list)) {
            return;
        }
        qpeVar.info("strategy 3");
        matchContactName(list, str, contactData, Boolean.TRUE, matchRet);
        if (matchRet.getMatchType() == MatchType.MATCH_FUZZY) {
            return;
        }
        qpeVar.info("strategy 4");
        matchContactUnigram(list, str, contactData, matchRet);
        unigramPostProcess(matchRet, list);
    }

    private void matchContactName(List<SlotRet> list, String str, ContactData contactData, Boolean bool, MatchRet matchRet) {
        matchContactName(list, str, contactData, bool, matchRet, false);
    }

    private void matchContactNameWithTone(List<SlotRet> list, String str, ContactData contactData, MatchRet matchRet) {
        matchContactName(list, str, contactData, Boolean.FALSE, matchRet, true);
    }

    private void matchContactUnigram(List<SlotRet> list, String str, ContactData contactData, MatchRet matchRet) {
        int i;
        ArrayList<ContactRet> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<SlotRet> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String slot = it.next().getSlot();
            List<a.C0349a> listF = a.b().f(slot, false);
            Iterator<String> it2 = ContactData.getUnigrams(slot).iterator();
            while (it2.hasNext()) {
                Iterator<a.C0349a> it3 = a.b().f(it2.next(), true).iterator();
                while (it3.hasNext()) {
                    Set<Contact> contactsByUnigramPinyin = contactData.getContactsByUnigramPinyin(it3.next().c().toLowerCase());
                    if (contactsByUnigramPinyin != null) {
                        for (Contact contact : contactsByUnigramPinyin) {
                            if (!hashSet.contains(contact)) {
                                hashSet.add(contact);
                                ContactRet contactRet = new ContactRet(contact, calScore(listF, contact.getPinyinItems()), "", "");
                                contactRet.filterPhoneItems(str);
                                arrayList.add(contactRet);
                            }
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        if (!arrayList.isEmpty()) {
            for (ContactRet contactRet2 : arrayList) {
                if (contactRet2.getScore() > 0.25d) {
                    Iterator<SlotRet> it4 = list.iterator();
                    double d = 0.0d;
                    while (it4.hasNext()) {
                        double dCalFinalScore = calFinalScore(it4.next().getSlot(), legalChName(contactRet2.getContact().getName()));
                        if (dCalFinalScore > d) {
                            d = dCalFinalScore;
                        }
                    }
                    contactRet2.setScore((d * 0.7d) + (contactRet2.getScore() * 0.8d));
                }
            }
        }
        Collections.sort(arrayList);
        if (!arrayList.isEmpty()) {
            double score = ((ContactRet) arrayList.get(0)).getScore();
            for (ContactRet contactRet3 : arrayList) {
                if (contactRet3.getScore() > 0.5d && arrayList2.size() < 3 && score - contactRet3.getScore() < 0.4d) {
                    arrayList2.add(contactRet3);
                    hashSet2.add(contactRet3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (ContactRet contactRet4 : arrayList2) {
            if (!contactRet4.getPhoneItems().isEmpty()) {
                arrayList3.add(contactRet4);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2 = arrayList3;
        }
        if (!arrayList2.isEmpty()) {
            matchRet.setContactRets(arrayList2);
            matchRet.setMatchType(MatchType.MATCH_UNIGRAM);
        }
        matchRet.getEventInfo().clearOtherInfos();
        for (i = 0; i < arrayList.size() && i < 20; i++) {
            ContactRet contactRet5 = (ContactRet) arrayList.get(i);
            FilterType filterType = FilterType.FILTER_LOW_SCORE;
            if (hashSet2.contains(contactRet5)) {
                filterType = contactRet5.getPhoneItems().isEmpty() ? FilterType.FILTER_MISS_TAG : FilterType.FILTTE_NO;
            }
            matchRet.getEventInfo().addOtherInfo(contactRet5.getContact().getName(), contactRet5.getScore(), filterType);
        }
    }

    private void matchDigitContact(List<SlotRet> list, ContactData contactData, MatchRet matchRet) {
        Iterator<SlotRet> it;
        Iterator<SlotRet> it2 = list.iterator();
        while (it2.hasNext()) {
            SlotRet next = it2.next();
            String slot = next.getSlot();
            Pattern pattern = DIGIT_NUMBER_PAT;
            String strNormZhPhoneNumberToArabic = pattern.matcher(slot).matches() ? PhoneStringUtils.normZhPhoneNumberToArabic(slot) : "";
            if (strNormZhPhoneNumberToArabic.isEmpty()) {
                String qc = DigitQc.getQc(slot);
                if (!qc.equals(slot) && pattern.matcher(qc).matches()) {
                    strNormZhPhoneNumberToArabic = PhoneStringUtils.normZhPhoneNumberToArabic(qc);
                }
            }
            if (strNormZhPhoneNumberToArabic.isEmpty()) {
                it = it2;
            } else if (isNumberValid(strNormZhPhoneNumberToArabic)) {
                matchRet.setMatchType(MatchType.MATCH_DIGIT);
                matchRet.setFixName(strNormZhPhoneNumberToArabic);
                matchRet.setFixQuery(next.getPrefix() + strNormZhPhoneNumberToArabic + next.getSuffix());
                matchRet.setAction(ActionType.PLAY);
                matchRet.clearContactRets();
                matchRet.getEventInfo().clearOtherInfos();
                it = it2;
            } else {
                Map<String, Contact> numberContactMap = contactData.getNumberContactMap();
                ArrayList arrayList = new ArrayList();
                for (String str : numberContactMap.keySet()) {
                    if (str.contains(strNormZhPhoneNumberToArabic)) {
                        Contact contact = numberContactMap.get(str);
                        Contact contact2 = new Contact(contact.getUserId(), contact.getName());
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new PhoneItem(contact.getUserId(), contact.getName(), "", str, false));
                        contact2.setPhoneItems(arrayList2);
                        arrayList.add(new ContactRet(contact2, arrayList2, 1.0d, contact.getName(), next.getPrefix() + str + next.getSuffix()));
                    }
                    it2 = it2;
                }
                it = it2;
                matchRet.setContactRets(arrayList);
                matchRet.setFixName(strNormZhPhoneNumberToArabic);
                matchRet.setAction(ActionType.QUERY);
                matchRet.setMatchType(MatchType.MATCH_DIGIT);
            }
            it2 = it;
        }
    }

    private void matchYellowPageContact(List<SlotRet> list, String str, ContactData contactData, MatchRet matchRet) {
        matchContactName(list, str, contactData, Boolean.FALSE, matchRet);
        if (matchRet.getMatchType() == MatchType.MATCH_CERTAIN) {
            return;
        }
        matchContactName(list, str, contactData, Boolean.TRUE, matchRet);
    }

    private void unigramPostProcess(MatchRet matchRet, List<SlotRet> list) {
        LOGGER.info("unigramPostProcess");
        if (matchRet.getMatchType() == MatchType.MATCH_UNIGRAM) {
            List<ContactRet> contactRets = matchRet.getContactRets();
            Iterator<SlotRet> it = list.iterator();
            while (it.hasNext()) {
                String slot = it.next().getSlot();
                if (slot.length() != 1 && !slot.matches("^[A-Za-z0-9 ]+$")) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < contactRets.size(); i++) {
                        ContactRet contactRet = contactRets.get(i);
                        if (similar(slot, contactRet.getContact().getName().toLowerCase())) {
                            arrayList.add(contactRet);
                        }
                    }
                    matchRet.setContactRets(arrayList);
                    if (arrayList.size() == 0) {
                        LOGGER.info("unigram all filtered");
                        matchRet.setMatchType(MatchType.MATCH_MISS);
                    }
                }
            }
        }
    }

    public List<String> getAlphabetic(String str) {
        ArrayList arrayList = new ArrayList();
        List<a.C0349a> listF = a.b().f(str, false);
        String strB = listF.size() > 0 ? listF.get(0).b() : "";
        if (!strB.isEmpty()) {
            for (String str2 : strB.split(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR)) {
                String[] strArrSplit = str2.split(",");
                if (strArrSplit.length == 2) {
                    arrayList.add((simContan.containsKey(strArrSplit[0]) ? simContan.get(strArrSplit[0]) : strArrSplit[0]) + "," + (simFinals.containsKey(strArrSplit[1]) ? simFinals.get(strArrSplit[1]) : strArrSplit[1]));
                }
            }
        }
        return arrayList;
    }

    public MatchRet match(PhoneCallIntention phoneCallIntention, ContactData contactData, RelativeMappingData relativeMappingData) {
        List<SlotRet> slotRets;
        MatchRet matchRet = new MatchRet();
        matchRet.setFixQuery(phoneCallIntention.getQuery());
        matchRet.setFixName(phoneCallIntention.getName());
        if (!phoneCallIntention.getSlotRets().isEmpty()) {
            matchRet.setNameType(phoneCallIntention.getSlotRets().get(0).getNameType());
        }
        if (phoneCallIntention.getObjectDeviceType().equals(ObjectDeviceType.APP) || (slotRets = phoneCallIntention.getSlotRets()) == null) {
            return matchRet;
        }
        if (slotRets.isEmpty()) {
            matchRet.setAction(ActionType.EMPTY);
            matchRet.setMatchType(MatchType.MATCH_EMPTY_NAME);
            return matchRet;
        }
        Iterator<SlotRet> it = slotRets.iterator();
        while (it.hasNext()) {
            if (NameType.YELLOW_PAGE.equals(it.next().getNameType())) {
                ArrayList arrayList = new ArrayList();
                if (!phoneCallIntention.getContact().getName().isEmpty()) {
                    if (phoneCallIntention.getContact().getPhoneItems().size() == 0) {
                        String name = phoneCallIntention.getContact().getName();
                        Iterator<String> it2 = phoneCallIntention.getContact().getYellowPageNumbers().iterator();
                        while (it2.hasNext()) {
                            phoneCallIntention.getContact().getPhoneItems().add(new PhoneItem().setName(name).setNumber(it2.next()));
                        }
                    }
                    arrayList.add(new ContactRet().setContact2(phoneCallIntention.getContact()).filterPhoneItems(""));
                    matchRet.setContactRets(arrayList);
                    matchRet.setNameType(NameType.YELLOW_PAGE);
                    matchRet.setMatchType(MatchType.MATCH_CERTAIN);
                    return matchRet;
                }
            }
        }
        MatchType matchType = MatchType.MATCH_MISS;
        matchRet.setMatchType(matchType);
        matchRet.clearContactRets();
        matchRet.getEventInfo().clearOtherInfos();
        matchRet.getEventInfo().setContactCnt(contactData.getContacts() != null ? contactData.getContactsNumber() : 0);
        String tag = phoneCallIntention.getTag();
        qpe qpeVar = LOGGER;
        qpeVar.info("contactData.isEmpty():{}", Boolean.valueOf(contactData.isEmpty()));
        if (!contactData.isEmpty()) {
            matchContact(slotRets, tag, contactData, matchRet, relativeMappingData);
            qpeVar.info("MatchType " + matchRet.getMatchType());
            qpeVar.info("finish local contact");
        }
        if (this.yellowPageData != null && matchRet.getMatchType() != MatchType.MATCH_CERTAIN && matchRet.getMatchType() != MatchType.MATCH_FUZZY && (!slotRets.get(0).getNameType().equals(NameType.RELATIVE) || matchRet.getMatchType() != matchType)) {
            qpeVar.info("yellowPageData contact");
            qpeVar.info("MatchType " + matchRet.getMatchType());
            matchYellowPageContact(slotRets, tag, this.yellowPageData, matchRet);
        }
        if (matchRet.getMatchType() != MatchType.MATCH_CERTAIN && matchRet.getMatchType() != MatchType.MATCH_FUZZY) {
            qpeVar.info("DigitContact");
            matchDigitContact(slotRets, contactData, matchRet);
        }
        return matchRet;
    }

    public boolean similar(String str, String str2) {
        List<String> alphabetic = getAlphabetic(str);
        List<String> alphabetic2 = getAlphabetic(str2);
        ArrayList arrayList = new ArrayList(alphabetic);
        arrayList.retainAll(alphabetic2);
        if (arrayList.size() == 0) {
            return false;
        }
        if (arrayList.size() != 1) {
            return true;
        }
        alphabetic.remove(arrayList.get(0));
        alphabetic2.remove(arrayList.get(0));
        return similarAlphabetic(alphabetic, alphabetic2);
    }

    public boolean similarAlphabetic(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(",");
            arrayList.add(strArrSplit[0]);
            arrayList2.add(strArrSplit[1]);
        }
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            String[] strArrSplit2 = it2.next().split(",");
            if (arrayList.contains(strArrSplit2[0])) {
                return true;
            }
            if (strArrSplit2.length > 1 && arrayList2.contains(strArrSplit2[1])) {
                return true;
            }
        }
        return false;
    }

    private void fillMatchRet(List<ContactRet> list, MatchRet matchRet, boolean z) {
        Collections.sort(list);
        List<ContactRet> arrayList = new ArrayList<>();
        for (ContactRet contactRet : list) {
            if (!contactRet.getPhoneItems().isEmpty()) {
                arrayList.add(contactRet);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = list;
        }
        if (!arrayList.isEmpty()) {
            matchRet.setContactRets(arrayList);
            if (z) {
                matchRet.setMatchType(MatchType.MATCH_FUZZY);
            } else {
                matchRet.setMatchType(MatchType.MATCH_CERTAIN);
            }
        }
        if (arrayList.size() == 1) {
            matchRet.setFixName(arrayList.get(0).getShowName());
            matchRet.setFixQuery(arrayList.get(0).getShowQuery());
        }
        if (list.isEmpty()) {
            return;
        }
        matchRet.getEventInfo().clearOtherInfos();
        for (ContactRet contactRet2 : list) {
            matchRet.getEventInfo().addOtherInfo(contactRet2.getContact().getName(), contactRet2.getScore(), contactRet2.getPhoneItems().isEmpty() ? FilterType.FILTER_MISS_TAG : FilterType.FILTTE_NO);
        }
    }

    private void matchContactName(List<SlotRet> list, String str, ContactData contactData, Boolean bool, MatchRet matchRet, boolean z) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (SlotRet slotRet : list) {
            for (a.C0349a c0349a : a.b().f(slotRet.getSlot(), bool.booleanValue())) {
                String strC = c0349a.c();
                String strD = c0349a.d();
                Set<Contact> contactsByNamePinyin = contactData.getContactsByNamePinyin(strC.toLowerCase());
                if (contactsByNamePinyin != null) {
                    LOGGER.info("contacts num " + contactsByNamePinyin.size());
                    for (Contact contact : contactsByNamePinyin) {
                        if (!hashSet.contains(contact)) {
                            hashSet.add(contact);
                            Contact.PinyinItem pinyinWithToneItem = z ? contact.getPinyinWithToneItem(strC, strD) : contact.getPinyinItem(strC);
                            if (pinyinWithToneItem != null) {
                                ContactRet contactRet = new ContactRet(contact, pinyinWithToneItem.getScore(), pinyinWithToneItem.getName(), slotRet.getPrefix() + pinyinWithToneItem.getName() + slotRet.getSuffix());
                                contactRet.filterPhoneItems(str);
                                arrayList.add(contactRet);
                            }
                            hashSet = hashSet;
                        }
                    }
                }
            }
        }
        fillMatchRet(arrayList, matchRet, bool.booleanValue());
    }
}
