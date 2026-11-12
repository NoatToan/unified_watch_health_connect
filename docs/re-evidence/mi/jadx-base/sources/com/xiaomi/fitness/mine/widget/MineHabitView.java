package com.xiaomi.fitness.mine.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.example.habit.export.HabitManager;
import com.example.habit.export.HabitManagerKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.mine.v4.MineV4ViewModel;
import com.xiaomi.fitness.mine.widget.MineHabitView;
import com.xiaomi.fitness.util.MineOneTrack;
import defpackage.m0j;
import defpackage.nuf;
import defpackage.r1g;
import defpackage.vni;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/mine/widget/MineHabitView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/xiaomi/fitness/mine/v4/MineV4ViewModel$UpdateHabit;", "habit", "", "updateHabit", "(Lcom/xiaomi/fitness/mine/v4/MineV4ViewModel$UpdateHabit;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lr1g;", "mRootView", "Lr1g;", "habitTemp", "Lcom/xiaomi/fitness/mine/v4/MineV4ViewModel$UpdateHabit;", "Landroidx/fragment/app/FragmentActivity;", "getCurActivity", "()Landroidx/fragment/app/FragmentActivity;", "curActivity", "", "getIconWidth", "()I", "iconWidth", "getIconHeight", "iconHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMineHabitView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineHabitView.kt\ncom/xiaomi/fitness/mine/widget/MineHabitView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n54#2,3:101\n24#2:104\n59#2,6:105\n54#2,3:111\n24#2:114\n59#2,6:115\n1#3:121\n*S KotlinDebug\n*F\n+ 1 MineHabitView.kt\ncom/xiaomi/fitness/mine/widget/MineHabitView\n*L\n68#1:101,3\n68#1:104\n68#1:105,6\n75#1:111,3\n75#1:114\n75#1:115,6\n*E\n"})
public final class MineHabitView extends ConstraintLayout {

    @Nullable
    private MineV4ViewModel.UpdateHabit habitTemp;

    @NotNull
    private final r1g mRootView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineHabitView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MineHabitView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            FragmentActivity curActivity = this$0.getCurActivity();
            if (curActivity != null) {
                HabitManagerKt.getHabitManager().gotoHabitPage(curActivity, 0);
                return;
            }
            return;
        }
        FragmentActivity curActivity2 = this$0.getCurActivity();
        if (curActivity2 != null) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(curActivity2);
        }
    }

    private final FragmentActivity getCurActivity() {
        return (FragmentActivity) AppManager.INSTANCE.getInstance().getCurrentActivity();
    }

    private final int getIconHeight() {
        if (!SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            UIUtils uIUtils = UIUtils.INSTANCE;
            if (!uIUtils.isTabletAndPortrait(ApplicationExtKt.getApplication())) {
                return uIUtils.isTabletAndLandscape(ApplicationExtKt.getApplication()) ? ExtUtilsKt.getDp(Float.valueOf(135.0f)) : ExtUtilsKt.getDp(80);
            }
        }
        return ExtUtilsKt.getDp(80);
    }

    private final int getIconWidth() {
        if (!SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            UIUtils uIUtils = UIUtils.INSTANCE;
            if (!uIUtils.isTabletAndPortrait(ApplicationExtKt.getApplication())) {
                return uIUtils.isTabletAndLandscape(ApplicationExtKt.getApplication()) ? ExtUtilsKt.getDp(Float.valueOf(527.0f)) : ExtUtilsKt.getDp(Float.valueOf(151.0f));
            }
        }
        return ExtUtilsKt.getDp(Float.valueOf(312.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateHabit$lambda$5(MineHabitView this$0, MineV4ViewModel.UpdateHabit updateHabit, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineOneTrack.INSTANCE.trackLittleHabits();
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            FragmentActivity curActivity = this$0.getCurActivity();
            if (curActivity != null) {
                CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(curActivity);
                return;
            }
            return;
        }
        FragmentActivity curActivity2 = this$0.getCurActivity();
        if (curActivity2 != null) {
            HabitManager habitManager = HabitManagerKt.getHabitManager();
            int i = 0;
            if (updateHabit != null && updateHabit.isMyHabitBean()) {
                i = 1;
            }
            habitManager.gotoHabitPage(curActivity2, i);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateHabit(this.habitTemp);
    }

    public final void updateHabit(@Nullable final MineV4ViewModel.UpdateHabit habit) {
        this.habitTemp = habit;
        nuf.e(this);
        setOnClickListener(new View.OnClickListener() { // from class: q1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineHabitView.updateHabit$lambda$5(this.f30987a, habit, view);
            }
        });
        this.mRootView.A.setText(ApplicationExtKt.getApplication().getString(m0j.A));
        if (habit == null) {
            ImageView mineHabitIcon = this.mRootView.C;
            Intrinsics.checkNotNullExpressionValue(mineHabitIcon, "mineHabitIcon");
            Integer numValueOf = Integer.valueOf((SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded() || UIUtils.INSTANCE.isTablet()) ? vni.f37065b : vni.f37064a);
            ImageLoader imageLoader = Coil.imageLoader(mineHabitIcon.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(mineHabitIcon.getContext()).data(numValueOf).target(mineHabitIcon);
            builderTarget.size(getIconWidth(), getIconHeight());
            imageLoader.enqueue(builderTarget.build());
            return;
        }
        ImageView mineHabitIcon2 = this.mRootView.C;
        Intrinsics.checkNotNullExpressionValue(mineHabitIcon2, "mineHabitIcon");
        String padIcon = (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded() || UIUtils.INSTANCE.isTablet()) ? habit.getPadIcon() : habit.getIcon();
        ImageLoader imageLoader2 = Coil.imageLoader(mineHabitIcon2.getContext());
        ImageRequest.Builder builderTarget2 = new ImageRequest.Builder(mineHabitIcon2.getContext()).data(padIcon).target(mineHabitIcon2);
        builderTarget2.size(getIconWidth(), getIconHeight());
        imageLoader2.enqueue(builderTarget2.build());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineHabitView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MineHabitView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineHabitView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        r1g r1gVarA0 = r1g.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(r1gVarA0, "inflate(...)");
        this.mRootView = r1gVarA0;
        r1gVarA0.A.setText(ApplicationExtKt.getApplication().getString(m0j.A));
        r1gVarA0.B.setText(ApplicationExtKt.getApplication().getString(m0j.z));
        setOnClickListener(new View.OnClickListener() { // from class: p1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineHabitView._init_$lambda$2(this.f29906a, view);
            }
        });
    }
}
