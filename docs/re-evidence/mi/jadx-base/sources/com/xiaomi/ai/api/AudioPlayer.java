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
public class AudioPlayer {

    public static class AppAudioItem {

        @Required
        private String album_id;

        @Required
        private String album_name;

        @Required
        private String artist_id;

        @Required
        private String artist_name;

        @Required
        private String audio_id;

        @Required
        private String audio_name;

        public AppAudioItem() {
        }

        public AppAudioItem(String str, String str2, String str3, String str4, String str5, String str6) {
            this.audio_id = str;
            this.audio_name = str2;
            this.artist_name = str3;
            this.artist_id = str4;
            this.album_name = str5;
            this.album_id = str6;
        }

        @Required
        public String getAlbumId() {
            return this.album_id;
        }

        @Required
        public String getAlbumName() {
            return this.album_name;
        }

        @Required
        public String getArtistId() {
            return this.artist_id;
        }

        @Required
        public String getArtistName() {
            return this.artist_name;
        }

        @Required
        public String getAudioId() {
            return this.audio_id;
        }

        @Required
        public String getAudioName() {
            return this.audio_name;
        }

        @Required
        public AppAudioItem setAlbumId(String str) {
            this.album_id = str;
            return this;
        }

        @Required
        public AppAudioItem setAlbumName(String str) {
            this.album_name = str;
            return this;
        }

        @Required
        public AppAudioItem setArtistId(String str) {
            this.artist_id = str;
            return this;
        }

        @Required
        public AppAudioItem setArtistName(String str) {
            this.artist_name = str;
            return this;
        }

        @Required
        public AppAudioItem setAudioId(String str) {
            this.audio_id = str;
            return this;
        }

        @Required
        public AppAudioItem setAudioName(String str) {
            this.audio_name = str;
            return this;
        }
    }

    public enum AudioItemType {
        UNKNOWN(-1),
        WHITE_NOISE_FIRE(0),
        WHITE_NOISE_SPRING(1),
        WHITE_NOISE_TRAVEL(2),
        WHITE_NOISE_LIBRARY(3),
        WHITE_NOISE_RURAL(4),
        WHITE_NOISE_RAIN(5),
        WHITE_NOISE_FOREST(6),
        WHITE_NOISE_SEA_WAV(7),
        WHITE_NOISE_SEA_WAV_MEW(8),
        WHITE_NOISE_SUMMER_NIGHT(9),
        WHITE_NOISE_BIRD_SONG(10);

        private int id;

