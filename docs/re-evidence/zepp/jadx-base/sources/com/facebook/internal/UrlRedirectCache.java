package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/facebook/internal/UrlRedirectCache;", "", "Lcom/facebook/internal/FileLruCache;", "getCache", "Landroid/net/Uri;", "uri", "getRedirectedUri", "fromUri", "toUri", "", "cacheUriRedirect", "clearCache", "", "a", "Ljava/lang/String;", "tag", "b", "redirectContentTag", "c", "Lcom/facebook/internal/FileLruCache;", "urlRedirectFileLruCache", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class UrlRedirectCache {

    @NotNull
    public static final UrlRedirectCache INSTANCE = new UrlRedirectCache();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String redirectContentTag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static FileLruCache urlRedirectFileLruCache;

    static {
        String simpleName = Reflection.getOrCreateKotlinClass(UrlRedirectCache.class).getSimpleName();
        if (simpleName == null) {
            simpleName = "UrlRedirectCache";
        }
        tag = simpleName;
        redirectContentTag = simpleName + "_Redirect";
    }

    private UrlRedirectCache() {
    }

    @JvmStatic
    public static final void cacheUriRedirect(@Nullable Uri fromUri, @Nullable Uri toUri) {
        if (fromUri == null || toUri == null) {
            return;
        }
        OutputStream outputStreamOpenPutStream = null;
        try {
            try {
                outputStreamOpenPutStream = getCache().openPutStream(fromUri.toString(), redirectContentTag);
                String string = toUri.toString();
                Charset charset = Charsets.UTF_8;
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                outputStreamOpenPutStream.write(string.getBytes(charset));
                Utility.closeQuietly(outputStreamOpenPutStream);
            } catch (IOException e) {
                Logger.INSTANCE.log(LoggingBehavior.CACHE, 4, tag, "IOException when accessing cache: " + e.getMessage());
            }
        } catch (Throwable th) {
            Utility.closeQuietly(null);
            throw th;
        }
    }

    @JvmStatic
    public static final void clearCache() {
        try {
            getCache().clearCache();
        } catch (IOException e) {
            Logger.INSTANCE.log(LoggingBehavior.CACHE, 5, tag, "clearCache failed " + e.getMessage());
        }
    }

    @JvmStatic
    @NotNull
    public static final synchronized FileLruCache getCache() throws IOException {
        FileLruCache fileLruCache;
        fileLruCache = urlRedirectFileLruCache;
        if (fileLruCache == null) {
            fileLruCache = new FileLruCache(tag, new FileLruCache.Limits());
        }
        urlRedirectFileLruCache = fileLruCache;
        return fileLruCache;
    }

    @JvmStatic
    @Nullable
    public static final Uri getRedirectedUri(@Nullable Uri uri) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        HashSet hashSet = new HashSet();
        hashSet.add(string);
        try {
            FileLruCache cache = getCache();
            InputStream inputStream = cache.get(string, redirectContentTag);
            inputStreamReader = null;
            boolean z = false;
            while (inputStream != null) {
                z = true;
                try {
                    try {
                        InputStreamReader inputStreamReader3 = new InputStreamReader(inputStream);
                        try {
                            char[] cArr = new char[128];
                            StringBuilder sb = new StringBuilder();
                            for (int i = inputStreamReader3.read(cArr, 0, 128); i > 0; i = inputStreamReader3.read(cArr, 0, 128)) {
                                sb.append(cArr, 0, i);
                            }
                            Utility.closeQuietly(inputStreamReader3);
                            String string2 = sb.toString();
                            if (hashSet.contains(string2)) {
                                if (Intrinsics.areEqual(string2, string)) {
                                    inputStreamReader = inputStreamReader3;
                                    break;
                                }
                                Logger.INSTANCE.log(LoggingBehavior.CACHE, 6, tag, "A loop detected in UrlRedirectCache");
                                Utility.closeQuietly(inputStreamReader3);
                                return null;
                            }
                            hashSet.add(string2);
                            inputStreamReader = inputStreamReader3;
                            inputStream = cache.get(string2, redirectContentTag);
                            string = string2;
                        } catch (IOException e) {
                            e = e;
                            inputStreamReader = inputStreamReader3;
                            Logger.INSTANCE.log(LoggingBehavior.CACHE, 4, tag, "IOException when accessing cache: " + e.getMessage());
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader2 = inputStreamReader3;
                            Utility.closeQuietly(inputStreamReader2);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader2 = inputStreamReader;
                }
            }
            if (z) {
                Uri uri2 = Uri.parse(string);
                Utility.closeQuietly(inputStreamReader);
                return uri2;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
        }
        Utility.closeQuietly(inputStreamReader);
        return null;
    }
}
