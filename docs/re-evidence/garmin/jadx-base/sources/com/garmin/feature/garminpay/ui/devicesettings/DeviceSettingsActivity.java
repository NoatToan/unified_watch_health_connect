package com.garmin.feature.garminpay.ui.devicesettings;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.base.Optional;
import ds.e0;
import e23.l;
import java.util.Arrays;
import java.util.List;
import l30.i0;
import l30.y0;
import lc.u0;
import lr2.f;
import lr2.h;
import lr2.i;
import ms2.g;
import o13.p;
import o53.f0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p13.x;
import ps2.w;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/DeviceSettingsActivity;", "Lhn2/c;", "Lvq2/b;", "<init>", "()V", "a", "LinearLayoutManagerWrapper", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceSettingsActivity extends hn2.c implements vq2.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f51993w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Logger f51994x;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s03.a f51995g = new s03.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DeviceSettingsActivity f51996h = this;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public mr2.d f51997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qr2.a f51998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.garmin.feature.garminpay.ui.devicesettings.a f51999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f52000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f52001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e23.a<Unit> f52002n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j22.e f52003o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f.c<Intent> f52004p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f.c<Intent> f52005q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f.c<Intent> f52006r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f.c<Intent> f52007t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.garmin.feature.garminpay.ui.addcard.a f52008v;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/DeviceSettingsActivity$LinearLayoutManagerWrapper;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LinearLayoutManagerWrapper extends LinearLayoutManager {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinearLayoutManagerWrapper(Context context) {
            super(context);
            context.getClass();
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
        public final void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
            wVar.getClass();
            b0Var.getClass();
            try {
                super.onLayoutChildren(wVar, b0Var);
            } catch (IndexOutOfBoundsException e4) {
                DeviceSettingsActivity.f51994x.error("LinearLayoutManagerWrapper:", (Throwable) e4);
            }
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52010b;

        static {
            int[] iArr = new int[br2.g.values().length];
            try {
                iArr[br2.g.PAY_ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[br2.g.PENDING_ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[br2.g.SUSPENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[br2.g.SUSPENDED_BY_ISSUER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[br2.g.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[br2.g.PENDING_VERIFICATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[br2.g.DISABLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[br2.g.PAY_NOT_ENABLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[br2.g.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[br2.g.NEW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[br2.g.ELIGIBLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[br2.g.ADD_CARD_TO_DEVICE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f52009a = iArr;
            int[] iArr2 = new int[is2.b.values().length];
            try {
                iArr2[is2.b.UNION_PAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[is2.b.FITPAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            f52010b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/devicesettings/DeviceSettingsActivity$c", "Landroidx/lifecycle/x1$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f52011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f52012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f52013c;

        public c(long j8, String str, String str2) {
            this.f52011a = j8;
            this.f52012b = str;
            this.f52013c = str2;
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            return new mr2.c(this.f52011a, this.f52012b, this.f52013c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements l<com.garmin.feature.garminpay.ui.devicesettings.a.d, Unit> {
        public d(Object obj) {
            super(1, obj, DeviceSettingsActivity.class, "onAdapterItemClick", "onAdapterItemClick(Lcom/garmin/feature/garminpay/ui/devicesettings/DeviceDetailsAdapter$ItemClick;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.l
        public final Unit invoke(com.garmin.feature.garminpay.ui.devicesettings.a.d dVar) {
            com.garmin.feature.garminpay.ui.devicesettings.a.d dVar2 = dVar;
            dVar2.getClass();
            DeviceSettingsActivity deviceSettingsActivity = (DeviceSettingsActivity) this.receiver;
            a aVar = DeviceSettingsActivity.f51993w;
            deviceSettingsActivity.getClass();
            j22.e eVar = deviceSettingsActivity.f52003o;
            int i14 = 17;
            byte b14 = 0;
            int i15 = 1;
            Object[] objArr = 0;
            if (dVar2 instanceof com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a) {
                mr2.d dVar3 = deviceSettingsActivity.f51997i;
                if (dVar3 == null) {
                    s.m("deviceSettingsViewModel");
                    throw null;
                }
                if (dVar3.c1().d() == js2.e.LOCKED_WALLET) {
                    deviceSettingsActivity.fa();
                } else {
                    mr2.d dVar4 = deviceSettingsActivity.f51997i;
                    if (dVar4 == null) {
                        s.m("deviceSettingsViewModel");
                        throw null;
                    }
                    if (dVar4.c1().d() == js2.e.BLOCKED_WALLET) {
                        String string = deviceSettingsActivity.getString(R.string.wallet_reset_wallet_confirm);
                        string.getClass();
                        String string2 = deviceSettingsActivity.getString(R.string.wallet_change_passcode_lbl);
                        string2.getClass();
                        String string3 = deviceSettingsActivity.getString(R.string.wallet_locked_title);
                        string3.getClass();
                        x0 x0Var = x0.f105818a;
                        String string4 = deviceSettingsActivity.getString(R.string.wallet_locked_message);
                        string4.getClass();
                        mr2.d dVar5 = deviceSettingsActivity.f51997i;
                        if (dVar5 == null) {
                            s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, deviceSettingsActivity, string3, String.format(string4, Arrays.copyOf(new Object[]{dVar5.getDeviceName()}, 1)), new p(string, new f(deviceSettingsActivity, b14)), new p(string2, new f(deviceSettingsActivity, i15)), null, false, 224);
                        if (eVarQ != null) {
                            eVarQ.show();
                        }
                    } else if (deviceSettingsActivity.ca()) {
                        deviceSettingsActivity.f52002n = new i0(i14, deviceSettingsActivity, new h(deviceSettingsActivity, objArr == true ? 1 : 0, b14));
                        eVar.a();
                    } else {
                        br2.c.f19585a.m(deviceSettingsActivity);
                    }
                }
            } else if (dVar2 instanceof com.garmin.feature.garminpay.ui.devicesettings.a.d.g) {
                deviceSettingsActivity.f52002n = new i0(i14, deviceSettingsActivity, new lr2.d(deviceSettingsActivity, 5));
                eVar.a();
            } else if (dVar2 instanceof com.garmin.feature.garminpay.ui.devicesettings.a.d.b) {
                com.garmin.feature.garminpay.ui.devicesettings.a.d.b bVar = (com.garmin.feature.garminpay.ui.devicesettings.a.d.b) dVar2;
                vr2.q qVar = bVar.f52096a;
                if (!bVar.f52098c) {
                    br2.g gVar = qVar.f179659f;
                    switch (gVar == null ? -1 : b.f52009a[gVar.ordinal()]) {
                        case -1:
                            DeviceSettingsActivity.f51994x.debug("DeviceDetailsAdapter.ItemClick.CardItem: deviceWalletItemAssociationState is null");
                            break;
                        case 0:
                        default:
                            u0.r();
                            return null;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            deviceSettingsActivity.da(qVar);
                            break;
                        case 8:
                            fs2.a aVar2 = qVar.f179658e;
                            if (!deviceSettingsActivity.ca()) {
                                br2.c.f19585a.m(deviceSettingsActivity);
                            } else {
                                deviceSettingsActivity.f52002n = new i0(i14, deviceSettingsActivity, new h(deviceSettingsActivity, aVar2, b14));
                                eVar.a();
                            }
                            break;
                        case 9:
                            br2.c cVar = br2.c.f19585a;
                            lr2.d dVar6 = new lr2.d(deviceSettingsActivity, i15);
                            cVar.getClass();
                            String string5 = deviceSettingsActivity.getString(R.string.wallet_add_unknown_unionpay_card_title);
                            string5.getClass();
                            String string6 = deviceSettingsActivity.getString(R.string.wallet_add_unknown_unionpay_card_message);
                            string6.getClass();
                            String string7 = deviceSettingsActivity.getString(R.string.wallet_go_to_wallet);
                            string7.getClass();
                            String string8 = deviceSettingsActivity.getString(R.string.lbl_cancel);
                            string8.getClass();
                            androidx.appcompat.app.e eVarQ2 = br2.c.q(cVar, deviceSettingsActivity, string5, string6, new p(string7, new a61.d(dVar6, 20)), new p(string8, new bb1.a(b14, 9)), null, false, 224);
                            if (eVarQ2 != null) {
                                eVarQ2.setCancelable(false);
                            }
                            if (eVarQ2 != null) {
                                eVarQ2.show();
                            }
                            break;
                        case 10:
                        case 11:
                            hn2.c.ba(deviceSettingsActivity, Boolean.FALSE, null, null, 14);
                            deviceSettingsActivity.da(qVar);
                            break;
                        case 12:
                            break;
                    }
                } else {
                    is2.b bVar2 = qVar.f179660g;
                    g gVarA = bVar2 != null ? w.f140538a.a(bVar2) : null;
                    deviceSettingsActivity.f52000l = gVarA;
                    if (gVarA != null && gVarA.m(qVar.f179658e)) {
                        String str = qVar.f179654a;
                        i0 i0Var = new i0(15, deviceSettingsActivity, dVar2);
                        String string9 = deviceSettingsActivity.getString(R.string.lbl_remove);
                        string9.getClass();
                        String string10 = deviceSettingsActivity.getString(R.string.lbl_cancel);
                        string10.getClass();
                        String string11 = deviceSettingsActivity.getString(R.string.wallet_remove_card);
                        string11.getClass();
                        x0 x0Var2 = x0.f105818a;
                        String string12 = deviceSettingsActivity.getString(R.string.wallet_remove_card_confirmation_message);
                        string12.getClass();
                        if (str == null) {
                            str = "";
                        }
                        androidx.appcompat.app.e eVarQ3 = br2.c.q(br2.c.f19585a, deviceSettingsActivity, string11, String.format(string12, Arrays.copyOf(new Object[]{str}, 1)), new p(string9, new y0(10, deviceSettingsActivity, i0Var)), new p(string10, new lr.a(28)), null, false, 224);
                        if (eVarQ3 != null) {
                            eVarQ3.show();
                        }
                    }
                }
            } else if (dVar2 instanceof com.garmin.feature.garminpay.ui.devicesettings.a.d.c) {
                mr2.d dVar7 = deviceSettingsActivity.f51997i;
                if (dVar7 == null) {
                    s.m("deviceSettingsViewModel");
                    throw null;
                }
                js2.e eVarD = dVar7.c1().d();
                js2.e eVar2 = js2.e.LOCKED_WALLET;
                if (eVarD == eVar2) {
                    deviceSettingsActivity.fa();
                } else {
                    mr2.d dVar8 = deviceSettingsActivity.f51997i;
                    if (dVar8 == null) {
                        s.m("deviceSettingsViewModel");
                        throw null;
                    }
                    if (dVar8.c1().d() == eVar2) {
                        deviceSettingsActivity.fa();
                    } else {
                        deviceSettingsActivity.f52002n = new lr2.d(deviceSettingsActivity, 4);
                        eVar.a();
                    }
                }
            } else if (dVar2 instanceof com.garmin.feature.garminpay.ui.devicesettings.a.d.f) {
                LostWatchActivity.a aVar3 = LostWatchActivity.f52015j;
                mr2.d dVar9 = deviceSettingsActivity.f51997i;
                if (dVar9 == null) {
                    s.m("deviceSettingsViewModel");
                    throw null;
                }
                Long lValueOf = Long.valueOf(dVar9.getDeviceUnitId());
                mr2.d dVar10 = deviceSettingsActivity.f51997i;
                if (dVar10 == null) {
                    s.m("deviceSettingsViewModel");
                    throw null;
                }
                String deviceImageUrl = dVar10.getDeviceImageUrl();
                mr2.d dVar11 = deviceSettingsActivity.f51997i;
                if (dVar11 == null) {
                    s.m("deviceSettingsViewModel");
                    throw null;
                }
                String deviceName = dVar11.getDeviceName();
                aVar3.getClass();
                Intent intent = new Intent(deviceSettingsActivity, (Class<?>) LostWatchActivity.class);
                intent.putExtra("device.unit.id", lValueOf);
                intent.putExtra("device.image.url", deviceImageUrl);
                intent.putExtra("device.name", deviceName);
                intent.setFlags(536870912);
                oc.b.K(deviceSettingsActivity, qy2.d.f148594a, intent);
            } else if (dVar2 instanceof com.garmin.feature.garminpay.ui.devicesettings.a.d.C1095d) {
                deviceSettingsActivity.ia(new lr2.d(deviceSettingsActivity, 6));
            } else {
                if (!(dVar2 instanceof com.garmin.feature.garminpay.ui.devicesettings.a.d.e)) {
                    u0.r();
                    return null;
                }
                deviceSettingsActivity.ia(new lr2.d(deviceSettingsActivity, 3));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f52014a;

        public e(l lVar) {
            lVar.getClass();
            this.f52014a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f52014a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52014a.invoke(obj);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f51994x = gt2.b.f79005a.h("PAY#DeviceSettingsActivity");
    }

    public DeviceSettingsActivity() {
        j22.e.a aVar = j22.e.f96744g;
        String name = f51994x.getName();
        name.getClass();
        lr2.d dVar = new lr2.d(this, 0);
        lr2.d dVar2 = new lr2.d(this, 2);
        aVar.getClass();
        this.f52003o = j22.e.a.a(name, dVar, dVar2, null);
        final int i14 = 0;
        this.f52004p = registerForActivityResult(new g.h(), new f.b(this) { // from class: lr2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceSettingsActivity f114392b;

            {
                this.f114392b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                int i15 = i14;
                DeviceSettingsActivity deviceSettingsActivity = this.f114392b;
                f.a aVar2 = (f.a) obj;
                switch (i15) {
                    case 0:
                        DeviceSettingsActivity.a aVar3 = DeviceSettingsActivity.f51993w;
                        aVar2.getClass();
                        Logger logger = DeviceSettingsActivity.f51994x;
                        int i16 = aVar2.f67585a;
                        z.i("changePasscodeActivityLauncher: resultCode=", i16, logger);
                        if (i16 != -1) {
                            if (i16 == 0) {
                                mr2.d dVar3 = deviceSettingsActivity.f51997i;
                                if (dVar3 != null) {
                                    dVar3.Y();
                                    return;
                                } else {
                                    p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                    throw null;
                                }
                            }
                            if (i16 != 11) {
                                return;
                            }
                            mr2.d dVar4 = deviceSettingsActivity.f51997i;
                            if (dVar4 == null) {
                                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                throw null;
                            }
                            dVar4.Y();
                            deviceSettingsActivity.ga();
                            return;
                        }
                        mr2.d dVar5 = deviceSettingsActivity.f51997i;
                        if (dVar5 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        dVar5.Y();
                        x0 x0Var = x0.f105818a;
                        String string = deviceSettingsActivity.getString(R.string.passcode_changed_message_lbl);
                        string.getClass();
                        mr2.d dVar6 = deviceSettingsActivity.f51997i;
                        if (dVar6 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        String str = String.format(string, Arrays.copyOf(new Object[]{dVar6.getDeviceName()}, 1));
                        View view2 = deviceSettingsActivity.f52001m;
                        if (view2 == null) {
                            p005kotlin.jvm.internal.s.m("contentFrame");
                            throw null;
                        }
                        Snackbar snackbarMake = Snackbar.make(view2, str, 0);
                        snackbarMake.getClass();
                        v22.c.a(snackbarMake);
                        snackbarMake.show();
                        return;
                    default:
                        DeviceSettingsActivity.a aVar4 = DeviceSettingsActivity.f51993w;
                        aVar2.getClass();
                        Logger logger2 = DeviceSettingsActivity.f51994x;
                        int i17 = aVar2.f67585a;
                        z.i("deviceSelectionActivityLauncher: resultCode=", i17, logger2);
                        if (i17 != -1 || (intent = aVar2.f67586b) == null) {
                            return;
                        }
                        long longExtra = intent.getLongExtra("device.unit.id", -1L);
                        String stringExtra = intent.getStringExtra("device.name");
                        if (longExtra == -1 || stringExtra == null) {
                            vb.h.z("");
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable = (Parcelable) intent.getParcelableExtra("extra.wallet.item", qs2.d.class);
                        } else {
                            Parcelable parcelableExtra = intent.getParcelableExtra("extra.wallet.item");
                            if (!(parcelableExtra instanceof qs2.d)) {
                                parcelableExtra = null;
                            }
                            parcelable = (qs2.d) parcelableExtra;
                        }
                        qs2.d dVar7 = (qs2.d) parcelable;
                        com.garmin.feature.garminpay.ui.addcard.a aVar5 = deviceSettingsActivity.f52008v;
                        mr2.d dVar8 = deviceSettingsActivity.f51997i;
                        if (dVar8 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        ns2.a<ms2.e> aVarD = dVar8.g4().d();
                        if (aVarD == null) {
                            aVarD = gg.b.q(false);
                        }
                        aVar5.c(longExtra, stringExtra, aVarD, dVar7);
                        return;
                }
            }
        });
        final int i15 = 1;
        this.f52005q = registerForActivityResult(new g.h(), new f.b(this) { // from class: lr2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceSettingsActivity f114392b;

            {
                this.f114392b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                Parcelable parcelable;
                int i16 = i15;
                DeviceSettingsActivity deviceSettingsActivity = this.f114392b;
                f.a aVar2 = (f.a) obj;
                switch (i16) {
                    case 0:
                        DeviceSettingsActivity.a aVar3 = DeviceSettingsActivity.f51993w;
                        aVar2.getClass();
                        Logger logger = DeviceSettingsActivity.f51994x;
                        int i17 = aVar2.f67585a;
                        z.i("changePasscodeActivityLauncher: resultCode=", i17, logger);
                        if (i17 != -1) {
                            if (i17 == 0) {
                                mr2.d dVar3 = deviceSettingsActivity.f51997i;
                                if (dVar3 != null) {
                                    dVar3.Y();
                                    return;
                                } else {
                                    p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                    throw null;
                                }
                            }
                            if (i17 != 11) {
                                return;
                            }
                            mr2.d dVar4 = deviceSettingsActivity.f51997i;
                            if (dVar4 == null) {
                                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                throw null;
                            }
                            dVar4.Y();
                            deviceSettingsActivity.ga();
                            return;
                        }
                        mr2.d dVar5 = deviceSettingsActivity.f51997i;
                        if (dVar5 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        dVar5.Y();
                        x0 x0Var = x0.f105818a;
                        String string = deviceSettingsActivity.getString(R.string.passcode_changed_message_lbl);
                        string.getClass();
                        mr2.d dVar6 = deviceSettingsActivity.f51997i;
                        if (dVar6 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        String str = String.format(string, Arrays.copyOf(new Object[]{dVar6.getDeviceName()}, 1));
                        View view2 = deviceSettingsActivity.f52001m;
                        if (view2 == null) {
                            p005kotlin.jvm.internal.s.m("contentFrame");
                            throw null;
                        }
                        Snackbar snackbarMake = Snackbar.make(view2, str, 0);
                        snackbarMake.getClass();
                        v22.c.a(snackbarMake);
                        snackbarMake.show();
                        return;
                    default:
                        DeviceSettingsActivity.a aVar4 = DeviceSettingsActivity.f51993w;
                        aVar2.getClass();
                        Logger logger2 = DeviceSettingsActivity.f51994x;
                        int i18 = aVar2.f67585a;
                        z.i("deviceSelectionActivityLauncher: resultCode=", i18, logger2);
                        if (i18 != -1 || (intent = aVar2.f67586b) == null) {
                            return;
                        }
                        long longExtra = intent.getLongExtra("device.unit.id", -1L);
                        String stringExtra = intent.getStringExtra("device.name");
                        if (longExtra == -1 || stringExtra == null) {
                            vb.h.z("");
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable = (Parcelable) intent.getParcelableExtra("extra.wallet.item", qs2.d.class);
                        } else {
                            Parcelable parcelableExtra = intent.getParcelableExtra("extra.wallet.item");
                            if (!(parcelableExtra instanceof qs2.d)) {
                                parcelableExtra = null;
                            }
                            parcelable = (qs2.d) parcelableExtra;
                        }
                        qs2.d dVar7 = (qs2.d) parcelable;
                        com.garmin.feature.garminpay.ui.addcard.a aVar5 = deviceSettingsActivity.f52008v;
                        mr2.d dVar8 = deviceSettingsActivity.f51997i;
                        if (dVar8 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        ns2.a<ms2.e> aVarD = dVar8.g4().d();
                        if (aVarD == null) {
                            aVarD = gg.b.q(false);
                        }
                        aVar5.c(longExtra, stringExtra, aVarD, dVar7);
                        return;
                }
            }
        });
        this.f52006r = registerForActivityResult(new g.h(), new b50.h(1));
        this.f52007t = registerForActivityResult(new g.h(), new b50.h(2));
        this.f52008v = new com.garmin.feature.garminpay.ui.addcard.a(this);
    }

    @Override // vq2.d, vq2.c
    /* JADX INFO: renamed from: M */
    public final hn2.c getF52032a() {
        return this.f51996h;
    }

    public final boolean ca() {
        mr2.d dVar = this.f51997i;
        if (dVar == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        ns2.a<ms2.e> aVarD = dVar.g4().d();
        if (aVarD != null) {
            return (aVarD.f127816b && aVarD.isEmpty()) ? false : true;
        }
        return false;
    }

    public final void da(vr2.q qVar) {
        is2.b bVar = qVar.f179660g;
        if (bVar != null) {
            g gVarA = w.f140538a.a(bVar);
            Intent intentE = gVarA != null ? gVarA.e(qVar.f179658e) : null;
            if (intentE != null) {
                int i14 = b.f52010b[qVar.f179660g.ordinal()];
                if (i14 == 1) {
                    oc.b.L(this, qy2.d.f148594a, intentE, this.f52006r);
                    return;
                } else if (i14 != 2) {
                    oc.b.K(this, qy2.d.f148594a, intentE);
                    return;
                } else {
                    oc.b.L(this, qy2.d.f148594a, intentE, this.f52007t);
                    return;
                }
            }
        }
        e0.v("Failed to navigate to card details for ", qVar.f179654a, f51994x);
    }

    public final boolean ea() {
        List listK = x.k(js2.e.PASSCODE_SET, js2.e.BLOCKED_WALLET, js2.e.LOCKED_WALLET);
        mr2.d dVar = this.f51997i;
        if (dVar == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        if (!h0.R(listK, dVar.c1().d())) {
            return false;
        }
        mr2.d dVar2 = this.f51997i;
        if (dVar2 != null) {
            return dVar2.l1();
        }
        s.m("deviceSettingsViewModel");
        throw null;
    }

    public final void fa() {
        String string = getString(R.string.wallet_locked_title);
        string.getClass();
        x0 x0Var = x0.f105818a;
        String string2 = getString(R.string.wallet_locked_short_message);
        string2.getClass();
        mr2.d dVar = this.f51997i;
        if (dVar == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        String str = String.format(string2, Arrays.copyOf(new Object[]{dVar.getDeviceName()}, 1));
        String string3 = getString(R.string.lbl_cancel);
        string3.getClass();
        String string4 = getString(R.string.wallet_reset_wallet);
        string4.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, this, string, str, new p(string4, new f(this, 2)), new p(string3, new lr.a(29)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final void ga() {
        String string = getString(R.string.wallet_reset_message_lbl);
        string.getClass();
        mr2.d dVar = this.f51997i;
        if (dVar == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        String str = String.format(string, Arrays.copyOf(new Object[]{dVar.getDeviceName()}, 1));
        View view2 = this.f52001m;
        if (view2 == null) {
            s.m("contentFrame");
            throw null;
        }
        Snackbar snackbarMake = Snackbar.make(view2, str, 0);
        snackbarMake.getClass();
        v22.c.a(snackbarMake);
        snackbarMake.show();
    }

    public final void ha(qs2.d dVar) {
        CardDestinationSelectionActivity.a aVar = CardDestinationSelectionActivity.f52143n;
        mr2.d dVar2 = this.f51997i;
        if (dVar2 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        ns2.a<ms2.e> aVarD = dVar2.g4().d();
        aVarD.getClass();
        ns2.a<ms2.e> aVar2 = aVarD;
        mr2.d dVar3 = this.f51997i;
        if (dVar3 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        long deviceUnitId = dVar3.getDeviceUnitId();
        aVar.getClass();
        this.f52005q.a(CardDestinationSelectionActivity.a.a(this, aVar2, deviceUnitId, dVar), null);
    }

    public final void ia(e23.a aVar) {
        ge1.b.T(f0.w(this), null, null, new lr2.l(this, aVar, null), 3);
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getString(R.string.common_conjunct_ampersand_2, getString(R.string.wallet_concept), getString(R.string.wallet_garmin_pay));
        string.getClass();
        R9(R.layout.layout_simple_recycler_view, hn2.c.a.BACK, string);
        View viewFindViewById = findViewById(R.id.content_frame);
        viewFindViewById.getClass();
        this.f52001m = viewFindViewById;
        hn2.c.ba(this, Boolean.TRUE, null, null, 14);
        long longExtra = getIntent().getLongExtra("device.unit.id", 0L);
        mr2.d dVar = (mr2.d) new ry2.d(this, new x1(this, new c(longExtra, getIntent().getStringExtra("device.image.url"), getIntent().getStringExtra("device.name")))).f155186a.a(mr2.d.class, mr2.c.class);
        this.f51997i = dVar;
        if (dVar == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        dVar.h();
        qr2.a aVar = (qr2.a) new ry2.d(this, new x1(this)).f155186a.a(qr2.a.class, qr2.e.class);
        this.f51998j = aVar;
        if (aVar == null) {
            s.m("resetWalletViewModel");
            throw null;
        }
        aVar.J2(longExtra);
        mr2.d dVar2 = this.f51997i;
        if (dVar2 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        long deviceUnitId = dVar2.getDeviceUnitId();
        mr2.d dVar3 = this.f51997i;
        if (dVar3 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        this.f51999k = new com.garmin.feature.garminpay.ui.devicesettings.a(this, deviceUnitId, dVar3.getDeviceName(), false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.generic_recycler_view);
        com.garmin.feature.garminpay.ui.devicesettings.a aVar2 = this.f51999k;
        if (aVar2 == null) {
            s.m("deviceSettingsAdapter");
            throw null;
        }
        recyclerView.setAdapter(aVar2);
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(this));
        recyclerView.setHasFixedSize(true);
        RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
        androidx.recyclerview.widget.h0 h0Var = itemAnimator instanceof androidx.recyclerview.widget.h0 ? (androidx.recyclerview.widget.h0) itemAnimator : null;
        if (h0Var != null) {
            h0Var.f10476g = false;
        }
        mr2.d dVar4 = this.f51997i;
        if (dVar4 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        final int i14 = 7;
        dVar4.g4().f(this, new e(new l(this) { // from class: lr2.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceSettingsActivity f114388b;

            {
                this.f114388b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                DeviceSettingsActivity deviceSettingsActivity = this.f114388b;
                switch (i15) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("isLoading.onChanged: " + bool);
                        hn2.c.ba(deviceSettingsActivity, bool, null, null, 14);
                        return Unit.INSTANCE;
                    case 1:
                        mr2.b bVar = (mr2.b) obj;
                        Logger logger = DeviceSettingsActivity.f51994x;
                        logger.debug("associatedCardsModel.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar3 = deviceSettingsActivity.f51999k;
                        if (aVar3 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar5 = deviceSettingsActivity.f51997i;
                        if (dVar5 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH4 = dVar5.h4();
                        mr2.d dVar6 = deviceSettingsActivity.f51997i;
                        if (dVar6 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD = dVar6.y2().d();
                        hs2.c cVarOrNull = optionalD != null ? optionalD.orNull() : null;
                        Boolean boolValueOf = Boolean.valueOf(deviceSettingsActivity.ca());
                        boolean zEa = deviceSettingsActivity.ea();
                        mr2.d dVar7 = deviceSettingsActivity.f51997i;
                        if (dVar7 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.b bVarU = aVar3.u(bVar, fVarH4, cVarOrNull, boolValueOf, zEa, dVar7.c1().d());
                        aVar3.f52068g = bVarU;
                        aVar3.t(bVarU.f52071c);
                        logger.debug("createAdapterState");
                        mr2.d dVar8 = deviceSettingsActivity.f51997i;
                        if (dVar8 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        dVar8.B();
                        mr2.d dVar9 = deviceSettingsActivity.f51997i;
                        if (dVar9 != null) {
                            dVar9.l();
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    case 2:
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar4 = deviceSettingsActivity.f51999k;
                        if (aVar4 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar10 = deviceSettingsActivity.f51997i;
                        if (dVar10 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH5 = dVar10.h4();
                        mr2.d dVar11 = deviceSettingsActivity.f51997i;
                        if (dVar11 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD2 = dVar11.y2().d();
                        hs2.c cVarOrNull2 = optionalD2 != null ? optionalD2.orNull() : null;
                        boolean zCa = deviceSettingsActivity.ca();
                        boolean zEa2 = deviceSettingsActivity.ea();
                        mr2.d dVar12 = deviceSettingsActivity.f51997i;
                        if (dVar12 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar4, fVarH5, cVarOrNull2, zCa, zEa2, dVar12.c1().d());
                        DeviceSettingsActivity.f51994x.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 3:
                        Logger logger2 = DeviceSettingsActivity.f51994x;
                        logger2.debug("walletPasscodeState.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar5 = deviceSettingsActivity.f51999k;
                        if (aVar5 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar13 = deviceSettingsActivity.f51997i;
                        if (dVar13 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH6 = dVar13.h4();
                        mr2.d dVar14 = deviceSettingsActivity.f51997i;
                        if (dVar14 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD3 = dVar14.y2().d();
                        hs2.c cVarOrNull3 = optionalD3 != null ? optionalD3.orNull() : null;
                        boolean zCa2 = deviceSettingsActivity.ca();
                        boolean zEa3 = deviceSettingsActivity.ea();
                        mr2.d dVar15 = deviceSettingsActivity.f51997i;
                        if (dVar15 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar5, fVarH6, cVarOrNull3, zCa2, zEa3, dVar15.c1().d());
                        logger2.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 4:
                        Optional optional = (Optional) obj;
                        Logger logger3 = DeviceSettingsActivity.f51994x;
                        logger3.debug("walletExpressCard.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar6 = deviceSettingsActivity.f51999k;
                        if (aVar6 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar16 = deviceSettingsActivity.f51997i;
                        if (dVar16 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH7 = dVar16.h4();
                        hs2.c cVar = (hs2.c) optional.orNull();
                        boolean zCa3 = deviceSettingsActivity.ca();
                        boolean zEa4 = deviceSettingsActivity.ea();
                        mr2.d dVar17 = deviceSettingsActivity.f51997i;
                        if (dVar17 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar6, fVarH7, cVar, zCa3, zEa4, dVar17.c1().d());
                        logger3.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("wasWalletResetSuccessful=" + bool2);
                        if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                            mr2.d dVar18 = deviceSettingsActivity.f51997i;
                            if (dVar18 == null) {
                                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                throw null;
                            }
                            dVar18.Y();
                            deviceSettingsActivity.ga();
                        } else {
                            br2.c.f19585a.g(null, deviceSettingsActivity);
                        }
                        hn2.c.ba(deviceSettingsActivity, Boolean.FALSE, null, null, 14);
                        return Unit.INSTANCE;
                    case 6:
                        DeviceSettingsActivity.a aVar7 = DeviceSettingsActivity.f51993w;
                        hn2.c.ba(deviceSettingsActivity, (Boolean) obj, null, null, 14);
                        return Unit.INSTANCE;
                    default:
                        DeviceSettingsActivity.f51994x.debug("operators.onChanged: " + ((ns2.a) obj));
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar8 = deviceSettingsActivity.f51999k;
                        if (aVar8 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar19 = deviceSettingsActivity.f51997i;
                        if (dVar19 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH8 = dVar19.h4();
                        mr2.d dVar20 = deviceSettingsActivity.f51997i;
                        if (dVar20 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD4 = dVar20.y2().d();
                        hs2.c cVarOrNull4 = optionalD4 != null ? optionalD4.orNull() : null;
                        boolean zCa4 = deviceSettingsActivity.ca();
                        boolean zEa5 = deviceSettingsActivity.ea();
                        mr2.d dVar21 = deviceSettingsActivity.f51997i;
                        if (dVar21 != null) {
                            com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar8, fVarH8, cVarOrNull4, zCa4, zEa5, dVar21.c1().d());
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                }
            }
        }));
        mr2.d dVar5 = this.f51997i;
        if (dVar5 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        final int i15 = 0;
        dVar5.isLoading().f(this, new e(new l(this) { // from class: lr2.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceSettingsActivity f114388b;

            {
                this.f114388b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                DeviceSettingsActivity deviceSettingsActivity = this.f114388b;
                switch (i16) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("isLoading.onChanged: " + bool);
                        hn2.c.ba(deviceSettingsActivity, bool, null, null, 14);
                        return Unit.INSTANCE;
                    case 1:
                        mr2.b bVar = (mr2.b) obj;
                        Logger logger = DeviceSettingsActivity.f51994x;
                        logger.debug("associatedCardsModel.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar3 = deviceSettingsActivity.f51999k;
                        if (aVar3 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar6 = deviceSettingsActivity.f51997i;
                        if (dVar6 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH4 = dVar6.h4();
                        mr2.d dVar7 = deviceSettingsActivity.f51997i;
                        if (dVar7 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD = dVar7.y2().d();
                        hs2.c cVarOrNull = optionalD != null ? optionalD.orNull() : null;
                        Boolean boolValueOf = Boolean.valueOf(deviceSettingsActivity.ca());
                        boolean zEa = deviceSettingsActivity.ea();
                        mr2.d dVar8 = deviceSettingsActivity.f51997i;
                        if (dVar8 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.b bVarU = aVar3.u(bVar, fVarH4, cVarOrNull, boolValueOf, zEa, dVar8.c1().d());
                        aVar3.f52068g = bVarU;
                        aVar3.t(bVarU.f52071c);
                        logger.debug("createAdapterState");
                        mr2.d dVar9 = deviceSettingsActivity.f51997i;
                        if (dVar9 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        dVar9.B();
                        mr2.d dVar10 = deviceSettingsActivity.f51997i;
                        if (dVar10 != null) {
                            dVar10.l();
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    case 2:
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar4 = deviceSettingsActivity.f51999k;
                        if (aVar4 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar11 = deviceSettingsActivity.f51997i;
                        if (dVar11 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH5 = dVar11.h4();
                        mr2.d dVar12 = deviceSettingsActivity.f51997i;
                        if (dVar12 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD2 = dVar12.y2().d();
                        hs2.c cVarOrNull2 = optionalD2 != null ? optionalD2.orNull() : null;
                        boolean zCa = deviceSettingsActivity.ca();
                        boolean zEa2 = deviceSettingsActivity.ea();
                        mr2.d dVar13 = deviceSettingsActivity.f51997i;
                        if (dVar13 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar4, fVarH5, cVarOrNull2, zCa, zEa2, dVar13.c1().d());
                        DeviceSettingsActivity.f51994x.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 3:
                        Logger logger2 = DeviceSettingsActivity.f51994x;
                        logger2.debug("walletPasscodeState.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar5 = deviceSettingsActivity.f51999k;
                        if (aVar5 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar14 = deviceSettingsActivity.f51997i;
                        if (dVar14 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH6 = dVar14.h4();
                        mr2.d dVar15 = deviceSettingsActivity.f51997i;
                        if (dVar15 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD3 = dVar15.y2().d();
                        hs2.c cVarOrNull3 = optionalD3 != null ? optionalD3.orNull() : null;
                        boolean zCa2 = deviceSettingsActivity.ca();
                        boolean zEa3 = deviceSettingsActivity.ea();
                        mr2.d dVar16 = deviceSettingsActivity.f51997i;
                        if (dVar16 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar5, fVarH6, cVarOrNull3, zCa2, zEa3, dVar16.c1().d());
                        logger2.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 4:
                        Optional optional = (Optional) obj;
                        Logger logger3 = DeviceSettingsActivity.f51994x;
                        logger3.debug("walletExpressCard.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar6 = deviceSettingsActivity.f51999k;
                        if (aVar6 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar17 = deviceSettingsActivity.f51997i;
                        if (dVar17 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH7 = dVar17.h4();
                        hs2.c cVar = (hs2.c) optional.orNull();
                        boolean zCa3 = deviceSettingsActivity.ca();
                        boolean zEa4 = deviceSettingsActivity.ea();
                        mr2.d dVar18 = deviceSettingsActivity.f51997i;
                        if (dVar18 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar6, fVarH7, cVar, zCa3, zEa4, dVar18.c1().d());
                        logger3.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("wasWalletResetSuccessful=" + bool2);
                        if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                            mr2.d dVar19 = deviceSettingsActivity.f51997i;
                            if (dVar19 == null) {
                                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                throw null;
                            }
                            dVar19.Y();
                            deviceSettingsActivity.ga();
                        } else {
                            br2.c.f19585a.g(null, deviceSettingsActivity);
                        }
                        hn2.c.ba(deviceSettingsActivity, Boolean.FALSE, null, null, 14);
                        return Unit.INSTANCE;
                    case 6:
                        DeviceSettingsActivity.a aVar7 = DeviceSettingsActivity.f51993w;
                        hn2.c.ba(deviceSettingsActivity, (Boolean) obj, null, null, 14);
                        return Unit.INSTANCE;
                    default:
                        DeviceSettingsActivity.f51994x.debug("operators.onChanged: " + ((ns2.a) obj));
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar8 = deviceSettingsActivity.f51999k;
                        if (aVar8 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar110 = deviceSettingsActivity.f51997i;
                        if (dVar110 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH8 = dVar110.h4();
                        mr2.d dVar20 = deviceSettingsActivity.f51997i;
                        if (dVar20 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD4 = dVar20.y2().d();
                        hs2.c cVarOrNull4 = optionalD4 != null ? optionalD4.orNull() : null;
                        boolean zCa4 = deviceSettingsActivity.ca();
                        boolean zEa5 = deviceSettingsActivity.ea();
                        mr2.d dVar21 = deviceSettingsActivity.f51997i;
                        if (dVar21 != null) {
                            com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar8, fVarH8, cVarOrNull4, zCa4, zEa5, dVar21.c1().d());
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                }
            }
        }));
        mr2.d dVar6 = this.f51997i;
        if (dVar6 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        dVar6.n().f(this, new e(new bb2.b(longExtra, this, 7)));
        mr2.d dVar7 = this.f51997i;
        if (dVar7 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        final int i16 = 1;
        dVar7.r4().f(this, new e(new l(this) { // from class: lr2.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceSettingsActivity f114388b;

            {
                this.f114388b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                DeviceSettingsActivity deviceSettingsActivity = this.f114388b;
                switch (i17) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("isLoading.onChanged: " + bool);
                        hn2.c.ba(deviceSettingsActivity, bool, null, null, 14);
                        return Unit.INSTANCE;
                    case 1:
                        mr2.b bVar = (mr2.b) obj;
                        Logger logger = DeviceSettingsActivity.f51994x;
                        logger.debug("associatedCardsModel.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar3 = deviceSettingsActivity.f51999k;
                        if (aVar3 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar8 = deviceSettingsActivity.f51997i;
                        if (dVar8 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH4 = dVar8.h4();
                        mr2.d dVar9 = deviceSettingsActivity.f51997i;
                        if (dVar9 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD = dVar9.y2().d();
                        hs2.c cVarOrNull = optionalD != null ? optionalD.orNull() : null;
                        Boolean boolValueOf = Boolean.valueOf(deviceSettingsActivity.ca());
                        boolean zEa = deviceSettingsActivity.ea();
                        mr2.d dVar10 = deviceSettingsActivity.f51997i;
                        if (dVar10 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.b bVarU = aVar3.u(bVar, fVarH4, cVarOrNull, boolValueOf, zEa, dVar10.c1().d());
                        aVar3.f52068g = bVarU;
                        aVar3.t(bVarU.f52071c);
                        logger.debug("createAdapterState");
                        mr2.d dVar11 = deviceSettingsActivity.f51997i;
                        if (dVar11 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        dVar11.B();
                        mr2.d dVar12 = deviceSettingsActivity.f51997i;
                        if (dVar12 != null) {
                            dVar12.l();
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    case 2:
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar4 = deviceSettingsActivity.f51999k;
                        if (aVar4 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar13 = deviceSettingsActivity.f51997i;
                        if (dVar13 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH5 = dVar13.h4();
                        mr2.d dVar14 = deviceSettingsActivity.f51997i;
                        if (dVar14 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD2 = dVar14.y2().d();
                        hs2.c cVarOrNull2 = optionalD2 != null ? optionalD2.orNull() : null;
                        boolean zCa = deviceSettingsActivity.ca();
                        boolean zEa2 = deviceSettingsActivity.ea();
                        mr2.d dVar15 = deviceSettingsActivity.f51997i;
                        if (dVar15 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar4, fVarH5, cVarOrNull2, zCa, zEa2, dVar15.c1().d());
                        DeviceSettingsActivity.f51994x.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 3:
                        Logger logger2 = DeviceSettingsActivity.f51994x;
                        logger2.debug("walletPasscodeState.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar5 = deviceSettingsActivity.f51999k;
                        if (aVar5 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar16 = deviceSettingsActivity.f51997i;
                        if (dVar16 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH6 = dVar16.h4();
                        mr2.d dVar17 = deviceSettingsActivity.f51997i;
                        if (dVar17 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD3 = dVar17.y2().d();
                        hs2.c cVarOrNull3 = optionalD3 != null ? optionalD3.orNull() : null;
                        boolean zCa2 = deviceSettingsActivity.ca();
                        boolean zEa3 = deviceSettingsActivity.ea();
                        mr2.d dVar18 = deviceSettingsActivity.f51997i;
                        if (dVar18 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar5, fVarH6, cVarOrNull3, zCa2, zEa3, dVar18.c1().d());
                        logger2.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 4:
                        Optional optional = (Optional) obj;
                        Logger logger3 = DeviceSettingsActivity.f51994x;
                        logger3.debug("walletExpressCard.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar6 = deviceSettingsActivity.f51999k;
                        if (aVar6 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar19 = deviceSettingsActivity.f51997i;
                        if (dVar19 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH7 = dVar19.h4();
                        hs2.c cVar = (hs2.c) optional.orNull();
                        boolean zCa3 = deviceSettingsActivity.ca();
                        boolean zEa4 = deviceSettingsActivity.ea();
                        mr2.d dVar110 = deviceSettingsActivity.f51997i;
                        if (dVar110 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar6, fVarH7, cVar, zCa3, zEa4, dVar110.c1().d());
                        logger3.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("wasWalletResetSuccessful=" + bool2);
                        if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                            mr2.d dVar111 = deviceSettingsActivity.f51997i;
                            if (dVar111 == null) {
                                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                throw null;
                            }
                            dVar111.Y();
                            deviceSettingsActivity.ga();
                        } else {
                            br2.c.f19585a.g(null, deviceSettingsActivity);
                        }
                        hn2.c.ba(deviceSettingsActivity, Boolean.FALSE, null, null, 14);
                        return Unit.INSTANCE;
                    case 6:
                        DeviceSettingsActivity.a aVar7 = DeviceSettingsActivity.f51993w;
                        hn2.c.ba(deviceSettingsActivity, (Boolean) obj, null, null, 14);
                        return Unit.INSTANCE;
                    default:
                        DeviceSettingsActivity.f51994x.debug("operators.onChanged: " + ((ns2.a) obj));
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar8 = deviceSettingsActivity.f51999k;
                        if (aVar8 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar112 = deviceSettingsActivity.f51997i;
                        if (dVar112 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH8 = dVar112.h4();
                        mr2.d dVar20 = deviceSettingsActivity.f51997i;
                        if (dVar20 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD4 = dVar20.y2().d();
                        hs2.c cVarOrNull4 = optionalD4 != null ? optionalD4.orNull() : null;
                        boolean zCa4 = deviceSettingsActivity.ca();
                        boolean zEa5 = deviceSettingsActivity.ea();
                        mr2.d dVar21 = deviceSettingsActivity.f51997i;
                        if (dVar21 != null) {
                            com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar8, fVarH8, cVarOrNull4, zCa4, zEa5, dVar21.c1().d());
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                }
            }
        }));
        mr2.d dVar8 = this.f51997i;
        if (dVar8 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        final int i17 = 2;
        dVar8.p4().f(this, new e(new l(this) { // from class: lr2.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceSettingsActivity f114388b;

            {
                this.f114388b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                DeviceSettingsActivity deviceSettingsActivity = this.f114388b;
                switch (i18) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("isLoading.onChanged: " + bool);
                        hn2.c.ba(deviceSettingsActivity, bool, null, null, 14);
                        return Unit.INSTANCE;
                    case 1:
                        mr2.b bVar = (mr2.b) obj;
                        Logger logger = DeviceSettingsActivity.f51994x;
                        logger.debug("associatedCardsModel.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar3 = deviceSettingsActivity.f51999k;
                        if (aVar3 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar9 = deviceSettingsActivity.f51997i;
                        if (dVar9 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH4 = dVar9.h4();
                        mr2.d dVar10 = deviceSettingsActivity.f51997i;
                        if (dVar10 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD = dVar10.y2().d();
                        hs2.c cVarOrNull = optionalD != null ? optionalD.orNull() : null;
                        Boolean boolValueOf = Boolean.valueOf(deviceSettingsActivity.ca());
                        boolean zEa = deviceSettingsActivity.ea();
                        mr2.d dVar11 = deviceSettingsActivity.f51997i;
                        if (dVar11 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.b bVarU = aVar3.u(bVar, fVarH4, cVarOrNull, boolValueOf, zEa, dVar11.c1().d());
                        aVar3.f52068g = bVarU;
                        aVar3.t(bVarU.f52071c);
                        logger.debug("createAdapterState");
                        mr2.d dVar12 = deviceSettingsActivity.f51997i;
                        if (dVar12 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        dVar12.B();
                        mr2.d dVar13 = deviceSettingsActivity.f51997i;
                        if (dVar13 != null) {
                            dVar13.l();
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    case 2:
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar4 = deviceSettingsActivity.f51999k;
                        if (aVar4 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar14 = deviceSettingsActivity.f51997i;
                        if (dVar14 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH5 = dVar14.h4();
                        mr2.d dVar15 = deviceSettingsActivity.f51997i;
                        if (dVar15 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD2 = dVar15.y2().d();
                        hs2.c cVarOrNull2 = optionalD2 != null ? optionalD2.orNull() : null;
                        boolean zCa = deviceSettingsActivity.ca();
                        boolean zEa2 = deviceSettingsActivity.ea();
                        mr2.d dVar16 = deviceSettingsActivity.f51997i;
                        if (dVar16 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar4, fVarH5, cVarOrNull2, zCa, zEa2, dVar16.c1().d());
                        DeviceSettingsActivity.f51994x.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 3:
                        Logger logger2 = DeviceSettingsActivity.f51994x;
                        logger2.debug("walletPasscodeState.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar5 = deviceSettingsActivity.f51999k;
                        if (aVar5 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar17 = deviceSettingsActivity.f51997i;
                        if (dVar17 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH6 = dVar17.h4();
                        mr2.d dVar18 = deviceSettingsActivity.f51997i;
                        if (dVar18 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD3 = dVar18.y2().d();
                        hs2.c cVarOrNull3 = optionalD3 != null ? optionalD3.orNull() : null;
                        boolean zCa2 = deviceSettingsActivity.ca();
                        boolean zEa3 = deviceSettingsActivity.ea();
                        mr2.d dVar19 = deviceSettingsActivity.f51997i;
                        if (dVar19 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar5, fVarH6, cVarOrNull3, zCa2, zEa3, dVar19.c1().d());
                        logger2.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 4:
                        Optional optional = (Optional) obj;
                        Logger logger3 = DeviceSettingsActivity.f51994x;
                        logger3.debug("walletExpressCard.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar6 = deviceSettingsActivity.f51999k;
                        if (aVar6 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar110 = deviceSettingsActivity.f51997i;
                        if (dVar110 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH7 = dVar110.h4();
                        hs2.c cVar = (hs2.c) optional.orNull();
                        boolean zCa3 = deviceSettingsActivity.ca();
                        boolean zEa4 = deviceSettingsActivity.ea();
                        mr2.d dVar111 = deviceSettingsActivity.f51997i;
                        if (dVar111 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar6, fVarH7, cVar, zCa3, zEa4, dVar111.c1().d());
                        logger3.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("wasWalletResetSuccessful=" + bool2);
                        if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                            mr2.d dVar112 = deviceSettingsActivity.f51997i;
                            if (dVar112 == null) {
                                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                throw null;
                            }
                            dVar112.Y();
                            deviceSettingsActivity.ga();
                        } else {
                            br2.c.f19585a.g(null, deviceSettingsActivity);
                        }
                        hn2.c.ba(deviceSettingsActivity, Boolean.FALSE, null, null, 14);
                        return Unit.INSTANCE;
                    case 6:
                        DeviceSettingsActivity.a aVar7 = DeviceSettingsActivity.f51993w;
                        hn2.c.ba(deviceSettingsActivity, (Boolean) obj, null, null, 14);
                        return Unit.INSTANCE;
                    default:
                        DeviceSettingsActivity.f51994x.debug("operators.onChanged: " + ((ns2.a) obj));
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar8 = deviceSettingsActivity.f51999k;
                        if (aVar8 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar113 = deviceSettingsActivity.f51997i;
                        if (dVar113 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH8 = dVar113.h4();
                        mr2.d dVar20 = deviceSettingsActivity.f51997i;
                        if (dVar20 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD4 = dVar20.y2().d();
                        hs2.c cVarOrNull4 = optionalD4 != null ? optionalD4.orNull() : null;
                        boolean zCa4 = deviceSettingsActivity.ca();
                        boolean zEa5 = deviceSettingsActivity.ea();
                        mr2.d dVar21 = deviceSettingsActivity.f51997i;
                        if (dVar21 != null) {
                            com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar8, fVarH8, cVarOrNull4, zCa4, zEa5, dVar21.c1().d());
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                }
            }
        }));
        mr2.d dVar9 = this.f51997i;
        if (dVar9 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        final int i18 = 3;
        dVar9.c1().f(this, new e(new l(this) { // from class: lr2.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceSettingsActivity f114388b;

            {
                this.f114388b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i18;
                DeviceSettingsActivity deviceSettingsActivity = this.f114388b;
                switch (i19) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("isLoading.onChanged: " + bool);
                        hn2.c.ba(deviceSettingsActivity, bool, null, null, 14);
                        return Unit.INSTANCE;
                    case 1:
                        mr2.b bVar = (mr2.b) obj;
                        Logger logger = DeviceSettingsActivity.f51994x;
                        logger.debug("associatedCardsModel.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar3 = deviceSettingsActivity.f51999k;
                        if (aVar3 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar10 = deviceSettingsActivity.f51997i;
                        if (dVar10 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH4 = dVar10.h4();
                        mr2.d dVar11 = deviceSettingsActivity.f51997i;
                        if (dVar11 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD = dVar11.y2().d();
                        hs2.c cVarOrNull = optionalD != null ? optionalD.orNull() : null;
                        Boolean boolValueOf = Boolean.valueOf(deviceSettingsActivity.ca());
                        boolean zEa = deviceSettingsActivity.ea();
                        mr2.d dVar12 = deviceSettingsActivity.f51997i;
                        if (dVar12 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.b bVarU = aVar3.u(bVar, fVarH4, cVarOrNull, boolValueOf, zEa, dVar12.c1().d());
                        aVar3.f52068g = bVarU;
                        aVar3.t(bVarU.f52071c);
                        logger.debug("createAdapterState");
                        mr2.d dVar13 = deviceSettingsActivity.f51997i;
                        if (dVar13 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        dVar13.B();
                        mr2.d dVar14 = deviceSettingsActivity.f51997i;
                        if (dVar14 != null) {
                            dVar14.l();
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    case 2:
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar4 = deviceSettingsActivity.f51999k;
                        if (aVar4 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar15 = deviceSettingsActivity.f51997i;
                        if (dVar15 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH5 = dVar15.h4();
                        mr2.d dVar16 = deviceSettingsActivity.f51997i;
                        if (dVar16 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD2 = dVar16.y2().d();
                        hs2.c cVarOrNull2 = optionalD2 != null ? optionalD2.orNull() : null;
                        boolean zCa = deviceSettingsActivity.ca();
                        boolean zEa2 = deviceSettingsActivity.ea();
                        mr2.d dVar17 = deviceSettingsActivity.f51997i;
                        if (dVar17 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar4, fVarH5, cVarOrNull2, zCa, zEa2, dVar17.c1().d());
                        DeviceSettingsActivity.f51994x.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 3:
                        Logger logger2 = DeviceSettingsActivity.f51994x;
                        logger2.debug("walletPasscodeState.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar5 = deviceSettingsActivity.f51999k;
                        if (aVar5 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar18 = deviceSettingsActivity.f51997i;
                        if (dVar18 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH6 = dVar18.h4();
                        mr2.d dVar19 = deviceSettingsActivity.f51997i;
                        if (dVar19 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD3 = dVar19.y2().d();
                        hs2.c cVarOrNull3 = optionalD3 != null ? optionalD3.orNull() : null;
                        boolean zCa2 = deviceSettingsActivity.ca();
                        boolean zEa3 = deviceSettingsActivity.ea();
                        mr2.d dVar110 = deviceSettingsActivity.f51997i;
                        if (dVar110 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar5, fVarH6, cVarOrNull3, zCa2, zEa3, dVar110.c1().d());
                        logger2.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 4:
                        Optional optional = (Optional) obj;
                        Logger logger3 = DeviceSettingsActivity.f51994x;
                        logger3.debug("walletExpressCard.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar6 = deviceSettingsActivity.f51999k;
                        if (aVar6 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar111 = deviceSettingsActivity.f51997i;
                        if (dVar111 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH7 = dVar111.h4();
                        hs2.c cVar = (hs2.c) optional.orNull();
                        boolean zCa3 = deviceSettingsActivity.ca();
                        boolean zEa4 = deviceSettingsActivity.ea();
                        mr2.d dVar112 = deviceSettingsActivity.f51997i;
                        if (dVar112 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar6, fVarH7, cVar, zCa3, zEa4, dVar112.c1().d());
                        logger3.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("wasWalletResetSuccessful=" + bool2);
                        if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                            mr2.d dVar113 = deviceSettingsActivity.f51997i;
                            if (dVar113 == null) {
                                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                throw null;
                            }
                            dVar113.Y();
                            deviceSettingsActivity.ga();
                        } else {
                            br2.c.f19585a.g(null, deviceSettingsActivity);
                        }
                        hn2.c.ba(deviceSettingsActivity, Boolean.FALSE, null, null, 14);
                        return Unit.INSTANCE;
                    case 6:
                        DeviceSettingsActivity.a aVar7 = DeviceSettingsActivity.f51993w;
                        hn2.c.ba(deviceSettingsActivity, (Boolean) obj, null, null, 14);
                        return Unit.INSTANCE;
                    default:
                        DeviceSettingsActivity.f51994x.debug("operators.onChanged: " + ((ns2.a) obj));
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar8 = deviceSettingsActivity.f51999k;
                        if (aVar8 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar114 = deviceSettingsActivity.f51997i;
                        if (dVar114 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH8 = dVar114.h4();
                        mr2.d dVar20 = deviceSettingsActivity.f51997i;
                        if (dVar20 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD4 = dVar20.y2().d();
                        hs2.c cVarOrNull4 = optionalD4 != null ? optionalD4.orNull() : null;
                        boolean zCa4 = deviceSettingsActivity.ca();
                        boolean zEa5 = deviceSettingsActivity.ea();
                        mr2.d dVar21 = deviceSettingsActivity.f51997i;
                        if (dVar21 != null) {
                            com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar8, fVarH8, cVarOrNull4, zCa4, zEa5, dVar21.c1().d());
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                }
            }
        }));
        mr2.d dVar10 = this.f51997i;
        if (dVar10 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        final int i19 = 4;
        dVar10.y2().f(this, new e(new l(this) { // from class: lr2.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceSettingsActivity f114388b;

            {
                this.f114388b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i110 = i19;
                DeviceSettingsActivity deviceSettingsActivity = this.f114388b;
                switch (i110) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("isLoading.onChanged: " + bool);
                        hn2.c.ba(deviceSettingsActivity, bool, null, null, 14);
                        return Unit.INSTANCE;
                    case 1:
                        mr2.b bVar = (mr2.b) obj;
                        Logger logger = DeviceSettingsActivity.f51994x;
                        logger.debug("associatedCardsModel.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar3 = deviceSettingsActivity.f51999k;
                        if (aVar3 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar11 = deviceSettingsActivity.f51997i;
                        if (dVar11 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH4 = dVar11.h4();
                        mr2.d dVar12 = deviceSettingsActivity.f51997i;
                        if (dVar12 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD = dVar12.y2().d();
                        hs2.c cVarOrNull = optionalD != null ? optionalD.orNull() : null;
                        Boolean boolValueOf = Boolean.valueOf(deviceSettingsActivity.ca());
                        boolean zEa = deviceSettingsActivity.ea();
                        mr2.d dVar13 = deviceSettingsActivity.f51997i;
                        if (dVar13 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.b bVarU = aVar3.u(bVar, fVarH4, cVarOrNull, boolValueOf, zEa, dVar13.c1().d());
                        aVar3.f52068g = bVarU;
                        aVar3.t(bVarU.f52071c);
                        logger.debug("createAdapterState");
                        mr2.d dVar14 = deviceSettingsActivity.f51997i;
                        if (dVar14 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        dVar14.B();
                        mr2.d dVar15 = deviceSettingsActivity.f51997i;
                        if (dVar15 != null) {
                            dVar15.l();
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    case 2:
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar4 = deviceSettingsActivity.f51999k;
                        if (aVar4 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar16 = deviceSettingsActivity.f51997i;
                        if (dVar16 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH5 = dVar16.h4();
                        mr2.d dVar17 = deviceSettingsActivity.f51997i;
                        if (dVar17 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD2 = dVar17.y2().d();
                        hs2.c cVarOrNull2 = optionalD2 != null ? optionalD2.orNull() : null;
                        boolean zCa = deviceSettingsActivity.ca();
                        boolean zEa2 = deviceSettingsActivity.ea();
                        mr2.d dVar18 = deviceSettingsActivity.f51997i;
                        if (dVar18 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar4, fVarH5, cVarOrNull2, zCa, zEa2, dVar18.c1().d());
                        DeviceSettingsActivity.f51994x.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 3:
                        Logger logger2 = DeviceSettingsActivity.f51994x;
                        logger2.debug("walletPasscodeState.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar5 = deviceSettingsActivity.f51999k;
                        if (aVar5 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar19 = deviceSettingsActivity.f51997i;
                        if (dVar19 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH6 = dVar19.h4();
                        mr2.d dVar110 = deviceSettingsActivity.f51997i;
                        if (dVar110 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD3 = dVar110.y2().d();
                        hs2.c cVarOrNull3 = optionalD3 != null ? optionalD3.orNull() : null;
                        boolean zCa2 = deviceSettingsActivity.ca();
                        boolean zEa3 = deviceSettingsActivity.ea();
                        mr2.d dVar111 = deviceSettingsActivity.f51997i;
                        if (dVar111 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar5, fVarH6, cVarOrNull3, zCa2, zEa3, dVar111.c1().d());
                        logger2.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 4:
                        Optional optional = (Optional) obj;
                        Logger logger3 = DeviceSettingsActivity.f51994x;
                        logger3.debug("walletExpressCard.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar6 = deviceSettingsActivity.f51999k;
                        if (aVar6 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar112 = deviceSettingsActivity.f51997i;
                        if (dVar112 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH7 = dVar112.h4();
                        hs2.c cVar = (hs2.c) optional.orNull();
                        boolean zCa3 = deviceSettingsActivity.ca();
                        boolean zEa4 = deviceSettingsActivity.ea();
                        mr2.d dVar113 = deviceSettingsActivity.f51997i;
                        if (dVar113 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar6, fVarH7, cVar, zCa3, zEa4, dVar113.c1().d());
                        logger3.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("wasWalletResetSuccessful=" + bool2);
                        if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                            mr2.d dVar114 = deviceSettingsActivity.f51997i;
                            if (dVar114 == null) {
                                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                throw null;
                            }
                            dVar114.Y();
                            deviceSettingsActivity.ga();
                        } else {
                            br2.c.f19585a.g(null, deviceSettingsActivity);
                        }
                        hn2.c.ba(deviceSettingsActivity, Boolean.FALSE, null, null, 14);
                        return Unit.INSTANCE;
                    case 6:
                        DeviceSettingsActivity.a aVar7 = DeviceSettingsActivity.f51993w;
                        hn2.c.ba(deviceSettingsActivity, (Boolean) obj, null, null, 14);
                        return Unit.INSTANCE;
                    default:
                        DeviceSettingsActivity.f51994x.debug("operators.onChanged: " + ((ns2.a) obj));
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar8 = deviceSettingsActivity.f51999k;
                        if (aVar8 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar115 = deviceSettingsActivity.f51997i;
                        if (dVar115 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH8 = dVar115.h4();
                        mr2.d dVar20 = deviceSettingsActivity.f51997i;
                        if (dVar20 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD4 = dVar20.y2().d();
                        hs2.c cVarOrNull4 = optionalD4 != null ? optionalD4.orNull() : null;
                        boolean zCa4 = deviceSettingsActivity.ca();
                        boolean zEa5 = deviceSettingsActivity.ea();
                        mr2.d dVar21 = deviceSettingsActivity.f51997i;
                        if (dVar21 != null) {
                            com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar8, fVarH8, cVarOrNull4, zCa4, zEa5, dVar21.c1().d());
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                }
            }
        }));
        qr2.a aVar3 = this.f51998j;
        if (aVar3 == null) {
            s.m("resetWalletViewModel");
            throw null;
        }
        final int i24 = 5;
        aVar3.S1().f(this, new e(new l(this) { // from class: lr2.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceSettingsActivity f114388b;

            {
                this.f114388b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i110 = i24;
                DeviceSettingsActivity deviceSettingsActivity = this.f114388b;
                switch (i110) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("isLoading.onChanged: " + bool);
                        hn2.c.ba(deviceSettingsActivity, bool, null, null, 14);
                        return Unit.INSTANCE;
                    case 1:
                        mr2.b bVar = (mr2.b) obj;
                        Logger logger = DeviceSettingsActivity.f51994x;
                        logger.debug("associatedCardsModel.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar4 = deviceSettingsActivity.f51999k;
                        if (aVar4 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar11 = deviceSettingsActivity.f51997i;
                        if (dVar11 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH4 = dVar11.h4();
                        mr2.d dVar12 = deviceSettingsActivity.f51997i;
                        if (dVar12 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD = dVar12.y2().d();
                        hs2.c cVarOrNull = optionalD != null ? optionalD.orNull() : null;
                        Boolean boolValueOf = Boolean.valueOf(deviceSettingsActivity.ca());
                        boolean zEa = deviceSettingsActivity.ea();
                        mr2.d dVar13 = deviceSettingsActivity.f51997i;
                        if (dVar13 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.b bVarU = aVar4.u(bVar, fVarH4, cVarOrNull, boolValueOf, zEa, dVar13.c1().d());
                        aVar4.f52068g = bVarU;
                        aVar4.t(bVarU.f52071c);
                        logger.debug("createAdapterState");
                        mr2.d dVar14 = deviceSettingsActivity.f51997i;
                        if (dVar14 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        dVar14.B();
                        mr2.d dVar15 = deviceSettingsActivity.f51997i;
                        if (dVar15 != null) {
                            dVar15.l();
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    case 2:
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar5 = deviceSettingsActivity.f51999k;
                        if (aVar5 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar16 = deviceSettingsActivity.f51997i;
                        if (dVar16 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH5 = dVar16.h4();
                        mr2.d dVar17 = deviceSettingsActivity.f51997i;
                        if (dVar17 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD2 = dVar17.y2().d();
                        hs2.c cVarOrNull2 = optionalD2 != null ? optionalD2.orNull() : null;
                        boolean zCa = deviceSettingsActivity.ca();
                        boolean zEa2 = deviceSettingsActivity.ea();
                        mr2.d dVar18 = deviceSettingsActivity.f51997i;
                        if (dVar18 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar5, fVarH5, cVarOrNull2, zCa, zEa2, dVar18.c1().d());
                        DeviceSettingsActivity.f51994x.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 3:
                        Logger logger2 = DeviceSettingsActivity.f51994x;
                        logger2.debug("walletPasscodeState.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar6 = deviceSettingsActivity.f51999k;
                        if (aVar6 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar19 = deviceSettingsActivity.f51997i;
                        if (dVar19 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH6 = dVar19.h4();
                        mr2.d dVar110 = deviceSettingsActivity.f51997i;
                        if (dVar110 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD3 = dVar110.y2().d();
                        hs2.c cVarOrNull3 = optionalD3 != null ? optionalD3.orNull() : null;
                        boolean zCa2 = deviceSettingsActivity.ca();
                        boolean zEa3 = deviceSettingsActivity.ea();
                        mr2.d dVar111 = deviceSettingsActivity.f51997i;
                        if (dVar111 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar6, fVarH6, cVarOrNull3, zCa2, zEa3, dVar111.c1().d());
                        logger2.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 4:
                        Optional optional = (Optional) obj;
                        Logger logger3 = DeviceSettingsActivity.f51994x;
                        logger3.debug("walletExpressCard.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar7 = deviceSettingsActivity.f51999k;
                        if (aVar7 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar112 = deviceSettingsActivity.f51997i;
                        if (dVar112 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH7 = dVar112.h4();
                        hs2.c cVar = (hs2.c) optional.orNull();
                        boolean zCa3 = deviceSettingsActivity.ca();
                        boolean zEa4 = deviceSettingsActivity.ea();
                        mr2.d dVar113 = deviceSettingsActivity.f51997i;
                        if (dVar113 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar7, fVarH7, cVar, zCa3, zEa4, dVar113.c1().d());
                        logger3.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("wasWalletResetSuccessful=" + bool2);
                        if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                            mr2.d dVar114 = deviceSettingsActivity.f51997i;
                            if (dVar114 == null) {
                                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                throw null;
                            }
                            dVar114.Y();
                            deviceSettingsActivity.ga();
                        } else {
                            br2.c.f19585a.g(null, deviceSettingsActivity);
                        }
                        hn2.c.ba(deviceSettingsActivity, Boolean.FALSE, null, null, 14);
                        return Unit.INSTANCE;
                    case 6:
                        DeviceSettingsActivity.a aVar8 = DeviceSettingsActivity.f51993w;
                        hn2.c.ba(deviceSettingsActivity, (Boolean) obj, null, null, 14);
                        return Unit.INSTANCE;
                    default:
                        DeviceSettingsActivity.f51994x.debug("operators.onChanged: " + ((ns2.a) obj));
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar9 = deviceSettingsActivity.f51999k;
                        if (aVar9 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar115 = deviceSettingsActivity.f51997i;
                        if (dVar115 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH8 = dVar115.h4();
                        mr2.d dVar20 = deviceSettingsActivity.f51997i;
                        if (dVar20 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD4 = dVar20.y2().d();
                        hs2.c cVarOrNull4 = optionalD4 != null ? optionalD4.orNull() : null;
                        boolean zCa4 = deviceSettingsActivity.ca();
                        boolean zEa5 = deviceSettingsActivity.ea();
                        mr2.d dVar21 = deviceSettingsActivity.f51997i;
                        if (dVar21 != null) {
                            com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar9, fVarH8, cVarOrNull4, zCa4, zEa5, dVar21.c1().d());
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                }
            }
        }));
        qr2.a aVar4 = this.f51998j;
        if (aVar4 == null) {
            s.m("resetWalletViewModel");
            throw null;
        }
        final int i25 = 6;
        aVar4.L2().f(this, new e(new l(this) { // from class: lr2.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceSettingsActivity f114388b;

            {
                this.f114388b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i110 = i25;
                DeviceSettingsActivity deviceSettingsActivity = this.f114388b;
                switch (i110) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("isLoading.onChanged: " + bool);
                        hn2.c.ba(deviceSettingsActivity, bool, null, null, 14);
                        return Unit.INSTANCE;
                    case 1:
                        mr2.b bVar = (mr2.b) obj;
                        Logger logger = DeviceSettingsActivity.f51994x;
                        logger.debug("associatedCardsModel.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar5 = deviceSettingsActivity.f51999k;
                        if (aVar5 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar11 = deviceSettingsActivity.f51997i;
                        if (dVar11 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH4 = dVar11.h4();
                        mr2.d dVar12 = deviceSettingsActivity.f51997i;
                        if (dVar12 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD = dVar12.y2().d();
                        hs2.c cVarOrNull = optionalD != null ? optionalD.orNull() : null;
                        Boolean boolValueOf = Boolean.valueOf(deviceSettingsActivity.ca());
                        boolean zEa = deviceSettingsActivity.ea();
                        mr2.d dVar13 = deviceSettingsActivity.f51997i;
                        if (dVar13 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.b bVarU = aVar5.u(bVar, fVarH4, cVarOrNull, boolValueOf, zEa, dVar13.c1().d());
                        aVar5.f52068g = bVarU;
                        aVar5.t(bVarU.f52071c);
                        logger.debug("createAdapterState");
                        mr2.d dVar14 = deviceSettingsActivity.f51997i;
                        if (dVar14 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        dVar14.B();
                        mr2.d dVar15 = deviceSettingsActivity.f51997i;
                        if (dVar15 != null) {
                            dVar15.l();
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                    case 2:
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar6 = deviceSettingsActivity.f51999k;
                        if (aVar6 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar16 = deviceSettingsActivity.f51997i;
                        if (dVar16 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH5 = dVar16.h4();
                        mr2.d dVar17 = deviceSettingsActivity.f51997i;
                        if (dVar17 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD2 = dVar17.y2().d();
                        hs2.c cVarOrNull2 = optionalD2 != null ? optionalD2.orNull() : null;
                        boolean zCa = deviceSettingsActivity.ca();
                        boolean zEa2 = deviceSettingsActivity.ea();
                        mr2.d dVar18 = deviceSettingsActivity.f51997i;
                        if (dVar18 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar6, fVarH5, cVarOrNull2, zCa, zEa2, dVar18.c1().d());
                        DeviceSettingsActivity.f51994x.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 3:
                        Logger logger2 = DeviceSettingsActivity.f51994x;
                        logger2.debug("walletPasscodeState.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar7 = deviceSettingsActivity.f51999k;
                        if (aVar7 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar19 = deviceSettingsActivity.f51997i;
                        if (dVar19 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH6 = dVar19.h4();
                        mr2.d dVar110 = deviceSettingsActivity.f51997i;
                        if (dVar110 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD3 = dVar110.y2().d();
                        hs2.c cVarOrNull3 = optionalD3 != null ? optionalD3.orNull() : null;
                        boolean zCa2 = deviceSettingsActivity.ca();
                        boolean zEa3 = deviceSettingsActivity.ea();
                        mr2.d dVar111 = deviceSettingsActivity.f51997i;
                        if (dVar111 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar7, fVarH6, cVarOrNull3, zCa2, zEa3, dVar111.c1().d());
                        logger2.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 4:
                        Optional optional = (Optional) obj;
                        Logger logger3 = DeviceSettingsActivity.f51994x;
                        logger3.debug("walletExpressCard.onChanged");
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar8 = deviceSettingsActivity.f51999k;
                        if (aVar8 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar112 = deviceSettingsActivity.f51997i;
                        if (dVar112 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH7 = dVar112.h4();
                        hs2.c cVar = (hs2.c) optional.orNull();
                        boolean zCa3 = deviceSettingsActivity.ca();
                        boolean zEa4 = deviceSettingsActivity.ea();
                        mr2.d dVar113 = deviceSettingsActivity.f51997i;
                        if (dVar113 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar8, fVarH7, cVar, zCa3, zEa4, dVar113.c1().d());
                        logger3.debug("updateAdapterState");
                        return Unit.INSTANCE;
                    case 5:
                        Boolean bool2 = (Boolean) obj;
                        DeviceSettingsActivity.f51994x.debug("wasWalletResetSuccessful=" + bool2);
                        if (p005kotlin.jvm.internal.s.g(bool2, Boolean.TRUE)) {
                            mr2.d dVar114 = deviceSettingsActivity.f51997i;
                            if (dVar114 == null) {
                                p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                                throw null;
                            }
                            dVar114.Y();
                            deviceSettingsActivity.ga();
                        } else {
                            br2.c.f19585a.g(null, deviceSettingsActivity);
                        }
                        hn2.c.ba(deviceSettingsActivity, Boolean.FALSE, null, null, 14);
                        return Unit.INSTANCE;
                    case 6:
                        DeviceSettingsActivity.a aVar9 = DeviceSettingsActivity.f51993w;
                        hn2.c.ba(deviceSettingsActivity, (Boolean) obj, null, null, 14);
                        return Unit.INSTANCE;
                    default:
                        DeviceSettingsActivity.f51994x.debug("operators.onChanged: " + ((ns2.a) obj));
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar10 = deviceSettingsActivity.f51999k;
                        if (aVar10 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsAdapter");
                            throw null;
                        }
                        mr2.d dVar115 = deviceSettingsActivity.f51997i;
                        if (dVar115 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        br2.f fVarH8 = dVar115.h4();
                        mr2.d dVar20 = deviceSettingsActivity.f51997i;
                        if (dVar20 == null) {
                            p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                            throw null;
                        }
                        Optional<hs2.c> optionalD4 = dVar20.y2().d();
                        hs2.c cVarOrNull4 = optionalD4 != null ? optionalD4.orNull() : null;
                        boolean zCa4 = deviceSettingsActivity.ca();
                        boolean zEa5 = deviceSettingsActivity.ea();
                        mr2.d dVar21 = deviceSettingsActivity.f51997i;
                        if (dVar21 != null) {
                            com.garmin.feature.garminpay.ui.devicesettings.a.z(aVar10, fVarH8, cVarOrNull4, zCa4, zEa5, dVar21.c1().d());
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("deviceSettingsViewModel");
                        throw null;
                }
            }
        }));
        ge1.b.T(f0.w(this), null, null, new i(this, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_device_settings, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_supported_cards) {
            return super.onOptionsItemSelected(menuItem);
        }
        or2.b.f133424a.getClass();
        startActivity(or2.b.a());
        return true;
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f51995g.e();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        mr2.d dVar = this.f51997i;
        if (dVar == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        dVar.h();
        mr2.d dVar2 = this.f51997i;
        if (dVar2 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        dVar2.Y();
        mr2.d dVar3 = this.f51997i;
        if (dVar3 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        dVar3.B();
        mr2.d dVar4 = this.f51997i;
        if (dVar4 == null) {
            s.m("deviceSettingsViewModel");
            throw null;
        }
        dVar4.l();
        com.garmin.feature.garminpay.ui.devicesettings.a aVar = this.f51999k;
        if (aVar == null) {
            s.m("deviceSettingsAdapter");
            throw null;
        }
        this.f51995g.a(aVar.f52067f.d(new lp2.h(new d(this), 13), new lp2.h(new lq1.a(11), 14)));
        f51994x.debug("handleA2AVerificationResult");
        Bundle extras = getIntent().getExtras();
        Object obj = extras != null ? extras.get("cardVerification.status") : null;
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            or2.b bVar = or2.b.f133424a;
            View viewFindViewById = findViewById(R.id.generic_recycler_view_container);
            viewFindViewById.getClass();
            bVar.getClass();
            or2.b.b(viewFindViewById, zBooleanValue);
        }
        Bundle extras2 = getIntent().getExtras();
        Object obj2 = extras2 != null ? extras2.get("a2a.app.not.installed") : null;
        String str = (String) (obj2 instanceof String ? obj2 : null);
        if (str != null) {
            br2.c.j(br2.c.f19585a, this, new i0(16, this, str));
        }
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/DeviceSettingsActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, Long l14, String str, String str2) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) DeviceSettingsActivity.class);
            intent.putExtra("device.unit.id", l14);
            intent.putExtra("device.image.url", str);
            intent.putExtra("device.name", str2);
            intent.setFlags(536870912);
            return intent;
        }

        private a() {
        }
    }
}
