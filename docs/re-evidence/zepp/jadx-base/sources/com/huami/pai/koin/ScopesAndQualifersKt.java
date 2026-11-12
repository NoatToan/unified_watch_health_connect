package com.huami.pai.koin;

import android.content.ComponentCallbacks;
import androidx.exifinterface.media.ExifInterface;
import com.huami.pai.db.PaiDb;
import com.huami.pai.dto.Myself;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.Koin;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001aF\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0003*\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\n\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\nH\u0086\bø\u0001\u0000\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0010*\u00020\u0001\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "paiScope", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/ComponentCallbacks;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/Lazy;", "injectInPai", "Lcom/huami/pai/dto/Myself;", "myself", "", "paiWebHost", "Lcom/huami/pai/db/PaiDb;", "paiDb", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class ScopesAndQualifersKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.huami.pai.koin.ScopesAndQualifersKt$injectInPai$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {
        public final /* synthetic */ ComponentCallbacks a;
        public final /* synthetic */ Qualifier b;
        public final /* synthetic */ Function0<ParametersHolder> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.a = componentCallbacks;
            this.b = qualifier;
            this.c = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            Scope scopePaiScope = ScopesAndQualifersKt.paiScope(ComponentCallbackExtKt.getKoin(this.a));
            Qualifier qualifier = this.b;
            Function0<ParametersHolder> function0 = this.c;
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) scopePaiScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        }
    }

    public static final /* synthetic */ <T> Lazy<T> injectInPai(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(new AnonymousClass1(componentCallbacks, qualifier, function0));
    }

    public static /* synthetic */ Lazy injectInPai$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(new AnonymousClass1(componentCallbacks, qualifier, function0));
    }

    @NotNull
    public static final Myself myself(@NotNull Scope scope) {
        return (Myself) paiScope(scope).get(Reflection.getOrCreateKotlinClass(Myself.class), null, null);
    }

    @NotNull
    public static final PaiDb paiDb(@NotNull Koin koin) {
        return (PaiDb) paiScope(koin).get(Reflection.getOrCreateKotlinClass(PaiDb.class), null, null);
    }

    @NotNull
    public static final Scope paiScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, PaiScopeNames.PAI, QualifierKt.named(PaiScopeNames.PAI), null, 4, null);
    }

    @NotNull
    public static final String paiWebHost(@NotNull Scope scope) {
        return (String) paiScope(scope).get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(PaiQualifierNames.HOST), null);
    }

    @NotNull
    public static final Scope paiScope(@NotNull Scope scope) {
        return paiScope(scope.getKoin());
    }
}
