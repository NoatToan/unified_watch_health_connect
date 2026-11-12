package com.xiaomi.fitness.sport.sporttab.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.TrackContentBean;
import com.mi.health.course.export.CourseApi;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseSeriesData;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.sporttab.recycler.SerialCourseAdapter;
import com.xiaomi.fitness.sport.utils.ExtensionsKt;
import com.xiaomi.fitness.sport.utils.ItemDecorationExtKt;
import com.xiaomi.onetrack.OneTrack;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.xri;
import defpackage.zxi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\"#B\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/SerialCourseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/mi/health/course/export/data/CourseSeriesData;", "seriesList", "", "bindData", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemViewType", "(I)I", "Lkotlin/Function0;", "retryAction", "Lkotlin/jvm/functions/Function0;", "getRetryAction", "()Lkotlin/jvm/functions/Function0;", "", "mSeriesList", "Ljava/util/List;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Companion", "CourseViewHolder", "CourseErrorViewHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SerialCourseAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "CourseSeriesAdapter";
    public static final int TYPE_SERIES_COURSE_ERROR = 2;
    public static final int TYPE_SERIES_COURSE_ITEM = 1;

    @NotNull
    private final List<CourseSeriesData> mSeriesList;

    @NotNull
    private final Function0<Unit> retryAction;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/SerialCourseAdapter$CourseErrorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "bind", "()V", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroid/widget/TextView;", "tvSeriesRetry", "Landroid/widget/TextView;", "<init>", "(Lcom/xiaomi/fitness/sport/sporttab/recycler/SerialCourseAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class CourseErrorViewHolder extends RecyclerView.d0 {

        @NotNull
        private final View itemView;
        final /* synthetic */ SerialCourseAdapter this$0;

        @NotNull
        private final TextView tvSeriesRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CourseErrorViewHolder(@NotNull SerialCourseAdapter serialCourseAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = serialCourseAdapter;
            this.itemView = itemView;
            View viewFindViewById = itemView.findViewById(xri.X7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.tvSeriesRetry = (TextView) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$0(SerialCourseAdapter this$0, TextView it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.getRetryAction().invoke();
            return Unit.INSTANCE;
        }

        public final void bind() {
            TextView textView = this.tvSeriesRetry;
            final SerialCourseAdapter serialCourseAdapter = this.this$0;
            ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: jwl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SerialCourseAdapter.CourseErrorViewHolder.bind$lambda$0(serialCourseAdapter, (TextView) obj);
                }
            }, 1, null);
        }

        @NotNull
        public final View getItemView() {
            return this.itemView;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/SerialCourseAdapter$CourseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/mi/health/course/export/data/CourseSeriesData;", "courseSeriesDataModel", "", "clickToSeries", "(Lcom/mi/health/course/export/data/CourseSeriesData;)V", "bindData", "Landroid/view/View;", "itemView", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroid/widget/TextView;", "courseSeriesDes", "Landroid/widget/TextView;", "courseSeriesName", "Landroidx/recyclerview/widget/RecyclerView;", "courseRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/ImageView;", "rightArrow", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "text_group", "ivTabSeriesTop", "Landroidx/recyclerview/widget/RecyclerView$s;", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$s;", "<init>", "(Lcom/xiaomi/fitness/sport/sporttab/recycler/SerialCourseAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nSerialCourseAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialCourseAdapter.kt\ncom/xiaomi/fitness/sport/sporttab/recycler/SerialCourseAdapter$CourseViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
    public final class CourseViewHolder extends RecyclerView.d0 {

        @NotNull
        private final RecyclerView courseRecycler;

        @NotNull
        private final TextView courseSeriesDes;

        @NotNull
        private final TextView courseSeriesName;

        @NotNull
        private final View itemView;

        @NotNull
        private final ImageView ivTabSeriesTop;

        @NotNull
        private final ImageView rightArrow;

        @Nullable
        private RecyclerView.s scrollListener;
        private final View text_group;
        final /* synthetic */ SerialCourseAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CourseViewHolder(@NotNull SerialCourseAdapter serialCourseAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = serialCourseAdapter;
            this.itemView = itemView;
            View viewFindViewById = itemView.findViewById(xri.course_series_des);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.courseSeriesDes = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(xri.course_series_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.courseSeriesName = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(xri.y0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.courseRecycler = (RecyclerView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(xri.b5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.rightArrow = (ImageView) viewFindViewById4;
            this.text_group = itemView.findViewById(xri.j7);
            View viewFindViewById5 = itemView.findViewById(xri.T2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.ivTabSeriesTop = (ImageView) viewFindViewById5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(CourseViewHolder this$0, CourseSeriesData courseSeriesDataModel, ImageView it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(courseSeriesDataModel, "$courseSeriesDataModel");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.clickToSeries(courseSeriesDataModel);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$1(CourseViewHolder this$0, CourseSeriesData courseSeriesDataModel, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(courseSeriesDataModel, "$courseSeriesDataModel");
            this$0.clickToSeries(courseSeriesDataModel);
            return Unit.INSTANCE;
        }

        private final void clickToSeries(CourseSeriesData courseSeriesDataModel) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Series"), TuplesKt.to("tip", "56.0.0.0.40467"), TuplesKt.to("area", 1), TuplesKt.to("asset_id", String.valueOf(courseSeriesDataModel.getId())), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseSeriesDataModel.getName())));
            CourseApi courseApi = CourseApiKt.getCourseApi();
            Long id = courseSeriesDataModel.getId();
            courseApi.goSeriesInfoPage(id != null ? id.longValue() : 0L);
        }

        public final void bindData(@NotNull final CourseSeriesData courseSeriesDataModel) {
            Intrinsics.checkNotNullParameter(courseSeriesDataModel, "courseSeriesDataModel");
            this.courseSeriesName.setText(courseSeriesDataModel.getName());
            Context context = this.courseSeriesDes.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i = zxi.g;
            Integer trainedCount = courseSeriesDataModel.getTrainedCount();
            int iIntValue = trainedCount != null ? trainedCount.intValue() : 0;
            Integer trainedCount2 = courseSeriesDataModel.getTrainedCount();
            String quantityString = ResourceExtKt.getQuantityString(context, i, iIntValue, Integer.valueOf(trainedCount2 != null ? trainedCount2.intValue() : 0));
            Context context2 = this.courseSeriesDes.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i2 = zxi.f;
            Integer itemsCount = courseSeriesDataModel.getItemsCount();
            int iIntValue2 = itemsCount != null ? itemsCount.intValue() : 0;
            Integer itemsCount2 = courseSeriesDataModel.getItemsCount();
            this.courseSeriesDes.setText(ResourceExtKt.getString(c1j.W0, quantityString, ResourceExtKt.getQuantityString(context2, i2, iIntValue2, Integer.valueOf(itemsCount2 != null ? itemsCount2.intValue() : 0))));
            ViewExtKt.clickWithTrigger$default(this.rightArrow, 0L, new Function1() { // from class: kwl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SerialCourseAdapter.CourseViewHolder.bindData$lambda$0(this.f24375a, courseSeriesDataModel, (ImageView) obj);
                }
            }, 1, null);
            this.rightArrow.setContentDescription(courseSeriesDataModel.getName());
            ViewExtKt.clickWithTrigger$default(this.text_group, 0L, new Function1() { // from class: lwl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SerialCourseAdapter.CourseViewHolder.bindData$lambda$1(this.f25501a, courseSeriesDataModel, (View) obj);
                }
            }, 1, null);
            CourseCardAdapter courseCardAdapter = new CourseCardAdapter();
            this.courseRecycler.setAdapter(courseCardAdapter);
            RecyclerView.s sVar = this.scrollListener;
            if (sVar != null) {
                this.courseRecycler.removeOnScrollListener(sVar);
            }
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            final Ref.IntRef intRef = new Ref.IntRef();
            RecyclerView.s sVar2 = new RecyclerView.s() { // from class: com.xiaomi.fitness.sport.sporttab.recycler.SerialCourseAdapter$CourseViewHolder$bindData$4
                @Override // androidx.recyclerview.widget.RecyclerView.s
                public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                    Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                    super.onScrollStateChanged(recyclerView, newState);
                    if (newState != 0) {
                        if (newState == 1) {
                            if (intRef.element < 0) {
                                booleanRef.element = false;
                                return;
                            }
                            return;
                        } else {
                            if (newState == 2 && intRef.element < 0) {
                                booleanRef.element = false;
                                return;
                            }
                            return;
                        }
                    }
                    if (!booleanRef2.element || intRef.element <= 0) {
                        return;
                    }
                    Integer itemsCount3 = courseSeriesDataModel.getItemsCount();
                    if ((itemsCount3 != null ? itemsCount3.intValue() : 0) <= CourseCardAdapter.INSTANCE.getMAX_SHOW_NUM() || !booleanRef.element) {
                        booleanRef.element = true;
                        return;
                    }
                    OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("connect_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Series"), TuplesKt.to("tip", "56.0.0.0.40468"), TuplesKt.to("area", 1), TuplesKt.to("asset_id", String.valueOf(courseSeriesDataModel.getId())), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseSeriesDataModel.getName())));
                    CourseApi courseApi = CourseApiKt.getCourseApi();
                    Long id = courseSeriesDataModel.getId();
                    courseApi.goSeriesInfoPage(id != null ? id.longValue() : 0L);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.s
                public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                    Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                    super.onScrolled(recyclerView, dx, dy);
                    intRef.element = dx;
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    if (linearLayoutManager.findLastCompletelyVisibleItemPosition() != linearLayoutManager.getItemCount() - 1 || dx <= 0) {
                        booleanRef2.element = false;
                    } else {
                        booleanRef2.element = true;
                    }
                }
            };
            this.scrollListener = sVar2;
            RecyclerView recyclerView = this.courseRecycler;
            Intrinsics.checkNotNull(sVar2);
            recyclerView.addOnScrollListener(sVar2);
            courseCardAdapter.bindData(courseSeriesDataModel);
            ItemDecorationExtKt.clearAllItemDecorations(this.courseRecycler);
            this.courseRecycler.addItemDecoration(new HorizontalCardListItemDecoration(courseCardAdapter.getCount(), ExtensionsKt.getDp(12), ExtensionsKt.getDp(10)));
            Long id = courseSeriesDataModel.getId();
            this.ivTabSeriesTop.setTag(new TrackContentBean(id != null ? id.toString() : null, false, "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "Class_Series"), TuplesKt.to("tip", "56.108.0.1.40466"), TuplesKt.to("area", 1), TuplesKt.to("asset_id", String.valueOf(courseSeriesDataModel.getId())), TuplesKt.to(OneTrack.Param.ASSET_NAME, courseSeriesDataModel.getName())), 0.0f, 16, null));
        }

        @NotNull
        public final View getItemView() {
            return this.itemView;
        }
    }

    public SerialCourseAdapter(@NotNull Function0<Unit> retryAction) {
        Intrinsics.checkNotNullParameter(retryAction, "retryAction");
        this.retryAction = retryAction;
        this.mSeriesList = new ArrayList();
    }

    public final void bindData(@NotNull List<CourseSeriesData> seriesList) {
        Intrinsics.checkNotNullParameter(seriesList, "seriesList");
        this.mSeriesList.clear();
        this.mSeriesList.addAll(seriesList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mSeriesList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.mSeriesList.get(position).isError() ? 2 : 1;
    }

    @NotNull
    public final Function0<Unit> getRetryAction() {
        return this.retryAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof CourseViewHolder) {
            ((CourseViewHolder) holder).bindData(this.mSeriesList.get(position));
        }
        if (holder instanceof CourseErrorViewHolder) {
            ((CourseErrorViewHolder) holder).bind();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.e1, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new CourseViewHolder(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(dvi.f1, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new CourseErrorViewHolder(this, viewInflate2);
    }
}
