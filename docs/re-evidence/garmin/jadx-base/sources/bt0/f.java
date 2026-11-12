package bt0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import f12.l;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lbt0/f;", "", "", TtmlNode.ATTR_TTS_COLOR, "Landroid/graphics/drawable/Drawable;", "pointDrawable", "tooltipColorId", "tooltipDrawableId", "", "tooltipSportLabel", "tooltipMetricLabel", "tooltipAverageLabel", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "valueFormatter", "<init>", "(ILandroid/graphics/drawable/Drawable;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/github/mikephil/charting/formatter/ValueFormatter;)V", "a", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f21060g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f21062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21066f;

    public f(int i14, Drawable drawable, int i15, int i16, String str, String str2, String str3, ValueFormatter valueFormatter) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        valueFormatter.getClass();
        this.f21061a = i14;
        this.f21062b = drawable;
        this.f21063c = i15;
        this.f21064d = i16;
        this.f21065e = str;
        this.f21066f = str2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbt0/f$a;", "", "<init>", "()V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: bt0.f$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0296a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21067a;

            static {
                int[] iArr = new int[xs0.b.values().length];
                try {
                    iArr[xs0.b.PACE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[xs0.b.POWER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[xs0.b.POWER_PER_KG.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f21067a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f a(Context context, xs0.b bVar, xs0.a aVar) {
            String strC;
            bVar.getClass();
            boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
            String string = context.getString(R.string.sleep_lbl_average_prefix);
            string.getClass();
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            int[] iArr = C0296a.f21067a;
            int i14 = iArr[bVar.ordinal()];
            if (i14 == 1) {
                ft0.a.f73439a.getClass();
                strC = ft0.a.c(context, aVar, zY, true);
            } else if (i14 == 2) {
                strC = context.getString(R.string.lbl_watts);
                strC.getClass();
            } else if (i14 != 3) {
                strC = context.getString(R.string.lbl_bpm);
                strC.getClass();
            } else {
                strC = context.getString(R.string.lbl_watt_kg);
                strC.getClass();
            }
            String str = strC;
            int i15 = iArr[bVar.ordinal()];
            if (i15 == 1) {
                int color = context.getColor(R.color.palette_blue_26);
                Drawable drawable = context.getDrawable(R.drawable.chart_icon_sport_specific_lt_pace);
                String string2 = context.getString(R.string.lbl_pace);
                string2.getClass();
                return new f(color, drawable, R.color.transparent, R.drawable.chart_icon_sport_specific_lt_pace, string2, str, lowerCase, new yz.j());
            }
            if (i15 == 2) {
                int color2 = context.getColor(R.color.violet_50_static);
                Drawable drawable2 = context.getDrawable(R.drawable.chart_icon_sport_specific_lt_power);
                String string3 = context.getString(R.string.lbl_power_cap);
                string3.getClass();
                ValueFormatter defaultValueFormatter = Utils.getDefaultValueFormatter();
                defaultValueFormatter.getClass();
                return new f(color2, drawable2, R.color.transparent, R.drawable.chart_icon_sport_specific_lt_power, string3, str, lowerCase, defaultValueFormatter);
            }
            if (i15 != 3) {
                int color3 = context.getColor(R.color.palette_ruby_5);
                Drawable drawable3 = context.getDrawable(R.drawable.chart_icon_sport_specific_lt_heart_rate);
                String string4 = context.getString(R.string.lbl_heart_rate_cap);
                string4.getClass();
                ValueFormatter defaultValueFormatter2 = Utils.getDefaultValueFormatter();
                defaultValueFormatter2.getClass();
                return new f(color3, drawable3, R.color.transparent, R.drawable.chart_icon_sport_specific_lt_heart_rate, string4, str, lowerCase, defaultValueFormatter2);
            }
            int color4 = context.getColor(R.color.violet_50_static);
            Drawable drawable4 = context.getDrawable(R.drawable.chart_icon_sport_specific_lt_power_per_weight);
            String string5 = context.getString(R.string.lbl_power_watts_per_kilogram_abbreviation);
            string5.getClass();
            ValueFormatter defaultValueFormatter3 = Utils.getDefaultValueFormatter();
            defaultValueFormatter3.getClass();
            return new f(color4, drawable4, R.color.transparent, R.drawable.chart_icon_sport_specific_lt_power_per_weight, string5, str, lowerCase, defaultValueFormatter3);
        }

        private a() {
        }
    }
}
