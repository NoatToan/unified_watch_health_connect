package linc.com.amplituda;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.perf.FirebasePerformance;
import com.mapbox.common.HttpHeaders;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import linc.com.amplituda.exceptions.io.AmplitudaIOException;

/* JADX INFO: loaded from: classes3.dex */
final class FileManager {
    static final String AMPLITUDA_INTERNAL_CACHE = "internal-ampl-cache";
    private final String cache;
    private final Resources resources;

    public FileManager(Context context) {
        this.resources = context.getResources();
        this.cache = context.getExternalCacheDir().getPath() + File.separator;
    }

    private synchronized byte[] getByteArrayFromInputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[65535];
            while (true) {
                int i14 = inputStream.read(bArr);
                if (i14 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i14);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private synchronized long getUrlContentLength(URLConnection uRLConnection) {
        long jLongValue;
        jLongValue = -1;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.HEAD);
            String headerField = httpURLConnection.getHeaderField(HttpHeaders.CONTENT_LENGTH);
            Long lValueOf = headerField == null ? null : Long.valueOf(Long.parseLong(headerField));
            if (lValueOf != null && lValueOf.longValue() >= 0) {
                jLongValue = lValueOf.longValue();
            }
        } catch (Exception unused) {
            return -1L;
        }
        return jLongValue;
    }

    private synchronized void streamToFile(InputStream inputStream, File file, int i14, long j8, AmplitudaProgressListener amplitudaProgressListener) {
        int i15;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[i14];
            int i16 = 0;
            int i17 = 0;
            while (true) {
                int i18 = inputStream.read(bArr);
                if (i18 == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i18);
                i16 += i18;
                if (amplitudaProgressListener != null && j8 > 0 && (i15 = (int) (((double) (i16 / j8)) * 100.0d)) != i17) {
                    amplitudaProgressListener.onProgressInternal(i15);
                    i17 = i15;
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th3) {
            try {
                inputStream.close();
            } catch (IOException | NullPointerException unused2) {
            }
            throw th3;
        }
        try {
            inputStream.close();
        } catch (IOException | NullPointerException unused3) {
        }
    }

    public synchronized void clearAllCacheFiles() {
        clearCache(AMPLITUDA_INTERNAL_CACHE);
    }

    public synchronized void clearCache(final String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                File[] fileArrListFiles = new File(this.cache).listFiles(new FileFilter() { // from class: linc.com.amplituda.FileManager.1
                    @Override // java.io.FileFilter
                    public boolean accept(File file) {
                        return file.isFile() && file.getName().contains(str);
                    }
                });
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                }
            }
        }
    }

    public synchronized void deleteFile(File file) {
        if (file != null) {
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public synchronized File getByteArrayFile(byte[] bArr, AmplitudaProgressListener amplitudaProgressListener) {
        File file;
        file = new File(this.cache, String.valueOf(Arrays.hashCode(bArr)));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (amplitudaProgressListener != null) {
                try {
                    amplitudaProgressListener.onProgressInternal(0);
                } catch (Throwable th3) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            fileOutputStream.write(bArr);
            if (amplitudaProgressListener != null) {
                amplitudaProgressListener.onProgressInternal(100);
            }
            fileOutputStream.close();
        } catch (IOException unused) {
            return null;
        }
        return file;
    }

    public synchronized File getCacheFile(String str, String str2) {
        File file;
        try {
            StringBuilder sb3 = new StringBuilder("internal-ampl-cache_");
            if (!str2.isEmpty()) {
                str = str2;
            }
            sb3.append(str);
            sb3.append(".txt");
            file = new File(this.cache, sb3.toString());
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e4) {
            throw new AmplitudaIOException(e4.getMessage(), 1);
        }
        return file;
    }

    public synchronized File getInputStreamFile(InputStream inputStream, AmplitudaProgressListener amplitudaProgressListener) {
        try {
        } catch (IOException unused) {
            return null;
        }
        return getByteArrayFile(getByteArrayFromInputStream(inputStream), amplitudaProgressListener);
    }

    public synchronized String getInputStreamHashString(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[65535];
            while (true) {
                int i14 = inputStream.read(bArr);
                if (i14 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i14);
                }
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            throw th3;
        }
        return String.valueOf(Arrays.hashCode(byteArrayOutputStream.toByteArray()));
    }

    public synchronized File getRawFile(int i14, AmplitudaProgressListener amplitudaProgressListener) throws Throwable {
        try {
            try {
                File file = new File(this.cache, String.valueOf(i14));
                try {
                    InputStream inputStreamOpenRawResource = this.resources.openRawResource(i14);
                    try {
                        streamToFile(inputStreamOpenRawResource, file, 4096, inputStreamOpenRawResource.available(), amplitudaProgressListener);
                        return file;
                    } catch (Resources.NotFoundException | IOException unused) {
                        return null;
                    }
                } catch (Resources.NotFoundException | IOException unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }

    public synchronized File getUrlFile(String str, AmplitudaProgressListener amplitudaProgressListener) throws Throwable {
        try {
            try {
                File file = new File(this.cache, String.valueOf(str.hashCode()));
                try {
                    URL url = new URL(str);
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    uRLConnectionOpenConnection.connect();
                    try {
                        streamToFile(new BufferedInputStream(url.openStream()), file, 1024, getUrlContentLength(uRLConnectionOpenConnection), amplitudaProgressListener);
                        return file;
                    } catch (IOException unused) {
                        return null;
                    }
                } catch (IOException unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }

    public synchronized String readFile(File file) {
        if (file == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                StringBuilder sb3 = new StringBuilder();
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    sb3.append(line);
                    sb3.append(System.lineSeparator());
                }
                String strTrim = sb3.toString().trim();
                bufferedReader.close();
                return strTrim;
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
