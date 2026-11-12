package com.xmlywind.sdk.nativead;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class SigFlowLayout extends ViewGroup {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private int j;
    private int k;
    private boolean l;
    private int m;
    private int n;
    private float o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private float[] v;
    private d w;
    private a x;
    private int y;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.xmlywind.sdk.nativead.SigFlowLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public int a;
        public String[] b;
        public int c;

        public SavedState(Parcel parcel) {
            super(parcel);
            int i = parcel.readInt();
            this.a = i;
            String[] strArr = new String[i];
            this.b = strArr;
            parcel.readStringArray(strArr);
            this.c = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int length = this.b.length;
            this.a = length;
            parcel.writeInt(length);
            parcel.writeStringArray(this.b);
            parcel.writeInt(this.c);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int selectedIndex;
            if (SigFlowLayout.this.l) {
                b bVar = (b) view;
                b selectedItem = SigFlowLayout.this.getSelectedItem();
                int i = 0;
                if (SigFlowLayout.this.t) {
                    bVar.a(!bVar.b);
                    int childCount = SigFlowLayout.this.getChildCount();
                    while (true) {
                        if (i >= childCount) {
                            selectedIndex = -1;
                            break;
                        } else {
                            if (SigFlowLayout.this.a(i) == bVar) {
                                selectedIndex = i;
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    if (selectedItem != null) {
                        selectedItem.a(false);
                    }
                    bVar.a(true);
                    selectedIndex = SigFlowLayout.this.getSelectedIndex();
                }
                if (SigFlowLayout.this.w != null) {
                    SigFlowLayout.this.w.a(selectedIndex, bVar.getText().toString());
                }
            }
        }
    }

    public class b extends TextView {
        private boolean b;
        private Paint c;
        private Rect d;

        public b(Context context, CharSequence charSequence) {
            super(context);
            this.b = false;
            this.c = new Paint(1);
            this.d = new Rect();
            this.c.setStyle(Paint.Style.FILL);
            setPadding(SigFlowLayout.this.r, SigFlowLayout.this.s, SigFlowLayout.this.r, SigFlowLayout.this.s);
            setLayoutParams(new c(SigFlowLayout.this.y, -2));
            setGravity(17);
            setTextSize(0, SigFlowLayout.this.o);
            setSingleLine(true);
            setEllipsize(TextUtils.TruncateAt.valueOf("END"));
            setMaxEms(4);
            setText(charSequence);
            setClickable(true);
            a();
        }

        private void a() {
            int i;
            SigFlowLayout.this.u = false;
            if (this.b) {
                this.c.setColor(SigFlowLayout.this.n);
                i = SigFlowLayout.this.m;
            } else {
                this.c.setColor(SigFlowLayout.this.k);
                i = SigFlowLayout.this.j;
            }
            setTextColor(i);
        }

        private void b() {
            int i = this.b ? SigFlowLayout.this.n : SigFlowLayout.this.k;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadii(SigFlowLayout.this.v);
            gradientDrawable.setColor(i);
            if (Build.VERSION.SDK_INT < 16) {
                setBackgroundDrawable(gradientDrawable);
            } else {
                setBackground(gradientDrawable);
            }
        }

        public void a(boolean z) {
            this.b = z;
            a();
        }

        @Override // android.widget.TextView
        public boolean getDefaultEditable() {
            return false;
        }

        @Override // android.widget.TextView, android.view.View
        public void onDraw(Canvas canvas) {
            if (!SigFlowLayout.this.u) {
                b();
            }
            super.onDraw(canvas);
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || (action == 2 && !this.d.contains((int) motionEvent.getX(), (int) motionEvent.getY()))) {
                }
                return super.onTouchEvent(motionEvent);
            }
            getDrawingRect(this.d);
            a();
            invalidate();
            return super.onTouchEvent(motionEvent);
        }
    }

    public static class c extends ViewGroup.LayoutParams {
        public c(int i, int i2) {
            super(i, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public interface d {
        void a(int i, String str);
    }

    public SigFlowLayout(Context context) {
        this(context, null);
    }

    public SigFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SigFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -16777216;
        int color = Color.parseColor("#EEEEEE");
        this.b = color;
        this.c = -1;
        int color2 = Color.parseColor("#FE7E03");
        this.d = color2;
        this.u = false;
        this.v = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.x = new a();
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        int i3 = context.getResources().getDisplayMetrics().heightPixels;
        int iA = (int) a(100.0f);
        if (i3 > i2) {
            this.y = (i2 - iA) / 3;
        } else {
            this.y = (i3 - iA) / 3;
        }
        float fB = b(13.0f);
        this.e = fB;
        float fA = a(10.0f);
        this.f = fA;
        float fA2 = a(10.0f);
        this.g = fA2;
        float fA3 = a(10.0f);
        this.h = fA3;
        float fA4 = a(5.0f);
        this.i = fA4;
        this.j = -16777216;
        this.k = color;
        this.m = -1;
        this.n = color2;
        this.o = fB;
        this.p = (int) fA;
        this.q = (int) fA2;
        this.r = (int) fA3;
        this.s = (int) fA4;
        this.t = false;
        this.l = true;
    }

    private float a(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    private void a(CharSequence charSequence) {
        b bVar = new b(getContext(), charSequence);
        bVar.setOnClickListener(this.x);
        addView(bVar);
    }

    private int b(float f) {
        return (int) TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
    }

    public b a(int i) {
        if (getChildAt(i) == null) {
            return null;
        }
        return (b) getChildAt(i);
    }

    public void a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            b bVarA = a(i);
            if (bVarA != null && bVarA.b) {
                bVarA.a(false);
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public ArrayList<Integer> getAllItemSelectedIndex() {
        int childCount = getChildCount();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < childCount; i++) {
            if (a(i).b) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    public ArrayList<String> getAllItemSelectedTextWithListArray() {
        int childCount = getChildCount();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < childCount; i++) {
            b bVarA = a(i);
            if (bVarA.b) {
                arrayList.add(bVarA.getText().toString());
            }
        }
        return arrayList;
    }

    public String[] getAllItemSelectedTextWithStringArray() {
        int childCount = getChildCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childCount; i++) {
            b bVarA = a(i);
            if (bVarA.b) {
                arrayList.add(bVarA.getText().toString());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String[] getAllItemText() {
        int childCount = getChildCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childCount; i++) {
            arrayList.add(a(i).getText().toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public int getSelectedIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (a(i).b) {
                return i;
            }
        }
        return -1;
    }

    public b getSelectedItem() {
        int selectedIndex = getSelectedIndex();
        if (selectedIndex != -1) {
            return a(selectedIndex);
        }
        return null;
    }

    public String getSelectedItemText() {
        if (getSelectedItem() != null) {
            return getSelectedItem().getText().toString();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = getChildCount();
        int i5 = paddingLeft;
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (childAt.getVisibility() != 8) {
                if (i5 + measuredWidth > (i3 - i) - paddingRight) {
                    paddingTop += iMax + this.q;
                    i5 = paddingLeft;
                    iMax = measuredHeight;
                } else {
                    iMax = Math.max(iMax, measuredHeight);
                }
                childAt.layout(i5, paddingTop, i5 + measuredWidth, measuredHeight + paddingTop);
                i5 += this.p + measuredWidth;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (childAt.getVisibility() != 8) {
                int i8 = i6 + measuredWidth;
                if (i8 > size) {
                    i3 += this.q + i4;
                    i5++;
                } else {
                    measuredHeight = Math.max(i4, measuredHeight);
                    measuredWidth = i8;
                }
                i6 = measuredWidth + this.p;
                i4 = measuredHeight;
            }
        }
        int paddingTop = i3 + i4 + getPaddingTop() + getPaddingBottom();
        int paddingLeft = i5 == 0 ? getPaddingLeft() + getPaddingRight() + i6 : size;
        if (mode != 1073741824) {
            size = paddingLeft;
        }
        if (mode2 != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setList(savedState.b);
        b bVarA = a(savedState.c);
        if (bVarA != null) {
            bVarA.a(true);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = getAllItemText();
        savedState.c = getSelectedIndex();
        return savedState;
    }

    public void setIndexListItemSelected(List<Integer> list) {
        if (list == null || list.isEmpty() || list.size() == 0) {
            return;
        }
        if (list.size() <= getChildCount()) {
            for (int i = 0; i < list.size(); i++) {
                a(i).a(true);
            }
        }
    }

    public void setList(List<String> list) {
        setList((String[]) list.toArray(new String[list.size()]));
    }

    public void setList(String... strArr) {
        removeAllViews();
        for (String str : strArr) {
            a(str);
        }
    }

    public void setOnItemClickListener(d dVar) {
        this.w = dVar;
    }
}
