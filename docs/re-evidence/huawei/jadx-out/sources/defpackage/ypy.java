package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes20.dex */
public class ypy {
    public static Type c(Class<? extends KfsConstraintValidator<?, ?>> cls) {
        return ((ParameterizedType) cls.getGenericInterfaces()[0]).getActualTypeArguments()[1];
    }
}
