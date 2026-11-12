package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class qsq extends ViewDataBinding {
    public final TextView A;
    public final ProgressBar B;
    public Map<CommonSportModel.SportTitle, String> C;

    public qsq(Object obj, View view, int i, TextView textView, ProgressBar progressBar) {
        super(obj, view, i);
        this.A = textView;
        this.B = progressBar;
    }

    public abstract void A0(Map<CommonSportModel.SportTitle, String> map);
}
