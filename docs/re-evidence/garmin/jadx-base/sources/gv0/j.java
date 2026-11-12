package gv0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel$fetchLiveTrackRecipients$1", f = "LiveTrackSettingsViewModel.kt", l = {416, 419, 420, 429}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f79288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z1 f79289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f79290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f79291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z1 f79292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f79293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f79295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f79296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f79297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f79298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f79299l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d dVar, boolean z14, t13.d<? super j> dVar2) {
        super(2, dVar2);
        this.f79298k = dVar;
        this.f79299l = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f79298k, this.f79299l, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    /* JADX WARN: Path cross not found for [B:4:0x000f, B:15:0x005d], limit reached: 64 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d2 -> B:27:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fc -> B:36:0x00ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0117 -> B:40:0x0128). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gv0.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
