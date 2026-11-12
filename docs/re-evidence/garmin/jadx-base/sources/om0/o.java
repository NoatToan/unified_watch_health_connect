package om0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.about.member.GroupMemberPagingSource", f = "GroupMemberPagingSource.kt", l = {32, 43}, m = "load", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f132947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f132948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f132950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f132951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f132952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f132951e = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132950d = obj;
        this.f132952f |= Integer.MIN_VALUE;
        return this.f132951e.e(null, this);
    }
}
