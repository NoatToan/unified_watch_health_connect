package wr1;

import gs1.t;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lwr1/a;", "Lg32/b;", "Lgs1/t;", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements g32.b<t> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f186796b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ir1.a f186797c = (ir1.a) KoinJavaComponent.get$default(ir1.a.class, null, null, 6, null);

    private a() {
    }

    @Override // g32.b
    public final boolean a() {
        return f186797c.a();
    }

    @Override // g32.b
    public final boolean b() {
        return f186797c.d();
    }

    @Override // g32.b
    public final boolean c(t tVar) {
        gs1.e allDayStressDTO;
        gs1.e.c payload;
        ArrayList arrayListG;
        t tVar2 = tVar;
        return (tVar2 == null || (allDayStressDTO = tVar2.getAllDayStressDTO()) == null || (payload = allDayStressDTO.getPayload()) == null || (arrayListG = payload.g()) == null || arrayListG.isEmpty()) ? false : true;
    }

    @Override // g32.b
    public final void d() {
        f186797c.c();
    }

    @Override // g32.b
    public final void e() {
        f186797c.b();
    }
}
