package com.garmin.feature.garminpay.providers.gpay.snowball.ui;

import android.content.DialogInterface;
import au0.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.InvalidAppletException;
import cw1.k0;
import e23.l;
import fo2.q;
import lc.u0;
import p005kotlin.Unit;
import p90.h;
import po2.e0;
import po2.o;
import po2.x;

/* JADX INFO: loaded from: classes11.dex */
public interface e extends vq2.b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f51324b;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.ISSUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.TOPUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.BACKUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q.RESTORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f51323a = iArr;
            int[] iArr2 = new int[d.b.values().length];
            try {
                iArr2[d.b.f51274a.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[d.b.f51275b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f51324b = iArr2;
        }
    }

    default void B4(String str, q qVar, x xVar) {
        str.getClass();
        Z5(new h(qVar, 4, str, xVar));
    }

    default void B5(l lVar, String str) {
        str.getClass();
        Z5(new g(str, lVar, 6));
    }

    default void D5(double d14, o oVar) {
        Z5(new e0(0, d14, oVar));
    }

    default void H4(double d14, o oVar) {
        Z5(new e0(1, d14, oVar));
    }

    default void L6(l lVar, String str) {
        str.getClass();
        Z5(new g(str, lVar, 7));
    }

    default void X0(int i14, o oVar) {
        Z5(new ap.b(i14, oVar, 15));
    }

    default void Y7(String str, String str2, x xVar, o oVar) {
        str2.getClass();
        Z5(new mt0.e0(str, str2, xVar, oVar));
    }

    default void Z2(l lVar, String str) {
        t6(R.string.wallet_title_remove_card_error, str, lVar);
    }

    default void Z6(String str, x xVar, o oVar) {
        Z5(new h(str, 2, xVar, oVar));
    }

    default void a4(l lVar, String str) {
        Z5(new h(str, 3, lVar, (b) this));
    }

    default void c2(l<? super DialogInterface, Unit> lVar) {
        Z5(new na0.l(lVar, 27));
    }

    default void d8(l lVar, String str) {
        t6(R.string.wallet_title_failed_to_transfer_card, str, lVar);
    }

    default void g6(d.b bVar, final o oVar) {
        bVar.getClass();
        int i14 = a.f51324b[bVar.ordinal()];
        if (i14 == 1) {
            final int i15 = 0;
            Z5(new l() { // from class: po2.d0
                @Override // e23.l
                public final Object invoke(Object obj) {
                    androidx.appcompat.app.e.a aVar = (androidx.appcompat.app.e.a) obj;
                    switch (i15) {
                        case 0:
                            aVar.getClass();
                            aVar.setTitle(R.string.wallet_title_unable_to_transfer_card);
                            aVar.setMessage(R.string.wallet_cannot_transfer_while_in_transit);
                            aVar.setCancelable(false);
                            final int i16 = 1;
                            final o oVar2 = oVar;
                            aVar.setPositiveButton(R.string.lbl_ok, new DialogInterface.OnClickListener() { // from class: po2.f0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i17) {
                                    switch (i16) {
                                        case 0:
                                            dialogInterface.getClass();
                                            oVar2.invoke(dialogInterface);
                                            break;
                                        default:
                                            dialogInterface.getClass();
                                            oVar2.invoke(dialogInterface);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            aVar.getClass();
                            aVar.setTitle(R.string.wallet_unable_to_remove_card);
                            aVar.setMessage(R.string.wallet_suica_error_in_transit);
                            aVar.setCancelable(false);
                            final int i17 = 0;
                            final o oVar3 = oVar;
                            aVar.setPositiveButton(R.string.lbl_ok, new DialogInterface.OnClickListener() { // from class: po2.f0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i18) {
                                    switch (i17) {
                                        case 0:
                                            dialogInterface.getClass();
                                            oVar3.invoke(dialogInterface);
                                            break;
                                        default:
                                            dialogInterface.getClass();
                                            oVar3.invoke(dialogInterface);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        } else if (i14 != 2) {
            u0.r();
        } else {
            final int i16 = 1;
            Z5(new l() { // from class: po2.d0
                @Override // e23.l
                public final Object invoke(Object obj) {
                    androidx.appcompat.app.e.a aVar = (androidx.appcompat.app.e.a) obj;
                    switch (i16) {
                        case 0:
                            aVar.getClass();
                            aVar.setTitle(R.string.wallet_title_unable_to_transfer_card);
                            aVar.setMessage(R.string.wallet_cannot_transfer_while_in_transit);
                            aVar.setCancelable(false);
                            final int i17 = 1;
                            final o oVar2 = oVar;
                            aVar.setPositiveButton(R.string.lbl_ok, new DialogInterface.OnClickListener() { // from class: po2.f0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i18) {
                                    switch (i17) {
                                        case 0:
                                            dialogInterface.getClass();
                                            oVar2.invoke(dialogInterface);
                                            break;
                                        default:
                                            dialogInterface.getClass();
                                            oVar2.invoke(dialogInterface);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            aVar.getClass();
                            aVar.setTitle(R.string.wallet_unable_to_remove_card);
                            aVar.setMessage(R.string.wallet_suica_error_in_transit);
                            aVar.setCancelable(false);
                            final int i18 = 0;
                            final o oVar3 = oVar;
                            aVar.setPositiveButton(R.string.lbl_ok, new DialogInterface.OnClickListener() { // from class: po2.f0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i19) {
                                    switch (i18) {
                                        case 0:
                                            dialogInterface.getClass();
                                            oVar3.invoke(dialogInterface);
                                            break;
                                        default:
                                            dialogInterface.getClass();
                                            oVar3.invoke(dialogInterface);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    default void g9(l lVar, String str) {
        t6(R.string.wallet_title_add_card_failure, str, lVar);
    }

    default void l4(x xVar) {
        Z5(new ph1.d(6, xVar, (b) this));
    }

    default void l7(l<? super DialogInterface, Unit> lVar) {
        Z5(new na0.l(lVar, 28));
    }

    default void r5(InvalidAppletException.a aVar, l<? super DialogInterface, Unit> lVar) {
        aVar.getClass();
        Z5(new ph1.d(7, aVar, lVar));
    }

    default void t6(int i14, String str, l<? super DialogInterface, Unit> lVar) {
        Z5(new k0(i14, str, lVar, this));
    }
}
