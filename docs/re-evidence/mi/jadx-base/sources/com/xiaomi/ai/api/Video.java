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
public class Video {

    public enum CPAppType {
        UNKNOWN(-1),
        TENCENT_VIDEO(0),
        IQIYI(1),
        YOUKU(2),
        MANGGUO_TV(3),
        BILIBILI(4),
        MI_PLAYER(5),
        VIPKID(6),
        MAOYAN(7),
        DOUBAN(8),
        SOUHU(9);

        private int id;

        CPAppType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "CurrentPageState", namespace = "Video")
    public static class CurrentPageState implements ContextPayload {

        @Required
        private List<ResourceEntity> entity;

        @Required
        private PageType page_type;

        public CurrentPageState() {
        }

        public CurrentPageState(PageType pageType, List<ResourceEntity> list) {
            this.page_type = pageType;
            this.entity = list;
        }

        @Required
        public List<ResourceEntity> getEntity() {
            return this.entity;
        }

        @Required
        public PageType getPageType() {
            return this.page_type;
        }

        @Required
        public CurrentPageState setEntity(List<ResourceEntity> list) {
            this.entity = list;
            return this;
        }

        @Required
        public CurrentPageState setPageType(PageType pageType) {
            this.page_type = pageType;
            return this;
        }
    }

    @NamespaceName(name = "Disambiguation", namespace = "Video")
    public static class Disambiguation implements InstructionPayload {

        @Required
        private List<VideoSearchItemWithTag> candidates;

        public Disambiguation() {
        }

        public Disambiguation(List<VideoSearchItemWithTag> list) {
            this.candidates = list;
        }

        @Required
        public List<VideoSearchItemWithTag> getCandidates() {
            return this.candidates;
        }

        @Required
        public Disambiguation setCandidates(List<VideoSearchItemWithTag> list) {
            this.candidates = list;
            return this;
        }
    }

    public enum DisplayCategory {
        UNKNOWN(-1),
        MOVIE(0),
        SERIES(1),
        CHILD(2),
        CARTOON(3),
        VARIETY(4),
        DOCUMENTARY(5),
        OTHER(6);

        private int id;

        DisplayCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class DisplayCornerImage {
        private Optional<String> url = Optional.a();
        private Optional<Integer> tv_screen_type = Optional.a();

        public Optional<Integer> getTvScreenType() {
            return this.tv_screen_type;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public DisplayCornerImage setTvScreenType(int i) {
            this.tv_screen_type = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DisplayCornerImage setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "DisplayDetails", namespace = "Video")
    public static class DisplayDetails implements EventPayload {

        @Required
        private String ref;

        @Required
        private long ts;

        @Required
        private String video_id;

        public DisplayDetails() {
        }

        public DisplayDetails(String str, String str2, long j) {
            this.video_id = str;
            this.ref = str2;
            this.ts = j;
        }

        @Required
        public String getRef() {
            return this.ref;
        }

        @Required
        public long getTs() {
            return this.ts;
        }

        @Required
        public String getVideoId() {
            return this.video_id;
        }

        @Required
        public DisplayDetails setRef(String str) {
            this.ref = str;
            return this;
        }

        @Required
        public DisplayDetails setTs(long j) {
            this.ts = j;
            return this;
        }

        @Required
        public DisplayDetails setVideoId(String str) {
            this.video_id = str;
            return this;
        }
    }

    public enum DisplayMatchLevel {
        UNKNOWN(-1),
        IP_ACCUREATE(0),
        ACCURATE(1),
        RELEVANT(2),
        RECOMMEND(3);

        private int id;

        DisplayMatchLevel(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DisplayMode {
        UNKNOWN(-1),
        DEFAULT(0),
        IP_MODE(1),
        AUTO_PLAY_CHILD(2),
        AUTO_PLAY_MOVIE(3);

        private int id;

        DisplayMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class DisplayRating {
        private Optional<String> rating_source = Optional.a();
        private Optional<Double> score = Optional.a();

        public Optional<String> getRatingSource() {
            return this.rating_source;
        }

        public Optional<Double> getScore() {
            return this.score;
        }

        public DisplayRating setRatingSource(String str) {
            this.rating_source = Optional.e(str);
            return this;
        }

        public DisplayRating setScore(double d) {
            this.score = Optional.e(Double.valueOf(d));
            return this;
        }
    }

    public enum MaterialOperationAction {
        UNKNOWN(-1),
        SEARCH(0),
        EDIT(1);

        private int id;

        MaterialOperationAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MediaVipType {
        UNKNOWN(-1),
        MOVIES(1),
        KIDS(2),
        EDU(3);

        private int id;

        MediaVipType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum PageType {
        UNKNOWN(-1),
        SEARCH_PAGE(0),
        DETAIL_PAGE(1),
        PLAYING_PAGE(2),
        PW_AUTO_PLAY_PAGE(3),
        AUTO_PLAY_PAGE(4),
        SEARCH_PAGE_V2(5);

        private int id;

        PageType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SearchTagsReset", namespace = "Video")
    public static class SearchTagsReset implements EventPayload {
        private Optional<List<VideoSearchTags>> tags = Optional.a();

        public Optional<List<VideoSearchTags>> getTags() {
            return this.tags;
        }

        public SearchTagsReset setTags(List<VideoSearchTags> list) {
            this.tags = Optional.e(list);
            return this;
        }
    }

    @NamespaceName(name = "SearchTagsTVPersonPhrase2", namespace = "Video")
    public static class SearchTagsTVPersonPhrase2 implements EventPayload {
        private Optional<List<VideoSearchTags>> tags = Optional.a();

        public Optional<List<VideoSearchTags>> getTags() {
            return this.tags;
        }

        public SearchTagsTVPersonPhrase2 setTags(List<VideoSearchTags> list) {
            this.tags = Optional.e(list);
            return this;
        }
    }

    @NamespaceName(name = "ShowDetailPage", namespace = "Video")
    public static class ShowDetailPage implements InstructionPayload {

        @Required
        private VideoSearchItem item;

        public ShowDetailPage() {
        }

        public ShowDetailPage(VideoSearchItem videoSearchItem) {
            this.item = videoSearchItem;
        }

        @Required
        public VideoSearchItem getItem() {
            return this.item;
        }

        @Required
        public ShowDetailPage setItem(VideoSearchItem videoSearchItem) {
            this.item = videoSearchItem;
            return this;
        }
    }

    @NamespaceName(name = "VideoCut", namespace = "Video")
    public static class VideoCut implements InstructionPayload {
        private Optional<MaterialOperationAction> action = Optional.a();
        private Optional<String> query = Optional.a();
        private Optional<List<Common.VideoCutMessage>> message_list = Optional.a();
        private Optional<String> suc_hits = Optional.a();
        private Optional<List<Common.ClipResource>> clip_resource = Optional.a();
        private Optional<String> fail_hits = Optional.a();

        public Optional<MaterialOperationAction> getAction() {
            return this.action;
        }

        public Optional<List<Common.ClipResource>> getClipResource() {
            return this.clip_resource;
        }

        public Optional<String> getFailHits() {
            return this.fail_hits;
        }

        public Optional<List<Common.VideoCutMessage>> getMessageList() {
            return this.message_list;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<String> getSucHits() {
            return this.suc_hits;
        }

        public VideoCut setAction(MaterialOperationAction materialOperationAction) {
            this.action = Optional.e(materialOperationAction);
            return this;
        }

        public VideoCut setClipResource(List<Common.ClipResource> list) {
            this.clip_resource = Optional.e(list);
            return this;
        }

        public VideoCut setFailHits(String str) {
            this.fail_hits = Optional.e(str);
            return this;
        }

        public VideoCut setMessageList(List<Common.VideoCutMessage> list) {
            this.message_list = Optional.e(list);
            return this;
        }

        public VideoCut setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public VideoCut setSucHits(String str) {
            this.suc_hits = Optional.e(str);
            return this;
        }
    }

    public static class VideoExtra {
        private Optional<Integer> publish_year = Optional.a();
        private Optional<Float> rating = Optional.a();
        private Optional<ThirdPartyContentProvider> third_cp = Optional.a();
        private Optional<String> language = Optional.a();
        private Optional<Boolean> free = Optional.a();
        private Optional<String> category = Optional.a();
        private Optional<c4h> log = Optional.a();
        private Optional<DisplayRating> display_rating = Optional.a();
        private Optional<DisplayCornerImage> display_corner_image = Optional.a();
        private Optional<DisplayMatchLevel> display_match_level = Optional.a();
        private Optional<DisplayCategory> display_category = Optional.a();
        private Optional<String> display_age = Optional.a();
        private Optional<String> display_episode = Optional.a();
        private Optional<String> display_info = Optional.a();
        private Optional<VideoPlayer.VideoResourceType> resource_type = Optional.a();
        private Optional<VideoPlayer.ResourceDisplayStyle> resource_display_style = Optional.a();
        private Optional<Boolean> is_own_resource = Optional.a();
        private Optional<String> artist = Optional.a();
        private Optional<String> region = Optional.a();
        private Optional<Template.AndroidIntent> play_intent = Optional.a();

        public Optional<String> getArtist() {
            return this.artist;
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<String> getDisplayAge() {
            return this.display_age;
        }

        public Optional<DisplayCategory> getDisplayCategory() {
            return this.display_category;
        }

        public Optional<DisplayCornerImage> getDisplayCornerImage() {
            return this.display_corner_image;
        }

        public Optional<String> getDisplayEpisode() {
            return this.display_episode;
        }

        public Optional<String> getDisplayInfo() {
            return this.display_info;
        }

        public Optional<DisplayMatchLevel> getDisplayMatchLevel() {
            return this.display_match_level;
        }

        public Optional<DisplayRating> getDisplayRating() {
            return this.display_rating;
        }

        public Optional<String> getLanguage() {
            return this.language;
        }

        public Optional<c4h> getLog() {
            return this.log;
        }

        public Optional<Template.AndroidIntent> getPlayIntent() {
            return this.play_intent;
        }

        public Optional<Integer> getPublishYear() {
            return this.publish_year;
        }

        public Optional<Float> getRating() {
            return this.rating;
        }

        public Optional<String> getRegion() {
            return this.region;
        }

        public Optional<VideoPlayer.ResourceDisplayStyle> getResourceDisplayStyle() {
            return this.resource_display_style;
        }

        public Optional<VideoPlayer.VideoResourceType> getResourceType() {
            return this.resource_type;
        }

        public Optional<ThirdPartyContentProvider> getThirdCp() {
            return this.third_cp;
        }

        public Optional<Boolean> isFree() {
            return this.free;
        }

        public Optional<Boolean> isOwnResource() {
            return this.is_own_resource;
        }

        public VideoExtra setArtist(String str) {
            this.artist = Optional.e(str);
            return this;
        }

        public VideoExtra setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        public VideoExtra setDisplayAge(String str) {
            this.display_age = Optional.e(str);
            return this;
        }

        public VideoExtra setDisplayCategory(DisplayCategory displayCategory) {
            this.display_category = Optional.e(displayCategory);
            return this;
        }

        public VideoExtra setDisplayCornerImage(DisplayCornerImage displayCornerImage) {
            this.display_corner_image = Optional.e(displayCornerImage);
            return this;
        }

        public VideoExtra setDisplayEpisode(String str) {
            this.display_episode = Optional.e(str);
            return this;
        }

        public VideoExtra setDisplayInfo(String str) {
            this.display_info = Optional.e(str);
            return this;
        }

        public VideoExtra setDisplayMatchLevel(DisplayMatchLevel displayMatchLevel) {
            this.display_match_level = Optional.e(displayMatchLevel);
            return this;
        }

        public VideoExtra setDisplayRating(DisplayRating displayRating) {
            this.display_rating = Optional.e(displayRating);
            return this;
        }

        public VideoExtra setFree(boolean z) {
            this.free = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VideoExtra setIsOwnResource(boolean z) {
            this.is_own_resource = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VideoExtra setLanguage(String str) {
            this.language = Optional.e(str);
            return this;
        }

        public VideoExtra setLog(c4h c4hVar) {
            this.log = Optional.e(c4hVar);
            return this;
        }

        public VideoExtra setPlayIntent(Template.AndroidIntent androidIntent) {
            this.play_intent = Optional.e(androidIntent);
            return this;
        }

        public VideoExtra setPublishYear(int i) {
            this.publish_year = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VideoExtra setRating(float f) {
            this.rating = Optional.e(Float.valueOf(f));
            return this;
        }

        public VideoExtra setRegion(String str) {
            this.region = Optional.e(str);
            return this;
        }

        public VideoExtra setResourceDisplayStyle(VideoPlayer.ResourceDisplayStyle resourceDisplayStyle) {
            this.resource_display_style = Optional.e(resourceDisplayStyle);
            return this;
        }

        public VideoExtra setResourceType(VideoPlayer.VideoResourceType videoResourceType) {
            this.resource_type = Optional.e(videoResourceType);
            return this;
        }

        public VideoExtra setThirdCp(ThirdPartyContentProvider thirdPartyContentProvider) {
            this.third_cp = Optional.e(thirdPartyContentProvider);
            return this;
        }
    }

    public enum VideoRecogAction {
        RECG(0),
        FIND(1),
        RUNAPP(2),
        UNKNOWN(3);

        private int id;

        VideoRecogAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum VideoRecogActionType {
        UNKNOWN(-1),
        FIRST_APPEARANCE(0),
        TIMES(1);

        private int id;

        VideoRecogActionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum VideoRecogDirection {
        UNKNOWN(-1),
        RIGHT(0),
        LEFT(1),
        UP(2),
        DOWN(3),
        FRONT(4),
        BACK(5),
        MID(6);

        private int id;

        VideoRecogDirection(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum VideoRecogTarget {
        UNKNOWN(-1),
        PERSON(0),
        LOCATION(1),
        OBJECT(2);

        private int id;

        VideoRecogTarget(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class VideoSearchCursor {
        private Optional<String> url = Optional.a();
        private Optional<String> intent = Optional.a();

        public Optional<String> getIntent() {
            return this.intent;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public VideoSearchCursor setIntent(String str) {
            this.intent = Optional.e(str);
            return this;
        }

        public VideoSearchCursor setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }
    }

    public static class VideoSearchItemWithTag {

        @Required
        private VideoSearchItem item;

        @Required
        private List<VideoSearchTags> tags;

        public VideoSearchItemWithTag() {
        }

        public VideoSearchItemWithTag(VideoSearchItem videoSearchItem, List<VideoSearchTags> list) {
            this.item = videoSearchItem;
            this.tags = list;
        }

        @Required
        public VideoSearchItem getItem() {
            return this.item;
        }

        @Required
        public List<VideoSearchTags> getTags() {
            return this.tags;
        }

        @Required
        public VideoSearchItemWithTag setItem(VideoSearchItem videoSearchItem) {
            this.item = videoSearchItem;
            return this;
        }

        @Required
        public VideoSearchItemWithTag setTags(List<VideoSearchTags> list) {
            this.tags = list;
            return this;
        }
    }

    public static class VideoSearchSlot {

        @Required
        private String attribute;

        @Required
        private String value;

        public VideoSearchSlot() {
        }

        public VideoSearchSlot(String str, String str2) {
            this.attribute = str;
            this.value = str2;
        }

        @Required
        public String getAttribute() {
            return this.attribute;
        }

        @Required
        public String getValue() {
            return this.value;
        }

        @Required
        public VideoSearchSlot setAttribute(String str) {
            this.attribute = str;
            return this;
        }

        @Required
        public VideoSearchSlot setValue(String str) {
            this.value = str;
            return this;
        }
    }

    public static class VideoSearchTags {

        @Required
        private VideoSearchSlot slot;

        @Required
        private String text;

        public VideoSearchTags() {
        }

        public VideoSearchTags(String str, VideoSearchSlot videoSearchSlot) {
            this.text = str;
            this.slot = videoSearchSlot;
        }

        @Required
        public VideoSearchSlot getSlot() {
            return this.slot;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public VideoSearchTags setSlot(VideoSearchSlot videoSearchSlot) {
            this.slot = videoSearchSlot;
            return this;
        }

        @Required
        public VideoSearchTags setText(String str) {
            this.text = str;
            return this;
        }
    }

    @NamespaceName(name = "SearchHistory", namespace = "Video")
    public static class SearchHistory implements InstructionPayload {
        private Optional<String> date = Optional.a();

        @Required
        private boolean play_after_search;

        @Required
        private List<VideoSearchTags> slots;

        public SearchHistory() {
        }

        public Optional<String> getDate() {
            return this.date;
        }

        @Required
        public List<VideoSearchTags> getSlots() {
            return this.slots;
        }

        @Required
        public boolean isPlayAfterSearch() {
            return this.play_after_search;
        }

        public SearchHistory setDate(String str) {
            this.date = Optional.e(str);
            return this;
        }

        @Required
        public SearchHistory setPlayAfterSearch(boolean z) {
            this.play_after_search = z;
            return this;
        }

        @Required
        public SearchHistory setSlots(List<VideoSearchTags> list) {
            this.slots = list;
            return this;
        }

        public SearchHistory(List<VideoSearchTags> list, boolean z) {
            this.slots = list;
            this.play_after_search = z;
        }
    }

    @NamespaceName(name = "VideoRecgV0", namespace = "Video")
    public static class VideoRecgV0 implements InstructionPayload {

        @Required
        private String operation;

        @Required
        private String target;
        private Optional<String> direction = Optional.a();
        private Optional<String> artist = Optional.a();
        private Optional<String> gender = Optional.a();

        public VideoRecgV0() {
        }

        public Optional<String> getArtist() {
            return this.artist;
        }

        public Optional<String> getDirection() {
            return this.direction;
        }

        public Optional<String> getGender() {
            return this.gender;
        }

        @Required
        public String getOperation() {
            return this.operation;
        }

        @Required
        public String getTarget() {
            return this.target;
        }

        public VideoRecgV0 setArtist(String str) {
            this.artist = Optional.e(str);
            return this;
        }

        public VideoRecgV0 setDirection(String str) {
            this.direction = Optional.e(str);
            return this;
        }

        public VideoRecgV0 setGender(String str) {
            this.gender = Optional.e(str);
            return this;
        }

        @Required
        public VideoRecgV0 setOperation(String str) {
            this.operation = str;
            return this;
        }

        @Required
        public VideoRecgV0 setTarget(String str) {
            this.target = str;
            return this;
        }

        public VideoRecgV0(String str, String str2) {
            this.operation = str;
            this.target = str2;
        }
    }

    public static class VideoSearchItem {

        @Required
        private String id;

        @Required
        private String name;

        @Required
        private Template.Image poster;
        private Optional<VideoExtra> extra = Optional.a();
        private Optional<String> meta_id = Optional.a();
        private Optional<Template.Image> horizontal_poster = Optional.a();

        public VideoSearchItem() {
        }

        public Optional<VideoExtra> getExtra() {
            return this.extra;
        }

        public Optional<Template.Image> getHorizontalPoster() {
            return this.horizontal_poster;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<String> getMetaId() {
            return this.meta_id;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public Template.Image getPoster() {
            return this.poster;
        }

        public VideoSearchItem setExtra(VideoExtra videoExtra) {
            this.extra = Optional.e(videoExtra);
            return this;
        }

        public VideoSearchItem setHorizontalPoster(Template.Image image) {
            this.horizontal_poster = Optional.e(image);
            return this;
        }

        @Required
        public VideoSearchItem setId(String str) {
            this.id = str;
            return this;
        }

        public VideoSearchItem setMetaId(String str) {
            this.meta_id = Optional.e(str);
            return this;
        }

        @Required
        public VideoSearchItem setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public VideoSearchItem setPoster(Template.Image image) {
            this.poster = image;
            return this;
        }

        public VideoSearchItem(String str, String str2, Template.Image image) {
            this.name = str;
            this.id = str2;
            this.poster = image;
        }
    }

    public static class VideoRecogIntention {

        @Required
        private VideoRecogAction action;

        @Required
        private VideoRecogTarget target;
        private Optional<VideoRecogActionType> type = Optional.a();
        private Optional<VideoRecogDirection> direction = Optional.a();
        private Optional<Common.GenderType> gender = Optional.a();
        private Optional<String> artist = Optional.a();

        public VideoRecogIntention() {
        }

        @Required
        public VideoRecogAction getAction() {
            return this.action;
        }

        public Optional<String> getArtist() {
            return this.artist;
        }

        public Optional<VideoRecogDirection> getDirection() {
            return this.direction;
        }

        public Optional<Common.GenderType> getGender() {
            return this.gender;
        }

        @Required
        public VideoRecogTarget getTarget() {
            return this.target;
        }

        public Optional<VideoRecogActionType> getType() {
            return this.type;
        }

        @Required
        public VideoRecogIntention setAction(VideoRecogAction videoRecogAction) {
            this.action = videoRecogAction;
            return this;
        }

        public VideoRecogIntention setArtist(String str) {
            this.artist = Optional.e(str);
            return this;
        }

        public VideoRecogIntention setDirection(VideoRecogDirection videoRecogDirection) {
            this.direction = Optional.e(videoRecogDirection);
            return this;
        }

        public VideoRecogIntention setGender(Common.GenderType genderType) {
            this.gender = Optional.e(genderType);
            return this;
        }

        @Required
        public VideoRecogIntention setTarget(VideoRecogTarget videoRecogTarget) {
            this.target = videoRecogTarget;
            return this;
        }

        public VideoRecogIntention setType(VideoRecogActionType videoRecogActionType) {
            this.type = Optional.e(videoRecogActionType);
            return this;
        }

        public VideoRecogIntention(VideoRecogAction videoRecogAction, VideoRecogTarget videoRecogTarget) {
            this.action = videoRecogAction;
            this.target = videoRecogTarget;
        }
    }

    public static class ResourceEntity {

        @Required
        private String id;

        @Required
        private String name;
        private Optional<Integer> index = Optional.a();
        private Optional<String> category = Optional.a();
        private Optional<Integer> cur_episode = Optional.a();
        private Optional<String> result_type = Optional.a();
        private Optional<Boolean> labeled = Optional.a();
        private Optional<String> meta_id = Optional.a();

        public ResourceEntity() {
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<Integer> getCurEpisode() {
            return this.cur_episode;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<Integer> getIndex() {
            return this.index;
        }

        public Optional<String> getMetaId() {
            return this.meta_id;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<String> getResultType() {
            return this.result_type;
        }

        public Optional<Boolean> isLabeled() {
            return this.labeled;
        }

        public ResourceEntity setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        public ResourceEntity setCurEpisode(int i) {
            this.cur_episode = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public ResourceEntity setId(String str) {
            this.id = str;
            return this;
        }

        public ResourceEntity setIndex(int i) {
            this.index = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ResourceEntity setLabeled(boolean z) {
            this.labeled = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ResourceEntity setMetaId(String str) {
            this.meta_id = Optional.e(str);
            return this;
        }

        @Required
        public ResourceEntity setName(String str) {
            this.name = str;
            return this;
        }

        public ResourceEntity setResultType(String str) {
            this.result_type = Optional.e(str);
            return this;
        }

        public ResourceEntity(String str, String str2) {
            this.name = str;
            this.id = str2;
        }
    }

    public static class ThirdPartyContentProvider {

        @Required
        private String name;
        private Optional<String> resource_id = Optional.a();
        private Optional<Template.Launcher> launcher = Optional.a();
        private Optional<Boolean> is_free = Optional.a();
        private Optional<Template.Image> icon = Optional.a();
        private Optional<List<String>> episode_ids = Optional.a();
        private Optional<CPAppType> play_app = Optional.a();
        private Optional<VideoPlayer.VideoStream> stream = Optional.a();
        private Optional<MediaVipType> media_vip_type = Optional.a();
        private Optional<String> audio_id = Optional.a();
        private Optional<Boolean> is_history = Optional.a();

        public ThirdPartyContentProvider() {
        }

        public Optional<String> getAudioId() {
            return this.audio_id;
        }

        public Optional<List<String>> getEpisodeIds() {
            return this.episode_ids;
        }

        public Optional<Template.Image> getIcon() {
            return this.icon;
        }

        public Optional<Template.Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<MediaVipType> getMediaVipType() {
            return this.media_vip_type;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<CPAppType> getPlayApp() {
            return this.play_app;
        }

        public Optional<String> getResourceId() {
            return this.resource_id;
        }

        public Optional<VideoPlayer.VideoStream> getStream() {
            return this.stream;
        }

        public Optional<Boolean> isFree() {
            return this.is_free;
        }

        public Optional<Boolean> isHistory() {
            return this.is_history;
        }

        public ThirdPartyContentProvider setAudioId(String str) {
            this.audio_id = Optional.e(str);
            return this;
        }

        public ThirdPartyContentProvider setEpisodeIds(List<String> list) {
            this.episode_ids = Optional.e(list);
            return this;
        }

        public ThirdPartyContentProvider setIcon(Template.Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public ThirdPartyContentProvider setIsFree(boolean z) {
            this.is_free = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ThirdPartyContentProvider setIsHistory(boolean z) {
            this.is_history = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ThirdPartyContentProvider setLauncher(Template.Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public ThirdPartyContentProvider setMediaVipType(MediaVipType mediaVipType) {
            this.media_vip_type = Optional.e(mediaVipType);
            return this;
        }

        @Required
        public ThirdPartyContentProvider setName(String str) {
            this.name = str;
            return this;
        }

        public ThirdPartyContentProvider setPlayApp(CPAppType cPAppType) {
            this.play_app = Optional.e(cPAppType);
            return this;
        }

        public ThirdPartyContentProvider setResourceId(String str) {
            this.resource_id = Optional.e(str);
            return this;
        }

        public ThirdPartyContentProvider setStream(VideoPlayer.VideoStream videoStream) {
            this.stream = Optional.e(videoStream);
            return this;
        }

        public ThirdPartyContentProvider(String str) {
            this.name = str;
        }
    }

    @NamespaceName(name = "ShowSearchPage", namespace = "Video")
    public static class ShowSearchPage implements InstructionPayload {

        @Required
        private List<VideoSearchItem> items;
        private Optional<VideoSearchCursor> cursor = Optional.a();
        private Optional<List<VideoSearchTags>> tags = Optional.a();
        private Optional<Integer> total_size = Optional.a();
        private Optional<String> accuracy = Optional.a();
        private Optional<Common.LoadmoreInfo> loadmore_info = Optional.a();
        private Optional<Common.PageLoadType> load_type = Optional.a();
        private Optional<DisplayMode> display_mode = Optional.a();
        private Optional<String> display_ip_name = Optional.a();
        private Optional<List<DisplayCategory>> supported_display_category = Optional.a();
        private Optional<Boolean> ip_accureate_have_more = Optional.a();
        private Optional<Boolean> accureate_have_more = Optional.a();
        private Optional<Boolean> recommend_have_more = Optional.a();

        public ShowSearchPage() {
        }

        public Optional<String> getAccuracy() {
            return this.accuracy;
        }

        public Optional<VideoSearchCursor> getCursor() {
            return this.cursor;
        }

        public Optional<String> getDisplayIpName() {
            return this.display_ip_name;
        }

        public Optional<DisplayMode> getDisplayMode() {
            return this.display_mode;
        }

        @Required
        public List<VideoSearchItem> getItems() {
            return this.items;
        }

        public Optional<Common.PageLoadType> getLoadType() {
            return this.load_type;
        }

        public Optional<Common.LoadmoreInfo> getLoadmoreInfo() {
            return this.loadmore_info;
        }

        public Optional<List<DisplayCategory>> getSupportedDisplayCategory() {
            return this.supported_display_category;
        }

        public Optional<List<VideoSearchTags>> getTags() {
            return this.tags;
        }

        public Optional<Integer> getTotalSize() {
            return this.total_size;
        }

        public Optional<Boolean> isAccureateHaveMore() {
            return this.accureate_have_more;
        }

        public Optional<Boolean> isIpAccureateHaveMore() {
            return this.ip_accureate_have_more;
        }

        public Optional<Boolean> isRecommendHaveMore() {
            return this.recommend_have_more;
        }

        public ShowSearchPage setAccuracy(String str) {
            this.accuracy = Optional.e(str);
            return this;
        }

        public ShowSearchPage setAccureateHaveMore(boolean z) {
            this.accureate_have_more = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ShowSearchPage setCursor(VideoSearchCursor videoSearchCursor) {
            this.cursor = Optional.e(videoSearchCursor);
            return this;
        }

        public ShowSearchPage setDisplayIpName(String str) {
            this.display_ip_name = Optional.e(str);
            return this;
        }

        public ShowSearchPage setDisplayMode(DisplayMode displayMode) {
            this.display_mode = Optional.e(displayMode);
            return this;
        }

        public ShowSearchPage setIpAccureateHaveMore(boolean z) {
            this.ip_accureate_have_more = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public ShowSearchPage setItems(List<VideoSearchItem> list) {
            this.items = list;
            return this;
        }

        public ShowSearchPage setLoadType(Common.PageLoadType pageLoadType) {
            this.load_type = Optional.e(pageLoadType);
            return this;
        }

        public ShowSearchPage setLoadmoreInfo(Common.LoadmoreInfo loadmoreInfo) {
            this.loadmore_info = Optional.e(loadmoreInfo);
            return this;
        }

        public ShowSearchPage setRecommendHaveMore(boolean z) {
            this.recommend_have_more = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ShowSearchPage setSupportedDisplayCategory(List<DisplayCategory> list) {
            this.supported_display_category = Optional.e(list);
            return this;
        }

        public ShowSearchPage setTags(List<VideoSearchTags> list) {
            this.tags = Optional.e(list);
            return this;
        }

        public ShowSearchPage setTotalSize(int i) {
            this.total_size = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ShowSearchPage(List<VideoSearchItem> list) {
            this.items = list;
        }
    }
}
