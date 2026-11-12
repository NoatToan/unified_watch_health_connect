package r12;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.mute.FollowMutedUsersPagingSource", f = "FollowMutedUsersPagingSource.kt", l = {34, 43}, m = "convertToViewData", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f149401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f149402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f149403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f149404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f149405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, t13.d<? super b> dVar2) {
        super(dVar2);
        this.f149404d = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f149403c = obj;
        this.f149405e |= Integer.MIN_VALUE;
        return this.f149404d.f(null, this);
    }
}
