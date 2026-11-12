package com.huami.android.design.dialog.choice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Space;
import androidx.annotation.ArrayRes;
import androidx.core.content.ContextCompat;
import com.huami.lib.rainbow.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ChoiceView extends FrameLayout {
    private static final String v = "ChoiceView";
    private int[] a;
    private CharSequence[] b;
    private CharSequence[] c;
    private CharSequence[] d;
    private CharSequence[] e;
    private boolean[] f;
    private boolean[] g;
    private boolean[] h;
    private int[] i;
    private int j;
    private int k;
    private ListView l;
    private Context m;
    private boolean n;
    private boolean o;
    private b p;
    private List<ChoiceItemInfo> q;
    private AdapterView.OnItemClickListener r;
    private ChoiceViewInterface.OnMultiChoiceClickListener s;
    private int t;
    private Float u;

    public static class Builder {
        public int[] a;
        public int[] d;
        public CharSequence[] e;
        public CharSequence[] f;
        public boolean h;
        public boolean[] i;
        public boolean[] j;
        public boolean[] k;
        public Context n;
        public AdapterView.OnItemClickListener o;
        public ChoiceViewInterface.OnMultiChoiceClickListener p;
        public Float r;
        public int b = -1;
        public int c = -1;
        public boolean g = false;
        public int l = -1;
        public int m = -1;
        public int q = -1;

        private Builder(Context context) {
            this.n = context;
        }

        public static Builder with(Context context) {
            return new Builder(context);
        }

        public ChoiceView create() {
            return new ChoiceView(this, (a) null);
        }

        public Builder setCheckedItems(boolean[] zArr) {
            this.h = false;
            this.i = zArr;
            return this;
        }

        public Builder setChoiceItem(int i) {
            this.h = true;
            this.l = i;
            return this;
        }

        public Builder setColors(int[] iArr) {
            this.d = iArr;
            return this;
        }

        public Builder setDisableItem(int i) {
            this.m = i;
            return this;
        }

        public Builder setDividerColor(int i) {
            this.q = i;
            return this;
        }

        public Builder setIcons(int[] iArr) {
            this.a = iArr;
            return this;
        }

        public Builder setItemHeight(float f) {
            this.r = Float.valueOf(f);
            return this;
        }

        public Builder setMaskView(boolean[] zArr) {
            this.j = zArr;
            return this;
        }

        public Builder setOnItemClickedListener(AdapterView.OnItemClickListener onItemClickListener) {
            this.o = onItemClickListener;
            return this;
        }

        public Builder setOnMultiChoiceClickListener(ChoiceViewInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.p = onMultiChoiceClickListener;
            return this;
        }

        public Builder setSmallStyle(boolean z) {
            this.g = z;
            return this;
        }

        public Builder setSummary(@ArrayRes int i) {
            this.c = i;
            return this;
        }

        public Builder setTipValue(CharSequence[] charSequenceArr) {
            this.f = charSequenceArr;
            return this;
        }

        public Builder setTitles(@ArrayRes int i) {
            this.b = i;
            return this;
        }

        public Builder setValues(CharSequence[] charSequenceArr) {
            this.e = charSequenceArr;
            return this;
        }

        public Builder setVisibleItems(boolean[] zArr) {
            this.k = zArr;
            return this;
        }
    }

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (ChoiceView.this.n) {
                if (ChoiceView.this.r != null) {
                    ChoiceView.this.r.onItemClick(adapterView, view, i, j);
                }
            } else {
                if (ChoiceView.this.s == null || ChoiceView.this.f == null) {
                    return;
                }
                if (ChoiceView.this.k != -1 && i == ChoiceView.this.k) {
                    ChoiceViewInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = ChoiceView.this.s;
                    ChoiceView choiceView = ChoiceView.this;
                    onMultiChoiceClickListener.onClick(choiceView, i, choiceView.f[i]);
                } else {
                    ChoiceView.this.f[i] = ChoiceView.this.l.isItemChecked(i);
                    ChoiceViewInterface.OnMultiChoiceClickListener onMultiChoiceClickListener2 = ChoiceView.this.s;
                    ChoiceView choiceView2 = ChoiceView.this;
                    onMultiChoiceClickListener2.onClick(choiceView2, i, choiceView2.f[i]);
                }
            }
        }
    }

    public class b extends BaseAdapter {
        private List<ChoiceItemInfo> a;

        public b(List<ChoiceItemInfo> list) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            arrayList.addAll(list);
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChoiceItemInfo getItem(int i) {
            return this.a.get(i);
        }

        public void b(List<ChoiceItemInfo> list) {
            if (list != null) {
                this.a.clear();
                this.a.addAll(list);
                notifyDataSetChanged();
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<ChoiceItemInfo> list = this.a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return !getItem(i).visible ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (getItemViewType(i) == 1) {
                return new Space(ChoiceView.this.m);
            }
            if (view == null) {
                view = new ChoiceItemView(ChoiceView.this.m);
            }
            if (view instanceof ChoiceItemView) {
                ChoiceItemView choiceItemView = (ChoiceItemView) view;
                choiceItemView.bindData(getItem(i));
                choiceItemView.setDividerVisible(i != this.a.size() - 1);
                if (ChoiceView.this.u != null) {
                    choiceItemView.setHeight(ChoiceView.this.u.floatValue());
                }
            }
            if (!ChoiceView.this.n && getItem(i).checked) {
                ChoiceView.this.l.setItemChecked(i, true);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return i != ChoiceView.this.k;
        }
    }

    public /* synthetic */ ChoiceView(Builder builder, a aVar) {
        this(builder);
    }

    private boolean i(int i) {
        boolean[] zArr = this.f;
        if (zArr == null || i >= zArr.length) {
            return i == this.j;
        }
        return zArr[i];
    }

    private int j(int i) {
        int[] iArr = this.i;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        return iArr[i];
    }

    private int k(int i) {
        int[] iArr = this.a;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        return iArr[i];
    }

    private boolean l(int i) {
        boolean[] zArr = this.h;
        if (zArr == null || i >= zArr.length) {
            return false;
        }
        return zArr[i];
    }

    private CharSequence m(int i) {
        CharSequence[] charSequenceArr = this.c;
        return (charSequenceArr == null || i >= charSequenceArr.length) ? "" : charSequenceArr[i];
    }

    private CharSequence n(int i) {
        CharSequence[] charSequenceArr = this.e;
        return (charSequenceArr == null || i >= charSequenceArr.length) ? "" : charSequenceArr[i];
    }

    private CharSequence o(int i) {
        CharSequence[] charSequenceArr = this.b;
        return (charSequenceArr == null || i >= charSequenceArr.length) ? "" : charSequenceArr[i];
    }

    private CharSequence p(int i) {
        CharSequence[] charSequenceArr = this.d;
        return (charSequenceArr == null || i >= charSequenceArr.length) ? "" : charSequenceArr[i];
    }

    private void q() {
        this.q = new ArrayList();
        CharSequence[] charSequenceArr = this.b;
        int length = charSequenceArr == null ? 0 : charSequenceArr.length;
        int i = 0;
        while (i < length) {
            ChoiceItemInfo choiceItemInfo = new ChoiceItemInfo();
            choiceItemInfo.title = o(i);
            choiceItemInfo.value = p(i);
            choiceItemInfo.icon = k(i);
            choiceItemInfo.color = j(i);
            choiceItemInfo.summary = m(i);
            choiceItemInfo.checked = i(i);
            choiceItemInfo.checkboxEnable = this.k != i;
            choiceItemInfo.showMaskView = l(i);
            choiceItemInfo.tipValue = n(i);
            choiceItemInfo.isSmallStyle = this.o;
            choiceItemInfo.visible = getVisible(i);
            choiceItemInfo.dividerColor = this.t;
            boolean[] zArr = this.f;
            if (zArr != null && zArr.length > 0) {
                choiceItemInfo.hasCheckBox = true;
            }
            this.q.add(choiceItemInfo);
            i++;
        }
    }

    private void r() {
        if (this.l == null) {
            s();
        }
        this.l.setChoiceMode(this.n ? 1 : 2);
        if (this.l.getChoiceMode() == 1) {
            this.l.setItemChecked(this.j, true);
        }
        this.p.b(this.q);
    }

    private void s() {
        ListView listView = new ListView(this.m);
        this.l = listView;
        listView.setDivider(null);
        addView(this.l);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        b bVar = new b(this.q);
        this.p = bVar;
        this.l.setAdapter((ListAdapter) bVar);
        this.l.setOnItemClickListener(new a());
    }

    public boolean getVisible(int i) {
        boolean[] zArr = this.g;
        return zArr == null || i >= zArr.length || zArr[i];
    }

    public void setBuilder(Builder builder) {
        this.n = builder.h;
        int[] iArr = builder.a;
        if (iArr != null && iArr.length > 0) {
            this.a = iArr;
        }
        if (builder.b != -1) {
            this.b = this.m.getResources().getStringArray(builder.b);
        }
        if (builder.c != -1) {
            this.c = this.m.getResources().getStringArray(builder.c);
        }
        int[] iArr2 = builder.d;
        if (iArr2 != null && iArr2.length > 0) {
            this.i = iArr2;
        }
        this.j = builder.l;
        boolean[] zArr = builder.i;
        if (zArr != null && zArr.length > 0) {
            this.f = zArr;
        }
        boolean[] zArr2 = builder.k;
        if (zArr2 != null && zArr2.length > 0) {
            this.g = zArr2;
        }
        CharSequence[] charSequenceArr = builder.e;
        if (charSequenceArr != null && charSequenceArr.length > 0) {
            this.d = charSequenceArr;
        }
        CharSequence[] charSequenceArr2 = builder.f;
        if (charSequenceArr2 != null && charSequenceArr2.length > 0) {
            this.e = charSequenceArr2;
        }
        int i = builder.q;
        if (i > 0) {
            this.t = i;
        }
        this.u = builder.r;
        setOnItemClickedListener(builder.o);
        setOnMultiChoiceClickListener(builder.p);
        this.o = builder.g;
        this.k = builder.m;
        q();
        r();
    }

    public void setChoiceItem(int i) {
        this.l.setItemChecked(i, true);
    }

    public void setMaskViewShow(boolean[] zArr) {
        this.h = zArr;
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            this.q.get(i).showMaskView = zArr[i];
        }
        this.p.b(this.q);
    }

    public void setOnItemClickedListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.r = onItemClickListener;
    }

    public void setOnMultiChoiceClickListener(ChoiceViewInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.s = onMultiChoiceClickListener;
    }

    public void setTipValue(CharSequence[] charSequenceArr) {
        this.e = charSequenceArr;
        int length = charSequenceArr.length;
        for (int i = 0; i < length; i++) {
            this.q.get(i).tipValue = charSequenceArr[i];
        }
        this.p.b(this.q);
    }

    public void setValues(CharSequence[] charSequenceArr) {
        this.d = charSequenceArr;
        int length = charSequenceArr.length;
        for (int i = 0; i < length; i++) {
            this.q.get(i).value = charSequenceArr[i];
        }
        this.p.b(this.q);
    }

    public ChoiceView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ChoiceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChoiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = -1;
        this.k = -1;
        this.m = context;
        setBackgroundColor(ContextCompat.getColor(context, R.color.s38));
    }

    private ChoiceView(Builder builder) {
        this(builder.n, (AttributeSet) null);
        setBuilder(builder);
    }
}
