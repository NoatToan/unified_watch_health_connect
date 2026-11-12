package com.xiaomi.fitness.habit.ui;

import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.example.habit.export.HabitBean;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.habit.ui.HabitListActivity;
import com.xiaomi.fitness.habit.widget.MoreRecyclerView;
import com.xiaomi.fitness.habit.widget.Status;
import defpackage.aeb;
import defpackage.b0j;
import defpackage.gak;
import defpackage.hji;
import defpackage.iui;
import defpackage.mrf;
import defpackage.ns0;
import defpackage.p63;
import defpackage.uno;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001/B\u0007¢\u0006\u0004\b.\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/habit/ui/HabitViewModel;", "Laeb;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;", "", "list", "()V", "setLayoutManager", "bindView", "(Laeb;)V", "onRefresh", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Lmrf;", "messageEvent", "onDataEvent", "(Lmrf;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/habit/ui/HabitShopListAdapter;", "habitListListAdapter", "Lcom/xiaomi/fitness/habit/ui/HabitShopListAdapter;", "Ljava/util/ArrayList;", "Lcom/example/habit/export/HabitBean;", "dataList", "Ljava/util/ArrayList;", "getColCountPerRow", "()I", "colCountPerRow", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHabitListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitListActivity.kt\ncom/xiaomi/fitness/habit/ui/HabitListActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1863#2,2:175\n*S KotlinDebug\n*F\n+ 1 HabitListActivity.kt\ncom/xiaomi/fitness/habit/ui/HabitListActivity\n*L\n153#1:175,2\n*E\n"})
public final class HabitListActivity extends Hilt_HabitListActivity<HabitViewModel, aeb> implements SwipeRefreshLayout.j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int sRequestAdd = 10;

    @NotNull
    private ArrayList<HabitBean> dataList = new ArrayList<>();

    @Nullable
    private HabitShopListAdapter habitListListAdapter;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitListActivity$Companion;", "", "<init>", "()V", "sRequestAdd", "", "getSRequestAdd", "()I", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSRequestAdd() {
            return HabitListActivity.sRequestAdd;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$0(HabitListActivity this$0, HabitBean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        HabitShopListAdapter habitShopListAdapter = this$0.habitListListAdapter;
        Intrinsics.checkNotNull(habitShopListAdapter);
        if (habitShopListAdapter.getIsSelectMode()) {
            it.isSelected = !it.isSelected;
            HabitShopListAdapter habitShopListAdapter2 = this$0.habitListListAdapter;
            if (habitShopListAdapter2 != null) {
                habitShopListAdapter2.notifyDataSetChanged();
            }
        } else {
            Intent intent = new Intent(this$0, (Class<?>) AddHabitActivity.class);
            intent.putExtra("sData", it);
            this$0.startActivityForResult(intent, sRequestAdd);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(HabitListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRefresh();
    }

    private final int getColCountPerRow() {
        Application application;
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            return 3;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        return (uIUtils.isTablet() && (application = getApplication()) != null && uIUtils.isLandscape(application)) ? 5 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void list() {
        showLoading();
        ((HabitViewModel) getMViewModel()).loadHabitList(new Function1() { // from class: bfb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitListActivity.list$lambda$2(this.f4147a, (ArrayList) obj);
            }
        }, new Function1() { // from class: cfb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitListActivity.list$lambda$3(this.f5276a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit list$lambda$2(HabitListActivity this$0, ArrayList it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        if (((aeb) this$0.getMBinding()).C.i()) {
            ((aeb) this$0.getMBinding()).C.setRefreshing(false);
            this$0.dataList.clear();
        }
        this$0.dataList.addAll(it);
        MoreRecyclerView.setStatus$default(((aeb) this$0.getMBinding()).B, it.size() < 10 ? Status.DONE : Status.MORE, false, 2, null);
        HabitShopListAdapter habitShopListAdapter = this$0.habitListListAdapter;
        if (habitShopListAdapter != null) {
            habitShopListAdapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit list$lambda$3(HabitListActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.hideLoading();
        ToastUtil.showShortToast(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, getColCountPerRow());
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.habit.ui.HabitListActivity.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        ((aeb) getMBinding()).B.addItemDecoration(new CustomerItemDecoration(getColCountPerRow(), ExtUtilsKt.getDp(Float.valueOf(16.0f)), false));
        ((aeb) getMBinding()).B.setLayoutManager(gridLayoutManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull aeb aebVar) {
        Intrinsics.checkNotNullParameter(aebVar, "<this>");
        setTitle(b0j.E);
        setTitleBackground(hji.c);
        this.habitListListAdapter = new HabitShopListAdapter(this, this.dataList, new Function1() { // from class: dfb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitListActivity.bindView$lambda$0(this.f15478a, (HabitBean) obj);
            }
        });
        setLayoutManager();
        ((aeb) getMBinding()).B.setAdapter(this.habitListListAdapter);
        ((aeb) getMBinding()).B.setEnableMore(false);
        ((aeb) getMBinding()).C.n(false, 0, DisplayUtil.dip2px(40.0f));
        ((aeb) getMBinding()).C.setColorSchemeResources(hji.common_main_dark_gray_color);
        ((aeb) getMBinding()).C.setProgressBackgroundColorSchemeResource(hji.f);
        ((aeb) getMBinding()).C.setOnRefreshListener(this);
        new gak(DisplayUtil.dip2px(13.0f), DisplayUtil.dip2px(13.0f), false);
        ((aeb) getMBinding()).C.post(new Runnable() { // from class: efb
            @Override // java.lang.Runnable
            public final void run() {
                HabitListActivity.bindView$lambda$1(this.f16587a);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return iui.f22104b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestAdd && resultCode == -1) {
            finish();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }

    @Override // com.xiaomi.fitness.habit.ui.Hilt_HabitListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (p63.a(this)) {
            return;
        }
        p63.c(this);
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onDataEvent(@NotNull mrf messageEvent) {
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (messageEvent instanceof ns0) {
            for (HabitBean habitBean : this.dataList) {
                if (habitBean.typeId == ((ns0) messageEvent).f28307a) {
                    habitBean.added = true;
                }
            }
            HabitShopListAdapter habitShopListAdapter = this.habitListListAdapter;
            if (habitShopListAdapter != null) {
                habitShopListAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override // com.xiaomi.fitness.habit.ui.Hilt_HabitListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (p63.a(this)) {
            p63.d(this);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        list();
    }
}
