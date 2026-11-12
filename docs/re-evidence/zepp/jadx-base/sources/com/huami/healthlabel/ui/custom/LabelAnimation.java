package com.huami.healthlabel.ui.custom;

import android.content.Context;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/healthlabel/ui/custom/LabelAnimation;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "playAnimation", "Lcom/huami/healthlabel/ui/custom/ClickLabelAnimation;", "a", "Lcom/huami/healthlabel/ui/custom/ClickLabelAnimation;", "clickLabelAnimation", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class LabelAnimation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ClickLabelAnimation clickLabelAnimation;

    public final void playAnimation(@NotNull Context context, @NotNull View view) {
        if (this.clickLabelAnimation == null) {
            this.clickLabelAnimation = new ClickLabelAnimation(context);
        }
        ClickLabelAnimation clickLabelAnimation = this.clickLabelAnimation;
        if (clickLabelAnimation != null) {
            if (!clickLabelAnimation.isShowing()) {
                clickLabelAnimation = null;
            }
            if (clickLabelAnimation != null) {
                clickLabelAnimation.dismiss();
            }
        }
        ClickLabelAnimation clickLabelAnimation2 = this.clickLabelAnimation;
        if (clickLabelAnimation2 == null) {
            return;
        }
        clickLabelAnimation2.a(view);
    }
}
