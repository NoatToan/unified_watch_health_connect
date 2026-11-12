package w6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import ch.qos.logback.classic.spi.CallerData;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"LogConditional"})
public class a {
    public static void a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    public static String b(int i14, Context context) {
        if (i14 == -1) {
            return "UNKNOWN";
        }
        try {
            i14 = context.getResources().getResourceEntryName(i14);
            return i14;
        } catch (Exception unused) {
            return am.j.h(i14, CallerData.NA);
        }
    }

    public static String c(View view2) {
        try {
            return view2.getContext().getResources().getResourceEntryName(view2.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
