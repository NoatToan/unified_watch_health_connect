package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
public class jh0 extends DataSetObservable {
    public static final Object l = new Object();
    public static final Map<String, jh0> m = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f22787b;
    public final List<b> c;
    public final Context d;
    public final String e;
    public Intent f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22788k;

    public static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResolveInfo f22789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f22790b;

        public a(ResolveInfo resolveInfo) {
            this.f22789a = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Float.floatToIntBits(aVar.f22790b) - Float.floatToIntBits(this.f22790b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && a.class == obj.getClass() && Float.floatToIntBits(this.f22790b) == Float.floatToIntBits(((a) obj).f22790b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f22790b) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f22789a.toString() + "; weight:" + new BigDecimal(this.f22790b) + "]";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f22791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f22792b;
        public final float c;

        public b(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            ComponentName componentName = this.f22791a;
            if (componentName == null) {
                if (bVar.f22791a != null) {
                    return false;
                }
            } else if (!componentName.equals(bVar.f22791a)) {
                return false;
            }
            return this.f22792b == bVar.f22792b && Float.floatToIntBits(this.c) == Float.floatToIntBits(bVar.c);
        }

        public int hashCode() {
            ComponentName componentName = this.f22791a;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.f22792b;
            return ((((iHashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.c);
        }

        public String toString() {
            return "[; activity:" + this.f22791a + "; time:" + this.f22792b + "; weight:" + new BigDecimal(this.c) + "]";
        }

        public b(ComponentName componentName, long j, float f) {
            this.f22791a = componentName;
            this.f22792b = j;
            this.c = f;
        }
    }

    public interface c {
    }

    public final class d extends AsyncTask<Object, Void, Void> {
        public d() {
        }

        /* JADX WARN: Code duplicated, block: B:42:0x006f A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = jh0.this.d.openFileOutput(str, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "historical-records");
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        b bVar = (b) list.remove(0);
                        xmlSerializerNewSerializer.startTag(null, "historical-record");
                        xmlSerializerNewSerializer.attribute(null, LifecycleConstantKt.TYPE_ACTIVITY, bVar.f22791a.flattenToString());
                        xmlSerializerNewSerializer.attribute(null, "time", String.valueOf(bVar.f22792b));
                        xmlSerializerNewSerializer.attribute(null, "weight", String.valueOf(bVar.c));
                        xmlSerializerNewSerializer.endTag(null, "historical-record");
                    }
                    xmlSerializerNewSerializer.endTag(null, "historical-records");
                    xmlSerializerNewSerializer.endDocument();
                } catch (IllegalStateException unused) {
                    Object obj = jh0.l;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error writing historical record file: ");
                    sb.append(jh0.this.e);
                } catch (IOException unused2) {
                    Object obj2 = jh0.l;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error writing historical record file: ");
                    sb2.append(jh0.this.e);
                } catch (IllegalArgumentException unused3) {
                    Object obj3 = jh0.l;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Error writing historical record file: ");
                    sb3.append(jh0.this.e);
                } finally {
                    jh0.this.h = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused4) {
                        }
                    }
                }
                return null;
            } catch (FileNotFoundException unused5) {
                Object obj4 = jh0.l;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Error writing historical record file: ");
                sb4.append(str);
                return null;
            }
        }
    }

    public final boolean a(b bVar) {
        boolean zAdd = this.c.add(bVar);
        if (zAdd) {
            this.j = true;
            k();
            j();
            o();
            notifyChanged();
        }
        return zAdd;
    }

    public Intent b(int i) {
        synchronized (this.f22786a) {
            try {
                if (this.f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = this.f22787b.get(i).f22789a.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f);
                intent.setComponent(componentName);
                a(new b(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        boolean zI = i() | l();
        k();
        if (zI) {
            o();
            notifyChanged();
        }
    }

    public ResolveInfo d(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f22786a) {
            c();
            resolveInfo = this.f22787b.get(i).f22789a;
        }
        return resolveInfo;
    }

    public int e() {
        int size;
        synchronized (this.f22786a) {
            c();
            size = this.f22787b.size();
        }
        return size;
    }

    public int f(ResolveInfo resolveInfo) {
        synchronized (this.f22786a) {
            try {
                c();
                List<a> list = this.f22787b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (list.get(i).f22789a == resolveInfo) {
                        return i;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo g() {
        synchronized (this.f22786a) {
            try {
                c();
                if (this.f22787b.isEmpty()) {
                    return null;
                }
                return this.f22787b.get(0).f22789a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int h() {
        int size;
        synchronized (this.f22786a) {
            c();
            size = this.c.size();
        }
        return size;
    }

    public final boolean i() {
        if (!this.f22788k || this.f == null) {
            return false;
        }
        this.f22788k = false;
        this.f22787b.clear();
        List<ResolveInfo> listQueryIntentActivities = this.d.getPackageManager().queryIntentActivities(this.f, 0);
        int size = listQueryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f22787b.add(new a(listQueryIntentActivities.get(i)));
        }
        return true;
    }

    public final void j() {
        if (!this.i) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.j) {
            this.j = false;
            if (TextUtils.isEmpty(this.e)) {
                return;
            }
            new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.c), this.e);
        }
    }

    public final void k() {
        int size = this.c.size() - this.g;
        if (size <= 0) {
            return;
        }
        this.j = true;
        for (int i = 0; i < size; i++) {
            this.c.remove(0);
        }
    }

    public final boolean l() {
        if (!this.h || !this.j || TextUtils.isEmpty(this.e)) {
            return false;
        }
        this.h = false;
        this.i = true;
        m();
        return true;
    }

    public final void m() {
        FileInputStream fileInputStreamOpenFileInput;
        try {
            try {
                fileInputStreamOpenFileInput = this.d.openFileInput(this.e);
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                    }
                    if (!"historical-records".equals(xmlPullParserNewPullParser.getName())) {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    List<b> list = this.c;
                    list.clear();
                    while (true) {
                        int next2 = xmlPullParserNewPullParser.next();
                        if (next2 == 1) {
                            if (fileInputStreamOpenFileInput != null) {
                                break;
                            } else {
                                return;
                            }
                        } else if (next2 != 3 && next2 != 4) {
                            if (!"historical-record".equals(xmlPullParserNewPullParser.getName())) {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                            list.add(new b(xmlPullParserNewPullParser.getAttributeValue(null, LifecycleConstantKt.TYPE_ACTIVITY), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, "weight"))));
                        }
                    }
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error reading historical recrod file: ");
                    sb.append(this.e);
                    if (fileInputStreamOpenFileInput == null) {
                    }
                } catch (XmlPullParserException unused3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error reading historical recrod file: ");
                    sb2.append(this.e);
                    if (fileInputStreamOpenFileInput == null) {
                    }
                }
            } catch (FileNotFoundException unused4) {
            }
        } catch (Throwable th) {
            if (fileInputStreamOpenFileInput != null) {
                try {
                    fileInputStreamOpenFileInput.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public void n(int i) {
        synchronized (this.f22786a) {
            try {
                c();
                a aVar = this.f22787b.get(i);
                a aVar2 = this.f22787b.get(0);
                float f = aVar2 != null ? (aVar2.f22790b - aVar.f22790b) + 5.0f : 1.0f;
                ActivityInfo activityInfo = aVar.f22789a.activityInfo;
                a(new b(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean o() {
        return false;
    }

    public void setOnChooseActivityListener(c cVar) {
        synchronized (this.f22786a) {
        }
    }
}
