package com.miuipub.internal.hybrid;

import miuipub.hybrid.Response;

/* JADX INFO: loaded from: classes6.dex */
public class HybridException extends Exception {
    private static final long serialVersionUID = 1;
    private Response mResponse;

    public HybridException() {
        super(new Response(200).toString());
        this.mResponse = new Response(200);
    }

    public Response getResponse() {
        return this.mResponse;
    }

    public HybridException(String str) {
        super(new Response(200, str).toString());
        this.mResponse = new Response(200, str);
    }

    public HybridException(int i, String str) {
        super(new Response(i, str).toString());
        this.mResponse = new Response(i, str);
    }

    public HybridException(Response response) {
        super(response.toString());
        this.mResponse = response;
    }
}
