package nm;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import o4.d0;
import o4.f0;
import p005kotlin.Metadata;
import p13.j0;
import p13.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnm/m;", "Lnm/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "mainChartData", "overlayChartData", "", "hasComparisonData", "isFullscreen", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;ZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f126542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f126543f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, zm.p pVar, zm.p pVar2, boolean z14, boolean z15) {
        super(context, pVar, pVar2);
        context.getClass();
        pVar.getClass();
        this.f126542e = z14;
        this.f126543f = z15;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    @Override // nm.b
    public final i53.c<j82.f> b() {
        d0 d0VarA;
        String string;
        zm.p pVar = this.f126528c;
        if (pVar == null) {
            return j53.l.b();
        }
        Context context = this.f126526a;
        Resources resources = context.getResources();
        resources.getClass();
        zm.p pVar2 = this.f126527b;
        String strB = km.d.b(resources, pVar2.getF113498h1());
        Resources resources2 = context.getResources();
        resources2.getClass();
        String strB2 = km.d.b(resources2, pVar.getF113498h1());
        int f113498h1 = pVar.getF113498h1();
        if (f113498h1 != 1) {
            if (f113498h1 != 5) {
                if (f113498h1 != 50 && f113498h1 != 52) {
                    switch (f113498h1) {
                        case 61:
                        case 62:
                        case 63:
                            d0VarA = d0.a(f0.b(a7.b.getColor(context, R.color.palette_berry_4)));
                            break;
                        case 64:
                            d0VarA = d0.a(f0.b(a7.b.getColor(context, R.color.palette_delta_2)));
                            break;
                        default:
                            d0VarA = null;
                            break;
                    }
                } else {
                    d0VarA = d0.a(f0.b(a7.b.getColor(context, R.color.palette_delta_2)));
                }
            } else {
                d0VarA = d0.a(f0.b(a7.b.getColor(context, R.color.palette_berry_4)));
            }
        } else {
            d0VarA = d0.a(f0.b(a7.b.getColor(context, R.color.palette_delta_2)));
        }
        q13.b bVarB = w.b();
        if (strB.length() > 0) {
            bVarB.add(new j82.f(strB, new j82.g.a(f0.b(a7.b.getColor(context, R.color.palette_gray_3)), null), null, 4, null));
        }
        if (this.f126542e) {
            Resources resources3 = context.getResources();
            resources3.getClass();
            int f113498h2 = pVar2.getF113498h1();
            if (f113498h2 == 1) {
                string = resources3.getString(R.string.lbl_target_pace);
                string.getClass();
            } else if (f113498h2 != 5) {
                switch (f113498h2) {
                    case 61:
                        string = resources3.getString(R.string.activity_details_power_per_weight);
                        string.getClass();
                        break;
                    case 62:
                        string = resources3.getString(R.string.split_average_power, resources3.getString(R.string.lbl_watts));
                        string.getClass();
                        break;
                    case 63:
                        string = resources3.getString(R.string.split_average_power, resources3.getString(R.string.lbl_watt_kg));
                        string.getClass();
                        break;
                    default:
                        string = "";
                        break;
                }
            } else {
                string = resources3.getString(R.string.activity_details_power);
                string.getClass();
            }
            bVarB.add(new j82.f(string, new j82.g.l(f0.b(a7.b.getColor(context, R.color.gcm_chart_legend_related_color)), null), null, 4, null));
        }
        if (strB2.length() > 0 && d0VarA != null) {
            bVarB.add(new j82.f(strB2, new j82.g.a(d0VarA.f128833a, null), null, 4, null));
        }
        return i53.a.e(w.a(bVarB));
    }

    @Override // nm.b
    public final List<Integer> c() {
        return j0.f134944a;
    }

    @Override // nm.b
    public final boolean d() {
        zm.p pVar = this.f126528c;
        return pVar != null && this.f126543f && km.d.a(this.f126527b.getF113498h1(), pVar.getF113498h1());
    }
}
