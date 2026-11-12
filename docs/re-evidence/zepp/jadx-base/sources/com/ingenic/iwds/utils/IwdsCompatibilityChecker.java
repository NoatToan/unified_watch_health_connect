package com.ingenic.iwds.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public class IwdsCompatibilityChecker {
    private static IwdsCompatibilityChecker b;
    private boolean a;

    private IwdsCompatibilityChecker() throws Throwable {
        this.a = false;
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File("/proc/cpuinfo")));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.contains("Ingenic Xburst")) {
                            this.a = true;
                            break;
                        } else if (line.contains("goldfish")) {
                            this.a = true;
                            break;
                        }
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader == null) {
                            return;
                        } else {
                            bufferedReader.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
                bufferedReader2.close();
            } catch (IOException unused3) {
            }
        } catch (IOException unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static IwdsCompatibilityChecker getInstance() {
        if (b == null) {
            b = new IwdsCompatibilityChecker();
        }
        return b;
    }

    public final boolean check() {
        return this.a;
    }
}
