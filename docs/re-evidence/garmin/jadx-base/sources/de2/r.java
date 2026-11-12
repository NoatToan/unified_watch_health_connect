package de2;

import android.content.Context;
import com.garmin.proto.generated.GDILiveTrackProto;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager", f = "DefaultDeviceManager.kt", l = {316}, m = "updateStravaSharingState", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GDILiveTrackProto.LiveTrackService f59365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f59366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f59367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f59368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f59370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f59371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f59372h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a aVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f59371g = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59370f = obj;
        this.f59372h |= Integer.MIN_VALUE;
        int i14 = a.f59227j;
        return this.f59371g.u(null, false, this);
    }
}
