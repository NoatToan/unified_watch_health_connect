package t20;

import c83.b0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lt20/a;", "Lc83/h$a;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends c83.h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.i.b f161763a;

    public a(com.garmin.android.library.mapsdkadapter.i.b bVar) {
        this.f161763a = bVar;
    }

    @Override // c83.h.a
    public final c83.h<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        type.getClass();
        annotationArr.getClass();
        if (type.equals(com.garmin.android.apps.connectmobile.courses.model.e.class)) {
            return new r22.a(this.f161763a, 17);
        }
        return null;
    }
}
