package com.huami.watchfacesstore.ui.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBinding;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.util.net.NetUtil;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ui.base.BaseFragment;
import com.huami.widget.toast.IconToast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0014J\u0006\u0010\u0015\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u0002H&J\b\u0010\u001a\u001a\u00020\u0019H&J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+¨\u00061"}, d2 = {"Lcom/huami/watchfacesstore/ui/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "showLoadingDialog", "hideLoadingDialog", "showNetworkError", "showDefaultError", "", "errorTipId", "showTipsView", "retryLoad", "resetViewStatus", "loadData", "initView", "Landroidx/viewbinding/ViewBinding;", "getViewBinding", "", "getContainerIds", "getErrorLayoutId", "onDestroy", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "a", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Landroid/view/View;", "mErrorContainer", "", "c", "Ljava/util/List;", "mContainer", "Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "Landroid/widget/TextView;", "mErrorTipsTv", "e", "mRefreshTv", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View mErrorContainer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<View> mContainer = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TextView mErrorTipsTv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private TextView mRefreshTv;

    private final void b() {
        int[] containerIds = getContainerIds();
        int length = containerIds.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                FragmentActivity activity = getActivity();
                View viewFindViewById = activity == null ? null : activity.findViewById(getErrorLayoutId());
                if (viewFindViewById == null) {
                    return;
                }
                this.mErrorContainer = viewFindViewById;
                this.mErrorTipsTv = (TextView) viewFindViewById.findViewById(R.id.error_tips_tv);
                View view = this.mErrorContainer;
                this.mRefreshTv = view != null ? (TextView) view.findViewById(R.id.refresh_tv) : null;
                return;
            }
            int i2 = containerIds[i];
            FragmentActivity activity2 = getActivity();
            View viewFindViewById2 = activity2 != null ? activity2.findViewById(i2) : null;
            if (viewFindViewById2 == null) {
                return;
            }
            this.mContainer.add(viewFindViewById2);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(BaseFragment baseFragment, View view) {
        baseFragment.retryLoad();
    }

    @NotNull
    public int[] getContainerIds() {
        return new int[]{R.id.layout_container};
    }

    public int getErrorLayoutId() {
        return R.id.error_container;
    }

    @NotNull
    public abstract ViewBinding getViewBinding();

    public final void hideLoadingDialog() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null && loadingDialog.isShowing()) {
            loadingDialog.dismiss();
            this.mLoadingDialog = null;
        }
    }

    public abstract void initView();

    public void loadData() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return getViewBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        hideLoadingDialog();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        b();
        initView();
    }

    public final void resetViewStatus() {
        Iterator<T> it2 = this.mContainer.iterator();
        while (it2.hasNext()) {
            ExtensionsKt.visible((View) it2.next());
        }
        View view = this.mErrorContainer;
        if (view == null) {
            return;
        }
        ExtensionsKt.gone(view);
    }

    public final void retryLoad() {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            loadData();
        } else {
            IconToast.showError(KoinExtKt.getAppContext(), R.string.wf_network_unconnected);
            showNetworkError();
        }
    }

    public final void showDefaultError() {
        showTipsView(R.string.wf_error_default);
    }

    public final void showLoadingDialog() {
        String string = getString(R.string.wf_page_loading);
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            this.mLoadingDialog = LoadingDialog.showDialog(getActivity(), string);
        } else {
            if (loadingDialog.isShowing()) {
                return;
            }
            loadingDialog.setCancelable(false);
            loadingDialog.setMessage(string);
            loadingDialog.show();
        }
    }

    public final void showNetworkError() {
        showTipsView(R.string.wf_network_unconnected);
    }

    public void showTipsView(@StringRes int errorTipId) {
        if (this.mContainer.isEmpty() || this.mErrorContainer == null) {
            return;
        }
        Iterator<T> it2 = this.mContainer.iterator();
        while (it2.hasNext()) {
            ExtensionsKt.gone((View) it2.next());
        }
        View view = this.mErrorContainer;
        if (view != null) {
            ExtensionsKt.visible(view);
        }
        TextView textView = this.mErrorTipsTv;
        if (textView != null) {
            textView.setText(errorTipId);
        }
        TextView textView2 = this.mRefreshTv;
        if (textView2 == null) {
            return;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: uq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseFragment.c(this.a, view2);
            }
        });
    }
}
