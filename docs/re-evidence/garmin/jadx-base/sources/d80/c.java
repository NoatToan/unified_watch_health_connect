package d80;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd2.a.b f58254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58255b;

    public c(qd2.a.b bVar, int i14) {
        this.f58254a = bVar;
        this.f58255b = i14;
    }

    @Override // d80.h
    public final String a() throws Throwable {
        String[] strArrD = qd2.a.b().d(this.f58254a);
        if (strArrD == null || TextUtils.isEmpty(strArrD[1]) || Integer.parseInt(strArrD[0]) >= this.f58255b) {
            return null;
        }
        return strArrD[1];
    }

    @Override // d80.h
    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qd2.a.b().g(this.f58254a, str);
    }
}
