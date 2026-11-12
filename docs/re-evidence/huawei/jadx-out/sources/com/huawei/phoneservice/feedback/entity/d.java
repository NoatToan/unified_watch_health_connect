package com.huawei.phoneservice.feedback.entity;

import com.braintreepayments.api.PayPalPaymentIntent;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("code")
    public String f21644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("child")
    public List<a> f21645c = new ArrayList();

    @SerializedName(PayPalPaymentIntent.ORDER)
    public String d;

    @SerializedName("name")
    public String e;
}
