package com.xiaomi.fitness.webview.hyperlink;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/webview/hyperlink/CommonClickSpan;", "Landroid/text/style/ClickableSpan;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/webview/hyperlink/CommonClickSpan$OnLinkClickListener;", "highColor", "", "<init>", "(Lcom/xiaomi/fitness/webview/hyperlink/CommonClickSpan$OnLinkClickListener;I)V", "getListener", "()Lcom/xiaomi/fitness/webview/hyperlink/CommonClickSpan$OnLinkClickListener;", "highColorId", "onClick", "", "v", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "OnLinkClickListener", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonClickSpan extends ClickableSpan {
    private int highColorId;

    @Nullable
    private final OnLinkClickListener listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/webview/hyperlink/CommonClickSpan$OnLinkClickListener;", "", "onLinkClick", "", "view", "Landroid/view/View;", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnLinkClickListener {
        void onLinkClick(@Nullable View view);
    }

    public CommonClickSpan(@Nullable OnLinkClickListener onLinkClickListener, int i) {
        this.listener = onLinkClickListener;
        this.highColorId = i;
    }

    @Nullable
    public final OnLinkClickListener getListener() {
        return this.listener;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        OnLinkClickListener onLinkClickListener = this.listener;
        Intrinsics.checkNotNull(onLinkClickListener);
        onLinkClickListener.onLinkClick(v);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(ApplicationExtKt.getApplication().getResources().getColor(this.highColorId));
        ds.setUnderlineText(true);
    }
}
