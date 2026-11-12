package jm;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import gz.c;
import gz.f;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@e
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Ljm/a;", "Lgz/c;", "Landroid/content/Context;", "ctx", "Lgz/f;", "markerValueFormatter", "<init>", "(Landroid/content/Context;Lgz/f;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends c {
    public final TextView A;
    public final TextView B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f99558y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextView f99559z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, f fVar) {
        super(context, R.layout.horizontal_hover_marker_layout, fVar);
        context.getClass();
        View viewFindViewById = findViewById(R.id.value_label);
        viewFindViewById.getClass();
        this.f99558y = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.second_value_label);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f99559z = textView;
        View viewFindViewById3 = findViewById(R.id.extra_marker_label);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.A = textView2;
        View viewFindViewById4 = findViewById(R.id.overlay_value_label);
        viewFindViewById4.getClass();
        this.B = (TextView) viewFindViewById4;
        textView.setVisibility(0);
        findViewById(R.id.separator1).setVisibility(0);
        textView2.setVisibility(0);
        findViewById(R.id.separator2).setVisibility(0);
        findViewById(R.id.separator4).setVisibility(8);
        findViewById(R.id.time_label).setVisibility(8);
    }

    @Override // gz.c
    public final void f(String str, String str2, String str3, String str4) {
        this.f99558y.setText(str);
        int i14 = 8;
        int i15 = (str2 == null || !(w.J(str2) ^ true)) ? 8 : 0;
        TextView textView = this.f99559z;
        textView.setVisibility(i15);
        findViewById(R.id.separator1).setVisibility(i15);
        textView.setText(str2);
        int i16 = (str4 == null || !(w.J(str4) ^ true)) ? 8 : 0;
        TextView textView2 = this.A;
        textView2.setVisibility(textView2.getVisibility());
        findViewById(R.id.separator2).setVisibility(i16);
        textView2.setText(str4);
        if (str3 != null && (!w.J(str3))) {
            i14 = 0;
        }
        TextView textView3 = this.B;
        textView3.setVisibility(i14);
        findViewById(R.id.separator3).setVisibility(i14);
        textView3.setText(str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, null);
        context.getClass();
    }
}
