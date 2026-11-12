package js;

import ch.qos.logback.core.joran.action.Action;
import java.util.concurrent.atomic.AtomicBoolean;
import o53.b0;
import o53.c2;
import p005kotlin.Metadata;
import r53.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljs/b;", "", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function0;", "Lr53/i;", "", "pickedAppPackageNameFlowProvider", "<init>", "(Lo53/b0;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f100588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<i<String>> f100589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f100590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f100591d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(b0 b0Var, e23.a<? extends i<String>> aVar) {
        b0Var.getClass();
        aVar.getClass();
        this.f100588a = b0Var;
        this.f100589b = aVar;
        this.f100591d = new AtomicBoolean(false);
    }

    public final void a() {
        c2 c2Var = this.f100590c;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f100590c = null;
        this.f100591d.set(false);
    }
}
