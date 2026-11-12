package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes7.dex */
public class b24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Random f3704a = new SecureRandom();

    public static String a(String str, String str2, Map<String, String> map, String str3) {
        if (TextUtils.isEmpty(str3)) {
            throw new InvalidParameterException("security is not nullable");
        }
        ArrayList<String> arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str.toUpperCase());
        }
        if (str2 != null) {
            arrayList.add(Uri.parse(str2).getEncodedPath());
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : new TreeMap(map).entrySet()) {
                arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
            }
        }
        arrayList.add(str3);
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str4 : arrayList) {
            if (!z) {
                sb.append(Typography.amp);
            }
            sb.append(str4);
            z = false;
        }
        return b(sb.toString());
    }

    public static String b(String str) {
        try {
            return String.valueOf(r12.i(MessageDigest.getInstance("SHA1").digest(str.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            throw new IllegalStateException("failed to SHA1");
        }
    }
}
