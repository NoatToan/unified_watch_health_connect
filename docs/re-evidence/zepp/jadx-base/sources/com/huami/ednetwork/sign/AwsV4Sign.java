package com.huami.ednetwork.sign;

import android.net.Uri;
import com.google.android.material.datepicker.UtcDates;
import com.huami.identity.auth.alexa.ConstantsKt;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes8.dex */
public class AwsV4Sign {
    private static final char[] j = "0123456789ABCDEF".toCharArray();
    private static final String k = "AWS4-HMAC-SHA256";
    private static final String l = "aws4_request";
    private static final String m = "yyyyMMdd'T'HHmmss'Z'";
    private static final String n = "yyyyMMdd";
    private String a;
    private String b;
    private byte[] c;
    private Map<String, String> d;
    private Map<String, String> e;
    private long f;
    private String g;
    private String h;
    private boolean i;

    public static class Builder {
        private String a;
        private Map<String, String> e;
        private long g;
        private byte[] h;
        private String b = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        private String c = "huami";
        private String d = "service";
        private boolean i = false;
        private Map<String, String> f = new TreeMap(new a());

        public class a implements Comparator<String> {
            public a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        }

        public class b implements Comparator<String> {
            public b() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        }

        private String j(String str) {
            if (str == null) {
                return null;
            }
            return Uri.encode(str.replaceAll("\\+", " "), "-_.~");
        }

        private String k(String str) {
            return (str == null || str.trim().isEmpty()) ? FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE : str.replaceAll(" ", "%20");
        }

        public Builder body(byte[] bArr) {
            this.h = bArr;
            return this;
        }

        public AwsV4Sign build() {
            return new AwsV4Sign(this);
        }

        public Builder debug() {
            this.i = true;
            return this;
        }

        public Builder headers(Map<String, String> map) {
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.f.put(entry.getKey().toLowerCase(), entry.getValue().trim().replaceAll(" +", " "));
                }
            }
            return this;
        }

        public Builder host(String str) {
            this.f.put("host", str);
            return this;
        }

        public Builder method(String str) {
            this.a = str;
            return this;
        }

        public Builder parameters(Map<String, String> map) {
            if (map != null && !map.isEmpty()) {
                this.e = new TreeMap(new b());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    this.e.put(j(entry.getKey()), j(entry.getValue()));
                }
            }
            return this;
        }

        public Builder path(String str) {
            this.b = k(str);
            return this;
        }

        public Builder time(long j) {
            this.g = j;
            return this;
        }
    }

    private String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = j;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr).toLowerCase();
    }

    private String b(String str, String str2) {
        try {
            byte[] bArrF = f(str, str2);
            if (this.i) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                for (byte b : bArrF) {
                    sb.append(b & 255);
                    sb.append(" ");
                }
                sb.append("]");
                System.out.println(sb.toString());
            }
            return a(bArrF);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ConstantsKt.ALGORITHM_SHA_256);
            messageDigest.update(str.getBytes());
            return String.format("%064x", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String d(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ConstantsKt.ALGORITHM_SHA_256);
            messageDigest.update(bArr);
            return String.format("%064x", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String e(long j2, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        return simpleDateFormat.format(new Date(j2 * 1000));
    }

    private byte[] f(String str, String str2) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(str.getBytes(), "HmacSHA256"));
        return mac.doFinal(str2.getBytes());
    }

    public String createSignature(String str) {
        return b(str, prepareStringToSign(prepareCanonicalRequest()));
    }

    public String prepareCanonicalRequest() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\n");
        sb.append(this.b);
        sb.append("\n");
        StringBuilder sb2 = new StringBuilder();
        Map<String, String> map = this.d;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : this.d.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                sb2.append(key);
                sb2.append(SearchCriteria.EQ);
                sb2.append(value);
                sb2.append(com.alipay.sdk.m.s.a.l);
            }
            sb2.deleteCharAt(sb2.lastIndexOf(com.alipay.sdk.m.s.a.l));
        }
        sb2.append("\n");
        sb.append((CharSequence) sb2);
        StringBuilder sb3 = new StringBuilder();
        Map<String, String> map2 = this.e;
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry<String, String> entry2 : this.e.entrySet()) {
                String key2 = entry2.getKey();
                String value2 = entry2.getValue();
                sb.append(key2);
                sb.append(":");
                sb.append(value2);
                sb.append("\n");
                sb3.append(key2);
                sb3.append(";");
            }
        }
        sb.append("\n");
        if (sb3.length() > 1) {
            sb.append(sb3.substring(0, sb3.length() - 1));
            sb.append("\n");
        }
        byte[] bytes = this.c;
        if (bytes == null) {
            bytes = "".getBytes();
        }
        this.c = bytes;
        sb.append(d(bytes));
        if (this.i) {
            System.out.println("###################################");
            System.out.println("规范请求:\n" + sb.toString());
            System.out.println("###################################\n");
        }
        return sb.toString();
    }

    public String prepareStringToSign(String str) {
        String str2 = (("AWS4-HMAC-SHA256\n" + e(this.f, m) + "\n") + e(this.f, n) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.h + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.g + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + l + "\n") + c(str);
        if (this.i) {
            System.out.println("###################################");
            System.out.println("待签字符串:\n" + str2);
            System.out.println("###################################\n");
        }
        return str2;
    }

    private AwsV4Sign(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.d = builder.e;
        this.e = builder.f;
        this.f = builder.g;
        this.c = builder.h;
        this.g = builder.d;
        this.h = builder.c;
        this.i = builder.i;
    }
}
