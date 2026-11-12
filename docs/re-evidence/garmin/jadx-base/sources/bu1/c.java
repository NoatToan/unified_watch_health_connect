package bu1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.media3.common.e0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.training.atp.create.video.PlayerActivity;
import hb2.i;
import org.koin.java.KoinJavaComponent;
import rt1.m;
import sa.r;
import wa.e;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f21238b;

    public /* synthetic */ c(PlayerActivity playerActivity, int i14) {
        this.f21237a = i14;
        this.f21238b = playerActivity;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0062  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        a aVar;
        e0 e0VarA;
        int i14 = this.f21237a;
        PlayerActivity playerActivity = this.f21238b;
        switch (i14) {
            case 0:
                int i15 = PlayerActivity.f45317p;
                playerActivity.P9();
                break;
            default:
                if (playerActivity.f45320c != null && i.a(playerActivity)) {
                    e eVar = playerActivity.f45320c;
                    wa.i.a aVar2 = eVar != null ? eVar.f183746c : null;
                    if (aVar2 != null && playerActivity.O9() >= 0 && (aVar = playerActivity.f45321d) != null) {
                        int iO9 = playerActivity.O9();
                        e eVar2 = aVar.f21223a;
                        aVar.f21225c = iO9;
                        r rVar = aVar2.f183749c[iO9];
                        aVar.f21226d = rVar;
                        boolean[] zArr = new boolean[rVar != null ? rVar.f158153a : 0];
                        int i16 = rVar != null ? rVar.f158153a : 0;
                        int i17 = 0;
                        while (true) {
                            boolean z14 = true;
                            if (i17 >= i16) {
                                aVar.f21227e = eVar2.a().f183701y0.get(iO9);
                                r rVar2 = aVar.f21226d;
                                aVar.f21228f = (rVar2 == null || rVar2.f158153a == 0) ? null : eVar2.a().A.get(rVar2.a(0));
                                aVar.f21231i = ((m) KoinJavaComponent.get$default(m.class, null, null, 6, null)).H();
                                androidx.appcompat.app.e.a aVar3 = new androidx.appcompat.app.e.a(playerActivity);
                                androidx.appcompat.app.e.a title = aVar3.setTitle(playerActivity.getString(R.string.lbl_close_captioning));
                                Context context = aVar3.getContext();
                                context.getClass();
                                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                                View viewInflate = layoutInflaterFrom.inflate(R.layout.video_track_selection_dialog, (ViewGroup) null);
                                View viewFindViewById = viewInflate.findViewById(R.id.root);
                                viewFindViewById.getClass();
                                ViewGroup viewGroup = (ViewGroup) viewFindViewById;
                                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
                                typedArrayObtainStyledAttributes.getClass();
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                                typedArrayObtainStyledAttributes.recycle();
                                View viewInflate2 = layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, viewGroup, false);
                                viewInflate2.getClass();
                                CheckedTextView checkedTextView = (CheckedTextView) viewInflate2;
                                aVar.f21229g = checkedTextView;
                                checkedTextView.setBackgroundResource(resourceId);
                                CheckedTextView checkedTextView2 = aVar.f21229g;
                                if (checkedTextView2 != null) {
                                    checkedTextView2.setText(R.string.lbl_hide);
                                }
                                CheckedTextView checkedTextView3 = aVar.f21229g;
                                if (checkedTextView3 != null) {
                                    checkedTextView3.setFocusable(true);
                                }
                                CheckedTextView checkedTextView4 = aVar.f21229g;
                                if (checkedTextView4 != null) {
                                    checkedTextView4.setOnClickListener(aVar);
                                }
                                viewGroup.addView(aVar.f21229g);
                                View viewInflate3 = layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, viewGroup, false);
                                viewInflate3.getClass();
                                CheckedTextView checkedTextView5 = (CheckedTextView) viewInflate3;
                                aVar.f21230h = checkedTextView5;
                                checkedTextView5.setBackgroundResource(resourceId);
                                CheckedTextView checkedTextView6 = aVar.f21230h;
                                if (checkedTextView6 != null) {
                                    checkedTextView6.setText(R.string.device_settings_notifications_show);
                                }
                                CheckedTextView checkedTextView7 = aVar.f21230h;
                                if (checkedTextView7 != null) {
                                    checkedTextView7.setFocusable(true);
                                }
                                CheckedTextView checkedTextView8 = aVar.f21230h;
                                if (checkedTextView8 != null) {
                                    checkedTextView8.setOnClickListener(aVar);
                                }
                                viewGroup.addView(layoutInflaterFrom.inflate(R.layout.gcm_divider_line_thin, viewGroup, false));
                                viewGroup.addView(aVar.f21230h);
                                aVar.a();
                                title.setView(viewInflate).setPositiveButton(android.R.string.ok, aVar).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
                            } else {
                                if (aVar.f21224b == null || aVar2.a(iO9, i17) == 0) {
                                    z14 = false;
                                } else {
                                    r rVar3 = aVar.f21226d;
                                    if (((rVar3 == null || (e0VarA = rVar3.a(i17)) == null) ? 0 : e0VarA.f8214a) <= 1) {
                                        z14 = false;
                                    }
                                }
                                zArr[i17] = z14;
                                i17++;
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }
}
