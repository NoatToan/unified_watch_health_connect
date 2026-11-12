package com.xiaomi.xms.wearable.ui.appshop.base;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseFragment;
import com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseViewModel;
import com.xiaomi.xms.wearable.ui.appshop.detail.ThirdAppDetailFragment;
import com.xiaomi.xms.wearable.ui.appshop.model.AppListItem;
import com.xiaomi.xms.wearable.ui.appshop.model.AppStatusInfo;
import defpackage.btr;
import defpackage.jtr;
import defpackage.sk5;
import defpackage.uoi;
import defpackage.wvi;
import defpackage.x1j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\b*\u0001?\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\bE\u0010\u000bJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u001b\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b$\u0010\tJ\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010\u000bR\u001a\u0010&\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/appshop/base/ThirdAppListBaseFragment;", "Lcom/xiaomi/xms/wearable/ui/appshop/base/ThirdAppListBaseViewModel;", "VM", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lbtr;", "", "loadStatus", "", "showErrorView", "(I)V", "hideErrorView", "()V", "", "text", "showToast", "(Ljava/lang/String;)V", "strRes", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppListItem;", "appListItem", "gotoDetailPage", "(Lcom/xiaomi/xms/wearable/ui/appshop/model/AppListItem;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onInitView", "", "isSupportLoadMore", "()Z", "setListener", "Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;", "statusInfo", "onAppStatusChanged", "(Lcom/xiaomi/xms/wearable/ui/appshop/model/AppStatusInfo;)V", "onLoadStatusChanged", "onDestroyView", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Ljtr;", "mErrorViewBinding", "Ljtr;", "getMErrorViewBinding", "()Ljtr;", "setMErrorViewBinding", "(Ljtr;)V", "Lcom/xiaomi/xms/wearable/ui/appshop/base/AppListAdapter;", "mAdapter", "Lcom/xiaomi/xms/wearable/ui/appshop/base/AppListAdapter;", "getMAdapter", "()Lcom/xiaomi/xms/wearable/ui/appshop/base/AppListAdapter;", "setMAdapter", "(Lcom/xiaomi/xms/wearable/ui/appshop/base/AppListAdapter;)V", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "com/xiaomi/xms/wearable/ui/appshop/base/ThirdAppListBaseFragment$onDeviceStatusListener$1", "onDeviceStatusListener", "Lcom/xiaomi/xms/wearable/ui/appshop/base/ThirdAppListBaseFragment$onDeviceStatusListener$1;", "getLayoutId", "()I", "layoutId", "<init>", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nThirdAppListBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdAppListBaseFragment.kt\ncom/xiaomi/xms/wearable/ui/appshop/base/ThirdAppListBaseFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,241:1\n1#2:242\n*E\n"})
public abstract class ThirdAppListBaseFragment<VM extends ThirdAppListBaseViewModel<?>> extends BaseBindingFragment<VM, btr> {

    @NotNull
    private final String TAG;
    public Gson gson;

    @Nullable
    private AppListAdapter mAdapter;

    @Nullable
    private jtr mErrorViewBinding;

    @NotNull
    private final ThirdAppListBaseFragment$onDeviceStatusListener$1 onDeviceStatusListener;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseFragment$onDeviceStatusListener$1] */
    public ThirdAppListBaseFragment() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.TAG = simpleName;
        this.onDeviceStatusListener = new OnDeviceStatusListener(this) { // from class: com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseFragment$onDeviceStatusListener$1
            final /* synthetic */ ThirdAppListBaseFragment<VM> this$0;

            {
                this.this$0 = this;
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                ThirdAppListBaseFragment.access$getMViewModel(this.this$0).loadDataLists();
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ThirdAppListBaseViewModel access$getMViewModel(ThirdAppListBaseFragment thirdAppListBaseFragment) {
        return (ThirdAppListBaseViewModel) thirdAppListBaseFragment.getMViewModel();
    }

    private final void gotoDetailPage(AppListItem appListItem) {
        Bundle bundle = new Bundle();
        bundle.putString(ThirdAppDetailFragment.EXTRA_APP_INFO, getGson().toJson(appListItem));
        Unit unit = Unit.INSTANCE;
        BaseFragmentExKt.gotoPage(this, ThirdAppDetailFragment.class, bundle);
    }

    private final void hideErrorView() {
        View root;
        jtr jtrVar = this.mErrorViewBinding;
        if (jtrVar == null || (root = jtrVar.getRoot()) == null) {
            return;
        }
        root.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$0(ThirdAppListBaseFragment this$0, AppListItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.gotoDetailPage(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setListener$lambda$1(ThirdAppListBaseFragment this$0, AppListItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ((ThirdAppListBaseViewModel) this$0.getMViewModel()).onItemBtnClicked(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(ThirdAppListBaseFragment this$0, AppStatusInfo appStatusInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (appStatusInfo != null) {
            this$0.onAppStatusChanged(appStatusInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(ThirdAppListBaseFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null) {
            this$0.onLoadStatusChanged(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(ThirdAppListBaseFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AppListAdapter appListAdapter = this$0.mAdapter;
        if (appListAdapter != null) {
            appListAdapter.update(false, it);
        }
        if (!it.isEmpty()) {
            this$0.hideErrorView();
        } else {
            this$0.onLoadStatusChanged(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(ThirdAppListBaseFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AppListAdapter appListAdapter = this$0.mAdapter;
        if (appListAdapter != null) {
            appListAdapter.update(true, it);
        }
    }

    private final void showErrorView(final int loadStatus) {
        String string;
        if (!getMBinding().A.i()) {
            getMBinding().A.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: cap
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view) {
                    ThirdAppListBaseFragment.showErrorView$lambda$8(this.f5135a, loadStatus, viewStub, view);
                }
            });
            ViewStub viewStubH = getMBinding().A.h();
            if (viewStubH != null) {
                viewStubH.inflate();
            }
        }
        jtr jtrVar = this.mErrorViewBinding;
        if (jtrVar != null) {
            jtrVar.getRoot().setVisibility(0);
            jtrVar.A.setImageResource(loadStatus == 1 ? uoi.c : uoi.f35970a);
            if (loadStatus == 1) {
                string = getString(x1j.common_hint_network_unavailable);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                string = getString(x1j.j);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            jtrVar.B.setText(string);
            jtrVar.B.setContentDescription(string);
            jtrVar.A.setContentDescription(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showErrorView$lambda$8(ThirdAppListBaseFragment this$0, int i, ViewStub viewStub, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.TAG, "onErrorView inflated " + i);
        this$0.mErrorViewBinding = (jtr) sk5.c(view);
        this$0.showErrorView(i);
    }

    private final void showToast(String text) {
        Logger.d(this.TAG, "showToast " + isVisible());
        if (isVisible()) {
            ToastUtil.showToast(text);
        }
    }

    @NotNull
    public final Gson getGson() {
        Gson gson = this.gson;
        if (gson != null) {
            return gson;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gson");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return wvi.d;
    }

    @Nullable
    public final AppListAdapter getMAdapter() {
        return this.mAdapter;
    }

    @Nullable
    public final jtr getMErrorViewBinding() {
        return this.mErrorViewBinding;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public abstract boolean isSupportLoadMore();

    public void onAppStatusChanged(@NotNull AppStatusInfo statusInfo) {
        String string;
        Intrinsics.checkNotNullParameter(statusInfo, "statusInfo");
        AppListAdapter appListAdapter = this.mAdapter;
        if (appListAdapter != null) {
            appListAdapter.onAppStatusChanged(statusInfo);
        }
        int status = statusInfo.getStatus();
        if (status == 6 || status == 9 || status == 12) {
            if (statusInfo.getErrMsg() != null) {
                string = statusInfo.getErrMsg();
                Intrinsics.checkNotNull(string);
            } else {
                string = getString(x1j.common_hint_unkonwn_error);
                Intrinsics.checkNotNull(string);
            }
            showToast(string);
            return;
        }
        if (status == 18) {
            showToast(x1j.E);
            return;
        }
        if (status == 15) {
            showToast(x1j.u);
            return;
        }
        if (status != 16) {
            return;
        }
        Logger.e(this.TAG, "onAppStatusChanged action failed:" + statusInfo);
        showToast(x1j.common_hint_unkonwn_error);
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.onDeviceStatusListener);
    }

    public final void onInitView() {
    }

    public void onLoadStatusChanged(int loadStatus) {
        boolean zIsSupportLoadMore = isSupportLoadMore();
        switch (loadStatus) {
            case 0:
                getMBinding().B.setStatus(Status.LOADING, zIsSupportLoadMore);
                getMBinding().B.setVisibility(0);
                break;
            case 1:
                getMBinding().B.setVisibility(8);
                showToast(x1j.common_hint_network_unavailable);
                showErrorView(loadStatus);
                break;
            case 2:
                getMBinding().B.setVisibility(0);
                getMBinding().B.setStatus(Status.FAIL, zIsSupportLoadMore);
                break;
            case 3:
                getMBinding().B.setVisibility(0);
                getMBinding().B.setStatus(Status.MORE, zIsSupportLoadMore);
                break;
            case 4:
                getMBinding().B.setVisibility(0);
                getMBinding().B.setStatus(Status.DONE, zIsSupportLoadMore);
                break;
            case 5:
                getMBinding().B.setVisibility(8);
                showErrorView(loadStatus);
                break;
            case 6:
                getMBinding().B.setVisibility(0);
                hideErrorView();
                break;
            default:
                getMBinding().B.setVisibility(0);
                Logger.e(this.TAG, "received unknown loadStatus:" + loadStatus);
                break;
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        getMBinding().B.setEnableMore(isSupportLoadMore());
        getMBinding().B.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        getMBinding().B.setAdapter(this.mAdapter);
        onInitView();
        getMViewModel().loadDataLists();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.onDeviceStatusListener);
    }

    public final void setGson(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "<set-?>");
        this.gson = gson;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        AppListAdapter appListAdapter = new AppListAdapter();
        this.mAdapter = appListAdapter;
        appListAdapter.setOnItemClickListener(new Function1() { // from class: dap
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThirdAppListBaseFragment.setListener$lambda$0(this.f15322a, (AppListItem) obj);
            }
        });
        AppListAdapter appListAdapter2 = this.mAdapter;
        if (appListAdapter2 != null) {
            appListAdapter2.setOnItemBtnClickListener(new Function1() { // from class: eap
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return ThirdAppListBaseFragment.setListener$lambda$1(this.f16452a, (AppListItem) obj);
                }
            });
        }
        getMViewModel().observerAppStatus(this, new Observer() { // from class: fap
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ThirdAppListBaseFragment.setListener$lambda$3(this.f17609a, (AppStatusInfo) obj);
            }
        });
        getMViewModel().observerLoadStatus(this, new Observer() { // from class: gap
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ThirdAppListBaseFragment.setListener$lambda$5(this.f18789a, (Integer) obj);
            }
        });
        if (isSupportLoadMore()) {
            getMBinding().B.setLoadListener(new MoreRecyclerView.LoadListener(this) { // from class: com.xiaomi.xms.wearable.ui.appshop.base.ThirdAppListBaseFragment.setListener.5
                final /* synthetic */ ThirdAppListBaseFragment<VM> this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
                public void loadMore() {
                    ThirdAppListBaseFragment.access$getMViewModel(this.this$0).loadMore();
                }
            });
        }
        getMViewModel().observerAllAppList(this, new Observer() { // from class: hap
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ThirdAppListBaseFragment.setListener$lambda$6(this.f19892a, (List) obj);
            }
        });
        getMViewModel().observerAllAppListMore(this, new Observer() { // from class: iap
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ThirdAppListBaseFragment.setListener$lambda$7(this.f20953a, (List) obj);
            }
        });
    }

    public final void setMAdapter(@Nullable AppListAdapter appListAdapter) {
        this.mAdapter = appListAdapter;
    }

    public final void setMErrorViewBinding(@Nullable jtr jtrVar) {
        this.mErrorViewBinding = jtrVar;
    }

    private final void showToast(int strRes) {
        Logger.d(this.TAG, "showToast " + isVisible());
        if (isVisible()) {
            ToastUtil.INSTANCE.showToast(strRes);
        }
    }
}
