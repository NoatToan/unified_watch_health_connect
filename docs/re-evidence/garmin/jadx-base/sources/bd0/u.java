package bd0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.apache.commons.lang3.BooleanUtils;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f17615b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17616a;

        static {
            int[] iArr = new int[lj0.c.values().length];
            f17616a = iArr;
            try {
                iArr[lj0.c.CONNECT_EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public interface b {
        void b(yl2.e eVar);

        void c();
    }

    public enum c {
        ACTIVE(AppMeasurementSdk.ConditionalUserProperty.ACTIVE),
        /* JADX INFO: Fake field, exist only in values array */
        ACTIVE_OFF("active_activity_tracking_off"),
        /* JADX INFO: Fake field, exist only in values array */
        RETIRED("retired");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17619a;

        c(String str) {
            this.f17619a = str;
        }
    }

    private u() {
        this.f17614a = -1L;
        this.f17615b = null;
    }

    public final void a() {
        c cVar = c.ACTIVE;
        try {
            lj0.f fVar = lj0.f.f112997y;
            fVar.f113007i = BooleanUtils.TRUE;
            Object[] objArr = {String.valueOf(this.f17614a)};
            d80.f.b bVar = new d80.f.b(objArr, fVar);
            bVar.f58274d = new t(this, cVar, objArr);
            bVar.f58275e = d80.g.NO_PARSING;
            bVar.a().b();
        } catch (Exception unused) {
            b bVar2 = this.f17615b;
            if (bVar2 != null) {
                bVar2.b(yl2.e.OTHER_FATAL);
            }
        }
    }

    public u(long j8, b bVar) {
        this.f17614a = j8;
        this.f17615b = bVar;
    }
}
