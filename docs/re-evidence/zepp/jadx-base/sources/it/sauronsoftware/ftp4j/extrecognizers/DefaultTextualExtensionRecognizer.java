package it.sauronsoftware.ftp4j.extrecognizers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes22.dex */
public class DefaultTextualExtensionRecognizer extends ParametricTextualExtensionRecognizer {
    private static final Object b = new Object();
    private static DefaultTextualExtensionRecognizer c;

    private DefaultTextualExtensionRecognizer() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("textualexts")));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        StringTokenizer stringTokenizer = new StringTokenizer(line);
                        while (stringTokenizer.hasMoreTokens()) {
                            addExtension(stringTokenizer.nextToken());
                        }
                    } catch (Exception unused) {
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 == null) {
                            return;
                        } else {
                            bufferedReader2.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
            } catch (Throwable unused3) {
            }
        } catch (Exception unused4) {
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static DefaultTextualExtensionRecognizer getInstance() {
        synchronized (b) {
            if (c == null) {
                c = new DefaultTextualExtensionRecognizer();
            }
        }
        return c;
    }
}
