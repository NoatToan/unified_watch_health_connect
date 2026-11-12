package com.garmin.android.apps.connectmobile.util.location;

import com.garmin.proto.generated.GDICore;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/e;", "Lcom/garmin/android/apps/connectmobile/util/location/b;", "", "deviceId", "", "protobufRequestId", "Lcom/garmin/proto/generated/GDICore$LocationData$DataType;", "gdiLocationDataType", "<init>", "(JILcom/garmin/proto/generated/GDICore$LocationData$DataType;)V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends com.garmin.android.apps.connectmobile.util.location.b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/e$a;", "Lcom/garmin/android/apps/connectmobile/util/location/b$b$a;", "Lcom/garmin/android/apps/connectmobile/util/location/b;", "subscription", "<init>", "(Lcom/garmin/android/apps/connectmobile/util/location/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.util.location.b bVar) {
            super(bVar);
            bVar.getClass();
        }

        @Override // com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b
        public final Boolean b() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/location/e$b;", "Lcom/garmin/android/apps/connectmobile/util/location/b$b$c;", "Lcom/garmin/android/apps/connectmobile/util/location/b;", "subscription", "<init>", "(Lcom/garmin/android/apps/connectmobile/util/location/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.garmin.android.apps.connectmobile.util.location.b bVar) {
            super(bVar);
            bVar.getClass();
        }

        @Override // com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b
        public final Boolean b() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j8, int i14, GDICore.LocationData.DataType dataType) {
        super(j8, i14, dataType, false, 8, null);
        dataType.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.util.location.b
    public final com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b a() {
        return new a(this);
    }

    @Override // com.garmin.android.apps.connectmobile.util.location.b
    public final com.garmin.android.apps.connectmobile.util.location.b.AbstractC0917b b() {
        return new b(this);
    }
}
