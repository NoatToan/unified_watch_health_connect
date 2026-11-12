package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import com.xiaomi.fitness.service.RectifiedUriFileProviderKt;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class LookAndTalk<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<Double> confidence_score;

    @Required
    @Deprecated
    private Slot<PageItem> matched_controls;

    @Required
    private Slot<PageItemV2> matched_controls_v2;

    @Required
    private Slot<MatchResult> matched_result;

    @Required
    private Slot<IntentEnum> sub_intent;
    private Optional<Slot<MatchText>> match_text = Optional.a();
    private Optional<Slot<Double>> similarity_score = Optional.a();

    public enum IntentEnum {
        Slide(1, "Slide"),
        Click(2, "Click"),
        Open(3, "Open"),
        Download(4, RectifiedUriFileProviderKt.NAME_DOWNLOAD),
        Play(5, "Play"),
        Nevigate(6, "Nevigate"),
        Switch(7, AIApiConstants.Switch.NAME),
        Inform(8, "Inform"),
        Back(9, "Back"),
        Close(10, HTTP.CONN_CLOSE),
        EmptyQuery(11, AIApiConstants.EmptyQuery.NAME),
        OutOfDomain(12, "OutOfDomain"),
        AdjustTo(13, "AdjustTo"),
        AdjustUp(14, "AdjustUp"),
        AdjustDown(15, "AdjustDown"),
        Correct(16, "Correct"),
        Delete(17, "Delete"),
        Edit(18, "Edit"),
        Check(19, "Check"),
        PrevPage(20, "PrevPage"),
        NextPage(21, "NextPage"),
        SetPage(22, "SetPage"),
        Continue(23, "Continue"),
        Stop(24, "Stop"),
        Install(25, "Install"),
        Update(26, "Update"),
        Add(27, "Add"),
        Cancel(28, OrderStatus.CANCEL),
        Confirm(29, "Confirm"),
        Detail(30, "Detail"),
        More(31, "More"),
        Navigate(32, "Navigate"),
        Refresh(33, "Refresh"),
        Reset(34, "Reset"),
        Retry(35, "Retry"),
        Save(36, "Save"),
        Unlock(37, "Unlock"),
        Search(38, "Search"),
        Dial(39, "Dial"),
        Like(40, "Like"),
        Clear(41, "Clear"),
        Connect(42, "Connect"),
        Disconnect(43, "Disconnect"),
        Rename(44, "Rename"),
        Mute(45, "Mute"),
        Unmute(46, "Unmute"),
        Minimize(47, "Minimize"),
        Maxmize(48, "Maxmize"),
        Poweron(49, "Poweron"),
        Poweroff(50, "Poweroff"),
        Viewswitch(51, "Viewswitch");

        private int id;
        private String name;

        IntentEnum(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static IntentEnum find(String str) {
            for (IntentEnum intentEnum : values()) {
                if (intentEnum.name.equals(str)) {
                    return intentEnum;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static IntentEnum read(String str) {
            return find(str);
        }

        public static String write(IntentEnum intentEnum) {
            return intentEnum.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum MatchResult {
        MultiFullMatched(1, "MultiFullMatched"),
        SingleFullMatched(2, "SingleFullMatched"),
        SingleFuzzyMatched(3, "SingleFuzzyMatched"),
        MultiFuzzyMatched(4, "MultiFuzzyMatched");

        private int id;
        private String name;

        MatchResult(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static MatchResult find(String str) {
            for (MatchResult matchResult : values()) {
                if (matchResult.name.equals(str)) {
                    return matchResult;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static MatchResult read(String str) {
            return find(str);
        }

        public static String write(MatchResult matchResult) {
            return matchResult.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class PageItem implements DomainType {

        @Required
        private Slot<String> matched_info;

        @Required
        private Slot<String> page_id;

        public PageItem() {
        }

        public PageItem(Slot<String> slot, Slot<String> slot2) {
            this.page_id = slot;
            this.matched_info = slot2;
        }

        @Required
        public Slot<String> getMatchedInfo() {
            return this.matched_info;
        }

        @Required
        public Slot<String> getPageId() {
            return this.page_id;
        }

        @Required
        public PageItem setMatchedInfo(Slot<String> slot) {
            this.matched_info = slot;
            return this;
        }

        @Required
        public PageItem setPageId(Slot<String> slot) {
            this.page_id = slot;
            return this;
        }
    }

    public static class PageItemV2 implements DomainType {

        @Required
        private List<String> matched_info;

        @Required
        private String page_id;

        public PageItemV2() {
        }

        public PageItemV2(String str, List<String> list) {
            this.page_id = str;
            this.matched_info = list;
        }

        @Required
        public List<String> getMatchedInfo() {
            return this.matched_info;
        }

        @Required
        public String getPageId() {
            return this.page_id;
        }

        @Required
        public PageItemV2 setMatchedInfo(List<String> list) {
            this.matched_info = list;
            return this;
        }

        @Required
        public PageItemV2 setPageId(String str) {
            this.page_id = str;
            return this;
        }
    }

    public enum TextType {
        Direction(1, "Direction"),
        Btn(2, "Btn"),
        Text(3, "Text"),
        SerialNumber(4, "SerialNumber"),
        AttributeValue(5, "AttributeValue"),
        Title(6, WebViewActivity.TITLE),
        PageName(7, "PageName"),
        Number(8, "Number"),
        Percent(9, "Percent"),
        Multiple(10, "Multiple"),
        Fraction(11, "Fraction"),
        Unit(12, "Unit"),
        TagCategories(13, "TagCategories"),
        TagTexts(14, "TagTexts");

        private int id;
        private String name;

        TextType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static TextType find(String str) {
            for (TextType textType : values()) {
                if (textType.name.equals(str)) {
                    return textType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static TextType read(String str) {
            return find(str);
        }

        public static String write(TextType textType) {
            return textType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public LookAndTalk() {
    }

    public static LookAndTalk read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        LookAndTalk lookAndTalk = new LookAndTalk();
        lookAndTalk.setConfidenceScore(IntentUtils.readSlot(zsdVar.w("confidence_score"), Double.class));
        lookAndTalk.setSubIntent(IntentUtils.readSlot(zsdVar.w("sub_intent"), IntentEnum.class));
        if (zsdVar.z("match_text")) {
            lookAndTalk.setMatchText(IntentUtils.readSlot(zsdVar.w("match_text"), MatchText.class));
        }
        lookAndTalk.setMatchedControls(IntentUtils.readSlot(zsdVar.w("matched_controls"), PageItem.class));
        lookAndTalk.setMatchedControlsV2(IntentUtils.readSlot(zsdVar.w("matched_controls_v2"), PageItemV2.class));
        lookAndTalk.setMatchedResult(IntentUtils.readSlot(zsdVar.w("matched_result"), MatchResult.class));
        if (zsdVar.z("similarity_score")) {
            lookAndTalk.setSimilarityScore(IntentUtils.readSlot(zsdVar.w("similarity_score"), Double.class));
        }
        return lookAndTalk;
    }

    public static zsd write(LookAndTalk lookAndTalk) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("confidence_score", IntentUtils.writeSlot(lookAndTalk.confidence_score));
        c4hVarCreateObjectNode.f0("sub_intent", IntentUtils.writeSlot(lookAndTalk.sub_intent));
        if (lookAndTalk.match_text.c()) {
            c4hVarCreateObjectNode.f0("match_text", IntentUtils.writeSlot(lookAndTalk.match_text.b()));
        }
        c4hVarCreateObjectNode.f0("matched_controls", IntentUtils.writeSlot(lookAndTalk.matched_controls));
        c4hVarCreateObjectNode.f0("matched_controls_v2", IntentUtils.writeSlot(lookAndTalk.matched_controls_v2));
        c4hVarCreateObjectNode.f0("matched_result", IntentUtils.writeSlot(lookAndTalk.matched_result));
        if (lookAndTalk.similarity_score.c()) {
            c4hVarCreateObjectNode.f0("similarity_score", IntentUtils.writeSlot(lookAndTalk.similarity_score.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    @Required
    public Slot<Double> getConfidenceScore() {
        return this.confidence_score;
    }

    public Optional<Slot<MatchText>> getMatchText() {
        return this.match_text;
    }

    @Required
    @Deprecated
    public Slot<PageItem> getMatchedControls() {
        return this.matched_controls;
    }

    @Required
    public Slot<PageItemV2> getMatchedControlsV2() {
        return this.matched_controls_v2;
    }

    @Required
    public Slot<MatchResult> getMatchedResult() {
        return this.matched_result;
    }

    public Optional<Slot<Double>> getSimilarityScore() {
        return this.similarity_score;
    }

    @Required
    public Slot<IntentEnum> getSubIntent() {
        return this.sub_intent;
    }

    @Required
    public LookAndTalk setConfidenceScore(Slot<Double> slot) {
        this.confidence_score = slot;
        return this;
    }

    public LookAndTalk setMatchText(Slot<MatchText> slot) {
        this.match_text = Optional.e(slot);
        return this;
    }

    @Required
    @Deprecated
    public LookAndTalk setMatchedControls(Slot<PageItem> slot) {
        this.matched_controls = slot;
        return this;
    }

    @Required
    public LookAndTalk setMatchedControlsV2(Slot<PageItemV2> slot) {
        this.matched_controls_v2 = slot;
        return this;
    }

    @Required
    public LookAndTalk setMatchedResult(Slot<MatchResult> slot) {
        this.matched_result = slot;
        return this;
    }

    public LookAndTalk setSimilarityScore(Slot<Double> slot) {
        this.similarity_score = Optional.e(slot);
        return this;
    }

    @Required
    public LookAndTalk setSubIntent(Slot<IntentEnum> slot) {
        this.sub_intent = slot;
        return this;
    }

    public static class MatchText implements DomainType {
        private Optional<String> skill_value = Optional.a();

        @Required
        private TextType text_type;

        @Required
        private String value;

        public MatchText() {
        }

        public Optional<String> getSkillValue() {
            return this.skill_value;
        }

        @Required
        public TextType getTextType() {
            return this.text_type;
        }

        @Required
        public String getValue() {
            return this.value;
        }

        public MatchText setSkillValue(String str) {
            this.skill_value = Optional.e(str);
            return this;
        }

        @Required
        public MatchText setTextType(TextType textType) {
            this.text_type = textType;
            return this;
        }

        @Required
        public MatchText setValue(String str) {
            this.value = str;
            return this;
        }

        public MatchText(TextType textType, String str) {
            this.text_type = textType;
            this.value = str;
        }
    }

    public LookAndTalk(Slot<Double> slot, Slot<IntentEnum> slot2, Slot<PageItem> slot3, Slot<PageItemV2> slot4, Slot<MatchResult> slot5) {
        this.confidence_score = slot;
        this.sub_intent = slot2;
        this.matched_controls = slot3;
        this.matched_controls_v2 = slot4;
        this.matched_result = slot5;
    }
}
