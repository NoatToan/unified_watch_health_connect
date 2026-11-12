package com.huami.sync.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bH\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/huami/sync/dialog/CDialog;", "Lcom/huami/sync/dialog/TDialog;", "Landroid/view/View;", "onCreateView", "", "bindView", "Lcom/huami/sync/dialog/CDialog$OnCreateViewListener;", "onCreateViewListener", "", "widthScale", "heightScale", "r", "Lcom/huami/sync/dialog/CDialog$OnCreateViewListener;", "mOnCreateViewListener", SOAP.XMLNS, "F", "mWScale", "t", "mHScale", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "OnCreateViewListener", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public class CDialog extends TDialog<CDialog> {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private OnCreateViewListener mOnCreateViewListener;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private float mWScale;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private float mHScale;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/sync/dialog/CDialog$OnCreateViewListener;", "", "Landroid/app/Dialog;", "dialog", "Landroid/view/View;", "onCreateView", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
    public interface OnCreateViewListener {
        @Nullable
        View onCreateView(@Nullable Dialog dialog);
    }

    public CDialog(@NotNull Context context) {
        super(context);
    }

    @Override // com.huami.sync.dialog.TDialog
    public void bindView() {
    }

    @Override // com.huami.sync.dialog.TDialog
    @Nullable
    public View onCreateView() {
        if (this.mWScale == 0.0f) {
            super.widthScale(0.7f);
        }
        OnCreateViewListener onCreateViewListener = this.mOnCreateViewListener;
        if (onCreateViewListener != null) {
            return onCreateViewListener.onCreateView(this);
        }
        return null;
    }

    @NotNull
    public final CDialog onCreateViewListener(@Nullable OnCreateViewListener onCreateViewListener) {
        this.mOnCreateViewListener = onCreateViewListener;
        return this;
    }

    @Override // com.huami.sync.dialog.TDialog
    @NotNull
    public CDialog heightScale(float heightScale) {
        this.mHScale = heightScale;
        return (CDialog) super.heightScale(heightScale);
    }

    @Override // com.huami.sync.dialog.TDialog
    @NotNull
    public CDialog widthScale(float widthScale) {
        this.mWScale = widthScale;
        return (CDialog) super.widthScale(widthScale);
    }
}
