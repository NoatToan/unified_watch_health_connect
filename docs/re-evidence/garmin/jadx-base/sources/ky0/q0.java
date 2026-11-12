package ky0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.Map;
import java.util.Set;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f107462b;

    public /* synthetic */ q0(w0 w0Var, int i14) {
        this.f107461a = i14;
        this.f107462b = w0Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Map<String, cy0.l> map = (Map) obj;
        Set<? extends ActivityListItemDTO> set = (Set) obj2;
        Set<? extends ActivityListItemDTO> set2 = (Set) obj3;
        switch (this.f107461a) {
            case 0:
                map.getClass();
                set.getClass();
                set2.getClass();
                this.f107462b.N4(map, set, set2);
                break;
            default:
                map.getClass();
                set.getClass();
                set2.getClass();
                this.f107462b.N4(map, set, set2);
                break;
        }
        return Unit.INSTANCE;
    }
}
