package zl;

import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import e92.c;
import java.util.Calendar;
import java.util.Date;
import jo2.f;
import o53.a0;
import o53.c0;
import org.slf4j.Logger;
import p3.m;
import p3.o0;
import t13.g;
import t13.h;
import u53.d;
import zn2.f1;
import zn2.u0;
import zn2.z0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements IFillFormatter, u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205168a;

    public static long a(m mVar) {
        return d92.b.a(mVar).k().b();
    }

    public static c b(o0 o0Var, int i14, o0 o0Var2) {
        o0Var.C(i14);
        return d92.b.a(o0Var2).f();
    }

    public static String c(String str, String str2, String str3, String str4) {
        str.getClass();
        return str2 + str3 + str4;
    }

    public static StringBuilder d(String str, String str2, String str3, boolean z14, String str4) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(str2);
        sb3.append(str3);
        sb3.append(z14);
        sb3.append(str4);
        return sb3;
    }

    public static d e(String str, g gVar) {
        return c0.a(gVar.plus(new a0(str)));
    }

    public static void f(Menu menu, MenuInflater menuInflater, int i14, Menu menu2) {
        menu.getClass();
        menuInflater.getClass();
        menuInflater.inflate(i14, menu2);
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        int i14 = zm.c.f205201y;
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u03.a
    public void run() throws Throwable {
        switch (this.f205168a) {
            case 3:
                Logger logger = z0.f205975h;
                logger.debug("initializing NewFitPayNetworkManager...");
                ge1.b.W(h.f161748a, new z0.e(null));
                logger.debug("initializing NewFitPayTokenManager...");
                f1.f205508a.getClass();
                f.f99840a.getClass();
                f.a();
                return;
            default:
                Logger logger2 = f1.f205511d;
                try {
                    u0.f205864a.getClass();
                    sn2.a aVar = (sn2.a) u0.f().j(l13.a.f108327b).c();
                    if (!(aVar instanceof sn2.a.C3030a)) {
                        logger2.error("loadOAuthToken: failed", (Throwable) aVar.f160419c);
                        NewFitPayException newFitPayException = aVar.f160419c;
                        newFitPayException.getClass();
                        throw newFitPayException;
                    }
                    sn2.b bVar = ((sn2.a.C3030a) aVar).f160417a;
                    jo2.c cVar = null;
                    cVar = null;
                    if ((bVar != null ? bVar.getAccessToken() : null) != null && !TextUtils.isEmpty(bVar.getAccessToken())) {
                        jo2.c.a aVar2 = new jo2.c.a();
                        Long lD = bVar.getAccessTokenExpirationTSMillis();
                        long jLongValue = lD != null ? lD.longValue() : -1L;
                        aVar2.f99834b = jLongValue;
                        Calendar calendar = Calendar.getInstance();
                        calendar.add(13, (int) jLongValue);
                        aVar2.f99835c = calendar.getTime();
                        Long lD2 = bVar.getAccessTokenExpirationTSMillis();
                        aVar2.f99835c = lD2 != null ? new Date(lD2.longValue()) : null;
                        aVar2.a(bVar.getAccessToken());
                        cVar = new jo2.c(aVar2.f99833a, aVar2.f99834b, aVar2.f99835c, aVar2.f99836d, bVar.getExternalAccountId());
                    }
                    f1.f205509b = cVar;
                    return;
                } catch (Exception e4) {
                    logger2.error("loadOAuthToken", (Throwable) e4);
                    return;
                }
        }
    }
}
