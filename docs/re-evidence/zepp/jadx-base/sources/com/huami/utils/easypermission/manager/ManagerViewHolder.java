package com.huami.utils.easypermission.manager;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.utils.easypermission.R;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000e*\u00020\u000e8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/huami/utils/easypermission/manager/ManagerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "b", "getStatusView", "statusView", "c", "getContentView", "contentView", "", "(I)I", Constant.PAI_KEY_DAILY_PAI, "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Companion", "easypermission_release"}, k = 1, mv = {1, 5, 1})
public final class ManagerViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final TextView titleView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TextView statusView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TextView contentView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/utils/easypermission/manager/ManagerViewHolder$Companion;", "", "Landroid/view/ViewGroup;", "parent", "Lcom/huami/utils/easypermission/manager/ManagerViewHolder;", "create", "<init>", "()V", "easypermission_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ManagerViewHolder create(@NotNull ViewGroup parent) {
            return new ManagerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.easypermission_item_permission, parent, false));
        }
    }

    public ManagerViewHolder(@NotNull View view) {
        super(view);
        this.titleView = (TextView) view.findViewById(R.id.permission_center_item_title);
        TextView textView = (TextView) view.findViewById(R.id.permission_center_item_status);
        this.statusView = textView;
        this.contentView = (TextView) view.findViewById(R.id.permission_center_item_content);
        Drawable drawable = ContextCompat.getDrawable(view.getContext(), R.drawable.ic_arrow_forward_20_2x);
        if (drawable == null) {
            drawable = null;
        } else {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(view.getContext(), R.color.s2));
            drawable.setBounds(0, 0, a(14), a(14));
            Unit unit = Unit.INSTANCE;
        }
        textView.setCompoundDrawablesRelative(null, null, drawable, null);
    }

    private final int a(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    @NotNull
    public final TextView getContentView() {
        return this.contentView;
    }

    @NotNull
    public final TextView getStatusView() {
        return this.statusView;
    }

    @NotNull
    public final TextView getTitleView() {
        return this.titleView;
    }
}
