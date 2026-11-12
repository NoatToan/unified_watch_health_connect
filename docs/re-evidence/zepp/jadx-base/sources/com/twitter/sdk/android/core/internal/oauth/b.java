package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import io.netty.util.internal.StringUtil;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Typography;
import okio.ByteString;

/* JADX INFO: loaded from: classes18.dex */
class b {
    private static final String g = "1.0";
    private static final String h = "HMAC-SHA1";
    private static final SecureRandom i = new SecureRandom();
    private final TwitterAuthConfig a;
    private final TwitterAuthToken b;
    private final String c;
    private final String d;
    private final String e;
    private final Map<String, String> f;

    public b(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        this.a = twitterAuthConfig;
        this.b = twitterAuthToken;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = map;
    }

    private void a(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(StringUtil.SPACE);
            sb.append(UrlUtils.percentEncode(str));
            sb.append("=\"");
            sb.append(UrlUtils.percentEncode(str2));
            sb.append("\",");
        }
    }

    private String f(TreeMap<String, String> treeMap) {
        StringBuilder sb = new StringBuilder();
        int size = treeMap.size();
        int i2 = 0;
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            sb.append(UrlUtils.percentEncode(UrlUtils.percentEncode(entry.getKey())));
            sb.append("%3D");
            sb.append(UrlUtils.percentEncode(UrlUtils.percentEncode(entry.getValue())));
            i2++;
            if (i2 < size) {
                sb.append("%26");
            }
        }
        return sb.toString();
    }

    private String g() {
        return String.valueOf(System.nanoTime()) + String.valueOf(Math.abs(i.nextLong()));
    }

    private String h() {
        TwitterAuthToken twitterAuthToken = this.b;
        return UrlUtils.urlEncode(this.a.getConsumerSecret()) + Typography.amp + UrlUtils.urlEncode(twitterAuthToken != null ? twitterAuthToken.secret : null);
    }

    private String i() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }

    public String b(String str) {
        try {
            String strH = h();
            byte[] bytes = str.getBytes(UrlUtils.UTF8);
            SecretKeySpec secretKeySpec = new SecretKeySpec(strH.getBytes(UrlUtils.UTF8), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            byte[] bArrDoFinal = mac.doFinal(bytes);
            return ByteString.of(bArrDoFinal, 0, bArrDoFinal.length).base64();
        } catch (UnsupportedEncodingException e) {
            Twitter.getLogger().e("Twitter", "Failed to calculate signature", e);
            return "";
        } catch (InvalidKeyException e2) {
            Twitter.getLogger().e("Twitter", "Failed to calculate signature", e2);
            return "";
        } catch (NoSuchAlgorithmException e3) {
            Twitter.getLogger().e("Twitter", "Failed to calculate signature", e3);
            return "";
        }
    }

    public String c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("OAuth");
        a(sb, OAuthConstants.PARAM_CALLBACK, this.c);
        a(sb, "oauth_consumer_key", this.a.getConsumerKey());
        a(sb, OAuthConstants.PARAM_NONCE, str);
        a(sb, OAuthConstants.PARAM_SIGNATURE, str3);
        a(sb, OAuthConstants.PARAM_SIGNATURE_METHOD, h);
        a(sb, OAuthConstants.PARAM_TIMESTAMP, str2);
        TwitterAuthToken twitterAuthToken = this.b;
        a(sb, OAuthConstants.PARAM_TOKEN, twitterAuthToken != null ? twitterAuthToken.token : null);
        a(sb, OAuthConstants.PARAM_VERSION, "1.0");
        return sb.substring(0, sb.length() - 1);
    }

    public String d(String str, String str2) {
        String str3;
        URI uriCreate = URI.create(this.e);
        TreeMap<String, String> queryParams = UrlUtils.getQueryParams(uriCreate, true);
        Map<String, String> map = this.f;
        if (map != null) {
            queryParams.putAll(map);
        }
        String str4 = this.c;
        if (str4 != null) {
            queryParams.put(OAuthConstants.PARAM_CALLBACK, str4);
        }
        queryParams.put("oauth_consumer_key", this.a.getConsumerKey());
        queryParams.put(OAuthConstants.PARAM_NONCE, str);
        queryParams.put(OAuthConstants.PARAM_SIGNATURE_METHOD, h);
        queryParams.put(OAuthConstants.PARAM_TIMESTAMP, str2);
        TwitterAuthToken twitterAuthToken = this.b;
        if (twitterAuthToken != null && (str3 = twitterAuthToken.token) != null) {
            queryParams.put(OAuthConstants.PARAM_TOKEN, str3);
        }
        queryParams.put(OAuthConstants.PARAM_VERSION, "1.0");
        return this.d.toUpperCase(Locale.ENGLISH) + Typography.amp + UrlUtils.percentEncode(uriCreate.getScheme() + "://" + uriCreate.getHost() + uriCreate.getPath()) + Typography.amp + f(queryParams);
    }

    public String e() {
        String strG = g();
        String strI = i();
        return c(strG, strI, b(d(strG, strI)));
    }
}
