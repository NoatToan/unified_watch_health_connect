package qr2;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.common.PasscodeControlView;
import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import java.util.Arrays;
import kg.f;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ps2.n;
import ps2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lqr2/d;", "Landroidx/lifecycle/u1;", "", "deviceUnitId", "", "deviceName", "Lhn2/a;", "appDelegate", "<init>", "(JLjava/lang/String;Lhn2/a;)V", "a", "c", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Logger f146935v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f146936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hn2.a f146938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PasscodeEntryActivity f146939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f146940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f146941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f146942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f146943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f146944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f146945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<c> f146946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0<Boolean> f146947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0<Integer> f146948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f146949n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f146950o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f146951p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f146952q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PasscodeControlView.b f146953r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f146954t;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqr2/d$b;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        WALLET_ACTION_GENERIC_ERROR,
        WALLET_ACTION_BT_OFF_ERROR,
        WALLET_ACTION_DISCONN_ERROR
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqr2/d$c;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        ENTER_EXISTING_PASSCODE,
        CREATE_NEW_PASSCODE,
        CONFIRM_PASSCODE,
        PASSCODE_CONFIRMED,
        PASSCODE_NOT_CONFIRMED,
        LOCKED_WALLET,
        WALLET_RESET,
        WALLET_ERROR_LOAD_STATE,
        CREATE_NEW_OWNER_DATA
    }

    /* JADX INFO: renamed from: qr2.d$d, reason: collision with other inner class name */
    public static final /* synthetic */ class C2766d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f146969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f146970b;

        static {
            int[] iArr = new int[js2.e.values().length];
            try {
                iArr[js2.e.LOCKED_WALLET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[js2.e.BLOCKED_WALLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[js2.e.PASSCODE_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f146969a = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.CREATE_NEW_PASSCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[c.ENTER_EXISTING_PASSCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[c.CONFIRM_PASSCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[c.PASSCODE_NOT_CONFIRMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[c.LOCKED_WALLET.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[c.WALLET_ERROR_LOAD_STATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[c.CREATE_NEW_OWNER_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            f146970b = iArr2;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f146935v = gt2.b.f79005a.h("PAY#CreateChangePasscode");
    }

    public d(long j8, String str, hn2.a aVar) {
        str.getClass();
        aVar.getClass();
        this.f146936a = j8;
        this.f146937b = str;
        this.f146938c = aVar;
        w.f140538a.getClass();
        this.f146940e = w.i(j8);
        this.f146951p = "";
        this.f146952q = "";
        this.f146953r = PasscodeControlView.b.NO_TEXT;
        this.f146954t = "";
        this.f146947l = new y0<>();
        this.f146948m = new y0<>();
        this.f146946k = new y0<>();
    }

    public final void A4(c cVar, Integer num) {
        f146935v.trace("setupStateForPasscodeStepInternal(" + cVar + ")");
        switch (C2766d.f146970b[cVar.ordinal()]) {
            case 1:
                if (!this.f146945j) {
                    this.f146954t = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_create_passcode_label);
                    this.f146951p = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_enter_passcode_message);
                    this.f146953r = PasscodeControlView.b.NO_TEXT;
                } else {
                    this.f146954t = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_create_new_passcode_lbl);
                    this.f146951p = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_enter_new_passcode);
                    this.f146953r = PasscodeControlView.b.NO_TEXT;
                }
                break;
            case 2:
                this.f146954t = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_change_passcode_lbl);
                this.f146951p = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_enter_old_passcode);
                break;
            case 3:
                this.f146953r = PasscodeControlView.b.NO_TEXT;
                if (!this.f146945j) {
                    this.f146954t = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_confirm_passcode);
                    this.f146951p = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_enter_passcode_again);
                } else {
                    this.f146954t = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_confirm_new_passcode);
                    this.f146951p = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_enter_new_passcode_again);
                }
                break;
            case 4:
                this.f146953r = PasscodeControlView.b.NO_TEXT;
                break;
            case 5:
                this.f146954t = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_change_passcode_lbl);
                this.f146951p = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_enter_old_passcode);
                break;
            case 6:
                this.f146954t = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_change_passcode_lbl);
                this.f146951p = f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_enter_old_passcode);
                break;
            case 7:
                this.f146954t = "";
                this.f146951p = "";
                this.f146952q = "";
                this.f146953r = PasscodeControlView.b.NO_TEXT;
                break;
        }
        this.f146946k.m(cVar);
        if (num != null) {
            this.f146948m.m(num);
            this.f146943h = false;
        }
    }

    public final String x4() {
        Integer numD = this.f146948m.d();
        if (numD == null) {
            return "";
        }
        int iIntValue = numD.intValue();
        return iIntValue != 1 ? String.format(f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_attempts_remaining), Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1)) : String.format(f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.wallet_attempt_remaining), Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1));
    }

    public final void y4() {
        this.f146947l.m(Boolean.FALSE);
        xr2.a.f192031a.getClass();
        if (!xr2.a.a()) {
            PasscodeEntryActivity passcodeEntryActivity = this.f146939d;
            if (passcodeEntryActivity != null) {
                passcodeEntryActivity.ea(b.WALLET_ACTION_BT_OFF_ERROR);
                return;
            }
            return;
        }
        n nVar = this.f146940e;
        hs2.b bVarH = nVar != null ? nVar.h() : null;
        hs2.b bVar = hs2.b.READY;
        PasscodeEntryActivity passcodeEntryActivity2 = this.f146939d;
        if (bVarH == bVar) {
            if (passcodeEntryActivity2 != null) {
                passcodeEntryActivity2.ea(b.WALLET_ACTION_GENERIC_ERROR);
            }
        } else if (passcodeEntryActivity2 != null) {
            passcodeEntryActivity2.ea(b.WALLET_ACTION_DISCONN_ERROR);
        }
    }

    public final void z4(js2.d dVar) {
        Boolean bool = dVar.f100665f;
        Integer num = dVar.f100663d;
        boolean zG = s.g(bool, Boolean.TRUE);
        this.f146945j = zG;
        js2.e eVar = dVar.f100660a;
        if (!zG) {
            A4(c.CREATE_NEW_PASSCODE, null);
            return;
        }
        f146935v.debug("Current device state = " + eVar);
        int i14 = C2766d.f146969a[eVar.ordinal()];
        if (i14 == 1) {
            A4(c.LOCKED_WALLET, 0);
            return;
        }
        if (i14 == 2) {
            this.f146943h = true;
            this.f146944i = true;
            A4(c.LOCKED_WALLET, Integer.valueOf(num != null ? num.intValue() : 3));
        } else {
            if (i14 != 3) {
                A4(c.WALLET_ERROR_LOAD_STATE, null);
                return;
            }
            int iIntValue = num != null ? num.intValue() : 3;
            if (iIntValue < 3) {
                this.f146949n = true;
            }
            A4(c.ENTER_EXISTING_PASSCODE, Integer.valueOf(iIntValue));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqr2/d$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
