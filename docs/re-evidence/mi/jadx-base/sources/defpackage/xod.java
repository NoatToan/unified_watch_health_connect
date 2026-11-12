package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.c;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class xod implements wod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wod f39312a = new xod();

    public static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float fV = c.v(childAt);
                if (fV > f) {
                    f = fV;
                }
            }
        }
        return f;
    }

    @Override // defpackage.wod
    public void a(View view) {
    }

    @Override // defpackage.wod
    public void b(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z && view.getTag(wpi.f38217a) == null) {
            Float fValueOf = Float.valueOf(c.v(view));
            c.z0(view, e(recyclerView, view) + 1.0f);
            view.setTag(wpi.f38217a, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // defpackage.wod
    public void c(View view) {
        Object tag = view.getTag(wpi.f38217a);
        if (tag instanceof Float) {
            c.z0(view, ((Float) tag).floatValue());
        }
        view.setTag(wpi.f38217a, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // defpackage.wod
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }
}
