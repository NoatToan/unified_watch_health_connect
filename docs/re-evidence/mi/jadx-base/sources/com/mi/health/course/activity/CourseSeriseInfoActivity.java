package com.mi.health.course.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.activity.CourseSeriseInfoActivity;
import com.mi.health.course.adapter.CourseSeriesAdapter;
import com.mi.health.course.adapter.CourseSeriesEntity;
import com.mi.health.course.export.data.CourseListItem;
import com.mi.health.course.export.data.CourseSeriesData;
import com.mi.health.course.export.data.CourseSeriesInfoData;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.vm.CourseSeriesVM;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.onetrack.OneTrack;
import defpackage.bli;
import defpackage.bx4;
import defpackage.czi;
import defpackage.ew1;
import defpackage.oqi;
import defpackage.s4m;
import defpackage.sti;
import defpackage.xmi;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b7\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010,R\u0014\u00106\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010,¨\u00068"}, d2 = {"Lcom/mi/health/course/activity/CourseSeriseInfoActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/mi/health/course/vm/CourseSeriesVM;", "Lbx4;", "", "initView", "()V", "", "show", "showTitleInRcv", "(Z)V", "initData", "Lcom/mi/health/course/export/data/CourseSeriesInfoData;", "data", "onDataOK", "(Lcom/mi/health/course/export/data/CourseSeriesInfoData;)V", "onError", "onNoNet", "info", "shareSeries", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Ls4m;", "shareComponent$delegate", "Lkotlin/Lazy;", "getShareComponent", "()Ls4m;", "shareComponent", "Landroid/widget/TextView;", "stateView", "Landroid/widget/TextView;", "", "mTitle", "Ljava/lang/String;", "", "mId$delegate", "getMId", "()J", "mId", "", "mFrom$delegate", "getMFrom", "()I", "mFrom", "Lcom/mi/health/course/adapter/CourseSeriesAdapter;", "courseAdapter$delegate", "getCourseAdapter", "()Lcom/mi/health/course/adapter/CourseSeriesAdapter;", "courseAdapter", "getLayoutId", "layoutId", "getViewModelId", "viewModelId", "<init>", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCourseSeriseInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseSeriseInfoActivity.kt\ncom/mi/health/course/activity/CourseSeriseInfoActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n1557#2:224\n1628#2,3:225\n*S KotlinDebug\n*F\n+ 1 CourseSeriseInfoActivity.kt\ncom/mi/health/course/activity/CourseSeriseInfoActivity\n*L\n154#1:224\n154#1:225,3\n*E\n"})
public final class CourseSeriseInfoActivity extends Hilt_CourseSeriseInfoActivity<CourseSeriesVM, bx4> {
    private TextView stateView;

