package com.huami.watch.companion.tips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;
import com.huami.watch.companion.tips.BaseTipView;
import com.huami.watch.util.Rx;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseTipView<B extends BaseTipView<B>> extends FrameLayout implements ITipAction {
    private boolean a;
    private boolean b;
    private long c;
    private ITipHideListener d;
    public Context mContext;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaseTipView.this.delayHide();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTipView.this.hide();
        }
    }

    public class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (BaseTipView.this.d != null) {
                BaseTipView.this.d.hide((String) BaseTipView.this.getTag());
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public BaseTipView(@NonNull Context context) {
        this(context, null);
    }

    public B autoHide(boolean z) {
        this.a = z;
        return this;
    }

    public void delayHide() {
        if (this.a) {
            this.a = false;
            Rx.delayMainThread(new b(), 2000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.huami.watch.companion.tips.ITipAction
    public void hide() {
        if (this.b) {
            this.b = false;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.tip_anim_out);
            long j = this.c;
            if (j != -1) {
                animationLoadAnimation.setDuration(j);
            }
            animationLoadAnimation.setAnimationListener(new c());
            startAnimation(animationLoadAnimation);
        }
    }

    public abstract void init();

    public B setAnimDuration(long j) {
        this.c = j;
        return this;
    }

    public void setHideListener(ITipHideListener iTipHideListener) {
        this.d = iTipHideListener;
    }

    @Override // com.huami.watch.companion.tips.ITipAction
    public void show() {
        if (this.b) {
            delayHide();
            return;
        }
        this.b = true;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.tip_anim_in);
        long j = this.c;
        if (j != -1) {
            animationLoadAnimation.setDuration(j);
        }
        animationLoadAnimation.setAnimationListener(new a());
        startAnimation(animationLoadAnimation);
    }

    public BaseTipView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseTipView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        this.c = -1L;
        this.mContext = context;
        init();
    }
}
