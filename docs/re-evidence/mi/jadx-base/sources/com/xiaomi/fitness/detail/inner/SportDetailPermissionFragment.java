package com.xiaomi.fitness.detail.inner;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.MultiplePermissionsBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailPermissionFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.bfa;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.j1j;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailPermissionFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "", "updateViewWithPermission", "()V", "showLocationDialog", "showSettingDialog", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lbfa;", "mViewBinding", "Lbfa;", "", "getLocationPermissionList", "()[Ljava/lang/String;", "locationPermissionList", "getBaseLocationPermissionList", "baseLocationPermissionList", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailPermissionFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailPermissionFragment";
    private bfa mViewBinding;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailPermissionFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @Nullable FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag(SportDetailPermissionFragment.TAG, triathlonNum, sportType);
            int i = bsi.U4;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailPermissionFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    private final String[] getBaseLocationPermissionList() {
        return new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    }

    private final String[] getLocationPermissionList() {
        return Build.VERSION.SDK_INT >= 30 ? new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"} : new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(SportDetailPermissionFragment this$0, Button it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showLocationDialog();
        return Unit.INSTANCE;
    }

    private final void showLocationDialog() {
        new Function0() { // from class: thn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportDetailPermissionFragment.showLocationDialog$lambda$6(this.f34712a);
            }
        }.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationDialog$lambda$6(final SportDetailPermissionFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String[] locationPermissionList = this$0.getLocationPermissionList();
        PermissionExtKt.permissions$default(this$0, (String[]) Arrays.copyOf(locationPermissionList, locationPermissionList.length), (String[]) null, new Function1() { // from class: shn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailPermissionFragment.showLocationDialog$lambda$6$lambda$5(this.f33652a, (MultiplePermissionsBuilder) obj);
            }
        }, 2, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationDialog$lambda$6$lambda$5(final SportDetailPermissionFragment this$0, MultiplePermissionsBuilder permissions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permissions, "$this$permissions");
        permissions.allGranted(new Function0() { // from class: whn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportDetailPermissionFragment.showLocationDialog$lambda$6$lambda$5$lambda$1(this.f37986a);
            }
        });
        permissions.denied(new Function1() { // from class: xhn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailPermissionFragment.showLocationDialog$lambda$6$lambda$5$lambda$4(this.f39141a, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationDialog$lambda$6$lambda$5$lambda$1(SportDetailPermissionFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bfa bfaVar = this$0.mViewBinding;
        if (bfaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            bfaVar = null;
        }
        ConstraintLayout rootView = bfaVar.C;
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        ViewExtKt.gone(rootView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationDialog$lambda$6$lambda$5$lambda$4(final SportDetailPermissionFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.updateViewWithPermission();
        IPermissionManager instance = PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE);
        String str = (String) it.get(0);
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(instance, str, mActivity, it, null, new Function0() { // from class: uhn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportDetailPermissionFragment.showLocationDialog$lambda$6$lambda$5$lambda$4$lambda$2(this.f35767a);
            }
        }, new Function0() { // from class: vhn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportDetailPermissionFragment.showLocationDialog$lambda$6$lambda$5$lambda$4$lambda$3(this.f36908a);
            }
        }, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationDialog$lambda$6$lambda$5$lambda$4$lambda$2(SportDetailPermissionFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSettingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showLocationDialog$lambda$6$lambda$5$lambda$4$lambda$3(SportDetailPermissionFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSettingDialog();
        return Unit.INSTANCE;
    }

    private final void showSettingDialog() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", ApplicationExtKt.getApplication().getPackageName(), null));
        startForActivityResult(intent, new Function2() { // from class: rhn
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SportDetailPermissionFragment.showSettingDialog$lambda$8(this.f32553a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSettingDialog$lambda$8(SportDetailPermissionFragment this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateViewWithPermission();
        return Unit.INSTANCE;
    }

    private final void updateViewWithPermission() {
        Application application = ApplicationExtKt.getApplication();
        String[] locationPermissionList = getLocationPermissionList();
        bfa bfaVar = null;
        if (PermissionExtKt.isPermissionGranted(application, (String[]) Arrays.copyOf(locationPermissionList, locationPermissionList.length))) {
            bfa bfaVar2 = this.mViewBinding;
            if (bfaVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            } else {
                bfaVar = bfaVar2;
            }
            ConstraintLayout rootView = bfaVar.C;
            Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
            ViewExtKt.gone(rootView);
            return;
        }
        bfa bfaVar3 = this.mViewBinding;
        if (bfaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            bfaVar3 = null;
        }
        ConstraintLayout rootView2 = bfaVar3.C;
        Intrinsics.checkNotNullExpressionValue(rootView2, "rootView");
        ViewExtKt.visible(rootView2);
        bfa bfaVar4 = this.mViewBinding;
        if (bfaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
        } else {
            bfaVar = bfaVar4;
        }
        TextView textView = bfaVar.B;
        Application application2 = ApplicationExtKt.getApplication();
        String[] baseLocationPermissionList = getBaseLocationPermissionList();
        textView.setText(PermissionExtKt.isPermissionGranted(application2, (String[]) Arrays.copyOf(baseLocationPermissionList, baseLocationPermissionList.length)) ? getString(j1j.I9) : getString(j1j.J9));
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "position_permission";
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this.mViewBinding = bfa.A0(inflater, container, false);
        initParamsFromBundle(getArguments());
        bfa bfaVar = this.mViewBinding;
        if (bfaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            bfaVar = null;
        }
        View root = bfaVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        bfa bfaVar = this.mViewBinding;
        bfa bfaVar2 = null;
        if (bfaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            bfaVar = null;
        }
        bfaVar.D.bindData(hoi.W1, getString(j1j.H9));
        updateViewWithPermission();
        bfa bfaVar3 = this.mViewBinding;
        if (bfaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
        } else {
            bfaVar2 = bfaVar3;
        }
        ViewExtKt.clickWithTrigger$default(bfaVar2.A, 0L, new Function1() { // from class: qhn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailPermissionFragment.onViewCreated$lambda$0(this.f31529a, (Button) obj);
            }
        }, 1, null);
    }
}
