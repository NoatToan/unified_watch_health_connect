package xg0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxg0/i;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Animator f190776a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View view2) {
        super(view2);
        view2.getClass();
    }

    public final void d() {
        if (this.f190776a == null) {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.itemView.getContext(), R.animator.news_feed_post_loading);
            animatorLoadAnimator.getClass();
            animatorLoadAnimator.addListener(new h(this, animatorLoadAnimator));
            animatorLoadAnimator.setTarget(this.itemView);
            animatorLoadAnimator.start();
            this.f190776a = animatorLoadAnimator;
        }
    }
}
