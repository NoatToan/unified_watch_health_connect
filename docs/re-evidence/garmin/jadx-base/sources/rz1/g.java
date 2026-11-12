package rz1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import hd1.k0;
import j70.j;
import n70.a0;
import o13.p;
import o53.s0;
import p005kotlin.Metadata;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012*\u0010\u000b\u001a&\u0012\"\u0012 \u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00060\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lrz1/g;", "Ln70/a0;", "Lr53/i;", "Lrz1/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj70/j;", "Lo13/p;", "", "", "Lhd1/k0;", "data", "<init>", "(Landroid/content/Context;Lr53/i;)V", "gcm-training-readiness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements a0<i<? extends h>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f155228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i<j<p<String, Boolean>, k0>> f155229b;

    public g(Context context, i<j<p<String, Boolean>, k0>> iVar) {
        context.getClass();
        iVar.getClass();
        this.f155228a = context;
        this.f155229b = iVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetTrainingReadinessKeyStatsDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends h> invoke() {
        return s.A(new e(this.f155229b, this), s0.f129406a);
    }
}
