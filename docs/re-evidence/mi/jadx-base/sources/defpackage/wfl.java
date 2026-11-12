package defpackage;

import android.content.Context;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface wfl {
    boolean canHandle(@NotNull Uri uri);

    void process(@NotNull Context context, @NotNull Uri uri, Object obj);
}
