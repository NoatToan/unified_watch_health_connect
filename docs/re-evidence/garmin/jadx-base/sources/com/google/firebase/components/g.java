package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53654a;

    public /* synthetic */ g(int i14) {
        this.f53654a = i14;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f53654a) {
            case 0:
                return OptionalProvider.lambda$static$1();
            default:
                return Collections.EMPTY_SET;
        }
    }
}
