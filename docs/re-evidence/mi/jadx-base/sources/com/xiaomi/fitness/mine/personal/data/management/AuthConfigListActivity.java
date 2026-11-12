package com.xiaomi.fitness.mine.personal.data.management;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.mine.personal.data.management.AuthConfigListActivity;
import com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt;
import com.xiaomi.fitness.mine.personal.data.management.data.model.AppWrapper;
import com.xiaomi.fitness.mine.personal.data.management.recycler.AuthConfigListAdapter;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.util.MineUtil;
import defpackage.m0j;
import defpackage.q2g;
import defpackage.rui;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0006R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/AuthConfigListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/mine/personal/data/management/DataManagementViewModel;", "Lq2g;", "", "oneTrackSettingsDataManagerReview", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "onBackPressed", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter;", "authConfigListAdapter", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter;", "getAuthConfigListAdapter", "()Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter;", "setAuthConfigListAdapter", "(Lcom/xiaomi/fitness/mine/personal/data/management/recycler/AuthConfigListAdapter;)V", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AuthConfigListActivity extends Hilt_AuthConfigListActivity<DataManagementViewModel, q2g> {

    @NotNull
    public static final String TAG = "AuthConfigListActivity";
    public AuthConfigListAdapter authConfigListAdapter;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onResume$lambda$1(final AuthConfigListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MineUtil mineUtil = MineUtil.INSTANCE;
        if (mineUtil.isPlayChannel() || mineUtil.isGlobalRegion()) {
            this$0.getAuthConfigListAdapter().updateAuthConfigList(null);
        } else {
            ((DataManagementViewModel) this$0.getMViewModel()).getAuthConfigListLiveData(PersonalDataManagementExtKt.getCurtDeviceModelDid()).observe(this$0, new AuthConfigListActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: kq1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AuthConfigListActivity.onResume$lambda$1$lambda$0(this.f24156a, (List) obj);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1$lambda$0(AuthConfigListActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getAuthConfigListAdapter().updateAuthConfigList(list);
        return Unit.INSTANCE;
    }

    private final void oneTrackSettingsDataManagerReview() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36275"), TuplesKt.to("name", "profile_tab_page_button"), TuplesKt.to("btn_name", "profile_tab_page_tripartite_data_management")));
    }

    @NotNull
    public final AuthConfigListAdapter getAuthConfigListAdapter() {
        AuthConfigListAdapter authConfigListAdapter = this.authConfigListAdapter;
        if (authConfigListAdapter != null) {
            return authConfigListAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authConfigListAdapter");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return rui.u;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        oneTrackSettingsDataManagerReview();
        super.lambda$onCreate$0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.mine.personal.data.management.Hilt_AuthConfigListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(m0j.U);
        setAuthConfigListAdapter(new AuthConfigListAdapter(this));
        ((q2g) getMBinding()).B.setAdapter(getAuthConfigListAdapter());
        ((q2g) getMBinding()).B.setLayoutManager(new LinearLayoutManager(this));
        getAuthConfigListAdapter().setOnItemClickListener(new AuthConfigListAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.mine.personal.data.management.AuthConfigListActivity.onCreate.1
            /* JADX WARN: Type inference failed for: r12v26, types: [T, java.lang.String] */
            @Override // com.xiaomi.fitness.mine.personal.data.management.recycler.AuthConfigListAdapter.OnItemClickListener
            public void onItemClick(AppWrapper appWrapper) {
                int i;
                Intrinsics.checkNotNullParameter(appWrapper, "appWrapper");
                int authType = appWrapper.getAuthType();
                long appId = appWrapper.getApp().getAppId();
                String appName = appWrapper.getApp().getAppName();
                if (authType != 1) {
                    i = authType != 3 ? -1 : 1;
                } else {
                    i = 2;
                }
                Logger.d(AuthConfigListActivity.TAG, "AuthConfigListAdapter " + appWrapper.getApp());
                if (appWrapper.getApp().getJumpLink() != null) {
                    String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
                    HashMap map = new HashMap();
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = appWrapper.getApp().getJumpLink() + "&userId=" + userId + "&_locale=" + LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 2, null);
                    ScopeExtKt.scopeNet(Dispatchers.getIO(), new AuthConfigListActivity$onCreate$1$onItemClick$1(AuthConfigListActivity.this, map, objectRef, null));
                    return;
                }
                Integer thirdPartyType = appWrapper.getApp().getThirdPartyType();
                int iIntValue = thirdPartyType != null ? thirdPartyType.intValue() : 0;
                if (iIntValue > 0) {
                    Intent intent = new Intent(AuthConfigListActivity.this, (Class<?>) ThirdPartyAuthActivity.class);
                    intent.putExtra(PersonalDataManagementExtKt.PARAM_APP_ID, appId);
                    intent.putExtra(PersonalDataManagementExtKt.PARAM_APP_NAME, appName);
                    intent.putExtra(PersonalDataManagementExtKt.PARAM_TENANT_ID, appWrapper.getApp().getTenantId());
                    intent.putExtra(PersonalDataManagementExtKt.PARAM_THIRD_PARTY_TYPE, iIntValue);
                    AuthConfigListActivity.this.startActivity(intent);
                    return;
                }
                if (appId == -101) {
                    PersonalDataManagementExtKt.goToWechatShareHomepage(AuthConfigListActivity.this);
                    return;
                }
                if (appId == -102) {
                    PersonalDataManagementExtKt.goToAlipayShareHomepage(AuthConfigListActivity.this);
                    return;
                }
                if (appId == -103) {
                    PersonalDataManagementExtKt.goToZeppLifePage(AuthConfigListActivity.this);
                    return;
                }
                if (appId == -104) {
                    PersonalDataManagementExtKt.goToStravaPage(AuthConfigListActivity.this);
                    return;
                }
                if (appId == -105) {
                    PersonalDataManagementExtKt.goToGoogleFitPage(AuthConfigListActivity.this);
                    return;
                }
                if (appId == -106) {
                    PersonalDataManagementExtKt.goToSuuntoPage(AuthConfigListActivity.this);
                    return;
                }
                if (appId == -107) {
                    PersonalDataManagementExtKt.gotoHealthConnect(AuthConfigListActivity.this);
                    return;
                }
                if (authType == 1 || authType == 3) {
                    Intent intent2 = new Intent(AuthConfigListActivity.this, (Class<?>) AppSpecificDataManagementActivity.class);
                    intent2.putExtra(PersonalDataManagementExtKt.PARAM_APP_ID, appId);
                    intent2.putExtra(PersonalDataManagementExtKt.PARAM_APP_NAME, appName);
                    intent2.putExtra(PersonalDataManagementExtKt.PARAM_APP_AUTH_SCOPE_TYPE, i);
                    AuthConfigListActivity.this.startActivity(intent2);
                    return;
                }
                if (authType != 4) {
                    return;
                }
                Intent intent3 = new Intent(AuthConfigListActivity.this, (Class<?>) LabCollaborationManagementActivity.class);
                intent3.putExtra(PersonalDataManagementExtKt.PARAM_APP_ID, appId);
                intent3.putExtra(PersonalDataManagementExtKt.PARAM_APP_NAME, appName);
                AuthConfigListActivity.this.startActivity(intent3);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        TextView noNetwork = ((q2g) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
        RecyclerView recyclerView = ((q2g) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        NetworkFallbackExtKt.handleUnavailableNetworkAndShowFallbackPageIfNeed$default(noNetwork, recyclerView, null, new Function0() { // from class: jq1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AuthConfigListActivity.onResume$lambda$1(this.f23011a);
            }
        }, 4, null);
    }

    public final void setAuthConfigListAdapter(@NotNull AuthConfigListAdapter authConfigListAdapter) {
        Intrinsics.checkNotNullParameter(authConfigListAdapter, "<set-?>");
        this.authConfigListAdapter = authConfigListAdapter;
    }
}
