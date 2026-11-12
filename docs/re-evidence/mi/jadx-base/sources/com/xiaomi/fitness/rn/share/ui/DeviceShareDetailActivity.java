package com.xiaomi.fitness.rn.share.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.RNProductManager;
import com.xiaomi.fitness.rn.export.bean.RNProduct;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.extetions.ProductExtKt;
import com.xiaomi.fitness.rn.share.adapter.DeviceShareUserListAdapter;
import com.xiaomi.fitness.rn.share.bean.UserListBean;
import com.xiaomi.fitness.rn.share.ui.DeviceShareDetailActivity;
import com.xiaomi.fitness.rn.share.utils.UtilsKt;
import com.xiaomi.fitness.rn.share.viewmodel.DeviceShareDetailViewModel;
import defpackage.avi;
import defpackage.coi;
import defpackage.svk;
import defpackage.w0j;
import defpackage.wc0;
import defpackage.xji;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0007¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/rn/share/ui/DeviceShareDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/rn/share/viewmodel/DeviceShareDetailViewModel;", "Lsvk;", "", "loadData", "()V", "resetUI", "bindView", "(Lsvk;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "Lcom/xiaomi/fitness/rn/share/bean/UserListBean;", "dataList", "Ljava/util/List;", "Lcom/xiaomi/fitness/rn/share/adapter/DeviceShareUserListAdapter;", "deviceShareUserListAdapter", "Lcom/xiaomi/fitness/rn/share/adapter/DeviceShareUserListAdapter;", "", "did", "Ljava/lang/String;", "model", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceShareDetailActivity extends BaseBindingActivity<DeviceShareDetailViewModel, svk> {

    @NotNull
    public static final String sDid = "sDid";

    @NotNull
    public static final String sModel = "sModel";
    public static final int sRequestCodeInput = 10;

    @NotNull
    private List<UserListBean> dataList = new ArrayList();

    @Nullable
    private DeviceShareUserListAdapter deviceShareUserListAdapter;

    @Nullable
    private String did;

    @Nullable
    private String model;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3(DeviceShareDetailActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4(DeviceShareDetailActivity this$0, View it) {
        View endView;
        View endView2;
        View endView3;
        View endView4;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        DeviceShareUserListAdapter deviceShareUserListAdapter = this$0.deviceShareUserListAdapter;
        if (deviceShareUserListAdapter != null) {
            boolean z = false;
            if (deviceShareUserListAdapter != null && deviceShareUserListAdapter.getIsEditMode()) {
                z = true;
            }
            deviceShareUserListAdapter.setEditMode(!z);
        }
        DeviceShareUserListAdapter deviceShareUserListAdapter2 = this$0.deviceShareUserListAdapter;
        if (deviceShareUserListAdapter2 != null) {
            deviceShareUserListAdapter2.notifyDataSetChanged();
        }
        DeviceShareUserListAdapter deviceShareUserListAdapter3 = this$0.deviceShareUserListAdapter;
        if (deviceShareUserListAdapter3 == null || !deviceShareUserListAdapter3.getIsEditMode()) {
            wc0 miuiActionBar = this$0.getMiuiActionBar();
            if (miuiActionBar != null && (endView2 = miuiActionBar.getEndView()) != null) {
                endView2.setBackgroundResource(coi.f5600a);
            }
            wc0 miuiActionBar2 = this$0.getMiuiActionBar();
            if (miuiActionBar2 != null && (endView = miuiActionBar2.getEndView()) != null) {
                endView.setContentDescription(this$0.getString(w0j.common_delete));
            }
        } else {
            wc0 miuiActionBar3 = this$0.getMiuiActionBar();
            if (miuiActionBar3 != null && (endView4 = miuiActionBar3.getEndView()) != null) {
                endView4.setBackgroundResource(coi.c);
            }
            wc0 miuiActionBar4 = this$0.getMiuiActionBar();
            if (miuiActionBar4 != null && (endView3 = miuiActionBar4.getEndView()) != null) {
                endView3.setContentDescription(this$0.getString(w0j.B));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8(final DeviceShareDetailActivity this$0, final UserListBean bean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bean, "bean");
        String string = this$0.getString(w0j.p, bean.getNickname());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i = w0j.c;
        int i2 = w0j.f37416b;
        FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        UtilsKt.showMsgDialog((64 & 1) != 0 ? null : null, string, i, supportFragmentManager, (64 & 16) != 0 ? -1 : i2, (Function1<? super DialogInterface, Unit>) ((64 & 32) != 0 ? null : new Function1() { // from class: zn6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareDetailActivity.bindView$lambda$8$lambda$7(this.f41475a, bean, (DialogInterface) obj);
            }
        }), (Function1<? super DialogInterface, Unit>) ((64 & 64) != 0 ? null : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$8$lambda$7(final DeviceShareDetailActivity this$0, final UserListBean bean, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bean, "$bean");
        PageState.DefaultImpls.showLoading$default(this$0, w0j.common_deleting, false, 2, null);
        DeviceShareDetailViewModel deviceShareDetailViewModel = (DeviceShareDetailViewModel) this$0.getMViewModel();
        String str = this$0.did;
        Intrinsics.checkNotNull(str);
        deviceShareDetailViewModel.deleteShareUser(str, bean, new Function1() { // from class: ao6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareDetailActivity.bindView$lambda$8$lambda$7$lambda$5(this.f3297a, bean, ((Boolean) obj).booleanValue());
            }
        }, new Function2() { // from class: bo6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DeviceShareDetailActivity.bindView$lambda$8$lambda$7$lambda$6(this.f4416a, ((Integer) obj).intValue(), (String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8$lambda$7$lambda$5(DeviceShareDetailActivity this$0, UserListBean bean, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bean, "$bean");
        ToastUtil.INSTANCE.showToast(w0j.common_delete_success);
        this$0.dismissDialogForce();
        this$0.dataList.remove(bean);
        this$0.setResult(-1);
        DeviceShareUserListAdapter deviceShareUserListAdapter = this$0.deviceShareUserListAdapter;
        if (deviceShareUserListAdapter != null) {
            deviceShareUserListAdapter.notifyDataSetChanged();
        }
        this$0.resetUI();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8$lambda$7$lambda$6(DeviceShareDetailActivity this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastUtil.INSTANCE.showToast(w0j.common_delete_failure);
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$9(DeviceShareDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) InputUserIdActivity.class);
        intent.putExtra("sDid", this$0.did);
        this$0.startActivityForResult(intent, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadData() {
        String str = this.did;
        if (str != null) {
            ((DeviceShareDetailViewModel) getMViewModel()).loadDeviceShareList(str, new Function1() { // from class: xn6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceShareDetailActivity.loadData$lambda$12$lambda$10(this.f39276a, (List) obj);
                }
            }, new Function2() { // from class: yn6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeviceShareDetailActivity.loadData$lambda$12$lambda$11(((Integer) obj).intValue(), (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$12$lambda$10(DeviceShareDetailActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dataList.clear();
        this$0.dataList.addAll(it);
        DeviceShareUserListAdapter deviceShareUserListAdapter = this$0.deviceShareUserListAdapter;
        if (deviceShareUserListAdapter != null) {
            deviceShareUserListAdapter.notifyDataSetChanged();
        }
        this$0.resetUI();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$12$lambda$11(int i, String str) {
        ToastUtil.INSTANCE.showToast(w0j.common_hint_unkonwn_error);
        return Unit.INSTANCE;
    }

    private final void resetUI() {
        View endView;
        View endView2;
        View startView;
        View endView3;
        if (this.dataList.isEmpty()) {
            getMBinding().A.setVisibility(0);
            getMBinding().D.setVisibility(8);
            getMBinding().G.setVisibility(8);
            wc0 miuiActionBar = getMiuiActionBar();
            if (miuiActionBar != null && (endView3 = miuiActionBar.getEndView()) != null) {
                endView3.setVisibility(8);
            }
        } else {
            getMBinding().G.setText(getString(w0j.A, Integer.valueOf(this.dataList.size())));
            getMBinding().G.setVisibility(0);
            getMBinding().D.setVisibility(0);
            getMBinding().A.setVisibility(8);
            wc0 miuiActionBar2 = getMiuiActionBar();
            if (miuiActionBar2 != null && (endView2 = miuiActionBar2.getEndView()) != null) {
                endView2.setVisibility(0);
            }
            wc0 miuiActionBar3 = getMiuiActionBar();
            if (miuiActionBar3 != null && (endView = miuiActionBar3.getEndView()) != null) {
                endView.setContentDescription(getString(w0j.common_delete));
            }
        }
        wc0 miuiActionBar4 = getMiuiActionBar();
        if (miuiActionBar4 == null || (startView = miuiActionBar4.getStartView()) == null) {
            return;
        }
        startView.setContentDescription(getString(w0j.f37415a));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull svk svkVar) {
        RNProduct productByModel;
        Intrinsics.checkNotNullParameter(svkVar, "<this>");
        setTitleBackground(xji.f39189a);
        this.did = getIntent().getStringExtra("sDid");
        RNDeviceManager rNDeviceManagerExtKt = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE);
        String str = this.did;
        Intrinsics.checkNotNull(str);
        RNDeviceModel rNDeviceModel = (RNDeviceModel) rNDeviceManagerExtKt.getDeviceModel(str);
        if (rNDeviceModel != null) {
            try {
                productByModel = ProductExtKt.getInstance(RNProductManager.INSTANCE).getProductByModel(DeviceModelExtKt.getModel(rNDeviceModel));
            } catch (Exception e) {
                e.printStackTrace();
                productByModel = null;
            }
            if (productByModel != null) {
                setTitle(DeviceModelExtKt.getName(rNDeviceModel));
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("cancel_btn_res_id", coi.f5601b);
        bundle.putInt("save_btn_res_id", coi.f5600a);
        bundle.putInt("save_btn_cd", w0j.common_delete);
        IActionBar.DefaultImpls.applyEditModeActionBar$default(this, bundle, new Function1() { // from class: co6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareDetailActivity.bindView$lambda$3(this.f5594a, (View) obj);
            }
        }, new Function1() { // from class: do6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareDetailActivity.bindView$lambda$4(this.f15738a, (View) obj);
            }
        }, null, null, 24, null);
        svkVar.D.setLayoutManager(new LinearLayoutManager(this));
        this.dataList.clear();
        DeviceShareUserListAdapter deviceShareUserListAdapter = new DeviceShareUserListAdapter(this, this.dataList, new Function1() { // from class: eo6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareDetailActivity.bindView$lambda$8(this.f16870a, (UserListBean) obj);
            }
        });
        this.deviceShareUserListAdapter = deviceShareUserListAdapter;
        svkVar.D.setAdapter(deviceShareUserListAdapter);
        loadData();
        svkVar.E.setOnClickListener(new View.OnClickListener() { // from class: fo6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceShareDetailActivity.bindView$lambda$9(this.f17994a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return avi.f3489b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            loadData();
            setResult(-1);
        }
    }
}
