package cw1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.material.slider.RangeSlider;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f56223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f56224c;

    public /* synthetic */ u0(List list, p3.p1 p1Var, int i14) {
        this.f56222a = i14;
        this.f56223b = list;
        this.f56224c = p1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f56222a) {
            case 0:
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                List list = this.f56223b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e2.f0.b(f0Var, null, new z3.e(2031356027, true, new aa2.f(23, (z20.e) it.next(), this.f56224c)), 3);
                }
                e2.f0.b(f0Var, null, new z3.e(710422179, true, new a31.a(list, 5)), 3);
                return Unit.INSTANCE;
            default:
                Context context = (Context) obj;
                context.getClass();
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.climb_difficulty_slider, (ViewGroup) null);
                ((RangeSlider) viewInflate.findViewById(R.id.climb_difficulty_slider)).addOnSliderTouchListener(new n40.a.C2319a(this.f56223b, this.f56224c));
                ((TextView) viewInflate.findViewById(R.id.cat4_text)).setText(viewInflate.getContext().getString(R.string.lbl_abbreviated_category, "4"));
                ((TextView) viewInflate.findViewById(R.id.cat3_text)).setText(viewInflate.getContext().getString(R.string.lbl_abbreviated_category, "3"));
                ((TextView) viewInflate.findViewById(R.id.cat2_text)).setText(viewInflate.getContext().getString(R.string.lbl_abbreviated_category, "2"));
                ((TextView) viewInflate.findViewById(R.id.cat1_text)).setText(viewInflate.getContext().getString(R.string.lbl_abbreviated_category, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
                return viewInflate;
        }
    }
}
