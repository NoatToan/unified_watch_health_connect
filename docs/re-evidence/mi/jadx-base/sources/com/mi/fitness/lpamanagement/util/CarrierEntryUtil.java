package com.mi.fitness.lpamanagement.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.main.export.ConfigPreference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010.\u001a\u00020/R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR\u001a\u0010$\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u000bR\u001a\u0010&\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\t\"\u0004\b'\u0010\u000bR\u001a\u0010(\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR\u001a\u0010*\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR\u001a\u0010,\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\t\"\u0004\b-\u0010\u000b¨\u00060"}, d2 = {"Lcom/mi/fitness/lpamanagement/util/CarrierEntryUtil;", "", "<init>", "()V", "carriers", "Ljava/util/ArrayList;", "", "isSupportCU", "", "()Z", "setSupportCU", "(Z)V", "isSupportCT", "setSupportCT", "isSupportCM", "setSupportCM", "isSupportCuDual", "setSupportCuDual", "isSupportCuInd", "setSupportCuInd", "isSupportCmDual", "setSupportCmDual", "isSupportCmInd", "setSupportCmInd", "isSupportCtDual", "setSupportCtDual", "isSupportCtInd", "setSupportCtInd", "isSupportCmDualApp", "setSupportCmDualApp", "isSupportCmIndApp", "setSupportCmIndApp", "isSupportCmIndScan", "setSupportCmIndScan", "isSupportCtDualApp", "setSupportCtDualApp", "isSupportCtIndApp", "setSupportCtIndApp", "isSupportCuDualApp", "setSupportCuDualApp", "isSupportCuDualScan", "setSupportCuDualScan", "isSupportCuIndApp", "setSupportCuIndApp", "isSupportCuIndScan", "setSupportCuIndScan", "loadCarrierEntries", "", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCarrierEntryUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarrierEntryUtil.kt\ncom/mi/fitness/lpamanagement/util/CarrierEntryUtil\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,64:1\n29#2:65\n*S KotlinDebug\n*F\n+ 1 CarrierEntryUtil.kt\ncom/mi/fitness/lpamanagement/util/CarrierEntryUtil\n*L\n39#1:65\n*E\n"})
public final class CarrierEntryUtil {

    @NotNull
    public static final CarrierEntryUtil INSTANCE = new CarrierEntryUtil();

    @NotNull
    private static ArrayList<String> carriers = new ArrayList<>();
    private static boolean isSupportCU = true;
    private static boolean isSupportCT = true;
    private static boolean isSupportCM = true;
    private static boolean isSupportCuDual = true;
    private static boolean isSupportCuInd = true;
    private static boolean isSupportCmDual = true;
    private static boolean isSupportCmInd = true;
    private static boolean isSupportCtDual = true;
    private static boolean isSupportCtInd = true;
    private static boolean isSupportCmDualApp = true;
    private static boolean isSupportCmIndApp = true;
    private static boolean isSupportCmIndScan = true;
    private static boolean isSupportCtDualApp = true;
    private static boolean isSupportCtIndApp = true;
    private static boolean isSupportCuDualApp = true;
    private static boolean isSupportCuDualScan = true;
    private static boolean isSupportCuIndApp = true;
    private static boolean isSupportCuIndScan = true;

    private CarrierEntryUtil() {
    }

    public final boolean isSupportCM() {
        return isSupportCM;
    }

    public final boolean isSupportCT() {
        return isSupportCT;
    }

    public final boolean isSupportCU() {
        return isSupportCU;
    }

    public final boolean isSupportCmDual() {
        return isSupportCmDual;
    }

    public final boolean isSupportCmDualApp() {
        return isSupportCmDualApp;
    }

    public final boolean isSupportCmInd() {
        return isSupportCmInd;
    }

    public final boolean isSupportCmIndApp() {
        return isSupportCmIndApp;
    }

    public final boolean isSupportCmIndScan() {
        return isSupportCmIndScan;
    }

    public final boolean isSupportCtDual() {
        return isSupportCtDual;
    }

    public final boolean isSupportCtDualApp() {
        return isSupportCtDualApp;
    }

    public final boolean isSupportCtInd() {
        return isSupportCtInd;
    }

    public final boolean isSupportCtIndApp() {
        return isSupportCtIndApp;
    }

    public final boolean isSupportCuDual() {
        return isSupportCuDual;
    }

    public final boolean isSupportCuDualApp() {
        return isSupportCuDualApp;
    }

    public final boolean isSupportCuDualScan() {
        return isSupportCuDualScan;
    }

    public final boolean isSupportCuInd() {
        return isSupportCuInd;
    }

    public final boolean isSupportCuIndApp() {
        return isSupportCuIndApp;
    }

    public final boolean isSupportCuIndScan() {
        return isSupportCuIndScan;
    }

    public final void loadCarrierEntries() {
        carriers.addAll((List) new Gson().fromJson(ConfigPreference.INSTANCE.getCARRIER_ENTRIES(), new TypeToken<List<? extends String>>() { // from class: com.mi.fitness.lpamanagement.util.CarrierEntryUtil$loadCarrierEntries$$inlined$fromJson$1
        }.getType()));
        boolean z = true;
        if (!(!carriers.isEmpty()) || AppUtil.INSTANCE.isDevChannel()) {
            return;
        }
        isSupportCmDualApp = carriers.contains("CM.Dual.App");
        isSupportCmIndApp = carriers.contains("CM.Ind.App");
        boolean zContains = carriers.contains("CM.Ind.Scan");
        isSupportCmIndScan = zContains;
        boolean z2 = isSupportCmDualApp;
        isSupportCM = z2 || isSupportCmIndApp || zContains;
        isSupportCmDual = z2;
        isSupportCmInd = isSupportCmIndApp || zContains;
        isSupportCtDualApp = carriers.contains("CT.Dual.App");
        boolean zContains2 = carriers.contains("CT.Ind.App");
        isSupportCtIndApp = zContains2;
        boolean z3 = isSupportCtDualApp;
        isSupportCT = z3 || zContains2;
        isSupportCtDual = z3;
        isSupportCtInd = zContains2;
        isSupportCuDualApp = carriers.contains("CU.Dual.App");
        isSupportCuDualScan = carriers.contains("CU.Dual.Scan");
        isSupportCuIndApp = carriers.contains("CU.Ind.App");
        boolean zContains3 = carriers.contains("CU.Ind.Scan");
        isSupportCuIndScan = zContains3;
        boolean z4 = isSupportCuDualApp;
        isSupportCU = z4 || isSupportCuDualScan || isSupportCuIndApp || zContains3;
        isSupportCuDual = z4 || isSupportCuDualScan;
        if (!isSupportCuIndApp && !zContains3) {
            z = false;
        }
        isSupportCuInd = z;
    }

    public final void setSupportCM(boolean z) {
        isSupportCM = z;
    }

    public final void setSupportCT(boolean z) {
        isSupportCT = z;
    }

    public final void setSupportCU(boolean z) {
        isSupportCU = z;
    }

    public final void setSupportCmDual(boolean z) {
        isSupportCmDual = z;
    }

    public final void setSupportCmDualApp(boolean z) {
        isSupportCmDualApp = z;
    }

    public final void setSupportCmInd(boolean z) {
        isSupportCmInd = z;
    }

    public final void setSupportCmIndApp(boolean z) {
        isSupportCmIndApp = z;
    }

    public final void setSupportCmIndScan(boolean z) {
        isSupportCmIndScan = z;
    }

    public final void setSupportCtDual(boolean z) {
        isSupportCtDual = z;
    }

    public final void setSupportCtDualApp(boolean z) {
        isSupportCtDualApp = z;
    }

    public final void setSupportCtInd(boolean z) {
        isSupportCtInd = z;
    }

    public final void setSupportCtIndApp(boolean z) {
        isSupportCtIndApp = z;
    }

    public final void setSupportCuDual(boolean z) {
        isSupportCuDual = z;
    }

    public final void setSupportCuDualApp(boolean z) {
        isSupportCuDualApp = z;
    }

    public final void setSupportCuDualScan(boolean z) {
        isSupportCuDualScan = z;
    }

    public final void setSupportCuInd(boolean z) {
        isSupportCuInd = z;
    }

    public final void setSupportCuIndApp(boolean z) {
        isSupportCuIndApp = z;
    }

    public final void setSupportCuIndScan(boolean z) {
        isSupportCuIndScan = z;
    }
}
