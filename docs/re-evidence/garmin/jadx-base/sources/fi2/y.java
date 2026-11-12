package fi2;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "_validState", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class y extends p005kotlin.jvm.internal.w implements e23.l<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f71813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ii2.b f71814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f71815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f71816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, ii2.b bVar, Map<String, ? extends Object> map, boolean z14) {
        super(1);
        this.f71813a = zVar;
        this.f71814b = bVar;
        this.f71815c = map;
        this.f71816d = z14;
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        z zVar = this.f71813a;
        ii2.b bVar = this.f71814b;
        Map<String, Object> map = this.f71815c;
        if (zBooleanValue) {
            z.u(zVar, bVar, map, Boolean.valueOf(this.f71816d), 4);
        } else {
            z.u(zVar, bVar, map, Boolean.FALSE, 4);
        }
        return Unit.INSTANCE;
    }
}
