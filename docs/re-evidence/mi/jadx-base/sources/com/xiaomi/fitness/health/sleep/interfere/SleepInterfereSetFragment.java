package com.xiaomi.fitness.health.sleep.interfere;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetFragment;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.interfere.utils.CalendarUtils;
import com.xiaomi.fitness.health.sleep.interfere.utils.SleepInterferePreference;
import com.xiaomi.fitness.health.sleep.interfere.widget.SleepInterfereTimeSetDialog;
import com.xiaomi.fitness.instance.InstanceExtKt;
import com.xiaomi.fitness.sleep.trace.ConfigurationInternal;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.a4i;
import defpackage.aje;
import defpackage.av6;
import defpackage.c0j;
import defpackage.cca;
import defpackage.dih;
import defpackage.eri;
import defpackage.jui;
import defpackage.nwi;
import defpackage.pni;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t*\u0001.\b\u0007\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00015B\u0007¢\u0006\u0004\b4\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\u0006R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereSetFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereSetVM;", "Lcca;", "", "parseBedAndWakeTime", "()V", "initView", "", "bedHour", "bedMinute", "wakeHour", "wakeMinute", "", "isSleepTimeValid", "(IIII)Z", "hour", "minute", "", "formatTime", "(II)Ljava/lang/String;", "isAdjustTargetTime", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", LifecycleConstantKt.ON_DESTROY, "", "planId", "Ljava/lang/Long;", "bedTime", "Ljava/lang/Integer;", "wakeTime", "La4i;", "popMenu", "La4i;", "Lcom/xiaomi/fitness/sleep/trace/ConfigurationInternal;", "sleepConfig", "Lcom/xiaomi/fitness/sleep/trace/ConfigurationInternal;", "com/xiaomi/fitness/health/sleep/interfere/SleepInterfereSetFragment$finishReceiver$1", "finishReceiver", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereSetFragment$finishReceiver$1;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInterfereSetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereSetFragment.kt\ncom/xiaomi/fitness/health/sleep/interfere/SleepInterfereSetFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,397:1\n54#2,3:398\n24#2:401\n59#2,6:402\n*S KotlinDebug\n*F\n+ 1 SleepInterfereSetFragment.kt\ncom/xiaomi/fitness/health/sleep/interfere/SleepInterfereSetFragment\n*L\n190#1:398,3\n190#1:401\n190#1:402,6\n*E\n"})
public final class SleepInterfereSetFragment extends Hilt_SleepInterfereSetFragment<SleepInterfereSetVM, cca> {

    @NotNull
    private static final String CLOSE_ACTION = "action.close_sleep_interfere_set";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_BED_HOUR = 22;
    private static final int DEFAULT_BED_MIN = 30;
    private static final int DEFAULT_WAKE_HOUR = 6;
    private static final int DEFAULT_WAKE_MIN = 30;

    @NotNull
    public static final String KEY_BED_TIME = "key.bed_time";

    @NotNull
    private static final String KEY_INTERFERE_ID = "";

    @NotNull
    public static final String KEY_WAKE_TIME = "key.wake_time";
    public static final int REQUEST_UPDATE_TARGET_TIME = 256;

    @Nullable
    private Integer bedTime;

    @Nullable
    private Long planId;

    @Nullable
    private a4i popMenu;

    @Nullable
    private Integer wakeTime;

    @Nullable
    private final ConfigurationInternal sleepConfig = (ConfigurationInternal) InstanceExtKt.getInstance(Reflection.getOrCreateKotlinClass(ConfigurationInternal.class));

