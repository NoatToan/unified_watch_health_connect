package qe2;

import com.garmin.android.library.mapsdkadapter.l;
import com.garmin.android.library.mapsdkadapter.q;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqe2/j;", "Lcom/garmin/android/library/mapsdkadapter/l;", "Lcom/garmin/android/library/mapsdkadapter/q;", "options", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/q;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f144590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f144591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f144592c;

    public j(q qVar) {
        qVar.getClass();
        this.f144590a = new q(qVar);
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void a(float f14) {
        l lVar = this.f144592c;
        if (lVar != null) {
            lVar.a(f14);
        } else {
            this.f144590a.f50328a.f93158f = f14;
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void b(Object obj) {
        l lVar = this.f144592c;
        if (lVar != null) {
            lVar.b(obj);
        } else {
            this.f144590a.f50328a.f93164l = obj;
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void c(ie2.d dVar) {
        dVar.getClass();
        l lVar = this.f144592c;
        if (lVar != null) {
            lVar.c(dVar);
        } else {
            this.f144590a.d(dVar);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final List<com.garmin.android.library.mapsdkadapter.f> d() {
        return this.f144590a.f50328a.f93153a;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void e(boolean z14) {
        l lVar = this.f144592c;
        if (lVar != null) {
            lVar.e(z14);
        } else {
            this.f144590a.f50328a.f93161i = z14;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this == obj;
        }
        return (obj instanceof l) && this.f144592c == obj;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void f(int i14) {
        l lVar = this.f144592c;
        if (lVar != null) {
            lVar.f(i14);
        } else {
            this.f144590a.f50328a.f93156d = i14;
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    /* JADX INFO: renamed from: g, reason: from getter */
    public final q getF144590a() {
        return this.f144590a;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final int getColor() {
        return this.f144590a.f50328a.f93156d;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final Object getTag() {
        return this.f144590a.f50328a.f93164l;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final float getZIndex() {
        return this.f144590a.f50328a.f93158f;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void h(List<com.garmin.android.library.mapsdkadapter.f> list) {
        list.getClass();
        l lVar = this.f144592c;
        if (lVar != null) {
            lVar.h(list);
        } else {
            this.f144590a.b();
            this.f144590a.a(list);
        }
    }

    public final int hashCode() {
        int iHashCode = this.f144590a.hashCode() * 31;
        l lVar = this.f144592c;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void i(float f14) {
        l lVar = this.f144592c;
        if (lVar != null) {
            lVar.i(f14);
        } else {
            this.f144590a.f50328a.f93155c = f14;
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void j(ie2.d dVar) {
        dVar.getClass();
        l lVar = this.f144592c;
        if (lVar != null) {
            lVar.j(dVar);
        } else {
            this.f144590a.d(dVar);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void remove() {
        l lVar = this.f144592c;
        if (lVar != null) {
            lVar.remove();
        }
        this.f144591b = true;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void setVisible(boolean z14) {
        l lVar = this.f144592c;
        if (lVar != null) {
            lVar.setVisible(z14);
        } else {
            this.f144590a.f50328a.f93160h = z14;
        }
    }
}
