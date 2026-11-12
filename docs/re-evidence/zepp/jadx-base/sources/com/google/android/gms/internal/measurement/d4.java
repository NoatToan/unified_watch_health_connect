package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class d4 extends k4 {
    public d4(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.k4
    public final void a() {
        if (!k()) {
            for (int i = 0; i < c(); i++) {
                Map.Entry entryH = h(i);
                if (((zzjn) entryH.getKey()).zzc()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((zzjn) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
