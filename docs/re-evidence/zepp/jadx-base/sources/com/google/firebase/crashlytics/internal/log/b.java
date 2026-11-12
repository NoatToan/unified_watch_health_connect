package com.google.firebase.crashlytics.internal.log;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
class b implements com.google.firebase.crashlytics.internal.log.a {
    private static final Charset d = Charset.forName("UTF-8");
    private final File a;
    private final int b;
    private QueueFile c;

    public class a implements QueueFile.ElementReader {
        public final /* synthetic */ byte[] a;
        public final /* synthetic */ int[] b;

        public a(byte[] bArr, int[] iArr) {
            this.a = bArr;
            this.b = iArr;
        }

        @Override // com.google.firebase.crashlytics.internal.log.QueueFile.ElementReader
        public void read(InputStream inputStream, int i) throws IOException {
            try {
                inputStream.read(this.a, this.b[0], i);
                int[] iArr = this.b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.log.b$b, reason: collision with other inner class name */
    public static class C0248b {
        public final byte[] a;
        public final int b;

        public C0248b(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    public b(File file, int i) {
        this.a = file;
        this.b = i;
    }

    private void f(long j, String str) {
        if (this.c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i = this.b / 4;
            if (str.length() > i) {
                str = "..." + str.substring(str.length() - i);
            }
            this.c.e(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll(StringUtils.CR, " ").replaceAll("\n", " ")).getBytes(d));
            while (!this.c.l() && this.c.z() > this.b) {
                this.c.u();
            }
        } catch (IOException e) {
            Logger.getLogger().e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    private C0248b g() {
        if (!this.a.exists()) {
            return null;
        }
        h();
        QueueFile queueFile = this.c;
        if (queueFile == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[queueFile.z()];
        try {
            this.c.i(new a(bArr, iArr));
        } catch (IOException e) {
            Logger.getLogger().e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C0248b(bArr, iArr[0]);
    }

    private void h() {
        if (this.c == null) {
            try {
                this.c = new QueueFile(this.a);
            } catch (IOException e) {
                Logger.getLogger().e("Could not open log file: " + this.a, e);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.log.a
    public byte[] a() {
        C0248b c0248bG = g();
        if (c0248bG == null) {
            return null;
        }
        int i = c0248bG.b;
        byte[] bArr = new byte[i];
        System.arraycopy(c0248bG.a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.log.a
    public void b() {
        d();
        this.a.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.log.a
    public void c(long j, String str) {
        h();
        f(j, str);
    }

    @Override // com.google.firebase.crashlytics.internal.log.a
    public void d() {
        CommonUtils.closeOrLog(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override // com.google.firebase.crashlytics.internal.log.a
    public String e() {
        byte[] bArrA = a();
        if (bArrA != null) {
            return new String(bArrA, d);
        }
        return null;
    }
}
