package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetManagerFragmentV2;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetManagerV2ViewModel;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.av6;
import defpackage.bw1;
import defpackage.cji;
import defpackage.eui;
import defpackage.jni;
import defpackage.qyi;
import defpackage.wzi;
import defpackage.yj6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00013B\u0007¢\u0006\u0004\b2\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\bJ\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerFragmentV2;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerV2ViewModel;", "Lyj6;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/DragItemClickCallback;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/IWidgetOperationListener;", "", "initView", "()V", "onSetEndViewClick", "Lkotlin/Function0;", "block", "checkDeviceConnection", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "", "idx", "onWidgetRemove", "(I)V", "popUpSelectAppWidget", "oldPosition", "newPosition", "onMove", "(II)Z", "clearView", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewholder", "doDrag", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerAdapterV2;", "mAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerAdapterV2;", "Landroidx/recyclerview/widget/l;", "mTouchHelper", "Landroidx/recyclerview/widget/l;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/NativeBuiltinWrapper;", "mWidgetList", "Ljava/util/ArrayList;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WidgetManagerFragmentV2 extends Hilt_WidgetManagerFragmentV2<WidgetManagerV2ViewModel, yj6> implements DragItemClickCallback, IWidgetOperationListener {

    @NotNull
    private static final String TAG = "WidgetManagerFragmentV2";
    private WidgetManagerAdapterV2 mAdapter;
    private l mTouchHelper;

    @NotNull
    private final ArrayList<NativeBuiltinWrapper> mWidgetList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WidgetManagerV2ViewModel.SaveState.values().length];
            try {
                iArr[WidgetManagerV2ViewModel.SaveState.SAVE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetManagerV2ViewModel.SaveState.SAVE_FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetManagerV2ViewModel.SaveState.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetManagerFragmentV2$onBackPressed$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerFragmentV2$onBackPressed$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends av6 {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(WidgetManagerFragmentV2 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            WidgetManagerFragmentV2.access$getMViewModel(this$0).saveWidgetList();
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            if (which == -2) {
                FragmentActivity mActivity = WidgetManagerFragmentV2.this.getMActivity();
                if (mActivity != null) {
                    mActivity.finish();
                    return;
                }
                return;
            }
            if (which != -1) {
                return;
            }
            final WidgetManagerFragmentV2 widgetManagerFragmentV2 = WidgetManagerFragmentV2.this;
            widgetManagerFragmentV2.checkDeviceConnection(new Function0() { // from class: ajr
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WidgetManagerFragmentV2.AnonymousClass1.onDialogClick$lambda$0(widgetManagerFragmentV2);
                }
            });
            FragmentActivity mActivity2 = WidgetManagerFragmentV2.this.getMActivity();
            if (mActivity2 != null) {
                mActivity2.finish();
            }
        }
    }

    public WidgetManagerFragmentV2() {
        super(eui.S0, bw1.f, true);
        this.mWidgetList = new ArrayList<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ WidgetManagerV2ViewModel access$getMViewModel(WidgetManagerFragmentV2 widgetManagerFragmentV2) {
        return (WidgetManagerV2ViewModel) widgetManagerFragmentV2.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkDeviceConnection(Function0<Unit> block) {
        if (UtilsKt.isDeviceConnection()) {
            block.invoke();
        } else {
            Logger.i(TAG, "========== 设备断连 ==========");
            ToastUtil.showShortToast(wzi.ja);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        setTitle(wzi.ha);
        setTitleBackground(cji.f5403a);
        WidgetManagerAdapterV2 widgetManagerAdapterV2 = new WidgetManagerAdapterV2(this.mWidgetList);
        this.mAdapter = widgetManagerAdapterV2;
        widgetManagerAdapterV2.setWidgetOperationListener(this);
        RecyclerView recyclerView = ((yj6) getMBinding()).C;
        WidgetManagerAdapterV2 widgetManagerAdapterV3 = this.mAdapter;
        if (widgetManagerAdapterV3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            widgetManagerAdapterV3 = null;
        }
        recyclerView.setAdapter(widgetManagerAdapterV3);
        ((yj6) getMBinding()).C.setLayoutManager(new LinearLayoutManager(getMActivity()));
        l lVar = new l(new ItemDragHelperCallback(this));
        this.mTouchHelper = lVar;
        lVar.d(((yj6) getMBinding()).C);
        final View endView$default = IActionBar.DefaultImpls.setEndView$default(this, 0, jni.f1, "", new View.OnClickListener() { // from class: sir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetManagerFragmentV2.initView$lambda$1(this.f33687a, view);
            }
        }, 1, null);
        ((WidgetManagerV2ViewModel) getMViewModel()).getEditorMode().observe(getViewLifecycleOwner(), new WidgetManagerFragmentV2$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: tir
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WidgetManagerFragmentV2.initView$lambda$2(endView$default, (Boolean) obj);
            }
        }));
        ((WidgetManagerV2ViewModel) getMViewModel()).getWidgetList().observe(getViewLifecycleOwner(), new WidgetManagerFragmentV2$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: uir
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WidgetManagerFragmentV2.initView$lambda$3(this.f35807a, (List) obj);
            }
        }));
        ((WidgetManagerV2ViewModel) getMViewModel()).getSaveState().observe(getViewLifecycleOwner(), new WidgetManagerFragmentV2$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vir
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WidgetManagerFragmentV2.initView$lambda$4((WidgetManagerV2ViewModel.SaveState) obj);
            }
        }));
        ViewExtKt.clickWithTrigger$default(((yj6) getMBinding()).A, 0L, new Function1() { // from class: wir
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WidgetManagerFragmentV2.initView$lambda$5(this.f38015a, (Button) obj);
            }
        }, 1, null);
        checkDeviceConnection(new Function0() { // from class: xir
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WidgetManagerFragmentV2.initView$lambda$6(this.f39174a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(final WidgetManagerFragmentV2 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkDeviceConnection(new Function0() { // from class: zir
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WidgetManagerFragmentV2.initView$lambda$1$lambda$0(this.f41325a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1$lambda$0(WidgetManagerFragmentV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onSetEndViewClick();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2(View view, Boolean bool) {
        if (view != null) {
            ExtUtilsKt.setVisible(view, bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$3(WidgetManagerFragmentV2 this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LinearLayout llEmpty = ((yj6) this$0.getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(llEmpty, "llEmpty");
        ExtUtilsKt.setVisible(llEmpty, list.size() == 0);
        this$0.mWidgetList.clear();
        this$0.mWidgetList.addAll(list);
        WidgetManagerAdapterV2 widgetManagerAdapterV2 = this$0.mAdapter;
        if (widgetManagerAdapterV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            widgetManagerAdapterV2 = null;
        }
        widgetManagerAdapterV2.notifyDataSetChanged();
        this$0.hideLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$4(WidgetManagerV2ViewModel.SaveState saveState) {
        int i = saveState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[saveState.ordinal()];
        if (i == 1) {
            ToastUtil.showShortToast(wzi.common_save_success);
        } else if (i == 2) {
            ToastUtil.showShortToast(wzi.common_save_fail);
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$5(WidgetManagerFragmentV2 this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.popUpSelectAppWidget();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initView$lambda$6(WidgetManagerFragmentV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, true, 3, null);
        ((WidgetManagerV2ViewModel) this$0.getMViewModel()).loadWidgetList();
        ((WidgetManagerV2ViewModel) this$0.getMViewModel()).loadWidgetSupportList();
        return Unit.INSTANCE;
    }

    private final void onSetEndViewClick() {
        Logger.i(TAG, "Title点击保存按钮");
        checkDeviceConnection(new Function0() { // from class: yir
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WidgetManagerFragmentV2.onSetEndViewClick$lambda$7(this.f40224a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onSetEndViewClick$lambda$7(WidgetManagerFragmentV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((WidgetManagerV2ViewModel) this$0.getMViewModel()).saveWidgetList();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.bluttooth.widget.DragItemClickCallback
    public void clearView() {
        WidgetManagerV2ViewModel widgetManagerV2ViewModel = (WidgetManagerV2ViewModel) getMViewModel();
        WidgetManagerAdapterV2 widgetManagerAdapterV2 = this.mAdapter;
        if (widgetManagerAdapterV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            widgetManagerAdapterV2 = null;
        }
        widgetManagerV2ViewModel.changeWidgetList(widgetManagerAdapterV2.getDataList());
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.widget.IWidgetOperationListener
    public void doDrag(@NotNull RecyclerView.d0 viewholder) {
        Intrinsics.checkNotNullParameter(viewholder, "viewholder");
        l lVar = this.mTouchHelper;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTouchHelper");
            lVar = null;
        }
        lVar.x(viewholder);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.S0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        if (!Intrinsics.areEqual(((WidgetManagerV2ViewModel) getMViewModel()).getEditorMode().getValue(), Boolean.TRUE)) {
            return super.onBackPressed();
        }
        new CommonDialog.c("WidgetChangePressBackDialog").setDialogDescriptionString(new DialogParams.DialogDescriptionString(wzi.Q9, new Object[0])).setPositiveText(wzi.T6).setNegativeText(wzi.V6).setCancelable(true).setCanceledOnTouchOutside(true).create().addDialogCallback(new AnonymousClass1()).showIfNeed(getParentFragmentManager());
        return true;
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.widget.DragItemClickCallback
    public boolean onMove(int oldPosition, int newPosition) {
        WidgetManagerAdapterV2 widgetManagerAdapterV2 = this.mAdapter;
        if (widgetManagerAdapterV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            widgetManagerAdapterV2 = null;
        }
        widgetManagerAdapterV2.moveItemPositioin(oldPosition, newPosition);
        return true;
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.bluttooth.widget.IWidgetOperationListener
    public void onWidgetRemove(int idx) {
        Logger.i("WidgetManagerFragmentV2 删除组件： " + idx, new Object[0]);
        if (!((WidgetManagerV2ViewModel) getMViewModel()).removeWidget(idx)) {
            int minWidgetNum = ((WidgetManagerV2ViewModel) getMViewModel()).getMinWidgetNum();
            String quantityString = getResources().getQuantityString(qyi.x, minWidgetNum, Integer.valueOf(minWidgetNum));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            new CommonDialog.c("WidgetRemoveFalse").setDialogDescriptionString(new DialogParams.DialogDescriptionString(quantityString)).setPositiveText(wzi.common_known).setCancelable(true).setCanceledOnTouchOutside(true).create().showIfNeed(getParentFragmentManager());
        }
        WidgetManagerAdapterV2 widgetManagerAdapterV2 = this.mAdapter;
        if (widgetManagerAdapterV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            widgetManagerAdapterV2 = null;
        }
        widgetManagerAdapterV2.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void popUpSelectAppWidget() {
        if (((WidgetManagerV2ViewModel) getMViewModel()).getSupportWidget().getValue() != null) {
            Logger.i(TAG, "开启Dialog，选择小部件");
            WidgetSelectGroupDialog.Companion companion = WidgetSelectGroupDialog.INSTANCE;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            companion.startDialog(parentFragmentManager);
        }
    }
}
