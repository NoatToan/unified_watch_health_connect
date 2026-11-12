package com.huawei.picture.security.base.broadcast;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes41.dex */
public class SafeBroadcastSender {

    static abstract class BaseSender {
        Context context;
        Intent intent;

        BaseSender(Intent intent, Context context) {
            this.intent = intent;
            this.context = context;
        }
    }

    public static class d extends BaseSender {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f22002c;

        public d(Intent intent, Context context, boolean z) {
            super(intent, context);
            this.f22002c = z;
        }

        @Deprecated
        public void d() {
            if (this.context != null) {
                this.context.sendBroadcast(this.intent);
            }
        }
    }

    public static c e(String str, Context context) {
        return new c(str, context);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Intent f22000a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        BaseSender f22001c;
        Context d;
        boolean e;

        c(String str, Context context) {
            this.f22000a = new SafeIntent(new Intent(str));
            this.d = context;
        }

        public d b() {
            d dVar = new d(this.f22000a, this.d, this.e);
            this.f22001c = dVar;
            return dVar;
        }

        public c d(Uri uri) {
            this.f22000a.setData(uri);
            return this;
        }
    }
}
