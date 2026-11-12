package com.mi.health.course.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.activity.CourseMeActivity;
import com.mi.health.course.adapter.CourseMeAdapter;
import com.mi.health.course.vm.CourseMeData;
import com.mi.health.course.vm.CourseMeVM;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.SystemProperties;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.czi;
import defpackage.ew1;
import defpackage.kyi;
import defpackage.sti;
import defpackage.wc0;
import defpackage.wq4;
import defpackage.xmi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00010B\u0007¢\u0006\u0004\b/\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0006R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u00061"}, d2 = {"Lcom/mi/health/course/activity/CourseMeActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/mi/health/course/vm/CourseMeVM;", "Lwq4;", "", "onSelectChange", "()V", "", "edit", "onEditModeChange", "(Z)V", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CourseMeData;", "it", "morePage", "onDataOK", "(Lcom/xiaomi/fitness/baseui/recyclerview/StateData;Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_STOP, "onBackPressed", "Landroidx/recyclerview/widget/GridLayoutManager;", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "Lcom/mi/health/course/adapter/CourseMeAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/mi/health/course/adapter/CourseMeAdapter;", "adapter", "", "tag$delegate", "getTag", "()Ljava/lang/String;", "tag", "", "startMills", "J", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseMeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseMeActivity.kt\ncom/mi/health/course/activity/CourseMeActivity\n+ 2 ExtUtils.kt\ncom/xiaomi/fitness/common/utils/ExtUtilsKt\n*L\n1#1,186:1\n47#2,7:187\n*S KotlinDebug\n*F\n+ 1 CourseMeActivity.kt\ncom/mi/health/course/activity/CourseMeActivity\n*L\n38#1:187,7\n*E\n"})
public final class CourseMeActivity extends Hilt_CourseMeActivity<CourseMeVM, wq4> {

