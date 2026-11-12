package com.xiaomi.ai.domain.phonecall.provider;

import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.CardType;
import com.xiaomi.ai.domain.phonecall.common.ContactRet;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallContent;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallRequestEnv;
import com.xiaomi.ai.domain.phonecall.contact.Contact;
import com.xiaomi.ai.domain.phonecall.contact.PhoneItem;
import com.xiaomi.ai.domain.phonecall.contact.RelativeMappingData;
import defpackage.aqe;
import defpackage.klo;
import defpackage.mjh;
import defpackage.qpe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ReQueryProvider {
    public static final String DEFAULT_TO_SPEAK = "你问住小爱啦，请换个说法吧";
    private static final qpe LOGGER = aqe.f(ReQueryProvider.class);

    private PhoneCallContent genAnsBrowse(PhoneCallIntention phoneCallIntention, PhoneCallContent phoneCallContent) {
        return phoneCallIntention.getProcessingRound() + 1 >= 3 ? new PhoneCallContent(DEFAULT_TO_SPEAK, DEFAULT_TO_SPEAK, new ArrayList(), false) : phoneCallContent;
    }

    private PhoneCallContent genAnsDiscard(PhoneCallIntention phoneCallIntention) {
        return new PhoneCallContent("好的，已取消发送", "好的，已取消发送", new ArrayList(), false);
    }

    private PhoneCallContent genAnsError() {
        String str = String.format("操作失败，请重试", new Object[0]);
        return new PhoneCallContent(str, str, new ArrayList(), false);
    }

    private PhoneCallContent genAnsMessageSend(PhoneCallIntention phoneCallIntention, PhoneCallIntention phoneCallIntention2, PhoneCallContent phoneCallContent, PhoneCallRequestEnv phoneCallRequestEnv) {
        String str;
        List<PhoneItem> listSubList;
        String str2;
        String str3;
        boolean z;
        boolean zIsSelectDefaultCard = phoneCallRequestEnv.isSelectDefaultCard();
        List<PhoneItem> phoneList = phoneCallContent.getPhoneList();
        if (!klo.b(phoneCallIntention.getMessageText())) {
            if (phoneCallContent.getPhoneList().size() == 0) {
                return genAnsError();
            }
            if (phoneCallContent.getPhoneList().size() == 1) {
                phoneList = phoneCallContent.getPhoneList();
                if (!zIsSelectDefaultCard && CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
                    String str4 = String.format("请问你要用卡1还是卡2发送?", new Object[0]);
                    String str5 = String.format("请问你要用卡1还是卡2发送?", new Object[0]);
                    phoneCallIntention.setAddShowContacts(true);
                    str = str4;
                    str2 = str5;
                    listSubList = phoneList;
                    z = true;
                }
                return new PhoneCallContent(str, str2, listSubList, z, phoneCallIntention.getMessageText());
            }
            if (phoneCallIntention.isSelectPlayOrder()) {
                str3 = "找到多个联系人，你想发给第几个？";
            } else {
                int playOrder = phoneCallIntention.getPlayOrder() - 1 < 0 ? 0 : phoneCallIntention.getPlayOrder() - 1;
                if (!zIsSelectDefaultCard && CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
                    String str6 = String.format("请问你要用卡1还是卡2发送?", new Object[0]);
                    String str7 = String.format("请问你要用卡1还是卡2发送?", new Object[0]);
                    phoneCallIntention.setAddShowContacts(true);
                    str = str6;
                    listSubList = phoneCallContent.getPhoneList().subList(playOrder, playOrder + 1);
                    str2 = str7;
                } else {
                    if (playOrder >= phoneCallContent.getPhoneList().size()) {
                        return genAnsError();
                    }
                    phoneList = phoneCallContent.getPhoneList().subList(playOrder, playOrder + 1);
                }
            }
            z = true;
            return new PhoneCallContent(str, str2, listSubList, z, phoneCallIntention.getMessageText());
            listSubList = phoneList;
            str = "已发送";
            str2 = str;
            z = false;
            return new PhoneCallContent(str, str2, listSubList, z, phoneCallIntention.getMessageText());
        }
        str3 = "你还没有填写短信内容";
        str = str3;
        str2 = str;
        listSubList = phoneList;
        z = true;
        return new PhoneCallContent(str, str2, listSubList, z, phoneCallIntention.getMessageText());
    }

    private PhoneCallContent genAnsPlay(PhoneCallIntention phoneCallIntention, PhoneCallContent phoneCallContent, PhoneCallRequestEnv phoneCallRequestEnv) {
        String str;
        boolean zIsBlueTooth = phoneCallRequestEnv.isBlueTooth();
        boolean zIsSelectDefaultCard = phoneCallRequestEnv.isSelectDefaultCard();
        boolean z = true;
        int playOrder = phoneCallIntention.getPlayOrder() - 1;
        String tailNumber = phoneCallIntention.getTailNumber();
        if (!zIsSelectDefaultCard && phoneCallContent.getPhoneList().size() == 1 && !CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
            String str2 = ToSpeakUtils.handFreeToSpeak(phoneCallIntention).isEmpty() ? "好的" : String.format("正在免提呼叫", new Object[0]);
            phoneCallIntention.setAddShowContacts(false);
            return new PhoneCallContent(str2, str2, phoneCallContent.getPhoneList(), false);
        }
        if (playOrder == -1 && !tailNumber.isEmpty()) {
            for (PhoneItem phoneItem : phoneCallContent.getPhoneList()) {
                if (phoneItem.getNumber().endsWith(tailNumber)) {
                    if (zIsSelectDefaultCard || !CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
                        String str3 = String.format("正在为你%s呼叫尾号为%s的%s", ToSpeakUtils.handFreeToSpeak(phoneCallIntention), tailNumber, phoneItem.getName());
                        phoneCallIntention.setAddShowContacts(false);
                        return new PhoneCallContent(str3, str3, Arrays.asList(phoneItem), false);
                    }
                    String str4 = String.format("为你找到尾号为%s的%s,请问你要用卡1还是卡2拨打？", tailNumber, phoneItem.getName());
                    phoneCallIntention.setAddShowContacts(true);
                    phoneCallIntention.setCardType(CardType.SIM_CARD);
                    phoneItem.setAutoDial(true);
                    return new PhoneCallContent(str4, str4, Arrays.asList(phoneItem), true);
                }
            }
            return genAnsError();
        }
        if (zIsBlueTooth) {
            mjh<List<Contact>, Integer> contacts = toContacts(phoneCallContent.getPhoneList());
            if (contacts.b().size() > 1 && contacts.c().intValue() > 1) {
                if (playOrder >= contacts.b().size()) {
                    return genAnsError();
                }
                Contact contact = contacts.b().get(playOrder);
                if (contact.getPhoneItems().size() > 1) {
                    ContactRet contactRet = new ContactRet();
                    contactRet.setContact2(contact);
                    contactRet.filterPhoneItems("");
                    String strSingleContactMultiNumberToSpeak = ToSpeakUtils.singleContactMultiNumberToSpeak(contactRet);
                    phoneCallIntention.setAction(ActionType.QUERY);
                    return new PhoneCallContent(strSingleContactMultiNumberToSpeak, strSingleContactMultiNumberToSpeak, contact.getPhoneItems(), true);
                }
                String name = contact.getName();
                if (zIsSelectDefaultCard || !CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
                    String str5 = String.format("正在%s呼叫%s", ToSpeakUtils.handFreeToSpeak(phoneCallIntention), name);
                    phoneCallIntention.setAddShowContacts(false);
                    return new PhoneCallContent(str5, str5, contact.getPhoneItems(), false);
                }
                String str6 = String.format("请问你要用卡1还是卡2拨打?", new Object[0]);
                phoneCallIntention.setCardType(CardType.SIM_CARD);
                phoneCallIntention.setAddShowContacts(true);
                return new PhoneCallContent(str6, str6, contact.getPhoneItems(), true);
            }
        }
        if (playOrder >= phoneCallContent.getPhoneList().size()) {
            return genAnsError();
        }
        PhoneItem phoneItem2 = phoneCallContent.getPhoneList().get(playOrder);
        if (zIsBlueTooth) {
            String number = phoneItem2.getNumber();
            if (number.length() >= 4) {
                number = number.substring(number.length() - 4);
            }
            str = String.format("正在%s呼叫尾号为%s的%s", ToSpeakUtils.handFreeToSpeak(phoneCallIntention), number, phoneItem2.getName());
        } else {
            str = String.format("正在%s呼叫%s", ToSpeakUtils.handFreeToSpeak(phoneCallIntention), phoneItem2.getName());
        }
        phoneCallIntention.setAddShowContacts(false);
        if (zIsSelectDefaultCard || !CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
            z = false;
        } else {
            str = String.format("请问你要用卡1还是卡2拨打?", new Object[0]);
            phoneCallIntention.setCardType(CardType.SIM_CARD);
            phoneCallIntention.setAddShowContacts(true);
            phoneItem2.setAutoDial(true);
        }
        return new PhoneCallContent(str, str, Arrays.asList(phoneItem2), z);
    }

    private PhoneCallContent genAnsPlayStore(PhoneCallIntention phoneCallIntention, PhoneCallContent phoneCallContent, RelativeMappingData relativeMappingData, PhoneCallRequestEnv phoneCallRequestEnv) {
        int playOrder = phoneCallIntention.getPlayOrder() - 1;
        if (playOrder >= phoneCallContent.getPhoneList().size()) {
            return genAnsError();
        }
        PhoneItem phoneItem = phoneCallContent.getPhoneList().get(playOrder);
        String str = String.format("已记住%s是你的%s，即将%s呼叫", phoneItem.getName(), phoneCallIntention.getNickNameInfo().getNickName(), ToSpeakUtils.handFreeToSpeak(phoneCallIntention));
        String str2 = ToSpeakUtils.handFreeToSpeak(phoneCallIntention).isEmpty() ? "好的" : String.format("正在免提呼叫%s", phoneItem.getName());
        if (relativeMappingData != null) {
            relativeMappingData.pushRelativeMapping(phoneCallIntention.getNickNameInfo().getNickName(), new RelativeMappingData.RelativeMappingEntry(phoneItem.getUserId(), phoneItem.getName(), true));
            relativeMappingData.setUpdated(true);
        }
        if (phoneCallRequestEnv.isHasWritePermission()) {
            return new PhoneCallContent(str, str, Arrays.asList(phoneItem), false);
        }
        phoneCallIntention.setAction(ActionType.PLAY);
        return new PhoneCallContent(str2, str2, Arrays.asList(phoneItem), false);
    }

    private PhoneCallContent genAnsStop() {
        String str = String.format("已取消拨打", new Object[0]);
        return new PhoneCallContent(str, str, new ArrayList(), false);
    }

    private PhoneCallContent genAnsStopStore(PhoneCallIntention phoneCallIntention) {
        String str = String.format("通讯录中没有%s，呼叫失败", phoneCallIntention.getNickNameInfo().getNickName());
        return new PhoneCallContent(str, str, new ArrayList(), false);
    }

    private mjh<List<Contact>, Integer> toContacts(List<PhoneItem> list) {
        int i = 0;
        if (list.size() == 0) {
            return new mjh<>(new ArrayList(), 0);
        }
        Contact contact = new Contact();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        hashSet.add(list.get(0).getName());
        contact.setName2(list.get(0).getName());
        for (PhoneItem phoneItem : list) {
            if (!hashSet.contains(phoneItem.getName())) {
                Contact name2 = new Contact().setName2(contact.getName());
                name2.getPhoneItems().addAll(contact.getPhoneItems());
                arrayList.add(name2);
                int iMax = Math.max(i, contact.getPhoneItems().size());
                Contact name3 = new Contact().setName2(phoneItem.getName());
                hashSet.add(phoneItem.getName());
                i = iMax;
                contact = name3;
            }
            contact.getPhoneItems().add(phoneItem);
        }
        int iMax2 = Math.max(i, contact.getPhoneItems().size());
        arrayList.add(contact);
        return new mjh<>(arrayList, Integer.valueOf(iMax2));
    }

    public PhoneCallContent provide(PhoneCallIntention phoneCallIntention, PhoneCallIntention phoneCallIntention2, PhoneCallContent phoneCallContent, RelativeMappingData relativeMappingData, PhoneCallRequestEnv phoneCallRequestEnv) {
        if (phoneCallIntention.getAction().equals(ActionType.STOP.toString())) {
            return genAnsStop();
        }
        if (phoneCallIntention.getAction().equals(ActionType.PLAY.toString())) {
            return genAnsPlay(phoneCallIntention, phoneCallContent, phoneCallRequestEnv);
        }
        if (!phoneCallIntention.getAction().equals(ActionType.BROWSE.toString()) && !phoneCallIntention.getAction().equals(ActionType.BROWSE_STORE.toString())) {
            if (phoneCallIntention.getAction().equals(ActionType.PLAY_STORE.toString())) {
                return genAnsPlayStore(phoneCallIntention, phoneCallContent, relativeMappingData, phoneCallRequestEnv);
            }
            if (phoneCallIntention.getAction().equals(ActionType.STOP_STORE.toString())) {
                return genAnsStopStore(phoneCallIntention);
            }
            if (phoneCallIntention.getAction().equals(ActionType.MESSAGE_SEND.toString())) {
                return genAnsMessageSend(phoneCallIntention, phoneCallIntention2, phoneCallContent, phoneCallRequestEnv);
            }
            return phoneCallIntention.getAction().equals(ActionType.MESSAGE_DISCARD.toString()) ? genAnsDiscard(phoneCallIntention) : genAnsError();
        }
        return genAnsBrowse(phoneCallIntention2, phoneCallContent);
    }
}
