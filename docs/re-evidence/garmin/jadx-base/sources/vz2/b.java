package vz2;

import android.os.Bundle;
import androidx.room.a0;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f180931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f180932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f180933e;

    public b(String str, String str2, k kVar, j jVar) {
        this.f180929a = str;
        this.f180930b = str2;
        this.f180932d = kVar;
        this.f180933e = jVar;
        this.f180931c = a0.j("mfp-", str, !(str2 == null || str2.length() == 0) ? fb1.c.n("-", str2) : "", "://mfp/authorize/response");
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("client_id", this.f180929a);
        bundle.putString("suffix", this.f180930b);
        bundle.putString("redirect_uri", this.f180931c);
        bundle.putString(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "mobile");
        a.f180927a.getClass();
        bundle.putString("access_type", "offline");
        bundle.putString(Action.SCOPE_ATTRIBUTE, this.f180932d.toString());
        bundle.putString("response_type", this.f180933e.toString());
        return bundle;
    }

    public b(String str, k kVar, j jVar) {
        this(str, null, kVar, jVar);
    }
}
