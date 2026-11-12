package com.mi.health.course.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.mi.health.course.activity.CourseCatalogActivity;
import com.mi.health.course.adapter.CatalogTabAdapter;
import com.mi.health.course.adapter.CatalogTagAdapter;
import com.mi.health.course.adapter.CourseFeedAdapter;
import com.mi.health.course.data.CatalogGroup;
import com.mi.health.course.data.CourseCatalogResp;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.vm.CatalogFeed;
import com.mi.health.course.vm.CourseCatalogVM;
import com.mi.health.course.widget.NoNestScrollRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import defpackage.czi;
import defpackage.ew1;
import defpackage.oqi;
import defpackage.sti;
import defpackage.vp4;
import defpackage.xmi;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\bP\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ%\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0004H\u0014¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\u0004H\u0014¢\u0006\u0004\b*\u0010\u0006R\u001d\u0010.\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\tR\u001d\u00103\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u00108\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\tR\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010AR\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010L¨\u0006Q"}, d2 = {"Lcom/mi/health/course/activity/CourseCatalogActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/mi/health/course/vm/CourseCatalogVM;", "Lvp4;", "", "setLayoutManager", "()V", "", "getSourceKey", "()Ljava/lang/String;", "", "morePage", MedicalIdSPContract.PREF_FIRST, "onEmpty", "(ZZ)V", "onError", "onNoNet", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogFeed;", "it", "onDataOK", "(Lcom/xiaomi/fitness/baseui/recyclerview/StateData;Z)V", "", "Lcom/mi/health/course/data/CatalogGroup;", "groups", "setCatalogView", "(Ljava/util/List;)V", "onTagConfirmed", "showCatalog", "()Z", "setTabView", "setTagsView", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_STOP, "scene$delegate", "Lkotlin/Lazy;", "getScene", "scene", "", "type$delegate", "getType", "()[I", "type", "tags", "Ljava/lang/String;", "title$delegate", "getTitle", "title", "Lcom/mi/health/course/adapter/CourseFeedAdapter;", "courseFeedAdapter$delegate", "getCourseFeedAdapter", "()Lcom/mi/health/course/adapter/CourseFeedAdapter;", "courseFeedAdapter", "Landroid/widget/TextView;", "stateView", "Landroid/widget/TextView;", "Ljava/util/List;", "Lcom/mi/health/course/adapter/CatalogTagAdapter;", "tagsAdapter$delegate", "getTagsAdapter", "()Lcom/mi/health/course/adapter/CatalogTagAdapter;", "tagsAdapter", "", "startMills", "J", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseCatalogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseCatalogActivity.kt\ncom/mi/health/course/activity/CourseCatalogActivity\n+ 2 ExtUtils.kt\ncom/xiaomi/fitness/common/utils/ExtUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n47#2,7:299\n47#2,7:306\n47#2,7:313\n1863#3:320\n1863#3,2:321\n1864#3:323\n1863#3,2:325\n1#4:324\n*S KotlinDebug\n*F\n+ 1 CourseCatalogActivity.kt\ncom/mi/health/course/activity/CourseCatalogActivity\n*L\n46#1:299,7\n47#1:306,7\n49#1:313,7\n216#1:320\n218#1:321,2\n216#1:323\n206#1:325,2\n*E\n"})
public final class CourseCatalogActivity extends Hilt_CourseCatalogActivity<CourseCatalogVM, vp4> {

