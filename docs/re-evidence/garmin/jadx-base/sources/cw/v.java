package cw;

import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcw/v;", "Lcom/garmin/android/library/backgroundtaskmanagement/a;", "<init>", "()V", "a", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends com.garmin.android.library.backgroundtaskmanagement.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f55954b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static v f55955c;

    public /* synthetic */ v(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public final long M(boolean z14, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<?> interfaceC0995b) {
        interfaceC0995b.getClass();
        Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        obj.getClass();
        if (!((f12.b) obj).f()) {
            return com.garmin.android.library.backgroundtaskmanagement.c.d(new hw.c(z14, this), interfaceC0995b);
        }
        interfaceC0995b.onComplete(-1L, com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
        return -1L;
    }

    public final long N(StravaStatusDTO stravaStatusDTO, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<?> interfaceC0995b) {
        interfaceC0995b.getClass();
        Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        obj.getClass();
        if (((f12.b) obj).f()) {
            interfaceC0995b.onComplete(-1L, com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            return -1L;
        }
        if (stravaStatusDTO != null) {
            return com.garmin.android.library.backgroundtaskmanagement.c.d(new hw.e(stravaStatusDTO, this), interfaceC0995b);
        }
        return -1L;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcw/v$a;", "", "<init>", "()V", "Lcw/v;", "sInstance", "Lcw/v;", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static v a() {
            if (v.f55955c == null) {
                v.f55955c = new v(null);
            }
            return v.f55955c;
        }

        private a() {
        }
    }

    private v() {
    }
}
