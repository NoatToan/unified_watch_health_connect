package com.xiaomi.fitness.main;

import com.xiaomi.fitness.account.api.bean.RegionBean;
import com.xiaomi.fitness.account.api.bean.RegionInfo;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.main.MainActivity$mNetworkListener$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, d2 = {"com/xiaomi/fitness/main/MainActivity$mNetworkListener$1", "Lkotlin/Function1;", "", "", "invoke", "isConnect", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/xiaomi/fitness/main/MainActivity$mNetworkListener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1433:1\n1#2:1434\n*E\n"})
public final class MainActivity$mNetworkListener$1 implements Function1<Boolean, Unit> {
    final /* synthetic */ MainActivity this$0;

    public MainActivity$mNetworkListener$1(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(RegionInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d(com.xiaomi.fitness.electronic.scale.MainActivity.TAG, "networkListener setUserRegion country is " + it.getRegion());
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public void invoke(boolean isConnect) {
        if (isConnect && AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            RegionManager.Companion companion = RegionManager.INSTANCE;
            RegionExtKt.getInstance(companion).setUserRegion(new RegionBean.CountryInfo(RegionExtKt.getInstance(companion).getLocalCountry()), new Function1() { // from class: f1f
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MainActivity$mNetworkListener$1.invoke$lambda$1((RegionInfo) obj);
                }
            });
            CheckerUserSettingManager.Companion companion2 = CheckerUserSettingManager.INSTANCE;
            if (CheckerUserSettingManagerExtKt.getInstance(companion2).getSelectMode() != -1) {
                Logger.d(com.xiaomi.fitness.electronic.scale.MainActivity.TAG, "networkListener getSelectMode " + CheckerUserSettingManagerExtKt.getInstance(companion2).getSelectMode());
                CheckerUserSettingManagerExtKt.getInstance(companion2).setSelectModeToWeb(CheckerUserSettingManagerExtKt.getInstance(companion2).getSelectMode());
            }
            CheckerUserSettingManagerExtKt.getInstance(companion2).requestData(this.this$0);
        }
    }
}
