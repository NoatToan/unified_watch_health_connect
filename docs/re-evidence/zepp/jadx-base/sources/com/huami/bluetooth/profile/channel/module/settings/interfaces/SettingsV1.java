package com.huami.bluetooth.profile.channel.module.settings.interfaces;

import com.huami.bluetooth.profile.channel.module.settings.SettingsError;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010 J.\u0010\b\u001a\u0004\u0018\u00010\u00072\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H\u0002J'\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u000f\u001a\u00020\t2\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u001a\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0016R\"\u0010!\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/SettingsV1;", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/ISettings;", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "setting", "", "b", "", "needDesc", "", "groupType", "a", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;)[B", "writeSetting", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "querySettings", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "fieldList", "queryField", "(ZLcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constant.h, "parseSettings", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/BleProvider;", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/BleProvider;", "getBleProvider", "()Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/BleProvider;", "setBleProvider", "(Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/BleProvider;)V", "bleProvider", "<init>", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SettingsV1 implements ISettings {

    @NotNull
    private static final String b = "SettingsV1";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private BleProvider bleProvider;

    public SettingsV1(@NotNull BleProvider bleProvider) {
        this.bleProvider = bleProvider;
    }

    private final byte[] a(boolean needDesc, SettingsGroupType[] groupType) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(needDesc ? 1 : 0);
            byteArrayOutputStream.write(groupType.length);
            if (!(groupType.length == 0)) {
                for (SettingsGroupType settingsGroupType : groupType) {
                    byteArrayOutputStream.write(settingsGroupType.getValue());
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(byteArrayOutputStream.toByteArray());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(b, Intrinsics.stringPlus("assembleCmd: ", thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (byte[]) objM3845constructorimpl;
    }

    private final byte[] b(HashMap<SettingsGroupType, Settings> setting) {
        if (setting.isEmpty()) {
            Debug.fi(b, "assembleSettingCmd setting empty.");
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(5);
            byteArrayOutputStream.write(setting.size());
            Iterator<Map.Entry<SettingsGroupType, Settings>> it2 = setting.entrySet().iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(it2.next().getValue().toByteArray());
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            Debug.fi(b, Intrinsics.stringPlus("assembleSettingCmd, e: ", e));
            return null;
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    @NotNull
    public BleProvider getBleProvider() {
        return this.bleProvider;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    public void parse(@NotNull ByteBuffer byteBuffer, @NotNull HashMap<SettingsGroupType, Settings> map) {
        ISettings.DefaultImpls.parse(this, byteBuffer, map);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    @Nullable
    public HashMap<SettingsGroupType, Settings> parseSettings(@Nullable byte[] cmd) {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(cmd);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        byte b2 = byteBufferWrap.get();
        if (b2 != 4) {
            Debug.fi(b, Intrinsics.stringPlus("type mismatch! ", Byte.valueOf(b2)));
            return null;
        }
        SettingsError settingsError = ByteBufferExtendsKt.getSettingsError(byteBufferWrap);
        if (settingsError != SettingsError.SUCCESS) {
            Debug.fi(b, Intrinsics.stringPlus("code error: ", settingsError));
            return null;
        }
        byte b3 = byteBufferWrap.get();
        int i = 0;
        if (b3 > 0) {
            do {
                i++;
                parse(byteBufferWrap, map);
            } while (i < b3);
        }
        return map;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    @Nullable
    public Object queryField(boolean z, @NotNull SettingsGroupType settingsGroupType, @NotNull ArrayList<Integer> arrayList, @NotNull Continuation<? super Settings> continuation) {
        Debug.fi(b, "V1协议不支持指定field查询！");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    @Nullable
    public Object querySettings(boolean z, @NotNull SettingsGroupType[] settingsGroupTypeArr, @NotNull Continuation<? super HashMap<SettingsGroupType, Settings>> continuation) {
        Debug.fi(b, Intrinsics.stringPlus("querySettings: ", Arrays.toString(settingsGroupTypeArr)));
        return getBleProvider().querySettings(a(z, settingsGroupTypeArr), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    public void setBleProvider(@NotNull BleProvider bleProvider) {
        this.bleProvider = bleProvider;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings
    @Nullable
    public Object writeSetting(@NotNull HashMap<SettingsGroupType, Settings> map, @NotNull Continuation<? super Boolean> continuation) {
        if (map.isEmpty()) {
            Debug.fi(b, "assembleSettingCmd setting empty.");
            return Boxing.boxBoolean(false);
        }
        Debug.fi(b, Intrinsics.stringPlus("writeSettings: ", map.keySet()));
        return getBleProvider().writeSettings(b(map), continuation);
    }
}
