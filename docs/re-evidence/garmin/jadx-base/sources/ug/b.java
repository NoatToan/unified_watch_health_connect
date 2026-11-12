package ug;

import am.j;
import org.apache.commons.text.StringSubstitutor;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f170551a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f170552b;

    public static String a() {
        c cVarA = c.a(c.CANCELED.f170562a);
        return b(cVarA.f170562a, cVarA.f170563b, "");
    }

    public static String b(int i14, String str, String str2) {
        return j.o(str2, StringSubstitutor.DEFAULT_VAR_END, g.r(i14, "resultStatus={", "};memo={", str, "};result={"));
    }
}
