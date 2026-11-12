package com.kogitune.activity_transition.fragment;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.kogitune.activity_transition.core.TransitionBundleFactory;

/* JADX INFO: loaded from: classes18.dex */
public class FragmentTransitionLauncher {
    private static final String d = "TransitionLauncher";
    public static final String e = "TransitionBundle";
    private final Context a;
    private View b;
    private Bitmap c;

    private FragmentTransitionLauncher(Context context) {
        this.a = context;
    }

    public static FragmentTransitionLauncher with(Context context) {
        return new FragmentTransitionLauncher(context);
    }

    public FragmentTransitionLauncher from(View view) {
        this.b = view;
        return this;
    }

    public FragmentTransitionLauncher image(Bitmap bitmap) {
        this.c = bitmap;
        return this;
    }

    public void prepare(Fragment fragment) {
        Bundle bundleCreateTransitionBundle = TransitionBundleFactory.createTransitionBundle(this.a, this.b, this.c);
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle(e, bundleCreateTransitionBundle);
        fragment.setArguments(arguments);
    }

    public void prepare(androidx.fragment.app.Fragment fragment) {
        Bundle bundleCreateTransitionBundle = TransitionBundleFactory.createTransitionBundle(this.a, this.b, this.c);
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle(e, bundleCreateTransitionBundle);
        fragment.setArguments(arguments);
    }
}
