package com.google.android.gms.maps.model;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.a;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class AdvancedMarker extends Marker {
    public AdvancedMarker(com.google.android.gms.internal.maps.zzaj zzajVar) {
        super(zzajVar);
    }

    public View getIconView() {
        try {
            return (View) ObjectWrapper.unwrap(this.zza.zzh());
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public void setIconView(View view2) {
        if (view2 != null && view2.getParent() != null) {
            h.s("View already has a parent, can not be used as Marker");
            return;
        }
        try {
            this.zza.zzu(ObjectWrapper.wrap(view2));
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }
}
