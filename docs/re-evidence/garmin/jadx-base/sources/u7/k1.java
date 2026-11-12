package u7;

import java.io.InputStream;
import java.io.OutputStream;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface k1<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, t13.d<? super T> dVar);

    Object writeTo(T t7, OutputStream outputStream, t13.d<? super Unit> dVar);
}
