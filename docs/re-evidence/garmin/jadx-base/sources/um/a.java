package um;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.x;
import zz.l;
import zz.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lum/a;", "Lcom/github/mikephil/charting/components/MarkerView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", TtmlNode.TAG_LAYOUT, "", "isNewMarkerView", "<init>", "(Landroid/content/Context;IZ)V", "b", "Z", "getDoubleLongPress", "()Z", "setDoubleLongPress", "(Z)V", "doubleLongPress", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public class a extends MarkerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f171970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean doubleLongPress;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f171972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f171973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f171974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f171975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f171976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f171977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f171978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f171979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f171980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f171981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f171982m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i14, boolean z14) {
        super(context, i14);
        context.getClass();
        this.f171970a = z14;
        this.f171977h = -1.0f;
        this.f171978i = -1.0f;
        this.f171979j = -1.0f;
        this.f171980k = -1.0f;
        this.f171981l = new c(this);
        this.f171982m = new b(this);
        setWillNotDraw(false);
        float dimension = context.getResources().getDimension(R.dimen.spacing_micro);
        this.f171972c = dimension;
        this.f171973d = dimension;
        this.f171974e = dimension;
    }

    public final void a(boolean z14, d dVar) {
        dVar.getClass();
        this.f171976g = z14;
        this.f171975f = dVar;
        int i14 = z14 ? 0 : 8;
        TextView textView = this.f171981l.f171989c;
        if (textView != null) {
            textView.setVisibility(i14);
        }
    }

    public final void b(String str, List list) {
        if (!this.f171970a) {
            l lVar = (l) h0.d0(list);
            this.f171981l.a(lVar != null ? lVar.f207545b : null, list.size() > 1 ? ((l) h0.m0(list)).f207545b : null, str);
            return;
        }
        b bVar = this.f171982m;
        ArrayList arrayList = bVar.f171986d;
        TextView textView = bVar.f171985c;
        if (textView != null) {
            textView.setText(str);
        }
        int i14 = 0;
        if (list.size() > arrayList.size()) {
            int size = list.size() - arrayList.size();
            LinearLayout linearLayout = bVar.f171984b;
            View view2 = bVar.f171983a;
            for (int i15 = 0; i15 < size; i15++) {
                View viewInflate = LayoutInflater.from(view2.getContext()).inflate(R.layout.chart_highlight_metric, (ViewGroup) linearLayout, false);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginEnd(view2.getResources().getDimensionPixelSize(R.dimen.spacing_normal));
                viewInflate.setLayoutParams(layoutParams);
                if (linearLayout != null) {
                    linearLayout.addView(viewInflate);
                }
                arrayList.add(new m(viewInflate));
            }
        }
        int i16 = 0;
        for (Object obj : arrayList) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                x.q();
                throw null;
            }
            m mVar = (m) obj;
            if (i16 < list.size()) {
                View view3 = mVar.f207552a;
                if (view3 != null) {
                    view3.setVisibility(0);
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                mVar.c();
            }
            i16 = i17;
        }
        for (Object obj2 : list) {
            int i18 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            ((m) arrayList.get(i14)).a((l) obj2);
            i14 = i18;
        }
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final void draw(Canvas canvas, float f14, float f15) {
        canvas.getClass();
        float width = (getWidth() / 2) + this.f171973d;
        float width2 = (canvas.getWidth() - (getWidth() / 2)) - this.f171974e;
        boolean z14 = this.doubleLongPress;
        float f16 = this.f171972c;
        if (!z14) {
            if (f14 <= width) {
                super.draw(canvas, width, f16);
                return;
            } else if (f14 >= width2) {
                super.draw(canvas, width2, f16);
                return;
            } else {
                super.draw(canvas, f14, f16);
                return;
            }
        }
        float f17 = this.f171977h;
        if (f17 == -1.0f) {
            this.f171977h = f14;
            return;
        }
        float f18 = (f17 + f14) / 2;
        if (f18 <= width) {
            super.draw(canvas, width, f16);
        } else if (f18 >= width2) {
            super.draw(canvas, width2, f16);
        } else {
            super.draw(canvas, f18, f16);
        }
        this.f171977h = -1.0f;
    }

    public final boolean getDoubleLongPress() {
        return this.doubleLongPress;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final MPPointF getOffsetForDrawingAtPoint(float f14, float f15) {
        return new MPPointF(-(getWidth() / 2.0f), 0.0f);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final void refreshContent(Entry entry, Highlight highlight) {
        entry.getClass();
        highlight.getClass();
        d dVar = this.f171975f;
        if (dVar != null) {
            if (this.f171976g || !this.doubleLongPress) {
                dVar.a(entry.getX());
            } else if (this.f171979j == -1.0f) {
                this.f171979j = entry.getY();
                this.f171978i = highlight.getDrawX();
                this.f171980k = entry.getX();
            } else {
                if (this.f171978i <= highlight.getDrawX()) {
                    dVar.b(this.f171980k, entry.getX());
                } else {
                    dVar.b(entry.getX(), this.f171980k);
                }
                this.f171979j = -1.0f;
                this.f171978i = -1.0f;
            }
        }
        super.refreshContent(entry, highlight);
    }

    public final void setDoubleLongPress(boolean z14) {
        this.doubleLongPress = z14;
    }

    @Override // com.github.mikephil.charting.components.MarkerView
    public final void setOffset(float f14, float f15) {
        float f16 = this.f171972c;
        this.f171973d = f14 + f16;
        this.f171974e = f15 + f16;
    }

    public /* synthetic */ a(Context context, int i14, boolean z14, int i15, j jVar) {
        this(context, i14, (i15 & 4) != 0 ? false : z14);
    }
}
