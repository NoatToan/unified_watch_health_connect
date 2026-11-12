package m12;

import c22.j0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListDTO;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lm12/e;", "", "La22/h;", "userProfileActivitiesRepo", "<init>", "(La22/h;)V", "a", "b", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f115815b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a22.h f115816a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lm12/e$a;", "Ljw/c;", "", "displayName", "", TtmlNode.START, MapboxMap.QFE_LIMIT, "<init>", "(Ljava/lang/String;II)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends jw.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f115817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f115818e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f115819f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final r f115820g;

        public a(String str, int i14, int i15) {
            str.getClass();
            this.f115817d = str;
            this.f115818e = i14;
            this.f115819f = i15;
            this.f115820g = (r) KoinJavaComponent.get$default(r.class, null, null, 6, null);
        }

        @Override // jw.c
        public final String a() {
            long j8 = ((long) this.f115818e) - 1;
            int i14 = this.f115819f;
            List listD = this.f115820g.d(j8, i14, this.f101229b, this.f115817d);
            if (listD.size() == i14) {
                return GsonUtil.a(listD);
            }
            return null;
        }

        @Override // jw.c
        public final r53.i<String> b() {
            return new r53.m(null);
        }

        @Override // jw.c
        public final String c() {
            List listD = this.f115820g.d(((long) this.f115818e) - 1, this.f115819f, this.f101230c, this.f115817d);
            if (listD.size() > 0) {
                return GsonUtil.a(listD);
            }
            return null;
        }

        @Override // jw.c
        public final void d(Object obj, String str) {
            bb2.h hVar;
            str.getClass();
            obj.getClass();
            long jCurrentTimeMillis = DateTimeUtils.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (ActivityListItemDTO activityListItemDTO : (List) obj) {
                DateTime dateTimeN = j0.N(activityListItemDTO.f29262f, true);
                long j8 = activityListItemDTO.f29250b;
                if (j8 == -1 || dateTimeN == null) {
                    i2.n("ActivitySummaryDMO", "Invalid activity summary object: " + activityListItemDTO);
                    hVar = null;
                } else {
                    hVar = new bb2.h(j8, activityListItemDTO.B, dateTimeN.getMillis(), activityListItemDTO.f29247a, jCurrentTimeMillis);
                }
                if (hVar != null) {
                    arrayList.add(hVar);
                }
            }
            this.f115820g.i(arrayList);
        }
    }

    static {
        new b(null);
    }

    public e(a22.h hVar) {
        hVar.getClass();
        this.f115816a = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(h hVar, a aVar, v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f115824d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f115824d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objInvoke = fVar.f115822b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f115824d;
        if (i15 == 0) {
            o13.r.b(objInvoke);
            fVar.f115821a = aVar;
            fVar.f115824d = 1;
            objInvoke = hVar.invoke(fVar);
            if (objInvoke == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = fVar.f115821a;
            o13.r.b(objInvoke);
        }
        v2 v2Var = (v2) objInvoke;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            ArrayList<ActivityListItemDTO> arrayList = ((ActivityListDTO) bVar.f47386a).f29242a;
            aVar.d(arrayList, "");
            return new zy0.p(new v2.b(arrayList, bVar.f47387b, null, null, 12, null), zy0.c.SERVER);
        }
        if (v2Var instanceof v2.a) {
            return new zy0.p(v2Var, zy0.c.SERVER);
        }
        u0.r();
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm12/e$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
