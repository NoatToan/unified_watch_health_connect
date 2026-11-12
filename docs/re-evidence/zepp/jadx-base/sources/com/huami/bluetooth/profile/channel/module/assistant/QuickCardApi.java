package com.huami.bluetooth.profile.channel.module.assistant;

import com.huami.bluetooth.profile.channel.module.assistant.v2.QuickCardStruct;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0004J!\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/QuickCardApi;", "", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryDisplayMattersSetting", "isDisplay", "updateDisplayMatters", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/v2/QuickCardStruct$QueryCardsResponseItem;", "queryCardSetting", "items", "updateCardsSetting", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface QuickCardApi {
    @Nullable
    Object queryCardSetting(@NotNull Continuation<? super Iterable<QuickCardStruct.QueryCardsResponseItem>> continuation);

    @Nullable
    Object queryDisplayMattersSetting(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object queryVersion(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object updateCardsSetting(@NotNull Iterable<QuickCardStruct.QueryCardsResponseItem> iterable, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object updateDisplayMatters(boolean z, @NotNull Continuation<? super Boolean> continuation);
}
