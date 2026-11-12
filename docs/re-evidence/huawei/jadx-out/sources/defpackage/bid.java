package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes23.dex */
public class bid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f1122a = "marketInstall" + File.separator + "download" + File.separator + "hiSpace.apk";

    public static String c(Context context) {
        return context.getFilesDir() + File.separator + f1122a;
    }
}
