package kd0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.GroupDelegateImpl", f = "GroupDelegateImpl.kt", l = {109, 114}, m = "fetchGroupActivityFeed", v = 2)
public final class z2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f104472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GroupDTO.c f104473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.v2.b f104474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActivityListItemDTO f104475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f104476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d3 f104477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f104478g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(d3 d3Var, t13.d<? super z2> dVar) {
        super(dVar);
        this.f104477f = d3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104476e = obj;
        this.f104478g |= Integer.MIN_VALUE;
        return this.f104477f.f(null, null, null, null, this);
    }
}