    @NotNull
    private final SleepInterfereSetFragment$finishReceiver$1 finishReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetFragment$finishReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.this$0.requireActivity().finish();
            } catch (Exception unused) {
                Logger.e(BaseFragment.TAG, "close activity exception!!");
            }
        }
    };

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J7\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereSetFragment$Companion;", "", "<init>", "()V", "KEY_INTERFERE_ID", "", "REQUEST_UPDATE_TARGET_TIME", "", "KEY_BED_TIME", "KEY_WAKE_TIME", "CLOSE_ACTION", "DEFAULT_BED_HOUR", "DEFAULT_BED_MIN", "DEFAULT_WAKE_HOUR", "DEFAULT_WAKE_MIN", "launch", "", "ctx", "Landroid/content/Context;", "launchForResult", "planId", "", "bedTime", "wakeTime", "(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void launchForResult$default(Companion companion, Context context, Long l, Integer num, Integer num2, int i, Object obj) {
            if ((i & 2) != 0) {
                l = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            if ((i & 8) != 0) {
                num2 = null;
            }
            companion.launchForResult(context, l, num, num2);
        }

        public final void launch(@NotNull Context ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            dih.a().e(ctx, new FragmentParams.b().e(SleepInterfereSetFragment.class).b());
        }

        public final void launchForResult(@NotNull Context ctx, @Nullable Long planId, @Nullable Integer bedTime, @Nullable Integer wakeTime) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            dih dihVarA = dih.a();
            Activity activity = (Activity) ctx;
            FragmentParams.b bVarE = new FragmentParams.b().e(SleepInterfereSetFragment.class);
            Bundle bundle = new Bundle();
            bundle.putLong("", planId != null ? planId.longValue() : 0L);
            bundle.putInt(SleepInterfereSetFragment.KEY_BED_TIME, bedTime != null ? bedTime.intValue() : 0);
            bundle.putInt(SleepInterfereSetFragment.KEY_WAKE_TIME, wakeTime != null ? wakeTime.intValue() : 0);
            Unit unit = Unit.INSTANCE;
            dihVarA.h(activity, bVarE.c(bundle).b(), 256);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ cca access$getMBinding(SleepInterfereSetFragment sleepInterfereSetFragment) {
        return (cca) sleepInterfereSetFragment.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SleepInterfereSetVM access$getMViewModel(SleepInterfereSetFragment sleepInterfereSetFragment) {
        return (SleepInterfereSetVM) sleepInterfereSetFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatTime(int hour, int minute) {
        String strValueOf;
        String strValueOf2;
        StringBuilder sb = new StringBuilder();
        if (hour > 9) {
            strValueOf = String.valueOf(hour);
        } else {
            strValueOf = "0" + hour;
        }
        sb.append(strValueOf);
        sb.append(":");
        if (minute > 9) {
            strValueOf2 = String.valueOf(minute);
        } else {
            strValueOf2 = "0" + minute;
        }
        sb.append(strValueOf2);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((cca) getMBinding()).F.setTitle(c0j.Rg);
        ((cca) getMBinding()).E.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.D0, 8, 8));
        a4i a4iVar = new a4i(requireActivity(), ((cca) getMBinding()).F.findViewById(eri.Rb));
        this.popMenu = a4iVar;
        a4iVar.f(nwi.f28508k);
        a4i a4iVar2 = this.popMenu;
        if (a4iVar2 != null) {
            a4iVar2.setOnMenuItemClickListener(new a4i.c() { // from class: wom
                @Override // a4i.c
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return SleepInterfereSetFragment.initView$lambda$0(this.f38196a, menuItem);
                }
            });
        }
        ((cca) getMBinding()).F.setMoreClickListener(new View.OnClickListener() { // from class: xom
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepInterfereSetFragment.initView$lambda$1(this.f39317a, view);
            }
        });
        ((SleepInterfereSetVM) getMViewModel()).getUserInfoLiveData().observe(getViewLifecycleOwner(), new SleepInterfereSetFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yom
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepInterfereSetFragment.initView$lambda$4(this.f40382a, (AccountCoreInfo) obj);
            }
        }));
        ((SleepInterfereSetVM) getMViewModel()).getUserInfo();
        ((cca) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: zom
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepInterfereSetFragment.initView$lambda$6(this.f41526a, view);
            }
        });
        ((cca) getMBinding()).J.setOnClickListener(new View.OnClickListener() { // from class: apm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepInterfereSetFragment.initView$lambda$8(this.f3335a, view);
            }
        });
        ((cca) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: bpm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepInterfereSetFragment.initView$lambda$12(this.f4462a, view);
            }
        });
        ((cca) getMBinding()).B.setText(formatTime(((SleepInterfereSetVM) getMViewModel()).getBedHour(), ((SleepInterfereSetVM) getMViewModel()).getBedMinute()));
        ((cca) getMBinding()).J.setText(formatTime(((SleepInterfereSetVM) getMViewModel()).getWakeHour(), ((SleepInterfereSetVM) getMViewModel()).getWakeMinute()));
        if (isAdjustTargetTime()) {
            ((cca) getMBinding()).C.setText(getString(c0j.e));
        } else {
            ((cca) getMBinding()).C.setText(getString(c0j.wg));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$0(SleepInterfereSetFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (menuItem.getItemId() != eri.Oc) {
            return true;
        }
        SleepInterfereHistoryFragment.Companion companion = SleepInterfereHistoryFragment.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        companion.launch(fragmentActivityRequireActivity);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SleepInterfereSetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a4i a4iVar = this$0.popMenu;
        if (a4iVar != null) {
            a4iVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$12(final SleepInterfereSetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showLoading(c0j.yq, false);
        if (this$0.isAdjustTargetTime()) {
            ((SleepInterfereSetVM) this$0.getMViewModel()).getInterferePlanLiveData().observe(this$0.getViewLifecycleOwner(), new SleepInterfereSetFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: uom
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepInterfereSetFragment.initView$lambda$12$lambda$10(this.f35973a, (SleepInterferePlan) obj);
                }
            }));
            SleepInterfereSetVM sleepInterfereSetVM = (SleepInterfereSetVM) this$0.getMViewModel();
            Long l = this$0.planId;
            Intrinsics.checkNotNull(l);
            sleepInterfereSetVM.updateInterferePlan(l.longValue());
            return;
        }
        SleepInterferePreference sleepInterferePreference = SleepInterferePreference.INSTANCE;
        int sleepInterferePeriod = sleepInterferePreference.getCustomPeriod() ? sleepInterferePreference.getSleepInterferePeriod() : 21;
        CalendarUtils calendarUtils = CalendarUtils.INSTANCE;
        long jCalcDayStartTime = calendarUtils.calcDayStartTime(System.currentTimeMillis());
        long jCalcDayEndTime = calendarUtils.calcDayEndTime(System.currentTimeMillis() + ((long) ((sleepInterferePeriod - 1) * 86400000)));
        ((SleepInterfereSetVM) this$0.getMViewModel()).getInterferePlanLiveData().observe(this$0.getViewLifecycleOwner(), new SleepInterfereSetFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vom
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepInterfereSetFragment.initView$lambda$12$lambda$11(this.f37091a, (SleepInterferePlan) obj);
            }
        }));
        ((SleepInterfereSetVM) this$0.getMViewModel()).createInterferePlan(jCalcDayStartTime, jCalcDayEndTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$12$lambda$10(SleepInterfereSetFragment this$0, SleepInterferePlan sleepInterferePlan) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (sleepInterferePlan != null) {
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intent intent = new Intent();
            intent.putExtra(KEY_BED_TIME, (((SleepInterfereSetVM) this$0.getMViewModel()).getBedMinute() * 60) + (((SleepInterfereSetVM) this$0.getMViewModel()).getBedHour() * 3600));
            intent.putExtra(KEY_WAKE_TIME, (((SleepInterfereSetVM) this$0.getMViewModel()).getWakeMinute() * 60) + (((SleepInterfereSetVM) this$0.getMViewModel()).getWakeHour() * 3600));
            Unit unit = Unit.INSTANCE;
            fragmentActivityRequireActivity.setResult(0, intent);
            this$0.requireActivity().finish();
        } else {
            ToastUtil.INSTANCE.showToast(c0j.common_network_error_retry_later);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$12$lambda$11(SleepInterfereSetFragment this$0, SleepInterferePlan sleepInterferePlan) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (sleepInterferePlan != null) {
            SleepInterfereDetailFragment.Companion companion = SleepInterfereDetailFragment.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            companion.launch(fragmentActivityRequireActivity, sleepInterferePlan.getId(), sleepInterferePlan.getStartDate(), sleepInterferePlan.getEndDate(), sleepInterferePlan.getTargetBedtime(), sleepInterferePlan.getTargetWakeUpTime());
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else {
            ToastUtil.INSTANCE.showToast(c0j.common_network_error_retry_later);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$4(SleepInterfereSetFragment this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (accountCoreInfo != null) {
            RoundImageView userImg = ((cca) this$0.getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(userImg, "userImg");
            String avatarAddress = accountCoreInfo.getAvatarAddress();
            ImageLoader imageLoader = Coil.imageLoader(userImg.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(userImg.getContext()).data(avatarAddress).target(userImg);
            builderTarget.allowHardware(false);
            builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
            builderTarget.placeholder(pni.K1);
            builderTarget.error(pni.K1);
            imageLoader.enqueue(builderTarget.build());
            ((cca) this$0.getMBinding()).H.setText(accountCoreInfo.getUserName());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$6(final SleepInterfereSetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final SleepInterfereTimeSetDialog sleepInterfereTimeSetDialogCreate = SleepInterfereTimeSetDialog.INSTANCE.defaultBuilder("sleep_bedtime_set").setDialogTitle(c0j.ug).setNegativeText(c0j.c).setPositiveText(c0j.e).create();
        sleepInterfereTimeSetDialogCreate.setCurrentHour(((SleepInterfereSetVM) this$0.getMViewModel()).getBedHour());
        sleepInterfereTimeSetDialogCreate.setCurrentMinute(((SleepInterfereSetVM) this$0.getMViewModel()).getBedMinute());
        sleepInterfereTimeSetDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetFragment$initView$4$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    int currentHour = sleepInterfereTimeSetDialogCreate.getCurrentHour();
                    int currentMinute = sleepInterfereTimeSetDialogCreate.getCurrentMinute();
                    SleepInterfereSetFragment sleepInterfereSetFragment = this$0;
                    if (!sleepInterfereSetFragment.isSleepTimeValid(currentHour, currentMinute, SleepInterfereSetFragment.access$getMViewModel(sleepInterfereSetFragment).getWakeHour(), SleepInterfereSetFragment.access$getMViewModel(this$0).getWakeMinute())) {
                        ToastUtil.INSTANCE.showToast(c0j.vg);
                        return;
                    }
                    SleepInterfereSetFragment.access$getMViewModel(this$0).setBedHour(currentHour);
                    SleepInterfereSetFragment.access$getMViewModel(this$0).setBedMinute(currentMinute);
                    TextView textView = SleepInterfereSetFragment.access$getMBinding(this$0).B;
                    SleepInterfereSetFragment sleepInterfereSetFragment2 = this$0;
                    textView.setText(sleepInterfereSetFragment2.formatTime(SleepInterfereSetFragment.access$getMViewModel(sleepInterfereSetFragment2).getBedHour(), SleepInterfereSetFragment.access$getMViewModel(this$0).getBedMinute()));
                }
            }
        });
        sleepInterfereTimeSetDialogCreate.showIfNeed(this$0.getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$8(final SleepInterfereSetFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final SleepInterfereTimeSetDialog sleepInterfereTimeSetDialogCreate = SleepInterfereTimeSetDialog.INSTANCE.defaultBuilder("sleep_waketime_set").setDialogTitle(c0j.Fk).setNegativeText(c0j.c).setPositiveText(c0j.e).create();
        sleepInterfereTimeSetDialogCreate.setCurrentHour(((SleepInterfereSetVM) this$0.getMViewModel()).getWakeHour());
        sleepInterfereTimeSetDialogCreate.setCurrentMinute(((SleepInterfereSetVM) this$0.getMViewModel()).getWakeMinute());
        sleepInterfereTimeSetDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetFragment$initView$5$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    int currentHour = sleepInterfereTimeSetDialogCreate.getCurrentHour();
                    int currentMinute = sleepInterfereTimeSetDialogCreate.getCurrentMinute();
                    SleepInterfereSetFragment sleepInterfereSetFragment = this$0;
                    if (!sleepInterfereSetFragment.isSleepTimeValid(SleepInterfereSetFragment.access$getMViewModel(sleepInterfereSetFragment).getBedHour(), SleepInterfereSetFragment.access$getMViewModel(this$0).getBedMinute(), currentHour, currentMinute)) {
                        ToastUtil.INSTANCE.showToast(c0j.vg);
                        return;
                    }
                    SleepInterfereSetFragment.access$getMViewModel(this$0).setWakeHour(currentHour);
                    SleepInterfereSetFragment.access$getMViewModel(this$0).setWakeMinute(currentMinute);
                    TextView textView = SleepInterfereSetFragment.access$getMBinding(this$0).J;
                    SleepInterfereSetFragment sleepInterfereSetFragment2 = this$0;
                    textView.setText(sleepInterfereSetFragment2.formatTime(SleepInterfereSetFragment.access$getMViewModel(sleepInterfereSetFragment2).getWakeHour(), SleepInterfereSetFragment.access$getMViewModel(this$0).getWakeMinute()));
                }
            }
        });
        sleepInterfereTimeSetDialogCreate.showIfNeed(this$0.getParentFragmentManager());
    }

    private final boolean isAdjustTargetTime() {
        Long l = this.planId;
        if (l != null) {
            Intrinsics.checkNotNull(l);
            if (l.longValue() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSleepTimeValid(int bedHour, int bedMinute, int wakeHour, int wakeMinute) {
        return (bedHour == wakeHour && bedMinute == wakeMinute) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void parseBedAndWakeTime() {
        Integer num;
        Integer num2 = this.bedTime;
        if (num2 != null && num2.intValue() > 0 && (num = this.wakeTime) != null && num.intValue() > 0) {
            SleepInterfereSetVM sleepInterfereSetVM = (SleepInterfereSetVM) getMViewModel();
            Integer num3 = this.bedTime;
            Intrinsics.checkNotNull(num3);
            sleepInterfereSetVM.setBedHour(num3.intValue() / 3600);
            SleepInterfereSetVM sleepInterfereSetVM2 = (SleepInterfereSetVM) getMViewModel();
            Integer num4 = this.bedTime;
            Intrinsics.checkNotNull(num4);
            int iIntValue = num4.intValue();
            Integer num5 = this.bedTime;
            Intrinsics.checkNotNull(num5);
            sleepInterfereSetVM2.setBedMinute((iIntValue - ((num5.intValue() / 3600) * 3600)) / 60);
            SleepInterfereSetVM sleepInterfereSetVM3 = (SleepInterfereSetVM) getMViewModel();
            Integer num6 = this.wakeTime;
            Intrinsics.checkNotNull(num6);
            sleepInterfereSetVM3.setWakeHour(num6.intValue() / 3600);
            SleepInterfereSetVM sleepInterfereSetVM4 = (SleepInterfereSetVM) getMViewModel();
            Integer num7 = this.wakeTime;
            Intrinsics.checkNotNull(num7);
            int iIntValue2 = num7.intValue();
            Integer num8 = this.wakeTime;
            Intrinsics.checkNotNull(num8);
            sleepInterfereSetVM4.setWakeMinute((iIntValue2 - ((num8.intValue() / 3600) * 3600)) / 60);
            return;
        }
        if (AppUtil.INSTANCE.isPlayChannel() || !RomUtils.isXiaomi()) {
            ((SleepInterfereSetVM) getMViewModel()).setBedHour(22);
            ((SleepInterfereSetVM) getMViewModel()).setBedMinute(30);
            ((SleepInterfereSetVM) getMViewModel()).setWakeHour(6);
            ((SleepInterfereSetVM) getMViewModel()).setWakeMinute(30);
            return;
        }
        ConfigurationInternal configurationInternal = this.sleepConfig;
        Integer numValueOf = configurationInternal != null ? Integer.valueOf(configurationInternal.getCurSleepHour()) : null;
        ConfigurationInternal configurationInternal2 = this.sleepConfig;
        Integer numValueOf2 = configurationInternal2 != null ? Integer.valueOf(configurationInternal2.getCurSleepMinute()) : null;
        ConfigurationInternal configurationInternal3 = this.sleepConfig;
        Integer numValueOf3 = configurationInternal3 != null ? Integer.valueOf(configurationInternal3.getCurWakeHour()) : null;
        ConfigurationInternal configurationInternal4 = this.sleepConfig;
        Logger.d(BaseFragment.TAG, "xiaomi-sleep-config:" + numValueOf + " - " + numValueOf2 + " -" + numValueOf3 + " - " + (configurationInternal4 != null ? Integer.valueOf(configurationInternal4.getCurWakeMinute()) : null));
        SleepInterfereSetVM sleepInterfereSetVM5 = (SleepInterfereSetVM) getMViewModel();
        ConfigurationInternal configurationInternal5 = this.sleepConfig;
        sleepInterfereSetVM5.setBedHour(configurationInternal5 != null ? configurationInternal5.getCurSleepHour() : 22);
        SleepInterfereSetVM sleepInterfereSetVM6 = (SleepInterfereSetVM) getMViewModel();
        ConfigurationInternal configurationInternal6 = this.sleepConfig;
        sleepInterfereSetVM6.setBedMinute(configurationInternal6 != null ? configurationInternal6.getCurSleepMinute() : 30);
        SleepInterfereSetVM sleepInterfereSetVM7 = (SleepInterfereSetVM) getMViewModel();
        ConfigurationInternal configurationInternal7 = this.sleepConfig;
        sleepInterfereSetVM7.setWakeHour(configurationInternal7 != null ? configurationInternal7.getCurWakeHour() : 6);
        SleepInterfereSetVM sleepInterfereSetVM8 = (SleepInterfereSetVM) getMViewModel();
        ConfigurationInternal configurationInternal8 = this.sleepConfig;
        sleepInterfereSetVM8.setWakeMinute(configurationInternal8 != null ? configurationInternal8.getCurWakeMinute() : 30);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.R0;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.planId = arguments != null ? Long.valueOf(arguments.getLong("")) : null;
        Bundle arguments2 = getArguments();
        this.bedTime = arguments2 != null ? Integer.valueOf(arguments2.getInt(KEY_BED_TIME)) : null;
        Bundle arguments3 = getArguments();
        this.wakeTime = arguments3 != null ? Integer.valueOf(arguments3.getInt(KEY_WAKE_TIME)) : null;
        if (savedInstanceState != null) {
            Logger.i(BaseFragment.TAG, "restore from instance");
            this.planId = Long.valueOf(savedInstanceState.getLong(""));
            this.bedTime = Integer.valueOf(savedInstanceState.getInt(KEY_BED_TIME));
            this.wakeTime = Integer.valueOf(savedInstanceState.getInt(KEY_WAKE_TIME));
        }
        parseBedAndWakeTime();
        aje.b(requireContext()).d(new Intent(CLOSE_ACTION));
        aje.b(requireContext()).c(this.finishReceiver, new IntentFilter(CLOSE_ACTION));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        try {
            aje.b(requireContext()).e(this.finishReceiver);
        } catch (Exception e) {
            Logger.e(BaseFragment.TAG, "unregister exception:" + e.getMessage(), e);
        }
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_WAKE_TIME, (((SleepInterfereSetVM) getMViewModel()).getWakeHour() * 3600) + (((SleepInterfereSetVM) getMViewModel()).getWakeMinute() * 60));
        outState.putInt(KEY_BED_TIME, (((SleepInterfereSetVM) getMViewModel()).getBedHour() * 3600) + (((SleepInterfereSetVM) getMViewModel()).getBedMinute() * 60));
        Long l = this.planId;
        outState.putLong("", l != null ? l.longValue() : 0L);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initView();
    }
}
