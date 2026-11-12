package com.xiaomi.fitness.health.todayhealth.ui;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.xiaomi.fit.fitness.export.data.item.HealthCheckDayReport;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.data.model.WrapperHealthCheckRecord;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.ui.HealthCheckExpandableAllRecordsFragment;
import com.xiaomi.fitness.health.todayhealth.ui.setting.HealthCheckMeasureReminderFragment;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import defpackage.a4i;
import defpackage.c0j;
import defpackage.eri;
import defpackage.nwi;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/HealthCheckExpandableAllRecordsFragment;", "Lcom/xiaomi/fitness/common/recycer/BaseMonthExpandableAllRecordsFragment;", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "Lcom/xiaomi/fitness/data/model/WrapperHealthCheckRecord;", "Lcom/xiaomi/fit/fitness/export/data/item/HealthCheckDayReport;", "<init>", "()V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAdapterItemClick", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "getMonthExpandableAdapter", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "showPopupMenu", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthCheckExpandableAllRecordsFragment extends Hilt_HealthCheckExpandableAllRecordsFragment<HealthCheckViewModel, WrapperHealthCheckRecord, HealthCheckDayReport> {

    @NotNull
    public static final String PARAM_RECORD = "healthCheck";

    @NotNull
    public static final String TAG = "HealthCheckExpandableAllRecordsFragment";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(HealthCheckExpandableAllRecordsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.showPopupMenu(view);
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.f(nwi.e);
        Menu menuD = a4iVar.d();
        menuD.findItem(eri.P5).setVisible(true);
        menuD.findItem(eri.N5).setVisible(false);
        menuD.findItem(eri.O5).setVisible(false);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: oob
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return HealthCheckExpandableAllRecordsFragment.showPopupMenu$lambda$4(this.f29337a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$4(HealthCheckExpandableAllRecordsFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != eri.P5) {
            return true;
        }
        BaseFragmentExKt.gotoPage(this$0, HealthCheckMeasureReminderFragment.class, null);
        return true;
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    @NotNull
    public BaseMonthExpandableAdapter<WrapperHealthCheckRecord, HealthCheckDayReport> getMonthExpandableAdapter() {
        return new HealthCheckExpandableRecordsAdapter();
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    public void onAdapterItemClick(@NotNull ExpandableBaseDataItem data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperHealthCheckRecord) {
            Bundle bundle = new Bundle();
            bundle.putSerializable(PARAM_RECORD, Long.valueOf(((WrapperHealthCheckRecord) data).getHealthCheckDayReport().getTimestamp()));
            BaseFragmentExKt.gotoPageForResult(this, (Class<?>) TodayHealthFragment.class, bundle, 100);
        }
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AllRecordsPageUtilKt.setUpAllRecordsPageBasicUi$default(this, false, 2, null);
        ImageView imageView = new ImageView(getContext());
        imageView.setId(View.generateViewId());
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(ExtUtilsKt.getDp(40), ExtUtilsKt.getDp(40));
        layoutParams.setMarginEnd(ExtUtilsKt.getDp(10));
        imageView.setLayoutParams(layoutParams);
        imageView.setContentDescription(getString(c0j.V9));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(pni.x2);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: nob
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HealthCheckExpandableAllRecordsFragment.onViewCreated$lambda$2(this.f28198a, view2);
            }
        });
        setEndView(imageView);
    }
}
