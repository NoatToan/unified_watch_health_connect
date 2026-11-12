package com.huami.bluetooth.profile.channel.module.sport;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.C3514do;
import defpackage.C3621pl;
import defpackage.PhnVersion;
import defpackage.d4;
import defpackage.eo;
import defpackage.lhs;
import defpackage.mj;
import defpackage.nl;
import defpackage.r3;
import defpackage.t5t;
import defpackage.wo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/PHNModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lvo;", "queryVersion", "()Lvo;", "Llhs;", "loadApi", "()Llhs;", "Lr3;", "api", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 55)
public final class PHNModule extends a {

    @NotNull
    private static final String TAG = "PHNModule";
    private static final int VERSION_1 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PHNModule(@NotNull r3 api) {
        super(api);
        Intrinsics.checkNotNullParameter(api, "api");
    }

    @Nullable
    public final lhs loadApi() {
        String string;
        PhnVersion phnVersionQueryVersion = queryVersion();
        if (phnVersionQueryVersion == null || (string = phnVersionQueryVersion.toString()) == null) {
            string = AbstractJsonLexerKt.NULL;
        }
        t5t.d(TAG, string);
        if (phnVersionQueryVersion == null) {
            return null;
        }
        if (phnVersionQueryVersion.getProtocolVersion() == 1) {
            return new C3514do(this, phnVersionQueryVersion.getAlgorithmVersion());
        }
        t5t.d(TAG, "UnSupport phn protocol version");
        return null;
    }

    @Nullable
    public final PhnVersion queryVersion() {
        return (PhnVersion) C3621pl.a(new wo().a(sendRequest(new nl(eo.a.f16864b, mj.t, 0L, null, false, 28, null))));
    }
}
