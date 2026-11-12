package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;

/* JADX INFO: loaded from: classes6.dex */
public class mal extends kal {
    public mal(mnq.a aVar) {
        super(aVar);
    }

    @Override // defpackage.kal
    public PropertyValuesHolder n(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i2 = this.g;
            i = (int) (i2 * this.h);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i = this.g;
            i2 = (int) (i * this.h);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i, i2);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }
}
