package cr0;

import com.garmin.proto.generated.GDIInstantInput;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements dr0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f55334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f55335c;

    public /* synthetic */ h(i iVar, k kVar, int i14) {
        this.f55333a = i14;
        this.f55334b = iVar;
        this.f55335c = kVar;
    }

    @Override // dr0.f
    public final void a(boolean z14) {
        switch (this.f55333a) {
            case 0:
                i.f55336h.trace("cancelInstantInput isSucceeded = " + z14);
                i iVar = this.f55334b;
                if (z14) {
                    iVar.f55342f = null;
                    iVar.a(1);
                } else {
                    this.f55335c.f55352h = true;
                    iVar.a(1);
                }
                iVar.f55340d = false;
                break;
            case 1:
                i.f55336h.trace("confirmInstantInput isSucceeded = " + z14);
                i iVar2 = this.f55334b;
                if (z14) {
                    iVar2.f55342f = null;
                    iVar2.a(1);
                } else {
                    this.f55335c.f55352h = true;
                    iVar2.a(1);
                }
                iVar2.f55340d = false;
                break;
            default:
                i iVar3 = this.f55334b;
                dr0.a aVar = iVar3.f55338b;
                k kVar = this.f55335c;
                com.garmin.android.library.backgroundtaskmanagement.c.d(new dr0.g(kVar.f55345a, kVar.f55347c, GDIInstantInput.CommandResult.SUCCESS, com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar), null);
                iVar3.f55342f = kVar;
                iVar3.f55343g = null;
                iVar3.a(7);
                break;
        }
    }
}
