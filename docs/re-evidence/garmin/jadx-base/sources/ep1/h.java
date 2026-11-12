package ep1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import f32.l;
import f32.m;
import f32.p;
import org.joda.time.DateTime;
import org.joda.time.Days;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lep1/h;", "Landroidx/lifecycle/u1;", "", "deviceId", "<init>", "(J)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f64936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jp1.b f64937b = jp1.b.a.a(jp1.b.f99884b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f64938c = new l(new f32.a(v1.a(this), new a(), null, 4, null));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f64939d = new m(new f32.j(v1.a(this), new b(), null, 4, null));

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ep1/h$a", "Lf32/g;", "Lip1/c;", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends f32.g<ip1.c> {
        public a() {
        }

        @Override // f32.g
        public final Object c(DateTime dateTime, t13.d<? super v2<? extends ip1.c>> dVar) {
            h hVar = h.this;
            jp1.b bVar = hVar.f64937b;
            long j8 = hVar.f64936a;
            bVar.getClass();
            return f0.J(bVar, new jp1.d(bVar, j8, dateTime, dateTime, true, null), dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ep1/h$b", "Lf32/p;", "Lip1/i;", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends p<ip1.i> {
        public b() {
        }

        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends ip1.i>> dVar) {
            DateTime dateTimeMinusDays = dateTime.minusDays(Days.daysBetween(dateTime, dateTime2).getDays() + 1);
            h hVar = h.this;
            jp1.b bVar = hVar.f64937b;
            long j8 = hVar.f64936a;
            dateTimeMinusDays.getClass();
            return bVar.a(j8, dateTimeMinusDays, dateTime, dateTime2, (v13.c) dVar);
        }
    }

    public h(long j8) {
        this.f64936a = j8;
    }
}
