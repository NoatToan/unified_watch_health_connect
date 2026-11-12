package uk;

import ch.qos.logback.core.CoreConstants;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpj2/k;", "gatt", "Lt13/d;", "Luk/k;", "continuation", "", "open", "(Landroid/content/Context;Lpj2/k;Lt13/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@v13.e(c = "com.dsi.vivoki.antble.gfdi.VivokiGfdiEmulator$Companion", f = "VivokiGfdiEmulator.kt", l = {50}, m = "open")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f171715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f171716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k.b f171717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pj2.k f171718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Logger f171719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k.b bVar, t13.d dVar) {
        super(dVar);
        this.f171717c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171715a = obj;
        this.f171716b |= Integer.MIN_VALUE;
        return this.f171717c.a(null, null, this);
    }
}
