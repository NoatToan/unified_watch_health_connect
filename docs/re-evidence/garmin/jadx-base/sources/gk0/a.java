package gk0;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eb2.b f77722b;

    public a(Context context) {
        this.f77722b = new eb2.b(context);
        this.f77721a = context;
    }

    @Override // eb2.d
    public final boolean b() {
        return this.f77722b.f63686a;
    }

    public a(Context context, kb2.a aVar) {
        this.f77722b = new eb2.b(context, aVar);
        this.f77721a = context;
    }

    public a(Context context, int i14, int i15) {
        this.f77722b = new eb2.b(context, i14, i15);
        this.f77721a = context;
    }
}
