package com.garmin.gfdi.auth;

import com.garmin.gfdi.GfdiException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/gfdi/auth/GarminAuthNotAllowedException;", "Lcom/garmin/gfdi/GfdiException;", "<init>", "()V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GarminAuthNotAllowedException extends GfdiException {
    public GarminAuthNotAllowedException() {
        super("Device initiated Garmin Auth when not allowed", null, 2, null);
    }
}
