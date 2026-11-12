package bl2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.AbstractActiveTransfer", f = "AbstractActiveTransfer.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "await")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f18620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f18622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f18622c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18621b = obj;
        this.f18623d |= Integer.MIN_VALUE;
        return this.f18622c.b(this);
    }
}
