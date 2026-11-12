package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53653c;

    public /* synthetic */ e(int i14, Object obj, Object obj2) {
        this.f53651a = i14;
        this.f53653c = obj;
        this.f53652b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53651a) {
            case 0:
                ((OptionalProvider) this.f53653c).set((Provider) this.f53652b);
                break;
            case 1:
                ((LazySet) this.f53653c).add((Provider) this.f53652b);
                break;
            default:
                EventBus.lambda$publish$0((Map.Entry) this.f53653c, (Event) this.f53652b);
                break;
        }
    }
}
