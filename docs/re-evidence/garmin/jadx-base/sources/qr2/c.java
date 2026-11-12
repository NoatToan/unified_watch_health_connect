package qr2;

import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import e23.l;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f146934b;

    public /* synthetic */ c(d dVar, int i14) {
        this.f146933a = i14;
        this.f146934b = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f146933a;
        d dVar = this.f146934b;
        switch (i14) {
            case 0:
                d.f146935v.error("Something went wrong when trying to reset the wallet (" + ((Throwable) obj).getMessage() + ")");
                dVar.y4();
                break;
            case 1:
                js2.d dVar2 = (js2.d) obj;
                Logger logger = d.f146935v;
                dVar2.getClass();
                dVar.z4(dVar2);
                dVar.f146947l.m(Boolean.FALSE);
                break;
            case 2:
                PasscodeEntryActivity passcodeEntryActivity = dVar.f146939d;
                if (passcodeEntryActivity != null) {
                    passcodeEntryActivity.ea(d.b.WALLET_ACTION_GENERIC_ERROR);
                }
                break;
            case 3:
                d.f146935v.error("Something went wrong when trying to verify the existing passcoode (" + ((Throwable) obj).getMessage() + ")");
                dVar.y4();
                break;
            case 4:
                js2.a aVar = (js2.a) obj;
                Logger logger2 = d.f146935v;
                boolean z14 = aVar.f100647a;
                Integer num = aVar.f100649c;
                if (z14) {
                    dVar.f146946k.m(d.c.PASSCODE_CONFIRMED);
                } else {
                    int i15 = aVar.f100648b;
                    if (i15 != 12) {
                        if (i15 != 13) {
                            logger2.warn("Something went wrong when trying to update the passcode (" + i15 + ")");
                        } else {
                            dVar.A4(d.c.LOCKED_WALLET, 0);
                        }
                    } else if (aVar.f100650d) {
                        logger2.warn("Passcode change failed for BLOCKED wallet. (retries left: " + num + ")");
                        d.c cVar = d.c.LOCKED_WALLET;
                        if (num != null && num.intValue() == -1) {
                            num = 3;
                        }
                        dVar.A4(cVar, num);
                    } else {
                        logger2.warn("Something went wrong when trying to update the passcode (" + i15 + ")");
                    }
                }
                break;
            case 5:
                d.f146935v.error("Something went wrong when trying to update the passcode (" + ((Throwable) obj).getMessage() + ")");
                dVar.y4();
                break;
            default:
                d.f146935v.error("Something went wrong when trying to create the passcode (" + ((Throwable) obj).getMessage() + ")");
                dVar.y4();
                break;
        }
        return Unit.INSTANCE;
    }
}
