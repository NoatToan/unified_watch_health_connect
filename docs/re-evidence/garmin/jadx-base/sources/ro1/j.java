package ro1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.social.share.d f153971b;

    public /* synthetic */ j(com.garmin.android.apps.connectmobile.social.share.d dVar, int i14) {
        this.f153970a = i14;
        this.f153971b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f153970a;
        com.garmin.android.apps.connectmobile.social.share.d dVar = this.f153971b;
        switch (i14) {
            case 0:
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.social.share.d.a aVar = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                fw.p pVar = g3Var.f35300a;
                Bitmap bitmap = (Bitmap) g3Var.f35301b;
                if (pVar == fw.p.SUCCESS) {
                    ImageView imageView = dVar.f44657c;
                    if (imageView == null) {
                        p005kotlin.jvm.internal.s.m("mShareImageView");
                        throw null;
                    }
                    imageView.setImageBitmap(bitmap);
                }
                return Unit.INSTANCE;
            case 1:
                Uri uri = (Uri) obj;
                com.garmin.android.apps.connectmobile.social.share.d.a aVar2 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                if (uri != null) {
                    com.garmin.android.apps.connectmobile.social.share.b.a aVar3 = com.garmin.android.apps.connectmobile.social.share.b.f44643d;
                    g0.f153957a.getClass();
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.addFlags(268435457);
                    intent.putExtra("android.intent.extra.STREAM", uri);
                    aVar3.getClass();
                    com.garmin.android.apps.connectmobile.social.share.b bVarA = com.garmin.android.apps.connectmobile.social.share.b.a.a(intent, true);
                    androidx.fragment.app.v childFragmentManager = dVar.getChildFragmentManager();
                    childFragmentManager.getClass();
                    if (childFragmentManager.G(com.garmin.android.apps.connectmobile.social.share.b.class.getSimpleName()) == null) {
                        bVarA.show(childFragmentManager, com.garmin.android.apps.connectmobile.social.share.b.class.getSimpleName());
                    }
                } else {
                    g22.e.a(dVar, null);
                }
                return Unit.INSTANCE;
            case 2:
                Boolean bool = (Boolean) obj;
                BubbleLayout bubbleLayout = dVar.f44660f;
                if (bubbleLayout != null) {
                    bubbleLayout.setVisibility(bool.booleanValue() ? 0 : 8);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("mStickerTapTooltip");
                throw null;
            case 3:
                Boolean bool2 = (Boolean) obj;
                BubbleLayout bubbleLayout2 = dVar.f44659e;
                if (bubbleLayout2 != null) {
                    bubbleLayout2.setVisibility(bool2.booleanValue() ? 0 : 8);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("mActivityStatsTooltip");
                throw null;
            default:
                ((View) obj).getClass();
                com.garmin.android.apps.connectmobile.social.share.d.b bVar = dVar.f44665k;
                if (bVar == null) {
                    p005kotlin.jvm.internal.s.m("onBackPressedCallback");
                    throw null;
                }
                bVar.f(false);
                dVar.requireActivity().getOnBackPressedDispatcher().d();
                return Unit.INSTANCE;
        }
    }
}
