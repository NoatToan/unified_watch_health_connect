package com.xiaomi.fitness.sport.sporttab.holder;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fit.fitness.sync.export.di.FitnessSyncExtKt;
import com.xiaomi.fitness.baseui.recyclerview.refresh.LoadAction;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.sport.sporttab.holder.PageRefreshTriggerHolder;
import defpackage.c1j;
import defpackage.mhs;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import miuix.springback.view.SpringBackLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/holder/PageRefreshTriggerHolder;", "", "", "triggerDataSync", "()V", "initHolder", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lmiuix/springback/view/SpringBackLayout;", "swipeContainer", "Lmiuix/springback/view/SpringBackLayout;", "Lcom/xiaomi/fitness/sport/sporttab/holder/SportModelListHolder;", "sportModelListHolder", "Lcom/xiaomi/fitness/sport/sporttab/holder/SportModelListHolder;", "Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "fitnessSyncer$delegate", "Lkotlin/Lazy;", "getFitnessSyncer", "()Lcom/xiaomi/fit/fitness/sync/export/api/FitnessSyncer;", "fitnessSyncer", "Lmhs;", "mTrigger", "Lmhs;", "getMTrigger", "()Lmhs;", "setMTrigger", "(Lmhs;)V", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lmiuix/springback/view/SpringBackLayout;Lcom/xiaomi/fitness/sport/sporttab/holder/SportModelListHolder;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PageRefreshTriggerHolder {

    @NotNull
    public static final String TAG = "PageRefreshTriggerHolder";

    /* JADX INFO: renamed from: fitnessSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fitnessSyncer;

    @NotNull
    private final FragmentActivity fragmentActivity;

    @Nullable
    private mhs mTrigger;

    @NotNull
    private final SportModelListHolder sportModelListHolder;

    @NotNull
    private final SpringBackLayout swipeContainer;

    public PageRefreshTriggerHolder(@NotNull FragmentActivity fragmentActivity, @NotNull SpringBackLayout swipeContainer, @NotNull SportModelListHolder sportModelListHolder) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(swipeContainer, "swipeContainer");
        Intrinsics.checkNotNullParameter(sportModelListHolder, "sportModelListHolder");
        this.fragmentActivity = fragmentActivity;
        this.swipeContainer = swipeContainer;
        this.sportModelListHolder = sportModelListHolder;
        this.fitnessSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: uhh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PageRefreshTriggerHolder.fitnessSyncer_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessSyncer fitnessSyncer_delegate$lambda$0() {
        return FitnessSyncExtKt.getInstance(FitnessSyncer.INSTANCE);
    }

    private final FitnessSyncer getFitnessSyncer() {
        return (FitnessSyncer) this.fitnessSyncer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$1(PageRefreshTriggerHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.triggerDataSync();
        Logger.i(TAG, "loadAction triggerDataSync running");
        return Unit.INSTANCE;
    }

    private final void triggerDataSync() {
        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).getUserInfoFromWeb();
        getFitnessSyncer().triggerDataSync(true);
        this.sportModelListHolder.refreshTrainingIndexCard();
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @Nullable
    public final mhs getMTrigger() {
        return this.mTrigger;
    }

    public final void initHolder() {
        this.mTrigger = new mhs(this.fragmentActivity);
        int i = c1j.E;
        int i2 = c1j.F0;
        LoadAction loadAction = new LoadAction(ExtUtilsKt.getDp(34), new int[]{i, i2, i2, c1j.F}, new Function0() { // from class: vhh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PageRefreshTriggerHolder.initHolder$lambda$1(this.f36901a);
            }
        });
        mhs mhsVar = this.mTrigger;
        if (mhsVar != null) {
            mhsVar.d(loadAction);
        }
        mhs mhsVar2 = this.mTrigger;
        if (mhsVar2 != null) {
            mhsVar2.M(this.swipeContainer);
        }
    }

    public final void setMTrigger(@Nullable mhs mhsVar) {
        this.mTrigger = mhsVar;
    }
}
