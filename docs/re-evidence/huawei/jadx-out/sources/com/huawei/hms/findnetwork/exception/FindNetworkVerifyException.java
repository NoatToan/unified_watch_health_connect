package com.huawei.hms.findnetwork.exception;

import com.huawei.hms.findnetwork.comm.exception.FindNetworkException;

/* JADX INFO: loaded from: classes10.dex */
public class FindNetworkVerifyException extends FindNetworkException {
    private static final String EXCEP_MSG = "incorrect parameter format";

    public FindNetworkVerifyException(int i) {
        super(EXCEP_MSG, i);
    }
}
