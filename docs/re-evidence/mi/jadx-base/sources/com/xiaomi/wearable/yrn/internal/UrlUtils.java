package com.xiaomi.wearable.yrn.internal;

import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.wearable.yrn.internal.UrlUtils;
import defpackage.gv5;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0006\u001a\u00020\u0005J6\u0010\u000b\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000ej\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\r0\f2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\u0019\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J.\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tJ\f\u0010!\u001a\u00020\u0005*\u00020\u0005H\u0002R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/wearable/yrn/internal/UrlUtils;", "", "<init>", "()V", "getPath", "", "url", "getParams", "getParams2", "", "getParamsMap", "parseUrlAndParams", "Landroid/util/Pair;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "parseShortPath", "RE_TOP_DOMAIN", "RE_TOP_1", "RE_TOP_2", "RE_TOP_3", "PATTEN_IP", "Ljava/util/regex/Pattern;", "PATTEN_TOP1", "PATTEN_TOP2", "PATTEN_TOP3", "getDomain", "level", "", "getHost", "generateUrl", "appName", "pageName", "params", "encodeUrl", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUrlUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlUtils.kt\ncom/xiaomi/wearable/yrn/internal/UrlUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,173:1\n739#2,9:174\n739#2,9:187\n37#3:183\n36#3,3:184\n37#3:196\n36#3,3:197\n*S KotlinDebug\n*F\n+ 1 UrlUtils.kt\ncom/xiaomi/wearable/yrn/internal/UrlUtils\n*L\n49#1:174,9\n67#1:187,9\n49#1:183\n49#1:184,3\n67#1:196\n67#1:197,3\n*E\n"})
public final class UrlUtils {

    @NotNull
    public static final UrlUtils INSTANCE = new UrlUtils();

    @NotNull
    private static final Pattern PATTEN_IP;

    @NotNull
    private static final Pattern PATTEN_TOP1;

    @NotNull
    private static final Pattern PATTEN_TOP2;

    @NotNull
    private static final Pattern PATTEN_TOP3;

    @NotNull
    private static final String RE_TOP_1 = "(\\w*\\.?){1}\\.(com\\.cn|net\\.cn|gov\\.cn|org\\.nz|org\\.cn|com|net|org|gov|cc|biz|info|cn|co|me)";

    @NotNull
    private static final String RE_TOP_2 = "(\\w*\\.?){2}\\.(com\\.cn|net\\.cn|gov\\.cn|org\\.nz|org\\.cn|com|net|org|gov|cc|biz|info|cn|co|me)";

    @NotNull
    private static final String RE_TOP_3 = "(\\w*\\.?){3}\\.(com\\.cn|net\\.cn|gov\\.cn|org\\.nz|org\\.cn|com|net|org|gov|cc|biz|info|cn|co|me)";

    @NotNull
    private static final String RE_TOP_DOMAIN = "(com\\.cn|net\\.cn|gov\\.cn|org\\.nz|org\\.cn|com|net|org|gov|cc|biz|info|cn|co|me)";

    static {
        Pattern patternCompile = Pattern.compile("((http://)|(https://))?((\\d+\\.){3}(\\d+))");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        PATTEN_IP = patternCompile;
        Pattern patternCompile2 = Pattern.compile(RE_TOP_1);
        Intrinsics.checkNotNullExpressionValue(patternCompile2, "compile(...)");
        PATTEN_TOP1 = patternCompile2;
        Pattern patternCompile3 = Pattern.compile(RE_TOP_2);
        Intrinsics.checkNotNullExpressionValue(patternCompile3, "compile(...)");
        PATTEN_TOP2 = patternCompile3;
        Pattern patternCompile4 = Pattern.compile(RE_TOP_3);
        Intrinsics.checkNotNullExpressionValue(patternCompile4, "compile(...)");
        PATTEN_TOP3 = patternCompile4;
    }

    private UrlUtils() {
    }

    private final String encodeUrl(String str) throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(str, "UTF-8");
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return strEncode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence generateUrl$lambda$2(Map.Entry entry) {
        String string;
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        return str + "=" + ((value == null || (string = value.toString()) == null) ? null : INSTANCE.encodeUrl(string));
    }

