package gh;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes7.dex */
public class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f77420c;

    public d(c cVar, int i14, String str) {
        super(null);
        this.f77420c = cVar;
        this.f77419b = i14;
        this.f77418a = str;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z14) {
        if (this.f77420c != null) {
            c.b(this.f77419b, this.f77418a);
        }
    }
}
