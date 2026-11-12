package com.chenenyu.router.matcher;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbsExplicitMatcher extends AbsMatcher {
    public AbsExplicitMatcher(int i) {
        super(i);
    }

    @Override // com.chenenyu.router.matcher.AbsMatcher, com.chenenyu.router.matcher.a
    public Object generate(Context context, Uri uri, @Nullable Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (Activity.class.isAssignableFrom(cls)) {
            return new Intent(context, cls);
        }
        if (!Fragment.class.isAssignableFrom(cls)) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
