package t00;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import c22.j0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Objects;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f161660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f161661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f161662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f161663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f161664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f161665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f161666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DateTime f161667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f161668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f161669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f161670k;

    public final int a(int i14, Context context) {
        if (this.f161661b != null) {
            int identifier = context.getResources().getIdentifier(this.f161661b, "string", context.getPackageName());
            if (identifier != 0) {
                return identifier;
            }
            i2.m(a2.CHALLENGES, "c", "Unknown string handle: " + this.f161661b);
        }
        return i14;
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.f161660a = bundle.getString("notification-key");
            this.f161661b = bundle.getString("notification-format");
            this.f161662c = bundle.getString("uuid", "");
            this.f161663d = bundle.getString("challenge-name", "");
            this.f161664e = bundle.getString("invite-id", "");
            this.f161665f = bundle.getString("from-user-name", "");
            this.f161666g = bundle.getString("rank", "");
            this.f161670k = bundle.getString("badge-uuid", "");
            String string = bundle.getString("start-date");
            if (!TextUtils.isEmpty(string)) {
                this.f161667h = j0.N(string, this.f161670k.isEmpty());
            }
            this.f161668i = Integer.valueOf(bundle.getString("activity-type", "-1")).intValue();
            this.f161669j = Integer.valueOf(bundle.getString("alternate-award-type", "-1")).intValue();
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f161660a, this.f161661b, this.f161662c, this.f161663d, this.f161664e, this.f161665f, this.f161666g, Integer.valueOf(this.f161668i), Integer.valueOf(this.f161669j), this.f161670k);
    }
}
