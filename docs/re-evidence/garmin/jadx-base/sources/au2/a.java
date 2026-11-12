package au2;

import android.content.Context;
import c53.g;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.gson.Gson;
import d53.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import o13.m;
import o13.n;
import o13.t;
import o53.a0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.w;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lau2/a;", "", "Lyt2/c;", "config", "Lyt2/d;", "delegate", "<init>", "(Lyt2/c;Lyt2/d;)V", "a", "c", "d", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f13046e = new c(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f13047f = m.b(b.f13055a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkedHashSet f13048g = new LinkedHashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt2.c f13049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yt2.d f13050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f13051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13052d;

    /* JADX INFO: renamed from: au2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau2/a$a;", "", "Ljava/io/File;", "file", "Lzt2/a;", "event", "<init>", "(Ljava/io/File;Lzt2/a;)V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class C0184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f13053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zt2.a f13054b;

        public C0184a(File file, zt2.a aVar) {
            file.getClass();
            aVar.getClass();
            this.f13053a = file;
            this.f13054b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0184a)) {
                return false;
            }
            C0184a c0184a = (C0184a) obj;
            return this.f13053a.equals(c0184a.f13053a) && this.f13054b.equals(c0184a.f13054b);
        }

        public final int hashCode() {
            return this.f13054b.hashCode() + (this.f13053a.hashCode() * 31);
        }

        public final String toString() {
            return "CachedEvent(file=" + this.f13053a + ", event=" + this.f13054b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f13055a = new b();

        public b() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            return LoggerFactory.getLogger("OMT#LocalCache");
        }
    }

    public interface d {
        void a(C0184a c0184a);
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends w implements e23.a<Gson> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f13056a = new e();

        public e() {
            super(0);
        }

        @Override // e23.a
        public final Gson invoke() {
            return new Gson();
        }
    }

    public a(yt2.c cVar, yt2.d dVar) {
        cVar.getClass();
        dVar.getClass();
        this.f13049a = cVar;
        this.f13050b = dVar;
        a0 a0Var = new a0("OMT#LocalCache");
        x53.c cVar2 = s0.f129406a;
        this.f13051c = c0.a(a0Var.plus(x53.b.f189152a.limitedParallelism(1)));
        this.f13052d = m.a(n.NONE, e.f13056a);
    }

    public static final File a(a aVar, String str, String str2) {
        k7.a aVar2;
        FileOutputStream fileOutputStream;
        String string;
        aVar.getClass();
        c cVar = f13046e;
        try {
            Context f199650a = aVar.f13050b.getF199650a();
            cVar.getClass();
            File dir = f199650a.getDir("OMT_ANALYTICS_DIR", 0);
            dir.mkdirs();
            if (u.y(str, "samd", true)) {
                string = "samd_" + UUID.randomUUID();
            } else {
                string = UUID.randomUUID().toString();
                string.getClass();
            }
            File file = new File(dir, string);
            k7.a aVar3 = new k7.a(file);
            try {
                FileOutputStream fileOutputStreamA = aVar3.a();
                try {
                    byte[] bytes = str2.getBytes(d53.c.f57666b);
                    bytes.getClass();
                    fileOutputStreamA.write(bytes);
                    try {
                        fileOutputStreamA.getFD().sync();
                    } catch (IOException unused) {
                    }
                    try {
                        fileOutputStreamA.close();
                    } catch (IOException unused2) {
                    }
                    File file2 = aVar3.f103260b;
                    File file3 = aVar3.f103259a;
                    if (file3.isDirectory() && !file3.delete()) {
                        file3.toString();
                    }
                    if (!file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    }
                    return file;
                } catch (Exception e4) {
                    aVar2 = aVar3;
                    e = e4;
                    fileOutputStream = fileOutputStreamA;
                    cVar.getClass();
                    c.c().error("saveSerializedEvent", (Throwable) e);
                    if (aVar2 == null) {
                        return null;
                    }
                    File file4 = aVar2.f103260b;
                    if (fileOutputStream == null) {
                        return null;
                    }
                    try {
                        fileOutputStream.getFD().sync();
                    } catch (IOException unused3) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                    }
                    if (file4.delete()) {
                        return null;
                    }
                    Objects.toString(file4);
                    return null;
                }
            } catch (Exception e14) {
                aVar2 = aVar3;
                e = e14;
                fileOutputStream = null;
            }
        } catch (Exception e15) {
            e = e15;
            aVar2 = null;
            fileOutputStream = null;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau2/a$c;", "", "<init>", "()V", "", "EVENT_PAYLOAD_LENGTH_LIMIT", "I", "EVENT_TYPE_MAX_CHARS", "", "LOCAL_CACHE_DIR", "Ljava/lang/String;", "", "STALE_FILE_AGE_IN_MILLIS", "J", "TAG", "", "inFlightFiles", "Ljava/util/Set;", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(j jVar) {
            this();
        }

        public static void a(List list) {
            ArrayList<File> arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0184a) it.next()).f13053a);
            }
            for (File file : arrayList) {
                LinkedHashSet linkedHashSet = a.f13048g;
                synchronized (linkedHashSet) {
                    linkedHashSet.remove(file.getAbsolutePath());
                }
                try {
                    if (!file.exists()) {
                        a.f13046e.getClass();
                        c().error("file [" + file.getAbsolutePath() + "] cannot be deleted because it doesn't exist");
                    } else if (!file.delete()) {
                        a.f13046e.getClass();
                        c().error("failed to delete [" + file.getAbsolutePath() + "]");
                    }
                } catch (Exception e4) {
                    a.f13046e.getClass();
                    c().error("failed to delete [" + file.getAbsolutePath() + "]", (Throwable) e4);
                }
            }
        }

        public static List b(int i14, Context context) {
            context.getClass();
            File[] fileArrListFiles = context.getDir("OMT_ANALYTICS_DIR", 0).listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return j0.f134944a;
            }
            p0 p0Var = new p0();
            ArrayList arrayList = new ArrayList();
            g.a aVar = new g.a(c53.c0.p(c53.c0.r(p13.u.v(fileArrListFiles), new au2.b(arrayList, i14, p0Var, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)), new au2.c(new Gson())));
            while (aVar.hasNext()) {
                C0184a c0184a = (C0184a) aVar.next();
                arrayList.add(c0184a);
                p0Var.f105807a += (int) c0184a.f13053a.length();
            }
            return arrayList;
        }

        public static Logger c() {
            return (Logger) a.f13047f.getValue();
        }

        public static void d(List list) {
            list.getClass();
            synchronized (a.f13048g) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        a.f13048g.remove(((C0184a) it.next()).f13053a.getAbsolutePath());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        private c() {
        }
    }
}
