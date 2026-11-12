package com.garmin.android.apps.connectmobile.promotions;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import cf2.r;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.promotions.CampaignInfoFullScreenActivity;
import java.util.WeakHashMap;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ya0.j;
import yb1.f;
import yb1.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/promotions/CampaignInfoFullScreenActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/promotions/PromoCodeView$a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CampaignInfoFullScreenActivity extends c implements PromoCodeView.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f41033o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f41034a = m.b(new j(3));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ff2.c f41035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ff2.a f41036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f41037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f41038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f41039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f41040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f41041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PromoCodeView f41042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f41043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f41044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f41045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f41046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f41047n;

    /* JADX WARN: Type inference failed for: r0v2, types: [yb1.g] */
    /* JADX WARN: Type inference failed for: r0v3, types: [yb1.g] */
    /* JADX WARN: Type inference failed for: r0v4, types: [yb1.g] */
    public CampaignInfoFullScreenActivity() {
        final int i14 = 0;
        this.f41045l = new View.OnClickListener(this) { // from class: yb1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CampaignInfoFullScreenActivity f195698b;

            {
                this.f195698b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Uri uri;
                int i15 = i14;
                CampaignInfoFullScreenActivity campaignInfoFullScreenActivity = this.f195698b;
                switch (i15) {
                    case 0:
                        CampaignInfoFullScreenActivity.a aVar = CampaignInfoFullScreenActivity.f41033o;
                        campaignInfoFullScreenActivity.showProgressOverlay();
                        campaignInfoFullScreenActivity.ca().debug("emailButtonPressed: ");
                        ff2.c cVar = campaignInfoFullScreenActivity.f41035b;
                        if (cVar == null) {
                            s.m("interactor");
                            throw null;
                        }
                        ff2.a aVar2 = campaignInfoFullScreenActivity.f41036c;
                        if (aVar2 == null) {
                            s.m("campaign");
                            throw null;
                        }
                        long campaignId = aVar2.getCampaignId();
                        f fVar = new f(campaignInfoFullScreenActivity, 1);
                        cf2.f fVar2 = cf2.f.f27037a;
                        Context context = cVar.f71142a;
                        fVar2.getClass();
                        context.getClass();
                        cf2.s sVar = new cf2.s(context, campaignId, fVar);
                        sVar.b(new r(sVar));
                        com.garmin.android.library.backgroundtaskmanagement.c.d(sVar, null);
                        return;
                    case 1:
                        CampaignInfoFullScreenActivity.a aVar3 = CampaignInfoFullScreenActivity.f41033o;
                        campaignInfoFullScreenActivity.ca().debug("shopNowButtonPressed: going to offer page");
                        ff2.c cVar2 = campaignInfoFullScreenActivity.f41035b;
                        if (cVar2 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        kf2.a aVar4 = kf2.a.BUY_NOW;
                        ff2.a aVar5 = campaignInfoFullScreenActivity.f41036c;
                        if (aVar5 == null) {
                            s.m("campaign");
                            throw null;
                        }
                        cVar2.c(aVar4, aVar5.getCampaignId());
                        try {
                            ff2.a aVar6 = campaignInfoFullScreenActivity.f41036c;
                            if (aVar6 == null) {
                                s.m("campaign");
                                throw null;
                            }
                            uri = Uri.parse(aVar6.getDetailPayload().getDetailShopNowUrl());
                            uri.getClass();
                            g22.a.c(campaignInfoFullScreenActivity, uri);
                            return;
                        } catch (Exception unused) {
                            uri = Uri.parse("https://www.garmin.com/");
                        }
                        break;
                    default:
                        CampaignInfoFullScreenActivity.a aVar7 = CampaignInfoFullScreenActivity.f41033o;
                        campaignInfoFullScreenActivity.ca().debug("dismissActionPressed: ");
                        campaignInfoFullScreenActivity.finish();
                        return;
                }
            }
        };
        final int i15 = 1;
        this.f41046m = new View.OnClickListener(this) { // from class: yb1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CampaignInfoFullScreenActivity f195698b;

            {
                this.f195698b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Uri uri;
                int i16 = i15;
                CampaignInfoFullScreenActivity campaignInfoFullScreenActivity = this.f195698b;
                switch (i16) {
                    case 0:
                        CampaignInfoFullScreenActivity.a aVar = CampaignInfoFullScreenActivity.f41033o;
                        campaignInfoFullScreenActivity.showProgressOverlay();
                        campaignInfoFullScreenActivity.ca().debug("emailButtonPressed: ");
                        ff2.c cVar = campaignInfoFullScreenActivity.f41035b;
                        if (cVar == null) {
                            s.m("interactor");
                            throw null;
                        }
                        ff2.a aVar2 = campaignInfoFullScreenActivity.f41036c;
                        if (aVar2 == null) {
                            s.m("campaign");
                            throw null;
                        }
                        long campaignId = aVar2.getCampaignId();
                        f fVar = new f(campaignInfoFullScreenActivity, 1);
                        cf2.f fVar2 = cf2.f.f27037a;
                        Context context = cVar.f71142a;
                        fVar2.getClass();
                        context.getClass();
                        cf2.s sVar = new cf2.s(context, campaignId, fVar);
                        sVar.b(new r(sVar));
                        com.garmin.android.library.backgroundtaskmanagement.c.d(sVar, null);
                        return;
                    case 1:
                        CampaignInfoFullScreenActivity.a aVar3 = CampaignInfoFullScreenActivity.f41033o;
                        campaignInfoFullScreenActivity.ca().debug("shopNowButtonPressed: going to offer page");
                        ff2.c cVar2 = campaignInfoFullScreenActivity.f41035b;
                        if (cVar2 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        kf2.a aVar4 = kf2.a.BUY_NOW;
                        ff2.a aVar5 = campaignInfoFullScreenActivity.f41036c;
                        if (aVar5 == null) {
                            s.m("campaign");
                            throw null;
                        }
                        cVar2.c(aVar4, aVar5.getCampaignId());
                        try {
                            ff2.a aVar6 = campaignInfoFullScreenActivity.f41036c;
                            if (aVar6 == null) {
                                s.m("campaign");
                                throw null;
                            }
                            uri = Uri.parse(aVar6.getDetailPayload().getDetailShopNowUrl());
                            uri.getClass();
                            g22.a.c(campaignInfoFullScreenActivity, uri);
                            return;
                        } catch (Exception unused) {
                            uri = Uri.parse("https://www.garmin.com/");
                        }
                        break;
                    default:
                        CampaignInfoFullScreenActivity.a aVar7 = CampaignInfoFullScreenActivity.f41033o;
                        campaignInfoFullScreenActivity.ca().debug("dismissActionPressed: ");
                        campaignInfoFullScreenActivity.finish();
                        return;
                }
            }
        };
        final int i16 = 2;
        this.f41047n = new View.OnClickListener(this) { // from class: yb1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CampaignInfoFullScreenActivity f195698b;

            {
                this.f195698b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Uri uri;
                int i17 = i16;
                CampaignInfoFullScreenActivity campaignInfoFullScreenActivity = this.f195698b;
                switch (i17) {
                    case 0:
                        CampaignInfoFullScreenActivity.a aVar = CampaignInfoFullScreenActivity.f41033o;
                        campaignInfoFullScreenActivity.showProgressOverlay();
                        campaignInfoFullScreenActivity.ca().debug("emailButtonPressed: ");
                        ff2.c cVar = campaignInfoFullScreenActivity.f41035b;
                        if (cVar == null) {
                            s.m("interactor");
                            throw null;
                        }
                        ff2.a aVar2 = campaignInfoFullScreenActivity.f41036c;
                        if (aVar2 == null) {
                            s.m("campaign");
                            throw null;
                        }
                        long campaignId = aVar2.getCampaignId();
                        f fVar = new f(campaignInfoFullScreenActivity, 1);
                        cf2.f fVar2 = cf2.f.f27037a;
                        Context context = cVar.f71142a;
                        fVar2.getClass();
                        context.getClass();
                        cf2.s sVar = new cf2.s(context, campaignId, fVar);
                        sVar.b(new r(sVar));
                        com.garmin.android.library.backgroundtaskmanagement.c.d(sVar, null);
                        return;
                    case 1:
                        CampaignInfoFullScreenActivity.a aVar3 = CampaignInfoFullScreenActivity.f41033o;
                        campaignInfoFullScreenActivity.ca().debug("shopNowButtonPressed: going to offer page");
                        ff2.c cVar2 = campaignInfoFullScreenActivity.f41035b;
                        if (cVar2 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        kf2.a aVar4 = kf2.a.BUY_NOW;
                        ff2.a aVar5 = campaignInfoFullScreenActivity.f41036c;
                        if (aVar5 == null) {
                            s.m("campaign");
                            throw null;
                        }
                        cVar2.c(aVar4, aVar5.getCampaignId());
                        try {
                            ff2.a aVar6 = campaignInfoFullScreenActivity.f41036c;
                            if (aVar6 == null) {
                                s.m("campaign");
                                throw null;
                            }
                            uri = Uri.parse(aVar6.getDetailPayload().getDetailShopNowUrl());
                            uri.getClass();
                            g22.a.c(campaignInfoFullScreenActivity, uri);
                            return;
                        } catch (Exception unused) {
                            uri = Uri.parse("https://www.garmin.com/");
                        }
                        break;
                    default:
                        CampaignInfoFullScreenActivity.a aVar7 = CampaignInfoFullScreenActivity.f41033o;
                        campaignInfoFullScreenActivity.ca().debug("dismissActionPressed: ");
                        campaignInfoFullScreenActivity.finish();
                        return;
                }
            }
        };
    }

    @Override // com.garmin.android.apps.connectmobile.promotions.PromoCodeView.a
    public final void E() {
        ca().debug("copyButtonClicked: ");
        Object systemService = getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        ff2.a aVar = this.f41036c;
        if (aVar == null) {
            s.m("campaign");
            throw null;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("PromoCodeValue", aVar.getDetailPayload().getDetailPromoCode()));
        Object systemService2 = getSystemService("vibrator");
        systemService2.getClass();
        ((Vibrator) systemService2).vibrate(VibrationEffect.createOneShot(50L, -1));
    }

    public final Logger ca() {
        return (Logger) this.f41034a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_campaign_info_full_screen_activity);
        View viewFindViewById = findViewById(R.id.activity_campaign_info_header_ll);
        wr.g gVar = new wr.g(26);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(viewFindViewById, gVar);
        View viewFindViewById2 = findViewById(R.id.button_container_ll);
        s0.d.c(viewFindViewById2, new ls0.t(viewFindViewById2, 1));
        ff2.c.a aVar = ff2.c.f71140c;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        ff2.c cVarA = aVar.a(applicationContext);
        this.f41035b = cVarA;
        if (cVarA != null) {
            cVarA.a(new f(this, 0), false);
        } else {
            s.m("interactor");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ff2.a aVar = this.f41036c;
        if (aVar != null ? new DateTime(aVar.getCampaignEndTimestamp()).isBeforeNow() : false) {
            ca().error("Campaign has expired since backgrounding the app, finishing");
            finish();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/promotions/CampaignInfoFullScreenActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
