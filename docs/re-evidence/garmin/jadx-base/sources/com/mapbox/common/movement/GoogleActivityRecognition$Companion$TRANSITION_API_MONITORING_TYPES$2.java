package com.mapbox.common.movement;

import com.google.android.gms.location.ActivityTransition;
import e23.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/google/android/gms/location/ActivityTransition;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class GoogleActivityRecognition$Companion$TRANSITION_API_MONITORING_TYPES$2 extends w implements a<List<? extends ActivityTransition>> {
    public static final GoogleActivityRecognition$Companion$TRANSITION_API_MONITORING_TYPES$2 INSTANCE = new GoogleActivityRecognition$Companion$TRANSITION_API_MONITORING_TYPES$2();

    public GoogleActivityRecognition$Companion$TRANSITION_API_MONITORING_TYPES$2() {
        super(0);
    }

    @Override // e23.a
    public final List<? extends ActivityTransition> invoke() {
        List listK = x.k(0, 2, 8, 7, 1, 3);
        ArrayList arrayList = new ArrayList(y.r(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(new ActivityTransition.Builder().setActivityType(((Number) it.next()).intValue()).setActivityTransition(0).build());
        }
        return arrayList;
    }
}
