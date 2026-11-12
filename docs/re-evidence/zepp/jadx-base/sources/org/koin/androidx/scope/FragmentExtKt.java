package org.koin.androidx.scope;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u0000\u001a \u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\b*\u00020\u0000H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\"\u0019\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/Fragment;", "Lorg/koin/androidx/scope/LifecycleScopeDelegate;", "fragmentScope", "", "source", "Lorg/koin/core/scope/Scope;", "createScope", "getScopeOrNull", "Lorg/koin/androidx/scope/ScopeActivity;", ExifInterface.GPS_DIRECTION_TRUE, "requireScopeActivity", "(Landroidx/fragment/app/Fragment;)Lorg/koin/androidx/scope/ScopeActivity;", "getScopeActivity", "scopeActivity", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class FragmentExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/Koin;", "koin", "Lorg/koin/core/scope/Scope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Koin, Scope> {
        public final /* synthetic */ Fragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(1);
            this.a = fragment;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Scope invoke(@NotNull Koin koin) {
            Scope scopeCreateScope$default = Koin.createScope$default(koin, KoinScopeComponentKt.getScopeId(this.a), KoinScopeComponentKt.getScopeName(this.a), null, 4, null);
            FragmentActivity activity = this.a.getActivity();
            Scope scopeOrNull = activity == null ? null : ComponentActivityExtKt.getScopeOrNull(activity);
            if (scopeOrNull != null) {
                scopeCreateScope$default.linkTo(scopeOrNull);
            }
            return scopeCreateScope$default;
        }
    }

    @NotNull
    public static final Scope createScope(@NotNull Fragment fragment, @Nullable Object obj) {
        return ComponentCallbackExtKt.getKoin(fragment).createScope(KoinScopeComponentKt.getScopeId(fragment), KoinScopeComponentKt.getScopeName(fragment), obj);
    }

    public static /* synthetic */ Scope createScope$default(Fragment fragment, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return createScope(fragment, obj);
    }

    @NotNull
    public static final LifecycleScopeDelegate<Fragment> fragmentScope(@NotNull Fragment fragment) {
        return new LifecycleScopeDelegate<>(fragment, ComponentCallbackExtKt.getKoin(fragment), new a(fragment));
    }

    @Nullable
    public static final ScopeActivity getScopeActivity(@NotNull Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity instanceof ScopeActivity) {
            return (ScopeActivity) activity;
        }
        return null;
    }

    @Nullable
    public static final Scope getScopeOrNull(@NotNull Fragment fragment) {
        return ComponentCallbackExtKt.getKoin(fragment).getScopeOrNull(KoinScopeComponentKt.getScopeId(fragment));
    }

    public static final /* synthetic */ <T extends ScopeActivity> T requireScopeActivity(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        T t = (T) activity;
        if (t != null) {
            return t;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        throw new IllegalStateException(Intrinsics.stringPlus("can't get ScopeActivity for class ", Reflection.getOrCreateKotlinClass(ScopeActivity.class)).toString());
    }
}
