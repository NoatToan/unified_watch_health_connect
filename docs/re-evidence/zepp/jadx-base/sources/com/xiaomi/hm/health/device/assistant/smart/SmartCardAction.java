package com.xiaomi.hm.health.device.assistant.smart;

import androidx.p010navigation.NavController;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.pattern.action.AppItemAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/SmartCardAction;", "Lcom/xiaomi/hm/health/device/setting/pattern/action/AppItemAction;", "Landroidx/navigation/NavController;", "nv", "", "action", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/device/assistant/smart/SmartCardAction$Version;", "a", "Lkotlin/jvm/functions/Function0;", "getVersion", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Version", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SmartCardAction implements AppItemAction {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Function0<Version> getVersion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/SmartCardAction$Version;", "", "<init>", "(Ljava/lang/String;I)V", "V1", "V2", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public enum Version {
        V1,
        V2
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Version.values().length];
            iArr[Version.V1.ordinal()] = 1;
            iArr[Version.V2.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "call getSmartCardVersion is null";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SmartCardAction(@Nullable Function0<? extends Version> function0) {
        this.getVersion = function0;
    }

    @Override // com.xiaomi.hm.health.device.setting.pattern.action.AppItemAction
    public void action(@NotNull NavController nv) {
        Function0<Version> function0 = this.getVersion;
        if (function0 == null) {
            HMLog.error$default(null, null, null, a.a, 7, null);
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[function0.invoke().ordinal()];
        if (i == 1) {
            nv.navigate(R.id.action_to_smartAssistantSetting);
        } else {
            if (i != 2) {
                return;
            }
            nv.navigate(R.id.action_to_smartCardSettingFragment);
        }
    }
}
