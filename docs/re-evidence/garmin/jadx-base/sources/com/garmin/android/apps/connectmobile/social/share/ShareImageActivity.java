package com.garmin.android.apps.connectmobile.social.share;

import am.r1;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.core.view.j;
import androidx.lifecycle.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w0;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.b0;
import c22.v0;
import ch.qos.logback.classic.spi.CallerData;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.badges.service.model.SimpleBadgeDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import d53.w;
import ds.n;
import e23.l;
import fw.p;
import i3.e5;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.apache.commons.io.FilenameUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import ps.q;
import ro1.c0;
import ro1.g0;
import ro1.l0;
import ro1.r;
import ro1.u;
import ro1.v;
import ro1.x;
import ro1.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/ShareImageActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lro1/r;", "Lcom/garmin/android/apps/connectmobile/social/share/b$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ShareImageActivity extends com.garmin.android.apps.connectmobile.c implements r, com.garmin.android.apps.connectmobile.social.share.b.InterfaceC0845b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f44607f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f44608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f44609b = n.f61014k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f44610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f44611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f44612e;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44613a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44613a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f44614a;

        public c(l lVar) {
            lVar.getClass();
            this.f44614a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f44614a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44614a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f44615a;

        public d(b.g gVar) {
            this.f44615a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f44615a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f44616a;

        public e(b.g gVar) {
            this.f44616a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44616a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f44618b;

        public f(e23.a aVar, b.g gVar) {
            this.f44617a = aVar;
            this.f44618b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44617a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44618b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f44619a;

        public g(b.g gVar) {
            this.f44619a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f44619a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f44620a;

        public h(b.g gVar) {
            this.f44620a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44620a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f44622b;

        public i(e23.a aVar, b.g gVar) {
            this.f44621a = aVar;
            this.f44622b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44621a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44622b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public ShareImageActivity() {
        d dVar = new d(this);
        t0 t0Var = s0.f105811a;
        this.f44611d = new w1(t0Var.b(u.class), new e(this), dVar, new f(null, this));
        this.f44612e = new w1(t0Var.b(bq0.l.class), new h(this), new g(this), new i(null, this));
    }

    @Override // ro1.r
    public final void E6() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "ShareImageActivity", "Get Images Storage Permission Declined: exit screen");
        finish();
    }

    @Override // ro1.r
    public final void O7(Uri uri) {
        uri.getClass();
        UCropImageActivity.a aVar = UCropImageActivity.f44623o;
        n nVar = this.f44609b;
        startActivityForResult(UCropImageActivity.a.a(aVar, this, uri, nVar.f61022f, nVar.f61023g, null, null, 0.0f, PsExtractor.VIDEO_STREAM_MASK), 2);
    }

    @Override // com.garmin.android.apps.connectmobile.social.share.b.InterfaceC0845b
    public final void i8(ro1.e eVar, Intent intent) {
        ro1.a aVarD;
        eVar.getClass();
        intent.getClass();
        ActivityInfo activityInfo = eVar.f153929a;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        g0.f153957a.getClass();
        intent.putExtra("android.intent.extra.TEXT", g0.d(this));
        q qVar = this.f44610c;
        if (qVar == null) {
            s.m("activityStatsBrief");
            throw null;
        }
        intent.putExtra("EXTRA_WEB_LINK", g0.a(String.valueOf(qVar.getActivityId())));
        g0.f(this, intent);
        String str = activityInfo.packageName;
        str.getClass();
        f12.l.f68084a.getClass();
        boolean zD4 = f12.l.a.a().D4();
        w1 w1Var = this.f44611d;
        if (!zD4) {
            u uVar = (u) w1Var.getValue();
            q qVar2 = this.f44610c;
            if (qVar2 == null) {
                s.m("activityStatsBrief");
                throw null;
            }
            m.a(v1.a(uVar).f183565a, new v(qVar2.getActivityId(), uVar, null), 2).f(this, new c(new rk0.n(10)));
        }
        n0 n0VarF = getSupportFragmentManager().F(R.id.content_frame);
        ro1.n nVar = n0VarF instanceof ro1.n ? (ro1.n) n0VarF : null;
        if (nVar != null) {
            u uVar2 = (u) w1Var.getValue();
            y0<ro1.b> y0Var = uVar2.f154017f;
            q qVar3 = this.f44610c;
            if (qVar3 == null) {
                s.m("activityStatsBrief");
                throw null;
            }
            List<com.garmin.android.apps.connectmobile.social.share.ui.b.C0849b> listR4 = nVar.R4();
            listR4.getClass();
            String activityTypeKey = qVar3.getActivityTypeKey();
            Bundle bundleD = b71.i.d("Type", "imageWithStats");
            bundleD.putString(NotificationConstants.KEY_DATA_MIME_TYPE, r1.f(qVar3.o()));
            bundleD.putString("typeKey", activityTypeKey);
            String strC = b0.c();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String upperCase = strC.toUpperCase(locale);
            upperCase.getClass();
            bundleD.putString("Country", upperCase);
            bundleD.putString("Target", str);
            ro1.b bVarD = y0Var.d();
            if (bVarD != null) {
                bundleD.putString("dataOption", bVarD.f153912c);
            }
            if (y0Var.d() != ro1.b.Default && (aVarD = uVar2.f154018g.d()) != null) {
                bundleD.putString("dataOptionColor", aVarD.f153902b);
            }
            bundleD.putLong("stickerCount", listR4.size());
            ht.a.f85464a.getClass();
            ht.a.a(bundleD, "Share_Activity");
            for (com.garmin.android.apps.connectmobile.social.share.ui.b.C0849b c0849b : listR4) {
                so1.e eVar2 = c0849b.f44731a;
                String strConcat = c0849b.f44732b;
                int i14 = u.b.f154023b[eVar2.ordinal()];
                if (i14 == 1) {
                    strConcat = "badge_".concat(strConcat);
                } else if (i14 == 2) {
                    strConcat = "device_".concat(strConcat);
                }
                ht.a aVar = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("stickerType", c0849b.f44731a.f160453a), new o13.p("stickerKey", strConcat));
                aVar.getClass();
                ht.a.a(bundleA, "SharedSticker");
            }
        }
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("android.intent.extra.STREAM") : null;
        Uri uri = obj instanceof Uri ? (Uri) obj : null;
        if (uri == null) {
            return;
        }
        bq0.l lVar = (bq0.l) this.f44612e.getValue();
        m.a(lVar.f19514a, new bq0.m(this, uri, lVar, null), 2).f(this, new c(new c0(this, 2)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        g3<Bitmap> g3VarA;
        Parcelable parcelable;
        if (i14 == 2) {
            if (i15 == -1) {
                Uri uri = null;
                if (intent != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) intent.getParcelableExtra("input_uri", Uri.class);
                    } else {
                        Parcelable parcelableExtra = intent.getParcelableExtra("input_uri");
                        parcelable = (Uri) (parcelableExtra instanceof Uri ? parcelableExtra : null);
                    }
                    uri = (Uri) parcelable;
                }
                y0<g3<Bitmap>> y0Var = ((u) this.f44611d.getValue()).f154021j;
                g0.f153957a.getClass();
                Bitmap bitmapB = g0.b(this, uri);
                if (bitmapB != null) {
                    g3.a aVar = g3.f35298f;
                    if (bitmapB.getWidth() < 512 || bitmapB.getHeight() < 512) {
                        bitmapB = Bitmap.createScaledBitmap(bitmapB, 512, 512, true);
                    }
                    bitmapB.getClass();
                    aVar.getClass();
                    g3VarA = g3.a.d(bitmapB);
                } else {
                    g3VarA = g3.a.a(g3.f35298f, "failed to fetch cropped image for uri", null, null, null, 14);
                }
                y0Var.m(g3VarA);
            } else {
                finish();
            }
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        String lowerCase;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_content_frame);
        final int i14 = 1;
        initActionBar(true);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("activity_stats_brief", q.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("activity_stats_brief");
                if (!(parcelable2 instanceof q)) {
                    parcelable2 = null;
                }
                parcelable = (q) parcelable2;
            }
            q qVar = (q) parcelable;
            if (qVar != null) {
                this.f44610c = qVar;
                Bundle extras2 = getIntent().getExtras();
                String string = extras2 != null ? extras2.getString("imageUrl") : null;
                if (string == null) {
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar.getClass();
                    i2.a.f(a2Var, "ShareImageActivity", "NULL Image Url extras input");
                    displayFailedMessage();
                    finish();
                    return;
                }
                Bundle extras3 = getIntent().getExtras();
                String string2 = extras3 != null ? extras3.getString("ratio") : null;
                n.a aVar2 = n.f61011h;
                if (string2 == null) {
                    string2 = n.f61014k.f61017a;
                }
                aVar2.getClass();
                n nVarA = n.a.a(string2);
                if (nVarA == null) {
                    nVarA = n.f61014k;
                }
                this.f44609b = nVarA;
                int i15 = v0.f23289a;
                String extension = FilenameUtils.getExtension(string);
                String strG0 = extension != null ? w.g0(extension, CallerData.NA) : null;
                if (strG0 != null) {
                    lowerCase = strG0.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                } else {
                    lowerCase = null;
                }
                final int i16 = 0;
                this.f44608a = lowerCase != null && lowerCase.equals("png");
                final int i17 = 2;
                if (TextUtils.isEmpty(string)) {
                    androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
                    androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
                    com.garmin.android.apps.connectmobile.social.share.f.f44683j.getClass();
                    aVarB.l(R.id.content_frame, new com.garmin.android.apps.connectmobile.social.share.f(), null);
                    aVarB.e();
                } else {
                    showProgressOverlay();
                    m.a(((bq0.l) this.f44612e.getValue()).f19514a, new bq0.q(new File(pi1.b.a(this, null), "temp_file"), this, string, null), 2).f(this, new c(new c0(this, i14)));
                }
                w1 w1Var = this.f44611d;
                final u uVar = (u) w1Var.getValue();
                q qVar2 = this.f44610c;
                if (qVar2 == null) {
                    s.m("activityStatsBrief");
                    throw null;
                }
                final ArrayList arrayList = new ArrayList();
                w0<g3<List<l0>>> w0Var = uVar.f154019h;
                w0Var.m(g3.a.c(g3.f35298f));
                w0Var.n(xy2.b.K(uVar, new x(qVar2, uVar, null)), new u.c(new l() { // from class: ro1.s
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i18 = i16;
                        int i19 = 10;
                        boolean z14 = false;
                        u uVar2 = uVar;
                        ArrayList arrayList2 = arrayList;
                        switch (i18) {
                            case 0:
                                g3 g3Var = (g3) obj;
                                int i24 = u.f154011k;
                                fw.p pVar = g3Var.f35300a;
                                T t7 = g3Var.f35301b;
                                int i25 = u.b.f154022a[pVar.ordinal()];
                                if (i25 == 1) {
                                    t7.getClass();
                                    List<SimpleBadgeDTO> list = (List) t7;
                                    if (!((Collection) t7).isEmpty()) {
                                        ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
                                        for (SimpleBadgeDTO simpleBadgeDTO : list) {
                                            so1.e eVar = so1.e.BADGE;
                                            String str = simpleBadgeDTO.f30531b;
                                            String str2 = simpleBadgeDTO.f30537h;
                                            str2.getClass();
                                            arrayList3.add(new l0(eVar, false, p13.w.c(new k0(str, str2))));
                                        }
                                        arrayList2.addAll(arrayList3);
                                        uVar2.z4(arrayList2);
                                    }
                                } else if (i25 == 2) {
                                    i2.a.h(i2.f36769a, "Failed to fetch badges from api: " + g3Var.f35302c);
                                } else {
                                    if (i25 != 3) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    i2.a aVar3 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar3.getClass();
                                    a2Var2.getClass();
                                    gt2.c.b(a2Var2.f28756a).info("fetchBadges: Loading not handled");
                                }
                                return Unit.INSTANCE;
                            case 1:
                                g3 g3Var2 = (g3) obj;
                                int i26 = u.f154011k;
                                int i27 = u.b.f154022a[g3Var2.f35300a.ordinal()];
                                if (i27 == 1) {
                                    T t14 = g3Var2.f35301b;
                                    t14.getClass();
                                    List<so1.d> list2 = (List) t14;
                                    if (!list2.isEmpty()) {
                                        String strB = GCMSettingManager.k().b();
                                        ArrayList arrayList4 = new ArrayList();
                                        for (so1.d dVar : list2) {
                                            List<so1.c> listA = dVar.a();
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            for (Object obj2 : listA) {
                                                Integer groupPriority = ((so1.c) obj2).getGroupPriority();
                                                Object arrayList5 = linkedHashMap.get(groupPriority);
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList();
                                                    linkedHashMap.put(groupPriority, arrayList5);
                                                }
                                                ((List) arrayList5).add(obj2);
                                            }
                                            Collection<List> collectionValues = linkedHashMap.values();
                                            ArrayList arrayList6 = new ArrayList(p13.y.r(collectionValues, i19));
                                            for (List list3 : collectionValues) {
                                                so1.e stickerType = dVar.getStickerType();
                                                Boolean timeLimited = ((so1.c) p13.h0.b0(list3)).getTimeLimited();
                                                boolean zBooleanValue = timeLimited != null ? timeLimited.booleanValue() : z14;
                                                ArrayList<so1.c> arrayList7 = new ArrayList();
                                                for (Object obj3 : list3) {
                                                    String stickerUrl = ((so1.c) obj3).getStickerUrl();
                                                    if (stickerUrl != null && !d53.w.J(stickerUrl)) {
                                                        arrayList7.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(p13.y.r(arrayList7, i19));
                                                for (so1.c cVar : arrayList7) {
                                                    arrayList8.add(new k0(cVar.getStickerKey(), e5.g(strB, "/", cVar.getStickerUrl())));
                                                }
                                                arrayList6.add(new l0(stickerType, zBooleanValue, arrayList8));
                                                i19 = 10;
                                                z14 = false;
                                            }
                                            ArrayList arrayList9 = new ArrayList();
                                            for (Object obj4 : arrayList6) {
                                                if (!((l0) obj4).f153988c.isEmpty()) {
                                                    arrayList9.add(obj4);
                                                }
                                            }
                                            p13.d0.v(arrayList4, arrayList9);
                                            i19 = 10;
                                            z14 = false;
                                        }
                                        arrayList2.addAll(arrayList4);
                                        uVar2.z4(arrayList2);
                                    }
                                } else if (i27 == 2) {
                                    i2.a.h(i2.f36769a, "Failed to fetch stickers from api: " + g3Var2.f35302c);
                                } else {
                                    if (i27 != 3) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    i2.a aVar4 = i2.f36769a;
                                    a2 a2Var3 = a2.GENERAL;
                                    aVar4.getClass();
                                    a2Var3.getClass();
                                    gt2.c.b(a2Var3.f28756a).info("fetchOnlineStickers: Loading not handled");
                                }
                                return Unit.INSTANCE;
                            default:
                                g3 g3Var3 = (g3) obj;
                                int i28 = u.f154011k;
                                fw.p pVar2 = g3Var3.f35300a;
                                T t15 = g3Var3.f35301b;
                                int i29 = u.b.f154022a[pVar2.ordinal()];
                                if (i29 == 1) {
                                    r80.b bVar = (r80.b) t15;
                                    String productDisplayName = bVar != null ? bVar.getProductDisplayName() : null;
                                    String imageUrl = bVar != null ? bVar.getImageUrl() : null;
                                    Collection collectionC = (imageUrl == null || d53.w.J(imageUrl)) ? p13.j0.f134944a : p13.w.c(new l0(so1.e.DEVICE, false, p13.w.c(new k0(productDisplayName, imageUrl))));
                                    if (!collectionC.isEmpty()) {
                                        arrayList2.addAll(collectionC);
                                        uVar2.z4(arrayList2);
                                    }
                                } else if (i29 == 2) {
                                    i2.a.h(i2.f36769a, "fetchActivityStickers failed, exception: " + g3Var3.f35303d);
                                } else {
                                    if (i29 != 3) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    i2.a aVar5 = i2.f36769a;
                                    a2 a2Var4 = a2.GENERAL;
                                    aVar5.getClass();
                                    a2Var4.getClass();
                                    gt2.c.b(a2Var4.f28756a).info("fetchActivityStickers: Loading not handled");
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }));
                w0Var.n(xy2.b.K(uVar, new y(this, qVar2, uVar, null)), new u.c(new l() { // from class: ro1.s
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i18 = i14;
                        int i19 = 10;
                        boolean z14 = false;
                        u uVar2 = uVar;
                        ArrayList arrayList2 = arrayList;
                        switch (i18) {
                            case 0:
                                g3 g3Var = (g3) obj;
                                int i24 = u.f154011k;
                                fw.p pVar = g3Var.f35300a;
                                T t7 = g3Var.f35301b;
                                int i25 = u.b.f154022a[pVar.ordinal()];
                                if (i25 == 1) {
                                    t7.getClass();
                                    List<SimpleBadgeDTO> list = (List) t7;
                                    if (!((Collection) t7).isEmpty()) {
                                        ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
                                        for (SimpleBadgeDTO simpleBadgeDTO : list) {
                                            so1.e eVar = so1.e.BADGE;
                                            String str = simpleBadgeDTO.f30531b;
                                            String str2 = simpleBadgeDTO.f30537h;
                                            str2.getClass();
                                            arrayList3.add(new l0(eVar, false, p13.w.c(new k0(str, str2))));
                                        }
                                        arrayList2.addAll(arrayList3);
                                        uVar2.z4(arrayList2);
                                    }
                                } else if (i25 == 2) {
                                    i2.a.h(i2.f36769a, "Failed to fetch badges from api: " + g3Var.f35302c);
                                } else {
                                    if (i25 != 3) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    i2.a aVar3 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar3.getClass();
                                    a2Var2.getClass();
                                    gt2.c.b(a2Var2.f28756a).info("fetchBadges: Loading not handled");
                                }
                                return Unit.INSTANCE;
                            case 1:
                                g3 g3Var2 = (g3) obj;
                                int i26 = u.f154011k;
                                int i27 = u.b.f154022a[g3Var2.f35300a.ordinal()];
                                if (i27 == 1) {
                                    T t14 = g3Var2.f35301b;
                                    t14.getClass();
                                    List<so1.d> list2 = (List) t14;
                                    if (!list2.isEmpty()) {
                                        String strB = GCMSettingManager.k().b();
                                        ArrayList arrayList4 = new ArrayList();
                                        for (so1.d dVar : list2) {
                                            List<so1.c> listA = dVar.a();
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            for (Object obj2 : listA) {
                                                Integer groupPriority = ((so1.c) obj2).getGroupPriority();
                                                Object arrayList5 = linkedHashMap.get(groupPriority);
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList();
                                                    linkedHashMap.put(groupPriority, arrayList5);
                                                }
                                                ((List) arrayList5).add(obj2);
                                            }
                                            Collection<List> collectionValues = linkedHashMap.values();
                                            ArrayList arrayList6 = new ArrayList(p13.y.r(collectionValues, i19));
                                            for (List list3 : collectionValues) {
                                                so1.e stickerType = dVar.getStickerType();
                                                Boolean timeLimited = ((so1.c) p13.h0.b0(list3)).getTimeLimited();
                                                boolean zBooleanValue = timeLimited != null ? timeLimited.booleanValue() : z14;
                                                ArrayList<so1.c> arrayList7 = new ArrayList();
                                                for (Object obj3 : list3) {
                                                    String stickerUrl = ((so1.c) obj3).getStickerUrl();
                                                    if (stickerUrl != null && !d53.w.J(stickerUrl)) {
                                                        arrayList7.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(p13.y.r(arrayList7, i19));
                                                for (so1.c cVar : arrayList7) {
                                                    arrayList8.add(new k0(cVar.getStickerKey(), e5.g(strB, "/", cVar.getStickerUrl())));
                                                }
                                                arrayList6.add(new l0(stickerType, zBooleanValue, arrayList8));
                                                i19 = 10;
                                                z14 = false;
                                            }
                                            ArrayList arrayList9 = new ArrayList();
                                            for (Object obj4 : arrayList6) {
                                                if (!((l0) obj4).f153988c.isEmpty()) {
                                                    arrayList9.add(obj4);
                                                }
                                            }
                                            p13.d0.v(arrayList4, arrayList9);
                                            i19 = 10;
                                            z14 = false;
                                        }
                                        arrayList2.addAll(arrayList4);
                                        uVar2.z4(arrayList2);
                                    }
                                } else if (i27 == 2) {
                                    i2.a.h(i2.f36769a, "Failed to fetch stickers from api: " + g3Var2.f35302c);
                                } else {
                                    if (i27 != 3) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    i2.a aVar4 = i2.f36769a;
                                    a2 a2Var3 = a2.GENERAL;
                                    aVar4.getClass();
                                    a2Var3.getClass();
                                    gt2.c.b(a2Var3.f28756a).info("fetchOnlineStickers: Loading not handled");
                                }
                                return Unit.INSTANCE;
                            default:
                                g3 g3Var3 = (g3) obj;
                                int i28 = u.f154011k;
                                fw.p pVar2 = g3Var3.f35300a;
                                T t15 = g3Var3.f35301b;
                                int i29 = u.b.f154022a[pVar2.ordinal()];
                                if (i29 == 1) {
                                    r80.b bVar = (r80.b) t15;
                                    String productDisplayName = bVar != null ? bVar.getProductDisplayName() : null;
                                    String imageUrl = bVar != null ? bVar.getImageUrl() : null;
                                    Collection collectionC = (imageUrl == null || d53.w.J(imageUrl)) ? p13.j0.f134944a : p13.w.c(new l0(so1.e.DEVICE, false, p13.w.c(new k0(productDisplayName, imageUrl))));
                                    if (!collectionC.isEmpty()) {
                                        arrayList2.addAll(collectionC);
                                        uVar2.z4(arrayList2);
                                    }
                                } else if (i29 == 2) {
                                    i2.a.h(i2.f36769a, "fetchActivityStickers failed, exception: " + g3Var3.f35303d);
                                } else {
                                    if (i29 != 3) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    i2.a aVar5 = i2.f36769a;
                                    a2 a2Var4 = a2.GENERAL;
                                    aVar5.getClass();
                                    a2Var4.getClass();
                                    gt2.c.b(a2Var4.f28756a).info("fetchActivityStickers: Loading not handled");
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }));
                w0Var.n(xy2.b.K(uVar, new ro1.w(qVar2.getActivityId(), uVar, null)), new u.c(new l() { // from class: ro1.s
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i18 = i17;
                        int i19 = 10;
                        boolean z14 = false;
                        u uVar2 = uVar;
                        ArrayList arrayList2 = arrayList;
                        switch (i18) {
                            case 0:
                                g3 g3Var = (g3) obj;
                                int i24 = u.f154011k;
                                fw.p pVar = g3Var.f35300a;
                                T t7 = g3Var.f35301b;
                                int i25 = u.b.f154022a[pVar.ordinal()];
                                if (i25 == 1) {
                                    t7.getClass();
                                    List<SimpleBadgeDTO> list = (List) t7;
                                    if (!((Collection) t7).isEmpty()) {
                                        ArrayList arrayList3 = new ArrayList(p13.y.r(list, 10));
                                        for (SimpleBadgeDTO simpleBadgeDTO : list) {
                                            so1.e eVar = so1.e.BADGE;
                                            String str = simpleBadgeDTO.f30531b;
                                            String str2 = simpleBadgeDTO.f30537h;
                                            str2.getClass();
                                            arrayList3.add(new l0(eVar, false, p13.w.c(new k0(str, str2))));
                                        }
                                        arrayList2.addAll(arrayList3);
                                        uVar2.z4(arrayList2);
                                    }
                                } else if (i25 == 2) {
                                    i2.a.h(i2.f36769a, "Failed to fetch badges from api: " + g3Var.f35302c);
                                } else {
                                    if (i25 != 3) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    i2.a aVar3 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar3.getClass();
                                    a2Var2.getClass();
                                    gt2.c.b(a2Var2.f28756a).info("fetchBadges: Loading not handled");
                                }
                                return Unit.INSTANCE;
                            case 1:
                                g3 g3Var2 = (g3) obj;
                                int i26 = u.f154011k;
                                int i27 = u.b.f154022a[g3Var2.f35300a.ordinal()];
                                if (i27 == 1) {
                                    T t14 = g3Var2.f35301b;
                                    t14.getClass();
                                    List<so1.d> list2 = (List) t14;
                                    if (!list2.isEmpty()) {
                                        String strB = GCMSettingManager.k().b();
                                        ArrayList arrayList4 = new ArrayList();
                                        for (so1.d dVar : list2) {
                                            List<so1.c> listA = dVar.a();
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            for (Object obj2 : listA) {
                                                Integer groupPriority = ((so1.c) obj2).getGroupPriority();
                                                Object arrayList5 = linkedHashMap.get(groupPriority);
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList();
                                                    linkedHashMap.put(groupPriority, arrayList5);
                                                }
                                                ((List) arrayList5).add(obj2);
                                            }
                                            Collection<List> collectionValues = linkedHashMap.values();
                                            ArrayList arrayList6 = new ArrayList(p13.y.r(collectionValues, i19));
                                            for (List list3 : collectionValues) {
                                                so1.e stickerType = dVar.getStickerType();
                                                Boolean timeLimited = ((so1.c) p13.h0.b0(list3)).getTimeLimited();
                                                boolean zBooleanValue = timeLimited != null ? timeLimited.booleanValue() : z14;
                                                ArrayList<so1.c> arrayList7 = new ArrayList();
                                                for (Object obj3 : list3) {
                                                    String stickerUrl = ((so1.c) obj3).getStickerUrl();
                                                    if (stickerUrl != null && !d53.w.J(stickerUrl)) {
                                                        arrayList7.add(obj3);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(p13.y.r(arrayList7, i19));
                                                for (so1.c cVar : arrayList7) {
                                                    arrayList8.add(new k0(cVar.getStickerKey(), e5.g(strB, "/", cVar.getStickerUrl())));
                                                }
                                                arrayList6.add(new l0(stickerType, zBooleanValue, arrayList8));
                                                i19 = 10;
                                                z14 = false;
                                            }
                                            ArrayList arrayList9 = new ArrayList();
                                            for (Object obj4 : arrayList6) {
                                                if (!((l0) obj4).f153988c.isEmpty()) {
                                                    arrayList9.add(obj4);
                                                }
                                            }
                                            p13.d0.v(arrayList4, arrayList9);
                                            i19 = 10;
                                            z14 = false;
                                        }
                                        arrayList2.addAll(arrayList4);
                                        uVar2.z4(arrayList2);
                                    }
                                } else if (i27 == 2) {
                                    i2.a.h(i2.f36769a, "Failed to fetch stickers from api: " + g3Var2.f35302c);
                                } else {
                                    if (i27 != 3) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    i2.a aVar4 = i2.f36769a;
                                    a2 a2Var3 = a2.GENERAL;
                                    aVar4.getClass();
                                    a2Var3.getClass();
                                    gt2.c.b(a2Var3.f28756a).info("fetchOnlineStickers: Loading not handled");
                                }
                                return Unit.INSTANCE;
                            default:
                                g3 g3Var3 = (g3) obj;
                                int i28 = u.f154011k;
                                fw.p pVar2 = g3Var3.f35300a;
                                T t15 = g3Var3.f35301b;
                                int i29 = u.b.f154022a[pVar2.ordinal()];
                                if (i29 == 1) {
                                    r80.b bVar = (r80.b) t15;
                                    String productDisplayName = bVar != null ? bVar.getProductDisplayName() : null;
                                    String imageUrl = bVar != null ? bVar.getImageUrl() : null;
                                    Collection collectionC = (imageUrl == null || d53.w.J(imageUrl)) ? p13.j0.f134944a : p13.w.c(new l0(so1.e.DEVICE, false, p13.w.c(new k0(productDisplayName, imageUrl))));
                                    if (!collectionC.isEmpty()) {
                                        arrayList2.addAll(collectionC);
                                        uVar2.z4(arrayList2);
                                    }
                                } else if (i29 == 2) {
                                    i2.a.h(i2.f36769a, "fetchActivityStickers failed, exception: " + g3Var3.f35303d);
                                } else {
                                    if (i29 != 3) {
                                        lc.u0.r();
                                        return null;
                                    }
                                    i2.a aVar5 = i2.f36769a;
                                    a2 a2Var4 = a2.GENERAL;
                                    aVar5.getClass();
                                    a2Var4.getClass();
                                    gt2.c.b(a2Var4.f28756a).info("fetchActivityStickers: Loading not handled");
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }));
                ((u) w1Var.getValue()).f154021j.f(this, new c(new c0(this, i16)));
                return;
            }
        }
        i2.a aVar3 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar3.getClass();
        i2.a.f(a2Var2, "ShareImageActivity", "NULL ActivitySummaryDTO extras input");
        displayFailedMessage();
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/ShareImageActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_CROP_IMAGE", "I", "GCM_TEMP_FILE", "IMAGE_URL", "RATIO", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