    /* JADX INFO: renamed from: shareComponent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy shareComponent = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mx4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseSeriseInfoActivity.shareComponent_delegate$lambda$0(this.f27305a);
        }
    });

    @NotNull
    private String mTitle = "";

    /* JADX INFO: renamed from: mId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mId = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nx4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(CourseSeriseInfoActivity.mId_delegate$lambda$1(this.f28535a));
        }
    });

    /* JADX INFO: renamed from: mFrom$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFrom = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ox4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(CourseSeriseInfoActivity.mFrom_delegate$lambda$2(this.f29781a));
        }
    });

    /* JADX INFO: renamed from: courseAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy courseAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: px4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CourseSeriseInfoActivity.courseAdapter_delegate$lambda$3(this.f30871a);
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateData.Status.values().length];
            try {
                iArr[StateData.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StateData.Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StateData.Status.NO_NET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ bx4 access$getMBinding(CourseSeriseInfoActivity courseSeriseInfoActivity) {
        return (bx4) courseSeriseInfoActivity.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CourseSeriesAdapter courseAdapter_delegate$lambda$3(CourseSeriseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new CourseSeriesAdapter(this$0, BaseBindingActivity.TAG, false);
    }

    private final CourseSeriesAdapter getCourseAdapter() {
        return (CourseSeriesAdapter) this.courseAdapter.getValue();
    }

    private final int getMFrom() {
        return ((Number) this.mFrom.getValue()).intValue();
    }

    private final long getMId() {
        return ((Number) this.mId.getValue()).longValue();
    }

    private final s4m getShareComponent() {
        return (s4m) this.shareComponent.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        ((CourseSeriesVM) getMViewModel()).getSeriesInfoData().observe(this, new CourseSeriseInfoActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lx4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseSeriseInfoActivity.initData$lambda$5(this.f25512a, (CourseSeriesInfoData) obj);
            }
        }));
        Logger.d(BaseBindingActivity.TAG, "series loaddata:" + getMId());
        ((CourseSeriesVM) getMViewModel()).getSeriesInfo(getMId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$5(CourseSeriseInfoActivity this$0, CourseSeriesInfoData courseSeriesInfoData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(BaseBindingActivity.TAG, "seriesInfoData:" + courseSeriesInfoData);
        StateData.Status status = courseSeriesInfoData != null ? courseSeriesInfoData.getStatus() : null;
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            this$0.onDataOK(courseSeriesInfoData);
        } else if (i == 2) {
            this$0.onError();
        } else if (i == 3) {
            this$0.onNoNet();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        if (UIUtils.isNightMode(AppUtil.getApp())) {
            ((bx4) getMBinding()).F.setBackgroundResource(bli.c);
            ((bx4) getMBinding()).A.setImageResource(xmi.f);
            TextView textView = ((bx4) getMBinding()).E;
            TextView tvSeriesTitle = ((bx4) getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(tvSeriesTitle, "tvSeriesTitle");
            textView.setTextColor(ViewExtKt.getColor(tvSeriesTitle, bli.m));
            ((bx4) getMBinding()).B.setImageResource(xmi.j);
        } else {
            ((bx4) getMBinding()).F.setBackgroundResource(bli.m);
            ((bx4) getMBinding()).A.setImageResource(xmi.g);
            TextView textView2 = ((bx4) getMBinding()).E;
            TextView tvSeriesTitle2 = ((bx4) getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(tvSeriesTitle2, "tvSeriesTitle");
            textView2.setTextColor(ViewExtKt.getColor(tvSeriesTitle2, bli.c));
            ((bx4) getMBinding()).B.setImageResource(xmi.f39270k);
        }
        ((bx4) getMBinding()).A.setContentDescription(getString(czi.h));
        ((bx4) getMBinding()).B.setContentDescription(getString(czi.j));
        this.stateView = (TextView) findViewById(oqi.o1);
        setActionBarDisplayable(false);
        ((bx4) getMBinding()).E.setText("");
        ((bx4) getMBinding()).C.setAdapter(getCourseAdapter());
        ((bx4) getMBinding()).C.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.mi.health.course.activity.CourseSeriseInfoActivity.initView.1
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
            }
        });
        final int dp = ExtUtilsKt.getDp(230);
        final Ref.IntRef intRef = new Ref.IntRef();
        ((bx4) getMBinding()).C.addOnScrollListener(new RecyclerView.s() { // from class: com.mi.health.course.activity.CourseSeriseInfoActivity.initView.2
            @Override // androidx.recyclerview.widget.RecyclerView.s
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
                intRef.element += dy;
                CourseSeriseInfoActivity.access$getMBinding(this).E.setText(intRef.element >= dp ? this.mTitle : "");
                this.showTitleInRcv(intRef.element < dp);
                CourseSeriseInfoActivity.access$getMBinding(this).F.setAlpha(Math.min(1.0f, intRef.element / dp));
            }
        });
        ((bx4) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: rx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CourseSeriseInfoActivity.initView$lambda$4(this.f33023a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(CourseSeriseInfoActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mFrom_delegate$lambda$2(CourseSeriseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getIntExtra("from", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long mId_delegate$lambda$1(CourseSeriseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getLongExtra("id", 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOK(final CourseSeriesInfoData data) {
        String name;
        ArrayList arrayList;
        ArrayList<CourseListItem> item;
        TextView textView = this.stateView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
            textView = null;
        }
        ViewExtKt.gone(textView);
        if (data != null) {
            CourseSeriesData album = data.getAlbum();
            if (album == null || (name = album.getName()) == null) {
                name = "";
            }
            this.mTitle = name;
            getCourseAdapter().clear();
            getCourseAdapter().setPageTitle(this.mTitle);
            CourseSeriesData album2 = data.getAlbum();
            if (album2 != null) {
                getCourseAdapter().addData(new CourseSeriesEntity(1, album2));
            }
            CourseSeriesData album3 = data.getAlbum();
            if (album3 == null || (item = album3.getItem()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(item, 10));
                Iterator<T> it = item.iterator();
                while (it.hasNext()) {
                    arrayList.add(new CourseSeriesEntity(2, (CourseListItem) it.next()));
                }
            }
            if (arrayList != null && (!arrayList.isEmpty())) {
                getCourseAdapter().addData(arrayList, false);
            }
            MoreRecyclerView.setStatus$default(((bx4) getMBinding()).C, Status.DONE, false, 2, null);
            ((bx4) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: qx4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CourseSeriseInfoActivity.onDataOK$lambda$9$lambda$8(this.f31926a, data, view);
                }
            });
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            Pair[] pairArr = new Pair[6];
            pairArr[0] = TuplesKt.to("name", "Class_Series");
            pairArr[1] = TuplesKt.to("tip", "56.0.0.0.40469");
            pairArr[2] = TuplesKt.to("source", Integer.valueOf(getMFrom()));
            pairArr[3] = TuplesKt.to("asset_id", String.valueOf(getMId()));
            CourseSeriesData album4 = data.getAlbum();
            pairArr[4] = TuplesKt.to(OneTrack.Param.ASSET_NAME, album4 != null ? album4.getName() : null);
            pairArr[5] = TuplesKt.to(FaceDetailFragment.PAGE_NAME, getMFrom() == 1 ? "运动tab首页" : "全部课程列表");
            oneTrackExtKt.reportData("expose_v3", MapsKt__MapsKt.mapOf(pairArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDataOK$lambda$9$lambda$8(CourseSeriseInfoActivity this$0, CourseSeriesInfoData it, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.shareSeries(it);
    }

    private final void onError() {
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
        textView3.setText(getString(czi.common_hint_unkonwn_error));
        TextView textView4 = this.stateView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
        } else {
            textView2 = textView4;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, xmi.e, 0, 0);
    }

    private final void onNoNet() {
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
        textView3.setText(getString(czi.common_hint_network_unavailable));
        TextView textView4 = this.stateView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateView");
        } else {
            textView2 = textView4;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, xmi.e, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s4m shareComponent_delegate$lambda$0(CourseSeriseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new s4m(this$0);
    }

    private final void shareSeries(CourseSeriesInfoData info) {
        s4m shareComponent = getShareComponent();
        CourseSeriesData album = info.getAlbum();
        String name = album != null ? album.getName() : null;
        CourseSeriesData album2 = info.getAlbum();
        shareComponent.x(name, "", CourseExtKt.SHARE_SERIES_URL + (album2 != null ? album2.getId() : null), null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showTitleInRcv(boolean show) {
        View view;
        TextView textView;
        RecyclerView.d0 d0VarFindViewHolderForAdapterPosition = ((bx4) getMBinding()).C.findViewHolderForAdapterPosition(0);
        if (d0VarFindViewHolderForAdapterPosition == null || (view = d0VarFindViewHolderForAdapterPosition.itemView) == null || (textView = (TextView) view.findViewById(oqi.d2)) == null) {
            return;
        }
        textView.setText(show ? this.mTitle : "");
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return sti.course_series_info;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return ew1.f17121a;
    }

    @Override // com.mi.health.course.activity.Hilt_CourseSeriseInfoActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }
}
