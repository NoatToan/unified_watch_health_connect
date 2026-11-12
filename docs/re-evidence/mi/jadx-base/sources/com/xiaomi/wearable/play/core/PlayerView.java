package com.xiaomi.wearable.play.core;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.vta;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PlayerView extends FrameLayout {
    public PlayerView(Context context) {
        super(context);
    }

    public abstract long getCurrentPosition();

    public abstract long getDuration();

    public abstract void setFullScreenController(vta vtaVar);

    public abstract void setLock(Boolean bool);

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
