package com.facebook.react.views.modal;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static void a(ViewGroup viewGroup, MotionEvent motionEvent) {
        ((ReactModalHostView.b) viewGroup).c(motionEvent);
    }

    public static boolean b(ViewParent viewParent) {
        return viewParent instanceof ReactModalHostView.b;
    }
}
