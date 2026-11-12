package com.huami.applet.jsengine.plugin;

import com.huami.applet.ConstantKt;
import com.huami.applet.bluetooth.core.HMAppletProtocolProxyKt;
import com.huami.applet.jsengine.plugin.Messaging;
import com.huami.applet.utils.UtilsKt;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/huami/applet/jsengine/plugin/Messaging;", "Lcom/huami/applet/jsengine/plugin/AppletPlugin;", "", "", "moduleName", "()[Ljava/lang/String;", Argument.ELEM_NAME, "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "result", "", "invokeMethod", "<init>", "()V", "Companion", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class Messaging implements AppletPlugin {

    @NotNull
    public static final String actionName = "Message";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "二进制数据转换异常，" + this.a + "数据发送失败";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(byte[] bArr) {
        HMAppletProtocolProxyKt.getHMAppletProtocolProxy().sendMessage(bArr);
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] actionNames() {
        return AppletPlugin.DefaultImpls.actionNames(this);
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    public void invokeMethod(@NotNull String argument, @NotNull JavascriptExecuteInterface result) {
        Unit unit;
        final byte[] bArrHexStrToByte = UtilsKt.hexStrToByte(argument);
        if (bArrHexStrToByte == null) {
            unit = null;
        } else {
            UtilsKt.executeOnSubThread(new Runnable() { // from class: f25
                @Override // java.lang.Runnable
                public final void run() {
                    Messaging.b(bArrHexStrToByte);
                }
            });
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            HMLog.error$default(ConstantKt.TAG_APPLET, ConstantKt.CODE_PLUGIN, null, new a(argument), 4, null);
        }
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] moduleName() {
        return new String[]{"Message"};
    }
}
