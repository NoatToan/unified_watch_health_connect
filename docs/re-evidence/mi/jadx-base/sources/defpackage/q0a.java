package defpackage;

import android.app.Notification;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class q0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30949b;
    public final Notification c;

    public q0a(int i, Notification notification, int i2) {
        this.f30948a = i;
        this.c = notification;
        this.f30949b = i2;
    }

    public int a() {
        return this.f30949b;
    }

    public Notification b() {
        return this.c;
    }

    public int c() {
        return this.f30948a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0a.class != obj.getClass()) {
            return false;
        }
        q0a q0aVar = (q0a) obj;
        if (this.f30948a == q0aVar.f30948a && this.f30949b == q0aVar.f30949b) {
            return this.c.equals(q0aVar.c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f30948a * 31) + this.f30949b) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f30948a + ", mForegroundServiceType=" + this.f30949b + ", mNotification=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
