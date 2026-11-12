package cg1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.segments.data.model.UserRankDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/UserRankDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.segments.presentation.SegmentViewModel$getUserRankForSegment$1", f = "SegmentViewModel.kt", l = {38, 47}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.l<t13.d<? super v2<? extends UserRankDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f27215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UserRankDTO f27216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f27218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f27219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f27220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, String str, String str2, t13.d<? super y> dVar) {
        super(1, dVar);
        this.f27218d = c0Var;
        this.f27219e = str;
        this.f27220f = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y(this.f27218d, this.f27219e, this.f27220f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends UserRankDTO>> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x011f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        UserRankDTO userRankDTO;
        int iIntValue;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        String str;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        String str2;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls2;
        String str3;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls3;
        String str4;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f27217c;
        c0 c0Var = this.f27218d;
        if (i14 == 0) {
            o13.r.b(obj);
            yf1.b bVar = c0Var.f27136b;
            this.f27217c = 1;
            bVar.getClass();
            obj = f0.J(bVar, new yf1.f(bVar, this.f27219e, this.f27220f, null), this);
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
            userRankDTO = this.f27216b;
            obj2 = this.f27215a;
            o13.r.b(obj);
        }
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            iIntValue = ((Number) entry.getKey()).intValue();
            lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) entry.getValue();
            if (iIntValue == ((int) userRankDTO.f41254f)) {
                if (lVar != null || (profileImageUrls = lVar.getProfileImageUrls()) == null) {
                    str = null;
                } else {
                    str = profileImageUrls.f46878g;
                }
                userRankDTO.f41252d = str;
            } else if (iIntValue == ((int) userRankDTO.f41258j)) {
                if (lVar != null || (profileImageUrls2 = lVar.getProfileImageUrls()) == null) {
                    str2 = null;
                } else {
                    str2 = profileImageUrls2.f46878g;
                }
                userRankDTO.f41256h = str2;
            } else if (iIntValue == ((int) userRankDTO.f41262n)) {
                if (lVar != null || (profileImageUrls3 = lVar.getProfileImageUrls()) == null) {
                    str3 = null;
                } else {
                    str3 = profileImageUrls3.f46878g;
                }
                userRankDTO.f41260l = str3;
            } else if (iIntValue != ((int) userRankDTO.f41267t)) {
                if (lVar != null || (profileImageUrls4 = lVar.getProfileImageUrls()) == null) {
                    str4 = null;
                } else {
                    str4 = profileImageUrls4.f46878g;
                }
                userRankDTO.f41265q = str4;
            }
        }
        return obj2;
        obj2 = (v2) obj;
        if (obj2 instanceof v2.b) {
            v2.b bVar2 = (v2.b) obj2;
            UserRankDTO userRankDTO2 = (UserRankDTO) bVar2.f47386a;
            List listK = p13.x.k(new Long(userRankDTO2.f41254f), new Long(userRankDTO2.f41258j), new Long(userRankDTO2.f41262n), new Long(userRankDTO2.f41267t));
            ArrayList arrayList = new ArrayList();
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                String strValueOf = jLongValue == 0 ? null : String.valueOf(jLongValue);
                if (strValueOf != null) {
                    arrayList.add(strValueOf);
                }
            }
            a22.i iVar = c0Var.f27137c;
            this.f27215a = bVar2;
            this.f27216b = userRankDTO2;
            this.f27217c = 2;
            a22.i.a aVar2 = a22.i.f537b;
            obj = iVar.a(arrayList, com.garmin.android.apps.connectmobile.userprofile.model.k.f46891k, this);
            if (obj != aVar) {
                userRankDTO = userRankDTO2;
                while (r13.hasNext()) {
                    iIntValue = ((Number) entry.getKey()).intValue();
                    lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) entry.getValue();
                    if (iIntValue == ((int) userRankDTO.f41254f)) {
                        if (lVar != null) {
                            str = null;
                        } else {
                            str = null;
                        }
                        userRankDTO.f41252d = str;
                    } else if (iIntValue == ((int) userRankDTO.f41258j)) {
                        if (lVar != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        userRankDTO.f41256h = str2;
                    } else if (iIntValue == ((int) userRankDTO.f41262n)) {
                        if (lVar != null) {
                            str3 = null;
                        } else {
                            str3 = null;
                        }
                        userRankDTO.f41260l = str3;
                    } else if (iIntValue != ((int) userRankDTO.f41267t)) {
                        if (lVar != null) {
                            str4 = null;
                        } else {
                            str4 = null;
                        }
                        userRankDTO.f41265q = str4;
                    }
                }
            }
            return aVar;
        }
        return obj2;
    }
}
