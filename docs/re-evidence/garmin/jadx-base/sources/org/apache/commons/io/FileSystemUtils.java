package org.apache.commons.io;

import am.j;
import i3.e5;
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
import org.apache.commons.lang3.StringUtils;
import sn.a;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class FileSystemUtils {
    private static final String DF;
    private static final int INIT_PROBLEM = -1;
    private static final FileSystemUtils INSTANCE = new FileSystemUtils();
    private static final int OS;
    private static final int OTHER = 0;
    private static final int POSIX_UNIX = 3;
    private static final int UNIX = 2;
    private static final int WINDOWS = 1;

    static {
        int i14;
        String str = "df";
        try {
            String property = System.getProperty("os.name");
            if (property == null) {
                throw new IOException("os.name not found");
            }
            String lowerCase = property.toLowerCase(Locale.ENGLISH);
            if (lowerCase.contains("windows")) {
                i14 = 1;
            } else if (lowerCase.contains("linux") || lowerCase.contains("mpe/ix") || lowerCase.contains("freebsd") || lowerCase.contains("openbsd") || lowerCase.contains("irix") || lowerCase.contains("digital unix") || lowerCase.contains("unix") || lowerCase.contains("mac os x")) {
                i14 = 2;
            } else {
                if (lowerCase.contains("sun os") || lowerCase.contains("sunos") || lowerCase.contains("solaris")) {
                    str = "/usr/xpg4/bin/df";
                } else if (!lowerCase.contains("hp-ux") && !lowerCase.contains("aix")) {
                    i14 = 0;
                }
                i14 = 3;
            }
            OS = i14;
            DF = str;
        } catch (Exception unused) {
            i14 = -1;
        }
    }

    @Deprecated
    public static long freeSpace(String str) {
        return INSTANCE.freeSpaceOS(str, OS, false, -1L);
    }

    @Deprecated
    public static long freeSpaceKb(long j8) {
        return freeSpaceKb(new File(".").getAbsolutePath(), j8);
    }

    public long freeSpaceOS(String str, int i14, boolean z14, long j8) throws Throwable {
        if (str == null) {
            h.s("Path must not be null");
            return 0L;
        }
        if (i14 == 0) {
            h.z("Unsupported operating system");
            return 0L;
        }
        if (i14 == 1) {
            long jFreeSpaceWindows = freeSpaceWindows(str, j8);
            return z14 ? jFreeSpaceWindows / 1024 : jFreeSpaceWindows;
        }
        if (i14 == 2) {
            return freeSpaceUnix(str, z14, false, j8);
        }
        if (i14 == 3) {
            return freeSpaceUnix(str, z14, true, j8);
        }
        h.z("Exception caught when determining operating system");
        return 0L;
    }

    public long freeSpaceUnix(String str, boolean z14, boolean z15, long j8) throws Throwable {
        if (str.isEmpty()) {
            h.s("Path must not be empty");
            return 0L;
        }
        String strConcat = z14 ? "-k" : "-";
        if (z15) {
            strConcat = strConcat.concat("P");
        }
        List<String> listPerformCommand = performCommand(strConcat.length() > 1 ? new String[]{DF, strConcat, str} : new String[]{DF, str}, 3, j8);
        if (listPerformCommand.size() < 2) {
            StringBuilder sb3 = new StringBuilder("Command line '");
            a.t(sb3, DF, "' did not return info as expected for path '", str, "'- response was ");
            sb3.append(listPerformCommand);
            throw new IOException(sb3.toString());
        }
        StringTokenizer stringTokenizer = new StringTokenizer(listPerformCommand.get(1), StringUtils.SPACE);
        if (stringTokenizer.countTokens() >= 4) {
            stringTokenizer.nextToken();
        } else {
            if (stringTokenizer.countTokens() != 1 || listPerformCommand.size() < 3) {
                h.C(e5.h(new StringBuilder("Command line '"), DF, "' did not return data as expected for path '", str, "'- check path is valid"));
                return 0L;
            }
            stringTokenizer = new StringTokenizer(listPerformCommand.get(2), StringUtils.SPACE);
        }
        stringTokenizer.nextToken();
        stringTokenizer.nextToken();
        return parseBytes(stringTokenizer.nextToken(), str);
    }

    public long freeSpaceWindows(String str, long j8) throws Throwable {
        String strNormalize = FilenameUtils.normalize(str, false);
        if (strNormalize == null) {
            h.s(str);
            return 0L;
        }
        if (strNormalize.length() > 0 && strNormalize.charAt(0) != '\"') {
            strNormalize = j.m("\"", strNormalize, "\"");
        }
        List<String> listPerformCommand = performCommand(new String[]{"cmd.exe", "/C", "dir /a /-c ".concat(strNormalize)}, Integer.MAX_VALUE, j8);
        for (int size = listPerformCommand.size() - 1; size >= 0; size--) {
            String str2 = listPerformCommand.get(size);
            if (str2.length() > 0) {
                return parseDir(str2, strNormalize);
            }
        }
        h.C(j.m("Command line 'dir /-c' did not return any info for path '", strNormalize, "'"));
        return 0L;
    }

    public Process openProcess(String[] strArr) {
        return Runtime.getRuntime().exec(strArr);
    }

    public long parseBytes(String str, String str2) throws IOException {
        try {
            long j8 = Long.parseLong(str);
            if (j8 >= 0) {
                return j8;
            }
            throw new IOException("Command line '" + DF + "' did not find free space in response for path '" + str2 + "'- check path is valid");
        } catch (NumberFormatException e4) {
            h.u(e5.h(new StringBuilder("Command line '"), DF, "' did not return numeric data as expected for path '", str2, "'- check path is valid"), e4);
            return 0L;
        }
    }

    public long parseDir(String str, String str2) throws IOException {
        int i14;
        int i15;
        int i16;
        int length = str.length();
        while (true) {
            length--;
            i14 = 0;
            if (length < 0) {
                i15 = 0;
                break;
            }
            if (Character.isDigit(str.charAt(length))) {
                i15 = length + 1;
                break;
            }
        }
        while (true) {
            if (length < 0) {
                i16 = 0;
                break;
            }
            char cCharAt = str.charAt(length);
            if (!Character.isDigit(cCharAt) && cCharAt != ',' && cCharAt != '.') {
                i16 = length + 1;
                break;
            }
            length--;
        }
        if (length < 0) {
            h.C(j.m("Command line 'dir /-c' did not return valid info for path '", str2, "'"));
            return 0L;
        }
        StringBuilder sb3 = new StringBuilder(str.substring(i16, i15));
        while (i14 < sb3.length()) {
            if (sb3.charAt(i14) == ',' || sb3.charAt(i14) == '.') {
                sb3.deleteCharAt(i14);
                i14--;
            }
            i14++;
        }
        return parseBytes(sb3.toString(), str2);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x012e  */
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
    public List<String> performCommand(String[] strArr, int i14, long j8) throws Throwable {
        Process processOpenProcess;
        OutputStream outputStream;
        InputStream inputStream;
        InputStream errorStream;
        ?? bufferedReader;
        ?? r14;
        ArrayList arrayList = new ArrayList(20);
        InputStream inputStream2 = null;
        try {
            Thread threadStart = ThreadMonitor.start(j8);
            processOpenProcess = openProcess(strArr);
            try {
                inputStream = processOpenProcess.getInputStream();
                try {
                    outputStream = processOpenProcess.getOutputStream();
                    try {
                        errorStream = processOpenProcess.getErrorStream();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.defaultCharset()));
                            try {
                                for (String line = bufferedReader.readLine(); line != null && arrayList.size() < i14; line = bufferedReader.readLine()) {
                                    arrayList.add(line.toLowerCase(Locale.ENGLISH).trim());
                                }
                                processOpenProcess.waitFor();
                                ThreadMonitor.stop(threadStart);
                                if (processOpenProcess.exitValue() != 0) {
                                    throw new IOException("Command line returned OS error code '" + processOpenProcess.exitValue() + "' for command " + Arrays.asList(strArr));
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
                                    } catch (InterruptedException e4) {
                                        e = e4;
                                        inputStream = null;
                                        bufferedReader = 0;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r14 = 0;
                                        IOUtils.closeQuietly(inputStream2);
                                        IOUtils.closeQuietly(outputStream);
                                        IOUtils.closeQuietly(errorStream);
                                        IOUtils.closeQuietly((Reader) r14);
                                        if (processOpenProcess != null) {
                                            processOpenProcess.destroy();
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
                                processOpenProcess.destroy();
                                return arrayList;
                            } catch (InterruptedException e14) {
                                e = e14;
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream2 = inputStream;
                                r14 = bufferedReader;
                                IOUtils.closeQuietly(inputStream2);
                                IOUtils.closeQuietly(outputStream);
                                IOUtils.closeQuietly(errorStream);
                                IOUtils.closeQuietly((Reader) r14);
                                if (processOpenProcess != null) {
                                    processOpenProcess.destroy();
                                }
                                throw th;
                            }
                        } catch (InterruptedException e15) {
                            e = e15;
                            bufferedReader = 0;
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedReader = 0;
                        }
                    } catch (InterruptedException e16) {
                        e = e16;
                        errorStream = null;
                        bufferedReader = errorStream;
                    } catch (Throwable th6) {
                        th = th6;
                        errorStream = null;
                        bufferedReader = errorStream;
                        inputStream2 = inputStream;
                        r14 = bufferedReader;
                        IOUtils.closeQuietly(inputStream2);
                        IOUtils.closeQuietly(outputStream);
                        IOUtils.closeQuietly(errorStream);
                        IOUtils.closeQuietly((Reader) r14);
                        if (processOpenProcess != null) {
                            processOpenProcess.destroy();
                        }
                        throw th;
                    }
                } catch (InterruptedException e17) {
                    e = e17;
                    outputStream = null;
                    errorStream = outputStream;
                    bufferedReader = errorStream;
                    inputStream2 = processOpenProcess;
                    bufferedReader = bufferedReader;
                    throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(strArr) + " timeout=" + j8, e);
                } catch (Throwable th7) {
                    th = th7;
                    outputStream = null;
                    errorStream = null;
                }
            } catch (InterruptedException e18) {
                e = e18;
                inputStream = null;
                outputStream = null;
            } catch (Throwable th8) {
                th = th8;
                outputStream = null;
                errorStream = outputStream;
                r14 = errorStream;
                IOUtils.closeQuietly(inputStream2);
                IOUtils.closeQuietly(outputStream);
                IOUtils.closeQuietly(errorStream);
                IOUtils.closeQuietly((Reader) r14);
                if (processOpenProcess != null) {
                    processOpenProcess.destroy();
                }
                throw th;
            }
            inputStream2 = processOpenProcess;
            bufferedReader = bufferedReader;
        } catch (InterruptedException e19) {
            e = e19;
            inputStream = null;
            outputStream = null;
            errorStream = null;
            bufferedReader = 0;
        } catch (Throwable th9) {
            th = th9;
            processOpenProcess = null;
            outputStream = null;
        }
        try {
            throw new IOException("Command line threw an InterruptedException for command " + Arrays.asList(strArr) + " timeout=" + j8, e);
        } catch (Throwable th10) {
            th = th10;
            processOpenProcess = inputStream2;
            inputStream2 = inputStream;
            r14 = bufferedReader;
            IOUtils.closeQuietly(inputStream2);
            IOUtils.closeQuietly(outputStream);
            IOUtils.closeQuietly(errorStream);
            IOUtils.closeQuietly((Reader) r14);
            if (processOpenProcess != null) {
                processOpenProcess.destroy();
            }
            throw th;
        }
    }

    @Deprecated
    public static long freeSpaceKb(String str, long j8) {
        return INSTANCE.freeSpaceOS(str, OS, true, j8);
    }

    @Deprecated
    public static long freeSpaceKb() {
        return freeSpaceKb(-1L);
    }

    @Deprecated
    public static long freeSpaceKb(String str) {
        return freeSpaceKb(str, -1L);
    }
}
