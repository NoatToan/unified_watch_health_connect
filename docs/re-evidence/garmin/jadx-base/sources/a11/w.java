package a11;

import i3.mc;
import i3.pc;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f395a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f401g;

    public /* synthetic */ w(b63.v vVar, b63.v vVar2, b63.v vVar3, boolean z14, String[] strArr, boolean z15) {
        this.f398d = vVar;
        this.f399e = vVar2;
        this.f400f = vVar3;
        this.f396b = z14;
        this.f401g = strArr;
        this.f397c = z15;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f395a) {
            case 0:
                return new o21.c((b63.v) this.f398d, (b63.v) this.f399e, (b63.v) this.f400f, this.f396b, (String[]) this.f401g, this.f397c);
            default:
                return new mc(this.f396b, (e23.a) this.f398d, (e23.a) this.f399e, (pc) this.f400f, (e23.l) this.f401g, this.f397c);
        }
    }

    public /* synthetic */ w(boolean z14, e23.a aVar, e23.a aVar2, pc pcVar, e23.l lVar, boolean z15) {
        this.f396b = z14;
        this.f398d = aVar;
        this.f399e = aVar2;
        this.f400f = pcVar;
        this.f401g = lVar;
        this.f397c = z15;
    }
}
