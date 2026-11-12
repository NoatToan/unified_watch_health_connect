package yv2;

import androidx.fragment.app.Fragment;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyv2/c;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f199858a = new c();

    private c() {
    }

    public static void a(Fragment fragment, dx2.c cVar, Map map, zw2.f fVar) {
        fVar.h(cVar, map, "");
        com.garmin.realtimesettings.app.presentationlayer.c cVar2 = fragment instanceof com.garmin.realtimesettings.app.presentationlayer.c ? (com.garmin.realtimesettings.app.presentationlayer.c) fragment : null;
        if (cVar2 != null) {
            cVar2.l2();
        }
    }
}