    @NotNull
    public static final String TAG = "CourseMeActivity";

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ru4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseMeActivity.adapter_delegate$lambda$0(this.f32902a);
        }
    });

    @Nullable
    private GridLayoutManager gridLayoutManager;
    private long startMills;

    /* JADX INFO: renamed from: tag$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tag;

    public CourseMeActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = CourseCatalogActivityKt.KEY_COURSER_TAGS;
        this.tag = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<String>() { // from class: com.mi.health.course.activity.CourseMeActivity$special$$inlined$intent$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String str2;
                Bundle extras;
                Object obj;
                Intent intent = this.getIntent();
                if (intent == null || (extras = intent.getExtras()) == null) {
                    str2 = 0;
                } else {
                    obj = extras.get(str);
                }
                if (str2 != 0 && !(str2 instanceof String)) {
                    str2 = obj;
                    throw new RuntimeException("type not match");
                }
                str2 = obj;
                str2 = obj;
                return str2;
            }
        });
        this.startMills = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CourseMeVM access$getMViewModel(CourseMeActivity courseMeActivity) {
        return (CourseMeVM) courseMeActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CourseMeAdapter adapter_delegate$lambda$0(CourseMeActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new CourseMeAdapter(new CourseMeActivity$adapter$2$1(this$0));
    }

    private final CourseMeAdapter getAdapter() {
        return (CourseMeAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTag() {
        return (String) this.tag.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(CourseMeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getAdapter().selectAll(!view.isSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(CourseMeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$3(CourseMeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((CourseMeVM) this$0.getMViewModel()).delete(this$0.getAdapter().getSelectIds());
        this$0.getAdapter().resetSelectedIds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$4(CourseMeActivity this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = !((CourseMeData) stateData.f11668a).getFirstPage();
        Logger.d("CourseMeAcL", "state: " + stateData);
        if (!z) {
            this$0.dismissDialog();
        }
        if (stateData.g()) {
            if (z) {
                MoreRecyclerView.setStatus$default(((wq4) this$0.getMBinding()).B, Status.DONE, false, 2, null);
            } else {
                PageState.DefaultImpls.showEmpty$default(this$0, 0, 0, 3, null);
            }
        } else if (stateData.h()) {
            if (z) {
                MoreRecyclerView.setStatus$default(((wq4) this$0.getMBinding()).B, Status.FAIL, false, 2, null);
            } else {
                this$0.showError();
            }
        } else if (stateData.j()) {
            if (z) {
                MoreRecyclerView.setStatus$default(((wq4) this$0.getMBinding()).B, Status.FAIL, false, 2, null);
            } else {
                this$0.showNoNetwork();
            }
        } else if (stateData.k()) {
            Intrinsics.checkNotNull(stateData);
            this$0.onDataOK(stateData, z);
        } else if (stateData.i()) {
            if (z) {
                MoreRecyclerView.setStatus$default(((wq4) this$0.getMBinding()).B, Status.LOADING, false, 2, null);
            } else {
                String string = this$0.getString(czi.d);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                PageState.DefaultImpls.showLoading$default(this$0, string, 0, false, 6, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$5(CourseMeActivity this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (stateData.h()) {
            this$0.dismissDialog();
            ToastExtKt.toastShort(this$0, czi.common_delete_failure);
        } else if (stateData.i()) {
            PageState.DefaultImpls.showLoading$default(this$0, czi.common_deleting, false, 2, null);
        } else if (stateData.k()) {
            this$0.dismissDialog();
            ToastExtKt.toastShort(this$0, czi.common_delete_success);
            ((CourseMeVM) this$0.getMViewModel()).reqList(this$0.getTag(), true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(CourseMeActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bool);
        this$0.onEditModeChange(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOK(StateData<CourseMeData> it, boolean morePage) {
        if (!morePage) {
            dismissDialog();
        }
        showContent();
        MoreRecyclerView.setStatus$default(((wq4) getMBinding()).B, ((CourseMeVM) getMViewModel()).getHasMore() ? Status.MORE : Status.DONE, false, 2, null);
        getAdapter().addData(it.f11668a.getFeeds(), !morePage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onEditModeChange(boolean edit) {
        View root = ((wq4) getMBinding()).A.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ExtUtilsKt.setVisible(root, edit);
        wc0 miuiActionBar = getMiuiActionBar();
        View endView = miuiActionBar != null ? miuiActionBar.getEndView() : null;
        wc0 miuiActionBar2 = getMiuiActionBar();
        View startView = miuiActionBar2 != null ? miuiActionBar2.getStartView() : null;
        if (!edit) {
            setTitle(getString(czi.course_practised));
            if (endView != null) {
                endView.setVisibility(8);
            }
            if (startView != null) {
                startView.setBackgroundResource(xmi.l);
                return;
            }
            return;
        }
        if (endView != null) {
            endView.setVisibility(0);
            endView.setBackgroundResource(xmi.m);
            endView.setSelected(getAdapter().isAllChecked());
        }
        String quantityString = getResources().getQuantityString(kyi.common_selected_num, 1, 1);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        setTitle(quantityString);
        if (startView != null) {
            startView.setBackgroundResource(xmi.f39268a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectChange() {
        View endView;
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
            endView.setSelected(getAdapter().isAllChecked());
        }
        int selectedCount = getAdapter().getSelectedCount();
        String quantityString = getResources().getQuantityString(kyi.common_selected_num, selectedCount, Integer.valueOf(selectedCount));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        setTitle(quantityString);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.course_feed;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (getAdapter().getIsEditing()) {
            CourseMeAdapter.setEditMode$default(getAdapter(), false, false, 2, null);
        } else {
            super.lambda$onCreate$0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.Hilt_CourseMeActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        View endView;
        super.onCreate(savedInstanceState);
        setTitle(czi.course_practised);
        final boolean z = SystemProperties.INSTANCE.isFoldDisplay() && !SettingsPropertiesUtil.INSTANCE.isFolded(this);
        Logger.d(TAG, "onCreate isExpandedState=" + z);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.gridLayoutManager = gridLayoutManager;
        Intrinsics.checkNotNull(gridLayoutManager);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.mi.health.course.activity.CourseMeActivity.onCreate.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return z ? 1 : 2;
            }
        });
        ((wq4) getMBinding()).B.setLayoutManager(this.gridLayoutManager);
        IActionBar.DefaultImpls.setEndView$default(this, 0, xmi.m, null, new View.OnClickListener() { // from class: su4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseMeActivity.onCreate$lambda$1(this.f33989a, view);
            }
        }, 5, null);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
            ViewExtKt.gone(endView);
        }
        IActionBar.DefaultImpls.setStartView$default(this, 0, xmi.l, getString(czi.f14890a), new View.OnClickListener() { // from class: tu4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseMeActivity.onCreate$lambda$2(this.f35046a, view);
            }
        }, 1, null);
        hideBack();
        ((wq4) getMBinding()).A.getRoot().setOnClickListener(new View.OnClickListener() { // from class: uu4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseMeActivity.onCreate$lambda$3(this.f36143a, view);
            }
        });
        ((CourseMeVM) getMViewModel()).getViewStates().observe(this, new CourseMeActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vu4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseMeActivity.onCreate$lambda$4(this.f37229a, (StateData) obj);
            }
        }));
        ((CourseMeVM) getMViewModel()).getDeleteState().observe(this, new CourseMeActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wu4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseMeActivity.onCreate$lambda$5(this.f38355a, (StateData) obj);
            }
        }));
        getAdapter().getEditState().observe(this, new CourseMeActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xu4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseMeActivity.onCreate$lambda$6(this.f39470a, (Boolean) obj);
            }
        }));
        ((wq4) getMBinding()).B.setAdapter(getAdapter());
        ((wq4) getMBinding()).B.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.mi.health.course.activity.CourseMeActivity.onCreate.8
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                CourseMeVM.reqList$default(CourseMeActivity.access$getMViewModel(CourseMeActivity.this), CourseMeActivity.this.getTag(), false, 2, null);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.startMills = System.currentTimeMillis();
        ((CourseMeVM) getMViewModel()).reqList(getTag(), true);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.startMills) / ((long) 1000);
        Logger.d("CourseMeAcL", "onStop: my_course_list_page, " + jCurrentTimeMillis);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "my_course_list_page"), TuplesKt.to("duration_sec", Long.valueOf(jCurrentTimeMillis))));
    }
}
