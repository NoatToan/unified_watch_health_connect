package k40;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mapsdkadapter.q;
import ie2.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lk40/e;", "", "Lk40/b;", "host", "<init>", "(Lk40/b;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f102838b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f102839a;

    static {
        new a(null);
        f102838b = R.color.gds_data_viz_blue_primary;
    }

    public e(b bVar) {
        bVar.getClass();
        this.f102839a = bVar;
    }

    public final q a() {
        q qVar = new q();
        Context contextM0 = this.f102839a.m0();
        p pVar = qVar.f50328a;
        if (contextM0 != null) {
            pVar.f93156d = a7.b.getColor(contextM0, f102838b);
        }
        pVar.f93155c = 15.0f;
        return qVar;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lk40/e$a;", "", "<init>", "()V", "", "MARKER_DRAG_GUIDELINE_TAG", "Ljava/lang/String;", "", "COURSE_PATH_COLOR_RES", "I", "", "UNPAVED_SECTION_POLYLINE_Z_INDEX", "F", "HIGH_TRAFFIC_UNDERLAY_POLYLINE_Z_INDEX", "HIGH_TRAFFIC_POLYLINE_Z_INDEX", "POLYLINE_DASH", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
