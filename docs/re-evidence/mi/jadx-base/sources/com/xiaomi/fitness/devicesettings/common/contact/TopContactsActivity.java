package com.xiaomi.fitness.devicesettings.common.contact;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyInfoFragment;
import com.xiaomi.fitness.devicesettings.common.contact.TopContactsActivity;
import defpackage.eui;
import defpackage.fli;
import defpackage.jni;
import defpackage.qi6;
import defpackage.qyi;
import defpackage.wc0;
import defpackage.wzi;
import defpackage.zwh;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00013B\u0007¢\u0006\u0004\b2\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactsActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactViewModel;", "Lqi6;", "", "onTitleBarEndViewClicked", "()V", "resetNextBtn", "", "listHasChanged", "()Z", "onTitleBarStartViewClicked", "isShowLoading", "loadContactsList", "(Z)V", "bindView", "(Lqi6;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter;", "topContactAdapter", "Lcom/xiaomi/fitness/devicesettings/common/contact/TopContactAdapter;", "", "Lcom/xiaomi/fitness/devicesettings/common/contact/ContactBean;", "dataList", "Ljava/util/List;", "orignList", "Landroidx/recyclerview/widget/l;", "mItemTouchHelper", "Landroidx/recyclerview/widget/l;", "getMItemTouchHelper", "()Landroidx/recyclerview/widget/l;", "setMItemTouchHelper", "(Landroidx/recyclerview/widget/l;)V", "maxContactsNumber", "I", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TopContactsActivity extends BaseBindingActivity<TopContactViewModel, qi6> {
    public static final int sRequestAdd = 10;
    public l mItemTouchHelper;
    private TopContactAdapter topContactAdapter;

    @NotNull
    private List<ContactBean> dataList = new ArrayList();

    @NotNull
    private List<ContactBean> orignList = new ArrayList();
    private int maxContactsNumber = 10;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(TopContactsActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onTitleBarStartViewClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(TopContactsActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onTitleBarEndViewClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3(TopContactsActivity this$0, View view) {
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
        this$0.startActivityForResult(new Intent(this$0, (Class<?>) ContactsListActivity.class), 10);
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
        ((TopContactViewModel) getMViewModel()).getContactListFromDevice(new Function2() { // from class: cjp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TopContactsActivity.loadContactsList$lambda$5(this.f5411a, (List) obj, ((Integer) obj2).intValue());
            }
        }, new Function0() { // from class: djp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TopContactsActivity.loadContactsList$lambda$6(this.f15598a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContactsList$lambda$5(TopContactsActivity this$0, List it, int i) {
        View endView;
        View endView2;
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
        this$0.maxContactsNumber = i;
        this$0.getMBinding().H.setText(ResourceExtKt.getQuantityString(this$0, qyi.f, i, Integer.valueOf(i)));
        if (it.isEmpty()) {
            this$0.getMBinding().C.setVisibility(0);
            this$0.getMBinding().A.setVisibility(8);
            wc0 miuiActionBar = this$0.getMiuiActionBar();
            if (miuiActionBar != null && (endView2 = miuiActionBar.getEndView()) != null) {
                endView2.setVisibility(8);
            }
        } else {
            this$0.resetNextBtn();
            this$0.getMBinding().C.setVisibility(8);
            this$0.getMBinding().A.setVisibility(0);
            wc0 miuiActionBar2 = this$0.getMiuiActionBar();
            if (miuiActionBar2 != null && (endView = miuiActionBar2.getEndView()) != null) {
                endView.setVisibility(0);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadContactsList$lambda$6(TopContactsActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        ToastUtil.showShortToast(wzi.P2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$8(TopContactsActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.loadContactsList(false);
        } else {
            this$0.hideLoading();
            ToastExtKt.toastShort(this$0, wzi.O2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onTitleBarEndViewClicked() {
        View endView;
        View endView2;
        View endView3;
        View endView4;
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
            getMBinding().F.setVisibility(8);
            wc0 miuiActionBar = getMiuiActionBar();
            if (miuiActionBar != null && (endView4 = miuiActionBar.getEndView()) != null) {
                endView4.setBackgroundResource(jni.f1);
            }
            wc0 miuiActionBar2 = getMiuiActionBar();
            if (miuiActionBar2 != null && (endView3 = miuiActionBar2.getEndView()) != null) {
                endView3.setContentDescription(getString(wzi.common_submit));
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
        getMBinding().F.setVisibility(0);
        boolean zListHasChanged = listHasChanged();
        Logger.i(TopContactViewModel.sTag, "listHasChanged:" + zListHasChanged);
        if (zListHasChanged) {
            WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
            DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
                ToastUtil.showShortToast(wzi.q);
                return;
            } else {
                ((TopContactViewModel) getMViewModel()).syncContact(this.dataList, new Function0() { // from class: yip
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TopContactsActivity.onTitleBarEndViewClicked$lambda$4(this.f40223a);
                    }
                });
                return;
            }
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
        wc0 miuiActionBar3 = getMiuiActionBar();
        if (miuiActionBar3 != null && (endView2 = miuiActionBar3.getEndView()) != null) {
            endView2.setBackgroundResource(jni.X);
        }
        wc0 miuiActionBar4 = getMiuiActionBar();
        if (miuiActionBar4 == null || (endView = miuiActionBar4.getEndView()) == null) {
            return;
        }
        endView.setContentDescription(getString(wzi.common_edit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTitleBarEndViewClicked$lambda$4(TopContactsActivity this$0) {
        View endView;
        View endView2;
        View endView3;
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
        if (miuiActionBar != null && (endView3 = miuiActionBar.getEndView()) != null) {
            endView3.setBackgroundResource(jni.X);
        }
        wc0 miuiActionBar2 = this$0.getMiuiActionBar();
        if (miuiActionBar2 != null && (endView2 = miuiActionBar2.getEndView()) != null) {
            endView2.setVisibility(this$0.dataList.isEmpty() ? 8 : 0);
        }
        wc0 miuiActionBar3 = this$0.getMiuiActionBar();
        if (miuiActionBar3 != null && (endView = miuiActionBar3.getEndView()) != null) {
            endView.setContentDescription(this$0.getString(wzi.common_edit));
        }
        this$0.getMBinding().C.setVisibility(this$0.dataList.isEmpty() ? 0 : 8);
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
        getMBinding().F.setVisibility(0);
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
        getMBinding().F.setEnabled(this.dataList.size() < this.maxContactsNumber);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull qi6 qi6Var) {
        Intrinsics.checkNotNullParameter(qi6Var, "<this>");
        setTitle(wzi.N2);
        Bundle bundle = new Bundle();
        bundle.putInt("cancel_btn_res_id", jni.Q0);
        bundle.putInt("save_btn_res_id", jni.X);
        IActionBar.DefaultImpls.applyEditModeActionBar$default(this, bundle, new Function1() { // from class: zip
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TopContactsActivity.bindView$lambda$1(this.f41324a, (View) obj);
            }
        }, new Function1() { // from class: ajp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TopContactsActivity.bindView$lambda$2(this.f1106a, (View) obj);
            }
        }, null, getString(wzi.common_edit), 8, null);
        qi6Var.A.setLayoutManager(new LinearLayoutManager(this));
        TopContactAdapter topContactAdapter = new TopContactAdapter(this, this.dataList, new TopContactAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.devicesettings.common.contact.TopContactsActivity.bindView.3
            @Override // com.xiaomi.fitness.devicesettings.common.contact.TopContactAdapter.OnItemClickListener
            public void onDrag(RecyclerView.d0 holder) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                TopContactsActivity.this.getMItemTouchHelper().x(holder);
            }

            @Override // com.xiaomi.fitness.devicesettings.common.contact.TopContactAdapter.OnItemClickListener
            public void onItemDelete(int position) {
                TopContactAdapter topContactAdapter2 = TopContactsActivity.this.topContactAdapter;
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
        qi6Var.F.setOnClickListener(new View.OnClickListener() { // from class: bjp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopContactsActivity.bindView$lambda$3(this.f4293a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
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

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        String stringExtra;
        String stringExtra2;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10 && resultCode == -1) {
            String str = "";
            if (data == null || (stringExtra = data.getStringExtra(EmergencyInfoFragment.EMERGENCY_INFO_REMARK_EXTRA)) == null) {
                stringExtra = "";
            }
            if (data != null && (stringExtra2 = data.getStringExtra(EmergencyInfoFragment.EMERGENCY_INFO_NUMBER_EXTRA)) != null) {
                str = stringExtra2;
            }
            ContactBean contactBean = new ContactBean(stringExtra, str);
            String strD = zwh.d(stringExtra);
            Intrinsics.checkNotNullExpressionValue(strD, "getPinyin(...)");
            String upperCase = strD.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            contactBean.setPinyin(upperCase);
            showLoading();
            ((TopContactViewModel) getMViewModel()).addContact(contactBean, new Function1() { // from class: ejp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TopContactsActivity.onActivityResult$lambda$8(this.f16715a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(fli.e);
        getMBinding().E.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        ViewGroup.LayoutParams layoutParams = getMBinding().F.getLayoutParams();
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = getResources().getDimensionPixelOffset(fli.common_btn_single_line_width);
        }
        getMBinding().F.setLayoutParams(layoutParams);
    }

    public final void setMItemTouchHelper(@NotNull l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.mItemTouchHelper = lVar;
    }
}
