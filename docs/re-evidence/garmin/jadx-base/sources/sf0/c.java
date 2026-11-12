package sf0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsf0/c;", "", "Landroid/view/View;", "view", "Landroid/view/View$OnClickListener;", "helpClickListener", "reloadClickListener", "<init>", "(Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f158823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f158824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f158825c;

    public c(View view2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        view2.getClass();
        onClickListener.getClass();
        onClickListener2.getClass();
        this.f158823a = (ViewGroup) view2.findViewById(R.id.epoch_state);
        Button button = (Button) view2.findViewById(R.id.epoch_reload);
        this.f158824b = button;
        this.f158825c = (TextView) view2.findViewById(R.id.epoch_state_msg);
        TextView textView = (TextView) view2.findViewById(R.id.epoch_help);
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        if (button != null) {
            button.setOnClickListener(onClickListener2);
        }
    }
}
