package com.huami.nfc.bus;

import com.huami.wallet.ui.utils.AnalyticConst;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.cybergarage.upnp.control.Control;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/huami/nfc/bus/ApduAction;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Load", "IssueCard", AnalyticConst.BusDetailOuValue.BUS_DETAIL_OUT_CHARGE, "ShiftOutCard", "CheckShiftOutCard", "ShiftInCard", "IssueAndCharge", TrainingAnalytics.ParamValue.VideoPlayOp.LOCK, TrainingAnalytics.ParamValue.VideoPlayOp.UNLOCK, "CancelApp", "DeleteApp", "SafeDeleteApp", "CreateMifare", "DeleteMifare", "Return", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public enum ApduAction {
    Load(PointCategory.LOAD),
    IssueCard("issuecard"),
    Charge("topup"),
    ShiftOutCard("shiftout"),
    CheckShiftOutCard("check_shift_out"),
    ShiftInCard("shiftin"),
    IssueAndCharge("issueTopup"),
    Lock("lock"),
    Unlock("unlock"),
    CancelApp("outReturn"),
    DeleteApp("deleteapp"),
    SafeDeleteApp("safedeleteapp"),
    CreateMifare("createmifare"),
    DeleteMifare("deletemifare"),
    Return(Control.RETURN);


    @NotNull
    private final String value;

    ApduAction(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
