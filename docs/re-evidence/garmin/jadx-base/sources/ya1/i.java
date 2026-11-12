package ya1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lya1/i;", "", "Landroid/view/View;", "rootView", "", "currentFTP", "Lkotlin/Function1;", "", "ftpChangeListener", "<init>", "(Landroid/view/View;ILe23/l;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<Integer, Unit> f195563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f195564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f195565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f195566d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(View view2, int i14, e23.l<? super Integer, Unit> lVar) {
        view2.getClass();
        this.f195563a = lVar;
        this.f195564b = view2.getContext();
        TextView textView = (TextView) view2.findViewById(R.id.label_top);
        this.f195565c = (TextView) view2.findViewById(R.id.label_bottom);
        this.f195566d = i14;
        textView.setText(R.string.power_guide_current_ftp);
        v22.d.d(textView, new h(0));
        a(i14);
        view2.setOnClickListener(new xp0.d(this, 10));
    }

    public final void a(int i14) {
        this.f195566d = i14;
        String string = this.f195564b.getString(R.string.devices_lbl_watts_with_format, String.valueOf(i14));
        TextView textView = this.f195565c;
        textView.setText(string);
        v22.d.d(textView, new h(1));
    }
}
