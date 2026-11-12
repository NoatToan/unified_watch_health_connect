package kd0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.GroupDelegateImpl", f = "GroupDelegateImpl.kt", l = {139, 142}, m = "fetchGroupPostFeed", v = 2)
public final class a3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f103971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GroupDTO.c f103972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.v2.b f103973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public jo1.e f103974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f103975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d3 f103976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f103977g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(d3 d3Var, t13.d<? super a3> dVar) {
        super(dVar);
        this.f103976f = d3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f103975e = obj;
        this.f103977g |= Integer.MIN_VALUE;
        return this.f103976f.g(null, null, null, null, this);
    }
}
