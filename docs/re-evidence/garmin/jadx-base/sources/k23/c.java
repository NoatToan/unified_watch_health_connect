package k23;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface c<R> extends b {
    R call(Object... objArr);

    R callBy(Map<k, ? extends Object> map);

    String getName();

    List<k> getParameters();

    p getReturnType();

    List<q> getTypeParameters();

    t getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
