package com.mibi.sdk.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.timepicker.TimeModel;
import com.mibi.sdk.common.utils.MibiLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class Utils {
    private static final String TAG = "Utils";
    public static final String sServiceNumber = "400-100-3399";

    public static class ValueDivided {
        public String mFractionalPart;
        public String mIntegerPart;
    }

    private Utils() {
    }

    public static long[] LongArrayListTolongArray(List<Long> list) {
        long[] jArr = new long[list.size()];
        Iterator<Long> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public static long[] LongSetTolongArray(Set<Long> set) {
        long[] jArr = new long[set.size()];
        Iterator<Long> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public static boolean checkStrings(String... strArr) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    public static void collapseSoftInputMethod(Context context, View view) {
        if (view == null || context == null) {
            return;
        }
        ((InputMethodManager) context.getApplicationContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void dial(Activity activity, String str) {
        activity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
    }

    public static void dialService(Activity activity) {
        dial(activity, sServiceNumber);
    }

    public static void ensureOnMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("current thread is not main");
        }
    }

    public static boolean getBooleanPref(Context context, String str, boolean z) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, z);
    }

    public static String getFullPrice(long j) {
        return String.format(Locale.US, "%.2f", Double.valueOf(j / 100.0d));
    }

    public static long getLongPref(Context context, String str, long j) {
        return PreferenceManager.getDefaultSharedPreferences(context).getLong(str, j);
    }

    public static ValueDivided getPriceIntegerAndFractionalPart(long j) {
        ValueDivided valueDivided = new ValueDivided();
        String simplePrice = getSimplePrice(j);
        int iIndexOf = simplePrice.indexOf(".");
        if (iIndexOf == -1) {
            valueDivided.mIntegerPart = simplePrice;
            valueDivided.mFractionalPart = "";
        } else {
            valueDivided.mIntegerPart = simplePrice.substring(0, iIndexOf);
            valueDivided.mFractionalPart = simplePrice.substring(iIndexOf + 1);
        }
        return valueDivided;
    }

    public static String getSimplePrice(long j) {
        if (j % 100 == 0) {
            return String.format(Locale.US, TimeModel.NUMBER_FORMAT, Long.valueOf(j / 100));
        }
        return j % 10 == 0 ? String.format(Locale.US, "%.1f", Double.valueOf(j / 100.0d)) : String.format(Locale.US, "%.2f", Double.valueOf(j / 100.0d));
    }

    public static String getStringPref(Context context, String str, String str2) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
    }

    public static boolean isInnerIntent(Context context, Intent intent) {
        ActivityInfo activityInfoResolveActivityInfo = intent.resolveActivityInfo(context.getPackageManager(), 0);
        if (activityInfoResolveActivityInfo == null) {
            return false;
        }
        return TextUtils.equals(context.getPackageName(), activityInfoResolveActivityInfo.packageName);
    }

    public static String join(CharSequence charSequence, Object... objArr) {
        return TextUtils.join(charSequence, objArr);
    }

    public static String joinUrl(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str.charAt(str.length() - 1) == '/') {
            str = str.substring(0, str.length() - 1);
        }
        if (str2.charAt(0) == '/') {
            str2 = str2.substring(1);
        }
        return str + "/" + str2;
    }

    public static void removeAllPrefData(Context context) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0058 A[Catch: IOException -> 0x005b, TRY_LEAVE, TryCatch #8 {IOException -> 0x005b, blocks: (B:33:0x0053, B:35:0x0058), top: B:46:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean retrieveFileFromAssets(Context context, String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                File file = new File(str2);
                file.createNewFile();
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i > 0) {
                            fileOutputStream.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    return true;
                } catch (IOException e) {
                    e = e;
                    inputStream = inputStreamOpen;
                    try {
                        MibiLog.e(TAG, "Utils retrieveFileFromAssets IOException ", e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                                return false;
                            }
                        }
                        if (fileOutputStream == null) {
                            return false;
                        }
                        fileOutputStream.close();
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (IOException unused3) {
                                throw th;
                            }
                        } else if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamOpen;
                    if (inputStream != null) {
                        inputStream.close();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } else if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static String retrieveStringFromAssets(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        InputStream inputStream = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                StringBuilder sb = new StringBuilder();
                Scanner scanner = new Scanner(inputStreamOpen);
                while (scanner.hasNextLine()) {
                    sb.append(scanner.nextLine());
                }
                scanner.close();
                String string = sb.toString();
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                return string;
            } catch (IOException unused2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void setBooleanPref(Context context, String str, boolean z) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public static void setLongPref(Context context, String str, long j) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    public static void setStringPref(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void showSoftInputMethod(Context context, View view, boolean z) {
        if (view == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getApplicationContext().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(view, 1);
        } else {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
