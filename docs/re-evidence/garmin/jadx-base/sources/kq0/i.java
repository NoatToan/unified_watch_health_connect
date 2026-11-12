package kq0;

import android.content.Context;
import android.content.Intent;
import c22.o;
import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkq0/i;", "", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f106173a = new i();

    private i() {
    }

    public static void a() {
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        Intent intent = new Intent(contextC, (Class<?>) IncidentDetectedActivity.class);
        intent.setFlags(536870912);
        intent.addFlags(268435456);
        contextC.startActivity(intent);
    }
}
