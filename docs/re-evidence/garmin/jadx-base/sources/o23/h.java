package o23;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface h<M extends Member> {
    boolean a();

    List<Type> b();

    M c();

    Object call(Object[] objArr);

    Type getReturnType();
}
