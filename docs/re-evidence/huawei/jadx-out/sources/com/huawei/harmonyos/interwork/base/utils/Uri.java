package com.huawei.harmonyos.interwork.base.utils;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.harmonyos.interwork.base.utils.Uri;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Uri implements Parcelable, Comparable<Uri> {
    private static final int DEFAULT_PORT = -1;
    private static final int FIRST_POS = 0;
    private static final char FRAGMENT_SEPARATOR = '#';
    private static final int HEXADECIMAL = 16;
    private static final int HEXVALUE_BEGIN = 10;
    private static final int HIERARCHICAL_URI = 2;
    private static final int HIGH_MASK = 240;
    private static final String INVALID_INPUT_CHARACTER = "�";
    private static final char LOWER_CASE_BEGIN = 'a';
    private static final char LOWER_CASE_F = 'f';
    private static final int LOW_MASK = 15;
    private static final int NOT_FOUND = -1;
    private static final char NUMBER_BEGIN = '0';
    private static final char NUMBER_END = '9';
    private static final int OPAQUE_URI = 1;
    private static final String PATH_ALLOW = "/";
    private static final char PERCENT_SIGN = '%';
    private static final int POS_INC = 1;
    private static final int POS_INC_MORE = 2;
    private static final char QUERY_FLAG = '?';
    private static final char RIGHT_SEPARATOR = '\\';
    private static final char SCHEME_FRAGMENT = '#';
    private static final char SCHEME_SEPARATOR = ':';
    private static final int SECOND_POS = 1;
    private static final char SLASH_SEPARATOR = '/';
    private static final char UPPER_CASE_BEGIN = 'A';
    private static final char UPPER_CASE_F = 'F';
    String scheme;
    public static final Parcelable.Creator<Uri> CREATOR = new Parcelable.Creator<Uri>() { // from class: com.huawei.harmonyos.interwork.base.utils.Uri.3
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Uri[] newArray(int i) {
            return new Uri[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Uri createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            if (i == 1) {
                return OpaqueUri.makeFromParcel(parcel);
            }
            if (i == 2) {
                return HierarchicalUri.makeFromParcel(parcel);
            }
            throw new IllegalArgumentException("unsupported URI type.");
        }
    };
    private static final Pattern URI_SCHEME_PATTERN = Pattern.compile("^[a-zA-Z][a-zA-Z0-9|\\+|\\-|\\.]*$");
    private static final char[] HEXADECIMAL_DIGITS = "0123456789ABCDEF".toCharArray();

    public static class HierarchicalUri extends Uri {
        private a authority;
        private a fragment;
        private a host;
        private final Object lock;
        private a path;
        private volatile List<String> pathList;
        private Integer port;
        private a query;
        private volatile Map<String, List<String>> queryParamMap;
        private a ssp;
        private String uriStrCache;
        private a userInfo;

        private int findPortIndex(String str) {
            if (str == null || str.isEmpty()) {
                return -1;
            }
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == ':') {
                    return length;
                }
                if (cCharAt < '0' || cCharAt > '9') {
                    return -1;
                }
            }
            return -1;
        }

        private void generateAuthority() {
            String encodedAuthority = getEncodedAuthority();
            if (encodedAuthority == null) {
                this.port = -1;
                return;
            }
            int iLastIndexOf = encodedAuthority.lastIndexOf(64);
            this.userInfo = iLastIndexOf == -1 ? null : a.a(null, encodedAuthority.substring(0, iLastIndexOf));
            int iFindPortIndex = findPortIndex(encodedAuthority);
            this.host = a.a(null, iFindPortIndex == -1 ? encodedAuthority.substring(iLastIndexOf + 1) : encodedAuthority.substring(iLastIndexOf + 1, iFindPortIndex));
            if (iFindPortIndex == -1) {
                this.port = -1;
            }
            try {
                this.port = Integer.valueOf(Integer.parseInt(Uri.decode(encodedAuthority.substring(iFindPortIndex + 1))));
            } catch (NumberFormatException unused) {
                this.port = -1;
            }
        }

        private a generateHost() {
            if (this.host == null) {
                generateAuthority();
            }
            return this.host;
        }

        private Integer generatePort() {
            if (this.port == null) {
                generateAuthority();
            }
            return this.port;
        }

        private Optional<a> generateSsp() {
            a aVar = this.ssp;
            if (aVar != null) {
                return Optional.ofNullable(aVar);
            }
            final StringBuilder sb = new StringBuilder();
            Optional.ofNullable(this.authority).ifPresent(new Consumer() { // from class: dak
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Uri.HierarchicalUri.lambda$generateSsp$0(sb, (Uri.a) obj);
                }
            });
            Optional.ofNullable(this.path).ifPresent(new Consumer() { // from class: daj
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Uri.HierarchicalUri.lambda$generateSsp$1(sb, (Uri.a) obj);
                }
            });
            Optional.ofNullable(this.query).ifPresent(new Consumer() { // from class: daq
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Uri.HierarchicalUri.lambda$generateSsp$2(sb, (Uri.a) obj);
                }
            });
            if (sb.length() == 0) {
                return Optional.empty();
            }
            a aVarA = a.a(null, sb.toString());
            this.ssp = aVarA;
            return Optional.ofNullable(aVarA);
        }

        private a generateUserInfo(boolean z) {
            if (this.userInfo == null) {
                generateAuthority();
            }
            return this.userInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: getUriStr, reason: merged with bridge method [inline-methods] */
        public String m818x5b6d6924() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append(Uri.SCHEME_SEPARATOR);
            }
            if (this.ssp == null) {
                generateSsp();
            }
            if (this.ssp != null) {
                String encodedSchemeSpecificPart = getEncodedSchemeSpecificPart();
                if (!TextUtils.isEmpty(encodedSchemeSpecificPart)) {
                    sb.append(encodedSchemeSpecificPart);
                }
            }
            if (this.fragment != null) {
                String encodedFragment = getEncodedFragment();
                if (!TextUtils.isEmpty(encodedFragment)) {
                    sb.append('#');
                    sb.append(encodedFragment);
                }
            }
            String string = sb.toString();
            this.uriStrCache = string;
            return string;
        }

        public static /* synthetic */ void lambda$generateSsp$0(StringBuilder sb, a aVar) {
            String strD = aVar.d((String) null);
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            sb.append("//");
            sb.append(strD);
        }

        public static /* synthetic */ void lambda$generateSsp$1(StringBuilder sb, a aVar) {
            String strD = aVar.d("/");
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            sb.append(strD);
        }

        public static /* synthetic */ void lambda$generateSsp$2(StringBuilder sb, a aVar) {
            String strD = aVar.d((String) null);
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            sb.append("?");
            sb.append(strD);
        }

        public static HierarchicalUri makeFromParcel(Parcel parcel) {
            return new HierarchicalUri(parcel.readString(), a.d(parcel), a.d(parcel), a.d(parcel), a.d(parcel));
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public c buildUpon() {
            return new c().f(this.scheme).d(this.authority).b(this.path).c(this.query).a(this.fragment);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Uri uri) {
            return super.compareTo(uri);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedAuthority() {
            return a.b(this.authority).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedFragment() {
            return a.b(this.fragment).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedHost() {
            return a.b(generateHost()).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedPath() {
            return a.b(this.path).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public List<String> getDecodedPathList() {
            if (this.pathList != null) {
                return this.pathList;
            }
            String encodedPath = getEncodedPath();
            int i = 0;
            if (encodedPath == null) {
                ArrayList arrayList = new ArrayList(0);
                this.pathList = arrayList;
                return arrayList;
            }
            synchronized (this.lock) {
                if (this.pathList != null) {
                    return this.pathList;
                }
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int iIndexOf = encodedPath.indexOf(47, i);
                    if (iIndexOf <= -1) {
                        break;
                    }
                    if (i < iIndexOf) {
                        arrayList2.add(Uri.decode(encodedPath.substring(i, iIndexOf)));
                    }
                    i = iIndexOf + 1;
                }
                if (i < encodedPath.length()) {
                    arrayList2.add(Uri.decode(encodedPath.substring(i)));
                }
                this.pathList = arrayList2;
                return arrayList2;
            }
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedQuery() {
            return a.b(this.query).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public Map<String, List<String>> getDecodedQueryParams() {
            if (this.queryParamMap != null) {
                return this.queryParamMap;
            }
            String encodedQuery = getEncodedQuery();
            if (encodedQuery == null) {
                HashMap map = new HashMap();
                this.queryParamMap = map;
                return map;
            }
            synchronized (this.lock) {
                if (this.queryParamMap != null) {
                    return this.queryParamMap;
                }
                HashMap map2 = new HashMap();
                int i = 0;
                while (true) {
                    int iIndexOf = encodedQuery.indexOf(38, i);
                    int length = iIndexOf != -1 ? iIndexOf : encodedQuery.length();
                    int iIndexOf2 = encodedQuery.indexOf(61, i);
                    if (iIndexOf2 > length || iIndexOf2 == -1) {
                        iIndexOf2 = length;
                    }
                    String strDecode = Uri.decode(encodedQuery.substring(i, iIndexOf2));
                    String strDecode2 = iIndexOf2 != length ? Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)) : "";
                    if (!map2.containsKey(strDecode)) {
                        map2.put(strDecode, new ArrayList());
                    }
                    ((List) map2.get(strDecode)).add(strDecode2);
                    if (iIndexOf == -1) {
                        this.queryParamMap = map2;
                        return map2;
                    }
                    i = iIndexOf + 1;
                }
            }
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedSchemeSpecificPart() {
            return a.b(generateSsp().orElse(null)).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedUserInfo() {
            return a.b(generateUserInfo(false)).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedAuthority() {
            return a.c(this.authority, null).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedFragment() {
            return a.c(this.fragment, null).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedHost() {
            return a.c(generateHost(), null).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedPath() {
            return a.c(this.path, "/").orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedQuery() {
            return a.c(this.query, null).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedSchemeSpecificPart() {
            return a.c(generateSsp().orElse(null), "/").orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedUserInfo() {
            return a.c(generateUserInfo(true), null).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public int getPort() {
            return generatePort().intValue();
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public boolean isHierarchical() {
            return true;
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String toString() {
            return (String) Optional.ofNullable(this.uriStrCache).orElseGet(new Supplier() { // from class: dan
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f31584b.m818x5b6d6924();
                }
            });
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (parcel == null) {
                return;
            }
            parcel.writeInt(2);
            parcel.writeString(this.scheme);
            a.b(this.authority, parcel, null);
            a.b(this.path, parcel, "/");
            a.b(this.query, parcel, null);
            a.b(this.fragment, parcel, null);
        }

        private HierarchicalUri(String str, a aVar, a aVar2, a aVar3, a aVar4) {
            super(str);
            this.lock = new Object();
            this.authority = aVar;
            this.path = aVar2;
            this.query = aVar3;
            this.fragment = aVar4;
        }
    }

    public static class OpaqueUri extends Uri {
        private a fragment;
        private a opaqueSsp;
        private String uriStrCache;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: getUriStr, reason: merged with bridge method [inline-methods] */
        public String m819xfc9bc04a() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.scheme);
            sb.append(Uri.SCHEME_SEPARATOR);
            sb.append(getEncodedSchemeSpecificPart());
            if (this.fragment != null) {
                sb.append('#');
                sb.append(getEncodedFragment());
            }
            String string = sb.toString();
            this.uriStrCache = string;
            return string;
        }

        public static /* synthetic */ UnsupportedOperationException lambda$new$0() {
            return new UnsupportedOperationException("The ssp part can't be null.");
        }

        public static OpaqueUri makeFromParcel(Parcel parcel) {
            return new OpaqueUri(parcel.readString(), a.d(parcel), a.d(parcel));
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public c buildUpon() {
            return new c().f(this.scheme).e(this.opaqueSsp).a(this.fragment);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Uri uri) {
            return super.compareTo(uri);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedAuthority() {
            return "";
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedFragment() {
            return a.b(this.fragment).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedHost() {
            return "";
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedPath() {
            return "";
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public List<String> getDecodedPathList() {
            return new ArrayList(0);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedQuery() {
            return "";
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public Map<String, List<String>> getDecodedQueryParams() {
            return new HashMap();
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedSchemeSpecificPart() {
            return this.opaqueSsp.d();
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getDecodedUserInfo() {
            return "";
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedAuthority() {
            return "";
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedFragment() {
            return a.c(this.fragment, null).orElse(null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedHost() {
            return "";
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedPath() {
            return "";
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedQuery() {
            return "";
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedSchemeSpecificPart() {
            return this.opaqueSsp.d((String) null);
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String getEncodedUserInfo() {
            return "";
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public int getPort() {
            return -1;
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public boolean isHierarchical() {
            return false;
        }

        @Override // com.huawei.harmonyos.interwork.base.utils.Uri
        public String toString() {
            return (String) Optional.ofNullable(this.uriStrCache).orElseGet(new Supplier() { // from class: dao
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f31585b.m819xfc9bc04a();
                }
            });
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (parcel == null) {
                return;
            }
            parcel.writeInt(1);
            parcel.writeString(this.scheme);
            a.b(this.opaqueSsp, parcel, null);
            a.b(this.fragment, parcel, null);
        }

        private OpaqueUri(String str, a aVar, a aVar2) {
            super(str);
            this.opaqueSsp = (a) Optional.ofNullable(aVar).orElseThrow(new Supplier() { // from class: dar
                @Override // java.util.function.Supplier
                public final Object get() {
                    return Uri.OpaqueUri.lambda$new$0();
                }
            });
            this.fragment = aVar2;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile String f6102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile String f6103c;

        private a(String str, String str2) {
            this.f6103c = str;
            this.f6102b = str2;
        }

        public static a a(String str, String str2) {
            if (str == null && str2 == null) {
                return null;
            }
            return new a(str, str2);
        }

        public static Optional<String> b(a aVar) {
            return aVar != null ? Optional.ofNullable(aVar.d()) : Optional.empty();
        }

        public static void b(a aVar, Parcel parcel, String str) {
            if (aVar != null) {
                parcel.writeString(aVar.d());
                parcel.writeString(aVar.d(str));
            } else {
                parcel.writeString(null);
                parcel.writeString(null);
            }
        }

        public static Optional<String> c(a aVar, String str) {
            return aVar != null ? Optional.ofNullable(aVar.d(str)) : Optional.empty();
        }

        public static a d(Parcel parcel) {
            return a(parcel.readString(), parcel.readString());
        }

        public /* synthetic */ String a() {
            String strDecode = Uri.decode(this.f6102b);
            this.f6103c = strDecode;
            return strDecode;
        }

        public /* synthetic */ String a(String str) {
            String strOrElse = Uri.encode(this.f6103c, str).orElse(null);
            this.f6102b = strOrElse;
            return strOrElse;
        }

        public void c() {
            Optional.ofNullable(this.f6103c).ifPresent(new Consumer() { // from class: das
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.e.c((String) obj);
                }
            });
            Optional.ofNullable(this.f6102b).ifPresent(new Consumer() { // from class: dau
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f31587a.e((String) obj);
                }
            });
        }

        public /* synthetic */ void c(String str) {
            if (str.startsWith("/")) {
                return;
            }
            this.f6103c = "/".concat(str);
        }

        public String d() {
            return (String) Optional.ofNullable(this.f6103c).orElseGet(new Supplier() { // from class: dat
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.e.a();
                }
            });
        }

        public String d(final String str) {
            return (String) Optional.ofNullable(this.f6102b).orElseGet(new Supplier() { // from class: dap
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f31586a.a(str);
                }
            });
        }

        public /* synthetic */ void e(String str) {
            if (str.startsWith("/")) {
                return;
            }
            this.f6102b = "/".concat(str);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f6104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f6105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f6106c;
        private a d;
        private a e;
        private a f;

        public c a(a aVar) {
            this.f6105b = aVar;
            return this;
        }

        public c a(String str) {
            return a(a.a(null, str));
        }

        public c b(a aVar) {
            this.d = aVar;
            return this;
        }

        public c b(String str) {
            return e(a.a(null, str));
        }

        public c c(a aVar) {
            this.e = aVar;
            return this;
        }

        public c c(String str) {
            a aVar = this.d;
            if (aVar == null) {
                return e("/" + str);
            }
            String strD = aVar.d("/");
            if (!strD.endsWith("/")) {
                strD = strD.concat("/");
            }
            return e(strD + str);
        }

        public c d(a aVar) {
            this.f6104a = aVar;
            return this;
        }

        public c d(String str) {
            return d(a.a(null, str));
        }

        public Uri d() {
            a aVar;
            if (this.f != null) {
                if (this.f6106c != null) {
                    return new OpaqueUri(this.f6106c, this.f, this.f6105b);
                }
                throw new UnsupportedOperationException("The scheme part can't be null.");
            }
            if ((this.f6106c != null || this.f6104a != null) && (aVar = this.d) != null) {
                aVar.c();
            }
            return new HierarchicalUri(this.f6106c, this.f6104a, this.d, this.e, this.f6105b);
        }

        public c e(a aVar) {
            this.f = aVar;
            return this;
        }

        public c e(String str) {
            return b(a.a(null, str));
        }

        public c f(String str) {
            this.f6106c = str;
            return this;
        }

        public c h(String str) {
            return c(a.a(null, str));
        }
    }

    public static Uri appendEncodedPathToUri(Uri uri, String str) {
        if (uri.isOpaque()) {
            throw new UnsupportedOperationException("opaque uri can't append path");
        }
        return uri.buildUpon().c(str).d();
    }

    public static String decode(String str) {
        if (str == null || str.isEmpty() || str.indexOf(37) < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        CharsetDecoder charsetDecoderOnUnmappableCharacter = StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).replaceWith(INVALID_INPUT_CHARACTER).onUnmappableCharacter(CodingErrorAction.REPORT);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length());
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            i++;
            if (cCharAt == '%') {
                byte b2 = 0;
                for (int i2 = 0; i2 < 2; i2++) {
                    if (i >= str.length()) {
                        return sb.toString();
                    }
                    char cCharAt2 = str.charAt(i);
                    i++;
                    int iHexCharToValue = hexCharToValue(cCharAt2);
                    if (iHexCharToValue < 0) {
                        flushDecodingByteAccumulator(sb, charsetDecoderOnUnmappableCharacter, byteBufferAllocate);
                        sb.append(INVALID_INPUT_CHARACTER);
                        break;
                    }
                    b2 = (byte) ((b2 * 16) + iHexCharToValue);
                }
                byteBufferAllocate.put(b2);
            } else {
                flushDecodingByteAccumulator(sb, charsetDecoderOnUnmappableCharacter, byteBufferAllocate);
                sb.append(cCharAt);
            }
        }
        flushDecodingByteAccumulator(sb, charsetDecoderOnUnmappableCharacter, byteBufferAllocate);
        return sb.toString();
    }

    public static String encode(String str) {
        return encode(str, null).orElse(null);
    }

    private static void flushDecodingByteAccumulator(StringBuilder sb, CharsetDecoder charsetDecoder, ByteBuffer byteBuffer) {
        if (byteBuffer.position() == 0) {
            return;
        }
        byteBuffer.flip();
        try {
            try {
                sb.append((CharSequence) charsetDecoder.decode(byteBuffer));
            } catch (CharacterCodingException unused) {
                sb.append(INVALID_INPUT_CHARACTER);
            }
        } finally {
            byteBuffer.flip();
            byteBuffer.limit(byteBuffer.capacity());
        }
    }

    public static Uri getUriFromFileCanonicalPath(File file) throws IOException {
        if (file == null) {
            throw new NullPointerException("file can't be null");
        }
        return new HierarchicalUri("file", a.a("", null), a.a(file.getCanonicalPath(), null), null, null);
    }

    public static Uri getUriFromParts(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("scheme can't be null");
        }
        if (str2 == null) {
            throw new NullPointerException("ssp can't be null");
        }
        return new OpaqueUri(str, a.a(str2, null), a.a(str3, null));
    }

    private static int hexCharToValue(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - NUMBER_BEGIN;
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    private static boolean isAllowed(char c2, String str) {
        if (c2 >= 'A' && c2 <= 'Z') {
            return true;
        }
        if (c2 >= 'a' && c2 <= 'z') {
            return true;
        }
        if ((c2 < '0' || c2 > '9') && "_-!.~'()*".indexOf(c2) == -1) {
            return (str == null || str.indexOf(c2) == -1) ? false : true;
        }
        return true;
    }

    public static Uri parse(String str) {
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("uriStr is null or empty.");
        }
        c cVar = new c();
        String strOrElse = parseScheme(str).orElse(null);
        cVar.f(strOrElse);
        cVar.a(parseFragment(str).orElse(null));
        String strOrElse2 = parseSchemeSpecificPart(str).orElse(null);
        if (strOrElse != null && strOrElse2 != null && !strOrElse2.startsWith("/")) {
            cVar.b(strOrElse2);
            return cVar.d();
        }
        cVar.d(parseAuthority(strOrElse2).orElse(null));
        cVar.e(parsePath(str).orElse(null));
        cVar.h(parseQuery(strOrElse2).orElse(null));
        return cVar.d();
    }

    private static Optional<String> parseAuthority(String str) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        int length = str.length();
        if (length <= 2 || str.charAt(0) != '/' || str.charAt(1) != '/') {
            return Optional.empty();
        }
        int i = 2;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\' || cCharAt == '?' || cCharAt == '#') {
                break;
            }
            i++;
        }
        return Optional.ofNullable(str.substring(2, i));
    }

    private static Optional<String> parseFragment(String str) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        int iIndexOf = str.indexOf(35);
        return iIndexOf != -1 ? Optional.ofNullable(str.substring(iIndexOf + 1)) : Optional.empty();
    }

    private static Optional<String> parsePath(String str) {
        int iIndexOf = str.indexOf(58);
        int length = str.length();
        int i = iIndexOf == -1 ? 0 : iIndexOf + 1;
        int i2 = i + 1;
        if (length > i2 && str.charAt(i) == '/' && str.charAt(i2) == '/') {
            i += 2;
            while (i < length) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '?' || cCharAt == '#') {
                    return Optional.empty();
                }
                if (cCharAt == '/' || cCharAt == '\\') {
                    break;
                }
                i++;
            }
        }
        int i3 = i;
        while (i3 < length) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 == '?' || cCharAt2 == '#') {
                break;
            }
            i3++;
        }
        return i3 == i ? Optional.empty() : Optional.ofNullable(str.substring(i, i3));
    }

    private static Optional<String> parseQuery(String str) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        int iIndexOf = str.indexOf(63);
        return iIndexOf == -1 ? Optional.empty() : Optional.ofNullable(str.substring(iIndexOf + 1));
    }

    private static Optional<String> parseScheme(String str) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        int iIndexOf = str.indexOf(58);
        if (iIndexOf <= 0) {
            return Optional.empty();
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (URI_SCHEME_PATTERN.matcher(strSubstring).matches()) {
            return Optional.ofNullable(strSubstring);
        }
        throw new IllegalArgumentException("scheme is not illegal.");
    }

    private static Optional<String> parseSchemeSpecificPart(String str) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        int iIndexOf = str.indexOf(58);
        int iIndexOf2 = str.indexOf(35);
        return iIndexOf2 == -1 ? Optional.ofNullable(str.substring(iIndexOf + 1)) : Optional.ofNullable(str.substring(iIndexOf + 1, iIndexOf2));
    }

    public abstract c buildUpon();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Uri)) {
            return false;
        }
        return ((Uri) obj).toString().equals(toString());
    }

    public boolean getBooleanQueryParam(String str, boolean z) {
        String firstQueryParamByKey = getFirstQueryParamByKey(str);
        if (firstQueryParamByKey == null) {
            return z;
        }
        String lowerCase = firstQueryParamByKey.toLowerCase(Locale.ROOT);
        return ("false".equals(lowerCase) || "0".equals(lowerCase)) ? false : true;
    }

    public abstract String getDecodedAuthority();

    public abstract String getDecodedFragment();

    public abstract String getDecodedHost();

    public abstract String getDecodedPath();

    public abstract List<String> getDecodedPathList();

    public abstract String getDecodedQuery();

    public abstract Map<String, List<String>> getDecodedQueryParams();

    public abstract String getDecodedSchemeSpecificPart();

    public abstract String getDecodedUserInfo();

    public abstract String getEncodedAuthority();

    public abstract String getEncodedFragment();

    public abstract String getEncodedHost();

    public abstract String getEncodedPath();

    public abstract String getEncodedQuery();

    public abstract String getEncodedSchemeSpecificPart();

    public abstract String getEncodedUserInfo();

    public String getFirstQueryParamByKey(String str) {
        List<String> queryParamsByKey = getQueryParamsByKey(str);
        return queryParamsByKey.isEmpty() ? "" : queryParamsByKey.get(0);
    }

    public Optional<String> getLastPath() {
        List<String> decodedPathList = getDecodedPathList();
        return decodedPathList.isEmpty() ? Optional.empty() : Optional.ofNullable(decodedPathList.get(decodedPathList.size() - 1));
    }

    public Uri getLowerCaseScheme() {
        String scheme = getScheme();
        if (scheme != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (!scheme.equals(lowerCase)) {
                return buildUpon().f(lowerCase).d();
            }
        }
        return this;
    }

    public abstract int getPort();

    public Set<String> getQueryParamNames() {
        return getDecodedQueryParams().keySet();
    }

    public List<String> getQueryParamsByKey(String str) {
        return getDecodedQueryParams().getOrDefault(str, new ArrayList(0));
    }

    public String getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        return Objects.hashCode(toString());
    }

    public boolean isAbsolute() {
        return !isRelative();
    }

    public abstract boolean isHierarchical();

    public boolean isOpaque() {
        return !isHierarchical();
    }

    public boolean isRelative() {
        return this.scheme == null;
    }

    public abstract String toString();

    private Uri(String str) {
        this.scheme = str;
    }

    public static Optional<String> encode(String str, String str2) {
        if (str == null) {
            return Optional.empty();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (isAllowed(cCharAt, str2)) {
                sb.append(cCharAt);
            } else {
                for (byte b2 : String.valueOf(cCharAt).getBytes(StandardCharsets.UTF_8)) {
                    sb.append(PERCENT_SIGN);
                    char[] cArr = HEXADECIMAL_DIGITS;
                    sb.append(cArr[(b2 & 240) >> 4]);
                    sb.append(cArr[b2 & 15]);
                }
            }
        }
        return Optional.ofNullable(sb.toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(Uri uri) {
        return toString().compareTo(uri.toString());
    }
}
