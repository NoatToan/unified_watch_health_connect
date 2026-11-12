package gk0;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.gcsprotos.generated.Auth;
import f12.l;
import java.util.List;
import o13.p;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class b<T> extends g<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f77723k;

    public b(Context context, f<T> fVar, String str, long j8, Auth.Category category) {
        super(context, fVar);
        this.f77723k = true;
        h(str, j8, category);
    }

    @Override // eb2.a
    public final boolean c() {
        return this.f77723k;
    }

    public final void h(String str, long j8, Auth.Category category) {
        DeviceProfile deviceProfileB;
        d dVar = (d) KoinJavaComponent.get(d.class);
        if (this.f63679c) {
            vb.h.z("Cannot set identifier after query has started");
            return;
        }
        this.f63680d = str;
        eb2.c.f63687a = dVar.g(category);
        eb2.e eVarA = eb2.c.a();
        eVarA.f63691d = "119";
        eVarA.f63694g = j8;
        if (this.f77723k) {
            l.f68084a.getClass();
            String strF0 = l.a.a().F0();
            if (!TextUtils.isEmpty(strF0)) {
                eVarA.f63688a = strF0;
            }
        }
        eVarA.f63696i = "5.30.1";
        if (j8 > 0 && (deviceProfileB = dVar.b(j8)) != null) {
            eVarA.f63693f = String.valueOf(deviceProfileB.getF172495c());
            eVarA.f63695h = String.valueOf(deviceProfileB.getF172497e());
        }
        this.f63684h = eVarA;
    }

    public b(Context context, f<T> fVar, String str, long j8, List<p<String, String>> list, Auth.Category category) {
        super(context, fVar, list);
        this.f77723k = true;
        h(str, j8, category);
    }

    public b(Context context, f<T> fVar, String str, long j8, boolean z14, Auth.Category category) {
        super(context, fVar);
        this.f77723k = z14;
        h(str, j8, category);
    }
}
