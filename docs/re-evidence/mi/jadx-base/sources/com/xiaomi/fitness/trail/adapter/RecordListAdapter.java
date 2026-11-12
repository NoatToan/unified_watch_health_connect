package com.xiaomi.fitness.trail.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.data.common.data.annotation.FitnessSportType;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRes;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.api.SportSummaryApi;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.data.DivingOutInPosition;
import com.xiaomi.fit.fitness.parser.data.DivingPosition;
import com.xiaomi.fit.fitness.parser.data.OneDivingIdReport;
import com.xiaomi.fitness.SportRecordExKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.viewbinding.LazyViewBindingProperty;
import com.xiaomi.fitness.common.viewbinding.ViewBindingProperty;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.request.SportHttpRequest;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.trail.adapter.RecordListAdapter;
import com.xiaomi.fitness.trail.data.RecordUtilKt;
import com.xiaomi.fitness.trail.data.ValueType;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import defpackage.byi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.lp5;
import defpackage.lpp;
import defpackage.lqp;
import defpackage.nuf;
import defpackage.pz6;
import defpackage.tjg;
import defpackage.vop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004WXYZBM\u0012\u0006\u0010T\u001a\u00020S\u0012\u0006\u0010/\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000201\u0012\b\b\u0002\u00105\u001a\u00020\u0006\u0012\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r07¢\u0006\u0004\bU\u0010VJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J%\u0010$\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J'\u0010)\u001a\u00020\r2\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\r0&¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R#\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u001c\u0010C\u001a\n B*\u0004\u0018\u00010A0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR*\u0010H\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\r\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00160J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR(\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100P0O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006["}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/RecordListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "prev", "curt", "", "isNotInSameMonthWithPrevRecord", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)Z", "", "list", "containsDivingReport", "(Ljava/util/List;)Z", "", "convertDataForUi", "()V", "", "category", "setCategory", "(Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, "setData", "(Ljava/util/List;Landroidx/lifecycle/LifecycleOwner;)V", "Lkotlin/Function2;", "Landroid/view/View;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnLongClickListener", "(Lkotlin/jvm/functions/Function2;)V", "Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "summaryApi", "setSummaryApi", "(Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;)V", "timeDim", "Ljava/lang/String;", "", StatConstants.PARAM_START, "J", StatConstants.PARAM_END, "isExpandedState", "Z", "Lkotlin/Function1;", "itemClick", "Lkotlin/jvm/functions/Function1;", "getItemClick", "()Lkotlin/jvm/functions/Function1;", "Lcom/xiaomi/fit/fitness/export/api/SportSummaryApi;", "", "data", "Ljava/util/List;", "convertedData", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "Lcom/xiaomi/fitness/trail/adapter/RecordChartHolder;", "chartHolder", "Lcom/xiaomi/fitness/trail/adapter/RecordChartHolder;", "longClickListener", "Lkotlin/jvm/functions/Function2;", "", "separatorIndexInAdapterSet", "Ljava/util/Set;", "placeholderIndexInAdapter", "I", "Landroidx/lifecycle/MutableLiveData;", "", "mDivePointDetailMapLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJZLkotlin/jvm/functions/Function1;)V", "Companion", "SportRecordPlaceholderViewHolder", "MonthSeparatorViewHolder", "RecordListHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRecordListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordListAdapter.kt\ncom/xiaomi/fitness/trail/adapter/RecordListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,418:1\n1863#2,2:419\n1557#2:421\n1628#2,3:422\n1863#2,2:425\n*S KotlinDebug\n*F\n+ 1 RecordListAdapter.kt\ncom/xiaomi/fitness/trail/adapter/RecordListAdapter\n*L\n197#1:419,2\n246#1:421\n246#1:422,3\n257#1:425,2\n*E\n"})
public final class RecordListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int TYPE_BAR_CHART_VIEW = 0;
    public static final int TYPE_MONTH_SEPARATOR = 2;
    public static final int TYPE_RECORD_ITEM = 1;
    public static final int TYPE_RECORD_PLACEHOLDER = 3;

    @NotNull
    private String category;

    @Nullable
    private RecordChartHolder chartHolder;

    @NotNull
    private final List<SportBasicReport> convertedData;

    @NotNull
    private final List<SportBasicReport> data;
    private final long end;
    private final LayoutInflater inflater;
    private final boolean isExpandedState;

    @NotNull
    private final Function1<SportBasicReport, Unit> itemClick;

    @Nullable
    private Function2<? super SportBasicReport, ? super View, Unit> longClickListener;

    @NotNull
    private MutableLiveData<Map<Integer, String>> mDivePointDetailMapLiveData;
    private int placeholderIndexInAdapter;

    @NotNull
    private Set<Integer> separatorIndexInAdapterSet;
    private final long start;
    private SportSummaryApi summaryApi;

    @NotNull
    private final String timeDim;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/RecordListAdapter$MonthSeparatorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "report", "", "bind", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Llqp;", "kotlin.jvm.PlatformType", "binding$delegate", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "getBinding", "()Llqp;", "binding", "<init>", "(Lcom/xiaomi/fitness/trail/adapter/RecordListAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRecordListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordListAdapter.kt\ncom/xiaomi/fitness/trail/adapter/RecordListAdapter$MonthSeparatorViewHolder\n+ 2 ViewHolderBindings.kt\ncom/xiaomi/fitness/common/viewbinding/ViewHolderBindings\n*L\n1#1,418:1\n24#2,5:419\n*S KotlinDebug\n*F\n+ 1 RecordListAdapter.kt\ncom/xiaomi/fitness/trail/adapter/RecordListAdapter$MonthSeparatorViewHolder\n*L\n328#1:419,5\n*E\n"})
    public final class MonthSeparatorViewHolder extends RecyclerView.d0 {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MonthSeparatorViewHolder.class, "binding", "getBinding()Lcom/xiaomi/fitness/trail/databinding/TrailSportRecordMonthSeparatorBinding;", 0))};

        /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
        @NotNull
        private final ViewBindingProperty binding;
        final /* synthetic */ RecordListAdapter this$0;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MonthSeparatorViewHolder(@NotNull RecordListAdapter recordListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = recordListAdapter;
            this.view = view;
            this.binding = new LazyViewBindingProperty(new Function1<MonthSeparatorViewHolder, lqp>() { // from class: com.xiaomi.fitness.trail.adapter.RecordListAdapter$MonthSeparatorViewHolder$special$$inlined$viewBinding$default$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final lqp invoke2(RecordListAdapter.MonthSeparatorViewHolder viewHolder) {
                    Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                    return lqp.A0(viewHolder.itemView);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final lqp getBinding() {
            return (lqp) this.binding.getValue(this, $$delegatedProperties[0]);
        }

        public final void bind(@Nullable SportBasicReport report) {
            if (report == null) {
                return;
            }
            getBinding().A.setText(TimeDateUtil.getDateYYYYMMLocalFormat(new LocalDate(report.getStartTime() * 1000)));
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/RecordListAdapter$RecordListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "report", "", "bind", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Llpp;", "kotlin.jvm.PlatformType", "binding$delegate", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "getBinding", "()Llpp;", "binding", "<init>", "(Lcom/xiaomi/fitness/trail/adapter/RecordListAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRecordListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordListAdapter.kt\ncom/xiaomi/fitness/trail/adapter/RecordListAdapter$RecordListHolder\n+ 2 ViewHolderBindings.kt\ncom/xiaomi/fitness/common/viewbinding/ViewHolderBindings\n*L\n1#1,418:1\n24#2,5:419\n*S KotlinDebug\n*F\n+ 1 RecordListAdapter.kt\ncom/xiaomi/fitness/trail/adapter/RecordListAdapter$RecordListHolder\n*L\n337#1:419,5\n*E\n"})
    public final class RecordListHolder extends RecyclerView.d0 {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecordListHolder.class, "binding", "getBinding()Lcom/xiaomi/fitness/trail/databinding/TrailItemBinding;", 0))};

        /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
        @NotNull
        private final ViewBindingProperty binding;
        final /* synthetic */ RecordListAdapter this$0;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecordListHolder(@NotNull RecordListAdapter recordListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = recordListAdapter;
            this.view = view;
            this.binding = new LazyViewBindingProperty(new Function1<RecordListHolder, lpp>() { // from class: com.xiaomi.fitness.trail.adapter.RecordListAdapter$RecordListHolder$special$$inlined$viewBinding$default$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final lpp invoke2(RecordListAdapter.RecordListHolder viewHolder) {
                    Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                    return lpp.A0(viewHolder.itemView);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final lpp getBinding() {
            return (lpp) this.binding.getValue(this, $$delegatedProperties[0]);
        }

        public final void bind(@Nullable SportBasicReport report) {
            String string;
            if (report == null) {
                return;
            }
            SportRes sportRes = FitnessSportType.INSTANCE.getSportRes(report.getSportType());
            TextView textView = getBinding().G;
            String courseName = report.getCourseName();
            textView.setText((courseName == null || courseName.length() == 0) ? sportRes.getName() : report.getCourseName());
            int iA = lp5.a(report);
            TextView textView2 = getBinding().G;
            String courseName2 = report.getCourseName();
            textView2.setText((courseName2 == null || courseName2.length() == 0) ? lp5.c(iA) : report.getCourseName());
            getBinding().D.setImageResource(sportRes.getIcon() != 0 ? sportRes.getIcon() : 0);
            TextView desView = getBinding().C;
            Intrinsics.checkNotNullExpressionValue(desView, "desView");
            ViewExtKt.gone(desView);
            Integer skipCount = report.getSkipCount();
            if (skipCount == null || skipCount.intValue() <= 0) {
                Integer gymTrainingTotalTimes = report.getGymTrainingTotalTimes();
                if (gymTrainingTotalTimes != null && gymTrainingTotalTimes.intValue() > 0) {
                    TextView infoView = getBinding().E;
                    Intrinsics.checkNotNullExpressionValue(infoView, "infoView");
                    String strValueOf = String.valueOf(report.getGymTrainingTotalTimes());
                    Resources resources = this.view.getContext().getResources();
                    int i = byi.v;
                    Integer gymTrainingTotalTimes2 = report.getGymTrainingTotalTimes();
                    Intrinsics.checkNotNull(gymTrainingTotalTimes2);
                    String quantityString = resources.getQuantityString(i, gymTrainingTotalTimes2.intValue(), "");
                    Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                    Integer calories = report.getCalories();
                    int iIntValue = calories != null ? calories.intValue() : 0;
                    Resources resources2 = this.view.getContext().getResources();
                    int i2 = byi.common_unit_calorie;
                    Integer calories2 = report.getCalories();
                    Intrinsics.checkNotNull(calories2);
                    String quantityString2 = resources2.getQuantityString(i2, calories2.intValue());
                    Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                    RecordUtilKt.setSportsPluginsFormat(infoView, strValueOf, quantityString, iIntValue, quantityString2, report.getDuration(), 13);
                } else if (report.getDistance() > 0) {
                    Integer correctedDistance = report.getCorrectedDistance();
                    Integer distance = (correctedDistance == null || correctedDistance.intValue() <= 0) ? report.getDistance() : report.getCorrectedDistance();
                    TextView infoView2 = getBinding().E;
                    Intrinsics.checkNotNullExpressionValue(infoView2, "infoView");
                    String strE = pz6.e(distance != null ? distance.intValue() : 0);
                    Intrinsics.checkNotNullExpressionValue(strE, "getDistanceStrWithoutUnit(...)");
                    String strG = pz6.g(distance != null ? distance.intValue() : 0);
                    Intrinsics.checkNotNullExpressionValue(strG, "getDistanceUnit(...)");
                    RecordUtilKt.setDataFormat(infoView2, strE, strG, 12);
                } else {
                    Float maxDivingDepth = report.getMaxDivingDepth();
                    if ((maxDivingDepth != null ? maxDivingDepth.floatValue() : 0.0f) > 0.0f) {
                        String string2 = ApplicationExtKt.getApplication().getString(j1j.I1);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        getBinding().E.setText(SportRecordExKt.buildSpanWithUnit$default(report.getMaxDivingDepth() + string2, string2, 0.0f, 4, null));
                        TextView desView2 = getBinding().C;
                        Intrinsics.checkNotNullExpressionValue(desView2, "desView");
                        ViewExtKt.visible(desView2);
                        TextView textView3 = getBinding().C;
                        Map map = (Map) this.this$0.mDivePointDetailMapLiveData.getValue();
                        if (map == null || (string = (String) map.get(report.getDivingAreaId())) == null) {
                            string = ApplicationExtKt.getApplication().getString(j1j.Aa);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        }
                        textView3.setText(string);
                    } else {
                        TextView infoView3 = getBinding().E;
                        Intrinsics.checkNotNullExpressionValue(infoView3, "infoView");
                        RecordUtilKt.setDataStr$default(infoView3, ValueType.CALORIE.INSTANCE, String.valueOf(report.getCalories()), 12, 0, 16, null);
                    }
                }
            } else {
                TextView infoView4 = getBinding().E;
                Intrinsics.checkNotNullExpressionValue(infoView4, "infoView");
                String strValueOf2 = String.valueOf(report.getSkipCount());
                Resources resources3 = this.view.getContext().getResources();
                int i3 = byi.common_unit_rope_count;
                Integer skipCount2 = report.getSkipCount();
                Intrinsics.checkNotNull(skipCount2);
                String quantityString3 = resources3.getQuantityString(i3, skipCount2.intValue());
                Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
                RecordUtilKt.setDataFormat(infoView4, strValueOf2, quantityString3, 12);
            }
            getBinding().B.setText(TimeDateUtil.INSTANCE.getDateMMDDLocalFormat(report.getStartTime() * 1000));
            getBinding().A.setTag(report);
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/RecordListAdapter$SportRecordPlaceholderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "bind", "()V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Llpp;", "kotlin.jvm.PlatformType", "binding$delegate", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "getBinding", "()Llpp;", "binding", "<init>", "(Lcom/xiaomi/fitness/trail/adapter/RecordListAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRecordListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordListAdapter.kt\ncom/xiaomi/fitness/trail/adapter/RecordListAdapter$SportRecordPlaceholderViewHolder\n+ 2 ViewHolderBindings.kt\ncom/xiaomi/fitness/common/viewbinding/ViewHolderBindings\n*L\n1#1,418:1\n24#2,5:419\n*S KotlinDebug\n*F\n+ 1 RecordListAdapter.kt\ncom/xiaomi/fitness/trail/adapter/RecordListAdapter$SportRecordPlaceholderViewHolder\n*L\n321#1:419,5\n*E\n"})
    public final class SportRecordPlaceholderViewHolder extends RecyclerView.d0 {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SportRecordPlaceholderViewHolder.class, "binding", "getBinding()Lcom/xiaomi/fitness/trail/databinding/TrailItemBinding;", 0))};

        /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
        @NotNull
        private final ViewBindingProperty binding;
        final /* synthetic */ RecordListAdapter this$0;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportRecordPlaceholderViewHolder(@NotNull RecordListAdapter recordListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = recordListAdapter;
            this.view = view;
            this.binding = new LazyViewBindingProperty(new Function1<SportRecordPlaceholderViewHolder, lpp>() { // from class: com.xiaomi.fitness.trail.adapter.RecordListAdapter$SportRecordPlaceholderViewHolder$special$$inlined$viewBinding$default$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final lpp invoke2(RecordListAdapter.SportRecordPlaceholderViewHolder viewHolder) {
                    Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                    return lpp.A0(viewHolder.itemView);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final lpp getBinding() {
            return (lpp) this.binding.getValue(this, $$delegatedProperties[0]);
        }

        public final void bind() {
            View root = getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.invisible(root);
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    public /* synthetic */ RecordListAdapter(Context context, String str, String str2, long j, long j2, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, j, j2, (i & 32) != 0 ? false : z, function1);
    }

    private final boolean containsDivingReport(List<SportBasicReport> list) {
        for (SportBasicReport sportBasicReport : list) {
            if (sportBasicReport.getSportType() == 116 || sportBasicReport.getSportType() == 117 || sportBasicReport.getSportType() == 118) {
                return true;
            }
        }
        return false;
    }

    private final void convertDataForUi() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = this.data.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                z = false;
                break;
            }
            SportBasicReport sportBasicReport = this.data.get(i);
            if (i != 0 && isNotInSameMonthWithPrevRecord(this.data.get(i - 1), sportBasicReport)) {
                arrayList.addAll(this.data.subList(0, i));
                Logger.i("RecordListAdapter", "hasSplittingPoint list1 size=" + arrayList.size());
                List<SportBasicReport> list = this.data;
                arrayList2.addAll(list.subList(i, list.size()));
                Logger.i("RecordListAdapter", "hasSplittingPoint list2 size=" + arrayList2.size());
                z = true;
                break;
            }
            i++;
        }
        arrayList.add(0, this.data.get(0));
        this.separatorIndexInAdapterSet.add(1);
        Logger.i("RecordListAdapter", "convertDataForUi splittingPointIndexInData=" + i);
        if (!z) {
            arrayList.addAll(this.data);
        }
        if (z && arrayList.size() % 2 == 0 && this.isExpandedState) {
            arrayList.add(null);
            Logger.i("RecordListAdapter", "hasSplittingPoint && list1.size % 2 != 0 list1.size=" + arrayList.size());
            this.placeholderIndexInAdapter = arrayList.size();
        }
        this.convertedData.addAll(arrayList);
        if (!arrayList2.isEmpty()) {
            arrayList2.add(0, this.data.get(i));
            this.separatorIndexInAdapterSet.add(Integer.valueOf(arrayList.size() + 1));
            this.convertedData.addAll(arrayList2);
        }
        Logger.i("RecordListAdapter", "convertDataForUi separatorIndexInAdapterSet=" + this.separatorIndexInAdapterSet);
        Logger.i("RecordListAdapter", "convertDataForUi placeholderIndexInAdapter=" + this.placeholderIndexInAdapter);
    }

    private final boolean isNotInSameMonthWithPrevRecord(SportBasicReport prev, SportBasicReport curt) {
        return !TimeDateUtil.isSameMonth(new LocalDate(prev.getStartTime() * 1000), new LocalDate(curt.getStartTime() * 1000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$3(RecordListAdapter this$0, int i, RecyclerView.d0 holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Function2<? super SportBasicReport, ? super View, Unit> function2 = this$0.longClickListener;
        if (function2 == null) {
            return true;
        }
        SportBasicReport sportBasicReport = this$0.convertedData.get(i);
        Intrinsics.checkNotNull(sportBasicReport);
        function2.invoke(sportBasicReport, ((RecordListHolder) holder).getView());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$2(View view, RecordListAdapter this$0, View view2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fit.data.common.data.sport.SportBasicReport");
        this$0.itemClick.invoke2((SportBasicReport) tag);
        nuf.f(view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$7$lambda$5(SportBasicReport report, LifecycleOwner owner, final RecordListAdapter this$0, OneDivingIdReport it) {
        Intrinsics.checkNotNullParameter(report, "$report");
        Intrinsics.checkNotNullParameter(owner, "$owner");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        report.setDivingAreaId(Integer.valueOf(it.getDiveAreaId()));
        report.setDivingCountryId(Integer.valueOf(it.getDiveCountryId()));
        Logger.i("SportHttpRequest", "divingAreaId " + it.getDiveAreaId() + "  divingCountryId  " + it.getDiveCountryId());
        report.setRequestDivingId(Boolean.TRUE);
        if (report.getSid() != null) {
            FitnessDataRecorder fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
            String sid = report.getSid();
            Intrinsics.checkNotNull(sid);
            Integer entityOffsetTime = report.getEntityOffsetTime();
            fitnessDataExtKt.recordSportReport(sid, entityOffsetTime != null ? entityOffsetTime.intValue() : 0, report);
        }
        SportRecordApiKt.getSportRecordApi().getDivePointDetailMapLiveDataByIds(CollectionsKt__CollectionsJVMKt.listOf(report.getDivingAreaId())).observe(owner, new RecordListAdapterKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: f7k
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordListAdapter.setData$lambda$7$lambda$5$lambda$4(this.f17504a, (Map) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$7$lambda$5$lambda$4(RecordListAdapter this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mDivePointDetailMapLiveData.setValue(map);
        this$0.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$7$lambda$6(SportBasicReport report, String it) {
        Intrinsics.checkNotNullParameter(report, "$report");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i("SportHttpRequest", "error " + it);
        report.setRequestDivingId(Boolean.TRUE);
        if (report.getSid() != null) {
            FitnessDataRecorder fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
            String sid = report.getSid();
            Intrinsics.checkNotNull(sid);
            Integer entityOffsetTime = report.getEntityOffsetTime();
            fitnessDataExtKt.recordSportReport(sid, entityOffsetTime != null ? entityOffsetTime.intValue() : 0, report);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$9(RecordListAdapter this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mDivePointDetailMapLiveData.setValue(map);
        this$0.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    @NotNull
    public final Function1<SportBasicReport, Unit> getItemClick() {
        return this.itemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        if (this.convertedData.isEmpty()) {
            return 0;
        }
        return this.convertedData.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        }
        if (position == this.placeholderIndexInAdapter) {
            return 3;
        }
        return this.separatorIndexInAdapterSet.contains(Integer.valueOf(position)) ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final int i = position - 1;
        if (holder instanceof RecordChartHolder) {
            ((RecordChartHolder) holder).setData(this.data, this.category);
            Logger.i("RecordListAdapter", "onBindViewHolder position=" + position + " type=RecordChartHolder");
            return;
        }
        if (holder instanceof RecordListHolder) {
            Logger.i("RecordListAdapter", "onBindViewHolder position=" + position + " type=RecordListHolder");
            RecordListHolder recordListHolder = (RecordListHolder) holder;
            recordListHolder.bind(this.convertedData.get(i));
            recordListHolder.getView().setTag(this.convertedData.get(i));
            recordListHolder.getView().setOnLongClickListener(new View.OnLongClickListener() { // from class: a7k
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return RecordListAdapter.onBindViewHolder$lambda$3(this.f722a, i, holder, view);
                }
            });
            return;
        }
        if (holder instanceof MonthSeparatorViewHolder) {
            Logger.i("RecordListAdapter", "onBindViewHolder position=" + position + " type=MonthSeparatorViewHolder");
            ((MonthSeparatorViewHolder) holder).bind(this.convertedData.get(i));
            return;
        }
        if (holder instanceof SportRecordPlaceholderViewHolder) {
            ((SportRecordPlaceholderViewHolder) holder).bind();
            Logger.i("RecordListAdapter", "onBindViewHolder position=" + position + " type=SportRecordPlaceholderViewHolder");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType != 0) {
            if (viewType == 2) {
                View viewInflate = this.inflater.inflate(ivi.o2, parent, false);
                Intrinsics.checkNotNull(viewInflate);
                return new MonthSeparatorViewHolder(this, viewInflate);
            }
            if (viewType == 3) {
                View viewInflate2 = this.inflater.inflate(ivi.Y1, parent, false);
                Intrinsics.checkNotNull(viewInflate2);
                return new SportRecordPlaceholderViewHolder(this, viewInflate2);
            }
            final View viewInflate3 = this.inflater.inflate(ivi.Y1, parent, false);
            viewInflate3.setOnClickListener(new View.OnClickListener() { // from class: b7k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecordListAdapter.onCreateViewHolder$lambda$2(viewInflate3, this, view);
                }
            });
            Intrinsics.checkNotNull(viewInflate3);
            return new RecordListHolder(this, viewInflate3);
        }
        this.inflater.inflate(ivi.L1, parent, false);
        vop vopVarA0 = vop.A0(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(vopVarA0, "inflate(...)");
        RecordChartHolder recordChartHolder = new RecordChartHolder(vopVarA0, this.category, this.timeDim, this.start, this.end);
        this.chartHolder = recordChartHolder;
        SportSummaryApi sportSummaryApi = this.summaryApi;
        if (sportSummaryApi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("summaryApi");
            sportSummaryApi = null;
        }
        recordChartHolder.setSummaryApi(sportSummaryApi);
        recordChartHolder.setData(this.data, this.category);
        return recordChartHolder;
    }

    public final void setCategory(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.category = category;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(@NotNull List<SportBasicReport> list, @NotNull final LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.data.clear();
        List<SportBasicReport> list2 = list;
        this.data.addAll(list2);
        RecordChartHolder recordChartHolder = this.chartHolder;
        if (recordChartHolder != null) {
            recordChartHolder.setData(list, this.category);
        }
        this.convertedData.clear();
        if (!list2.isEmpty()) {
            convertDataForUi();
        }
        if (!containsDivingReport(list)) {
            notifyDataSetChanged();
            return;
        }
        if (!tjg.a(ApplicationExtKt.getApplication())) {
            notifyDataSetChanged();
            Logger.i("RecordListAdapter", "no net work");
            return;
        }
        List<SportBasicReport> list3 = list;
        for (final SportBasicReport sportBasicReport : list3) {
            if (sportBasicReport.getProtoType() == 25 && sportBasicReport.getDivingAreaId() == null && Intrinsics.areEqual(sportBasicReport.getRequestDivingId(), Boolean.FALSE)) {
                Float waterInletLatitude = sportBasicReport.getWaterInletLatitude();
                float fFloatValue = waterInletLatitude != null ? waterInletLatitude.floatValue() : 10000.0f;
                Float waterInletLongitude = sportBasicReport.getWaterInletLongitude();
                DivingPosition divingPosition = new DivingPosition(fFloatValue, waterInletLongitude != null ? waterInletLongitude.floatValue() : 10000.0f);
                Float waterOutletLatitude = sportBasicReport.getWaterOutletLatitude();
                float fFloatValue2 = waterOutletLatitude != null ? waterOutletLatitude.floatValue() : 10000.0f;
                Float waterOutletLongitude = sportBasicReport.getWaterOutletLongitude();
                new SportHttpRequest().getDivingIDData(new DivingOutInPosition(divingPosition, new DivingPosition(fFloatValue2, waterOutletLongitude != null ? waterOutletLongitude.floatValue() : 10000.0f)), new Function1() { // from class: c7k
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return RecordListAdapter.setData$lambda$7$lambda$5(sportBasicReport, owner, this, (OneDivingIdReport) obj);
                    }
                }, new Function1() { // from class: d7k
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return RecordListAdapter.setData$lambda$7$lambda$6(sportBasicReport, (String) obj);
                    }
                });
            }
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((SportBasicReport) it.next()).getDivingAreaId());
        }
        SportRecordApiKt.getSportRecordApi().getDivePointDetailMapLiveDataByIds(CollectionsKt___CollectionsKt.distinct(arrayList)).observe(owner, new RecordListAdapterKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: e7k
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordListAdapter.setData$lambda$9(this.f16346a, (Map) obj);
            }
        }));
    }

    public final void setOnLongClickListener(@NotNull Function2<? super SportBasicReport, ? super View, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.longClickListener = listener;
    }

    public final void setSummaryApi(@NotNull SportSummaryApi summaryApi) {
        Intrinsics.checkNotNullParameter(summaryApi, "summaryApi");
        this.summaryApi = summaryApi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecordListAdapter(@NotNull Context context, @NotNull String timeDim, @NotNull String category, long j, long j2, boolean z, @NotNull Function1<? super SportBasicReport, Unit> itemClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeDim, "timeDim");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(itemClick, "itemClick");
        this.timeDim = timeDim;
        this.category = category;
        this.start = j;
        this.end = j2;
        this.isExpandedState = z;
        this.itemClick = itemClick;
        this.data = new ArrayList();
        this.convertedData = new ArrayList();
        this.inflater = LayoutInflater.from(context);
        this.separatorIndexInAdapterSet = new LinkedHashSet();
        this.placeholderIndexInAdapter = -1;
        this.mDivePointDetailMapLiveData = new MutableLiveData<>();
    }
}
