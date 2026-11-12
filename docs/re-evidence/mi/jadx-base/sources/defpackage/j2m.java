package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public class j2m {
    public static String a(String str) {
        try {
            return al5.a(MessageDigest.getInstance("SHA-1").digest(str.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