        AudioItemType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AudioPlayerPlayMode {
        UNKNOWN(-1),
        SINGLE(0),
        LIST(1),
        SEQUENCE(2),
        RANDOM(3),
        NONE(4);

        private int id;

        AudioPlayerPlayMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AudioPlayerStatus {
        UNKNOWN(-1),
        STOP(0),
        PLAYING(1),
        PAUSE(2);

        private int id;

        AudioPlayerStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ChannelStateList", namespace = AIApiConstants.AudioPlayer.NAME)
    public static class ChannelStateList implements ContextPayload {

        @Required
        private List<ChannelState> states;

        public ChannelStateList() {
        }

        public ChannelStateList(List<ChannelState> list) {
            this.states = list;
        }

        @Required
        public List<ChannelState> getStates() {
            return this.states;
        }

        @Required
        public ChannelStateList setStates(List<ChannelState> list) {
            this.states = list;
            return this;
        }
    }

    public enum FavoritesType {
        UNKNOWN(-1),
        MUSIC(0),
        STATION(1),
        FAV_LIST(2),
        RECENT_LIST(3),
        LIKE_LIST(4),
        SELF_LIST(5),
        SUB_LIST(6),
        BUY_LIST(7),
        REC_LIST(8),
        GUESS_LIST(9),
        SOAR_LIST(10),
        HOT_LIST(11),
        NEW_LIST(12),
        HIGH_QUALITY_LIST(13),
        KUGOU_CAR_RADIO_LIST(14),
        NTES_OFFICIAL_LIST(15),
        SONG_LIST(16),
        SEARCH_LIST(17);

        private int id;

        FavoritesType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "PlayApp", namespace = AIApiConstants.AudioPlayer.NAME)
    public static class PlayApp implements InstructionPayload {

        @Required
        private Template.AndroidApp app;

        @Required
        private List<AppAudioItem> audio_items;

        @Required
        private int play_length;

        public PlayApp() {
        }

        public PlayApp(List<AppAudioItem> list, Template.AndroidApp androidApp, int i) {
            this.audio_items = list;
            this.app = androidApp;
            this.play_length = i;
        }

        @Required
        public Template.AndroidApp getApp() {
            return this.app;
        }

        @Required
        public List<AppAudioItem> getAudioItems() {
            return this.audio_items;
        }

        @Required
        public int getPlayLength() {
            return this.play_length;
        }

        @Required
        public PlayApp setApp(Template.AndroidApp androidApp) {
            this.app = androidApp;
            return this;
        }

        @Required
        public PlayApp setAudioItems(List<AppAudioItem> list) {
            this.audio_items = list;
            return this;
        }

        @Required
        public PlayApp setPlayLength(int i) {
            this.play_length = i;
            return this;
        }
    }

    public enum PlayBehavior {
        UNKNOWN(-1),
        REPLACE_ALL(0),
        APPEND(1),
        REPLACE_PENDING(2),
        INSERT_FRONT(3),
        INSERT_CURRENT(4);

        private int id;

        PlayBehavior(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "PlayLocalSoundEffect", namespace = AIApiConstants.AudioPlayer.NAME)
    public static class PlayLocalSoundEffect implements InstructionPayload {

        @Required
        private SoundEffectType effect_type;

        public PlayLocalSoundEffect() {
        }

        public PlayLocalSoundEffect(SoundEffectType soundEffectType) {
            this.effect_type = soundEffectType;
        }

        @Required
        public SoundEffectType getEffectType() {
            return this.effect_type;
        }

        @Required
        public PlayLocalSoundEffect setEffectType(SoundEffectType soundEffectType) {
            this.effect_type = soundEffectType;
            return this;
        }
    }

    public static class PlaybackAudioMeta {
        private Optional<String> audio_id = Optional.a();
        private Optional<Long> favorites_id = Optional.a();
        private Optional<ContentProvider> cp = Optional.a();
        private Optional<Common.AudioType> audio_type = Optional.a();
        private Optional<Boolean> is_alarm = Optional.a();

        public Optional<String> getAudioId() {
            return this.audio_id;
        }

        public Optional<Common.AudioType> getAudioType() {
            return this.audio_type;
        }

        public Optional<ContentProvider> getCp() {
            return this.cp;
        }

        public Optional<Long> getFavoritesId() {
            return this.favorites_id;
        }

        public Optional<Boolean> isAlarm() {
            return this.is_alarm;
        }

        public PlaybackAudioMeta setAudioId(String str) {
            this.audio_id = Optional.e(str);
            return this;
        }

        public PlaybackAudioMeta setAudioType(Common.AudioType audioType) {
            this.audio_type = Optional.e(audioType);
            return this;
        }

        public PlaybackAudioMeta setCp(ContentProvider contentProvider) {
            this.cp = Optional.e(contentProvider);
            return this;
        }

        public PlaybackAudioMeta setFavoritesId(long j) {
            this.favorites_id = Optional.e(Long.valueOf(j));
            return this;
        }

        public PlaybackAudioMeta setIsAlarm(boolean z) {
            this.is_alarm = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public static class PlaybackOnError {

        @Required
        private int code;

        @Required
        private String msg;

        @Required
        private long ts;

        public PlaybackOnError() {
        }

        public PlaybackOnError(long j, int i, String str) {
            this.ts = j;
            this.code = i;
            this.msg = str;
        }

        @Required
        public int getCode() {
            return this.code;
        }

        @Required
        public String getMsg() {
            return this.msg;
        }

        @Required
        public long getTs() {
            return this.ts;
        }

        @Required
        public PlaybackOnError setCode(int i) {
            this.code = i;
            return this;
        }

        @Required
        public PlaybackOnError setMsg(String str) {
            this.msg = str;
            return this;
        }

        @Required
        public PlaybackOnError setTs(long j) {
            this.ts = j;
            return this;
        }
    }

    public static class PlaybackOnSwitch {

        @Required
        private long end_ts;

        @Required
        private long loading_in_ms;

        @Required
        private PlaybackSwitch playback_switch;

        @Required
        private int position_in_ms;

        @Required
        private long start_ts;

        public PlaybackOnSwitch() {
        }

        public PlaybackOnSwitch(long j, long j2, long j3, int i, PlaybackSwitch playbackSwitch) {
            this.loading_in_ms = j;
            this.start_ts = j2;
            this.end_ts = j3;
            this.position_in_ms = i;
            this.playback_switch = playbackSwitch;
        }

        @Required
        public long getEndTs() {
            return this.end_ts;
        }

        @Required
        public long getLoadingInMs() {
            return this.loading_in_ms;
        }

        @Required
        public PlaybackSwitch getPlaybackSwitch() {
            return this.playback_switch;
        }

        @Required
        public int getPositionInMs() {
            return this.position_in_ms;
        }

        @Required
        public long getStartTs() {
            return this.start_ts;
        }

        @Required
        public PlaybackOnSwitch setEndTs(long j) {
            this.end_ts = j;
            return this;
        }

        @Required
        public PlaybackOnSwitch setLoadingInMs(long j) {
            this.loading_in_ms = j;
            return this;
        }

        @Required
        public PlaybackOnSwitch setPlaybackSwitch(PlaybackSwitch playbackSwitch) {
            this.playback_switch = playbackSwitch;
            return this;
        }

        @Required
        public PlaybackOnSwitch setPositionInMs(int i) {
            this.position_in_ms = i;
            return this;
        }

        @Required
        public PlaybackOnSwitch setStartTs(long j) {
            this.start_ts = j;
            return this;
        }
    }

    @NamespaceName(name = "PlaybackStateList", namespace = AIApiConstants.AudioPlayer.NAME)
    public static class PlaybackStateList implements ContextPayload {

        @Required
        private List<PlaybackState> states;

        public PlaybackStateList() {
        }

        public PlaybackStateList(List<PlaybackState> list) {
            this.states = list;
        }

        @Required
        public List<PlaybackState> getStates() {
            return this.states;
        }

        @Required
        public PlaybackStateList setStates(List<PlaybackState> list) {
            this.states = list;
            return this;
        }
    }

    public enum PlaybackSwitch {
        UNKNOWN(-1),
        PAUSE(0),
        MANUALLY_NEXT(1),
        AUTOMATICALLY_NEXT(2),
        MANUALLY_OTHER(3);

        private int id;

        PlaybackSwitch(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ReplayLastAudio", namespace = AIApiConstants.AudioPlayer.NAME)
    public static class ReplayLastAudio implements InstructionPayload {

        @Required
        private String failed_speak;

        public ReplayLastAudio() {
        }

        public ReplayLastAudio(String str) {
            this.failed_speak = str;
        }

        @Required
        public String getFailedSpeak() {
            return this.failed_speak;
        }

        @Required
        public ReplayLastAudio setFailedSpeak(String str) {
            this.failed_speak = str;
            return this;
        }
    }

    public enum SkipControlType {
        UNKNOWN(-1),
        NEXT(0),
        PREV(1);

        private int id;

        SkipControlType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SoundEffectType {
        UNKNOWN(-1),
        AUTO_GENERAL_POSITIVEHINT(0),
        AUTO_GENERAL_NEGATIVEHINT(1);

        private int id;

        SoundEffectType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ThirdPartyPlaybackAudioMeta {
        private Optional<String> app_name = Optional.a();
        private Optional<String> title = Optional.a();
        private Optional<String> artist = Optional.a();
        private Optional<String> album = Optional.a();
        private Optional<String> cp_album_id = Optional.a();
        private Optional<String> cp_sound_id = Optional.a();

        public Optional<String> getAlbum() {
            return this.album;
        }

        public Optional<String> getAppName() {
            return this.app_name;
        }

        public Optional<String> getArtist() {
            return this.artist;
        }

        public Optional<String> getCpAlbumId() {
            return this.cp_album_id;
        }

        public Optional<String> getCpSoundId() {
            return this.cp_sound_id;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        public ThirdPartyPlaybackAudioMeta setAlbum(String str) {
            this.album = Optional.e(str);
            return this;
        }

        public ThirdPartyPlaybackAudioMeta setAppName(String str) {
            this.app_name = Optional.e(str);
            return this;
        }

        public ThirdPartyPlaybackAudioMeta setArtist(String str) {
            this.artist = Optional.e(str);
            return this;
        }

        public ThirdPartyPlaybackAudioMeta setCpAlbumId(String str) {
            this.cp_album_id = Optional.e(str);
            return this;
        }

        public ThirdPartyPlaybackAudioMeta setCpSoundId(String str) {
            this.cp_sound_id = Optional.e(str);
            return this;
        }

        public ThirdPartyPlaybackAudioMeta setTitle(String str) {
            this.title = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "AddToFavorites", namespace = AIApiConstants.AudioPlayer.NAME)
    public static class AddToFavorites implements InstructionPayload {
        private Optional<String> app_name = Optional.a();

        @Required
        private FavoritesType type;

        public AddToFavorites() {
        }

        public Optional<String> getAppName() {
            return this.app_name;
        }

        @Required
        public FavoritesType getType() {
            return this.type;
        }

        public AddToFavorites setAppName(String str) {
            this.app_name = Optional.e(str);
            return this;
        }

        @Required
        public AddToFavorites setType(FavoritesType favoritesType) {
            this.type = favoritesType;
            return this;
        }

        public AddToFavorites(FavoritesType favoritesType) {
            this.type = favoritesType;
        }
    }

    @NamespaceName(name = "CancelFromFavorites", namespace = AIApiConstants.AudioPlayer.NAME)
    public static class CancelFromFavorites implements InstructionPayload {
        private Optional<String> app_name = Optional.a();

        @Required
        private FavoritesType type;

        public CancelFromFavorites() {
        }

        public Optional<String> getAppName() {
            return this.app_name;
        }

        @Required
        public FavoritesType getType() {
            return this.type;
        }

        public CancelFromFavorites setAppName(String str) {
            this.app_name = Optional.e(str);
            return this;
        }

        @Required
        public CancelFromFavorites setType(FavoritesType favoritesType) {
            this.type = favoritesType;
            return this;
        }

        public CancelFromFavorites(FavoritesType favoritesType) {
            this.type = favoritesType;
        }
    }

    public static class ChannelState {

        @Required
        private Speaker.VolumeType channel;
        private Optional<Boolean> is_occupy = Optional.a();

        public ChannelState() {
        }

        @Required
        public Speaker.VolumeType getChannel() {
            return this.channel;
        }

        public Optional<Boolean> isOccupy() {
            return this.is_occupy;
        }

        @Required
        public ChannelState setChannel(Speaker.VolumeType volumeType) {
            this.channel = volumeType;
            return this;
        }

        public ChannelState setIsOccupy(boolean z) {
            this.is_occupy = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ChannelState(Speaker.VolumeType volumeType) {
            this.channel = volumeType;
        }
    }

    public static class ItemId {

        @Required
        private String audio_id;
        private Optional<ContentProvider> cp = Optional.a();

        @Deprecated
        private Optional<String> album_id = Optional.a();

        public ItemId() {
        }

        @Deprecated
        public Optional<String> getAlbumId() {
            return this.album_id;
        }

        @Required
        public String getAudioId() {
            return this.audio_id;
        }

        public Optional<ContentProvider> getCp() {
            return this.cp;
        }

        @Deprecated
        public ItemId setAlbumId(String str) {
            this.album_id = Optional.e(str);
            return this;
        }

        @Required
        public ItemId setAudioId(String str) {
            this.audio_id = str;
            return this;
        }

        public ItemId setCp(ContentProvider contentProvider) {
            this.cp = Optional.e(contentProvider);
            return this;
        }

        public ItemId(String str) {
            this.audio_id = str;
        }
    }

    @NamespaceName(name = "PlaybackTrack", namespace = AIApiConstants.AudioPlayer.NAME)
    public static class PlaybackTrack implements EventPayload {

        @Required
        private AudioItemV1 audio_item;

        @Required
        private String dialog_id;
        private Optional<PlaybackOnSwitch> on_switch = Optional.a();
        private Optional<PlaybackOnError> on_error = Optional.a();

        public PlaybackTrack() {
        }

        @Required
        public AudioItemV1 getAudioItem() {
            return this.audio_item;
        }

        @Required
        public String getDialogId() {
            return this.dialog_id;
        }

        public Optional<PlaybackOnError> getOnError() {
            return this.on_error;
        }

        public Optional<PlaybackOnSwitch> getOnSwitch() {
            return this.on_switch;
        }

        @Required
        public PlaybackTrack setAudioItem(AudioItemV1 audioItemV1) {
            this.audio_item = audioItemV1;
            return this;
        }

        @Required
        public PlaybackTrack setDialogId(String str) {
            this.dialog_id = str;
            return this;
        }

        public PlaybackTrack setOnError(PlaybackOnError playbackOnError) {
            this.on_error = Optional.e(playbackOnError);
            return this;
        }

        public PlaybackTrack setOnSwitch(PlaybackOnSwitch playbackOnSwitch) {
            this.on_switch = Optional.e(playbackOnSwitch);
            return this;
        }

        public PlaybackTrack(String str, AudioItemV1 audioItemV1) {
            this.dialog_id = str;
            this.audio_item = audioItemV1;
        }
    }

    public static class Stream {

        @Required
        private boolean authentication;

        @Required
        private int duration_in_ms;

        @Required
        private int offset_in_ms;
        private Optional<Boolean> redirect = Optional.a();
        private Optional<String> token = Optional.a();

        @Required
        private String url;

        public Stream() {
        }

        @Required
        public int getDurationInMs() {
            return this.duration_in_ms;
        }

        @Required
        public int getOffsetInMs() {
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

        public Optional<Boolean> isRedirect() {
            return this.redirect;
        }

        @Required
        public Stream setAuthentication(boolean z) {
            this.authentication = z;
            return this;
        }

        @Required
        public Stream setDurationInMs(int i) {
            this.duration_in_ms = i;
            return this;
        }

        @Required
        public Stream setOffsetInMs(int i) {
            this.offset_in_ms = i;
            return this;
        }

        public Stream setRedirect(boolean z) {
            this.redirect = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Stream setToken(String str) {
            this.token = Optional.e(str);
            return this;
        }

        @Required
        public Stream setUrl(String str) {
            this.url = str;
            return this;
        }

        public Stream(String str, boolean z, int i, int i2) {
            this.url = str;
            this.authentication = z;
            this.offset_in_ms = i;
            this.duration_in_ms = i2;
        }
    }

    @NamespaceName(name = "PlayFavorites", namespace = AIApiConstants.AudioPlayer.NAME)
    public static class PlayFavorites implements InstructionPayload {
        private Optional<String> app_name = Optional.a();
        private Optional<Template.DisplayCommon> display = Optional.a();
        private Optional<String> list_name = Optional.a();

        @Required
        private FavoritesType type;

        public PlayFavorites() {
        }

        public Optional<String> getAppName() {
            return this.app_name;
        }

        public Optional<Template.DisplayCommon> getDisplay() {
            return this.display;
        }

        public Optional<String> getListName() {
            return this.list_name;
        }

        @Required
        public FavoritesType getType() {
            return this.type;
        }

        public PlayFavorites setAppName(String str) {
            this.app_name = Optional.e(str);
            return this;
        }

        public PlayFavorites setDisplay(Template.DisplayCommon displayCommon) {
            this.display = Optional.e(displayCommon);
            return this;
        }

        public PlayFavorites setListName(String str) {
            this.list_name = Optional.e(str);
            return this;
        }

        @Required
        public PlayFavorites setType(FavoritesType favoritesType) {
            this.type = favoritesType;
            return this;
        }

        public PlayFavorites(FavoritesType favoritesType) {
            this.type = favoritesType;
        }
    }

    public static class ContentProvider {

        @Required
        private String id;

        @Required
        private String name;
        private Optional<String> label = Optional.a();
        private Optional<String> label_id = Optional.a();
        private Optional<String> album_id = Optional.a();
        private Optional<Integer> episode_index = Optional.a();
        private Optional<String> chinese_name = Optional.a();

        public ContentProvider() {
        }

        public Optional<String> getAlbumId() {
            return this.album_id;
        }

        public Optional<String> getChineseName() {
            return this.chinese_name;
        }

        public Optional<Integer> getEpisodeIndex() {
            return this.episode_index;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<String> getLabel() {
            return this.label;
        }

        public Optional<String> getLabelId() {
            return this.label_id;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public ContentProvider setAlbumId(String str) {
            this.album_id = Optional.e(str);
            return this;
        }

        public ContentProvider setChineseName(String str) {
            this.chinese_name = Optional.e(str);
            return this;
        }

        public ContentProvider setEpisodeIndex(int i) {
            this.episode_index = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public ContentProvider setId(String str) {
            this.id = str;
            return this;
        }

        public ContentProvider setLabel(String str) {
            this.label = Optional.e(str);
            return this;
        }

        public ContentProvider setLabelId(String str) {
            this.label_id = Optional.e(str);
            return this;
        }

        @Required
        public ContentProvider setName(String str) {
            this.name = str;
            return this;
        }

        public ContentProvider(String str, String str2) {
            this.name = str;
            this.id = str2;
        }
    }

    public static class AudioItemV1 {

        @Required
        private ItemId item_id;

        @Required
        private Stream stream;
        private Optional<Integer> play_times = Optional.a();
        private Optional<List<SkipControlType>> skip_controls = Optional.a();
        private Optional<Boolean> is_playlist_hidden = Optional.a();
        private Optional<c4h> log = Optional.a();
        private Optional<String> text = Optional.a();
        private Optional<Template.Image> background_image = Optional.a();
        private Optional<String> publish_time = Optional.a();
        private Optional<AudioItemType> item_type = Optional.a();

        public AudioItemV1() {
        }

        public Optional<Template.Image> getBackgroundImage() {
            return this.background_image;
        }

        @Required
        public ItemId getItemId() {
            return this.item_id;
        }

        public Optional<AudioItemType> getItemType() {
            return this.item_type;
        }

        public Optional<c4h> getLog() {
            return this.log;
        }

        public Optional<Integer> getPlayTimes() {
            return this.play_times;
        }

        public Optional<String> getPublishTime() {
            return this.publish_time;
        }

        public Optional<List<SkipControlType>> getSkipControls() {
            return this.skip_controls;
        }

        @Required
        public Stream getStream() {
            return this.stream;
        }

        public Optional<String> getText() {
            return this.text;
        }

        public Optional<Boolean> isPlaylistHidden() {
            return this.is_playlist_hidden;
        }

        public AudioItemV1 setBackgroundImage(Template.Image image) {
            this.background_image = Optional.e(image);
            return this;
        }

        public AudioItemV1 setIsPlaylistHidden(boolean z) {
            this.is_playlist_hidden = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public AudioItemV1 setItemId(ItemId itemId) {
            this.item_id = itemId;
            return this;
        }

        public AudioItemV1 setItemType(AudioItemType audioItemType) {
            this.item_type = Optional.e(audioItemType);
            return this;
        }

        public AudioItemV1 setLog(c4h c4hVar) {
            this.log = Optional.e(c4hVar);
            return this;
        }

        public AudioItemV1 setPlayTimes(int i) {
            this.play_times = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AudioItemV1 setPublishTime(String str) {
            this.publish_time = Optional.e(str);
            return this;
        }

        public AudioItemV1 setSkipControls(List<SkipControlType> list) {
            this.skip_controls = Optional.e(list);
            return this;
        }

        @Required
        public AudioItemV1 setStream(Stream stream) {
            this.stream = stream;
            return this;
        }

        public AudioItemV1 setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        public AudioItemV1(ItemId itemId, Stream stream) {
            this.item_id = itemId;
            this.stream = stream;
        }
    }

    @NamespaceName(name = "Play", namespace = AIApiConstants.AudioPlayer.NAME)
    public static class Play implements InstructionPayload {

        @Required
        private List<AudioItemV1> audio_items;

        @Required
        private PlayBehavior play_behavior;
        private Optional<Long> favorites_id = Optional.a();
        private Optional<String> loadmore_token = Optional.a();
        private Optional<Common.AudioType> audio_type = Optional.a();
        private Optional<Boolean> needs_loadmore = Optional.a();
        private Optional<Long> play_duration = Optional.a();
        private Optional<String> origin_id = Optional.a();
        private Optional<Integer> loadmore_delta = Optional.a();
        private Optional<Boolean> is_night_mode_play_audio = Optional.a();
        private Optional<Integer> total_count = Optional.a();
        private Optional<Common.PlayMode> play_mode = Optional.a();

        public Play() {
        }

        @Required
        public List<AudioItemV1> getAudioItems() {
            return this.audio_items;
        }

        public Optional<Common.AudioType> getAudioType() {
            return this.audio_type;
        }

        public Optional<Long> getFavoritesId() {
            return this.favorites_id;
        }

        public Optional<Integer> getLoadmoreDelta() {
            return this.loadmore_delta;
        }

        public Optional<String> getLoadmoreToken() {
            return this.loadmore_token;
        }

        public Optional<String> getOriginId() {
            return this.origin_id;
        }

        @Required
        public PlayBehavior getPlayBehavior() {
            return this.play_behavior;
        }

        public Optional<Long> getPlayDuration() {
            return this.play_duration;
        }

        public Optional<Common.PlayMode> getPlayMode() {
            return this.play_mode;
        }

        public Optional<Integer> getTotalCount() {
            return this.total_count;
        }

        public Optional<Boolean> isNeedsLoadmore() {
            return this.needs_loadmore;
        }

        public Optional<Boolean> isNightModePlayAudio() {
            return this.is_night_mode_play_audio;
        }

        @Required
        public Play setAudioItems(List<AudioItemV1> list) {
            this.audio_items = list;
            return this;
        }

        public Play setAudioType(Common.AudioType audioType) {
            this.audio_type = Optional.e(audioType);
            return this;
        }

        public Play setFavoritesId(long j) {
            this.favorites_id = Optional.e(Long.valueOf(j));
            return this;
        }

        public Play setIsNightModePlayAudio(boolean z) {
            this.is_night_mode_play_audio = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Play setLoadmoreDelta(int i) {
            this.loadmore_delta = Optional.e(Integer.valueOf(i));
            return this;
        }

        public Play setLoadmoreToken(String str) {
            this.loadmore_token = Optional.e(str);
            return this;
        }

        public Play setNeedsLoadmore(boolean z) {
            this.needs_loadmore = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Play setOriginId(String str) {
            this.origin_id = Optional.e(str);
            return this;
        }

        @Required
        public Play setPlayBehavior(PlayBehavior playBehavior) {
            this.play_behavior = playBehavior;
            return this;
        }

        public Play setPlayDuration(long j) {
            this.play_duration = Optional.e(Long.valueOf(j));
            return this;
        }

        public Play setPlayMode(Common.PlayMode playMode) {
            this.play_mode = Optional.e(playMode);
            return this;
        }

        public Play setTotalCount(int i) {
            this.total_count = Optional.e(Integer.valueOf(i));
            return this;
        }

        public Play(PlayBehavior playBehavior, List<AudioItemV1> list) {
            this.play_behavior = playBehavior;
            this.audio_items = list;
        }
    }

    @NamespaceName(name = "PlaybackState", namespace = AIApiConstants.AudioPlayer.NAME)
    public static class PlaybackState implements ContextPayload {

        @Required
        private AudioPlayerStatus status;
        private Optional<AudioPlayerPlayMode> play_mode = Optional.a();
        private Optional<Integer> volume = Optional.a();

        @Deprecated
        private Optional<String> audio_id = Optional.a();

        @Deprecated
        private Optional<Long> favorites_id = Optional.a();
        private Optional<PlaybackAudioMeta> audio_meta = Optional.a();

        @Deprecated
        private Optional<Boolean> kid_mode = Optional.a();
        private Optional<Boolean> disable_personalize = Optional.a();
        private Optional<List<ThirdPartyPlaybackAudioMeta>> third_party_meta = Optional.a();
        private Optional<Speaker.VolumeType> channel = Optional.a();
        private Optional<Float> play_multiple = Optional.a();

        public PlaybackState() {
        }

        @Deprecated
        public Optional<String> getAudioId() {
            return this.audio_id;
        }

        public Optional<PlaybackAudioMeta> getAudioMeta() {
            return this.audio_meta;
        }

        public Optional<Speaker.VolumeType> getChannel() {
            return this.channel;
        }

        @Deprecated
        public Optional<Long> getFavoritesId() {
            return this.favorites_id;
        }

        public Optional<AudioPlayerPlayMode> getPlayMode() {
            return this.play_mode;
        }

        public Optional<Float> getPlayMultiple() {
            return this.play_multiple;
        }

        @Required
        public AudioPlayerStatus getStatus() {
            return this.status;
        }

        public Optional<List<ThirdPartyPlaybackAudioMeta>> getThirdPartyMeta() {
            return this.third_party_meta;
        }

        public Optional<Integer> getVolume() {
            return this.volume;
        }

        public Optional<Boolean> isDisablePersonalize() {
            return this.disable_personalize;
        }

        @Deprecated
        public Optional<Boolean> isKidMode() {
            return this.kid_mode;
        }

        @Deprecated
        public PlaybackState setAudioId(String str) {
            this.audio_id = Optional.e(str);
            return this;
        }

        public PlaybackState setAudioMeta(PlaybackAudioMeta playbackAudioMeta) {
            this.audio_meta = Optional.e(playbackAudioMeta);
            return this;
        }

        public PlaybackState setChannel(Speaker.VolumeType volumeType) {
            this.channel = Optional.e(volumeType);
            return this;
        }

        public PlaybackState setDisablePersonalize(boolean z) {
            this.disable_personalize = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Deprecated
        public PlaybackState setFavoritesId(long j) {
            this.favorites_id = Optional.e(Long.valueOf(j));
            return this;
        }

        @Deprecated
        public PlaybackState setKidMode(boolean z) {
            this.kid_mode = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PlaybackState setPlayMode(AudioPlayerPlayMode audioPlayerPlayMode) {
            this.play_mode = Optional.e(audioPlayerPlayMode);
            return this;
        }

        public PlaybackState setPlayMultiple(float f) {
            this.play_multiple = Optional.e(Float.valueOf(f));
            return this;
        }

        @Required
        public PlaybackState setStatus(AudioPlayerStatus audioPlayerStatus) {
            this.status = audioPlayerStatus;
            return this;
        }

        public PlaybackState setThirdPartyMeta(List<ThirdPartyPlaybackAudioMeta> list) {
            this.third_party_meta = Optional.e(list);
            return this;
        }

        public PlaybackState setVolume(int i) {
            this.volume = Optional.e(Integer.valueOf(i));
            return this;
        }

        public PlaybackState(AudioPlayerStatus audioPlayerStatus) {
            this.status = audioPlayerStatus;
        }
    }
}
