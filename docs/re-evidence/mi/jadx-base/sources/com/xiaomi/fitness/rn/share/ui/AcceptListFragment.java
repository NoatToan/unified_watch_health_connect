package com.xiaomi.fitness.rn.share.ui;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceManager;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.share.adapter.AcceptListAdapter;
import com.xiaomi.fitness.rn.share.bean.AcceptItemBean;
import com.xiaomi.fitness.rn.share.ui.AcceptListFragment;
import com.xiaomi.fitness.rn.share.utils.UtilsKt;
import com.xiaomi.fitness.rn.share.viewmodel.AcceptListViewModel;
import defpackage.avi;
import defpackage.ewk;
import defpackage.w0j;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\tJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/rn/share/ui/AcceptListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/rn/share/viewmodel/AcceptListViewModel;", "Lewk;", "", "resetUi", "(Lewk;)V", "bindView", "changeMode", "()V", "", "isDeleteMode", "()Z", "", "Lcom/xiaomi/fitness/rn/share/bean/AcceptItemBean;", "dataList", "Ljava/util/List;", "Lcom/xiaomi/fitness/rn/share/adapter/AcceptListAdapter;", "acceptListAdapter", "Lcom/xiaomi/fitness/rn/share/adapter/AcceptListAdapter;", "", "getLayoutId", "()I", "layoutId", "<init>", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AcceptListFragment extends BaseBindingFragment<AcceptListViewModel, ewk> {

    @Nullable
    private AcceptListAdapter acceptListAdapter;

    @NotNull
    private List<AcceptItemBean> dataList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$10(AcceptListFragment this$0, ewk this_bindView, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dataList.clear();
        this$0.dataList.addAll(it);
        AcceptListAdapter acceptListAdapter = this$0.acceptListAdapter;
        if (acceptListAdapter != null) {
            acceptListAdapter.notifyDataSetChanged();
        }
        this$0.resetUi(this_bindView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$11(int i, String str) {
        ToastUtil.INSTANCE.showToast(w0j.common_hint_unkonwn_error);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5(final AcceptListFragment this$0, final ewk this_bindView, final AcceptItemBean bean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(bean, "bean");
        String string = this$0.getString(w0j.o);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i = w0j.c;
        int i2 = w0j.f37416b;
        FragmentManager parentFragmentManager = this$0.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showMsgDialog((64 & 1) != 0 ? null : null, string, i, parentFragmentManager, (64 & 16) != 0 ? -1 : i2, (Function1<? super DialogInterface, Unit>) ((64 & 32) != 0 ? null : new Function1() { // from class: n20
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AcceptListFragment.bindView$lambda$5$lambda$4(bean, this$0, this_bindView, (DialogInterface) obj);
            }
        }), (Function1<? super DialogInterface, Unit>) ((64 & 64) != 0 ? null : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$5$lambda$4(final AcceptItemBean bean, final AcceptListFragment this$0, final ewk this_bindView, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(bean, "$bean");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        if (bean.isAccepted()) {
            PageState.DefaultImpls.showLoading$default(this$0, w0j.common_deleting, false, 2, null);
            ((AcceptListViewModel) this$0.getMViewModel()).cancel(bean.getDid(), new Function1() { // from class: u20
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AcceptListFragment.bindView$lambda$5$lambda$4$lambda$0(this.f35301a, bean, this_bindView, ((Boolean) obj).booleanValue());
                }
            }, new Function2() { // from class: v20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcceptListFragment.bindView$lambda$5$lambda$4$lambda$1(this.f36400a, ((Integer) obj).intValue(), (String) obj2);
                }
            });
        } else {
            PageState.DefaultImpls.showLoading$default(this$0, w0j.common_deleting, false, 2, null);
            ((AcceptListViewModel) this$0.getMViewModel()).accept(bean, false, new Function1() { // from class: w20
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AcceptListFragment.bindView$lambda$5$lambda$4$lambda$2(this.f37466a, bean, this_bindView, ((Boolean) obj).booleanValue());
                }
            }, new Function2() { // from class: x20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcceptListFragment.bindView$lambda$5$lambda$4$lambda$3(this.f38594a, ((Integer) obj).intValue(), (String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$4$lambda$0(AcceptListFragment this$0, AcceptItemBean bean, ewk this_bindView, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bean, "$bean");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ToastUtil.INSTANCE.showToast(w0j.common_delete_success);
        this$0.dismissDialogForce();
        this$0.dataList.remove(bean);
        AcceptListAdapter acceptListAdapter = this$0.acceptListAdapter;
        if (acceptListAdapter != null) {
            acceptListAdapter.notifyDataSetChanged();
        }
        this$0.resetUi(this_bindView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$4$lambda$1(AcceptListFragment this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastUtil.INSTANCE.showToast(w0j.common_delete_failure);
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$4$lambda$2(AcceptListFragment this$0, AcceptItemBean bean, ewk this_bindView, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bean, "$bean");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        this$0.dismissDialogForce();
        this$0.dataList.remove(bean);
        AcceptListAdapter acceptListAdapter = this$0.acceptListAdapter;
        if (acceptListAdapter != null) {
            acceptListAdapter.notifyDataSetChanged();
        }
        this$0.resetUi(this_bindView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5$lambda$4$lambda$3(AcceptListFragment this$0, int i, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit bindView$lambda$9(final AcceptListFragment this$0, final AcceptItemBean bean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bean, "bean");
        ((AcceptListViewModel) this$0.getMViewModel()).accept(bean, true, new Function1() { // from class: y20
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AcceptListFragment.bindView$lambda$9$lambda$7(bean, this$0, ((Boolean) obj).booleanValue());
            }
        }, new Function2() { // from class: o20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcceptListFragment.bindView$lambda$9$lambda$8(((Integer) obj).intValue(), (String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$9$lambda$7(AcceptItemBean bean, AcceptListFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(bean, "$bean");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bean.setStatus(1);
        AcceptListAdapter acceptListAdapter = this$0.acceptListAdapter;
        if (acceptListAdapter != null) {
            acceptListAdapter.notifyDataSetChanged();
        }
        ToastUtil.INSTANCE.showToast(w0j.j);
        DeviceManager.DefaultImpls.requestDeviceList$default(RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE), null, new Function1() { // from class: p20
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AcceptListFragment.bindView$lambda$9$lambda$7$lambda$6((ApiException) obj);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$9$lambda$7$lambda$6(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$9$lambda$8(int i, String str) {
        ToastUtil.INSTANCE.showToast(w0j.common_hint_unkonwn_error);
        return Unit.INSTANCE;
    }

    private final void resetUi(ewk ewkVar) {
        if (this.dataList.isEmpty()) {
            ewkVar.C.setVisibility(8);
            ewkVar.A.setVisibility(0);
        } else {
            ewkVar.C.setVisibility(0);
            ewkVar.A.setVisibility(8);
        }
        FragmentActivity mActivity = getMActivity();
        if (mActivity == null || !(mActivity instanceof DeviceShareActivity)) {
            return;
        }
        ((DeviceShareActivity) mActivity).setIsAcceptListEmpty(this.dataList.isEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final ewk ewkVar) {
        Intrinsics.checkNotNullParameter(ewkVar, "<this>");
        setActionBarDisplayable(false);
        ewkVar.C.setLayoutManager(new LinearLayoutManager(requireActivity()));
        this.dataList.clear();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        AcceptListAdapter acceptListAdapter = new AcceptListAdapter(fragmentActivityRequireActivity, this.dataList, new Function1() { // from class: q20
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AcceptListFragment.bindView$lambda$5(this.f31002a, ewkVar, (AcceptItemBean) obj);
            }
        }, new Function1() { // from class: r20
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AcceptListFragment.bindView$lambda$9(this.f32097a, (AcceptItemBean) obj);
            }
        });
        this.acceptListAdapter = acceptListAdapter;
        ewkVar.C.setAdapter(acceptListAdapter);
        ((AcceptListViewModel) getMViewModel()).loadAcceptList(new Function1() { // from class: s20
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AcceptListFragment.bindView$lambda$10(this.f33190a, ewkVar, (List) obj);
            }
        }, new Function2() { // from class: t20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AcceptListFragment.bindView$lambda$11(((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    public final void changeMode() {
        AcceptListAdapter acceptListAdapter = this.acceptListAdapter;
        if (acceptListAdapter != null) {
            boolean z = false;
            if (acceptListAdapter != null && acceptListAdapter.getIsEditMode()) {
                z = true;
            }
            acceptListAdapter.setEditMode(!z);
        }
        AcceptListAdapter acceptListAdapter2 = this.acceptListAdapter;
        if (acceptListAdapter2 != null) {
            acceptListAdapter2.notifyDataSetChanged();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return avi.h;
    }

    public final boolean isDeleteMode() {
        AcceptListAdapter acceptListAdapter = this.acceptListAdapter;
        return acceptListAdapter != null && acceptListAdapter.getIsEditMode();
    }
}
