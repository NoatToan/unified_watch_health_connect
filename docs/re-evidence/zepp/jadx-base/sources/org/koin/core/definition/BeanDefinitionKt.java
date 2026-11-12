package org.koin.core.definition;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002\u001aw\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0006\b\u0000\u0010\u0007\u0018\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022)\b\b\u0010\u0010\u001a#\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u000bj\b\u0012\u0004\u0012\u00028\u0000`\u000e¢\u0006\u0002\b\u000f2\u0012\b\u0002\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\bø\u0001\u0000*>\u0010\u0015\u001a\u0004\b\u0000\u0010\u0007\"\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\u000f2\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\u000f*\n\u0010\u0016\"\u00020\u00052\u00020\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/KClass;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "typeQualifier", "scopeQualifier", "", "indexKey", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/definition/Kind;", XimalayaConst.KIND, "qualifier", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", TrainingWebConst.QueryParam.DEFINITION, "", "secondaryTypes", "Lorg/koin/core/definition/BeanDefinition;", "createDefinition", "Definition", "IndexKey", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class BeanDefinitionKt {
    public static final /* synthetic */ <T> BeanDefinition<T> createDefinition(Kind kind, Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> function2, List<? extends KClass<?>> list, Qualifier qualifier2) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new BeanDefinition<>(qualifier2, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, list);
    }

    public static /* synthetic */ BeanDefinition createDefinition$default(Kind kind, Qualifier qualifier, Function2 function2, List list, Qualifier qualifier2, int i, Object obj) {
        if ((i & 1) != 0) {
            kind = Kind.Singleton;
        }
        Kind kind2 = kind;
        if ((i & 2) != 0) {
            qualifier = null;
        }
        Qualifier qualifier3 = qualifier;
        if ((i & 8) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new BeanDefinition(qualifier2, Reflection.getOrCreateKotlinClass(Object.class), qualifier3, function2, kind2, list);
    }

    @NotNull
    public static final String indexKey(@NotNull KClass<?> kClass, @Nullable Qualifier qualifier, @NotNull Qualifier qualifier2) {
        String value;
        String str = "";
        if (qualifier != null && (value = qualifier.getValue()) != null) {
            str = value;
        }
        return KClassExtKt.getFullName(kClass) + JsonLexerKt.COLON + str + JsonLexerKt.COLON + qualifier2;
    }
}
