package u7;

import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class l0 extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f169183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(File file) {
        super(0);
        this.f169183a = file;
    }

    @Override // e23.a
    public final Unit invoke() {
        k0.f169175d.getClass();
        Object obj = k0.f169177f;
        File file = this.f169183a;
        synchronized (obj) {
            k0.f169176e.remove(file.getAbsolutePath());
        }
        return Unit.INSTANCE;
    }
}
