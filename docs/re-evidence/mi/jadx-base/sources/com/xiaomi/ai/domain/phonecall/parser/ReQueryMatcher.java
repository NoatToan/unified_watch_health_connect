package com.xiaomi.ai.domain.phonecall.parser;

import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.CallMode;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallAnswer;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.SlotRet;
import com.xiaomi.ai.domain.phonecall.contact.PhoneItem;
import com.xiaomi.ai.domain.phonecall.contact.PhoneType;
import com.xiaomi.ai.domain.phonecall.util.IntentionUtils;
import com.xiaomi.ai.domain.phonecall.util.NameNormaliztion;
import com.xiaomi.ai.domain.phonecall.util.PhoneStringUtils;
import defpackage.klo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class ReQueryMatcher {
    public static final int MAX_ROUNDS = 3;
    private Pattern patTag;
    private static final Pattern PAT_FUNC_WORDS = Pattern.compile("(^(给我|我要|嗯|哦|啊|吧|吗|咯))|((这们|嗯|哦|啊|吧|吗|咯)$)");
    private static final Pattern PAT_YES = Pattern.compile("^(是的|是|好的|拨打|确认|是啊|好|可以|打|可以打|可以拨打|打呀|打吧)$");
    private static final Pattern PAT_NO = Pattern.compile("^(否|不要|不|取消拨打|取消|关闭|退出|不打|不要打|不拨打|不要拨打|不是|不用|不用了|算了|不想打|不想打了|不打了|没有|你猜|不知道|返回|退回)$");
    private static final Pattern PAT_LAST = Pattern.compile("^(?:打|拨打|打给|我打)?最后一个(?:号码)?$");
    private static final Pattern PAT_ORDER_A = Pattern.compile("^(?:打|拨打|打给|我打)?第([一二三四五六七八九1-9])个?(?:号码)?$");
    private static final Pattern PAT_ORDER_B = Pattern.compile("^(?:打|拨打|打给|我打)?第?([一二三四五六七八九1-9])个(?:号码)?$");
    private static final Pattern PAT_DIGIT = Pattern.compile("^[零一二三四五六七八九0-9]{3,}$");
    private static final Pattern PAT_BLACK = Pattern.compile("打开.*(微信|qq|支付宝)");
    private static final Pattern STORE_NO = Pattern.compile("^(否|不存了|不存|不记了|不了|不.*了|不记|不存储了|不存储|不记录了|不记录|不记住|不要记|不要存|不要|不|取消拨打|取消|关闭|退出|不打|不要打|不拨打|不要拨打|不是|不用|不用了|算了|不想打|不想打了|不打了|没有|你猜|不知道|返回|退回)$");
    private static final Pattern STORE_YES = Pattern.compile("^(要|存|是的|是|好的|拨打|确认|是啊|好|可以|打|可以打|可以拨打|打呀|打吧|记录|要记住|记住|记|G|存储|记吧|存吧|可以记|可以存)$");
    private static final Pattern STORE_ORDER_A = Pattern.compile("^(?:打|拨打|打给|我打|存|存储|我存|我要存|记录|记住|记|我要记|我想记|我要记录|我想记录)?第([一二三四五六七八九1-9])个?(?:号码)?$");
    private static final Pattern STORE_ORDER_B = Pattern.compile("^(?:打|拨打|打给|我打|存|存储|我存|我要存|记录|记住|记|我要记|我想记|我要记录|我想记录)?第?([一二三四五六七八九1-9])个(?:号码)?$");
    private static final Pattern STORE_LAST = Pattern.compile("^(?:打|拨打|打给|我打|存|存储|我存|我要存|记录|记住|记|我要记|我想记|我要记录|我想记录)?最后一个(?:号码)?$");
    private static final List<String> relativeActionTypeList = Arrays.asList(ActionType.EMPTY_STORE.toString(), ActionType.BROWSE_STORE.toString());
    private static final List<String> maxRoundContinueActionTypeList = Arrays.asList(ActionType.PLAY.toString(), ActionType.PLAY_STORE.toString(), ActionType.NOT_STORE.toString());

    public class a implements Comparator<String> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.length() != str2.length() ? str2.length() - str.length() : str.compareTo(str2);
        }
    }

    public ReQueryMatcher() {
        this.patTag = null;
        List<String> tags = PhoneType.getTags();
        Collections.sort(tags, new a());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(");
        for (int i = 0; i < tags.size(); i++) {
            if (i != 0) {
                stringBuffer.append("|");
            }
            stringBuffer.append(tags.get(i));
        }
        stringBuffer.append(")");
        this.patTag = Pattern.compile(stringBuffer.toString());
    }

    private Set<Integer> hitName(String str, List<PhoneItem> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (com.xiaomi.ai.nlp.contact.common.a.C0349a c0349a : com.xiaomi.ai.nlp.contact.common.a.b().e(str)) {
            hashSet.add(c0349a.c());
            hashSet2.add(c0349a.a());
        }
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            for (com.xiaomi.ai.nlp.contact.common.a.C0349a c0349a2 : com.xiaomi.ai.nlp.contact.common.a.b().e(list.get(i).getName())) {
                if (hashSet.contains(c0349a2.c())) {
                    hashSet3.add(Integer.valueOf(i));
                }
                if (hashSet2.contains(c0349a2.a())) {
                    hashSet4.add(Integer.valueOf(i));
                }
            }
        }
        return !hashSet3.isEmpty() ? hashSet3 : hashSet4;
    }

    private void matchNotRelativeQuery(int i, String str, PhoneCallIntention phoneCallIntention, PhoneCallIntention phoneCallIntention2, List<PhoneItem> list) {
        if (i != 0) {
            i = matchPatYes(str, phoneCallIntention, list);
        }
        if (i != 0) {
            i = matchPatNo(str, phoneCallIntention);
        }
        if (i != 0) {
            i = matchPatLast(str, phoneCallIntention, list);
        }
        if (i != 0) {
            i = matchPatOrder(str, phoneCallIntention, list);
        }
        if (i != 0) {
            i = matchPatDigit(str, phoneCallIntention, list);
        }
        if (i != 0) {
            matchTagName(str, phoneCallIntention, phoneCallIntention2, list);
        }
    }

    private int matchPatBlack(String str, PhoneCallIntention phoneCallIntention) {
        if (!PAT_BLACK.matcher(str).find()) {
            return 1;
        }
        phoneCallIntention.setScore(0.0d);
        return 0;
    }

    private void matchPatBrowseStoreNo(String str, PhoneCallIntention phoneCallIntention, PhoneCallIntention phoneCallIntention2) {
        if (phoneCallIntention2 != null && phoneCallIntention2.getAction().equals(ActionType.BROWSE_STORE.toString()) && STORE_NO.matcher(str).find()) {
            phoneCallIntention.setScore(1.0d);
            phoneCallIntention.setAction(ActionType.NOT_STORE.toString());
        }
    }

    private int matchPatBrowseStoreYes(String str, PhoneCallIntention phoneCallIntention, PhoneCallIntention phoneCallIntention2, List<PhoneItem> list) {
        if (phoneCallIntention2 != null) {
            String action = phoneCallIntention2.getAction();
            ActionType actionType = ActionType.BROWSE_STORE;
            if (action.equals(actionType.toString())) {
                phoneCallIntention.setAction(actionType.toString());
                if (STORE_YES.matcher(str).find()) {
                    phoneCallIntention.setScore(1.0d);
                    if (list.size() == 1) {
                        phoneCallIntention.setAction(ActionType.PLAY_STORE.toString());
                        phoneCallIntention.setPlayOrder(1);
                        phoneCallIntention.setTag(list.get(0).getTag());
                        phoneCallIntention.setFixName(list.get(0).getName());
                        phoneCallIntention.getNickNameInfo().setName(list.get(0).getName());
                        return 0;
                    }
                }
                if (STORE_LAST.matcher(str).find()) {
                    phoneCallIntention.setScore(1.0d);
                    if (!list.isEmpty()) {
                        phoneCallIntention.setAction(ActionType.PLAY_STORE.toString());
                        phoneCallIntention.setPlayOrder(list.size());
                        phoneCallIntention.setTag(list.get(list.size() - 1).getTag());
                        phoneCallIntention.setFixName(list.get(list.size() - 1).getName());
                        phoneCallIntention.getNickNameInfo().setName(list.get(list.size() - 1).getName());
                        return 0;
                    }
                }
                Matcher matcher = STORE_ORDER_A.matcher(str);
                if (!matcher.matches()) {
                    matcher = STORE_ORDER_B.matcher(str);
                }
                if (matcher.matches()) {
                    phoneCallIntention.setScore(1.0d);
                    String strNormZhPhoneNumberToArabic = PhoneStringUtils.normZhPhoneNumberToArabic(matcher.group(1));
                    int i = klo.c(strNormZhPhoneNumberToArabic) ? Integer.parseInt(strNormZhPhoneNumberToArabic) : -1;
                    if (!list.isEmpty() && i > 0 && i <= list.size()) {
                        phoneCallIntention.setAction(ActionType.PLAY_STORE.toString());
                        phoneCallIntention.setPlayOrder(i);
                        int i2 = i - 1;
                        phoneCallIntention.setTag(list.get(i2).getTag());
                        phoneCallIntention.setFixName(list.get(i2).getName());
                        phoneCallIntention.getNickNameInfo().setName(list.get(i2).getName());
                    }
                    return 0;
                }
            }
        }
        return 1;
    }

    private int matchPatDigit(String str, PhoneCallIntention phoneCallIntention, List<PhoneItem> list) {
        Matcher matcher = PAT_DIGIT.matcher(str);
        if (matcher.find()) {
            String strNormZhPhoneNumberToArabic = PhoneStringUtils.normZhPhoneNumberToArabic(matcher.group());
            for (int i = 0; i < list.size(); i++) {
                PhoneItem phoneItem = list.get(i);
                if (strNormZhPhoneNumberToArabic.endsWith(phoneItem.getNumber()) || phoneItem.getNumber().endsWith(strNormZhPhoneNumberToArabic)) {
                    phoneCallIntention.setAction(ActionType.PLAY.toString());
                    phoneCallIntention.setPlayOrder(i + 1);
                    phoneCallIntention.setTag(phoneItem.getTag());
                    phoneCallIntention.setFixName(phoneItem.getName());
                    break;
                }
            }
            if (phoneCallIntention.getAction().equals(ActionType.PLAY.toString())) {
                phoneCallIntention.setScore(1.0d);
                return 0;
            }
        }
        return 1;
    }

    private int matchPatEmptyStoreName(String str, PhoneCallIntention phoneCallIntention, PhoneCallIntention phoneCallIntention2) {
        if (phoneCallIntention2 == null || !phoneCallIntention2.getAction().equals(ActionType.EMPTY_STORE.toString())) {
            return 1;
        }
        phoneCallIntention.getNickNameInfo().setName(str);
        phoneCallIntention.setName(str);
        phoneCallIntention.setFixName(str);
        phoneCallIntention.addSlotRet(new SlotRet(str, "", "", Boolean.FALSE));
        phoneCallIntention.setAction(ActionType.QUERY_STORE.toString());
        phoneCallIntention.setScore(0.99d);
        return 1;
    }

    private int matchPatEmptyStoreNo(String str, PhoneCallIntention phoneCallIntention, PhoneCallIntention phoneCallIntention2) {
        if (phoneCallIntention2 == null || !phoneCallIntention2.getAction().equals(ActionType.EMPTY_STORE.toString())) {
            return 1;
        }
        phoneCallIntention.setAction(ActionType.QUERY_STORE.toString());
        if (!STORE_NO.matcher(str).find()) {
            return 1;
        }
        phoneCallIntention.setScore(1.0d);
        phoneCallIntention.setAction(ActionType.STOP_STORE.toString());
        return 0;
    }

    private int matchPatLast(String str, PhoneCallIntention phoneCallIntention, List<PhoneItem> list) {
        if (!PAT_LAST.matcher(str).find()) {
            return 1;
        }
        phoneCallIntention.setScore(1.0d);
        if (list.isEmpty()) {
            return 0;
        }
        phoneCallIntention.setAction(ActionType.PLAY.toString());
        phoneCallIntention.setPlayOrder(list.size());
        phoneCallIntention.setSelectPlayOrder(true);
        phoneCallIntention.setTag(list.get(list.size() - 1).getTag());
        phoneCallIntention.setFixName(list.get(list.size() - 1).getName());
        return 0;
    }

    private int matchPatNo(String str, PhoneCallIntention phoneCallIntention) {
        if (!PAT_NO.matcher(str).find()) {
            return 1;
        }
        phoneCallIntention.setScore(1.0d);
        phoneCallIntention.setAction(ActionType.STOP.toString());
        phoneCallIntention.setPlayOrder(0);
        return 0;
    }

    private int matchPatOrder(String str, PhoneCallIntention phoneCallIntention, List<PhoneItem> list) {
        Matcher matcher = PAT_ORDER_A.matcher(str);
        if (!matcher.matches()) {
            matcher = PAT_ORDER_B.matcher(str);
        }
        if (!matcher.matches()) {
            return 1;
        }
        phoneCallIntention.setScore(1.0d);
        String strNormZhPhoneNumberToArabic = PhoneStringUtils.normZhPhoneNumberToArabic(matcher.group(1));
        int i = klo.c(strNormZhPhoneNumberToArabic) ? Integer.parseInt(strNormZhPhoneNumberToArabic) : -1;
        if (list.isEmpty() || i <= 0 || i > list.size()) {
            return 0;
        }
        phoneCallIntention.setAction(ActionType.PLAY.toString());
        phoneCallIntention.setPlayOrder(i);
        phoneCallIntention.setSelectPlayOrder(true);
        int i2 = i - 1;
        phoneCallIntention.setTag(list.get(i2).getTag());
        phoneCallIntention.setFixName(list.get(i2).getName());
        return 0;
    }

    private int matchPatYes(String str, PhoneCallIntention phoneCallIntention, List<PhoneItem> list) {
        if (!PAT_YES.matcher(str).find()) {
            return 1;
        }
        phoneCallIntention.setScore(1.0d);
        if (list.size() == 1) {
            phoneCallIntention.setAction(ActionType.PLAY.toString());
            phoneCallIntention.setPlayOrder(1);
            phoneCallIntention.setTag(list.get(0).getTag());
            phoneCallIntention.setFixName(list.get(0).getName());
        }
        return 0;
    }

    private void matchRelativeQuery(int i, String str, PhoneCallIntention phoneCallIntention, PhoneCallIntention phoneCallIntention2, List<PhoneItem> list) {
        if (i != 0) {
            i = matchPatEmptyStoreNo(str, phoneCallIntention, phoneCallIntention2);
        }
        if (i != 0) {
            i = matchPatEmptyStoreName(str, phoneCallIntention, phoneCallIntention2);
        }
        if (i != 0) {
            i = matchPatBrowseStoreYes(str, phoneCallIntention, phoneCallIntention2, list);
        }
        if (i != 0) {
            matchPatBrowseStoreNo(str, phoneCallIntention, phoneCallIntention2);
        }
    }

    private void matchTagName(String str, PhoneCallIntention phoneCallIntention, PhoneCallIntention phoneCallIntention2, List<PhoneItem> list) {
        String strSubstring;
        String strSubstring2;
        String strGroup;
        Matcher matcher = this.patTag.matcher(str);
        String strSubstring3 = "";
        if (matcher.find()) {
            strGroup = matcher.group();
            if (str.substring(0, matcher.start()).isEmpty()) {
                strSubstring = str.substring(matcher.end());
                strSubstring2 = str.substring(0, matcher.end());
            } else {
                strSubstring = str.substring(0, matcher.start());
                strSubstring3 = str.substring(matcher.start());
                strSubstring2 = "";
            }
        } else {
            strSubstring = str;
            strSubstring2 = "";
            strGroup = strSubstring2;
        }
        if (strSubstring.endsWith("的")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            strSubstring3 = "的" + strSubstring3;
        }
        if (!strGroup.isEmpty() && strSubstring.isEmpty()) {
            phoneCallIntention.setScore(1.0d);
        } else if (strSubstring.length() == 2) {
            if (NameNormaliztion.getInstance().containSurName(strSubstring.substring(0, 1)).booleanValue()) {
                phoneCallIntention.setScore(0.99d);
            }
        } else if (strSubstring.length() == 3) {
            if (NameNormaliztion.getInstance().containSurName(strSubstring.substring(0, 1)).booleanValue() || NameNormaliztion.getInstance().containSurName(strSubstring.substring(0, 2)).booleanValue()) {
                phoneCallIntention.setScore(0.99d);
            }
        } else if (strSubstring.length() == 4 && NameNormaliztion.getInstance().containSurName(strSubstring.substring(0, 2)).booleanValue()) {
            phoneCallIntention.setScore(0.99d);
        }
        if (!strGroup.isEmpty()) {
            phoneCallIntention.setTag(strGroup);
        }
        if (phoneCallIntention2 != null && phoneCallIntention2.getAction().equals(ActionType.EMPTY.toString())) {
            phoneCallIntention.setName(strSubstring);
            phoneCallIntention.addSlotRet(new SlotRet(strSubstring, strSubstring2, strSubstring3, Boolean.FALSE));
            phoneCallIntention.setAction(ActionType.QUERY.toString());
            phoneCallIntention.setScore(0.99d);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!strGroup.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (PhoneType.isEqual(strGroup, list.get(i).getTag())) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (!strSubstring.isEmpty()) {
            arrayList2 = new ArrayList(hitName(strSubstring, list));
        }
        int iIntValue = -1;
        if (!strGroup.isEmpty() && !strSubstring.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.retainAll(arrayList);
            if (arrayList3.size() == 1) {
                iIntValue = ((Integer) arrayList3.get(0)).intValue();
            }
        } else if (strGroup.isEmpty()) {
            if (!strSubstring.isEmpty() && arrayList2.size() == 1) {
                iIntValue = ((Integer) arrayList2.get(0)).intValue();
            }
        } else if (arrayList.size() == 1) {
            iIntValue = ((Integer) arrayList.get(0)).intValue();
        }
        if (iIntValue >= 0) {
            phoneCallIntention.setAction(ActionType.PLAY.toString());
            phoneCallIntention.setPlayOrder(iIntValue + 1);
            phoneCallIntention.setTag(list.get(iIntValue).getTag());
            phoneCallIntention.setFixName(list.get(iIntValue).getName());
            phoneCallIntention.setScore(1.0d);
        }
    }

    private String trimFunc(String str) {
        Matcher matcher = PAT_FUNC_WORDS.matcher(str);
        while (matcher.find()) {
            str = str.substring(0, matcher.start()) + str.substring(matcher.end());
            matcher = PAT_FUNC_WORDS.matcher(str);
        }
        return str;
    }

    public PhoneCallIntention parse(String str, PhoneCallAnswer phoneCallAnswer, boolean z) {
        PhoneCallIntention intention = phoneCallAnswer.getIntention();
        List<PhoneItem> arrayList = (phoneCallAnswer.getContent() == null || phoneCallAnswer.getContent().getPhoneList() == null) ? new ArrayList<>() : phoneCallAnswer.getContent().getPhoneList();
        String strTrimFunc = trimFunc(str.replaceAll("\\p{P}|\\p{S}", ""));
        PhoneCallIntention phoneCallIntention = new PhoneCallIntention();
        phoneCallIntention.setQuery(str);
        phoneCallIntention.setRequery(true);
        phoneCallIntention.setScore(0.6d);
        phoneCallIntention.setAction(ActionType.BROWSE.toString());
        phoneCallIntention.setPlayOrder(0);
        if (intention != null) {
            phoneCallIntention.setNickNameInfo(intention.getNickNameInfo());
            phoneCallIntention.setName(intention.getName());
            phoneCallIntention.setFixName(intention.getFixName());
            phoneCallIntention.setTag(intention.getTag());
            phoneCallIntention.setNormTag(intention.getNormTag());
            phoneCallIntention.setCardType(intention.getCardType());
            phoneCallIntention.setSlotRets(intention.getSlotRets());
        }
        CallMode callMode = intention.getCallMode();
        CallMode callMode2 = CallMode.HAND_FREE;
        if (callMode == callMode2) {
            phoneCallIntention.setCallMode(callMode2);
        }
        int iMatchPatBlack = matchPatBlack(strTrimFunc, phoneCallIntention);
        if (iMatchPatBlack != 0) {
            if (relativeActionTypeList.contains(intention.getAction())) {
                matchRelativeQuery(iMatchPatBlack, strTrimFunc, phoneCallIntention, intention, arrayList);
            } else {
                matchNotRelativeQuery(iMatchPatBlack, strTrimFunc, phoneCallIntention, intention, arrayList);
            }
        }
        if (intention.getProcessingRound() >= 3) {
            phoneCallIntention.setScore(0.0d);
        } else if (intention.getProcessingRound() + 1 >= 3 && !arrayList.isEmpty() && !maxRoundContinueActionTypeList.contains(phoneCallIntention.getAction())) {
            phoneCallIntention.setScore(0.0d);
        }
        phoneCallIntention.setDialogStatus(IntentionUtils.updateDialogStatusInParser(phoneCallIntention, intention));
        return phoneCallIntention;
    }
}
