package com.xiaomi.fitness.sport.sporttab.holder;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.electronic.scale.widget.banner.EcoBanner;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.sport.sporttab.holder.LaunchSportCardListHolder;
import com.xiaomi.fitness.sport.sporttab.recycler.HorizontalCardListItemDecoration;
import com.xiaomi.fitness.sport.sporttab.recycler.LaunchSportButtonAdapter;
import com.xiaomi.fitness.sport.sporttab.util.SportTabOneTrackExtKt;
import com.xiaomi.fitness.sport.utils.ItemDecorationExtKt;
import defpackage.rli;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/holder/LaunchSportCardListHolder;", "", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "adapter", "Lcom/xiaomi/fitness/sport/sporttab/recycler/LaunchSportButtonAdapter;", "launchRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "initHolder", "", "scrollBackAndForth", "refreshLaunchSportCardListHolder", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LaunchSportCardListHolder {
    public static final int ITEM_COUNT_COMPACT = 4;
    public static final int ITEM_COUNT_FULL = 6;

    @NotNull
    public static final String TAG = "LaunchSportCardListHolder";

    @Nullable
    private LaunchSportButtonAdapter adapter;

    @NotNull
    private final ConstraintLayout container;

    @NotNull
    private final FragmentActivity fragmentActivity;

    @NotNull
    private final RecyclerView launchRecycler;

    public LaunchSportCardListHolder(@NotNull FragmentActivity fragmentActivity, @NotNull ConstraintLayout container) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(container, "container");
        this.fragmentActivity = fragmentActivity;
        this.container = container;
        View viewFindViewById = container.findViewById(xri.c3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.launchRecycler = (RecyclerView) viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollBackAndForth$lambda$0(LaunchSportCardListHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LaunchSportButtonAdapter launchSportButtonAdapter = this$0.adapter;
        int count = (launchSportButtonAdapter != null ? launchSportButtonAdapter.getCount() : 0) - 1;
        if (count > 0) {
            this$0.launchRecycler.smoothScrollToPosition(count);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scrollBackAndForth$lambda$1(LaunchSportCardListHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.launchRecycler.smoothScrollToPosition(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollBackAndForth$lambda$2(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollBackAndForth$lambda$3(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    public final void initHolder() {
        int dp;
        UIUtils uIUtils = UIUtils.INSTANCE;
        int screenState = uIUtils.getScreenState();
        boolean z = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && !AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE));
        boolean z2 = z && screenState == 3;
        int i = z ? 6 : 4;
        if (z2) {
            final Ref.IntRef intRef = new Ref.IntRef();
            this.launchRecycler.addOnScrollListener(new RecyclerView.s() { // from class: com.xiaomi.fitness.sport.sporttab.holder.LaunchSportCardListHolder$initHolder$scrollListener$1
                @Override // androidx.recyclerview.widget.RecyclerView.s
                public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                    Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                    super.onScrollStateChanged(recyclerView, newState);
                    if (newState != 0 || intRef.element <= 0) {
                        return;
                    }
                    SportTabOneTrackExtKt.oneTrackOnLaunchSportEntranceScrollLeft();
                }

                @Override // androidx.recyclerview.widget.RecyclerView.s
                public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                    Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                    super.onScrolled(recyclerView, dx, dy);
                    intRef.element = dx;
                }
            });
        }
        LaunchSportButtonAdapter launchSportButtonAdapter = new LaunchSportButtonAdapter(this.fragmentActivity);
        this.adapter = launchSportButtonAdapter;
        this.launchRecycler.setAdapter(launchSportButtonAdapter);
        ItemDecorationExtKt.clearAllItemDecorations(this.launchRecycler);
        if (z2) {
            this.launchRecycler.addItemDecoration(new HorizontalCardListItemDecoration(6, ExtUtilsKt.getDimension(rli.f32680a), ExtUtilsKt.getDp(19)));
            LaunchSportButtonAdapter launchSportButtonAdapter2 = this.adapter;
            if (launchSportButtonAdapter2 != null) {
                LaunchSportButtonAdapter.bindData$default(launchSportButtonAdapter2, 0, 1, null);
                return;
            }
            return;
        }
        int dp2 = screenState == 0 ? ExtUtilsKt.getDp(16) : 0;
        if (screenState != 0) {
            dp = (screenState == 1 || screenState == 2) ? ExtUtilsKt.getDp(20) : ExtUtilsKt.getDp(19);
        } else {
            dp = ExtUtilsKt.getDp(26);
        }
        int dimension = ExtUtilsKt.getDimension(rli.f32681b);
        float screenWidth = (((uIUtils.getScreenWidth(ApplicationExtKt.getApplication()) - (dimension * 2)) - (dp2 * 2)) - ((i - 1) * dp)) / i;
        this.launchRecycler.addItemDecoration(new HorizontalCardListItemDecoration(i, dimension + dp2, dp));
        Logger.d(TAG, "initHolder itemWidth=" + screenWidth);
        LaunchSportButtonAdapter launchSportButtonAdapter3 = this.adapter;
        if (launchSportButtonAdapter3 != null) {
            launchSportButtonAdapter3.bindData((int) screenWidth);
        }
    }

    public final void refreshLaunchSportCardListHolder() {
        initHolder();
    }

    public final void scrollBackAndForth() {
        boolean z = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() && !AppUtil.INSTANCE.isPlayChannel() && RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE));
        boolean z2 = UIUtils.INSTANCE.getScreenState() == 3;
        if (z && z2) {
            final Function0 function0 = new Function0() { // from class: q3e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LaunchSportCardListHolder.scrollBackAndForth$lambda$0(this.f31042a);
                }
            };
            final Function0 function1 = new Function0() { // from class: r3e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LaunchSportCardListHolder.scrollBackAndForth$lambda$1(this.f32139a);
                }
            };
            this.launchRecycler.postDelayed(new Runnable() { // from class: s3e
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchSportCardListHolder.scrollBackAndForth$lambda$2(function0);
                }
            }, VibrateModeProgressBar.sLongToLong);
            this.launchRecycler.postDelayed(new Runnable() { // from class: t3e
                @Override // java.lang.Runnable
                public final void run() {
                    LaunchSportCardListHolder.scrollBackAndForth$lambda$3(function1);
                }
            }, EcoBanner.BANNER_CHANGE_TIME);
        }
    }
}
