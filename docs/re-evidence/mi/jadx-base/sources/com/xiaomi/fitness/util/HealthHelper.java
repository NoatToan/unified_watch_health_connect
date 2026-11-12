package com.xiaomi.fitness.util;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.xiaomi.fit.fitness.export.sp.FitnessDataPreference;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.single.Weak;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SingleHolder;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.homepage.HealthViewModel;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.util.HealthHelper;
import defpackage.av6;
import defpackage.c0j;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003J\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR/\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/util/HealthHelper;", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "<set-?>", "act", "getAct", "()Landroidx/fragment/app/FragmentActivity;", "setAct", "act$delegate", "Lcom/xiaomi/fitness/common/single/Weak;", "showLoginDialog", "", "getShowLoginDialog", "()Z", "setShowLoginDialog", "(Z)V", "showLoginConfirmDialog", "", "checkLogin", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showSyncDialog", "showSyncSwitchOpenDialog", "showMedalDialog", "medalModel", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "mViewModel", "Lcom/xiaomi/fitness/homepage/HealthViewModel;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthHelper.kt\ncom/xiaomi/fitness/util/HealthHelper\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,148:1\n314#2,11:149\n*S KotlinDebug\n*F\n+ 1 HealthHelper.kt\ncom/xiaomi/fitness/util/HealthHelper\n*L\n91#1:149,11\n*E\n"})
public final class HealthHelper {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthHelper.class, "act", "getAct()Landroidx/fragment/app/FragmentActivity;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: act$delegate, reason: from kotlin metadata */
    @NotNull
    private final Weak act;
    private boolean showLoginDialog;
    private boolean showSyncDialog;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/util/HealthHelper$Companion;", "Lcom/xiaomi/fitness/common/utils/SingleHolder;", "Lcom/xiaomi/fitness/util/HealthHelper;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion extends SingleHolder<HealthHelper, FragmentActivity> {

        /* JADX INFO: renamed from: com.xiaomi.fitness.util.HealthHelper$Companion$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<FragmentActivity, HealthHelper> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1, HealthHelper.class, "<init>", "<init>(Landroidx/fragment/app/FragmentActivity;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final HealthHelper invoke2(FragmentActivity p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new HealthHelper(p0, null);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(AnonymousClass1.INSTANCE);
        }
    }

    public /* synthetic */ HealthHelper(FragmentActivity fragmentActivity, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object checkLogin(Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final AccountManager accountManagerExtKt = AccountManagerExtKt.getInstance(AccountManager.INSTANCE);
        accountManagerExtKt.addAccountListener(new Function1<Boolean, Unit>() { // from class: com.xiaomi.fitness.util.HealthHelper$checkLogin$2$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public void invoke(boolean p1) {
                cancellableContinuationImpl.resume(Boolean.valueOf(p1), new Function1<Throwable, Unit>() { // from class: com.xiaomi.fitness.util.HealthHelper$checkLogin$2$1$invoke$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }
                });
                accountManagerExtKt.removeAccountListener(this);
            }
        });
        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showMedalDialog$lambda$2$lambda$1(HealthViewModel mViewModel) {
        Intrinsics.checkNotNullParameter(mViewModel, "$mViewModel");
        mViewModel.closeMedalDialogCallback();
        return Unit.INSTANCE;
    }

    @Nullable
    public final FragmentActivity getAct() {
        return (FragmentActivity) this.act.getValue(this, $$delegatedProperties[0]);
    }

    public final boolean getShowLoginDialog() {
        return this.showLoginDialog;
    }

    public final void setAct(@Nullable FragmentActivity fragmentActivity) {
        this.act.setValue(this, $$delegatedProperties[0], fragmentActivity);
    }

    public final void setShowLoginDialog(boolean z) {
        this.showLoginDialog = z;
    }

    public final void showLoginConfirmDialog(@NotNull FragmentActivity activity) {
        FragmentActivity act;
        FragmentManager supportFragmentManager;
        CommonDialog commonDialogCreate;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (getAct() == null || !Intrinsics.areEqual(getAct(), activity)) {
            setAct(activity);
        }
        if (this.showLoginDialog || (act = getAct()) == null || (supportFragmentManager = act.getSupportFragmentManager()) == null) {
            return;
        }
        if (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            commonDialogCreate = new CommonDialog.c("sync_dialog").setDialogTitle(c0j.Ol).setDialogDescription(HealthHelperKt.getMainHelper().getPlayChannelSyncDialogDescStringRes()).setNegativeText(c0j.c).setPositiveText(c0j.D9).setCancelable(false).setCanceledOnTouchOutside(false).create();
            Intrinsics.checkNotNull(commonDialogCreate);
        } else {
            commonDialogCreate = new CommonDialog.c("sync_dialog").setCustomLayoutId(jui.o3).setNegativeText(c0j.c).setPositiveText(c0j.D9).setCancelable(false).setCanceledOnTouchOutside(false).create();
            Intrinsics.checkNotNull(commonDialogCreate);
        }
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.util.HealthHelper.showLoginConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                LifecycleCoroutineScope lifecycleScope;
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                HealthHelper.this.setShowLoginDialog(false);
                if (which == -2) {
                    dialog.dismiss();
                    return;
                }
                if (which != -1) {
                    return;
                }
                FragmentActivity act2 = HealthHelper.this.getAct();
                if (act2 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(act2)) != null) {
                    BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new HealthHelper$showLoginConfirmDialog$1$onDialogClick$1(HealthHelper.this, null), 3, null);
                }
                dialog.dismiss();
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        this.showLoginDialog = true;
        commonDialogCreate.showIfNeed(supportFragmentManager);
    }

    public final void showMedalDialog(@NotNull PopMedalData medalModel, @NotNull final HealthViewModel mViewModel) {
        Intrinsics.checkNotNullParameter(medalModel, "medalModel");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        FragmentActivity act = getAct();
        if (act != null) {
            MedalManagerExtKt.getInstance(MedalManager.INSTANCE).showLatestMedalPopDialog(act, medalModel, new Function0() { // from class: pwb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HealthHelper.showMedalDialog$lambda$2$lambda$1(mViewModel);
                }
            });
        }
    }

    public final void showSyncSwitchOpenDialog(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (getAct() == null || !Intrinsics.areEqual(getAct(), activity)) {
            setAct(activity);
        }
        if (this.showSyncDialog || TimeUtils.INSTANCE.isSameDay(System.currentTimeMillis(), FitnessDataPreference.INSTANCE.getFIRST_TIME_CLOSED_SYNC_DIALOG())) {
            return;
        }
        av6 av6Var = new av6() { // from class: com.xiaomi.fitness.util.HealthHelper$showSyncSwitchOpenDialog$dialog$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                this.this$0.showSyncDialog = false;
                if (which == -2) {
                    FitnessDataPreference.INSTANCE.setFIRST_TIME_CLOSED_SYNC_DIALOG(System.currentTimeMillis());
                    dialog.dismiss();
                } else {
                    if (which != -1) {
                        return;
                    }
                    RegionPreference.INSTANCE.setSyncWeb(true);
                    dialog.dismiss();
                }
            }
        };
        this.showSyncDialog = true;
        HealthHelperKt.getMainHelper().showSyncWebDialog(getAct(), av6Var);
    }

    private HealthHelper(FragmentActivity fragmentActivity) {
        this.act = new Weak();
        setAct(fragmentActivity);
    }
}
