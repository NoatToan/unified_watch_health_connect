package pr2;

import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.common.PasscodeControlView;
import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import e23.l;
import lc.u0;
import og2.k;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PasscodeEntryActivity f139642b;

    public /* synthetic */ c(PasscodeEntryActivity passcodeEntryActivity, int i14) {
        this.f139641a = i14;
        this.f139642b = passcodeEntryActivity;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0138  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f139641a;
        int iIntValue = 0;
        PasscodeEntryActivity passcodeEntryActivity = this.f139642b;
        switch (i14) {
            case 0:
                PasscodeEntryActivity.a aVar = PasscodeEntryActivity.f52121n;
                passcodeEntryActivity.ga(s.g((Boolean) obj, Boolean.TRUE));
                return Unit.INSTANCE;
            case 1:
                Integer num = (Integer) obj;
                if (num != null) {
                    PasscodeEntryActivity.a aVar2 = PasscodeEntryActivity.f52121n;
                    iIntValue = num.intValue();
                }
                if (iIntValue < 3) {
                    qr2.d dVar = passcodeEntryActivity.f52126j;
                    if (dVar == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    dVar.f146950o = true;
                }
                qr2.d dVar2 = passcodeEntryActivity.f52126j;
                if (dVar2 == null) {
                    s.m("passcodeViewModel");
                    throw null;
                }
                if (dVar2.f146946k.d() == qr2.d.c.ENTER_EXISTING_PASSCODE) {
                    passcodeEntryActivity.ia();
                } else {
                    qr2.d dVar3 = passcodeEntryActivity.f52126j;
                    if (dVar3 == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    if (dVar3.f146946k.d() == qr2.d.c.LOCKED_WALLET) {
                        passcodeEntryActivity.ia();
                    }
                }
                return Unit.INSTANCE;
            default:
                qr2.d.c cVar = (qr2.d.c) obj;
                PasscodeEntryActivity.a aVar3 = PasscodeEntryActivity.f52121n;
                i.a supportActionBar = passcodeEntryActivity.getSupportActionBar();
                if (supportActionBar != null) {
                    qr2.d dVar4 = passcodeEntryActivity.f52126j;
                    if (dVar4 == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    supportActionBar.C(dVar4.f146954t);
                }
                Toolbar toolbar = (Toolbar) passcodeEntryActivity.findViewById(R.id.toolbar);
                if (toolbar != null) {
                    qr2.d dVar5 = passcodeEntryActivity.f52126j;
                    if (dVar5 == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    k.G(toolbar, dVar5.f146954t);
                }
                PasscodeControlView passcodeControlView = passcodeEntryActivity.f52127k;
                if (passcodeControlView != null) {
                    qr2.d dVar6 = passcodeEntryActivity.f52126j;
                    if (dVar6 == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    passcodeControlView.setMainCaptionText(dVar6.f146951p);
                }
                PasscodeControlView passcodeControlView2 = passcodeEntryActivity.f52127k;
                if (passcodeControlView2 != null) {
                    qr2.d dVar7 = passcodeEntryActivity.f52126j;
                    if (dVar7 == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    passcodeControlView2.setSecondaryText(dVar7.f146952q);
                }
                PasscodeControlView passcodeControlView3 = passcodeEntryActivity.f52127k;
                if (passcodeControlView3 != null) {
                    qr2.d dVar8 = passcodeEntryActivity.f52126j;
                    if (dVar8 == null) {
                        s.m("passcodeViewModel");
                        throw null;
                    }
                    passcodeControlView3.setSecondaryTextType(dVar8.f146953r);
                }
                Logger logger = PasscodeEntryActivity.f52122o;
                com.airbnb.lottie.animation.keyframe.a.w("transitionViewToState: newState=", cVar != null ? cVar.name() : null, logger);
                switch (cVar == null ? -1 : PasscodeEntryActivity.b.f52130a[cVar.ordinal()]) {
                    case -1:
                        logger.debug("transitionViewToState state is null");
                        break;
                    case 0:
                    default:
                        u0.r();
                        return null;
                    case 1:
                    case 2:
                        PasscodeControlView passcodeControlView4 = passcodeEntryActivity.f52127k;
                        if (passcodeControlView4 != null) {
                            passcodeControlView4.f51872f.setVisibility(8);
                        }
                        break;
                    case 3:
                    case 4:
                        PasscodeControlView passcodeControlView5 = passcodeEntryActivity.f52127k;
                        if (passcodeControlView5 != null) {
                            String string = passcodeEntryActivity.getString(R.string.wallet_forgot_your_passcode_title);
                            oq.a aVar4 = new oq.a(passcodeEntryActivity, 4);
                            Button button = passcodeControlView5.f51872f;
                            button.setVisibility(0);
                            button.setText(string);
                            button.setOnClickListener(aVar4);
                        }
                        break;
                    case 5:
                        passcodeEntryActivity.fa(-1);
                        passcodeEntryActivity.finish();
                        break;
                    case 6:
                        PasscodeControlView passcodeControlView6 = passcodeEntryActivity.f52127k;
                        if (passcodeControlView6 != null) {
                            passcodeControlView6.f51872f.setVisibility(8);
                        }
                        passcodeEntryActivity.ca();
                        break;
                    case 7:
                        PasscodeControlView passcodeControlView7 = passcodeEntryActivity.f52127k;
                        if (passcodeControlView7 != null) {
                            passcodeControlView7.f51872f.setVisibility(8);
                        }
                        passcodeEntryActivity.fa(11);
                        passcodeEntryActivity.finish();
                        break;
                    case 8:
                        br2.c.f19585a.g(new a(passcodeEntryActivity, 3), passcodeEntryActivity);
                        break;
                    case 9:
                        passcodeEntryActivity.fa(-1);
                        passcodeEntryActivity.finish();
                        break;
                }
                return Unit.INSTANCE;
        }
    }
}
