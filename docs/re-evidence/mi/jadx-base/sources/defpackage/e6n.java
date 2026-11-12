package defpackage;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import androidx.appcompat.widget.AppCompatRadioButton;
import miuix.androidbasewidget.widget.CheckedTextView;

/* JADX INFO: loaded from: classes3.dex */
public class e6n extends ArrayAdapter {
    public static final int d = vsi.l0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayAdapter f16316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f16317b;
    public LayoutInflater c;

    public class a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f16318a;

        public a(int i) {
            this.f16318a = i;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(R.id.title);
            CheckedTextView checkedTextView2 = (CheckedTextView) view.findViewById(R.id.summary);
            AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) view.findViewById(R.id.checkbox);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setClickable(true);
            accessibilityNodeInfo.setCheckable(true);
            if (appCompatRadioButton == null || !appCompatRadioButton.isActivated()) {
                accessibilityNodeInfo.setChecked(false);
            } else {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.setChecked(true);
                accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            }
            String string = checkedTextView != null ? checkedTextView.getText().toString() : null;
            String string2 = checkedTextView2 != null ? checkedTextView2.getText().toString() : null;
            if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2)) {
                accessibilityNodeInfo.setContentDescription(string + " " + string2);
            }
            if ((e6n.this.f16316a instanceof g6n) && ((g6n) e6n.this.f16316a).f()) {
                accessibilityNodeInfo.setContentDescription(e6n.this.f16316a.getItem(this.f16318a).toString());
            }
            if ((e6n.this.f16316a instanceof b) && ((b) e6n.this.f16316a).a()) {
                accessibilityNodeInfo.setContentDescription(e6n.this.f16316a.getItem(this.f16318a).toString());
            }
        }
    }

    public interface b {
        boolean a();
    }

    public interface c {
        boolean a(int i);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FrameLayout f16320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RadioButton f16321b;

        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public e6n(Context context, int i, ArrayAdapter arrayAdapter, c cVar) {
        super(context, i, R.id.text1);
        this.c = LayoutInflater.from(context);
        this.f16316a = arrayAdapter;
        this.f16317b = cVar;
    }

    public void b(View view, int i) {
        view.setAccessibilityDelegate(new a(i));
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f16316a.getCount();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null || view.getTag(d) == null) {
            view = this.c.inflate(awi.U, viewGroup, false);
            d dVar = new d(null);
            dVar.f16320a = (FrameLayout) view.findViewById(vsi.f0);
            dVar.f16321b = (RadioButton) view.findViewById(R.id.checkbox);
            view.setTag(d, dVar);
        }
        Object tag = view.getTag(d);
        if (tag != null) {
            d dVar2 = (d) tag;
            View dropDownView = this.f16316a.getDropDownView(i, dVar2.f16320a.getChildAt(0), viewGroup);
            dVar2.f16320a.removeAllViews();
            dVar2.f16320a.addView(dropDownView);
            c cVar = this.f16317b;
            if (cVar != null && cVar.a(i)) {
                z = true;
            }
            dVar2.f16321b.setChecked(z);
            view.setActivated(z);
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Object getItem(int i) {
        return this.f16316a.getItem(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return this.f16316a.getItemId(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return this.f16316a.hasStableIds();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f16316a.notifyDataSetChanged();
    }

    public e6n(Context context, ArrayAdapter arrayAdapter, c cVar) {
        this(context, awi.S, arrayAdapter, cVar);
    }
}
