package com.kogitune.activity_transition;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.kogitune.activity_transition.core.TransitionBundleFactory;

/* JADX INFO: loaded from: classes18.dex */
public class ActivityTransitionLauncher {
    private static final String d = "TransitionLauncher";
    private final Activity a;
    private View b;
    private Bitmap c;

    private ActivityTransitionLauncher(Activity activity) {
        this.a = activity;
    }

    public static ActivityTransitionLauncher with(Activity activity) {
        return new ActivityTransitionLauncher(activity);
    }

    public Bundle createBundle() {
        return TransitionBundleFactory.createTransitionBundle(this.a, this.b, this.c);
    }

    public ActivityTransitionLauncher from(View view) {
        this.b = view;
        return this;
    }

    public ActivityTransitionLauncher image(Bitmap bitmap) {
        this.c = bitmap;
        return this;
    }

    public void launch(Intent intent) {
        intent.putExtras(createBundle());
        this.a.startActivity(intent);
        this.a.overridePendingTransition(0, 0);
    }
}
