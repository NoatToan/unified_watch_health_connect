package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import i3.e5;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
public class FileUtil extends ContextAwareBase {
    static final int BUF_SIZE = 32768;

    public FileUtil(Context context) {
        setContext(context);
    }

    public static boolean createMissingParentDirectories(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return true;
        }
        parentFile.mkdirs();
        return parentFile.exists();
    }

    public static URL fileToURL(File file) {
        try {
            return file.toURI().toURL();
        } catch (MalformedURLException e4) {
            q2.v(g.o("Unexpected exception on file [", file, "]"), e4);
            return null;
        }
    }

    public static String prefixRelativePath(String str, String str2) {
        return (str == null || OptionHelper.isEmpty(str.trim()) || new File(str2).isAbsolute()) ? str2 : e5.g(str, "/", str2);
    }

    public void copy(String str, String str2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        IOException e4;
        BufferedInputStream bufferedInputStream;
        IOException iOException;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    try {
                        byte[] bArr = new byte[32768];
                        while (true) {
                            int i14 = bufferedInputStream.read(bArr);
                            if (i14 != -1) {
                                bufferedOutputStream.write(bArr, 0, i14);
                            } else {
                                bufferedInputStream.close();
                                try {
                                    bufferedOutputStream.close();
                                    return;
                                } catch (IOException e14) {
                                    iOException = e14;
                                    bufferedInputStream = null;
                                    e4 = iOException;
                                    String str3 = "Failed to copy [" + str + "] to [" + str2 + "]";
                                    addError(str3, e4);
                                    throw new RolloverFailure(str3);
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            th = th;
                            bufferedInputStream2 = bufferedInputStream;
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException unused) {
                                }
                            }
                            if (bufferedOutputStream == null) {
                                throw th;
                            }
                            try {
                                bufferedOutputStream.close();
                                throw th;
                            } catch (IOException unused2) {
                                throw th;
                            }
                        }
                    } catch (IOException e15) {
                        e4 = e15;
                        String str4 = "Failed to copy [" + str + "] to [" + str2 + "]";
                        addError(str4, e4);
                        throw new RolloverFailure(str4);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedInputStream2 = bufferedInputStream;
                }
            } catch (IOException e16) {
                iOException = e16;
                bufferedOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedOutputStream = null;
                bufferedInputStream2 = bufferedInputStream;
            }
        } catch (IOException e17) {
            bufferedOutputStream = null;
            e4 = e17;
            bufferedInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            bufferedOutputStream = null;
        }
    }
}
