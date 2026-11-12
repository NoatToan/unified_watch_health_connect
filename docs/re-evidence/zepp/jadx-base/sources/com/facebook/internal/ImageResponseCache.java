package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.xiaomi.ai.core.AivsConfig;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0007R\u0019\u0010\u0013\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/facebook/internal/ImageResponseCache;", "", "Lcom/facebook/internal/FileLruCache;", "getCache", "Landroid/net/Uri;", "uri", "Ljava/io/InputStream;", "getCachedImageStream", "Ljava/net/HttpURLConnection;", AbsEsimOperation.HEADER_CONNECTION, "interceptAndCacheImageStream", "", "a", "", "clearCache", "", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "b", "Lcom/facebook/internal/FileLruCache;", "imageCache", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ImageResponseCache {

    @NotNull
    public static final ImageResponseCache INSTANCE = new ImageResponseCache();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = ImageResponseCache.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static FileLruCache imageCache;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"com/facebook/internal/ImageResponseCache$a", "Ljava/io/BufferedInputStream;", "", "close", "Ljava/net/HttpURLConnection;", "a", "Ljava/net/HttpURLConnection;", "()Ljava/net/HttpURLConnection;", "b", "(Ljava/net/HttpURLConnection;)V", AbsEsimOperation.HEADER_CONNECTION, "Ljava/io/InputStream;", AivsConfig.Tts.AUDIO_TYPE_STREAM, "<init>", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends BufferedInputStream {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private HttpURLConnection connection;

        public a(@Nullable InputStream inputStream, @NotNull HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            this.connection = httpURLConnection;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final HttpURLConnection getConnection() {
            return this.connection;
        }

        public final void b(@NotNull HttpURLConnection httpURLConnection) {
            this.connection = httpURLConnection;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            Utility.disconnectQuietly(this.connection);
        }
    }

    private ImageResponseCache() {
    }

    private final boolean a(Uri uri) {
        if (uri != null) {
            String host = uri.getHost();
            if (host != null && m.endsWith$default(host, "fbcdn.net", false, 2, null)) {
                return true;
            }
            if (host != null && m.startsWith$default(host, "fbcdn", false, 2, null) && m.endsWith$default(host, "akamaihd.net", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (IOException e) {
            Logger.INSTANCE.log(LoggingBehavior.CACHE, 5, TAG, "clearCache failed " + e.getMessage());
        }
    }

    @JvmStatic
    @NotNull
    public static final synchronized FileLruCache getCache() throws IOException {
        FileLruCache fileLruCache;
        if (imageCache == null) {
            imageCache = new FileLruCache(TAG, new FileLruCache.Limits());
        }
        fileLruCache = imageCache;
        if (fileLruCache == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        return fileLruCache;
    }

    @JvmStatic
    @Nullable
    public static final InputStream getCachedImageStream(@Nullable Uri uri) {
        if (uri == null || !INSTANCE.a(uri)) {
            return null;
        }
        try {
            return FileLruCache.get$default(getCache(), uri.toString(), null, 2, null);
        } catch (IOException e) {
            Logger.INSTANCE.log(LoggingBehavior.CACHE, 5, TAG, e.toString());
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final InputStream interceptAndCacheImageStream(@NotNull HttpURLConnection connection) throws IOException {
        if (connection.getResponseCode() != 200) {
            return null;
        }
        Uri uri = Uri.parse(connection.getURL().toString());
        InputStream inputStream = connection.getInputStream();
        try {
            return INSTANCE.a(uri) ? getCache().interceptAndPut(uri.toString(), new a(inputStream, connection)) : inputStream;
        } catch (IOException unused) {
            return inputStream;
        }
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }
}
