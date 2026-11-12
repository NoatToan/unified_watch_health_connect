package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriber f53834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RolloutsState f53835c;

    public /* synthetic */ a(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState, int i14) {
        this.f53833a = i14;
        this.f53834b = rolloutsStateSubscriber;
        this.f53835c = rolloutsState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53833a) {
            case 0:
                this.f53834b.onRolloutsStateChanged(this.f53835c);
                break;
            default:
                this.f53834b.onRolloutsStateChanged(this.f53835c);
                break;
        }
    }
}
