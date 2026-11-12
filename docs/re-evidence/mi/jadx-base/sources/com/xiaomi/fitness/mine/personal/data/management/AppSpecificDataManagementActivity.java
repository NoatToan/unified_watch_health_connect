package com.xiaomi.fitness.mine.personal.data.management;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.mine.personal.data.management.AppSpecificDataManagementActivity;
import com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt;
import com.xiaomi.fitness.mine.personal.data.management.data.model.Scope;
import com.xiaomi.fitness.mine.personal.data.management.recycler.SwitchListAdapter;
import com.xiaomi.onetrack.c.q;
import defpackage.kyf;
import defpackage.m0j;
import defpackage.rui;
import defpackage.vni;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00010B\t\b\u0007¢\u0006\u0004\b/\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J9\u0010\u000f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0006R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/AppSpecificDataManagementActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/mine/personal/data/management/DataManagementViewModel;", "Lkyf;", "", "setUpBackBtn", "()V", "requestDataFromNetwork", "confirmAndGoBack", "", "", "originalGrantedList", "curtGrantedList", "Lkotlin/Function0;", "onContentChange", "checkContentHasChangedAndProceedIfNeed", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "loadBundle", "setUpTitlesAndSubtitles", "setUpAdapter", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "onBackPressed", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/SwitchListAdapter;", "switchListAdapter", "Lcom/xiaomi/fitness/mine/personal/data/management/recycler/SwitchListAdapter;", "", q.f13858b, "J", "appName", "Ljava/lang/String;", "", "scopeType", "Ljava/lang/Integer;", "", "switchAllOnTextOnButton", "Z", "originalGrantedScopeList", "Ljava/util/List;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAppSpecificDataManagementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSpecificDataManagementActivity.kt\ncom/xiaomi/fitness/mine/personal/data/management/AppSpecificDataManagementActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n1863#2,2:172\n*S KotlinDebug\n*F\n+ 1 AppSpecificDataManagementActivity.kt\ncom/xiaomi/fitness/mine/personal/data/management/AppSpecificDataManagementActivity\n*L\n68#1:172,2\n*E\n"})
public final class AppSpecificDataManagementActivity extends Hilt_AppSpecificDataManagementActivity<DataManagementViewModel, kyf> {

    @NotNull
    public static final String TAG = "AppSpecificDataManagementActivity";
    private long appId;

    @Nullable
    private String appName;
    private SwitchListAdapter switchListAdapter;

    @Nullable
    private Integer scopeType = -1;
    private boolean switchAllOnTextOnButton = true;

    @NotNull
    private List<String> originalGrantedScopeList = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ kyf access$getMBinding(AppSpecificDataManagementActivity appSpecificDataManagementActivity) {
        return (kyf) appSpecificDataManagementActivity.getMBinding();
    }

    private final void checkContentHasChangedAndProceedIfNeed(List<String> originalGrantedList, List<String> curtGrantedList, Function0<Unit> onContentChange) {
        if (PersonalDataManagementExtKt.hasSameContent(originalGrantedList, curtGrantedList)) {
            finish();
        } else {
            onContentChange.invoke();
        }
    }

