package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.bfj;
import defpackage.cm8;
import defpackage.d8p;
import defpackage.e8p;
import defpackage.exh;
import defpackage.scj;
import defpackage.ufj;
import defpackage.ufp;
import defpackage.xfj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ReactTextView extends AppCompatTextView implements scj {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f7560k = new ViewGroup.LayoutParams(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7562b;
    public int c;
    public int d;
    public int e;
    public TextUtils.TruncateAt f;
    public int g;
    public boolean h;
    public xfj i;
    public Spannable j;

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((WritableMap) obj).getInt("index") - ((WritableMap) obj2).getInt("index");
        }
    }

    public ReactTextView(Context context) {
        super(context);
        this.d = 0;
        this.e = Integer.MAX_VALUE;
        this.f = TextUtils.TruncateAt.END;
        this.g = 0;
        this.i = new xfj(this);
        this.f7562b = getGravity() & 8388615;
        this.c = getGravity() & 112;
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        return context instanceof ufp ? (ReactContext) ((ufp) context).getBaseContext() : (ReactContext) context;
    }

    public final WritableMap d(int i, int i2, int i3, int i4, int i5, int i6) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (i == 8) {
            writableMapCreateMap.putString("visibility", "gone");
            writableMapCreateMap.putInt("index", i2);
        } else if (i == 0) {
            writableMapCreateMap.putString("visibility", "visible");
            writableMapCreateMap.putInt("index", i2);
            writableMapCreateMap.putDouble("left", exh.a(i3));
            writableMapCreateMap.putDouble("top", exh.a(i4));
            writableMapCreateMap.putDouble(TSMAuthContants.PARAM_KEY_RIGHT, exh.a(i5));
            writableMapCreateMap.putDouble("bottom", exh.a(i6));
        } else {
            writableMapCreateMap.putString("visibility", "unknown");
            writableMapCreateMap.putInt("index", i2);
        }
        return writableMapCreateMap;
    }

    public void f(int i, float f, float f2) {
        this.i.c(i, f, f2);
    }

    public void g(float f, int i) {
        this.i.e(f, i);
    }

    public Spannable getSpanned() {
        return this.j;
    }

    public void h(int i, float f) {
        this.i.g(i, f);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void i() {
        setEllipsize(this.e == Integer.MAX_VALUE ? null : this.f);
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f7561a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (d8p d8pVar : (d8p[]) spanned.getSpans(0, spanned.length(), d8p.class)) {
                if (d8pVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7561a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (d8p d8pVar : (d8p[]) spanned.getSpans(0, spanned.length(), d8p.class)) {
                d8pVar.c();
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7561a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (d8p d8pVar : (d8p[]) spanned.getSpans(0, spanned.length(), d8p.class)) {
                d8pVar.d();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f7561a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (d8p d8pVar : (d8p[]) spanned.getSpans(0, spanned.length(), d8p.class)) {
                d8pVar.e();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int lineRight;
        int i6;
        if ((getText() instanceof Spanned) && getReactContext().hasCatalystInstance()) {
            UIManagerModule uIManagerModule = (UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class);
            Spanned spanned = (Spanned) getText();
            Layout layout = getLayout();
            if (Build.VERSION.SDK_INT >= 33 && (layout instanceof BoringLayout)) {
                setFallbackLineSpacing(false);
            }
            e8p[] e8pVarArr = (e8p[]) spanned.getSpans(0, spanned.length(), e8p.class);
            ArrayList arrayList = this.h ? new ArrayList(e8pVarArr.length) : null;
            int i7 = i3 - i;
            int i8 = i4 - i2;
            int length = e8pVarArr.length;
            int i9 = 0;
            while (i9 < length) {
                e8p e8pVar = e8pVarArr[i9];
                View viewResolveView = uIManagerModule.resolveView(e8pVar.b());
                int spanStart = spanned.getSpanStart(e8pVar);
                int lineForOffset = layout.getLineForOffset(spanStart);
                if ((layout.getEllipsisCount(lineForOffset) <= 0 || spanStart < layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset)) && lineForOffset < this.e && spanStart < layout.getLineEnd(lineForOffset)) {
                    int iC = e8pVar.c();
                    int iA = e8pVar.a();
                    boolean zIsRtlCharAt = layout.isRtlCharAt(spanStart);
                    i5 = i9;
                    int i10 = length;
                    boolean z2 = layout.getParagraphDirection(lineForOffset) == -1;
                    if (spanStart != spanned.length() - 1) {
                        int primaryHorizontal = (int) (z2 == zIsRtlCharAt ? layout.getPrimaryHorizontal(spanStart) : layout.getSecondaryHorizontal(spanStart));
                        lineRight = z2 ? i7 - (((int) layout.getLineRight(lineForOffset)) - primaryHorizontal) : primaryHorizontal;
                        if (zIsRtlCharAt) {
                            lineRight -= iC;
                        }
                    } else if (z2) {
                        lineRight = i7 - ((int) layout.getLineWidth(lineForOffset));
                    } else {
                        lineRight = (int) layout.getLineRight(lineForOffset);
                        lineRight -= iC;
                    }
                    int totalPaddingRight = lineRight + (zIsRtlCharAt ? getTotalPaddingRight() : getTotalPaddingLeft());
                    int i11 = i + totalPaddingRight;
                    int totalPaddingTop = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - iA;
                    int i12 = i2 + totalPaddingTop;
                    int i13 = (i7 <= totalPaddingRight || i8 <= totalPaddingTop) ? 8 : 0;
                    int i14 = i11 + iC;
                    int i15 = i12 + iA;
                    viewResolveView.setVisibility(i13);
                    viewResolveView.layout(i11, i12, i14, i15);
                    if (this.h) {
                        i6 = i10;
                        arrayList.add(d(i13, spanStart, i11, i12, i14, i15));
                    } else {
                        i6 = i10;
                    }
                } else {
                    i5 = i9;
                    i6 = length;
                    viewResolveView.setVisibility(8);
                    if (this.h) {
                        arrayList.add(d(8, spanStart, -1, -1, -1, -1));
                    }
                }
                i9 = i5 + 1;
                length = i6;
            }
            if (this.h) {
                Collections.sort(arrayList, new a());
                WritableArray writableArrayCreateArray = Arguments.createArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    writableArrayCreateArray.pushMap((WritableMap) it.next());
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putArray("inlineViews", writableArrayCreateArray);
                ((RCTEventEmitter) getReactContext().getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "topInlineViewLayout", writableMapCreateMap);
            }
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f7561a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (d8p d8pVar : (d8p[]) spanned.getSpans(0, spanned.length(), d8p.class)) {
                d8pVar.f();
            }
        }
    }

    @Override // defpackage.scj
    public int reactTagForTouch(float f, float f2) {
        int i;
        CharSequence text = getText();
        int id = getId();
        int i2 = (int) f;
        int i3 = (int) f2;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i3);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i2 >= lineLeft && i2 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i2);
                bfj[] bfjVarArr = (bfj[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, bfj.class);
                if (bfjVarArr != null) {
                    int length = text.length();
                    for (int i4 = 0; i4 < bfjVarArr.length; i4++) {
                        int spanStart = spanned.getSpanStart(bfjVarArr[i4]);
                        int spanEnd = spanned.getSpanEnd(bfjVarArr[i4]);
                        if (spanEnd > offsetForHorizontal && (i = spanEnd - spanStart) <= length) {
                            id = bfjVarArr[i4].a();
                            length = i;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                cm8.i("ReactNative", "Crash in HorizontalMeasurementProvider: " + e.getMessage());
            }
        }
        return id;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.i.b(i);
    }

    public void setBorderRadius(float f) {
        this.i.d(f);
    }

    public void setBorderStyle(String str) {
        this.i.f(str);
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.f = truncateAt;
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.f7562b;
        }
        setGravity(i | (getGravity() & (-8388616)));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.c;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    public void setLinkifyMask(int i) {
        this.g = i;
    }

    public void setNotifyOnInlineViewLayout(boolean z) {
        this.h = z;
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.e = i;
        setSingleLine(i == 1);
        setMaxLines(this.e);
    }

    public void setSpanned(Spannable spannable) {
        this.j = spannable;
    }

    public void setText(ufj ufjVar) {
        this.f7561a = ufjVar.a();
        if (getLayoutParams() == null) {
            setLayoutParams(f7560k);
        }
        Spannable spannableJ = ufjVar.j();
        int i = this.g;
        if (i > 0) {
            Linkify.addLinks(spannableJ, i);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        setText(spannableJ);
        setPadding((int) Math.floor(ufjVar.e()), (int) Math.floor(ufjVar.g()), (int) Math.floor(ufjVar.f()), (int) Math.floor(ufjVar.d()));
        int iK = ufjVar.k();
        if (this.d != iK) {
            this.d = iK;
        }
        setGravityHorizontal(this.d);
        if (getBreakStrategy() != ufjVar.l()) {
            setBreakStrategy(ufjVar.l());
        }
        if (getJustificationMode() != ufjVar.c()) {
            setJustificationMode(ufjVar.c());
        }
        requestLayout();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (this.f7561a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (d8p d8pVar : (d8p[]) spanned.getSpans(0, spanned.length(), d8p.class)) {
                if (d8pVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
