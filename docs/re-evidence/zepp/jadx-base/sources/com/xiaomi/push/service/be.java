package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.xiaomi.market.sdk.Constants;
import com.xiaomi.push.cu;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public class be extends bn.a implements com.xiaomi.push.ak.a {
    private XMPushService a;
    private long b;

    public static class a implements com.xiaomi.push.ak.b {
        @Override // com.xiaomi.push.ak.b
        public String a(String str) throws IOException {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("sdkver", String.valueOf(48));
            builderBuildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            builderBuildUpon.appendQueryParameter(Constants.JSON_VERSION, cu.a(Build.MODEL + ":" + Build.VERSION.INCREMENTAL));
            builderBuildUpon.appendQueryParameter("mi", String.valueOf(com.xiaomi.channel.commonutils.android.k.a()));
            URL url = new URL(builderBuildUpon.toString());
            if (url.getPort() != -1) {
                url.getPort();
            }
            try {
                System.currentTimeMillis();
                String strA = com.xiaomi.push.y.a(com.xiaomi.channel.commonutils.android.k.m3431a(), url);
                System.currentTimeMillis();
                return strA;
            } catch (IOException e) {
                throw e;
            }
        }
    }

    public static class b extends com.xiaomi.push.ak {
        public b(Context context, com.xiaomi.push.aj ajVar, com.xiaomi.push.ak.b bVar, String str) {
            super(context, ajVar, bVar, str);
        }

        @Override // com.xiaomi.push.ak
        public String a(ArrayList<String> arrayList, String str, String str2, boolean z) throws IOException {
            try {
                return super.a(arrayList, str, str2, z);
            } catch (IOException e) {
                com.xiaomi.push.y.b(com.xiaomi.push.ak.a);
                throw e;
            }
        }
    }

    public be(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    public static void a(XMPushService xMPushService) {
        be beVar = new be(xMPushService);
        bn.a().a(beVar);
        synchronized (com.xiaomi.push.ak.class) {
            com.xiaomi.push.ak.a(beVar);
            com.xiaomi.push.ak.a(xMPushService, null, new a(), "0", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "2.2");
        }
    }

    @Override // com.xiaomi.push.ak.a
    public com.xiaomi.push.ak a(Context context, com.xiaomi.push.aj ajVar, com.xiaomi.push.ak.b bVar, String str) {
        return new b(context, ajVar, bVar, str);
    }

    @Override // com.xiaomi.push.service.bn.a
    public void a(com.xiaomi.push.at.a aVar) {
    }

    @Override // com.xiaomi.push.service.bn.a
    public void a(com.xiaomi.push.au.b bVar) throws JSONException, IOException {
        com.xiaomi.push.ag agVarB;
        if (bVar.m3526b() && bVar.m3525a() && System.currentTimeMillis() - this.b > 3600000) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("fetch bucket :" + bVar.m3525a());
            this.b = System.currentTimeMillis();
            com.xiaomi.push.ak akVarA = com.xiaomi.push.ak.a();
            akVarA.m3498a();
            akVarA.m3503c();
            com.xiaomi.push.bt btVarM3802a = this.a.m3802a();
            if (btVarM3802a == null || (agVarB = akVarA.b(btVarM3802a.m3605a().c())) == null) {
                return;
            }
            ArrayList<String> arrayListM3491a = agVarB.m3491a();
            boolean z = true;
            Iterator<String> it2 = arrayListM3491a.iterator();
            while (it2.hasNext()) {
                if (it2.next().equals(btVarM3802a.mo3606a())) {
                    z = false;
                    break;
                }
            }
            if (!z || arrayListM3491a.isEmpty()) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m3434a("bucket changed, force reconnect");
            this.a.a(0, (Exception) null);
            this.a.a(false);
        }
    }
}
