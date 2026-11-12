package miuix.miuixbasewidget.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a2j;
import defpackage.a3j;
import defpackage.emi;
import defpackage.j5j;
import defpackage.of1;
import defpackage.tki;
import defpackage.ysi;
import defpackage.zoi;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public class MessageView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f26675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f26676b;
    public ImageView c;
    public String d;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Folme.useAt(view).visible().setFlags(1L).hide(new AnimConfig[0]);
            MessageView.this.setVisibility(8);
            MessageView.a(MessageView.this);
        }
    }

    public interface b {
    }

    public MessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ b a(MessageView messageView) {
        messageView.getClass();
        return null;
    }

    public final void b() {
        this.c = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(getResources().getDimensionPixelSize(emi.q));
        this.c.setId(ysi.f40494b);
        this.c.setBackground(this.f26676b);
        this.c.setContentDescription(this.d);
        this.c.setOnClickListener(new a());
        addView(this.c, layoutParams);
        Folme.useAt(this.c).touch().handleTouchOf(this.c, new AnimConfig[0]);
    }

    public final void c(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j5j.D0, i, a3j.g);
        String string = typedArrayObtainStyledAttributes.getString(j5j.F0);
        ColorStateList colorStateListA = of1.a(context, typedArrayObtainStyledAttributes.getResourceId(j5j.E0, tki.h));
        this.f26676b = of1.b(context, typedArrayObtainStyledAttributes.getResourceId(j5j.H0, zoi.d));
        String string2 = typedArrayObtainStyledAttributes.getString(j5j.I0);
        this.d = string2;
        if (string2 == null) {
            this.d = context.getResources().getString(a2j.f551b);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(j5j.G0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f26675a = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        this.f26675a.setId(R.id.text1);
        this.f26675a.setPaddingRelative(getResources().getDimensionPixelSize(emi.f16815r), 0, 0, 0);
        this.f26675a.setText(string);
        this.f26675a.setTextColor(colorStateListA);
        this.f26675a.setTextSize(0, getResources().getDimensionPixelSize(emi.s));
        this.f26675a.setTextDirection(5);
        addView(this.f26675a, layoutParams);
        setClosable(z);
        setGravity(16);
        Folme.useAt(this).touch().setTintMode(0).setScale(1.0f, new ITouchStyle.TouchType[0]).handleTouchOf(this, new AnimConfig[0]);
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.FLOATED).handleHoverOf(this, new AnimConfig[0]);
    }

    public void setClosable(boolean z) {
        View viewFindViewById = findViewById(ysi.f40494b);
        if (z) {
            if (viewFindViewById == null) {
                b();
            }
        } else if (viewFindViewById != null) {
            removeView(viewFindViewById);
        }
    }

    public void setMessage(CharSequence charSequence) {
        this.f26675a.setText(charSequence);
    }

    public void setOnMessageViewCloseListener(b bVar) {
    }

    public MessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet, i);
    }
}
