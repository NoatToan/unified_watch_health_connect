package com.xiaomi.fitness.relative.threetarget;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.base.BasicDataFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.relative.threetarget.SportTargetRFragment;
import com.xiaomi.fitness.relative.threetarget.viewmodel.DataRegularTargetViewModel;
import com.xiaomi.fitness.user.info.export.GoalPageManager;
import com.xiaomi.fitness.user.info.export.GoalPageManagerExtKt;
import com.xiaomi.fitness.util.HealthBundleKey;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0014J\u0006\u0010\u0013\u001a\u00020\fJ\u0014\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\bH\u0014J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\fH\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00158TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/relative/threetarget/SportTargetRFragment;", "Lcom/xiaomi/fitness/base/BasicDataFragment;", "Lcom/xiaomi/fitness/relative/threetarget/BaseTargetChartRFragment;", "<init>", "()V", "mRegularTargetViewModel", "Lcom/xiaomi/fitness/relative/threetarget/viewmodel/DataRegularTargetViewModel;", "contentResourceId", "", "getContentResourceId", "()I", "initContentView", "", "contentView", "Landroid/view/View;", "expandBundle", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "setTabType", "setListener", "className", "", "getClassName", "()Ljava/lang/String;", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "showImgMore", "visibility", "onVisible", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportTargetRFragment extends BasicDataFragment<BaseTargetChartRFragment> {

    @Nullable
    private DataRegularTargetViewModel mRegularTargetViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initContentView$lambda$0(SportTargetRFragment this$0, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bindTitleBarAlphaView(localDate);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void expandBundle(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putBoolean(HealthBundleKey.BUNDLE_PARAMS_CALENDAR_THREE_CIRCLE_FLAG, true);
        bundle.putBoolean("switch_day_week_month", false);
        bundle.putInt("data_come_from", 1);
        DataRegularTargetViewModel dataRegularTargetViewModel = this.mRegularTargetViewModel;
        Intrinsics.checkNotNull(dataRegularTargetViewModel);
        bundle.putLong("key_relative_uid", dataRegularTargetViewModel.getRelativeUid());
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        return TargetChartRFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @Nullable
    public String getClassChildName(int position) {
        return "TargetChartRFragment";
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    @NotNull
    public String getClassName() {
        String name = SportTargetRFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public int getContentResourceId() {
        return jui.q;
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void initContentView(@Nullable View contentView) {
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            GoalPageManagerExtKt.getInstance(GoalPageManager.INSTANCE).goFirstGuidPageFromRaindow(null);
        }
        Logger.d(BaseFragment.TAG, "initContentView");
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        DataRegularTargetViewModel dataRegularTargetViewModel = (DataRegularTargetViewModel) new ViewModelProvider(mActivity).get(DataRegularTargetViewModel.class);
        this.mRegularTargetViewModel = dataRegularTargetViewModel;
        Intrinsics.checkNotNull(dataRegularTargetViewModel);
        MutableLiveData<LocalDate> currentSelectedDate = dataRegularTargetViewModel.getCurrentSelectedDate();
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        currentSelectedDate.observe(mActivity2, new SportTargetRFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: u4o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportTargetRFragment.initContentView$lambda$0(this.f35381a, (LocalDate) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, com.xiaomi.fitness.base.BaseDataFragment.a
    public /* bridge */ /* synthetic */ void onDateChanged(LocalDate localDate) {
        super.onDateChanged(localDate);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment, com.xiaomi.fitness.base.BaseDataFragment.a
    public /* bridge */ /* synthetic */ void onDeviceListChanged(List list) {
        super.onDeviceListChanged(list);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair pair = TuplesKt.to("name", "relatives_data_detail");
        Pair pair2 = TuplesKt.to("data_type", LifecycleConstantKt.TYPE_ACTIVITY);
        Pair pair3 = TuplesKt.to("tip", "56.55.1.1.25018");
        DataRegularTargetViewModel dataRegularTargetViewModel = this.mRegularTargetViewModel;
        Intrinsics.checkNotNull(dataRegularTargetViewModel);
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("user_id", MD5Util.MD5(String.valueOf(dataRegularTargetViewModel.getRelativeUid())))));
    }

    public final void setListener() {
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void setTabType() {
        setTabType(2);
    }

    @Override // com.xiaomi.fitness.base.BasicDataFragment
    public void showImgMore(int visibility) {
        ImageView imgShare;
        TitleBarAlphaView titleBarAlphaView = getTitleBarAlphaView();
        if (titleBarAlphaView == null || (imgShare = titleBarAlphaView.getImgShare()) == null) {
            return;
        }
        imgShare.setVisibility(8);
    }
}
