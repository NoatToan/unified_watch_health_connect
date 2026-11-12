package uk0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import f72.l1;
import gg1.o0;
import gl1.y;
import java.text.NumberFormat;
import p005kotlin.Metadata;
import p13.w;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luk0/b;", "Luk0/e;", "", TtmlNode.ATTR_ID, "nickname", "", "itemCount", "Lb63/o;", "firstUseDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLb63/o;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f171803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.o f171804d;

    public b(String str, String str2, long j8, b63.o oVar) {
        str.getClass();
        str2.getClass();
        oVar.getClass();
        this.f171801a = str;
        this.f171802b = str2;
        this.f171803c = j8;
        this.f171804d = oVar;
    }

    @Override // uk0.e
    public final String a(p3.m mVar) {
        mVar.C(-1063049826);
        x1 x1Var = p3.n.f135158a;
        mVar.f();
        return this.f171802b;
    }

    @Override // uk0.e
    public final String b(p3.m mVar) {
        mVar.C(-710655346);
        x1 x1Var = p3.n.f135158a;
        mVar.f();
        return null;
    }

    @Override // uk0.e
    public final Double c(b63.o oVar) {
        oVar.getClass();
        return null;
    }

    @Override // uk0.e
    public final String d(p3.m mVar) {
        mVar.C(-1506884717);
        x1 x1Var = p3.n.f135158a;
        String strQ = y.Q(mVar, R.string.lbl_gear_collection);
        mVar.f();
        return strQ;
    }

    @Override // uk0.e
    /* JADX INFO: renamed from: e */
    public final boolean getF171825n() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f171801a.equals(bVar.f171801a) && this.f171802b.equals(bVar.f171802b) && this.f171803c == bVar.f171803c && this.f171804d.equals(bVar.f171804d);
    }

    @Override // uk0.e
    public final String f(o0 o0Var, p3.m mVar, int i14) {
        o0Var.getClass();
        mVar.C(-1444297331);
        x1 x1Var = p3.n.f135158a;
        mVar.f();
        return null;
    }

    @Override // uk0.e
    public final i53.c g(p3.m mVar) {
        mVar.C(1794622220);
        x1 x1Var = p3.n.f135158a;
        pi0.e eVar = new pi0.e((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
        q13.b bVarB = w.b();
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        long j8 = this.f171803c;
        String str = integerInstance.format(j8);
        if (j8 == 1) {
            mVar.C(-682440182);
            bVarB.add(y.Q(mVar, R.string.lbl_gear_one_item));
            mVar.f();
        } else {
            mVar.C(-682355242);
            str.getClass();
            bVarB.add(y.P(R.string.lbl_num_items_plural, new Object[]{str}, mVar));
            mVar.f();
        }
        bVarB.add(y.P(R.string.first_use_value, new Object[]{eVar.d(g22.l.h(this.f171804d), qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY)}, mVar));
        i53.c cVarE = i53.a.e(w.a(bVarB));
        mVar.f();
        return cVarE;
    }

    @Override // uk0.e
    public final u4.d getIcon() {
        s62.a.f157643a.getClass();
        return l1.a(t62.c.f162799a);
    }

    @Override // uk0.e
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF171807a() {
        return this.f171801a;
    }

    public final int hashCode() {
        return this.f171804d.f16206a.hashCode() + q6.f.e(wr.g.j(this.f171801a.hashCode() * 31, 31, this.f171802b), 31, this.f171803c);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("CollectionData(id=", this.f171801a, ", nickname=", this.f171802b, ", itemCount=");
        sbI.append(this.f171803c);
        sbI.append(", firstUseDate=");
        sbI.append(this.f171804d);
        sbI.append(")");
        return sbI.toString();
    }
}
