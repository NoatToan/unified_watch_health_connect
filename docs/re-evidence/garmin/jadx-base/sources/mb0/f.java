package mb0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmb0/f;", "", "Lmb0/e;", "simpleSleepData", "Lmb0/a;", "advancedSleepData", "Lmb0/d;", "editableSleepData", "Lz80/h;", "doNotDisturbMode", "", "sleepCaptionDoNotDisturb", "<init>", "(Lmb0/e;Lmb0/a;Lmb0/d;Lz80/h;Ljava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f117730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f117731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f117732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z80.h f117733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f117734e;

    public /* synthetic */ f(e eVar, a aVar, d dVar, z80.h hVar, String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? new e(0, 0, 3, null) : eVar, (i14 & 2) != 0 ? new a(0, 0, null, null, false, 31, null) : aVar, (i14 & 4) != 0 ? new d(null, null, null, null, null, 31, null) : dVar, (i14 & 8) != 0 ? z80.h.c.f203058b : hVar, (i14 & 16) != 0 ? "" : str);
    }

    public static f a(f fVar, e eVar, a aVar, d dVar, z80.h hVar, String str, int i14) {
        if ((i14 & 1) != 0) {
            eVar = fVar.f117730a;
        }
        e eVar2 = eVar;
        if ((i14 & 2) != 0) {
            aVar = fVar.f117731b;
        }
        a aVar2 = aVar;
        if ((i14 & 4) != 0) {
            dVar = fVar.f117732c;
        }
        d dVar2 = dVar;
        if ((i14 & 8) != 0) {
            hVar = fVar.f117733d;
        }
        z80.h hVar2 = hVar;
        if ((i14 & 16) != 0) {
            str = fVar.f117734e;
        }
        String str2 = str;
        fVar.getClass();
        eVar2.getClass();
        aVar2.getClass();
        dVar2.getClass();
        hVar2.getClass();
        str2.getClass();
        return new f(eVar2, aVar2, dVar2, hVar2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f117730a, fVar.f117730a) && s.g(this.f117731b, fVar.f117731b) && s.g(this.f117732c, fVar.f117732c) && s.g(this.f117733d, fVar.f117733d) && s.g(this.f117734e, fVar.f117734e);
    }

    public final int hashCode() {
        return this.f117734e.hashCode() + ((this.f117733d.hashCode() + ((this.f117732c.hashCode() + ((this.f117731b.hashCode() + (this.f117730a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SleepUiState(simpleSleepData=");
        sb3.append(this.f117730a);
        sb3.append(", advancedSleepData=");
        sb3.append(this.f117731b);
        sb3.append(", editableSleepData=");
        sb3.append(this.f117732c);
        sb3.append(", doNotDisturbMode=");
        sb3.append(this.f117733d);
        sb3.append(", sleepCaptionDoNotDisturb=");
        return am.j.o(this.f117734e, ")", sb3);
    }

    public f(e eVar, a aVar, d dVar, z80.h hVar, String str) {
        eVar.getClass();
        aVar.getClass();
        dVar.getClass();
        hVar.getClass();
        str.getClass();
        this.f117730a = eVar;
        this.f117731b = aVar;
        this.f117732c = dVar;
        this.f117733d = hVar;
        this.f117734e = str;
    }

    public f() {
        this(null, null, null, null, null, 31, null);
    }
}
