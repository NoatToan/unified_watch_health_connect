package com.huami.applet.jslog;

import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/applet/jslog/b;", "", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "b", "()Landroid/widget/TextView;", GoogleApiAvailabilityLight.a, "(Landroid/widget/TextView;)V", "logTextView", "c", "lineNumTv", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
final class b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public TextView logTextView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView lineNumTv;

    @NotNull
    public final TextView a() {
        TextView textView = this.lineNumTv;
        Objects.requireNonNull(textView);
        return textView;
    }

    @NotNull
    public final TextView b() {
        TextView textView = this.logTextView;
        Objects.requireNonNull(textView);
        return textView;
    }

    public final void c(@NotNull TextView textView) {
        this.lineNumTv = textView;
    }

    public final void d(@NotNull TextView textView) {
        this.logTextView = textView;
    }
}
