package bv2;

import am.e1;
import android.app.Dialog;
import android.companion.AssociationInfo;
import android.companion.CompanionDeviceManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.MacAddress;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import d53.w;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import ls0.v;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lbv2/k;", "Lfw2/a;", "Lvw2/b;", "Landroid/content/Context;", "ctx", "Lzw2/d;", "transform", "<init>", "(Landroid/content/Context;Lzw2/d;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Ldx2/c;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lzw2/d;Ldx2/c;Ljava/util/Map;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends fw2.a implements vw2.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f21507h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zw2.d f21508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cx2.h f21509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StyledTextView f21510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f21511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StyledTextView f21512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f21513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Dialog f21514g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.baseviews.custom.DeviceView$1$2", f = "DeviceView.kt", l = {117, 118, 119, 120, 121}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f21515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public gw2.e f21516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Drawable f21517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f21518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ zw2.g f21520f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Drawable f21521g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k f21522h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Fragment f21523i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zw2.g gVar, Drawable drawable, k kVar, Fragment fragment, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f21520f = gVar;
            this.f21521g = drawable;
            this.f21522h = kVar;
            this.f21523i = fragment;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f21520f, this.f21521g, this.f21522h, this.f21523i, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0086  */
        /* JADX WARN: Code duplicated, block: B:29:0x008e  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str;
            gw2.e eVar;
            Object objInvoke;
            gw2.e eVar2;
            String str2;
            Drawable drawable;
            Object objInvoke2;
            Drawable drawable2;
            gw2.e eVar3;
            String str3;
            Object objInvoke3;
            String str4;
            String str5;
            gw2.e eVar4;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f21519e;
            zw2.g gVar = this.f21520f;
            if (i14 == 0) {
                r.b(obj);
                e23.l<t13.d<? super String>, Object> lVar = ((zw2.g.a) gVar).f207283a;
                this.f21519e = 1;
                obj = lVar.invoke(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 == 2) {
                    str = this.f21515a;
                    r.b(obj);
                    eVar = (gw2.e) obj;
                    e23.l<t13.d<? super Drawable>, Object> lVar2 = ((zw2.g.a) gVar).f207284b;
                    this.f21515a = str;
                    this.f21516b = eVar;
                    this.f21519e = 3;
                    objInvoke = lVar2.invoke(this);
                    if (objInvoke != aVar) {
                        String str6 = str;
                        eVar2 = eVar;
                        obj = objInvoke;
                        str2 = str6;
                        drawable = (Drawable) obj;
                        if (drawable == null) {
                            drawable = this.f21521g;
                        }
                        e23.l<t13.d<? super String>, Object> lVar3 = ((zw2.g.a) gVar).f207286d;
                        this.f21515a = str2;
                        this.f21516b = eVar2;
                        this.f21517c = drawable;
                        this.f21519e = 4;
                        objInvoke2 = lVar3.invoke(this);
                        if (objInvoke2 != aVar) {
                            gw2.e eVar5 = eVar2;
                            drawable2 = drawable;
                            obj = objInvoke2;
                            eVar3 = eVar5;
                            str3 = (String) obj;
                            e23.l<t13.d<? super String>, Object> lVar4 = ((zw2.g.a) gVar).f207287e;
                            this.f21515a = str2;
                            this.f21516b = eVar3;
                            this.f21517c = drawable2;
                            this.f21518d = str3;
                            this.f21519e = 5;
                            objInvoke3 = lVar4.invoke(this);
                            if (objInvoke3 != aVar) {
                                gw2.e eVar6 = eVar3;
                                str4 = str3;
                                obj = objInvoke3;
                                str5 = str2;
                                eVar4 = eVar6;
                            }
                        }
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    eVar2 = this.f21516b;
                    str2 = this.f21515a;
                    r.b(obj);
                    drawable = (Drawable) obj;
                    if (drawable == null) {
                        drawable = this.f21521g;
                    }
                    e23.l<t13.d<? super String>, Object> lVar5 = ((zw2.g.a) gVar).f207286d;
                    this.f21515a = str2;
                    this.f21516b = eVar2;
                    this.f21517c = drawable;
                    this.f21519e = 4;
                    objInvoke2 = lVar5.invoke(this);
                    if (objInvoke2 != aVar) {
                        gw2.e eVar7 = eVar2;
                        drawable2 = drawable;
                        obj = objInvoke2;
                        eVar3 = eVar7;
                        str3 = (String) obj;
                        e23.l<t13.d<? super String>, Object> lVar6 = ((zw2.g.a) gVar).f207287e;
                        this.f21515a = str2;
                        this.f21516b = eVar3;
                        this.f21517c = drawable2;
                        this.f21518d = str3;
                        this.f21519e = 5;
                        objInvoke3 = lVar6.invoke(this);
                        if (objInvoke3 != aVar) {
                            gw2.e eVar8 = eVar3;
                            str4 = str3;
                            obj = objInvoke3;
                            str5 = str2;
                            eVar4 = eVar8;
                        }
                    }
                    return aVar;
                }
                if (i14 == 4) {
                    drawable2 = this.f21517c;
                    eVar3 = this.f21516b;
                    str2 = this.f21515a;
                    r.b(obj);
                    str3 = (String) obj;
                    e23.l<t13.d<? super String>, Object> lVar7 = ((zw2.g.a) gVar).f207287e;
                    this.f21515a = str2;
                    this.f21516b = eVar3;
                    this.f21517c = drawable2;
                    this.f21518d = str3;
                    this.f21519e = 5;
                    objInvoke3 = lVar7.invoke(this);
                    if (objInvoke3 != aVar) {
                        gw2.e eVar9 = eVar3;
                        str4 = str3;
                        obj = objInvoke3;
                        str5 = str2;
                        eVar4 = eVar9;
                    }
                    return aVar;
                }
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str7 = this.f21518d;
                drawable2 = this.f21517c;
                gw2.e eVar10 = this.f21516b;
                String str8 = this.f21515a;
                r.b(obj);
                eVar4 = eVar10;
                str5 = str8;
                str4 = str7;
            }
            String str9 = (String) obj;
            k kVar = this.f21522h;
            bb0.d dVar = new bb0.d(10, kVar, drawable2);
            int i15 = k.f21507h;
            kVar.k(this.f21523i, str5, str4, eVar4, str9, dVar, new bb1.a((byte) 0, 17));
            return Unit.INSTANCE;
            String str10 = (String) obj;
            e23.l<t13.d<? super gw2.e>, Object> lVar8 = ((zw2.g.a) gVar).f207285c;
            this.f21515a = str10;
            this.f21519e = 2;
            Object objInvoke4 = lVar8.invoke(this);
            if (objInvoke4 != aVar) {
                str = str10;
                obj = objInvoke4;
                eVar = (gw2.e) obj;
                e23.l<t13.d<? super Drawable>, Object> lVar9 = ((zw2.g.a) gVar).f207284b;
                this.f21515a = str;
                this.f21516b = eVar;
                this.f21519e = 3;
                objInvoke = lVar9.invoke(this);
                if (objInvoke != aVar) {
                    String str11 = str;
                    eVar2 = eVar;
                    obj = objInvoke;
                    str2 = str11;
                    drawable = (Drawable) obj;
                    if (drawable == null) {
                        drawable = this.f21521g;
                    }
                    e23.l<t13.d<? super String>, Object> lVar10 = ((zw2.g.a) gVar).f207286d;
                    this.f21515a = str2;
                    this.f21516b = eVar2;
                    this.f21517c = drawable;
                    this.f21519e = 4;
                    objInvoke2 = lVar10.invoke(this);
                    if (objInvoke2 != aVar) {
                        gw2.e eVar11 = eVar2;
                        drawable2 = drawable;
                        obj = objInvoke2;
                        eVar3 = eVar11;
                        str3 = (String) obj;
                        e23.l<t13.d<? super String>, Object> lVar11 = ((zw2.g.a) gVar).f207287e;
                        this.f21515a = str2;
                        this.f21516b = eVar3;
                        this.f21517c = drawable2;
                        this.f21518d = str3;
                        this.f21519e = 5;
                        objInvoke3 = lVar11.invoke(this);
                        if (objInvoke3 != aVar) {
                            gw2.e eVar12 = eVar3;
                            str4 = str3;
                            obj = objInvoke3;
                            str5 = str2;
                            eVar4 = eVar12;
                            String str12 = (String) obj;
                            k kVar2 = this.f21522h;
                            bb0.d dVar2 = new bb0.d(10, kVar2, drawable2);
                            int i16 = k.f21507h;
                            kVar2.k(this.f21523i, str5, str4, eVar4, str12, dVar2, new bb1.a((byte) 0, 17));
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
            return aVar;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21524a;

        static {
            int[] iArr = new int[gw2.e.values().length];
            try {
                iArr[gw2.e.NOT_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gw2.e.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21524a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f21525a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f21525a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f21525a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f21525a.invoke(obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(Fragment fragment, zw2.d dVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        dVar.getClass();
        cVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, dVar);
        dVar.i(this);
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new c(new e1(this, map, cVar, dVar, fragment, 1)));
        androidx.fragment.app.m mVarRequireActivity = fragment.requireActivity();
        mVarRequireActivity.getClass();
        ((dx2.b) new x1(mVarRequireActivity).b(s0.f105811a.b(dx2.b.class))).f61483a.f(fragment, new c(new i(this, fragment)));
        Context context = getContext();
        context.getClass();
        if (dw2.a.b(context)) {
            Context context2 = getContext();
            context2.getClass();
            int iA = (int) dw2.a.a(context2, getResources().getDimensionPixelSize(R.dimen.rts_standard_small_image_size), 2.0f);
            this.f21511d.getLayoutParams().width = iA;
            this.f21511d.getLayoutParams().height = iA;
        }
    }

    @Override // vw2.b
    public final void a() {
        this.f21508a.j();
        Dialog dialog = this.f21514g;
        if (dialog != null) {
            dialog.cancel();
        }
        this.f21514g = null;
    }

    @Override // vw2.b
    public final void b(String str) {
        gw2.e eVar;
        e23.p aVar;
        this.f21509b.getClass();
        gw2.e[] eVarArrValues = gw2.e.values();
        int length = eVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i14];
            if (s.g(eVar.name(), str)) {
                break;
            } else {
                i14++;
            }
        }
        if (eVar == null) {
            eVar = gw2.e.NOT_CONNECTED;
        }
        zw2.g gVarK = this.f21508a.k();
        if (gVarK == null || (aVar = ((zw2.g.b) gVarK).f207293f) == null) {
            aVar = new bb1.a((byte) 0, 16);
        }
        Context context = getContext();
        context.getClass();
        this.f21510c.setText((CharSequence) aVar.invoke(context, eVar));
        l(eVar);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0112  */
    /* JADX WARN: Code duplicated, block: B:64:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0121  */
    public final void k(Fragment fragment, String str, String str2, gw2.e eVar, String str3, e23.a<Unit> aVar, e23.p<? super Context, ? super gw2.e, String> pVar) {
        boolean zContains;
        boolean z14;
        String string;
        boolean z15;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        bv2.b bVarH = com.garmin.realtimesettings.app.initialization.b.a().h(str2, str);
        if (bVarH != null) {
            if (bVarH.f21465b.invoke(str2).booleanValue()) {
                View view2 = fragment.getView();
                if (view2 != null && (frameLayout = (FrameLayout) view2.findViewById(R.id.frag_device_link_banner)) != null) {
                    frameLayout.removeAllViews();
                }
            } else {
                View view3 = fragment.getView();
                if (view3 != null && (frameLayout2 = (FrameLayout) view3.findViewById(R.id.frag_device_link_banner)) != null) {
                    frameLayout2.addView(bVarH.f21464a.invoke());
                }
            }
        } else if (getContext() != null) {
            h.c cVar = h.f21485k;
            Context context = getContext();
            context.getClass();
            cVar.getClass();
            if (str2.length() == 0) {
                new cx2.h("DeviceLinkBanner", null, 2, null);
            } else {
                new cx2.a();
                if (cx2.a.a(context)) {
                    if (oa2.a.c(str2)) {
                        cx2.c cVar2 = new cx2.c();
                        CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) context.getSystemService(CompanionDeviceManager.class);
                        cx2.h hVar = cVar2.f56667a;
                        if (companionDeviceManager == null) {
                            hVar.getClass();
                        } else {
                            if (Build.VERSION.SDK_INT < 33 || !com.garmin.realtimesettings.app.initialization.b.f52597i) {
                                List<String> associations = companionDeviceManager.getAssociations();
                                associations.getClass();
                                associations.toString();
                                hVar.getClass();
                                zContains = associations.contains(str2);
                            } else {
                                List myAssociations = companionDeviceManager.getMyAssociations();
                                myAssociations.getClass();
                                myAssociations.toString();
                                hVar.getClass();
                                if (!myAssociations.isEmpty()) {
                                    Iterator it = myAssociations.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            AssociationInfo associationInfoB = v.b(it.next());
                                            MacAddress deviceMacAddress = associationInfoB.getDeviceMacAddress();
                                            if ((deviceMacAddress == null || (string = deviceMacAddress.toString()) == null) ? false : string.equalsIgnoreCase(str2)) {
                                                String deviceProfile = associationInfoB.getDeviceProfile();
                                                if (deviceProfile == null || w.J(deviceProfile)) {
                                                    z14 = false;
                                                } else {
                                                    z14 = true;
                                                }
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14) {
                                            }
                                        }
                                    }
                                }
                                zContains = false;
                            }
                            if (!zContains) {
                                z15 = true;
                            }
                        }
                        zContains = true;
                        if (!zContains) {
                            z15 = true;
                        }
                    }
                    if (z15) {
                        if (!(str3 != null || str3.length() == 0)) {
                            androidx.fragment.app.v childFragmentManager = fragment.getChildFragmentManager();
                            androidx.fragment.app.a aVarB = androidx.core.view.j.b(childFragmentManager, childFragmentManager);
                            h.f21485k.getClass();
                            str3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString("arg_mac_address", str2);
                            h hVar2 = new h(str3);
                            hVar2.setArguments(bundle);
                            aVarB.l(R.id.frag_device_link_banner, hVar2, h.f21486l);
                            aVarB.e();
                        }
                    }
                } else {
                    new cx2.h("DeviceLinkBanner", null, 2, null);
                }
            }
            z15 = false;
            if (z15) {
                if (!(str3 != null || str3.length() == 0)) {
                    androidx.fragment.app.v childFragmentManager2 = fragment.getChildFragmentManager();
                    androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(childFragmentManager2, childFragmentManager2);
                    h.f21485k.getClass();
                    str3.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("arg_mac_address", str2);
                    h hVar3 = new h(str3);
                    hVar3.setArguments(bundle2);
                    aVarB2.l(R.id.frag_device_link_banner, hVar3, h.f21486l);
                    aVarB2.e();
                }
            }
        }
        this.f21512e.setText(str);
        aVar.invoke();
        Context context2 = getContext();
        context2.getClass();
        this.f21510c.setText(pVar.invoke(context2, eVar));
        this.f21511d.setOnClickListener(new j(this, 0, fragment, str));
        l(eVar);
    }

    public final void l(gw2.e eVar) {
        int i14;
        eVar.name();
        this.f21509b.getClass();
        Dialog dialog = this.f21514g;
        if (dialog != null) {
            dialog.cancel();
        }
        int i15 = b.f21524a[eVar.ordinal()];
        if (i15 == 1) {
            i14 = 0;
        } else {
            if (i15 != 2) {
                u0.r();
                return;
            }
            i14 = 8;
        }
        this.f21511d.setVisibility(i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, zw2.d dVar) {
        super(context, null, 2, null);
        context.getClass();
        dVar.getClass();
        this.f21508a = dVar;
        this.f21509b = new cx2.h("DeviceView", null, 2, null);
        View.inflate(context, R.layout.rts_device_image_row, this);
        View viewFindViewById = findViewById(R.id.device_status);
        viewFindViewById.getClass();
        this.f21510c = (StyledTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.device_status_icon);
        viewFindViewById2.getClass();
        this.f21511d = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.device_name);
        viewFindViewById3.getClass();
        this.f21512e = (StyledTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.device_image);
        viewFindViewById4.getClass();
        this.f21513f = (AppCompatImageView) viewFindViewById4;
    }
}
