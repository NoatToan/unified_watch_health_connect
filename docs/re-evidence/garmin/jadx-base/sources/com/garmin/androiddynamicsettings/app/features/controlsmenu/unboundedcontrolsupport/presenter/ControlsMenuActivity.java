package com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.ControlsMenuActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import ei2.c;
import ei2.h;
import hc0.f;
import hi2.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import zh2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/controlsmenu/unboundedcontrolsupport/presenter/ControlsMenuActivity;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/b;", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ControlsMenuActivity extends com.garmin.androiddynamicsettings.app.presentationlayer.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f50609v = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f50610l = new d("ControlsMenuActivity", null, 2, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecyclerView f50611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f50612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f50613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f50614p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public uh2.a f50615q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<sh2.a> f50616r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f50617t;

    public final void T9(String str) {
        if (str.length() > 0) {
            Toast.makeText(this, str, 0).show();
        } else {
            Toast.makeText(this, getString(R.string.txt_something_went_wrong_try_again), 0).show();
        }
        hideProgressOverlay();
        finish();
    }

    public final void U9() {
        this.f50610l.a("drawWatchFaceDial:");
        uh2.a aVar = this.f50615q;
        if (aVar == null) {
            s.m("controlsMenuViewModel");
            throw null;
        }
        ArrayList<Drawable> arrayListD = aVar.f171141c.d();
        if (arrayListD == null || arrayListD.isEmpty()) {
            return;
        }
        int iMin = Math.min(arrayListD.size(), 10);
        RelativeLayout relativeLayout = this.f50612n;
        if (relativeLayout == null) {
            s.m("watchFaceLayout");
            throw null;
        }
        relativeLayout.removeAllViews();
        int i14 = 0;
        for (Drawable drawable : arrayListD.subList(0, iMin)) {
            if (drawable != null) {
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setLayoutParams(new ConstraintLayout.b(-2, -2));
                float f14 = (36 * i14) + 60;
                linearLayout.setRotation(f14);
                int i15 = (int) (5 * getResources().getDisplayMetrics().density);
                ImageView imageView = new ImageView(this);
                imageView.setImageDrawable(drawable);
                imageView.setPadding(i15, i15, i15, i15);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, 0, (int) (80 * getResources().getDisplayMetrics().density));
                imageView.setLayoutParams(layoutParams);
                imageView.setRotation(-f14);
                linearLayout.addView(imageView);
                RelativeLayout relativeLayout2 = this.f50612n;
                if (relativeLayout2 == null) {
                    s.m("watchFaceLayout");
                    throw null;
                }
                relativeLayout2.addView(linearLayout);
            }
            i14++;
        }
    }

    @Override // b.g, android.app.Activity
    public final void onBackPressed() {
        Integer num;
        Intent intent = getIntent();
        uh2.a aVar = this.f50615q;
        Serializable serializable = null;
        if (aVar == null) {
            s.m("controlsMenuViewModel");
            throw null;
        }
        ArrayList<sh2.a> arrayListD = aVar.f171140b.d();
        if (arrayListD != null) {
            arrayListD.remove(aVar.f171145g);
            if (arrayListD.size() > 0) {
                sh2.b bVar = aVar.f171144f;
                bVar.getClass();
                ArrayList arrayList = new ArrayList();
                if (arrayListD.size() > 0) {
                    for (sh2.a aVar2 : arrayListD) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(TtmlNode.ATTR_ID, aVar2.f159307a);
                        Boolean bool = aVar2.f159309c;
                        if (bool != null) {
                            linkedHashMap.put("required", bool);
                        } else {
                            linkedHashMap.put("required", null);
                        }
                        Integer num2 = aVar2.f159308b;
                        if ((num2 != null && num2.intValue() == 9630) || ((num = aVar2.f159308b) != null && num.intValue() == 9631)) {
                            linkedHashMap.put(FirebaseAnalytics.Param.INDEX, null);
                        } else {
                            linkedHashMap.put(FirebaseAnalytics.Param.INDEX, aVar2.f159308b);
                        }
                        arrayList.add(linkedHashMap);
                    }
                    serializable = arrayList;
                } else {
                    bVar.f159313b.b("Empty controls object");
                }
            }
        }
        intent.putExtra("SETTINGS_CONTROLS_MENU_BUNDLE", serializable);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Unit unit;
        Unit unit2;
        super.onCreate(bundle);
        setContentView(R.layout.dsl_controls_menu);
        String string = getString(R.string.controls_menu_title);
        string.getClass();
        com.garmin.androiddynamicsettings.app.presentationlayer.b.Q9(this, string, null, 6);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ArrayList<sh2.a> parcelableArrayList = extras.getParcelableArrayList("SETTINGS_CONTROLS_MENU_BUNDLE");
            if (parcelableArrayList != null) {
                this.f50616r = parcelableArrayList;
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                T9("");
                return;
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            T9("");
            return;
        }
        ArrayList<sh2.a> arrayList = this.f50616r;
        if (arrayList == null) {
            s.m("controlsMenuDataList");
            throw null;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        d dVar = this.f50610l;
        if (zIsEmpty) {
            dVar.b("Controls data is empty");
            String string2 = getString(R.string.settings_unable_to_load_default_controls);
            string2.getClass();
            T9(string2);
            return;
        }
        try {
            ArrayList<sh2.a> arrayList2 = this.f50616r;
            if (arrayList2 == null) {
                s.m("controlsMenuDataList");
                throw null;
            }
            this.f50615q = (uh2.a) new x1(this, new uh2.c(this, arrayList2)).b(s0.f105811a.b(uh2.a.class));
            e.f204807a.getClass();
            h hVarG = ((uc0.d) e.a()).g(this, mh2.h.CONTROLS_MENU_WATCH_FACE.f118578a);
            if (!(hVarG instanceof c)) {
                hVarG = null;
            }
            c cVar = (c) hVarG;
            if (cVar == null) {
                cVar = new c(this);
            }
            this.f50617t = cVar;
            View viewFindViewById = findViewById(R.id.watch_face_layout);
            viewFindViewById.getClass();
            this.f50612n = (RelativeLayout) viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.watch_face);
            viewFindViewById2.getClass();
            this.f50613o = (ImageView) viewFindViewById2;
            U9();
            View viewFindViewById3 = findViewById(R.id.controls_menu_list);
            viewFindViewById3.getClass();
            this.f50611m = (RecyclerView) viewFindViewById3;
            uh2.a aVar = this.f50615q;
            if (aVar == null) {
                s.m("controlsMenuViewModel");
                throw null;
            }
            this.f50614p = new a(aVar);
            a aVar2 = this.f50614p;
            if (aVar2 == null) {
                s.m("controlsAdapter");
                throw null;
            }
            androidx.recyclerview.widget.s sVar = new androidx.recyclerview.widget.s(new b(this, aVar2));
            RecyclerView recyclerView = this.f50611m;
            if (recyclerView == null) {
                s.m("controlsMenuList");
                throw null;
            }
            sVar.e(recyclerView);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            RecyclerView recyclerView2 = this.f50611m;
            if (recyclerView2 == null) {
                s.m("controlsMenuList");
                throw null;
            }
            recyclerView2.setLayoutManager(linearLayoutManager);
            RecyclerView recyclerView3 = this.f50611m;
            if (recyclerView3 == null) {
                s.m("controlsMenuList");
                throw null;
            }
            a aVar3 = this.f50614p;
            if (aVar3 == null) {
                s.m("controlsAdapter");
                throw null;
            }
            recyclerView3.setAdapter(aVar3);
            uh2.a aVar4 = this.f50615q;
            if (aVar4 == null) {
                s.m("controlsMenuViewModel");
                throw null;
            }
            final int i14 = 0;
            aVar4.f171140b.f(this, new z0(this) { // from class: th2.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ControlsMenuActivity f164552b;

                {
                    this.f164552b = this;
                }

                @Override // androidx.lifecycle.z0
                public final void onChanged(Object obj) {
                    int i15 = i14;
                    ControlsMenuActivity controlsMenuActivity = this.f164552b;
                    int i16 = ControlsMenuActivity.f50609v;
                    switch (i15) {
                        case 0:
                            com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.a aVar5 = controlsMenuActivity.f50614p;
                            if (aVar5 != null) {
                                aVar5.notifyDataSetChanged();
                                return;
                            } else {
                                s.m("controlsAdapter");
                                throw null;
                            }
                        default:
                            controlsMenuActivity.U9();
                            return;
                    }
                }
            });
            uh2.a aVar5 = this.f50615q;
            if (aVar5 == null) {
                s.m("controlsMenuViewModel");
                throw null;
            }
            final int i15 = 1;
            aVar5.f171141c.f(this, new z0(this) { // from class: th2.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ControlsMenuActivity f164552b;

                {
                    this.f164552b = this;
                }

                @Override // androidx.lifecycle.z0
                public final void onChanged(Object obj) {
                    int i16 = i15;
                    ControlsMenuActivity controlsMenuActivity = this.f164552b;
                    int i17 = ControlsMenuActivity.f50609v;
                    switch (i16) {
                        case 0:
                            com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter.a aVar6 = controlsMenuActivity.f50614p;
                            if (aVar6 != null) {
                                aVar6.notifyDataSetChanged();
                                return;
                            } else {
                                s.m("controlsAdapter");
                                throw null;
                            }
                        default:
                            controlsMenuActivity.U9();
                            return;
                    }
                }
            });
            rh2.b bVar = (rh2.b) extras.getParcelable("VIEW_ATTR_BUNDLE");
            uh2.a aVar6 = this.f50615q;
            if (aVar6 != null) {
                aVar6.f171142d.f(this, new f(4, this, bVar));
            } else {
                s.m("controlsMenuViewModel");
                throw null;
            }
        } catch (IllegalArgumentException e4) {
            dVar.b("DataValue not initialized and used in ViewModel.. " + e4);
            T9("");
        } catch (IllegalStateException e14) {
            dVar.b("DataValue not initialized and used in ViewModel.." + e14);
            T9("");
        }
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.dsl_controls_menu, menu);
        return true;
    }

    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.clear_text) {
            uh2.a aVar = this.f50615q;
            if (aVar == null) {
                s.m("controlsMenuViewModel");
                throw null;
            }
            y0<ArrayList<sh2.a>> y0Var = aVar.f171140b;
            ArrayList<sh2.a> arrayListD = y0Var.d();
            if (arrayListD != null) {
                int i14 = 0;
                for (sh2.a aVar2 : arrayListD) {
                    Integer num = aVar2.f159308b;
                    if (num != null && num.intValue() < 9630) {
                        if (s.g(aVar2.f159309c, Boolean.TRUE)) {
                            aVar2.f159308b = Integer.valueOf(i14);
                            i14++;
                        } else {
                            aVar2.f159308b = 9631;
                        }
                    }
                }
                y0Var.m(aVar.y4(arrayListD));
                aVar.f171141c.m(aVar.x4());
            }
        } else if (itemId == R.id.reset_to_default) {
            R9(true);
            uh2.a aVar3 = this.f50615q;
            if (aVar3 == null) {
                s.m("controlsMenuViewModel");
                throw null;
            }
            R9(true);
            new ai2.e().a(new uh2.b(this, aVar3), "controlsMenuReset");
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
