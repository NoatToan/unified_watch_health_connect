package com.huami.sleep.daysleep.quotient.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/huami/sleep/daysleep/quotient/adapter/SleepQuotientHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "name", "b", "getRefInfo", "refInfo", "c", "getValue", "value", GoogleApiAvailabilityLight.a, "getOpen", "open", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepQuotientHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TextView name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TextView refInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TextView value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final TextView open;

    public SleepQuotientHolder(@NotNull View view) {
        super(view);
        this.name = (TextView) view.findViewById(R.id.sleep_quotient_name);
        this.refInfo = (TextView) view.findViewById(R.id.sleep_quotient_ref);
        this.value = (TextView) view.findViewById(R.id.sleep_quotient_value);
        this.open = (TextView) view.findViewById(R.id.sleep_quotient_start_detection);
    }

    @NotNull
    public final TextView getName() {
        return this.name;
    }

    @NotNull
    public final TextView getOpen() {
        return this.open;
    }

    @NotNull
    public final TextView getRefInfo() {
        return this.refInfo;
    }

    @NotNull
    public final TextView getValue() {
        return this.value;
    }
}
