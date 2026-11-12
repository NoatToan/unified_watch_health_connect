package i3;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r2 f89476a = new r2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3.e f89477b = new z3.e(1425358052, false, b.f89480a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z3.e f89478c = new z3.e(-1179219109, false, a.f89479a);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.q<c2.t2, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f89479a = new a();

        @Override // e23.q
        public final Unit invoke(c2.t2 t2Var, p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                p3.x1 x1Var = p3.n.f135158a;
                int i14 = l3.n1.f109367b;
                mh.c(l3.k.h(mVar2, R.string.m3c_time_picker_pm), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262142);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements e23.q<c2.t2, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f89480a = new b();

        @Override // e23.q
        public final Unit invoke(c2.t2 t2Var, p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                p3.x1 x1Var = p3.n.f135158a;
                int i14 = l3.n1.f109367b;
                mh.c(l3.k.h(mVar2, R.string.m3c_time_picker_am), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262142);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }
}
