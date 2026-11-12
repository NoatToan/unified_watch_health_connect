package org.koin.androidx.scope;

import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\u0010\u001a\u00020\u000b8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lorg/koin/androidx/scope/ScopeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/android/scope/AndroidScopeComponent;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "a", "Z", "initialiseScope", "Lorg/koin/core/scope/Scope;", "b", "Lorg/koin/androidx/scope/LifecycleScopeDelegate;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "", "contentLayoutId", "<init>", "(IZ)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public abstract class ScopeActivity extends AppCompatActivity implements AndroidScopeComponent {
    public static final /* synthetic */ KProperty<Object>[] c = {Reflection.property1(new PropertyReference1Impl(ScopeActivity.class, "scope", "getScope()Lorg/koin/core/scope/Scope;", 0))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean initialiseScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifecycleScopeDelegate scope;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeActivity() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public /* synthetic */ ScopeActivity(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? true : z);
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    @NotNull
    public Scope getScope() {
        return this.scope.getValue2((LifecycleOwner) this, c[0]);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.initialiseScope) {
            getScope().getLogger().debug(Intrinsics.stringPlus("Open Activity Scope: ", getScope()));
        }
    }

    public ScopeActivity(@LayoutRes int i, boolean z) {
        super(i);
        this.initialiseScope = z;
        this.scope = ComponentActivityExtKt.activityScope(this);
    }
}
