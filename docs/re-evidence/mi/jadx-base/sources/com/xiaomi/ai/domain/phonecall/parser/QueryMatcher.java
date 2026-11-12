package com.xiaomi.ai.domain.phonecall.parser;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.typesafe.config.a;
import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.CallMode;
import com.xiaomi.ai.domain.phonecall.common.CardType;
import com.xiaomi.ai.domain.phonecall.common.DeviceApp;
import com.xiaomi.ai.domain.phonecall.common.DeviceConfig;
import com.xiaomi.ai.domain.phonecall.common.Function;
import com.xiaomi.ai.domain.phonecall.common.MatchType;
import com.xiaomi.ai.domain.phonecall.common.NameType;
import com.xiaomi.ai.domain.phonecall.common.ObjectDeviceType;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.SlotRet;
import com.xiaomi.ai.domain.phonecall.contact.PhoneType;
import com.xiaomi.ai.domain.phonecall.util.DigitQc;
import com.xiaomi.ai.domain.phonecall.util.IntentMappingConfig;
import com.xiaomi.ai.domain.phonecall.util.IntentionUtils;
import com.xiaomi.ai.nlp.lattice.entity.EntityType;
import com.xiaomi.ai.nlp.lattice.rule.RuleApplyPhase;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.aqe;
import defpackage.brk;
import defpackage.j2n;
import defpackage.nb4;
import defpackage.nip;
import defpackage.ovg;
import defpackage.qpe;
import defpackage.t08;
import defpackage.vwp;
import defpackage.xb8;
import defpackage.y2e;
import defpackage.z2e;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class QueryMatcher {
    private static final String ANSWER_CALL = "com.xiaomi.ai.domain.phoneCall.answer_call.pattern";
    public static final String BLACKLIST_PATH = "phonecall-blacklist.conf";
    private static final String BLK_PATTERN_PATH = "com.xiaomi.ai.domain.phoneCall.blacklist.pattern";
    private static final String CALL_APP = "com.xiaomi.ai.domain.phoneCall.call_app.pattern";
    private static final String HAND_FREE = ".*((免提|扬声器|外放)).*";
    private static final String HANG_UP_CALL = "com.xiaomi.ai.domain.phoneCall.hang_up_call.pattern";
    public static final String INTENTLIST_PATH = "phonecall-intent-list.conf";
    private static final String INTENT_FILTER_PATH = "com.xiaomi.ai.domain.phoneCall.intent_filter_list.pattern";
    private static final String PLAY_RECENT_ANSWERED_PATH = "com.xiaomi.ai.domain.phoneCall.play_recent_answered.pattern";
    private static final String PLAY_RECENT_INCOMING_PATH = "com.xiaomi.ai.domain.phoneCall.play_recent_incoming.pattern";
    private static final String PLAY_RECENT_MISSED_PATH = "com.xiaomi.ai.domain.phoneCall.play_recent_missed.pattern";
    private static final String PLAY_RECENT_OUTGOING_PATH = "com.xiaomi.ai.domain.phoneCall.play_recent_outgoing.pattern";
    private static final String QC_INTENT_FILTER_PATH = "com.xiaomi.ai.domain.phoneCall.qc_intent_filter_list.pattern";
    public static final String RESOURCE_PATH = "phoneCall.entities";
    private static final String RULE_PATH = "com.xiaomi.ai.domain.phoneCall.lattice.rule";
    private static final String SHOW_CONTACT_NUMBER_PATH = "com.xiaomi.ai.domain.phoneCall.show_contact_number.pattern";
    private static final String TRANS_CALL_TO_SEARCH_NUM = "com.xiaomi.ai.domain.phoneCall.trans_call_to_search_num.pattern";
    private static final String UNDER_RECALL = "com.xiaomi.ai.domain.phoneCall.under_recall.pattern";
    private static final String VIDEO_CALL = "com.xiaomi.ai.domain.phoneCall.video_call.pattern";
    private static final String VOICE_CALL = "com.xiaomi.ai.domain.phoneCall.voice_call.pattern";
    private static final String YELLOWPAGE_CALL = "com.xiaomi.ai.domain.phoneCall.yellowpage_call.pattern";
    private static final String YELLOW_PAGE_SLOT = "yp";
    private vwp afterDecodeTransducer;
    private List<Pattern> answerCall;
    private vwp beforeDecodeTransducer;
    private List<Pattern> blkPatterns;
    private List<Pattern> callAppPatterns;
    private CrfLatticeTool crfTool;
    private vwp finalTransducer;
    private List<Pattern> hangUpCall;
    private List<Pattern> intentPatterns;
    private List<Pattern> intentQcPatterns;
    private List<Pattern> playRecentAnsweredPatterns;
    private List<Pattern> playRecentIncomingPatterns;
    private List<Pattern> playRecentMissedPatterns;
    private List<Pattern> playRecentOutgoingPatterns;
    private QcEntityGenerator qcEntityGenerator;
    private List<Pattern> showContactNumberPatterns;
    private List<Pattern> transCallToSearchNum;
    private List<Pattern> underRecall;
    private List<Pattern> videoCallPatterns;
    private List<Pattern> voiceCallPatterns;
    private List<Pattern> yellowPageCall;
    private static final Pattern EXLUDE_NUMBER_PAT = Pattern.compile("[\\d零一二三四五六七八九十壹贰叁肆伍陆柒捌玖拾]+");
    private static final Pattern DIGIT_NUMBER_PAT = Pattern.compile("[零一二三四五六七八九0-9]{3,}");
    private static final Pattern LONG_DIGIT_NUMBER_PAT = Pattern.compile("[零一二三四五六七八九0-9]{5,}");
    private static final Pattern LONG_CHN_NUMBER_PAT = Pattern.compile("[零一二三四五六七八九]{5,}");
    private static final Pattern PURE_DIGIT_NUMBER_PAT = Pattern.compile("[0-9]{3,}");
    private static final qpe LOGGER = aqe.f(QueryMatcher.class);
    private static Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
    private static final List<String> BEGIN_FUNC_WORD_LIST = Arrays.asList("联系人", "我的", "我");
    private static final List<String> END_FUNC_WORD_LIST = Arrays.asList("电话", "电话号码");
    private static final List<String> BLACK_WORD_LIST = Arrays.asList("我手机", "我的手机");
    private static final List<String> SPECIAL_TAG_LIST = Arrays.asList("家", "家里", "住宅", "家庭", "住址", "单位", "公司");
    private static IntentRuleMatcher ruleMatcher = IntentRuleMatcher.getInstance();
    private brk resourceLoader = new brk(t08.a(RESOURCE_PATH));
    private LanguageModel languageModel = new LanguageModel(getClass().getResourceAsStream("/lm-dict.dic"), getClass().getResourceAsStream("/lm-prop.dic"));

    public QueryMatcher() throws Exception {
        CrfLatticeTool crfLatticeTool = new CrfLatticeTool();
        this.crfTool = crfLatticeTool;
        crfLatticeTool.loadModel(t08.a("phone.crf.txt.sparse"));
        this.beforeDecodeTransducer = new vwp();
        this.beforeDecodeTransducer.c(a.i(new InputStreamReader(t08.a("rules/transform.conf"))), RULE_PATH, this.resourceLoader);
        this.beforeDecodeTransducer.c(a.i(new InputStreamReader(t08.a("rules/norm.conf"))), RULE_PATH, this.resourceLoader);
        this.afterDecodeTransducer = new vwp();
        this.afterDecodeTransducer.c(a.i(new InputStreamReader(t08.a("rules/priority.conf"))), RULE_PATH, this.resourceLoader);
        this.finalTransducer = new vwp();
        this.finalTransducer.c(a.i(new InputStreamReader(t08.a("rules/action.conf"))), RULE_PATH, this.resourceLoader);
        this.qcEntityGenerator = new QcEntityGenerator(this.resourceLoader);
        this.blkPatterns = new ArrayList();
        InputStreamReader inputStreamReader = new InputStreamReader(t08.a(BLACKLIST_PATH));
        Iterator<String> it = a.i(inputStreamReader).f(BLK_PATTERN_PATH).iterator();
        while (it.hasNext()) {
            this.blkPatterns.add(Pattern.compile(it.next()));
        }
        inputStreamReader.close();
        InputStreamReader inputStreamReader2 = new InputStreamReader(t08.a(INTENTLIST_PATH));
        nb4 nb4VarI = a.i(inputStreamReader2);
        this.intentPatterns = new ArrayList();
        Iterator<String> it2 = nb4VarI.f(INTENT_FILTER_PATH).iterator();
        while (it2.hasNext()) {
            this.intentPatterns.add(Pattern.compile(it2.next()));
        }
        this.intentQcPatterns = new ArrayList();
        Iterator<String> it3 = nb4VarI.f(QC_INTENT_FILTER_PATH).iterator();
        while (it3.hasNext()) {
            this.intentQcPatterns.add(Pattern.compile(it3.next()));
        }
        this.playRecentOutgoingPatterns = new ArrayList();
        Iterator<String> it4 = nb4VarI.f(PLAY_RECENT_OUTGOING_PATH).iterator();
        while (it4.hasNext()) {
            this.playRecentOutgoingPatterns.add(Pattern.compile(it4.next()));
        }
        this.playRecentMissedPatterns = new ArrayList();
        Iterator<String> it5 = nb4VarI.f(PLAY_RECENT_MISSED_PATH).iterator();
        while (it5.hasNext()) {
            this.playRecentMissedPatterns.add(Pattern.compile(it5.next()));
        }
        this.playRecentAnsweredPatterns = new ArrayList();
        Iterator<String> it6 = nb4VarI.f(PLAY_RECENT_ANSWERED_PATH).iterator();
        while (it6.hasNext()) {
            this.playRecentAnsweredPatterns.add(Pattern.compile(it6.next()));
        }
        this.playRecentIncomingPatterns = new ArrayList();
        Iterator<String> it7 = nb4VarI.f(PLAY_RECENT_INCOMING_PATH).iterator();
        while (it7.hasNext()) {
            this.playRecentIncomingPatterns.add(Pattern.compile(it7.next()));
        }
        this.showContactNumberPatterns = new ArrayList();
        Iterator<String> it8 = nb4VarI.f(SHOW_CONTACT_NUMBER_PATH).iterator();
        while (it8.hasNext()) {
            this.showContactNumberPatterns.add(Pattern.compile(it8.next()));
        }
        this.videoCallPatterns = new ArrayList();
        Iterator<String> it9 = nb4VarI.f(VIDEO_CALL).iterator();
        while (it9.hasNext()) {
            this.videoCallPatterns.add(Pattern.compile(it9.next()));
        }
        this.voiceCallPatterns = new ArrayList();
        Iterator<String> it10 = nb4VarI.f(VOICE_CALL).iterator();
        while (it10.hasNext()) {
            this.voiceCallPatterns.add(Pattern.compile(it10.next()));
        }
        this.callAppPatterns = new ArrayList();
        Iterator<String> it11 = nb4VarI.f(CALL_APP).iterator();
        while (it11.hasNext()) {
            this.callAppPatterns.add(Pattern.compile(it11.next()));
        }
        this.answerCall = new ArrayList();
        Iterator<String> it12 = nb4VarI.f(ANSWER_CALL).iterator();
        while (it12.hasNext()) {
            this.answerCall.add(Pattern.compile(it12.next()));
        }
        this.hangUpCall = new ArrayList();
        Iterator<String> it13 = nb4VarI.f(HANG_UP_CALL).iterator();
        while (it13.hasNext()) {
            this.hangUpCall.add(Pattern.compile(it13.next()));
        }
        this.transCallToSearchNum = new ArrayList();
        Iterator<String> it14 = nb4VarI.f(TRANS_CALL_TO_SEARCH_NUM).iterator();
        while (it14.hasNext()) {
            this.transCallToSearchNum.add(Pattern.compile(it14.next()));
        }
        this.yellowPageCall = new ArrayList();
        Iterator<String> it15 = nb4VarI.f(YELLOWPAGE_CALL).iterator();
        while (it15.hasNext()) {
            this.yellowPageCall.add(Pattern.compile(it15.next()));
        }
        this.underRecall = new ArrayList();
        Iterator<String> it16 = nb4VarI.f(UNDER_RECALL).iterator();
        while (it16.hasNext()) {
            this.underRecall.add(Pattern.compile(it16.next()));
        }
        inputStreamReader2.close();
    }

    private void convertLongNumberToName(y2e y2eVar) {
        for (ovg ovgVarE = y2eVar.l().e(); ovgVarE != null; ovgVarE = ovgVarE.e()) {
            xb8 xb8VarI = ovgVarE.i();
            if (xb8VarI.f().equals(RealNameWebViewActivity.NUMBER) && LONG_DIGIT_NUMBER_PAT.matcher(xb8VarI.g()).matches()) {
                xb8VarI.j("name");
            }
        }
    }

    private void extractName(PhoneCallIntention phoneCallIntention, SlotRet slotRet) {
        if (isSlotMatchBlackWord(slotRet, phoneCallIntention)) {
            return;
        }
        String slot = slotRet.getSlot();
        String prefix = slotRet.getPrefix();
        String suffix = slotRet.getSuffix();
        String str = "";
        for (String str2 : PhoneType.getTags()) {
            if (isSlotEqualTag(slot, phoneCallIntention, str2)) {
                return;
            }
            if (slot.contains(str2) && str2.length() > str.length()) {
                str = str2;
            }
        }
        slotRet.setSlot(slot);
        slotRet.setPrefix(prefix);
        slotRet.setSuffix(suffix);
        trimFuncWord(slotRet);
        if (slotRet.getSlot().isEmpty()) {
            setEmptyAction(phoneCallIntention);
            return;
        }
        phoneCallIntention.addSlotRet(slotRet);
        phoneCallIntention.setName(slotRet.getSlot());
        phoneCallIntention.setFixName(slotRet.getSlot());
        if (NameType.RELATIVE.equals(slotRet.getNameType())) {
            phoneCallIntention.getNickNameInfo().setNickName(slotRet.getSlot());
        }
        phoneCallIntention.setScore(1.0d);
    }

    private void factoidDigitNumber(y2e y2eVar, String str, Boolean bool) {
        if (bool.booleanValue()) {
            str = DigitQc.getQc(str);
        }
        Matcher matcher = DIGIT_NUMBER_PAT.matcher(str);
        while (matcher.find()) {
            y2eVar.d(new xb8(matcher.start(), matcher.end(), matcher.group(), matcher.group(), RealNameWebViewActivity.NUMBER, matcher.group(), EntityType.FACTOID_PARSED_ENTITY));
        }
    }

    private List<String> fixTokens(List<String> list, Set<String> set) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (!next.isEmpty()) {
                if (set.contains(next) || next.length() == 1) {
                    arrayList.add(next);
                } else {
                    String strSubstring = next.substring(0, 1);
                    if (set.contains(strSubstring)) {
                        arrayList.add(strSubstring);
                        next = next.substring(1);
                    }
                    if (next.length() == 1) {
                        arrayList.add(next);
                    } else if (set.contains(next.substring(next.length() - 1))) {
                        arrayList.add(next.substring(0, next.length() - 1));
                        arrayList.add(next.substring(next.length() - 1));
                    } else {
                        arrayList.add(next);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (i < arrayList.size()) {
            String str = (String) arrayList.get(i);
            String str2 = (String) arrayList.get(i);
            int i3 = i + 1;
            String str3 = str2;
            while (true) {
                i2 = i3;
                do {
                    if (i3 >= arrayList.size() || str.length() >= 8) {
                        break;
                    }
                    str = str + ((String) arrayList.get(i3));
                    i3++;
                } while (!set.contains(str));
                str3 = str;
            }
            arrayList2.add(str3);
            i = i2;
        }
        return arrayList2;
    }

    private String generalPatternMapping(Map<String, IntentMappingConfig.RewriteInfo> map, String str) {
        for (Map.Entry<String, IntentMappingConfig.RewriteInfo> entry : map.entrySet()) {
            Matcher matcher = Pattern.compile(entry.getKey()).matcher(str);
            if (matcher.find()) {
                IntentMappingConfig.RewriteInfo value = entry.getValue();
                int i = value.groupNumber;
                String str2 = value.rewriteQuery;
                if (i < 0) {
                    return str2;
                }
                String strGroup = matcher.group(i);
                if (!strGroup.isEmpty() && strGroup.length() > 1) {
                    return str2.replace(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, matcher.group(i));
                }
            }
        }
        return str;
    }

    private String generalUnderRecallMapping(Map<String, IntentMappingConfig.RewriteInfo> map, String str) {
        for (Map.Entry<String, IntentMappingConfig.RewriteInfo> entry : map.entrySet()) {
            Matcher matcher = Pattern.compile(entry.getKey()).matcher(str);
            if (matcher.find()) {
                IntentMappingConfig.RewriteInfo value = entry.getValue();
                int i = value.groupNumber;
                String str2 = value.rewriteQuery;
                if (i < 0) {
                    return str2;
                }
                String strGroup = matcher.group(i);
                if (!strGroup.isEmpty() && strGroup.length() > 1 && strGroup.length() < 4 && !EXLUDE_NUMBER_PAT.matcher(strGroup).find()) {
                    return str2.replace(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, matcher.group(i));
                }
            }
        }
        return str;
    }

    private boolean hasLongNumber(y2e y2eVar) {
        for (ovg ovgVarE = y2eVar.l().e(); ovgVarE != null; ovgVarE = ovgVarE.e()) {
            xb8 xb8VarI = ovgVarE.i();
            if (xb8VarI.f().equals(RealNameWebViewActivity.NUMBER) && LONG_DIGIT_NUMBER_PAT.matcher(xb8VarI.g()).matches()) {
                return true;
            }
        }
        return false;
    }

    private boolean isMatchBlk(String str) {
        Iterator<Pattern> it = this.blkPatterns.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    private boolean isPhoneIntent(String str, boolean z) {
        List<Pattern> list = this.intentPatterns;
        if (z) {
            list = this.intentQcPatterns;
        }
        Iterator<Pattern> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    private boolean isSlotEqualTag(String str, PhoneCallIntention phoneCallIntention, String str2) {
        if (SPECIAL_TAG_LIST.contains(str2) || !str.equals(str2)) {
            return false;
        }
        setQueryAction(phoneCallIntention);
        phoneCallIntention.setTag(str2);
        return true;
    }

    private boolean isSlotMatchBlackWord(SlotRet slotRet, PhoneCallIntention phoneCallIntention) {
        Iterator<String> it = BLACK_WORD_LIST.iterator();
        while (it.hasNext()) {
            if (slotRet.getSlot().equals(it.next())) {
                setQueryAction(phoneCallIntention);
                return true;
            }
        }
        return false;
    }

    private boolean matchPattern(List<Pattern> list, String str) {
        Iterator<Pattern> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    private void mergeQcIntention(PhoneCallIntention phoneCallIntention, PhoneCallIntention phoneCallIntention2) {
        if (phoneCallIntention2.getScore() < 0.5d) {
            return;
        }
        if (phoneCallIntention2.getScore() > phoneCallIntention.getScore()) {
            phoneCallIntention.setScore(phoneCallIntention2.getScore());
        }
        if (phoneCallIntention2.getSlotRets().isEmpty()) {
            return;
        }
        if (phoneCallIntention.getSlotRets().isEmpty()) {
            SlotRet slotRet = phoneCallIntention2.getSlotRets().get(0);
            phoneCallIntention.addSlotRet(slotRet);
            phoneCallIntention.setName(slotRet.getSlot());
            phoneCallIntention.setFixName(slotRet.getSlot());
        } else if (!phoneCallIntention.getSlotRets().get(0).getSlot().equals(phoneCallIntention2.getSlotRets().get(0).getSlot())) {
            SlotRet slotRet2 = phoneCallIntention.getSlotRets().get(0);
            SlotRet slotRet3 = phoneCallIntention2.getSlotRets().get(0);
            Pattern pattern = DIGIT_NUMBER_PAT;
            if (pattern.matcher(slotRet3.getSlot()).matches() || pattern.matcher(slotRet2.getSlot()).matches()) {
                if (slotRet3.getSlot().length() > slotRet2.getSlot().length()) {
                    phoneCallIntention.getSlotRets().clear();
                    phoneCallIntention.getSlotRets().add(slotRet3);
                    phoneCallIntention.setName(slotRet3.getSlot());
                    phoneCallIntention.setFixName(slotRet3.getSlot());
                }
            } else if (slotRet3.getSlot().length() != slotRet2.getSlot().length()) {
                phoneCallIntention.getSlotRets().add(slotRet3);
                phoneCallIntention.setFixName(slotRet3.getSlot());
            } else {
                phoneCallIntention.getSlotRets().add(slotRet3);
            }
        }
        List<SlotRet> slotRets = phoneCallIntention.getSlotRets();
        StringBuilder sb = new StringBuilder();
        for (SlotRet slotRet4 : slotRets) {
            if (sb.length() == 0) {
                sb.append(slotRet4.getSlot());
            } else {
                sb.append("|");
                sb.append(slotRet4.getSlot());
            }
        }
        phoneCallIntention.setName(sb.toString());
    }

    private String queryAdapt(DeviceApp deviceApp, String str, PhoneCallIntention phoneCallIntention) {
        String appId = deviceApp.getAppId();
        Function function = Function.SEARCH_CONTACT_NUMBER;
        String strGeneralPatternMapping = (DeviceConfig.supportFunction(appId, function) && matchPattern(this.showContactNumberPatterns, str)) ? generalPatternMapping(IntentMappingConfig.getInstance().getShowContactNumberPatternMap(), str) : str;
        if (DeviceConfig.supportFunction(deviceApp.getAppId(), function) && matchPattern(this.transCallToSearchNum, str)) {
            strGeneralPatternMapping = generalPatternMapping(IntentMappingConfig.getInstance().getTransCallToShowContactNumberMap(), strGeneralPatternMapping);
        }
        if (DeviceConfig.supportFunction(deviceApp.getAppId(), Function.VIDEO_CALL) && matchPattern(this.videoCallPatterns, strGeneralPatternMapping)) {
            phoneCallIntention.setCallMode(CallMode.VIDEO);
            strGeneralPatternMapping = generalPatternMapping(IntentMappingConfig.getInstance().getVideoCallPatternMap(), strGeneralPatternMapping);
        } else if (DeviceConfig.supportFunction(deviceApp.getAppId(), Function.VOICE_CALL) && matchPattern(this.voiceCallPatterns, strGeneralPatternMapping)) {
            phoneCallIntention.setCallMode(CallMode.VOICE);
            strGeneralPatternMapping = generalPatternMapping(IntentMappingConfig.getInstance().getVoiceCallPatternMap(), strGeneralPatternMapping);
        }
        if (DeviceConfig.supportFunction(deviceApp.getAppId(), Function.CALL_YELLOWPAGE_WM) && matchPattern(this.yellowPageCall, strGeneralPatternMapping)) {
            strGeneralPatternMapping = generalPatternMapping(IntentMappingConfig.getInstance().getYellowPageCallMap(), strGeneralPatternMapping);
        }
        if (matchPattern(this.underRecall, strGeneralPatternMapping)) {
            return generalUnderRecallMapping(IntentMappingConfig.getInstance().getUnderRecallTightMap(), generalPatternMapping(IntentMappingConfig.getInstance().getUnderRecallLooseMap(), strGeneralPatternMapping));
        }
        return strGeneralPatternMapping;
    }

    private void reviewIntention(String str, y2e y2eVar, PhoneCallIntention phoneCallIntention) {
        boolean z = true;
        if (str.length() == 1) {
            return;
        }
        if (isMatchBlk(str)) {
            phoneCallIntention.setAction(ActionType.BLACK.toString());
            phoneCallIntention.setScore(0.0d);
        }
        if (phoneCallIntention.getAction().equals(ActionType.BLACK.toString())) {
            return;
        }
        if (matchPattern(this.playRecentMissedPatterns, str)) {
            phoneCallIntention.setAction(ActionType.PLAY_RECENT_MISSED_CALLS.toString());
            phoneCallIntention.setScore(1.0d);
            return;
        }
        if (matchPattern(this.playRecentAnsweredPatterns, str)) {
            phoneCallIntention.setAction(ActionType.PLAY_RECENT_ANSWERED_CALLS.toString());
            phoneCallIntention.setScore(1.0d);
            return;
        }
        if (matchPattern(this.playRecentIncomingPatterns, str)) {
            phoneCallIntention.setAction(ActionType.PLAY_RECENT_INCOMING_CALLS.toString());
            phoneCallIntention.setScore(1.0d);
            return;
        }
        if (matchPattern(this.playRecentOutgoingPatterns, str)) {
            phoneCallIntention.setAction(ActionType.PLAY_RECENT_OUTGOING_CALLS.toString());
            phoneCallIntention.setScore(1.0d);
            return;
        }
        if (phoneCallIntention.getAction().equals(ActionType.PICK_UP.toString()) || phoneCallIntention.getAction().equals(ActionType.HANG_UP.toString()) || phoneCallIntention.getAction().equals(ActionType.VIEW_ALL_CALLS.toString()) || phoneCallIntention.getAction().equals(ActionType.VIEW_MISSED_CALLS.toString()) || phoneCallIntention.getAction().equals(ActionType.VIEW_OUTGOING_CALLS.toString())) {
            phoneCallIntention.setScore(1.0d);
            return;
        }
        CardType cardType = phoneCallIntention.getCardType();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        String name = phoneCallIntention.getName();
        for (ovg ovgVarE = y2eVar.l().e(); ovgVarE != null; ovgVarE = ovgVarE.e()) {
            xb8 xb8VarI = ovgVarE.i();
            if (!xb8VarI.e().equals("<s>") && !xb8VarI.e().equals("</s>")) {
                if (cardType == CardType.DEFAULT && (xb8VarI.f().equals("card_one") || xb8VarI.f().equals("card_two"))) {
                    cardType = CardType.fromString(xb8VarI.f());
                }
                if (xb8VarI.f().equals("name")) {
                    z = false;
                } else if (z) {
                    stringBuffer.append(xb8VarI.h());
                } else {
                    stringBuffer2.append(xb8VarI.h());
                }
            }
        }
        phoneCallIntention.setCardType(cardType);
        if (phoneCallIntention.getName().isEmpty() && phoneCallIntention.getAction().equals(ActionType.EMPTY.toString())) {
            phoneCallIntention.setScore(1.0d);
            phoneCallIntention.setMatchType(MatchType.MATCH_EMPTY_NAME);
            return;
        }
        if (name.isEmpty()) {
            System.out.println("name isEmpty");
            return;
        }
        String string = stringBuffer.toString();
        String string2 = stringBuffer2.toString();
        if (matchPattern(this.showContactNumberPatterns, str) || (string.isEmpty() && matchPattern(this.transCallToSearchNum, str))) {
            phoneCallIntention.setAction(ActionType.SHOW_CONTACT_NUMBER.toString());
        } else {
            phoneCallIntention.setAction(ActionType.QUERY.toString());
        }
        SlotRet slotRet = new SlotRet(name, string, string2, Boolean.FALSE);
        extractName(phoneCallIntention, slotRet);
        specialTag2Name(phoneCallIntention, slotRet, str);
    }

    private void setEmptyAction(PhoneCallIntention phoneCallIntention) {
        phoneCallIntention.setAction(ActionType.EMPTY.toString());
        phoneCallIntention.setScore(1.0d);
        phoneCallIntention.setMatchType(MatchType.MATCH_EMPTY_NAME);
        phoneCallIntention.setName("");
        phoneCallIntention.setFixName("");
    }

    private void setQueryAction(PhoneCallIntention phoneCallIntention) {
        phoneCallIntention.setAction(ActionType.QUERY.toString());
        phoneCallIntention.setScore(0.0d);
        phoneCallIntention.setName("");
        phoneCallIntention.setFixName("");
    }

    private void specialTag2Name(PhoneCallIntention phoneCallIntention, SlotRet slotRet, String str) {
        if (phoneCallIntention.getName().isEmpty() && SPECIAL_TAG_LIST.contains(phoneCallIntention.getTag())) {
            String tag = phoneCallIntention.getTag();
            phoneCallIntention.setName(tag);
            phoneCallIntention.setFixName(tag);
            phoneCallIntention.setTag("");
            phoneCallIntention.setScore(1.0d);
            phoneCallIntention.setAction(ActionType.QUERY.toString());
            slotRet.setSlot(tag);
            slotRet.setPrefix(str.substring(0, str.indexOf(tag)));
            slotRet.setSuffix(str.substring(str.indexOf(tag) + tag.length()));
            phoneCallIntention.addSlotRet(slotRet);
        }
    }

    private void trimFuncWord(SlotRet slotRet) {
        String slot = slotRet.getSlot();
        String prefix = slotRet.getPrefix();
        String suffix = slotRet.getSuffix();
        for (String str : BEGIN_FUNC_WORD_LIST) {
            if (slot.startsWith(str)) {
                slot = slot.substring(str.length());
                prefix = prefix + str;
            }
        }
        for (String str2 : END_FUNC_WORD_LIST) {
            if (slot.endsWith(str2)) {
                slot = slot.substring(0, slot.length() - str2.length());
                suffix = str2 + suffix;
            }
        }
        slotRet.setSlot(slot);
        slotRet.setPrefix(prefix);
        slotRet.setSuffix(suffix);
    }

    public PhoneCallIntention parse(String str, Boolean bool, DeviceApp deviceApp) {
        String lowerCase = str.replaceAll("\\p{P}|\\p{Space}", "").toLowerCase();
        PhoneCallIntention phoneCallIntention = new PhoneCallIntention();
        phoneCallIntention.setQuery(str);
        PhoneCallIntention phoneCallIntention2 = new PhoneCallIntention();
        parse(lowerCase, bool, phoneCallIntention, Boolean.FALSE, deviceApp);
        parse(lowerCase, bool, phoneCallIntention2, Boolean.TRUE, deviceApp);
        mergeQcIntention(phoneCallIntention, phoneCallIntention2);
        if (lowerCase.matches(HAND_FREE)) {
            phoneCallIntention.setCallMode(CallMode.HAND_FREE);
        }
        if (DeviceConfig.supportFunction(deviceApp.getAppId(), Function.CALL_APP) && matchPattern(this.callAppPatterns, lowerCase)) {
            phoneCallIntention.setAction(ActionType.QUERY);
            phoneCallIntention.setObjectDeviceType(ObjectDeviceType.APP);
            phoneCallIntention.setScore(1.0d);
        }
        if (DeviceConfig.supportFunction(deviceApp.getAppId(), Function.ANSWER_CALL) && matchPattern(this.answerCall, lowerCase)) {
            phoneCallIntention.setAction(ActionType.PICK_UP);
            phoneCallIntention.setScore(1.0d);
        }
        if (DeviceConfig.supportFunction(deviceApp.getAppId(), Function.HANG_UP_THE_CALL) && matchPattern(this.hangUpCall, lowerCase)) {
            phoneCallIntention.setAction(ActionType.HANG_UP);
            phoneCallIntention.setScore(1.0d);
        }
        phoneCallIntention.setDialogStatus(IntentionUtils.updateDialogStatusInParser(phoneCallIntention));
        return phoneCallIntention;
    }

    private PhoneCallIntention parse(String str, Boolean bool, PhoneCallIntention phoneCallIntention, Boolean bool2, DeviceApp deviceApp) {
        while (true) {
            if (!str.startsWith("小爱同学") && !str.endsWith("小爱同学")) {
                break;
            }
            str = str.replace("小爱同学", "");
        }
        while (true) {
            if (!str.startsWith("小爱") && !str.endsWith("小爱")) {
                break;
            }
            str = str.replace("小爱", "");
        }
        String strReplace = str.replace("打开电话", "");
        String strQueryAdapt = queryAdapt(deviceApp, strReplace, phoneCallIntention);
        System.out.println("query rewrite " + strQueryAdapt);
        y2e y2eVarQ = y2e.q(strQueryAdapt, bool.booleanValue(), this.resourceLoader, fixTokens(nip.b().d(strQueryAdapt, this.resourceLoader.getDict()), this.resourceLoader.getDict()));
        qpe qpeVar = LOGGER;
        qpeVar.debug("Finished initializing lattice {}", z2e.a(y2eVarQ));
        String strReplace2 = strQueryAdapt.replace("\t", "").replace(",", "");
        if (isPhoneIntent(strQueryAdapt, bool2.booleanValue()) && LONG_CHN_NUMBER_PAT.matcher(strQueryAdapt).find()) {
            factoidDigitNumber(y2eVarQ, strQueryAdapt, Boolean.TRUE);
        } else if (isPhoneIntent(strQueryAdapt, bool2.booleanValue()) && PURE_DIGIT_NUMBER_PAT.matcher(strQueryAdapt).find()) {
            factoidDigitNumber(y2eVarQ, strQueryAdapt, Boolean.FALSE);
        } else {
            factoidDigitNumber(y2eVarQ, strQueryAdapt, bool2);
        }
        if (bool2.booleanValue()) {
            List<xb8> listAddQcEntity = this.qcEntityGenerator.addQcEntity(y2eVarQ);
            qpeVar.debug("addQcEntity lattice {}", z2e.a(y2eVarQ));
            strReplace2 = this.qcEntityGenerator.getQc(strReplace2, listAddQcEntity);
        }
        this.beforeDecodeTransducer.a(y2eVarQ, phoneCallIntention, RuleApplyPhase.BEFORE_DECODING, this.languageModel);
        qpeVar.debug("beforeDecode transducer success {}", z2e.a(y2eVarQ));
        y2eVarQ.u(this.languageModel);
        qpeVar.debug("shortest path find success {}", z2e.a(y2eVarQ));
        boolean zIsYellowPageCall = ruleMatcher.isYellowPageCall(y2eVarQ, strQueryAdapt);
        if (isPhoneIntent(strReplace2, bool2.booleanValue())) {
            if (hasLongNumber(y2eVarQ)) {
                convertLongNumberToName(y2eVarQ);
            } else {
                this.crfTool.addCrfSlots(this.crfTool.matchCrfQuery(strReplace2), y2eVarQ, strReplace2);
                qpeVar.debug("after addCrfSlots {}", z2e.a(y2eVarQ));
            }
        }
        vwp vwpVar = this.afterDecodeTransducer;
        RuleApplyPhase ruleApplyPhase = RuleApplyPhase.AFTER_DECODING;
        vwpVar.a(y2eVarQ, phoneCallIntention, ruleApplyPhase, this.languageModel);
        qpeVar.debug("afterDecode transducer success {}", z2e.a(y2eVarQ));
        this.finalTransducer.a(y2eVarQ, phoneCallIntention, ruleApplyPhase, this.languageModel);
        qpeVar.debug("final transducer success {}", z2e.a(y2eVarQ));
        j2n.a(y2eVarQ, phoneCallIntention, PhoneCallIntention.class, new HashSet());
        if (zIsYellowPageCall && phoneCallIntention.getIntentionInfo().has(YELLOW_PAGE_SLOT)) {
            phoneCallIntention.setName(phoneCallIntention.getIntentionInfo().get(YELLOW_PAGE_SLOT).getAsString());
        }
        reviewIntention(strReplace, y2eVarQ, phoneCallIntention);
        if (bool.booleanValue()) {
            phoneCallIntention.getDebugInfo().addProperty("lattice", z2e.a(y2eVarQ).toString());
        }
        qpeVar.debug("reviewIntention success: {}", gson.toJson(phoneCallIntention));
        return phoneCallIntention;
    }
}
