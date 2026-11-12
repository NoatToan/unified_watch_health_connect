package com.xiaomi.hm.health.play.card;

import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Landroid/view/ViewGroup;", "", "alpha", "", "setChildAlpha", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class AbstractDeviceCardRenderKt {
    public static final void setChildAlpha(@NotNull ViewGroup viewGroup, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            viewGroup.getChildAt(i).setAlpha(f);
            if (i2 >= childCount) {
                return;
            } else {
                i = i2;
            }
        }
    }
}
