package defpackage;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(21)
public class syq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f34108a = {R.attr.stateListAnimator};

    public static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void b(View view, float f) {
        int integer = view.getResources().getInteger(kti.f24281a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, pii.a0, -pii.b0}, ObjectAnimator.ofFloat(view, BizTypeConstants.ELEVATION, 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, BizTypeConstants.ELEVATION, f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, BizTypeConstants.ELEVATION, 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray typedArrayH = c9p.h(context, attributeSet, f34108a, i, i2, new int[0]);
        try {
            if (typedArrayH.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayH.getResourceId(0, 0)));
            }
        } finally {
            typedArrayH.recycle();
        }
    }
}
