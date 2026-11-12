package ya1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import aq.q1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lya1/x;", "", "Landroid/view/View;", "rootView", "Lab1/p;", "terrain", "Lkotlin/Function0;", "", "onClickListener", "<init>", "(Landroid/view/View;Lab1/p;Le23/a;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f195633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f195634b;

    public x(View view2, ab1.p pVar, e23.a<Unit> aVar) {
        view2.getClass();
        pVar.getClass();
        aVar.getClass();
        this.f195633a = (ImageView) view2.findViewById(R.id.icon);
        TextView textView = (TextView) view2.findViewById(R.id.label_top);
        this.f195634b = (TextView) view2.findViewById(R.id.label_bottom);
        textView.setText(R.string.lbl_terrain);
        a(pVar);
        view2.setOnClickListener(new q1(aVar, 28));
    }

    public final void a(ab1.p pVar) {
        int i14 = pVar.f2635c;
        ImageView imageView = this.f195633a;
        imageView.setImageResource(i14);
        Context context = imageView.getContext();
        context.getClass();
        Resources resources = imageView.getResources();
        resources.getClass();
        int iC = (int) c22.b.c(context, xy2.b.n(resources, 32.0f), 1.5f);
        imageView.getLayoutParams().width = iC;
        imageView.getLayoutParams().height = iC;
        imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(imageView.getContext(), R.color.gcm_icon_primary)));
        this.f195634b.setText(pVar.f2636d);
    }
}
