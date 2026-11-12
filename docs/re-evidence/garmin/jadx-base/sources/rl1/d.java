package rl1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrl1/d;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f153409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c[] f153410b;

    public d(View view2) {
        this.f153409a = view2;
        this.f153410b = new c[]{new c(view2 != null ? (ViewGroup) view2.findViewById(R.id.highlight_value_1_frame) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_1) : null, null, null), new c(view2 != null ? (ViewGroup) view2.findViewById(R.id.highlight_value_2_frame) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_2) : null, null, view2 != null ? view2.findViewById(R.id.highlight_divider_1) : null), new c(view2 != null ? (ViewGroup) view2.findViewById(R.id.highlight_value_3_frame) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_3) : null, null, view2 != null ? view2.findViewById(R.id.highlight_divider_2) : null), new c(view2 != null ? (ViewGroup) view2.findViewById(R.id.highlight_value_4_frame) : null, view2 != null ? (TextView) view2.findViewById(R.id.highlight_value_4) : null, null, view2 != null ? view2.findViewById(R.id.highlight_divider_3) : null)};
    }
}
