package zy0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzy0/p;", "", "T", "Lcom/garmin/android/apps/connectmobile/v2;", "result", "Lzy0/c;", "source", "<init>", "(Lcom/garmin/android/apps/connectmobile/v2;Lzy0/c;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2<T> f207459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f207460b;

    /* JADX WARN: Multi-variable type inference failed */
    public p(v2<? extends T> v2Var, c cVar) {
        v2Var.getClass();
        cVar.getClass();
        this.f207459a = v2Var;
        this.f207460b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f207459a.equals(pVar.f207459a) && this.f207460b == pVar.f207460b;
    }

    public final int hashCode() {
        return this.f207460b.hashCode() + (this.f207459a.hashCode() * 31);
    }

    public final String toString() {
        return "ResultSource(result=" + this.f207459a + ", source=" + this.f207460b + ")";
    }
}