    private final void confirmAndGoBack() {
        NetworkFallbackExtKt.checkNetworkAndProcessIfAvailable(new Function0() { // from class: qh1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppSpecificDataManagementActivity.confirmAndGoBack$lambda$6(this.f31513a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit confirmAndGoBack$lambda$6(final AppSpecificDataManagementActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SwitchListAdapter switchListAdapter = this$0.switchListAdapter;
        if (switchListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchListAdapter");
            switchListAdapter = null;
        }
        final Pair<List<String>, List<String>> grantedAndRevokedScopeIdsPair = switchListAdapter.getGrantedAndRevokedScopeIdsPair();
        final List<String> first = grantedAndRevokedScopeIdsPair.getFirst();
        Logger.d(TAG, "newGrantedAndRevoked=" + grantedAndRevokedScopeIdsPair + " originalGrantedScopeList=" + this$0.originalGrantedScopeList);
        this$0.checkContentHasChangedAndProceedIfNeed(this$0.originalGrantedScopeList, first, new Function0() { // from class: oh1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppSpecificDataManagementActivity.confirmAndGoBack$lambda$6$lambda$5(grantedAndRevokedScopeIdsPair, first, this$0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit confirmAndGoBack$lambda$6$lambda$5(Pair newGrantedAndRevoked, List grantScopeIds, final AppSpecificDataManagementActivity this$0) {
        Intrinsics.checkNotNullParameter(newGrantedAndRevoked, "$newGrantedAndRevoked");
        Intrinsics.checkNotNullParameter(grantScopeIds, "$grantScopeIds");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<String> list = (List) newGrantedAndRevoked.getSecond();
        Logger.d(TAG, "confirmAndGoBack grantScopeIds=" + grantScopeIds + " revokeScopeIds=" + list);
        ((DataManagementViewModel) this$0.getMViewModel()).updateMiAppAuthScopeListLiveData(grantScopeIds, list, this$0.appId).observe(this$0, new AppSpecificDataManagementActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sh1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AppSpecificDataManagementActivity.confirmAndGoBack$lambda$6$lambda$5$lambda$4(this.f33628a, (Boolean) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit confirmAndGoBack$lambda$6$lambda$5$lambda$4(AppSpecificDataManagementActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            ToastExtKt.toastShort(this$0, m0j.m0);
        } else {
            ToastExtKt.toastShort(this$0, m0j.l0);
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    private final void loadBundle() {
        this.appId = getIntent().getLongExtra(PersonalDataManagementExtKt.PARAM_APP_ID, 0L);
        this.appName = getIntent().getStringExtra(PersonalDataManagementExtKt.PARAM_APP_NAME);
        Integer numValueOf = Integer.valueOf(getIntent().getIntExtra(PersonalDataManagementExtKt.PARAM_APP_AUTH_SCOPE_TYPE, -1));
        this.scopeType = numValueOf;
        if (numValueOf.intValue() == -1) {
            this.scopeType = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(AppSpecificDataManagementActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.requestDataFromNetwork();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestDataFromNetwork() {
        ((DataManagementViewModel) getMViewModel()).getMiAppAuthScopeListLiveData(this.appId, this.scopeType).observe(this, new AppSpecificDataManagementActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ph1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AppSpecificDataManagementActivity.requestDataFromNetwork$lambda$3(this.f30386a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestDataFromNetwork$lambda$3(AppSpecificDataManagementActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SwitchListAdapter switchListAdapter = this$0.switchListAdapter;
        if (switchListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchListAdapter");
            switchListAdapter = null;
        }
        switchListAdapter.updateScopeList(list);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Scope scope = (Scope) it.next();
                if (scope.getAuthStatus() == 1) {
                    ListExtKt.add(this$0.originalGrantedScopeList, scope.getScopeId());
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUpAdapter() {
        this.switchListAdapter = new SwitchListAdapter();
        RecyclerView recyclerView = ((kyf) getMBinding()).D;
        SwitchListAdapter switchListAdapter = this.switchListAdapter;
        SwitchListAdapter switchListAdapter2 = null;
        if (switchListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchListAdapter");
            switchListAdapter = null;
        }
        recyclerView.setAdapter(switchListAdapter);
        ViewExtKt.clickWithTrigger$default(((kyf) getMBinding()).E, 0L, new Function1() { // from class: nh1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AppSpecificDataManagementActivity.setUpAdapter$lambda$7(this.f27922a, (TextView) obj);
            }
        }, 1, null);
        SwitchListAdapter switchListAdapter3 = this.switchListAdapter;
        if (switchListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("switchListAdapter");
        } else {
            switchListAdapter2 = switchListAdapter3;
        }
        switchListAdapter2.setOnAllItemsCheckedListener(new SwitchListAdapter.OnItemsCheckCountListener() { // from class: com.xiaomi.fitness.mine.personal.data.management.AppSpecificDataManagementActivity.setUpAdapter.2
            @Override // com.xiaomi.fitness.mine.personal.data.management.recycler.SwitchListAdapter.OnItemsCheckCountListener
            public void onAllItemsChecked() {
                AppSpecificDataManagementActivity.access$getMBinding(AppSpecificDataManagementActivity.this).E.setText(m0j.e0);
                AppSpecificDataManagementActivity.this.switchAllOnTextOnButton = false;
            }

            @Override // com.xiaomi.fitness.mine.personal.data.management.recycler.SwitchListAdapter.OnItemsCheckCountListener
            public void onNotAllItemsChecked() {
                AppSpecificDataManagementActivity.access$getMBinding(AppSpecificDataManagementActivity.this).E.setText(m0j.f0);
                AppSpecificDataManagementActivity.this.switchAllOnTextOnButton = true;
            }
        });
        ((kyf) getMBinding()).D.setLayoutManager(new LinearLayoutManager(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setUpAdapter$lambda$7(AppSpecificDataManagementActivity this$0, TextView it) {
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        SwitchListAdapter switchListAdapter = null;
        if (this$0.switchAllOnTextOnButton) {
            SwitchListAdapter switchListAdapter2 = this$0.switchListAdapter;
            if (switchListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("switchListAdapter");
            } else {
                switchListAdapter = switchListAdapter2;
            }
            switchListAdapter.switchAllOn();
            ((kyf) this$0.getMBinding()).E.setText(m0j.e0);
            z = false;
        } else {
            SwitchListAdapter switchListAdapter3 = this$0.switchListAdapter;
            if (switchListAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("switchListAdapter");
            } else {
                switchListAdapter = switchListAdapter3;
            }
            switchListAdapter.switchAllOff();
            ((kyf) this$0.getMBinding()).E.setText(m0j.f0);
            z = true;
        }
        this$0.switchAllOnTextOnButton = z;
        return Unit.INSTANCE;
    }

    private final void setUpBackBtn() {
        hideBack();
        IActionBar.DefaultImpls.setStartView$default(this, 0, vni.c, getString(m0j.F0), new View.OnClickListener() { // from class: mh1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppSpecificDataManagementActivity.setUpBackBtn$lambda$0(this.f26171a, view);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpBackBtn$lambda$0(AppSpecificDataManagementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUpTitlesAndSubtitles() {
        String string;
        Integer num = this.scopeType;
        if (num != null && num.intValue() == 2) {
            string = getString(m0j.D0, this.appName);
        } else {
            Integer num2 = this.scopeType;
            string = (num2 != null && num2.intValue() == 1) ? getString(m0j.C0, this.appName) : "";
        }
        setTitle(this.appName);
        ((kyf) getMBinding()).B.setText(string);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    /* JADX INFO: renamed from: getLayoutId */
    public int getMContentLayoutId() {
        return rui.f;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        confirmAndGoBack();
        super.lambda$onCreate$0();
    }

    @Override // com.xiaomi.fitness.mine.personal.data.management.Hilt_AppSpecificDataManagementActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpBackBtn();
        loadBundle();
        setUpTitlesAndSubtitles();
        setUpAdapter();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        TextView noNetwork = ((kyf) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
        ConstraintLayout content = ((kyf) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        NetworkFallbackExtKt.handleUnavailableNetworkAndShowFallbackPageIfNeed$default(noNetwork, content, null, new Function0() { // from class: rh1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppSpecificDataManagementActivity.onResume$lambda$1(this.f32535a);
            }
        }, 4, null);
    }
}
