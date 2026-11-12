package r91;

import android.content.Context;
import androidx.lifecycle.j1;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.s;
import r53.z1;
import r70.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lr91/k;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/lifecycle/j1;", "savedStateHandle", "Lo91/a;", "personalRecordsRepository", "Lo53/b0;", "coroutineScope", "Lo22/b;", "snackbarUseCase", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/j1;Lo91/a;Lo53/b0;Lo22/b;)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f151427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o91.a f151428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f151429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o22.b f151430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1<aa1.e> f151431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n91.a f151432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f151433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q91.d f151434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.f f151435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e23.a<Unit> f151436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f151437k;

    public k(Context context, j1 j1Var, o91.a aVar, b0 b0Var, o22.b bVar) {
        context.getClass();
        j1Var.getClass();
        aVar.getClass();
        b0Var.getClass();
        bVar.getClass();
        this.f151427a = context;
        this.f151428b = aVar;
        this.f151429c = b0Var;
        this.f151430d = bVar;
        z1<aa1.e> z1VarC = j1Var.c(new aa1.e(false, false, false, null, null, null, null, null, null, null, null, 2047, null), "personalRecordHistoryScreenState");
        this.f151431e = z1VarC;
        this.f151433g = new ArrayList();
        this.f151436j = new n(10);
        this.f151437k = s.d(z1VarC);
    }

    public final Object a(q91.d dVar, com.garmin.android.apps.connectmobile.repcounting.model.f fVar, e23.a aVar, v13.i iVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new i(this, dVar, fVar, aVar, null), iVar);
    }
}
