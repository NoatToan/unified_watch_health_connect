package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpModel;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kcb extends ViewDataBinding {
    public FtpModel A;
    public View.OnClickListener B;

    public kcb(Object obj, View view, int i) {
        super(obj, view, i);
    }

    public abstract void setClickListener(View.OnClickListener onClickListener);
}
