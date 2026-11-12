package org.opencv.android;

import android.util.Log;
import java.util.StringTokenizer;
import org.opencv.core.Core;

/* JADX INFO: loaded from: classes23.dex */
class StaticHelper {
    private static final String a = "OpenCV/StaticHelper";

    public static boolean a(boolean z) {
        String libraryList;
        if (z) {
            c("cudart");
            c("nppc");
            c("nppi");
            c("npps");
            c("cufft");
            c("cublas");
        }
        Log.d(a, "Trying to get library list");
        try {
            System.loadLibrary("opencv_info");
            libraryList = getLibraryList();
        } catch (UnsatisfiedLinkError unused) {
            Log.e(a, "OpenCV error: Cannot load info library for OpenCV");
            libraryList = "";
        }
        Log.d(a, "Library list: \"" + libraryList + "\"");
        Log.d(a, "First attempt to load libs");
        if (!b(libraryList)) {
            Log.d(a, "First attempt to load libs fails");
            return false;
        }
        Log.d(a, "First attempt to load libs is OK");
        for (String str : Core.getBuildInformation().split(System.getProperty("line.separator"))) {
            Log.i(a, str);
        }
        return true;
    }

    private static boolean b(String str) {
        Log.d(a, "Trying to init OpenCV libs");
        if (str == null || str.length() == 0) {
            return c("opencv_java4");
        }
        Log.d(a, "Trying to load libs by dependency list");
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        boolean zC = true;
        while (stringTokenizer.hasMoreTokens()) {
            zC &= c(stringTokenizer.nextToken());
        }
        return zC;
    }

    private static boolean c(String str) {
        Log.d(a, "Trying to load library " + str);
        try {
            System.loadLibrary(str);
            Log.d(a, "Library " + str + " loaded");
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.d(a, "Cannot load library \"" + str + "\"");
            e.printStackTrace();
            return false;
        }
    }

    private static native String getLibraryList();
}
