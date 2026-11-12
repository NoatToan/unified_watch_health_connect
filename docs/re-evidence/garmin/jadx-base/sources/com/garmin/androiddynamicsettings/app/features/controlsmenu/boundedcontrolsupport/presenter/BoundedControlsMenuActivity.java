package com.garmin.androiddynamicsettings.app.features.controlsmenu.boundedcontrolsupport.presenter;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import ei2.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oh2.c;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.c0;
import p13.y;
import ph2.d;
import zh2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/controlsmenu/boundedcontrolsupport/presenter/BoundedControlsMenuActivity;", "Lcom/garmin/androiddynamicsettings/app/presentationlayer/b;", "", "Lqh2/a$a;", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BoundedControlsMenuActivity extends com.garmin.androiddynamicsettings.app.presentationlayer.b implements qh2.a.InterfaceC2731a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f50595z = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewPager f50596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qh2.a f50597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public StyledTextView f50598n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f50599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public oh2.a f50600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d f50601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f50602r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f50603t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f50604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f50605w = 255;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f50606x = 255;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Point f50607y;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/androiddynamicsettings/app/features/controlsmenu/boundedcontrolsupport/presenter/BoundedControlsMenuActivity$b", "Landroidx/viewpager/widget/ViewPager$j;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements ViewPager.j {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            int i15 = BoundedControlsMenuActivity.f50595z;
            BoundedControlsMenuActivity.this.V9(i14);
        }
    }

    static {
        new a(null);
    }

    public final void T9() {
        qh2.a aVar = this.f50597m;
        if (aVar == null) {
            s.m("controlsMenuPreviewView");
            throw null;
        }
        oh2.a aVar2 = this.f50600p;
        if (aVar2 == null) {
            s.m("boundedControlsMenuDTO");
            throw null;
        }
        ArrayList<c> arrayList = aVar2.f132165b;
        arrayList.getClass();
        for (c cVar : arrayList) {
            int i14 = cVar.f132173b;
            ImageView[] imageViewArr = aVar.watchFaceIconImageViews;
            if (i14 < imageViewArr.length) {
                ImageView imageView = imageViewArr[i14];
                if (imageView != null) {
                    imageView.setImageResource(cVar.f132175d);
                }
                ImageView imageView2 = aVar.watchFaceIconImageViews[cVar.f132173b];
                if (imageView2 != null) {
                    imageView2.setSelected(false);
                }
            }
        }
        ViewPager viewPager = this.f50596l;
        if (viewPager == null) {
            s.m("controlMenuCarouselViewPager");
            throw null;
        }
        viewPager.setAlpha(0.5f);
        ImageView imageView3 = this.f50603t;
        if (imageView3 == null) {
            s.m("watchFaceCenterImageView");
            throw null;
        }
        imageView3.setEnabled(false);
        Y9(255, null);
    }

    public final Point U9() {
        Point point = this.f50607y;
        if (point != null) {
            return point;
        }
        s.m("size");
        throw null;
    }

    public final void V9(int i14) {
        if (U9().x > 0) {
            oh2.a aVar = this.f50600p;
            if (aVar == null) {
                s.m("boundedControlsMenuDTO");
                throw null;
            }
            if (aVar.f132166c.isEmpty()) {
                return;
            }
            oh2.a aVar2 = this.f50600p;
            if (aVar2 == null) {
                s.m("boundedControlsMenuDTO");
                throw null;
            }
            float size = aVar2.f132166c.size();
            int iCeil = U9().x / ((int) Math.ceil(size / 4));
            float f14 = i14;
            int i15 = (int) ((U9().x / size) * f14);
            if (i15 + iCeil >= U9().x || size - f14 <= 4.0f) {
                i15 = U9().x - iCeil;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iCeil, (int) getResources().getDimension(R.dimen.bounded_controls_menu_sliding_toolbar_height));
            layoutParams.setMargins(i15, 0, 0, 0);
            ImageView imageView = this.f50599o;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            } else {
                s.m("slidingToolBarImageView");
                throw null;
            }
        }
    }

    public final void W9(int i14, int i15, boolean z14) {
        if (z14) {
            if (i14 > i15) {
                return;
            }
            while (true) {
                oh2.a aVar = this.f50600p;
                if (aVar == null) {
                    s.m("boundedControlsMenuDTO");
                    throw null;
                }
                if (aVar.b(i14, aVar.f132165b) != null) {
                    oh2.a aVar2 = this.f50600p;
                    if (aVar2 == null) {
                        s.m("boundedControlsMenuDTO");
                        throw null;
                    }
                    c cVarB = aVar2.b(i14, aVar2.f132165b);
                    if (cVarB != null) {
                        cVarB.f132173b = i14 - 1;
                    }
                }
                if (i14 == i15) {
                    return;
                } else {
                    i14++;
                }
            }
        } else {
            if (i15 > i14) {
                return;
            }
            while (true) {
                oh2.a aVar3 = this.f50600p;
                if (aVar3 == null) {
                    s.m("boundedControlsMenuDTO");
                    throw null;
                }
                if (aVar3.b(i14, aVar3.f132165b) != null) {
                    oh2.a aVar4 = this.f50600p;
                    if (aVar4 == null) {
                        s.m("boundedControlsMenuDTO");
                        throw null;
                    }
                    c cVarB2 = aVar4.b(i14, aVar4.f132165b);
                    if (cVarB2 != null) {
                        cVarB2.f132173b = i14 + 1;
                    }
                }
                if (i14 == i15) {
                    return;
                } else {
                    i14--;
                }
            }
        }
    }

    public final void X9(int i14) {
        qh2.a aVar = this.f50597m;
        if (aVar == null) {
            s.m("controlsMenuPreviewView");
            throw null;
        }
        aVar.j(i14, false);
        this.f50606x = 255;
        this.f50602r = null;
        ViewPager viewPager = this.f50596l;
        if (viewPager == null) {
            s.m("controlMenuCarouselViewPager");
            throw null;
        }
        viewPager.setAlpha(0.5f);
        ImageView imageView = this.f50603t;
        if (imageView == null) {
            s.m("watchFaceCenterImageView");
            throw null;
        }
        imageView.setEnabled(false);
        StyledTextView styledTextView = this.f50598n;
        if (styledTextView == null) {
            s.m("tapALocationTextView");
            throw null;
        }
        styledTextView.setText(getResources().getString(R.string.tap_an_icon));
        Y9(255, null);
        ViewPager viewPager2 = this.f50596l;
        if (viewPager2 != null) {
            V9(viewPager2.getCurrentItem());
        } else {
            s.m("controlMenuCarouselViewPager");
            throw null;
        }
    }

    public final void Y9(int i14, c cVar) {
        d dVar = this.f50601q;
        if (dVar == null) {
            s.m("controlsMenuAdapter");
            throw null;
        }
        dVar.f137721e = i14;
        dVar.f137722f = cVar;
    }

    @Override // android.app.Activity
    public final void finish() {
        oh2.a aVar = this.f50600p;
        ArrayList arrayList = null;
        if (aVar == null) {
            s.m("boundedControlsMenuDTO");
            throw null;
        }
        if (!aVar.f132164a.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            oh2.a aVar2 = this.f50600p;
            if (aVar2 == null) {
                s.m("boundedControlsMenuDTO");
                throw null;
            }
            Iterator<c> it = aVar2.f132165b.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(it.next().f132173b));
            }
            int i14 = this.f50604v;
            for (int i15 = 0; i15 < i14; i15++) {
                if (!arrayList2.contains(Integer.valueOf(i15))) {
                    oh2.a aVar3 = this.f50600p;
                    if (aVar3 == null) {
                        s.m("boundedControlsMenuDTO");
                        throw null;
                    }
                    aVar3.f132165b.add(new c("INVALID", i15, Boolean.FALSE, 2131231194, R.string.controls_menu_title, 255));
                }
            }
            oh2.b bVar = oh2.b.f132168a;
            oh2.a aVar4 = this.f50600p;
            if (aVar4 == null) {
                s.m("boundedControlsMenuDTO");
                throw null;
            }
            bVar.getClass();
            ArrayList arrayList3 = new ArrayList();
            ArrayList<c> arrayList4 = aVar4.f132165b;
            ArrayList arrayList5 = new ArrayList(y.r(arrayList4, 10));
            Iterator<T> it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(oh2.b.b((c) it3.next()));
            }
            arrayList3.addAll(arrayList5);
            ArrayList<c> arrayList6 = aVar4.f132166c;
            ArrayList arrayList7 = new ArrayList(y.r(arrayList6, 10));
            Iterator<T> it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                arrayList7.add(oh2.b.b((c) it4.next()));
            }
            arrayList3.addAll(arrayList7);
            if (arrayList3.isEmpty()) {
                oh2.b.f132169b.b("Empty controls menu list");
            } else {
                arrayList = arrayList3;
            }
            getIntent().putExtra("SETTINGS_CONTROLS_MENU_BUNDLE", arrayList);
            setResult(-1, getIntent());
        }
        super.finish();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    @Override // com.garmin.androiddynamicsettings.app.presentationlayer.b, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        super.onCreate(bundle);
        setContentView(R.layout.dsl_bounded_controls_menu);
        String string = getString(R.string.controls_menu_title);
        string.getClass();
        com.garmin.androiddynamicsettings.app.presentationlayer.b.Q9(this, string, null, 6);
        Intent intent = getIntent();
        oh2.a aVar = (intent == null || (extras2 = intent.getExtras()) == null) ? null : (oh2.a) extras2.getParcelable("SETTINGS_CONTROLS_MENU_BUNDLE");
        Intent intent2 = getIntent();
        rh2.b bVar = (intent2 == null || (extras = intent2.getExtras()) == null) ? null : (rh2.b) extras.getParcelable("VIEW_ATTR_BUNDLE");
        if (aVar == null || bVar == null) {
            Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
            finish();
            return;
        }
        this.f50600p = aVar;
        List<c> list = aVar.f132164a;
        int size = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            if (list.get(i15).f132173b >= 0 && list.get(i15).f132173b < 255) {
                i14++;
            }
        }
        this.f50604v = i14;
        if (i14 == 0) {
            Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
            finish();
        } else {
            oh2.a aVar2 = this.f50600p;
            if (aVar2 == null) {
                s.m("boundedControlsMenuDTO");
                throw null;
            }
            if (aVar2.f132164a.isEmpty()) {
                Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
                finish();
            }
        }
        View viewFindViewById = findViewById(R.id.vp_control_menu_carousel);
        viewFindViewById.getClass();
        ViewPager viewPager = (ViewPager) viewFindViewById;
        this.f50596l = viewPager;
        viewPager.setOnPageChangeListener(new b());
        oh2.d.c cVar = oh2.d.f132178c;
        String str = bVar.f152764e;
        cVar.getClass();
        oh2.d dVar = oh2.d.Square;
        oh2.d dVar2 = s.g(str, dVar.f132182a) ? dVar : oh2.d.Round;
        qh2.a aVarInvoke = dVar2.f132183b.invoke(this);
        aVarInvoke.setOnWatchFaceIconClicked(this);
        this.f50597m = aVarInvoke;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.watch_face_preview);
        qh2.a aVar3 = this.f50597m;
        if (aVar3 == null) {
            s.m("controlsMenuPreviewView");
            throw null;
        }
        viewGroup.addView(aVar3);
        View viewFindViewById2 = findViewById(R.id.tv_tap_an_icon);
        viewFindViewById2.getClass();
        this.f50598n = (StyledTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.iv_sliding_tool_bar);
        viewFindViewById3.getClass();
        this.f50599o = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.iv_device_background);
        viewFindViewById4.getClass();
        ImageView imageView = (ImageView) viewFindViewById4;
        e.f204807a.getClass();
        h hVarG = ((uc0.d) e.a()).g(this, mh2.h.CONTROLS_MENU_WATCH_FACE.f118578a);
        if (!(hVarG instanceof ei2.c)) {
            hVarG = null;
        }
        ei2.c cVar2 = (ei2.c) hVarG;
        if (cVar2 == null) {
            cVar2 = new ei2.c(this);
        }
        String strR = cVar2.r(bVar.f152760a, bVar.f152762c);
        if (strR != null) {
            com.bumptech.glide.b.c(this).e(this).l(strR).E(imageView);
        } else if (dVar2 != dVar) {
            imageView.setImageResource(2131231499);
        }
        View viewFindViewById5 = findViewById(R.id.iv_watch_face_center_icon);
        viewFindViewById5.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById5;
        this.f50603t = imageView2;
        imageView2.setOnClickListener(new oq.a(this, 2));
        oh2.a aVar4 = this.f50600p;
        if (aVar4 == null) {
            s.m("boundedControlsMenuDTO");
            throw null;
        }
        d dVar3 = new d(this, aVar4, 4);
        this.f50601q = dVar3;
        ViewPager viewPager2 = this.f50596l;
        if (viewPager2 == null) {
            s.m("controlMenuCarouselViewPager");
            throw null;
        }
        viewPager2.setAdapter(dVar3);
        Y9(255, null);
        qh2.a aVar5 = this.f50597m;
        if (aVar5 == null) {
            s.m("controlsMenuPreviewView");
            throw null;
        }
        aVar5.i(this.f50604v);
        T9();
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        this.f50607y = new Point();
        if (defaultDisplay != null) {
            defaultDisplay.getSize(U9());
        }
        V9(0);
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
            oh2.a aVar = this.f50600p;
            if (aVar == null) {
                s.m("boundedControlsMenuDTO");
                throw null;
            }
            Iterator<c> it = aVar.f132165b.iterator();
            it.getClass();
            while (it.hasNext()) {
                c next = it.next();
                next.getClass();
                c cVar = next;
                if (!s.g(cVar.f132174c, Boolean.TRUE)) {
                    cVar.f132173b = 255;
                    oh2.a aVar2 = this.f50600p;
                    if (aVar2 == null) {
                        s.m("boundedControlsMenuDTO");
                        throw null;
                    }
                    aVar2.f132166c.add(cVar);
                    it.remove();
                }
            }
            oh2.a aVar3 = this.f50600p;
            if (aVar3 == null) {
                s.m("boundedControlsMenuDTO");
                throw null;
            }
            ArrayList<c> arrayList = aVar3.f132166c;
            if (arrayList.size() > 1) {
                c0.u(arrayList, new ph2.b());
            }
            oh2.a aVar4 = this.f50600p;
            if (aVar4 == null) {
                s.m("boundedControlsMenuDTO");
                throw null;
            }
            if (aVar4.f132165b.size() > 1) {
                oh2.a aVar5 = this.f50600p;
                if (aVar5 == null) {
                    s.m("boundedControlsMenuDTO");
                    throw null;
                }
                ArrayList<c> arrayList2 = aVar5.f132165b;
                if (arrayList2.size() > 1) {
                    c0.u(arrayList2, new ph2.c());
                }
            }
            oh2.a aVar6 = this.f50600p;
            if (aVar6 == null) {
                s.m("boundedControlsMenuDTO");
                throw null;
            }
            int i14 = 0;
            for (c cVar2 : aVar6.f132165b) {
                int i15 = i14 + 1;
                qh2.a aVar7 = this.f50597m;
                if (aVar7 == null) {
                    s.m("controlsMenuPreviewView");
                    throw null;
                }
                cVar2.f132173b = (aVar7.getRequiredControlStartPosition() + i14) % this.f50604v;
                i14 = i15;
            }
            qh2.a aVar8 = this.f50597m;
            if (aVar8 == null) {
                s.m("controlsMenuPreviewView");
                throw null;
            }
            int i16 = aVar8.noOfOptions;
            for (int i17 = 0; i17 < i16; i17++) {
                ImageView imageView = aVar8.watchFaceIconImageViews[i17];
                if (imageView != null) {
                    imageView.setImageResource(2131231194);
                }
                ImageView imageView2 = aVar8.watchFaceIconImageViews[i17];
                if (imageView2 != null) {
                    imageView2.setSelected(false);
                }
            }
            T9();
            d dVar = this.f50601q;
            if (dVar == null) {
                s.m("controlsMenuAdapter");
                throw null;
            }
            dVar.notifyDataSetChanged();
            X9(-1);
        } else if (itemId == R.id.reset_to_default) {
            R9(true);
            new ai2.e().a(new ph2.a(this), "controlsMenuReset");
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0127  */
    /* JADX WARN: Code duplicated, block: B:102:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x012f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0133 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    @Override // qh2.a.InterfaceC2731a
    public final void p0(int i14) {
        boolean z14;
        int i15;
        qh2.a aVar;
        ImageView imageView;
        boolean zIsSelected;
        qh2.a aVar2;
        c cVar;
        StyledTextView styledTextView;
        ViewPager viewPager;
        ImageView imageView2;
        int i16;
        if (i14 < this.f50604v) {
            c cVar2 = this.f50602r;
            oh2.a aVar3 = this.f50600p;
            if (cVar2 == null) {
                if (aVar3 == null) {
                    s.m("boundedControlsMenuDTO");
                    throw null;
                }
                c cVarB = aVar3.b(i14, aVar3.f132165b);
                this.f50602r = cVarB;
                if (cVarB == null && (i16 = this.f50606x) != i14 && i16 != 255) {
                    X9(i16);
                    this.f50606x = i14;
                }
                i15 = this.f50606x;
                if (i15 != 255 || i15 == i14 || !z14) {
                    if (i14 < this.f50604v) {
                        aVar = this.f50597m;
                        if (aVar == null) {
                            s.m("controlsMenuPreviewView");
                            throw null;
                        }
                        imageView = aVar.watchFaceIconImageViews[i14];
                        if (imageView != null) {
                            zIsSelected = imageView.isSelected();
                        } else {
                            zIsSelected = false;
                        }
                        if (zIsSelected) {
                            X9(i14);
                            return;
                        }
                        aVar2 = this.f50597m;
                        if (aVar2 == null) {
                            s.m("controlsMenuPreviewView");
                            throw null;
                        }
                        aVar2.j(i14, true);
                        this.f50606x = i14;
                        Y9(i14, this.f50602r);
                        cVar = this.f50602r;
                        if (!(cVar != null ? s.g(cVar.f132174c, Boolean.TRUE) : false)) {
                            viewPager = this.f50596l;
                            if (viewPager == null) {
                                s.m("controlMenuCarouselViewPager");
                                throw null;
                            }
                            viewPager.setAlpha(1.0f);
                            if (this.f50602r != null) {
                                imageView2 = this.f50603t;
                                if (imageView2 == null) {
                                    s.m("watchFaceCenterImageView");
                                    throw null;
                                }
                                imageView2.setEnabled(true);
                            }
                        }
                        styledTextView = this.f50598n;
                        if (styledTextView == null) {
                            s.m("tapALocationTextView");
                            throw null;
                        }
                        styledTextView.setText(getString(R.string.tap_to_new_location));
                        this.f50605w = i14;
                    }
                }
                int i17 = this.f50604v + 1;
                oh2.a aVar4 = this.f50600p;
                if (aVar4 == null) {
                    s.m("boundedControlsMenuDTO");
                    throw null;
                }
                c cVarB2 = aVar4.b(i15, aVar4.f132165b);
                if (cVarB2 != null) {
                    oh2.a aVar5 = this.f50600p;
                    if (aVar5 == null) {
                        s.m("boundedControlsMenuDTO");
                        throw null;
                    }
                    c cVarB3 = aVar5.b(i15, aVar5.f132165b);
                    if (cVarB3 != null) {
                        cVarB3.f132173b = i17;
                    }
                }
                if (i15 < i14) {
                    W9(i15 + 1, i14, true);
                } else {
                    W9(i15 - 1, i14, false);
                }
                if (cVarB2 != null) {
                    oh2.a aVar6 = this.f50600p;
                    if (aVar6 == null) {
                        s.m("boundedControlsMenuDTO");
                        throw null;
                    }
                    c cVarB4 = aVar6.b(i17, aVar6.f132165b);
                    if (cVarB4 != null) {
                        cVarB4.f132173b = i14;
                    }
                }
                qh2.a aVar7 = this.f50597m;
                if (aVar7 == null) {
                    s.m("controlsMenuPreviewView");
                    throw null;
                }
                int i18 = aVar7.noOfOptions;
                for (int i19 = 0; i19 < i18; i19++) {
                    ImageView imageView3 = aVar7.watchFaceIconImageViews[i19];
                    if (imageView3 != null) {
                        imageView3.setImageResource(2131231194);
                    }
                    ImageView imageView4 = aVar7.watchFaceIconImageViews[i19];
                    if (imageView4 != null) {
                        imageView4.setSelected(false);
                    }
                }
                T9();
                X9(i14);
                return;
            }
            if (aVar3 == null) {
                s.m("boundedControlsMenuDTO");
                throw null;
            }
            aVar3.b(i14, aVar3.f132165b);
            z14 = true;
            i15 = this.f50606x;
            if (i15 != 255) {
            }
            if (i14 < this.f50604v) {
                aVar = this.f50597m;
                if (aVar == null) {
                    s.m("controlsMenuPreviewView");
                    throw null;
                }
                imageView = aVar.watchFaceIconImageViews[i14];
                if (imageView != null) {
                    zIsSelected = imageView.isSelected();
                } else {
                    zIsSelected = false;
                }
                if (zIsSelected) {
                    X9(i14);
                    return;
                }
                aVar2 = this.f50597m;
                if (aVar2 == null) {
                    s.m("controlsMenuPreviewView");
                    throw null;
                }
                aVar2.j(i14, true);
                this.f50606x = i14;
                Y9(i14, this.f50602r);
                cVar = this.f50602r;
                if (!(cVar != null ? s.g(cVar.f132174c, Boolean.TRUE) : false)) {
                    viewPager = this.f50596l;
                    if (viewPager == null) {
                        s.m("controlMenuCarouselViewPager");
                        throw null;
                    }
                    viewPager.setAlpha(1.0f);
                    if (this.f50602r != null) {
                        imageView2 = this.f50603t;
                        if (imageView2 == null) {
                            s.m("watchFaceCenterImageView");
                            throw null;
                        }
                        imageView2.setEnabled(true);
                    }
                }
                styledTextView = this.f50598n;
                if (styledTextView == null) {
                    s.m("tapALocationTextView");
                    throw null;
                }
                styledTextView.setText(getString(R.string.tap_to_new_location));
                this.f50605w = i14;
            }
        }
        this.f50602r = null;
        z14 = false;
        i15 = this.f50606x;
        if (i15 != 255) {
        }
        if (i14 < this.f50604v) {
            aVar = this.f50597m;
            if (aVar == null) {
                s.m("controlsMenuPreviewView");
                throw null;
            }
            imageView = aVar.watchFaceIconImageViews[i14];
            if (imageView != null) {
                zIsSelected = imageView.isSelected();
            } else {
                zIsSelected = false;
            }
            if (zIsSelected) {
                X9(i14);
                return;
            }
            aVar2 = this.f50597m;
            if (aVar2 == null) {
                s.m("controlsMenuPreviewView");
                throw null;
            }
            aVar2.j(i14, true);
            this.f50606x = i14;
            Y9(i14, this.f50602r);
            cVar = this.f50602r;
            if (!(cVar != null ? s.g(cVar.f132174c, Boolean.TRUE) : false)) {
                viewPager = this.f50596l;
                if (viewPager == null) {
                    s.m("controlMenuCarouselViewPager");
                    throw null;
                }
                viewPager.setAlpha(1.0f);
                if (this.f50602r != null) {
                    imageView2 = this.f50603t;
                    if (imageView2 == null) {
                        s.m("watchFaceCenterImageView");
                        throw null;
                    }
                    imageView2.setEnabled(true);
                }
            }
            styledTextView = this.f50598n;
            if (styledTextView == null) {
                s.m("tapALocationTextView");
                throw null;
            }
            styledTextView.setText(getString(R.string.tap_to_new_location));
            this.f50605w = i14;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/controlsmenu/boundedcontrolsupport/presenter/BoundedControlsMenuActivity$a;", "", "<init>", "()V", "", "ENABLE_CAROUSEL", "F", "FADE_CAROUSEL", "", "NUMBER_OF_ICONS_PER_SCREEN", "I", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
