package ue;

import android.app.Notification;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f170111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f170112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f170113c;

    public m(int i14, Notification notification, int i15) {
        this.f170111a = i14;
        this.f170113c = notification;
        this.f170112b = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f170111a == mVar.f170111a && this.f170112b == mVar.f170112b) {
            return this.f170113c.equals(mVar.f170113c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f170113c.hashCode() + (((this.f170111a * 31) + this.f170112b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f170111a + ", mForegroundServiceType=" + this.f170112b + ", mNotification=" + this.f170113c + CoreConstants.CURLY_RIGHT;
    }

    public m(int i14, Notification notification) {
        this(i14, notification, 0);
    }
}
