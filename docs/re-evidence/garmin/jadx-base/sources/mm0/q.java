package mm0;

import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel", f = "GroupDetailViewModel.kt", l = {122}, m = "updateGroupPrivacyIfNeeded", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f119574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GroupDetailsDTO f119575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GroupDetailsDTO f119576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f119577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f119578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f119579f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e eVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f119578e = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119577d = obj;
        this.f119579f |= Integer.MIN_VALUE;
        int i14 = e.f119504m;
        return this.f119578e.E4(null, this);
    }
}
