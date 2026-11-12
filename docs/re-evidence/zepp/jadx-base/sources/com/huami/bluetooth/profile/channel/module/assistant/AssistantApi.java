package com.huami.bluetooth.profile.channel.module.assistant;

import com.huami.bluetooth.profile.channel.module.assistant.response.AppCardsResponse;
import com.huami.bluetooth.profile.channel.module.assistant.response.AppCardsUpdateRequest;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\r\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0006J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantApi;", "", "", "moduleId", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "callback", "", "register", "", "queryDisplayMattersSettings", "isDisplay", "updateDisplayMatters", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/AppCardsResponse;", "queryCardSetting", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/AppCardsUpdateRequest;", "requestBody", "updateCardSetting", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface AssistantApi {
    int moduleId();

    @Nullable
    Object queryCardSetting(@NotNull Continuation<? super Response<List<AppCardsResponse>>> continuation);

    @Nullable
    Object queryDisplayMattersSettings(@NotNull Continuation<? super Response<Boolean>> continuation);

    @Nullable
    Object queryVersion(@NotNull Continuation<? super Response<Integer>> continuation);

    void register(@NotNull DataTransferCallback callback);

    @Nullable
    Object updateCardSetting(@NotNull List<AppCardsUpdateRequest> list, @NotNull Continuation<? super Response<Boolean>> continuation);

    @Nullable
    Object updateDisplayMatters(boolean z, @NotNull Continuation<? super Response<Boolean>> continuation);
}
