package com.huami.sleepassistant.lib.ui.base.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/base/viewholder/NetworkStateItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/android/vo/Resource;", "", "networkState", "bindTo", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "retryCallback", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class NetworkStateItemViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> retryCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/base/viewholder/NetworkStateItemViewHolder$Companion;", "", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function0;", "", "retryCallback", "Lcom/huami/sleepassistant/lib/ui/base/viewholder/NetworkStateItemViewHolder;", "create", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NetworkStateItemViewHolder create(@NotNull ViewGroup parent, @NotNull Function0<Unit> retryCallback) {
            return new NetworkStateItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.sls_layout_network_state, parent, false), retryCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            NetworkStateItemViewHolder.this.retryCallback.invoke();
        }
    }

    public NetworkStateItemViewHolder(@NotNull View view, @NotNull Function0<Unit> function0) {
        super(view);
        this.retryCallback = function0;
        ViewExKt.smartClick$default((FrameLayout) this.itemView.findViewById(R.id.retry_view), 0L, new a(), 1, null);
    }

    public final void bindTo(@Nullable Resource<Unit> networkState) {
        View view = this.itemView;
        ViewExKt.setVisible((LinearLayout) view.findViewById(R.id.loading_view), (networkState == null ? null : networkState.getStatus()) == Status.LOADING);
        int i = R.id.retry_view;
        ViewExKt.setVisible((FrameLayout) view.findViewById(i), (networkState == null ? null : networkState.getStatus()) == Status.ERROR);
        ViewExKt.setVisible((FrameLayout) view.findViewById(i), (networkState != null ? networkState.getMessage() : null) != null);
        ((TextView) view.findViewById(R.id.retry_text)).setText(view.getResources().getString(R.string.sls_error_tips));
    }
}
