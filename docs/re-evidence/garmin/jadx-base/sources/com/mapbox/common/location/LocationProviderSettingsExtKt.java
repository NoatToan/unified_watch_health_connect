package com.mapbox.common.location;

import android.location.Criteria;
import com.google.android.gms.location.LocationRequest;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007*\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007*\u0004\u0018\u00010\u0002H\u0000¨\u0006\f"}, d2 = {"minimumDisplacement", "", "Lcom/mapbox/common/location/LocationProviderRequest;", "default", "minimumInterval", "", "toCriteria", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/LocationError;", "Landroid/location/Criteria;", "toLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LocationProviderSettingsExtKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccuracyLevel.values().length];
            try {
                iArr[AccuracyLevel.HIGHEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccuracyLevel.HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccuracyLevel.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccuracyLevel.LOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccuracyLevel.PASSIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float minimumDisplacement(LocationProviderRequest locationProviderRequest, float f14) {
        Float displacement = locationProviderRequest != null ? locationProviderRequest.getDisplacement() : null;
        return displacement == null ? f14 : displacement.floatValue();
    }

    public static /* synthetic */ float minimumDisplacement$default(LocationProviderRequest locationProviderRequest, float f14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            f14 = 1.0f;
        }
        return minimumDisplacement(locationProviderRequest, f14);
    }

    public static final long minimumInterval(LocationProviderRequest locationProviderRequest, long j8) {
        IntervalSettings interval;
        Long minimumInterval = (locationProviderRequest == null || (interval = locationProviderRequest.getInterval()) == null) ? null : interval.getMinimumInterval();
        return minimumInterval == null ? j8 : minimumInterval.longValue();
    }

    public static /* synthetic */ long minimumInterval$default(LocationProviderRequest locationProviderRequest, long j8, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = 1000;
        }
        return minimumInterval(locationProviderRequest, j8);
    }

    public static final Expected<LocationError, Criteria> toCriteria(LocationProviderRequest locationProviderRequest) {
        Criteria criteria = new Criteria();
        if (locationProviderRequest != null) {
            locationProviderRequest.getAccuracy();
            AccuracyLevel accuracy = locationProviderRequest.getAccuracy();
            int i14 = accuracy == null ? -1 : WhenMappings.$EnumSwitchMapping$0[accuracy.ordinal()];
            if (i14 == 1) {
                criteria.setCostAllowed(true);
                criteria.setPowerRequirement(3);
                criteria.setHorizontalAccuracy(3);
                criteria.setVerticalAccuracy(3);
                criteria.setBearingAccuracy(3);
                criteria.setSpeedAccuracy(3);
            } else if (i14 == 2) {
                criteria.setPowerRequirement(3);
                criteria.setHorizontalAccuracy(3);
                criteria.setVerticalAccuracy(3);
                criteria.setBearingAccuracy(3);
                criteria.setSpeedAccuracy(3);
            } else if (i14 == 3) {
                criteria.setPowerRequirement(2);
                criteria.setHorizontalAccuracy(2);
                criteria.setVerticalAccuracy(2);
                criteria.setBearingAccuracy(2);
                criteria.setSpeedAccuracy(2);
            } else if (i14 == 4) {
                criteria.setPowerRequirement(1);
                criteria.setHorizontalAccuracy(1);
                criteria.setVerticalAccuracy(1);
                criteria.setBearingAccuracy(1);
                criteria.setSpeedAccuracy(1);
            } else if (i14 != 5) {
                Expected<LocationError, Criteria> expectedCreateError = ExpectedFactory.createError(new LocationError(LocationErrorCode.INVALID_ARGUMENT, "Unsupported AccuracyLevel value: " + locationProviderRequest.getAccuracy()));
                expectedCreateError.getClass();
                return expectedCreateError;
            }
        }
        Expected<LocationError, Criteria> expectedCreateValue = ExpectedFactory.createValue(criteria);
        expectedCreateValue.getClass();
        return expectedCreateValue;
    }

    public static final Expected<LocationError, LocationRequest> toLocationRequest(LocationProviderRequest locationProviderRequest) {
        Long maximumInterval;
        Long minimumInterval;
        Long interval;
        LocationRequest locationRequestCreate = LocationRequest.create();
        AccuracyLevel accuracy = locationProviderRequest != null ? locationProviderRequest.getAccuracy() : null;
        int i14 = accuracy == null ? -1 : WhenMappings.$EnumSwitchMapping$0[accuracy.ordinal()];
        int i15 = 100;
        if (i14 != 1 && i14 != 2) {
            if (i14 == 3) {
                i15 = 102;
            } else if (i14 == 4) {
                i15 = 104;
            } else {
                if (i14 != 5) {
                    LocationErrorCode locationErrorCode = LocationErrorCode.INVALID_ARGUMENT;
                    StringBuilder sb3 = new StringBuilder("Unsupported AccuracyLevel value: ");
                    sb3.append(locationProviderRequest != null ? locationProviderRequest.getAccuracy() : null);
                    Expected<LocationError, LocationRequest> expectedCreateError = ExpectedFactory.createError(new LocationError(locationErrorCode, sb3.toString()));
                    expectedCreateError.getClass();
                    return expectedCreateError;
                }
                i15 = 105;
            }
        }
        locationRequestCreate.setPriority(i15);
        IntervalSettings interval2 = locationProviderRequest.getInterval();
        if (interval2 != null && (interval = interval2.getInterval()) != null) {
            locationRequestCreate.setInterval(interval.longValue());
        }
        IntervalSettings interval3 = locationProviderRequest.getInterval();
        if (interval3 != null && (minimumInterval = interval3.getMinimumInterval()) != null) {
            locationRequestCreate.setFastestInterval(minimumInterval.longValue());
        }
        IntervalSettings interval4 = locationProviderRequest.getInterval();
        if (interval4 != null && (maximumInterval = interval4.getMaximumInterval()) != null) {
            locationRequestCreate.setMaxWaitTime(maximumInterval.longValue());
        }
        Float displacement = locationProviderRequest.getDisplacement();
        if (displacement != null) {
            locationRequestCreate.setSmallestDisplacement(displacement.floatValue());
        }
        Expected<LocationError, LocationRequest> expectedCreateValue = ExpectedFactory.createValue(locationRequestCreate);
        expectedCreateValue.getClass();
        return expectedCreateValue;
    }
}
