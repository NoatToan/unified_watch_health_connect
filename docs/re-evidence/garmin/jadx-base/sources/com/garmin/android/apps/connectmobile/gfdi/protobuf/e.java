package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.content.DialogInterface;
import e23.l;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f35729b;

    public /* synthetic */ e(l lVar, int i14) {
        this.f35728a = i14;
        this.f35729b = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f35728a;
        l lVar = this.f35729b;
        switch (i15) {
            case 0:
                LimitedUiProtobufDataHandler.createDialog$lambda$0$0$0(lVar, dialogInterface, i14);
                break;
            case 1:
                LimitedUiProtobufDataHandler.createDialog$lambda$0$0$1(lVar, dialogInterface, i14);
                break;
            case 2:
                dialogInterface.dismiss();
                lVar.invoke(Boolean.TRUE);
                break;
            case 3:
                lVar.invoke(Boolean.TRUE);
                dialogInterface.dismiss();
                break;
            case 4:
                lVar.invoke(Boolean.FALSE);
                dialogInterface.dismiss();
                break;
            case 5:
                lVar.invoke(Boolean.TRUE);
                dialogInterface.dismiss();
                break;
            case 6:
                lVar.invoke(Boolean.FALSE);
                dialogInterface.dismiss();
                break;
            case 7:
                dialogInterface.dismiss();
                lVar.invoke(Boolean.TRUE);
                break;
            case 8:
                dialogInterface.dismiss();
                lVar.invoke(Boolean.FALSE);
                break;
            case 9:
                dialogInterface.getClass();
                lVar.invoke(dialogInterface);
                break;
            case 10:
                dialogInterface.getClass();
                lVar.invoke(dialogInterface);
                break;
            case 11:
                dialogInterface.getClass();
                lVar.invoke(dialogInterface);
                break;
            case 12:
                dialogInterface.getClass();
                lVar.invoke(dialogInterface);
                break;
            case 13:
                dialogInterface.getClass();
                lVar.invoke(dialogInterface);
                break;
            case 14:
                dialogInterface.getClass();
                lVar.invoke(dialogInterface);
                break;
            case 15:
                dialogInterface.getClass();
                lVar.invoke(dialogInterface);
                break;
            case 16:
                int i16 = vq2.b.f179457y0;
                dialogInterface.getClass();
                lVar.invoke(dialogInterface);
                dialogInterface.dismiss();
                break;
            case 17:
                int i17 = vq2.b.f179457y0;
                dialogInterface.getClass();
                lVar.invoke(dialogInterface);
                dialogInterface.dismiss();
                break;
            case 18:
                int i18 = vq2.b.f179457y0;
                dialogInterface.dismiss();
                lVar.invoke(dialogInterface);
                break;
            case 19:
                int i19 = vq2.b.f179457y0;
                dialogInterface.dismiss();
                lVar.invoke(dialogInterface);
                break;
            case 20:
                int i24 = yn2.b.G0;
                dialogInterface.dismiss();
                lVar.invoke(dialogInterface);
                break;
            case 21:
                int i25 = yn2.b.G0;
                dialogInterface.getClass();
                lVar.invoke(dialogInterface);
                break;
            default:
                int i26 = yn2.b.G0;
                dialogInterface.dismiss();
                lVar.invoke(dialogInterface);
                break;
        }
    }
}
