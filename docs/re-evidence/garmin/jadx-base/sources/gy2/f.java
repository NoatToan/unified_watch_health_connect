package gy2;

import am.j;
import android.content.Context;
import com.garmin.sync.gc.exception.ServerException;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import d53.k;
import d53.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lgy2/f;", "", "", "loggingPrefix", "<init>", "(Ljava/lang/String;)V", "a", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f80309b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f80310a;

    public f(String str) {
        str.getClass();
        Logger logger = LoggerFactory.getLogger(str.concat("DownloadHelper"));
        logger.getClass();
        this.f80310a = logger;
    }

    public static String a(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder(str);
        if (!u.p(str, "/", false) && !u.y(str2, "/", false)) {
            sb3.append("/");
        }
        sb3.append(str2);
        String string = sb3.toString();
        f80309b.getClass();
        return a.a(string);
    }

    public static void e(byte[] bArr, File file, Context context) throws Throwable {
        IOException iOException;
        Throwable th3;
        context.getClass();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    fileOutputStream2.write(bArr);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException e4) {
                    iOException = e4;
                    throw new ServerException(i.TEMP_FILE_WRITE_FAILED, iOException.getMessage(), null, null, 12, null);
                } catch (Throwable th4) {
                    th3 = th4;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream == null) {
                        throw th3;
                    }
                    try {
                        fileOutputStream.close();
                        throw th3;
                    } catch (IOException unused2) {
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                th3 = th5;
            }
        } catch (IOException e14) {
            iOException = e14;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00fe: MOVE (r2 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:47:0x00fd */
    public final void b(String str, File file, Context context, boolean z14, Map<String, String> map) throws Throwable {
        Throwable th3;
        InputStream inputStream;
        StringBuilder sb3;
        Logger logger = this.f80310a;
        context.getClass();
        map.getClass();
        if (str.length() == 0) {
            throw new ServerException(i.INVALID_SOFTWARE_UPDATE_FILE_URL, j.m("Unable to get software update. Invalid URL [", str, "]"), str, null, 8, null);
        }
        if (file == null) {
            throw new ServerException(i.TEMP_FILE_WRITE_FAILED, "Unable to get software update. Invalid destination [null]", str, null, 8, null);
        }
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    try {
                        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                        uRLConnectionOpenConnection.getClass();
                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setReadTimeout(15000);
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                        if (z14) {
                            httpURLConnection.setRequestProperty("Sync-Type", "background");
                        } else {
                            httpURLConnection.setRequestProperty("Sync-Type", DownloadService.KEY_FOREGROUND);
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == 200) {
                            InputStream inputStream3 = httpURLConnection.getInputStream();
                            if (inputStream3 != null) {
                                d(inputStream3, file);
                            }
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                    return;
                                } catch (Exception e4) {
                                    e = e4;
                                    sb3 = new StringBuilder("Exception in closing input stream ");
                                    sb3.append(e);
                                    logger.error(sb3.toString());
                                }
                            }
                            return;
                        }
                        if (responseCode == 204 || responseCode == 404) {
                            throw new ServerException(i.CONTENT_DOES_NOT_EXIST, "No content found " + responseCode, str, Integer.valueOf(responseCode));
                        }
                        throw new ServerException(i.UNEXPECTED_SERVER_RESPONSE, "Unable to get software update for " + str + ". Unexpected server response [" + responseCode + "]. Expected [200].", str, Integer.valueOf(responseCode));
                    } catch (Throwable th4) {
                        th3 = th4;
                        if (inputStream2 == null) {
                            throw th3;
                        }
                        try {
                            inputStream2.close();
                            throw th3;
                        } catch (Exception e14) {
                            logger.error("Exception in closing input stream " + e14);
                            throw th3;
                        }
                    }
                } catch (MalformedURLException e15) {
                    logger.error("Malformed URL [" + str + "].", (Throwable) e15);
                    if (0 != 0) {
                        try {
                            inputStream2.close();
                        } catch (Exception e16) {
                            e = e16;
                            sb3 = new StringBuilder("Exception in closing input stream ");
                            sb3.append(e);
                            logger.error(sb3.toString());
                        }
                    }
                }
            } catch (UnsupportedEncodingException e17) {
                logger.error("Bad URL [" + str + "].", (Throwable) e17);
                if (0 != 0) {
                    try {
                        inputStream2.close();
                    } catch (Exception e18) {
                        e = e18;
                        sb3 = new StringBuilder("Exception in closing input stream ");
                        sb3.append(e);
                        logger.error(sb3.toString());
                    }
                }
            } catch (ConnectException e19) {
                String message = e19.getMessage();
                i iVar = i.SOFTWARE_UPDATE_FILE_DOWNLOAD_FAILED;
                if (!hb2.i.a(context)) {
                    iVar = i.NO_NETWORK_CONNECTIVITY;
                    message = "Unable to get software update. Intermittent or no network connectivity.";
                }
                throw new ServerException(iVar, message, str, null, 8, null);
            } catch (IOException e24) {
                throw new ServerException(i.SOFTWARE_UPDATE_FILE_DOWNLOAD_FAILED, e24.getMessage(), str, null, 8, null);
            }
        } catch (Throwable th5) {
            th3 = th5;
            inputStream2 = inputStream;
        }
    }

    public final boolean c(int i14, String str) {
        Logger logger = this.f80310a;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.HEAD);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                return true;
            }
            if (responseCode != 404) {
                if (responseCode != 301 && responseCode != 302) {
                    logger.warn("Expecting only 200, 301, 302, 404 but got " + responseCode);
                    return false;
                }
                String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                if (i14 < 5 && headerField != null && headerField.length() != 0) {
                    headerField.getClass();
                    return c(i14 + 1, headerField);
                }
            }
            return false;
        } catch (IOException e4) {
            logger.error("IOException [" + str + "].", (Throwable) e4);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    public final void d(InputStream inputStream, File file) throws Throwable {
        Throwable th3;
        WritableByteChannel writableByteChannel;
        IOException iOException;
        Logger logger = this.f80310a;
        ReadableByteChannel readableByteChannel = null;
        writableByteChannelNewChannel = null;
        WritableByteChannel writableByteChannelNewChannel = null;
        readableByteChannel = null;
        try {
            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStream);
            try {
                writableByteChannelNewChannel = Channels.newChannel(new FileOutputStream(file));
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1024);
                while (readableByteChannelNewChannel.read(byteBufferAllocateDirect) != -1) {
                    byteBufferAllocateDirect.flip();
                    writableByteChannelNewChannel.write(byteBufferAllocateDirect);
                    byteBufferAllocateDirect.compact();
                }
                byteBufferAllocateDirect.flip();
                while (byteBufferAllocateDirect.hasRemaining()) {
                    writableByteChannelNewChannel.write(byteBufferAllocateDirect);
                }
                try {
                    readableByteChannelNewChannel.close();
                } catch (IOException e4) {
                    logger.error("Exception closing ReadableByteChannel.", (Throwable) e4);
                }
                if (writableByteChannelNewChannel != null) {
                    try {
                        writableByteChannelNewChannel.close();
                    } catch (IOException e14) {
                        logger.error("Exception closing WritableByteChannel.", (Throwable) e14);
                    }
                }
            } catch (IOException e15) {
                iOException = e15;
                WritableByteChannel writableByteChannel2 = writableByteChannelNewChannel;
                readableByteChannel = readableByteChannelNewChannel;
                writableByteChannel = writableByteChannel2;
                try {
                    throw new ServerException(i.TEMP_FILE_WRITE_FAILED, iOException.getMessage(), null, null, 12, null);
                } catch (Throwable th4) {
                    th3 = th4;
                    if (readableByteChannel != null) {
                        try {
                            readableByteChannel.close();
                        } catch (IOException e16) {
                            logger.error("Exception closing ReadableByteChannel.", (Throwable) e16);
                        }
                    }
                    if (writableByteChannel != null) {
                        throw th3;
                    }
                    try {
                        writableByteChannel.close();
                        throw th3;
                    } catch (IOException e17) {
                        logger.error("Exception closing WritableByteChannel.", (Throwable) e17);
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                th3 = th5;
                WritableByteChannel writableByteChannel3 = writableByteChannelNewChannel;
                readableByteChannel = readableByteChannelNewChannel;
                writableByteChannel = writableByteChannel3;
                if (readableByteChannel != null) {
                    readableByteChannel.close();
                }
                if (writableByteChannel != null) {
                    throw th3;
                }
                writableByteChannel.close();
                throw th3;
            }
        } catch (IOException e18) {
            iOException = e18;
            writableByteChannel = null;
        } catch (Throwable th6) {
            th3 = th6;
            writableByteChannel = null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lgy2/f$a;", "", "<init>", "()V", "", "HTTP_CONNECTION_READ_TIMEOUT", "I", "HTTP_CONNECTION_TIMEOUT", "HTTP_MAX_REDIRECT_COUNT", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(String str) {
            if (str == null || !u.y(str, "http:", false)) {
                return str;
            }
            String strReplaceFirst = new k("http:").f57698a.matcher(str).replaceFirst("https:");
            strReplaceFirst.getClass();
            return strReplaceFirst;
        }

        private a() {
        }
    }
}
