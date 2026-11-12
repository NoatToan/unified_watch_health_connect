package com.huami.android.design.dialog;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Space;
import androidx.annotation.DrawableRes;
import com.huami.android.design.dialog.choice.ChoiceItemInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DialogChoiceAdapter extends BaseAdapter {
    private static final int A = 3;
    private static final int B = 4;
    private static final int C = 5;
    private static final String w = "DialogChoiceAdapter";
    private static final int x = 0;
    private static final int y = 1;
    private static final int z = 2;
    private List<ChoiceItemInfo> a;
    private AlertDialogFragment.ChoiceItems b;
    private Context c;
    private int[] d;
    private int[] e;
    private int[] f;
    private CharSequence[] g;
    private CharSequence[] h;
    private CharSequence[] i;
    private CharSequence[] j;
    private boolean[] k;
    private boolean[] l;
    private int[] m;
    private int n;
    private boolean[] o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;

    @DrawableRes
    private int v;

    public DialogChoiceAdapter(Context context, AlertDialogFragment.ChoiceItems choiceItems, boolean z2) {
        this(context, choiceItems, z2, false);
    }

    private void a(View view, ChoiceItemInfo choiceItemInfo, int i) {
        if (view instanceof MultiChoiceView) {
            ((MultiChoiceView) view).bindData(choiceItemInfo);
            return;
        }
        if (view instanceof SingleChoiceView) {
            ((SingleChoiceView) view).bindData(choiceItemInfo);
            return;
        }
        if (view instanceof SingleChoiceViewNew) {
            ((SingleChoiceViewNew) view).bindData(choiceItemInfo);
        } else if (view instanceof SingleChoiceViewCenter) {
            ((SingleChoiceViewCenter) view).bindData(choiceItemInfo);
        } else if (view instanceof SingleChoiceViewList) {
            ((SingleChoiceViewList) view).bindData(choiceItemInfo);
        }
    }

    private boolean b(int i) {
        boolean[] zArr = this.k;
        if (zArr == null || i >= zArr.length) {
            return i == this.n;
        }
        return zArr[i];
    }

    private int c(int i) {
        int[] iArr = this.m;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        return iArr[i];
    }

    private boolean d(int i) {
        boolean[] zArr = this.o;
        return zArr == null || i >= zArr.length || zArr[i];
    }

    private int e(int i) {
        int[] iArr = this.d;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        return iArr[i];
    }

    private int f(int i) {
        int[] iArr = this.e;
        if (iArr == null || i > iArr.length) {
            return -1;
        }
        return iArr[i];
    }

    private int g(int i) {
        int[] iArr = this.f;
        if (iArr == null || i > iArr.length) {
            return 0;
        }
        return iArr[i];
    }

    private CharSequence h(int i) {
        CharSequence[] charSequenceArr = this.h;
        return (charSequenceArr == null || i >= charSequenceArr.length) ? "" : charSequenceArr[i];
    }

    private CharSequence i(int i) {
        CharSequence[] charSequenceArr = this.j;
        return (charSequenceArr == null || i >= charSequenceArr.length) ? "" : charSequenceArr[i];
    }

    private CharSequence j(int i) {
        SparseArray<String> sparseArray = this.b.h;
        return sparseArray == null ? "" : sparseArray.get(i);
    }

    private CharSequence k(int i) {
        CharSequence[] charSequenceArr = this.g;
        return (charSequenceArr == null || i >= charSequenceArr.length) ? "" : charSequenceArr[i];
    }

    private CharSequence l(int i) {
        CharSequence[] charSequenceArr = this.i;
        return (charSequenceArr == null || i >= charSequenceArr.length) ? "" : charSequenceArr[i];
    }

    private boolean m(int i) {
        boolean[] zArr = this.l;
        return zArr == null || i >= zArr.length || zArr[i];
    }

    private void n() {
        AlertDialogFragment.ChoiceItems choiceItems = this.b;
        int[] iArr = choiceItems.a;
        if (iArr != null && iArr.length > 0) {
            this.d = iArr;
        }
        int[] iArr2 = choiceItems.b;
        if (iArr2 != null && iArr2.length > 0) {
            this.e = iArr2;
        }
        String[] strArr = choiceItems.d;
        if (strArr != null) {
            this.g = strArr;
        } else if (choiceItems.c != -1) {
            this.g = this.c.getResources().getStringArray(this.b.c);
        }
        AlertDialogFragment.ChoiceItems choiceItems2 = this.b;
        this.f = choiceItems2.e;
        if (choiceItems2.f != -1) {
            this.h = this.c.getResources().getStringArray(this.b.f);
        } else {
            String[] strArr2 = choiceItems2.g;
            if (strArr2 != null) {
                this.h = strArr2;
            }
        }
        AlertDialogFragment.ChoiceItems choiceItems3 = this.b;
        int[] iArr3 = choiceItems3.i;
        if (iArr3 != null && iArr3.length > 0) {
            this.m = iArr3;
        }
        this.n = choiceItems3.j;
        boolean[] zArr = choiceItems3.k;
        if (zArr != null && zArr.length > 0) {
            this.k = zArr;
        }
        boolean[] zArr2 = choiceItems3.l;
        if (zArr2 != null && zArr2.length > 0) {
            this.l = zArr2;
        }
        this.u = choiceItems3.n;
        this.o = choiceItems3.m;
        this.v = choiceItems3.o;
        o();
    }

    private void o() {
        this.a = new ArrayList();
        CharSequence[] charSequenceArr = this.g;
        int length = charSequenceArr == null ? 0 : charSequenceArr.length;
        for (int i = 0; i < length; i++) {
            ChoiceItemInfo choiceItemInfo = new ChoiceItemInfo();
            choiceItemInfo.title = k(i);
            choiceItemInfo.value = l(i);
            choiceItemInfo.strikeThroughLength = g(i);
            choiceItemInfo.icon = e(i);
            choiceItemInfo.iconTintColor = f(i);
            choiceItemInfo.color = c(i);
            choiceItemInfo.summary = h(i);
            choiceItemInfo.tips = j(i);
            choiceItemInfo.checked = b(i);
            choiceItemInfo.checkboxEnable = d(i);
            choiceItemInfo.tipValue = i(i);
            choiceItemInfo.visible = m(i);
            choiceItemInfo.checkboxStyle = this.u;
            boolean[] zArr = this.k;
            if (zArr != null && zArr.length > 0) {
                choiceItemInfo.hasCheckBox = true;
            }
            choiceItemInfo.arrowIcon = this.v;
            this.a.add(choiceItemInfo);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (!getItem(i).visible) {
            return 0;
        }
        if (this.p || this.t) {
            return 1;
        }
        if (this.q) {
            return 3;
        }
        if (this.s) {
            return 4;
        }
        return this.r ? 5 : 2;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                view = new Space(this.c);
            } else if (itemViewType == 1) {
                view = new SingleChoiceView(this.c);
            } else if (itemViewType == 3) {
                view = new SingleChoiceViewNew(this.c);
            } else if (itemViewType != 4) {
                view = itemViewType != 5 ? new MultiChoiceView(this.c) : new SingleChoiceViewCenter(this.c);
            } else {
                view = new SingleChoiceViewList(this.c);
            }
        }
        a(view, getItem(i), i);
        if (getItem(i).checked) {
            ((ListView) viewGroup).setItemChecked(i, true);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 6;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return d(i);
    }

    public void setValues(CharSequence[] charSequenceArr) {
        this.i = (CharSequence[]) Arrays.copyOf(charSequenceArr, charSequenceArr.length);
        int length = charSequenceArr.length;
        for (int i = 0; i < length; i++) {
            this.a.get(i).value = charSequenceArr[i];
        }
        notifyDataSetChanged();
    }

    public DialogChoiceAdapter(Context context, AlertDialogFragment.ChoiceItems choiceItems, boolean z2, boolean z3) {
        this.n = -1;
        this.v = -1;
        this.c = context;
        this.b = choiceItems;
        this.p = z2;
        this.q = z3;
        n();
    }

    @Override // android.widget.Adapter
    public ChoiceItemInfo getItem(int i) {
        return this.a.get(i);
    }

    public DialogChoiceAdapter(Context context, AlertDialogFragment.ChoiceItems choiceItems, boolean z2, boolean z3, boolean z4) {
        this.n = -1;
        this.v = -1;
        this.c = context;
        this.b = choiceItems;
        this.p = z2;
        this.q = z3;
        this.s = z4;
        n();
    }

    public DialogChoiceAdapter(Context context, AlertDialogFragment.ChoiceItems choiceItems, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.n = -1;
        this.v = -1;
        this.c = context;
        this.b = choiceItems;
        this.p = z2;
        this.q = z3;
        this.s = z4;
        this.t = z5;
        n();
    }

    public DialogChoiceAdapter(Context context, AlertDialogFragment.ChoiceItems choiceItems, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.n = -1;
        this.v = -1;
        this.c = context;
        this.b = choiceItems;
        this.p = z2;
        this.q = z3;
        this.s = z4;
        this.t = z5;
        this.r = z6;
        n();
    }
}
