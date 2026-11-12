package rz0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.newsfeed.view.NewsFeedEmptyView;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import p3.y3;
import ro0.g;
import u4.d;
import z02.b;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewsFeedEmptyView.a f155209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f155210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NewsFeedEmptyView f155211d;

    public /* synthetic */ a(NewsFeedEmptyView.a aVar, String str, NewsFeedEmptyView newsFeedEmptyView, int i14) {
        this.f155208a = i14;
        this.f155209b = aVar;
        this.f155210c = str;
        this.f155211d = newsFeedEmptyView;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f155208a;
        NewsFeedEmptyView newsFeedEmptyView = this.f155211d;
        NewsFeedEmptyView.a aVar = this.f155209b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = NewsFeedEmptyView.f39537c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    b.a(false, null, null, null, false, f.c(18656476, new a(aVar, this.f155210c, newsFeedEmptyView, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = NewsFeedEmptyView.f39537c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean z14 = aVar.f39546c;
                    int i18 = aVar.f39545b;
                    String str = this.f155210c;
                    if (z14) {
                        mVar2.C(1744354265);
                        d dVar = aVar.f39544a;
                        y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                        String string = ((Context) mVar2.A(y3Var)).getString(i18);
                        String string2 = ((Context) mVar2.A(y3Var)).getString(R.string.lbl_review_suggestions);
                        boolean zR = mVar2.r(newsFeedEmptyView);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new g(newsFeedEmptyView, 8);
                            mVar2.K(objQ);
                        } else {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new g(newsFeedEmptyView, 8);
                                mVar2.K(objQ);
                            }
                        }
                        b82.n.d(dVar, string, str, null, string2, (e23.a) objQ, null, null, mVar2, 0, 200);
                        mVar2.f();
                    } else {
                        mVar2.C(1744873484);
                        b82.n.c(aVar.f39544a, ((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b)).getString(i18), str, null, null, mVar2, 0, 24);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
