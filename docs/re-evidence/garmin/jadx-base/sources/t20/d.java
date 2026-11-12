package t20;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt20/d;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "", "courseId", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends com.garmin.android.library.backgroundtaskmanagement.b<com.garmin.android.apps.connectmobile.courses.model.e> {

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"t20/d$a", "Liu1/k;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements iu1.k<com.garmin.android.apps.connectmobile.courses.model.e> {
        public a() {
        }

        @Override // iu1.k
        public final void a(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
        }

        @Override // iu1.k
        public final void onSuccess(com.garmin.android.apps.connectmobile.courses.model.e eVar) {
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = eVar;
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            s20.d dVar = s20.d.f156005a;
            List<GeoPointDTO> list = eVar2.geoPoints;
            dVar.getClass();
            eVar2.intervalMarkers = s20.d.f(list, zY);
            d.this.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, eVar2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        str.getClass();
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new com.garmin.android.apps.connectmobile.courses.model.e());
        cw.e.a(this, new e(str, new a()));
    }
}