    @NotNull
    public final String generateUrl(@NotNull String appName, @NotNull String pageName, @Nullable Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        String str = Constants.PAGE_ROUTER_DOMAIN + appName + "/" + pageName;
        if (params == null || params.isEmpty()) {
            return str;
        }
        return str + "?" + CollectionsKt___CollectionsKt.joinToString$default(params.entrySet(), gv5.CONNECT_STR, null, null, 0, null, new Function1() { // from class: tdq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UrlUtils.generateUrl$lambda$2((Map.Entry) obj);
            }
        }, 30, null);
    }

    @NotNull
    public final String getDomain(@Nullable String url, int level) {
        Matcher matcher;
        Matcher matcher2 = PATTEN_IP.matcher(url);
        if (matcher2.find()) {
            String strGroup = matcher2.group(4);
            Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
            return strGroup;
        }
        if (level == 1) {
            matcher = PATTEN_TOP1.matcher(url);
        } else if (level == 2) {
            matcher = PATTEN_TOP2.matcher(url);
        } else {
            if (level != 3) {
                return "";
            }
            matcher = PATTEN_TOP3.matcher(url);
        }
        if (!matcher.find()) {
            return "";
        }
        String strGroup2 = matcher.group(0);
        Intrinsics.checkNotNullExpressionValue(strGroup2, "group(...)");
        return strGroup2;
    }

    @NotNull
    public final String getHost(@Nullable String url) {
        try {
            return new URL(url).getHost();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "";
        }
    }

    @NotNull
    public final String getParams(@NotNull String url) {
        int iIndexOf$default;
        int i;
        Intrinsics.checkNotNullParameter(url, "url");
        if (TextUtils.isEmpty(url) || (iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) url, "?", 0, false, 6, (Object) null)) < 0 || (i = iIndexOf$default + 1) >= url.length()) {
            return "";
        }
        String strSubstring = url.substring(i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public final Map<String, String> getParams2(@NotNull String url) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(url, "url");
        HashMap map = new HashMap();
        String params = getParams(url);
        if (TextUtils.isEmpty(params)) {
            return map;
        }
        List<String> listSplit = new Regex(gv5.CONNECT_STR).split(params, 0);
        if (listSplit.isEmpty()) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            break;
        }
        ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                break;
            }
            if (listIterator.previous().length() != 0) {
                listEmptyList = CollectionsKt___CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                break;
            }
        }
        String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, "=", 0, false, 6, (Object) null);
                if (iIndexOf$default > 0 && iIndexOf$default < str.length() - 1) {
                    String strSubstring = str.substring(0, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    String strSubstring2 = str.substring(iIndexOf$default + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    map.put(strSubstring, strSubstring2);
                }
            }
        }
        return map;
    }

    @NotNull
    public final Map<String, String> getParamsMap(@NotNull String url) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(url, "url");
        HashMap map = new HashMap();
        String params = getParams(url);
        if (TextUtils.isEmpty(params)) {
            return map;
        }
        List<String> listSplit = new Regex(gv5.CONNECT_STR).split(params, 0);
        if (listSplit.isEmpty()) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            break;
        }
        ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                break;
            }
            if (listIterator.previous().length() != 0) {
                listEmptyList = CollectionsKt___CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                break;
            }
        }
        String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, "=", 0, false, 6, (Object) null);
                if (iIndexOf$default > 0 && iIndexOf$default < str.length() - 1) {
                    String strSubstring = str.substring(0, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    String strSubstring2 = str.substring(iIndexOf$default + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    map.put(strSubstring, strSubstring2);
                }
            }
        }
        return map;
    }

    @NotNull
    public final String getPath(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (TextUtils.isEmpty(url)) {
            return url;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) url, "?", 0, false, 6, (Object) null);
        if (iIndexOf$default >= 0) {
            url = url.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(url, "substring(...)");
        }
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) url, "/", 0, false, 6, (Object) null);
        if (iLastIndexOf$default >= 0) {
            url = url.substring(iLastIndexOf$default + 1, url.length());
            Intrinsics.checkNotNullExpressionValue(url, "substring(...)");
        }
        TextUtils.isEmpty(url);
        return url;
    }

    @NotNull
    public final String parseShortPath(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (TextUtils.isEmpty(url)) {
            return "";
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) url, "?", 0, false, 6, (Object) null);
        if (iIndexOf$default >= 0) {
            url = url.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(url, "substring(...)");
        }
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) url, "/", 0, false, 6, (Object) null);
        if (iLastIndexOf$default < 0) {
            return url;
        }
        String strSubstring = url.substring(iLastIndexOf$default + 1, url.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public final Pair<String, HashMap<String, String>> parseUrlAndParams(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Matcher matcher = Pattern.compile("(\\w+)=([\\-_.%\\w+]+)").matcher(url);
        HashMap map = new HashMap();
        while (matcher.find()) {
            if (matcher.groupCount() == 2) {
                map.put(matcher.group(1), URLDecoder.decode(matcher.group(2)));
            }
        }
        return new Pair<>(parseShortPath(url), map);
    }
}
