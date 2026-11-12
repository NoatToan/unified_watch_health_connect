package com.google.android.material.transition;

import androidx.transition.m;

/* JADX INFO: loaded from: classes14.dex */
abstract class TransitionListenerAdapter implements m.h {
    @Override // androidx.transition.m.h
    public void onTransitionCancel(m mVar) {
    }

    @Override // androidx.transition.m.h
    public void onTransitionEnd(m mVar, boolean z14) {
        onTransitionEnd(mVar);
    }

    @Override // androidx.transition.m.h
    public void onTransitionPause(m mVar) {
    }

    @Override // androidx.transition.m.h
    public void onTransitionResume(m mVar) {
    }

    @Override // androidx.transition.m.h
    public void onTransitionStart(m mVar, boolean z14) {
        onTransitionStart(mVar);
    }

    @Override // androidx.transition.m.h
    public void onTransitionEnd(m mVar) {
    }

    @Override // androidx.transition.m.h
    public void onTransitionStart(m mVar) {
    }
}
