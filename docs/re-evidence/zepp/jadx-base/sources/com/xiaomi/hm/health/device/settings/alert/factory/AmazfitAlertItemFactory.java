package com.xiaomi.hm.health.device.settings.alert.factory;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.settings.alert.AlertItemFactory;
import com.xiaomi.hm.health.device.settings.alert.Item;
import com.xiaomi.hm.health.device.settings.alert.action.AppAction;
import com.xiaomi.hm.health.device.settings.alert.action.IncomingCallAction;
import com.xiaomi.hm.health.device.settings.alert.action.ReachGoalAction;
import com.xiaomi.hm.health.device.settings.alert.action.SmsAction;
import com.xiaomi.hm.health.device.settings.alert.action.StandAction;
import com.xiaomi.hm.health.device.settings.alert.state.AppNotificationState;
import com.xiaomi.hm.health.device.settings.alert.state.IncomingCallAlertState;
import com.xiaomi.hm.health.device.settings.alert.state.ReachGoalAlertState;
import com.xiaomi.hm.health.device.settings.alert.state.SmsAlertState;
import com.xiaomi.hm.health.device.settings.alert.state.StandAlertState;
import com.xiaomi.hm.health.device.settings.alert.type.App;
import com.xiaomi.hm.health.device.settings.alert.type.IncomingCall;
import com.xiaomi.hm.health.device.settings.alert.type.ReachGoal;
import com.xiaomi.hm.health.device.settings.alert.type.Sms;
import com.xiaomi.hm.health.device.settings.alert.type.Stand;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/alert/factory/AmazfitAlertItemFactory;", "Lcom/xiaomi/hm/health/device/settings/alert/AlertItemFactory;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "Lcom/xiaomi/hm/health/device/settings/alert/Item;", "create", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/device/settings/alert/factory/AmazfitAlertConfigProvider;", "b", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/settings/alert/factory/AmazfitAlertConfigProvider;", "configProvider", "<init>", "(Landroid/content/Context;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AmazfitAlertItemFactory implements AlertItemFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy configProvider = KoinJavaComponent.inject$default(AmazfitAlertConfigProvider.class, null, null, 6, null);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_COMO.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_COMO_L.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_COMO_W.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_COMO_WL.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_NESS.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_NESS_W.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_DAX.ordinal()] = 7;
            iArr[HMDeviceSource.MILI_CRATER_WL.ordinal()] = 8;
            iArr[HMDeviceSource.MILI_CRATER_W.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<HMMiliConfig> {
        public a(AmazfitAlertConfigProvider amazfitAlertConfigProvider) {
            super(0, amazfitAlertConfigProvider, AmazfitAlertConfigProvider.class, "get", "get()Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMMiliConfig invoke() {
            return ((AmazfitAlertConfigProvider) this.receiver).get();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function0<HMMiliConfig> {
        public b(AmazfitAlertConfigProvider amazfitAlertConfigProvider) {
            super(0, amazfitAlertConfigProvider, AmazfitAlertConfigProvider.class, "get", "get()Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMMiliConfig invoke() {
            return ((AmazfitAlertConfigProvider) this.receiver).get();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0<HMMiliConfig> {
        public c(AmazfitAlertConfigProvider amazfitAlertConfigProvider) {
            super(0, amazfitAlertConfigProvider, AmazfitAlertConfigProvider.class, "get", "get()Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMMiliConfig invoke() {
            return ((AmazfitAlertConfigProvider) this.receiver).get();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function0<HMMiliConfig> {
        public d(AmazfitAlertConfigProvider amazfitAlertConfigProvider) {
            super(0, amazfitAlertConfigProvider, AmazfitAlertConfigProvider.class, "get", "get()Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMMiliConfig invoke() {
            return ((AmazfitAlertConfigProvider) this.receiver).get();
        }
    }

    public AmazfitAlertItemFactory(@NotNull Context context) {
        this.context = context;
    }

    private final AmazfitAlertConfigProvider a() {
        return (AmazfitAlertConfigProvider) this.configProvider.getValue();
    }

    @Override // com.xiaomi.hm.health.device.settings.alert.AlertItemFactory
    @NotNull
    public List<Item> create(@NotNull HMDeviceSource source) {
        switch (WhenMappings.$EnumSwitchMapping$0[source.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Item[]{new Item(IncomingCall.INSTANCE, new IncomingCallAlertState(this.context, new a(a())), IncomingCallAction.INSTANCE), new Item(App.INSTANCE, new AppNotificationState(this.context), AppAction.INSTANCE), new Item(Stand.INSTANCE, new StandAlertState(this.context, new b(a())), StandAction.INSTANCE), new Item(Sms.INSTANCE, new SmsAlertState(this.context, new c(a())), SmsAction.INSTANCE), new Item(ReachGoal.INSTANCE, new ReachGoalAlertState(this.context, new d(a())), ReachGoalAction.INSTANCE)});
            default:
                return CollectionsKt__CollectionsKt.emptyList();
        }
    }
}
