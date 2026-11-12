package com.xiaomi.hm.health.di.koin.imp;

import android.app.Activity;
import android.content.Context;
import com.huami.bluetooth.profile.channel.module.notification.NotificationModule;
import com.huami.device.feature.notification.data.AlertDataCompat;
import com.huami.relatives.ConstantExternal;
import com.huami.relatives.FriendsAndFamilyInject;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.ui.smartplay.AlertDataHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/imp/RelationImpl;", "Lcom/huami/relatives/FriendsAndFamilyInject;", "Landroid/content/Context;", "getAppContext", "Lcom/huami/relatives/ConstantExternal;", "getConstantExternal", "Landroid/app/Activity;", "activity", "", "isMainTabActivityInTabOnCourse", "", "getFlavorProduction", "fromUsername", "", "deviceAlert", "a", "Landroid/content/Context;", "applicationContext", "b", "Lcom/huami/relatives/ConstantExternal;", "constantExternal", "<init>", "(Landroid/content/Context;Lcom/huami/relatives/ConstantExternal;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RelationImpl implements FriendsAndFamilyInject {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ConstantExternal constantExternal;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deviceAlert";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device is null";
        }
    }

    public RelationImpl(@NotNull Context context, @NotNull ConstantExternal constantExternal) {
        this.applicationContext = context;
        this.constantExternal = constantExternal;
    }

    @Override // com.huami.relatives.FriendsAndFamilyInject
    public void deviceAlert(@NotNull String fromUsername) {
        final String str = "Relation";
        HMLog.info("Relation", a.a);
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        HMMiLiDevice hMMiLiDevice = null;
        HMMiLiDevice hMMiLiDevice2 = device instanceof HMMiLiDevice ? (HMMiLiDevice) device : null;
        if (hMMiLiDevice2 != null) {
            AlertDataCompat alertDataCompat = new AlertDataCompat(new HMAlertModeExt(HMAlertMode.ALERT_LOVE, fromUsername), null, 0, 0, 14, null);
            if (hMMiLiDevice2.supportModule(NotificationModule.class)) {
                ((HMMiLiProDevice) hMMiLiDevice2).notify(AlertDataHelper.INSTANCE.getNotificationInfo(alertDataCompat), new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.di.koin.imp.RelationImpl$deviceAlert$2$1

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ Boolean a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(Boolean bool) {
                            super(0);
                            this.a = bool;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "love result " + this.a;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(@Nullable Boolean result) {
                        super.onFinish(result);
                        HMLog.info(str, new a(result));
                    }
                });
            } else {
                hMMiLiDevice2.alert(alertDataCompat.getCom.xmlywind.sdk.common.Constants.EXT java.lang.String(), new HMCallback<Object>() { // from class: com.xiaomi.hm.health.di.koin.imp.RelationImpl$deviceAlert$2$2

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ boolean a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(boolean z) {
                            super(0);
                            this.a = z;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "love result " + this.a;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        HMLog.info(str, new a(result));
                    }
                });
            }
            hMMiLiDevice = hMMiLiDevice2;
        }
        if (hMMiLiDevice == null) {
            HMLog.info("Relation", b.a);
        }
    }

    @Override // com.huami.relatives.FriendsAndFamilyInject
    @NotNull
    public Context getAppContext() {
        return this.applicationContext.getApplicationContext();
    }

    @Override // com.huami.relatives.FriendsAndFamilyInject
    @NotNull
    public ConstantExternal getConstantExternal() {
        return this.constantExternal;
    }

    @Override // com.huami.relatives.FriendsAndFamilyInject
    @NotNull
    public String getFlavorProduction() {
        return "midong";
    }

    @Override // com.huami.relatives.FriendsAndFamilyInject
    public boolean isMainTabActivityInTabOnCourse(@Nullable Activity activity) {
        return (activity instanceof MainTabActivity) && ((MainTabActivity) activity).isTabOnCourse();
    }
}
