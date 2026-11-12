package zh;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface f extends Closeable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzh/f$a;", "", "<init>", "(Ljava/lang/String;I)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum a {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        LONG,
        BOOLEAN,
        NULL,
        END_DOCUMENT,
        ANY
    }

    f A();

    int S1(List<String> list);

    e a3();

    f g();

    ArrayList getPath();

    boolean hasNext();

    boolean nextBoolean();

    double nextDouble();

    int nextInt();

    long nextLong();

    String nextName();

    void nextNull();

    String nextString();

    a peek();

    f q();

    void rewind();

    void skipValue();

    f y();
}
