package com.twitter.sdk.android.core.identity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.R;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.internal.CommonUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class TwitterLoginButton extends Button {
    public static final String e = "Twitter";
    public static final String f = "TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.";
    public final WeakReference<Activity> a;
    public volatile TwitterAuthClient b;
    public View.OnClickListener c;
    public Callback<TwitterSession> d;

    public class b implements View.OnClickListener {
        private b() {
        }

        private void a(Activity activity) {
            if (activity == null || activity.isFinishing()) {
                CommonUtils.logOrThrowIllegalStateException("Twitter", TwitterLoginButton.f);
            }
        }

        private void b(Callback callback) {
            if (callback == null) {
                CommonUtils.logOrThrowIllegalStateException("Twitter", "Callback must not be null, did you call setCallback?");
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b(TwitterLoginButton.this.d);
            a(TwitterLoginButton.this.a.get());
            TwitterLoginButton.this.getTwitterAuthClient().authorize(TwitterLoginButton.this.a.get(), TwitterLoginButton.this.d);
            View.OnClickListener onClickListener = TwitterLoginButton.this.c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public TwitterLoginButton(Context context) {
        this(context, null);
    }

    private void a() {
        if (isInEditMode()) {
            return;
        }
        try {
            TwitterCore.getInstance();
        } catch (IllegalStateException e2) {
            Twitter.getLogger().e("Twitter", e2.getMessage());
            setEnabled(false);
        }
    }

    @TargetApi(21)
    private void b() {
        Resources resources = getResources();
        super.setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(R.drawable.tw__ic_logo_default), (Drawable) null, (Drawable) null, (Drawable) null);
        super.setCompoundDrawablePadding(resources.getDimensionPixelSize(R.dimen.tw__login_btn_drawable_padding));
        super.setText(R.string.tw__login_btn_txt);
        super.setTextColor(resources.getColor(R.color.tw__solid_white));
        super.setTextSize(0, resources.getDimensionPixelSize(R.dimen.tw__login_btn_text_size));
        super.setTypeface(Typeface.DEFAULT_BOLD);
        super.setPadding(resources.getDimensionPixelSize(R.dimen.tw__login_btn_left_padding), 0, resources.getDimensionPixelSize(R.dimen.tw__login_btn_right_padding), 0);
        super.setBackgroundResource(R.drawable.tw__login_btn);
        super.setOnClickListener(new b());
        if (Build.VERSION.SDK_INT >= 21) {
            super.setAllCaps(false);
        }
    }

    public Activity getActivity() {
        if (getContext() instanceof Activity) {
            return (Activity) getContext();
        }
        if (isInEditMode()) {
            return null;
        }
        throw new IllegalStateException(f);
    }

    public Callback<TwitterSession> getCallback() {
        return this.d;
    }

    public TwitterAuthClient getTwitterAuthClient() {
        if (this.b == null) {
            synchronized (TwitterLoginButton.class) {
                if (this.b == null) {
                    this.b = new TwitterAuthClient();
                }
            }
        }
        return this.b;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == getTwitterAuthClient().getRequestCode()) {
            getTwitterAuthClient().onActivityResult(i, i2, intent);
        }
    }

    public void setCallback(Callback<TwitterSession> callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Callback cannot be null");
        }
        this.d = callback;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public TwitterLoginButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.buttonStyle);
    }

    public TwitterLoginButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public TwitterLoginButton(Context context, AttributeSet attributeSet, int i, TwitterAuthClient twitterAuthClient) {
        super(context, attributeSet, i);
        this.a = new WeakReference<>(getActivity());
        this.b = twitterAuthClient;
        b();
        a();
    }
}
