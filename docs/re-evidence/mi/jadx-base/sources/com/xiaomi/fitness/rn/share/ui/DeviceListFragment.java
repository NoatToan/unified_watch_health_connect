package com.xiaomi.fitness.rn.share.ui;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.rn.share.adapter.DeviceListAdapter;
import com.xiaomi.fitness.rn.share.bean.DeviceBean;
import com.xiaomi.fitness.rn.share.ui.DeviceListFragment;
import com.xiaomi.fitness.rn.share.viewmodel.DeviceListViewModel;
import defpackage.avi;
import defpackage.gwk;
import defpackage.w0j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/rn/share/ui/DeviceListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/rn/share/viewmodel/DeviceListViewModel;", "Lgwk;", "", "loadList", "()V", "bindView", "(Lgwk;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "Lcom/xiaomi/fitness/rn/share/bean/DeviceBean;", "dataList", "Ljava/util/List;", "Lcom/xiaomi/fitness/rn/share/adapter/DeviceListAdapter;", "deviceListAdapter", "Lcom/xiaomi/fitness/rn/share/adapter/DeviceListAdapter;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceListFragment extends BaseBindingFragment<DeviceListViewModel, gwk> {
    public static final int sRequestCodeDetail = 10;

    @NotNull
    private List<DeviceBean> dataList = new ArrayList();

    @Nullable
    private DeviceListAdapter deviceListAdapter;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(DeviceListFragment this$0, DeviceBean bean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bean, "bean");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            Intent intent = new Intent(mActivity, (Class<?>) DeviceShareDetailActivity.class);
            intent.putExtra("sDid", bean.getDevice().getDid());
            intent.putExtra(DeviceShareDetailActivity.sModel, DeviceModelExtKt.getModel(bean.getDevice()));
            this$0.startActivityForResult(intent, 10);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadList() {
        ((DeviceListViewModel) getMViewModel()).loadDeviceList(new Function1() { // from class: v86
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceListFragment.loadList$lambda$2(this.f36608a, (List) obj);
            }
        }, new Function1() { // from class: w86
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceListFragment.loadList$lambda$3((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadList$lambda$2(DeviceListFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dataList.clear();
        this$0.dataList.addAll(it);
        DeviceListAdapter deviceListAdapter = this$0.deviceListAdapter;
        if (deviceListAdapter != null) {
            deviceListAdapter.notifyDataSetChanged();
        }
        if (this$0.dataList.isEmpty()) {
            this$0.getMBinding().C.setVisibility(8);
            this$0.getMBinding().A.setVisibility(0);
        } else {
            this$0.getMBinding().C.setVisibility(0);
            this$0.getMBinding().A.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadList$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ToastUtil.INSTANCE.showToast(w0j.common_hint_unkonwn_error);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull gwk gwkVar) {
        Intrinsics.checkNotNullParameter(gwkVar, "<this>");
        setActionBarDisplayable(false);
        gwkVar.C.setLayoutManager(new LinearLayoutManager(requireActivity()));
        this.dataList.clear();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        DeviceListAdapter deviceListAdapter = new DeviceListAdapter(fragmentActivityRequireActivity, this.dataList, new Function1() { // from class: u86
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceListFragment.bindView$lambda$1(this.f35514a, (DeviceBean) obj);
            }
        });
        this.deviceListAdapter = deviceListAdapter;
        gwkVar.C.setAdapter(deviceListAdapter);
        loadList();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return avi.i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
