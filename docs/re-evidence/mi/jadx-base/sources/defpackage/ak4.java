package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: loaded from: classes4.dex */
public interface ak4<IN, OUT> {

    public static abstract class a implements ak4<Object, Object> {
    }

    JavaType a(TypeFactory typeFactory);

    JavaType b(TypeFactory typeFactory);

    OUT convert(IN in);
}
