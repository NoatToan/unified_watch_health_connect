package org.koin.core.component;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\b*\u00028\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\r\u001a\u0004\u0018\u00010\n\"\b\b\u0000\u0010\u0001*\u00020\b*\u00028\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f\"\b\b\u0000\u0010\u0001*\u00020\b*\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000f\"\b\b\u0000\u0010\u0001*\u00020\b*\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "getScopeId", "(Ljava/lang/Object;)Ljava/lang/String;", "Lorg/koin/core/qualifier/TypeQualifier;", "getScopeName", "(Ljava/lang/Object;)Lorg/koin/core/qualifier/TypeQualifier;", "Lorg/koin/core/component/KoinScopeComponent;", "source", "Lorg/koin/core/scope/Scope;", "createScope", "(Lorg/koin/core/component/KoinScopeComponent;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "getScopeOrNull", "(Lorg/koin/core/component/KoinScopeComponent;)Lorg/koin/core/scope/Scope;", "Lkotlin/Lazy;", "newScope", "(Lorg/koin/core/component/KoinScopeComponent;)Lkotlin/Lazy;", "getOrCreateScope", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class KoinScopeComponentKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/component/KoinScopeComponent;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Scope> {

        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ KoinScopeComponent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public a(KoinScopeComponent koinScopeComponent) {
            super(0);
            this.a = koinScopeComponent;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Scope invoke() {
            Scope scopeOrNull = KoinScopeComponentKt.getScopeOrNull(this.a);
            return scopeOrNull == null ? KoinScopeComponentKt.createScope$default(this.a, null, 1, null) : scopeOrNull;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/component/KoinScopeComponent;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Scope> {

        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ KoinScopeComponent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public b(KoinScopeComponent koinScopeComponent) {
            super(0);
            this.a = koinScopeComponent;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Scope invoke() {
            return KoinScopeComponentKt.createScope$default(this.a, null, 1, null);
        }
    }

    @NotNull
    public static final <T extends KoinScopeComponent> Scope createScope(@NotNull T t, @Nullable Object obj) {
        return t.getKoin().createScope(getScopeId(t), getScopeName(t), obj);
    }

    public static /* synthetic */ Scope createScope$default(KoinScopeComponent koinScopeComponent, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return createScope(koinScopeComponent, obj);
    }

    @NotNull
    public static final <T extends KoinScopeComponent> Lazy<Scope> getOrCreateScope(@NotNull T t) {
        return LazyKt__LazyJVMKt.lazy(new a(t));
    }

    @NotNull
    public static final <T> String getScopeId(@NotNull T t) {
        return KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(t.getClass())) + '@' + t.hashCode();
    }

    @NotNull
    public static final <T> TypeQualifier getScopeName(@NotNull T t) {
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(t.getClass()));
    }

    @Nullable
    public static final <T extends KoinScopeComponent> Scope getScopeOrNull(@NotNull T t) {
        return t.getKoin().getScopeOrNull(getScopeId(t));
    }

    @NotNull
    public static final <T extends KoinScopeComponent> Lazy<Scope> newScope(@NotNull T t) {
        return LazyKt__LazyJVMKt.lazy(new b(t));
    }
}
