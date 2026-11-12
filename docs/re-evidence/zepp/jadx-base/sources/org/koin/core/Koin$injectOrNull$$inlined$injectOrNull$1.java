package org.koin.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.Nullable;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "org/koin/core/scope/Scope$injectOrNull$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class Koin$injectOrNull$$inlined$injectOrNull$1<T> extends Lambda implements Function0<T> {
    public final /* synthetic */ Scope a;
    public final /* synthetic */ Qualifier b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Koin$injectOrNull$$inlined$injectOrNull$1(Scope scope, Qualifier qualifier, Function0 function0) {
        super(0);
        this.a = scope;
        this.b = qualifier;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final T invoke() {
        Scope scope = this.a;
        Qualifier qualifier = this.b;
        Function0<? extends ParametersHolder> function0 = this.c;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }
}
