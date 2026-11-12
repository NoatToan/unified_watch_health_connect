package tg;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f164480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f164481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f164482c = System.currentTimeMillis() + 86400000;

    public d(String str, int i14) {
        this.f164480a = str;
        this.f164481b = i14;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ValueData{value='");
        sb3.append(this.f164480a);
        sb3.append("', code=");
        sb3.append(this.f164481b);
        sb3.append(", expired=");
        return a0.l(sb3, this.f164482c, CoreConstants.CURLY_RIGHT);
    }
}
