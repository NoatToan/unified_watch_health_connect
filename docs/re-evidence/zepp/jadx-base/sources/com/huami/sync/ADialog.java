package com.huami.sync;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.sync.ADialog;
import com.huami.sync.dialog.CDialog;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/huami/sync/ADialog;", "Lcom/huami/sync/dialog/CDialog;", "Landroid/view/View;", "onCreateView", "", "bindView", "", "u", "Ljava/lang/CharSequence;", "msg", "Landroid/widget/TextView;", "v", "Landroid/widget/TextView;", "tvMsg", "w", "tvGotIt", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Ljava/lang/CharSequence;)V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class ADialog extends CDialog {

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final CharSequence msg;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private TextView tvMsg;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private TextView tvGotIt;

    public ADialog(@NotNull Context context, @NotNull CharSequence charSequence) {
        super(context);
        this.msg = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ADialog aDialog, View view) {
        aDialog.dismiss();
    }

    @Override // com.huami.sync.dialog.CDialog, com.huami.sync.dialog.TDialog
    public void bindView() {
        super.bindView();
        TextView textView = this.tvMsg;
        if (textView == null) {
            textView = null;
        }
        textView.setText(this.msg);
        textView.setMovementMethod(new LinkMovementMethod());
        textView.setHighlightColor(0);
        TextView textView2 = this.tvGotIt;
        (textView2 != null ? textView2 : null).setOnClickListener(new View.OnClickListener() { // from class: a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ADialog.h(this.a, view);
            }
        });
    }

    @Override // com.huami.sync.dialog.CDialog, com.huami.sync.dialog.TDialog
    @SuppressLint({"InflateParams"})
    @Nullable
    public View onCreateView() {
        widthScale(0.87f);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_alert, (ViewGroup) null);
        this.tvMsg = (TextView) viewInflate.findViewById(R.id.tv_msg);
        this.tvGotIt = (TextView) viewInflate.findViewById(R.id.tv_got_it);
        float fDp2px = ExtensionKt.dp2px(viewInflate.getContext(), 6);
        TextView textView = this.tvMsg;
        if (textView == null) {
            textView = null;
        }
        ExtensionKt.roundShape(textView, ContextCompat.getColor(getContext(), R.color.s38), new float[]{fDp2px, fDp2px, fDp2px, fDp2px, 0.0f, 0.0f, 0.0f, 0.0f});
        TextView textView2 = this.tvGotIt;
        ExtensionKt.roundShape(textView2 != null ? textView2 : null, ContextCompat.getColor(getContext(), R.color.s4), new float[]{0.0f, 0.0f, 0.0f, 0.0f, fDp2px, fDp2px, fDp2px, fDp2px});
        return viewInflate;
    }
}
