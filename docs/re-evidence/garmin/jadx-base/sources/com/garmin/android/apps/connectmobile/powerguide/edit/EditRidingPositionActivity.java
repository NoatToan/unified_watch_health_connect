package com.garmin.android.apps.connectmobile.powerguide.edit;

import ab1.l;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import java.util.ArrayList;
import p005kotlin.Metadata;
import r22.t1;
import r22.u1;
import x91.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/edit/EditRidingPositionActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditRidingPositionActivity extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40405b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u1 f40406a;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.power_guide_recycler_view);
        initActionBar(true, R.string.lbl_riding_position);
        Intent intent = getIntent();
        l lVar = (l) ((intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("riding_position"));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setMotionEventSplittingEnabled(false);
        l[] lVarArrValues = l.values();
        ArrayList arrayList = new ArrayList(lVarArrValues.length);
        int length = lVarArrValues.length;
        for (int i14 = 0; i14 < length; i14++) {
            l lVar2 = lVarArrValues[i14];
            arrayList.add(new t1(String.valueOf(lVar2.f2602a), Integer.valueOf(lVar2.f2604c), null, getString(lVar2.f2605d), null, false, lVar != null && lVar2 == lVar, null, true, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.icon_large)), 180, null));
        }
        TextView textView = new TextView(new ContextThemeWrapper(this, R.style.PowerGuideFooterText), null, 0);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setText(R.string.power_guide_header_select_riding_position);
        u1 u1Var = new u1(new wd.c(this, 21));
        u1Var.D(arrayList);
        u1Var.r(textView);
        u1Var.f149752e = new j(8);
        this.f40406a = u1Var;
        recyclerView.setAdapter(u1Var);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.POWER_GUIDE_HELP, "ABOUT_RIDING_POSITION_ACTION", null, 8);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/edit/EditRidingPositionActivity$a;", "", "<init>", "()V", "", "EXTRA_RIDING_POSITION", "Ljava/lang/String;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
