package com.huami.userproperty.datasource.impl;

import com.huami.userproperty.service.UserProperty;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/userproperty/service/UserProperty;", "Ljava/lang/reflect/Type;", "getFirstTypeParam", "(Lcom/huami/userproperty/service/UserProperty;)Ljava/lang/reflect/Type;", "firstTypeParam", "userproperty_release"}, k = 2, mv = {1, 5, 1})
public final class SerializeHelperKt {
    @NotNull
    public static final Type getFirstTypeParam(@NotNull UserProperty<?> userProperty) {
        Type type = userProperty.getClass().getGenericInterfaces()[0];
        Objects.requireNonNull(type, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        return ((ParameterizedType) type).getActualTypeArguments()[0];
    }
}
