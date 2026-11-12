package com.huawei.hms.findnetwork.exception;

import com.huawei.hms.findnetwork.comm.exception.FindNetworkException;

/* JADX INFO: loaded from: classes10.dex */
public class FindNetworkUnsupportedException extends FindNetworkException {
    private static final String DESC_FUNCTION_UNSUPPORTED = "Current function is unsupported on version: %s";
    private static final String ERR_DESC = String.format(DESC_FUNCTION_UNSUPPORTED, "6.16.0.300");

    public FindNetworkUnsupportedException(int i) {
        super(ERR_DESC, i);
    }
}
