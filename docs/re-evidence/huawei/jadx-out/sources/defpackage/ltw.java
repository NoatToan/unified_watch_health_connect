package defpackage;

import android.net.Uri;
import health.compact.a.CommonUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ltw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f40828c = CommonUtils.h(".version.provider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f40827b = "content://" + f40828c + "/";

    public static Uri c(String str) {
        return Uri.parse(new StringBuffer().append(f40827b).append(str).toString());
    }
}
