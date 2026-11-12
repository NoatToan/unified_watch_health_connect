package com.huami.bluetooth.profile.channel.module.assistant;

import com.huami.bluetooth.profile.channel.module.assistant.response.AppCardsResponse;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J#\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007J)\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J#\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantDataBackApi;", "", "", "data", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "onQueryVersionBack", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onQueryDisplayMattersSettingsBack", "onUpdateDisplayMattersBack", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/AppCardsResponse;", "onQueryCardSettingBack", "onUpdateCardSettingBack", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface AssistantDataBackApi {
    @Nullable
    Object onQueryCardSettingBack(@NotNull byte[] bArr, @NotNull Continuation<? super Response<List<AppCardsResponse>>> continuation);

    @Nullable
    Object onQueryDisplayMattersSettingsBack(@NotNull byte[] bArr, @NotNull Continuation<? super Response<Boolean>> continuation);

    @Nullable
    Object onQueryVersionBack(@NotNull byte[] bArr, @NotNull Continuation<? super Response<Integer>> continuation);

    @Nullable
    Object onUpdateCardSettingBack(@NotNull byte[] bArr, @NotNull Continuation<? super Response<Boolean>> continuation);

    @Nullable
    Object onUpdateDisplayMattersBack(@NotNull byte[] bArr, @NotNull Continuation<? super Response<Boolean>> continuation);
}
