package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public class ddj implements Comparator<ddj> {

    @SerializedName("sleepMonitorReport")
    private ddb.c e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("isRead")
    private boolean f31669a = false;

    @SerializedName("isFavourite")
    private boolean d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("isAutoCleared")
    private boolean f31670b = false;

    public ddb.c c() {
        return this.e;
    }

    public void e(ddb.c cVar) {
        this.e = cVar;
    }

    public boolean b() {
        return this.d;
    }

    public boolean a() {
        return this.f31670b;
    }

    public void b(boolean z) {
        this.f31670b = z;
    }

    public int hashCode() {
        ddb.c cVar = this.e;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compare(ddj ddjVar, ddj ddjVar2) {
        if (ddjVar.c().a() > ddjVar2.c().a()) {
            return 1;
        }
        return ddjVar.c().a() < ddjVar2.c().a() ? -1 : 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddj)) {
            return false;
        }
        ddj ddjVar = (ddj) obj;
        if (this.e == null && ddjVar.c() == null) {
            return true;
        }
        if (this.e == null && ddjVar.c() != null) {
            return false;
        }
        if (this.e == null || ddjVar.c() != null) {
            return this.e.equals(ddjVar.c());
        }
        return false;
    }

    public String toString() {
        return "SleepVoiceInfoWrapper{sleepMonitorReport=" + this.e + ", isRead=" + this.f31669a + ", isFavourite=" + this.d + ", isAutoCleared=" + this.f31670b + '}';
    }
}
