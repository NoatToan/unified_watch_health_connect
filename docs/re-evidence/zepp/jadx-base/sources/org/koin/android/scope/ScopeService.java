package org.koin.android.scope;

import android.app.Service;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\u00020\n8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lorg/koin/android/scope/ScopeService;", "Landroid/app/Service;", "Lorg/koin/android/scope/AndroidScopeComponent;", "", "onCreate", "onDestroy", "", "a", "Z", "initialiseScope", "Lorg/koin/core/scope/Scope;", "b", "Lkotlin/Lazy;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "<init>", "(Z)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public abstract class ScopeService extends Service implements AndroidScopeComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean initialiseScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope;

    public ScopeService() {
        this(false, 1, null);
    }

    public /* synthetic */ ScopeService(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    @NotNull
    public Scope getScope() {
        return (Scope) this.scope.getValue();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.initialiseScope) {
            getScope().getLogger().debug(Intrinsics.stringPlus("Open Service Scope: ", getScope()));
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        getScope().getLogger().debug(Intrinsics.stringPlus("Close service scope: ", getScope()));
        if (getScope().get_closed()) {
            return;
        }
        getScope().close();
    }

    public ScopeService(boolean z) {
        this.initialiseScope = z;
        this.scope = ServiceExtKt.serviceScope(this);
    }
}
