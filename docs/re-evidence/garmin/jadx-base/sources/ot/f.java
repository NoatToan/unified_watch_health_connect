package ot;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.Marker;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.JsonObject;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p13.t0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lot/f;", "Lot/l;", "Lbu/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ltt/c;", "activityDistanceData", "Lot/x;", "responsiveScreenInfo", "<init>", "(Landroid/content/Context;Ltt/c;Lot/x;)V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends l implements bu.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f133585v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tt.c f133586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f133587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o13.t f133588t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f133589u;

    static {
        new a(null);
        f133585v = f.class.getSimpleName();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, tt.c cVar, x xVar) {
        super(context, xVar);
        context.getClass();
        xVar.getClass();
        this.f133586r = cVar;
        this.f133587s = "ActivityDistanceChapter";
        this.f133588t = o13.m.b(new o72.f(context, 23));
        this.f133589u = "";
    }

    @Override // ot.p
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF133666o() {
        return this.f133587s;
    }

    @Override // ot.p
    /* JADX INFO: renamed from: g */
    public final String getF133658l() {
        return "images/activity_distance";
    }

    @Override // ot.p
    public final LottieComposition h(Context context, o13.p<Integer, Integer> pVar, o13.p<Integer, Integer> pVar2, int i14) {
        List<Double> listD;
        tt.e maxDistanceActivity;
        JsonObject jsonObjectC = c(d(context), pVar, pVar2, i14);
        b(context);
        String string = context.getString(R.string.lbl_activity_distance);
        string.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        pt.i.g(context, jsonObjectC, "Text_Topic", upperCase);
        pt.i iVar = pt.i.f140571a;
        float f14 = this.f133656j;
        String string2 = context.getString(R.string.lbl_activity_distance);
        string2.getClass();
        String upperCase2 = string2.toUpperCase(locale);
        upperCase2.getClass();
        pt.i.b(iVar, context, jsonObjectC, f14, upperCase2);
        s(context, jsonObjectC, this.f133656j);
        String string3 = context.getString(R.string.annual_report_activity_distance_intro_text);
        string3.getClass();
        pt.i.z(jsonObjectC, "intro_layer_name", string3, oe2.f.O(context));
        pt.i.f(jsonObjectC, this.f133656j);
        tt.c cVar = this.f133586r;
        if ((cVar != null ? cVar.getFunFactCount() : null) != null && cVar.getFunFact() != null) {
            pt.i.z(jsonObjectC, "funfact_layer_name", pt.i.i(context, cVar.getFunFactCount().intValue(), cVar.getFunFact()), oe2.f.T(context));
        }
        pt.h hVar = pt.h.f140570a;
        o13.t tVar = this.f133588t;
        hVar.getClass();
        pt.h.k(context, jsonObjectC, (String) tVar.getValue(), "Map_Title_1", "Map_Mask", "Data_Sub", "Text_Date");
        pt.h.k(context, jsonObjectC, (String) tVar.getValue(), "Map_Title_2", "Data_Sub_2", "Text_Date_2");
        if (((cVar == null || (maxDistanceActivity = cVar.getMaxDistanceActivity()) == null) ? null : maxDistanceActivity.getDistance()) == null || cVar.getMaxDistanceActivity().getName() == null || cVar.getMaxDistanceActivity().getStartTimeLocal() == null) {
            JsonObject jsonObjectM = pt.i.m(jsonObjectC, "Data_Sub");
            if (jsonObjectM != null) {
                pt.i.w(jsonObjectM);
            }
            JsonObject jsonObjectM2 = pt.i.m(jsonObjectC, "Data_Sub_2");
            if (jsonObjectM2 != null) {
                pt.i.w(jsonObjectM2);
            }
            JsonObject jsonObjectM3 = pt.i.m(jsonObjectC, "Text_Date");
            if (jsonObjectM3 != null) {
                pt.i.w(jsonObjectM3);
            }
            JsonObject jsonObjectM4 = pt.i.m(jsonObjectC, "Text_Date_2");
            if (jsonObjectM4 != null) {
                pt.i.w(jsonObjectM4);
            }
        } else {
            String strB = pt.h.b(Integer.valueOf((int) cVar.getMaxDistanceActivity().getDistance().doubleValue()), context);
            pt.i.y(jsonObjectC, "Data_Sub", strB);
            pt.i.y(jsonObjectC, "Data_Sub_2", strB);
            String name = cVar.getMaxDistanceActivity().getName();
            String strA = pt.h.a(cVar.getMaxDistanceActivity().getStartTimeLocal());
            x0 x0Var = x0.f105818a;
            String string4 = context.getString(R.string.string_space_dot_space_string_pattern);
            string4.getClass();
            String str = String.format(string4, Arrays.copyOf(new Object[]{name, strA}, 2));
            pt.i.z(jsonObjectC, "Text_Date", str, oe2.f.T(context));
            pt.i.z(jsonObjectC, "Text_Date_2", str, oe2.f.T(context));
        }
        pt.n nVar = pt.n.f140581a;
        String string5 = context.getString(R.string.annual_report_activity_distance_chart_title);
        string5.getClass();
        Typeface typefaceS = oe2.f.S(context);
        nVar.getClass();
        pt.n.e(jsonObjectC, string5, typefaceS);
        if (cVar != null && (listD = cVar.d()) != null) {
            pt.n.d(context, jsonObjectC, listD, new c(context, 1));
            pt.n.b(listD, jsonObjectC);
        }
        pt.n.a(jsonObjectC, oe2.f.T(context));
        String string6 = jsonObjectC.toString();
        string6.getClass();
        byte[] bytes = string6.getBytes(d53.c.f57666b);
        bytes.getClass();
        return LottieCompositionFactory.fromJsonInputStreamSync(new ByteArrayInputStream(bytes), null).getValue();
    }

    @Override // ot.p
    public final void i(Context context, LottieDrawable lottieDrawable) {
        Object next;
        List<Double> listD;
        pt.i iVar = pt.i.f140571a;
        String string = context.getString(R.string.lbl_activity_distance);
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        iVar.getClass();
        pt.i.d(lottieDrawable, "Text_Topic", upperCase);
        ArrayList arrayList = new ArrayList();
        tt.c cVar = this.f133586r;
        if ((cVar != null ? cVar.getFunFactCount() : null) == null || cVar.getFunFactCount().intValue() < 1 || cVar.getFunFact() == null) {
            Iterator it = this.f133650d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((Marker) next).getName(), "Funfact"));
            Marker marker = (Marker) next;
            if (marker != null) {
                arrayList.add(marker);
            }
        }
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new i(context, this, lottieDrawable, arrayList, null), 3);
        if (cVar != null && (listD = cVar.d()) != null) {
            pt.n nVar = pt.n.f140581a;
            Integer numValueOf = Integer.valueOf(context.getColor(R.color.gcm_annual_report_activity_distance_month_bar));
            c cVar3 = new c(context, 2);
            nVar.getClass();
            pt.n.c(context, numValueOf, lottieDrawable, listD, cVar3);
        }
        p(context, lottieDrawable, t0.b(new o13.p("image_1", "bg_icon.png")));
    }

    @Override // ot.l
    public final tt.m j() {
        return tt.m.ACTIVITY_DISTANCE;
    }

    @Override // ot.l
    public final Map<String, String> l() {
        return t0.b(new o13.p("image_0", "sharing_bg.png"));
    }

    @Override // ot.l
    public final Object m(Context context, yt.o oVar) throws Throwable {
        List<Double> listD;
        tt.e maxDistanceActivity;
        List<Double> listD2;
        LottieDrawable lottieDrawable = new LottieDrawable();
        JsonObject jsonObjectK = k(context, this, "sharing.json");
        tt.c cVar = this.f133586r;
        if (jsonObjectK != null) {
            s(context, jsonObjectK, 0.0f);
            if (cVar != null && (listD2 = cVar.d()) != null) {
                pt.u.f140605a.getClass();
                pt.u.c(listD2, jsonObjectK);
            }
            if (((cVar == null || (maxDistanceActivity = cVar.getMaxDistanceActivity()) == null) ? null : maxDistanceActivity.getDistance()) == null || cVar.getMaxDistanceActivity().getName() == null || cVar.getMaxDistanceActivity().getStartTimeLocal() == null) {
                JsonObject jsonObjectM = pt.i.m(jsonObjectK, "Data_Sub");
                if (jsonObjectM != null) {
                    pt.i.w(jsonObjectM);
                }
                JsonObject jsonObjectM2 = pt.i.m(jsonObjectK, "Text_Date");
                if (jsonObjectM2 != null) {
                    pt.i.w(jsonObjectM2);
                }
                JsonObject jsonObjectM3 = pt.i.m(jsonObjectK, "Text_Sub");
                if (jsonObjectM3 != null) {
                    pt.i.w(jsonObjectM3);
                }
            } else {
                pt.h hVar = pt.h.f140570a;
                Integer numValueOf = Integer.valueOf((int) cVar.getMaxDistanceActivity().getDistance().doubleValue());
                hVar.getClass();
                pt.i.y(jsonObjectK, "Data_Sub", pt.h.b(numValueOf, context));
                pt.i.y(jsonObjectK, "Text_Date", pt.h.e(context, jsonObjectK, cVar.getMaxDistanceActivity().getName(), pt.h.a(cVar.getMaxDistanceActivity().getStartTimeLocal()), oe2.f.T(context)));
            }
        }
        q(context, jsonObjectK, lottieDrawable);
        if (cVar != null && (listD = cVar.d()) != null) {
            pt.u.f140605a.getClass();
            pt.u.b(lottieDrawable, listD);
            Iterator<T> it = listD.iterator();
            if (!it.hasNext()) {
                c22.t.g();
                return null;
            }
            double dDoubleValue = ((Number) it.next()).doubleValue();
            while (it.hasNext()) {
                dDoubleValue = Math.max(dDoubleValue, ((Number) it.next()).doubleValue());
            }
            pt.h hVar2 = pt.h.f140570a;
            Double dValueOf = Double.valueOf(dDoubleValue);
            hVar2.getClass();
            String strB = pt.h.b(dValueOf, context);
            pt.i.f140571a.getClass();
            pt.i.d(lottieDrawable, "Highlight_count_value", strB);
        }
        pt.i iVar = pt.i.f140571a;
        String string = context.getString(R.string.lbl_activity_distance);
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        iVar.getClass();
        pt.i.d(lottieDrawable, "Text_Topic", upperCase);
        String string2 = context.getString(R.string.annual_report_activity_distance_longest_activity_title);
        string2.getClass();
        pt.i.d(lottieDrawable, "Text_Sub", string2);
        Object objO = o(context, p13.w.c(new l.a(this, lottieDrawable, "ActivityDistanceChapter")), oVar);
        return objO == u13.a.COROUTINE_SUSPENDED ? objO : Unit.INSTANCE;
    }

    @Override // ot.l
    public final boolean n() {
        return (this.f133586r == null || e() == null) ? false : true;
    }

    public final String r() {
        return vb.h.h(System.identityHashCode(this), f133585v, "@");
    }

    public final void s(Context context, JsonObject jsonObject, float f14) {
        Double totalDistance;
        tt.c cVar = this.f133586r;
        if (cVar == null || (totalDistance = cVar.getTotalDistance()) == null) {
            return;
        }
        double dDoubleValue = totalDistance.doubleValue();
        pt.h hVar = pt.h.f140570a;
        Integer numValueOf = Integer.valueOf((int) dDoubleValue);
        hVar.getClass();
        pt.h.j(context, jsonObject, pt.h.b(numValueOf, context), 322.0f - f14);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007¨\u0006\u001b"}, d2 = {"Lot/f$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "DISTANCE_SHARE_IMAGE_FILE_NAME", "", "REPOSITION_TEXT_LINE_THRESHOLD", "I", "DISTANCE_MAP_VIEW_IMAGE_FILE_NAME_PREFIX", "MAP_TITLE_1", "DISTANCE_MAP_VIEW_IMAGE_LAYER", "DISTANCE_MAP_VIEW_MASK_LAYER", "DISTANCE_MAP_VIEW_DISTANCE", "DISTANCE_MAP_VIEW_NAME_DATE", "MAP_TITLE_2", "DISTANCE_MAP_VIEW_DISTANCE_2", "DISTANCE_MAP_VIEW_NAME_DATE_2", "DISTANCE_MAP_VIEW_IMAGE_ID", "DISTANCE_SHARE_IMAGE_LONGEST_ACTIVITY", "DISTANCE_MAP_VIEW_RESOLUTION_WIDTH", "DISTANCE_MAP_VIEW_RESOLUTION_HEIGHT", "DISTANCE_MARKER_HIDE_MAP_VIEW", "DISTANCE_MARKER_SHOW_MAP_VIEW", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
