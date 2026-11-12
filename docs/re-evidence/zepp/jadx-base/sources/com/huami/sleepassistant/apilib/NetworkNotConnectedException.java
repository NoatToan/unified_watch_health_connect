package com.huami.sleepassistant.apilib;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/huami/sleepassistant/apilib/NetworkNotConnectedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class NetworkNotConnectedException extends RuntimeException {
    public NetworkNotConnectedException() {
        super("网络未连接");
    }
}
