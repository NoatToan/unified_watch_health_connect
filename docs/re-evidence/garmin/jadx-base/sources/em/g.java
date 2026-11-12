package em;

import am.b2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import iu1.k;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lem/g;", "Liu1/h;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;", "", "activityId", "Liu1/k;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "cacheFetchEnabled", "<init>", "(JLiu1/k;Z)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends iu1.h<com.garmin.android.apps.connectmobile.activities.newmodel.h> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f64579l;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j8, k<? super com.garmin.android.apps.connectmobile.activities.newmodel.h> kVar, boolean z14) {
        super(new iu1.f(), new dm.a(j8, qd2.a.EnumC2721a.ACTIVITY_DETAILS, DateTimeConstants.MINUTES_PER_DAY), z14, com.garmin.android.apps.connectmobile.activities.newmodel.h.class, kVar, null, null, null, 224, null);
        kVar.getClass();
        this.f64579l = j8;
    }

    @Override // iu1.h
    public final c83.d<String> f() {
        return ((b2) ez0.b.a(ez0.b.f67468a, ez0.c.GC, b2.class, new c83.h.a[0], null, null, null, 120)).s(this.f64579l);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lem/g$a;", "", "<init>", "()V", "", "ONE_DAY_CACHE_STALE_TIME", "I", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ g(long j8, k kVar, boolean z14, int i14, j jVar) {
        this(j8, kVar, (i14 & 4) != 0 ? true : z14);
    }
}
