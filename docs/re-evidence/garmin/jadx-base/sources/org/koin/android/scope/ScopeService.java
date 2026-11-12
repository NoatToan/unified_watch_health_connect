package org.koin.android.scope;

import android.app.Service;
import ch.qos.logback.core.joran.action.Action;
import o13.l;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lorg/koin/android/scope/ScopeService;", "Landroid/app/Service;", "Lorg/koin/android/scope/AndroidScopeComponent;", "<init>", "()V", "", "onCreate", "onDestroy", "Lorg/koin/core/scope/Scope;", "scope$delegate", "Lo13/l;", "getScope", "()Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "koin-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ScopeService extends Service implements AndroidScopeComponent {

    /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
    private final l scope = ServiceExtKt.serviceScope(this);

    @Override // org.koin.android.scope.AndroidScopeComponent
    public Scope getScope() {
        return (Scope) this.scope.getValue();
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    public void onCloseScope() {
        AndroidScopeComponent.DefaultImpls.onCloseScope(this);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (getScope() != null) {
            return;
        }
        h.z("Required value was null.");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ServiceExtKt.destroyServiceScope(this);
    }
}
