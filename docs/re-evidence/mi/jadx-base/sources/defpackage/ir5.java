package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.nio.CharBuffer;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"LogConditional"})
public class ir5 {
    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String c(Context context, int i) {
        if (i == -1) {
            return DeviceTypes.UNKNOWN;
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return "?" + i;
        }
    }

    public static String d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return DeviceTypes.UNKNOWN;
        }
    }

    public static String e(MotionLayout motionLayout, int i) {
        return f(motionLayout, i, -1);
    }

    public static String f(MotionLayout motionLayout, int i, int i2) {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i);
        if (i2 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i2) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i2 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i2) / length).toString().replace((char) 0, '.') + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
    }

    public static void g(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= iMin; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            String str4 = ".(" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + ") " + stackTrace[i2].getMethodName();
            str3 = str3 + " ";
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str3);
            sb.append(str4);
            sb.append(str3);
        }
    }
}
