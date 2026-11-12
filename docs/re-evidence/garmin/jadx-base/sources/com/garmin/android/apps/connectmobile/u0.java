package com.garmin.android.apps.connectmobile;

import android.view.View;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/u0;", "Lcom/garmin/android/apps/connectmobile/b0;", "", "contentLayoutId", "", "isResizable", "isFullScreen", "headerLayoutId", "<init>", "(IZZI)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class u0 extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46489f;

    public /* synthetic */ u0(int i14, boolean z14, boolean z15, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i16 & 2) != 0 ? false : z14, (i16 & 4) != 0 ? false : z15, (i16 & 8) != 0 ? R.layout.close_action_bottom_sheet_header : i15);
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void v6(View view2) {
        new k32.f(view2).a(w6(), y6(), new c32.k(this, 17), this.f46489f);
    }

    public abstract String w6();

    public abstract String y6();

    public u0(int i14, boolean z14, boolean z15, int i15) {
        super(i15, i14, z15, false, z14, 8, null);
        this.f46489f = z14;
    }
}
