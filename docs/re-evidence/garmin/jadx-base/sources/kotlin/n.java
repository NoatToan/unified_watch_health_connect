package kotlin;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.a;
import h5.e0;
import l7.f;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li5/n;", "Landroidx/core/view/a;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f91347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f91348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f91349c;

    public n(m mVar, e0 e0Var, m mVar2) {
        this.f91347a = mVar;
        this.f91348b = e0Var;
        this.f91349c = mVar2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // androidx.core.view.a
    public final void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        m mVar = this.f91347a;
        u uVar = mVar.B;
        u uVar2 = mVar.B;
        if (uVar.m()) {
            fVar.f110563a.setVisibleToUser(false);
        }
        e0 e0Var = this.f91348b;
        e0 e0VarK = e0Var.K();
        while (true) {
            if (e0VarK == null) {
                e0VarK = null;
                break;
            } else if (e0VarK.P.d(8)) {
                break;
            } else {
                e0VarK = e0VarK.K();
            }
        }
        Integer numValueOf = e0VarK != null ? Integer.valueOf(e0VarK.f81761b) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == mVar.getSemanticsOwner().a().f136100f) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        fVar.f110564b = iIntValue;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f110563a;
        m mVar2 = this.f91349c;
        accessibilityNodeInfo.setParent(mVar2, iIntValue);
        int i14 = e0Var.f81761b;
        int iB = uVar2.B.b(i14);
        if (iB != -1) {
            p002j6.a aVarB = k3.b(mVar.getAndroidViewsHandler$ui(), iB);
            if (aVarB != null) {
                accessibilityNodeInfo.setTraversalBefore(aVarB);
            } else {
                accessibilityNodeInfo.setTraversalBefore(mVar2, iB);
            }
            m.M(mVar, i14, accessibilityNodeInfo, uVar2.D);
        }
        int iB2 = uVar2.C.b(i14);
        if (iB2 != -1) {
            p002j6.a aVarB2 = k3.b(mVar.getAndroidViewsHandler$ui(), iB2);
            if (aVarB2 != null) {
                accessibilityNodeInfo.setTraversalAfter(aVarB2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(mVar2, iB2);
            }
            m.M(mVar, i14, accessibilityNodeInfo, uVar2.E);
        }
    }
}
