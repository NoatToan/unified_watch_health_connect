package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eu {
    private ev a;
    private ev.a b;
    public Resources d;
    private boolean e = false;
    public boolean c = false;
    private final Object f = new Object();
    private c g = null;

    public class a extends dr<Boolean, Void, Bitmap> {
        private final WeakReference<dd.a> e;

        public a(dd.a aVar) {
            this.e = new WeakReference<>(aVar);
        }

        private dd.a d() {
            dd.a aVar = this.e.get();
            if (this == eu.c(aVar)) {
                return aVar;
            }
            return null;
        }

        @Override // com.amap.api.mapcore.util.dr
        public final /* synthetic */ void b(Bitmap bitmap) {
            super.b(bitmap);
            synchronized (eu.this.f) {
                try {
                    eu.this.f.notifyAll();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        @Override // com.amap.api.mapcore.util.dr
        public final /* synthetic */ void a(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            try {
                if (b() || eu.this.e) {
                    bitmap2 = null;
                }
                dd.a aVarD = d();
                if (bitmap2 == null || bitmap2.isRecycled() || aVarD == null) {
                    return;
                }
                aVarD.a(bitmap2);
                if (eu.this.g != null) {
                    eu.this.g.a();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.amap.api.mapcore.util.dr
        public Bitmap a(Boolean... boolArr) {
            try {
                boolean zBooleanValue = boolArr[0].booleanValue();
                dd.a aVar = this.e.get();
                if (aVar == null) {
                    return null;
                }
                String str = aVar.a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + aVar.b + Constants.ACCEPT_TIME_SEPARATOR_SERVER + aVar.c;
                synchronized (eu.this.f) {
                    while (eu.this.c && !b()) {
                        eu.this.f.wait();
                    }
                }
                Bitmap bitmapB = (eu.this.a == null || b() || d() == null || eu.this.e) ? null : eu.this.a.b(str);
                if (zBooleanValue && bitmapB == null && !b() && d() != null && !eu.this.e) {
                    synchronized (eu.class) {
                        bitmapB = eu.this.a((Object) aVar);
                    }
                }
                if (bitmapB != null && eu.this.a != null) {
                    eu.this.a.a(str, bitmapB);
                }
                return bitmapB;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    public class b extends dr<Object, Void, Void> {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.amap.api.mapcore.util.dr
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void a(Object... objArr) {
            try {
                int iIntValue = ((Integer) objArr[0]).intValue();
                if (iIntValue == 0) {
                    eu.this.c();
                } else if (iIntValue == 1) {
                    eu.this.b();
                } else if (iIntValue == 2) {
                    eu.this.d();
                } else if (iIntValue == 3) {
                    eu.this.b(((Boolean) objArr[1]).booleanValue());
                } else if (iIntValue == 4) {
                    eu.this.e();
                }
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    public interface c {
        void a();
    }

    public eu(Context context) {
        this.d = context.getResources();
    }

    public abstract Bitmap a(Object obj);

    public final void e() {
        ev evVar = this.a;
        if (evVar != null) {
            evVar.a(false);
            this.a.a();
        }
    }

    public final void f() {
        new b().b(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a c(dd.a aVar) {
        if (aVar != null) {
            return aVar.j;
        }
        return null;
    }

    public final void a(boolean z, dd.a aVar) {
        if (aVar == null) {
            return;
        }
        Bitmap bitmapA = null;
        try {
            if (this.a != null) {
                bitmapA = this.a.a(aVar.a + Constants.ACCEPT_TIME_SEPARATOR_SERVER + aVar.b + Constants.ACCEPT_TIME_SEPARATOR_SERVER + aVar.c);
            }
            if (bitmapA != null) {
                aVar.a(bitmapA);
                return;
            }
            a aVar2 = new a(aVar);
            aVar.j = aVar2;
            aVar2.a(dr.c, Boolean.valueOf(z));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void d() {
        ev evVar = this.a;
        if (evVar != null) {
            evVar.c();
        }
    }

    public final void b() {
        ev evVar = this.a;
        if (evVar != null) {
            evVar.a();
        }
    }

    public final void c() {
        ev evVar = this.a;
        if (evVar != null) {
            evVar.b();
        }
    }

    public final void b(boolean z) {
        ev evVar = this.a;
        if (evVar != null) {
            evVar.a(z);
            this.a = null;
        }
    }

    public final void c(boolean z) {
        new b().b(3, Boolean.valueOf(z));
    }

    public final void a(ev.a aVar) {
        this.b = aVar;
        this.a = ev.a(aVar);
        new b().b(1);
    }

    public final void a() {
        this.e = false;
        a(false);
    }

    public static void a(dd.a aVar) {
        a aVarC = c(aVar);
        if (aVarC != null) {
            aVarC.c();
        }
    }

    public final void a(boolean z) {
        synchronized (this.f) {
            this.c = z;
            if (!z) {
                try {
                    this.f.notifyAll();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public final void a(c cVar) {
        this.g = cVar;
    }

    public final void a(String str) {
        ev.a aVar = this.b;
        aVar.c = ev.a(t.a, aVar.j, str);
        new b().b(4);
    }
}
