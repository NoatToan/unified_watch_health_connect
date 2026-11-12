package com.xiaomi.ai.domain.phonecall.provider;

import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.ContactRet;
import com.xiaomi.ai.domain.phonecall.common.MatchRet;
import com.xiaomi.ai.domain.phonecall.common.MatchType;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.SlotRet;
import com.xiaomi.ai.domain.phonecall.contact.Contact;
import com.xiaomi.ai.domain.phonecall.contact.ContactData;
import com.xiaomi.ai.domain.phonecall.contact.RelativeMappingData;
import com.xiaomi.ai.domain.phonecall.util.DigitQc;
import com.xiaomi.ai.domain.phonecall.util.PhoneStringUtils;
import com.xiaomi.ai.nlp.contact.common.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class ContactModelMatcher {
    private static final Pattern DIGIT_NUMBER_PAT = Pattern.compile("^[零一二三四五六七八九0-9]{3,}$");
    private ContactData yellowPageData = YellowPageDataLoader.getInstantce().getYellowPageData();
    private NameMatcherTool nameMatcherTool = new NameMatcherTool();

    private void extractContactFromPositiveResults(Contact contact, SlotRet slotRet, String str, List<ContactRet> list, double d) {
        if (contact == null) {
            return;
        }
        ContactRet contactRet = new ContactRet(contact, d, contact.getName(), slotRet.getPrefix() + contact.getName() + slotRet.getSuffix());
        contactRet.filterPhoneItems(str);
        list.add(contactRet);
    }

    private void fillMatchRet(List<ContactRet> list, MatchRet matchRet) {
        fillMatchRet(list, matchRet, false);
    }

    private void matchContact(List<SlotRet> list, String str, ContactData contactData, MatchRet matchRet, RelativeMappingData relativeMappingData) {
        List<SlotRet> listMapRelativeSlots = relativeMappingData != null ? relativeMappingData.mapRelativeSlots(list) : null;
        matchContactNameWithTone(list, str, contactData, matchRet);
        MatchType matchType = matchRet.getMatchType();
        MatchType matchType2 = MatchType.MATCH_CERTAIN;
        if (matchType == matchType2) {
            return;
        }
        if (listMapRelativeSlots != null) {
            matchContactNameWithTone(listMapRelativeSlots, str, contactData, matchRet);
        }
        if (matchRet.getMatchType() == matchType2) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        matchContactName(list, str, contactData, bool, matchRet);
        if (matchRet.getMatchType() == matchType2) {
            return;
        }
        if (listMapRelativeSlots != null) {
            matchContactName(listMapRelativeSlots, str, contactData, bool, matchRet);
        }
        if (matchRet.getMatchType() == matchType2 || RelativeMappingData.hasRelativeSlot(list)) {
            return;
        }
        matchContactByModel(list, str, contactData, matchRet);
    }

    private void matchContactByModel(List<SlotRet> list, String str, ContactData contactData, MatchRet matchRet) {
        ArrayList arrayList = new ArrayList();
        for (Contact contact : contactData.getContacts()) {
            for (Contact.PinyinItem pinyinItem : contact.getPinyinItems()) {
                a.C0349a pinyinResult = pinyinItem.getPinyinResult();
                double score = pinyinItem.getScore();
                for (SlotRet slotRet : list) {
                    Iterator<a.C0349a> it = a.b().g(slotRet.getSlot(), false, true).iterator();
                    while (it.hasNext()) {
                        double dPredict = this.nameMatcherTool.predict(it.next(), pinyinResult, Double.valueOf(score));
                        if (dPredict >= 0.0d) {
                            extractContactFromPositiveResults(contact, slotRet, str, arrayList, dPredict);
                        }
                    }
                }
            }
        }
        NameMatcherReRank.getInstance().reRank(arrayList, matchRet);
    }

    private void matchContactName(List<SlotRet> list, String str, ContactData contactData, Boolean bool, MatchRet matchRet) {
        matchContactName(list, str, contactData, bool, matchRet, false);
    }

    private void matchContactNameWithTone(List<SlotRet> list, String str, ContactData contactData, MatchRet matchRet) {
        matchContactName(list, str, contactData, Boolean.FALSE, matchRet, true);
    }

    private void matchDigitContact(List<SlotRet> list, MatchRet matchRet) {
        for (SlotRet slotRet : list) {
            String slot = slotRet.getSlot();
            Pattern pattern = DIGIT_NUMBER_PAT;
            String strNormZhPhoneNumberToArabic = pattern.matcher(slot).matches() ? PhoneStringUtils.normZhPhoneNumberToArabic(slot) : "";
            if (strNormZhPhoneNumberToArabic.isEmpty()) {
                String qc = DigitQc.getQc(slot);
                if (!qc.equals(slot) && pattern.matcher(qc).matches()) {
                    strNormZhPhoneNumberToArabic = PhoneStringUtils.normZhPhoneNumberToArabic(qc);
                }
            }
            if (!strNormZhPhoneNumberToArabic.isEmpty()) {
                matchRet.setMatchType(MatchType.MATCH_DIGIT);
                matchRet.setFixName(strNormZhPhoneNumberToArabic);
                matchRet.setFixQuery(slotRet.getPrefix() + strNormZhPhoneNumberToArabic + slotRet.getSuffix());
                matchRet.setAction(ActionType.PLAY);
                matchRet.clearContactRets();
                matchRet.getEventInfo().clearOtherInfos();
            }
        }
    }

    private void matchYellowPageContact(List<SlotRet> list, String str, ContactData contactData, MatchRet matchRet) {
        matchContactName(list, str, contactData, Boolean.FALSE, matchRet);
        if (matchRet.getMatchType() == MatchType.MATCH_CERTAIN) {
            return;
        }
        matchContactName(list, str, contactData, Boolean.TRUE, matchRet);
    }

    public MatchRet match(PhoneCallIntention phoneCallIntention, ContactData contactData, RelativeMappingData relativeMappingData) {
        MatchRet matchRet = new MatchRet();
        matchRet.setFixQuery(phoneCallIntention.getQuery());
        matchRet.setFixName(phoneCallIntention.getName());
        if (!phoneCallIntention.getSlotRets().isEmpty()) {
            matchRet.setNameType(phoneCallIntention.getSlotRets().get(0).getNameType());
        }
        List<SlotRet> slotRets = phoneCallIntention.getSlotRets();
        if (slotRets == null) {
            return matchRet;
        }
        if (slotRets.isEmpty()) {
            matchRet.setAction(ActionType.EMPTY);
            matchRet.setMatchType(MatchType.MATCH_EMPTY_NAME);
            return matchRet;
        }
        matchRet.setMatchType(MatchType.MATCH_MISS);
        matchRet.clearContactRets();
        matchRet.getEventInfo().clearOtherInfos();
        matchRet.getEventInfo().setContactCnt(contactData.getContacts() != null ? contactData.getContactsNumber() : 0);
        String tag = phoneCallIntention.getTag();
        matchContact(slotRets, tag, contactData, matchRet, relativeMappingData);
        if (this.yellowPageData != null && matchRet.getMatchType() != MatchType.MATCH_CERTAIN && matchRet.getMatchType() != MatchType.MATCH_MODEL) {
            matchYellowPageContact(slotRets, tag, this.yellowPageData, matchRet);
        }
        if (matchRet.getMatchType() != MatchType.MATCH_CERTAIN && matchRet.getMatchType() != MatchType.MATCH_MODEL) {
            matchDigitContact(slotRets, matchRet);
        }
        return matchRet;
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
