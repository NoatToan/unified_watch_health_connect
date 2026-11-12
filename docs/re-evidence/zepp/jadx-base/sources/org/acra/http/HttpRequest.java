package org.acra.http;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes23.dex */
public interface HttpRequest<T> {
    void send(@NonNull URL url, @NonNull T t) throws IOException;
}
