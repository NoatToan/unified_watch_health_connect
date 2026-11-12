package com.huami.sky.lib.repo.intro;

import com.huami.sky.lib.entity.MusicPreferenceItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/huami/sky/lib/repo/intro/SelectedMusicPrefsRepo;", "", "", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "selectedItems", "", "saveSelectedMusicPrefs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getSelectedMusicPrefs", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface SelectedMusicPrefsRepo {
    @Nullable
    Object getSelectedMusicPrefs(@NotNull Continuation<? super Flow<? extends List<MusicPreferenceItem>>> continuation);

    @Nullable
    Object saveSelectedMusicPrefs(@NotNull List<MusicPreferenceItem> list, @NotNull Continuation<? super Unit> continuation);
}
