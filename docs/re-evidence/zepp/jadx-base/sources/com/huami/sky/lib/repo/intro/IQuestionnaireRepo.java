package com.huami.sky.lib.repo.intro;

import com.huami.sky.lib.entity.MusicPreference;
import com.huami.sky.lib.entity.MusicPreferenceItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\n2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/sky/lib/repo/intro/IQuestionnaireRepo;", "", "Lcom/huami/sky/lib/entity/MusicPreference;", "getMusicPreferenceInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "answers", "", "saveAndPostQuestionsToServer", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSelectedChanged", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface IQuestionnaireRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean isSelectedChanged(@NotNull IQuestionnaireRepo iQuestionnaireRepo, @NotNull Map<String, ? extends List<MusicPreferenceItem>> map) {
            return false;
        }
    }

    @Nullable
    Object getMusicPreferenceInfo(@NotNull Continuation<? super MusicPreference> continuation);

    boolean isSelectedChanged(@NotNull Map<String, ? extends List<MusicPreferenceItem>> answers);

    @Nullable
    Object saveAndPostQuestionsToServer(@NotNull Map<String, ? extends List<MusicPreferenceItem>> map, @NotNull Continuation<? super Boolean> continuation);
}
