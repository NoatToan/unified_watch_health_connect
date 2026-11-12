package bl2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.AbstractActiveTransfer", f = "AbstractActiveTransfer.kt", l = {494}, m = "read")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f18642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f18644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f18644c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18643b = obj;
        this.f18645d |= Integer.MIN_VALUE;
        b.a aVar = b.f18599l;
        return this.f18644c.h(null, null, null, false, null, this);
    }
}
