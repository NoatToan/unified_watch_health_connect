package com.huami.treadmill.ui.record;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.data.TdTrackrecord;
import com.huami.treadmill.ext.ViewExtKt;
import com.huami.treadmill.ui.record.TdRecordAdapter;
import com.huami.treadmill.ui.tdmillhome.TdmillHmFragment;
import com.huami.treadmill.util.DataFormatter;
import com.huami.treadmill.util.TimeUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00013B\u0007¢\u0006\u0004\b0\u00101B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b0\u00102J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0012\u001a\u00020\u00062\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0016R\"\u0010\u001b\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R6\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00064"}, d2 = {"Lcom/huami/treadmill/ui/record/TdRecordAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/treadmill/ui/record/TdRecordAdapter$RecordViewHolder;", "", "Lcom/huami/treadmill/data/TdTrackrecord;", "uploadList", "", "removeUploadedData", "tdRecord", "removeDeleteData", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "Landroid/view/View$OnLongClickListener;", "l", "onLongClickItem", "Landroid/view/View$OnClickListener;", "onClickItemListener", "", "a", "Z", TdmillHmFragment.ARG_IS_METRIC, "()Z", "setMetric", "(Z)V", "b", "Landroid/view/View$OnLongClickListener;", "c", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/huami/treadmill/ui/record/RecordViewModel;", GoogleApiAvailabilityLight.a, "Lcom/huami/treadmill/ui/record/RecordViewModel;", "viewModel", "value", "e", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data", "<init>", "()V", "(Lcom/huami/treadmill/ui/record/RecordViewModel;)V", "RecordViewHolder", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdRecordAdapter extends RecyclerView.Adapter<RecordViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isMetric;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View.OnLongClickListener l;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener listener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private RecordViewModel viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private List<TdTrackrecord> data;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR%\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\n0\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000eR%\u0010\u001a\u001a\n \u0013*\u0004\u0018\u00010\u00170\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0018\u0010\u0019R%\u0010\u001e\u001a\n \u0013*\u0004\u0018\u00010\u001b0\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/huami/treadmill/ui/record/TdRecordAdapter$RecordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/treadmill/data/TdTrackrecord;", "tdRecord", "", "bindData", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/widget/TextView;", "b", "Lkotlin/Lazy;", "h", "()Landroid/widget/TextView;", "dis", "c", "g", "date", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "i", "useTime", "Landroid/widget/CheckBox;", "e", "()Landroid/widget/CheckBox;", "checkbox", "Landroid/widget/FrameLayout;", "f", "()Landroid/widget/FrameLayout;", "checkboxArea", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/treadmill/ui/record/TdRecordAdapter;Landroid/view/View;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public final class RecordViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Lazy dis;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Lazy date;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Lazy useTime;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final Lazy checkbox;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final Lazy checkboxArea;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<View, Unit> {
            public final /* synthetic */ TdRecordAdapter a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TdRecordAdapter tdRecordAdapter) {
                super(1);
                this.a = tdRecordAdapter;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull View view) {
                View.OnClickListener onClickListener = this.a.listener;
                if (onClickListener == null) {
                    return;
                }
                onClickListener.onClick(view);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/CheckBox;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<CheckBox> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CheckBox invoke() {
                return (CheckBox) this.a.findViewById(R.id.td_checkbox);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<FrameLayout> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FrameLayout invoke() {
                return (FrameLayout) this.a.findViewById(R.id.checkbox_area);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.td_date);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.td_run_dis);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.td_user_time);
            }
        }

        public RecordViewHolder(View view) {
            super(view);
            this.context = view.getContext();
            this.dis = LazyKt__LazyJVMKt.lazy(new e(view));
            this.date = LazyKt__LazyJVMKt.lazy(new d(view));
            this.useTime = LazyKt__LazyJVMKt.lazy(new f(view));
            this.checkbox = LazyKt__LazyJVMKt.lazy(new b(view));
            this.checkboxArea = LazyKt__LazyJVMKt.lazy(new c(view));
            f().setOnClickListener(new View.OnClickListener() { // from class: hl7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TdRecordAdapter.RecordViewHolder.c(this.a, tdRecordAdapter, view2);
                }
            });
            ViewExtKt.smartClick(view, 1000L, new a(TdRecordAdapter.this));
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: il7
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return TdRecordAdapter.RecordViewHolder.d(tdRecordAdapter, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(RecordViewHolder recordViewHolder, TdRecordAdapter tdRecordAdapter, View view) {
            int iIntValue;
            Integer numValueOf;
            Object tag = view.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.treadmill.data.TdTrackrecord");
            recordViewHolder.e().setChecked(!recordViewHolder.e().isChecked());
            ((TdTrackrecord) tag).setChecked(recordViewHolder.e().isChecked());
            boolean zIsChecked = recordViewHolder.e().isChecked();
            if (zIsChecked) {
                RecordViewModel recordViewModel = tdRecordAdapter.viewModel;
                Objects.requireNonNull(recordViewModel);
                Integer value = recordViewModel.getSelectNum().getValue();
                numValueOf = value == null ? null : Integer.valueOf(value.intValue() + 1);
            } else {
                if (zIsChecked) {
                    throw new NoWhenBranchMatchedException();
                }
                RecordViewModel recordViewModel2 = tdRecordAdapter.viewModel;
                Objects.requireNonNull(recordViewModel2);
                if (recordViewModel2.getSelectNum().getValue().intValue() > 0) {
                    RecordViewModel recordViewModel3 = tdRecordAdapter.viewModel;
                    Objects.requireNonNull(recordViewModel3);
                    iIntValue = recordViewModel3.getSelectNum().getValue().intValue() - 1;
                } else {
                    iIntValue = 0;
                }
                numValueOf = Integer.valueOf(iIntValue);
            }
            if (numValueOf == null) {
                return;
            }
            int iIntValue2 = numValueOf.intValue();
            RecordViewModel recordViewModel4 = tdRecordAdapter.viewModel;
            Objects.requireNonNull(recordViewModel4);
            recordViewModel4.setSelectNum(iIntValue2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(TdRecordAdapter tdRecordAdapter, View view) {
            View.OnLongClickListener onLongClickListener = tdRecordAdapter.l;
            if (onLongClickListener == null) {
                return false;
            }
            return onLongClickListener.onLongClick(view);
        }

        private final CheckBox e() {
            return (CheckBox) this.checkbox.getValue();
        }

        private final FrameLayout f() {
            return (FrameLayout) this.checkboxArea.getValue();
        }

        private final TextView g() {
            return (TextView) this.date.getValue();
        }

        private final TextView h() {
            return (TextView) this.dis.getValue();
        }

        private final TextView i() {
            return (TextView) this.useTime.getValue();
        }

        public final void bindData(@NotNull TdTrackrecord tdRecord) {
            DataFormatter dataFormatter = DataFormatter.INSTANCE;
            String[] formatDisAndUnit = dataFormatter.getFormatDisAndUnit(tdRecord.getTrackrecord().getDistance().intValue(), 25, TdRecordAdapter.this.getIsMetric(), false);
            if (formatDisAndUnit.length > 1) {
                TextView textViewH = h();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                textViewH.setText(String.format(this.context.getString(R.string.tdmill_format_rd_dis), Arrays.copyOf(new Object[]{formatDisAndUnit[0], this.context.getString(Integer.parseInt(formatDisAndUnit[1]))}, 2)));
            }
            g().setText(TimeUtils.INSTANCE.formatDateTime_ydhm(this.context, new Date(tdRecord.getTrackrecord().getTrackid().longValue() * ((long) 1000))));
            i().setText(dataFormatter.getConsumeTime(tdRecord.getTrackrecord().getCosttime().intValue()));
            e().setChecked(tdRecord.isChecked());
            f().setTag(tdRecord);
            this.itemView.setTag(tdRecord);
        }
    }

    public TdRecordAdapter() {
        this.data = new ArrayList();
    }

    @NotNull
    public final List<TdTrackrecord> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.data.size();
    }

    /* JADX INFO: renamed from: isMetric, reason: from getter */
    public final boolean getIsMetric() {
        return this.isMetric;
    }

    public final void onClickItemListener(@NotNull View.OnClickListener l) {
        this.listener = l;
    }

    public final void onLongClickItem(@NotNull View.OnLongClickListener l) {
        this.l = l;
    }

    public final void removeDeleteData(@NotNull TdTrackrecord tdRecord) {
        int iIndexOf = this.data.indexOf(tdRecord);
        if (iIndexOf > -1) {
            this.data.remove(iIndexOf);
            notifyItemRemoved(iIndexOf);
        }
    }

    public final void removeUploadedData(@NotNull List<TdTrackrecord> uploadList) {
        IntRange intRangeUntil = e.until(0, uploadList.size());
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            int i = last - 1;
            int iIndexOf = this.data.indexOf(uploadList.get(last));
            if (iIndexOf > -1) {
                this.data.remove(iIndexOf);
                notifyItemRemoved(iIndexOf);
            }
            if (last == first) {
                return;
            } else {
                last = i;
            }
        }
    }

    public final void setData(@NotNull List<TdTrackrecord> list) {
        this.data.clear();
        this.data.addAll(list);
        notifyDataSetChanged();
    }

    public final void setMetric(boolean z) {
        this.isMetric = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecordViewHolder holder, int position) {
        holder.bindData(this.data.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecordViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new RecordViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_td_record, parent, false));
    }

    public TdRecordAdapter(@NotNull RecordViewModel recordViewModel) {
        this();
        this.viewModel = recordViewModel;
    }
}
