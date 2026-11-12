package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class euq extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final ImageView C;
    public Map<CommonSportModel.SportTitle, String> D;

    public euq(Object obj, View view, int i, ImageView imageView, TextView textView, ImageView imageView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = imageView2;
    }

    public abstract void A0(Map<CommonSportModel.SportTitle, String> map);
}
