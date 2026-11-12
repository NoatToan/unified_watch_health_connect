package fi2;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "_validState", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class x extends p005kotlin.jvm.internal.w implements e23.l<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f71809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f71810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ii2.b f71811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f71812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z14, z zVar, ii2.b bVar, Map<String, ? extends Object> map) {
        super(1);
        this.f71809a = z14;
        this.f71810b = zVar;
        this.f71811c = bVar;
        this.f71812d = map;
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        z zVar = this.f71810b;
        Map<String, Object> map = this.f71812d;
        ii2.b bVar = this.f71811c;
        if (!zBooleanValue) {
            Boolean bool2 = Boolean.FALSE;
            zVar.getClass();
            z.t(bVar, map, bool2, bool2);
        } else if (this.f71809a) {
            Boolean bool3 = Boolean.TRUE;
            zVar.getClass();
            z.t(bVar, map, bool3, bool3);
        } else {
            z.u(zVar, bVar, map, null, 8);
        }
        return Unit.INSTANCE;
    }
}
