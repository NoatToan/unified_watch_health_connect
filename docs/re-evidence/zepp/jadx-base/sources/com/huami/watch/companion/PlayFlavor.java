package com.huami.watch.companion;

import android.content.Context;
import com.huami.watch.companion.wearcalling.ModulesDef;
import com.huami.watch.componentlinker.service.impl.ComponentLinkerCmdServer;
import com.huami.watch.transport.Transporter;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.DeviceInfoProviderDefault;

/* JADX INFO: loaded from: classes16.dex */
public class PlayFlavor {
    private static final String a = "PlayFlavor";

    public class a extends DeviceInfoProviderDefault {
        public a(Context context) {
            super(context);
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDeviceInfoProvider
        public String oaid() {
            return "zepp";
        }
    }

    public static void initApp(Context context) {
        Transporter.get(context, ModulesDef.ACTION_SYNC_XIMALAYA_SOUND_LIST).connectTransportService();
        CommonRequest.getInstanse().init(context, "b4ea6bf20facbdd48221cf298b66c296", new a(context));
        ComponentLinkerCmdServer.instantiate(context, context.getResources().getStringArray(R.array.component_list));
    }

    public static void initZendesk(Context context) {
    }

    public static void registerMiPush(Context context) {
    }

    public static void toZendeskSupport(Context context) {
    }

    public static void unregisterMiPush(Context context) {
    }
}
