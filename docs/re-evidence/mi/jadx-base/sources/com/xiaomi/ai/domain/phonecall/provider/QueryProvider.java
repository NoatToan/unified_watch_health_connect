package com.xiaomi.ai.domain.phonecall.provider;

import com.xiaomi.ai.domain.phonecall.PhoneCallSolver;
import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.CardType;
import com.xiaomi.ai.domain.phonecall.common.ContactRet;
import com.xiaomi.ai.domain.phonecall.common.DeviceApp;
import com.xiaomi.ai.domain.phonecall.common.DeviceConfig;
import com.xiaomi.ai.domain.phonecall.common.MatchRet;
import com.xiaomi.ai.domain.phonecall.common.MatchType;
import com.xiaomi.ai.domain.phonecall.common.NameType;
import com.xiaomi.ai.domain.phonecall.common.ObjectDeviceType;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallContent;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallRequestEnv;
import com.xiaomi.ai.domain.phonecall.common.ResponseStrategy;
import com.xiaomi.ai.domain.phonecall.contact.Contact;
import com.xiaomi.ai.domain.phonecall.contact.PhoneItem;
import defpackage.aqe;
import defpackage.qpe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class QueryProvider {
    private static final qpe LOGGER = aqe.f(PhoneCallSolver.class);
    private final List<MatchType> relativeStartStoreMatchTypeList = Arrays.asList(MatchType.MATCH_MISS, MatchType.MATCH_UNIGRAM, MatchType.MATCH_FUZZY, MatchType.MATCH_MODEL);
    private final String phoneNumberPlaceHolder = "###";

    private PhoneCallContent genAnsBrowseStore(MatchRet matchRet, PhoneCallIntention phoneCallIntention) {
        String str;
        if (matchRet.getContactRets().isEmpty()) {
            return new PhoneCallContent();
        }
        ActionType actionType = ActionType.QUERY;
        ContactRet contactRet = matchRet.getContactRets().get(0);
        if (matchRet.getContactRets().size() != 1) {
            actionType = ActionType.BROWSE_STORE;
            str = "找到多个相似联系人，请问你要记住哪一个？";
        } else if (contactRet.getPhoneItems().size() == 1 && (matchRet.getMatchType() == MatchType.MATCH_CERTAIN || matchRet.getMatchType() == MatchType.MATCH_FUZZY || matchRet.getMatchType() == MatchType.MATCH_MODEL)) {
            str = String.format("好的，要不要记住%s是你的%s", contactRet.getContact().getName(), phoneCallIntention.getNickNameInfo().getNickName());
            actionType = ActionType.BROWSE_STORE;
        } else if (contactRet.getPhoneItems().size() <= 1 || !(matchRet.getMatchType() == MatchType.MATCH_CERTAIN || matchRet.getMatchType() == MatchType.MATCH_FUZZY)) {
            str = "";
        } else {
            str = String.format("%s有%d个号码，请问你要记住第几个？", contactRet.getContact().getName(), Integer.valueOf(contactRet.getPhoneItems().size()));
            actionType = ActionType.BROWSE_STORE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ContactRet> it = matchRet.getContactRets().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getPhoneItems());
        }
        matchRet.setAction(actionType);
        return new PhoneCallContent(str, str, arrayList, true);
    }

    private PhoneCallContent genAnsByDigit(MatchRet matchRet, PhoneCallIntention phoneCallIntention, PhoneCallRequestEnv phoneCallRequestEnv) {
        String strHandFreeToSpeak = ToSpeakUtils.handFreeToSpeak(phoneCallIntention);
        ActionType action = matchRet.getAction();
        ActionType actionType = ActionType.PLAY;
        boolean z = true;
        if (action == actionType) {
            boolean zIsSelectDefaultCard = phoneCallRequestEnv.isSelectDefaultCard();
            String fixName = matchRet.getFixName();
            String str = String.format("正在%s呼叫%s", strHandFreeToSpeak, fixName.replaceAll("(.)", " $1"));
            String str2 = String.format("正在%s呼叫%s", strHandFreeToSpeak, fixName);
            if (zIsSelectDefaultCard || !CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
                z = false;
            } else {
                str = String.format("请问你要用卡1还是卡2拨打?", new Object[0]);
                str2 = String.format("请问你要用卡1还是卡2拨打?", new Object[0]);
                phoneCallIntention.setCardType(CardType.SIM_CARD);
                phoneCallIntention.setAddShowContacts(true);
            }
            matchRet.setAction(actionType);
            return new PhoneCallContent(str, str2, Arrays.asList(new PhoneItem("", fixName, fixName, fixName, false)), z);
        }
        if (matchRet.getContactRets().size() == 0) {
            String fixName2 = matchRet.getFixName();
            return new PhoneCallContent(String.format("没有找到包含号码%s的联系人", fixName2), String.format("没有找到包含号码%s的联系人", fixName2), new ArrayList(), false);
        }
        if (matchRet.getContactRets().size() == 1) {
            String fixName3 = matchRet.getFixName();
            Contact contact = matchRet.getContactRets().get(0).getContact();
            String showName = matchRet.getContactRets().get(0).getShowName();
            String str3 = String.format("正在%s呼叫包含号码%s的联系人%s", strHandFreeToSpeak, fixName3, showName);
            String str4 = String.format("正在%s呼叫包含号码%s的联系人%s", strHandFreeToSpeak, fixName3, showName);
            matchRet.setAction(actionType);
            return new PhoneCallContent(str3, str4, contact.getPhoneItems(), false);
        }
        String fixName4 = matchRet.getFixName();
        List<ContactRet> contactRets = matchRet.getContactRets();
        ArrayList arrayList = new ArrayList();
        Iterator<ContactRet> it = contactRets.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPhoneItems().get(0));
        }
        return new PhoneCallContent(String.format("找到多个包含号码%s的联系人，你想拨打第几个？", fixName4), String.format("找到多个包含号码%s的联系人，你想拨打第几个？", fixName4), arrayList, true);
    }

    private PhoneCallContent genAnsByEmpty(MatchRet matchRet) {
        matchRet.setAction(ActionType.EMPTY);
        return new PhoneCallContent("你要打给谁？", "你要打给谁？", new ArrayList(), true);
    }

    private PhoneCallContent genAnsByName(String str, MatchRet matchRet, PhoneCallIntention phoneCallIntention, PhoneCallRequestEnv phoneCallRequestEnv) {
        if (phoneCallIntention.getObjectDeviceType().equals(ObjectDeviceType.APP)) {
            return genAnsCallApp(matchRet);
        }
        DeviceApp deviceApp = phoneCallRequestEnv.getDeviceApp();
        if (this.relativeStartStoreMatchTypeList.contains(matchRet.getMatchType()) && matchRet.getNameType() == NameType.RELATIVE && !phoneCallIntention.getAction().equals(ActionType.NOT_STORE.toString())) {
            return genAnsMissAndRelative(matchRet, phoneCallIntention, deviceApp);
        }
        if (matchRet.getMatchType() == MatchType.MATCH_MISS) {
            return genAnsMiss(matchRet);
        }
        return str.isEmpty() ? genAnsNoTag(matchRet, phoneCallRequestEnv, phoneCallIntention) : genAnsHasTag(str, matchRet, phoneCallRequestEnv, phoneCallIntention);
    }

    private PhoneCallContent genAnsCallApp(MatchRet matchRet) {
        ActionType actionType = ActionType.PLAY;
        ArrayList arrayList = new ArrayList();
        matchRet.setAction(actionType);
        return new PhoneCallContent("好的", "好的", arrayList, false);
    }

    private PhoneCallContent genAnsError() {
        String str = String.format("操作失败，请重试", new Object[0]);
        return new PhoneCallContent(str, str, new ArrayList(), false);
    }

    private PhoneCallContent genAnsHangUp(MatchRet matchRet) {
        matchRet.setAction(ActionType.HANG_UP);
        return new PhoneCallContent("好的，已挂断", "好的，已挂断", new ArrayList(), false);
    }

    private PhoneCallContent genAnsHasTag(String str, MatchRet matchRet, PhoneCallRequestEnv phoneCallRequestEnv, PhoneCallIntention phoneCallIntention) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ContactRet contactRet : matchRet.getContactRets()) {
            if (!contactRet.getPhoneItems().isEmpty()) {
                arrayList2.add(contactRet);
            }
            arrayList.add(contactRet);
        }
        return !arrayList2.isEmpty() ? genAnsHasTagHit(str, arrayList2, matchRet, phoneCallRequestEnv, phoneCallIntention) : genAnsHasTagAll(str, arrayList, matchRet, phoneCallRequestEnv, phoneCallIntention);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x010c A[LOOP:0: B:26:0x0106->B:28:0x010c, LOOP_END] */
    private PhoneCallContent genAnsHasTagAll(String str, List<ContactRet> list, MatchRet matchRet, PhoneCallRequestEnv phoneCallRequestEnv, PhoneCallIntention phoneCallIntention) {
        String str2;
        ArrayList arrayList;
        Iterator<ContactRet> it;
        if (list.isEmpty()) {
            return new PhoneCallContent();
        }
        ActionType actionType = ActionType.QUERY;
        DeviceApp deviceApp = phoneCallRequestEnv.getDeviceApp();
        boolean z = false;
        ContactRet contactRet = list.get(0);
        if (list.size() != 1) {
            if (DeviceConfig.useStrategy(ResponseStrategy.MULTI_CONTACTS_STOP, deviceApp.getAppId())) {
                str2 = String.format("没有找到%s的%s号码，但找到%s等多人，建议修改联系人名称", matchRet.getFixName(), str, contactRet.getContact().getName());
                actionType = ActionType.STOP;
            } else {
                str2 = String.format("没有找到%s的%s号码，但找到%s等多人，你想拨打第几个？", matchRet.getFixName(), str, contactRet.getContact().getName());
            }
            arrayList = new ArrayList();
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getContact().getPhoneItems());
            }
            matchRet.setAction(actionType);
            return new PhoneCallContent(str2, str2, arrayList, z);
        }
        if (contactRet.getContact().getPhoneItems().size() > 1) {
            str2 = String.format("没有找到%s的%s号码，但找到%s其他%d个号码，你想拨打第几个？", matchRet.getFixName(), str, contactRet.getContact().getName(), Integer.valueOf(contactRet.getContact().getPhoneItems().size()));
        } else {
            str2 = (matchRet.getMatchType() == MatchType.MATCH_CERTAIN || matchRet.getMatchType() == MatchType.MATCH_FUZZY || matchRet.getMatchType() == MatchType.MATCH_MODEL) ? String.format("没有找到%s的%s号码，但找到一个%s的%s号码，是否拨打？", matchRet.getFixName(), str, contactRet.getContact().getName(), contactRet.getContact().getPhoneItems().get(0).getTag()) : String.format("没有找到%s的%s号码，但找到一个%s的%s号码，是否拨打？", matchRet.getFixName(), str, contactRet.getContact().getName(), contactRet.getContact().getPhoneItems().get(0).getTag());
        }
        z = true;
        arrayList = new ArrayList();
        it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getContact().getPhoneItems());
        }
        matchRet.setAction(actionType);
        return new PhoneCallContent(str2, str2, arrayList, z);
    }

    private PhoneCallContent genAnsHasTagHit(String str, List<ContactRet> list, MatchRet matchRet, PhoneCallRequestEnv phoneCallRequestEnv, PhoneCallIntention phoneCallIntention) {
        String str2;
        boolean z;
        if (list.isEmpty()) {
            return new PhoneCallContent();
        }
        ActionType actionType = ActionType.QUERY;
        boolean zIsVoiceWakeUp = phoneCallRequestEnv.isVoiceWakeUp();
        DeviceApp deviceApp = phoneCallRequestEnv.getDeviceApp();
        ContactRet contactRet = list.get(0);
        HashSet hashSet = new HashSet();
        if (list.size() != 1) {
            Iterator<ContactRet> it = list.iterator();
            while (it.hasNext()) {
                for (PhoneItem phoneItem : it.next().getPhoneItems()) {
                    if (!hashSet.contains(phoneItem.getNumber()) && !phoneItem.getNumber().equals("###")) {
                        hashSet.add(phoneItem.getNumber());
                    }
                }
            }
            if (hashSet.size() == 1) {
                str2 = String.format("正在%s呼叫%s", ToSpeakUtils.handFreeToSpeak(phoneCallIntention), contactRet.getContact().getName());
                actionType = ActionType.PLAY;
            } else if (DeviceConfig.useStrategy(ResponseStrategy.MULTI_CONTACTS_STOP, deviceApp.getAppId())) {
                actionType = ActionType.STOP;
                str2 = "找到多个相似联系人，建议修改联系人名称";
            } else {
                str2 = (zIsVoiceWakeUp && matchRet.getContactRets().size() <= 5 && multiContactsIsSingleNumber(matchRet.getContactRets()).booleanValue()) ? String.format("找到多个相关联系人，%s，请问拨打第几个？", genMultiContactsNumberTTS(matchRet.getContactRets())) : "找到多个相似联系人，你想拨打第几个？";
                z = true;
            }
            z = false;
        } else if (contactRet.getPhoneItems().size() > 1) {
            if (DeviceConfig.useStrategy(ResponseStrategy.MULTI_NUMBERS_STOP, deviceApp.getAppId())) {
                str2 = String.format("%s有%d个%s号码，请检查通讯录", contactRet.getContact().getName(), Integer.valueOf(contactRet.getPhoneItems().size()), str);
                actionType = ActionType.STOP;
                z = false;
            } else {
                if (zIsVoiceWakeUp && contactRet.getPhoneItems().size() <= 5) {
                    String.format("找到%s的%d个号码，%s，你想拨打第几个？", contactRet.getContact().getName(), Integer.valueOf(contactRet.getPhoneItems().size()), genNumberTTS(contactRet.getPhoneItems()));
                }
                str2 = String.format("%s有%d个%s号码，你想拨打第几个？", contactRet.getContact().getName(), Integer.valueOf(contactRet.getPhoneItems().size()), str);
                z = true;
            }
        } else if (matchRet.getMatchType() == MatchType.MATCH_CERTAIN || matchRet.getMatchType() == MatchType.MATCH_FUZZY || matchRet.getMatchType() == MatchType.MATCH_MODEL) {
            str2 = String.format("正在%s呼叫%s", ToSpeakUtils.handFreeToSpeak(phoneCallIntention), contactRet.getContact().getName());
            actionType = ActionType.PLAY;
            z = false;
        } else {
            str2 = String.format("没有找到%s的电话，但找到一个%s的%s号码，是否拨打？", matchRet.getFixName(), contactRet.getContact().getName(), str);
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        if (hashSet.size() == 1) {
            arrayList.add(contactRet.getContact().getPhoneItems().get(0));
        } else {
            Iterator<ContactRet> it2 = matchRet.getContactRets().iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next().getPhoneItems());
            }
        }
        matchRet.setAction(actionType);
        return new PhoneCallContent(str2, str2, arrayList, z);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00a1 A[PHI: r3
      0x00a1: PHI (r3v9 java.util.List) = 
      (r3v8 java.util.List)
      (r3v8 java.util.List)
      (r3v0 java.util.List)
      (r3v0 java.util.List)
      (r3v0 java.util.List)
      (r3v0 java.util.List)
     binds: [B:29:0x00ff, B:31:0x010b, B:18:0x00d3, B:20:0x00df, B:7:0x008e, B:9:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    private PhoneCallContent genAnsMessageQueryText(MatchRet matchRet, PhoneCallRequestEnv phoneCallRequestEnv, PhoneCallIntention phoneCallIntention) {
        List list;
        String str;
        String str2;
        boolean z;
        boolean zIsSelectDefaultCard = phoneCallRequestEnv.isSelectDefaultCard();
        ActionType actionType = ActionType.MESSAGE_QUERY_TEXT;
        List arrayList = new ArrayList();
        qpe qpeVar = LOGGER;
        qpeVar.info("getPlayOrder:" + phoneCallIntention.getPlayOrder() + ",selectDefaultCard:" + zIsSelectDefaultCard);
        StringBuilder sb = new StringBuilder();
        sb.append("isSelectPlayOrder():");
        sb.append(phoneCallIntention.isSelectPlayOrder());
        qpeVar.info(sb.toString());
        qpeVar.info("getCardType():" + phoneCallIntention.getCardType());
        String str3 = "请问你要用卡1还是卡2发送?";
        String str4 = "确认发送嘛？";
        if (matchRet.getMatchType() != MatchType.MATCH_DIGIT) {
            if (matchRet.getContactRets().size() == 0) {
                String fixName = matchRet.getFixName();
                String str5 = String.format("没有找到%s联系人", fixName);
                String str6 = String.format("没有找到%s联系人", fixName);
                actionType = ActionType.EMPTY;
                str2 = str6;
                list = arrayList;
                z = false;
                str = str5;
            } else {
                Iterator<ContactRet> it = matchRet.getContactRets().iterator();
                while (it.hasNext()) {
                    for (PhoneItem phoneItem : it.next().getPhoneItems()) {
                        arrayList.add(new PhoneItem(phoneItem.getUserId(), phoneItem.getName(), phoneItem.getTag(), phoneItem.getNumber(), false));
                    }
                }
                int playOrder = phoneCallIntention.getPlayOrder() - 1 >= 0 ? phoneCallIntention.getPlayOrder() - 1 : 0;
                qpe qpeVar2 = LOGGER;
                qpeVar2.info("hitIdx:" + playOrder + ",getPlayOrder:" + phoneCallIntention.getPlayOrder() + ",selectDefaultCard:" + zIsSelectDefaultCard);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("phoneItems.size():");
                sb2.append(arrayList.size());
                qpeVar2.info(sb2.toString());
                qpeVar2.info("isSelectPlayOrder():" + phoneCallIntention.isSelectPlayOrder());
                qpeVar2.info("getCardType():" + phoneCallIntention.getCardType());
                if (playOrder >= arrayList.size()) {
                    qpeVar2.info("phoneItems:" + arrayList);
                    return genAnsError();
                }
                if ((arrayList.size() == 1 || phoneCallIntention.isSelectPlayOrder()) && !zIsSelectDefaultCard && CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
                    phoneCallIntention.setAddShowContacts(true);
                    arrayList = arrayList.subList(playOrder, playOrder + 1);
                } else {
                    if (arrayList.size() != 1) {
                        if (phoneCallIntention.isSelectPlayOrder()) {
                            arrayList = arrayList.subList(playOrder, playOrder + 1);
                        } else {
                            str3 = "找到多个联系人，你想发给第几个？";
                        }
                    }
                    list = arrayList;
                    str = "确认发送嘛？";
                    str2 = str;
                }
                list = arrayList;
                str = str3;
                str2 = str;
            }
            LOGGER.info("phoneItems.size():" + list.size());
            matchRet.setAction(actionType);
            return new PhoneCallContent(str, str2, list, z, phoneCallIntention.getMessageText());
        }
        if (matchRet.getContactRets().size() == 0) {
            String fixName2 = matchRet.getFixName();
            arrayList.add(new PhoneItem("", fixName2, "", fixName2, false));
            if (zIsSelectDefaultCard || !CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
                str3 = "确认发送嘛？";
            } else {
                phoneCallIntention.setAddShowContacts(true);
                str4 = "请问你要用卡1还是卡2发送?";
            }
        } else if (matchRet.getContactRets().size() == 1) {
            arrayList.add(new PhoneItem("", matchRet.getContactRets().get(0).getShowName(), "", matchRet.getFixName(), false));
            if (zIsSelectDefaultCard || !CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
                str3 = "确认发送嘛？";
            } else {
                phoneCallIntention.setAddShowContacts(true);
                str4 = "请问你要用卡1还是卡2发送?";
            }
        } else {
            int playOrder2 = phoneCallIntention.getPlayOrder() - 1 < 0 ? 0 : phoneCallIntention.getPlayOrder() - 1;
            if (phoneCallIntention.isSelectPlayOrder()) {
                arrayList = arrayList.subList(playOrder2, playOrder2 + 1);
                if (zIsSelectDefaultCard || !CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
                    str3 = "确认发送嘛？";
                } else {
                    phoneCallIntention.setAddShowContacts(true);
                    str4 = "请问你要用卡1还是卡2发送?";
                }
            } else {
                String fixName3 = matchRet.getFixName();
                Iterator<ContactRet> it2 = matchRet.getContactRets().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getPhoneItems().get(0));
                }
                str3 = String.format("找到多个包含号码%s的联系人，你想发给第几个？", fixName3);
                str4 = String.format("找到多个包含号码%s的联系人，你想发给第几个？", fixName3);
            }
        }
        list = arrayList;
        str = str3;
        str2 = str4;
        z = true;
        LOGGER.info("phoneItems.size():" + list.size());
        matchRet.setAction(actionType);
        return new PhoneCallContent(str, str2, list, z, phoneCallIntention.getMessageText());
    }

    private PhoneCallContent genAnsMessageWithoutContact(MatchRet matchRet, PhoneCallIntention phoneCallIntention) {
        matchRet.setAction(ActionType.valueOf(phoneCallIntention.getAction()));
        return new PhoneCallContent("你想发给谁？", "你想发给谁？", new ArrayList(), true);
    }

    private PhoneCallContent genAnsMessageWithoutText(MatchRet matchRet, PhoneCallIntention phoneCallIntention) {
        String str;
        ActionType actionType = ActionType.MESSAGE_WITHOUT_TEXT;
        List arrayList = new ArrayList();
        qpe qpeVar = LOGGER;
        qpeVar.info("getPlayOrder:" + phoneCallIntention.getPlayOrder());
        qpeVar.info("isSelectPlayOrder():" + phoneCallIntention.isSelectPlayOrder());
        qpeVar.info("getCardType():" + phoneCallIntention.getCardType());
        boolean z = false;
        String str2 = "你要发送什么内容？";
        if (matchRet.getMatchType() == MatchType.MATCH_DIGIT) {
            if (matchRet.getContactRets().size() <= 1) {
                String fixName = matchRet.getFixName();
                arrayList.add(new PhoneItem("", matchRet.getContactRets().size() == 1 ? matchRet.getContactRets().get(0).getShowName() : fixName, "", fixName, false));
            } else {
                int playOrder = phoneCallIntention.getPlayOrder() - 1 < 0 ? 0 : phoneCallIntention.getPlayOrder() - 1;
                String fixName2 = matchRet.getFixName();
                Iterator<ContactRet> it = matchRet.getContactRets().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getPhoneItems().get(0));
                }
                arrayList = arrayList.subList(playOrder, playOrder + 1);
                if (!phoneCallIntention.isSelectPlayOrder()) {
                    str2 = String.format("找到多个包含号码%s的联系人，你想发给第几个？", fixName2);
                    str = String.format("找到多个包含号码%s的联系人，你想发给第几个？", fixName2);
                }
                z = true;
            }
            str = "你要发送什么内容？";
            z = true;
        } else if (matchRet.getContactRets().size() == 0) {
            String fixName3 = matchRet.getFixName();
            str2 = String.format("没有找到%s联系人", fixName3);
            str = String.format("没有找到%s联系人", fixName3);
            actionType = ActionType.EMPTY;
        } else {
            Iterator<ContactRet> it2 = matchRet.getContactRets().iterator();
            while (it2.hasNext()) {
                for (PhoneItem phoneItem : it2.next().getPhoneItems()) {
                    arrayList.add(new PhoneItem(phoneItem.getUserId(), phoneItem.getName(), phoneItem.getTag(), phoneItem.getNumber(), false));
                }
            }
            if (arrayList.size() == 1) {
                arrayList.subList(0, 1);
            } else {
                String fixName4 = matchRet.getFixName();
                if (phoneCallIntention.isSelectPlayOrder()) {
                    int playOrder2 = phoneCallIntention.getPlayOrder();
                    int i = playOrder2 - 1;
                    if (i >= arrayList.size()) {
                        return genAnsError();
                    }
                    arrayList = arrayList.subList(i, playOrder2);
                } else {
                    str2 = String.format("找到多个联系人，你想发给第几个？", fixName4);
                    str = String.format("找到多个联系人，你想发给第几个？", fixName4);
                }
                z = true;
            }
            str = "你要发送什么内容？";
            z = true;
        }
        LOGGER.info("phoneItems.size():" + arrayList.size());
        matchRet.setAction(actionType);
        return new PhoneCallContent(str2, str, arrayList, z);
    }

    private PhoneCallContent genAnsMiss(MatchRet matchRet) {
        String str = String.format("没有找到联系人%s", matchRet.getFixName());
        matchRet.setAction(ActionType.STOP);
        return new PhoneCallContent(str, str, new ArrayList(), false);
    }

    private PhoneCallContent genAnsMissAndRelative(MatchRet matchRet, PhoneCallIntention phoneCallIntention, DeviceApp deviceApp) {
        String str;
        boolean z;
        if (DeviceConfig.useStrategy(ResponseStrategy.MISS_APPELLATION_STOP, deviceApp.getAppId())) {
            str = String.format("没有找到%s", phoneCallIntention.getName());
            matchRet.setAction(ActionType.STOP);
            z = false;
        } else {
            phoneCallIntention.getNickNameInfo().setNickName(phoneCallIntention.getName());
            phoneCallIntention.getNickNameInfo().setName(phoneCallIntention.getName());
            str = String.format("没有找到%s，请问你%s叫什么？", phoneCallIntention.getName(), phoneCallIntention.getName());
            matchRet.setAction(ActionType.EMPTY_STORE);
            z = true;
        }
        return new PhoneCallContent(str, str, new ArrayList(), z);
    }

    private PhoneCallContent genAnsNoTag(MatchRet matchRet, PhoneCallRequestEnv phoneCallRequestEnv, PhoneCallIntention phoneCallIntention) {
        String strMultiContacts;
        boolean z;
        boolean z2;
        if (matchRet.getContactRets().isEmpty()) {
            return new PhoneCallContent();
        }
        DeviceApp deviceApp = phoneCallRequestEnv.getDeviceApp();
        boolean zIsBlueTooth = phoneCallRequestEnv.isBlueTooth();
        boolean zIsVoiceWakeUp = phoneCallRequestEnv.isVoiceWakeUp();
        boolean zIsSelectDefaultCard = phoneCallRequestEnv.isSelectDefaultCard();
        ActionType actionType = ActionType.QUERY;
        HashSet hashSet = new HashSet();
        ContactRet contactRet = matchRet.getContactRets().get(0);
        if (matchRet.getContactRets().size() == 1) {
            List<PhoneItem> phoneItems = contactRet.getPhoneItems();
            if (phoneItems.size() > 1) {
                if (DeviceConfig.useStrategy(ResponseStrategy.MULTI_NUMBERS_STOP, deviceApp.getAppId())) {
                    strMultiContacts = String.format("%s有%d个号码，请检查通讯录", contactRet.getContact().getName(), Integer.valueOf(contactRet.getPhoneItems().size()));
                    actionType = ActionType.STOP;
                    z = false;
                    z2 = false;
                } else {
                    strMultiContacts = zIsBlueTooth ? ToSpeakUtils.singleContactMultiNumberToSpeak(contactRet) : (!zIsVoiceWakeUp || phoneItems.size() > 5) ? String.format("找到%s有%d个号码，请问拨打第几个？", contactRet.getContact().getName(), Integer.valueOf(contactRet.getPhoneItems().size())) : String.format("找到%s有%d个号码，%s，请问拨打第几个？", contactRet.getContact().getName(), Integer.valueOf(contactRet.getPhoneItems().size()), genNumberTTS(contactRet.getPhoneItems()));
                    z = true;
                    z2 = true;
                }
            } else if (matchRet.getMatchType() == MatchType.MATCH_CERTAIN || matchRet.getMatchType() == MatchType.MATCH_FUZZY) {
                if (zIsSelectDefaultCard || !CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
                    strMultiContacts = String.format("正在%s呼叫%s", ToSpeakUtils.handFreeToSpeak(phoneCallIntention), contactRet.getContact().getName());
                    z = false;
                    z2 = false;
                } else {
                    String str = String.format("为你找到%s的电话,请问你要用卡1还是卡2拨打?", contactRet.getContact().getName());
                    phoneCallIntention.setAddShowContacts(true);
                    phoneCallIntention.setCardType(CardType.SIM_CARD);
                    strMultiContacts = str;
                    z = true;
                    z2 = true;
                }
                actionType = ActionType.PLAY;
            } else {
                strMultiContacts = String.format("没有找到%s的电话，但找到一个%s的电话，是否拨打？", matchRet.getFixName(), contactRet.getContact().getName());
                z = true;
                z2 = false;
            }
        } else {
            Iterator<ContactRet> it = matchRet.getContactRets().iterator();
            while (it.hasNext()) {
                for (PhoneItem phoneItem : it.next().getPhoneItems()) {
                    if (!hashSet.contains(phoneItem.getNumber()) && !phoneItem.getNumber().equals("###")) {
                        hashSet.add(phoneItem.getNumber());
                    }
                }
            }
            if (hashSet.size() == 1) {
                if (matchRet.getMatchType() != MatchType.MATCH_CERTAIN) {
                    strMultiContacts = String.format("没有找到%s的电话，但找到一个%s的电话，是否拨打？", matchRet.getFixName(), contactRet.getContact().getName());
                    z = true;
                    z2 = false;
                } else if (zIsSelectDefaultCard || !CardType.DEFAULT.equals(phoneCallIntention.getCardType())) {
                    strMultiContacts = String.format("正在%s呼叫%s", ToSpeakUtils.handFreeToSpeak(phoneCallIntention), contactRet.getContact().getName());
                    actionType = ActionType.PLAY;
                    z = false;
                    z2 = false;
                } else {
                    String str2 = String.format("为你找到%s的电话,请问你要用卡1还是卡2拨打?", contactRet.getContact().getName());
                    phoneCallIntention.setAddShowContacts(true);
                    phoneCallIntention.setCardType(CardType.SIM_CARD);
                    strMultiContacts = str2;
                    z = true;
                    z2 = true;
                }
            } else if (DeviceConfig.useStrategy(ResponseStrategy.MULTI_CONTACTS_STOP, deviceApp.getAppId())) {
                actionType = ActionType.STOP;
                strMultiContacts = "找到多个相似联系人，建议修改联系人名称";
                z = false;
                z2 = false;
            } else {
                if (zIsBlueTooth) {
                    strMultiContacts = ToSpeakUtils.multiContacts(matchRet);
                } else if (zIsVoiceWakeUp && matchRet.getContactRets().size() <= 5 && multiContactsIsSingleNumber(matchRet.getContactRets()).booleanValue()) {
                    strMultiContacts = String.format("为你找到%d个联系人，%s，请问拨打第几个？", Integer.valueOf(matchRet.getContactRets().size()), genMultiContactsNumberTTS(matchRet.getContactRets()));
                } else {
                    if (matchRet.getMatchType() == MatchType.MATCH_CERTAIN) {
                        LOGGER.info("matchRet.getContactRets().size() > 1 && matchRet.getMatchType() == MatchType.MATCH_CERTAIN");
                    }
                    strMultiContacts = "找到多个相似联系人，你想拨打第几个？";
                }
                z = true;
                z2 = false;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (hashSet.size() == 1) {
            arrayList.add(contactRet.getContact().getPhoneItems().get(0));
        } else {
            Iterator<ContactRet> it2 = matchRet.getContactRets().iterator();
            while (it2.hasNext()) {
                for (PhoneItem phoneItem2 : it2.next().getPhoneItems()) {
                    arrayList.add(new PhoneItem(phoneItem2.getUserId(), phoneItem2.getName(), phoneItem2.getTag(), phoneItem2.getNumber(), z2));
                }
            }
        }
        matchRet.setAction(actionType);
        return new PhoneCallContent(strMultiContacts, strMultiContacts, arrayList, z);
    }

    private PhoneCallContent genAnsPickUp(MatchRet matchRet) {
        matchRet.setAction(ActionType.PICK_UP);
        return new PhoneCallContent("好的，已接听", "好的，已接听", new ArrayList(), false);
    }

    private PhoneCallContent genAnsPlayRecentAnsweredCalls(MatchRet matchRet, String str) {
        String str2 = String.format("正在为您%s拨出已接电话", str);
        matchRet.setAction(ActionType.PLAY_RECENT_ANSWERED_CALLS);
        return new PhoneCallContent(str2, str2, new ArrayList(), false);
    }

    private PhoneCallContent genAnsPlayRecentIncomingCalls(MatchRet matchRet, String str) {
        String str2 = String.format("正在为您%s拨出最近来电", str);
        matchRet.setAction(ActionType.PLAY_RECENT_INCOMING_CALLS);
        return new PhoneCallContent(str2, str2, new ArrayList(), false);
    }

    private PhoneCallContent genAnsPlayRecentMissedCalls(MatchRet matchRet, String str) {
        String str2 = String.format("正在为您%s拨出未接电话", str);
        matchRet.setAction(ActionType.PLAY_RECENT_MISSED_CALLS);
        return new PhoneCallContent(str2, str2, new ArrayList(), false);
    }

    private PhoneCallContent genAnsPlayRecentOutgoingCalls(MatchRet matchRet, String str) {
        String str2 = String.format("正在为您%s重拨已拨出电话", str);
        matchRet.setAction(ActionType.PLAY_RECENT_OUTGOING_CALLS);
        return new PhoneCallContent(str2, str2, new ArrayList(), false);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0124  */
    private PhoneCallContent genAnsShowContactNumber(MatchRet matchRet, DeviceApp deviceApp) {
        String str;
        ActionType actionType = ActionType.SHOW_CONTACT_NUMBER;
        if (matchRet.getContactRets().isEmpty()) {
            String str2 = String.format("没有找到%s的号码", matchRet.getFixName());
            matchRet.setAction(actionType);
            return new PhoneCallContent(str2, str2, new ArrayList(), false);
        }
        HashSet hashSet = new HashSet();
        ContactRet contactRet = matchRet.getContactRets().get(0);
        if (matchRet.getContactRets().size() != 1) {
            Iterator<ContactRet> it = matchRet.getContactRets().iterator();
            while (it.hasNext()) {
                for (PhoneItem phoneItem : it.next().getPhoneItems()) {
                    if (!hashSet.contains(phoneItem.getNumber()) && !phoneItem.getNumber().equals("###")) {
                        hashSet.add(phoneItem.getNumber());
                    }
                }
            }
            if (hashSet.size() == 1) {
                str = matchRet.getMatchType() == MatchType.MATCH_CERTAIN ? DeviceConfig.useStrategy(ResponseStrategy.HAS_SCREEN_DEVICE_SHOW_CONTACT_NUMBER, deviceApp.getAppId()) ? String.format("为你找到%s的电话号码", contactRet.getContact().getName()) : String.format("%s的号码是%s", contactRet.getContact().getName(), contactRet.getPhoneItems().get(0).getNumber()) : String.format("没有找到%s的电话", matchRet.getFixName());
            } else if (DeviceConfig.useStrategy(ResponseStrategy.HAS_SCREEN_DEVICE_SHOW_CONTACT_NUMBER, deviceApp.getAppId())) {
                str = "为你找到多个联系人";
            } else {
                actionType = ActionType.STOP;
                str = "找到多个相似联系人，建议修改联系人名称";
            }
        } else if (contactRet.getPhoneItems().size() > 1) {
            str = DeviceConfig.useStrategy(ResponseStrategy.HAS_SCREEN_DEVICE_SHOW_CONTACT_NUMBER, deviceApp.getAppId()) ? String.format("为你找到%s的电话号码", contactRet.getContact().getName()) : String.format("找到%s的%d个号码", contactRet.getContact().getName(), Integer.valueOf(contactRet.getPhoneItems().size()));
        } else if (contactRet.getPhoneItems().size() != 1) {
            str = "";
        } else if (matchRet.getMatchType() == MatchType.MATCH_CERTAIN || matchRet.getMatchType() == MatchType.MATCH_FUZZY) {
            str = DeviceConfig.useStrategy(ResponseStrategy.HAS_SCREEN_DEVICE_SHOW_CONTACT_NUMBER, deviceApp.getAppId()) ? String.format("为你找到%s的电话号码", contactRet.getContact().getName()) : String.format("%s的号码是%s", contactRet.getContact().getName(), contactRet.getPhoneItems().get(0).getNumber());
        } else if (matchRet.getMatchType() == MatchType.MATCH_UNIGRAM) {
            str = DeviceConfig.useStrategy(ResponseStrategy.HAS_SCREEN_DEVICE_SHOW_CONTACT_NUMBER, deviceApp.getAppId()) ? String.format("没有找到%s的电话, 但找到以下电话", matchRet.getFixName(), contactRet.getContact().getName()) : String.format("没有找到%s的电话", matchRet.getFixName());
        } else {
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        if (hashSet.size() == 1) {
            arrayList.add(contactRet.getContact().getPhoneItems().get(0));
        } else {
            Iterator<ContactRet> it2 = matchRet.getContactRets().iterator();
            while (it2.hasNext()) {
                for (PhoneItem phoneItem2 : it2.next().getPhoneItems()) {
                    arrayList.add(new PhoneItem(phoneItem2.getUserId(), phoneItem2.getName(), phoneItem2.getTag(), phoneItem2.getNumber(), false));
                }
            }
        }
        matchRet.setAction(actionType);
        return new PhoneCallContent(str, str, arrayList, false);
    }

    private PhoneCallContent genAnsStopStore(MatchRet matchRet, PhoneCallIntention phoneCallIntention) {
        String str = String.format("通讯录中没有%s，呼叫失败", phoneCallIntention.getNickNameInfo().getNickName());
        if (matchRet.getMatchType() == MatchType.MATCH_MISS || matchRet.getMatchType() == MatchType.MATCH_UNIGRAM) {
            str = String.format("通讯录中没有%s，呼叫失败", phoneCallIntention.getFixName());
        }
        matchRet.setAction(ActionType.STOP_STORE);
        return new PhoneCallContent(str, str, new ArrayList(), false);
    }

    private PhoneCallContent genAnsViewAllCalls(MatchRet matchRet) {
        matchRet.setAction(ActionType.VIEW_ALL_CALLS);
        return new PhoneCallContent("为您打开通话记录", "为您打开通话记录", new ArrayList(), false);
    }

    private PhoneCallContent genAnsViewMissedCalls(MatchRet matchRet) {
        matchRet.setAction(ActionType.VIEW_MISSED_CALLS);
        return new PhoneCallContent("为您打开未接来电", "为您打开未接来电", new ArrayList(), false);
    }

    private PhoneCallContent genAnsViewOutgoingCalls(MatchRet matchRet) {
        matchRet.setAction(ActionType.VIEW_OUTGOING_CALLS);
        return new PhoneCallContent("为您打开已拨出电话", "为您打开已拨出电话", new ArrayList(), false);
    }

    private String genMultiContactsNumberTTS(List<ContactRet> list) {
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator<ContactRet> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            PhoneItem phoneItem = it.next().getPhoneItems().get(0);
            String number = phoneItem.getNumber();
            int i2 = i + 1;
            if (i == 1) {
                str = "一";
            } else if (i == 2) {
                str = "二";
            } else if (i == 3) {
                str = "三";
            } else if (i != 4) {
                str = i != 5 ? "" : "五";
            } else {
                str = "四";
            }
            sb.append("第" + str + "个是");
            if (number.length() <= 6) {
                sb.append("号码" + number + "的" + phoneItem.getName() + ",");
            } else {
                sb.append("尾号" + number.substring(number.length() - 4) + "的" + phoneItem.getName() + ",");
            }
            i = i2;
        }
        String string = sb.toString();
        return string.substring(0, string.length() - 1);
    }

    private String genNumberTTS(List<PhoneItem> list) {
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator<PhoneItem> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            String number = it.next().getNumber();
            int i2 = i + 1;
            if (i == 1) {
                str = "一";
            } else if (i == 2) {
                str = "二";
            } else if (i == 3) {
                str = "三";
            } else if (i != 4) {
                str = i != 5 ? "" : "五";
            } else {
                str = "四";
            }
            sb.append("第" + str + "个");
            if (number.length() <= 6) {
                sb.append("号码" + number + ",");
            } else {
                sb.append("尾号" + number.substring(number.length() - 4) + ",");
            }
            i = i2;
        }
        String string = sb.toString();
        return string.substring(0, string.length() - 1);
    }

    private Boolean multiContactsIsSingleNumber(List<ContactRet> list) {
        Iterator<ContactRet> it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (it.next().getPhoneItems().size() != 1) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    public PhoneCallContent provide(PhoneCallIntention phoneCallIntention, MatchRet matchRet, PhoneCallRequestEnv phoneCallRequestEnv) {
        DeviceApp deviceApp = phoneCallRequestEnv.getDeviceApp();
        String strHandFreeToSpeak = ToSpeakUtils.handFreeToSpeak(phoneCallIntention);
        if (phoneCallIntention.getAction().equals(ActionType.PICK_UP.toString())) {
            return genAnsPickUp(matchRet);
        }
        if (phoneCallIntention.getAction().equals(ActionType.HANG_UP.toString())) {
            return genAnsHangUp(matchRet);
        }
        if (phoneCallIntention.getAction().equals(ActionType.VIEW_ALL_CALLS.toString())) {
            return genAnsViewAllCalls(matchRet);
        }
        if (phoneCallIntention.getAction().equals(ActionType.VIEW_OUTGOING_CALLS.toString())) {
            return genAnsViewOutgoingCalls(matchRet);
        }
        if (phoneCallIntention.getAction().equals(ActionType.VIEW_MISSED_CALLS.toString())) {
            return genAnsViewMissedCalls(matchRet);
        }
        if (phoneCallIntention.getAction().equals(ActionType.PLAY_RECENT_MISSED_CALLS.toString())) {
            return genAnsPlayRecentMissedCalls(matchRet, strHandFreeToSpeak);
        }
        if (phoneCallIntention.getAction().equals(ActionType.PLAY_RECENT_ANSWERED_CALLS.toString())) {
            return genAnsPlayRecentAnsweredCalls(matchRet, strHandFreeToSpeak);
        }
        if (phoneCallIntention.getAction().equals(ActionType.PLAY_RECENT_INCOMING_CALLS.toString())) {
            return genAnsPlayRecentIncomingCalls(matchRet, strHandFreeToSpeak);
        }
        if (phoneCallIntention.getAction().equals(ActionType.PLAY_RECENT_OUTGOING_CALLS.toString())) {
            return genAnsPlayRecentOutgoingCalls(matchRet, strHandFreeToSpeak);
        }
        if (phoneCallIntention.getAction().equals(ActionType.EMPTY.toString())) {
            return genAnsByEmpty(matchRet);
        }
        if (matchRet.getMatchType() == MatchType.MATCH_DIGIT && !phoneCallIntention.getAction().startsWith("MESSAGE")) {
            return genAnsByDigit(matchRet, phoneCallIntention, phoneCallRequestEnv);
        }
        String action = phoneCallIntention.getAction();
        ActionType actionType = ActionType.QUERY_STORE;
        if (action.equals(actionType.toString()) && (matchRet.getMatchType() == MatchType.MATCH_MISS || matchRet.getMatchType() == MatchType.MATCH_UNIGRAM || matchRet.getMatchType() == MatchType.MATCH_MODEL)) {
            return genAnsStopStore(matchRet, phoneCallIntention);
        }
        if (phoneCallIntention.getAction().equals(actionType.toString())) {
            return genAnsBrowseStore(matchRet, phoneCallIntention);
        }
        if (phoneCallIntention.getAction().equals(ActionType.SHOW_CONTACT_NUMBER.toString())) {
            return genAnsShowContactNumber(matchRet, deviceApp);
        }
        if (phoneCallIntention.getAction().equals(ActionType.MESSAGE_QUERY_TEXT.toString())) {
            return genAnsMessageQueryText(matchRet, phoneCallRequestEnv, phoneCallIntention);
        }
        if (phoneCallIntention.getAction().equals(ActionType.MESSAGE_WITHOUT_TEXT.toString())) {
            return genAnsMessageWithoutText(matchRet, phoneCallIntention);
        }
        if (!phoneCallIntention.getAction().equals(ActionType.MESSAGE_WITHOUT_CONTACT.toString()) && !phoneCallIntention.getAction().equals(ActionType.MESSAGE_EMPTY.toString())) {
            return genAnsByName(phoneCallIntention.getTag(), matchRet, phoneCallIntention, phoneCallRequestEnv);
        }
        return genAnsMessageWithoutContact(matchRet, phoneCallIntention);
    }
}
