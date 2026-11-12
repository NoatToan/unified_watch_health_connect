package om2;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f132979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f132980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f132981c;

    public class a implements om2.a {
        public a() {
        }

        @Override // om2.a
        public final void onFailure(Exception exc) {
            e eVar = c.this.f132981c;
            eVar.a();
            eVar.f132993j.onFailure(exc);
        }

        @Override // om2.a
        public final void onSuccess() {
            c cVar = c.this;
            e eVar = cVar.f132981c;
            int i14 = cVar.f132980b;
            synchronized (eVar.f132986c) {
                try {
                    b bVar = (b) eVar.f132987d.get(i14);
                    String strReplace = !TextUtils.isEmpty(eVar.f132985b) ? bVar.a().replace(eVar.f132985b, "") : bVar.a();
                    eVar.f132984a.info("Operation completed:" + strReplace);
                    eVar.f132990g.post(new d(eVar, bVar));
                    int i15 = eVar.f132991h;
                    if (i14 != i15) {
                        eVar.f132988e.add(Integer.valueOf(i14));
                        return;
                    }
                    int i16 = i15 + 1;
                    eVar.f132991h = i16;
                    while (i16 < eVar.f132987d.size()) {
                        if (!eVar.f132988e.contains(Integer.valueOf(i16))) {
                            b bVar2 = (b) eVar.f132987d.get(i16);
                            eVar.f132984a.trace("Give device access to: " + bVar2.a());
                            bVar2.f132975a.g0(Boolean.TRUE);
                            eVar.f132991h = i16;
                            return;
                        }
                        i16++;
                    }
                    eVar.f132991h = Integer.MAX_VALUE;
                    eVar.f132993j.onSuccess();
                    eVar.f132989f.shutdownNow();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public c(e eVar, b bVar, int i14) {
        this.f132981c = eVar;
        this.f132979a = bVar;
        this.f132980b = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = new a();
        b bVar = this.f132979a;
        bVar.f132976b.set(aVar);
        try {
            bVar.c();
        } catch (Exception e4) {
            bVar.e(e4);
        }
    }
}
