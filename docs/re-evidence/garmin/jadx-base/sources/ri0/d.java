package ri0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import f12.l;
import java.util.List;
import n70.a0;
import o53.s0;
import p005kotlin.Metadata;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u00060\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lri0/d;", "Ln70/a0;", "Lr53/i;", "Lti0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj70/d;", "", "", "data", "Lf12/l;", "userSettings", "Lyi0/c;", "ftpSport", "<init>", "(Landroid/content/Context;Lr53/i;Lf12/l;Lyi0/c;)V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements a0<i<? extends ti0.a>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f152807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i<j70.d<List<String>>> f152808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f152809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yi0.c f152810d;

    public d(Context context, i<j70.d<List<String>>> iVar, l lVar, yi0.c cVar) {
        context.getClass();
        iVar.getClass();
        lVar.getClass();
        cVar.getClass();
        this.f152807a = context;
        this.f152808b = iVar;
        this.f152809c = lVar;
        this.f152810d = cVar;
    }

    @Override // n70.a0
    public final String getTag() {
        return "GetFtpDataUseCase";
    }

    @Override // n70.a0
    public final i<? extends ti0.a> invoke() {
        return s.A(new a(this.f152808b, this), s0.f129406a);
    }
}
