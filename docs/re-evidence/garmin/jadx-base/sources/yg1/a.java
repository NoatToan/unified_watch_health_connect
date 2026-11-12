package yg1;

import android.view.View;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.controlsmenu.ControlsMenuActivity;

/* JADX INFO: loaded from: classes10.dex */
public class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlsMenuActivity f196907b;

    public a(ControlsMenuActivity controlsMenuActivity, int i14) {
        this.f196907b = controlsMenuActivity;
        this.f196906a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2 A[LOOP:0: B:39:0x00ba->B:41:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        boolean z14;
        int i14;
        int i15;
        boolean[] zArr;
        g gVar;
        int i16;
        ControlsMenuActivity controlsMenuActivity = this.f196907b;
        ImageView[] imageViewArr = controlsMenuActivity.f42869h;
        int i17 = this.f196906a;
        if (imageViewArr[i17] != null) {
            g gVar2 = controlsMenuActivity.f42868g;
            f fVar = controlsMenuActivity.f42866e;
            if (gVar2 == null) {
                g gVarB = f.b(i17, fVar.f196917c);
                controlsMenuActivity.f42868g = gVarB;
                if (gVarB == null && (i16 = controlsMenuActivity.f42879r) != i17 && i16 != 255) {
                    controlsMenuActivity.f42877p[i16] = false;
                    controlsMenuActivity.f42869h[i16].setBackgroundResource(2131233562);
                    controlsMenuActivity.ha();
                    controlsMenuActivity.f42879r = i17;
                }
                i14 = controlsMenuActivity.f42879r;
                if (i14 == 255 && i14 != i17 && z14) {
                    int i18 = controlsMenuActivity.f42872k + 1;
                    g gVarB2 = f.b(i14, controlsMenuActivity.f42866e.f196917c);
                    if (gVarB2 != null) {
                        f.b(i14, controlsMenuActivity.f42866e.f196917c).f196920b = i18;
                    }
                    if (i14 < i17) {
                        controlsMenuActivity.fa(i14 + 1, i17, true);
                    } else {
                        controlsMenuActivity.fa(i14 - 1, i17, false);
                    }
                    if (gVarB2 != null) {
                        f.b(i18, controlsMenuActivity.f42866e.f196917c).f196920b = i17;
                    }
                    controlsMenuActivity.ga();
                    controlsMenuActivity.ca();
                    controlsMenuActivity.ha();
                    return;
                }
                i15 = controlsMenuActivity.f42875n;
                if (i17 < controlsMenuActivity.f42872k) {
                    zArr = controlsMenuActivity.f42877p;
                    if (zArr[i17]) {
                        zArr[i17] = false;
                        controlsMenuActivity.f42869h[i17].setBackgroundResource(2131233562);
                        controlsMenuActivity.ha();
                        return;
                    }
                    zArr[i17] = true;
                    controlsMenuActivity.f42879r = i17;
                    g gVar3 = controlsMenuActivity.f42868g;
                    e eVar = controlsMenuActivity.f42867f;
                    eVar.f196912d = i17;
                    eVar.f196913e = gVar3;
                    controlsMenuActivity.f42869h[i17].setBackgroundResource(2131233563);
                    gVar = controlsMenuActivity.f42868g;
                    if (gVar != null || !gVar.f196921c.booleanValue()) {
                        controlsMenuActivity.f42862a.setAlpha(1.0f);
                        for (int i19 = 0; i19 < controlsMenuActivity.f42862a.getChildCount(); i19++) {
                            controlsMenuActivity.f42862a.getChildAt(i19).setEnabled(true);
                        }
                        if (controlsMenuActivity.f42868g != null) {
                            controlsMenuActivity.f42870i.setImageResource(i15);
                            controlsMenuActivity.f42870i.setTag(Integer.valueOf(i15));
                            controlsMenuActivity.f42870i.setImportantForAccessibility(1);
                            controlsMenuActivity.f42870i.setContentDescription(controlsMenuActivity.getString(R.string.lbl_remove));
                        }
                    }
                    controlsMenuActivity.f42864c.setText(controlsMenuActivity.getResources().getString(R.string.tap_to_new_location));
                    controlsMenuActivity.f42876o = i17;
                }
            }
            f.b(i17, fVar.f196917c);
            z14 = true;
            i14 = controlsMenuActivity.f42879r;
            if (i14 == 255) {
            }
            i15 = controlsMenuActivity.f42875n;
            if (i17 < controlsMenuActivity.f42872k) {
                zArr = controlsMenuActivity.f42877p;
                if (zArr[i17]) {
                    zArr[i17] = false;
                    controlsMenuActivity.f42869h[i17].setBackgroundResource(2131233562);
                    controlsMenuActivity.ha();
                    return;
                }
                zArr[i17] = true;
                controlsMenuActivity.f42879r = i17;
                g gVar4 = controlsMenuActivity.f42868g;
                e eVar2 = controlsMenuActivity.f42867f;
                eVar2.f196912d = i17;
                eVar2.f196913e = gVar4;
                controlsMenuActivity.f42869h[i17].setBackgroundResource(2131233563);
                gVar = controlsMenuActivity.f42868g;
                if (gVar != null) {
                    controlsMenuActivity.f42862a.setAlpha(1.0f);
                    while (i19 < controlsMenuActivity.f42862a.getChildCount()) {
                        controlsMenuActivity.f42862a.getChildAt(i19).setEnabled(true);
                    }
                    if (controlsMenuActivity.f42868g != null) {
                        controlsMenuActivity.f42870i.setImageResource(i15);
                        controlsMenuActivity.f42870i.setTag(Integer.valueOf(i15));
                        controlsMenuActivity.f42870i.setImportantForAccessibility(1);
                        controlsMenuActivity.f42870i.setContentDescription(controlsMenuActivity.getString(R.string.lbl_remove));
                    }
                } else {
                    controlsMenuActivity.f42862a.setAlpha(1.0f);
                    while (i19 < controlsMenuActivity.f42862a.getChildCount()) {
                        controlsMenuActivity.f42862a.getChildAt(i19).setEnabled(true);
                    }
                    if (controlsMenuActivity.f42868g != null) {
                        controlsMenuActivity.f42870i.setImageResource(i15);
                        controlsMenuActivity.f42870i.setTag(Integer.valueOf(i15));
                        controlsMenuActivity.f42870i.setImportantForAccessibility(1);
                        controlsMenuActivity.f42870i.setContentDescription(controlsMenuActivity.getString(R.string.lbl_remove));
                    }
                }
                controlsMenuActivity.f42864c.setText(controlsMenuActivity.getResources().getString(R.string.tap_to_new_location));
                controlsMenuActivity.f42876o = i17;
            }
        }
        controlsMenuActivity.f42868g = null;
        z14 = false;
        i14 = controlsMenuActivity.f42879r;
        if (i14 == 255) {
        }
        i15 = controlsMenuActivity.f42875n;
        if (i17 < controlsMenuActivity.f42872k) {
            zArr = controlsMenuActivity.f42877p;
            if (zArr[i17]) {
                zArr[i17] = false;
                controlsMenuActivity.f42869h[i17].setBackgroundResource(2131233562);
                controlsMenuActivity.ha();
                return;
            }
            zArr[i17] = true;
            controlsMenuActivity.f42879r = i17;
            g gVar5 = controlsMenuActivity.f42868g;
            e eVar3 = controlsMenuActivity.f42867f;
            eVar3.f196912d = i17;
            eVar3.f196913e = gVar5;
            controlsMenuActivity.f42869h[i17].setBackgroundResource(2131233563);
            gVar = controlsMenuActivity.f42868g;
            if (gVar != null) {
                controlsMenuActivity.f42862a.setAlpha(1.0f);
                while (i19 < controlsMenuActivity.f42862a.getChildCount()) {
                    controlsMenuActivity.f42862a.getChildAt(i19).setEnabled(true);
                }
                if (controlsMenuActivity.f42868g != null) {
                    controlsMenuActivity.f42870i.setImageResource(i15);
                    controlsMenuActivity.f42870i.setTag(Integer.valueOf(i15));
                    controlsMenuActivity.f42870i.setImportantForAccessibility(1);
                    controlsMenuActivity.f42870i.setContentDescription(controlsMenuActivity.getString(R.string.lbl_remove));
                }
            } else {
                controlsMenuActivity.f42862a.setAlpha(1.0f);
                while (i19 < controlsMenuActivity.f42862a.getChildCount()) {
                    controlsMenuActivity.f42862a.getChildAt(i19).setEnabled(true);
                }
                if (controlsMenuActivity.f42868g != null) {
                    controlsMenuActivity.f42870i.setImageResource(i15);
                    controlsMenuActivity.f42870i.setTag(Integer.valueOf(i15));
                    controlsMenuActivity.f42870i.setImportantForAccessibility(1);
                    controlsMenuActivity.f42870i.setContentDescription(controlsMenuActivity.getString(R.string.lbl_remove));
                }
            }
            controlsMenuActivity.f42864c.setText(controlsMenuActivity.getResources().getString(R.string.tap_to_new_location));
            controlsMenuActivity.f42876o = i17;
        }
    }
}
