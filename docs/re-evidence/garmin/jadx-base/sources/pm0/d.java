package pm0;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.challenges.GroupChallengesViewModel", f = "GroupChallengesViewModel.kt", l = {57}, m = "replaceChampionProfile", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f138604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f138605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.challenges.c f138606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f138607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.garmin.android.apps.connectmobile.group.details.challenges.c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f138606c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f138605b = obj;
        this.f138607d |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.group.details.challenges.c.y4(this.f138606c, null, this);
    }
}
