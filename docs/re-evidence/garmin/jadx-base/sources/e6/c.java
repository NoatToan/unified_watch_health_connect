package e6;

import a42.y;
import androidx.compose.ui.tooling.PreviewActivity;
import d81.h;
import e23.p;
import i3.kb;
import java.util.Arrays;
import p005kotlin.Unit;
import p3.a2;
import p3.m;
import p3.n;
import p3.n1;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63142a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f63143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f63144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object[] f63145d;

    public /* synthetic */ c(String str, String str2, Object[] objArr) {
        this.f63143b = str;
        this.f63144c = str2;
        this.f63145d = objArr;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63142a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i14 = PreviewActivity.f6058a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    Object objQ = mVar.q();
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a2(0);
                        mVar.K(objQ);
                    }
                    n1 n1Var = (n1) objQ;
                    Object[] objArr = this.f63145d;
                    kb.a(null, null, null, null, f.c(-531963740, new h(15, objArr, n1Var), mVar), 0, 0L, 0L, null, f.c(993072492, new y(this.f63143b, this.f63144c, objArr, n1Var, 22), mVar), mVar, 805330944, 495);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i15 = PreviewActivity.f6058a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    a aVar = a.f63139a;
                    Object[] objArr2 = this.f63145d;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
                    aVar.getClass();
                    a.c(this.f63143b, this.f63144c, mVar2, objArrCopyOf);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(Object[] objArr, String str, String str2) {
        this.f63145d = objArr;
        this.f63143b = str;
        this.f63144c = str2;
    }
}
