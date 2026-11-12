package s73;

import android.content.ComponentCallbacks;
import org.koin.android.scope.ComponentCallbacksExtKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacks f157869b;

    public /* synthetic */ a(ComponentCallbacks componentCallbacks, int i14) {
        this.f157868a = i14;
        this.f157869b = componentCallbacks;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f157868a) {
            case 0:
                return ComponentCallbacksExtKt.getOrCreateScope$lambda$1(this.f157869b);
            default:
                return ComponentCallbacksExtKt.newScope$lambda$0(this.f157869b);
        }
    }
}
