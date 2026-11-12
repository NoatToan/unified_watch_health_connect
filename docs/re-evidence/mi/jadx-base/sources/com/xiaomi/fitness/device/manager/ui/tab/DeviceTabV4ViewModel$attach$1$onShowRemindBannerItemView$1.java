package com.xiaomi.fitness.device.manager.ui.tab;

import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.export.bean.TabDeviceBannerSettingsItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$attach$1$onShowRemindBannerItemView$1", f = "DeviceTabViewModelV4.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nDeviceTabViewModelV4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceTabViewModelV4.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel$attach$1$onShowRemindBannerItemView$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1574:1\n360#2,7:1575\n360#2,7:1582\n*S KotlinDebug\n*F\n+ 1 DeviceTabViewModelV4.kt\ncom/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel$attach$1$onShowRemindBannerItemView$1\n*L\n256#1:1575,7\n258#1:1582,7\n*E\n"})
public final class DeviceTabV4ViewModel$attach$1$onShowRemindBannerItemView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $remindType;
    int label;
    final /* synthetic */ DeviceTabV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceTabV4ViewModel$attach$1$onShowRemindBannerItemView$1(DeviceTabV4ViewModel deviceTabV4ViewModel, int i, Continuation<? super DeviceTabV4ViewModel$attach$1$onShowRemindBannerItemView$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceTabV4ViewModel;
        this.$remindType = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceTabV4ViewModel$attach$1$onShowRemindBannerItemView$1(this.this$0, this.$remindType, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.providerTabDeviceBannerSettingsItem();
        Iterator<TabContentItem> it = this.this$0.getTabItems().iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().getType() == 200) {
                break;
            }
            i2++;
        }
        Iterator<TabContentItem> it2 = this.this$0.getTabItems().iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (it2.next().getType() == 5) {
                break;
            }
            i++;
        }
        if (i2 == -1 && i != -1) {
            this.this$0.getTabItems().add(i + 1, this.this$0.mTabDeviceBannerSettingsItem);
        }
        TabDeviceBannerSettingsItem tabDeviceBannerSettingsItem = this.this$0.mTabDeviceBannerSettingsItem;
        if (tabDeviceBannerSettingsItem != null) {
            tabDeviceBannerSettingsItem.setRemindType(this.$remindType);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceTabV4ViewModel$attach$1$onShowRemindBannerItemView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
