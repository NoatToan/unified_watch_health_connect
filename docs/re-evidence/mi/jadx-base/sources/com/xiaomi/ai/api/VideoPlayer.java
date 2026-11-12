package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class VideoPlayer {

    @NamespaceName(name = "PlayMV", namespace = AIApiConstants.VideoPlayer.NAME)
    public static class PlayMV implements InstructionPayload {
    }

    public enum ResourceDisplayStyle {
        UNKNOWN(-1),
        VIDEO_DEFAULT(0),
        HORIZONTAL(1);

        private int id;

        ResourceDisplayStyle(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class VideoMeta {
        private Optional<Integer> season = Optional.a();
        private Optional<Integer> episode = Optional.a();

        @Deprecated
        private Optional<Video.ThirdPartyContentProvider> cp = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<String> category = Optional.a();
        private Optional<Template.Image> horizontal_poster = Optional.a();
        private Optional<List<Video.ThirdPartyContentProvider>> cp_list = Optional.a();
        private Optional<c4h> log = Optional.a();
        private Optional<Template.VideoLengthType> length_type = Optional.a();
        private Optional<Common.VideoMediaType> video_media_type = Optional.a();
        private Optional<String> publish_time = Optional.a();
        private Optional<String> area = Optional.a();
        private Optional<Float> rating = Optional.a();
        private Optional<Integer> duration_in_min = Optional.a();
        private Optional<Video.DisplayMatchLevel> display_match_level = Optional.a();
        private Optional<Boolean> auto_play_background = Optional.a();
        private Optional<VideoId> video_id = Optional.a();
        private Optional<String> display_tag = Optional.a();
        private Optional<String> ui_type_name = Optional.a();
        private Optional<Template.Image> vertical_poster = Optional.a();
        private Optional<Template.Image> background_image = Optional.a();
        private Optional<Template.Image> left_top_corner = Optional.a();
        private Optional<String> vip_video_url = Optional.a();
        private Optional<VideoResourceType> resource_type = Optional.a();
        private Optional<ResourceDisplayStyle> resource_display_style = Optional.a();
        private Optional<String> display_episode = Optional.a();
        private Optional<String> display_age = Optional.a();
        private Optional<String> display_info = Optional.a();

        public Optional<String> getArea() {
            return this.area;
        }

        public Optional<Template.Image> getBackgroundImage() {
            return this.background_image;
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        @Deprecated
        public Optional<Video.ThirdPartyContentProvider> getCp() {
            return this.cp;
        }

        public Optional<List<Video.ThirdPartyContentProvider>> getCpList() {
            return this.cp_list;
        }

        public Optional<String> getDisplayAge() {
            return this.display_age;
        }

        public Optional<String> getDisplayEpisode() {
            return this.display_episode;
        }

        public Optional<String> getDisplayInfo() {
            return this.display_info;
        }

        public Optional<Video.DisplayMatchLevel> getDisplayMatchLevel() {
            return this.display_match_level;
        }

        public Optional<String> getDisplayTag() {
            return this.display_tag;
        }

        public Optional<Integer> getDurationInMin() {
            return this.duration_in_min;
        }

        public Optional<Integer> getEpisode() {
            return this.episode;
        }

        public Optional<Template.Image> getHorizontalPoster() {
            return this.horizontal_poster;
        }

        public Optional<Template.Image> getLeftTopCorner() {
            return this.left_top_corner;
        }

        public Optional<Template.VideoLengthType> getLengthType() {
            return this.length_type;
        }

        public Optional<c4h> getLog() {
            return this.log;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getPublishTime() {
            return this.publish_time;
        }

        public Optional<Float> getRating() {
            return this.rating;
        }

        public Optional<ResourceDisplayStyle> getResourceDisplayStyle() {
            return this.resource_display_style;
        }

        public Optional<VideoResourceType> getResourceType() {
            return this.resource_type;
        }

        public Optional<Integer> getSeason() {
            return this.season;
        }

        public Optional<String> getUiTypeName() {
            return this.ui_type_name;
        }

        public Optional<Template.Image> getVerticalPoster() {
            return this.vertical_poster;
        }

        public Optional<VideoId> getVideoId() {
            return this.video_id;
        }

        public Optional<Common.VideoMediaType> getVideoMediaType() {
            return this.video_media_type;
        }

        public Optional<String> getVipVideoUrl() {
            return this.vip_video_url;
        }

        public Optional<Boolean> isAutoPlayBackground() {
            return this.auto_play_background;
        }

        public VideoMeta setArea(String str) {
            this.area = Optional.e(str);
            return this;
        }

        public VideoMeta setAutoPlayBackground(boolean z) {
            this.auto_play_background = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VideoMeta setBackgroundImage(Template.Image image) {
            this.background_image = Optional.e(image);
            return this;
        }

        public VideoMeta setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        @Deprecated
        public VideoMeta setCp(Video.ThirdPartyContentProvider thirdPartyContentProvider) {
            this.cp = Optional.e(thirdPartyContentProvider);
            return this;
        }

        public VideoMeta setCpList(List<Video.ThirdPartyContentProvider> list) {
            this.cp_list = Optional.e(list);
            return this;
        }

        public VideoMeta setDisplayAge(String str) {
            this.display_age = Optional.e(str);
            return this;
        }

        public VideoMeta setDisplayEpisode(String str) {
            this.display_episode = Optional.e(str);
            return this;
        }

        public VideoMeta setDisplayInfo(String str) {
            this.display_info = Optional.e(str);
            return this;
        }

        public VideoMeta setDisplayMatchLevel(Video.DisplayMatchLevel displayMatchLevel) {
            this.display_match_level = Optional.e(displayMatchLevel);
            return this;
        }

        public VideoMeta setDisplayTag(String str) {
            this.display_tag = Optional.e(str);
            return this;
        }

        public VideoMeta setDurationInMin(int i) {
            this.duration_in_min = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VideoMeta setEpisode(int i) {
            this.episode = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VideoMeta setHorizontalPoster(Template.Image image) {
            this.horizontal_poster = Optional.e(image);
            return this;
        }

        public VideoMeta setLeftTopCorner(Template.Image image) {
            this.left_top_corner = Optional.e(image);
            return this;
        }

        public VideoMeta setLengthType(Template.VideoLengthType videoLengthType) {
            this.length_type = Optional.e(videoLengthType);
            return this;
        }

        public VideoMeta setLog(c4h c4hVar) {
            this.log = Optional.e(c4hVar);
            return this;
        }

        public VideoMeta setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public VideoMeta setPublishTime(String str) {
            this.publish_time = Optional.e(str);
            return this;
        }

        public VideoMeta setRating(float f) {
            this.rating = Optional.e(Float.valueOf(f));
            return this;
        }

        public VideoMeta setResourceDisplayStyle(ResourceDisplayStyle resourceDisplayStyle) {
            this.resource_display_style = Optional.e(resourceDisplayStyle);
            return this;
        }

        public VideoMeta setResourceType(VideoResourceType videoResourceType) {
            this.resource_type = Optional.e(videoResourceType);
            return this;
        }

        public VideoMeta setSeason(int i) {
            this.season = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VideoMeta setUiTypeName(String str) {
            this.ui_type_name = Optional.e(str);
            return this;
        }

        public VideoMeta setVerticalPoster(Template.Image image) {
            this.vertical_poster = Optional.e(image);
            return this;
        }

        public VideoMeta setVideoId(VideoId videoId) {
            this.video_id = Optional.e(videoId);
            return this;
        }

        public VideoMeta setVideoMediaType(Common.VideoMediaType videoMediaType) {
            this.video_media_type = Optional.e(videoMediaType);
            return this;
        }

        public VideoMeta setVipVideoUrl(String str) {
            this.vip_video_url = Optional.e(str);
            return this;
        }
    }

    public enum VideoPlayerStatus {
        UNKNOWN(-1),
        PLAYING(0);

        private int id;

        VideoPlayerStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum VideoResourceType {
        UNKNOWN(-1),
        VIDEO(0),
        VIP_OPERATION(1);

        private int id;

        VideoResourceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "VideoPlaybackState", namespace = AIApiConstants.VideoPlayer.NAME)
    public static class VideoPlaybackState implements ContextPayload {
        private Optional<Video.ResourceEntity> entity = Optional.a();

        @Required
        private VideoPlayerStatus status;

        public VideoPlaybackState() {
        }

        public Optional<Video.ResourceEntity> getEntity() {
            return this.entity;
        }

        @Required
        public VideoPlayerStatus getStatus() {
            return this.status;
        }

        public VideoPlaybackState setEntity(Video.ResourceEntity resourceEntity) {
            this.entity = Optional.e(resourceEntity);
            return this;
        }

        @Required
        public VideoPlaybackState setStatus(VideoPlayerStatus videoPlayerStatus) {
            this.status = videoPlayerStatus;
            return this;
        }

        public VideoPlaybackState(VideoPlayerStatus videoPlayerStatus) {
            this.status = videoPlayerStatus;
        }
    }

    @NamespaceName(name = "PlayList", namespace = AIApiConstants.VideoPlayer.NAME)
    public static class PlayList implements InstructionPayload {

        @Required
        private List<Play> items;
        private Optional<String> loadmore_token = Optional.a();
        private Optional<Boolean> needs_loadmore = Optional.a();

        public PlayList() {
        }

        @Required
        public List<Play> getItems() {
            return this.items;
        }

        public Optional<String> getLoadmoreToken() {
            return this.loadmore_token;
        }

        public Optional<Boolean> isNeedsLoadmore() {
            return this.needs_loadmore;
        }

        @Required
        public PlayList setItems(List<Play> list) {
            this.items = list;
            return this;
        }

        public PlayList setLoadmoreToken(String str) {
            this.loadmore_token = Optional.e(str);
            return this;
        }

        public PlayList setNeedsLoadmore(boolean z) {
            this.needs_loadmore = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PlayList(List<Play> list) {
            this.items = list;
        }
    }

    public static class VideoId {

        @Required
        private String id;
        private Optional<String> meta_id = Optional.a();
        private Optional<String> origin_id = Optional.a();

        public VideoId() {
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<String> getMetaId() {
            return this.meta_id;
        }

        public Optional<String> getOriginId() {
            return this.origin_id;
        }

        @Required
        public VideoId setId(String str) {
            this.id = str;
            return this;
        }

        public VideoId setMetaId(String str) {
            this.meta_id = Optional.e(str);
            return this;
        }

        public VideoId setOriginId(String str) {
            this.origin_id = Optional.e(str);
            return this;
        }

        public VideoId(String str) {
            this.id = str;
        }
    }

    public static class VideoStream {

        @Required
        private boolean authentication;
        private Optional<Integer> offset_in_ms = Optional.a();
        private Optional<String> token = Optional.a();

        @Required
        private String url;

        public VideoStream() {
        }

        public Optional<Integer> getOffsetInMs() {
            return this.offset_in_ms;
        }

        public Optional<String> getToken() {
            return this.token;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        @Required
        public boolean isAuthentication() {
            return this.authentication;
        }

        @Required
        public VideoStream setAuthentication(boolean z) {
            this.authentication = z;
            return this;
        }

        public VideoStream setOffsetInMs(int i) {
            this.offset_in_ms = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VideoStream setToken(String str) {
            this.token = Optional.e(str);
            return this;
        }

        @Required
        public VideoStream setUrl(String str) {
            this.url = str;
            return this;
        }

        public VideoStream(String str, boolean z) {
            this.url = str;
            this.authentication = z;
        }
    }

    @NamespaceName(name = "Play", namespace = AIApiConstants.VideoPlayer.NAME)
    public static class Play implements InstructionPayload {

        @Required
        private VideoStream stream;
        private Optional<VideoId> id = Optional.a();
        private Optional<VideoMeta> meta = Optional.a();
        private Optional<c4h> log = Optional.a();

        public Play() {
        }

        public Optional<VideoId> getId() {
            return this.id;
        }

        public Optional<c4h> getLog() {
            return this.log;
        }

        public Optional<VideoMeta> getMeta() {
            return this.meta;
        }

        @Required
        public VideoStream getStream() {
            return this.stream;
        }

        public Play setId(VideoId videoId) {
            this.id = Optional.e(videoId);
            return this;
        }

        public Play setLog(c4h c4hVar) {
            this.log = Optional.e(c4hVar);
            return this;
        }

        public Play setMeta(VideoMeta videoMeta) {
            this.meta = Optional.e(videoMeta);
            return this;
        }

        @Required
        public Play setStream(VideoStream videoStream) {
            this.stream = videoStream;
            return this;
        }

        public Play(VideoStream videoStream) {
            this.stream = videoStream;
        }
    }

    @NamespaceName(name = "LaunchPlayApp", namespace = AIApiConstants.VideoPlayer.NAME)
    public static class LaunchPlayApp implements InstructionPayload {

        @Required
        private List<VideoMeta> items;
        private Optional<String> loadmore_token = Optional.a();
        private Optional<Boolean> needs_loadmore = Optional.a();
        private Optional<Integer> episode = Optional.a();
        private Optional<Common.PageLoadType> load_type = Optional.a();
        private Optional<Video.DisplayMode> display_mode = Optional.a();
        private Optional<String> display_ip_name = Optional.a();
        private Optional<Boolean> has_more = Optional.a();

        public LaunchPlayApp() {
        }

        public Optional<String> getDisplayIpName() {
            return this.display_ip_name;
        }

        public Optional<Video.DisplayMode> getDisplayMode() {
            return this.display_mode;
        }

        public Optional<Integer> getEpisode() {
            return this.episode;
        }

        @Required
        public List<VideoMeta> getItems() {
            return this.items;
        }

        public Optional<Common.PageLoadType> getLoadType() {
            return this.load_type;
        }

        public Optional<String> getLoadmoreToken() {
            return this.loadmore_token;
        }

        public Optional<Boolean> isHasMore() {
            return this.has_more;
        }

        public Optional<Boolean> isNeedsLoadmore() {
            return this.needs_loadmore;
        }

        public LaunchPlayApp setDisplayIpName(String str) {
            this.display_ip_name = Optional.e(str);
            return this;
        }

        public LaunchPlayApp setDisplayMode(Video.DisplayMode displayMode) {
            this.display_mode = Optional.e(displayMode);
            return this;
        }

        public LaunchPlayApp setEpisode(int i) {
            this.episode = Optional.e(Integer.valueOf(i));
            return this;
        }

        public LaunchPlayApp setHasMore(boolean z) {
            this.has_more = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public LaunchPlayApp setItems(List<VideoMeta> list) {
            this.items = list;
            return this;
        }

        public LaunchPlayApp setLoadType(Common.PageLoadType pageLoadType) {
            this.load_type = Optional.e(pageLoadType);
            return this;
        }

        public LaunchPlayApp setLoadmoreToken(String str) {
            this.loadmore_token = Optional.e(str);
            return this;
        }

        public LaunchPlayApp setNeedsLoadmore(boolean z) {
            this.needs_loadmore = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public LaunchPlayApp(List<VideoMeta> list) {
            this.items = list;
        }
    }
}
