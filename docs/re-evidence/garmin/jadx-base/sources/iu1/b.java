package iu1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liu1/b;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "Liu1/a;", "bizExecutor", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;Liu1/a;)V", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f95042i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, a aVar) {
        super(bVar);
        bVar.getClass();
        aVar.getClass();
        this.f95042i = aVar;
        aVar.a(this);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        this.f95042i.execute();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
        this.f95042i.cancel();
    }

    public final void d(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        c(cVar);
    }
}
