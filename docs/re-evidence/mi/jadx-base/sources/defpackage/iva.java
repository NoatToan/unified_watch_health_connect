package defpackage;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class iva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ova> f22125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22126b;
    public int c;
    public int d;
    public Executor e;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GLES20.glDeleteFramebuffers(1, new int[]{iva.this.f22126b}, 0);
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22129b;
        public int c;

        public b() {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            GLES20.glGetIntegerv(36007, iArr2, 0);
            GLES20.glGetIntegerv(32873, iArr3, 0);
            this.f22128a = iArr[0];
            this.f22129b = iArr2[0];
            this.c = iArr3[0];
        }

        public final void b() {
            GLES20.glBindFramebuffer(36160, this.f22128a);
            GLES20.glBindRenderbuffer(36161, this.f22129b);
            GLES20.glBindTexture(3553, this.c);
        }
    }

    public iva(Executor executor) {
        ArrayList arrayList = new ArrayList();
        this.f22125a = arrayList;
        this.c = 0;
        this.d = 0;
        this.e = executor;
        b bVar = new b();
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i = iArr[0];
        this.f22126b = i;
        GLES20.glBindFramebuffer(36160, i);
        arrayList.add(d(this.c, this.d, 36064));
        bVar.b();
    }

    public void b() {
        GLES20.glBindFramebuffer(36160, this.f22126b);
        GLES20.glViewport(0, 0, this.c, this.d);
    }

    public void c() {
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            switch (iGlCheckFramebufferStatus) {
                case 36054:
                    throw new RuntimeException("Framebuffer incomplete attachment");
                case 36055:
                    throw new RuntimeException("Framebuffer incomplete missing attachment");
                case 36057:
                    throw new RuntimeException("Framebuffer incomplete dimensions");
                case 36061:
                    throw new RuntimeException("Framebuffer unsupported");
                default:
                    throw new RuntimeException("Failed to create framebuffer: " + iGlCheckFramebufferStatus);
            }
        }
    }

    public final ova d(int i, int i2, int i3) {
        ova ovaVar = new ova(this.e);
        ovaVar.c();
        ovaVar.h(i, i2);
        GLES20.glFramebufferTexture2D(36160, i3, 3553, ovaVar.d(), 0);
        return ovaVar;
    }

    public void e(int i, int i2) {
        int i3;
        if (i == this.c && i2 == this.d) {
            return;
        }
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(34024, iArr, 0);
        if (i < 0 || i > (i3 = iArr[0]) || i2 < 0 || i2 > i3) {
            throw new IllegalArgumentException("Can't resize framebuffer. Invalid dimensions");
        }
        this.c = i;
        this.d = i2;
        b bVar = new b();
        Iterator<ova> it = this.f22125a.iterator();
        while (it.hasNext()) {
            it.next().h(i, i2);
        }
        GLES20.glBindFramebuffer(36160, this.f22126b);
        c();
        bVar.b();
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.e.execute(new a());
    }
}
