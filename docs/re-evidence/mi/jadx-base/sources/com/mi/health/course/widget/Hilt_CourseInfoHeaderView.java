package com.mi.health.course.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import defpackage.gbq;
import defpackage.pt4;
import defpackage.txa;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Hilt_CourseInfoHeaderView extends ConstraintLayout implements txa {
    private ViewComponentManager componentManager;
    private boolean injected;

    public Hilt_CourseInfoHeaderView(Context context) {
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
        return m197componentManager().generatedComponent();
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((pt4) generatedComponent()).d((CourseInfoHeaderView) gbq.a(this));
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final ViewComponentManager m197componentManager() {
        if (this.componentManager == null) {
            this.componentManager = createComponentManager();
        }
        return this.componentManager;
    }

    public Hilt_CourseInfoHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        inject();
    }

    public Hilt_CourseInfoHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        inject();
    }

    @TargetApi(21)
    public Hilt_CourseInfoHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        inject();
    }
}
