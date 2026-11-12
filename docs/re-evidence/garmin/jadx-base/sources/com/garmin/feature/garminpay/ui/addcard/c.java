package com.garmin.feature.garminpay.ui.addcard;

import android.content.DialogInterface;
import androidx.appcompat.app.e;
import bm.y;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import lc.u0;
import o13.p;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public static final ar2.a.b a(dr2.a.InterfaceC1294a interfaceC1294a, e23.a<String> aVar) {
        if (interfaceC1294a instanceof dr2.a.InterfaceC1294a.C1295a) {
            return new ar2.a.b.C0175a(aVar.invoke());
        }
        if (interfaceC1294a instanceof dr2.a.InterfaceC1294a.c) {
            return new ar2.a.b.c(((dr2.a.InterfaceC1294a.c) interfaceC1294a).f60855a, aVar.invoke());
        }
        if (interfaceC1294a instanceof dr2.a.InterfaceC1294a.e) {
            return ar2.a.b.e.f12570a;
        }
        if (interfaceC1294a instanceof dr2.a.InterfaceC1294a.g) {
            dr2.a.InterfaceC1294a.g gVar = (dr2.a.InterfaceC1294a.g) interfaceC1294a;
            return new ar2.a.b.g(gVar.f60859a, gVar.f60860b);
        }
        if (interfaceC1294a instanceof dr2.a.InterfaceC1294a.d) {
            return new ar2.a.b.d(aVar.invoke());
        }
        if (interfaceC1294a instanceof dr2.a.InterfaceC1294a.f) {
            return ar2.a.b.f.f12571a;
        }
        if (interfaceC1294a instanceof dr2.a.InterfaceC1294a.b) {
            return ar2.a.b.C0176b.f12566a;
        }
        u0.r();
        return null;
    }

    public static final void b(final hn2.c cVar, ar2.a.b bVar) {
        cVar.getClass();
        bVar.getClass();
        if (bVar instanceof ar2.a.b.c) {
            br2.c cVar2 = br2.c.f19585a;
            String string = cVar.getString(R.string.wallet_card_limit_reached);
            string.getClass();
            ar2.a.b.c cVar3 = (ar2.a.b.c) bVar;
            String str = cVar3.f12567a;
            String string2 = cVar.getString(R.string.wallet_error_cannot_add_more_card, str, str, cVar3.f12568b);
            string2.getClass();
            String string3 = cVar.getString(R.string.lbl_ok);
            string3.getClass();
            final int i14 = 0;
            e eVarQ = br2.c.q(cVar2, cVar, string, string2, new p(string3, new e23.p() { // from class: zq2.h
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = i14;
                    DialogInterface dialogInterface = (DialogInterface) obj;
                    ((Integer) obj2).intValue();
                    switch (i15) {
                        case 0:
                            dialogInterface.getClass();
                            cVar.finish();
                            break;
                        case 1:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            cVar.finish();
                            break;
                        default:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            cVar.finish();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
            if (eVarQ != null) {
                eVarQ.show();
                return;
            }
            return;
        }
        if (bVar instanceof ar2.a.b.e) {
            br2.c cVar4 = br2.c.f19585a;
            String string4 = cVar.getString(R.string.wallet_title_maintenance_notice);
            string4.getClass();
            String string5 = cVar.getString(R.string.wallet_message_urgent_maintenance_notice);
            string5.getClass();
            String string6 = cVar.getString(R.string.lbl_ok);
            string6.getClass();
            e eVarQ2 = br2.c.q(cVar4, cVar, string4, string5, new p(string6, new z21.a((byte) 0, 27)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
            if (eVarQ2 != null) {
                eVarQ2.show();
                return;
            }
            return;
        }
        if (bVar instanceof ar2.a.b.g) {
            br2.c cVar5 = br2.c.f19585a;
            String string7 = cVar.getString(R.string.wallet_card_limit_reached);
            string7.getClass();
            String string8 = cVar.getString(R.string.max_cards_reached_message);
            string8.getClass();
            String string9 = cVar.getString(R.string.lbl_ok);
            string9.getClass();
            final int i15 = 1;
            e eVarQ3 = br2.c.q(cVar5, cVar, string7, string8, new p(string9, new e23.p() { // from class: zq2.h
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = i15;
                    DialogInterface dialogInterface = (DialogInterface) obj;
                    ((Integer) obj2).intValue();
                    switch (i16) {
                        case 0:
                            dialogInterface.getClass();
                            cVar.finish();
                            break;
                        case 1:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            cVar.finish();
                            break;
                        default:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            cVar.finish();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
            if (eVarQ3 != null) {
                eVarQ3.show();
                return;
            }
            return;
        }
        if (bVar instanceof ar2.a.b.C0176b) {
            br2.c cVar6 = br2.c.f19585a;
            String string10 = cVar.getString(R.string.dialog_title_error);
            string10.getClass();
            String string11 = cVar.getString(R.string.txt_error_occurred);
            string11.getClass();
            String string12 = cVar.getString(R.string.lbl_ok);
            string12.getClass();
            final int i16 = 2;
            e eVarQ4 = br2.c.q(cVar6, cVar, string10, string11, new p(string12, new e23.p() { // from class: zq2.h
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = i16;
                    DialogInterface dialogInterface = (DialogInterface) obj;
                    ((Integer) obj2).intValue();
                    switch (i17) {
                        case 0:
                            dialogInterface.getClass();
                            cVar.finish();
                            break;
                        case 1:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            cVar.finish();
                            break;
                        default:
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            cVar.finish();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
            if (eVarQ4 != null) {
                eVarQ4.show();
                return;
            }
            return;
        }
        if (bVar instanceof ar2.a.b.d) {
            String string13 = cVar.getString(R.string.common_se_memory_full_title);
            string13.getClass();
            String string14 = cVar.getString(R.string.common_se_memory_full_description, ((ar2.a.b.d) bVar).f12569a);
            string14.getClass();
            String string15 = cVar.getString(R.string.lbl_ok);
            string15.getClass();
            e eVarQ5 = br2.c.q(br2.c.f19585a, cVar, string13, string14, new p(string15, new z21.a((byte) 0, 28)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
            if (eVarQ5 != null) {
                eVarQ5.show();
                return;
            }
            return;
        }
        if (!(bVar instanceof ar2.a.b.f)) {
            if (bVar instanceof ar2.a.b.C0175a) {
                br2.c.f19585a.d(cVar, ((ar2.a.b.C0175a) bVar).f12565a, new y(15));
                return;
            } else if (bVar instanceof ar2.a.b.h) {
                hn2.c.ba(cVar, Boolean.valueOf(((ar2.a.b.h) bVar).f12574a), null, null, 14);
                return;
            } else {
                u0.r();
                return;
            }
        }
        kj0.c.f104941a.getClass();
        String strB = kj0.c.b();
        String strA = kj0.c.a();
        String string16 = cVar.getString(R.string.lbl_ok);
        string16.getClass();
        e eVarQ6 = br2.c.q(br2.c.f19585a, cVar, strB, strA, new p(string16, new z21.a((byte) 0, 29)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ6 != null) {
            eVarQ6.show();
        }
    }
}
