package defpackage;

import android.content.Context;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes4.dex */
public class fl8 extends bbq {
    public final File i;
    public final String j;

    public static final class b extends bbq.b implements Comparable {
        public final ZipEntry c;
        public final int d;

        public b(String str, ZipEntry zipEntry, int i) {
            super(str, a(zipEntry));
            this.c = zipEntry;
            this.d = i;
        }

        public static String a(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f4032a.compareTo(((b) obj).f4032a);
        }
    }

    public class c extends bbq.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b[] f17886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZipFile f17887b;
        public final bbq c;

        public final class a extends bbq.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f17888a;

            public a() {
            }

            @Override // bbq.e
            public boolean a() {
                c.this.l();
                return this.f17888a < c.this.f17886a.length;
            }

            @Override // bbq.e
            public bbq.d b() throws IOException {
                c.this.l();
                b[] bVarArr = c.this.f17886a;
                int i = this.f17888a;
                this.f17888a = i + 1;
                b bVar = bVarArr[i];
                InputStream inputStream = c.this.f17887b.getInputStream(bVar.c);
                try {
                    return new bbq.f(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        public c(bbq bbqVar) throws IOException {
            this.f17887b = new ZipFile(fl8.this.i);
            this.c = bbqVar;
        }

        @Override // bbq.g
        public final bbq.c a() throws IOException {
            return new bbq.c(l());
        }

        @Override // bbq.g
        public final bbq.e b() throws IOException {
            return new a();
        }

        @Override // bbq.g, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f17887b.close();
        }

        public final b[] l() {
            if (this.f17886a == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap map = new HashMap();
                Pattern patternCompile = Pattern.compile(fl8.this.j);
                String[] strArrJ = SysUtil.j();
                Enumeration<? extends ZipEntry> enumerationEntries = this.f17887b.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        int iE = SysUtil.e(strArrJ, strGroup);
                        if (iE >= 0) {
                            linkedHashSet.add(strGroup);
                            b bVar = (b) map.get(strGroup2);
                            if (bVar == null || iE < bVar.d) {
                                map.put(strGroup2, new b(strGroup2, zipEntryNextElement, iE));
                            }
                        }
                    }
                }
                this.c.x((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                b[] bVarArr = (b[]) map.values().toArray(new b[map.size()]);
                Arrays.sort(bVarArr);
                int i = 0;
                for (int i2 = 0; i2 < bVarArr.length; i2++) {
                    b bVar2 = bVarArr[i2];
                    if (m(bVar2.c, bVar2.f4032a)) {
                        i++;
                    } else {
                        bVarArr[i2] = null;
                    }
                }
                b[] bVarArr2 = new b[i];
                int i3 = 0;
                for (b bVar3 : bVarArr) {
                    if (bVar3 != null) {
                        bVarArr2[i3] = bVar3;
                        i3++;
                    }
                }
                this.f17886a = bVarArr2;
            }
            return this.f17886a;
        }

        public boolean m(ZipEntry zipEntry, String str) {
            throw null;
        }
    }

    public fl8(Context context, String str, File file, String str2) {
        super(context, str);
        this.i = file;
        this.j = str2;
    }
}
