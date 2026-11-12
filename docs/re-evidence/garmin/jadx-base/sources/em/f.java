package em;

import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsListDTO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import iu1.k;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lem/f;", "Liu1/h;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsListDTO;", "", "activityId", "", "jsonBody", "Liu1/k;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "cacheFetchEnabled", "<init>", "(JLjava/lang/String;Liu1/k;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends iu1.h<SegmentDetailsListDTO> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f64578l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j8, String str, k<? super SegmentDetailsListDTO> kVar, boolean z14) {
        super(new iu1.f(), new dm.a(j8, qd2.a.EnumC2721a.ACTIVITY_SEGMENTS, 7200), z14, SegmentDetailsListDTO.class, kVar, null, null, null, 224, null);
        str.getClass();
        kVar.getClass();
        this.f64578l = str;
    }

    @Override // iu1.h
    public final c83.d<String> f() {
        return ((d60.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, d60.a.class, new c83.h.a[0], null, null, null, 120)).B(this.f64578l);
    }
}
