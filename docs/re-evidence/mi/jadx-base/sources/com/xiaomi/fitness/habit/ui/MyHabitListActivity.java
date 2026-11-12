package com.xiaomi.fitness.habit.ui;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.example.habit.export.HabitBean;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.habit.ui.MyHabitListActivity;
import com.xiaomi.fitness.habit.utils.UtilsKt;
import com.xiaomi.fitness.habit.widget.MoreRecyclerView;
import com.xiaomi.fitness.habit.widget.Status;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.b0j;
import defpackage.dri;
import defpackage.gak;
import defpackage.geb;
import defpackage.hji;
import defpackage.iui;
import defpackage.mrf;
import defpackage.nni;
import defpackage.ns0;
import defpackage.p63;
import defpackage.pxi;
import defpackage.sdg;
import defpackage.uno;
import defpackage.wc0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\bI\u0010\u000eJ%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0013\u0010\u0015\u001a\u00020\n*\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u000eJ\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u000eJ)\u0010 \u001a\u00020\n2\u001a\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u001dj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u000eJ\u0019\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0014¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u001f\u0010@\u001a\r\u0012\t\u0012\u000709¢\u0006\u0002\b=088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0014\u0010H\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010C¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/MyHabitListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/habit/ui/MyHabitListViewModel;", "Lgeb;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;", "", "isDeleteCalendar", "", "Lcom/example/habit/export/HabitBean;", "selectIdList", "", "deleteHabitList", "(ZLjava/util/List;)V", "removeSelectedDataFromList", "()V", "isAllSelected", "()Z", "isReset", "resetToList", "(Z)V", "setLayoutManager", "bindView", "(Lgeb;)V", "isSelected", "setAllSelected", "refreshTitle", "getSelectList", "()Ljava/util/List;", "onRefresh", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", DeviceTagInterface.CUSTOM_TAG_TYPE, "bindDataToView", "(Ljava/util/ArrayList;)V", "pullRefreshLoadEnd", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lmrf;", "messageEvent", "onDataEvent", "(Lmrf;)V", "Lcom/xiaomi/fitness/habit/ui/HabitListAdapter;", "habitListAdapter", "Lcom/xiaomi/fitness/habit/ui/HabitListAdapter;", "dataList", "Ljava/util/ArrayList;", "Landroid/widget/ImageView;", "icon1View", "Landroid/widget/ImageView;", "", "", "permissions", "[Ljava/lang/String;", "Z", "Lkotlin/jvm/internal/EnhancedNullability;", "getPermissionDescArray", "()[Ljava/lang/String;", "permissionDescArray", "", "getColCountPerRow", "()I", "colCountPerRow", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMyHabitListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyHabitListActivity.kt\ncom/xiaomi/fitness/habit/ui/MyHabitListActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,363:1\n1863#2,2:364\n1863#2,2:366\n1863#2,2:368\n1863#2,2:370\n*S KotlinDebug\n*F\n+ 1 MyHabitListActivity.kt\ncom/xiaomi/fitness/habit/ui/MyHabitListActivity\n*L\n199#1:364,2\n223#1:366,2\n232#1:368,2\n258#1:370,2\n*E\n"})
public final class MyHabitListActivity extends Hilt_MyHabitListActivity<MyHabitListViewModel, geb> implements SwipeRefreshLayout.j {

    @Nullable
    private HabitListAdapter habitListAdapter;

    @Nullable
    private ImageView icon1View;
    private boolean isAllSelected;

    @NotNull
    private ArrayList<HabitBean> dataList = new ArrayList<>();

