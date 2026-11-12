package com.xiaomi.fitness.sport_eco.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.gbq;
import defpackage.hcn;
import defpackage.txa;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_SportCommandView extends LinearLayout implements txa {
    private ViewComponentManager componentManager;
    private boolean injected;

    public Hilt_SportCommandView(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        inject();
    }

    public ViewComponentManager createComponentManager() {
        return new ViewComponentManager(this, false);
    }

    @Override // defpackage.sxa
    public final Object generatedComponent() {
        return m598componentManager().generatedComponent();
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((hcn) generatedComponent()).b((SportCommandView) gbq.a(this));
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final ViewComponentManager m598componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }

    public Hilt_SportCommandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        inject();
    }

    public Hilt_SportCommandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        inject();
    }

    @TargetApi(21)
    public Hilt_SportCommandView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        inject();
    }
}
