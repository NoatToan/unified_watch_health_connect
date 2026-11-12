package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J=\u0010\b\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lj2;", "", "", "cmd", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "querySettings", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "writeSettings", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface j2 {
    @Nullable
    Object querySettings(@Nullable byte[] bArr, @NotNull Continuation<? super HashMap<SettingsGroupType, Settings>> continuation);

    @Nullable
    Object writeSettings(@Nullable byte[] bArr, @NotNull Continuation<? super Boolean> continuation);
}
