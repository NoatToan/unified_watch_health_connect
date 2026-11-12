package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class yys extends z5s.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f40701a;

    public yys(Context context) {
        this.f40701a = context;
    }

    @Override // z5s.b
    public void b() {
        ArrayList arrayList;
        synchronized (xys.d) {
            arrayList = new ArrayList(xys.e);
            xys.e.clear();
        }
        xys.o(this.f40701a, arrayList);
    }
}
