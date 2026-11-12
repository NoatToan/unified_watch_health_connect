package com.huawei.phoneservice.feedbackcommon.entity;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("data")
    private List<e> f21852c = new ArrayList();

    /* JADX INFO: loaded from: classes41.dex */
    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("read")
        private boolean f21853a;

        @SerializedName("srcno")
        private String d;

        public boolean a() {
            return !TextUtils.isEmpty(this.d);
        }

        public boolean d() {
            return this.f21853a;
        }
    }

    public List<e> a() {
        return this.f21852c;
    }
}
