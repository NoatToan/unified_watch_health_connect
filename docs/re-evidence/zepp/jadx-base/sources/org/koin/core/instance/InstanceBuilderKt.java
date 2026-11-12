package org.koin.core.instance;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.core.annotation.KoinReflectAPI;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.logger.Level;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;
import org.koin.core.time.MeasureKt;
import org.koin.ext.KClassExtKt;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a*\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\n\u001a-\u0010\u000f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a1\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "defParams", "newInstance", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "kClass", "params", "(Lorg/koin/core/scope/Scope;Lkotlin/reflect/KClass;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;", "", "args", "Ljava/lang/reflect/Constructor;", "constructor", "a", "([Ljava/lang/Object;Ljava/lang/reflect/Constructor;)Ljava/lang/Object;", "scope", "parameters", "b", "(Ljava/lang/reflect/Constructor;Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)[Ljava/lang/Object;", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class InstanceBuilderKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ParametersHolder> {
        public final /* synthetic */ ParametersHolder a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ParametersHolder parametersHolder) {
            super(0);
            this.a = parametersHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ParametersHolder invoke() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Object> {
        public final /* synthetic */ Object[] a;
        public final /* synthetic */ Constructor<?> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object[] objArr, Constructor<?> constructor) {
            super(0);
            this.a = objArr;
            this.b = constructor;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Object invoke() {
            return InstanceBuilderKt.a(this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Object[]> {
        public final /* synthetic */ Constructor<?> a;
        public final /* synthetic */ Scope b;
        public final /* synthetic */ ParametersHolder c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor<?> constructor, Scope scope, ParametersHolder parametersHolder) {
            super(0);
            this.a = constructor;
            this.b = scope;
            this.c = parametersHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Object[] invoke() {
            return InstanceBuilderKt.b(this.a, this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object a(Object[] objArr, Constructor<? extends Object> constructor) {
        return objArr.length == 0 ? constructor.newInstance(new Object[0]) : constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] b(Constructor<?> constructor, Scope scope, ParametersHolder parametersHolder) throws NoBeanDefFoundException {
        int length = constructor.getParameterTypes().length;
        int i = 0;
        if (length == 0) {
            return new Object[0];
        }
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            objArr[i2] = Unit.INSTANCE;
        }
        if (length > 0) {
            while (true) {
                int i3 = i + 1;
                KClass<?> kotlinClass = JvmClassMappingKt.getKotlinClass(constructor.getParameterTypes()[i]);
                Object orNull = scope.getOrNull(kotlinClass, null, new a(parametersHolder));
                if (orNull == null && (orNull = parametersHolder.getOrNull(kotlinClass)) == null) {
                    throw new NoBeanDefFoundException("No definition found for class '" + kotlinClass + '\'');
                }
                objArr[i] = orNull;
                if (i3 >= length) {
                    break;
                }
                i = i3;
            }
        }
        return objArr;
    }

    @KoinReflectAPI
    public static final /* synthetic */ <T> T newInstance(Scope scope, ParametersHolder parametersHolder) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) newInstance(scope, Reflection.getOrCreateKotlinClass(Object.class), parametersHolder);
    }

    public static /* synthetic */ Object newInstance$default(Scope scope, ParametersHolder parametersHolder, int i, Object obj) {
        if ((i & 1) != 0) {
            parametersHolder = ParametersHolderKt.emptyParametersHolder();
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return newInstance(scope, Reflection.getOrCreateKotlinClass(Object.class), parametersHolder);
    }

    @NotNull
    @KoinReflectAPI
    public static final <T> T newInstance(@NotNull Scope scope, @NotNull KClass<T> kClass, @NotNull ParametersHolder parametersHolder) throws NoBeanDefFoundException {
        Object[] objArrB;
        Level level = scope.getLogger().getCom.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL java.lang.String();
        Level level2 = Level.DEBUG;
        if (level == level2) {
            scope.getLogger().debug(Intrinsics.stringPlus("|- creating new instance - ", KClassExtKt.getFullName(kClass)));
        }
        Constructor constructor = (Constructor) ArraysKt.firstOrNull(JvmClassMappingKt.getJavaClass((KClass) kClass).getConstructors());
        if (constructor == null) {
            throw new IllegalStateException(("No constructor found for class '" + KClassExtKt.getFullName(kClass) + '\'').toString());
        }
        if (scope.getLogger().getCom.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL java.lang.String() == level2) {
            Pair pairMeasureDurationForResult = MeasureKt.measureDurationForResult(new c(constructor, scope, parametersHolder));
            objArrB = (Object[]) pairMeasureDurationForResult.component1();
            double dDoubleValue = ((Number) pairMeasureDurationForResult.component2()).doubleValue();
            scope.getLogger().debug("|- got arguments in " + dDoubleValue + " ms");
        } else {
            objArrB = b(constructor, scope, parametersHolder);
        }
        if (scope.getLogger().getCom.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL java.lang.String() != level2) {
            return (T) a(objArrB, constructor);
        }
        Pair pairMeasureDurationForResult2 = MeasureKt.measureDurationForResult(new b(objArrB, constructor));
        T t = (T) pairMeasureDurationForResult2.component1();
        double dDoubleValue2 = ((Number) pairMeasureDurationForResult2.component2()).doubleValue();
        scope.getLogger().debug("|- created instance in " + dDoubleValue2 + " ms");
        return t;
    }
}
