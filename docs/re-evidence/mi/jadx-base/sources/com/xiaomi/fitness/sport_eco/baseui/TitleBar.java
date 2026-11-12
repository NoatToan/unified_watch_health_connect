package com.xiaomi.fitness.sport_eco.baseui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.a6l;
import defpackage.bg4;
import defpackage.cki;
import defpackage.foi;
import defpackage.fvi;
import defpackage.v4j;
import defpackage.zri;

/* JADX INFO: loaded from: classes10.dex */
public class TitleBar extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f13065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f13066b;
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
        public final /* synthetic */ d f13067a;

        public a(d dVar) {
            this.f13067a = dVar;
        }

        @Override // defpackage.bg4
        public void accept(Object obj) throws Exception {
            this.f13067a.a();
        }
    }

    public class b implements bg4<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f13069a;

        public b(f fVar) {
            this.f13069a = fVar;
        }

        @Override // defpackage.bg4
        public void accept(Object obj) throws Exception {
            this.f13069a.a();
        }
    }

    public class c implements bg4<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f13071a;

        public c(e eVar) {
            this.f13071a = eVar;
        }

        @Override // defpackage.bg4
        public void accept(Object obj) throws Exception {
            this.f13071a.a();
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
        LayoutInflater.from(context).inflate(fvi.Q, this);
        this.f13065a = (TextView) findViewById(zri.f3);
        this.f13066b = (ImageView) findViewById(zri.Z2);
        this.c = (ImageView) findViewById(zri.c3);
        this.d = (ImageView) findViewById(zri.d3);
        this.e = (TextView) findViewById(zri.Y2);
        this.f = (TextView) findViewById(zri.a3);
        this.g = findViewById(zri.X2);
        this.h = (TextView) findViewById(zri.e3);
        this.i = (FrameLayout) findViewById(zri.b3);
        int resourceId3 = cki.common_transparent;
        int color = getResources().getColor(cki.common_black);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v4j.h5);
            resourceId3 = typedArrayObtainStyledAttributes.getResourceId(v4j.i5, resourceId3);
            string = typedArrayObtainStyledAttributes.getString(v4j.p5);
            string2 = typedArrayObtainStyledAttributes.getString(v4j.o5);
            color = typedArrayObtainStyledAttributes.getColor(v4j.q5, color);
            this.j = typedArrayObtainStyledAttributes.getBoolean(v4j.j5, true);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(v4j.l5, -1);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(v4j.n5, -1);
            string3 = typedArrayObtainStyledAttributes.getString(v4j.m5);
            z = typedArrayObtainStyledAttributes.getBoolean(v4j.k5, false);
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
        this.f13065a.setTextColor(color);
        if (this.j && resourceId == -1) {
            resourceId = foi.f18005r;
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
        this.f13066b.setImageResource(i);
        return this;
    }

    public TitleBar f(d dVar) {
        a6l.a(this.f13066b, new a(dVar));
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

    public ImageView getLeftIcon() {
        return this.f13066b;
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
        return this.f13065a;
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
        this.f13065a.setText(charSequence);
        return this;
    }

    public void m(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    public TitleBar n(boolean z) {
        this.f13066b.setVisibility(z ? 0 : 8);
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
        this.f13066b.setBackgroundResource(i);
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
