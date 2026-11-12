package bl2;

import java.util.Collection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.ReadActiveTransfer", f = "ReadActiveTransfer.kt", l = {324}, m = "archive")
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f18714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f18715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f18717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f18717d = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18716c = obj;
        this.f18718e |= Integer.MIN_VALUE;
        r.a aVar = r.f18709p;
        return this.f18717d.r(null, this);
    }
}
