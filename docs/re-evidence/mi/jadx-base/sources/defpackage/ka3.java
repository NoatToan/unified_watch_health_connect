package defpackage;

import java.io.IOException;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public interface ka3<T> extends Cloneable {
    void E(xa3<T> xa3Var);

    void cancel();

    /* JADX INFO: renamed from: clone */
    ka3<T> mo875clone();

    prk<T> execute() throws IOException;

    boolean isCanceled();

    Request request();
}
