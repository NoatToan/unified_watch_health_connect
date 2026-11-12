package com.xiaomi.fitness.baseui.extension;

import android.view.ViewGroup;
import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"setMarginRelative", "", "Landroid/view/ViewGroup$MarginLayoutParams;", "left", "", "top", TSMAuthContants.PARAM_KEY_RIGHT, "bottom", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewGroupExtendKt {
    public static final void setMarginRelative(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i3);
    }
}
