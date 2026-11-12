package yg1;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import aq.b0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.controlsmenu.ControlsMenuActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class e extends fe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControlsMenuActivity f196909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f196910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f196911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f196912d = 255;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f196913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f196914f;

    public e(ControlsMenuActivity controlsMenuActivity, f fVar, int i14) {
        this.f196909a = controlsMenuActivity;
        this.f196910b = (LayoutInflater) controlsMenuActivity.getSystemService("layout_inflater");
        this.f196911c = fVar;
        this.f196914f = i14;
    }

    public final void a(int i14, int i15, boolean z14) {
        f fVar = this.f196911c;
        ArrayList<g> arrayList = fVar.f196918d;
        ArrayList<g> arrayList2 = fVar.f196918d;
        ArrayList<g> arrayList3 = fVar.f196917c;
        g gVar = (arrayList == null || z14) ? null : arrayList.get(i14);
        g gVarB = f.b(i15, arrayList3);
        if (gVarB != null && ((arrayList != null && i14 < arrayList.size()) || z14)) {
            arrayList3.remove(f.b(i15, arrayList3));
            gVarB.f196920b = 255;
            if (z14) {
                arrayList2.add(gVarB);
            } else {
                arrayList2.add(i14 + 1, gVarB);
            }
        }
        if (gVar != null && i14 < arrayList.size()) {
            arrayList2.remove(i14);
            gVar.f196920b = i15;
            arrayList3.add(gVar);
        }
        ControlsMenuActivity controlsMenuActivity = this.f196909a;
        g gVarB2 = f.b(i15, controlsMenuActivity.f42866e.f196917c);
        controlsMenuActivity.f42869h[i15].setBackgroundResource(2131233562);
        ImageView[] imageViewArr = controlsMenuActivity.f42869h;
        if (gVarB2 != null) {
            imageViewArr[i15].setImageResource(gVarB2.f196922d);
            int i16 = gVarB2.f196924f;
            ImageView[] imageViewArr2 = controlsMenuActivity.f42869h;
            if (i16 != 0) {
                imageViewArr2[i15].setImageTintList(ColorStateList.valueOf(a7.b.getColor(controlsMenuActivity, i16)));
            } else {
                imageViewArr2[i15].setImageTintList(null);
            }
            controlsMenuActivity.f42869h[i15].setContentDescription(controlsMenuActivity.getString(gVarB2.f196925g));
        } else {
            imageViewArr[i15].setImageResource(R.drawable.plus);
            controlsMenuActivity.f42869h[i15].setImageTintList(ColorStateList.valueOf(a7.b.getColor(controlsMenuActivity, R.color.gcm_icon_on_color)));
            controlsMenuActivity.f42869h[i15].setContentDescription(controlsMenuActivity.getString(R.string.lbl_add));
        }
        controlsMenuActivity.f42877p[i15] = false;
        controlsMenuActivity.ha();
        controlsMenuActivity.f42867f.notifyDataSetChanged();
    }

    @Override // fe.a
    public final void destroyItem(ViewGroup viewGroup, int i14, Object obj) {
        viewGroup.removeView((LinearLayout) obj);
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF149591t() {
        return this.f196911c.f196918d.size();
    }

    @Override // fe.a
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // fe.a
    public final float getPageWidth(int i14) {
        return 1.0f / this.f196914f;
    }

    @Override // fe.a
    public final Object instantiateItem(ViewGroup viewGroup, int i14) {
        View viewInflate = this.f196910b.inflate(R.layout.gcm3_controls_menu_carousel_item, viewGroup, false);
        g gVar = this.f196911c.f196918d.get(i14);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_control_menu_carousel_item);
        imageView.setImageResource(gVar.f196922d);
        if (gVar.f196923e != 0) {
            imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(viewGroup.getContext(), gVar.f196923e)));
        } else {
            imageView.setImageTintList(null);
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_control_menu_item_text);
        textView.setText(gVar.f196925g);
        if (c22.b.a(viewGroup.getContext()) >= 1.5f) {
            textView.setTextSize(0, (int) c22.b.b(viewGroup.getContext(), viewGroup.getContext().getResources().getDimension(R.dimen.andfont_body_1), 1.4f));
        }
        viewInflate.setOnClickListener(new b0(this, i14, 22));
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    @Override // fe.a
    public final boolean isViewFromObject(View view2, Object obj) {
        return view2 == ((LinearLayout) obj);
    }
}
