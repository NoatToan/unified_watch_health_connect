package com.mi.health.course.activity.eco;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.mi.health.course.activity.CourseInfoActivity;
import com.mi.health.course.activity.eco.EcoRoutingActivity;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.bj0;
import defpackage.sk5;
import defpackage.sti;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/mi/health/course/activity/eco/EcoRoutingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initData", "()V", "initView", "initListener", "Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;", PluginDeviceInfo.FICONOFF, "onDataOk", "(Lcom/mi/health/course/export/data/CourseModel$CourseDetailResult;)V", "observeViewModel", "Landroid/app/Application;", "context", "goEcoCourseInfoActivity", "(Landroid/app/Application;)V", "goCourseInfoActivity", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "model", "Ljava/lang/String;", "", "courseId", "J", "Lcom/mi/health/course/activity/eco/EcoRoutingActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/mi/health/course/activity/eco/EcoRoutingActivityViewModel;", "viewModel", "Lbj0;", "binding", "Lbj0;", "<init>", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoRoutingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoRoutingActivity.kt\ncom/mi/health/course/activity/eco/EcoRoutingActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,132:1\n75#2,13:133\n*S KotlinDebug\n*F\n+ 1 EcoRoutingActivity.kt\ncom/mi/health/course/activity/eco/EcoRoutingActivity\n*L\n31#1:133,13\n*E\n"})
public final class EcoRoutingActivity extends Hilt_EcoRoutingActivity {

    @NotNull
    public static final String KEY_COURSE_ID = "course_id";

    @NotNull
    private static final String TAG = "EcoRoutingActivity";
    private bj0 binding;
    private long courseId;
    private String model;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    public EcoRoutingActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(EcoRoutingActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.mi.health.course.activity.eco.EcoRoutingActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.mi.health.course.activity.eco.EcoRoutingActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.mi.health.course.activity.eco.EcoRoutingActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
    }

    private final EcoRoutingActivityViewModel getViewModel() {
        return (EcoRoutingActivityViewModel) this.viewModel.getValue();
    }

    private final void goCourseInfoActivity(Application context) {
        Intent intent = new Intent(context, (Class<?>) CourseInfoActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("course_id", this.courseId);
        context.startActivity(intent);
    }

    private final void goEcoCourseInfoActivity(Application context) {
        Intent intent = new Intent(context, (Class<?>) EcoCourseInfoActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("course_id", this.courseId);
        context.startActivity(intent);
    }

    private final void initData() {
        this.courseId = getIntent().getLongExtra("course_id", 0L);
    }

    private final void initListener() {
    }

    private final void initView() {
    }

    private final void observeViewModel() {
        getViewModel().getEmitter().observe(this, new EcoRoutingActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gw7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoRoutingActivity.observeViewModel$lambda$0(this.f19396a, (StateData) obj);
            }
        }));
        getViewModel().reqInfo(this.courseId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observeViewModel$lambda$0(EcoRoutingActivity this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (stateData.k()) {
            T data = stateData.f11668a;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            this$0.onDataOk((CourseModel.CourseDetailResult) data);
        } else if (stateData.g()) {
            this$0.model = "ksmb.treadmill.m1v1";
            SportManagerExportPreference.INSTANCE.setKEY_GYM_LOCAL_SPORT_TYPE("ksmb.treadmill.m1v1");
            this$0.goCourseInfoActivity(AppUtil.getApp());
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    private final void onDataOk(CourseModel.CourseDetailResult d) {
        String str;
        CourseConfigModel.DeviceLinkage deviceLinkage = d.allInfo.getDeviceLinkage();
        String str2 = null;
        Set<String> set = deviceLinkage != null ? deviceLinkage.models : null;
        String str3 = set != null ? (String) CollectionsKt___CollectionsKt.first(set) : null;
        if (str3 == null || str3.length() == 0) {
            str = "ksmb.treadmill.m1v1";
        } else {
            str = set != null ? (String) CollectionsKt___CollectionsKt.first(set) : null;
            Intrinsics.checkNotNull(str);
        }
        this.model = str;
        SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("model");
            str = null;
        }
        sportManagerExportPreference.setKEY_GYM_LOCAL_SPORT_TYPE(str);
        Application app = AppUtil.getApp();
        String str4 = this.model;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("model");
        } else {
            str2 = str4;
        }
        int iHashCode = str2.hashCode();
        if (iHashCode != -1798122615) {
            if (iHashCode != -1454035281) {
                if (iHashCode != 1396900280 || str2.equals("ksmb.treadmill.m1v1")) {
                    goCourseInfoActivity(app);
                }
            } else if (str2.equals("runmi.exbike.jscrm1")) {
                goEcoCourseInfoActivity(app);
            }
            goCourseInfoActivity(app);
        } else if (str2.equals("yesoul.exbike.jsc01y")) {
            goEcoCourseInfoActivity(app);
        } else {
            goCourseInfoActivity(app);
        }
        finish();
    }

    @Override // com.mi.health.course.activity.eco.Hilt_EcoRoutingActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        overridePendingTransition(0, 0);
        super.onCreate(savedInstanceState);
        bj0 bj0Var = (bj0) sk5.l(this, sti.f33974a);
        this.binding = bj0Var;
        bj0 bj0Var2 = null;
        if (bj0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bj0Var = null;
        }
        bj0Var.l0(this);
        bj0 bj0Var3 = this.binding;
        if (bj0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bj0Var2 = bj0Var3;
        }
        bj0Var2.A0(getViewModel());
        initData();
        initView();
        initListener();
        observeViewModel();
    }
}
