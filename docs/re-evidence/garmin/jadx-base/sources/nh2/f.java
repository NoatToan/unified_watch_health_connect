package nh2;

import ch.qos.logback.classic.Logger;
import e23.l;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import q03.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class f extends w implements l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f126178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s<List<Map<String, Object>>> f126179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<Map<String, Object>> f126180c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, s<List<Map<String, Object>>> sVar, List<Map<String, Object>> list) {
        super(1);
        this.f126178a = dVar;
        this.f126179b = sVar;
        this.f126180c = list;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        hi2.d dVar = this.f126178a.f126161a;
        Logger logger = hi2.d.f83889c;
        dVar.getClass();
        ((e13.a.C1312a) this.f126179b).c(this.f126180c);
        return Unit.INSTANCE;
    }
}
