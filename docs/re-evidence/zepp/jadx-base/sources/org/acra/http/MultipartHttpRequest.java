package org.acra.http;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import org.acra.ACRA;
import org.acra.config.CoreConfiguration;
import org.acra.sender.HttpSender;
import org.acra.util.UriUtils;

/* JADX INFO: loaded from: classes23.dex */
public class MultipartHttpRequest extends BaseHttpRequest<Pair<String, List<Uri>>> {
    private static final String l = "%&ACRA_REPORT_DIVIDER&%";
    private static final String m = "--";
    private static final String n = "\r\n";
    private static final String o = "\r\n--%&ACRA_REPORT_DIVIDER&%\r\n";
    private static final String p = "\r\n--%&ACRA_REPORT_DIVIDER&%--\r\n";
    private static final String q = "Content-Disposition: form-data; name=\"%s\"; filename=\"%s\"\r\n";
    private static final String r = "Content-Type: %s\r\n";
    private final Context j;
    private final String k;

    public MultipartHttpRequest(@NonNull CoreConfiguration coreConfiguration, @NonNull Context context, @NonNull String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable Map<String, String> map) {
        super(coreConfiguration, context, HttpSender.Method.POST, str2, str3, i, i2, map);
        this.j = context;
        this.k = str;
    }

    @Override // org.acra.http.BaseHttpRequest
    @NonNull
    public String getContentType(@NonNull Context context, @NonNull Pair<String, List<Uri>> pair) {
        return "multipart/form-data; boundary=%&ACRA_REPORT_DIVIDER&%";
    }

    @Override // org.acra.http.BaseHttpRequest
    public void write(OutputStream outputStream, @NonNull Pair<String, List<Uri>> pair) throws IOException {
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        printWriter.append((CharSequence) o).format(q, "ACRA_REPORT", "").format("Content-Type: %s\r\n", this.k).append((CharSequence) "\r\n").append((CharSequence) pair.first);
        for (Uri uri : (List) pair.second) {
            try {
                printWriter.append((CharSequence) o).format(q, "ACRA_ATTACHMENT", UriUtils.getFileNameFromUri(this.j, uri)).format("Content-Type: %s\r\n", UriUtils.getMimeType(this.j, uri)).append((CharSequence) "\r\n").flush();
                UriUtils.copyFromUri(this.j, outputStream, uri);
            } catch (FileNotFoundException e) {
                ACRA.log.w("Not sending attachment", e);
            }
        }
        printWriter.append((CharSequence) p).flush();
    }
}
