package org.koin.android.scope;

import ch.qos.logback.core.joran.action.Action;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lorg/koin/android/scope/AndroidScopeComponent;", "", Action.SCOPE_ATTRIBUTE, "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "onCloseScope", "", "koin-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AndroidScopeComponent {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onCloseScope(AndroidScopeComponent androidScopeComponent) {
        }
    }

    Scope getScope();

    void onCloseScope();
}
