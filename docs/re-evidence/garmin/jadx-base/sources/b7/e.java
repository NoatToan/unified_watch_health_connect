package b7;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import com.mapbox.maps.extension.compose.style.standard.BaseStyleConfigurationState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    public interface a {
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c[] f16242a;

        public b(c[] cVarArr) {
            this.f16242a = cVarArr;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f16245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f16246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f16247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f16248f;

        public c(String str, int i14, boolean z14, String str2, int i15, int i16) {
            this.f16243a = str;
            this.f16244b = i14;
            this.f16245c = z14;
            this.f16246d = str2;
            this.f16247e = i15;
            this.f16248f = i16;
        }
    }

    private e() {
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011c A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0120 A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014b A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x014f A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    public static a a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i14;
        int i15;
        ?? r14;
        long j8;
        Throwable th3;
        ?? r15;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i14 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            c(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), y6.a.f194588b);
        int i16 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i17 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals(BaseStyleConfigurationState.CONFIG_FONT)) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), y6.a.f194589c);
                        int i18 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z14 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i19 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i24 = typedArrayObtainAttributes2.getInt(i19, 0);
                        int i25 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i25, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i25);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            c(xmlResourceParser);
                        }
                        arrayList.add(new c(string7, i18, z14, string6, i24, resourceId2));
                    } else {
                        c(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((c[]) arrayList.toArray(new c[0]));
        }
        List<List<byte[]>> listB = b(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i17) {
            if (xmlResourceParser.getEventType() == i14) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), y6.a.f194590d);
                    int i26 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i16);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i14);
                        if (string8 == null) {
                            r14 = typedArrayObtainAttributes3;
                            j8 = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                c(xmlResourceParser);
                            } catch (Throwable th4) {
                                th3 = th4;
                                r15 = typedArrayObtainAttributes3;
                                j8 = 1;
                            }
                        }
                        try {
                            r14 = typedArrayObtainAttributes3;
                            i15 = i26;
                            j8 = 1;
                            try {
                                i7.e eVar = new i7.e(string, string2, string8, listB, string9, string10);
                                if (r14 instanceof AutoCloseable) {
                                    ((AutoCloseable) r14).close();
                                } else if (r14 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r14;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z15 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z15) {
                                                    executorService2.shutdownNow();
                                                    z15 = true;
                                                }
                                            }
                                        }
                                        if (z15) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r14.recycle();
                                }
                                arrayList2.add(eVar);
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            r14 = typedArrayObtainAttributes3;
                            j8 = 1;
                            th3 = th;
                            r15 = r14;
                            if (r15 != 0) {
                                throw th3;
                            }
                            try {
                                if (!(r15 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r15).close();
                                    throw th3;
                                }
                                if (r15 instanceof ExecutorService) {
                                    r15.recycle();
                                    throw th3;
                                }
                                executorService = (ExecutorService) r15;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th3;
                                }
                                throw th3;
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                                throw th3;
                            }
                        }
                        th = th5;
                    } catch (Throwable th8) {
                        th = th8;
                        r14 = typedArrayObtainAttributes3;
                    }
                    th3 = th;
                    r15 = r14;
                    if (r15 != 0) {
                        throw th3;
                    }
                    if (!(r15 instanceof AutoCloseable)) {
                        ((AutoCloseable) r15).close();
                        throw th3;
                    }
                    if (r15 instanceof ExecutorService) {
                        r15.recycle();
                        throw th3;
                    }
                    executorService = (ExecutorService) r15;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th3;
                    }
                    executorService.shutdown();
                    boolean z16 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j8, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z16) {
                                executorService.shutdownNow();
                                z16 = true;
                            }
                        }
                    }
                    if (!z16) {
                        throw th3;
                    }
                    Thread.currentThread().interrupt();
                    throw th3;
                }
                i15 = integer;
                c(xmlResourceParser);
                integer = i15;
                integer2 = integer2;
                string5 = string5;
                i14 = 2;
                i16 = 0;
                i17 = 3;
            }
        }
        int i27 = integer2;
        String str = string5;
        int i28 = integer;
        if (!arrayList2.isEmpty()) {
            return new d(arrayList2, i28, i27, str);
        }
        if (string3 == null) {
            vb.h.s("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new i7.e(string, string2, string3, listB, null, null));
        if (string4 != null) {
            arrayList2.add(new i7.e(string, string2, string4, listB, null, null));
        }
        return new d(arrayList2, i28, i27, str);
    }

    public static List<List<byte[]>> b(Resources resources, int i14) {
        if (i14 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i14);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i15 = 0; i15 < typedArrayObtainTypedArray.length(); i15++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i15, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i14);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i14 = 1;
        while (i14 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i14++;
            } else if (next == 3) {
                i14--;
            }
        }
    }

    public static final class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<i7.e> f16249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f16252d;

        public d(List<i7.e> list, int i14, int i15, String str) {
            this.f16249a = list;
            this.f16251c = i14;
            this.f16250b = i15;
            this.f16252d = str;
        }

        public d(i7.e eVar, int i14, int i15) {
            this(Collections.singletonList(eVar), i14, i15, null);
        }
    }
}
