package gn;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lgn/n;", "Ln70/a0;", "Lr53/i;", "Lhn/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj70/d;", "", "data", "<init>", "(Landroid/content/Context;Lr53/i;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements a0<r53.i<? extends hn.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.i<j70.d<String>> f78052b;

    public n(Context context, r53.i<j70.d<String>> iVar) {
        context.getClass();
        iVar.getClass();
        this.f78051a = context;
        this.f78052b = iVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetLastActivityDataUseCase";
    }

    @Override // n70.a0
    public final r53.i<? extends hn.a> invoke() {
        return r53.s.A(new l(this.f78052b, this), s0.f129406a);
    }
}
