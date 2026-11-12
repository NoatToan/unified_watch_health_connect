package defpackage;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class ofh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29109b = false;

    public ofh(lgi lgiVar) {
        this.f29108a = lgiVar.b(tr1.class) != null;
    }

    public void a() {
        this.f29109b = false;
    }

    public void b() {
        this.f29109b = true;
    }

    public boolean c(int i) {
        return this.f29109b && i == 0 && this.f29108a;
    }
}
