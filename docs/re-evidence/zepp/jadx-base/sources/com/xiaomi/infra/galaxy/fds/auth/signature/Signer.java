package com.xiaomi.infra.galaxy.fds.auth.signature;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.LinkedListMultimap;
import com.xiaomi.infra.galaxy.fds.Common;
import com.xiaomi.infra.galaxy.fds.SubResource;
import com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException;
import com.xiaomi.infra.galaxy.fds.model.HttpMethod;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class Signer {
    private static final Log a = LogFactory.getLog(Signer.class);
    private static final Set<String> b = new HashSet();
    private static final String c = XiaomiHeader.DATE.getName();
    private static final String d = "multipart/form-data";

    static {
        for (SubResource subResource : SubResource.values()) {
            b.add(subResource.getName());
        }
    }

    public static String a(URI uri) {
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getPath());
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, String> entry : Utils.parseUriParameters(uri).entries()) {
            String key = entry.getKey();
            if (b.contains(key)) {
                treeMap.put(key, entry.getValue());
            }
        }
        if (!treeMap.isEmpty()) {
            sb.append("?");
            boolean z = true;
            for (Map.Entry entry2 : treeMap.entrySet()) {
                if (z) {
                    z = false;
                    sb.append((String) entry2.getKey());
                } else {
                    sb.append(com.alipay.sdk.m.s.a.l);
                    sb.append((String) entry2.getKey());
                }
                if (!((String) entry2.getValue()).isEmpty()) {
                    sb.append(SearchCriteria.EQ);
                    sb.append((String) entry2.getValue());
                }
            }
        }
        return sb.toString();
    }

    public static String b(LinkedListMultimap<String, String> linkedListMultimap) {
        if (linkedListMultimap == null) {
            return "";
        }
        TreeMap treeMap = new TreeMap();
        for (String str : linkedListMultimap.keySet()) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("x-xiaomi-")) {
                treeMap.put(lowerCase, Joiner.on(',').join(linkedListMultimap.get(str)));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append(":");
            sb.append((String) entry.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String c(String str) {
        return str == null ? "" : str;
    }

    public static List<String> d(LinkedListMultimap<String, String> linkedListMultimap, String str) {
        LinkedList linkedList = new LinkedList();
        if (linkedListMultimap == null) {
            linkedList.add("");
            return linkedList;
        }
        List<String> list = linkedListMultimap.get(str);
        if (list != null && !list.isEmpty()) {
            return list;
        }
        linkedList.add("");
        return linkedList;
    }

    public static String e(HttpMethod httpMethod, URI uri, LinkedListMultimap<String, String> linkedListMultimap) {
        StringBuilder sb = new StringBuilder();
        sb.append(httpMethod.name());
        sb.append("\n");
        sb.append(d(linkedListMultimap, Common.CONTENT_MD5).get(0));
        sb.append("\n");
        sb.append(f(linkedListMultimap));
        sb.append("\n");
        long jG = g(uri);
        if (jG > 0) {
            sb.append(jG);
            sb.append("\n");
        } else {
            sb.append(c("".equals(d(linkedListMultimap, c).get(0)) ? d(linkedListMultimap, "date").get(0) : ""));
            sb.append("\n");
        }
        sb.append(b(linkedListMultimap));
        sb.append(a(uri));
        return sb.toString();
    }

    public static String f(LinkedListMultimap<String, String> linkedListMultimap) {
        String str = "";
        if (linkedListMultimap != null) {
            List<String> list = linkedListMultimap.get("content-type");
            if (list != null && !list.isEmpty()) {
                str = list.get(0);
            }
            if (str.startsWith("multipart/form-data")) {
                return "multipart/form-data";
            }
        }
        return str;
    }

    public static long g(URI uri) {
        List<String> list = Utils.parseUriParameters(uri).get("Expires");
        if (list == null || list.isEmpty()) {
            return 0L;
        }
        return Long.parseLong(list.get(0));
    }

    public static URI generatePresignedUri(String str, String str2, String str3, List<String> list, Date date, HttpMethod httpMethod, String str4, String str5, SignAlgorithm signAlgorithm) throws GalaxyFDSException {
        return generatePresignedUri(str, str2, str3, list, date, httpMethod, str4, str5, signAlgorithm, null);
    }

    public static String getAuthorizationHeader(HttpMethod httpMethod, URI uri, LinkedListMultimap linkedListMultimap, String str, String str2, SignAlgorithm signAlgorithm) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        return "Galaxy-V2 " + str + ":" + signToBase64(httpMethod, uri, linkedListMultimap, str2, signAlgorithm);
    }

    public static byte[] sign(HttpMethod httpMethod, URI uri, LinkedListMultimap<String, String> linkedListMultimap, String str, SignAlgorithm signAlgorithm) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        Preconditions.checkNotNull(httpMethod);
        Preconditions.checkNotNull(uri);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(signAlgorithm);
        String strE = e(httpMethod, uri, linkedListMultimap);
        Log log = a;
        if (log.isDebugEnabled()) {
            log.debug("Sign for request: " + httpMethod + " " + uri + ", stringToSign=" + strE);
        }
        Mac mac = Mac.getInstance(signAlgorithm.name());
        mac.init(new SecretKeySpec(str.getBytes(), signAlgorithm.name()));
        return mac.doFinal(strE.getBytes("UTF-8"));
    }

    public static String signToBase64(HttpMethod httpMethod, URI uri, LinkedListMultimap linkedListMultimap, String str, SignAlgorithm signAlgorithm) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        return a.b(sign(httpMethod, uri, linkedListMultimap, str, signAlgorithm));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public static URI generatePresignedUri(String str, String str2, String str3, List<String> list, Date date, HttpMethod httpMethod, String str4, String str5, SignAlgorithm signAlgorithm, LinkedListMultimap linkedListMultimap) throws GalaxyFDSException {
        String str6;
        URI uri = null;
        if (str3 != null) {
            try {
                if (str3.isEmpty()) {
                    str6 = "";
                } else {
                    str6 = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str3;
                }
            } catch (UnsupportedEncodingException e) {
                a.error("Failed to encode the url:" + uri.toString(), e);
                throw new GalaxyFDSException("Failed to encode the url:" + uri.toString(), e);
            } catch (URISyntaxException e2) {
                a.error("Invalid URI syntax", e2);
                throw new GalaxyFDSException("Invalid URI syntax", e2);
            } catch (InvalidKeyException e3) {
                a.error("Invalid secret key spec", e3);
                throw new GalaxyFDSException("Invalid secret key spec", e3);
            } catch (NoSuchAlgorithmException e4) {
                a.error("Unsupported signature algorithm:" + signAlgorithm, e4);
                throw new GalaxyFDSException("Unsupported signature algorithm:" + signAlgorithm, e4);
            }
        } else {
            str6 = "";
        }
        URI uri2 = new URI(str);
        if (list == null || list.isEmpty()) {
            uri = new URI(uri2.getScheme(), null, uri2.getHost(), uri2.getPort(), FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2 + str6, "GalaxyAccessKeyId=" + str4 + com.alipay.sdk.m.s.a.l + "Expires" + SearchCriteria.EQ + date.getTime(), null);
        } else {
            uri = new URI(uri2.getScheme(), null, uri2.getHost(), uri2.getPort(), FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str2 + str6, StringUtils.join(list, com.alipay.sdk.m.s.a.l) + com.alipay.sdk.m.s.a.l + "GalaxyAccessKeyId" + SearchCriteria.EQ + str4 + com.alipay.sdk.m.s.a.l + "Expires" + SearchCriteria.EQ + date.getTime(), null);
        }
        return new URI(uri.toString() + com.alipay.sdk.m.s.a.l + "Signature" + SearchCriteria.EQ + signToBase64(httpMethod, uri, linkedListMultimap, str5, signAlgorithm));
    }
}
