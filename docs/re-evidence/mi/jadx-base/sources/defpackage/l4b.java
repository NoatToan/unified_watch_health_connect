package defpackage;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l4b extends a.AbstractC0164a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReactContext f24630b;

    public l4b(ReactContext reactContext) {
        this.f24630b = reactContext;
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0164a
    public final void a(long j) {
        try {
            c(j);
        } catch (RuntimeException e) {
            this.f24630b.handleException(e);
        }
    }

    public abstract void c(long j);
}
