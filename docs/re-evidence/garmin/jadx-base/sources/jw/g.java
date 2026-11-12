package jw;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class g extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference<Context> f101252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f101253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f101254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f101255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d80.f<Object> f101256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f101257n;

    public class a implements d80.b {
        public a() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            g gVar = g.this;
            ((com.google.android.exoplayer2.analytics.q) gVar.f101255l).f(null);
            gVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            g gVar = g.this;
            ((com.google.android.exoplayer2.analytics.q) gVar.f101255l).f(gVar.f101253j);
            gVar.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        }
    }

    public interface b {
    }

    public g(com.garmin.android.library.backgroundtaskmanagement.b bVar, Context context, String str, long j8, b bVar2) {
        super(bVar);
        this.f101256m = null;
        this.f101257n = new a();
        this.f101252i = new WeakReference<>(context);
        this.f101253j = str;
        this.f101254k = j8;
        this.f101255l = bVar2;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        WeakReference<Context> weakReference = this.f101252i;
        if (weakReference != null) {
            weakReference.get();
            d80.f.b bVar = new d80.f.b(new Object[]{Long.toString(this.f101254k), this.f101253j}, lj0.a.f112936i);
            bVar.f58274d = this.f101257n;
            bVar.f58275e = d80.g.NO_PARSING;
            d80.f<Object> fVarA = bVar.a();
            fVarA.b();
            this.f101256m = fVarA;
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
        d80.f<Object> fVar = this.f101256m;
        if (fVar != null) {
            fVar.a();
        }
    }
}
