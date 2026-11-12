package com.huami.sleep.sleepstatefeel.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.sleep.model.DataConstant;
import com.huami.sleep.sleepstatefeel.ui.SleepBehFeelAdapter;
import com.huami.sleep.sleepstatefeel.vo.SleepStateFeelVo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u0015\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\"\u0010\u0013\u001a\u00020\u000b2\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u0011J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR-\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0010j\b\u0012\u0004\u0012\u00020\r`\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/SleepBehFeelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "feelId", "updateFeeling", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "states", "updateState", "Lcom/huami/sleep/sleepstatefeel/ui/SleepBehFeelAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "", "Lcom/huami/sleep/sleepstatefeel/vo/SleepStateFeelVo;", "a", "Ljava/util/List;", "dataList", "b", "Lkotlin/Lazy;", "()Ljava/util/ArrayList;", "mSelectedList", "c", "Lcom/huami/sleep/sleepstatefeel/ui/SleepBehFeelAdapter$OnItemClickListener;", "mListener", "<init>", "(Ljava/util/List;)V", "OnItemClickListener", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepBehFeelAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<SleepStateFeelVo> dataList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSelectedList = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private OnItemClickListener mListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/SleepBehFeelAdapter$OnItemClickListener;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "selectedList", "", "onSelected", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public interface OnItemClickListener {
        void onSelected(@NotNull ArrayList<String> selectedList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ArrayList<String>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<String> invoke() {
            return new ArrayList<>();
        }
    }

    public SleepBehFeelAdapter(@NotNull List<SleepStateFeelVo> list) {
        this.dataList = list;
    }

    private final ArrayList<String> b() {
        return (ArrayList) this.mSelectedList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(SleepBehFeelAdapter sleepBehFeelAdapter, SleepStateFeelVo sleepStateFeelVo, int i, View view) {
        if (sleepBehFeelAdapter.b().contains(sleepStateFeelVo.getId())) {
            sleepBehFeelAdapter.b().remove(sleepStateFeelVo.getId());
            sleepStateFeelVo.setSelected(false);
            sleepBehFeelAdapter.notifyItemChanged(i);
            OnItemClickListener onItemClickListener = sleepBehFeelAdapter.mListener;
            if (onItemClickListener == null) {
                return;
            }
            onItemClickListener.onSelected(sleepBehFeelAdapter.b());
            return;
        }
        if (Intrinsics.areEqual(sleepStateFeelVo.getType(), DataConstant.TYPE_SLEEP_FEEL)) {
            sleepBehFeelAdapter.updateFeeling(sleepStateFeelVo.getId());
        } else {
            sleepBehFeelAdapter.b().add(sleepStateFeelVo.getId());
            sleepStateFeelVo.setSelected(true);
            sleepBehFeelAdapter.notifyDataSetChanged();
        }
        OnItemClickListener onItemClickListener2 = sleepBehFeelAdapter.mListener;
        if (onItemClickListener2 == null) {
            return;
        }
        onItemClickListener2.onSelected(sleepBehFeelAdapter.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof SleepBehFeelHolder) {
            final SleepStateFeelVo sleepStateFeelVo = this.dataList.get(position);
            ((SleepBehFeelHolder) holder).bindTo(sleepStateFeelVo);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: mz6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepBehFeelAdapter.c(this.a, sleepStateFeelVo, position, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new SleepBehFeelHolder(parent);
    }

    public final void setListener(@NotNull OnItemClickListener listener) {
        this.mListener = listener;
    }

    public final void updateFeeling(@Nullable String feelId) {
        ArrayList<String> arrayListB = b();
        arrayListB.clear();
        arrayListB.add(feelId == null ? "0" : feelId);
        int i = 0;
        int size = this.dataList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                this.dataList.get(i).setSelected(Intrinsics.areEqual(this.dataList.get(i).getId(), feelId));
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        notifyDataSetChanged();
    }

    public final void updateState(@Nullable ArrayList<String> states) {
        ArrayList<String> arrayListB = b();
        arrayListB.clear();
        if (states != null) {
            arrayListB.addAll(states);
        }
        int i = 0;
        int size = this.dataList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                this.dataList.get(i).setSelected(b().contains(this.dataList.get(i).getId()));
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        notifyDataSetChanged();
    }
}
