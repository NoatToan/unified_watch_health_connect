package com.xiaomi.hm.health.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.view.ToolFriendPopupWindow;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB#\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0013\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u0018B\u001d\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/view/ToolFriendPopupWindow;", "Landroid/widget/PopupWindow;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "e", "i", "Lcom/xiaomi/hm/health/view/ToolFriendPopupWindow$OnItemClickListener;", "onItemClickListener", "setOnItemClickListener", "Landroid/content/Context;", "a", "Landroid/content/Context;", "mContext", "b", "Lcom/xiaomi/hm/health/view/ToolFriendPopupWindow$OnItemClickListener;", "mOnItemClickListener", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "OnItemClickListener", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolFriendPopupWindow extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private OnItemClickListener mOnItemClickListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/view/ToolFriendPopupWindow$OnItemClickListener;", "", "", "onScanClick", "onQrCodeClick", "onInviteClick", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public interface OnItemClickListener {
        void onInviteClick();

        void onQrCodeClick();

        void onScanClick();
    }

    public ToolFriendPopupWindow(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private final void e(View view) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.tool_popup_scan);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.tool_popup_qrcode);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) view.findViewById(R.id.tool_popup_invite);
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: gr7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ToolFriendPopupWindow.f(this.a, view2);
            }
        });
        appCompatTextView2.setOnClickListener(new View.OnClickListener() { // from class: er7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ToolFriendPopupWindow.g(this.a, view2);
            }
        });
        appCompatTextView3.setOnClickListener(new View.OnClickListener() { // from class: fr7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ToolFriendPopupWindow.h(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ToolFriendPopupWindow toolFriendPopupWindow, View view) {
        OnItemClickListener onItemClickListener = toolFriendPopupWindow.mOnItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onScanClick();
        }
        toolFriendPopupWindow.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ToolFriendPopupWindow toolFriendPopupWindow, View view) {
        OnItemClickListener onItemClickListener = toolFriendPopupWindow.mOnItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onQrCodeClick();
        }
        toolFriendPopupWindow.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ToolFriendPopupWindow toolFriendPopupWindow, View view) {
        OnItemClickListener onItemClickListener = toolFriendPopupWindow.mOnItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onInviteClick();
        }
        toolFriendPopupWindow.dismiss();
    }

    private final void i() {
        Context context = this.mContext;
        if (context != null) {
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            final Window window = ((Activity) context).getWindow();
            final WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = 0.7f;
            window.addFlags(2);
            window.setAttributes(attributes);
            setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: hr7
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ToolFriendPopupWindow.j(attributes, window);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WindowManager.LayoutParams layoutParams, Window window) {
        layoutParams.alpha = 1.0f;
        window.setAttributes(layoutParams);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public ToolFriendPopupWindow(@Nullable Context context) {
        this(context, null);
        setWidth((int) ViewUtils.dp2px(context, 220.0f));
        setHeight(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(LayoutInflater.from(context).inflate(R.layout.layout_tool_friends_popup, (ViewGroup) null, false));
        e(getContentView());
        this.mContext = context;
        i();
    }

    public ToolFriendPopupWindow(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
