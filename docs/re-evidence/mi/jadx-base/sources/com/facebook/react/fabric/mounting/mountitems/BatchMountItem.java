package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.systrace.Systrace;
import defpackage.cm8;
import defpackage.lm8;
import defpackage.v07;
import defpackage.x8g;
import defpackage.y8g;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class BatchMountItem implements x8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8g[] f7353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7354b;
    public final int c;

    public BatchMountItem(x8g[] x8gVarArr, int i, int i2) {
        x8gVarArr.getClass();
        if (i >= 0 && i <= x8gVarArr.length) {
            this.f7353a = x8gVarArr;
            this.f7354b = i;
            this.c = i2;
        } else {
            throw new IllegalArgumentException("Invalid size received by parameter size: " + i + " items.size = " + x8gVarArr.length);
        }
    }

    @Override // defpackage.x8g
    public void a(y8g y8gVar) {
        Systrace.c(0L, "FabricUIManager::mountViews - " + this.f7354b + " items");
        int i = this.c;
        if (i > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i);
        }
        for (int i2 = 0; i2 < this.f7354b; i2++) {
            x8g x8gVar = this.f7353a[i2];
            if (lm8.s) {
                cm8.b(lm8.f25208r, "Executing mountItem: " + x8gVar);
            }
            x8gVar.a(y8gVar);
        }
        int i3 = this.c;
        if (i3 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i3);
        }
        Systrace.g(0L);
    }

    public String toString() {
        return "BatchMountItem - size " + this.f7353a.length;
    }
}
