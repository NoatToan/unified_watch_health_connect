package com.huawei.hms.findnetwork.exception;

import com.huawei.hms.findnetwork.comm.exception.FindNetworkException;

/* JADX INFO: loaded from: classes10.dex */
public class FindNetworkNotMatchException extends FindNetworkException {
    private static final String EXCEP_MSG = "The HMS core version don't match 601000300";

    public FindNetworkNotMatchException(int i) {
        super(EXCEP_MSG, i);
    }
}
