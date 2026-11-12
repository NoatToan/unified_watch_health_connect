package n70;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h2 implements e23.a<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.dashboard.data.datasource.n1 f124254a;

    public h2(com.garmin.android.apps.connectmobile.dashboard.data.datasource.n1 n1Var) {
        this.f124254a = n1Var;
    }

    @Override // e23.a
    public final Boolean invoke() {
        com.garmin.android.apps.connectmobile.dashboard.data.datasource.n1 n1Var = this.f124254a;
        List<fg0.e> listA = n1Var != null ? n1Var.a() : null;
        return Boolean.valueOf(!(listA == null || listA.isEmpty()));
    }
}
