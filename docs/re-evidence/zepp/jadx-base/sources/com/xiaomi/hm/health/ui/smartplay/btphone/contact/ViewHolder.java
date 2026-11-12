package com.xiaomi.hm.health.ui.smartplay.btphone.contact;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import com.xiaomi.hm.health.ui.smartplay.btphone.contact.ViewHolder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/Contact;", ContactSettingItemActivity.KEY_CONTACT, "", "editMode", "", "bind", "Landroid/view/View;", "a", "Landroid/view/View;", "deleteView", "b", "dragSymbolView", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "userNameTv", GoogleApiAvailabilityLight.a, "userTelTv", "itemView", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/IItemEventListener;", "itemEventListener", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/IItemDragEventListener;", "itemDragListener", "<init>", "(Landroid/view/View;Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/IItemEventListener;Lcom/xiaomi/hm/health/ui/smartplay/btphone/contact/IItemDragEventListener;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private View deleteView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View dragSymbolView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private TextView userNameTv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TextView userTelTv;

    public ViewHolder(@NotNull View view, @Nullable final IItemEventListener iItemEventListener, @Nullable final IItemDragEventListener iItemDragEventListener) {
        super(view);
        this.deleteView = view.findViewById(R.id.iv_delete);
        this.dragSymbolView = view.findViewById(R.id.iv_dragger);
        this.userNameTv = (TextView) view.findViewById(R.id.tv_uname);
        this.userTelTv = (TextView) view.findViewById(R.id.tv_phone_num);
        View view2 = this.deleteView;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: mb8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ViewHolder.c(iItemEventListener, this, view3);
                }
            });
        }
        View view3 = this.dragSymbolView;
        if (view3 == null) {
            return;
        }
        view3.setOnTouchListener(new View.OnTouchListener() { // from class: nb8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view4, MotionEvent motionEvent) {
                return ViewHolder.d(iItemDragEventListener, this, view4, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(IItemEventListener iItemEventListener, ViewHolder viewHolder, View view) {
        if (iItemEventListener == null) {
            return;
        }
        iItemEventListener.onDelete(viewHolder.getAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(IItemDragEventListener iItemDragEventListener, ViewHolder viewHolder, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || iItemDragEventListener == null) {
            return false;
        }
        iItemDragEventListener.onStartDrag(viewHolder);
        return false;
    }

    public final void bind(@NotNull Contact contact, boolean editMode) {
        TextView textView = this.userNameTv;
        if (textView != null) {
            textView.setText(contact.getUName());
        }
        TextView textView2 = this.userTelTv;
        if (textView2 != null) {
            textView2.setText(contact.getPhone());
        }
        View view = this.dragSymbolView;
        if (view != null) {
            view.setVisibility(editMode ? 0 : 8);
        }
        View view2 = this.deleteView;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(editMode ? 0 : 8);
    }
}
