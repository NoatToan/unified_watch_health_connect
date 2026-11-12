package org.apache.commons.io;

import com.amap.api.mapcore.util.hl;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class FileSystemUtils {
    private static final FileSystemUtils a = new FileSystemUtils();
    private static final int b = -1;
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    private static final int g;
    private static final String h;

    static {
        int i;
        String str = "df";
        try {
            String property = System.getProperty("os.name");
            if (property == null) {
                throw new IOException("os.name not found");
            }
            String lowerCase = property.toLowerCase(Locale.ENGLISH);
            i = 3;
            if (lowerCase.contains("windows")) {
                i = 1;
            } else if (lowerCase.contains("linux") || lowerCase.contains("mpe/ix") || lowerCase.contains("freebsd") || lowerCase.contains("openbsd") || lowerCase.contains("irix") || lowerCase.contains("digital unix") || lowerCase.contains("unix") || lowerCase.contains("mac os x")) {
                i = 2;
            } else if (lowerCase.contains("sun os") || lowerCase.contains("sunos") || lowerCase.contains("solaris")) {
                str = "/usr/xpg4/bin/df";
            } else if (!lowerCase.contains("hp-ux") && !lowerCase.contains("aix")) {
                i = 0;
            }
            g = i;
            h = str;
        } catch (Exception unused) {
            i = -1;
        }
    }

    @Deprecated
    public static long freeSpace(String str) throws IOException {
        return a.a(str, g, false, -1L);
    }

    @Deprecated
    public static long freeSpaceKb(String str) throws IOException {
        return freeSpaceKb(str, -1L);
    }

    public long a(String str, int i, boolean z, long j) throws Throwable {
        if (str == null) {
            throw new IllegalArgumentException("Path must not be null");
        }
        if (i == 0) {
            throw new IllegalStateException("Unsupported operating system");
        }
        if (i == 1) {
            long jC = c(str, j);
            return z ? jC / 1024 : jC;
        }
        if (i == 2) {
            return b(str, z, false, j);
        }
        if (i == 3) {
            return b(str, z, true, j);
        }
        throw new IllegalStateException("Exception caught when determining operating system");
    }

    public long b(String str, boolean z, boolean z2, long j) throws Throwable {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Path must not be empty");
        }
        String str2 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        if (z) {
            str2 = Constants.ACCEPT_TIME_SEPARATOR_SERVER + hl.k;
        }
        if (z2) {
            str2 = str2 + "P";
        }
        List<String> listG = g(str2.length() > 1 ? new String[]{h, str2, str} : new String[]{h, str}, 3, j);
        if (listG.size() < 2) {
            throw new IOException("Command line '" + h + "' did not return info as expected for path '" + str + "'- response was " + listG);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(listG.get(1), " ");
        if (stringTokenizer.countTokens() >= 4) {
            stringTokenizer.nextToken();
        } else {
            if (stringTokenizer.countTokens() != 1 || listG.size() < 3) {
                throw new IOException("Command line '" + h + "' did not return data as expected for path '" + str + "'- check path is valid");
            }
            stringTokenizer = new StringTokenizer(listG.get(2), " ");
        }
        stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        return e(stringTokenizer.nextToken(), str);
    }

    public long c(String str, long j) throws Throwable {
        String strNormalize = FilenameUtils.normalize(str, false);
        if (strNormalize == null) {
            throw new IllegalArgumentException(str);
        }
        if (strNormalize.length() > 0 && strNormalize.charAt(0) != '\"') {
            strNormalize = "\"" + strNormalize + "\"";
        }
        List<String> listG = g(new String[]{"cmd.exe", "/C", "dir /a /-c " + strNormalize}, Integer.MAX_VALUE, j);
        for (int size = listG.size() - 1; size >= 0; size--) {
            String str2 = listG.get(size);
            if (str2.length() > 0) {
                return f(str2, strNormalize);
            }
        }
        throw new IOException("Command line 'dir /-c' did not return any info for path '" + strNormalize + "'");
    }

    public Process d(String[] strArr) throws IOException {
        return Runtime.getRuntime().exec(strArr);
    }

    public long e(String str, String str2) throws IOException {
        try {
            long j = Long.parseLong(str);
            if (j >= 0) {
                return j;
            }
            throw new IOException("Command line '" + h + "' did not find free space in response for path '" + str2 + "'- check path is valid");
        } catch (NumberFormatException e2) {
            throw new IOException("Command line '" + h + "' did not return numeric data as expected for path '" + str2 + "'- check path is valid", e2);
        }
    }

    public long f(String str, String str2) throws IOException {
        int i;
        int i2;
        int i3;
        int length = str.length();
        while (true) {
            length--;
            i = 0;
            if (length < 0) {
                i2 = 0;
                break;
            }
            if (Character.isDigit(str.charAt(length))) {
                i2 = length + 1;
                break;
            }
        }
        while (true) {
            if (length < 0) {
                i3 = 0;
                break;
            }
            char cCharAt = str.charAt(length);
            if (!Character.isDigit(cCharAt) && cCharAt != ',' && cCharAt != '.') {
                i3 = length + 1;
                break;
            }
            length--;
        }
        if (length < 0) {
            throw new IOException("Command line 'dir /-c' did not return valid info for path '" + str2 + "'");
        }
        StringBuilder sb = new StringBuilder(str.substring(i3, i2));
        while (i < sb.length()) {
            if (sb.charAt(i) == ',' || sb.charAt(i) == '.') {
                sb.deleteCharAt(i);
                i--;
            }
            i++;
        }
        return e(sb.toString(), str2);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public List<String> g(String[] strArr, int i, long j) throws Throwable {
        Process processD;
        OutputStream outputStream;
        InputStream inputStream;
        InputStream errorStream;
        ?? bufferedReader;
        ?? r7;
        ArrayList arrayList = new ArrayList(20);
        InputStream inputStream2 = null;
        try {
            Thread threadB = a.b(j);
            processD = d(strArr);
            try {
                inputStream = processD.getInputStream();
                try {
                    outputStream = processD.getOutputStream();
                    try {
                        errorStream = processD.getErrorStream();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.defaultCharset()));
                            try {
                                for (String line = bufferedReader.readLine(); line != null && arrayList.size() < i; line = bufferedReader.readLine()) {
                                    arrayList.add(line.toLowerCase(Locale.ENGLISH).trim());
                                }
                                processD.waitFor();
                                a.d(threadB);
                                if (processD.exitValue() != 0) {
                                    throw new IOException("Command line returned OS error code '" + processD.exitValue() + "' for command " + Arrays.asList(strArr));
                                }
                                if (arrayList.isEmpty()) {
                                    throw new IOException("Command line did not return any info for command " + Arrays.asList(strArr));
                                }
                                bufferedReader.close();
                                inputStream.close();
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                        outputStream = null;
                                    } catch (InterruptedException e2) {
                                        e = e2;
                                        inputStream = null;
                                        bufferedReader = 0;
                                    } catch (Throwable th) {
                                        th = th;
                                        r7 = 0;
                                        IOUtils.closeQuietly(inputStream2);
                                        IOUtils.closeQuietly(outputStream);
                                        IOUtils.closeQuietly(errorStream);
                                        IOUtils.closeQuietly((Reader) r7);
                                        if (processD != null) {
                                            processD.destroy();
                                        }
                                        throw th;
                                    }
                                }
                                if (errorStream != null) {
                                    errorStream.close();
                                    errorStream = null;
                                }
                                IOUtils.closeQuietly((InputStream) null);
                                IOUtils.closeQuietly(outputStream);
                                IOUtils.closeQuietly(errorStream);
                                IOUtils.closeQuietly((Reader) null);
                                processD.destroy();
                                return arrayList;
                            } catch (InterruptedException e3) {
                                e = e3;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream2 = inputStream;
                                r7 = bufferedReader;
                                IOUtils.closeQuietly(inputStream2);
                                IOUtils.closeQuietly(outputStream);
                                IOUtils.closeQuietly(errorStream);
                                IOUtils.closeQuietly((Reader) r7);
                                if (processD != null) {
                                    processD.destroy();
                                }
                                throw th;
                            }
                        } catch (InterruptedException e4) {
                            e = e4;
                            bufferedReader = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader = 0;
                        }
                    } catch (InterruptedException e5) {
                        e = e5;
                        errorStream = null;
                        bufferedReader = errorStream;
                    } catch (Throwable th4) {
                        th = th4;
                        errorStream = null;
                        bufferedReader = errorStream;
                        inputStream2 = inputStream;
                        r7 = bufferedReader;
                        IOUtils.closeQuietly(inputStream2);
                        IOUtils.closeQuietly(outputStream);
                        IOUtils.closeQuietly(errorStream);
                        IOUtils.closeQuietly((Reader) r7);
                        if (processD != null) {
                            processD.destroy();
                        }
                        throw th;
                    }
                } catch (InterruptedException e6) {
                    e = e6;
                    outputStream = null;
                    errorStream = outputStream;
                    bufferedReader = errorStream;
                    inputStream2 = processD;
                    bufferedReader = bufferedReader;
                    throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(strArr) + " timeout=" + j, e);
                } catch (Throwable th5) {
                    th = th5;
                    outputStream = null;
                    errorStream = null;
                }
            } catch (InterruptedException e7) {
                e = e7;
                inputStream = null;
                outputStream = null;
            } catch (Throwable th6) {
                th = th6;
                outputStream = null;
                errorStream = outputStream;
                r7 = errorStream;
                IOUtils.closeQuietly(inputStream2);
                IOUtils.closeQuietly(outputStream);
                IOUtils.closeQuietly(errorStream);
                IOUtils.closeQuietly((Reader) r7);
                if (processD != null) {
                    processD.destroy();
                }
                throw th;
            }
            inputStream2 = processD;
            bufferedReader = bufferedReader;
        } catch (InterruptedException e8) {
            e = e8;
            inputStream = null;
            outputStream = null;
            errorStream = null;
            bufferedReader = 0;
        } catch (Throwable th7) {
            th = th7;
            processD = null;
            outputStream = null;
        }
        try {
            throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(strArr) + " timeout=" + j, e);
        } catch (Throwable th8) {
            th = th8;
            processD = inputStream2;
            inputStream2 = inputStream;
            r7 = bufferedReader;
            IOUtils.closeQuietly(inputStream2);
            IOUtils.closeQuietly(outputStream);
            IOUtils.closeQuietly(errorStream);
            IOUtils.closeQuietly((Reader) r7);
            if (processD != null) {
                processD.destroy();
            }
            throw th;
        }
    }

    @Deprecated
    public static long freeSpaceKb(String str, long j) throws IOException {
        return a.a(str, g, true, j);
    }

    @Deprecated
    public static long freeSpaceKb() throws IOException {
        return freeSpaceKb(-1L);
    }

    @Deprecated
    public static long freeSpaceKb(long j) throws IOException {
        return freeSpaceKb(new File(".").getAbsolutePath(), j);
    }
}
