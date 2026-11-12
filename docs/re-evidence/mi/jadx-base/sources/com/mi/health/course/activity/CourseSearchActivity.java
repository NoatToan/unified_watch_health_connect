package com.mi.health.course.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import com.mi.health.course.activity.CourseSearchActivity;
import com.mi.health.course.adapter.CourseSeriesAdapter;
import com.mi.health.course.adapter.CourseSeriesEntity;
import com.mi.health.course.export.data.CourseListItem;
import com.mi.health.course.vm.CatalogCourseFeed;
import com.mi.health.course.vm.CourseSearchVM;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.smarthome.library.common.util.KeyboardUtils;
import defpackage.czi;
import defpackage.ew1;
import defpackage.gki;
import defpackage.oqi;
import defpackage.sti;
import defpackage.tw4;
import defpackage.wc0;
import defpackage.xmi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/B\u0007¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J%\u0010\u0016\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u00060"}, d2 = {"Lcom/mi/health/course/activity/CourseSearchActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/mi/health/course/vm/CourseSearchVM;", "Ltw4;", "", "initTitle", "()V", "initView", "", "resetPage", "loadSearchList", "(Z)V", "initData", "morePage", MedicalIdSPContract.PREF_FIRST, "onEmpty", "(ZZ)V", "onError", "onNoNet", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData;", "Lcom/mi/health/course/vm/CatalogCourseFeed;", "it", "onDataOK", "(Lcom/xiaomi/fitness/baseui/recyclerview/StateData;Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "mKeyword", "Ljava/lang/String;", "Landroid/widget/TextView;", "stateView", "Landroid/widget/TextView;", "Lcom/mi/health/course/adapter/CourseSeriesAdapter;", "courseAdapter$delegate", "Lkotlin/Lazy;", "getCourseAdapter", "()Lcom/mi/health/course/adapter/CourseSeriesAdapter;", "courseAdapter", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseSearchActivity.kt\ncom/mi/health/course/activity/CourseSearchActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,254:1\n58#2,23:255\n93#2,3:278\n1557#3:281\n1628#3,3:282\n*S KotlinDebug\n*F\n+ 1 CourseSearchActivity.kt\ncom/mi/health/course/activity/CourseSearchActivity\n*L\n106#1:255,23\n106#1:278,3\n239#1:281\n239#1:282,3\n*E\n"})
public final class CourseSearchActivity extends Hilt_CourseSearchActivity<CourseSearchVM, tw4> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private TextView stateView;

    @NotNull
    private String mKeyword = "";

    /* JADX INFO: renamed from: courseAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy courseAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lw4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseSearchActivity.courseAdapter_delegate$lambda$0(this.f25486a);
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/mi/health/course/activity/CourseSearchActivity$Companion;", "", "<init>", "()V", "startCourseSearch", "", "context", "Landroid/content/Context;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startCourseSearch(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) CourseSearchActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CourseSeriesAdapter courseAdapter_delegate$lambda$0(CourseSearchActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new CourseSeriesAdapter(this$0, BaseBindingActivity.TAG, true);
    }

    private final CourseSeriesAdapter getCourseAdapter() {
        return (CourseSeriesAdapter) this.courseAdapter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        ((CourseSearchVM) getMViewModel()).getViewStates().observe(this, new CourseSearchActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rw4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseSearchActivity.initData$lambda$9(this.f32960a, (StateData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initData$lambda$9(CourseSearchActivity this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        boolean z = !((CatalogCourseFeed) stateData.f11668a).getResetPage();
        boolean firstTotalPage = ((CatalogCourseFeed) stateData.f11668a).getFirstTotalPage();
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
                MoreRecyclerView.setStatus$default(((tw4) this$0.getMBinding()).A, Status.LOADING, false, 2, null);
            } else {
                String string = this$0.getString(czi.d);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                PageState.DefaultImpls.showLoading$default(this$0, string, 0, false, 6, null);
            }
        }
        return Unit.INSTANCE;
    }

    private final void initTitle() {
        wc0 miuiActionBar;
        final View viewInflate = LayoutInflater.from(this).inflate(sti.course_search_title, (ViewGroup) null);
        if (UIUtils.isNightMode(this) && (miuiActionBar = getMiuiActionBar()) != null) {
            miuiActionBar.setBackgroundDrawable(new ColorDrawable(ResourceExtKt.getResourceColor(this, gki.f19084a)));
        }
        Intrinsics.checkNotNull(viewInflate);
        setCustomView(viewInflate, new ActionBar.LayoutParams(-1, -1));
        ((ImageView) viewInflate.findViewById(oqi.l)).setOnClickListener(new View.OnClickListener() { // from class: mw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseSearchActivity.initTitle$lambda$8$lambda$1(this.f27276a, view);
            }
        });
        ViewExtKt.clickWithTrigger$default(viewInflate.findViewById(oqi.s0), 0L, new Function1() { // from class: nw4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseSearchActivity.initTitle$lambda$8$lambda$2(viewInflate, this, (ImageView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(viewInflate.findViewById(oqi.c2), 0L, new Function1() { // from class: ow4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseSearchActivity.initTitle$lambda$8$lambda$3(this.f29754a, viewInflate, (TextView) obj);
            }
        }, 1, null);
        final EditText editText = (EditText) viewInflate.findViewById(oqi.Y);
        Intrinsics.checkNotNull(editText);
        editText.addTextChangedListener(new TextWatcher() { // from class: com.mi.health.course.activity.CourseSearchActivity$initTitle$lambda$8$lambda$7$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                boolean z = false;
                if (s != null && s.length() > 0) {
                    z = true;
                }
                View viewFindViewById = this.this$0.findViewById(oqi.s0);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                ExtUtilsKt.setVisible(viewFindViewById, z);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: pw4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return CourseSearchActivity.initTitle$lambda$8$lambda$7$lambda$5(this.f30847a, editText, textView, i, keyEvent);
            }
        });
        editText.postDelayed(new Runnable() { // from class: qw4
            @Override // java.lang.Runnable
            public final void run() {
                CourseSearchActivity.initTitle$lambda$8$lambda$7$lambda$6(editText);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitle$lambda$8$lambda$1(CourseSearchActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitle$lambda$8$lambda$2(View view, CourseSearchActivity this$0, ImageView imageView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((EditText) view.findViewById(oqi.Y)).setText("");
        this$0.getCourseAdapter().clear();
        TextView textView = this$0.stateView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView = null;
        }
        ViewExtKt.gone(textView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitle$lambda$8$lambda$3(CourseSearchActivity this$0, View view, TextView textView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = ((EditText) view.findViewById(oqi.Y)).getText().toString();
        this$0.mKeyword = string;
        if (string.length() > 0) {
            this$0.loadSearchList(true);
        }
        KeyboardUtils.hideKeyboard((EditText) view.findViewById(oqi.Y));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initTitle$lambda$8$lambda$7$lambda$5(CourseSearchActivity this$0, EditText editText, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 3) {
            return false;
        }
        String string = textView.getText().toString();
        this$0.mKeyword = string;
        if (string.length() > 0) {
            this$0.loadSearchList(true);
        }
        KeyboardUtils.hideKeyboard(editText);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitle$lambda$8$lambda$7$lambda$6(EditText editText) {
        editText.requestFocus();
        KeyboardUtils.showKeyboard(editText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        this.stateView = (TextView) findViewById(oqi.o1);
        ((tw4) getMBinding()).A.setAdapter(getCourseAdapter());
        ((tw4) getMBinding()).A.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.mi.health.course.activity.CourseSearchActivity.initView.1
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                CourseSearchActivity.this.loadSearchList(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void loadSearchList(boolean resetPage) {
        ((CourseSearchVM) getMViewModel()).getCatalogCourseList(this.mKeyword, resetPage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOK(StateData<CatalogCourseFeed> it, boolean morePage) {
        if (!morePage) {
            dismissDialog();
        }
        TextView textView = this.stateView;
        ArrayList arrayList = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView = null;
        }
        ExtUtilsKt.setVisible(textView, false);
        TextView textView2 = this.stateView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView2 = null;
        }
        ViewExtKt.gone(textView2);
        MoreRecyclerView rcvSearchCourse = ((tw4) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(rcvSearchCourse, "rcvSearchCourse");
        ViewExtKt.visible(rcvSearchCourse);
        MoreRecyclerView.setStatus$default(((tw4) getMBinding()).A, ((CourseSearchVM) getMViewModel()).getHasMore() ? Status.MORE : Status.DONE, false, 2, null);
        CourseSeriesAdapter courseAdapter = getCourseAdapter();
        List<CourseListItem> feeds = it.f11668a.getFeeds();
        if (feeds != null) {
            List<CourseListItem> list = feeds;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new CourseSeriesEntity(2, (CourseListItem) it2.next()));
            }
        }
        courseAdapter.addData(arrayList, !morePage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onEmpty(boolean morePage, boolean first) {
        Logger.d(BaseBindingActivity.TAG, "onEmpty morePage:" + morePage + ",first:" + first + " ");
        TextView textView = null;
        if (morePage) {
            MoreRecyclerView.setStatus$default(((tw4) getMBinding()).A, Status.DONE, false, 2, null);
            return;
        }
        if (first) {
            TextView textView2 = this.stateView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateView");
                textView2 = null;
            }
            ViewExtKt.visible(textView2);
            TextView textView3 = this.stateView;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stateView");
            } else {
                textView = textView3;
            }
            ExtUtilsKt.setVisible(textView, true);
            MoreRecyclerView rcvSearchCourse = ((tw4) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(rcvSearchCourse, "rcvSearchCourse");
            ViewExtKt.gone(rcvSearchCourse);
            return;
        }
        TextView textView4 = this.stateView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView4 = null;
        }
        ViewExtKt.visible(textView4);
        TextView textView5 = this.stateView;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView5 = null;
        }
        textView5.setText(czi.course_empty_search);
        TextView textView6 = this.stateView;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
        } else {
            textView = textView6;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, xmi.e, 0, 0);
        MoreRecyclerView rcvSearchCourse2 = ((tw4) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(rcvSearchCourse2, "rcvSearchCourse");
        ViewExtKt.gone(rcvSearchCourse2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onError(boolean morePage, boolean first) {
        TextView textView = this.stateView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView = null;
        }
        ExtUtilsKt.setVisible(textView, false);
        if (morePage) {
            MoreRecyclerView.setStatus$default(((tw4) getMBinding()).A, Status.FAIL, false, 2, null);
            return;
        }
        if (first) {
            showError();
            return;
        }
        TextView textView3 = this.stateView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView3 = null;
        }
        ViewExtKt.visible(textView3);
        TextView textView4 = this.stateView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView4 = null;
        }
        textView4.setText(getString(czi.common_hint_unkonwn_error));
        TextView textView5 = this.stateView;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
        } else {
            textView2 = textView5;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, xmi.e, 0, 0);
        MoreRecyclerView rcvSearchCourse = ((tw4) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(rcvSearchCourse, "rcvSearchCourse");
        ViewExtKt.gone(rcvSearchCourse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNoNet(boolean morePage, boolean first) {
        TextView textView = null;
        if (morePage) {
            MoreRecyclerView.setStatus$default(((tw4) getMBinding()).A, Status.FAIL, false, 2, null);
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
        MoreRecyclerView rcvSearchCourse = ((tw4) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(rcvSearchCourse, "rcvSearchCourse");
        ViewExtKt.gone(rcvSearchCourse);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.course_search;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    @Override // com.mi.health.course.activity.Hilt_CourseSearchActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initTitle();
        initView();
        initData();
    }
}
