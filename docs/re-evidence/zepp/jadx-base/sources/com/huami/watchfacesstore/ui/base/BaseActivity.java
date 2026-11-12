package com.huami.watchfacesstore.ui.base;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.util.net.NetUtil;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ui.base.BaseActivity;
import com.huami.widget.toast.IconToast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0015J\u0006\u0010\t\u001a\u00020\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0014J\u0006\u0010\r\u001a\u00020\u0002J\u001d\u0010\u0010\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\b\u0010\u0014\u001a\u00020\u0002H&J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0014R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020 0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/huami/watchfacesstore/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initTipsView", "e", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "showDefaultError", "", "errorTipId", "showTipsView", "resetViewStatus", ExifInterface.GPS_DIRECTION_TRUE, "data", "setData", "(Ljava/lang/Object;)V", "showLoadingDialog", "hideLoadingDialog", "initView", "loadData", "Landroidx/viewbinding/ViewBinding;", "getBinding", "", "getContainerIds", "getErrorLayoutId", "onDestroy", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "a", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Landroid/view/View;", "b", "Landroid/view/View;", "mErrorContainer", "", "c", "Ljava/util/List;", "mContainer", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "mErrorTipsTv", "mRefreshTv", "", "f", "Z", "checkNetwork", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseActivity extends AppCompatActivity {

    @NotNull
    public static final String KEY_CHECK_NET = "checkNetwork";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View mErrorContainer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TextView mErrorTipsTv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private TextView mRefreshTv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<View> mContainer = new ArrayList();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean checkNetwork = true;

    private final void d() {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            loadData();
        } else {
            IconToast.showError(this, R.string.wf_network_unconnected);
            e();
        }
    }

    private final void e() {
        showTipsView(R.string.wf_network_unconnected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BaseActivity baseActivity, View view) {
        baseActivity.d();
    }

    private final void initTipsView() {
        for (int i : getContainerIds()) {
            View viewFindViewById = findViewById(i);
            if (viewFindViewById == null) {
                return;
            }
            this.mContainer.add(viewFindViewById);
        }
        View viewFindViewById2 = findViewById(getErrorLayoutId());
        if (viewFindViewById2 == null) {
            return;
        }
        this.mErrorContainer = viewFindViewById2;
        this.mErrorTipsTv = (TextView) viewFindViewById2.findViewById(R.id.error_tips_tv);
        View view = this.mErrorContainer;
        this.mRefreshTv = view == null ? null : (TextView) view.findViewById(R.id.refresh_tv);
    }

    @NotNull
    public abstract ViewBinding getBinding();

    @NotNull
    public int[] getContainerIds() {
        return new int[]{R.id.layout_container};
    }

    public int getErrorLayoutId() {
        return R.id.error_container;
    }

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

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(1);
        setContentView(getBinding().getRoot());
        initView();
        initTipsView();
        Intent intent = getIntent();
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("checkNetwork", true) : true;
        this.checkNetwork = booleanExtra;
        if (!booleanExtra || NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            loadData();
        } else {
            e();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        hideLoadingDialog();
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

    @CallSuper
    public <T> void setData(T data) {
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

    public final void showDefaultError() {
        showTipsView(R.string.wf_error_default);
    }

    public final void showLoadingDialog() {
        String string = getString(R.string.wf_page_loading);
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog == null) {
            this.mLoadingDialog = LoadingDialog.showDialog(this, string);
        } else {
            if (loadingDialog.isShowing()) {
                return;
            }
            loadingDialog.setCancelable(true);
            loadingDialog.setMessage(string);
            loadingDialog.show();
        }
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
        textView2.setOnClickListener(new View.OnClickListener() { // from class: nn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseActivity.f(this.a, view2);
            }
        });
    }
}
