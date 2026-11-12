package com.huami.sleepassistant.apilib.utils;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.hmchartui.utils.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/sleepassistant/apilib/utils/WebConst;", "", "", "PAGE_SIZE", LogUtil.I, "MUSIC_PAGE_SIZE", "<init>", "()V", "CollectionType", MAPCookie.KEY_PATH, "QueryParam", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class WebConst {

    @NotNull
    public static final WebConst INSTANCE = new WebConst();
    public static final int MUSIC_PAGE_SIZE = 1000;
    public static final int PAGE_SIZE = 1000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/sleepassistant/apilib/utils/WebConst$CollectionType;", "", "", CollectionType.SINGLE_AUDIO, "Ljava/lang/String;", "COMBINATION_AUDIO", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class CollectionType {

        @NotNull
        public static final String COMBINATION_AUDIO = "COMBINATION";

        @NotNull
        public static final CollectionType INSTANCE = new CollectionType();

        @NotNull
        public static final String SINGLE_AUDIO = "SINGLE_AUDIO";

        private CollectionType() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/huami/sleepassistant/apilib/utils/WebConst$Path;", "", "", "UPDATE_COLLECTION", "Ljava/lang/String;", "DEL_COLLECTION", "COLLECTION_MUSIC", "IS_COLLECTION_MUSIC", "TOPICS", "MUSIC_LIST", "LIVE_MUSIC_LIST", "SORT_COLLECTION", "PLAY_LIVE_MUSIC_LIST", "GET_AUDIO_DETAIL", "UPLOAD_MUSIC_HISTORY", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Path {

        @NotNull
        public static final String COLLECTION_MUSIC = "users/training/audio/sleep/item";

        @NotNull
        public static final String DEL_COLLECTION = "users/training/audio/sleep/item?sleepSetId={sleepSetId}";

        @NotNull
        public static final String GET_AUDIO_DETAIL = "users/newTrainingActionAudios";

        @NotNull
        public static final Path INSTANCE = new Path();

        @NotNull
        public static final String IS_COLLECTION_MUSIC = "users/training/audio/sleep/check/collection";

        @NotNull
        public static final String LIVE_MUSIC_LIST = "apps/collection/busiType/SLEEP/list";

        @NotNull
        public static final String MUSIC_LIST = "users/trainingActionAudios/type";

        @NotNull
        public static final String PLAY_LIVE_MUSIC_LIST = "users/training/audio/sleep/item";

        @NotNull
        public static final String SORT_COLLECTION = "apps/collection/busiType/SLEEP/count";

        @NotNull
        public static final String TOPICS = "v1/circle/topics";

        @NotNull
        public static final String UPDATE_COLLECTION = "users/training/audio/sleep/item";

        @NotNull
        public static final String UPLOAD_MUSIC_HISTORY = "users/trainingActionAudiosHistories";

        private Path() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/huami/sleepassistant/apilib/utils/WebConst$QueryParam;", "", "", "START", "Ljava/lang/String;", ViewHierarchyConstants.SEARCH, "NEXT", "LIMIT", "PAGE_SIZE", "SLEEP_SET_ID", "PLAY_TIME", "NAME", "SORT_LIST", "SET_ID", Constant.USER_ID, "AUDIOS", "AUDIO_ID", "COLLECT_TYPE", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class QueryParam {

        @NotNull
        public static final String AUDIOS = "audios";

        @NotNull
        public static final String AUDIO_ID = "audioId";

        @NotNull
        public static final String COLLECT_TYPE = "collectType";

        @NotNull
        public static final QueryParam INSTANCE = new QueryParam();

        @NotNull
        public static final String LIMIT = "limit";

        @NotNull
        public static final String NAME = "name";

        @NotNull
        public static final String NEXT = "next";

        @NotNull
        public static final String PAGE_SIZE = "pageSize";

        @NotNull
        public static final String PLAY_TIME = "playTime";

        @NotNull
        public static final String SEARCH = "search";

        @NotNull
        public static final String SET_ID = "setId";

        @NotNull
        public static final String SLEEP_SET_ID = "sleepSetId";

        @NotNull
        public static final String SORT_LIST = "sortList";

        @NotNull
        public static final String START = "start";

        @NotNull
        public static final String USER_ID = "userId";

        private QueryParam() {
        }
    }

    private WebConst() {
    }
}
