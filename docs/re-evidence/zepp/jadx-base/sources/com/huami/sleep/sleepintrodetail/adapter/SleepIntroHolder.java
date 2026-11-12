package com.huami.sleep.sleepintrodetail.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/adapter/SleepIntroHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title", "b", "getDetail", "detail", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepIntroHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TextView title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TextView detail;

    public SleepIntroHolder(@NotNull View view) {
        super(view);
        this.title = (TextView) view.findViewById(R.id.intro_title);
        this.detail = (TextView) view.findViewById(R.id.intro_detail);
    }

    @NotNull
    public final TextView getDetail() {
        return this.detail;
    }

    @NotNull
    public final TextView getTitle() {
        return this.title;
    }
}
