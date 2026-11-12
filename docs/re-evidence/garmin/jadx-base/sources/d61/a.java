package d61;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import e32.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld61/a;", "Le32/p;", "Lc61/c;", "Landroid/view/View;", "view", "Lc61/a;", "trainingStatusAcclimationType", "<init>", "(Landroid/view/View;Lc61/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements p<c61.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c61.a f57967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f57968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f57969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f57970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f57971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f57972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f57973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f57974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f57975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f57976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f57977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f57978l;

    public a(View view2, c61.a aVar) {
        view2.getClass();
        aVar.getClass();
        this.f57967a = aVar;
        this.f57968b = view2.getContext();
        this.f57969c = (TextView) view2.findViewById(R.id.acclimation_timestamp);
        this.f57970d = (LinearLayout) view2.findViewById(R.id.layout_acclimation_value);
        this.f57971e = (TextView) view2.findViewById(R.id.acclimation_value);
        this.f57972f = (TextView) view2.findViewById(R.id.acclimation_unit);
        this.f57973g = view2.findViewById(R.id.acclimation_trend_view);
        this.f57974h = (ImageView) view2.findViewById(R.id.acclimation_trend_icon);
        this.f57975i = (TextView) view2.findViewById(R.id.acclimation_trend_info);
        this.f57976j = (TextView) view2.findViewById(R.id.acclimation_trend_message);
        this.f57977k = (TextView) view2.findViewById(R.id.label_no_data);
        this.f57978l = (TextView) view2.findViewById(R.id.message_no_data);
    }

    @Override // e32.p
    public final void a() {
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(c61.c cVar) {
        return false;
    }

    @Override // e32.p
    public final void c(c61.c cVar) {
        String str;
        c61.c cVar2 = cVar;
        TextView textView = this.f57969c;
        TextView textView2 = this.f57978l;
        TextView textView3 = this.f57977k;
        TextView textView4 = this.f57976j;
        TextView textView5 = this.f57975i;
        ImageView imageView = this.f57974h;
        Context context = this.f57968b;
        LinearLayout linearLayout = this.f57970d;
        if (cVar2 != null) {
            String str2 = cVar2.f24644g;
            String str3 = cVar2.f24641d;
            String str4 = cVar2.f24643f;
            Integer num = cVar2.f24642e;
            String str5 = cVar2.f24639b;
            if (cVar2.f24645h == null) {
                c61.a aVar = this.f57967a;
                c61.a aVar2 = c61.a.ALTITUDE;
                View view2 = this.f57973g;
                TextView textView6 = this.f57972f;
                TextView textView7 = this.f57971e;
                if (aVar != aVar2) {
                    textView.getClass();
                    textView.setVisibility(8);
                    linearLayout.getClass();
                    linearLayout.setVisibility(0);
                    textView7.getClass();
                    v22.e.o(textView7, str5);
                    textView6.getClass();
                    textView6.setVisibility(8);
                    imageView.getClass();
                    v22.e.k(imageView, num != null ? a7.b.getDrawable(context, num.intValue()) : null);
                    view2.getClass();
                    v22.e.r(view2, imageView.getVisibility() == 0);
                    imageView.setContentDescription(str4);
                    textView5.getClass();
                    v22.e.o(textView5, str3);
                    textView4.getClass();
                    v22.e.o(textView4, str2);
                    textView3.getClass();
                    textView3.setVisibility(8);
                    textView2.getClass();
                    textView2.setVisibility(8);
                    return;
                }
                textView.getClass();
                v22.e.o(textView, cVar2.f24638a);
                linearLayout.getClass();
                linearLayout.setVisibility(0);
                textView7.getClass();
                v22.e.o(textView7, str5);
                textView6.getClass();
                String str6 = cVar2.f24640c;
                v22.e.o(textView6, str6);
                context.getClass();
                textView6.setContentDescription(oi0.c.A(context, new com.google.maps.android.compose.clustering.d(26), str6));
                imageView.getClass();
                v22.e.k(imageView, num != null ? a7.b.getDrawable(context, num.intValue()) : null);
                view2.getClass();
                v22.e.r(view2, imageView.getVisibility() == 0);
                imageView.setContentDescription(str4);
                textView5.getClass();
                v22.e.o(textView5, str3);
                textView4.getClass();
                v22.e.o(textView4, str2);
                textView3.getClass();
                textView3.setVisibility(8);
                textView2.getClass();
                textView2.setVisibility(8);
                return;
            }
        }
        textView.getClass();
        textView.setVisibility(8);
        linearLayout.getClass();
        linearLayout.setVisibility(8);
        imageView.getClass();
        imageView.setVisibility(8);
        textView5.getClass();
        textView5.setVisibility(8);
        textView4.getClass();
        textView4.setVisibility(8);
        textView3.getClass();
        v22.e.o(textView3, context.getString(R.string.lbl_no_acclimation_data));
        textView2.getClass();
        if (cVar2 == null || (str = cVar2.f24645h) == null) {
            str = "";
        }
        v22.e.o(textView2, str);
    }
}
