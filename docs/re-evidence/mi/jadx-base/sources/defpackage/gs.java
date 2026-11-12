package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ7\u0010\b\u001a\u00020\u00072\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJI\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\u0006\u0010\n\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\rJ=\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0012J2\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J.\u0010\b\u001a\u0004\u0018\u00010\u00132\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u0005H\u0002J'\u0010\b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\n\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002¢\u0006\u0004\b\b\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\b\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lgs;", "Lyi;", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "setting", "", PluginDeviceInfo.FMODEL, "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needDesc", "", "groupType", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "fieldList", "(ZLcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cmd", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;)[B", "Lj2;", "bleProvider", "Lj2;", "()Lj2;", "setBleProvider", "(Lj2;)V", "<init>", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class gs implements yi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f19283b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public j2 f19284a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lgs$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public gs(@NotNull j2 bleProvider) {
        Intrinsics.checkNotNullParameter(bleProvider, "bleProvider");
        this.f19284a = bleProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public j2 getF19284a() {
        return this.f19284a;
    }

    public void a(@NotNull ByteBuffer byteBuffer, @NotNull HashMap<SettingsGroupType, Settings> map) {
        yi.a.a(this, byteBuffer, map);
    }

    public final byte[] a(HashMap<SettingsGroupType, Settings> setting) {
        if (setting.isEmpty()) {
            t5t.d("SettingsV1", "assembleSettingCmd setting empty.");
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(5);
            byteArrayOutputStream.write(setting.size());
            Iterator<Map.Entry<SettingsGroupType, Settings>> it = setting.entrySet().iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(it.next().getValue().toByteArray());
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            t5t.d("SettingsV1", "assembleSettingCmd, e: " + e);
            return null;
        }
    }

    @Override // defpackage.yi
    @Nullable
    public Object a(@NotNull HashMap<SettingsGroupType, Settings> map, @NotNull Continuation<? super Boolean> continuation) {
        if (map.isEmpty()) {
            t5t.d("SettingsV1", "assembleSettingCmd setting empty.");
            return Boxing.boxBoolean(false);
        }
        t5t.d("SettingsV1", "writeSettings: " + map.keySet());
        return getF19284a().writeSettings(a(map), continuation);
    }

    @Override // defpackage.yi
    @Nullable
    public Object a(boolean z, @NotNull SettingsGroupType[] settingsGroupTypeArr, @NotNull Continuation<? super HashMap<SettingsGroupType, Settings>> continuation) {
        StringBuilder sb = new StringBuilder();
        sb.append("querySettings: ");
        String string = Arrays.toString(settingsGroupTypeArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        t5t.d("SettingsV1", sb.toString());
        return getF19284a().querySettings(a(z, settingsGroupTypeArr), continuation);
    }

    @Override // defpackage.yi
    @Nullable
    public Object a(boolean z, @NotNull SettingsGroupType settingsGroupType, @NotNull ArrayList<Integer> arrayList, @NotNull Continuation<? super Settings> continuation) {
        t5t.d("SettingsV1", "V1协议不支持指定field查询！");
        return null;
    }

    @Override // defpackage.yi
    @Nullable
    public HashMap<SettingsGroupType, Settings> a(@Nullable byte[] cmd) {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        ByteBuffer byteBuffer = ByteBuffer.wrap(cmd);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byte b2 = byteBuffer.get();
        if (b2 != 4) {
            t5t.d("SettingsV1", "type mismatch! " + ((int) b2));
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
        bs bsVarP = z2.p(byteBuffer);
        if (bsVarP != bs.SUCCESS) {
            t5t.d("SettingsV1", "code error: " + bsVarP);
            return null;
        }
        byte b3 = byteBuffer.get();
        for (int i = 0; i < b3; i++) {
            a(byteBuffer, map);
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] a(boolean needDesc, SettingsGroupType[] groupType) {
        Object objM886constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(needDesc ? 1 : 0);
            byteArrayOutputStream.write(groupType.length);
            if ((groupType.length == 0) ^ true) {
                for (SettingsGroupType settingsGroupType : groupType) {
                    byteArrayOutputStream.write(settingsGroupType.getValue());
                }
            }
            objM886constructorimpl = Result.m886constructorimpl(byteArrayOutputStream.toByteArray());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d("SettingsV1", "assembleCmd: " + thM889exceptionOrNullimpl);
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = null;
        }
        return (byte[]) objM886constructorimpl;
    }
}
