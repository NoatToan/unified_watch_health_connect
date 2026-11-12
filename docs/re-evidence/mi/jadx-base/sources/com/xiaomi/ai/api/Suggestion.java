package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Suggestion {

    public static class ExampleDesc {

        @Required
        private boolean clicked;

        @Required
        private String id;

        @Required
        private String query;

        public ExampleDesc() {
        }

        public ExampleDesc(String str, String str2, boolean z) {
            this.id = str;
            this.query = str2;
            this.clicked = z;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        @Required
        public boolean isClicked() {
            return this.clicked;
        }

        @Required
        public ExampleDesc setClicked(boolean z) {
            this.clicked = z;
            return this;
        }

        @Required
        public ExampleDesc setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public ExampleDesc setQuery(String str) {
            this.query = str;
            return this;
        }
    }

    @NamespaceName(name = "FetchContextSuggestions", namespace = AIApiConstants.Suggestion.NAME)
    @Deprecated
    public static class FetchContextSuggestions implements InstructionPayload {

        @Required
        private List<SuggestionItem> suggestions;

        public FetchContextSuggestions() {
        }

        public FetchContextSuggestions(List<SuggestionItem> list) {
            this.suggestions = list;
        }

        @Required
        public List<SuggestionItem> getSuggestions() {
            return this.suggestions;
        }

        @Required
        public FetchContextSuggestions setSuggestions(List<SuggestionItem> list) {
            this.suggestions = list;
            return this;
        }
    }

    @NamespaceName(name = "FetchFunctionGuide", namespace = AIApiConstants.Suggestion.NAME)
    public static class FetchFunctionGuide implements EventPayload {

        @Required
        private FetchFunctionGuideScene scene;

        public FetchFunctionGuide() {
        }

        public FetchFunctionGuide(FetchFunctionGuideScene fetchFunctionGuideScene) {
            this.scene = fetchFunctionGuideScene;
        }

        @Required
        public FetchFunctionGuideScene getScene() {
            return this.scene;
        }

        @Required
        public FetchFunctionGuide setScene(FetchFunctionGuideScene fetchFunctionGuideScene) {
            this.scene = fetchFunctionGuideScene;
            return this;
        }
    }

    public enum FetchFunctionGuideScene {
        UNKNOWN(-1),
        AI_INPUT_METHOD_NO_QUERY(0);

        private int id;

        FetchFunctionGuideScene(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class FunctionDesc {

        @Required
        private String desc;

        @Required
        private String id;

        @Required
        private String logo_url;

        public FunctionDesc() {
        }

        public FunctionDesc(String str, String str2, String str3) {
            this.id = str;
            this.desc = str2;
            this.logo_url = str3;
        }

        @Required
        public String getDesc() {
            return this.desc;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getLogoUrl() {
            return this.logo_url;
        }

        @Required
        public FunctionDesc setDesc(String str) {
            this.desc = str;
            return this;
        }

        @Required
        public FunctionDesc setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public FunctionDesc setLogoUrl(String str) {
            this.logo_url = str;
            return this;
        }
    }

    public static class QueryInfo {

        @Required
        private String button_text;

        @Required
        private boolean clicked;

        @Required
        private boolean exposed;

        @Required
        private String icon_url;

        @Required
        private String main_title;

        @Required
        private String subtitle;

        public QueryInfo() {
        }

        public QueryInfo(String str, String str2, String str3, String str4, boolean z, boolean z2) {
            this.icon_url = str;
            this.main_title = str2;
            this.subtitle = str3;
            this.button_text = str4;
            this.exposed = z;
            this.clicked = z2;
        }

        @Required
        public String getButtonText() {
            return this.button_text;
        }

        @Required
        public String getIconUrl() {
            return this.icon_url;
        }

        @Required
        public String getMainTitle() {
            return this.main_title;
        }

        @Required
        public String getSubtitle() {
            return this.subtitle;
        }

        @Required
        public boolean isClicked() {
            return this.clicked;
        }

        @Required
        public boolean isExposed() {
            return this.exposed;
        }

        @Required
        public QueryInfo setButtonText(String str) {
            this.button_text = str;
            return this;
        }

        @Required
        public QueryInfo setClicked(boolean z) {
            this.clicked = z;
            return this;
        }

        @Required
        public QueryInfo setExposed(boolean z) {
            this.exposed = z;
            return this;
        }

        @Required
        public QueryInfo setIconUrl(String str) {
            this.icon_url = str;
            return this;
        }

        @Required
        public QueryInfo setMainTitle(String str) {
            this.main_title = str;
            return this;
        }

        @Required
        public QueryInfo setSubtitle(String str) {
            this.subtitle = str;
            return this;
        }
    }

    public static class QuerySuggestionRedirection {
        private Optional<String> url = Optional.a();
        private Optional<QuerySuggestionRedirectionAppDownloadOrLink> app = Optional.a();
        private Optional<String> ads_target_type = Optional.a();
        private Optional<String> ads_interaction_type = Optional.a();

        public Optional<String> getAdsInteractionType() {
            return this.ads_interaction_type;
        }

        public Optional<String> getAdsTargetType() {
            return this.ads_target_type;
        }

        public Optional<QuerySuggestionRedirectionAppDownloadOrLink> getApp() {
            return this.app;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public QuerySuggestionRedirection setAdsInteractionType(String str) {
            this.ads_interaction_type = Optional.e(str);
            return this;
        }

        public QuerySuggestionRedirection setAdsTargetType(String str) {
            this.ads_target_type = Optional.e(str);
            return this;
        }

        public QuerySuggestionRedirection setApp(QuerySuggestionRedirectionAppDownloadOrLink querySuggestionRedirectionAppDownloadOrLink) {
            this.app = Optional.e(querySuggestionRedirectionAppDownloadOrLink);
            return this;
        }

        public QuerySuggestionRedirection setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }
    }

    public enum ResultsPageCardSizeType {
        ALL(0),
        HALF(1);

        private int id;

        ResultsPageCardSizeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "RichSkillSuggestion", namespace = AIApiConstants.Suggestion.NAME)
    public static class RichSkillSuggestion implements InstructionPayload {

        @Required
        private List<ExampleDesc> examples;

        @Required
        private FunctionDesc function;

        @Required
        private String session_id;

        @Required
        private boolean show_examples_directly;

        @Required
        private SkillDesc skill;

        public RichSkillSuggestion() {
        }

        public RichSkillSuggestion(String str, boolean z, SkillDesc skillDesc, FunctionDesc functionDesc, List<ExampleDesc> list) {
            this.session_id = str;
            this.show_examples_directly = z;
            this.skill = skillDesc;
            this.function = functionDesc;
            this.examples = list;
        }

        @Required
        public List<ExampleDesc> getExamples() {
            return this.examples;
        }

        @Required
        public FunctionDesc getFunction() {
            return this.function;
        }

        @Required
        public String getSessionId() {
            return this.session_id;
        }

        @Required
        public SkillDesc getSkill() {
            return this.skill;
        }

        @Required
        public boolean isShowExamplesDirectly() {
            return this.show_examples_directly;
        }

        @Required
        public RichSkillSuggestion setExamples(List<ExampleDesc> list) {
            this.examples = list;
            return this;
        }

        @Required
        public RichSkillSuggestion setFunction(FunctionDesc functionDesc) {
            this.function = functionDesc;
            return this;
        }

        @Required
        public RichSkillSuggestion setSessionId(String str) {
            this.session_id = str;
            return this;
        }

        @Required
        public RichSkillSuggestion setShowExamplesDirectly(boolean z) {
            this.show_examples_directly = z;
            return this;
        }

        @Required
        public RichSkillSuggestion setSkill(SkillDesc skillDesc) {
            this.skill = skillDesc;
            return this;
        }
    }

    @NamespaceName(name = "RichSkillSuggestionInfo", namespace = AIApiConstants.Suggestion.NAME)
    public static class RichSkillSuggestionInfo implements ContextPayload {

        @Required
        private String session_id;

        public RichSkillSuggestionInfo() {
        }

        public RichSkillSuggestionInfo(String str) {
            this.session_id = str;
        }

        @Required
        public String getSessionId() {
            return this.session_id;
        }

        @Required
        public RichSkillSuggestionInfo setSessionId(String str) {
            this.session_id = str;
            return this;
        }
    }

    @NamespaceName(name = "SceneInfo", namespace = AIApiConstants.Suggestion.NAME)
    public static class SceneInfo implements ContextPayload {

        @Required
        private String domain;

        @Required
        private String id;

        @Required
        private c4h intent_relation;

        @Required
        private String name;

        @Required
        private String name_cn;

        @Required
        private String query;

        @Required
        private String trigger_action;

        @Required
        private String type;

        public SceneInfo() {
        }

        public SceneInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, c4h c4hVar) {
            this.id = str;
            this.type = str2;
            this.domain = str3;
            this.name = str4;
            this.name_cn = str5;
            this.trigger_action = str6;
            this.query = str7;
            this.intent_relation = c4hVar;
        }

        @Required
        public String getDomain() {
            return this.domain;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public c4h getIntentRelation() {
            return this.intent_relation;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getNameCn() {
            return this.name_cn;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        @Required
        public String getTriggerAction() {
            return this.trigger_action;
        }

        @Required
        public String getType() {
            return this.type;
        }

        @Required
        public SceneInfo setDomain(String str) {
            this.domain = str;
            return this;
        }

        @Required
        public SceneInfo setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public SceneInfo setIntentRelation(c4h c4hVar) {
            this.intent_relation = c4hVar;
            return this;
        }

        @Required
        public SceneInfo setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public SceneInfo setNameCn(String str) {
            this.name_cn = str;
            return this;
        }

        @Required
        public SceneInfo setQuery(String str) {
            this.query = str;
            return this;
        }

        @Required
        public SceneInfo setTriggerAction(String str) {
            this.trigger_action = str;
            return this;
        }

        @Required
        public SceneInfo setType(String str) {
            this.type = str;
            return this;
        }
    }

    public static class SceneIntentInfo {

        @Required
        private String name;

        @Required
        private List<Common.SlotInfo> slots;

        public SceneIntentInfo() {
        }

        public SceneIntentInfo(String str, List<Common.SlotInfo> list) {
            this.name = str;
            this.slots = list;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public List<Common.SlotInfo> getSlots() {
            return this.slots;
        }

        @Required
        public SceneIntentInfo setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public SceneIntentInfo setSlots(List<Common.SlotInfo> list) {
            this.slots = list;
            return this;
        }
    }

    @NamespaceName(name = "SceneIntents", namespace = AIApiConstants.Suggestion.NAME)
    public static class SceneIntents implements ContextPayload {

        @Required
        private List<SceneIntentInfo> intents;

        public SceneIntents() {
        }

        public SceneIntents(List<SceneIntentInfo> list) {
            this.intents = list;
        }

        @Required
        public List<SceneIntentInfo> getIntents() {
            return this.intents;
        }

        @Required
        public SceneIntents setIntents(List<SceneIntentInfo> list) {
            this.intents = list;
            return this;
        }
    }

    public static class SkillDesc {

        @Required
        private String desc;

        @Required
        private String id;

        public SkillDesc() {
        }

        public SkillDesc(String str, String str2) {
            this.id = str;
            this.desc = str2;
        }

        @Required
        public String getDesc() {
            return this.desc;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public SkillDesc setDesc(String str) {
            this.desc = str;
            return this;
        }

        @Required
        public SkillDesc setId(String str) {
            this.id = str;
            return this;
        }
    }

    public enum SuggestPage {
        UNKNOWN(-1),
        SEARCH_PAGE(0),
        DETAIL_PAGE(1),
        PLAYER_PAGE(2),
        LIST_PAGE(3);

        private int id;

        SuggestPage(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SuggestQueryType {
        UNKNOWN(-1),
        PRIMARY_INTENTION(0),
        MULTI_INTENTION(1),
        SUGGEST_QUERY(2),
        REWRITE_QUERY(3),
        THIRD_PARTY(4),
        COMPLETE_QUERY(5),
        COMMERCIAL(6),
        COMMERCIAL_OPERATION(7),
        WEAK_INTENTION_DEFAULT(8),
        WEAK_INTENTION_OPERATION(9),
        SEARCH_DEFAULT(10),
        SEARCH_DOMAIN(11),
        DIALOG_SUGGESTION_DOMAIN(12),
        DIALOG_SUGGESTION_OPERATION(13),
        CONSUME_SUGGESTION_DOMAIN(14),
        CONSUME_SUGGESTION_OPERATION(15),
        SUBTYPE_GUIDE_DOMAIN(16),
        SUBTYPE_GUIDE_OPERATION(17),
        SUGGEST_QUERY_OPERATION(18),
        NONSENSE_SUGGESTION_DEFAULT(19),
        NONSENSE_SUGGESTION_OPERATION(20),
        USER_EDUCATION_QUERY(21);

        private int id;

        SuggestQueryType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SuggestRequestType {
        UNKNOWN(-1),
        CONTEXT(0),
        GUIDANCE(1),
        CONTRIBUTOR(2);

        private int id;

        SuggestRequestType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SuggestStage {
        UNKNOWN(-1),
        AFTER_PARSER(0),
        AFTER_PROVIDER(1);

        private int id;

        SuggestStage(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SuggestUITemplate {
        UNKNOWN(-1),
        NORMAL(0),
        BIG_CARD(1);

        private int id;

        SuggestUITemplate(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class SuggestionParam {
        private Optional<SuggestionParamInfo> primary = Optional.a();
        private Optional<SuggestionParamInfo> rewrite = Optional.a();
        private Optional<List<QuerySuggestion>> suggestions = Optional.a();

        public Optional<SuggestionParamInfo> getPrimary() {
            return this.primary;
        }

        public Optional<SuggestionParamInfo> getRewrite() {
            return this.rewrite;
        }

        public Optional<List<QuerySuggestion>> getSuggestions() {
            return this.suggestions;
        }

        public SuggestionParam setPrimary(SuggestionParamInfo suggestionParamInfo) {
            this.primary = Optional.e(suggestionParamInfo);
            return this;
        }

        public SuggestionParam setRewrite(SuggestionParamInfo suggestionParamInfo) {
            this.rewrite = Optional.e(suggestionParamInfo);
            return this;
        }

        public SuggestionParam setSuggestions(List<QuerySuggestion> list) {
            this.suggestions = Optional.e(list);
            return this;
        }
    }

    public static class ExposeQuery {

        @Required
        private String query;
        private Optional<String> send_query = Optional.a();
        private Optional<String> domain = Optional.a();

        public ExposeQuery() {
        }

        public Optional<String> getDomain() {
            return this.domain;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public Optional<String> getSendQuery() {
            return this.send_query;
        }

        public ExposeQuery setDomain(String str) {
            this.domain = Optional.e(str);
            return this;
        }

        @Required
        public ExposeQuery setQuery(String str) {
            this.query = str;
            return this;
        }

        public ExposeQuery setSendQuery(String str) {
            this.send_query = Optional.e(str);
            return this;
        }

        public ExposeQuery(String str) {
            this.query = str;
        }
    }

    @NamespaceName(name = "ShowContextSuggestions", namespace = AIApiConstants.Suggestion.NAME)
    public static class ShowContextSuggestions implements InstructionPayload {
        private Optional<CloudControlV3> cloud_control = Optional.a();
        private Optional<String> exp_id = Optional.a();

        @Required
        private List<QuerySuggestion> suggestions;

        public ShowContextSuggestions() {
        }

        public Optional<CloudControlV3> getCloudControl() {
            return this.cloud_control;
        }

        public Optional<String> getExpId() {
            return this.exp_id;
        }

        @Required
        public List<QuerySuggestion> getSuggestions() {
            return this.suggestions;
        }

        public ShowContextSuggestions setCloudControl(CloudControlV3 cloudControlV3) {
            this.cloud_control = Optional.e(cloudControlV3);
            return this;
        }

        public ShowContextSuggestions setExpId(String str) {
            this.exp_id = Optional.e(str);
            return this;
        }

        @Required
        public ShowContextSuggestions setSuggestions(List<QuerySuggestion> list) {
            this.suggestions = list;
            return this;
        }

        public ShowContextSuggestions(List<QuerySuggestion> list) {
            this.suggestions = list;
        }
    }

    @NamespaceName(name = "UploadExposeQueries", namespace = AIApiConstants.Suggestion.NAME)
    public static class UploadExposeQueries implements ContextPayload {

        @Required
        private List<ExposeQuery> expose_queries;
        private Optional<String> correlation_request = Optional.a();
        private Optional<String> invoked_by = Optional.a();

        public UploadExposeQueries() {
        }

        public Optional<String> getCorrelationRequest() {
            return this.correlation_request;
        }

        @Required
        public List<ExposeQuery> getExposeQueries() {
            return this.expose_queries;
        }

        public Optional<String> getInvokedBy() {
            return this.invoked_by;
        }

        public UploadExposeQueries setCorrelationRequest(String str) {
            this.correlation_request = Optional.e(str);
            return this;
        }

        @Required
        public UploadExposeQueries setExposeQueries(List<ExposeQuery> list) {
            this.expose_queries = list;
            return this;
        }

        public UploadExposeQueries setInvokedBy(String str) {
            this.invoked_by = Optional.e(str);
            return this;
        }

        public UploadExposeQueries(List<ExposeQuery> list) {
            this.expose_queries = list;
        }
    }

    public static class CloudControlV3 {

        @Required
        private int show_layout;

        @Required
        private boolean with_double_quotation;
        private Optional<SuggestUITemplate> ui_template = Optional.a();
        private Optional<Template.Image> card_icon = Optional.a();
        private Optional<String> button_color = Optional.a();

        public CloudControlV3() {
        }

        public Optional<String> getButtonColor() {
            return this.button_color;
        }

        public Optional<Template.Image> getCardIcon() {
            return this.card_icon;
        }

        @Required
        public int getShowLayout() {
            return this.show_layout;
        }

        public Optional<SuggestUITemplate> getUiTemplate() {
            return this.ui_template;
        }

        @Required
        public boolean isWithDoubleQuotation() {
            return this.with_double_quotation;
        }

        public CloudControlV3 setButtonColor(String str) {
            this.button_color = Optional.e(str);
            return this;
        }

        public CloudControlV3 setCardIcon(Template.Image image) {
            this.card_icon = Optional.e(image);
            return this;
        }

        @Required
        public CloudControlV3 setShowLayout(int i) {
            this.show_layout = i;
            return this;
        }

        public CloudControlV3 setUiTemplate(SuggestUITemplate suggestUITemplate) {
            this.ui_template = Optional.e(suggestUITemplate);
            return this;
        }

        @Required
        public CloudControlV3 setWithDoubleQuotation(boolean z) {
            this.with_double_quotation = z;
            return this;
        }

        public CloudControlV3(int i, boolean z) {
            this.show_layout = i;
            this.with_double_quotation = z;
        }
    }

    public static class QuerySuggestionRedirectionAppDownloadOrLink {

        @Required
        private String package_name;
        private Optional<String> deep_link_uri = Optional.a();
        private Optional<String> app_download_uri = Optional.a();
        private Optional<String> app_store_detail_page_uri = Optional.a();

        public QuerySuggestionRedirectionAppDownloadOrLink() {
        }

        public Optional<String> getAppDownloadUri() {
            return this.app_download_uri;
        }

        public Optional<String> getAppStoreDetailPageUri() {
            return this.app_store_detail_page_uri;
        }

        public Optional<String> getDeepLinkUri() {
            return this.deep_link_uri;
        }

        @Required
        public String getPackageName() {
            return this.package_name;
        }

        public QuerySuggestionRedirectionAppDownloadOrLink setAppDownloadUri(String str) {
            this.app_download_uri = Optional.e(str);
            return this;
        }

        public QuerySuggestionRedirectionAppDownloadOrLink setAppStoreDetailPageUri(String str) {
            this.app_store_detail_page_uri = Optional.e(str);
            return this;
        }

        public QuerySuggestionRedirectionAppDownloadOrLink setDeepLinkUri(String str) {
            this.deep_link_uri = Optional.e(str);
            return this;
        }

        @Required
        public QuerySuggestionRedirectionAppDownloadOrLink setPackageName(String str) {
            this.package_name = str;
            return this;
        }

        public QuerySuggestionRedirectionAppDownloadOrLink(String str) {
            this.package_name = str;
        }
    }

    public static class SuggestionParamInfo {

        @Required
        private List<Common.PropItem> entities;

        @Required
        private List<String> suggestion_type;
        private Optional<String> domain = Optional.a();
        private Optional<String> func = Optional.a();
        private Optional<SuggestPage> page = Optional.a();

        public SuggestionParamInfo() {
        }

        public Optional<String> getDomain() {
            return this.domain;
        }

        @Required
        public List<Common.PropItem> getEntities() {
            return this.entities;
        }

        public Optional<String> getFunc() {
            return this.func;
        }

        public Optional<SuggestPage> getPage() {
            return this.page;
        }

        @Required
        public List<String> getSuggestionType() {
            return this.suggestion_type;
        }

        public SuggestionParamInfo setDomain(String str) {
            this.domain = Optional.e(str);
            return this;
        }

        @Required
        public SuggestionParamInfo setEntities(List<Common.PropItem> list) {
            this.entities = list;
            return this;
        }

        public SuggestionParamInfo setFunc(String str) {
            this.func = Optional.e(str);
            return this;
        }

        public SuggestionParamInfo setPage(SuggestPage suggestPage) {
            this.page = Optional.e(suggestPage);
            return this;
        }

        @Required
        public SuggestionParamInfo setSuggestionType(List<String> list) {
            this.suggestion_type = list;
            return this;
        }

        public SuggestionParamInfo(List<Common.PropItem> list, List<String> list2) {
            this.entities = list;
            this.suggestion_type = list2;
        }
    }

    @NamespaceName(name = "ResultsPageEducationSuggestion", namespace = AIApiConstants.Suggestion.NAME)
    public static class ResultsPageEducationSuggestion implements InstructionPayload {

        @Required
        private String exp_id;

        @Required
        private List<QueryInfo> queryInfos;
        private Optional<String> card_title = Optional.a();
        private Optional<String> card_button_text = Optional.a();
        private Optional<String> card_button_url = Optional.a();
        private Optional<ResultsPageCardSizeType> card_size_type = Optional.a();

        public ResultsPageEducationSuggestion() {
        }

        public Optional<String> getCardButtonText() {
            return this.card_button_text;
        }

        public Optional<String> getCardButtonUrl() {
            return this.card_button_url;
        }

        public Optional<ResultsPageCardSizeType> getCardSizeType() {
            return this.card_size_type;
        }

        public Optional<String> getCardTitle() {
            return this.card_title;
        }

        @Required
        public String getExpId() {
            return this.exp_id;
        }

        @Required
        public List<QueryInfo> getQueryInfos() {
            return this.queryInfos;
        }

        public ResultsPageEducationSuggestion setCardButtonText(String str) {
            this.card_button_text = Optional.e(str);
            return this;
        }

        public ResultsPageEducationSuggestion setCardButtonUrl(String str) {
            this.card_button_url = Optional.e(str);
            return this;
        }

        public ResultsPageEducationSuggestion setCardSizeType(ResultsPageCardSizeType resultsPageCardSizeType) {
            this.card_size_type = Optional.e(resultsPageCardSizeType);
            return this;
        }

        public ResultsPageEducationSuggestion setCardTitle(String str) {
            this.card_title = Optional.e(str);
            return this;
        }

        @Required
        public ResultsPageEducationSuggestion setExpId(String str) {
            this.exp_id = str;
            return this;
        }

        @Required
        public ResultsPageEducationSuggestion setQueryInfos(List<QueryInfo> list) {
            this.queryInfos = list;
            return this;
        }

        public ResultsPageEducationSuggestion(String str, List<QueryInfo> list) {
            this.exp_id = str;
            this.queryInfos = list;
        }
    }

    public static class SuggestionItem {

        @Required
        private String domain;

        @Required
        private String query;
        private Optional<String> type = Optional.a();
        private Optional<String> pkg_name = Optional.a();
        private Optional<Integer> min_version = Optional.a();
        private Optional<Template.Image> skill_icon = Optional.a();

        public SuggestionItem() {
        }

        @Required
        public String getDomain() {
            return this.domain;
        }

        public Optional<Integer> getMinVersion() {
            return this.min_version;
        }

        public Optional<String> getPkgName() {
            return this.pkg_name;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public Optional<Template.Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<String> getType() {
            return this.type;
        }

        @Required
        public SuggestionItem setDomain(String str) {
            this.domain = str;
            return this;
        }

        public SuggestionItem setMinVersion(int i) {
            this.min_version = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SuggestionItem setPkgName(String str) {
            this.pkg_name = Optional.e(str);
            return this;
        }

        @Required
        public SuggestionItem setQuery(String str) {
            this.query = str;
            return this;
        }

        public SuggestionItem setSkillIcon(Template.Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public SuggestionItem setType(String str) {
            this.type = Optional.e(str);
            return this;
        }

        public SuggestionItem(String str, String str2) {
            this.query = str;
            this.domain = str2;
        }
    }

    public static class ShortCutSuggestion {

        @Required
        private String brief;

        @Required
        private String description;

        @Required
        private int minAiVersion;

        @Required
        private String name;

        @Required
        private String skill_id;

        @Required
        private String text_color;

        @Required
        private int version;
        private Optional<String> icon = Optional.a();
        private Optional<String> icon_border_color = Optional.a();
        private Optional<String> bg_image = Optional.a();
        private Optional<String> bg_color = Optional.a();
        private Optional<String> border_color = Optional.a();

        public ShortCutSuggestion() {
        }

        public Optional<String> getBgColor() {
            return this.bg_color;
        }

        public Optional<String> getBgImage() {
            return this.bg_image;
        }

        public Optional<String> getBorderColor() {
            return this.border_color;
        }

        @Required
        public String getBrief() {
            return this.brief;
        }

        @Required
        public String getDescription() {
            return this.description;
        }

        public Optional<String> getIcon() {
            return this.icon;
        }

        public Optional<String> getIconBorderColor() {
            return this.icon_border_color;
        }

        @Required
        public int getMinAiVersion() {
            return this.minAiVersion;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getSkillId() {
            return this.skill_id;
        }

        @Required
        public String getTextColor() {
            return this.text_color;
        }

        @Required
        public int getVersion() {
            return this.version;
        }

        public ShortCutSuggestion setBgColor(String str) {
            this.bg_color = Optional.e(str);
            return this;
        }

        public ShortCutSuggestion setBgImage(String str) {
            this.bg_image = Optional.e(str);
            return this;
        }

        public ShortCutSuggestion setBorderColor(String str) {
            this.border_color = Optional.e(str);
            return this;
        }

        @Required
        public ShortCutSuggestion setBrief(String str) {
            this.brief = str;
            return this;
        }

        @Required
        public ShortCutSuggestion setDescription(String str) {
            this.description = str;
            return this;
        }

        public ShortCutSuggestion setIcon(String str) {
            this.icon = Optional.e(str);
            return this;
        }

        public ShortCutSuggestion setIconBorderColor(String str) {
            this.icon_border_color = Optional.e(str);
            return this;
        }

        @Required
        public ShortCutSuggestion setMinAiVersion(int i) {
            this.minAiVersion = i;
            return this;
        }

        @Required
        public ShortCutSuggestion setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public ShortCutSuggestion setSkillId(String str) {
            this.skill_id = str;
            return this;
        }

        @Required
        public ShortCutSuggestion setTextColor(String str) {
            this.text_color = str;
            return this;
        }

        @Required
        public ShortCutSuggestion setVersion(int i) {
            this.version = i;
            return this;
        }

        public ShortCutSuggestion(String str, String str2, String str3, String str4, int i, int i2, String str5) {
            this.skill_id = str;
            this.name = str2;
            this.brief = str3;
            this.description = str4;
            this.version = i;
            this.minAiVersion = i2;
            this.text_color = str5;
        }
    }

    public static class QuerySuggestion {

        @Required
        private String query;

        @Required
        private float score;

        @Required
        private SuggestQueryType suggest_query_type;

        @Required
        private List<String> tags;
        private Optional<String> send_query = Optional.a();
        private Optional<String> domain = Optional.a();
        private Optional<String> pkg_name = Optional.a();
        private Optional<Integer> min_version = Optional.a();
        private Optional<Template.Image> icon = Optional.a();
        private Optional<ShortCutSuggestion> shortcut = Optional.a();
        private Optional<String> norm_query = Optional.a();
        private Optional<String> query_id = Optional.a();
        private Optional<String> classfication = Optional.a();
        private Optional<String> category = Optional.a();
        private Optional<String> subcategory = Optional.a();
        private Optional<String> module = Optional.a();
        private Optional<String> function = Optional.a();
        private Optional<Template.CustomBackground> background = Optional.a();
        private Optional<c4h> context = Optional.a();
        private Optional<List<String>> view_monitor_urls = Optional.a();
        private Optional<List<String>> click_monitor_urls = Optional.a();
        private Optional<String> ads_track_extension = Optional.a();
        private Optional<QuerySuggestionRedirection> redirection = Optional.a();
        private Optional<String> logo_text = Optional.a();
        private Optional<String> tag_id = Optional.a();
        private Optional<String> tracking_strategy = Optional.a();

        public QuerySuggestion() {
        }

        public Optional<String> getAdsTrackExtension() {
            return this.ads_track_extension;
        }

        public Optional<Template.CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<String> getClassfication() {
            return this.classfication;
        }

        public Optional<List<String>> getClickMonitorUrls() {
            return this.click_monitor_urls;
        }

        public Optional<c4h> getContext() {
            return this.context;
        }

        public Optional<String> getDomain() {
            return this.domain;
        }

        public Optional<String> getFunction() {
            return this.function;
        }

        public Optional<Template.Image> getIcon() {
            return this.icon;
        }

        public Optional<String> getLogoText() {
            return this.logo_text;
        }

        public Optional<Integer> getMinVersion() {
            return this.min_version;
        }

        public Optional<String> getModule() {
            return this.module;
        }

        public Optional<String> getNormQuery() {
            return this.norm_query;
        }

        public Optional<String> getPkgName() {
            return this.pkg_name;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public Optional<String> getQueryId() {
            return this.query_id;
        }

        public Optional<QuerySuggestionRedirection> getRedirection() {
            return this.redirection;
        }

        @Required
        public float getScore() {
            return this.score;
        }

        public Optional<String> getSendQuery() {
            return this.send_query;
        }

        public Optional<ShortCutSuggestion> getShortcut() {
            return this.shortcut;
        }

        public Optional<String> getSubcategory() {
            return this.subcategory;
        }

        @Required
        public SuggestQueryType getSuggestQueryType() {
            return this.suggest_query_type;
        }

        public Optional<String> getTagId() {
            return this.tag_id;
        }

        @Required
        public List<String> getTags() {
            return this.tags;
        }

        public Optional<String> getTrackingStrategy() {
            return this.tracking_strategy;
        }

        public Optional<List<String>> getViewMonitorUrls() {
            return this.view_monitor_urls;
        }

        public QuerySuggestion setAdsTrackExtension(String str) {
            this.ads_track_extension = Optional.e(str);
            return this;
        }

        public QuerySuggestion setBackground(Template.CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public QuerySuggestion setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        public QuerySuggestion setClassfication(String str) {
            this.classfication = Optional.e(str);
            return this;
        }

        public QuerySuggestion setClickMonitorUrls(List<String> list) {
            this.click_monitor_urls = Optional.e(list);
            return this;
        }

        public QuerySuggestion setContext(c4h c4hVar) {
            this.context = Optional.e(c4hVar);
            return this;
        }

        public QuerySuggestion setDomain(String str) {
            this.domain = Optional.e(str);
            return this;
        }

        public QuerySuggestion setFunction(String str) {
            this.function = Optional.e(str);
            return this;
        }

        public QuerySuggestion setIcon(Template.Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public QuerySuggestion setLogoText(String str) {
            this.logo_text = Optional.e(str);
            return this;
        }

        public QuerySuggestion setMinVersion(int i) {
            this.min_version = Optional.e(Integer.valueOf(i));
            return this;
        }

        public QuerySuggestion setModule(String str) {
            this.module = Optional.e(str);
            return this;
        }

        public QuerySuggestion setNormQuery(String str) {
            this.norm_query = Optional.e(str);
            return this;
        }

        public QuerySuggestion setPkgName(String str) {
            this.pkg_name = Optional.e(str);
            return this;
        }

        @Required
        public QuerySuggestion setQuery(String str) {
            this.query = str;
            return this;
        }

        public QuerySuggestion setQueryId(String str) {
            this.query_id = Optional.e(str);
            return this;
        }

        public QuerySuggestion setRedirection(QuerySuggestionRedirection querySuggestionRedirection) {
            this.redirection = Optional.e(querySuggestionRedirection);
            return this;
        }

        @Required
        public QuerySuggestion setScore(float f) {
            this.score = f;
            return this;
        }

        public QuerySuggestion setSendQuery(String str) {
            this.send_query = Optional.e(str);
            return this;
        }

        public QuerySuggestion setShortcut(ShortCutSuggestion shortCutSuggestion) {
            this.shortcut = Optional.e(shortCutSuggestion);
            return this;
        }

        public QuerySuggestion setSubcategory(String str) {
            this.subcategory = Optional.e(str);
            return this;
        }

        @Required
        public QuerySuggestion setSuggestQueryType(SuggestQueryType suggestQueryType) {
            this.suggest_query_type = suggestQueryType;
            return this;
        }

        public QuerySuggestion setTagId(String str) {
            this.tag_id = Optional.e(str);
            return this;
        }

        @Required
        public QuerySuggestion setTags(List<String> list) {
            this.tags = list;
            return this;
        }

        public QuerySuggestion setTrackingStrategy(String str) {
            this.tracking_strategy = Optional.e(str);
            return this;
        }

        public QuerySuggestion setViewMonitorUrls(List<String> list) {
            this.view_monitor_urls = Optional.e(list);
            return this;
        }

        public QuerySuggestion(String str, float f, SuggestQueryType suggestQueryType, List<String> list) {
            this.query = str;
            this.score = f;
            this.suggest_query_type = suggestQueryType;
            this.tags = list;
        }
    }
}
