package org.acra.http;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import org.acra.config.CoreConfiguration;
import org.acra.sender.HttpSender;

/* JADX INFO: loaded from: classes23.dex */
public class DefaultHttpRequest extends BaseHttpRequest<String> {
    private final String j;

    public DefaultHttpRequest(@NonNull CoreConfiguration coreConfiguration, @NonNull Context context, @NonNull HttpSender.Method method, @NonNull String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable Map<String, String> map) {
        super(coreConfiguration, context, method, str2, str3, i, i2, map);
        this.j = str;
    }

    @Override // org.acra.http.BaseHttpRequest
    @NonNull
    public String getContentType(@NonNull Context context, @NonNull String str) {
        return this.j;
    }

    @Override // org.acra.http.BaseHttpRequest
    public void write(OutputStream outputStream, @NonNull String str) throws IOException {
        outputStream.write(str.getBytes("UTF-8"));
    }
}
