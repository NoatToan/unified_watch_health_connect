package yi2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.calendar.os.CalendarController", f = "CalendarController.kt", l = {505}, m = "checkPermission")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f197365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f197366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f197367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f197368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f197367c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f197366b = obj;
        this.f197368d |= Integer.MIN_VALUE;
        return b.c(this.f197367c, this);
    }
}
