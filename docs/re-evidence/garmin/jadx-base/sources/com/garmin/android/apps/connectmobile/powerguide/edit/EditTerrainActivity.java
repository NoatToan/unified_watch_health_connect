package com.garmin.android.apps.connectmobile.powerguide.edit;

import a7.b;
import ab1.p;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import java.util.ArrayList;
import og2.k;
import p005kotlin.Metadata;
import r22.t1;
import r22.u1;
import x91.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/edit/EditTerrainActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditTerrainActivity extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40407b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u1 f40408a;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.power_guide_recycler_view);
        initActionBar(true, R.string.lbl_terrain);
        Intent intent = getIntent();
        p pVar = (p) ((intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("extra_terrain"));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setMotionEventSplittingEnabled(false);
        p[] pVarArrValues = p.values();
        ArrayList arrayList = new ArrayList(pVarArrValues.length);
        int length = pVarArrValues.length;
        for (int i14 = 0; i14 < length; i14++) {
            p pVar2 = pVarArrValues[i14];
            Drawable drawable = b.getDrawable(this, pVar2.f2635c);
            if (drawable != null) {
                k.F(R.color.gcm_icon_primary, this, drawable);
            }
            String strValueOf = String.valueOf(pVar2.f2633a);
            String string = getString(pVar2.f2636d);
            boolean z14 = pVar != null && pVar2 == pVar;
            Resources resources = getResources();
            resources.getClass();
            arrayList.add(new t1(strValueOf, null, drawable, string, null, false, z14, null, true, Integer.valueOf((int) xy2.b.n(resources, 32.0f)), 178, null));
        }
        u1 u1Var = new u1(new wd.c(this, 22));
        u1Var.D(arrayList);
        u1Var.f149752e = new j(9);
        this.f40408a = u1Var;
        recyclerView.setAdapter(u1Var);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/edit/EditTerrainActivity$a;", "", "<init>", "()V", "", "EXTRA_TERRAIN", "Ljava/lang/String;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
