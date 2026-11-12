package com.autonavi.aps.amapapi.restruct;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.iq;
import com.amap.api.col.p0003sl.np;
import com.amap.api.col.p0003sl.ns;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f3959b;
    private Handler d;
    private String e;
    private boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedList<f> f3958a = new LinkedList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3960c = false;
    private Runnable g = new Runnable() { // from class: com.autonavi.aps.amapapi.restruct.g.1
        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.f3960c) {
                return;
            }
            if (g.this.f) {
                g.this.b();
                g.d(g.this);
            }
            if (g.this.d != null) {
                g.this.d.postDelayed(g.this.g, 60000L);
            }
        }
    };

    static /* synthetic */ boolean d(g gVar) {
        gVar.f = false;
        return false;
    }

    public g(Context context, Handler handler) {
        this.e = null;
        this.d = handler;
        String path = context.getFilesDir().getPath();
        if (this.e == null) {
            this.e = com.autonavi.aps.amapapi.utils.k.l(context);
        }
        try {
            this.f3959b = new File(path, "hisloc");
        } catch (Throwable th) {
            ns.a(th);
        }
        a();
        Handler handler2 = this.d;
        if (handler2 != null) {
            handler2.removeCallbacks(this.g);
            this.d.postDelayed(this.g, 60000L);
        }
    }

    public final void a(boolean z) {
        if (!z) {
            this.g.run();
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacks(this.g);
        }
        this.f3960c = true;
    }

    public final void a(f fVar) {
        a(fVar, 1);
    }

    public final void b(f fVar) {
        a(fVar, 12);
    }

    private void a(f fVar, int i) {
        if (fVar == null) {
            return;
        }
        f fVar2 = null;
        int i2 = 0;
        f fVar3 = null;
        for (f fVar4 : this.f3958a) {
            if (fVar4.f3955a == i) {
                if (fVar3 == null) {
                    fVar3 = fVar4;
                }
                i2++;
                fVar2 = fVar4;
            }
        }
        if (fVar2 == null || fVar.d - fVar2.d >= 20000 || com.autonavi.aps.amapapi.utils.k.a(new double[]{fVar.f3956b, fVar.f3957c, fVar2.f3956b, fVar2.f3957c}) >= 20.0f) {
            if (i2 >= 5) {
                this.f3958a.remove(fVar3);
            }
            if (this.f3958a.size() >= 10) {
                this.f3958a.removeFirst();
            }
            this.f3958a.add(fVar);
            this.f = true;
        }
    }

    public final void c(f fVar) {
        if (this.f3958a.size() > 0) {
            if (fVar.f3955a == 6 || fVar.f3955a == 5) {
                f last = this.f3958a.getLast();
                if (last.f3957c == fVar.f3957c && last.f3956b == fVar.f3956b && last.e == fVar.e) {
                    return;
                }
                if (this.f3958a.size() >= 10) {
                    this.f3958a.removeFirst();
                }
                this.f3958a.add(fVar);
                this.f = true;
                return;
            }
            if (this.f3958a.contains(fVar)) {
                return;
            }
            if (this.f3958a.size() >= 10) {
                this.f3958a.removeFirst();
            }
            this.f3958a.add(fVar);
            this.f = true;
        }
    }

    public final List<f> a(ArrayList<d> arrayList, ArrayList<np> arrayList2) {
        if (!b(arrayList, arrayList2)) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (f fVar : this.f3958a) {
            if (jCurrentTimeMillis - fVar.d < 21600000000L) {
                arrayList3.add(fVar);
                i++;
            }
            if (i == 10) {
                break;
            }
        }
        return arrayList3;
    }

    private static boolean b(ArrayList<d> arrayList, ArrayList<np> arrayList2) {
        if (arrayList == null || arrayList.size() <= 0 || arrayList2 == null || arrayList2.size() <= 0) {
            return true;
        }
        return ((long) arrayList.size()) < 4 && ((long) arrayList2.size()) < 20;
    }

    private void a() {
        LinkedList<f> linkedList = this.f3958a;
        if (linkedList == null || linkedList.size() <= 0) {
            Iterator<String> it = com.autonavi.aps.amapapi.utils.k.a(this.f3959b).iterator();
            while (it.hasNext()) {
                try {
                    String str = new String(com.autonavi.aps.amapapi.security.a.b(iq.b(it.next()), this.e), "UTF-8");
                    f fVar = new f();
                    fVar.a(new JSONObject(str));
                    this.f3958a.add(fVar);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = this.f3958a.iterator();
        while (it.hasNext()) {
            try {
                sb.append(iq.b(com.autonavi.aps.amapapi.security.a.a(it.next().a().getBytes("UTF-8"), this.e)) + "\n");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        com.autonavi.aps.amapapi.utils.k.a(this.f3959b, string);
    }
}
