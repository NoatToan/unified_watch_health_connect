package org.koin.core.registry;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class InstanceRegistry$declareInstance$def$1<T> extends Lambda implements Function2<Scope, ParametersHolder, T> {
    public final /* synthetic */ T a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceRegistry$declareInstance$def$1(T t) {
        super(2);
        this.a = t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final T invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
        return this.a;
    }
}