    @NotNull
    private final String[] permissions = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(MyHabitListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HabitListAdapter habitListAdapter = this$0.habitListAdapter;
        if (habitListAdapter != null) {
            if (habitListAdapter.getIsSelectMode()) {
                resetToList$default(this$0, false, 1, null);
            } else {
                this$0.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$15(final MyHabitListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final List<HabitBean> selectList = this$0.getSelectList();
        if (selectList.isEmpty()) {
            ToastUtil.showShortToast(this$0.getString(b0j.Q));
            return;
        }
        String string = this$0.getString(b0j.u);
        int i = b0j.q;
        FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        UtilsKt.showMsgDialog((String) null, string, i, supportFragmentManager, b0j.m, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: heg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyHabitListActivity.bindView$lambda$15$lambda$13(this.f19978a, selectList, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: ieg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyHabitListActivity.bindView$lambda$15$lambda$14((DialogInterface) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$15$lambda$13(final MyHabitListActivity this$0, final List selectIdList, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectIdList, "$selectIdList");
        String[] strArr = this$0.permissions;
        PermissionExtKt.permissions(this$0, (String[]) Arrays.copyOf(strArr, strArr.length), this$0.getPermissionDescArray(), (Function1<? super MultiplePermissionsBuilder, Unit>) new Function1() { // from class: tdg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyHabitListActivity.bindView$lambda$15$lambda$13$lambda$12(this.f34597a, selectIdList, (MultiplePermissionsBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$15$lambda$13$lambda$12(final MyHabitListActivity this$0, final List selectIdList, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectIdList, "$selectIdList");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: deg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MyHabitListActivity.bindView$lambda$15$lambda$13$lambda$12$lambda$10(this.f15443a, selectIdList);
            }
        });
        permissions.denied(new Function1() { // from class: eeg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyHabitListActivity.bindView$lambda$15$lambda$13$lambda$12$lambda$11(this.f16561a, selectIdList, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$15$lambda$13$lambda$12$lambda$10(MyHabitListActivity this$0, List selectIdList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectIdList, "$selectIdList");
        this$0.deleteHabitList(true, selectIdList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$15$lambda$13$lambda$12$lambda$11(MyHabitListActivity this$0, List selectIdList, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(selectIdList, "$selectIdList");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.deleteHabitList(false, selectIdList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$15$lambda$14(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$4(MyHabitListActivity this$0, View view) {
        View startView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HabitListAdapter habitListAdapter = this$0.habitListAdapter;
        Intrinsics.checkNotNull(habitListAdapter);
        if (habitListAdapter.getIsSelectMode()) {
            this$0.setAllSelected(!this$0.isAllSelected);
            return;
        }
        if (this$0.getMiuiActionBar() != null) {
            IActionBar.DefaultImpls.setStartViewRes$default(this$0, nni.m, null, 2, null);
            wc0 miuiActionBar = this$0.getMiuiActionBar();
            if (miuiActionBar != null && (startView = miuiActionBar.getStartView()) != null) {
                startView.setContentDescription(this$0.getString(b0j.x));
            }
        }
        ((geb) this$0.getMBinding()).A.setVisibility(0);
        this$0.refreshTitle();
        HabitListAdapter habitListAdapter2 = this$0.habitListAdapter;
        if (habitListAdapter2 != null) {
            habitListAdapter2.toggleSelectMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5(MyHabitListActivity this$0, HabitBean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        HabitListAdapter habitListAdapter = this$0.habitListAdapter;
        Intrinsics.checkNotNull(habitListAdapter);
        if (habitListAdapter.getIsSelectMode()) {
            it.isSelected = !it.isSelected;
            HabitListAdapter habitListAdapter2 = this$0.habitListAdapter;
            if (habitListAdapter2 != null) {
                habitListAdapter2.notifyDataSetChanged();
            }
            this$0.isAllSelected = this$0.isAllSelected();
            this$0.refreshTitle();
        } else {
            it.added = true;
            Intent intent = new Intent(this$0, (Class<?>) AddHabitActivity.class);
            intent.putExtra("sData", it);
            this$0.startActivity(intent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$8(final MyHabitListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((geb) this$0.getMBinding()).D.setRefreshing(true);
        ((MyHabitListViewModel) this$0.getMViewModel()).myHabitList(new Function1() { // from class: zdg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyHabitListActivity.bindView$lambda$8$lambda$6(this.f41156a, (ArrayList) obj);
            }
        }, new Function1() { // from class: aeg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyHabitListActivity.bindView$lambda$8$lambda$7(this.f926a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8$lambda$6(MyHabitListActivity this$0, ArrayList it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.bindDataToView(it);
        this$0.pullRefreshLoadEnd();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8$lambda$7(MyHabitListActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.pullRefreshLoadEnd();
        ToastUtil.showShortToast(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$9(MyHabitListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) HabitListActivity.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void deleteHabitList(boolean isDeleteCalendar, List<HabitBean> selectIdList) {
        showLoading();
        ((MyHabitListViewModel) getMViewModel()).delete(selectIdList, isDeleteCalendar, new Function0() { // from class: beg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MyHabitListActivity.deleteHabitList$lambda$16(this.f4123a);
            }
        }, new Function1() { // from class: ceg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyHabitListActivity.deleteHabitList$lambda$17(this.f5248a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteHabitList$lambda$16(MyHabitListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        this$0.removeSelectedDataFromList();
        ToastUtil.showShortToast(b0j.common_delete_success);
        if (this$0.dataList.isEmpty()) {
            this$0.startActivity(new Intent(this$0, (Class<?>) HabitListActivity.class));
            p63.b(new sdg());
            this$0.finish();
        } else {
            HabitListAdapter habitListAdapter = this$0.habitListAdapter;
            if (habitListAdapter != null) {
                habitListAdapter.notifyDataSetChanged();
            }
            this$0.resetToList(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteHabitList$lambda$17(MyHabitListActivity this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.hideBack();
        ToastUtil.showShortToast(msg);
        return Unit.INSTANCE;
    }

    private final int getColCountPerRow() {
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            return 3;
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        if (!uIUtils.isTablet()) {
            return 2;
        }
        Application application = getApplication();
        return (application == null || !uIUtils.isLandscape(application)) ? 3 : 5;
    }

    private final String[] getPermissionDescArray() {
        return new String[]{getApplication().getString(b0j.T), " "};
    }

    private final boolean isAllSelected() {
        Iterator<T> it = this.dataList.iterator();
        while (it.hasNext()) {
            if (!((HabitBean) it.next()).isSelected) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRefresh$lambda$23(MyHabitListActivity this$0, ArrayList it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.bindDataToView(it);
        this$0.pullRefreshLoadEnd();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRefresh$lambda$24(MyHabitListActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.pullRefreshLoadEnd();
        ToastUtil.showShortToast(it);
        return Unit.INSTANCE;
    }

    private final void removeSelectedDataFromList() {
        Iterator<HabitBean> it = this.dataList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            HabitBean next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (next.isSelected) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetToList(boolean isReset) {
        View startView;
        this.isAllSelected = false;
        if (isReset) {
            HabitListAdapter habitListAdapter = this.habitListAdapter;
            if (habitListAdapter != null) {
                habitListAdapter.reset();
            }
        } else {
            HabitListAdapter habitListAdapter2 = this.habitListAdapter;
            if (habitListAdapter2 != null) {
                habitListAdapter2.toggleSelectMode();
            }
        }
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (startView = miuiActionBar.getStartView()) != null) {
            startView.setContentDescription(getString(b0j.y));
        }
        IActionBar.DefaultImpls.setStartViewRes$default(this, nni.p, null, 2, null);
        ImageView imageView = this.icon1View;
        if (imageView != null) {
            imageView.setContentDescription(getString(b0j.v));
        }
        if (this.dataList.isEmpty()) {
            ImageView imageView2 = this.icon1View;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        } else {
            ImageView imageView3 = this.icon1View;
            if (imageView3 != null) {
                imageView3.setImageResource(nni.n);
            }
            Iterator<T> it = this.dataList.iterator();
            while (it.hasNext()) {
                ((HabitBean) it.next()).isSelected = false;
            }
        }
        setTitle(b0j.D);
        ((geb) getMBinding()).A.setVisibility(8);
    }

    public static /* synthetic */ void resetToList$default(MyHabitListActivity myHabitListActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        myHabitListActivity.resetToList(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, getColCountPerRow());
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.habit.ui.MyHabitListActivity.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        ((geb) getMBinding()).C.addItemDecoration(new CustomerItemDecoration(getColCountPerRow(), ExtUtilsKt.getDp(Float.valueOf(16.0f)), false));
        ((geb) getMBinding()).C.setLayoutManager(gridLayoutManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindDataToView(@Nullable ArrayList<HabitBean> t) {
        if (((geb) getMBinding()).D.i()) {
            HabitListAdapter habitListAdapter = this.habitListAdapter;
            Intrinsics.checkNotNull(habitListAdapter);
            if (!habitListAdapter.getIsSelectMode()) {
                if (t == null || t.isEmpty()) {
                    ((geb) getMBinding()).B.setVisibility(0);
                    ((geb) getMBinding()).D.setVisibility(8);
                    ImageView imageView = this.icon1View;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else {
                    ((geb) getMBinding()).B.setVisibility(8);
                    ((geb) getMBinding()).D.setVisibility(0);
                    ImageView imageView2 = this.icon1View;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                }
            }
            pullRefreshLoadEnd();
            this.dataList.clear();
        }
        if (t != null) {
            this.dataList.addAll(t);
        }
        MoreRecyclerView.setStatus$default(((geb) getMBinding()).C, (t == null || t.size() < 10) ? Status.DONE : Status.MORE, false, 2, null);
        HabitListAdapter habitListAdapter2 = this.habitListAdapter;
        if (habitListAdapter2 != null) {
            habitListAdapter2.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull geb gebVar) {
        Intrinsics.checkNotNullParameter(gebVar, "<this>");
        setTitle(b0j.D);
        setTitleBackground(hji.c);
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, nni.l, getString(b0j.V), new View.OnClickListener() { // from class: jeg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyHabitListActivity.bindView$lambda$1(this.f22704a, view);
            }
        }, 1, null);
        View viewInflate = LayoutInflater.from(this).inflate(iui.common_layout_title_bar_right_icon, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(dri.Z);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        this.icon1View = imageView;
        if (imageView != null) {
            imageView.setContentDescription(getString(b0j.v));
        }
        ImageView imageView2 = this.icon1View;
        if (imageView2 != null) {
            imageView2.setImageResource(nni.n);
        }
        ImageView imageView3 = this.icon1View;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        ImageView imageView4 = this.icon1View;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new View.OnClickListener() { // from class: udg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyHabitListActivity.bindView$lambda$4(this.f35659a, view);
                }
            });
        }
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setEndView(viewInflate);
        }
        this.habitListAdapter = new HabitListAdapter(this, this.dataList, new Function1() { // from class: vdg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyHabitListActivity.bindView$lambda$5(this.f36773a, (HabitBean) obj);
            }
        });
        ((geb) getMBinding()).C.setAdapter(this.habitListAdapter);
        ((geb) getMBinding()).C.setEnableMore(false);
        ((geb) getMBinding()).D.n(false, 0, DisplayUtil.dip2px(40.0f));
        ((geb) getMBinding()).D.setColorSchemeResources(hji.common_main_dark_gray_color);
        ((geb) getMBinding()).D.setProgressBackgroundColorSchemeResource(hji.f);
        ((geb) getMBinding()).D.setOnRefreshListener(this);
        new gak(DisplayUtil.dip2px(13.0f), DisplayUtil.dip2px(13.0f), false);
        setLayoutManager();
        ((geb) getMBinding()).D.post(new Runnable() { // from class: wdg
            @Override // java.lang.Runnable
            public final void run() {
                MyHabitListActivity.bindView$lambda$8(this.f37869a);
            }
        });
        ((geb) getMBinding()).B.findViewById(dri.c).setOnClickListener(new View.OnClickListener() { // from class: xdg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyHabitListActivity.bindView$lambda$9(this.f39017a, view);
            }
        });
        ((geb) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: ydg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyHabitListActivity.bindView$lambda$15(this.f40071a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return iui.e;
    }

    @NotNull
    public final List<HabitBean> getSelectList() {
        ArrayList arrayList = new ArrayList();
        for (HabitBean habitBean : this.dataList) {
            if (habitBean.isSelected) {
                arrayList.add(habitBean);
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }

    @Override // com.xiaomi.fitness.habit.ui.Hilt_MyHabitListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
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
            onRefresh();
        }
    }

    @Override // com.xiaomi.fitness.habit.ui.Hilt_MyHabitListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (p63.a(this)) {
            p63.d(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        resetToList(true);
        ((geb) getMBinding()).D.setRefreshing(true);
        ((MyHabitListViewModel) getMViewModel()).loadDataFromNetAndCompare(this.dataList, new Function1() { // from class: feg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyHabitListActivity.onRefresh$lambda$23(this.f17705a, (ArrayList) obj);
            }
        }, new Function1() { // from class: geg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MyHabitListActivity.onRefresh$lambda$24(this.f18892a, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void pullRefreshLoadEnd() {
        ((geb) getMBinding()).D.setRefreshing(false);
    }

    public final void refreshTitle() {
        List<HabitBean> selectList = getSelectList();
        if (selectList.size() == 0) {
            setTitle(b0j.R);
        } else {
            setTitle(getResources().getQuantityString(pxi.d, selectList.size(), Integer.valueOf(selectList.size())));
        }
        if (this.isAllSelected) {
            ImageView imageView = this.icon1View;
            if (imageView != null) {
                imageView.setContentDescription(getString(b0j.z));
            }
            ImageView imageView2 = this.icon1View;
            if (imageView2 != null) {
                imageView2.setImageResource(nni.g);
                return;
            }
            return;
        }
        ImageView imageView3 = this.icon1View;
        if (imageView3 != null) {
            imageView3.setContentDescription(getString(b0j.w));
        }
        ImageView imageView4 = this.icon1View;
        if (imageView4 != null) {
            imageView4.setImageResource(nni.q);
        }
    }

    public final void setAllSelected(boolean isSelected) {
        Iterator<T> it = this.dataList.iterator();
        while (it.hasNext()) {
            ((HabitBean) it.next()).isSelected = isSelected;
        }
        HabitListAdapter habitListAdapter = this.habitListAdapter;
        if (habitListAdapter != null) {
            habitListAdapter.notifyDataSetChanged();
        }
        this.isAllSelected = isSelected;
        refreshTitle();
    }
}
