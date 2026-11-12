package com.huawei.hihealth.dictionary.utils;

import android.content.Context;
import android.text.TextUtils;
import health.compact.a.util.LogUtil;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class DictUtils {
    private static Pattern e = Pattern.compile("[0-9]{3}-[0-9]{5}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Pattern f12297b = Pattern.compile("[a-zA-Z0-9_]{3,64}");

    public static String b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamOpen = context.getResources().getAssets().open(str);
            try {
                String strA = a(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                return strA;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.c("HiH_LOG_TAG", "read file error.");
            return null;
        }
    }

    public static int e(int i, String str) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        return (i * 1000) + Math.abs(str.hashCode() % 1000);
    }

    public static boolean e(String str) {
        if (str == null) {
            return false;
        }
        return f12297b.matcher(str).matches();
    }

    public static <T> List<T> b(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        try {
            for (Field field : cls.getFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers()) && field.get(null) != null) {
                    arrayList.add(field.get(null));
                }
            }
        } catch (Exception unused) {
            LogUtil.c("HiH_LOG_TAG", "getConstantFields failed.");
        }
        return arrayList;
    }

    private static String a(InputStream inputStream) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    String line = bufferedReader.readLine();
                    int i = 0;
                    while (line != null) {
                        if (line.length() < 12288 && i < 12288) {
                            stringBuffer.append(line);
                        }
                        line = bufferedReader.readLine();
                        i++;
                    }
                    bufferedReader.close();
                    inputStreamReader.close();
                    return stringBuffer.toString();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (FileNotFoundException unused) {
            LogUtil.c("HiH_LOG_TAG", "file does not exist.");
            return null;
        } catch (Exception unused2) {
            LogUtil.c("HiH_LOG_TAG", "read file error.");
            return null;
        }
    }
}
