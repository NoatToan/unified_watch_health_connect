package com.xiaomi.fitness.widget.state.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.xiaomi.fitness.widget.state.StatusPage;
import com.xiaomi.fitness.widget.state.adapter.TextIconAdapter;
import defpackage.qvi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/widget/state/adapter/TextIconAdapter;", "Lcom/xiaomi/fitness/widget/state/StatusPage$Adapter;", "Lcom/xiaomi/fitness/widget/state/StatusPage$ViewHolder;", "textRes", "", "iconRes", "<init>", "(II)V", "getTextRes", "()I", "setTextRes", "(I)V", "getIconRes", "setIconRes", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "", "holder", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class TextIconAdapter extends StatusPage.Adapter<StatusPage.ViewHolder> {
    private int iconRes;
    private int textRes;

    public TextIconAdapter(int i, int i2) {
        this.textRes = i;
        this.iconRes = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1$lambda$0(StatusPage.OnReloadListener onReload, View view) {
        Intrinsics.checkNotNullParameter(onReload, "$onReload");
        onReload.onReload();
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final int getTextRes() {
        return this.textRes;
    }

    @Override // com.xiaomi.fitness.widget.state.StatusPage.Adapter
    public void onBindViewHolder(@NotNull StatusPage.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View rootView = holder.getRootView();
        Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) rootView;
        textView.setText(this.textRes);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, this.iconRes, 0, 0);
        final StatusPage.OnReloadListener onReloadListener = holder.getOnReloadListener();
        if (onReloadListener != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: c8p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextIconAdapter.onBindViewHolder$lambda$1$lambda$0(onReloadListener, view);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.widget.state.StatusPage.Adapter
    @NotNull
    public StatusPage.ViewHolder onCreateViewHolder(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = inflater.inflate(qvi.p, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new StatusPage.ViewHolder(viewInflate);
    }

    public final void setIconRes(int i) {
        this.iconRes = i;
    }

    public final void setTextRes(int i) {
        this.textRes = i;
    }
}
