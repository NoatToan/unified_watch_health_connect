package defpackage;

import android.content.Context;
import android.net.Uri;
import com.miui.tsmclient.common.net.request.BaseRequest;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public class bnk {

    public class a extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediaType f4401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InputStream f4402b;

        public a(MediaType mediaType, InputStream inputStream) {
            this.f4401a = mediaType;
            this.f4402b = inputStream;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            try {
                return this.f4402b.available();
            } catch (IOException unused) {
                return 0L;
            }
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public MediaType getContentType() {
            return this.f4401a;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            Source source = null;
            try {
                source = Okio.source(this.f4402b);
                bufferedSink.writeAll(source);
            } finally {
                Util.closeQuietly(source);
            }
        }
    }

    public static RequestBody a(MediaType mediaType, InputStream inputStream) {
        return new a(mediaType, inputStream);
    }

    public static RequestBody b(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static hci c(RequestBody requestBody, gci gciVar) {
        return new hci(requestBody, gciVar);
    }

    public static InputStream d(Context context, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        fileCreateTempFile.deleteOnExit();
        InputStream inputStreamOpenStream = new URL(uri.toString()).openStream();
        try {
            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    fileOutputStream.close();
                    readableByteChannelNewChannel.close();
                    inputStreamOpenStream.close();
                    return fileInputStream;
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                readableByteChannelNewChannel.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStreamOpenStream.close();
            throw th3;
        }
    }

    public static RequestBody e(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals(BaseRequest.Method.PATCH)) {
            return RequestBody.create((MediaType) null, ByteString.EMPTY);
        }
        return null;
    }

    public static InputStream f(Context context, String str) {
        try {
            Uri uri = Uri.parse(str);
            return uri.getScheme().startsWith("http") ? d(context, uri) : context.getContentResolver().openInputStream(uri);
        } catch (Exception e) {
            cm8.j("ReactNative", "Could not retrieve file for contentUri " + str, e);
            return null;
        }
    }

    public static boolean g(String str) {
        return "gzip".equalsIgnoreCase(str);
    }
}
