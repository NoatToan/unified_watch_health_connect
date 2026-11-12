package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes3.dex */
public final class zay extends RemoteCreator<zam> {
    private static final zay c = new zay();

    private zay() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    private final View a(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        try {
            zaw zawVar = new zaw(i, i2, null);
            return (View) ObjectWrapper.unwrap(getRemoteCreatorInstance(context).zaa(ObjectWrapper.wrap(context), zawVar));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new RemoteCreator.RemoteCreatorException(sb.toString(), e);
        }
    }

    public static View zaa(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        return c.a(context, i, i2);
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ zam getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof zam ? (zam) iInterfaceQueryLocalInterface : new zal(iBinder);
    }
}
