package com.garmin.android.apps.connectmobile.view.audiorecording;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/audiorecording/WaveformView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getMaxSpikesAllowed", "()I", TtmlNode.ATTR_TTS_COLOR, "", "setWaveformColor", "(I)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WaveformView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f47591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<Float> f47592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<Float> f47593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<RectF> f47594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f47595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f47596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<Float> f47597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<Float> f47598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f47599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f47600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f47601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f47602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f47603m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f47604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f47605o;

    static {
        new a(null);
    }

    public WaveformView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f47591a = paint;
        this.f47592b = new ArrayList<>();
        this.f47593c = new ArrayList<>();
        this.f47594d = new ArrayList<>();
        this.f47595e = new HashMap();
        Paint paint2 = new Paint();
        this.f47596f = paint2;
        this.f47597g = new ArrayList<>();
        this.f47598h = new ArrayList<>();
        this.f47599i = new ArrayList();
        this.f47600j = 6.0f;
        this.f47601k = 4.0f;
        this.f47602l = 2.0f;
        this.f47603m = 100.0f;
        this.f47604n = (int) 100.0f;
        paint.setColor(Color.rgb(108, 108, 108));
        paint2.setColor(Color.rgb(166, 166, 166));
        this.f47605o = (int) (getResources().getDisplayMetrics().widthPixels / 6.0f);
        if (context == null || !c22.b.e(context)) {
            return;
        }
        float fC = c22.b.c(context, 100.0f, 2.0f);
        this.f47603m = fC;
        this.f47604n = (int) fC;
    }

    public final void a(ArrayList arrayList, float f14, ArrayList arrayList2, ArrayList arrayList3) {
        arrayList.add(Float.valueOf(f14));
        int i14 = ((int) f14) * 25;
        int i15 = this.f47604n;
        if (i14 > i15) {
            i14 = i15;
        }
        if (i14 < 3) {
            i14 = 3;
        }
        arrayList2.add(Float.valueOf(i14));
        arrayList3.clear();
        List listT0 = h0.T0(this.f47605o, arrayList2);
        int size = listT0.size();
        for (int i16 = 0; i16 < size; i16++) {
            float f15 = this.f47602l;
            float f16 = this.f47601k;
            float f17 = (f15 + f16) * i16;
            float f18 = 2;
            float fFloatValue = (this.f47603m / f18) - (((Number) listT0.get(i16)).floatValue() / f18);
            arrayList3.add(new RectF(f17, fFloatValue, f16 + f17, ((Number) listT0.get(i16)).floatValue() + fFloatValue));
        }
        invalidate();
    }

    public final void b(ArrayList arrayList, float f14, ArrayList arrayList2, ArrayList arrayList3) {
        arrayList.add(Float.valueOf(f14));
        int i14 = ((int) f14) / 100;
        int i15 = this.f47604n;
        if (i14 > i15) {
            i14 = i15;
        }
        if (i14 < 3) {
            i14 = 3;
        }
        arrayList2.add(Float.valueOf(i14));
        arrayList3.clear();
        List listT0 = h0.T0(this.f47605o, arrayList2);
        int size = listT0.size();
        for (int i16 = 0; i16 < size; i16++) {
            float f15 = this.f47602l;
            float f16 = this.f47601k;
            float f17 = (f15 + f16) * i16;
            float f18 = 2;
            float fFloatValue = (this.f47603m / f18) - (((Number) listT0.get(i16)).floatValue() / f18);
            arrayList3.add(new RectF(f17, fFloatValue, f16 + f17, ((Number) listT0.get(i16)).floatValue() + fFloatValue));
        }
        invalidate();
    }

    public final void c() {
        setWaveformColor(Color.rgb(108, 108, 108));
        this.f47597g.clear();
        this.f47599i.clear();
        this.f47598h.clear();
    }

    public final void d() {
        this.f47593c.clear();
        this.f47594d.clear();
        this.f47592b.clear();
        this.f47595e.clear();
        setWaveformColor(Color.rgb(166, 166, 166));
        c();
    }

    /* JADX INFO: renamed from: getMaxSpikesAllowed, reason: from getter */
    public final int getF47605o() {
        return this.f47605o;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f14;
        canvas.getClass();
        super.onDraw(canvas);
        Iterator<RectF> it = this.f47594d.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            f14 = this.f47600j;
            if (!zHasNext) {
                break;
            } else {
                canvas.drawRoundRect(it.next(), f14, f14, this.f47591a);
            }
        }
        Iterator it3 = this.f47599i.iterator();
        while (it3.hasNext()) {
            canvas.drawRoundRect((RectF) it3.next(), f14, f14, this.f47596f);
        }
    }

    public final void setWaveformColor(int color) {
        this.f47591a.setColor(color);
        invalidate();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/audiorecording/WaveformView$a;", "", "<init>", "()V", "", "AMPLITUDE_CONSTANT_FACTOR", "I", "AMPLITUDE_CONSTANT_MULTIPLIER", "MIN_AMPLITUDE", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
