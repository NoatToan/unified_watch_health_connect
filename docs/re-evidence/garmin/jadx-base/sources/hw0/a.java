package hw0;

import android.content.Context;
import b63.o;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import iw0.c;
import j23.g;
import kw0.b;
import kw0.e;
import kw0.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pv0.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001:\u0001\u0013BA\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lhw0/a;", "Luz/a;", "Lkw0/b;", "Lpv0/r;", "Lkw0/f;", "Lkw0/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "Lj23/g;", "Lb63/o;", "dateInterval", "", "isDaily", "overlayType", "showDetailedTypes", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Lj23/g;ZLpv0/r;Z)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends uz.a<b, r, f<e>> {
    static {
        new C1708a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, CustomCombinedChart customCombinedChart, g<o> gVar, boolean z14, r rVar, boolean z15) {
        context.getClass();
        customCombinedChart.getClass();
        gVar.getClass();
        b bVar = b.f106906a;
        super(customCombinedChart, new uz.f(bVar, new c(new pi0.e(context), context, gVar, z14, z15)), new jw0.f(gVar, customCombinedChart, bVar, new jw0.g(customCombinedChart, gVar, z14), z14), new k00.f(customCombinedChart, false, 2, null), null, 24.0f, 16, null);
        b(rVar);
    }

    /* JADX INFO: renamed from: hw0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhw0/a$a;", "", "<init>", "()V", "", "FIXED_Y_AXIS_WIDTH", "F", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1708a {
        public /* synthetic */ C1708a(j jVar) {
            this();
        }

        private C1708a() {
        }
    }

    public /* synthetic */ a(Context context, CustomCombinedChart customCombinedChart, g gVar, boolean z14, r rVar, boolean z15, int i14, j jVar) {
        this(context, customCombinedChart, gVar, z14, rVar, (i14 & 32) != 0 ? false : z15);
    }
}
