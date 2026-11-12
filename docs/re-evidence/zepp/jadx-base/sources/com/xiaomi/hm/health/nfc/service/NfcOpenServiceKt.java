package com.xiaomi.hm.health.nfc.service;

import com.huami.nfc.applet.ConstantKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\r\"\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0003\u001a\u0004\b\u0006\u0010\u0007\"\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u0007\"\u0016\u0010\f\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "", "a", "Ljava/util/List;", "lntSingleList", "b", "getSupportCityList", "()Ljava/util/List;", "supportCityList", "c", "getNoNeedWebCardNumberCityList", "noNeedWebCardNumberCityList", "NfcOpenServiceTAG", "Ljava/lang/String;", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class NfcOpenServiceKt {

    @NotNull
    public static final String NfcOpenServiceTAG = "NfcOpenService";

    @NotNull
    private static final List<String> a;

    @NotNull
    private static final List<String> b;

    @NotNull
    private static final List<String> c;

    static {
        List<String> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(ConstantKt.AID_LNT_YCT, ConstantKt.AID_LNT_CZT, ConstantKt.AID_LNT_DGT, ConstantKt.AID_LNT_GFT, ConstantKt.AID_LNT_HHT, ConstantKt.AID_LNT_HYYZF, ConstantKt.AID_LNT_HZT, ConstantKt.AID_LNT_JYT, ConstantKt.AID_LNT_LYT, ConstantKt.AID_LNT_MCT, ConstantKt.AID_LNT_MJT, ConstantKt.AID_LNT_QYSMK, ConstantKt.AID_LNT_RJT, ConstantKt.AID_LNT_SHAOZHOUTONG, ConstantKt.AID_LNT_STT, ConstantKt.AID_LNT_SZT, ConstantKt.AID_LNT_WYT, ConstantKt.AID_LNT_ZHT, ConstantKt.AID_LNT_ZJT, ConstantKt.AID_LNT_ZQT, ConstantKt.AID_LNT_ZST);
        a = listMutableListOf;
        List<String> listMutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(ConstantKt.AID_SHANG_HAI, ConstantKt.AID_LNT_TWO_IN_ONE, ConstantKt.AID_LING_NAN_TONG);
        listMutableListOf2.addAll(listMutableListOf);
        b = listMutableListOf2;
        List<String> listMutableListOf3 = CollectionsKt__CollectionsKt.mutableListOf(ConstantKt.AID_LNT_TWO_IN_ONE, ConstantKt.AID_LING_NAN_TONG);
        listMutableListOf3.addAll(listMutableListOf);
        c = listMutableListOf3;
    }

    @NotNull
    public static final List<String> getNoNeedWebCardNumberCityList() {
        return c;
    }

    @NotNull
    public static final List<String> getSupportCityList() {
        return b;
    }
}
