package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
final class e {
    public static final int e = 1;
    public static final int f = 2;
    private static final String g = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"";
    private static final String h = "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"";
    private static final String i = "MD5";
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public e(int authenticationMechanism, String realm, String nonce, String opaque) {
        this.a = authenticationMechanism;
        this.b = realm;
        this.c = nonce;
        this.d = opaque;
    }

    private String b(RtspMessageUtil.RtspAuthUserInfo authUserInfo) {
        String str = authUserInfo.username;
        String str2 = authUserInfo.password;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return Base64.encodeToString(RtspMessageUtil.c(sb.toString()), 0);
    }

    private String c(RtspMessageUtil.RtspAuthUserInfo authUserInfo, Uri uri, int requestMethod) throws ParserException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(i);
            String strR = RtspMessageUtil.r(requestMethod);
            String str = authUserInfo.username;
            String str2 = this.b;
            String str3 = authUserInfo.password;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            sb.append(":");
            sb.append(str3);
            String hexString = Util.toHexString(messageDigest.digest(RtspMessageUtil.c(sb.toString())));
            String strValueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strR).length() + 1 + strValueOf.length());
            sb2.append(strR);
            sb2.append(":");
            sb2.append(strValueOf);
            String hexString2 = Util.toHexString(messageDigest.digest(RtspMessageUtil.c(sb2.toString())));
            String str4 = this.c;
            StringBuilder sb3 = new StringBuilder(String.valueOf(hexString).length() + 2 + String.valueOf(str4).length() + String.valueOf(hexString2).length());
            sb3.append(hexString);
            sb3.append(":");
            sb3.append(str4);
            sb3.append(":");
            sb3.append(hexString2);
            String hexString3 = Util.toHexString(messageDigest.digest(RtspMessageUtil.c(sb3.toString())));
            return this.d.isEmpty() ? Util.formatInvariant(g, authUserInfo.username, this.b, this.c, uri, hexString3) : Util.formatInvariant(h, authUserInfo.username, this.b, this.c, uri, hexString3, this.d);
        } catch (NoSuchAlgorithmException e2) {
            throw ParserException.createForManifestWithUnsupportedFeature(null, e2);
        }
    }

    public String a(RtspMessageUtil.RtspAuthUserInfo authUserInfo, Uri uri, int requestMethod) throws ParserException {
        int i2 = this.a;
        if (i2 == 1) {
            return b(authUserInfo);
        }
        if (i2 == 2) {
            return c(authUserInfo, uri, requestMethod);
        }
        throw ParserException.createForManifestWithUnsupportedFeature(null, new UnsupportedOperationException());
    }
}
