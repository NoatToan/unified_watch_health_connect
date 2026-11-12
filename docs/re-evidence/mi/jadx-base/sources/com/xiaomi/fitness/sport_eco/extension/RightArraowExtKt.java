package com.xiaomi.fitness.sport_eco.extension;

import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import defpackage.cki;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"setRedPointShow", "", "Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "checked", "", "dotColor", "", "sport-eco_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RightArraowExtKt {
    public static final void setRedPointShow(@NotNull RightArrowTwoLineTextView rightArrowTwoLineTextView, boolean z, int i) {
        Intrinsics.checkNotNullParameter(rightArrowTwoLineTextView, "<this>");
        if (z) {
            rightArrowTwoLineTextView.setRemindDotColor(ViewExtKt.getColor(rightArrowTwoLineTextView, i));
        } else {
            rightArrowTwoLineTextView.getMTvFeatureItemRemind().setBackground(null);
        }
    }

    public static /* synthetic */ void setRedPointShow$default(RightArrowTwoLineTextView rightArrowTwoLineTextView, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = cki.f5431k;
        }
        setRedPointShow(rightArrowTwoLineTextView, z, i);
    }
}
