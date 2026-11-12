package gz;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u0001:\u0002#$B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0016\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\r2\u0016\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0011\u001a\u00020\r2\u0016\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001c\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001d\u0010\u0017R\"\u0010 \u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u001b¨\u0006%"}, d2 = {"Lgz/c;", "Lgz/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", TtmlNode.TAG_LAYOUT, "Lgz/f;", "markerValueFormatter", "<init>", "(Landroid/content/Context;ILgz/f;)V", "", "", "additionalValue", "", "setAdditionalValueOne", "(Ljava/util/Map$Entry;)V", "setAdditionalValueTwo", "setAdditionalValueThree", TtmlNode.ATTR_TTS_COLOR, "setMarkerSecondChartValueColor", "(I)V", "value", "setOverlayValueLabel", "(Ljava/lang/String;)V", "", "enabled", "setComputeDifference", "(Z)V", "setSecondValueLabel", "setExtraMarkerLabelValue", "m", "Z", "isDoubleLongPress", "()Z", "setDoubleLongPress", "b", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class c extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f80362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f80363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f80364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f80365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f80366k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f80367l;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean isDoubleLongPress;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f80369n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f80370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f80371p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f80372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f80373r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f80374t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f80375v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f80376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f80377x;

    public interface b {
        void a(int i14);

        void b(int i14, int i15);
    }

    static {
        new a(null);
    }

    public c(Context context, int i14, f fVar) {
        super(context, i14, fVar);
        this.f80369n = -1.0f;
        this.f80370o = -1;
        this.f80371p = -1.0f;
        this.f80372q = -1;
        this.f80373r = -1.0f;
        this.f80374t = -1.0f;
        this.f80375v = -1.0f;
        this.f80376w = -1.0f;
        setWillNotDraw(false);
        View viewFindViewById = findViewById(R.id.overlay_value_label);
        TextView textView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
        this.f80362g = textView;
        if (textView != null) {
            textView.setVisibility(this.f80366k ? 0 : 8);
        }
        View viewFindViewById2 = findViewById(R.id.second_value_label);
        this.f80363h = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
        View viewFindViewById3 = findViewById(R.id.extra_marker_label);
        this.f80364i = viewFindViewById3 instanceof TextView ? (TextView) viewFindViewById3 : null;
    }

    private final void setAdditionalValueOne(Map.Entry<String, String> additionalValue) {
        View viewFindViewById = findViewById(R.id.additional_row_one_layout);
        viewFindViewById.setVisibility(0);
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.row_label);
        viewFindViewById2.getClass();
        ((TextView) viewFindViewById2).setText(additionalValue.getKey());
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.row_value);
        viewFindViewById3.getClass();
        ((TextView) viewFindViewById3).setText(additionalValue.getValue());
    }

    private final void setAdditionalValueThree(Map.Entry<String, String> additionalValue) {
        View viewFindViewById = findViewById(R.id.additional_row_three_layout);
        viewFindViewById.setVisibility(0);
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.row_label);
        viewFindViewById2.getClass();
        ((TextView) viewFindViewById2).setText(additionalValue.getKey());
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.row_value);
        viewFindViewById3.getClass();
        ((TextView) viewFindViewById3).setText(additionalValue.getValue());
    }

    private final void setAdditionalValueTwo(Map.Entry<String, String> additionalValue) {
        View viewFindViewById = findViewById(R.id.additional_row_two_layout);
        viewFindViewById.setVisibility(0);
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.row_label);
        viewFindViewById2.getClass();
        ((TextView) viewFindViewById2).setText(additionalValue.getKey());
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.row_value);
        viewFindViewById3.getClass();
        ((TextView) viewFindViewById3).setText(additionalValue.getValue());
    }

    public final void c(int i14, boolean z14) {
        float f14 = this.f80373r;
        float f15 = this.f80374t;
        l3.a aVar = l3.f23124b;
        aVar.getClass();
        this.f80371p = l3.a.c(f14);
        float fC = l3.a.c(f15);
        float f16 = this.f80371p;
        float f17 = z14 ? f16 - fC : fC - f16;
        float f18 = this.f80375v;
        float f19 = this.f80376w;
        aVar.getClass();
        this.f80371p = l3.a.c(f18);
        float fC2 = l3.a.c(f19);
        float f22 = this.f80371p;
        float f24 = z14 ? f22 - fC2 : fC2 - f22;
        int i15 = this.f80370o;
        String strE = z14 ? e(i14, i15) : e(i15, i14);
        if (getMMarkerValueFormatter() != null) {
            f mMarkerValueFormatter = getMMarkerValueFormatter();
            mMarkerValueFormatter.getClass();
            String strA = mMarkerValueFormatter.a(f17, true);
            f mMarkerValueFormatter2 = getMMarkerValueFormatter();
            mMarkerValueFormatter2.getClass();
            String strA2 = mMarkerValueFormatter2.a(f24, false);
            x0 x0Var = x0.f105818a;
            setValueLabel(String.format("%s / %s", Arrays.copyOf(new Object[]{strA, strA2}, 2)));
            setOverlayValueLabel(null);
            setTimeLabel(strE);
        }
    }

    public final void d(boolean z14) {
        TextView textView = this.f80363h;
        if (textView != null) {
            textView.setVisibility(z14 ? 0 : 8);
        }
    }

    @Override // gz.e, com.github.mikephil.chartingv2.components.MarkerView
    public void draw(Canvas canvas, float f14, float f15) {
        canvas.getClass();
        if (!this.isDoubleLongPress) {
            super.draw(canvas, f14, f15);
            return;
        }
        float f16 = this.f80369n;
        if (f16 == -1.0f) {
            this.f80369n = f14;
        } else {
            if (f16 == f14) {
                return;
            }
            super.draw(canvas, (f16 + f14) / 2, getDefaultPaddingSmall());
            this.f80369n = -1.0f;
        }
    }

    public final String e(int i14, int i15) {
        if (getMMarkerValueFormatter() == null) {
            return null;
        }
        f mMarkerValueFormatter = getMMarkerValueFormatter();
        mMarkerValueFormatter.getClass();
        String strC = mMarkerValueFormatter.c(i14);
        f mMarkerValueFormatter2 = getMMarkerValueFormatter();
        mMarkerValueFormatter2.getClass();
        String strC2 = mMarkerValueFormatter2.c(i15);
        x0 x0Var = x0.f105818a;
        return String.format("%s - %s", Arrays.copyOf(new Object[]{strC, strC2}, 2));
    }

    public void f(String str, String str2, String str3, String str4) {
        setValueLabel(str);
        setSecondValueLabel(str2);
        setOverlayValueLabel(str3);
        setTimeLabel(str4);
    }

    public final void g(String str, String str2, String str3, LinkedHashMap<String, String> linkedHashMap) {
        setValueLabel(str);
        setOverlayValueLabel(str2);
        setTimeLabel(str3);
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            findViewById(R.id.additional_row_one_layout).setVisibility(8);
            findViewById(R.id.additional_row_two_layout).setVisibility(8);
            findViewById(R.id.additional_row_three_layout).setVisibility(8);
            return;
        }
        int i14 = 0;
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            entry.getClass();
            Map.Entry<String, String> entry2 = entry;
            if (i14 == 0) {
                setAdditionalValueOne(entry2);
            } else if (i14 == 1) {
                setAdditionalValueTwo(entry2);
            } else if (i14 == 2) {
                setAdditionalValueThree(entry2);
            }
            i14++;
        }
    }

    @Override // gz.e, com.github.mikephil.chartingv2.components.MarkerView
    public void refreshContent(Entry entry, Highlight highlight) {
        b bVar;
        String strE;
        float f14;
        String strE2;
        if (entry == null || (bVar = this.f80365j) == null) {
            return;
        }
        if (this.f80366k) {
            bVar.a(entry.getXIndex());
            return;
        }
        if (!this.isDoubleLongPress) {
            bVar.a(entry.getXIndex());
            return;
        }
        if (this.f80370o == -1) {
            this.f80370o = entry.getXIndex();
            this.f80371p = entry.getVal();
            return;
        }
        int xIndex = entry.getXIndex();
        float val = entry.getVal();
        if (this.f80367l) {
            int i14 = this.f80370o;
            if (i14 != xIndex) {
                float f15 = this.f80371p;
                if (i14 >= xIndex) {
                    f14 = f15 - val;
                    strE2 = e(xIndex, i14);
                } else {
                    f14 = val - f15;
                    strE2 = e(i14, xIndex);
                }
                setTimeLabel(strE2);
                if (getMMarkerValueFormatter() != null) {
                    f mMarkerValueFormatter = getMMarkerValueFormatter();
                    mMarkerValueFormatter.getClass();
                    setValueLabel(mMarkerValueFormatter.b(f14));
                }
            } else if (i14 == xIndex) {
                int i15 = this.f80377x;
                if (i15 % 2 == 0) {
                    this.f80370o = -1;
                    this.f80373r = this.f80371p;
                    this.f80371p = -1.0f;
                    this.f80372q = xIndex;
                    this.f80375v = val;
                    this.f80377x = i15 + 1;
                } else {
                    this.f80377x = i15 + 1;
                    this.f80374t = this.f80371p;
                    this.f80376w = val;
                    int i16 = this.f80372q;
                    this.f80370o = i16;
                    if (i16 >= xIndex) {
                        c(xIndex, true);
                    } else {
                        c(xIndex, false);
                    }
                }
            }
        } else {
            b bVar2 = this.f80365j;
            if (bVar2 != null) {
                int i17 = this.f80370o;
                if (xIndex > i17) {
                    bVar2.b(i17, xIndex);
                    strE = e(this.f80370o, xIndex);
                } else {
                    bVar2.b(xIndex, i17);
                    strE = e(xIndex, this.f80370o);
                }
            } else {
                strE = "";
            }
            setTimeLabel(strE);
        }
        this.f80370o = -1;
        this.f80371p = -1.0f;
    }

    public final void setComputeDifference(boolean enabled) {
        this.f80367l = enabled;
    }

    public final void setDoubleLongPress(boolean z14) {
        this.isDoubleLongPress = z14;
    }

    public final void setExtraMarkerLabelValue(String value) {
        e.b(this.f80364i, value);
    }

    public final void setMarkerSecondChartValueColor(int color) {
        TextView textView = this.f80363h;
        if (textView != null) {
            textView.setTextColor(getContext().getColor(color));
        }
    }

    public final void setOverlayValueLabel(String value) {
        e.b(this.f80362g, value);
    }

    public final void setSecondValueLabel(String value) {
        e.b(this.f80363h, value);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lgz/c$a;", "", "<init>", "()V", "", "TITLE_PATTERN", "Ljava/lang/String;", "MARKER_PATTERN", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
