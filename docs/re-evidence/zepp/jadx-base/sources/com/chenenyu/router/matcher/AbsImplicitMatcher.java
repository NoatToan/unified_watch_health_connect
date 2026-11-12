package com.chenenyu.router.matcher;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbsImplicitMatcher extends AbsMatcher {
    public AbsImplicitMatcher(int i) {
        super(i);
    }

    @Override // com.chenenyu.router.matcher.AbsMatcher, com.chenenyu.router.matcher.a
    public Object generate(Context context, Uri uri, @Nullable Class<?> cls) {
        return new Intent("android.intent.action.VIEW", uri);
    }
}