    /* JADX INFO: renamed from: courseFeedAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy courseFeedAdapter;

    @Nullable
    private List<CatalogGroup> groups;

    /* JADX INFO: renamed from: scene$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scene;
    private long startMills;
    private TextView stateView;

    @Nullable
    private String tags;

    /* JADX INFO: renamed from: tagsAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tagsAdapter;

    /* JADX INFO: renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy title;

    /* JADX INFO: renamed from: type$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy type;

    public CourseCatalogActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = CourseCatalogActivityKt.KEY_COURSER_SCENE;
        this.scene = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<String>() { // from class: com.mi.health.course.activity.CourseCatalogActivity$special$$inlined$intent$1
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
        final String str2 = CourseCatalogActivityKt.KEY_COURSER_TYPE;
        this.type = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<int[]>() { // from class: com.mi.health.course.activity.CourseCatalogActivity$special$$inlined$intent$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final int[] invoke() {
                int[] iArr;
                Bundle extras;
                Object obj;
                Intent intent = this.getIntent();
                if (intent == null || (extras = intent.getExtras()) == null) {
                    iArr = 0;
                } else {
                    obj = extras.get(str2);
                }
                if (iArr != 0 && !(iArr instanceof int[])) {
                    iArr = obj;
                    throw new RuntimeException("type not match");
                }
                iArr = obj;
                iArr = obj;
                return iArr;
            }
        });
        final String str3 = CourseCatalogActivityKt.KEY_COURSE_TITLE;
        this.title = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<String>() { // from class: com.mi.health.course.activity.CourseCatalogActivity$special$$inlined$intent$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String str4;
                Bundle extras;
                Object obj;
                Intent intent = this.getIntent();
                if (intent == null || (extras = intent.getExtras()) == null) {
                    str4 = 0;
                } else {
                    obj = extras.get(str3);
                }
                if (str4 != 0 && !(str4 instanceof String)) {
                    str4 = obj;
                    throw new RuntimeException("type not match");
                }
                str4 = obj;
                str4 = obj;
                return str4;
            }
        });
        this.courseFeedAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gp4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CourseCatalogActivity.courseFeedAdapter_delegate$lambda$0(this.f19203a);
            }
        });
        this.tagsAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hp4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CourseCatalogActivity.tagsAdapter_delegate$lambda$11();
            }
        });
        this.startMills = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CourseCatalogVM access$getMViewModel(CourseCatalogActivity courseCatalogActivity) {
        return (CourseCatalogVM) courseCatalogActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CourseFeedAdapter courseFeedAdapter_delegate$lambda$0(CourseCatalogActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new CourseFeedAdapter(this$0, this$0.getSourceKey());
    }

    private final CourseFeedAdapter getCourseFeedAdapter() {
        return (CourseFeedAdapter) this.courseFeedAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getScene() {
        return (String) this.scene.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x00af A[RETURN, SYNTHETIC] */
    private final String getSourceKey() {
        Logger.d(BaseBindingActivity.TAG, "getSourceKey: scene = " + getScene());
        String scene = getScene();
        if (scene == null || scene.length() == 0) {
            return "all_course_list_page";
        }
        String scene2 = getScene();
        Intrinsics.checkNotNull(scene2);
        String str = (String) CollectionsKt___CollectionsKt.first(StringsKt__StringsKt.split$default((CharSequence) scene2, new String[]{":"}, false, 0, 6, (Object) null));
        Logger.d(BaseBindingActivity.TAG, "getSourceKey: page = " + str);
        switch (str) {
            case "audio_stamina_increase":
                return "audio_stamina_increase_list_page";
            case "sub_sport_tab_outdoor_biking":
                return "outdoor_biking_course_list_page";
            case "sub_sport_tab_outdoor_run":
                return "outdoor_run_course_list_page";
            case "sub_sport_tab_indoor_run":
                return "indoor_run_course_list_page";
            case "sub_sport_tab_outdoor_walk":
                return "outdoor_walk_course_list_page";
            case "audio_easy_walk":
                return "audio_easy_walk_list_page";
            case "audio_burn_fat":
                return "audio_burn_fat_list_page";
            default:
                return "";
        }
    }

    private final CatalogTagAdapter getTagsAdapter() {
        return (CatalogTagAdapter) this.tagsAdapter.getValue();
    }

