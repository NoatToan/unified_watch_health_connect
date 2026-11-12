package com.alipay.sdk.m.z;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    public static String a(String str, String str2) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            File file = new File(str, str2);
            if (!file.exists()) {
                return null;
            }
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                } catch (IOException unused) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader = bufferedReader2;
                    }
                    return sb.toString();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 == null) {
                        throw th;
                    }
                    try {
                        bufferedReader2.close();
                        throw th;
                    } catch (Throwable unused2) {
                        throw th;
                    }
                }
            }
            bufferedReader.close();
            return sb.toString();
        } catch (IOException unused3) {
        } catch (Throwable th3) {
            th = th3;
        }
        if (bufferedReader2 != null) {
            bufferedReader = bufferedReader2;
            try {
                bufferedReader.close();
            } catch (Throwable unused4) {
            }
        }
        return sb.toString();
    }
}
