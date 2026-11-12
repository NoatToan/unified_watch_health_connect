package com.xmlywind.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.xmlywind.volley.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class k {
    private final com.xmlywind.volley.m a;
    private final b b;
    private final HashMap<String, a> c = new HashMap<>();
    private final HashMap<String, a> d = new HashMap<>();
    private final Handler e = new Handler(Looper.getMainLooper());
    private int f = 100;
    private Runnable g;

    public static class a {
        private final com.xmlywind.volley.l<?> a;
        private final List<c> b;
        private Bitmap c;
        private s d;

        public a(com.xmlywind.volley.l<?> lVar, c cVar) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            this.a = lVar;
            arrayList.add(cVar);
        }

        public s a() {
            return this.d;
        }

        public void a(s sVar) {
            this.d = sVar;
        }

        public void a(c cVar) {
            this.b.add(cVar);
        }

        public boolean b(c cVar) {
            this.b.remove(cVar);
            if (this.b.size() != 0) {
                return false;
            }
            this.a.j();
            return true;
        }
    }

    public interface b {
        Bitmap a(String str);

        void a(String str, Bitmap bitmap);
    }

    public class c {
        private final d b;
        private final String c;
        private final String d;
        private Bitmap e;

        public c(Bitmap bitmap, String str, String str2, d dVar) {
            this.e = bitmap;
            this.d = str;
            this.c = str2;
            this.b = dVar;
        }

        public void a() {
            HashMap map;
            o.a();
            if (this.b == null) {
                return;
            }
            a aVar = (a) k.this.c.get(this.c);
            if (aVar == null) {
                a aVar2 = (a) k.this.d.get(this.c);
                if (aVar2 == null) {
                    return;
                }
                aVar2.b(this);
                if (aVar2.b.size() != 0) {
                    return;
                } else {
                    map = k.this.d;
                }
            } else if (!aVar.b(this)) {
                return;
            } else {
                map = k.this.c;
            }
            map.remove(this.c);
        }

        public Bitmap b() {
            return this.e;
        }

        public String c() {
            return this.d;
        }
    }

    public interface d extends com.xmlywind.volley.n.a {
        void a(c cVar, boolean z);
    }

    public k(com.xmlywind.volley.m mVar, b bVar) {
        this.a = mVar;
        this.b = bVar;
    }

    private static String a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i);
        sb.append("#H");
        sb.append(i2);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }

    private void a(String str, a aVar) {
        this.d.put(str, aVar);
        if (this.g == null) {
            Runnable runnable = new Runnable() { // from class: com.xmlywind.volley.toolbox.k.3
                @Override // java.lang.Runnable
                public void run() {
                    for (a aVar2 : k.this.d.values()) {
                        for (c cVar : aVar2.b) {
                            if (cVar.b != null) {
                                if (aVar2.a() == null) {
                                    cVar.e = aVar2.c;
                                    cVar.b.a(cVar, false);
                                } else {
                                    cVar.b.onErrorResponse(aVar2.a());
                                }
                            }
                        }
                    }
                    k.this.d.clear();
                    k.this.g = null;
                }
            };
            this.g = runnable;
            this.e.postDelayed(runnable, this.f);
        }
    }

    public com.xmlywind.volley.l<Bitmap> a(String str, int i, int i2, ImageView.ScaleType scaleType, final String str2) {
        return new l(str, new com.xmlywind.volley.n.b<Bitmap>() { // from class: com.xmlywind.volley.toolbox.k.1
            @Override // com.xmlywind.volley.n.b
            public void a(Bitmap bitmap) {
                k.this.a(str2, bitmap);
            }
        }, i, i2, scaleType, Bitmap.Config.RGB_565, new com.xmlywind.volley.n.a() { // from class: com.xmlywind.volley.toolbox.k.2
            @Override // com.xmlywind.volley.n.a
            public void onErrorResponse(s sVar) {
                k.this.a(str2, sVar);
            }
        });
    }

    public c a(String str, d dVar) {
        return a(str, dVar, 0, 0);
    }

    public c a(String str, d dVar, int i, int i2) {
        return a(str, dVar, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    public c a(String str, d dVar, int i, int i2, ImageView.ScaleType scaleType) {
        o.a();
        String strA = a(str, i, i2, scaleType);
        Bitmap bitmapA = this.b.a(strA);
        if (bitmapA != null) {
            c cVar = new c(bitmapA, str, null, null);
            dVar.a(cVar, true);
            return cVar;
        }
        c cVar2 = new c(null, str, strA, dVar);
        dVar.a(cVar2, true);
        a aVar = this.c.get(strA);
        if (aVar != null) {
            aVar.a(cVar2);
        } else {
            com.xmlywind.volley.l<Bitmap> lVarA = a(str, i, i2, scaleType, strA);
            com.xmlywind.volley.m mVar = this.a;
            if (mVar != null) {
                mVar.a(lVarA);
                this.c.put(strA, new a(lVarA, cVar2));
            }
        }
        return cVar2;
    }

    public void a(String str, Bitmap bitmap) {
        this.b.a(str, bitmap);
        a aVarRemove = this.c.remove(str);
        if (aVarRemove != null) {
            aVarRemove.c = bitmap;
            a(str, aVarRemove);
        }
    }

    public void a(String str, s sVar) {
        a aVarRemove = this.c.remove(str);
        if (aVarRemove != null) {
            aVarRemove.a(sVar);
            a(str, aVarRemove);
        }
    }
}
