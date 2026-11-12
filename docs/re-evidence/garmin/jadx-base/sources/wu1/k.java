package wu1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import bv1.m;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import vg1.z0;
import vu1.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwu1/k;", "Lbv1/m;", "Landroid/view/LayoutInflater;", "inflater", "Lvu1/w;", "actionListener", "<init>", "(Landroid/view/LayoutInflater;Lvu1/w;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f187323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatButton f187324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f187325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f187326e;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(LayoutInflater layoutInflater, w wVar) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm4_training_feed_paused, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        this.f187323b = wVar;
        AppCompatButton appCompatButton = (AppCompatButton) this.f21420a.findViewById(R.id.atp_dashboard_resume_btn);
        this.f187324c = appCompatButton;
        this.f187325d = (TextView) this.f21420a.findViewById(R.id.atp_dashboard_paused_state);
        this.f187326e = (TextView) this.f21420a.findViewById(R.id.atp_dashboard_paused_state_label);
        appCompatButton.setOnClickListener(new z0(this, 14));
    }
}
