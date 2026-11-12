package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.pli;
import defpackage.rji;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ScrollingTabContainer extends HorizontalScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f12670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f12671b;
    public c c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f12672a;

        public a(View view) {
            this.f12672a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollingTabContainer.this.scrollTo(this.f12672a.getLeft() - ((ScrollingTabContainer.this.getWidth() - this.f12672a.getWidth()) / 2), 0);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r5v2 */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar = (e) view;
            eVar.setSelected(true);
            eVar.setTypeface(Typeface.defaultFromStyle(1));
            int childCount = ScrollingTabContainer.this.f12670a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainer.this.f12670a.getChildAt(i);
                ?? r5 = view == childAt ? 1 : 0;
                childAt.setSelected(r5);
                ((TextView) childAt).setTypeface(Typeface.defaultFromStyle(r5));
                if (r5 != 0 && ScrollingTabContainer.this.c != null) {
                    ScrollingTabContainer.this.c.a(i);
                }
            }
        }
    }

    public interface c {
        void a(int i);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f12676b;
        public String c;
    }

    public class e extends AppCompatTextView {
        public e(Context context) {
            super(context);
            setTextColor(getResources().getColorStateList(rji.o));
            setTextSize(0, getResources().getDimensionPixelSize(pli.c));
            setPadding(getResources().getDimensionPixelSize(pli.f30523a), 0, getResources().getDimensionPixelSize(pli.f30524b), 0);
            setGravity(17);
        }
    }

    public ScrollingTabContainer(Context context) {
        this(context, null);
    }

    public void c(d dVar, boolean z) {
        if (dVar == null) {
            return;
        }
        e eVarF = f(dVar);
        this.f12670a.addView(eVarF, new LinearLayout.LayoutParams(0, -1, 1.0f));
        eVarF.setTag(dVar.c);
        if (z) {
            eVarF.setSelected(z);
        }
    }

    public void d(List<d> list, int i) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            c(list.get(i2), i2 == i);
            i2++;
        }
    }

    public final void e(int i) {
        post(new a(this.f12670a.getChildAt(i)));
    }

    public final e f(d dVar) {
        e eVar = new e(this.f12671b);
        eVar.setOnClickListener(new b());
        eVar.setText(dVar.f12676b);
        return eVar;
    }

    public int g(String str) {
        int childCount = this.f12670a.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (TextUtils.equals((String) this.f12670a.getChildAt(i2).getTag(), str)) {
                i = i2;
                break;
            }
        }
        setTabSelected(i);
        return i;
    }

    public void setTabClickListener(c cVar) {
        this.c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public void setTabSelected(int i) {
        int childCount = this.f12670a.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f12670a.getChildAt(i2);
            ?? r4 = i2 == i ? 1 : 0;
            childAt.setSelected(r4);
            ((TextView) childAt).setTypeface(Typeface.defaultFromStyle(r4));
            if (r4 != 0) {
                e(i);
            }
            i2++;
        }
    }

    public ScrollingTabContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12671b = context;
        setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12670a = linearLayout;
        linearLayout.setMeasureWithLargestChildEnabled(true);
        this.f12670a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f12670a.setGravity(17);
        addView(this.f12670a);
    }
}
