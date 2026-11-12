package rs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrs/f;", "", "Landroid/view/ViewGroup;", "view", "<init>", "(Landroid/view/ViewGroup;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f154307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f154308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f154309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f154310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f154311e;

    public f(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f154307a = viewGroup;
        Context context = viewGroup.getContext();
        context.getClass();
        this.f154308b = context;
        viewGroup.addView(LayoutInflater.from(context).inflate(R.layout.polyline_legend_preview_map, viewGroup, false));
        this.f154309c = (ImageView) viewGroup.findViewById(R.id.legend_view);
        this.f154310d = (TextView) viewGroup.findViewById(R.id.legend_left_tv);
        this.f154311e = (TextView) viewGroup.findViewById(R.id.legend_right_tv);
    }

    public final void a(e eVar) {
        ImageView imageView = this.f154309c;
        if (imageView != null) {
            imageView.setImageDrawable(eVar.f154305c);
        }
        Context context = this.f154308b;
        TextView textView = this.f154310d;
        if (textView != null) {
            Integer num = eVar.f154303a;
            textView.setText(num != null ? context.getString(num.intValue()) : null);
        }
        TextView textView2 = this.f154311e;
        if (textView2 != null) {
            Integer num2 = eVar.f154304b;
            textView2.setText(num2 != null ? context.getString(num2.intValue()) : null);
        }
    }
}
