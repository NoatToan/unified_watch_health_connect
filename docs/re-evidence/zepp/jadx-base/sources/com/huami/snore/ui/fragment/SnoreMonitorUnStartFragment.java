package com.huami.snore.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.snore.core.R;
import com.huami.snore.core.helper.PermissionHelper;
import com.huami.snore.ui.activity.SnoreListActivity;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.snore.ui.base.BaseSnoreMonitorFragment;
import com.huami.snore.ui.fragment.SnoreMonitorUnStartFragment;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J/\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/huami/snore/ui/fragment/SnoreMonitorUnStartFragment;", "Lcom/huami/snore/ui/base/BaseSnoreMonitorFragment;", "", "g", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "getContentView", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreMonitorUnStartFragment extends BaseSnoreMonitorFragment {
    private final void g() {
        ArrayList<String> needPermission = PermissionHelper.INSTANCE.getNeedPermission(getMActivity());
        if (!(!needPermission.isEmpty())) {
            getModel().getPageStateLiveData().setValue(SnoreMonitorActivity.PAGE_STARTED);
            return;
        }
        Object[] array = needPermission.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        requestPermissions((String[]) array, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SnoreMonitorUnStartFragment snoreMonitorUnStartFragment, View view) {
        snoreMonitorUnStartFragment.getModel().getPageStateLiveData().setValue("finish");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SnoreMonitorUnStartFragment snoreMonitorUnStartFragment, View view) {
        snoreMonitorUnStartFragment.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SnoreMonitorUnStartFragment snoreMonitorUnStartFragment, View view) {
        snoreMonitorUnStartFragment.getModel().getPageStateLiveData().setValue("finish");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SnoreMonitorUnStartFragment snoreMonitorUnStartFragment, View view) {
        SnoreListActivity.INSTANCE.navigation(snoreMonitorUnStartFragment.getMActivity(), new Date());
    }

    @Override // com.huami.snore.ui.base.BaseSnoreMonitorFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.snore.ui.base.BaseSnoreMonitorFragment
    @NotNull
    public View getContentView() {
        return LayoutInflater.from(getMActivity()).inflate(R.layout.fragment_snore_monitor_unstart_layout, (ViewGroup) null, false);
    }

    @Override // androidx.fragment.app.Fragment, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        if (PermissionHelper.INSTANCE.requestPermissionResult(grantResults)) {
            getModel().getPageStateLiveData().setValue(SnoreMonitorActivity.PAGE_STARTED);
        } else {
            Toast.makeText(getMActivity(), getResources().getString(R.string.snore_no_snore_permission_tip), 1).show();
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // com.huami.snore.ui.base.BaseSnoreMonitorFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.stop))).setOnClickListener(new View.OnClickListener() { // from class: w57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                SnoreMonitorUnStartFragment.h(this.a, view3);
            }
        });
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.start))).setOnClickListener(new View.OnClickListener() { // from class: x57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                SnoreMonitorUnStartFragment.i(this.a, view4);
            }
        });
        View view4 = getView();
        ((ImageView) (view4 == null ? null : view4.findViewById(R.id.back))).setOnClickListener(new View.OnClickListener() { // from class: v57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                SnoreMonitorUnStartFragment.j(this.a, view5);
            }
        });
        View view5 = getView();
        ((ImageView) (view5 != null ? view5.findViewById(R.id.report) : null)).setOnClickListener(new View.OnClickListener() { // from class: y57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                SnoreMonitorUnStartFragment.k(this.a, view6);
            }
        });
    }
}
