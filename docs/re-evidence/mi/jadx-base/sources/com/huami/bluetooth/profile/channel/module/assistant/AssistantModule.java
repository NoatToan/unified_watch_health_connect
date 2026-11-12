package com.huami.bluetooth.profile.channel.module.assistant;

import com.huami.bluetooth.profile.channel.module.a;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.AssistantVersion;
import defpackage.aft;
import defpackage.d0;
import defpackage.d3;
import defpackage.ees;
import defpackage.fu;
import defpackage.jq;
import defpackage.nl;
import defpackage.ol;
import defpackage.qq;
import defpackage.r3;
import defpackage.up;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/AssistantModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lqq;", "Lnl;", "request", "", b.I, "", "predict", "(Lnl;[B)Z", "Le0;", "queryVersion", "()Le0;", "Lees;", "loadApiV2", "()Lees;", "version", "Laft;", "loadQuickCardApi", "(Le0;)Laft;", "", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelController", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class AssistantModule extends a implements qq {

    @Nullable
    private AssistantVersion version;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 9;
    }

    @NotNull
    public final ees loadApiV2() {
        return new d0(this);
    }

    @NotNull
    public final aft loadQuickCardApi(@NotNull AssistantVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return new up(version, this);
    }

    @Override // defpackage.qq
    public boolean predict(@NotNull nl request, @NotNull byte[] response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        return response[0] == 2;
    }

    @NotNull
    public final AssistantVersion queryVersion() throws Exception {
        AssistantVersion assistantVersion = this.version;
        if (assistantVersion != null) {
            Intrinsics.checkNotNull(assistantVersion);
            return assistantVersion;
        }
        ol<byte[]> olVarSendRequest = sendRequest(new nl(new jq.a(new byte[]{1}), this, 0L, null, false, 28, null));
        if (!(olVarSendRequest instanceof fu)) {
            throw new Exception("Query version error: " + olVarSendRequest);
        }
        d3 d3Var = new d3((byte[]) ((fu) olVarSendRequest).a());
        d3.d(d3Var, 0, 1, null);
        AssistantVersion assistantVersion2 = new AssistantVersion(d3.d(d3Var, 0, 1, null), d3Var.c(-1));
        this.version = assistantVersion2;
        Intrinsics.checkNotNull(assistantVersion2);
        return assistantVersion2;
    }
}
