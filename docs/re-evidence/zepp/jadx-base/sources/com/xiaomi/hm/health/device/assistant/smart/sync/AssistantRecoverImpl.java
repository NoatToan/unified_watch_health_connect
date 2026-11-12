package com.xiaomi.hm.health.device.assistant.smart.sync;

import com.huami.bluetooth.profile.channel.module.assistant.dto.CardType;
import com.huami.bluetooth.profile.channel.module.assistant.response.AppCardsUpdateRequest;
import com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover;
import com.huami.bluetooth.profile.channel.module.syncable.Serializer;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/sync/AssistantRecoverImpl;", "Lcom/huami/bluetooth/profile/channel/module/syncable/DeviceDataRecover;", "", "Lcom/xiaomi/hm/health/device/assistant/smart/sync/SmartCardsSyncBean;", "settings", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/AppCardsUpdateRequest;", "a", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", "recover", "Lcom/huami/bluetooth/profile/channel/module/syncable/Serializer;", "Lcom/xiaomi/hm/health/device/assistant/smart/sync/SmartCardSettingItems;", "Lkotlin/Lazy;", "b", "()Lcom/huami/bluetooth/profile/channel/module/syncable/Serializer;", "serializer", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AssistantRecoverImpl implements DeviceDataRecover {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy serializer = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/sync/AssistantSerializer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AssistantSerializer> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AssistantSerializer getA() {
            return new AssistantSerializer();
        }
    }

    private final List<AppCardsUpdateRequest> a(List<SmartCardsSyncBean> settings) {
        ArrayList arrayList = new ArrayList();
        for (SmartCardsSyncBean smartCardsSyncBean : settings) {
            CardType cardTypeFindValueByInt = CardType.INSTANCE.findValueByInt(smartCardsSyncBean.getType());
            AppCardsUpdateRequest appCardsUpdateRequest = cardTypeFindValueByInt == null ? null : new AppCardsUpdateRequest(cardTypeFindValueByInt, smartCardsSyncBean.isEnable());
            if (appCardsUpdateRequest != null) {
                arrayList.add(appCardsUpdateRequest);
            }
        }
        return arrayList;
    }

    private final Serializer<SmartCardSettingItems> b() {
        return (Serializer) this.serializer.getValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover
    public boolean recover(@NotNull HMMiLiProDevice device) {
        return true;
    }
}
