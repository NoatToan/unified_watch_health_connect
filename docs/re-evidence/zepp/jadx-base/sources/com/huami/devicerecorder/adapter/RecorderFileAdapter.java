package com.huami.devicerecorder.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicerecorder.model.PageMode;
import com.huami.devicerecorder.model.PlayItemData;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0011\u0012\b\b\u0002\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b3\u0010!J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0014\u0010\u0010\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\tJ\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/huami/devicerecorder/adapter/RecorderFileAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/devicerecorder/adapter/ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "", "Lcom/huami/devicerecorder/model/PlayItemData;", "data", "setItems", "item", "removeItem", "clear", "position", "getItem", "holder", "onBindViewHolder", "onViewDetachedFromWindow", "onViewAttachedToWindow", "getItemViewType", "Lcom/huami/devicerecorder/model/PageMode;", "a", "Lcom/huami/devicerecorder/model/PageMode;", "getMode", "()Lcom/huami/devicerecorder/model/PageMode;", "setMode", "(Lcom/huami/devicerecorder/model/PageMode;)V", "mode", "Lcom/huami/devicerecorder/adapter/IItemClickListener;", "b", "Lcom/huami/devicerecorder/adapter/IItemClickListener;", "getListener", "()Lcom/huami/devicerecorder/adapter/IItemClickListener;", "setListener", "(Lcom/huami/devicerecorder/adapter/IItemClickListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "c", "Ljava/util/List;", "items", "Landroid/view/LayoutInflater;", GoogleApiAvailabilityLight.a, "Landroid/view/LayoutInflater;", "inflater", "<init>", "Companion", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class RecorderFileAdapter extends RecyclerView.Adapter<ViewHolder> {

    @NotNull
    private static final String e = "RecorderFileAdapter";
    private static final int f = 0;
    private static final int g = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private PageMode mode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private IItemClickListener listener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<PlayItemData> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private LayoutInflater inflater;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ RecorderFileAdapter b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, RecorderFileAdapter recorderFileAdapter) {
            super(0);
            this.a = i;
            this.b = recorderFileAdapter;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "get item error, position: " + this.a + "; count: " + this.b.getPagerCount();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "get item view type failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ RecorderFileAdapter b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, RecorderFileAdapter recorderFileAdapter) {
            super(0);
            this.a = i;
            this.b = recorderFileAdapter;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onBindViewHolder item is null; position is: " + this.a + ", size: " + this.b.getPagerCount();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecorderFileAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RecorderFileAdapter(PageMode pageMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PageMode.Normal : pageMode);
    }

    public final void clear() {
        this.items.clear();
    }

    @Nullable
    public final PlayItemData getItem(int position) {
        if (position < getPagerCount() && position >= 0) {
            return this.items.get(position);
        }
        HMLog.info("RecorderFileAdapter", new a(position, this));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        PlayItemData item = getItem(position);
        if (item != null) {
            return !item.getRecordFile().getHasSynced() ? 1 : 0;
        }
        HMLog.info("RecorderFileAdapter", new b(position));
        return 0;
    }

    @Nullable
    public final IItemClickListener getListener() {
        return this.listener;
    }

    @NotNull
    public final PageMode getMode() {
        return this.mode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.inflater = LayoutInflater.from(recyclerView.getContext());
    }

    public final void removeItem(@NotNull PlayItemData item) {
        this.items.remove(item);
    }

    public final void setItems(@NotNull List<PlayItemData> data) {
        this.items.clear();
        this.items.addAll(data);
    }

    public final void setListener(@Nullable IItemClickListener iItemClickListener) {
        this.listener = iItemClickListener;
    }

    public final void setMode(@NotNull PageMode pageMode) {
        this.mode = pageMode;
    }

    public RecorderFileAdapter(@NotNull PageMode pageMode) {
        this.mode = pageMode;
        this.items = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        PlayItemData item = getItem(position);
        if (item == null) {
            HMLog.info("RecorderFileAdapter", new c(position, this));
        } else {
            holder.onBind(item, this.mode);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            LayoutInflater layoutInflater = this.inflater;
            return new TransportedHolder(layoutInflater != null ? layoutInflater : null, parent, this.listener);
        }
        LayoutInflater layoutInflater2 = this.inflater;
        return new NotTransportedHolder(layoutInflater2 != null ? layoutInflater2 : null, parent, this.listener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.onViewAttachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NotNull ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.onViewDetachedFromWindow();
    }
}