    private final String getTitle() {
        return (String) this.title.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] getType() {
        return (int[]) this.type.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$2(CourseCatalogActivity this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        boolean z = !((CatalogFeed) stateData.f11668a).getFirstPage();
        boolean firstTotalPage = ((CatalogFeed) stateData.f11668a).getFirstTotalPage();
        if (stateData.g()) {
            this$0.onEmpty(z, firstTotalPage);
        } else if (stateData.h()) {
            this$0.onError(z, firstTotalPage);
        } else if (stateData.j()) {
            this$0.onNoNet(z, firstTotalPage);
        } else if (stateData.k()) {
            Intrinsics.checkNotNull(stateData);
            this$0.onDataOK(stateData, z);
        } else if (stateData.i()) {
            if (z) {
                MoreRecyclerView.setStatus$default(((vp4) this$0.getMBinding()).C, Status.LOADING, false, 2, null);
            } else {
                String string = this$0.getString(czi.d);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                PageState.DefaultImpls.showLoading$default(this$0, string, 0, false, 6, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOK(StateData<CatalogFeed> it, boolean morePage) {
        if (!morePage) {
            dismissDialog();
            if (it.f11668a.getFirstTotalPage()) {
                setCatalogView(it.f11668a.getCatalogGroup());
            }
        }
        TextView textView = this.stateView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView = null;
        }
        ViewExtKt.gone(textView);
        MoreRecyclerView recyclerView = ((vp4) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ViewExtKt.visible(recyclerView);
        MoreRecyclerView.setStatus$default(((vp4) getMBinding()).C, ((CourseCatalogVM) getMViewModel()).getHasMore() ? Status.MORE : Status.DONE, false, 2, null);
        getCourseFeedAdapter().addData(it.f11668a.getFeeds(), !morePage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onEmpty(boolean morePage, boolean first) {
        TextView textView = null;
        if (morePage) {
            MoreRecyclerView.setStatus$default(((vp4) getMBinding()).C, Status.DONE, false, 2, null);
            return;
        }
        if (first) {
            PageState.DefaultImpls.showEmpty$default(this, 0, 0, 3, null);
            return;
        }
        TextView textView2 = this.stateView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView2 = null;
        }
        ViewExtKt.visible(textView2);
        TextView textView3 = this.stateView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView3 = null;
        }
        textView3.setText(getString(czi.common_data_empty));
        TextView textView4 = this.stateView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
        } else {
            textView = textView4;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, xmi.e, 0, 0);
        MoreRecyclerView recyclerView = ((vp4) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ViewExtKt.gone(recyclerView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onError(boolean morePage, boolean first) {
        TextView textView = null;
        if (morePage) {
            MoreRecyclerView.setStatus$default(((vp4) getMBinding()).C, Status.FAIL, false, 2, null);
            return;
        }
        if (first) {
            showError();
            return;
        }
        TextView textView2 = this.stateView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView2 = null;
        }
        ViewExtKt.visible(textView2);
        TextView textView3 = this.stateView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView3 = null;
        }
        textView3.setText(getString(czi.common_hint_unkonwn_error));
        TextView textView4 = this.stateView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
        } else {
            textView = textView4;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, xmi.e, 0, 0);
        MoreRecyclerView recyclerView = ((vp4) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ViewExtKt.gone(recyclerView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNoNet(boolean morePage, boolean first) {
        TextView textView = null;
        if (morePage) {
            MoreRecyclerView.setStatus$default(((vp4) getMBinding()).C, Status.FAIL, false, 2, null);
            return;
        }
        if (first) {
            showNoNetwork();
            return;
        }
        TextView textView2 = this.stateView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView2 = null;
        }
        ViewExtKt.visible(textView2);
        TextView textView3 = this.stateView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView3 = null;
        }
        textView3.setText(getString(czi.common_hint_network_unavailable));
        TextView textView4 = this.stateView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
        } else {
            textView = textView4;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, xmi.d, 0, 0);
        MoreRecyclerView recyclerView = ((vp4) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ViewExtKt.gone(recyclerView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onTagConfirmed(List<CatalogGroup> groups) {
        String str;
        ConstraintLayout selectView = ((vp4) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(selectView, "selectView");
        ViewExtKt.gone(selectView);
        RecyclerView.Adapter adapter = ((vp4) getMBinding()).G.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.mi.health.course.adapter.CatalogTabAdapter");
        ((CatalogTabAdapter) adapter).clearState();
        StringBuilder sb = new StringBuilder();
        for (CatalogGroup catalogGroup : groups) {
            StringBuilder sb2 = new StringBuilder();
            List<CourseCatalogResp.Catalog> tags = catalogGroup.getTags();
            if (tags != null) {
                for (CourseCatalogResp.Catalog catalog : tags) {
                    if (catalog.selected && (str = catalog.tag) != null && str.length() != 0) {
                        sb2.append(catalog.tag);
                        sb2.append(",");
                    }
                }
            }
            if (sb2.length() > 0) {
                sb.append(StringsKt__StringsKt.removeSuffix(sb2, ","));
                sb.append(";");
            }
        }
        String string = StringsKt__StringsKt.removeSuffix(sb, ";").toString();
        Logger.d(BaseBindingActivity.TAG, "setCatalogView: new tags = " + string + ", pre = " + this.tags);
        if (Intrinsics.areEqual(string, this.tags)) {
            return;
        }
        this.tags = string;
        ((CourseCatalogVM) getMViewModel()).reqList(getScene(), getType(), this.tags, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NotifyDataSetChanged"})
    private final void setCatalogView(final List<CatalogGroup> groups) {
        List<CatalogGroup> list;
        if (!showCatalog() || (list = groups) == null || list.isEmpty()) {
            NoNestScrollRecyclerView tabView = ((vp4) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(tabView, "tabView");
            ViewExtKt.gone(tabView);
            return;
        }
        NoNestScrollRecyclerView tabView2 = ((vp4) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(tabView2, "tabView");
        ViewExtKt.visible(tabView2);
        this.groups = groups;
        ((vp4) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: ip4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseCatalogActivity.setCatalogView$lambda$3(this.f21967a, groups, view);
            }
        });
        setTabView(groups);
        setTagsView();
        ((vp4) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: jp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseCatalogActivity.setCatalogView$lambda$6(groups, this, view);
            }
        });
        ((vp4) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: kp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseCatalogActivity.setCatalogView$lambda$7(this.f24125a, groups, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCatalogView$lambda$3(CourseCatalogActivity this$0, List list, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTagConfirmed(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCatalogView$lambda$6(List list, CourseCatalogActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<CourseCatalogResp.Catalog> tags = ((CatalogGroup) it.next()).getTags();
            if (tags != null) {
                Iterator<T> it2 = tags.iterator();
                while (it2.hasNext()) {
                    ((CourseCatalogResp.Catalog) it2.next()).selected = false;
                }
            }
        }
        this$0.getTagsAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCatalogView$lambda$7(CourseCatalogActivity this$0, List list, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTagConfirmed(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLayoutManager() {
        int i;
        int screenState = UIUtils.INSTANCE.getScreenState();
        if (screenState != 0) {
            i = 1;
            if (screenState == 1) {
                i = 2;
            }
        } else {
            i = 3;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, i);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.mi.health.course.activity.CourseCatalogActivity$setLayoutManager$layoutManager$1$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        ((vp4) getMBinding()).C.setLayoutManager(gridLayoutManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTabView(final List<CatalogGroup> groups) {
        NoNestScrollRecyclerView tabView = ((vp4) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(tabView, "tabView");
        tabView.setAdapter(new CatalogTabAdapter(groups, new Function1() { // from class: lp4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseCatalogActivity.setTabView$lambda$10(this.f25289a, groups, ((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setTabView$lambda$10(CourseCatalogActivity this$0, List groups, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(groups, "$groups");
        this$0.getTagsAdapter().setData(((CatalogGroup) groups.get(i)).getTags());
        ConstraintLayout selectView = ((vp4) this$0.getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(selectView, "selectView");
        if (!ExtUtilsKt.isVisible(selectView)) {
            ConstraintLayout selectView2 = ((vp4) this$0.getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(selectView2, "selectView");
            ViewExtKt.visible(selectView2);
        }
        Logger.d(BaseBindingActivity.TAG, "setTabView: " + i);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTagsView() {
        NoNestScrollRecyclerView tagsView = ((vp4) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(tagsView, "tagsView");
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        flexboxLayoutManager.T(1);
        flexboxLayoutManager.U(0);
        tagsView.setLayoutManager(flexboxLayoutManager);
        tagsView.setAdapter(getTagsAdapter());
    }

    private final boolean showCatalog() {
        String scene;
        return Intrinsics.areEqual(getScene(), CourseApiKt.COURSE_PAGE_ALL) || (scene = getScene()) == null || scene.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CatalogTagAdapter tagsAdapter_delegate$lambda$11() {
        return new CatalogTagAdapter();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.course_catalog_feed;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        ConstraintLayout selectView = ((vp4) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(selectView, "selectView");
        if (!ExtUtilsKt.isVisible(selectView)) {
            super.lambda$onCreate$0();
            return;
        }
        List<CatalogGroup> list = this.groups;
        if (list != null) {
            onTagConfirmed(list);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.Hilt_CourseCatalogActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String title = getTitle();
        if (title == null) {
            title = getString(czi.course_all);
            Intrinsics.checkNotNullExpressionValue(title, "getString(...)");
        }
        setTitle(title);
        this.stateView = (TextView) findViewById(oqi.o1);
        setLayoutManager();
        UIUtils uIUtils = UIUtils.INSTANCE;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.hideSystemUI(window);
        ((vp4) getMBinding()).C.setAdapter(getCourseFeedAdapter());
        ((vp4) getMBinding()).C.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.mi.health.course.activity.CourseCatalogActivity.onCreate.1
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                CourseCatalogVM.reqList$default(CourseCatalogActivity.access$getMViewModel(CourseCatalogActivity.this), CourseCatalogActivity.this.getScene(), CourseCatalogActivity.this.getType(), CourseCatalogActivity.this.tags, false, 8, null);
            }
        });
        ((CourseCatalogVM) getMViewModel()).getViewStates().observe(this, new CourseCatalogActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fp4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseCatalogActivity.onCreate$lambda$2(this.f18045a, (StateData) obj);
            }
        }));
        this.tags = getIntent().getStringExtra(CourseCatalogActivityKt.KEY_COURSER_TAGS);
        ((CourseCatalogVM) getMViewModel()).reqFirstTotalPage(getScene(), getType(), this.tags, showCatalog());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.startMills = System.currentTimeMillis();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        String sourceKey = getSourceKey();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.startMills) / ((long) 1000);
        Logger.d(BaseBindingActivity.TAG, "onStop: " + sourceKey + ", " + jCurrentTimeMillis);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", sourceKey), TuplesKt.to("duration_sec", Long.valueOf(jCurrentTimeMillis)), TuplesKt.to("tip", "56.2.2.1.19563")));
    }
}
