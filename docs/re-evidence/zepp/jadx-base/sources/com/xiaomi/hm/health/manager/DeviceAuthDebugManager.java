package com.xiaomi.hm.health.manager;

import android.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import com.huami.account.DeviceAuthParams;
import com.huami.account.XiaomiTokenMananger;
import com.huami.passport.ErrorCode;
import com.huami.passport.entity.TpaConfig;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.manager.DeviceAuthDebugManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/manager/DeviceAuthDebugManager;", "", "Landroid/app/Activity;", "activity", "", "showAuthDevicesDialog", "", "configName", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceAuthDebugManager {

    @NotNull
    public static final DeviceAuthDebugManager INSTANCE = new DeviceAuthDebugManager();

    @NotNull
    public static final String TAG = "DeviceAuthDebugManager";

    private DeviceAuthDebugManager() {
    }

    private final void b(final Activity activity, final String configName) {
        XiaomiTokenMananger.reAuthorization(activity, new DeviceAuthParams(configName, "PR4H44+0b001d0005"), new XiaomiTokenMananger.OnAuthCallback() { // from class: com.xiaomi.hm.health.manager.DeviceAuthDebugManager$mockAuth$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;
                public final /* synthetic */ ErrorCode b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(String str, ErrorCode errorCode) {
                    super(0);
                    this.a = str;
                    this.b = errorCode;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "设备授权错误: " + this.a + ", errorCode: " + this.b;
                }
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onDifferentAccount() {
                Toast.makeText(activity, "账户不匹配", 1).show();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onError(@Nullable ErrorCode errorCode) {
                Toast.makeText(activity, "出现错误：" + errorCode, 1).show();
                HMLog.info(DeviceAuthDebugManager.TAG, new a(configName, errorCode));
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onSuccess() {
                Toast.makeText(activity, "授权成功", 1).show();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnAuthCallback
            public void onUserCancel() {
                Toast.makeText(activity, "用户取消", 1).show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Activity activity, List list, DialogInterface dialogInterface, int i) {
        INSTANCE.b(activity, (String) list.get(i));
    }

    @JvmStatic
    public static final void showAuthDevicesDialog(@NotNull final Activity activity) {
        Map<String, TpaConfig> tpaConfigs = Utils.getTpaConfigs(activity);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, TpaConfig> entry : tpaConfigs.entrySet()) {
            if (m.startsWith$default(entry.getValue().getThirdName(), "xiaomi-hm-mifit", false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        final ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
        }
        new AlertDialog.Builder(activity).setAdapter(new ArrayAdapter(activity, R.layout.simple_list_item_1, arrayList), new DialogInterface.OnClickListener() { // from class: u61
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDebugManager.c(activity, arrayList, dialogInterface, i);
            }
        }).setCancelable(true).show();
    }
}
