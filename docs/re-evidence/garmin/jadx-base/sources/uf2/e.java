package uf2;

import com.garmin.proto.generated.GDILiveSessionProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVSessionStartInteractor", f = "LSVSessionStartInteractor.kt", l = {351, 366}, m = "getPowerData", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GDILiveSessionProto.ActivityStartRequest f170323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f170324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f170325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f170326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f170327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f170328f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f170327e = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170326d = obj;
        this.f170328f |= Integer.MIN_VALUE;
        int i14 = d.f170313j;
        return this.f170327e.b(null, null, this);
    }
}
