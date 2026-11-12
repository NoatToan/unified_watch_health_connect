package com.xiaomi.fitness.access.hyperlink;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/access/hyperlink/CommonClickSpan;", "Landroid/text/style/ClickableSpan;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/access/hyperlink/CommonClickSpan$OnLinkClickListener;", "highColor", "", "<init>", "(Lcom/xiaomi/fitness/access/hyperlink/CommonClickSpan$OnLinkClickListener;I)V", "highColorId", "CommonClickSpan", "", "onClick", "v", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "OnLinkClickListener", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonClickSpan extends ClickableSpan {
    private int highColorId;

    @Nullable
    private OnLinkClickListener listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/access/hyperlink/CommonClickSpan$OnLinkClickListener;", "", "onLinkClick", "", "view", "Landroid/view/View;", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnLinkClickListener {
        void onLinkClick(@Nullable View view);
    }

    public CommonClickSpan(@Nullable OnLinkClickListener onLinkClickListener, int i) {
        this.highColorId = i;
        this.listener = onLinkClickListener;
    }

    public final void CommonClickSpan(@Nullable OnLinkClickListener listener, int highColor) {
        this.listener = listener;
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
