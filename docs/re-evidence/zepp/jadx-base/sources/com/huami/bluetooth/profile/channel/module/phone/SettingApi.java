package com.huami.bluetooth.profile.channel.module.phone;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.phone.dto.ItemDto;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0013\u0010\n\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H¦@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ!\u0010\u001b\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H¦@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H¦@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/phone/SettingApi;", "", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onReceive", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "callback", "setTransferCallback", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onlyRegister", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/module/phone/PairStatus;", "statusChange", "registerPairStatus", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "phoneBtName", "queryPairStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/phone/dto/ItemDto;", "querySettings", "items", "updateSetting", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preparePair", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface SettingApi {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Object preparePair$default(SettingApi settingApi, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preparePair");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return settingApi.preparePair(str, continuation);
        }

        public static /* synthetic */ Object registerPairStatus$default(SettingApi settingApi, boolean z, Function1 function1, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerPairStatus");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return settingApi.registerPairStatus(z, function1, continuation);
        }
    }

    void onReceive(@NotNull ChannelResponse response);

    @Nullable
    Object preparePair(@Nullable String str, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object queryPairStatus(@Nullable String str, @NotNull Continuation<? super PairStatus> continuation);

    @Nullable
    Object querySettings(@NotNull Continuation<? super List<? extends ItemDto>> continuation);

    @Nullable
    Object queryVersion(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object registerPairStatus(boolean z, @NotNull Function1<? super PairStatus, Unit> function1, @NotNull Continuation<? super Unit> continuation);

    void setTransferCallback(@NotNull DataTransferCallback callback);

    @Nullable
    Object updateSetting(@NotNull List<? extends ItemDto> list, @NotNull Continuation<? super Boolean> continuation);
}
