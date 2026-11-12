package g62;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.badges.redesign.BadgeDetailsActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import mt0.z1;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f76071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f76072d;

    public /* synthetic */ d0(Object obj, int i14, Object obj2, int i15) {
        this.f76069a = i15;
        this.f76071c = obj;
        this.f76070b = i14;
        this.f76072d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14;
        int i15 = this.f76069a;
        final int i16 = 0;
        final int i17 = 1;
        Object obj = this.f76072d;
        final int i18 = this.f76070b;
        Object obj2 = this.f76071c;
        switch (i15) {
            case 0:
                e0 e0Var = (e0) obj2;
                e0Var.f76077b.invoke(e0Var.f76076a.get(i18), Integer.valueOf(i18));
                ((c0) ((RecyclerView.f0) obj)).f76065a.setChecked(true);
                return;
            case 1:
                ((jd1.b.c) obj2).f98405a.b((pd1.b) obj, i18);
                return;
            case 2:
                mt0.t tVar = (mt0.t) obj;
                ((mt0.u.e) obj2).f120874a.invoke(Integer.valueOf(i18), new mt0.t(tVar.f120858a, tVar.f120859b, tVar.f120860c, tVar.f120861d, tVar.f120862e, tVar.f120863f, !tVar.f120864g));
                return;
            case 3:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.y yVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.y) obj2;
                z1 z1Var = (z1) obj;
                List<T> list = yVar.f10698a.f10426f;
                list.getClass();
                boolean zIsSelected = view2.isSelected();
                boolean z14 = !zIsSelected;
                if (i18 == 0) {
                    if (zIsSelected) {
                        return;
                    }
                    int i19 = 0;
                    for (Object obj3 : list) {
                        int i24 = i19 + 1;
                        if (i19 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        z1 z1Var2 = (z1) obj3;
                        if (z1Var2.f120949b) {
                            z1Var2.f120949b = false;
                            yVar.notifyItemChanged(i19);
                        }
                        i19 = i24;
                    }
                } else if (zIsSelected) {
                    if (list.isEmpty()) {
                        i14 = 0;
                    } else {
                        Iterator it = list.iterator();
                        i14 = 0;
                        while (it.hasNext()) {
                            if (((z1) it.next()).f120949b && (i14 = i14 + 1) < 0) {
                                p13.x.p();
                                throw null;
                            }
                        }
                    }
                    if (i14 == 1) {
                        ((z1) list.get(0)).f120949b = true;
                        yVar.notifyItemChanged(0);
                    }
                } else if (((z1) list.get(0)).f120949b) {
                    ((z1) list.get(0)).f120949b = false;
                    yVar.notifyItemChanged(0);
                }
                z1Var.f120949b = z14;
                view2.setSelected(z14);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (((z1) obj4).f120949b) {
                        arrayList.add(obj4);
                    }
                }
                com.garmin.android.apps.connectmobile.leaderboard.challenges.y.b<T> bVar = yVar.f37965b;
                if (bVar != 0) {
                    bVar.Q8(arrayList);
                    return;
                }
                return;
            case 4:
                com.garmin.android.apps.connectmobile.userprofile.editimage.g gVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.g) obj2;
                int i25 = com.garmin.android.apps.connectmobile.userprofile.editimage.g.a.f46712c;
                gVar.f46709a.E2((com.garmin.android.apps.connectmobile.userprofile.model.a) obj);
                gVar.r(i18);
                return;
            case 5:
                com.garmin.android.apps.connectmobile.devices.model.i iVar = (com.garmin.android.apps.connectmobile.devices.model.i) obj;
                com.garmin.android.apps.connectmobile.settings.devices.d.b bVar2 = ((com.garmin.android.apps.connectmobile.settings.devices.d) obj2).f42887a;
                if (bVar2 != null) {
                    bVar2.C7(i18, iVar);
                    return;
                }
                return;
            case 6:
                view2.getClass();
                com.garmin.android.apps.connectmobile.badges.redesign.k.b bVar3 = ((com.garmin.android.apps.connectmobile.badges.redesign.k) obj2).f30519b;
                bVar3.f30522a.get(i18).A0();
                com.garmin.android.apps.connectmobile.badges.redesign.k kVar = com.garmin.android.apps.connectmobile.badges.redesign.k.this;
                kVar.f().r(kVar, i18);
                Context context = view2.getContext();
                BadgeDetailsActivity.a aVar = BadgeDetailsActivity.f30322l;
                int badgeId = ((com.garmin.android.apps.connectmobile.badges.service.model.m) obj).getBadgeId();
                aVar.getClass();
                context.startActivity(BadgeDetailsActivity.a.a(badgeId, context));
                return;
            default:
                final xf1.c cVar = (xf1.c) obj2;
                SegmentDetailsDTO segmentDetailsDTO = (SegmentDetailsDTO) obj;
                int i26 = xf1.c.f190634q;
                boolean z15 = segmentDetailsDTO != null && segmentDetailsDTO.f17840e;
                long j8 = segmentDetailsDTO != null ? segmentDetailsDTO.f17837b : -1L;
                xf1.n nVar = cVar.f190635a;
                if (z15) {
                    if (nVar != null) {
                        String strValueOf = String.valueOf(j8);
                        strValueOf.getClass();
                        xy2.b.K(nVar, new xf1.m(strValueOf, null)).f(cVar, new xf1.c.d(new e23.l() { // from class: xf1.b
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                SegmentDetailsDTO segmentDetailsDTO2;
                                SegmentDetailsDTO segmentDetailsDTO3;
                                int i27 = i16;
                                int i28 = i18;
                                c cVar2 = cVar;
                                switch (i27) {
                                    case 0:
                                        g3 g3Var = (g3) obj5;
                                        int i29 = c.f190634q;
                                        g3Var.getClass();
                                        int i30 = c.C3549c.f190656a[g3Var.f35300a.ordinal()];
                                        if (i30 != 1) {
                                            if (i30 == 2) {
                                                cVar2.hideProgressOverlay();
                                                String string = cVar2.getString(R.string.activity_unfavorite_general_success_message);
                                                string.getClass();
                                                Toast toastMakeText = Toast.makeText(cVar2, string, 1);
                                                toastMakeText.setGravity(80, 0, 0);
                                                toastMakeText.show();
                                                ImageView imageView = cVar2.f190643i;
                                                if (imageView != null) {
                                                    imageView.setImageResource(R.drawable.star_outlined);
                                                }
                                                ImageView imageView2 = cVar2.f190643i;
                                                if (imageView2 != null) {
                                                    imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(cVar2, R.color.gcm_icon_secondary)));
                                                }
                                                try {
                                                    ArrayList<SegmentDetailsDTO> arrayList2 = cVar2.f190649o;
                                                    if (arrayList2 != null && (segmentDetailsDTO2 = arrayList2.get(i28)) != null) {
                                                        segmentDetailsDTO2.f17840e = false;
                                                    }
                                                } catch (IndexOutOfBoundsException e4) {
                                                    i2.a.j(i2.f36769a, "AbstractSegActivity", "toggleActivityFavoriteStatus() exception on index: " + e4.getMessage());
                                                }
                                                Intent intent = new Intent();
                                                intent.putParcelableArrayListExtra("GCM_extra_segments_list", cVar2.f190649o);
                                                cVar2.setResult(-1, intent);
                                            } else {
                                                if (i30 != 3) {
                                                    u0.r();
                                                    return null;
                                                }
                                                cVar2.hideProgressOverlay();
                                                new androidx.appcompat.app.e.a(cVar2).setTitle(R.string.dialog_title_error).setMessage(R.string.msg_segments_unfavorite_general_failure).setNeutralButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                                            }
                                            break;
                                        } else {
                                            cVar2.showProgressOverlay();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        g3 g3Var2 = (g3) obj5;
                                        int i34 = c.f190634q;
                                        g3Var2.getClass();
                                        int i35 = c.C3549c.f190656a[g3Var2.f35300a.ordinal()];
                                        if (i35 != 1) {
                                            if (i35 == 2) {
                                                cVar2.hideProgressOverlay();
                                                String string2 = cVar2.getString(R.string.activity_favorite_general_success_message);
                                                string2.getClass();
                                                Toast toastMakeText2 = Toast.makeText(cVar2, string2, 1);
                                                toastMakeText2.setGravity(80, 0, 0);
                                                toastMakeText2.show();
                                                ImageView imageView3 = cVar2.f190643i;
                                                if (imageView3 != null) {
                                                    imageView3.setImageResource(R.drawable.star_filled);
                                                }
                                                ImageView imageView4 = cVar2.f190643i;
                                                if (imageView4 != null) {
                                                    imageView4.setImageTintList(ColorStateList.valueOf(a7.b.getColor(cVar2, R.color.gds_data_viz_yellow_primary)));
                                                }
                                                try {
                                                    ArrayList<SegmentDetailsDTO> arrayList3 = cVar2.f190649o;
                                                    if (arrayList3 != null && (segmentDetailsDTO3 = arrayList3.get(i28)) != null) {
                                                        segmentDetailsDTO3.f17840e = true;
                                                    }
                                                } catch (IndexOutOfBoundsException e14) {
                                                    i2.a.j(i2.f36769a, "AbstractSegActivity", "toggleActivityFavoriteStatus() exception on index: " + e14.getMessage());
                                                }
                                                Intent intent2 = new Intent();
                                                intent2.putParcelableArrayListExtra("GCM_extra_segments_list", cVar2.f190649o);
                                                cVar2.setResult(-1, intent2);
                                            } else {
                                                if (i35 != 3) {
                                                    u0.r();
                                                    return null;
                                                }
                                                cVar2.hideProgressOverlay();
                                                new androidx.appcompat.app.e.a(cVar2).setTitle(R.string.dialog_title_error).setMessage(R.string.msg_segments_favorite_general_failure).setNeutralButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                                            }
                                            break;
                                        } else {
                                            cVar2.showProgressOverlay();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }));
                        return;
                    }
                    return;
                }
                if (nVar != null) {
                    String strValueOf2 = String.valueOf(j8);
                    strValueOf2.getClass();
                    xy2.b.K(nVar, new xf1.l(strValueOf2, null)).f(cVar, new xf1.c.d(new e23.l() { // from class: xf1.b
                        @Override // e23.l
                        public final Object invoke(Object obj5) {
                            SegmentDetailsDTO segmentDetailsDTO2;
                            SegmentDetailsDTO segmentDetailsDTO3;
                            int i27 = i17;
                            int i28 = i18;
                            c cVar2 = cVar;
                            switch (i27) {
                                case 0:
                                    g3 g3Var = (g3) obj5;
                                    int i29 = c.f190634q;
                                    g3Var.getClass();
                                    int i30 = c.C3549c.f190656a[g3Var.f35300a.ordinal()];
                                    if (i30 != 1) {
                                        if (i30 == 2) {
                                            cVar2.hideProgressOverlay();
                                            String string = cVar2.getString(R.string.activity_unfavorite_general_success_message);
                                            string.getClass();
                                            Toast toastMakeText = Toast.makeText(cVar2, string, 1);
                                            toastMakeText.setGravity(80, 0, 0);
                                            toastMakeText.show();
                                            ImageView imageView = cVar2.f190643i;
                                            if (imageView != null) {
                                                imageView.setImageResource(R.drawable.star_outlined);
                                            }
                                            ImageView imageView2 = cVar2.f190643i;
                                            if (imageView2 != null) {
                                                imageView2.setImageTintList(ColorStateList.valueOf(a7.b.getColor(cVar2, R.color.gcm_icon_secondary)));
                                            }
                                            try {
                                                ArrayList<SegmentDetailsDTO> arrayList2 = cVar2.f190649o;
                                                if (arrayList2 != null && (segmentDetailsDTO2 = arrayList2.get(i28)) != null) {
                                                    segmentDetailsDTO2.f17840e = false;
                                                }
                                            } catch (IndexOutOfBoundsException e4) {
                                                i2.a.j(i2.f36769a, "AbstractSegActivity", "toggleActivityFavoriteStatus() exception on index: " + e4.getMessage());
                                            }
                                            Intent intent = new Intent();
                                            intent.putParcelableArrayListExtra("GCM_extra_segments_list", cVar2.f190649o);
                                            cVar2.setResult(-1, intent);
                                        } else {
                                            if (i30 != 3) {
                                                u0.r();
                                                return null;
                                            }
                                            cVar2.hideProgressOverlay();
                                            new androidx.appcompat.app.e.a(cVar2).setTitle(R.string.dialog_title_error).setMessage(R.string.msg_segments_unfavorite_general_failure).setNeutralButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                                        }
                                        break;
                                    } else {
                                        cVar2.showProgressOverlay();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    g3 g3Var2 = (g3) obj5;
                                    int i34 = c.f190634q;
                                    g3Var2.getClass();
                                    int i35 = c.C3549c.f190656a[g3Var2.f35300a.ordinal()];
                                    if (i35 != 1) {
                                        if (i35 == 2) {
                                            cVar2.hideProgressOverlay();
                                            String string2 = cVar2.getString(R.string.activity_favorite_general_success_message);
                                            string2.getClass();
                                            Toast toastMakeText2 = Toast.makeText(cVar2, string2, 1);
                                            toastMakeText2.setGravity(80, 0, 0);
                                            toastMakeText2.show();
                                            ImageView imageView3 = cVar2.f190643i;
                                            if (imageView3 != null) {
                                                imageView3.setImageResource(R.drawable.star_filled);
                                            }
                                            ImageView imageView4 = cVar2.f190643i;
                                            if (imageView4 != null) {
                                                imageView4.setImageTintList(ColorStateList.valueOf(a7.b.getColor(cVar2, R.color.gds_data_viz_yellow_primary)));
                                            }
                                            try {
                                                ArrayList<SegmentDetailsDTO> arrayList3 = cVar2.f190649o;
                                                if (arrayList3 != null && (segmentDetailsDTO3 = arrayList3.get(i28)) != null) {
                                                    segmentDetailsDTO3.f17840e = true;
                                                }
                                            } catch (IndexOutOfBoundsException e14) {
                                                i2.a.j(i2.f36769a, "AbstractSegActivity", "toggleActivityFavoriteStatus() exception on index: " + e14.getMessage());
                                            }
                                            Intent intent2 = new Intent();
                                            intent2.putParcelableArrayListExtra("GCM_extra_segments_list", cVar2.f190649o);
                                            cVar2.setResult(-1, intent2);
                                        } else {
                                            if (i35 != 3) {
                                                u0.r();
                                                return null;
                                            }
                                            cVar2.hideProgressOverlay();
                                            new androidx.appcompat.app.e.a(cVar2).setTitle(R.string.dialog_title_error).setMessage(R.string.msg_segments_favorite_general_failure).setNeutralButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).show();
                                        }
                                        break;
                                    } else {
                                        cVar2.showProgressOverlay();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ d0(Object obj, Parcelable parcelable, int i14, int i15) {
        this.f76069a = i15;
        this.f76071c = obj;
        this.f76072d = parcelable;
        this.f76070b = i14;
    }
}
