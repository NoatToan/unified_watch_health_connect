package com.huami.account.selectArea.datasource;

import com.huami.account.AccountExternalsKt;
import com.huami.account.ui.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/huami/account/selectArea/datasource/StateMapper;", "", "", "stateValue", "exec", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class StateMapper {

    @NotNull
    public static final StateMapper INSTANCE = new StateMapper();

    private StateMapper() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:229:0x03ed  */
    @NotNull
    public final String exec(@NotNull String stateValue) {
        Integer numValueOf;
        switch (stateValue) {
            case "US-AK":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ak);
                break;
            case "US-AL":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_al);
                break;
            case "US-AR":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ar);
                break;
            case "US-AS":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_as);
                break;
            case "US-AZ":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_az);
                break;
            case "US-CA":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ca);
                break;
            case "US-CO":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_co);
                break;
            case "US-CT":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ct);
                break;
            case "US-DC":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_dc);
                break;
            case "US-DE":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_de);
                break;
            case "US-FL":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_fl);
                break;
            case "US-GA":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ga);
                break;
            case "US-GU":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_gu);
                break;
            case "US-HI":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_hi);
                break;
            case "US-IA":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ia);
                break;
            case "US-ID":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_id);
                break;
            case "US-IL":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_il);
                break;
            case "US-IN":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_in);
                break;
            case "US-KS":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ks);
                break;
            case "US-KY":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ky);
                break;
            case "US-LA":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_la);
                break;
            case "US-MA":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ma);
                break;
            case "US-MD":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_md);
                break;
            case "US-ME":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_me);
                break;
            case "US-MI":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_mi);
                break;
            case "US-MN":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_mn);
                break;
            case "US-MO":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_mo);
                break;
            case "US-MP":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_mp);
                break;
            case "US-MS":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ms);
                break;
            case "US-MT":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_mt);
                break;
            case "US-NC":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_nc);
                break;
            case "US-ND":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_nd);
                break;
            case "US-NE":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ne);
                break;
            case "US-NH":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_nh);
                break;
            case "US-NJ":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_nj);
                break;
            case "US-NM":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_nm);
                break;
            case "US-NV":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_nv);
                break;
            case "US-NY":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ny);
                break;
            case "US-OH":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_oh);
                break;
            case "US-OK":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ok);
                break;
            case "US-OR":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_or);
                break;
            case "US-PA":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_pa);
                break;
            case "US-PR":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_pr);
                break;
            case "US-RI":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ri);
                break;
            case "US-SC":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_sc);
                break;
            case "US-SD":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_sd);
                break;
            case "US-TN":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_tn);
                break;
            case "US-TX":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_tx);
                break;
            case "US-UT":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_ut);
                break;
            case "US-VA":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_va);
                break;
            case "US-VI":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_vi);
                break;
            case "US-VT":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_vt);
                break;
            case "US-WA":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_wa);
                break;
            case "US-WI":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_wi);
                break;
            case "US-WV":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_wv);
                break;
            case "US-WY":
                numValueOf = Integer.valueOf(R.string.account_ui_state_us_wy);
                break;
            default:
                numValueOf = null;
                break;
        }
        if (numValueOf == null) {
            return "UNKNOWN";
        }
        String string = AccountExternalsKt.getAppContext().getString(numValueOf.intValue());
        return string == null ? "UNKNOWN" : string;
    }
}
