package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class g6n extends ArrayAdapter {
    public static final int f = vsi.m0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence[] f18653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence[] f18654b;
    public Drawable[] c;
    public LayoutInflater d;
    public boolean e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ImageView f18655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f18656b;
        public TextView c;

        public b() {
        }
    }

    public g6n(Context context, int i) {
        super(context, i);
        this.e = false;
        this.d = LayoutInflater.from(context);
    }

    public CharSequence[] a() {
        return this.f18653a;
    }

    public final CharSequence b(int i) {
        CharSequence[] charSequenceArr = this.f18653a;
        if (charSequenceArr == null || i >= charSequenceArr.length) {
            return null;
        }
        return charSequenceArr[i];
    }

    public Drawable[] c() {
        return this.c;
    }

    public final Drawable d(int i) {
        Drawable[] drawableArr = this.c;
        if (drawableArr == null || i >= drawableArr.length) {
            return null;
        }
        return drawableArr[i];
    }

    public final CharSequence e(int i) {
        CharSequence[] charSequenceArr = this.f18654b;
        if (charSequenceArr == null || i >= charSequenceArr.length) {
            return null;
        }
        return charSequenceArr[i];
    }

    public boolean f() {
        return this.e;
    }

    public void g(CharSequence[] charSequenceArr) {
        this.f18653a = charSequenceArr;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        CharSequence[] charSequenceArr = this.f18653a;
        if (charSequenceArr == null) {
            return 0;
        }
        return charSequenceArr.length;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null || view.getTag(f) == null) {
            view = this.d.inflate(awi.T, viewGroup, false);
            b bVar = new b();
            bVar.f18655a = (ImageView) view.findViewById(R.id.icon);
            bVar.f18656b = (TextView) view.findViewById(R.id.title);
            bVar.c = (TextView) view.findViewById(R.id.summary);
            view.setTag(f, bVar);
        }
        CharSequence charSequenceB = b(i);
        CharSequence charSequenceE = e(i);
        Drawable drawableD = d(i);
        Object tag = view.getTag(f);
        if (tag != null) {
            b bVar2 = (b) tag;
            if (TextUtils.isEmpty(charSequenceB) || this.e) {
                bVar2.f18656b.setText("");
                bVar2.f18656b.setVisibility(8);
            } else {
                bVar2.f18656b.setText(charSequenceB);
                bVar2.f18656b.setVisibility(0);
            }
            if (TextUtils.isEmpty(charSequenceE) || this.e) {
                bVar2.c.setText("");
                bVar2.c.setVisibility(8);
            } else {
                bVar2.c.setText(charSequenceE);
                bVar2.c.setVisibility(0);
            }
            if (drawableD != null) {
                bVar2.f18655a.setImageDrawable(drawableD);
                bVar2.f18655a.setVisibility(0);
                if (!TextUtils.isEmpty(charSequenceB) && this.e) {
                    bVar2.f18655a.setContentDescription(charSequenceB);
                }
            } else {
                bVar2.f18655a.setVisibility(8);
            }
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Object getItem(int i) {
        CharSequence[] charSequenceArr = this.f18653a;
        if (charSequenceArr == null || i < 0 || i >= charSequenceArr.length) {
            return null;
        }
        return charSequenceArr[i];
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public void h(int[] iArr) {
        if (iArr == null) {
            i(null);
            return;
        }
        Drawable[] drawableArr = new Drawable[iArr.length];
        Resources resources = getContext().getResources();
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 > 0) {
                drawableArr[i] = resources.getDrawable(i2);
            } else {
                drawableArr[i] = null;
            }
        }
        i(drawableArr);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public void i(Drawable[] drawableArr) {
        this.c = drawableArr;
    }

    public void j(CharSequence[] charSequenceArr) {
        this.f18654b = charSequenceArr;
    }
}
