package com.garmin.feature.garminpay.ui.passcode;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import bm.y;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.common.PasscodeControlView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.l;
import j22.e;
import java.util.Arrays;
import java.util.Iterator;
import lc.u0;
import ms2.g;
import o13.h;
import o13.p;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.x0;
import ps2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/passcode/PasscodeEntryActivity;", "Lhn2/c;", "", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PasscodeEntryActivity extends hn2.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f52121n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Logger f52122o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f52123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f52124h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qs2.d f52125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qr2.d f52126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PasscodeControlView f52127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f52128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.c<Intent> f52129m;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52131b;

        static {
            int[] iArr = new int[qr2.d.c.values().length];
            try {
                iArr[qr2.d.c.CONFIRM_PASSCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qr2.d.c.CREATE_NEW_PASSCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qr2.d.c.ENTER_EXISTING_PASSCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qr2.d.c.LOCKED_WALLET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qr2.d.c.PASSCODE_CONFIRMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[qr2.d.c.PASSCODE_NOT_CONFIRMED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[qr2.d.c.WALLET_RESET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[qr2.d.c.WALLET_ERROR_LOAD_STATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[qr2.d.c.CREATE_NEW_OWNER_DATA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f52130a = iArr;
            int[] iArr2 = new int[qr2.d.b.values().length];
            try {
                iArr2[qr2.d.b.WALLET_ACTION_GENERIC_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[qr2.d.b.WALLET_ACTION_DISCONN_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[qr2.d.b.WALLET_ACTION_BT_OFF_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f52131b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/ui/passcode/PasscodeEntryActivity$c", "Landroidx/lifecycle/x1$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements x1.c {
        public c() {
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            PasscodeEntryActivity passcodeEntryActivity = PasscodeEntryActivity.this;
            return new qr2.d(passcodeEntryActivity.f52123g, passcodeEntryActivity.f52124h, (hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f52133a;

        public d(l lVar) {
            lVar.getClass();
            this.f52133a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f52133a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52133a.invoke(obj);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f52122o = gt2.b.f79005a.h("PAY#PasscodeEntryActivity");
    }

    public PasscodeEntryActivity() {
        e.a aVar = e.f96744g;
        String name = f52122o.getName();
        name.getClass();
        pr2.a aVar2 = new pr2.a(this, 0);
        pr2.a aVar3 = new pr2.a(this, 1);
        aVar.getClass();
        this.f52128l = e.a.a(name, aVar2, aVar3, null);
        this.f52129m = registerForActivityResult(new g.h(), new jp.a(this, 20));
    }

    public final void ca() {
        String string = getString(R.string.lbl_ok);
        string.getClass();
        String string2 = getString(R.string.wallet_passcodes_not_matched_title);
        string2.getClass();
        String string3 = getString(R.string.wallet_passcodes_do_not_match_message);
        string3.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, this, string2, string3, new p(string, new pr2.b(this, 5)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final void da() {
        ResetWalletActivity.a aVar = ResetWalletActivity.f52134l;
        Long lValueOf = Long.valueOf(this.f52123g);
        String str = this.f52124h;
        aVar.getClass();
        Intent intent = new Intent(this, (Class<?>) ResetWalletActivity.class);
        intent.putExtra("device.unit.id", lValueOf);
        intent.putExtra("device.name", str);
        this.f52129m.a(intent, null);
    }

    public final void ea(qr2.d.b bVar) {
        bVar.getClass();
        com.airbnb.lottie.animation.keyframe.a.w("onPasscodeActionFailed: errorType=", bVar.name(), f52122o);
        int i14 = b.f52131b[bVar.ordinal()];
        if (i14 == 1) {
            br2.c.f19585a.g(null, this);
            return;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                u0.r();
                return;
            } else {
                this.f52128l.a();
                Unit unit = Unit.INSTANCE;
                return;
            }
        }
        br2.c cVar = br2.c.f19585a;
        qr2.d dVar = this.f52126j;
        if (dVar != null) {
            cVar.d(this, dVar.f146937b, new y(15));
        } else {
            s.m("passcodeViewModel");
            throw null;
        }
    }

    public final void fa(int i14) {
        Intent intent = new Intent();
        intent.putExtra("device.unit.id", this.f52123g);
        intent.putExtra("device.name", this.f52124h);
        setResult(i14, intent);
    }

    public final void ga(boolean z14) {
        hn2.c.ba(this, Boolean.valueOf(z14), null, null, 14);
        PasscodeControlView passcodeControlView = this.f52127k;
        if (passcodeControlView == null) {
            return;
        }
        boolean z15 = !z14;
        GridLayout gridLayout = passcodeControlView.f51877k;
        int childCount = gridLayout.getChildCount();
        if (childCount < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            View childAt = gridLayout.getChildAt(i14);
            if (childAt != null) {
                childAt.setEnabled(z15);
            }
            if (i14 == childCount) {
                return;
            } else {
                i14++;
            }
        }
    }

    public final void ha() {
        qr2.d dVar = this.f52126j;
        if (dVar == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        dVar.f146947l.f(this, new d(new pr2.c(this, 0)));
        qr2.d dVar2 = this.f52126j;
        if (dVar2 == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        int i14 = 1;
        dVar2.f146948m.f(this, new d(new pr2.c(this, i14)));
        qr2.d dVar3 = this.f52126j;
        if (dVar3 == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        ps2.n nVar = dVar3.f146940e;
        if (nVar != null) {
            dVar3.f146947l.m(Boolean.TRUE);
            nVar.b().j(l13.a.f108327b).g(r03.a.a()).h(new ps2.d(new qr2.c(dVar3, i14), 19), new ps2.d(new ph1.d(17, dVar3, nVar), 20));
        } else {
            dVar3.A4(qr2.d.c.WALLET_ERROR_LOAD_STATE, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void ia() {
        PasscodeControlView passcodeControlView;
        String str;
        String string;
        qr2.d dVar = this.f52126j;
        if (dVar == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        int i14 = 2;
        int iIntValue = 0;
        int i15 = 1;
        if (dVar.f146950o) {
            Integer numD = dVar.f146948m.d();
            if ((numD != null ? numD.intValue() : 0) > 0) {
                PasscodeControlView passcodeControlView2 = this.f52127k;
                if (passcodeControlView2 != null) {
                    passcodeControlView2.setSecondaryTextType(PasscodeControlView.b.ATTEMPTS_REMAINING);
                }
                PasscodeControlView passcodeControlView3 = this.f52127k;
                if (passcodeControlView3 != null) {
                    qr2.d dVar2 = this.f52126j;
                    if (dVar2 == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    passcodeControlView3.setSecondaryText(dVar2.x4());
                }
                qr2.d dVar3 = this.f52126j;
                if (dVar3 == null) {
                    s.m("passcodeViewModel");
                    throw null;
                }
                if (dVar3.f146943h) {
                    return;
                }
                if (dVar3.f146949n) {
                    String string2 = getString(R.string.lbl_ok);
                    string2.getClass();
                    String string3 = getString(R.string.incorrect_passcode_lbl);
                    string3.getClass();
                    qr2.d dVar4 = this.f52126j;
                    if (dVar4 == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    Integer numD2 = dVar4.f146948m.d();
                    iIntValue = numD2 != null ? numD2.intValue() : 0;
                    if (iIntValue > 1) {
                        x0 x0Var = x0.f105818a;
                        String string4 = getString(R.string.previous_incorrect_passcode_attempts_plural_message);
                        string4.getClass();
                        string = String.format(string4, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
                    } else {
                        string = getString(R.string.previous_incorrect_passcode_attempts_singular_message);
                        string.getClass();
                    }
                    androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, this, string3, string, new p(string2, new pa0.a(19)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    if (eVarQ != null) {
                        eVarQ.show();
                        return;
                    }
                    return;
                }
                qr2.d.c cVarD = dVar3.f146946k.d();
                qr2.d.c cVar = qr2.d.c.LOCKED_WALLET;
                if (cVarD == cVar) {
                    qr2.d dVar5 = this.f52126j;
                    if (dVar5 == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    if (!dVar5.f146944i) {
                        PasscodeControlView passcodeControlView4 = this.f52127k;
                        if (passcodeControlView4 != null) {
                            passcodeControlView4.setSecondaryTextType(PasscodeControlView.b.NO_TEXT);
                        }
                        String string5 = getString(R.string.wallet_reset_wallet_confirm);
                        string5.getClass();
                        String string6 = getString(R.string.wallet_change_passcode_lbl);
                        string6.getClass();
                        String string7 = getString(R.string.wallet_locked_title);
                        string7.getClass();
                        x0 x0Var2 = x0.f105818a;
                        String string8 = getString(R.string.wallet_locked_message);
                        string8.getClass();
                        androidx.appcompat.app.e eVarQ2 = br2.c.q(br2.c.f19585a, this, string7, String.format(string8, Arrays.copyOf(new Object[]{this.f52124h}, 1)), new p(string5, new pr2.b(this, 3)), new p(string6, new pr2.b(this, 4)), null, false, 224);
                        if (eVarQ2 != null) {
                            eVarQ2.show();
                            return;
                        }
                        return;
                    }
                }
                String string9 = getString(R.string.lbl_ok);
                string9.getClass();
                qr2.d dVar6 = this.f52126j;
                if (dVar6 == null) {
                    s.m("passcodeViewModel");
                    throw null;
                }
                String string10 = dVar6.f146946k.d() == cVar ? getString(R.string.incorrect_old_passcode_lbl) : getString(R.string.incorrect_passcode_lbl);
                string10.getClass();
                qr2.d dVar7 = this.f52126j;
                if (dVar7 == null) {
                    s.m("passcodeViewModel");
                    throw null;
                }
                qr2.d.c cVarD2 = dVar7.f146946k.d();
                qr2.d dVar8 = this.f52126j;
                if (cVarD2 == cVar) {
                    if (dVar8 == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    Integer numD3 = dVar8.f146948m.d();
                    int iIntValue2 = numD3 != null ? numD3.intValue() : 0;
                    if (iIntValue2 > 1) {
                        x0 x0Var3 = x0.f105818a;
                        String string11 = getString(R.string.incorrect_old_passcode_plural_message);
                        string11.getClass();
                        str = String.format(string11, Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue2), this.f52124h}, 2));
                    } else {
                        x0 x0Var4 = x0.f105818a;
                        String string12 = getString(R.string.incorrect_old_passcode_singular_message);
                        string12.getClass();
                        str = String.format(string12, Arrays.copyOf(new Object[]{this.f52124h}, 1));
                    }
                } else {
                    if (dVar8 == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    Integer numD4 = dVar8.f146948m.d();
                    int iIntValue3 = numD4 != null ? numD4.intValue() : 0;
                    if (iIntValue3 != 1) {
                        String string13 = getString(R.string.wallet_attempts_before_locked_plural);
                        string13.getClass();
                        Integer numValueOf = Integer.valueOf(iIntValue3);
                        qr2.d dVar9 = this.f52126j;
                        if (dVar9 == null) {
                            s.m("passcodeViewModel");
                            throw null;
                        }
                        str = String.format(string13, Arrays.copyOf(new Object[]{numValueOf, dVar9.f146937b}, 2));
                    } else {
                        String string14 = getString(R.string.wallet_attempts_before_locked_singular);
                        string14.getClass();
                        Integer numValueOf2 = Integer.valueOf(iIntValue3);
                        qr2.d dVar10 = this.f52126j;
                        if (dVar10 == null) {
                            s.m("passcodeViewModel");
                            throw null;
                        }
                        str = String.format(string14, Arrays.copyOf(new Object[]{numValueOf2, dVar10.f146937b}, 2));
                    }
                }
                androidx.appcompat.app.e eVarQ3 = br2.c.q(br2.c.f19585a, this, string10, str, new p(string9, new pr2.b(this, iIntValue)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                if (eVarQ3 != null) {
                    eVarQ3.show();
                    return;
                }
                return;
            }
        }
        qr2.d dVar11 = this.f52126j;
        if (dVar11 == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        if (dVar11.f146950o) {
            Integer numD5 = dVar11.f146948m.d();
            if (((numD5 != null ? numD5.intValue() : 0) > 0 ? 1 : 0) == 0) {
                PasscodeControlView passcodeControlView5 = this.f52127k;
                if (passcodeControlView5 != null) {
                    qr2.d dVar12 = this.f52126j;
                    if (dVar12 == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    passcodeControlView5.setSecondaryText(dVar12.x4());
                }
                qr2.d dVar13 = this.f52126j;
                if (dVar13 == null) {
                    s.m("passcodeViewModel");
                    throw null;
                }
                if (dVar13.f146946k.d() == qr2.d.c.LOCKED_WALLET) {
                    String string15 = getString(R.string.wallet_locked_title);
                    string15.getClass();
                    x0 x0Var5 = x0.f105818a;
                    String string16 = getString(R.string.wallet_locked_short_message);
                    string16.getClass();
                    String str2 = String.format(string16, Arrays.copyOf(new Object[]{this.f52124h}, 1));
                    String string17 = getString(R.string.lbl_cancel);
                    string17.getClass();
                    String string18 = getString(R.string.wallet_reset_wallet);
                    string18.getClass();
                    androidx.appcompat.app.e eVarQ4 = br2.c.q(br2.c.f19585a, this, string15, str2, new p(string18, new pr2.b(this, i15)), new p(string17, new pr2.b(this, i14)), null, false, 224);
                    if (eVarQ4 != null) {
                        eVarQ4.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        qr2.d dVar14 = this.f52126j;
        if (dVar14 == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        if (dVar14.f146950o || (passcodeControlView = this.f52127k) == null) {
            return;
        }
        passcodeControlView.setSecondaryTextType(PasscodeControlView.b.NO_TEXT);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0127  */
    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        qs2.d dVar;
        boolean z14;
        js2.d dVar2;
        hs2.a aVar;
        hs2.a aVar2;
        Parcelable parcelable;
        super.onCreate(bundle);
        f52122o.trace("onCreate");
        R9(R.layout.activity_passcode, hn2.c.a.BACK, getString(R.string.wallet_create_passcode_label));
        this.f52127k = (PasscodeControlView) findViewById(R.id.passcode_input_view);
        Intent intent = getIntent();
        if (intent == null) {
            vb.h.s("No unit ID provided for passcode setup");
            return;
        }
        this.f52123g = intent.getLongExtra("device.unit.id", 0L);
        Intent intent2 = getIntent();
        if (intent2 == null || (stringExtra = intent2.getStringExtra("device.name")) == null) {
            stringExtra = "";
        }
        this.f52124h = stringExtra;
        Intent intent3 = getIntent();
        js2.e eVar = null;
        if (intent3 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent3.getParcelableExtra("extra.wallet.item", qs2.d.class);
            } else {
                Parcelable parcelableExtra = intent3.getParcelableExtra("extra.wallet.item");
                if (!(parcelableExtra instanceof qs2.d)) {
                    parcelableExtra = null;
                }
                parcelable = (qs2.d) parcelableExtra;
            }
            dVar = (qs2.d) parcelable;
        } else {
            dVar = null;
        }
        this.f52125i = dVar;
        Intent intent4 = getIntent();
        int i14 = 0;
        boolean booleanExtra = intent4 != null ? intent4.getBooleanExtra("extra.change.passcode", false) : false;
        qr2.d dVar3 = (qr2.d) new x1(this, new c()).b(s0.f105811a.b(qr2.d.class));
        this.f52126j = dVar3;
        int i15 = 2;
        dVar3.f146946k.f(this, new d(new pr2.c(this, i15)));
        qr2.d dVar4 = this.f52126j;
        if (dVar4 == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        ps2.n nVar = dVar4.f146940e;
        if (nVar != null && (aVar2 = nVar.f140498a) != null && !aVar2.getRequiresPasscode()) {
            ga(true);
            qr2.d dVar5 = this.f52126j;
            if (dVar5 == null) {
                s.m("passcodeViewModel");
                throw null;
            }
            ps2.n nVar2 = dVar5.f146940e;
            if (nVar2 != null) {
                ps2.e eVar2 = new ps2.e(nVar2, i15);
                int i16 = w03.b.f181178a;
                new z03.c(eVar2).k(l13.a.f108327b).h(r03.a.a()).i(new ps2.d(new qr2.c(dVar5, i15), 23), new qr2.b(dVar5, i14));
                return;
            } else {
                PasscodeEntryActivity passcodeEntryActivity = dVar5.f146939d;
                if (passcodeEntryActivity != null) {
                    passcodeEntryActivity.ea(qr2.d.b.WALLET_ACTION_GENERIC_ERROR);
                    return;
                }
                return;
            }
        }
        qr2.d dVar6 = this.f52126j;
        if (dVar6 == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        ps2.n nVar3 = dVar6.f146940e;
        if (nVar3 == null || (aVar = nVar3.f140498a) == null || !aVar.getRequiresPasscode()) {
            z14 = false;
        } else {
            js2.d dVar7 = nVar3.f140513p;
            if (dVar7 != null ? s.g(dVar7.f100665f, Boolean.FALSE) : false) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        if (z14) {
            w.f140538a.getClass();
            Iterator it = w.f140542e.values().iterator();
            while (it.hasNext()) {
                ((g) it.next()).getClass();
            }
            ha();
            return;
        }
        if (booleanExtra) {
            ha();
            return;
        }
        qr2.d dVar8 = this.f52126j;
        if (dVar8 == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        ps2.n nVar4 = dVar8.f146940e;
        if (nVar4 != null && (dVar2 = nVar4.f140513p) != null) {
            eVar = dVar2.f100660a;
        }
        if (((eVar == js2.e.BLOCKED_WALLET || eVar == js2.e.LOCKED_WALLET) ? 1 : 0) != 0) {
            fa(12);
            finish();
        } else {
            fa(-1);
            finish();
        }
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        PasscodeControlView passcodeControlView = this.f52127k;
        if (passcodeControlView != null && passcodeControlView.f51883q != null) {
            passcodeControlView.f51883q = null;
        }
        qr2.d dVar = this.f52126j;
        if (dVar != null) {
            dVar.f146939d = null;
        } else {
            s.m("passcodeViewModel");
            throw null;
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        PasscodeControlView passcodeControlView = this.f52127k;
        if (passcodeControlView != null && passcodeControlView.f51883q == null) {
            passcodeControlView.f51883q = this;
        }
        qr2.d dVar = this.f52126j;
        if (dVar == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        dVar.f146939d = this;
        if (dVar == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        f52122o.debug("onResume(): passcodeViewModel.passcodeStep.value={}", dVar.f146946k.d());
        qr2.d dVar2 = this.f52126j;
        if (dVar2 == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        if (dVar2.f146946k.d() == qr2.d.c.PASSCODE_NOT_CONFIRMED) {
            ca();
            return;
        }
        qr2.d dVar3 = this.f52126j;
        if (dVar3 == null) {
            s.m("passcodeViewModel");
            throw null;
        }
        if (dVar3.f146946k.d() != qr2.d.c.ENTER_EXISTING_PASSCODE) {
            qr2.d dVar4 = this.f52126j;
            if (dVar4 == null) {
                s.m("passcodeViewModel");
                throw null;
            }
            if (dVar4.f146946k.d() != qr2.d.c.LOCKED_WALLET) {
                qr2.d dVar5 = this.f52126j;
                if (dVar5 == null) {
                    s.m("passcodeViewModel");
                    throw null;
                }
                if (dVar5.f146946k.d() == qr2.d.c.WALLET_ERROR_LOAD_STATE) {
                    br2.c.f19585a.g(new pr2.a(this, 2), this);
                    return;
                }
                return;
            }
        }
        ia();
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/passcode/PasscodeEntryActivity$a;", "", "<init>", "()V", "", "WALLET_RESET_RESULT_CODE", "I", "WALLET_PASSCODE_BLOCKED_RESULT_CODE", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, Long l14, String str) {
            aVar.getClass();
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) PasscodeEntryActivity.class);
            intent.putExtra("device.unit.id", l14);
            intent.putExtra("device.name", str);
            intent.putExtra("extra.wallet.item", (Parcelable) null);
            intent.putExtra("extra.change.passcode", true);
            return intent;
        }

        public static Intent b(hn2.c cVar, Long l14, String str, qs2.d dVar) {
            Intent intent = new Intent(cVar, (Class<?>) PasscodeEntryActivity.class);
            intent.putExtra("device.unit.id", l14);
            intent.putExtra("device.name", str);
            intent.putExtra("extra.wallet.item", dVar);
            intent.putExtra("extra.change.passcode", false);
            return intent;
        }

        private a() {
        }
    }
}
