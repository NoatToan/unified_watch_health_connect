package com.xiaomi.xms.wearable.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.xms.wearable.bean.AppInfo;
import com.xiaomi.xms.wearable.ui.ThirdAppListFragment;
import defpackage.dih;
import defpackage.dtr;
import defpackage.jtr;
import defpackage.r8h;
import defpackage.sk5;
import defpackage.uoi;
import defpackage.wvi;
import defpackage.x1j;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\"\u0010\u000bJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000bJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/ThirdAppListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/xms/wearable/ui/ThirdAppListViewModel;", "Ldtr;", "", "Lcom/xiaomi/xms/wearable/bean/AppInfo;", "appInfoList", "", "onAppInfoChanged", "(Ljava/util/List;)V", "showEmptyView", "()V", "dismissEmptyView", "oneTrackSettingsAuthorizationManagementReview", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "Ljtr;", "mErrorViewBinding", "Ljtr;", "getMErrorViewBinding", "()Ljtr;", "setMErrorViewBinding", "(Ljtr;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "xmswearable_release"}, k = 1, mv = {2, 0, 0})
public final class ThirdAppListFragment extends BaseBindingFragment<ThirdAppListViewModel, dtr> {

    @Nullable
    private jtr mErrorViewBinding;

    private final void dismissEmptyView() {
        View root;
        jtr jtrVar = this.mErrorViewBinding;
        if (jtrVar == null || (root = jtrVar.getRoot()) == null) {
            return;
        }
        ViewExtKt.gone(root);
    }

    private final void onAppInfoChanged(List<AppInfo> appInfoList) {
        Logger.d("onChange", appInfoList.toString());
        if (appInfoList.isEmpty()) {
            showEmptyView();
            return;
        }
        dismissEmptyView();
        ThirdAppListAdapter thirdAppListAdapter = new ThirdAppListAdapter(appInfoList, new r8h() { // from class: pap
            @Override // defpackage.r8h
            public final void onItemClick(View view, int i) {
                ThirdAppListFragment.onAppInfoChanged$lambda$2(this.f30177a, view, i);
            }
        });
        getMBinding().B.setLayoutManager(new LinearLayoutManager(getActivity()));
        getMBinding().B.setAdapter(thirdAppListAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onAppInfoChanged$lambda$2(ThirdAppListFragment this$0, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<AppInfo> value = ((ThirdAppListViewModel) this$0.getMViewModel()).getAppInfo().getValue();
        AppInfo appInfo = value != null ? value.get(i) : null;
        if (appInfo != null) {
            Bundle bundle = new Bundle();
            bundle.putString(PermissionManagementFragment.KEY_PACKAGE_NAME, appInfo.getPackageName());
            dih.a().e(this$0.getActivity(), new FragmentParams.b().e(PermissionManagementFragment.class).c(bundle).b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(ThirdAppListFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.onAppInfoChanged(list);
        return Unit.INSTANCE;
    }

    private final void oneTrackSettingsAuthorizationManagementReview() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36275"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_device_authorization_management")));
    }

    private final void showEmptyView() {
        if (!getMBinding().A.i()) {
            getMBinding().A.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: oap
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub, View view) {
                    ThirdAppListFragment.showEmptyView$lambda$3(this.f28938a, viewStub, view);
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
            jtrVar.A.setImageResource(uoi.f35970a);
            jtrVar.B.setText(getString(x1j.j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showEmptyView$lambda$3(ThirdAppListFragment this$0, ViewStub viewStub, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mErrorViewBinding = (jtr) sk5.c(view);
        this$0.showEmptyView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return wvi.e;
    }

    @Nullable
    public final jtr getMErrorViewBinding() {
        return this.mErrorViewBinding;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        oneTrackSettingsAuthorizationManagementReview();
        return super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(x1j.D);
        ((ThirdAppListViewModel) getMViewModel()).getAppInfo().observe(getViewLifecycleOwner(), new ThirdAppListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qap
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThirdAppListFragment.onViewCreated$lambda$0(this.f31297a, (List) obj);
            }
        }));
        ((ThirdAppListViewModel) getMViewModel()).loadAppList();
    }

    public final void setMErrorViewBinding(@Nullable jtr jtrVar) {
        this.mErrorViewBinding = jtrVar;
    }
}
