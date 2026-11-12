package org.koin.android.scope;

import android.content.ComponentCallbacks;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroid/content/ComponentCallbacks;", ExifInterface.GPS_DIRECTION_TRUE, "", "source", "Lorg/koin/core/scope/Scope;", "createScope", "(Landroid/content/ComponentCallbacks;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "getScopeOrNull", "(Landroid/content/ComponentCallbacks;)Lorg/koin/core/scope/Scope;", "Lkotlin/Lazy;", "newScope", "(Landroid/content/ComponentCallbacks;)Lkotlin/Lazy;", "getOrCreateScope", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class ComponentCallbacksExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/content/ComponentCallbacks;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Scope> {

        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ ComponentCallbacks a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public a(ComponentCallbacks componentCallbacks) {
            super(0);
            this.a = componentCallbacks;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Scope invoke() {
            Scope scopeOrNull = ComponentCallbacksExtKt.getScopeOrNull(this.a);
            return scopeOrNull == null ? ComponentCallbacksExtKt.createScope$default(this.a, null, 1, null) : scopeOrNull;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Landroid/content/ComponentCallbacks;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Scope> {

        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ ComponentCallbacks a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.a = componentCallbacks;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Scope invoke() {
            return ComponentCallbacksExtKt.createScope$default(this.a, null, 1, null);
        }
    }

    @NotNull
    public static final <T extends ComponentCallbacks> Scope createScope(@NotNull T t, @Nullable Object obj) {
        return ComponentCallbackExtKt.getKoin(t).createScope(KoinScopeComponentKt.getScopeId(t), KoinScopeComponentKt.getScopeName(t), obj);
    }

    public static /* synthetic */ Scope createScope$default(ComponentCallbacks componentCallbacks, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return createScope(componentCallbacks, obj);
    }

    @NotNull
    public static final <T extends ComponentCallbacks> Lazy<Scope> getOrCreateScope(@NotNull T t) {
        return LazyKt__LazyJVMKt.lazy(new a(t));
    }

    @Nullable
    public static final <T extends ComponentCallbacks> Scope getScopeOrNull(@NotNull T t) {
        return ComponentCallbackExtKt.getKoin(t).getScopeOrNull(KoinScopeComponentKt.getScopeId(t));
    }

    @NotNull
    public static final <T extends ComponentCallbacks> Lazy<Scope> newScope(@NotNull T t) {
        return LazyKt__LazyJVMKt.lazy(new b(t));
    }
}
