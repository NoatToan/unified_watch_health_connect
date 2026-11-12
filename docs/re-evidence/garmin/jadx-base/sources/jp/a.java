package jp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import com.garmin.feature.garminpay.ui.selectcarddestination.CardDestinationSelectionActivity;
import d62.s;
import fb1.c;
import java.util.Arrays;
import js2.d;
import js2.e;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import ps2.n;
import ps2.w;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f99846b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f99845a = i14;
        this.f99846b = obj;
    }

    private final void b(Object obj) {
        UCropImageActivity uCropImageActivity = (UCropImageActivity) this.f99846b;
        Uri uri = (Uri) obj;
        UCropImageActivity.a aVar = UCropImageActivity.f44623o;
        if (uri != null) {
            try {
                uCropImageActivity.getContentResolver().takePersistableUriPermission(uri, 1);
                uCropImageActivity.f44626c = uri;
                uCropImageActivity.f44632i = null;
                uCropImageActivity.f44633j = 0.0f;
                uCropImageActivity.da();
            } catch (Exception e4) {
                String strN = c.n("Failed to take persistable uri permission for new photo with exception: ", e4.getMessage());
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "UCropImageActivity", strN);
                Toast.makeText(uCropImageActivity, R.string.lbl_error_occurred, 0).show();
            }
        }
    }

    private final void c(Object obj) {
        String stringExtra;
        d dVar;
        final CardDestinationSelectionActivity cardDestinationSelectionActivity = (CardDestinationSelectionActivity) this.f99846b;
        f.a aVar = (f.a) obj;
        CardDestinationSelectionActivity.a aVar2 = CardDestinationSelectionActivity.f52143n;
        aVar.getClass();
        Intent intent = aVar.f67586b;
        Logger logger = CardDestinationSelectionActivity.f52144o;
        int i14 = aVar.f67585a;
        z.i("resultActivityLauncher: resultCode=", i14, logger);
        final int i15 = 0;
        cardDestinationSelectionActivity.f52150l = false;
        if (i14 == 0) {
            cardDestinationSelectionActivity.setResult(0);
            cardDestinationSelectionActivity.finish();
            return;
        }
        final long longExtra = intent != null ? intent.getLongExtra("device.unit.id", 0L) : 0L;
        if (intent == null || (stringExtra = intent.getStringExtra("device.name")) == null) {
            stringExtra = "";
        }
        if (i14 == -1) {
            Intent intent2 = new Intent();
            intent2.putExtra("device.unit.id", longExtra);
            intent2.putExtra("device.name", stringExtra);
            qs2.d dVar2 = cardDestinationSelectionActivity.f52148j;
            if (dVar2 != null) {
                intent2.putExtra("extra.wallet.item", dVar2);
            }
            Unit unit = Unit.INSTANCE;
            cardDestinationSelectionActivity.setResult(-1, intent2);
            cardDestinationSelectionActivity.finish();
            return;
        }
        e eVar = null;
        if (i14 == 11) {
            hn2.c.ba(cardDestinationSelectionActivity, Boolean.FALSE, null, null, 14);
            cardDestinationSelectionActivity.da(longExtra, stringExtra);
            return;
        }
        if (i14 != 12) {
            return;
        }
        hn2.c.ba(cardDestinationSelectionActivity, Boolean.FALSE, null, null, 14);
        cardDestinationSelectionActivity.ca();
        w.f140538a.getClass();
        n nVarI = w.i(longExtra);
        if (nVarI != null && (dVar = nVarI.f140513p) != null) {
            eVar = dVar.f100660a;
        }
        final int i16 = 1;
        if (eVar != e.BLOCKED_WALLET) {
            final String str = stringExtra;
            br2.c cVar = br2.c.f19585a;
            String string = cardDestinationSelectionActivity.getString(R.string.wallet_locked_title);
            string.getClass();
            x0 x0Var = x0.f105818a;
            String string2 = cardDestinationSelectionActivity.getString(R.string.wallet_locked_short_message);
            string2.getClass();
            final int i17 = 2;
            androidx.appcompat.app.e eVarQ = br2.c.q(cVar, cardDestinationSelectionActivity, string, String.format(string2, Arrays.copyOf(new Object[]{str}, 1)), new p(cardDestinationSelectionActivity.getString(R.string.wallet_reset_wallet_confirm), new e23.p() { // from class: rr2.b
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    int i18 = i17;
                    DialogInterface dialogInterface = (DialogInterface) obj2;
                    ((Integer) obj3).getClass();
                    CardDestinationSelectionActivity.a aVar3 = CardDestinationSelectionActivity.f52143n;
                    switch (i18) {
                        case 0:
                            dialogInterface.getClass();
                            CardDestinationSelectionActivity cardDestinationSelectionActivity2 = cardDestinationSelectionActivity;
                            fr2.a aVarCa = cardDestinationSelectionActivity2.ca();
                            long j8 = longExtra;
                            boolean zF4 = aVarCa.F4(j8);
                            String str2 = str;
                            if (!zF4) {
                                br2.c.f19585a.d(cardDestinationSelectionActivity2, str2, new a(cardDestinationSelectionActivity2, 0));
                            } else if (cardDestinationSelectionActivity2.f52150l) {
                                CardDestinationSelectionActivity.f52144o.debug("Passcode entry is in progress, just wait for the result");
                            } else {
                                cardDestinationSelectionActivity2.f52150l = true;
                                cardDestinationSelectionActivity2.f52151m.a(PasscodeEntryActivity.a.a(PasscodeEntryActivity.f52121n, cardDestinationSelectionActivity2, Long.valueOf(j8), str2), null);
                            }
                            dialogInterface.dismiss();
                            break;
                        case 1:
                            dialogInterface.getClass();
                            CardDestinationSelectionActivity cardDestinationSelectionActivity3 = cardDestinationSelectionActivity;
                            fr2.a aVarCa2 = cardDestinationSelectionActivity3.ca();
                            long j14 = longExtra;
                            boolean zF5 = aVarCa2.F4(j14);
                            String str3 = str;
                            if (zF5) {
                                br2.c.f19585a.o(cardDestinationSelectionActivity3, new s(cardDestinationSelectionActivity3, j14, str3, 6), new a(cardDestinationSelectionActivity3, 1));
                            } else {
                                br2.c.f19585a.d(cardDestinationSelectionActivity3, str3, new a(cardDestinationSelectionActivity3, 0));
                            }
                            dialogInterface.dismiss();
                            break;
                        default:
                            dialogInterface.getClass();
                            CardDestinationSelectionActivity cardDestinationSelectionActivity4 = cardDestinationSelectionActivity;
                            fr2.a aVarCa3 = cardDestinationSelectionActivity4.ca();
                            long j15 = longExtra;
                            boolean zF6 = aVarCa3.F4(j15);
                            String str4 = str;
                            if (zF6) {
                                br2.c.f19585a.o(cardDestinationSelectionActivity4, new s(cardDestinationSelectionActivity4, j15, str4, 6), new a(cardDestinationSelectionActivity4, 1));
                            } else {
                                br2.c.f19585a.d(cardDestinationSelectionActivity4, str4, new a(cardDestinationSelectionActivity4, 0));
                            }
                            dialogInterface.dismiss();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }), new p(cardDestinationSelectionActivity.getString(R.string.common_button_not_now), new e23.p() { // from class: rr2.c
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    int i18 = i16;
                    CardDestinationSelectionActivity cardDestinationSelectionActivity2 = cardDestinationSelectionActivity;
                    DialogInterface dialogInterface = (DialogInterface) obj2;
                    ((Integer) obj3).getClass();
                    CardDestinationSelectionActivity.a aVar3 = CardDestinationSelectionActivity.f52143n;
                    switch (i18) {
                        case 0:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            cardDestinationSelectionActivity2.setResult(0);
                            cardDestinationSelectionActivity2.finish();
                            break;
                        default:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            cardDestinationSelectionActivity2.setResult(0);
                            cardDestinationSelectionActivity2.finish();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }), null, false, 224);
            if (eVarQ != null) {
                eVarQ.show();
                return;
            }
            return;
        }
        br2.c cVar2 = br2.c.f19585a;
        String string3 = cardDestinationSelectionActivity.getString(R.string.wallet_locked_title);
        string3.getClass();
        x0 x0Var2 = x0.f105818a;
        String string4 = cardDestinationSelectionActivity.getString(R.string.wallet_locked_message);
        string4.getClass();
        String str2 = String.format(string4, Arrays.copyOf(new Object[]{stringExtra}, 1));
        final int i18 = 0;
        final String str3 = stringExtra;
        p pVar = new p(cardDestinationSelectionActivity.getString(R.string.wallet_change_passcode_lbl), new e23.p() { // from class: rr2.b
            @Override // e23.p
            public final Object invoke(Object obj2, Object obj3) {
                int i19 = i18;
                DialogInterface dialogInterface = (DialogInterface) obj2;
                ((Integer) obj3).getClass();
                CardDestinationSelectionActivity.a aVar3 = CardDestinationSelectionActivity.f52143n;
                switch (i19) {
                    case 0:
                        dialogInterface.getClass();
                        CardDestinationSelectionActivity cardDestinationSelectionActivity2 = cardDestinationSelectionActivity;
                        fr2.a aVarCa = cardDestinationSelectionActivity2.ca();
                        long j8 = longExtra;
                        boolean zF4 = aVarCa.F4(j8);
                        String str4 = str3;
                        if (!zF4) {
                            br2.c.f19585a.d(cardDestinationSelectionActivity2, str4, new a(cardDestinationSelectionActivity2, 0));
                        } else if (cardDestinationSelectionActivity2.f52150l) {
                            CardDestinationSelectionActivity.f52144o.debug("Passcode entry is in progress, just wait for the result");
                        } else {
                            cardDestinationSelectionActivity2.f52150l = true;
                            cardDestinationSelectionActivity2.f52151m.a(PasscodeEntryActivity.a.a(PasscodeEntryActivity.f52121n, cardDestinationSelectionActivity2, Long.valueOf(j8), str4), null);
                        }
                        dialogInterface.dismiss();
                        break;
                    case 1:
                        dialogInterface.getClass();
                        CardDestinationSelectionActivity cardDestinationSelectionActivity3 = cardDestinationSelectionActivity;
                        fr2.a aVarCa2 = cardDestinationSelectionActivity3.ca();
                        long j14 = longExtra;
                        boolean zF5 = aVarCa2.F4(j14);
                        String str5 = str3;
                        if (zF5) {
                            br2.c.f19585a.o(cardDestinationSelectionActivity3, new s(cardDestinationSelectionActivity3, j14, str5, 6), new a(cardDestinationSelectionActivity3, 1));
                        } else {
                            br2.c.f19585a.d(cardDestinationSelectionActivity3, str5, new a(cardDestinationSelectionActivity3, 0));
                        }
                        dialogInterface.dismiss();
                        break;
                    default:
                        dialogInterface.getClass();
                        CardDestinationSelectionActivity cardDestinationSelectionActivity4 = cardDestinationSelectionActivity;
                        fr2.a aVarCa3 = cardDestinationSelectionActivity4.ca();
                        long j15 = longExtra;
                        boolean zF6 = aVarCa3.F4(j15);
                        String str6 = str3;
                        if (zF6) {
                            br2.c.f19585a.o(cardDestinationSelectionActivity4, new s(cardDestinationSelectionActivity4, j15, str6, 6), new a(cardDestinationSelectionActivity4, 1));
                        } else {
                            br2.c.f19585a.d(cardDestinationSelectionActivity4, str6, new a(cardDestinationSelectionActivity4, 0));
                        }
                        dialogInterface.dismiss();
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        final int i19 = 1;
        androidx.appcompat.app.e eVarQ2 = br2.c.q(cVar2, cardDestinationSelectionActivity, string3, str2, pVar, new p(cardDestinationSelectionActivity.getString(R.string.wallet_reset_wallet_confirm), new e23.p() { // from class: rr2.b
            @Override // e23.p
            public final Object invoke(Object obj2, Object obj3) {
                int i110 = i19;
                DialogInterface dialogInterface = (DialogInterface) obj2;
                ((Integer) obj3).getClass();
                CardDestinationSelectionActivity.a aVar3 = CardDestinationSelectionActivity.f52143n;
                switch (i110) {
                    case 0:
                        dialogInterface.getClass();
                        CardDestinationSelectionActivity cardDestinationSelectionActivity2 = cardDestinationSelectionActivity;
                        fr2.a aVarCa = cardDestinationSelectionActivity2.ca();
                        long j8 = longExtra;
                        boolean zF4 = aVarCa.F4(j8);
                        String str4 = str3;
                        if (!zF4) {
                            br2.c.f19585a.d(cardDestinationSelectionActivity2, str4, new a(cardDestinationSelectionActivity2, 0));
                        } else if (cardDestinationSelectionActivity2.f52150l) {
                            CardDestinationSelectionActivity.f52144o.debug("Passcode entry is in progress, just wait for the result");
                        } else {
                            cardDestinationSelectionActivity2.f52150l = true;
                            cardDestinationSelectionActivity2.f52151m.a(PasscodeEntryActivity.a.a(PasscodeEntryActivity.f52121n, cardDestinationSelectionActivity2, Long.valueOf(j8), str4), null);
                        }
                        dialogInterface.dismiss();
                        break;
                    case 1:
                        dialogInterface.getClass();
                        CardDestinationSelectionActivity cardDestinationSelectionActivity3 = cardDestinationSelectionActivity;
                        fr2.a aVarCa2 = cardDestinationSelectionActivity3.ca();
                        long j14 = longExtra;
                        boolean zF5 = aVarCa2.F4(j14);
                        String str5 = str3;
                        if (zF5) {
                            br2.c.f19585a.o(cardDestinationSelectionActivity3, new s(cardDestinationSelectionActivity3, j14, str5, 6), new a(cardDestinationSelectionActivity3, 1));
                        } else {
                            br2.c.f19585a.d(cardDestinationSelectionActivity3, str5, new a(cardDestinationSelectionActivity3, 0));
                        }
                        dialogInterface.dismiss();
                        break;
                    default:
                        dialogInterface.getClass();
                        CardDestinationSelectionActivity cardDestinationSelectionActivity4 = cardDestinationSelectionActivity;
                        fr2.a aVarCa3 = cardDestinationSelectionActivity4.ca();
                        long j15 = longExtra;
                        boolean zF6 = aVarCa3.F4(j15);
                        String str6 = str3;
                        if (zF6) {
                            br2.c.f19585a.o(cardDestinationSelectionActivity4, new s(cardDestinationSelectionActivity4, j15, str6, 6), new a(cardDestinationSelectionActivity4, 1));
                        } else {
                            br2.c.f19585a.d(cardDestinationSelectionActivity4, str6, new a(cardDestinationSelectionActivity4, 0));
                        }
                        dialogInterface.dismiss();
                        break;
                }
                return Unit.INSTANCE;
            }
        }), new p(cardDestinationSelectionActivity.getString(R.string.common_button_not_now), new e23.p() { // from class: rr2.c
            @Override // e23.p
            public final Object invoke(Object obj2, Object obj3) {
                int i110 = i15;
                CardDestinationSelectionActivity cardDestinationSelectionActivity2 = cardDestinationSelectionActivity;
                DialogInterface dialogInterface = (DialogInterface) obj2;
                ((Integer) obj3).getClass();
                CardDestinationSelectionActivity.a aVar3 = CardDestinationSelectionActivity.f52143n;
                switch (i110) {
                    case 0:
                        dialogInterface.getClass();
                        dialogInterface.dismiss();
                        cardDestinationSelectionActivity2.setResult(0);
                        cardDestinationSelectionActivity2.finish();
                        break;
                    default:
                        dialogInterface.getClass();
                        dialogInterface.dismiss();
                        cardDestinationSelectionActivity2.setResult(0);
                        cardDestinationSelectionActivity2.finish();
                        break;
                }
                return Unit.INSTANCE;
            }
        }), false, 192);
        if (eVarQ2 != null) {
            eVarQ2.show();
        }
    }

    /* JADX WARN: Code duplicated, block: B:445:0x0992  */
    /* JADX WARN: Code duplicated, block: B:448:0x0999  */
    /* JADX WARN: Code duplicated, block: B:451:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:453:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:651:0x09d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x09d0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v140, types: [java.lang.Object, o13.l] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v20 java.lang.Object, still in use, count: 2, list:
          (r5v20 java.lang.Object) from 0x0af5: PHI (r5 I:??) = (r5v18 java.lang.Object), (r5v20 java.lang.Object) binds: [B:518:0x0af4, B:674:0x0af5] A[DONT_GENERATE, DONT_INLINE]
          (r5v20 java.lang.Object) from 0x0ae7: CHECK_CAST (l20.a) (r5v20 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // f.b
    public final void a(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 3390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.a.a(java.lang.Object):void");
    }
}
