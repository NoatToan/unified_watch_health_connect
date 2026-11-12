package com.garmin.android.apps.connectmobile.segments.presentation.leaderboard;

import am.z0;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.segments.model.SegmentLeaderboardFilterDTO;
import com.garmin.android.apps.connectmobile.segments.presentation.g;
import com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.SegmentLeaderboardFilterActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import eg1.e;
import f12.l;
import java.util.ArrayList;
import java.util.Arrays;
import lc.u0;
import oi0.d;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/leaderboard/SegmentLeaderboardFilterActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SegmentLeaderboardFilterActivity extends c implements View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f41475w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f41476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f41477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f41478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f41479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f41480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RelativeLayout f41481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f41482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RelativeLayout f41483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f41484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RelativeLayout f41485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f41486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GCMComplexTwoLineButton f41487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public GCMComplexTwoLineButton f41488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GCMComplexTwoLineButton f41489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GCMComplexTwoLineButton f41490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SegmentLeaderboardFilterDTO f41491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f41492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f41493r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f41494t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f41495v;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41496a;

        static {
            int[] iArr = new int[SegmentLeaderboardFilterDTO.f.values().length];
            try {
                iArr[SegmentLeaderboardFilterDTO.f.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentLeaderboardFilterDTO.f.FOLLOWINGS_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentLeaderboardFilterDTO.f.CONNECTIONS_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SegmentLeaderboardFilterDTO.f.ME_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f41496a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eg1.e] */
    /* JADX WARN: Type inference failed for: r0v1, types: [eg1.e] */
    /* JADX WARN: Type inference failed for: r0v2, types: [eg1.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [eg1.e] */
    public SegmentLeaderboardFilterActivity() {
        final int i14 = 0;
        this.f41492q = new View.OnClickListener(this) { // from class: eg1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SegmentLeaderboardFilterActivity f63997b;

            {
                this.f63997b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                int i15 = i14;
                final int i16 = 0;
                final int i17 = 1;
                final SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity = this.f63997b;
                switch (i15) {
                    case 0:
                        int i18 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar = SegmentLeaderboardFilterDTO.e.f41311f;
                        String[] strArr = new String[cVar.getF134973e()];
                        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                        while (bVarN.hasNext()) {
                            SegmentLeaderboardFilterDTO.e eVar = (SegmentLeaderboardFilterDTO.e) bVarN.next();
                            strArr[eVar.ordinal()] = segmentLeaderboardFilterActivity.getString(eVar.f41313b);
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO.getClass();
                        final int i19 = 3;
                        new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.lbl_gender).setSingleChoiceItems(strArr, segmentLeaderboardFilterDTO.f41288c.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i24) {
                                int i25 = i19;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i25) {
                                    case 0:
                                        int i26 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i24);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO2 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO2.getClass();
                                        segmentLeaderboardFilterDTO2.f41290e = aVar;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i27 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i24));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i28 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i24));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i29 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i24);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO3 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO3.getClass();
                                        segmentLeaderboardFilterDTO3.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create().show();
                        break;
                    case 1:
                        int i24 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar2 = SegmentLeaderboardFilterDTO.g.f41323h;
                        String[] strArr2 = new String[cVar2.getF134973e()];
                        ArrayList arrayListK = n23.j.k(cVar2);
                        p13.c.b bVar = new p13.c.b();
                        while (bVar.hasNext()) {
                            SegmentLeaderboardFilterDTO.g gVar = (SegmentLeaderboardFilterDTO.g) bVar.next();
                            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
                            if (lVar.y()) {
                                strArr2[gVar.ordinal()] = segmentLeaderboardFilterActivity.getString(gVar.f41326c);
                            } else {
                                strArr2[gVar.ordinal()] = segmentLeaderboardFilterActivity.getString(gVar.f41327d);
                            }
                            arrayListK.add(segmentLeaderboardFilterActivity.da(gVar, lVar.y()));
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO2 = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO2.getClass();
                        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.card_weight_title).setSingleChoiceItems(strArr2, segmentLeaderboardFilterDTO2.f41289d.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i25) {
                                int i26 = i17;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i26) {
                                    case 0:
                                        int i27 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i25);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO3 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO3.getClass();
                                        segmentLeaderboardFilterDTO3.f41290e = aVar;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i28 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i25));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i29 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i25));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i210 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i25);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO4 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO4.getClass();
                                        segmentLeaderboardFilterDTO4.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create();
                        eVarCreate.getClass();
                        eVarCreate.show();
                        String[] strArr3 = (String[]) arrayListK.toArray(new String[0]);
                        oe2.f.f0(eVarCreate, (String[]) Arrays.copyOf(strArr3, strArr3.length));
                        break;
                    case 2:
                        int i25 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar3 = SegmentLeaderboardFilterDTO.a.f41297g;
                        String[] strArr4 = new String[cVar3.getF134973e()];
                        p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
                        while (bVarN2.hasNext()) {
                            SegmentLeaderboardFilterDTO.a aVar = (SegmentLeaderboardFilterDTO.a) bVarN2.next();
                            strArr4[aVar.ordinal()] = segmentLeaderboardFilterActivity.getString(aVar.f41300c);
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO3 = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO3.getClass();
                        new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.lbl_age).setSingleChoiceItems(strArr4, segmentLeaderboardFilterDTO3.f41290e.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i26) {
                                int i27 = i16;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i27) {
                                    case 0:
                                        int i28 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i26);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO4 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO4.getClass();
                                        segmentLeaderboardFilterDTO4.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i29 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i26));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i210 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i26));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i211 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i26);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create().show();
                        break;
                    default:
                        int i26 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar4 = SegmentLeaderboardFilterDTO.d.f41304g;
                        String[] strArr5 = new String[cVar4.getF134973e()];
                        p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
                        while (bVarN3.hasNext()) {
                            SegmentLeaderboardFilterDTO.d dVar = (SegmentLeaderboardFilterDTO.d) bVarN3.next();
                            int i27 = dVar.f41307c;
                            int i28 = dVar.f41306b;
                            if (i27 != -1) {
                                x0 x0Var = x0.f105818a;
                                String string2 = segmentLeaderboardFilterActivity.getString(i28);
                                string2.getClass();
                                string = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(dVar.f41307c)}, 1));
                            } else {
                                string = segmentLeaderboardFilterActivity.getString(i28);
                                string.getClass();
                            }
                            strArr5[dVar.ordinal()] = string;
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO4 = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO4.getClass();
                        final int i29 = 2;
                        new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.lbl_cycling_class).setSingleChoiceItems(strArr5, segmentLeaderboardFilterDTO4.f41291f.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i29;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create().show();
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f41493r = new View.OnClickListener(this) { // from class: eg1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SegmentLeaderboardFilterActivity f63997b;

            {
                this.f63997b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                int i16 = i15;
                final int i17 = 0;
                final int i18 = 1;
                final SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity = this.f63997b;
                switch (i16) {
                    case 0:
                        int i19 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar = SegmentLeaderboardFilterDTO.e.f41311f;
                        String[] strArr = new String[cVar.getF134973e()];
                        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                        while (bVarN.hasNext()) {
                            SegmentLeaderboardFilterDTO.e eVar = (SegmentLeaderboardFilterDTO.e) bVarN.next();
                            strArr[eVar.ordinal()] = segmentLeaderboardFilterActivity.getString(eVar.f41313b);
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO.getClass();
                        final int i110 = 3;
                        new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.lbl_gender).setSingleChoiceItems(strArr, segmentLeaderboardFilterDTO.f41288c.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i110;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create().show();
                        break;
                    case 1:
                        int i24 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar2 = SegmentLeaderboardFilterDTO.g.f41323h;
                        String[] strArr2 = new String[cVar2.getF134973e()];
                        ArrayList arrayListK = n23.j.k(cVar2);
                        p13.c.b bVar = new p13.c.b();
                        while (bVar.hasNext()) {
                            SegmentLeaderboardFilterDTO.g gVar = (SegmentLeaderboardFilterDTO.g) bVar.next();
                            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
                            if (lVar.y()) {
                                strArr2[gVar.ordinal()] = segmentLeaderboardFilterActivity.getString(gVar.f41326c);
                            } else {
                                strArr2[gVar.ordinal()] = segmentLeaderboardFilterActivity.getString(gVar.f41327d);
                            }
                            arrayListK.add(segmentLeaderboardFilterActivity.da(gVar, lVar.y()));
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO2 = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO2.getClass();
                        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.card_weight_title).setSingleChoiceItems(strArr2, segmentLeaderboardFilterDTO2.f41289d.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i18;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create();
                        eVarCreate.getClass();
                        eVarCreate.show();
                        String[] strArr3 = (String[]) arrayListK.toArray(new String[0]);
                        oe2.f.f0(eVarCreate, (String[]) Arrays.copyOf(strArr3, strArr3.length));
                        break;
                    case 2:
                        int i25 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar3 = SegmentLeaderboardFilterDTO.a.f41297g;
                        String[] strArr4 = new String[cVar3.getF134973e()];
                        p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
                        while (bVarN2.hasNext()) {
                            SegmentLeaderboardFilterDTO.a aVar = (SegmentLeaderboardFilterDTO.a) bVarN2.next();
                            strArr4[aVar.ordinal()] = segmentLeaderboardFilterActivity.getString(aVar.f41300c);
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO3 = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO3.getClass();
                        new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.lbl_age).setSingleChoiceItems(strArr4, segmentLeaderboardFilterDTO3.f41290e.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i17;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create().show();
                        break;
                    default:
                        int i26 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar4 = SegmentLeaderboardFilterDTO.d.f41304g;
                        String[] strArr5 = new String[cVar4.getF134973e()];
                        p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
                        while (bVarN3.hasNext()) {
                            SegmentLeaderboardFilterDTO.d dVar = (SegmentLeaderboardFilterDTO.d) bVarN3.next();
                            int i27 = dVar.f41307c;
                            int i28 = dVar.f41306b;
                            if (i27 != -1) {
                                x0 x0Var = x0.f105818a;
                                String string2 = segmentLeaderboardFilterActivity.getString(i28);
                                string2.getClass();
                                string = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(dVar.f41307c)}, 1));
                            } else {
                                string = segmentLeaderboardFilterActivity.getString(i28);
                                string.getClass();
                            }
                            strArr5[dVar.ordinal()] = string;
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO4 = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO4.getClass();
                        final int i29 = 2;
                        new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.lbl_cycling_class).setSingleChoiceItems(strArr5, segmentLeaderboardFilterDTO4.f41291f.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i29;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create().show();
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f41494t = new View.OnClickListener(this) { // from class: eg1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SegmentLeaderboardFilterActivity f63997b;

            {
                this.f63997b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                int i17 = i16;
                final int i18 = 0;
                final int i19 = 1;
                final SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity = this.f63997b;
                switch (i17) {
                    case 0:
                        int i110 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar = SegmentLeaderboardFilterDTO.e.f41311f;
                        String[] strArr = new String[cVar.getF134973e()];
                        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                        while (bVarN.hasNext()) {
                            SegmentLeaderboardFilterDTO.e eVar = (SegmentLeaderboardFilterDTO.e) bVarN.next();
                            strArr[eVar.ordinal()] = segmentLeaderboardFilterActivity.getString(eVar.f41313b);
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO.getClass();
                        final int i111 = 3;
                        new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.lbl_gender).setSingleChoiceItems(strArr, segmentLeaderboardFilterDTO.f41288c.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i111;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create().show();
                        break;
                    case 1:
                        int i24 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar2 = SegmentLeaderboardFilterDTO.g.f41323h;
                        String[] strArr2 = new String[cVar2.getF134973e()];
                        ArrayList arrayListK = n23.j.k(cVar2);
                        p13.c.b bVar = new p13.c.b();
                        while (bVar.hasNext()) {
                            SegmentLeaderboardFilterDTO.g gVar = (SegmentLeaderboardFilterDTO.g) bVar.next();
                            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
                            if (lVar.y()) {
                                strArr2[gVar.ordinal()] = segmentLeaderboardFilterActivity.getString(gVar.f41326c);
                            } else {
                                strArr2[gVar.ordinal()] = segmentLeaderboardFilterActivity.getString(gVar.f41327d);
                            }
                            arrayListK.add(segmentLeaderboardFilterActivity.da(gVar, lVar.y()));
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO2 = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO2.getClass();
                        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.card_weight_title).setSingleChoiceItems(strArr2, segmentLeaderboardFilterDTO2.f41289d.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i19;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create();
                        eVarCreate.getClass();
                        eVarCreate.show();
                        String[] strArr3 = (String[]) arrayListK.toArray(new String[0]);
                        oe2.f.f0(eVarCreate, (String[]) Arrays.copyOf(strArr3, strArr3.length));
                        break;
                    case 2:
                        int i25 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar3 = SegmentLeaderboardFilterDTO.a.f41297g;
                        String[] strArr4 = new String[cVar3.getF134973e()];
                        p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
                        while (bVarN2.hasNext()) {
                            SegmentLeaderboardFilterDTO.a aVar = (SegmentLeaderboardFilterDTO.a) bVarN2.next();
                            strArr4[aVar.ordinal()] = segmentLeaderboardFilterActivity.getString(aVar.f41300c);
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO3 = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO3.getClass();
                        new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.lbl_age).setSingleChoiceItems(strArr4, segmentLeaderboardFilterDTO3.f41290e.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i18;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create().show();
                        break;
                    default:
                        int i26 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar4 = SegmentLeaderboardFilterDTO.d.f41304g;
                        String[] strArr5 = new String[cVar4.getF134973e()];
                        p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
                        while (bVarN3.hasNext()) {
                            SegmentLeaderboardFilterDTO.d dVar = (SegmentLeaderboardFilterDTO.d) bVarN3.next();
                            int i27 = dVar.f41307c;
                            int i28 = dVar.f41306b;
                            if (i27 != -1) {
                                x0 x0Var = x0.f105818a;
                                String string2 = segmentLeaderboardFilterActivity.getString(i28);
                                string2.getClass();
                                string = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(dVar.f41307c)}, 1));
                            } else {
                                string = segmentLeaderboardFilterActivity.getString(i28);
                                string.getClass();
                            }
                            strArr5[dVar.ordinal()] = string;
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO4 = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO4.getClass();
                        final int i29 = 2;
                        new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.lbl_cycling_class).setSingleChoiceItems(strArr5, segmentLeaderboardFilterDTO4.f41291f.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i29;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create().show();
                        break;
                }
            }
        };
        final int i17 = 3;
        this.f41495v = new View.OnClickListener(this) { // from class: eg1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SegmentLeaderboardFilterActivity f63997b;

            {
                this.f63997b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                int i18 = i17;
                final int i19 = 0;
                final int i110 = 1;
                final SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity = this.f63997b;
                switch (i18) {
                    case 0:
                        int i111 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar = SegmentLeaderboardFilterDTO.e.f41311f;
                        String[] strArr = new String[cVar.getF134973e()];
                        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                        while (bVarN.hasNext()) {
                            SegmentLeaderboardFilterDTO.e eVar = (SegmentLeaderboardFilterDTO.e) bVarN.next();
                            strArr[eVar.ordinal()] = segmentLeaderboardFilterActivity.getString(eVar.f41313b);
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO.getClass();
                        final int i112 = 3;
                        new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.lbl_gender).setSingleChoiceItems(strArr, segmentLeaderboardFilterDTO.f41288c.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i112;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create().show();
                        break;
                    case 1:
                        int i24 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar2 = SegmentLeaderboardFilterDTO.g.f41323h;
                        String[] strArr2 = new String[cVar2.getF134973e()];
                        ArrayList arrayListK = n23.j.k(cVar2);
                        p13.c.b bVar = new p13.c.b();
                        while (bVar.hasNext()) {
                            SegmentLeaderboardFilterDTO.g gVar = (SegmentLeaderboardFilterDTO.g) bVar.next();
                            l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
                            if (lVar.y()) {
                                strArr2[gVar.ordinal()] = segmentLeaderboardFilterActivity.getString(gVar.f41326c);
                            } else {
                                strArr2[gVar.ordinal()] = segmentLeaderboardFilterActivity.getString(gVar.f41327d);
                            }
                            arrayListK.add(segmentLeaderboardFilterActivity.da(gVar, lVar.y()));
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO2 = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO2.getClass();
                        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.card_weight_title).setSingleChoiceItems(strArr2, segmentLeaderboardFilterDTO2.f41289d.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i110;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create();
                        eVarCreate.getClass();
                        eVarCreate.show();
                        String[] strArr3 = (String[]) arrayListK.toArray(new String[0]);
                        oe2.f.f0(eVarCreate, (String[]) Arrays.copyOf(strArr3, strArr3.length));
                        break;
                    case 2:
                        int i25 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar3 = SegmentLeaderboardFilterDTO.a.f41297g;
                        String[] strArr4 = new String[cVar3.getF134973e()];
                        p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
                        while (bVarN2.hasNext()) {
                            SegmentLeaderboardFilterDTO.a aVar = (SegmentLeaderboardFilterDTO.a) bVarN2.next();
                            strArr4[aVar.ordinal()] = segmentLeaderboardFilterActivity.getString(aVar.f41300c);
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO3 = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO3.getClass();
                        new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.lbl_age).setSingleChoiceItems(strArr4, segmentLeaderboardFilterDTO3.f41290e.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i19;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create().show();
                        break;
                    default:
                        int i26 = SegmentLeaderboardFilterActivity.f41475w;
                        w13.c cVar4 = SegmentLeaderboardFilterDTO.d.f41304g;
                        String[] strArr5 = new String[cVar4.getF134973e()];
                        p13.c.b bVarN3 = com.airbnb.lottie.animation.keyframe.a.n(cVar4, cVar4);
                        while (bVarN3.hasNext()) {
                            SegmentLeaderboardFilterDTO.d dVar = (SegmentLeaderboardFilterDTO.d) bVarN3.next();
                            int i27 = dVar.f41307c;
                            int i28 = dVar.f41306b;
                            if (i27 != -1) {
                                x0 x0Var = x0.f105818a;
                                String string2 = segmentLeaderboardFilterActivity.getString(i28);
                                string2.getClass();
                                string = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(dVar.f41307c)}, 1));
                            } else {
                                string = segmentLeaderboardFilterActivity.getString(i28);
                                string.getClass();
                            }
                            strArr5[dVar.ordinal()] = string;
                        }
                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO4 = segmentLeaderboardFilterActivity.f41491p;
                        segmentLeaderboardFilterDTO4.getClass();
                        final int i29 = 2;
                        new androidx.appcompat.app.e.a(segmentLeaderboardFilterActivity).setTitle(R.string.lbl_cycling_class).setSingleChoiceItems(strArr5, segmentLeaderboardFilterDTO4.f41291f.ordinal(), new DialogInterface.OnClickListener() { // from class: eg1.f
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i210) {
                                int i211 = i29;
                                SegmentLeaderboardFilterActivity segmentLeaderboardFilterActivity2 = segmentLeaderboardFilterActivity;
                                switch (i211) {
                                    case 0:
                                        int i212 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.a aVar2 = (SegmentLeaderboardFilterDTO.a) SegmentLeaderboardFilterDTO.a.f41297g.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton = segmentLeaderboardFilterActivity2.f41489n;
                                        gCMComplexTwoLineButton.getClass();
                                        gCMComplexTwoLineButton.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(aVar2.f41300c));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO5.getClass();
                                        segmentLeaderboardFilterDTO5.f41290e = aVar2;
                                        dialogInterface.dismiss();
                                        break;
                                    case 1:
                                        int i213 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ga((SegmentLeaderboardFilterDTO.g) SegmentLeaderboardFilterDTO.g.f41323h.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    case 2:
                                        int i214 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        segmentLeaderboardFilterActivity2.ea((SegmentLeaderboardFilterDTO.d) SegmentLeaderboardFilterDTO.d.f41304g.get(i210));
                                        dialogInterface.dismiss();
                                        break;
                                    default:
                                        int i215 = SegmentLeaderboardFilterActivity.f41475w;
                                        dialogInterface.getClass();
                                        SegmentLeaderboardFilterDTO.e eVar2 = (SegmentLeaderboardFilterDTO.e) SegmentLeaderboardFilterDTO.e.f41311f.get(i210);
                                        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = segmentLeaderboardFilterActivity2.f41487l;
                                        gCMComplexTwoLineButton2.getClass();
                                        gCMComplexTwoLineButton2.setButtonBottomLeftLabel(segmentLeaderboardFilterActivity2.getResources().getString(eVar2.f41313b));
                                        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = segmentLeaderboardFilterActivity2.f41491p;
                                        segmentLeaderboardFilterDTO6.getClass();
                                        segmentLeaderboardFilterDTO6.f41288c = eVar2;
                                        dialogInterface.dismiss();
                                        break;
                                }
                            }
                        }).create().show();
                        break;
                }
            }
        };
    }

    public final void ca() {
        if (g.f41446b.a() != null) {
            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).f(this, this.f41491p);
        }
        Intent intent = new Intent();
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f41476a;
        gCMComplexOneLineButton.getClass();
        intent.putExtra("extra_segment_leaderboard_filter_on", gCMComplexOneLineButton.f47771k.isChecked());
        setResult(-1, intent);
        finish();
    }

    public final String da(SegmentLeaderboardFilterDTO.g gVar, boolean z14) {
        String string = getString(z14 ? gVar.f41326c : gVar.f41327d);
        string.getClass();
        return d.a(this, string, new cg1.e(16));
    }

    public final void ea(SegmentLeaderboardFilterDTO.d dVar) {
        String string;
        int i14 = dVar.f41307c;
        int i15 = dVar.f41306b;
        if (i14 != -1) {
            x0 x0Var = x0.f105818a;
            String string2 = getString(i15);
            string2.getClass();
            string = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(dVar.f41307c)}, 1));
        } else {
            string = getString(i15);
            string.getClass();
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41490o;
        gCMComplexTwoLineButton.getClass();
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(string);
        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO = this.f41491p;
        segmentLeaderboardFilterDTO.getClass();
        segmentLeaderboardFilterDTO.f41291f = dVar;
    }

    public final void fa(SegmentLeaderboardFilterDTO.f fVar) {
        Drawable drawable = a7.b.getDrawable(this, 2131232298);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        int i14 = b.f41496a[fVar.ordinal()];
        if (i14 == 1) {
            ImageView imageView = this.f41480e;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            ImageView imageView2 = this.f41482g;
            if (imageView2 != null) {
                imageView2.setImageDrawable(colorDrawable);
            }
            ImageView imageView3 = this.f41484i;
            if (imageView3 != null) {
                imageView3.setImageDrawable(colorDrawable);
            }
            ImageView imageView4 = this.f41486k;
            if (imageView4 != null) {
                imageView4.setImageDrawable(colorDrawable);
            }
            LinearLayout linearLayout = this.f41478c;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        } else if (i14 == 2) {
            ImageView imageView5 = this.f41480e;
            if (imageView5 != null) {
                imageView5.setImageDrawable(colorDrawable);
            }
            ImageView imageView6 = this.f41482g;
            if (imageView6 != null) {
                imageView6.setImageDrawable(drawable);
            }
            ImageView imageView7 = this.f41484i;
            if (imageView7 != null) {
                imageView7.setImageDrawable(colorDrawable);
            }
            ImageView imageView8 = this.f41486k;
            if (imageView8 != null) {
                imageView8.setImageDrawable(colorDrawable);
            }
            LinearLayout linearLayout2 = this.f41478c;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
        } else if (i14 == 3) {
            ImageView imageView9 = this.f41480e;
            if (imageView9 != null) {
                imageView9.setImageDrawable(colorDrawable);
            }
            ImageView imageView10 = this.f41482g;
            if (imageView10 != null) {
                imageView10.setImageDrawable(colorDrawable);
            }
            ImageView imageView11 = this.f41484i;
            if (imageView11 != null) {
                imageView11.setImageDrawable(drawable);
            }
            ImageView imageView12 = this.f41486k;
            if (imageView12 != null) {
                imageView12.setImageDrawable(colorDrawable);
            }
            LinearLayout linearLayout3 = this.f41478c;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
        } else {
            if (i14 != 4) {
                u0.r();
                return;
            }
            ImageView imageView13 = this.f41480e;
            if (imageView13 != null) {
                imageView13.setImageDrawable(colorDrawable);
            }
            ImageView imageView14 = this.f41482g;
            if (imageView14 != null) {
                imageView14.setImageDrawable(colorDrawable);
            }
            ImageView imageView15 = this.f41484i;
            if (imageView15 != null) {
                imageView15.setImageDrawable(colorDrawable);
            }
            ImageView imageView16 = this.f41486k;
            if (imageView16 != null) {
                imageView16.setImageDrawable(drawable);
            }
            LinearLayout linearLayout4 = this.f41478c;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
        }
        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO = this.f41491p;
        if (segmentLeaderboardFilterDTO != null) {
            segmentLeaderboardFilterDTO.f41287b = fVar;
        }
        RelativeLayout relativeLayout = this.f41479d;
        ImageView imageView17 = this.f41480e;
        if (relativeLayout != null && imageView17 != null) {
            s0.r(relativeLayout, new eg1.g(imageView17, drawable));
        }
        RelativeLayout relativeLayout2 = this.f41481f;
        ImageView imageView18 = this.f41482g;
        if (relativeLayout2 != null && imageView18 != null) {
            s0.r(relativeLayout2, new eg1.g(imageView18, drawable));
        }
        RelativeLayout relativeLayout3 = this.f41483h;
        ImageView imageView19 = this.f41484i;
        if (relativeLayout3 != null && imageView19 != null) {
            s0.r(relativeLayout3, new eg1.g(imageView19, drawable));
        }
        RelativeLayout relativeLayout4 = this.f41485j;
        ImageView imageView20 = this.f41486k;
        if (relativeLayout4 == null || imageView20 == null) {
            return;
        }
        s0.r(relativeLayout4, new eg1.g(imageView20, drawable));
    }

    public final void ga(SegmentLeaderboardFilterDTO.g gVar) {
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41488m;
        if (zY) {
            gCMComplexTwoLineButton.getClass();
            gCMComplexTwoLineButton.b(getString(gVar.f41326c), da(gVar, true));
        } else {
            gCMComplexTwoLineButton.getClass();
            gCMComplexTwoLineButton.b(getString(gVar.f41327d), da(gVar, false));
        }
        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO = this.f41491p;
        segmentLeaderboardFilterDTO.getClass();
        gVar.getClass();
        segmentLeaderboardFilterDTO.f41289d = gVar;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ca();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v14) {
        v14.getClass();
        int id3 = v14.getId();
        if (id3 == R.id.segment_leaderboard_filter_everyone) {
            fa(SegmentLeaderboardFilterDTO.f.ALL);
        }
        if (id3 == R.id.segment_leaderboard_filter_followings_only) {
            fa(SegmentLeaderboardFilterDTO.f.FOLLOWINGS_ONLY);
        }
        if (id3 == R.id.segment_leaderboard_filter_my_connections) {
            fa(SegmentLeaderboardFilterDTO.f.CONNECTIONS_ONLY);
        }
        if (id3 == R.id.segment_leaderboard_filter_only_me) {
            fa(SegmentLeaderboardFilterDTO.f.ME_ONLY);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_segment_leaderboard_filter);
        initActionBar(true, R.string.leaderboard_filter_title);
        View viewFindViewById = findViewById(R.id.segment_leaderboard_filter_layout);
        viewFindViewById.getClass();
        this.f41477b = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.segment_leaderboard_filter_bottom_layout);
        viewFindViewById2.getClass();
        this.f41478c = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.segment_leaderboard_filter_switch);
        viewFindViewById3.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById3;
        this.f41476a = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnCheckedChangeListener(new com.google.android.material.chip.a(this, 1));
        View viewFindViewById4 = findViewById(R.id.segment_leaderboard_filter_everyone);
        viewFindViewById4.getClass();
        RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById4;
        this.f41479d = relativeLayout;
        relativeLayout.setOnClickListener(this);
        View viewFindViewById5 = findViewById(R.id.segment_leaderboard_filter_everyone_check_img);
        viewFindViewById5.getClass();
        this.f41480e = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.segment_leaderboard_filter_followings_only);
        RelativeLayout relativeLayout2 = viewFindViewById6 instanceof RelativeLayout ? (RelativeLayout) viewFindViewById6 : null;
        this.f41481f = relativeLayout2;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(this);
        }
        View viewFindViewById7 = findViewById(R.id.segment_leaderboard_filter_followings_only_content);
        viewFindViewById7.getClass();
        ((TextView) viewFindViewById7).setText(getString(R.string.privacy_setting_tagging_people_i_follow));
        View viewFindViewById8 = findViewById(R.id.segment_leaderboard_filter_followings_only_check_img);
        viewFindViewById8.getClass();
        this.f41482g = (ImageView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.segment_leaderboard_filter_my_connections);
        viewFindViewById9.getClass();
        RelativeLayout relativeLayout3 = (RelativeLayout) viewFindViewById9;
        this.f41483h = relativeLayout3;
        relativeLayout3.setOnClickListener(this);
        View viewFindViewById10 = findViewById(R.id.segment_leaderboard_filter_my_connections_content);
        viewFindViewById10.getClass();
        ((TextView) viewFindViewById10).setText(getString(R.string.concept_my_friends));
        View viewFindViewById11 = findViewById(R.id.segment_leaderboard_filter_my_connections_description);
        viewFindViewById11.getClass();
        ((TextView) viewFindViewById11).setText(getString(R.string.concept_my_friends_description));
        View viewFindViewById12 = findViewById(R.id.segment_leaderboard_filter_my_connections_check_img);
        viewFindViewById12.getClass();
        this.f41484i = (ImageView) viewFindViewById12;
        View viewFindViewById13 = findViewById(R.id.segment_leaderboard_filter_only_me);
        viewFindViewById13.getClass();
        RelativeLayout relativeLayout4 = (RelativeLayout) viewFindViewById13;
        this.f41485j = relativeLayout4;
        relativeLayout4.setOnClickListener(this);
        View viewFindViewById14 = findViewById(R.id.segment_leaderboard_filter_only_me_check_img);
        viewFindViewById14.getClass();
        this.f41486k = (ImageView) viewFindViewById14;
        View viewFindViewById15 = findViewById(R.id.segment_leaderboard_filter_gender);
        viewFindViewById15.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById15;
        this.f41487l = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.f41492q);
        View viewFindViewById16 = findViewById(R.id.segment_leaderboard_filter_weight);
        viewFindViewById16.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) viewFindViewById16;
        this.f41488m = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setOnClickListener(this.f41493r);
        View viewFindViewById17 = findViewById(R.id.segment_leaderboard_filter_age);
        viewFindViewById17.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = (GCMComplexTwoLineButton) viewFindViewById17;
        this.f41489n = gCMComplexTwoLineButton3;
        gCMComplexTwoLineButton3.setOnClickListener(this.f41494t);
        View viewFindViewById18 = findViewById(R.id.segment_leaderboard_filter_cycling_class);
        viewFindViewById18.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = (GCMComplexTwoLineButton) viewFindViewById18;
        this.f41490o = gCMComplexTwoLineButton4;
        gCMComplexTwoLineButton4.setOnClickListener(this.f41495v);
        if (z0.k(getIntent().getIntExtra("GCM_extra_activity_type", -1), am.x0.f4346x) != am.x0.f4312o) {
            findViewById(R.id.segment_leaderboard_filter_cycling_class).setVisibility(8);
        }
        if (getIntent() != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("extra_segment_leaderboard_filter_on", false);
            GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f41476a;
            if (booleanExtra) {
                gCMComplexOneLineButton2.getClass();
                gCMComplexOneLineButton2.k();
            } else {
                gCMComplexOneLineButton2.getClass();
                gCMComplexOneLineButton2.j();
            }
            LinearLayout linearLayout = this.f41477b;
            linearLayout.getClass();
            linearLayout.setVisibility(booleanExtra ? 0 : 8);
        }
        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTOE = g.f41446b.a() != null ? ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).e(this) : null;
        this.f41491p = segmentLeaderboardFilterDTOE;
        segmentLeaderboardFilterDTOE.getClass();
        fa(segmentLeaderboardFilterDTOE.f41287b);
        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO = this.f41491p;
        segmentLeaderboardFilterDTO.getClass();
        SegmentLeaderboardFilterDTO.e eVar = segmentLeaderboardFilterDTO.f41288c;
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.f41487l;
        gCMComplexTwoLineButton5.getClass();
        gCMComplexTwoLineButton5.setButtonBottomLeftLabel(getResources().getString(eVar.f41313b));
        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO2 = this.f41491p;
        segmentLeaderboardFilterDTO2.getClass();
        segmentLeaderboardFilterDTO2.f41288c = eVar;
        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO3 = this.f41491p;
        segmentLeaderboardFilterDTO3.getClass();
        ga(segmentLeaderboardFilterDTO3.f41289d);
        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO4 = this.f41491p;
        segmentLeaderboardFilterDTO4.getClass();
        SegmentLeaderboardFilterDTO.a aVar = segmentLeaderboardFilterDTO4.f41290e;
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f41489n;
        gCMComplexTwoLineButton6.getClass();
        gCMComplexTwoLineButton6.setButtonBottomLeftLabel(getResources().getString(aVar.f41300c));
        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO5 = this.f41491p;
        segmentLeaderboardFilterDTO5.getClass();
        segmentLeaderboardFilterDTO5.f41290e = aVar;
        SegmentLeaderboardFilterDTO segmentLeaderboardFilterDTO6 = this.f41491p;
        segmentLeaderboardFilterDTO6.getClass();
        ea(segmentLeaderboardFilterDTO6.f41291f);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        ca();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/leaderboard/SegmentLeaderboardFilterActivity$a;", "", "<init>", "()V", "", "EXTRA_SEGMENT_LEADERBOARD_FILTER_ON", "Ljava/lang/String;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
