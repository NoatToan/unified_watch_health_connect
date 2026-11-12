package cg1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardDTO;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardRowDTO;
import com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentLeaderboardDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.segments.presentation.SegmentViewModel$searchSegmentLeaderboard$1", f = "SegmentViewModel.kt", l = {86, 90}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.l<t13.d<? super v2<? extends SegmentLeaderboardDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f27129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f27131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SegmentLeaderboardFilterDTO f27132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO, t13.d<? super b0> dVar) {
        super(1, dVar);
        this.f27131c = c0Var;
        this.f27132d = segmentLeaderboardFilterDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b0(this.f27131c, this.f27132d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends SegmentLeaderboardDTO>> dVar) {
        return ((b0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        Map map;
        List<SegmentLeaderboardRowDTO> list;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f27130b;
        c0 c0Var = this.f27131c;
        if (i14 == 0) {
            o13.r.b(obj);
            yf1.b bVar = c0Var.f27136b;
            this.f27130b = 1;
            bVar.getClass();
            obj = f0.J(bVar, new yf1.i(bVar, this.f27132d, null), this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = this.f27129a;
            o13.r.b(obj);
        }
        map = (Map) obj;
        list = ((SegmentLeaderboardDTO) ((v2.b) v2Var).f47386a).f41223d;
        if (list != null) {
            for (SegmentLeaderboardRowDTO segmentLeaderboardRowDTO : list) {
                lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l((int) segmentLeaderboardRowDTO.f41244v, map);
                if (lVar == null) {
                    profileImageUrls = lVar.getProfileImageUrls();
                    if (profileImageUrls != null) {
                        str = profileImageUrls.f46878g;
                    } else {
                        str = null;
                    }
                    segmentLeaderboardRowDTO.f41240p = str;
                }
            }
        }
        return v2Var;
        v2 v2Var2 = (v2) obj;
        if (v2Var2 instanceof v2.b) {
            v2.b bVar2 = (v2.b) v2Var2;
            List<SegmentLeaderboardRowDTO> list2 = ((SegmentLeaderboardDTO) bVar2.f47386a).f41223d;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((SegmentLeaderboardRowDTO) it.next()).f41244v));
                }
                List<String> listB1 = h0.b1(arrayList);
                if (listB1 != null) {
                    a22.i iVar = c0Var.f27137c;
                    this.f27129a = bVar2;
                    this.f27130b = 2;
                    a22.i.a aVar2 = a22.i.f537b;
                    Object objA = iVar.a(listB1, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, this);
                    if (objA != aVar) {
                        v2Var = v2Var2;
                        obj = objA;
                        map = (Map) obj;
                        list = ((SegmentLeaderboardDTO) ((v2.b) v2Var).f47386a).f41223d;
                        if (list != null) {
                            while (r1.hasNext()) {
                                lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l((int) segmentLeaderboardRowDTO.f41244v, map);
                                if (lVar == null) {
                                    profileImageUrls = lVar.getProfileImageUrls();
                                    if (profileImageUrls != null) {
                                        str = profileImageUrls.f46878g;
                                    } else {
                                        str = null;
                                    }
                                    segmentLeaderboardRowDTO.f41240p = str;
                                }
                            }
                        }
                        return v2Var;
                    }
                    return aVar;
                }
            }
        }
        return v2Var2;
    }
}
