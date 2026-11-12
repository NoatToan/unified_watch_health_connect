package com.mi.health.course.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.mi.health.course.activity.CourseAllCatalogActivity;
import com.mi.health.course.adapter.CatalogCourseTabAdapter;
import com.mi.health.course.adapter.CatalogCourseTagAdapter;
import com.mi.health.course.adapter.CourseAllCatalogAdapter;
import com.mi.health.course.adapter.CourseCatalogAdapter;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseCatalogCategory;
import com.mi.health.course.export.data.CourseCatalogConfigData;
import com.mi.health.course.export.data.CourseCatalogFilter;
import com.mi.health.course.export.data.CourseCatalogFilterItem;
import com.mi.health.course.vm.CatalogCourseFeed;
import com.mi.health.course.vm.CourseCatalogAllVM;
import com.mi.health.course.widget.NoNestScrollRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import defpackage.czi;
import defpackage.ew1;
import defpackage.mn4;
import defpackage.oqi;
import defpackage.sti;
import defpackage.xmi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\bi\u0010\rJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\rJ'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ%\u0010\u001f\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00062\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0003¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\rJ\u001d\u0010'\u001a\u00020\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010\u000bJ\u001d\u0010)\u001a\u00020\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b)\u0010%J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\rJ\u0017\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010/H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\rJ\u000f\u00104\u001a\u00020\u0006H\u0014¢\u0006\u0004\b4\u0010\rJ\u000f\u00105\u001a\u00020\u0006H\u0014¢\u0006\u0004\b5\u0010\rR\u001d\u00109\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0010R\u001d\u0010>\u001a\u0004\u0018\u00010:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001d\u0010C\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010\u0010R\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u00107\u001a\u0004\bN\u0010OR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u00107\u001a\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010@R\u0016\u0010[\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010@R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\\R \u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0Q0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010e¨\u0006j"}, d2 = {"Lcom/mi/health/course/activity/CourseAllCatalogActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/mi/health/course/vm/CourseCatalogAllVM;", "Lmn4;", "", "position", "", "clickCatalog", "(I)V", "", "isSeries", "()Z", "setLayoutManager", "()V", "", "getSourceKey", "()Ljava/lang/String;", "morePage", MedicalIdSPContract.PREF_FIRST, "onEmpty", "(ZZ)V", "showEmptyTv", "showEmptyClearFilter", "resetFilter", "isFullPage", "onError", "(ZZZ)V", "onNoNet", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogCourseFeed;", "it", "onDataOK", "(Lcom/xiaomi/fitness/baseui/recyclerview/StateData;Z)V", "", "Lcom/mi/health/course/export/data/CourseCatalogFilter;", "groups", "setCatalogView", "(Ljava/util/List;)V", "hideFilter", "onTagConfirmed", "showCatalog", "setTabView", "setTagsView", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_STOP, "scene$delegate", "Lkotlin/Lazy;", "getScene", "scene", "", "type$delegate", "getType", "()[I", "type", "tags", "Ljava/lang/String;", "title$delegate", "getTitle", "title", "Lcom/mi/health/course/adapter/CourseAllCatalogAdapter;", "courseFeedAdapter$delegate", "getCourseFeedAdapter", "()Lcom/mi/health/course/adapter/CourseAllCatalogAdapter;", "courseFeedAdapter", "Landroid/widget/TextView;", "stateView", "Landroid/widget/TextView;", "Lcom/mi/health/course/adapter/CatalogCourseTagAdapter;", "tagsAdapter$delegate", "getTagsAdapter", "()Lcom/mi/health/course/adapter/CatalogCourseTagAdapter;", "tagsAdapter", "Ljava/util/ArrayList;", "Lcom/mi/health/course/export/data/CourseCatalogCategory;", "catalogList", "Ljava/util/ArrayList;", "Lcom/mi/health/course/adapter/CourseCatalogAdapter;", "courseCatalogAdapter$delegate", "getCourseCatalogAdapter", "()Lcom/mi/health/course/adapter/CourseCatalogAdapter;", "courseCatalogAdapter", "mCategory", "mFilter", "Ljava/util/List;", "Landroid/util/SparseArray;", "Lcom/mi/health/course/export/data/CourseCatalogFilterItem;", "oldTagList", "Landroid/util/SparseArray;", "", "startMills", "J", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseAllCatalogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseAllCatalogActivity.kt\ncom/mi/health/course/activity/CourseAllCatalogActivity\n+ 2 ExtUtils.kt\ncom/xiaomi/fitness/common/utils/ExtUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,495:1\n47#2,7:496\n47#2,7:503\n47#2,7:510\n360#3,7:517\n774#3:524\n865#3,2:525\n1863#3,2:527\n1863#3:531\n774#3:532\n865#3,2:533\n1864#3:535\n1863#3:537\n1863#3,2:538\n1864#3:540\n2653#3:542\n1872#3,3:544\n1863#3:547\n1863#3,2:548\n1864#3:550\n1863#3,2:551\n76#4,2:529\n79#4:536\n1#5:541\n1#5:543\n*S KotlinDebug\n*F\n+ 1 CourseAllCatalogActivity.kt\ncom/mi/health/course/activity/CourseAllCatalogActivity\n*L\n56#1:496,7\n57#1:503,7\n59#1:510,7\n81#1:517,7\n107#1:524\n107#1:525,2\n283#1:527,2\n377#1:531\n378#1:532\n378#1:533,2\n377#1:535\n391#1:537\n393#1:538,2\n391#1:540\n187#1:542\n187#1:544,3\n360#1:547\n362#1:548,2\n360#1:550\n433#1:551,2\n376#1:529,2\n376#1:536\n187#1:543\n*E\n"})
public final class CourseAllCatalogActivity extends Hilt_CourseAllCatalogActivity<CourseCatalogAllVM, mn4> {

    @NotNull
    private final ArrayList<CourseCatalogCategory> catalogList;

    /* JADX INFO: renamed from: courseCatalogAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy courseCatalogAdapter;

    /* JADX INFO: renamed from: courseFeedAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy courseFeedAdapter;

    @Nullable
    private List<CourseCatalogFilter> groups;

    @NotNull
    private String mCategory;

    @NotNull
    private String mFilter;

    @NotNull
    private final SparseArray<ArrayList<CourseCatalogFilterItem>> oldTagList;

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

    public CourseAllCatalogActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = CourseCatalogActivityKt.KEY_COURSER_SCENE;
        this.scene = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<String>() { // from class: com.mi.health.course.activity.CourseAllCatalogActivity$special$$inlined$intent$1
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
        this.type = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<int[]>() { // from class: com.mi.health.course.activity.CourseAllCatalogActivity$special$$inlined$intent$2
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
        this.title = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<String>() { // from class: com.mi.health.course.activity.CourseAllCatalogActivity$special$$inlined$intent$3
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
        this.courseFeedAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: gn4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CourseAllCatalogActivity.courseFeedAdapter_delegate$lambda$0(this.f19149a);
            }
        });
        this.tagsAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hn4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CourseAllCatalogActivity.tagsAdapter_delegate$lambda$1();
            }
        });
        this.catalogList = new ArrayList<>();
        this.courseCatalogAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: in4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CourseAllCatalogActivity.courseCatalogAdapter_delegate$lambda$3(this.f21314a);
            }
        });
        this.mCategory = "";
        this.mFilter = "";
        this.oldTagList = new SparseArray<>();
        this.startMills = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CourseCatalogAllVM access$getMViewModel(CourseAllCatalogActivity courseAllCatalogActivity) {
        return (CourseCatalogAllVM) courseAllCatalogActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void clickCatalog(int position) {
        String id;
        CourseCatalogCategory courseCatalogCategory = (CourseCatalogCategory) CollectionsKt___CollectionsKt.getOrNull(this.catalogList, position);
        if (courseCatalogCategory == null || !Intrinsics.areEqual(courseCatalogCategory.getSelected(), Boolean.TRUE)) {
            this.oldTagList.clear();
            ConstraintLayout selectView = ((mn4) getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(selectView, "selectView");
            ViewExtKt.gone(selectView);
            resetFilter();
            Iterator<CourseCatalogCategory> it = this.catalogList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next().getSelected(), Boolean.TRUE)) {
                    break;
                } else {
                    i++;
                }
            }
            CourseCatalogCategory courseCatalogCategory2 = (CourseCatalogCategory) CollectionsKt___CollectionsKt.getOrNull(this.catalogList, i);
            if (courseCatalogCategory2 != null) {
                courseCatalogCategory2.setSelected(Boolean.FALSE);
            }
            CourseCatalogCategory courseCatalogCategory3 = (CourseCatalogCategory) CollectionsKt___CollectionsKt.getOrNull(this.catalogList, position);
            if (courseCatalogCategory3 != null) {
                courseCatalogCategory3.setSelected(Boolean.TRUE);
            }
            getCourseFeedAdapter().setSeries(isSeries());
            CourseCatalogCategory courseCatalogCategory4 = (CourseCatalogCategory) CollectionsKt___CollectionsKt.getOrNull(this.catalogList, position);
            if (courseCatalogCategory4 == null || (id = courseCatalogCategory4.getId()) == null) {
                id = "";
            }
            this.mCategory = id;
            getCourseCatalogAdapter().notifyDataSetChanged();
            if (isSeries()) {
                RecyclerView rcvCourseCatalog = ((mn4) getMBinding()).D;
                Intrinsics.checkNotNullExpressionValue(rcvCourseCatalog, "rcvCourseCatalog");
                ViewExtKt.gone(rcvCourseCatalog);
                NoNestScrollRecyclerView tabView = ((mn4) getMBinding()).I;
                Intrinsics.checkNotNullExpressionValue(tabView, "tabView");
                ViewExtKt.gone(tabView);
            } else {
                NoNestScrollRecyclerView tabView2 = ((mn4) getMBinding()).I;
                Intrinsics.checkNotNullExpressionValue(tabView2, "tabView");
                ViewExtKt.visible(tabView2);
            }
            ((CourseCatalogAllVM) getMViewModel()).getCatalogCourseList((4 & 1) != 0 ? null : this.mCategory, (4 & 2) != 0 ? null : this.mFilter, (4 & 4) != 0 ? null : null, true, isSeries());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CourseCatalogAdapter courseCatalogAdapter_delegate$lambda$3(final CourseAllCatalogActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new CourseCatalogAdapter(this$0.catalogList, new Function1() { // from class: cn4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseAllCatalogActivity.courseCatalogAdapter_delegate$lambda$3$lambda$2(this.f5567a, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit courseCatalogAdapter_delegate$lambda$3$lambda$2(CourseAllCatalogActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.clickCatalog(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CourseAllCatalogAdapter courseFeedAdapter_delegate$lambda$0(CourseAllCatalogActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new CourseAllCatalogAdapter(this$0, this$0.getSourceKey());
    }

    private final CourseCatalogAdapter getCourseCatalogAdapter() {
        return (CourseCatalogAdapter) this.courseCatalogAdapter.getValue();
    }

    private final CourseAllCatalogAdapter getCourseFeedAdapter() {
        return (CourseAllCatalogAdapter) this.courseFeedAdapter.getValue();
    }

    private final String getScene() {
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

    private final CatalogCourseTagAdapter getTagsAdapter() {
        return (CatalogCourseTagAdapter) this.tagsAdapter.getValue();
    }

    private final String getTitle() {
        return (String) this.title.getValue();
    }

    private final int[] getType() {
        return (int[]) this.type.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideFilter() {
        CourseCatalogFilter courseCatalogFilter;
        ArrayList<CourseCatalogFilterItem> item;
        ConstraintLayout selectView = ((mn4) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(selectView, "selectView");
        ViewExtKt.gone(selectView);
        RecyclerView.Adapter adapter = ((mn4) getMBinding()).I.getAdapter();
        CatalogCourseTabAdapter catalogCourseTabAdapter = adapter instanceof CatalogCourseTabAdapter ? (CatalogCourseTabAdapter) adapter : null;
        if (catalogCourseTabAdapter != null) {
            catalogCourseTabAdapter.clearState();
        }
        SparseArray<ArrayList<CourseCatalogFilterItem>> sparseArray = this.oldTagList;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            for (CourseCatalogFilterItem courseCatalogFilterItem : sparseArray.valueAt(i)) {
                List<CourseCatalogFilter> list = this.groups;
                if (list != null && (courseCatalogFilter = (CourseCatalogFilter) CollectionsKt___CollectionsKt.getOrNull(list, iKeyAt)) != null && (item = courseCatalogFilter.getItem()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : item) {
                        if (Intrinsics.areEqual(((CourseCatalogFilterItem) obj).getId(), courseCatalogFilterItem.getId())) {
                            arrayList.add(obj);
                        }
                    }
                    CourseCatalogFilterItem courseCatalogFilterItem2 = (CourseCatalogFilterItem) CollectionsKt___CollectionsKt.getOrNull(arrayList, 0);
                    if (courseCatalogFilterItem2 != null) {
                        courseCatalogFilterItem2.setSelected(courseCatalogFilterItem.getSelected());
                    }
                }
            }
        }
        this.oldTagList.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSeries() {
        ArrayList<CourseCatalogCategory> arrayList = this.catalogList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.areEqual(((CourseCatalogCategory) obj).getSelected(), Boolean.TRUE)) {
                arrayList2.add(obj);
            }
        }
        CourseCatalogCategory courseCatalogCategory = (CourseCatalogCategory) CollectionsKt___CollectionsKt.getOrNull(arrayList2, 0);
        return Intrinsics.areEqual(courseCatalogCategory != null ? courseCatalogCategory.getId() : null, "album");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$10(CourseAllCatalogActivity this$0, CourseCatalogConfigData courseCatalogConfigData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(BaseBindingActivity.TAG, "configData:" + courseCatalogConfigData);
        this$0.catalogList.clear();
        this$0.setCatalogView(courseCatalogConfigData.getFilter());
        ArrayList<CourseCatalogCategory> arrayList = this$0.catalogList;
        ArrayList<CourseCatalogCategory> category = courseCatalogConfigData.getCategory();
        int i = 0;
        for (Object obj : category) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CourseCatalogCategory courseCatalogCategory = (CourseCatalogCategory) obj;
            courseCatalogCategory.setSelected(Boolean.valueOf(i == 0));
            if (Intrinsics.areEqual(courseCatalogCategory.getSelected(), Boolean.TRUE)) {
                String id = courseCatalogCategory.getId();
                if (id == null) {
                    id = "";
                }
                this$0.mCategory = id;
            }
            i = i2;
        }
        arrayList.addAll(category);
        this$0.getCourseCatalogAdapter().notifyDataSetChanged();
        ((CourseCatalogAllVM) this$0.getMViewModel()).getCatalogCourseList((4 & 1) != 0 ? null : this$0.mCategory, (4 & 2) != 0 ? null : this$0.mFilter, (4 & 4) != 0 ? null : null, true, this$0.isSeries());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(CourseAllCatalogActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CourseSearchActivity.INSTANCE.startCourseSearch(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$8(CourseAllCatalogActivity this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(BaseBindingActivity.TAG, "viewStates：" + stateData);
        this$0.dismissDialog();
        RecyclerView rcvCourseCatalog = ((mn4) this$0.getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(rcvCourseCatalog, "rcvCourseCatalog");
        ViewExtKt.visible(rcvCourseCatalog);
        boolean z = !((CatalogCourseFeed) stateData.f11668a).getResetPage();
        boolean firstTotalPage = ((CatalogCourseFeed) stateData.f11668a).getFirstTotalPage();
        boolean isFullPage = ((CatalogCourseFeed) stateData.f11668a).getIsFullPage();
        if (stateData.g()) {
            this$0.onEmpty(z, firstTotalPage);
        } else if (stateData.h()) {
            this$0.onError(z, firstTotalPage, isFullPage);
        } else if (stateData.j()) {
            this$0.onNoNet(z, firstTotalPage, isFullPage);
        } else if (stateData.k()) {
            Intrinsics.checkNotNull(stateData);
            this$0.onDataOK(stateData, z);
        } else if (stateData.i()) {
            if (z) {
                MoreRecyclerView.setStatus$default(((mn4) this$0.getMBinding()).E, Status.LOADING, false, 2, null);
            } else {
                String string = this$0.getString(czi.d);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                PageState.DefaultImpls.showLoading$default(this$0, string, 0, false, 6, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOK(StateData<CatalogCourseFeed> it, boolean morePage) {
        if (!morePage) {
            dismissDialog();
        }
        View viewFindViewById = findViewById(oqi.d0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ExtUtilsKt.setVisible(viewFindViewById, false);
        TextView textView = this.stateView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView = null;
        }
        ViewExtKt.gone(textView);
        MoreRecyclerView recyclerView = ((mn4) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ViewExtKt.visible(recyclerView);
        MoreRecyclerView.setStatus$default(((mn4) getMBinding()).E, ((CourseCatalogAllVM) getMViewModel()).getHasMore() ? Status.MORE : Status.DONE, false, 2, null);
        getCourseFeedAdapter().addData(it.f11668a.getFeeds(), !morePage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onEmpty(boolean morePage, boolean first) {
        Logger.d(BaseBindingActivity.TAG, "onEmpty morePage:" + morePage + ",first:" + first + " ");
        TextView textView = null;
        if (morePage) {
            MoreRecyclerView.setStatus$default(((mn4) getMBinding()).E, Status.DONE, false, 2, null);
            return;
        }
        if (!first) {
            if (isSeries() || this.mFilter.length() == 0) {
                showEmptyTv();
            } else {
                showEmptyClearFilter();
            }
            MoreRecyclerView recyclerView = ((mn4) getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            ViewExtKt.gone(recyclerView);
            return;
        }
        TextView textView2 = this.stateView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
        } else {
            textView = textView2;
        }
        ViewExtKt.gone(textView);
        View viewFindViewById = findViewById(oqi.d0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ExtUtilsKt.setVisible(viewFindViewById, true);
        ViewExtKt.clickWithTrigger$default(findViewById(oqi.I1), 0L, new Function1() { // from class: bn4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseAllCatalogActivity.onEmpty$lambda$11(this.f4385a, (View) obj);
            }
        }, 1, null);
        MoreRecyclerView recyclerView2 = ((mn4) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        ViewExtKt.gone(recyclerView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onEmpty$lambda$11(CourseAllCatalogActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resetFilter();
        ((CourseCatalogAllVM) this$0.getMViewModel()).getCatalogCourseList((4 & 1) != 0 ? null : this$0.mCategory, (4 & 2) != 0 ? null : this$0.mFilter, (4 & 4) != 0 ? null : null, true, this$0.isSeries());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onError(boolean morePage, boolean first, boolean isFullPage) {
        View viewFindViewById = findViewById(oqi.d0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ExtUtilsKt.setVisible(viewFindViewById, false);
        TextView textView = null;
        if (morePage) {
            MoreRecyclerView.setStatus$default(((mn4) getMBinding()).E, Status.FAIL, false, 2, null);
            return;
        }
        if (first) {
            showError();
            return;
        }
        if (isFullPage) {
            RecyclerView rcvCourseCatalog = ((mn4) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(rcvCourseCatalog, "rcvCourseCatalog");
            ViewExtKt.gone(rcvCourseCatalog);
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
        MoreRecyclerView recyclerView = ((mn4) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ViewExtKt.gone(recyclerView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNoNet(boolean morePage, boolean first, boolean isFullPage) {
        View viewFindViewById = findViewById(oqi.d0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ExtUtilsKt.setVisible(viewFindViewById, false);
        TextView textView = null;
        if (morePage) {
            MoreRecyclerView.setStatus$default(((mn4) getMBinding()).E, Status.FAIL, false, 2, null);
            return;
        }
        if (first) {
            showNoNetwork();
            return;
        }
        if (isFullPage) {
            RecyclerView rcvCourseCatalog = ((mn4) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(rcvCourseCatalog, "rcvCourseCatalog");
            ViewExtKt.gone(rcvCourseCatalog);
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
        MoreRecyclerView recyclerView = ((mn4) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ViewExtKt.gone(recyclerView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onTagConfirmed(List<CourseCatalogFilter> groups) {
        String id;
        ConstraintLayout selectView = ((mn4) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(selectView, "selectView");
        ViewExtKt.gone(selectView);
        RecyclerView.Adapter adapter = ((mn4) getMBinding()).I.getAdapter();
        CatalogCourseTabAdapter catalogCourseTabAdapter = adapter instanceof CatalogCourseTabAdapter ? (CatalogCourseTabAdapter) adapter : null;
        if (catalogCourseTabAdapter != null) {
            catalogCourseTabAdapter.clearState();
        }
        StringBuilder sb = new StringBuilder();
        for (CourseCatalogFilter courseCatalogFilter : groups) {
            StringBuilder sb2 = new StringBuilder();
            for (CourseCatalogFilterItem courseCatalogFilterItem : courseCatalogFilter.getItem()) {
                if (courseCatalogFilterItem.getSelected() && (id = courseCatalogFilterItem.getId()) != null && id.length() != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(",");
                    }
                    sb2.append(courseCatalogFilterItem.getId());
                }
            }
            if (sb2.length() > 0) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(courseCatalogFilter.getId());
                sb.append(":");
                sb.append((CharSequence) sb2);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Logger.d(BaseBindingActivity.TAG, "setCatalogView：" + string + ",pre=" + this.mFilter);
        if (Intrinsics.areEqual(string, this.mFilter)) {
            return;
        }
        this.mFilter = string;
        ((CourseCatalogAllVM) getMViewModel()).getCatalogCourseList((4 & 1) != 0 ? null : this.mCategory, (4 & 2) != 0 ? null : this.mFilter, (4 & 4) != 0 ? null : null, true, isSeries());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetFilter() {
        this.mFilter = "";
        this.tags = null;
        List<CourseCatalogFilter> list = this.groups;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList<CourseCatalogFilterItem> item = ((CourseCatalogFilter) it.next()).getItem();
                if (item != null) {
                    Iterator<T> it2 = item.iterator();
                    while (it2.hasNext()) {
                        ((CourseCatalogFilterItem) it2.next()).setSelected(false);
                    }
                }
            }
        }
        RecyclerView.Adapter adapter = ((mn4) getMBinding()).I.getAdapter();
        CatalogCourseTabAdapter catalogCourseTabAdapter = adapter instanceof CatalogCourseTabAdapter ? (CatalogCourseTabAdapter) adapter : null;
        if (catalogCourseTabAdapter != null) {
            catalogCourseTabAdapter.clearState();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NotifyDataSetChanged"})
    private final void setCatalogView(final List<CourseCatalogFilter> groups) {
        List<CourseCatalogFilter> list;
        if (!showCatalog() || (list = groups) == null || list.isEmpty()) {
            NoNestScrollRecyclerView tabView = ((mn4) getMBinding()).I;
            Intrinsics.checkNotNullExpressionValue(tabView, "tabView");
            ViewExtKt.gone(tabView);
            return;
        }
        NoNestScrollRecyclerView tabView2 = ((mn4) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(tabView2, "tabView");
        ViewExtKt.visible(tabView2);
        this.groups = groups;
        ((mn4) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: jn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseAllCatalogActivity.setCatalogView$lambda$15(this.f22938a, view);
            }
        });
        setTabView(groups);
        setTagsView();
        ((mn4) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: kn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseAllCatalogActivity.setCatalogView$lambda$18(groups, this, view);
            }
        });
        ((mn4) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: ln4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseAllCatalogActivity.setCatalogView$lambda$19(this.f25235a, groups, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCatalogView$lambda$15(CourseAllCatalogActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideFilter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCatalogView$lambda$18(List list, CourseAllCatalogActivity this$0, View view) {
        ArrayList<CourseCatalogFilterItem> item;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CourseCatalogFilter courseCatalogFilter = (CourseCatalogFilter) it.next();
            if (courseCatalogFilter.getSelected() && (item = courseCatalogFilter.getItem()) != null) {
                Iterator<T> it2 = item.iterator();
                while (it2.hasNext()) {
                    ((CourseCatalogFilterItem) it2.next()).setSelected(false);
                }
            }
        }
        this$0.getTagsAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCatalogView$lambda$19(CourseAllCatalogActivity this$0, List list, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.oldTagList.clear();
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
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.mi.health.course.activity.CourseAllCatalogActivity$setLayoutManager$layoutManager$1$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        ((mn4) getMBinding()).E.setLayoutManager(gridLayoutManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTabView(final List<CourseCatalogFilter> groups) {
        NoNestScrollRecyclerView tabView = ((mn4) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(tabView, "tabView");
        tabView.setAdapter(new CatalogCourseTabAdapter(groups, new Function1() { // from class: an4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseAllCatalogActivity.setTabView$lambda$27(this.f1230a, groups, ((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setTabView$lambda$27(CourseAllCatalogActivity this$0, List groups, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(groups, "$groups");
        this$0.getTagsAdapter().setData(((CourseCatalogFilter) groups.get(i)).getItem());
        this$0.oldTagList.clear();
        ArrayList<CourseCatalogFilterItem> arrayList = new ArrayList<>();
        Iterator<T> it = ((CourseCatalogFilter) groups.get(i)).getItem().iterator();
        while (it.hasNext()) {
            arrayList.add(CourseCatalogFilterItem.copy$default((CourseCatalogFilterItem) it.next(), null, null, false, 7, null));
        }
        this$0.oldTagList.put(i, arrayList);
        ConstraintLayout selectView = ((mn4) this$0.getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(selectView, "selectView");
        if (!ExtUtilsKt.isVisible(selectView)) {
            ConstraintLayout selectView2 = ((mn4) this$0.getMBinding()).G;
            Intrinsics.checkNotNullExpressionValue(selectView2, "selectView");
            ViewExtKt.visible(selectView2);
        }
        Logger.d(BaseBindingActivity.TAG, "setTabView: " + i + ",oldTagList:" + this$0.oldTagList);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setTagsView() {
        NoNestScrollRecyclerView tagsView = ((mn4) getMBinding()).J;
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

    private final void showEmptyClearFilter() {
        TextView textView = this.stateView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView = null;
        }
        ViewExtKt.gone(textView);
        View viewFindViewById = findViewById(oqi.d0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ExtUtilsKt.setVisible(viewFindViewById, true);
        ViewExtKt.clickWithTrigger$default(findViewById(oqi.I1), 0L, new Function1() { // from class: zm4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseAllCatalogActivity.showEmptyClearFilter$lambda$12(this.f41450a, (View) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showEmptyClearFilter$lambda$12(CourseAllCatalogActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resetFilter();
        ((CourseCatalogAllVM) this$0.getMViewModel()).getCatalogCourseList((4 & 1) != 0 ? null : this$0.mCategory, (4 & 2) != 0 ? null : this$0.mFilter, (4 & 4) != 0 ? null : null, true, this$0.isSeries());
        return Unit.INSTANCE;
    }

    private final void showEmptyTv() {
        TextView textView = this.stateView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView = null;
        }
        ViewExtKt.visible(textView);
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
            textView2 = textView4;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, xmi.e, 0, 0);
        View viewFindViewById = findViewById(oqi.d0);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ExtUtilsKt.setVisible(viewFindViewById, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CatalogCourseTagAdapter tagsAdapter_delegate$lambda$1() {
        return new CatalogCourseTagAdapter();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.course_all_catalog_activity;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        ConstraintLayout selectView = ((mn4) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(selectView, "selectView");
        if (!ExtUtilsKt.isVisible(selectView)) {
            super.lambda$onCreate$0();
        } else if (this.groups != null) {
            hideFilter();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mi.health.course.activity.Hilt_CourseAllCatalogActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String title = getTitle();
        if (title == null) {
            title = getString(czi.course_all);
            Intrinsics.checkNotNullExpressionValue(title, "getString(...)");
        }
        setTitle(title);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        IActionBar.DefaultImpls.setEndView$default(this, 0, UIUtils.isNightMode(AppUtil.getApp()) ? xmi.h : xmi.i, getString(czi.course_search), new View.OnClickListener() { // from class: dn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseAllCatalogActivity.onCreate$lambda$7(this.f15712a, view);
            }
        }, 1, null);
        this.stateView = (TextView) findViewById(oqi.o1);
        setLayoutManager();
        ((mn4) getMBinding()).E.setAdapter(getCourseFeedAdapter());
        ((mn4) getMBinding()).E.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.mi.health.course.activity.CourseAllCatalogActivity.onCreate.2
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                CourseAllCatalogActivity.access$getMViewModel(CourseAllCatalogActivity.this).getCatalogCourseList((4 & 1) != 0 ? null : CourseAllCatalogActivity.this.mCategory, (4 & 2) != 0 ? null : CourseAllCatalogActivity.this.mFilter, (4 & 4) != 0 ? null : null, false, CourseAllCatalogActivity.this.isSeries());
            }
        });
        ((CourseCatalogAllVM) getMViewModel()).getViewStates().observe(this, new CourseAllCatalogActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: en4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseAllCatalogActivity.onCreate$lambda$8(this.f16833a, (StateData) obj);
            }
        }));
        this.tags = getIntent().getStringExtra(CourseCatalogActivityKt.KEY_COURSER_TAGS);
        ((mn4) getMBinding()).D.setAdapter(getCourseCatalogAdapter());
        ((CourseCatalogAllVM) getMViewModel()).getCatalogConfigData().observe(this, new CourseAllCatalogActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fn4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseAllCatalogActivity.onCreate$lambda$10(this.f17946a, (CourseCatalogConfigData) obj);
            }
        }));
        ((CourseCatalogAllVM) getMViewModel()).getCourseCatalogConfig();
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
