package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class un0 extends ViewDataBinding {
    public final ImageView A;
    public final ConstraintLayout B;
    public final pvq C;
    public List<SportingItemData> D;

    public un0(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, pvq pvqVar) {
        super(obj, view, i);
        this.A = imageView;
        this.B = constraintLayout;
        this.C = pvqVar;
    }

    public abstract void A0(List<SportingItemData> list);
}
