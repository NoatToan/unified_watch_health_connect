package zt1;

import com.garmin.android.apps.connectmobile.training.atp.create.edit.ATPEditActivity;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ATPEditActivity f206963b;

    public /* synthetic */ a(ATPEditActivity aTPEditActivity, int i14) {
        this.f206962a = i14;
        this.f206963b = aTPEditActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f206962a;
        ATPEditActivity aTPEditActivity = this.f206963b;
        switch (i14) {
            case 0:
                ATPEditActivity.a aVar = ATPEditActivity.f45202g;
                aTPEditActivity.s0();
                return Unit.INSTANCE;
            case 1:
                f fVar = aTPEditActivity.f45204b;
                if (fVar != null) {
                    fVar.y(0);
                    return Unit.INSTANCE;
                }
                s.m("presenter");
                throw null;
            case 2:
                f fVar2 = aTPEditActivity.f45204b;
                if (fVar2 != null) {
                    fVar2.y(1);
                    return Unit.INSTANCE;
                }
                s.m("presenter");
                throw null;
            default:
                f fVar3 = aTPEditActivity.f45204b;
                if (fVar3 != null) {
                    fVar3.y(4);
                    return Unit.INSTANCE;
                }
                s.m("presenter");
                throw null;
        }
    }
}
