package mm0;

import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel", f = "GroupDetailViewModel.kt", l = {246}, m = "checkMemberRequestForGroup", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GroupDetailsDTO f119526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f119527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f119528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f119529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f119530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f119529d = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119528c = obj;
        this.f119530e |= Integer.MIN_VALUE;
        int i14 = e.f119504m;
        return this.f119529d.z4(null, this);
    }
}
