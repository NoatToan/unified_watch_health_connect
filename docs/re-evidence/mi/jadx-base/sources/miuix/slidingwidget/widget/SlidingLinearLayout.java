package miuix.slidingwidget.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.HashMap;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.property.ViewProperty;

/* JADX INFO: loaded from: classes3.dex */
public class SlidingLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<View, Pair<Float, Float>> f26873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<View, Pair<Float, Float>> f26874b;
    public final int[] c;

    public SlidingLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @RequiresApi(api = 24)
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int childCount = getChildCount();
            char c = 1;
            char c2 = 0;
            boolean z2 = getOrientation() != 1 ? Math.abs(this.c[0] - i) > Math.abs(this.c[2] - i3) : Math.abs(this.c[1] - i2) > Math.abs(this.c[3] - i4);
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = getChildAt(i5);
                HashMap<View, Pair<Float, Float>> map = this.f26873a;
                if (map != null && map.size() > 0) {
                    Pair<Float, Float> pair = this.f26873a.get(childAt);
                    if (pair != null && childAt.getVisibility() != 8) {
                        if ((childAt.getX() != ((Float) pair.first).floatValue() || childAt.getY() != ((Float) pair.second).floatValue()) && !z2) {
                            fFloatValue3 = ((Float) pair.first).floatValue() - childAt.getX();
                            fFloatValue4 = ((Float) pair.second).floatValue() - childAt.getY();
                        } else if (childAt.getX() == ((Float) pair.first).floatValue() && childAt.getY() == ((Float) pair.second).floatValue() && z2) {
                            int[] iArr = this.c;
                            float f = iArr[c2] - i;
                            fFloatValue4 = iArr[c] - i2;
                            fFloatValue3 = f;
                        } else {
                            fFloatValue3 = 0.0f;
                            fFloatValue4 = 0.0f;
                        }
                        AnimState animState = new AnimState(StatConstants.PARAM_START);
                        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
                        AnimState animStateAdd = animState.add(viewProperty, fFloatValue3);
                        ViewProperty viewProperty2 = ViewProperty.TRANSLATION_Y;
                        AnimState animStateAdd2 = animStateAdd.add(viewProperty2, fFloatValue4);
                        Folme.useAt(childAt).state().setTo(animStateAdd2).fromTo(animStateAdd2, new AnimState(StatConstants.PARAM_END).add(viewProperty, 0.0d).add(viewProperty2, 0.0d), new AnimConfig[0]);
                    }
                    this.f26873a.remove(childAt);
                }
                HashMap<View, Pair<Float, Float>> map2 = this.f26874b;
                if (map2 != null && map2.size() > 0) {
                    Pair<Float, Float> pair2 = this.f26874b.get(childAt);
                    if (pair2 != null && childAt.getVisibility() != 8) {
                        if ((childAt.getX() != ((Float) pair2.first).floatValue() || childAt.getY() != ((Float) pair2.second).floatValue()) && !z2) {
                            fFloatValue = ((Float) pair2.first).floatValue() - childAt.getX();
                            fFloatValue2 = ((Float) pair2.second).floatValue() - childAt.getY();
                        } else if (childAt.getX() == ((Float) pair2.first).floatValue() && childAt.getY() == ((Float) pair2.second).floatValue() && z2) {
                            int[] iArr2 = this.c;
                            fFloatValue = iArr2[0] - i;
                            fFloatValue2 = iArr2[1] - i2;
                        } else {
                            fFloatValue2 = 0.0f;
                            fFloatValue = 0.0f;
                        }
                        AnimState animState2 = new AnimState(StatConstants.PARAM_START);
                        ViewProperty viewProperty3 = ViewProperty.TRANSLATION_X;
                        AnimState animStateAdd3 = animState2.add(viewProperty3, fFloatValue);
                        ViewProperty viewProperty4 = ViewProperty.TRANSLATION_Y;
                        AnimState animStateAdd4 = animStateAdd3.add(viewProperty4, fFloatValue2);
                        Folme.useAt(childAt).state().setTo(animStateAdd4).fromTo(animStateAdd4, new AnimState(StatConstants.PARAM_END).add(viewProperty3, 0.0d).add(viewProperty4, 0.0d), new AnimConfig[0]);
                    }
                    this.f26874b.remove(childAt);
                }
                i5++;
                c = 1;
                c2 = 0;
            }
            this.f26873a.clear();
            this.f26874b.clear();
            int[] iArr3 = this.c;
            iArr3[0] = i;
            iArr3[1] = i2;
            iArr3[2] = i3;
            iArr3[3] = i4;
        }
    }

    public SlidingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26873a = new HashMap<>();
        this.f26874b = new HashMap<>();
        this.c = new int[4];
        setLayoutTransition(null);
    }
}
