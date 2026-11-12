package com.xiaomi.hm.health.device.setting.pattern.impl.gt2;

import androidx.p010navigation.NavController;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import com.xiaomi.hm.health.device.setting.ui.TelephoneNavAction;
import com.xiaomi.hm.health.device.setting.vo.WatchAppItemVo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt2/VolgaFeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt2/GT2FeatureTree;", "", "setup", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class VolgaFeatureTree extends GT2FeatureTree {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<NavController, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            navController.navigate(R.id.action_to_manage_reply_message);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.pattern.impl.gt2.GT2FeatureTree, com.xiaomi.hm.health.device.setting.pattern.FeatureTree
    public void setup() {
        super.setup();
        putFeature(SoftFeature.E_SIM_MANAGEMENT);
        for (SoftFeature softFeature : CollectionsKt__CollectionsKt.arrayListOf(SoftFeature.FLIGHT_BUTLER, SoftFeature.TIGER_STOCKS, SoftFeature.CASSETTE_PLAYER, SoftFeature.ALBUM, SoftFeature.SLEEP, SoftFeature.WORLD_CLOCK)) {
            removeAppItem(softFeature);
            removeFeature(softFeature);
        }
        if (findDeviceSource() == HMDeviceSource.MILI_VOLGA_W) {
            for (SoftFeature softFeature2 : CollectionsKt__CollectionsKt.arrayListOf(SoftFeature.NFC_CARD, SoftFeature.ALI_PAY, SoftFeature.NET_EAST_MUSIC)) {
                removeAppItem(softFeature2);
                removeFeature(softFeature2);
            }
        }
        WatchAppItemVo watchAppItemVoFindWatchApp = findWatchApp(SoftFeature.TELEPHONE);
        if (watchAppItemVoFindWatchApp != null) {
            watchAppItemVoFindWatchApp.setAction(new TelephoneNavAction());
        }
        FeatureTree.setAppItem$default(this, SoftFeature.TEXT_MESSAGE, R.drawable.app_sort_text_message, 10, R.string.app_sort_text_message, false, a.a, 16, null);
    }
}
