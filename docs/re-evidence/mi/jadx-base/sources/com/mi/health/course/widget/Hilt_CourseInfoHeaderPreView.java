package com.mi.health.course.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.gbq;
import defpackage.ot4;
import defpackage.txa;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Hilt_CourseInfoHeaderPreView extends ConstraintLayout implements txa {
    private ViewComponentManager componentManager;
    private boolean injected;

    public Hilt_CourseInfoHeaderPreView(Context context) {
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
        return m196componentManager().generatedComponent();
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((ot4) generatedComponent()).a((CourseInfoHeaderPreView) gbq.a(this));
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final ViewComponentManager m196componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }

    public Hilt_CourseInfoHeaderPreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        inject();
    }

    public Hilt_CourseInfoHeaderPreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        inject();
    }

    @TargetApi(21)
    public Hilt_CourseInfoHeaderPreView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        inject();
    }
}
