package com.xiaomi.fitness.login.export;

import android.content.Context;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.kb;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0001\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0001\u001a\n\u0010\n\u001a\u00020\b*\u00020\u0001\u001a\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"instance", "Lcom/xiaomi/fitness/login/export/RegionManager;", "Lcom/xiaomi/fitness/login/export/RegionManager$Companion;", "getInstance", "(Lcom/xiaomi/fitness/login/export/RegionManager$Companion;)Lcom/xiaomi/fitness/login/export/RegionManager;", "instance$delegate", "Lkotlin/Lazy;", "isInland", "", "isInTaiwan", "isRegionSelected", "REGION_SELECT_ACTIVITY_PATH", "", "GUID_SHOW", "selectRegion", "", "context", "Landroid/content/Context;", "login-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RegionExtKt {

    @NotNull
    public static final String GUID_SHOW = "guid_show";

    @NotNull
    public static final String REGION_SELECT_ACTIVITY_PATH = "/region/activity/select";

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nbk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RegionExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final RegionManager getInstance(@NotNull RegionManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (RegionManager) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RegionManager instance_delegate$lambda$0() {
        return ((RegionManagerPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), RegionManagerPoint.class)).getRegionManager();
    }

    public static final boolean isInTaiwan(@NotNull RegionManager regionManager) {
        Intrinsics.checkNotNullParameter(regionManager, "<this>");
        return StringsKt__StringsJVMKt.equals(ServerConstants.OLD_TW_COUNTRY_CODE, regionManager.getLocalCountry(), true);
    }

    public static final boolean isInland(@NotNull RegionManager regionManager) {
        Intrinsics.checkNotNullParameter(regionManager, "<this>");
        return StringsKt__StringsJVMKt.equals("cn", regionManager.getCurrentRegion(), true);
    }

    public static final boolean isRegionSelected(@NotNull RegionManager regionManager) {
        Intrinsics.checkNotNullParameter(regionManager, "<this>");
        return regionManager.getCurrentRegion().length() > 0;
    }

    public static final void selectRegion(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(REGION_SELECT_ACTIVITY_PATH).withBoolean(GUID_SHOW, false).navigation(context);
    }
}
