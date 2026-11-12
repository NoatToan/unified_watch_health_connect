package com.chenenyu.router;

import android.net.Uri;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public interface RouteCallback extends Serializable {
    void callback(RouteStatus routeStatus, Uri uri, String str);
}
