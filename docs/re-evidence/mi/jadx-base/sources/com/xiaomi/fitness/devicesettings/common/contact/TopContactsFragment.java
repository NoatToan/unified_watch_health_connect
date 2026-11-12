package com.xiaomi.fitness.devicesettings.common.contact;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.devicesettings.common.contact.TopContactsFragment;
import defpackage.eui;
import defpackage.fli;
import defpackage.jni;
import defpackage.qi6;
import defpackage.wc0;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/B\u0007¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactsFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactViewModel;", "Lqi6;", "", "onTitleBarEndViewClicked", "()V", "resetNextBtn", "", "listHasChanged", "()Z", "onTitleBarStartViewClicked", "isShowLoading", "loadContactsList", "(Z)V", "bindView", "(Lqi6;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter;", "topContactAdapter", "Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter;", "", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "dataList", "Ljava/util/List;", "orignList", "Landroidx/recyclerview/widget/l;", "mItemTouchHelper", "Landroidx/recyclerview/widget/l;", "getMItemTouchHelper", "()Landroidx/recyclerview/widget/l;", "setMItemTouchHelper", "(Landroidx/recyclerview/widget/l;)V", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TopContactsFragment extends BaseBindingFragment<TopContactViewModel, qi6> {
    public static final int sRequestAdd = 10;
    public l mItemTouchHelper;
    private TopContactAdapter topContactAdapter;

    @NotNull
    private List<ContactBean> dataList = new ArrayList();

    @NotNull
    private List<ContactBean> orignList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(TopContactsFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onTitleBarStartViewClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(TopContactsFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onTitleBarEndViewClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$8(final TopContactsFragment this$0, View view) {
        View endView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TopContactAdapter topContactAdapter = this$0.topContactAdapter;
        TopContactAdapter topContactAdapter2 = null;
        if (topContactAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
            topContactAdapter = null;
        }
        if (topContactAdapter.getIsEditMode()) {
            TopContactAdapter topContactAdapter3 = this$0.topContactAdapter;
            if (topContactAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
                topContactAdapter3 = null;
            }
            topContactAdapter3.setEditMode(false);
            wc0 miuiActionBar = this$0.getMiuiActionBar();
            if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
                endView.setBackgroundResource(jni.X);
            }
            this$0.dataList.clear();
            this$0.dataList.addAll(this$0.orignList);
            TopContactAdapter topContactAdapter4 = this$0.topContactAdapter;
            if (topContactAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
            } else {
                topContactAdapter2 = topContactAdapter4;
            }
            topContactAdapter2.notifyDataSetChanged();
        }
        PermissionExtKt.permission(this$0, "android.permission.READ_CONTACTS", this$0.getString(wzi.ef), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: ojp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TopContactsFragment.bindView$lambda$8$lambda$7(this.f29231a, (PermissionBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8$lambda$7(final TopContactsFragment this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: ljp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TopContactsFragment.bindView$lambda$8$lambda$7$lambda$4(this.f25139a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: mjp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TopContactsFragment.bindView$lambda$8$lambda$7$lambda$6(this.f26939a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8$lambda$7$lambda$4(TopContactsFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            this$0.startActivityForResult(new Intent(mActivity, (Class<?>) ContactsListActivity.class), 10);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8$lambda$7$lambda$6(final TopContactsFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, it, mActivity, null, null, null, new Function0() { // from class: njp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TopContactsFragment.bindView$lambda$8$lambda$7$lambda$6$lambda$5(this.f27991a);
            }
        }, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8$lambda$7$lambda$6$lambda$5(TopContactsFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PermissionsUtil permissionsUtil = PermissionsUtil.INSTANCE;
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        PermissionsUtil.showSettingDialog$default(permissionsUtil, mActivity, "android.permission.READ_CONTACTS", false, null, 8, null);
        return Unit.INSTANCE;
    }

    private final boolean listHasChanged() {
        if (this.dataList.size() != this.orignList.size()) {
            return true;
        }
        int size = this.dataList.size();
        for (int i = 0; i < size; i++) {
            ContactBean contactBean = this.dataList.get(i);
            ContactBean contactBean2 = this.orignList.get(i);
            if (!Intrinsics.areEqual(contactBean.getName(), contactBean2.getName()) || !Intrinsics.areEqual(contactBean.getPhone(), contactBean2.getPhone())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadContactsList(boolean isShowLoading) {
        if (isShowLoading) {
            showLoading();
        }
        ((TopContactViewModel) getMViewModel()).getContactListFromDevice(new Function2() { // from class: jjp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TopContactsFragment.loadContactsList$lambda$10(this.f22874a, (List) obj, ((Integer) obj2).intValue());
            }
        }, new Function0() { // from class: kjp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TopContactsFragment.loadContactsList$lambda$11(this.f23928a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContactsList$lambda$10(TopContactsFragment this$0, List it, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialogForce();
        this$0.orignList.clear();
        this$0.orignList.addAll(it);
        TopContactAdapter topContactAdapter = this$0.topContactAdapter;
        if (topContactAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
            topContactAdapter = null;
        }
        topContactAdapter.updateDataList(it);
        if (it.isEmpty()) {
            this$0.getMBinding().C.setVisibility(0);
            this$0.getMBinding().A.setVisibility(8);
        } else {
            this$0.resetNextBtn();
            this$0.getMBinding().C.setVisibility(8);
            this$0.getMBinding().A.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContactsList$lambda$11(TopContactsFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        ToastUtil.showShortToast(wzi.P2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onTitleBarEndViewClicked() {
        View endView;
        View endView2;
        TopContactAdapter topContactAdapter = this.topContactAdapter;
        TopContactAdapter topContactAdapter2 = null;
        if (topContactAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
            topContactAdapter = null;
        }
        if (!topContactAdapter.getIsEditMode()) {
            TopContactAdapter topContactAdapter3 = this.topContactAdapter;
            if (topContactAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
                topContactAdapter3 = null;
            }
            topContactAdapter3.setEditMode(true);
            wc0 miuiActionBar = getMiuiActionBar();
            if (miuiActionBar != null && (endView2 = miuiActionBar.getEndView()) != null) {
                endView2.setBackgroundResource(jni.f1);
            }
            TopContactAdapter topContactAdapter4 = this.topContactAdapter;
            if (topContactAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
            } else {
                topContactAdapter2 = topContactAdapter4;
            }
            topContactAdapter2.notifyDataSetChanged();
            return;
        }
        boolean zListHasChanged = listHasChanged();
        Logger.i(TopContactViewModel.sTag, "listHasChanged:" + zListHasChanged);
        if (zListHasChanged) {
            ((TopContactViewModel) getMViewModel()).syncContact(this.dataList, new Function0() { // from class: ijp
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TopContactsFragment.onTitleBarEndViewClicked$lambda$9(this.f21239a);
                }
            });
            return;
        }
        this.dataList.clear();
        this.dataList.addAll(this.orignList);
        TopContactAdapter topContactAdapter5 = this.topContactAdapter;
        if (topContactAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
            topContactAdapter5 = null;
        }
        topContactAdapter5.notifyDataSetChanged();
        resetNextBtn();
        TopContactAdapter topContactAdapter6 = this.topContactAdapter;
        if (topContactAdapter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
        } else {
            topContactAdapter2 = topContactAdapter6;
        }
        topContactAdapter2.setEditMode(false);
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 == null || (endView = miuiActionBar2.getEndView()) == null) {
            return;
        }
        endView.setBackgroundResource(jni.X);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTitleBarEndViewClicked$lambda$9(TopContactsFragment this$0) {
        View endView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.orignList.clear();
        this$0.orignList.addAll(this$0.dataList);
        TopContactAdapter topContactAdapter = this$0.topContactAdapter;
        TopContactAdapter topContactAdapter2 = null;
        if (topContactAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
            topContactAdapter = null;
        }
        topContactAdapter.setEditMode(false);
        TopContactAdapter topContactAdapter3 = this$0.topContactAdapter;
        if (topContactAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
            topContactAdapter3 = null;
        }
        topContactAdapter3.notifyDataSetChanged();
        ToastUtil.showShortToast(wzi.R2);
        this$0.resetNextBtn();
        TopContactAdapter topContactAdapter4 = this$0.topContactAdapter;
        if (topContactAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
        } else {
            topContactAdapter2 = topContactAdapter4;
        }
        topContactAdapter2.setEditMode(false);
        wc0 miuiActionBar = this$0.getMiuiActionBar();
        if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
            endView.setBackgroundResource(jni.X);
        }
        return Unit.INSTANCE;
    }

    private final void onTitleBarStartViewClicked() {
        View endView;
        TopContactAdapter topContactAdapter = this.topContactAdapter;
        TopContactAdapter topContactAdapter2 = null;
        if (topContactAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
            topContactAdapter = null;
        }
        if (!topContactAdapter.getIsEditMode()) {
            finish();
            return;
        }
        TopContactAdapter topContactAdapter3 = this.topContactAdapter;
        if (topContactAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
            topContactAdapter3 = null;
        }
        topContactAdapter3.setEditMode(false);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
            endView.setBackgroundResource(jni.X);
        }
        this.dataList.clear();
        this.dataList.addAll(this.orignList);
        TopContactAdapter topContactAdapter4 = this.topContactAdapter;
        if (topContactAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
        } else {
            topContactAdapter2 = topContactAdapter4;
        }
        topContactAdapter2.notifyDataSetChanged();
    }

    private final void resetNextBtn() {
        if (this.dataList.size() >= 10) {
            getMBinding().F.setEnabled(false);
        } else {
            getMBinding().F.setEnabled(true);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull qi6 qi6Var) {
        Intrinsics.checkNotNullParameter(qi6Var, "<this>");
        setTitle(wzi.N2);
        Bundle bundle = new Bundle();
        bundle.putInt("cancel_btn_res_id", jni.Q0);
        bundle.putInt("save_btn_res_id", jni.X);
        IActionBar.DefaultImpls.applyEditModeActionBar$default(this, bundle, new Function1() { // from class: fjp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TopContactsFragment.bindView$lambda$1(this.f17857a, (View) obj);
            }
        }, new Function1() { // from class: gjp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TopContactsFragment.bindView$lambda$2(this.f19065a, (View) obj);
            }
        }, null, null, 24, null);
        qi6Var.A.setLayoutManager(new LinearLayoutManager(getMActivity()));
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        TopContactAdapter topContactAdapter = new TopContactAdapter(mActivity, this.dataList, new TopContactAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.devicesettings.common.contact.TopContactsFragment.bindView.3
            @Override // com.xiaomi.fitness.devicesettings.common.contact.TopContactAdapter.OnItemClickListener
            public void onDrag(RecyclerView.d0 holder) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                TopContactsFragment.this.getMItemTouchHelper().x(holder);
            }

            @Override // com.xiaomi.fitness.devicesettings.common.contact.TopContactAdapter.OnItemClickListener
            public void onItemDelete(int position) {
                TopContactAdapter topContactAdapter2 = TopContactsFragment.this.topContactAdapter;
                if (topContactAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
                    topContactAdapter2 = null;
                }
                topContactAdapter2.notifyDataSetChanged();
            }

            @Override // com.xiaomi.fitness.devicesettings.common.contact.TopContactAdapter.OnItemClickListener
            public void onItemSelect(ContactBean contactBean) {
                TopContactAdapter.OnItemClickListener.DefaultImpls.onItemSelect(this, contactBean);
            }

            @Override // com.xiaomi.fitness.devicesettings.common.contact.TopContactAdapter.OnItemClickListener
            public boolean onLongClick(ContactBean contactBean) {
                return TopContactAdapter.OnItemClickListener.DefaultImpls.onLongClick(this, contactBean);
            }
        });
        this.topContactAdapter = topContactAdapter;
        qi6Var.A.setAdapter(topContactAdapter);
        TopContactAdapter topContactAdapter2 = this.topContactAdapter;
        if (topContactAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topContactAdapter");
            topContactAdapter2 = null;
        }
        setMItemTouchHelper(new l(topContactAdapter2.getItemTouchHelperCallback()));
        getMItemTouchHelper().d(qi6Var.A);
        loadContactsList(true);
        qi6Var.F.setOnClickListener(new View.OnClickListener() { // from class: hjp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopContactsFragment.bindView$lambda$8(this.f20139a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.B0;
    }

    @NotNull
    public final l getMItemTouchHelper() {
        l lVar = this.mItemTouchHelper;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mItemTouchHelper");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10 && resultCode == -1) {
            loadContactsList(true);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(fli.e);
        getMBinding().E.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        ViewGroup.LayoutParams layoutParams = getMBinding().F.getLayoutParams();
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = BaseFragmentExtKt.getDimensionPixelOffset(this, fli.common_btn_single_line_width);
        }
        getMBinding().F.setLayoutParams(layoutParams);
    }

    public final void setMItemTouchHelper(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.mItemTouchHelper = lVar;
    }
}
