package okhttp3;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import d53.u;
import d53.w;
import f23.a;
import j20.x;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import o13.e;
import o13.p;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.b;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;
import p13.d0;
import p13.j0;
import vb.h;
import w5.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 32\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u000243B\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\b\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020!H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0/¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u00065"}, d2 = {"Lokhttp3/Headers;", "", "Lo13/p;", "", "", "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "getDate", "(Ljava/lang/String;)Ljava/util/Date;", "Ljava/time/Instant;", "getInstant", "(Ljava/lang/String;)Ljava/time/Instant;", "", "-deprecated_size", "()I", "size", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/String;", "value", "", "names", "()Ljava/util/Set;", "", "values", "(Ljava/lang/String;)Ljava/util/List;", "", "byteCount", "()J", "", "iterator", "()Ljava/util/Iterator;", "Lokhttp3/Headers$Builder;", "newBuilder", "()Lokhttp3/Headers$Builder;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "", "toMultimap", "()Ljava/util/Map;", "[Ljava/lang/String;", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Headers implements Iterable<p<? extends String, ? extends String>>, a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String[] namesAndValues;

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(Map<String, String> map) {
        return INSTANCE.of(map);
    }

    @e
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m385deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i14 = 0; i14 < length2; i14++) {
            length += (long) this.namesAndValues[i14].length();
        }
        return length;
    }

    public boolean equals(Object other) {
        return (other instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) other).namesAndValues);
    }

    public final String get(String name) {
        name.getClass();
        return INSTANCE.get(this.namesAndValues, name);
    }

    public final Date getDate(String name) {
        name.getClass();
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String name) {
        name.getClass();
        Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<p<? extends String, ? extends String>> iterator() {
        int size = size();
        p[] pVarArr = new p[size];
        for (int i14 = 0; i14 < size; i14++) {
            pVarArr[i14] = new p(name(i14), value(i14));
        }
        return new b(pVarArr);
    }

    public final String name(int index) {
        return this.namesAndValues[index * 2];
    }

    public final Set<String> names() {
        u.s(x0.f105818a);
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            treeSet.add(name(i14));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        d0.w(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        u.s(x0.f105818a);
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            String strName = name(i14);
            Locale locale = Locale.US;
            String strF = x.f(locale, strName, locale);
            List arrayList = (List) treeMap.get(strF);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strF, arrayList);
            }
            arrayList.add(value(i14));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            String strName = name(i14);
            String strValue = value(i14);
            sb3.append(strName);
            sb3.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb3.append(strValue);
            sb3.append("\n");
        }
        return sb3.toString();
    }

    public final String value(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    public final List<String> values(String name) {
        name.getClass();
        int size = size();
        ArrayList arrayList = null;
        for (int i14 = 0; i14 < size; i14++) {
            if (name.equalsIgnoreCase(name(i14))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i14));
            }
        }
        if (arrayList == null) {
            return j0.f134944a;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J%\u0010\t\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u0011J\u001d\u0010\u0014\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013H\u0007¢\u0006\u0002\b\u000f¨\u0006\u0015"}, d2 = {"Lokhttp3/Headers$Companion;", "", "()V", "checkName", "", "name", "", "checkValue", "value", "get", "namesAndValues", "", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "headersOf", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "-deprecated_of", "headers", "", "toHeaders", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String name) {
            if (name.length() <= 0) {
                h.s("name is empty");
                return;
            }
            int length = name.length();
            for (int i14 = 0; i14 < length; i14++) {
                char cCharAt = name.charAt(i14);
                if ('!' > cCharAt || cCharAt >= 127) {
                    h.x(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i14), name));
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String value, String name) {
            int length = value.length();
            for (int i14 = 0; i14 < length; i14++) {
                char cCharAt = value.charAt(i14);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i14), name));
                    sb3.append(Util.isSensitiveHeader(name) ? "" : ": ".concat(value));
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] namesAndValues, String name) {
            int length = namesAndValues.length - 2;
            int iN = r.n(length, 0, -2);
            if (iN > length) {
                return null;
            }
            while (!u.q(name, namesAndValues[length], true)) {
                if (length == iN) {
                    return null;
                }
                length -= 2;
            }
            return namesAndValues[length + 1];
        }

        @e
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m387deprecated_of(String... namesAndValues) {
            namesAndValues.getClass();
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public final Headers of(String... namesAndValues) {
            namesAndValues.getClass();
            if (namesAndValues.length % 2 != 0) {
                h.s("Expected alternating header names and values");
                return null;
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                String str = strArr[i15];
                if (str == null) {
                    h.s("Headers cannot be null");
                    return null;
                }
                strArr[i15] = w.i0(str).toString();
            }
            int iN = r.n(0, strArr.length - 1, 2);
            if (iN >= 0) {
                while (true) {
                    String str2 = strArr[i14];
                    String str3 = strArr[i14 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i14 == iN) {
                        break;
                    }
                    i14 += 2;
                }
            }
            return new Headers(strArr, null);
        }

        private Companion() {
        }

        @e
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m386deprecated_of(Map<String, String> headers) {
            headers.getClass();
            return of(headers);
        }

        public final Headers of(Map<String, String> map) {
            map.getClass();
            String[] strArr = new String[map.size() * 2];
            int i14 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = w.i0(key).toString();
                String string2 = w.i0(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i14] = string;
                strArr[i14 + 1] = string2;
                i14 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, j jVar) {
        this(strArr);
    }

    public static final Headers of(String... strArr) {
        return INSTANCE.of(strArr);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0086\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lokhttp3/Headers$Builder;", "", "()V", "namesAndValues", "", "", "getNamesAndValues$okhttp", "()Ljava/util/List;", "add", "line", "name", "value", "Ljava/time/Instant;", "Ljava/util/Date;", "addAll", "headers", "Lokhttp3/Headers;", "addLenient", "addLenient$okhttp", "addUnsafeNonAscii", "build", "get", "removeAll", "set", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String line) {
            line.getClass();
            int iG = w.G(CoreConstants.COLON_CHAR, 0, 6, line);
            if (iG != -1) {
                add(w.i0(line.substring(0, iG)).toString(), line.substring(iG + 1));
                return this;
            }
            h.x("Unexpected header: ".concat(line));
            return null;
        }

        public final Builder addAll(Headers headers) {
            headers.getClass();
            int size = headers.size();
            for (int i14 = 0; i14 < size; i14++) {
                addLenient$okhttp(headers.name(i14), headers.value(i14));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String line) {
            line.getClass();
            int iG = w.G(CoreConstants.COLON_CHAR, 1, 4, line);
            if (iG != -1) {
                addLenient$okhttp(line.substring(0, iG), line.substring(iG + 1));
                return this;
            }
            if (line.charAt(0) == ':') {
                addLenient$okhttp("", line.substring(1));
                return this;
            }
            addLenient$okhttp("", line);
            return this;
        }

        public final Builder addUnsafeNonAscii(String name, String value) {
            name.getClass();
            value.getClass();
            Headers.INSTANCE.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String name) {
            name.getClass();
            int size = this.namesAndValues.size() - 2;
            int iN = r.n(size, 0, -2);
            if (iN > size) {
                return null;
            }
            while (!name.equalsIgnoreCase(this.namesAndValues.get(size))) {
                if (size == iN) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String name) {
            name.getClass();
            int i14 = 0;
            while (i14 < this.namesAndValues.size()) {
                if (name.equalsIgnoreCase(this.namesAndValues.get(i14))) {
                    this.namesAndValues.remove(i14);
                    this.namesAndValues.remove(i14);
                    i14 -= 2;
                }
                i14 += 2;
            }
            return this;
        }

        public final Builder set(String name, String value) {
            name.getClass();
            value.getClass();
            Companion companion = Headers.INSTANCE;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String name, Instant value) {
            name.getClass();
            value.getClass();
            return set(name, new Date(value.toEpochMilli()));
        }

        public final Builder set(String name, Date value) {
            name.getClass();
            value.getClass();
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        public final Builder add(String name, String value) {
            name.getClass();
            value.getClass();
            Companion companion = Headers.INSTANCE;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder addLenient$okhttp(String name, String value) {
            name.getClass();
            value.getClass();
            this.namesAndValues.add(name);
            this.namesAndValues.add(w.i0(value).toString());
            return this;
        }

        public final Builder add(String name, Date value) {
            name.getClass();
            value.getClass();
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String name, Instant value) {
            name.getClass();
            value.getClass();
            add(name, new Date(value.toEpochMilli()));
            return this;
        }
    }
}
