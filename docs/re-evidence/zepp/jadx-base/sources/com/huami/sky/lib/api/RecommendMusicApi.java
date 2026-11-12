package com.huami.sky.lib.api;

import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.lib.entity.MusicEntity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/huami/sky/lib/api/RecommendMusicApi;", "", "", WebConstant.QueryParam.LAUNCH, "", WebConstant.QueryParam.SWITCH, "Lcom/huami/sky/lib/entity/MusicEntity;", "recommendMusic", "(ZLjava/lang/Integer;)Lcom/huami/sky/lib/entity/MusicEntity;", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface RecommendMusicApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ MusicEntity recommendMusic$default(RecommendMusicApi recommendMusicApi, boolean z, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recommendMusic");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return recommendMusicApi.recommendMusic(z, num);
        }
    }

    @Nullable
    MusicEntity recommendMusic(boolean launch, @Nullable Integer num);
}
