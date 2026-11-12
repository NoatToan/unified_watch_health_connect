package iq0;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class a implements l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f94734a;

    public a(long j8) {
        this.f94734a = j8;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        long j8 = this.f94734a;
        if (cVar.e(Long.valueOf(j8))) {
            cVar.a(j8);
        }
        return Unit.INSTANCE;
    }
}
