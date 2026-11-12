package com.xiaomi.fitness.health.sleep.ui;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.example.statistics.export.ScrollViewEffectiveExposeBiz;
import com.xiaomi.fitness.base.BaseDetailParentFragment;
import com.xiaomi.fitness.base.WrapperDayWeekMonthChildFragment;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.extension.PageUtilExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.SleepFragment;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingFragment;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.a4i;
import defpackage.c0j;
import defpackage.dih;
import defpackage.jui;
import defpackage.nwi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\fH\u0002J\u0014\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0017\u001a\u00020\u0006H\u0014J\b\u0010\u001a\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepFragment;", "Lcom/xiaomi/fitness/base/BaseDetailParentFragment;", "Lcom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment;", "<init>", "()V", "defaultSportType", "", "getDefaultSportType", "()I", "contentResourceId", "getContentResourceId", "initContentView", "", "contentView", "Landroid/view/View;", "onImgShareClick", "view", "showPopupMenu", "goToAddRecordManuallyPage", "goToAllRecordsPage", "goSettingFragment", "getClassChild", "Ljava/lang/Class;", "position", "getClassChildName", "", "onDestroyView", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepFragment.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepFragment\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,129:1\n46#2:130\n*S KotlinDebug\n*F\n+ 1 SleepFragment.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepFragment\n*L\n67#1:130\n*E\n"})
public class SleepFragment extends BaseDetailParentFragment<WrapperDayWeekMonthChildFragment> {
    private final void goSettingFragment() {
        dih dihVarA = dih.a();
        if (dihVarA != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            PageUtilExtKt.goCommonActivity(dihVarA, contextRequireContext, SleepSettingFragment.class, null);
        }
    }

    private final void goToAddRecordManuallyPage() {
        BaseFragmentExKt.gotoPage(this, SleepAddRecordFragment.class, null);
    }

    private final void goToAllRecordsPage() {
        BaseFragmentExKt.gotoPage(this, SleepExpandableAllRecordsFragment.class, null);
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(requireContext(), view);
        a4iVar.f(nwi.h);
        a4iVar.d().add(0, 100, 0, c0j.h5);
        a4iVar.d().add(0, 200, 0, c0j.D);
        Menu menuD = a4iVar.d();
        Menu menuD2 = a4iVar.d();
        Intrinsics.checkNotNullExpressionValue(menuD2, "getMenu(...)");
        menuD.add(0, 1, menuD2.size(), c0j.ak);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: nmm
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return SleepFragment.showPopupMenu$lambda$1(this.f28076a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$1(SleepFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this$0.goSettingFragment();
        } else if (itemId == 100) {
            this$0.goToAllRecordsPage();
        } else if (itemId == 200) {
            this$0.goToAddRecordManuallyPage();
        }
        return true;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        if (position != 1) {
            return position != 2 ? SleepDayFragment.class : SleepMonthFragment.class;
        }
        return SleepWeekFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @Nullable
    public String getClassChildName(int position) {
        if (position != 1) {
            return position != 2 ? "SleepDayFragment" : "SleepMonthFragment";
        }
        return "SleepWeekFragment";
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getDefaultSportType() {
        return 6;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void initContentView(@NotNull View contentView) {
        ImageView imgShare;
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        TitleBarAlphaView titleBarAlphaView = getTitleBarAlphaView();
        if (titleBarAlphaView != null && (imgShare = titleBarAlphaView.getImgShare()) != null) {
            ViewExtKt.setVisible(imgShare, true);
        }
        NestedScrollView scrollView = getScrollView();
        if (scrollView != null) {
            ScrollViewEffectiveExposeBiz.startTrackItemExpose$default(new ScrollViewEffectiveExposeBiz(), scrollView, SleepTrackHelper.INSTANCE.getSleepWmSharedTrackRecordSharedSet(), 0, 4, null);
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("expose_v3", "56.37.4.1.38000"), "name", "xiaomi_sleep_card");
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SleepTrackHelper.INSTANCE.clearSleepWmSharedTrackRecordSharedSet();
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment, defpackage.eah
    public void onImgShareClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        showPopupMenu(view);
    }
}
