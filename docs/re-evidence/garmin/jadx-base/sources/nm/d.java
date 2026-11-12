package nm;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import o4.f0;
import p005kotlin.Metadata;
import p13.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnm/d;", "Lnm/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "mainChartData", "overlayChartData", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126538a;

        static {
            int[] iArr = new int[im.n.values().length];
            try {
                iArr[im.n.AUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[im.n.LUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f126538a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, zm.p pVar, zm.p pVar2) {
        super(context, pVar, pVar2);
        context.getClass();
        pVar.getClass();
    }

    @Override // nm.b
    public final i53.c<j82.f> b() {
        zm.p pVar = this.f126529d;
        lm.c cVar = pVar instanceof lm.c ? (lm.c) pVar : null;
        im.n nVar = cVar != null ? cVar.X : null;
        int i14 = nVar == null ? -1 : a.f126538a[nVar.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? i53.a.a(e(R.string.activity_details_seated, R.color.gds_data_viz_orange_primary), e(R.string.activity_details_standing, R.color.gds_data_viz_teal_primary)) : i53.a.a(e(R.string.lbl_lowered, R.color.gds_data_viz_purple_primary), e(R.string.lbl_upright, R.color.gds_data_viz_yellow_primary), e(R.string.activity_details_standing, R.color.gds_data_viz_teal_primary));
        }
        return i53.a.a(e(R.string.lbl_aero, R.color.gds_data_viz_violet_primary), e(R.string.lbl_upright, R.color.gds_data_viz_yellow_primary), e(R.string.activity_details_standing, R.color.gds_data_viz_teal_primary));
    }

    @Override // nm.b
    public final List<Integer> c() {
        return w.c(28);
    }

    @Override // nm.b
    public final boolean d() {
        return this.f126529d != null;
    }

    public final j82.f e(int i14, int i15) {
        Context context = this.f126526a;
        String string = context.getString(i14);
        string.getClass();
        return new j82.f(string, new j82.g.a(f0.b(a7.b.getColor(context, i15)), null), null, 4, null);
    }
}
