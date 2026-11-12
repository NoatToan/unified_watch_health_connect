package com.xiaomi.fitness.sport.baseui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.a6l;
import defpackage.aki;
import defpackage.bg4;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.t4j;
import defpackage.xri;

/* JADX INFO: loaded from: classes10.dex */
public class TitleBar extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f12934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12935b;
    public ImageView c;
    public ImageView d;
    public TextView e;
    public TextView f;
    public View g;
    public TextView h;
    public FrameLayout i;
    public boolean j;

    public class a implements bg4<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f12936a;

        public a(d dVar) {
            this.f12936a = dVar;
        }

        @Override // defpackage.bg4
        public void accept(Object obj) throws Exception {
            this.f12936a.a();
        }
    }

    public class b implements bg4<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f12938a;

        public b(f fVar) {
            this.f12938a = fVar;
        }

        @Override // defpackage.bg4
        public void accept(Object obj) throws Exception {
            this.f12938a.a();
        }
    }

    public class c implements bg4<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f12940a;

        public c(e eVar) {
            this.f12940a = eVar;
        }

        @Override // defpackage.bg4
        public void accept(Object obj) throws Exception {
            this.f12940a.a();
        }
    }

    public interface d {
        void a();
    }

    public interface e {
        void a();
    }

    public interface f {
        void a();
    }

    public TitleBar(Context context) {
        this(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        String string;
        String string2;
        String string3;
        int resourceId;
        int resourceId2;
        boolean z;
        LayoutInflater.from(context).inflate(dvi.S1, this);
        this.f12934a = (TextView) findViewById(xri.A7);
        this.f12935b = (TextView) findViewById(xri.u7);
        this.c = (ImageView) findViewById(xri.x7);
        this.d = (ImageView) findViewById(xri.y7);
        this.e = (TextView) findViewById(xri.t7);
        this.f = (TextView) findViewById(xri.v7);
        this.g = findViewById(xri.s7);
        this.h = (TextView) findViewById(xri.z7);
        this.i = (FrameLayout) findViewById(xri.w7);
        int resourceId3 = aki.common_transparent;
        int color = getResources().getColor(aki.A);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t4j.I4);
            resourceId3 = typedArrayObtainStyledAttributes.getResourceId(t4j.J4, resourceId3);
            string = typedArrayObtainStyledAttributes.getString(t4j.Q4);
            string2 = typedArrayObtainStyledAttributes.getString(t4j.P4);
            color = typedArrayObtainStyledAttributes.getColor(t4j.R4, color);
            this.j = typedArrayObtainStyledAttributes.getBoolean(t4j.K4, true);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(t4j.M4, -1);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(t4j.O4, -1);
            string3 = typedArrayObtainStyledAttributes.getString(t4j.N4);
            z = typedArrayObtainStyledAttributes.getBoolean(t4j.L4, false);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            string = null;
            string2 = null;
            string3 = null;
            resourceId = -1;
            resourceId2 = -1;
            z = false;
        }
        setBackgroundResource(resourceId3);
        l(string);
        if (string2 != null) {
            k(string2);
        }
        this.f12934a.setTextColor(color);
        if (this.j && resourceId == -1) {
            resourceId = eoi.j;
            this.f12935b.setContentDescription(AppUtil.getApp().getString(c1j.c));
        }
        if (resourceId != -1) {
            e(resourceId);
        } else {
            n(false);
        }
        if (resourceId2 != -1) {
            j(resourceId2);
        } else {
            p(false);
        }
        if (TextUtils.isEmpty(string3)) {
            o(false);
        } else {
            i(string3);
        }
        if (z) {
            this.g.setVisibility(0);
        }
    }

    public boolean b() {
        return this.j;
    }

    public boolean c() {
        return this.f != null;
    }

    public boolean d() {
        return this.c != null;
    }

    public TitleBar e(int i) {
        n(true);
        this.f12935b.setBackgroundResource(i);
        return this;
    }

    public TitleBar f(d dVar) {
        a6l.a(this.f12935b, new a(dVar));
        return this;
    }

    public TitleBar g(e eVar) {
        a6l.a(this.f, new c(eVar));
        return this;
    }

    public View getDivider() {
        return this.g;
    }

    public TextView getLeftButton() {
        return this.e;
    }

    public TextView getRightButton() {
        return this.f;
    }

    public ImageView getRightIcon() {
        return this.c;
    }

    public ImageView getRightIcon2() {
        return this.d;
    }

    public TextView getTitleView() {
        return this.f12934a;
    }

    public TitleBar h(f fVar) {
        a6l.a(this.c, new b(fVar));
        return this;
    }

    public TitleBar i(CharSequence charSequence) {
        o(true);
        this.f.setText(charSequence);
        return this;
    }

    public TitleBar j(int i) {
        if (i == -1) {
            p(false);
        } else {
            p(true);
            this.c.setImageResource(i);
        }
        return this;
    }

    public TitleBar k(String str) {
        if (TextUtils.isEmpty(str)) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        this.h.setText(str);
        return this;
    }

    public TitleBar l(CharSequence charSequence) {
        this.f12934a.setText(charSequence);
        return this;
    }

    public void m(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    public TitleBar n(boolean z) {
        this.f12935b.setVisibility(z ? 0 : 8);
        return this;
    }

    public TitleBar o(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
        return this;
    }

    public TitleBar p(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
        return this;
    }

    public void setButtonBackgoundResouce(int i) {
        this.e.setBackgroundResource(i);
        this.f12935b.setBackgroundResource(i);
        this.f.setBackgroundResource(i);
        this.c.setBackgroundResource(i);
        this.i.setBackgroundResource(i);
    }

    public void setSubTitleTextColor(int i) {
        TextView textView = this.h;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = true;
        a(context, attributeSet);
    }
}
