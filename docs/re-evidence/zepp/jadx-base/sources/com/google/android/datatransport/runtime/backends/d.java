package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes2.dex */
class d {
    private final Context a;
    private final Clock b;
    private final Clock c;

    @Inject
    public d(Context context, @WallTime Clock clock, @Monotonic Clock clock2) {
        this.a = context;
        this.b = clock;
        this.c = clock2;
    }

    public CreationContext a(String str) {
        return CreationContext.create(this.a, this.b, this.c, str);
    }
}
