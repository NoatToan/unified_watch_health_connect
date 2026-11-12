package com.garmin.android.apps.connectmobile.developer;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.developer.ManageCampaignsDeveloperActivity;
import com.garmin.android.apps.connectmobile.promotions.CampaignService;
import d53.w;
import ff2.a;
import ff2.k;
import g80.b;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/ManageCampaignsDeveloperActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ManageCampaignsDeveloperActivity extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33618e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33619a = "ManageCampaignsDeveloperActivity";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<a> f33620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f33621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ff2.c f33622d;

    public final void ca(String str) {
        Toast.makeText(this, str, 0).show();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.developer_option_manage_campaigns);
        ff2.c.a aVar = ff2.c.f71140c;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        this.f33622d = aVar.a(applicationContext);
        View viewFindViewById = findViewById(R.id.campaigns_list_rv);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f33621c = recyclerView;
        recyclerView.setAdapter(new b(this.f33620b));
        RecyclerView recyclerView2 = this.f33621c;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        } else {
            s.m("campaignsRecyclerView");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        final int i14 = 0;
        ((Button) findViewById(R.id.get_all_campaigns)).setOnClickListener(new View.OnClickListener(this) { // from class: g80.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageCampaignsDeveloperActivity f76251b;

            {
                this.f76251b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strConcat;
                int i15 = i14;
                int i16 = 1;
                ManageCampaignsDeveloperActivity manageCampaignsDeveloperActivity = this.f76251b;
                switch (i15) {
                    case 0:
                        int i17 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar = new g(manageCampaignsDeveloperActivity, i16);
                        ff2.i iVar = cVar.f71143b;
                        iVar.getClass();
                        iVar.b().debug("getAllCampaigns: ");
                        e52.b bVar = new e52.b(19, gVar, iVar);
                        iVar.b().debug("retrieveAllCampaignsFromCache: ");
                        ge1.b.T(iVar, null, null, new k(iVar, bVar, null), 3);
                        return;
                    case 1:
                        int i18 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar2 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar2 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar2 = new g(manageCampaignsDeveloperActivity, 0);
                        ff2.c.a aVar = ff2.c.f71140c;
                        cVar2.a(gVar2, true);
                        return;
                    case 2:
                        ff2.c cVar3 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar3 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        ff2.c.a aVar2 = ff2.c.f71140c;
                        cVar3.f71143b.a(null);
                        manageCampaignsDeveloperActivity.ca("Data cleared.");
                        return;
                    case 3:
                        int i19 = ManageCampaignsDeveloperActivity.f33618e;
                        String string = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        try {
                            if (string.length() <= 0) {
                                strConcat = "Failed to delete campaign: ".concat(string);
                                manageCampaignsDeveloperActivity.ca(strConcat);
                                return;
                            }
                            long j8 = Long.parseLong(string);
                            ff2.c cVar4 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar4 == null) {
                                s.m("interactor");
                                throw null;
                            }
                            cVar4.f71143b.d(j8);
                            manageCampaignsDeveloperActivity.ca("Successfully deleted campaign: ".concat(string));
                            return;
                        } catch (NumberFormatException unused) {
                            strConcat = "Failed to delete campaign: " + string;
                        } catch (Throwable th3) {
                            manageCampaignsDeveloperActivity.ca("Failed to delete campaign: " + string);
                            throw th3;
                        }
                        break;
                    case 4:
                        int i24 = ManageCampaignsDeveloperActivity.f33618e;
                        String string2 = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        if (string2.length() > 0) {
                            long j14 = Long.parseLong(string2);
                            ff2.c cVar5 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar5 != null) {
                                cVar5.c(kf2.a.REMIND_ME, j14);
                                return;
                            } else {
                                s.m("interactor");
                                throw null;
                            }
                        }
                        return;
                    case 5:
                        int i25 = ManageCampaignsDeveloperActivity.f33618e;
                        CampaignService.a aVar3 = CampaignService.f41048f;
                        Context applicationContext = manageCampaignsDeveloperActivity.getApplicationContext();
                        applicationContext.getClass();
                        aVar3.getClass();
                        CampaignService.a.a(applicationContext);
                        manageCampaignsDeveloperActivity.ca("Fetching from server...");
                        return;
                    case 6:
                        int i26 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.d().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                    default:
                        int i27 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.c().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                }
            }
        });
        final int i15 = 1;
        ((Button) findViewById(R.id.get_active_campaign)).setOnClickListener(new View.OnClickListener(this) { // from class: g80.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageCampaignsDeveloperActivity f76251b;

            {
                this.f76251b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strConcat;
                int i16 = i15;
                int i17 = 1;
                ManageCampaignsDeveloperActivity manageCampaignsDeveloperActivity = this.f76251b;
                switch (i16) {
                    case 0:
                        int i18 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar = new g(manageCampaignsDeveloperActivity, i17);
                        ff2.i iVar = cVar.f71143b;
                        iVar.getClass();
                        iVar.b().debug("getAllCampaigns: ");
                        e52.b bVar = new e52.b(19, gVar, iVar);
                        iVar.b().debug("retrieveAllCampaignsFromCache: ");
                        ge1.b.T(iVar, null, null, new k(iVar, bVar, null), 3);
                        return;
                    case 1:
                        int i19 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar2 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar2 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar2 = new g(manageCampaignsDeveloperActivity, 0);
                        ff2.c.a aVar = ff2.c.f71140c;
                        cVar2.a(gVar2, true);
                        return;
                    case 2:
                        ff2.c cVar3 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar3 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        ff2.c.a aVar2 = ff2.c.f71140c;
                        cVar3.f71143b.a(null);
                        manageCampaignsDeveloperActivity.ca("Data cleared.");
                        return;
                    case 3:
                        int i110 = ManageCampaignsDeveloperActivity.f33618e;
                        String string = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        try {
                            if (string.length() <= 0) {
                                strConcat = "Failed to delete campaign: ".concat(string);
                                manageCampaignsDeveloperActivity.ca(strConcat);
                                return;
                            }
                            long j8 = Long.parseLong(string);
                            ff2.c cVar4 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar4 == null) {
                                s.m("interactor");
                                throw null;
                            }
                            cVar4.f71143b.d(j8);
                            manageCampaignsDeveloperActivity.ca("Successfully deleted campaign: ".concat(string));
                            return;
                        } catch (NumberFormatException unused) {
                            strConcat = "Failed to delete campaign: " + string;
                        } catch (Throwable th3) {
                            manageCampaignsDeveloperActivity.ca("Failed to delete campaign: " + string);
                            throw th3;
                        }
                        break;
                    case 4:
                        int i24 = ManageCampaignsDeveloperActivity.f33618e;
                        String string2 = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        if (string2.length() > 0) {
                            long j14 = Long.parseLong(string2);
                            ff2.c cVar5 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar5 != null) {
                                cVar5.c(kf2.a.REMIND_ME, j14);
                                return;
                            } else {
                                s.m("interactor");
                                throw null;
                            }
                        }
                        return;
                    case 5:
                        int i25 = ManageCampaignsDeveloperActivity.f33618e;
                        CampaignService.a aVar3 = CampaignService.f41048f;
                        Context applicationContext = manageCampaignsDeveloperActivity.getApplicationContext();
                        applicationContext.getClass();
                        aVar3.getClass();
                        CampaignService.a.a(applicationContext);
                        manageCampaignsDeveloperActivity.ca("Fetching from server...");
                        return;
                    case 6:
                        int i26 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.d().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                    default:
                        int i27 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.c().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                }
            }
        });
        final int i16 = 2;
        ((Button) findViewById(R.id.delete_all_campaigns)).setOnClickListener(new View.OnClickListener(this) { // from class: g80.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageCampaignsDeveloperActivity f76251b;

            {
                this.f76251b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strConcat;
                int i17 = i16;
                int i18 = 1;
                ManageCampaignsDeveloperActivity manageCampaignsDeveloperActivity = this.f76251b;
                switch (i17) {
                    case 0:
                        int i19 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar = new g(manageCampaignsDeveloperActivity, i18);
                        ff2.i iVar = cVar.f71143b;
                        iVar.getClass();
                        iVar.b().debug("getAllCampaigns: ");
                        e52.b bVar = new e52.b(19, gVar, iVar);
                        iVar.b().debug("retrieveAllCampaignsFromCache: ");
                        ge1.b.T(iVar, null, null, new k(iVar, bVar, null), 3);
                        return;
                    case 1:
                        int i110 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar2 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar2 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar2 = new g(manageCampaignsDeveloperActivity, 0);
                        ff2.c.a aVar = ff2.c.f71140c;
                        cVar2.a(gVar2, true);
                        return;
                    case 2:
                        ff2.c cVar3 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar3 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        ff2.c.a aVar2 = ff2.c.f71140c;
                        cVar3.f71143b.a(null);
                        manageCampaignsDeveloperActivity.ca("Data cleared.");
                        return;
                    case 3:
                        int i111 = ManageCampaignsDeveloperActivity.f33618e;
                        String string = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        try {
                            if (string.length() <= 0) {
                                strConcat = "Failed to delete campaign: ".concat(string);
                                manageCampaignsDeveloperActivity.ca(strConcat);
                                return;
                            }
                            long j8 = Long.parseLong(string);
                            ff2.c cVar4 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar4 == null) {
                                s.m("interactor");
                                throw null;
                            }
                            cVar4.f71143b.d(j8);
                            manageCampaignsDeveloperActivity.ca("Successfully deleted campaign: ".concat(string));
                            return;
                        } catch (NumberFormatException unused) {
                            strConcat = "Failed to delete campaign: " + string;
                        } catch (Throwable th3) {
                            manageCampaignsDeveloperActivity.ca("Failed to delete campaign: " + string);
                            throw th3;
                        }
                        break;
                    case 4:
                        int i24 = ManageCampaignsDeveloperActivity.f33618e;
                        String string2 = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        if (string2.length() > 0) {
                            long j14 = Long.parseLong(string2);
                            ff2.c cVar5 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar5 != null) {
                                cVar5.c(kf2.a.REMIND_ME, j14);
                                return;
                            } else {
                                s.m("interactor");
                                throw null;
                            }
                        }
                        return;
                    case 5:
                        int i25 = ManageCampaignsDeveloperActivity.f33618e;
                        CampaignService.a aVar3 = CampaignService.f41048f;
                        Context applicationContext = manageCampaignsDeveloperActivity.getApplicationContext();
                        applicationContext.getClass();
                        aVar3.getClass();
                        CampaignService.a.a(applicationContext);
                        manageCampaignsDeveloperActivity.ca("Fetching from server...");
                        return;
                    case 6:
                        int i26 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.d().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                    default:
                        int i27 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.c().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                }
            }
        });
        final int i17 = 3;
        ((Button) findViewById(R.id.delete_campaign_btn)).setOnClickListener(new View.OnClickListener(this) { // from class: g80.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageCampaignsDeveloperActivity f76251b;

            {
                this.f76251b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strConcat;
                int i18 = i17;
                int i19 = 1;
                ManageCampaignsDeveloperActivity manageCampaignsDeveloperActivity = this.f76251b;
                switch (i18) {
                    case 0:
                        int i110 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar = new g(manageCampaignsDeveloperActivity, i19);
                        ff2.i iVar = cVar.f71143b;
                        iVar.getClass();
                        iVar.b().debug("getAllCampaigns: ");
                        e52.b bVar = new e52.b(19, gVar, iVar);
                        iVar.b().debug("retrieveAllCampaignsFromCache: ");
                        ge1.b.T(iVar, null, null, new k(iVar, bVar, null), 3);
                        return;
                    case 1:
                        int i111 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar2 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar2 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar2 = new g(manageCampaignsDeveloperActivity, 0);
                        ff2.c.a aVar = ff2.c.f71140c;
                        cVar2.a(gVar2, true);
                        return;
                    case 2:
                        ff2.c cVar3 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar3 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        ff2.c.a aVar2 = ff2.c.f71140c;
                        cVar3.f71143b.a(null);
                        manageCampaignsDeveloperActivity.ca("Data cleared.");
                        return;
                    case 3:
                        int i112 = ManageCampaignsDeveloperActivity.f33618e;
                        String string = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        try {
                            if (string.length() <= 0) {
                                strConcat = "Failed to delete campaign: ".concat(string);
                                manageCampaignsDeveloperActivity.ca(strConcat);
                                return;
                            }
                            long j8 = Long.parseLong(string);
                            ff2.c cVar4 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar4 == null) {
                                s.m("interactor");
                                throw null;
                            }
                            cVar4.f71143b.d(j8);
                            manageCampaignsDeveloperActivity.ca("Successfully deleted campaign: ".concat(string));
                            return;
                        } catch (NumberFormatException unused) {
                            strConcat = "Failed to delete campaign: " + string;
                        } catch (Throwable th3) {
                            manageCampaignsDeveloperActivity.ca("Failed to delete campaign: " + string);
                            throw th3;
                        }
                        break;
                    case 4:
                        int i24 = ManageCampaignsDeveloperActivity.f33618e;
                        String string2 = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        if (string2.length() > 0) {
                            long j14 = Long.parseLong(string2);
                            ff2.c cVar5 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar5 != null) {
                                cVar5.c(kf2.a.REMIND_ME, j14);
                                return;
                            } else {
                                s.m("interactor");
                                throw null;
                            }
                        }
                        return;
                    case 5:
                        int i25 = ManageCampaignsDeveloperActivity.f33618e;
                        CampaignService.a aVar3 = CampaignService.f41048f;
                        Context applicationContext = manageCampaignsDeveloperActivity.getApplicationContext();
                        applicationContext.getClass();
                        aVar3.getClass();
                        CampaignService.a.a(applicationContext);
                        manageCampaignsDeveloperActivity.ca("Fetching from server...");
                        return;
                    case 6:
                        int i26 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.d().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                    default:
                        int i27 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.c().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                }
            }
        });
        final int i18 = 4;
        ((Button) findViewById(R.id.reset_campaign_btn)).setOnClickListener(new View.OnClickListener(this) { // from class: g80.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageCampaignsDeveloperActivity f76251b;

            {
                this.f76251b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strConcat;
                int i19 = i18;
                int i110 = 1;
                ManageCampaignsDeveloperActivity manageCampaignsDeveloperActivity = this.f76251b;
                switch (i19) {
                    case 0:
                        int i111 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar = new g(manageCampaignsDeveloperActivity, i110);
                        ff2.i iVar = cVar.f71143b;
                        iVar.getClass();
                        iVar.b().debug("getAllCampaigns: ");
                        e52.b bVar = new e52.b(19, gVar, iVar);
                        iVar.b().debug("retrieveAllCampaignsFromCache: ");
                        ge1.b.T(iVar, null, null, new k(iVar, bVar, null), 3);
                        return;
                    case 1:
                        int i112 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar2 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar2 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar2 = new g(manageCampaignsDeveloperActivity, 0);
                        ff2.c.a aVar = ff2.c.f71140c;
                        cVar2.a(gVar2, true);
                        return;
                    case 2:
                        ff2.c cVar3 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar3 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        ff2.c.a aVar2 = ff2.c.f71140c;
                        cVar3.f71143b.a(null);
                        manageCampaignsDeveloperActivity.ca("Data cleared.");
                        return;
                    case 3:
                        int i113 = ManageCampaignsDeveloperActivity.f33618e;
                        String string = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        try {
                            if (string.length() <= 0) {
                                strConcat = "Failed to delete campaign: ".concat(string);
                                manageCampaignsDeveloperActivity.ca(strConcat);
                                return;
                            }
                            long j8 = Long.parseLong(string);
                            ff2.c cVar4 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar4 == null) {
                                s.m("interactor");
                                throw null;
                            }
                            cVar4.f71143b.d(j8);
                            manageCampaignsDeveloperActivity.ca("Successfully deleted campaign: ".concat(string));
                            return;
                        } catch (NumberFormatException unused) {
                            strConcat = "Failed to delete campaign: " + string;
                        } catch (Throwable th3) {
                            manageCampaignsDeveloperActivity.ca("Failed to delete campaign: " + string);
                            throw th3;
                        }
                        break;
                    case 4:
                        int i24 = ManageCampaignsDeveloperActivity.f33618e;
                        String string2 = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        if (string2.length() > 0) {
                            long j14 = Long.parseLong(string2);
                            ff2.c cVar5 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar5 != null) {
                                cVar5.c(kf2.a.REMIND_ME, j14);
                                return;
                            } else {
                                s.m("interactor");
                                throw null;
                            }
                        }
                        return;
                    case 5:
                        int i25 = ManageCampaignsDeveloperActivity.f33618e;
                        CampaignService.a aVar3 = CampaignService.f41048f;
                        Context applicationContext = manageCampaignsDeveloperActivity.getApplicationContext();
                        applicationContext.getClass();
                        aVar3.getClass();
                        CampaignService.a.a(applicationContext);
                        manageCampaignsDeveloperActivity.ca("Fetching from server...");
                        return;
                    case 6:
                        int i26 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.d().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                    default:
                        int i27 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.c().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                }
            }
        });
        final int i19 = 5;
        ((Button) findViewById(R.id.fetch_campaigns_btn)).setOnClickListener(new View.OnClickListener(this) { // from class: g80.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageCampaignsDeveloperActivity f76251b;

            {
                this.f76251b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strConcat;
                int i110 = i19;
                int i111 = 1;
                ManageCampaignsDeveloperActivity manageCampaignsDeveloperActivity = this.f76251b;
                switch (i110) {
                    case 0:
                        int i112 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar = new g(manageCampaignsDeveloperActivity, i111);
                        ff2.i iVar = cVar.f71143b;
                        iVar.getClass();
                        iVar.b().debug("getAllCampaigns: ");
                        e52.b bVar = new e52.b(19, gVar, iVar);
                        iVar.b().debug("retrieveAllCampaignsFromCache: ");
                        ge1.b.T(iVar, null, null, new k(iVar, bVar, null), 3);
                        return;
                    case 1:
                        int i113 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar2 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar2 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar2 = new g(manageCampaignsDeveloperActivity, 0);
                        ff2.c.a aVar = ff2.c.f71140c;
                        cVar2.a(gVar2, true);
                        return;
                    case 2:
                        ff2.c cVar3 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar3 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        ff2.c.a aVar2 = ff2.c.f71140c;
                        cVar3.f71143b.a(null);
                        manageCampaignsDeveloperActivity.ca("Data cleared.");
                        return;
                    case 3:
                        int i114 = ManageCampaignsDeveloperActivity.f33618e;
                        String string = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        try {
                            if (string.length() <= 0) {
                                strConcat = "Failed to delete campaign: ".concat(string);
                                manageCampaignsDeveloperActivity.ca(strConcat);
                                return;
                            }
                            long j8 = Long.parseLong(string);
                            ff2.c cVar4 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar4 == null) {
                                s.m("interactor");
                                throw null;
                            }
                            cVar4.f71143b.d(j8);
                            manageCampaignsDeveloperActivity.ca("Successfully deleted campaign: ".concat(string));
                            return;
                        } catch (NumberFormatException unused) {
                            strConcat = "Failed to delete campaign: " + string;
                        } catch (Throwable th3) {
                            manageCampaignsDeveloperActivity.ca("Failed to delete campaign: " + string);
                            throw th3;
                        }
                        break;
                    case 4:
                        int i24 = ManageCampaignsDeveloperActivity.f33618e;
                        String string2 = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        if (string2.length() > 0) {
                            long j14 = Long.parseLong(string2);
                            ff2.c cVar5 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar5 != null) {
                                cVar5.c(kf2.a.REMIND_ME, j14);
                                return;
                            } else {
                                s.m("interactor");
                                throw null;
                            }
                        }
                        return;
                    case 5:
                        int i25 = ManageCampaignsDeveloperActivity.f33618e;
                        CampaignService.a aVar3 = CampaignService.f41048f;
                        Context applicationContext = manageCampaignsDeveloperActivity.getApplicationContext();
                        applicationContext.getClass();
                        aVar3.getClass();
                        CampaignService.a.a(applicationContext);
                        manageCampaignsDeveloperActivity.ca("Fetching from server...");
                        return;
                    case 6:
                        int i26 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.d().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                    default:
                        int i27 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.c().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                }
            }
        });
        final int i24 = 6;
        ((Button) findViewById(R.id.show_campaign_top_btn)).setOnClickListener(new View.OnClickListener(this) { // from class: g80.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageCampaignsDeveloperActivity f76251b;

            {
                this.f76251b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strConcat;
                int i110 = i24;
                int i111 = 1;
                ManageCampaignsDeveloperActivity manageCampaignsDeveloperActivity = this.f76251b;
                switch (i110) {
                    case 0:
                        int i112 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar = new g(manageCampaignsDeveloperActivity, i111);
                        ff2.i iVar = cVar.f71143b;
                        iVar.getClass();
                        iVar.b().debug("getAllCampaigns: ");
                        e52.b bVar = new e52.b(19, gVar, iVar);
                        iVar.b().debug("retrieveAllCampaignsFromCache: ");
                        ge1.b.T(iVar, null, null, new k(iVar, bVar, null), 3);
                        return;
                    case 1:
                        int i113 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar2 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar2 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar2 = new g(manageCampaignsDeveloperActivity, 0);
                        ff2.c.a aVar = ff2.c.f71140c;
                        cVar2.a(gVar2, true);
                        return;
                    case 2:
                        ff2.c cVar3 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar3 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        ff2.c.a aVar2 = ff2.c.f71140c;
                        cVar3.f71143b.a(null);
                        manageCampaignsDeveloperActivity.ca("Data cleared.");
                        return;
                    case 3:
                        int i114 = ManageCampaignsDeveloperActivity.f33618e;
                        String string = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        try {
                            if (string.length() <= 0) {
                                strConcat = "Failed to delete campaign: ".concat(string);
                                manageCampaignsDeveloperActivity.ca(strConcat);
                                return;
                            }
                            long j8 = Long.parseLong(string);
                            ff2.c cVar4 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar4 == null) {
                                s.m("interactor");
                                throw null;
                            }
                            cVar4.f71143b.d(j8);
                            manageCampaignsDeveloperActivity.ca("Successfully deleted campaign: ".concat(string));
                            return;
                        } catch (NumberFormatException unused) {
                            strConcat = "Failed to delete campaign: " + string;
                        } catch (Throwable th3) {
                            manageCampaignsDeveloperActivity.ca("Failed to delete campaign: " + string);
                            throw th3;
                        }
                        break;
                    case 4:
                        int i25 = ManageCampaignsDeveloperActivity.f33618e;
                        String string2 = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        if (string2.length() > 0) {
                            long j14 = Long.parseLong(string2);
                            ff2.c cVar5 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar5 != null) {
                                cVar5.c(kf2.a.REMIND_ME, j14);
                                return;
                            } else {
                                s.m("interactor");
                                throw null;
                            }
                        }
                        return;
                    case 5:
                        int i26 = ManageCampaignsDeveloperActivity.f33618e;
                        CampaignService.a aVar3 = CampaignService.f41048f;
                        Context applicationContext = manageCampaignsDeveloperActivity.getApplicationContext();
                        applicationContext.getClass();
                        aVar3.getClass();
                        CampaignService.a.a(applicationContext);
                        manageCampaignsDeveloperActivity.ca("Fetching from server...");
                        return;
                    case 6:
                        int i27 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.d().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                    default:
                        int i28 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.c().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                }
            }
        });
        final int i25 = 7;
        ((Button) findViewById(R.id.show_campaign_bottom_btn)).setOnClickListener(new View.OnClickListener(this) { // from class: g80.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageCampaignsDeveloperActivity f76251b;

            {
                this.f76251b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strConcat;
                int i110 = i25;
                int i111 = 1;
                ManageCampaignsDeveloperActivity manageCampaignsDeveloperActivity = this.f76251b;
                switch (i110) {
                    case 0:
                        int i112 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar = new g(manageCampaignsDeveloperActivity, i111);
                        ff2.i iVar = cVar.f71143b;
                        iVar.getClass();
                        iVar.b().debug("getAllCampaigns: ");
                        e52.b bVar = new e52.b(19, gVar, iVar);
                        iVar.b().debug("retrieveAllCampaignsFromCache: ");
                        ge1.b.T(iVar, null, null, new k(iVar, bVar, null), 3);
                        return;
                    case 1:
                        int i113 = ManageCampaignsDeveloperActivity.f33618e;
                        manageCampaignsDeveloperActivity.showProgressOverlay();
                        ff2.c cVar2 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar2 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        g gVar2 = new g(manageCampaignsDeveloperActivity, 0);
                        ff2.c.a aVar = ff2.c.f71140c;
                        cVar2.a(gVar2, true);
                        return;
                    case 2:
                        ff2.c cVar3 = manageCampaignsDeveloperActivity.f33622d;
                        if (cVar3 == null) {
                            s.m("interactor");
                            throw null;
                        }
                        ff2.c.a aVar2 = ff2.c.f71140c;
                        cVar3.f71143b.a(null);
                        manageCampaignsDeveloperActivity.ca("Data cleared.");
                        return;
                    case 3:
                        int i114 = ManageCampaignsDeveloperActivity.f33618e;
                        String string = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        try {
                            if (string.length() <= 0) {
                                strConcat = "Failed to delete campaign: ".concat(string);
                                manageCampaignsDeveloperActivity.ca(strConcat);
                                return;
                            }
                            long j8 = Long.parseLong(string);
                            ff2.c cVar4 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar4 == null) {
                                s.m("interactor");
                                throw null;
                            }
                            cVar4.f71143b.d(j8);
                            manageCampaignsDeveloperActivity.ca("Successfully deleted campaign: ".concat(string));
                            return;
                        } catch (NumberFormatException unused) {
                            strConcat = "Failed to delete campaign: " + string;
                        } catch (Throwable th3) {
                            manageCampaignsDeveloperActivity.ca("Failed to delete campaign: " + string);
                            throw th3;
                        }
                        break;
                    case 4:
                        int i26 = ManageCampaignsDeveloperActivity.f33618e;
                        String string2 = w.i0(((EditText) manageCampaignsDeveloperActivity.findViewById(R.id.enter_campaign_id_tv)).getText().toString()).toString();
                        if (string2.length() > 0) {
                            long j14 = Long.parseLong(string2);
                            ff2.c cVar5 = manageCampaignsDeveloperActivity.f33622d;
                            if (cVar5 != null) {
                                cVar5.c(kf2.a.REMIND_ME, j14);
                                return;
                            } else {
                                s.m("interactor");
                                throw null;
                            }
                        }
                        return;
                    case 5:
                        int i27 = ManageCampaignsDeveloperActivity.f33618e;
                        CampaignService.a aVar3 = CampaignService.f41048f;
                        Context applicationContext = manageCampaignsDeveloperActivity.getApplicationContext();
                        applicationContext.getClass();
                        aVar3.getClass();
                        CampaignService.a.a(applicationContext);
                        manageCampaignsDeveloperActivity.ca("Fetching from server...");
                        return;
                    case 6:
                        int i28 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.d().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                    default:
                        int i29 = ManageCampaignsDeveloperActivity.f33618e;
                        new yb1.c().show(manageCampaignsDeveloperActivity.getSupportFragmentManager(), manageCampaignsDeveloperActivity.f33619a);
                        return;
                }
            }
        });
    }
}
