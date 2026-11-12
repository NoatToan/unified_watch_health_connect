package wt1;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import aq.q1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwt1/b;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f187026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f187027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f187028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f187029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Button f187030e;

    public b(View view2) {
        this.f187026a = view2;
        this.f187027b = view2 != null ? (TextView) view2.findViewById(R.id.training_error_title) : null;
        this.f187028c = view2 != null ? (TextView) view2.findViewById(R.id.training_error_body) : null;
        this.f187029d = view2 != null ? (Button) view2.findViewById(R.id.training_error_try_again_button) : null;
        this.f187030e = view2 != null ? (Button) view2.findViewById(R.id.training_error_cancel_setup_button) : null;
    }

    public final void a() {
        Button button = this.f187030e;
        if (button != null) {
            button.setVisibility(8);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void b() {
        TextView textView = this.f187027b;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null) {
            textView.setText(R.string.lbl_whoops);
        }
        TextView textView2 = this.f187028c;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (textView2 != null) {
            textView2.setText(R.string.lbl_atp_error);
        }
    }

    public final Unit c(e23.a<Unit> aVar) {
        aVar.getClass();
        Button button = this.f187029d;
        if (button == null) {
            return null;
        }
        button.setOnClickListener(new q1(aVar, 21));
        return Unit.INSTANCE;
    }

    public final Unit d(e23.a<Unit> aVar) {
        Button button = this.f187030e;
        if (button == null) {
            return null;
        }
        button.setOnClickListener(new q1(aVar, 22));
        return Unit.INSTANCE;
    }

    public final Unit e() {
        View view2 = this.f187026a;
        if (view2 == null) {
            return null;
        }
        view2.setVisibility(8);
        return Unit.INSTANCE;
    }

    public final void f() {
        Button button = this.f187030e;
        if (button != null) {
            button.setText(R.string.lbl_cancel);
        }
    }

    public final Unit g() {
        View view2 = this.f187026a;
        if (view2 == null) {
            return null;
        }
        view2.setVisibility(0);
        return Unit.INSTANCE;
    }
}
