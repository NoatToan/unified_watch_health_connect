package com.xiaomi.ai.domain.mobileapp.parser;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.xiaomi.ai.domain.mobileapp.adapter.ClientAdapter;
import com.xiaomi.ai.domain.mobileapp.adapter.ContextAdapter;
import com.xiaomi.ai.domain.mobileapp.common.ActionType;
import com.xiaomi.ai.domain.mobileapp.common.Adapter;
import com.xiaomi.ai.domain.mobileapp.common.AppItem;
import com.xiaomi.ai.domain.mobileapp.common.Device;
import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import com.xiaomi.ai.domain.mobileapp.local.LocalAppSwitch;
import com.xiaomi.ai.domain.mobileapp.util.ExtractNativeName;
import com.xiaomi.ai.domain.mobileapp.util.NumberConverter;
import com.xiaomi.ai.nlp.factoid.FactoidExtractor;
import com.xiaomi.ai.nlp.lattice.entity.EntityType;
import com.xiaomi.ai.nlp.lattice.rule.RuleApplyPhase;
import com.xiaomi.ai.nlp.lm.core.LanguageModel;
import defpackage.aqe;
import defpackage.j2n;
import defpackage.j4b;
import defpackage.klo;
import defpackage.q69;
import defpackage.qpe;
import defpackage.vwp;
import defpackage.xb8;
import defpackage.y2e;
import defpackage.z2e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: loaded from: classes7.dex */
public class MobileAppParserImpl {
    private static final String FUNC_CLOSE_MUSIC = "play_control.play.common.suspend";
    private static final int MAX_HIT_SHOW_NUM = 8;
    private static final int MAX_SIM_SHOW_NUM = 10;
    private static final String RULE_PATH = "com.xiaomi.ai.domain.mobileApp.lattice.rule";
    private static final String TAG_MUSIC = "音乐";
    private static final qpe LOGGER = aqe.f(MobileAppParserImpl.class);
    private static Gson gson = j4b.b();
    private static Pattern orderPattern = Pattern.compile("第(.+?)个[\\u4e00-\\u9fa5]{0,5}$");
    private FactoidExtractor factoidExtractor = new FactoidExtractor();
    private LanguageModel languageModel = new LanguageModel();
    private vwp beforeDecodeTransducer = new vwp();
    private vwp afterDecodeTransducer = new vwp();
    private vwp finalTransducer = new vwp();
    private LocalAppSwitch localAppSwitch = new LocalAppSwitch();
    private boolean inited = false;

    private void factoidQuery(y2e y2eVar, String str) {
        try {
            for (q69 q69Var : this.factoidExtractor.extract(str)) {
                for (String str2 : q69Var.h().keySet()) {
                    y2eVar.d(new xb8(q69Var.b(), q69Var.c(), q69Var.i(), q69Var.i(), str2, q69Var.h().get(str2), EntityType.FACTOID_PARSED_ENTITY));
                }
            }
        } catch (Exception unused) {
        }
    }

