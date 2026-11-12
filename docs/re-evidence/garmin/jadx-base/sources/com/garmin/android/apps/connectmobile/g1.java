package com.garmin.android.apps.connectmobile;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: loaded from: classes7.dex */
public final class g1 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35289a;

        static {
            int[] iArr = new int[com.garmin.android.library.backgroundtaskmanagement.b.c.values().length];
            try {
                iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35289a = iArr;
        }
    }

    public static final void a(Context context, fw.c cVar) {
        context.getClass();
        if (cVar == null || (cVar instanceof fw.h) || (cVar instanceof fw.o)) {
            return;
        }
        Toast.makeText(context, R.string.txt_error_occurred, 0).show();
    }

    public static final void b(c cVar, com.garmin.android.library.backgroundtaskmanagement.b.c cVar2) {
        cVar.getClass();
        cVar2.getClass();
        int i14 = a.f35289a[cVar2.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            return;
        }
        Toast.makeText(cVar, R.string.txt_error_occurred, 0).show();
    }
}
