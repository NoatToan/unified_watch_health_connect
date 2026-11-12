package d70;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import m92.y;
import o4.d0;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58109a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f58111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f58112d;

    public /* synthetic */ i(int i14, int i15, long j8, String str) {
        this.f58110b = i14;
        this.f58112d = str;
        this.f58111c = j8;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58109a) {
            case 0:
                ((Integer) obj2).getClass();
                j.a(this.f58110b, this.f58112d, this.f58111c, (p3.m) obj, p0.t(1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    int i14 = this.f58110b;
                    y.b(d0.a(this.f58111c), gl1.y.P(R.string.string_space_bullet_string_pattern, new Object[]{String.valueOf(i14), gl1.y.Q(mVar, i61.a.b(i14))}, mVar), null, null, this.f58112d, null, mVar, 384, 40);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(int i14, String str, long j8) {
        this.f58110b = i14;
        this.f58111c = j8;
        this.f58112d = str;
    }
}
