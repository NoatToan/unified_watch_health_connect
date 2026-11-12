package mm0;

import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel", f = "GroupDetailViewModel.kt", l = {141}, m = "handleGetGroupDetail", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GroupDetailsDTO f119548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f119549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f119550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f119551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f119550c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119549b = obj;
        this.f119551d |= Integer.MIN_VALUE;
        return e.x4(this.f119550c, null, this);
    }
}
