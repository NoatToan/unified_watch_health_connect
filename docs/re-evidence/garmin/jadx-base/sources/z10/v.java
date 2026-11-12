package z10;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.consent.ChildConsentsFlowActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class v implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChildConsentsFlowActivity f201270b;

    public /* synthetic */ v(ChildConsentsFlowActivity childConsentsFlowActivity, int i14) {
        this.f201269a = i14;
        this.f201270b = childConsentsFlowActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        Parcelable parcelable;
        int i14 = this.f201269a;
        ChildConsentsFlowActivity childConsentsFlowActivity = this.f201270b;
        switch (i14) {
            case 0:
                ChildConsentsFlowActivity.a aVar = ChildConsentsFlowActivity.f32139f;
                Bundle extras = childConsentsFlowActivity.getIntent().getExtras();
                if (extras != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                    } else {
                        Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                        parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
                    }
                    hl.a aVar2 = (hl.a) parcelable;
                    if (aVar2 != null) {
                        return aVar2;
                    }
                }
                return hl.a.c.f84256b;
            case 1:
                ChildConsentsFlowActivity.a aVar3 = ChildConsentsFlowActivity.f32139f;
                hl.a aVarGa = childConsentsFlowActivity.ga();
                hl.a.b bVar = aVarGa instanceof hl.a.b ? (hl.a.b) aVarGa : null;
                if (bVar != null) {
                    ((bv.a) KoinJavaComponent.get$default(bv.a.class, null, null, 6, null)).b(bVar.f84252b, bVar.f84253c);
                }
                childConsentsFlowActivity.ha().x4();
                return Unit.INSTANCE;
            case 2:
                ChildConsentsFlowActivity.a aVar4 = ChildConsentsFlowActivity.f32139f;
                b0 b0VarHa = childConsentsFlowActivity.ha();
                b0VarHa.getClass();
                ge1.b.T(androidx.lifecycle.v1.a(b0VarHa), null, null, new y(b0VarHa, null), 3);
                return Unit.INSTANCE;
            case 3:
                ChildConsentsFlowActivity.a aVar5 = ChildConsentsFlowActivity.f32139f;
                childConsentsFlowActivity.fa();
                return Unit.INSTANCE;
            default:
                ChildConsentsFlowActivity.a aVar6 = ChildConsentsFlowActivity.f32139f;
                childConsentsFlowActivity.ha().y4();
                return Unit.INSTANCE;
        }
    }
}
