package com.huawei.hms.kit.awareness.barrier.internal.a.f;

import android.content.Context;
import android.os.Parcel;
import com.huawei.hms.kit.awareness.AwarenessStatusCodes;
import com.huawei.hms.kit.awareness.barrier.internal.b.h;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes34.dex */
public abstract class f extends com.huawei.hms.kit.awareness.barrier.internal.a.c implements com.huawei.hms.kit.awareness.barrier.internal.e.b {
    private static final String l = "TimeCondition";
    h k;

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public boolean c() {
        return true;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int d() {
        return 4;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int o() {
        return 10;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public void b() {
        com.huawei.hms.kit.awareness.b.a.c.a(l, "rootConditionCheck check result:" + s(), new Object[0]);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int b(Context context) {
        if (c(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return !d(context, "android.permission.ACCESS_FINE_LOCATION") ? 10102 : 0;
        }
        return AwarenessStatusCodes.AWARENESS_LOCATION_PERMISSION_CODE;
    }

    public void a(com.huawei.hms.kit.awareness.barrier.internal.b.f fVar) {
        if (fVar instanceof h) {
            if (fVar.c()) {
                this.k = (h) fVar;
            }
            com.huawei.hms.kit.awareness.b.a.c.a(l, "rootConditionCheck check result:" + s(), new Object[0]);
        }
    }

    int a(TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        return calendar.get(7);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int a(Context context) {
        if (a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return !b(context, "android.permission.ACCESS_FINE_LOCATION") ? 10102 : 0;
        }
        return AwarenessStatusCodes.AWARENESS_LOCATION_PERMISSION_CODE;
    }

    int a(long j, long j2, long j3) {
        if (j < j2) {
            this.q = j2;
            u();
            com.huawei.hms.kit.awareness.b.a.c.a(l, "CurrentTime is lower than start!", new Object[0]);
            return 0;
        }
        if (j < j3) {
            this.q = j3;
            u();
            com.huawei.hms.kit.awareness.b.a.c.a(l, "CurrentTime is between start and stop!", new Object[0]);
            return 1;
        }
        com.huawei.hms.kit.awareness.b.a.c.a(l, "CurrentTime is bigger than stop!", new Object[0]);
        return 0;
    }

    f(Parcel parcel) {
        super(parcel);
        this.k = new h();
    }

    f() {
        this.k = new h();
    }
}
