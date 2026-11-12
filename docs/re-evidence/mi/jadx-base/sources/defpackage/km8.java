package defpackage;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.Systrace;

/* JADX INFO: loaded from: classes4.dex */
public class km8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f23981a = false;

    public static void a() {
        if (f23981a) {
            return;
        }
        f23981a = true;
        Systrace.c(0L, "FabricSoLoader.staticInit::load:fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.q("fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        Systrace.g(0L);
    }
}
