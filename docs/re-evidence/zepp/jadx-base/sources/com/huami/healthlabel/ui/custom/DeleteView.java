package com.huami.healthlabel.ui.custom;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.huami.healthlabel.R;
import com.huami.healthlabel.ui.anim.SelfRotateAnimation;
import com.huami.tools.analytics.DbUtils;
import com.twitter.sdk.android.tweetcomposer.g;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/huami/healthlabel/ui/custom/DeleteView;", "Landroid/app/Dialog;", "", "show", g.g, "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "deleteView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class DeleteView extends Dialog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private ImageView deleteView;

    public DeleteView(@NotNull Context context) {
        WindowManager.LayoutParams attributes;
        super(context);
        setContentView(R.layout.health_label_delete_view);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null && (attributes = window2.getAttributes()) != null) {
            attributes.dimAmount = 0.0f;
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setAttributes(attributes);
            }
        }
        this.deleteView = (ImageView) findViewById(R.id.health_label_history_delete_iv);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        this.deleteView.clearAnimation();
        super.cancel();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        ImageView imageView = this.deleteView;
        final SelfRotateAnimation selfRotateAnimation = new SelfRotateAnimation(0.0f, 360.0f, 500L, -1);
        selfRotateAnimation.setAnimationListener(new AdapterAnimationListener() { // from class: com.huami.healthlabel.ui.custom.DeleteView$show$1$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private long startTime = System.currentTimeMillis();

            public final long getStartTime() {
                return this.startTime;
            }

            @Override // com.huami.healthlabel.ui.custom.AdapterAnimationListener, android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation animation) {
                if (System.currentTimeMillis() - this.startTime > 30000) {
                    selfRotateAnimation.cancel();
                    this.deleteView.setVisibility(8);
                }
            }

            @Override // com.huami.healthlabel.ui.custom.AdapterAnimationListener, android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation animation) {
                this.startTime = System.currentTimeMillis();
            }

            public final void setStartTime(long j) {
                this.startTime = j;
            }
        });
        Unit unit = Unit.INSTANCE;
        imageView.startAnimation(selfRotateAnimation);
    }
}