    private List<AppItem> getLastAppItems(JsonArray jsonArray, Device device) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jsonArray.size(); i++) {
            AppItem appItemByPackageName = ResourceSuite.getInstance().getAppItemByPackageName(jsonArray.get(i).getAsJsonObject().get("package_name").getAsString(), device);
            if (appItemByPackageName != null) {
                arrayList.add(appItemByPackageName);
            }
        }
        return arrayList;
    }

    private boolean parseMultiRoundQuery(String str, List<AppItem> list, MobileAppIntention mobileAppIntention) {
        int i;
        Matcher matcher = orderPattern.matcher(str);
        int i2 = -1;
        if (matcher.find() && matcher.groupCount() == 1) {
            String strI = klo.i(matcher.group(1));
            if (klo.c(strI) && (i = Integer.parseInt(strI)) >= 1 && i <= list.size()) {
                i2 = i - 1;
            }
        } else {
            int i3 = -1;
            int i4 = -1;
            for (int i5 = 0; i5 < list.size(); i5++) {
                AppItem appItem = list.get(i5);
                String left = NumberConverter.normZhDigitsToArabic(appItem.getDisplayName().toLowerCase()).getLeft();
                if (i4 == -1 && left.equals(str)) {
                    i4 = i5;
                }
                if (i3 == -1 && (left.contains(str) || str.contains(left) || appItem.hasName(str))) {
                    i3 = i5;
                }
                if (i4 != -1) {
                    i3 = i4;
                }
            }
            i2 = i3;
        }
        mobileAppIntention.setQuery(str);
        if (i2 < 0 || i2 >= list.size()) {
            return false;
        }
        AppItem appItem2 = list.get(i2);
        String displayName = appItem2.getDisplayName();
        String packageName = appItem2.getPackageName();
        String iconUrl = appItem2.getIconUrl();
        mobileAppIntention.setScore(1.0d);
        ActionType actionType = ActionType.OPEN;
        mobileAppIntention.setAction(actionType.toString());
        mobileAppIntention.setFunc(actionType.getFunc());
        mobileAppIntention.setName(displayName);
        mobileAppIntention.addApp(displayName, packageName, iconUrl, appItem2.isNative(), appItem2.isOnline(), appItem2.isTop(), appItem2.getScore());
        mobileAppIntention.addKeyword(displayName);
        mobileAppIntention.setSkip_arbitrator(true);
        return true;
    }

    private MobileAppIntention parseQuery(String str, Boolean bool, Device device, String str2) {
        MobileAppIntention mobileAppIntention = new MobileAppIntention();
        mobileAppIntention.setDevice(device);
        mobileAppIntention.setQuery(str);
        if (str.length() == 0) {
            return mobileAppIntention;
        }
        if (ResourceSuite.getInstance().matchBlackQuery(str)) {
            mobileAppIntention.setBlackType(MobileAppIntention.BLACKTYPE.BLACK_QUERY);
            return mobileAppIntention;
        }
        if (ResourceSuite.getInstance().matchBlackPatternList(str)) {
            mobileAppIntention.setBlackType(MobileAppIntention.BLACKTYPE.BLACK_QUERY);
            return mobileAppIntention;
        }
        y2e y2eVarS = y2e.s(str, bool.booleanValue(), ResourceSuite.getInstance().extractEntities(str, device));
        LOGGER.debug("requestId:{} Finished initializing lattice {}", str2, z2e.a(y2eVarS));
        try {
            factoidQuery(y2eVarS, str);
        } catch (Exception e) {
            LOGGER.warn("requestId:{} failed to extract factoid", str2, e);
        }
        this.beforeDecodeTransducer.a(y2eVarS, mobileAppIntention, RuleApplyPhase.BEFORE_DECODING, this.languageModel);
        qpe qpeVar = LOGGER;
        qpeVar.debug("requestId:{} beforeDecode transducer success {}", str2, z2e.a(y2eVarS));
        y2eVarS.u(this.languageModel);
        qpeVar.debug("requestId:{} shortest path find success {}", str2, z2e.a(y2eVarS));
        if (CrfLatticeTool.getInstance().isInit()) {
            CrfLatticeTool.getInstance().shortPath(y2eVarS);
        }
        vwp vwpVar = this.afterDecodeTransducer;
        RuleApplyPhase ruleApplyPhase = RuleApplyPhase.AFTER_DECODING;
        vwpVar.a(y2eVarS, mobileAppIntention, ruleApplyPhase, this.languageModel);
        qpeVar.debug("requestId:{} afterDecode transducer success {}", str2, z2e.a(y2eVarS));
        this.finalTransducer.a(y2eVarS, mobileAppIntention, ruleApplyPhase, this.languageModel);
        qpeVar.debug("requestId:{} final transducer success {}", str2, z2e.a(y2eVarS));
        ParserTool.topnameProcess(y2eVarS, mobileAppIntention, device);
        qpeVar.debug("requestId:{} after topnameProcess, action is {}", str2, mobileAppIntention.getAction());
        ParserTool.weakPatternPreProcess(y2eVarS, mobileAppIntention, device);
        qpeVar.debug("requestId:{} after weakPatternPreProcess, pattern is {}", str2, mobileAppIntention.getPattern().toString());
        j2n.a(y2eVarS, mobileAppIntention, MobileAppIntention.class, new HashSet());
        NameExtractor.extractAppName(y2eVarS, mobileAppIntention, device);
        ParserTool.weakPatternProcess(y2eVarS, mobileAppIntention, device);
        qpeVar.debug("requestId:{} after weakPatternProcess, action is {}", str2, mobileAppIntention.getAction());
        if (ResourceSuite.getInstance().matchBlackWord(mobileAppIntention.getName())) {
            mobileAppIntention.setBlackType(MobileAppIntention.BLACKTYPE.BLACK_WORD);
            mobileAppIntention.setScore(0.0d);
            return mobileAppIntention;
        }
        setAppsAndScore(mobileAppIntention, device);
        qpeVar.debug("requestId:{} intention after setapp: {}", str2, gson.toJson(mobileAppIntention));
        if (mobileAppIntention.getPattern() == MobileAppIntention.PATTERN.TAG_PATTERN) {
            setTagName(mobileAppIntention, device);
        }
        ParserTool.longQueryScore(y2eVarS, mobileAppIntention, false, device);
        qpeVar.debug("requestId:{} intention long query: {}", str2, gson.toJson(mobileAppIntention));
        ParserTool.specialPatternScore(str, mobileAppIntention, device);
        qpeVar.debug("requestId:{} intention weak pattern: {}", str2, gson.toJson(mobileAppIntention));
        ParserTool.penaltyScore(str, mobileAppIntention);
        ConfidenceTool.setConfidence(y2eVarS, mobileAppIntention);
        if (bool.booleanValue()) {
            mobileAppIntention.getDebugInfo().addProperty("lattice", z2e.a(y2eVarS).toString());
        }
        mobileAppIntention.setAction(ActionType.fromString(mobileAppIntention.getAction()));
        setUseLocalApp(mobileAppIntention);
        setDownloadNow(mobileAppIntention, device);
        setFunc(mobileAppIntention);
        qpeVar.debug("requestId:{} parseQuery intention: {}", str2, gson.toJson(mobileAppIntention));
        return mobileAppIntention;
    }

    private void setAppsAndScore(MobileAppIntention mobileAppIntention, Device device) {
        String action = mobileAppIntention.getAction();
        ActionType actionType = ActionType.CLOSE;
        if (action.equals(actionType.toString()) || mobileAppIntention.getAction().equals(ActionType.OPEN.toString()) || mobileAppIntention.getAction().equals(ActionType.INSTALL.toString()) || mobileAppIntention.getAction().equals(ActionType.UNINSTALL.toString())) {
            if (mobileAppIntention.getAction().equals(ActionType.OPEN.toString()) && mobileAppIntention.getPattern() != MobileAppIntention.PATTERN.TAG_PATTERN) {
                if (mobileAppIntention.getName().isEmpty() && mobileAppIntention.getPattern() != MobileAppIntention.PATTERN.SEARCH_PATTERN) {
                    setAppsEmptyName(mobileAppIntention, device);
                    return;
                } else {
                    if (mobileAppIntention.getName().isEmpty()) {
                        return;
                    }
                    setAppsSimNameAndScore(mobileAppIntention);
                    return;
                }
            }
            if (mobileAppIntention.getAction().equals(ActionType.INSTALL.toString()) && mobileAppIntention.getPattern() != MobileAppIntention.PATTERN.TAG_PATTERN) {
                if (mobileAppIntention.getName().isEmpty()) {
                    setOpenAppStore(mobileAppIntention, device);
                    return;
                } else {
                    setAppsSimNameAndScore(mobileAppIntention);
                    return;
                }
            }
            if (mobileAppIntention.getAction().equals(actionType.toString())) {
                mobileAppIntention.setScore(1.0d);
                setAppsSimNameAndScore(mobileAppIntention);
            } else if (mobileAppIntention.getAction().equals(ActionType.UNINSTALL.toString())) {
                mobileAppIntention.setScore(1.0d);
                setAppsSimNameAndScore(mobileAppIntention);
            }
        }
    }

    private void setAppsEmptyName(MobileAppIntention mobileAppIntention, Device device) {
        if (mobileAppIntention.getName().isEmpty()) {
            List<AppItem> topKItems = ResourceSuite.getInstance().getTopKItems(device);
            if (topKItems.isEmpty()) {
                return;
            }
            for (AppItem appItem : topKItems) {
                mobileAppIntention.addApp(appItem.getDisplayName(), appItem.getPackageName(), appItem.getIconUrl(), appItem.isNative(), appItem.isOnline(), appItem.isTop(), appItem.getScore());
            }
            mobileAppIntention.setScore(1.0d);
        }
    }

    private void setAppsSimNameAndScore(MobileAppIntention mobileAppIntention) {
        setAppsSimNameAndScore(mobileAppIntention, true);
    }

    private void setDownloadNow(MobileAppIntention mobileAppIntention, Device device) {
        if (mobileAppIntention == null || mobileAppIntention.getScore() < 0.5d || mobileAppIntention.getApps().size() != 1 || mobileAppIntention.getConfidence() < 0.99d) {
            return;
        }
        boolean zIsEqual = ActionType.INSTALL.isEqual(mobileAppIntention.getAction());
        AppItem appItemByPackageName = ResourceSuite.getInstance().getAppItemByPackageName(mobileAppIntention.getApps().get(0).getPackageName(), device);
        if (!zIsEqual || appItemByPackageName == null || appItemByPackageName.getIconUrl().isEmpty() || appItemByPackageName.getDownTimes() <= 30000) {
            return;
        }
        mobileAppIntention.setDownloadNow(true);
    }

    private void setFunc(MobileAppIntention mobileAppIntention) {
        ActionType actionTypeFromString = ActionType.fromString(mobileAppIntention.getAction());
        if (ActionType.CLOSE == actionTypeFromString && TAG_MUSIC.equals(mobileAppIntention.getTag())) {
            mobileAppIntention.setFunc(FUNC_CLOSE_MUSIC);
        } else {
            mobileAppIntention.setFunc(actionTypeFromString.getFunc());
        }
    }

    private void setOpenAppStore(MobileAppIntention mobileAppIntention, Device device) {
        mobileAppIntention.setAction(ActionType.OPEN.toString());
        AppItem appItemByPackageName = ResourceSuite.getInstance().getAppItemByPackageName("com.xiaomi.market", device);
        if (appItemByPackageName == null) {
            LOGGER.info("get pkg:{} info null, please check", "com.xiaomi.market");
            return;
        }
        mobileAppIntention.addApp(appItemByPackageName.getDisplayName(), appItemByPackageName.getPackageName(), appItemByPackageName.getIconUrl(), appItemByPackageName.isNative(), appItemByPackageName.isOnline(), appItemByPackageName.isTop(), appItemByPackageName.getScore());
        double score = appItemByPackageName.getScore();
        if (score > 1.0d) {
            score = 1.0d;
        }
        mobileAppIntention.setScore(score);
    }

    private void setTagName(MobileAppIntention mobileAppIntention, Device device) {
        String tag = mobileAppIntention.getTag();
        if (tag.isEmpty()) {
            return;
        }
        mobileAppIntention.setKeyword(mobileAppIntention.getTag());
        List<AppItem> tagAppItems = ResourceSuite.getInstance().getTagAppItems(tag, device);
        if (tagAppItems.isEmpty()) {
            return;
        }
        for (AppItem appItem : tagAppItems) {
            mobileAppIntention.addApp(appItem.getDisplayName(), appItem.getPackageName(), appItem.getIconUrl(), appItem.isNative(), appItem.isOnline(), appItem.isTop(), appItem.getScore());
        }
    }

    private void setUseLocalApp(MobileAppIntention mobileAppIntention) {
        if (this.localAppSwitch.isUseLocalApp(mobileAppIntention.getKeyword())) {
            mobileAppIntention.setUseLocalApp(false);
        }
    }

    public boolean init() throws Exception {
        if (this.inited) {
            LOGGER.info("mobileApp has been inited, no reinit!");
            return true;
        }
        qpe qpeVar = LOGGER;
        qpeVar.info("mobileApp parser initEdgeBaseAndBlackResource...");
        this.factoidExtractor.init();
        this.languageModel = new LanguageModel(getClass().getResourceAsStream("/mobileapp/data/ngram-dict.dic"), getClass().getResourceAsStream("/mobileapp/data/ngram-prop.dic"));
        boolean zInitEdgeBaseAndBlackResource = ResourceSuite.getInstance().initEdgeBaseAndBlackResource();
        BaseResourceData baseResource = ResourceSuite.getInstance().getBaseResource();
        this.beforeDecodeTransducer.d("mobileapp/rules/transform.conf", RULE_PATH, baseResource);
        this.beforeDecodeTransducer.d("mobileapp/rules/constraint.conf", RULE_PATH, baseResource);
        this.beforeDecodeTransducer.d("mobileapp/rules/merge.conf", RULE_PATH, baseResource);
        this.afterDecodeTransducer.d("mobileapp/rules/priority.conf", RULE_PATH, baseResource);
        this.afterDecodeTransducer.d("mobileapp/rules/after_transform.conf", RULE_PATH, baseResource);
        this.finalTransducer.d("mobileapp/rules/action.conf", RULE_PATH, baseResource);
        qpeVar.info("mobileApp parser construct success");
        if (zInitEdgeBaseAndBlackResource) {
            this.inited = true;
        }
        return zInitEdgeBaseAndBlackResource;
    }

    public MobileAppIntention parse(String str, Boolean bool, Pair<JsonArray, String> pair, JsonObject jsonObject, int i, Device device, String str2) {
        String right = "";
        String strReplaceAll = str.substring(0, Math.min(25, str.length())).replaceAll("\\p{P}|\\p{Space}", "");
        Pair<String, List<Integer>> pairNormZhDigitsToArabic = NumberConverter.normZhDigitsToArabic(strReplaceAll.toLowerCase());
        String left = pairNormZhDigitsToArabic.getLeft();
        List<AppItem> lastAppItems = (pair == null || pair.getLeft() == null) ? null : getLastAppItems(pair.getLeft(), device);
        if (pair != null && pair.getRight() != null) {
            right = pair.getRight();
        }
        MobileAppIntention mobileAppIntention = new MobileAppIntention();
        if (!ActionType.CLOSE.toString().equalsIgnoreCase(right) && !ActionType.UNINSTALL.toString().equals(right) && lastAppItems != null && lastAppItems.size() > 1 && left.length() > 1 && parseMultiRoundQuery(left, lastAppItems, mobileAppIntention)) {
            mobileAppIntention.setQuery(str);
            mobileAppIntention.setDevice(device);
            LOGGER.debug("requestId:{} after multiRound: {}", str2, gson.toJson(mobileAppIntention));
            return mobileAppIntention;
        }
        String appNameOriginal = device.getAppNameOriginal();
        qpe qpeVar = LOGGER;
        qpeVar.info("requestId:{} normQuery:{} appNameOrigin:{} device:{}", str2, left, appNameOriginal, device.getAppName());
        MobileAppIntention mobileAppIntention2 = parse(left, bool, jsonObject, i, device, str2);
        mobileAppIntention2.setQuery(str);
        mobileAppIntention2.setDevice(device);
        if (mobileAppIntention2.getFunc().isEmpty()) {
            mobileAppIntention2.setAction(ActionType.fromString(mobileAppIntention2.getAction()).getFunc());
        }
        ExtractNativeName.setAppName(mobileAppIntention2, strReplaceAll, left, pairNormZhDigitsToArabic.getRight());
        Adapter.ActionDeviceAdapt(mobileAppIntention2, device);
        qpeVar.debug("requestId:{} lattice parse: {}", str2, gson.toJson(mobileAppIntention2));
        return mobileAppIntention2;
    }

    public static void setAppsSimNameAndScore(MobileAppIntention mobileAppIntention, boolean z) {
        ArrayList arrayList = new ArrayList();
        boolean hitAndSimilarAppItems = ResourceSuite.getInstance().getHitAndSimilarAppItems(mobileAppIntention.getName(), arrayList, mobileAppIntention.getDevice());
        mobileAppIntention.getDebugInfo().addProperty("simapp_num_total", Integer.valueOf(arrayList.size()));
        if (arrayList.isEmpty()) {
            return;
        }
        double score = ((AppItem) arrayList.get(0)).getScore();
        mobileAppIntention.getDebugInfo().addProperty("isHitName", Boolean.valueOf(hitAndSimilarAppItems));
        mobileAppIntention.getDebugInfo().addProperty("headPkgScore", Double.valueOf(score));
        mobileAppIntention.getDebugInfo().addProperty("headPkg", ((AppItem) arrayList.get(0)).getPackageName());
        if (score >= 0.49d) {
            if (!hitAndSimilarAppItems) {
                boolean z2 = false;
                for (int i = 0; i < arrayList.size(); i++) {
                    AppItem appItem = (AppItem) arrayList.get(i);
                    z2 = z2 || appItem.isOnline();
                    mobileAppIntention.addApp(appItem.getDisplayName(), appItem.getPackageName(), appItem.getIconUrl(), appItem.isNative(), appItem.isOnline(), appItem.isTop(), appItem.getScore());
                    if ((i >= 10 && z2) || i >= 300) {
                        break;
                    }
                }
            } else {
                boolean z3 = false;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AppItem appItem2 = (AppItem) arrayList.get(i2);
                    if (!appItem2.hasName(mobileAppIntention.getName())) {
                        if (Device.PAD == mobileAppIntention.getDevice()) {
                            if (!appItem2.getDisplayName().replaceAll(" ", "").equalsIgnoreCase(mobileAppIntention.getName() + "HD")) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    z3 = z3 || appItem2.isOnline();
                    mobileAppIntention.addApp(appItem2.getDisplayName(), appItem2.getPackageName(), appItem2.getIconUrl(), appItem2.isNative(), appItem2.isOnline(), appItem2.isTop(), appItem2.getScore());
                    if ((i2 >= 8 && z3) || i2 >= 200) {
                        break;
                    }
                }
            }
            if (z) {
                if (score > 1.0d) {
                    score = 1.0d;
                }
                mobileAppIntention.setScore(score);
            }
        }
    }

    public MobileAppIntention parse(String str, Boolean bool) {
        return parse(str, bool, null, Integer.MAX_VALUE, Device.PHONE, "");
    }

    private MobileAppIntention parse(String str, Boolean bool, JsonObject jsonObject, int i, Device device, String str2) {
        MobileAppIntention query = parseQuery(ContextAdapter.deviceRewriteApapt(str, device), bool, device, str2);
        ContextAdapter.adapt(query, jsonObject, i);
        ContextAdapter.deviceScoreApapt(query);
        ContextAdapter.devicePkgNameApapt(query);
        ClientAdapter.adapt(query, i);
        LOGGER.info("requestId:{} after adapt: {}", str2, gson.toJson(query));
        return query;
    }
}
