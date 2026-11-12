package org.acra.http;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import org.acra.config.CoreConfiguration;
import org.acra.sender.HttpSender;
import org.acra.util.UriUtils;

/* JADX INFO: loaded from: classes23.dex */
public class BinaryHttpRequest extends BaseHttpRequest<Uri> {
    private final Context j;

    public BinaryHttpRequest(@NonNull CoreConfiguration coreConfiguration, @NonNull Context context, @Nullable String str, @Nullable String str2, int i, int i2, @Nullable Map<String, String> map) {
        super(coreConfiguration, context, HttpSender.Method.PUT, str, str2, i, i2, map);
        this.j = context;
    }

    @Override // org.acra.http.BaseHttpRequest
    @NonNull
    public String getContentType(@NonNull Context context, @NonNull Uri uri) {
        return UriUtils.getMimeType(context, uri);
    }

    @Override // org.acra.http.BaseHttpRequest
    public void write(OutputStream outputStream, @NonNull Uri uri) throws IOException {
        UriUtils.copyFromUri(this.j, outputStream, uri);
    }
}
