package com.garmin.android.apps.connectmobile.group.details.invite;

import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/invite/InvalidSearchKeywordException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", MapboxMap.QFE_LIMIT, "", "<init>", "(I)V", "getLimit", "()I", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InvalidSearchKeywordException extends Exception {
    public static final int $stable = 8;
    private final int limit;

    public InvalidSearchKeywordException(int i14) {
        this.limit = i14;
    }

    public final int getLimit() {
        return this.limit;
    }
}
