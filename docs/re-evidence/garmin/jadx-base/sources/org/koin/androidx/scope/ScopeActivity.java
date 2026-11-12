package org.koin.androidx.scope;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import i.c;
import o13.l;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lorg/koin/androidx/scope/ScopeActivity;", "Li/c;", "Lorg/koin/android/scope/AndroidScopeComponent;", "", "contentLayoutId", "<init>", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lorg/koin/core/scope/Scope;", "scope$delegate", "Lo13/l;", "getScope", "()Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "koin-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ScopeActivity extends c implements AndroidScopeComponent {

    /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
    private final l scope;

    public ScopeActivity(int i14) {
        super(i14);
        this.scope = ComponentActivityExtKt.activityScope(this);
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    public Scope getScope() {
        return (Scope) this.scope.getValue();
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    public void onCloseScope() {
        AndroidScopeComponent.DefaultImpls.onCloseScope(this);
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getScope() != null) {
            return;
        }
        h.z("Required value was null.");
    }

    public /* synthetic */ ScopeActivity(int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? 0 : i14);
    }

    public ScopeActivity() {
        this(0, 1, null);
    }
}
