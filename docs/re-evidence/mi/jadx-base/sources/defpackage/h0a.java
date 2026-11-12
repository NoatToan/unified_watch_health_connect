package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.xiaomi.fitness.watch.face.edit.entity.SlotType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class h0a {

    @RequiresApi(21)
    public static class a {
        public static int a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d[] f19530a;

        public c(d[] dVarArr) {
            this.f19530a = dVarArr;
        }

        public d[] a() {
            return this.f19530a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19532b;
        public final boolean c;
        public final String d;
        public final int e;
        public final int f;

        public d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f19531a = str;
            this.f19532b = i;
            this.c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }

        public String a() {
            return this.f19531a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.f19532b;
        }

        public boolean f() {
            return this.c;
        }
    }

    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0a f19533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19534b;
        public final int c;
        public final String d;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public e(e0a e0aVar, int i, int i2, String str) {
            this.f19533a = e0aVar;
            this.c = i;
            this.f19534b = i2;
            this.d = str;
        }

        public int a() {
            return this.c;
        }

        public e0a b() {
            return this.f19533a;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public String c() {
            return this.d;
        }

        public int d() {
            return this.f19534b;
        }
    }

    public static int a(TypedArray typedArray, int i) {
        return a.a(typedArray, i);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), q5j.h);
        String string = typedArrayObtainAttributes.getString(q5j.i);
        String string2 = typedArrayObtainAttributes.getString(q5j.m);
        String string3 = typedArrayObtainAttributes.getString(q5j.n);
        int resourceId = typedArrayObtainAttributes.getResourceId(q5j.j, 0);
        int integer = typedArrayObtainAttributes.getInteger(q5j.f31140k, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(q5j.l, 500);
        String string4 = typedArrayObtainAttributes.getString(q5j.o);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new e0a(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(SlotType.FONT)) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    public static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), q5j.p);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(q5j.y) ? q5j.y : q5j.f31141r, 400);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(q5j.w) ? q5j.w : q5j.s, 0);
        int i2 = typedArrayObtainAttributes.hasValue(q5j.z) ? q5j.z : q5j.t;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(q5j.x) ? q5j.x : q5j.u);
        int i3 = typedArrayObtainAttributes.getInt(i2, 0);
        int i4 = typedArrayObtainAttributes.hasValue(q5j.v) ? q5j.v : q5j.q;
        int resourceId = typedArrayObtainAttributes.getResourceId(i4, 0);
        String string2 = typedArrayObtainAttributes.getString(i4);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i, z, string, i3, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
