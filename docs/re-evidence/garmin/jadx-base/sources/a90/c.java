package a90;

import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import java.net.URL;
import lc.d0;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.koin.core.parameter.ParametersHolderKt;
import org.slf4j.Logger;
import p3.p0;
import s5.w0;
import x5.l0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2016b;

    public /* synthetic */ c(String str, int i14) {
        this.f2015a = i14;
        this.f2016b = str;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f2015a;
        String str = this.f2016b;
        switch (i14) {
            case 0:
                f fVar = f.f2020a;
                return ParametersHolderKt.parametersOf(str);
            case 1:
                az0.b bVar = az0.b.f13670a;
                Request requestBuild = new Request.Builder().url(str).build();
                bz0.o.f22274a.getClass();
                Response responseExecute = bz0.o.j().newCall(requestBuild).execute();
                int iCode = responseExecute.code();
                ResponseBody responseBodyBody = responseExecute.body();
                return new nd2.b(iCode, null, responseBodyBody != null ? responseBodyBody.bytes() : null, 2, null);
            case 2:
                String strConcat = "PAY#NEW_FITPAY#".concat(str);
                int i15 = gt2.c.f79010a;
                return gt2.b.f79005a.h(strConcat);
            case 3:
                String str2 = this.f2016b;
                int length = str2.length();
                return p0.n(new l0(str2, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
            case 4:
                return p0.n(new l0(this.f2016b, 0L, (w0) null, 6, (p005kotlin.jvm.internal.j) null));
            case 5:
                return ParametersHolderKt.parametersOf(str);
            case 6:
                MultiDayActivitiesDetailActivity.a aVar = MultiDayActivitiesDetailActivity.f39233a;
                return ParametersHolderKt.parametersOf(str);
            case 7:
                int i16 = l70.e.f110614w;
                return ParametersHolderKt.parametersOf(str);
            case 8:
                int i17 = l70.e.f110614w;
                return ParametersHolderKt.parametersOf(str);
            case 9:
                return p0.n(str);
            case 10:
                d0.a aVar2 = new d0.a();
                aVar2.f111748a = str;
                return aVar2.a();
            case 11:
                return ParametersHolderKt.parametersOf(str);
            case 12:
                rk2.c.C2901c c2901c = rk2.c.f153359i;
                return str;
            case 13:
                return p0.n(str);
            case 14:
                String str3 = this.f2016b;
                int length2 = str3.length();
                return p0.n(new l0(str3, og.a.l(length2, length2), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
            case 15:
                vc2.c.b bVar2 = vc2.c.f177088e;
                return nd2.e.d(new URL(str));
            case 16:
                Logger logger = yk2.a.f197623c;
                return (ml2.l) da2.d.b().getCapability(str, ml2.l.class);
            default:
                return str;
        }
    }
}
