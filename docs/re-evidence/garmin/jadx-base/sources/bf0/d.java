package bf0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import gs1.t;
import gs1.v;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import yz.k;
import zx0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lbf0/d;", "Lbf0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyz/k;", "timeFormatter", "<init>", "(Landroid/content/Context;Lyz/k;)V", "a", "gcm-domain-heartrate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends bf0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xz.f f17807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xz.f f17808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xz.f f17809m;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, k kVar) {
        super(context, kVar);
        context.getClass();
        kVar.getClass();
        l22.a aVar = new l22.a(context);
        this.f17807k = new xz.f(aVar.getString(R.string.device_screen_heart_rate), null, null, x.k(Integer.valueOf(context.getColor(df0.b.a(0))), Integer.valueOf(context.getColor(df0.b.a(1))), Integer.valueOf(context.getColor(df0.b.a(2))), Integer.valueOf(context.getColor(df0.b.a(3))), Integer.valueOf(context.getColor(df0.b.a(4))), Integer.valueOf(context.getColor(df0.b.a(5)))), new xz.g.e(8.0f), Float.valueOf(60.0f), null, 70, null);
        String string = aVar.getString(R.string.moveiq_lbl);
        Integer numValueOf = Integer.valueOf(context.getColor(R.color.palette_gray_45));
        xz.g.a aVar2 = xz.g.a.f192745a;
        this.f17808l = new xz.f(string, null, numValueOf, null, aVar2, null, null, 106, null);
        this.f17809m = new xz.f(aVar.getString(R.string.activities_channel_name), null, Integer.valueOf(context.getColor(R.color.palette_chart_green_4)), null, aVar2, null, null, 106, null);
    }

    @Override // bf0.a, qz.c
    /* JADX INFO: renamed from: C */
    public final List<xz.f> u(t tVar) {
        Object obj = null;
        if (tVar == null) {
            return null;
        }
        List<xz.f> listU = super.u(tVar);
        ArrayList arrayList = listU != null ? new ArrayList(listU) : new ArrayList();
        if (tVar.t()) {
            arrayList.add(0, this.f17809m);
        }
        ArrayList arrayListC = fs1.b.c(tVar);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayListC) {
            ((v) obj2).f78883a.getClass();
            arrayList2.add(obj2);
        }
        for (Object obj3 : m.e(arrayList2)) {
            if (((v) obj3).f78883a instanceof v.a.c) {
                obj = obj3;
                break;
            }
        }
        if (obj != null) {
            arrayList.add(0, this.f17808l);
        }
        if (tVar.y()) {
            arrayList.add(0, this.f17807k);
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lbf0/d$a;", "", "<init>", "()V", "", "HEART_RATE_LEGEND_ITEM_FORM_SIZE", "F", "HEART_RATE_LEGEND_ITEM_LINE_WIDTH", "gcm-domain-heartrate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
