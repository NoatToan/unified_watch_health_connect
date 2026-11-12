package us;

import p005kotlin.Metadata;
import t13.d;
import v13.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.activityrecording.data.device.ActivityRecordingProtobufDataHandler", f = "ActivityRecordingProtobufDataHandler.kt", l = {126}, m = "subscribeEventSharing", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f172354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f172355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f172356c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, d<? super b> dVar) {
        super(dVar);
        this.f172355b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f172354a = obj;
        this.f172356c |= Integer.MIN_VALUE;
        return this.f172355b.l(this);
    }
}
