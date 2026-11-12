package zp0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.j;
import com.bumptech.glide.k;
import d53.w;
import g8.i;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import o53.b0;
import o53.m1;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.d0;
import t13.g;
import u53.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000e¨\u0006\u0010"}, d2 = {"Lzp0/c;", "Lo53/b0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;)V", "Landroidx/fragment/app/m;", "fragmentActivity", "(Landroidx/fragment/app/m;)V", "Landroidx/fragment/app/Fragment;", "supportFragment", "(Landroidx/fragment/app/Fragment;)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements b0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f206560v = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f206561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f206562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f206563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fragment f206564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f206565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f206566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f206567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f206568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public File f206569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f206570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f206571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f206572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f206573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f206574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f206575o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f206576p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f206577q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f206578r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m1 f206579t;

    public c(Context context) {
        context.getClass();
        this.f206579t = i.c();
        this.f206561a = context;
    }

    public final void a(String... strArr) {
        ArrayList arrayList = new ArrayList();
        this.f206572l = arrayList;
        d0.w(arrayList, strArr);
    }

    public final aq0.a b() {
        return new aq0.a(this.f206561a, this.f206562b, this.f206563c, this.f206564d, this.f206565e, this.f206566f, this.f206567g, null, this.f206568h, this.f206569i, this.f206570j, null, this.f206571k, null, this.f206572l, this.f206573m, this.f206574n, this.f206575o, this.f206576p, this.f206577q, this.f206578r);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[PHI: r2
      0x0049: PHI (r2v7 java.lang.Object) = 
      (r2v43 java.lang.Object)
      (r2v44 java.lang.Object)
      (r2v45 java.lang.Object)
      (r2v46 java.lang.Object)
      (r2v47 java.lang.Object)
      (r2v48 java.lang.Object)
     binds: [B:36:0x0096, B:33:0x0070, B:29:0x0065, B:25:0x005a, B:21:0x004f, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8 A[PHI: r2
      0x00d8: PHI (r2v16 mj.f) = (r2v36 mj.f), (r2v37 mj.f), (r2v38 mj.f) binds: [B:70:0x00f7, B:68:0x00ef, B:62:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final Bitmap c() throws Throwable {
        Uri uri;
        File file;
        byte[] bArr;
        j<Bitmap> jVarJ;
        Object obj;
        mj.f fVar;
        mj.f fVar2;
        mj.f fVar3;
        mj.f fVarL;
        mj.f fVar4;
        j<Bitmap> jVarG;
        aq0.a aVarB = b();
        Logger logger = aq0.a.f12319v;
        k kVarB = aVarB.b();
        String str = aVarB.f12325f;
        ?? r14 = 0;
        Bitmap bitmap = null;
        j<Bitmap> jVarZ = (kVarB == null || (jVarG = kVarB.g()) == null) ? null : jVarG.a(aVarB.a());
        if (str != null && (!w.J(str)) && jVarZ != null) {
            jVarZ.C(kVarB.g().a(aVarB.a()).J(str));
        }
        String str2 = aVarB.f12324e;
        Object obj2 = str2;
        if (str2 == null) {
            uri = aVarB.f12328i;
            if (uri == null) {
                file = aVarB.f12329j;
                if (file == null) {
                    bArr = aVarB.f12327h;
                    if (bArr == null) {
                        int i14 = aVarB.f12326g;
                        if (i14 == 0) {
                            logger.error("Image source not set or null !!!");
                            if (jVarZ != null) {
                                obj2 = uri;
                                obj2 = file;
                                obj2 = bArr;
                                obj2 = bArr;
                                obj2 = bArr;
                                jVarJ = jVarZ.J("");
                                obj = bArr;
                            } else {
                                obj2 = uri;
                                obj2 = file;
                                obj2 = bArr;
                                obj2 = bArr;
                                obj2 = bArr;
                                jVarJ = null;
                                obj = obj2;
                            }
                        } else if (jVarZ != null) {
                            j<Bitmap> jVarJ2 = jVarZ.J(Integer.valueOf(i14));
                            Context context = jVarZ.f28503y;
                            j jVarT = jVarJ2.t(context.getTheme());
                            pj.a aVarC = pj.a.c(context);
                            jVarJ = (j) jVarT.q(aVarC);
                            obj = aVarC;
                        } else {
                            obj2 = uri;
                            obj2 = file;
                            obj2 = bArr;
                            obj2 = bArr;
                            obj2 = bArr;
                            jVarJ = null;
                            obj = obj2;
                        }
                    } else if (jVarZ != null) {
                        jVarJ = jVarZ.I(bArr);
                        obj = bArr;
                    } else {
                        obj2 = uri;
                        obj2 = file;
                        obj2 = bArr;
                        obj2 = bArr;
                        obj2 = bArr;
                        jVarJ = null;
                        obj = obj2;
                    }
                } else if (jVarZ != null) {
                    jVarJ = jVarZ.J(file);
                    obj = file;
                } else {
                    obj2 = uri;
                    obj2 = file;
                    obj2 = bArr;
                    obj2 = bArr;
                    obj2 = bArr;
                    jVarJ = null;
                    obj = obj2;
                }
            } else if (jVarZ != null) {
                jVarJ = jVarZ.H(uri);
                obj = uri;
            } else {
                obj2 = uri;
                obj2 = file;
                obj2 = bArr;
                obj2 = bArr;
                obj2 = bArr;
                jVarJ = null;
                obj = obj2;
            }
        } else if (jVarZ != null) {
            jVarJ = jVarZ.J(str2);
            obj = str2;
        } else {
            obj2 = uri;
            obj2 = file;
            obj2 = bArr;
            obj2 = bArr;
            obj2 = bArr;
            jVarJ = null;
            obj = obj2;
        }
        try {
            if (jVarJ != null) {
                try {
                    fVarL = jVarJ.L();
                } catch (IOException e4) {
                    e = e4;
                    fVar3 = null;
                    logger.error(e.toString());
                    fVar4 = fVar3;
                    obj = fVar3;
                    if (fVar3 != null) {
                        fVar4.cancel(true);
                        obj = fVar4;
                    }
                    return null;
                } catch (InterruptedException e14) {
                    e = e14;
                    fVar2 = null;
                    logger.error(e.toString());
                    Thread.currentThread().interrupt();
                    obj = fVar2;
                    if (fVar2 != null) {
                        fVar4 = fVar2;
                        fVar4.cancel(true);
                        obj = fVar4;
                    }
                    return null;
                } catch (ExecutionException e15) {
                    e = e15;
                    fVar = null;
                    logger.error(e.toString());
                    fVar4 = fVar;
                    obj = fVar;
                    if (fVar != null) {
                        fVar4.cancel(true);
                        obj = fVar4;
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    if (r14 != 0) {
                        r14.cancel(true);
                    }
                    throw th;
                }
            } else {
                fVarL = null;
            }
            if (fVarL != null) {
                try {
                    bitmap = (Bitmap) fVarL.get();
                } catch (IOException e16) {
                    fVar3 = fVarL;
                    e = e16;
                    logger.error(e.toString());
                    fVar4 = fVar3;
                    obj = fVar3;
                    if (fVar3 != null) {
                        fVar4.cancel(true);
                        obj = fVar4;
                    }
                    return null;
                } catch (InterruptedException e17) {
                    fVar2 = fVarL;
                    e = e17;
                    logger.error(e.toString());
                    Thread.currentThread().interrupt();
                    obj = fVar2;
                    if (fVar2 != null) {
                        fVar4 = fVar2;
                        fVar4.cancel(true);
                        obj = fVar4;
                    }
                    return null;
                } catch (ExecutionException e18) {
                    fVar = fVarL;
                    e = e18;
                    logger.error(e.toString());
                    fVar4 = fVar;
                    obj = fVar;
                    if (fVar != null) {
                        fVar4.cancel(true);
                        obj = fVar4;
                    }
                    return null;
                } catch (Throwable th4) {
                    r14 = fVarL;
                    th = th4;
                    if (r14 != 0) {
                        r14.cancel(true);
                    }
                    throw th;
                }
            }
            if (fVarL != null) {
                fVarL.cancel(true);
            }
            return bitmap;
        } catch (Throwable th5) {
            th = th5;
            r14 = obj;
        }
    }

    public final m1 d(zp0.a aVar) {
        ge1.b.T(this, null, null, new d(aVar, this, null), 3);
        return this.f206579t;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[PHI: r2
      0x0045: PHI (r2v7 java.lang.Object) = 
      (r2v42 java.lang.Object)
      (r2v43 java.lang.Object)
      (r2v44 java.lang.Object)
      (r2v45 java.lang.Object)
      (r2v46 java.lang.Object)
      (r2v47 java.lang.Object)
     binds: [B:34:0x0092, B:31:0x006c, B:27:0x0061, B:23:0x0056, B:19:0x004b, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d4 A[PHI: r2
      0x00d4: PHI (r2v16 mj.f) = (r2v35 mj.f), (r2v36 mj.f), (r2v37 mj.f) binds: [B:68:0x00f3, B:66:0x00eb, B:60:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final byte[] e() throws Throwable {
        Uri uri;
        File file;
        byte[] bArr;
        j jVarJ;
        Object obj;
        mj.f fVar;
        mj.f fVar2;
        mj.f fVar3;
        mj.f fVarL;
        mj.f fVar4;
        aq0.a aVarB = b();
        Logger logger = aq0.a.f12319v;
        k kVarB = aVarB.b();
        ?? r14 = 0;
        byte[] bArr2 = null;
        j jVarZ = kVarB != null ? kVarB.d(byte[].class).a(aVarB.a()) : null;
        String str = aVarB.f12325f;
        if (str != null && (!w.J(str)) && jVarZ != null) {
            jVarZ.C(kVarB.d(byte[].class).a(aVarB.a()));
        }
        String str2 = aVarB.f12324e;
        Object obj2 = str2;
        if (str2 == null) {
            uri = aVarB.f12328i;
            if (uri == null) {
                file = aVarB.f12329j;
                if (file == null) {
                    bArr = aVarB.f12327h;
                    if (bArr == null) {
                        int i14 = aVarB.f12326g;
                        if (i14 == 0) {
                            logger.error("Image source not set or null !!!");
                            if (jVarZ != null) {
                                obj2 = uri;
                                obj2 = file;
                                obj2 = bArr;
                                obj2 = bArr;
                                obj2 = bArr;
                                jVarJ = jVarZ.J("");
                                obj = bArr;
                            } else {
                                obj2 = uri;
                                obj2 = file;
                                obj2 = bArr;
                                obj2 = bArr;
                                obj2 = bArr;
                                jVarJ = null;
                                obj = obj2;
                            }
                        } else if (jVarZ != null) {
                            j jVarJ2 = jVarZ.J(Integer.valueOf(i14));
                            Context context = jVarZ.f28503y;
                            j jVarT = jVarJ2.t(context.getTheme());
                            pj.a aVarC = pj.a.c(context);
                            jVarJ = (j) jVarT.q(aVarC);
                            obj = aVarC;
                        } else {
                            obj2 = uri;
                            obj2 = file;
                            obj2 = bArr;
                            obj2 = bArr;
                            obj2 = bArr;
                            jVarJ = null;
                            obj = obj2;
                        }
                    } else if (jVarZ != null) {
                        jVarJ = jVarZ.I(bArr);
                        obj = bArr;
                    } else {
                        obj2 = uri;
                        obj2 = file;
                        obj2 = bArr;
                        obj2 = bArr;
                        obj2 = bArr;
                        jVarJ = null;
                        obj = obj2;
                    }
                } else if (jVarZ != null) {
                    jVarJ = jVarZ.J(file);
                    obj = file;
                } else {
                    obj2 = uri;
                    obj2 = file;
                    obj2 = bArr;
                    obj2 = bArr;
                    obj2 = bArr;
                    jVarJ = null;
                    obj = obj2;
                }
            } else if (jVarZ != null) {
                jVarJ = jVarZ.H(uri);
                obj = uri;
            } else {
                obj2 = uri;
                obj2 = file;
                obj2 = bArr;
                obj2 = bArr;
                obj2 = bArr;
                jVarJ = null;
                obj = obj2;
            }
        } else if (jVarZ != null) {
            jVarJ = jVarZ.J(str2);
            obj = str2;
        } else {
            obj2 = uri;
            obj2 = file;
            obj2 = bArr;
            obj2 = bArr;
            obj2 = bArr;
            jVarJ = null;
            obj = obj2;
        }
        try {
            if (jVarJ != null) {
                try {
                    fVarL = jVarJ.L();
                } catch (IOException e4) {
                    e = e4;
                    fVar3 = null;
                    logger.error(e.toString());
                    fVar4 = fVar3;
                    obj = fVar3;
                    if (fVar3 != null) {
                        fVar4.cancel(true);
                        obj = fVar4;
                    }
                    return null;
                } catch (InterruptedException e14) {
                    e = e14;
                    fVar2 = null;
                    logger.error(e.toString());
                    Thread.currentThread().interrupt();
                    obj = fVar2;
                    if (fVar2 != null) {
                        fVar4 = fVar2;
                        fVar4.cancel(true);
                        obj = fVar4;
                    }
                    return null;
                } catch (ExecutionException e15) {
                    e = e15;
                    fVar = null;
                    logger.error(e.toString());
                    fVar4 = fVar;
                    obj = fVar;
                    if (fVar != null) {
                        fVar4.cancel(true);
                        obj = fVar4;
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    if (r14 != 0) {
                        r14.cancel(true);
                    }
                    throw th;
                }
            } else {
                fVarL = null;
            }
            if (fVarL != null) {
                try {
                    bArr2 = (byte[]) fVarL.get();
                } catch (IOException e16) {
                    fVar3 = fVarL;
                    e = e16;
                    logger.error(e.toString());
                    fVar4 = fVar3;
                    obj = fVar3;
                    if (fVar3 != null) {
                        fVar4.cancel(true);
                        obj = fVar4;
                    }
                    return null;
                } catch (InterruptedException e17) {
                    fVar2 = fVarL;
                    e = e17;
                    logger.error(e.toString());
                    Thread.currentThread().interrupt();
                    obj = fVar2;
                    if (fVar2 != null) {
                        fVar4 = fVar2;
                        fVar4.cancel(true);
                        obj = fVar4;
                    }
                    return null;
                } catch (ExecutionException e18) {
                    fVar = fVarL;
                    e = e18;
                    logger.error(e.toString());
                    fVar4 = fVar;
                    obj = fVar;
                    if (fVar != null) {
                        fVar4.cancel(true);
                        obj = fVar4;
                    }
                    return null;
                } catch (Throwable th4) {
                    r14 = fVarL;
                    th = th4;
                    if (r14 != 0) {
                        r14.cancel(true);
                    }
                    throw th;
                }
            }
            if (fVarL != null) {
                fVarL.cancel(true);
            }
            return bArr2;
        } catch (Throwable th5) {
            th = th5;
            r14 = obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004a A[PHI: r4
      0x004a: PHI (r4v7 mj.f) = (r4v4 mj.f), (r4v5 mj.f), (r4v8 mj.f) binds: [B:35:0x0069, B:33:0x0061, B:27:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    public final Drawable f() throws Throwable {
        mj.f fVar;
        mj.f fVarL;
        aq0.a aVarB = b();
        Logger logger = aq0.a.f12319v;
        j<Drawable> jVarC = aVarB.c(aVarB.b());
        mj.f fVar2 = null;
        Drawable drawable = null;
        try {
            if (jVarC != null) {
                try {
                    fVarL = jVarC.L();
                } catch (IOException e4) {
                    e = e4;
                    fVar = null;
                    logger.error(e.toString());
                    if (fVar != null) {
                        fVar.cancel(true);
                    }
                    return null;
                } catch (InterruptedException e14) {
                    e = e14;
                    fVar = null;
                    logger.error(e.toString());
                    Thread.currentThread().interrupt();
                    if (fVar != null) {
                        fVar.cancel(true);
                    }
                    return null;
                } catch (ExecutionException e15) {
                    e = e15;
                    fVar = null;
                    logger.error(e.toString());
                    if (fVar != null) {
                        fVar.cancel(true);
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    if (fVar2 != null) {
                        fVar2.cancel(true);
                    }
                    throw th;
                }
            } else {
                fVarL = null;
            }
            if (fVarL != null) {
                try {
                    drawable = (Drawable) fVarL.get();
                } catch (IOException e16) {
                    fVar = fVarL;
                    e = e16;
                    logger.error(e.toString());
                    if (fVar != null) {
                        fVar.cancel(true);
                    }
                    return null;
                } catch (InterruptedException e17) {
                    fVar = fVarL;
                    e = e17;
                    logger.error(e.toString());
                    Thread.currentThread().interrupt();
                    if (fVar != null) {
                        fVar.cancel(true);
                    }
                    return null;
                } catch (ExecutionException e18) {
                    fVar = fVarL;
                    e = e18;
                    logger.error(e.toString());
                    if (fVar != null) {
                        fVar.cancel(true);
                    }
                    return null;
                } catch (Throwable th4) {
                    fVar2 = fVarL;
                    th = th4;
                    if (fVar2 != null) {
                        fVar2.cancel(true);
                    }
                    throw th;
                }
            }
            if (fVarL != null) {
                fVarL.cancel(true);
            }
            return drawable;
        } catch (Throwable th5) {
            th = th5;
            fVar2 = fVar;
        }
    }

    public final void g(ImageView imageView) {
        j jVarZ;
        imageView.getClass();
        Activity activity = this.f206562b;
        if (activity == null || !activity.isFinishing()) {
            aq0.a aVarB = b();
            k kVarB = aVarB.b();
            String str = aVarB.f12325f;
            j jVarJ = null;
            j jVarZ2 = (kVarB == null || (jVarZ = kVarB.d(hj.c.class).a(k.f28508l)) == null) ? null : jVarZ.a(aVarB.a());
            if (str != null && (!w.J(str)) && jVarZ2 != null) {
                jVarZ2.C(kVarB.d(hj.c.class).a(k.f28508l).a(aVarB.a()).J(str));
            }
            String str2 = aVarB.f12324e;
            if (str2 == null) {
                Uri uri = aVarB.f12328i;
                if (uri == null) {
                    File file = aVarB.f12329j;
                    if (file == null) {
                        byte[] bArr = aVarB.f12327h;
                        if (bArr == null) {
                            int i14 = aVarB.f12326g;
                            if (i14 == 0) {
                                aq0.a.f12319v.error("Image source not set or null !!!");
                                if (jVarZ2 != null) {
                                    jVarJ = jVarZ2.J("");
                                }
                            } else if (jVarZ2 != null) {
                                j jVarJ2 = jVarZ2.J(Integer.valueOf(i14));
                                Context context = jVarZ2.f28503y;
                                jVarJ = (j) jVarJ2.t(context.getTheme()).q(pj.a.c(context));
                            }
                        } else if (jVarZ2 != null) {
                            jVarJ = jVarZ2.I(bArr);
                        }
                    } else if (jVarZ2 != null) {
                        jVarJ = jVarZ2.J(file);
                    }
                } else if (jVarZ2 != null) {
                    jVarJ = jVarZ2.H(uri);
                }
            } else if (jVarZ2 != null) {
                jVarJ = jVarZ2.J(str2);
            }
            if (aVarB.f12337r != null && jVarJ != null) {
                jVarJ.G(new aq0.b(aVarB));
            }
            if (jVarJ != null) {
                jVarJ.E(imageView);
            }
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final g getF183565a() {
        x53.c cVar = s0.f129406a;
        return o.f168762a.plus(this.f206579t);
    }

    public final void h(ImageView imageView) {
        imageView.getClass();
        Activity activity = this.f206562b;
        if (activity == null || !activity.isFinishing()) {
            aq0.a aVarB = b();
            j<Drawable> jVarC = aVarB.c(aVarB.b());
            if (aVarB.f12337r != null && jVarC != null) {
                jVarC.G(new aq0.c(aVarB));
            }
            if (jVarC != null) {
                jVarC.E(imageView);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lzp0/c$a;", "", "<init>", "()V", "", "CIRCLE", "Ljava/lang/String;", "TODAY", "THIS_WEEK", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(Context context) {
            context.getClass();
            return new c(context);
        }

        private a() {
        }
    }

    public c(Activity activity) {
        activity.getClass();
        this.f206579t = i.c();
        this.f206562b = activity;
    }

    public c(m mVar) {
        mVar.getClass();
        this.f206579t = i.c();
        this.f206563c = mVar;
    }

    public c(Fragment fragment) {
        fragment.getClass();
        this.f206579t = i.c();
        this.f206564d = fragment;
    }
}
