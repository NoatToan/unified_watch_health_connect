package com.huami.sleepassistant.apilib.repo;

import com.huami.sleepassistant.apilib.bean.AlbumBean;
import com.huami.sleepassistant.apilib.bean.CollectionMusic;
import com.huami.sleepassistant.apilib.bean.CollectionResult;
import com.huami.sleepassistant.apilib.bean.IdLiveMusicBean;
import com.huami.sleepassistant.apilib.bean.IsCollectionResult;
import com.huami.sleepassistant.apilib.bean.Items;
import com.huami.sleepassistant.apilib.bean.LiveMusicBean;
import com.huami.sleepassistant.apilib.bean.MusicBean;
import com.huami.sleepassistant.apilib.bean.UpdateCollection;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.sleepassistant.apilib.vo.ApiResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J3\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000f\u0010\rJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0016H&J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0018j\b\u0012\u0004\u0012\u00020\u0002`\u0019H&J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\u0006\u0010\u001e\u001a\u00020\u0002H&J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H&¨\u0006$"}, d2 = {"Lcom/huami/sleepassistant/apilib/repo/SleepAssistantWebApi;", "", "", "item", "Lcom/huami/sleepassistant/apilib/vo/ApiResponse;", "Lcom/huami/sleepassistant/apilib/bean/IdLiveMusicBean;", "playLiveMusic", "nextPageKey", "", WebConst.QueryParam.PAGE_SIZE, "Lcom/huami/sleepassistant/apilib/bean/Items;", "Lcom/huami/sleepassistant/apilib/bean/MusicBean;", "loadMusic", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huami/sleepassistant/apilib/vo/ApiResponse;", "Lcom/huami/sleepassistant/apilib/bean/LiveMusicBean;", "loadLiveMusic", "Lcom/huami/sleepassistant/apilib/bean/CollectionMusic;", "mCollectionMusic", "Lcom/huami/sleepassistant/apilib/bean/CollectionResult;", "postCollectionMusic", "id", "getDelCollection", "Lcom/huami/sleepassistant/apilib/bean/UpdateCollection;", "updateCollection", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "list", "sortCollection", "Lcom/huami/sleepassistant/apilib/bean/IsCollectionResult;", "postIsCollectionMusic", WebConst.QueryParam.AUDIO_ID, "Lcom/huami/sleepassistant/apilib/bean/AlbumBean;", "getAudioDetail", "resourceId", "resourceType", "uploadMusicHistory", "apilib_release"}, k = 1, mv = {1, 5, 1})
public interface SleepAssistantWebApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ ApiResponse loadLiveMusic$default(SleepAssistantWebApi sleepAssistantWebApi, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadLiveMusic");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return sleepAssistantWebApi.loadLiveMusic(str, num);
        }

        public static /* synthetic */ ApiResponse loadMusic$default(SleepAssistantWebApi sleepAssistantWebApi, String str, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMusic");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                num = null;
            }
            return sleepAssistantWebApi.loadMusic(str, num);
        }
    }

    @NotNull
    ApiResponse<AlbumBean> getAudioDetail(@NotNull String audioId);

    @NotNull
    ApiResponse<String> getDelCollection(@NotNull String id);

    @NotNull
    ApiResponse<Items<LiveMusicBean>> loadLiveMusic(@Nullable String nextPageKey, @Nullable Integer pageSize);

    @NotNull
    ApiResponse<Items<MusicBean>> loadMusic(@Nullable String nextPageKey, @Nullable Integer pageSize);

    @NotNull
    ApiResponse<IdLiveMusicBean> playLiveMusic(@NotNull String item);

    @NotNull
    ApiResponse<CollectionResult> postCollectionMusic(@NotNull CollectionMusic mCollectionMusic);

    @NotNull
    ApiResponse<IsCollectionResult> postIsCollectionMusic(@NotNull CollectionMusic mCollectionMusic);

    @NotNull
    ApiResponse<String> sortCollection(@NotNull ArrayList<String> list);

    @NotNull
    ApiResponse<String> updateCollection(@NotNull UpdateCollection item);

    @NotNull
    ApiResponse<String> uploadMusicHistory(@NotNull String resourceId, @NotNull String resourceType);
}
