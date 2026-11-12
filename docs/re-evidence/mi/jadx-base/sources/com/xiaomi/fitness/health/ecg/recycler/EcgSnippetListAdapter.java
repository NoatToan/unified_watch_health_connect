package com.xiaomi.fitness.health.ecg.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.h;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.ecg.recycler.EcgSnippetListAdapter;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002&'B7\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"¢\u0006\u0004\b$\u0010%J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetViewHolder;I)V", "Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter$OnItemClickListener;)V", "getCheckedReport", "()Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "", "showRadioBtn", "Z", "Landroid/widget/RadioGroup;", "radioGroup", "Landroid/widget/RadioGroup;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "mOnItemClickListener", "Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter$OnItemClickListener;", "checkedReport", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "<init>", "(ZLandroid/widget/RadioGroup;Landroidx/lifecycle/LifecycleCoroutineScope;Landroidx/recyclerview/widget/h$f;)V", "Companion", "OnItemClickListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcgSnippetListAdapter extends PagingDataAdapter<EcgMedicalItemReport, EcgSnippetViewHolder> {

    @NotNull
    public static final String TAG = "EcgSnippetListAdapter";

    @Nullable
    private EcgMedicalItemReport checkedReport;

    @Nullable
    private final LifecycleCoroutineScope coroutineScope;

    @Nullable
    private OnItemClickListener mOnItemClickListener;

    @Nullable
    private final RadioGroup radioGroup;
    private final boolean showRadioBtn;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/recycler/EcgSnippetListAdapter$OnItemClickListener;", "", "onClick", "", "ecgSnippet", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull EcgMedicalItemReport ecgSnippet);
    }

    public /* synthetic */ EcgSnippetListAdapter(boolean z, RadioGroup radioGroup, LifecycleCoroutineScope lifecycleCoroutineScope, h.f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : radioGroup, (i & 4) != 0 ? null : lifecycleCoroutineScope, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(EcgSnippetListAdapter this$0, EcgMedicalItemReport ecgMeasureRecord) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ecgMeasureRecord, "$ecgMeasureRecord");
        OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onClick(ecgMeasureRecord);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(EcgSnippetListAdapter this$0, EcgMedicalItemReport ecgMeasureRecord) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ecgMeasureRecord, "$ecgMeasureRecord");
        this$0.checkedReport = ecgMeasureRecord;
        Logger.d(TAG, "checkedReport=" + ecgMeasureRecord);
        return Unit.INSTANCE;
    }

    @Nullable
    public final EcgMedicalItemReport getCheckedReport() {
        return this.checkedReport;
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnItemClickListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcgSnippetListAdapter(boolean z, @Nullable RadioGroup radioGroup, @Nullable LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull h.f<EcgMedicalItemReport> diffCallback) {
        super(diffCallback, null, null, 6, null);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.showRadioBtn = z;
        this.radioGroup = radioGroup;
        this.coroutineScope = lifecycleCoroutineScope;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull EcgSnippetViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final EcgMedicalItemReport item = getItem(position);
        if (item == null) {
            return;
        }
        holder.bindData(item, position, this.showRadioBtn, this.radioGroup, this.coroutineScope, new Function0() { // from class: dc7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcgSnippetListAdapter.onBindViewHolder$lambda$0(this.f15362a, item);
            }
        }, new Function0() { // from class: ec7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcgSnippetListAdapter.onBindViewHolder$lambda$1(this.f16480a, item);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public EcgSnippetViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.n4, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new EcgSnippetViewHolder(viewInflate);
    }
}
